package ru.vsu;

import java.io.FileInputStream;
import java.io.IOException;
import java.lang.reflect.Field;
import java.util.Properties;

/**
 * @author SH
 */
public class Injector {
    private final Properties properties = new Properties();

    /**
     * @param object - Класс
     * @return ссылка на инициализированный класс
     * @throws ClassNotFoundException - стандартное исключение
     * @throws IllegalAccessException - стандартное исключение
     * @throws InstantiationException - стандартное исключение
     */
    public Result inject(Result object) throws ClassNotFoundException, IllegalAccessException, InstantiationException, IOException {
        load();
        Class cl = Class.forName(object.getClass().getCanonicalName());
        Field[] fields = cl.getDeclaredFields();
        for (Field fl : fields
        ) {
            if (fl.isAnnotationPresent(AutoInjectable.class)) {
                Class rel = Class.forName(properties.getProperty(String.valueOf(fl.getType())));
                fl.setAccessible(true);
                fl.set(object, rel.newInstance());
            }
        }
        return object;
    }

    /**
     * @throws IOException - стандартное исключение
     * Импорт файла Properties
     */
    protected void load() throws IOException {
        FileInputStream fileInputStream = new FileInputStream("myProperties");
        properties.load(fileInputStream);
    }

}

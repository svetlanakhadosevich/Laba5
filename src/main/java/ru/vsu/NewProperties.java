package ru.vsu;


import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

/**
 * @author SH
 */
public class NewProperties {
    private final Properties properties = new Properties();

    /**
     * @param one Ключ
     * @param two Значение
     * Создание новой ячейки
     */
    public void newProperties(String one, String two) {
        properties.setProperty(one, two);
    }

    /**
     *
     * @throws IOException - Стандартное исключение
     * Сохранение в файл
     */
    public void saveProperties() throws IOException {
        FileOutputStream fileOutputStream = new FileOutputStream("myProperties");
        properties.store(fileOutputStream, "");
    }
}

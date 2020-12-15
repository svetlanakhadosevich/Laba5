package ru.vsu;

import java.io.IOException;
import java.util.Scanner;

/**
 * @author SH
 */
public class Main {
    /**
     * @param args - стандартный аргумент
     * @throws IOException - стандартное исключение
     * @throws IllegalAccessException - стандартное исключение
     * @throws ClassNotFoundException - стандартное исключение
     * @throws InstantiationException - стандартное исключение
     */
    public static void main(String[] args) throws IOException, IllegalAccessException, ClassNotFoundException, InstantiationException {
        Scanner scanner = new Scanner(System.in);
        int count;
        do {
            System.out.println("Test set 1 - 1" + '\t' + "Test set 2 - 2" + '\t' + "Test set 3 - 3" + '\t' + "Test set 4 - 4");
            System.out.println("Enter the serial number of the test :");
            count = scanner.nextInt();
            Test(count);
            System.out.println("Another option to try?" + '\t' + "Yes - other integer" + '\t' + "No - 0");
            count = scanner.nextInt();

        } while (count != 0);
    }

    /**
     * @param count - Вариант теста
     * @throws IOException - стандартное исключение
     * @throws InstantiationException - стандартное исключение
     * @throws IllegalAccessException - стандартное исключение
     * @throws ClassNotFoundException - стандартное исключение
     */
    public static void Test(int count) throws IOException, InstantiationException, IllegalAccessException, ClassNotFoundException {
        NewProperties addProperties = new NewProperties();
        switch (count) {
            case 1: {
                addProperties.newProperties("interface ru.vsu.OneTestInterface", "ru.vsu.One");
                addProperties.newProperties("interface ru.vsu.TwoTestInterface", "ru.vsu.Fri");
                addProperties.saveProperties();
                inject();
                break;
            }
            case 2: {
                addProperties.newProperties("interface ru.vsu.OneTestInterface", "ru.vsu.One");
                addProperties.newProperties("interface ru.vsu.TwoTestInterface", "ru.vsu.For");
                addProperties.saveProperties();
                inject();
                break;
            }
            case 3: {
                addProperties.newProperties("interface ru.vsu.OneTestInterface", "ru.vsu.Two");
                addProperties.newProperties("interface ru.vsu.TwoTestInterface", "ru.vsu.Fri");
                addProperties.saveProperties();
                inject();
                break;
            }
            case 4: {
                addProperties.newProperties("interface ru.vsu.OneTestInterface", "ru.vsu.Two");
                addProperties.newProperties("interface ru.vsu.TwoTestInterface", "ru.vsu.For");
                addProperties.saveProperties();
                inject();
                break;
            }
            default: {
                System.out.println("Error, you entered an invalid value");
                break;
            }
        }
    }

    /**
     * @throws ClassNotFoundException - стандартное исключение
     * @throws IOException            - стандартное исключение
     * @throws InstantiationException - стандартное исключение
     * @throws IllegalAccessException - стандартное исключение
     */
    public static void inject() throws ClassNotFoundException, IOException, InstantiationException, IllegalAccessException {
        Result rel1 = (new Injector()).inject(new Result());
        rel1.test();
    }
}

package ru.vsu;

/**
 * @author SH
 */
public class Result {
    @AutoInjectable
    OneTestInterface oneInterface;
    @AutoInjectable
    TwoTestInterface twoInterface;

    /**
     * Тестирование исправной работы метода inject
     */
    public void test() {
        oneInterface.testOne();
        twoInterface.testOne();
        oneInterface.testTwo();
        twoInterface.testTwo();
    }
}

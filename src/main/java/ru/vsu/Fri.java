package ru.vsu;

/**
 * @author SH
 */
public class Fri implements TwoTestInterface {
    @Override
    public void testOne() {
        System.out.println("Test interface TwoTestInterface one completed");
    }

    @Override
    public void testTwo() {
        System.out.println("Test interface TwoTestInterface two completed");
    }
}

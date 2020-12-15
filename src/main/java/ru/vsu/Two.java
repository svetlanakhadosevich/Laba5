package ru.vsu;

/**
 * @author SH
 */
public class Two implements OneTestInterface {
    @Override
    public void testOne() {
        System.out.println("Test interface OneTestInterface one completed");
    }

    @Override
    public void testTwo() {
        System.out.println("Test interface OneTestInterface two completed");
    }
}

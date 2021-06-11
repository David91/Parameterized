package tests;

import org.testng.annotations.Test;

public class Tintirid {

    private int i=0;

    @Test(priority = 1)
    public void test1() {
        System.out.println(++i);
    }

    @Test(priority = 2)
    public void test2() {
        System.out.println(++i);
    }
}

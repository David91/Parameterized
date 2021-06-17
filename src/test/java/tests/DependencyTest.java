package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

public class DependencyTest {

    @Test
    public void testOne() {
        System.out.println("DependencyTest.testOne");
    }

    @Test(dependsOnMethods = {"testThree","testOne"}, alwaysRun = true)
    public void testTwo() {
        System.out.println("DependencyTest.testTwo");
    }

    @Test
    public void testThree() {
        System.out.println("DependencyTest.testThree");
        Assert.fail();
    }
}

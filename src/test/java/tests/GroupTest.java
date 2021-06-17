package tests;

import org.testng.annotations.BeforeGroups;
import org.testng.annotations.Test;

public class GroupTest {

    @BeforeGroups("someGroup")
    public void beforeSomeGroup() {
        System.out.println("GroupTest.beforeSomeGroup");
    }

    @Test(groups = {"someGroup"})
    public void testOne() {
        System.out.println("GroupTest.testOne");
    }

    @Test
    public void testTwo() {
        System.out.println("GroupTest.testTwo");
    }

    @Test(groups = "someGroup")
    public void testThree() {
        System.out.println("GroupTest.testThree");
    }
}

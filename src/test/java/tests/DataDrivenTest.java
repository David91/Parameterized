package tests;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataDrivenTest {

    @BeforeMethod
    public void setupPerTestMethod() {
        System.out.println("Ordinal setup");
    }

    @AfterMethod
    public void tearDownPerTest() {
        System.out.println("Ordinal tearDown");
    }

    @Test(dataProvider = "getTestParameters", dataProviderClass = DataProviders.class)
    public void testIntegerSumParameterized(int i, int j, int expected) {
        System.out.println("Test with expected value " + expected);
        Assert.assertEquals(i + j, expected);
    }

}

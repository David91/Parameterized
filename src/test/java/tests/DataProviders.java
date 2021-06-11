package tests;

import org.testng.annotations.DataProvider;

public class DataProviders {

    @DataProvider
    public static Object[][] getTestParameters() {
        return new Object[][]{
                {2, 3, 5},
                {6, -3, 3},
                {7, 5, -2}
        };
    }
}

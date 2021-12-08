package resources.testdata;

import org.testng.annotations.DataProvider;

public class TestData {
    @DataProvider(name = "credentials")
    public Object[][] getData(){
        return new Object[][]{
                {"Kajal","Patel","London"},
                {"Shine","Patel","Watford"},
                {"Aru","Patel","London"},
                {"Kaju","Patel","Watford"}

        };
    }
}

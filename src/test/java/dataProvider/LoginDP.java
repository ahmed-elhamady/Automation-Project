package dataProvider;

import org.testng.annotations.DataProvider;

public class LoginDP {

    @DataProvider
    public static Object[][] ValidLoginData(){
        Object[][] data = new Object[1][2];
        data[0][0] = "ahmed2012@gmail.com";   data[0][1] = "Ahmed&2012";

        return data;
    }

    @DataProvider
    public static Object[][] InvalidLoginData(){
        Object[][] data = new Object[1][2];
        data[0][0] = "wrong@example.com ";   data[0][1] = "P@ssw0rd";

        return data;
    }
}

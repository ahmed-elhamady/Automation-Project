package dataProvider;

import org.testng.annotations.DataProvider;

import java.util.Random;

public class RegistrationDP {
    @DataProvider
    public static Object[][] RegistrationData() {
        Object[][] data = new Object[1][6];

        String randomNum = generateRandomNumAsString();
        data[0][0] = "male";
        data[0][1] = "Ahmed";
        data[0][2] = "Hossam";
        data[0][3] = "ahmed"+randomNum+"@gmail.com";
        data[0][4] = "Ahmed&2012";
        data[0][5] = "Ahmed&2012";

        return data;
    }

    private static String generateRandomNumAsString() {
        Random rand = new Random();
        StringBuilder newStringArr = new StringBuilder();

        for (int i = 0; i < 2; i++) {
            newStringArr.append(rand.nextInt(100));
        }

        return newStringArr.toString();
    }


}

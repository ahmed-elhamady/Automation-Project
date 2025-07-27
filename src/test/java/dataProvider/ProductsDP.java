package dataProvider;

import org.testng.annotations.DataProvider;

public class ProductsDP {

    @DataProvider
    public static Object[][] productNames(){
        Object [][] products = new Object[3][1];
        products [0][0] = "book";
        products [1][0] = "laptop";
        products [2][0] = "nike";

        return products;
    }

    @DataProvider
    public static Object[][] productSKU(){
        Object [][] products = new Object[2][1];
        products [0][0] = "SCI_FAITH";
        products [1][0] = "LT_MIR_DC";

        return products;
    }

}

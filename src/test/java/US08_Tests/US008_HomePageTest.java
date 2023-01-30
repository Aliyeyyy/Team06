package US08_Tests;

import Team06.pages.US08_Pages.US008_HomePage;
import Team06.utilities.BaseTestReport;
import Team06.utilities.Driver;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class US008_HomePageTest extends BaseTestReport {

    US008_HomePage hP = new US008_HomePage();

    @Test
    public void homePageTest (){

        //Kullanıcı Url'e gider
        Driver.getDriver().get("https://shop-pickbazar-rest.vercel.app/");

        //Kullanıcı joine tıklar
        hP.loginCustomer();

        //Kullanıcı Kategorilere tıklar
        hP.menuBUtton.click();

        //Kullanıcı Bakery seçeneğine tıklar
        hP.bakeryButton.click();

        SoftAssert softAssert=new SoftAssert();
        softAssert.assertTrue(hP.bakeryButton.getText().contains("Bakery"));

        //Kullanıcı Makeup seçeneğine tıklar
        hP.makeUpButton.click();

        softAssert.assertTrue(hP.makeUpButton.getText().contains("Makeup"));

        //Kullanıcı Bags seçeneğine tıklar
        hP.bagsButton.click();

        softAssert.assertTrue(hP.bagsButton.getText().contains("Bags"));

        //Kullanıcı Clothing seçeneğine tıklar
        hP.clothingButton.click();

        softAssert.assertTrue(hP.clothingButton.getText().contains("Clothing"));

        //Kullanıcı Furniture seçeneğine tıklar
        hP.furnitureButton.click();

        softAssert.assertTrue(hP.furnitureButton.getText().contains("Furniture"));

        //Kullanıcı DailyNeeds seçenegıne tıklar
        hP.dNButton.click();

        softAssert.assertTrue(hP.dNButton.getText().contains("Daily Needs"));

        softAssert.assertAll();


    }
}

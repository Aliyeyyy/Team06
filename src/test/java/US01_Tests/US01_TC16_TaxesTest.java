package US01_Tests;

import Team06.pages.US01_Pages.US01_TC16_Taxes;
import Team06.utilities.BaseTestReport;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class US01_TC16_TaxesTest extends BaseTestReport {

    US01_TC16_Taxes tp=new US01_TC16_Taxes();

    @Test
    public void taxesTest(){
        extentTest = extentReports.createTest("US001-testCase016");

        //Kullanıcı login olur
        tp.loginSeller();

        //Kullanıcı taxes a tıklar
        tp.taxesButton.click();
        SoftAssert softAssert=new SoftAssert();
        softAssert.assertTrue(tp.taxesButton.isDisplayed());
        softAssert.assertAll();

       //Kullanıcı vergileri düzenleyebilmek için kalem butonuna tıklar
        tp.editButton.click();

        //Kullanıcı name i düzenler
        tp.name.clear();
        tp.name.sendKeys("otobus");
        //Kullanıcı rate yi düzenler
        tp.rate.clear();
        tp.rate.sendKeys("35");
        //Kullanıcı country yi düzenler
        tp.country.clear();
        tp.country.sendKeys("turkey");
        //Kullanıcı city yi düzenler
        tp.city.clear();
        tp.city.sendKeys("izmir");
        //Kullanıcı state yi düzenler
        tp.state.clear();
        tp.state.sendKeys("kadriye");
        //Kullanıcı zip yi düzenler
        tp.zip.clear();
        tp.zip.sendKeys("35000");
        //Kullanıcı düzenlemeleri onaylar
        tp.updateButton.click();
        softAssert.assertTrue(tp.updateButton.isDisplayed());
        softAssert.assertAll();
        //Kullanıcı back butona tıklar
        tp.backButton.click();


        //Kullanıcı vergileri silmek için silme butonuna tıklar

        tp.deleteButton.click();
        tp.deleteButton2.click();


    }
}

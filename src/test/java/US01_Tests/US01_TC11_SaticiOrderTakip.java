package US01_Tests;

import Team06.pages.US01_Pages.US01_TC11_SaticiOrdersTakip;
import Team06.utilities.BaseTestReport;
import Team06.utilities.Driver;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;


public class US01_TC11_SaticiOrderTakip extends BaseTestReport {


    @Test
    public void testsaticiSiparisTakip() {
        extentTest = extentReports.createTest("US001-testCase011");

        US01_TC11_SaticiOrdersTakip sot = new US01_TC11_SaticiOrdersTakip();
        //login olunur
        sot.loginSeller();

        //Order butonuna tıklar
        sot.btnOrders();

        SoftAssert softAssert=new SoftAssert();
        softAssert.assertTrue(sot.siparisTakipNo.isDisplayed());
        softAssert.assertTrue(sot.siparisDurum.isDisplayed());

        Driver.getDriver().quit();
    }


}

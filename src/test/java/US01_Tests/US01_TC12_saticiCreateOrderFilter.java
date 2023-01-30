package US01_Tests;

import Team06.pages.US01_Pages.US01_TC12_SaticiCreateOrder;
import Team06.utilities.BaseTestReport;
import Team06.utilities.Driver;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;


public class US01_TC12_saticiCreateOrderFilter extends BaseTestReport {


    @Test
    public void testsaticiCreateOrderFilter() {
        extentTest = extentReports.createTest("US001-testCase012");

        US01_TC12_SaticiCreateOrder scr = new US01_TC12_SaticiCreateOrder();

        //Seller login olur
        scr.loginSeller();

        //Create Order Butonuna Tıklar
        scr.btnCreateOrders();

        //filter butonuna tıklanır
        scr.btnFilter();

        // Gruba göre filitremede açılan pançerede istenen menü seçer
        scr.FilterByGroup("Furniture");

        SoftAssert softAssert=new SoftAssert();

        //Gruba göre filtreme sonucunda box kutusunda istenen degeri kontrol eder
        softAssert.assertEquals("Furniture", scr.FilterByGroup());

        scr.logoutSeller();
        Driver.getDriver().quit();
    }


}

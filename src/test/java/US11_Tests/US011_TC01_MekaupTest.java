package US11_Tests;

import Team06.pages.US11_Pages.US011_TC01_MekaupAdd;
import Team06.utilities.BaseTestReport;
import Team06.utilities.Driver;
import org.testng.annotations.Test;

public class US011_TC01_MekaupTest extends BaseTestReport {


    @Test
    public void test(){
        extentTest = extentReports.createTest("US011-testCase01");
        US011_TC01_MekaupAdd mA= new US011_TC01_MekaupAdd();
        Driver.getDriver().get("https://shop-pickbazar-rest.vercel.app/");
        mA.searchButton.click();
        mA.makeupButton.click();
        mA.urunSec.click();
        mA.urunSepeteEkle.click();
        mA.urunArttır.click();
        mA.urunAzalt.click();
        mA.urunSepeti.click();
        mA.sepetUrunArttır.click();
        mA.sepetUrunAzalt.click();












    }


}

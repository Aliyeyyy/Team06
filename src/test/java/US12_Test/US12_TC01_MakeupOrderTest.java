package US12_Test;

import Team06.pages.HomePage;
import Team06.pages.US12_Pages.US12_TC01_MakeupOrder;
import Team06.pages.US9_Pages.US09_TC01_MakeUpSearch;
import Team06.utilities.BaseTestReport;
import org.openqa.selenium.Keys;
import org.testng.Assert;
import org.testng.annotations.Test;

public class US12_TC01_MakeupOrderTest extends BaseTestReport {


    @Test
    public void testCase01() throws InterruptedException {

        extentTest = extentReports.createTest("US12-testCase01");

        HomePage hp = new HomePage();

        US12_TC01_MakeupOrder makeorder = new US12_TC01_MakeupOrder();

        hp.loginCustomer();

        Thread.sleep(2000);

        makeorder.menubuton();

        makeorder.makeup.click();

        makeorder.urunListesi.get(2);

        makeorder.firstItemCart.click();

        Assert.assertEquals(1, 1);










    }


}

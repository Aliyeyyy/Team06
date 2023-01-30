package US12_Test;

import Team06.pages.HomePage;
import Team06.pages.US12_Pages.US12_TC01_MakeupOrder;
import Team06.utilities.BaseTestReport;
import Team06.utilities.Driver;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class US12_TC02_MakeupOrderTest extends BaseTestReport {

    @Test
    public void testCase02() throws InterruptedException {

        extentTest = extentReports.createTest("US12-testCase02");

        HomePage hp = new HomePage();

        US12_TC01_MakeupOrder makeorder = new US12_TC01_MakeupOrder();

        hp.loginCustomer();

        Thread.sleep(2000);

        makeorder.menubuton();

        makeorder.makeup.click();

        makeorder.searchBtn.click();
        makeorder.searchBtn.sendKeys("lips");

        Thread.sleep(2000);

        makeorder.Eklencekurun.click();

        //add butonuna tikladik

        makeorder.btnAddToShopingCart();

        try {


            //sepere ekleme ile ürüm miktarının fazlası tıklayınca exception veriyor
            for (int i = 0; i < (makeorder.intStokMiktari() + 1); i++) {
                makeorder.plusBtn();
            }
        } catch (Exception e) {
        }

        //butonun aktif oldugunu kontrol eder
        SoftAssert softAssert = new SoftAssert();
        softAssert.assertEquals(makeorder.intStokMiktari(), makeorder.intEklenenUrunMiktari());

        //ürün sayfası kapatılır
        Actions act = new Actions(Driver.getDriver());
        act.sendKeys(Keys.ESCAPE).perform();

        //driveri kapat
        Driver.getDriver().quit();


    }


}

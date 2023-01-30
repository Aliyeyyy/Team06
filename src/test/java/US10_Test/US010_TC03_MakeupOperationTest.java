package US10_Test;

import Team06.pages.HomePage;
import Team06.pages.US10_Pages.US010_MakeUpOperation;


import Team06.utilities.BaseTestReport;
import Team06.utilities.Driver;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import java.time.Duration;

public class US010_TC03_MakeupOperationTest extends BaseTestReport {

    @Test
    public void testCase03() throws InterruptedException {

        extentTest = extentReports.createTest("US010-testCase03");

        HomePage hp = new HomePage();

        hp.loginCustomer();

        US010_MakeUpOperation make =new US010_MakeUpOperation();

        Thread.sleep(2000);

        make.menubuton();

        make.makeup.click();

        make.searchBtn.click();
        make.searchBtn.sendKeys("Mascara"+Keys.ENTER);

        Thread.sleep(2000);

        //sepete eklenecek urune tikladik

        make.eklencekurun.click();

        //add butonuna tikladik

        make.btnAddToShopingCart();

        try {


            //sepere ekleme ile ürüm miktarının fazlası tıklayınca exception veriyor
            for (int i = 0; i < (make.intStokMiktari() + 1); i++) {
                make.plusBtn();
            }
        } catch (Exception e) {
        }

        //butonun aktif oldugunu kontrol eder
        SoftAssert softAssert = new SoftAssert();
        softAssert.assertEquals(make.intStokMiktari(), make.intEklenenUrunMiktari());

        //ürün sayfası kapatılır
        Actions act = new Actions(Driver.getDriver());
        act.sendKeys(Keys.ESCAPE).perform();

        //driveri kapat
        Driver.getDriver().quit();
















    }





}

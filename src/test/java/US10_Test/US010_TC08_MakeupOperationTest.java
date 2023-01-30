package US10_Test;

import Team06.pages.HomePage;

import Team06.pages.US10_Pages.US010_MakeUpOperation;


import Team06.utilities.BaseTestReport;
import Team06.utilities.Driver;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class US010_TC08_MakeupOperationTest extends BaseTestReport {

    @Test
    public void testCase08() throws InterruptedException {

        extentTest = extentReports.createTest("US010-testCase08");

        HomePage hp = new HomePage();

        hp.loginCustomer();
        Thread.sleep(2000);

        US010_MakeUpOperation make =new US010_MakeUpOperation();

        make.menubuton();

        make.makeup.click();

        Thread.sleep(2000);

        make.searchBtn.click();

        make.searchBtn.sendKeys("Mascara"+Keys.ENTER);

        //kullanici urune tiklar

        make.urunlink.click();


        //kullanici urun sayfasini gorur

        Assert.assertTrue(make.urunsayfa.isDisplayed());

        //ürün sayfası kapatılır
        Actions act = new Actions(Driver.getDriver());
        act.sendKeys(Keys.ESCAPE).perform();

        //driveri kapat
        Driver.getDriver().quit();






    }





}

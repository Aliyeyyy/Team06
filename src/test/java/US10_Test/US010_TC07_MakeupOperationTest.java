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

public class US010_TC07_MakeupOperationTest extends BaseTestReport {

    @Test
    public void testCase07() throws InterruptedException {

        extentTest = extentReports.createTest("US010-testCase07");

        HomePage hp = new HomePage();

        hp.loginCustomer();

        Thread.sleep(2000);

        US010_MakeUpOperation make = new US010_MakeUpOperation();

        make.menubuton();

        make.makeup.click();

        Thread.sleep(2000);

        make.urunaramauruntiklama();

        //indirim fiyati ve oraninin goruntulendigini dogruladik

        Assert.assertTrue(make.fiyat.isDisplayed());
        Assert.assertTrue(make.indirimlifiyat.isDisplayed());
        Assert.assertTrue(make.indirimyuzdesi.isDisplayed());

        //ürün sayfası kapatılır
        Actions act = new Actions(Driver.getDriver());
        act.sendKeys(Keys.ESCAPE).perform();

        //driveri kapat
        Driver.getDriver().quit();


    }


}

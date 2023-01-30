package US10_Test;

import Team06.pages.HomePage;
import Team06.pages.US10_Pages.US010_MakeUpOperation;


import Team06.utilities.BaseTestReport;
import Team06.utilities.Driver;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import java.time.Duration;

public class US010_TC02_MakeupOperationTest extends BaseTestReport {


    @Test
    public void testCase02() throws InterruptedException {

        extentTest = extentReports.createTest("US010-testCase02");

        HomePage hp = new HomePage();

        hp.loginCustomer();

        US010_MakeUpOperation make =new US010_MakeUpOperation();

        WebDriverWait wait = new WebDriverWait(Driver.getDriver(), Duration.ofSeconds(10));

        wait.until(ExpectedConditions.elementToBeClickable(make.menuBTn)).click();


       //kategori butonuna tikladik

        make.menubuton();
      //kategoriden makeup sectik
        make.makeup.click();


       //sayfayi scroll yaptik

        JavascriptExecutor js = (JavascriptExecutor) Driver.getDriver();
        js.executeScript("arguments[0].scrollIntoView();",make.kategori );

        //kategoriyi goruntulemeyi dogruladik

        Assert.assertTrue(make.kategori.isDisplayed());


        //driveri kapat
        Driver.getDriver().quit();









    }
}

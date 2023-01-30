package US10_Test;

import Team06.pages.HomePage;
import Team06.pages.US10_Pages.US010_MakeUpOperation;


import Team06.utilities.BaseTestReport;
import Team06.utilities.Driver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import java.time.Duration;

public class US010_TC04_MakeupOperationTest extends BaseTestReport {

    @Test
    public void Test04() throws InterruptedException {

        extentTest = extentReports.createTest("US010-testCase04");

        HomePage hp = new HomePage();

        hp.loginCustomer();

        US010_MakeUpOperation make =new US010_MakeUpOperation();

        Thread.sleep(2000);

        make.menubuton();

        make.makeup.click();

        //urun arattik

        make.urunaramauruntiklama();

        //details gorunuyormu dogruladik

        Assert.assertTrue(make.details.isDisplayed());

        Driver.closeDriver();










    }


}

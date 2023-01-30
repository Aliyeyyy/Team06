package US10_Test;

import Team06.pages.*;
import Team06.pages.US10_Pages.US010_MakeUpOperation;
import Team06.utilities.BaseTestReport;
import Team06.utilities.Driver;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import java.time.Duration;

public class US010_TC01_MakeupOperationTest extends BaseTestReport {

    @Test

    public void testCase01() throws InterruptedException {

        extentTest = extentReports.createTest("US010-testCase01");

        HomePage hp = new HomePage();

        hp.loginCustomer();

        US010_MakeUpOperation make =new US010_MakeUpOperation();

       Thread.sleep(2000);

        //menu butonuna tikladik

        make.menubuton();

        //menuden makeup kategorisini sectik

        make.makeup.click();

        //istedigimiz urunu aradik

        make.urunaramauruntiklama();

        //kalp butonuna bastik

        make.btnKalp();

        Assert.assertTrue(make.kalp.isEnabled());

        //ürün sayfası kapatılır

        Actions act = new Actions(Driver.getDriver());
        act.sendKeys(Keys.ESCAPE).perform();

        //driveri kapat

        Driver.getDriver().quit();





    }
}

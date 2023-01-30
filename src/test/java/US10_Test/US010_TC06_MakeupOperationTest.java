package US10_Test;

import Team06.pages.HomePage;

import Team06.pages.US10_Pages.US010_MakeUpOperation;

import Team06.utilities.BaseTestReport;
import Team06.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class US010_TC06_MakeupOperationTest extends BaseTestReport {

    @Test
    public void testCase06() throws InterruptedException {

        extentTest = extentReports.createTest("US010-testCase06");

        HomePage hp = new HomePage();

        hp.loginCustomer();

        US010_MakeUpOperation make =new US010_MakeUpOperation();

        make.menubuton();

        make.makeup.click();

        make.urunaramauruntiklama();



        //kullanici daha fazla urun gormek icin scroll yapar


        WebElement urun=Driver.getDriver().findElement(By.xpath("(//div[@class='relative flex h-48 w-auto items-center justify-center sm:h-64'])[5]"));

        JavascriptExecutor js = (JavascriptExecutor) Driver.getDriver();
        js.executeScript("arguments[0].scrollIntoView();",urun);

        //ürün sayfası kapatılır
        Actions act = new Actions(Driver.getDriver());
        act.sendKeys(Keys.ESCAPE).perform();

        //driveri kapat
        Driver.getDriver().quit();

    }




}

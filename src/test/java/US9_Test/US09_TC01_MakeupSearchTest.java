package US9_Test;

import Team06.pages.HomePage;

import Team06.pages.US9_Pages.US09_TC01_MakeUpSearch;
import Team06.utilities.BaseTestReport;
import Team06.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.time.Duration;

public class US09_TC01_MakeupSearchTest extends BaseTestReport {

    @Test
    public void testCase01(){

        extentTest = extentReports.createTest("US09-testCase01");

        HomePage hp = new HomePage();

        US09_TC01_MakeUpSearch mk=new US09_TC01_MakeUpSearch();

        hp.loginCustomer();

        WebDriverWait wait = new WebDriverWait(Driver.getDriver(), Duration.ofSeconds(10));

        wait.until(ExpectedConditions.elementToBeClickable(mk.menuBTn)).click();

        //kullanici menu butonuna tiklar

        mk.menubuton();

        //kullanici makeup a tiklar

        mk.makeup.click();

        //search butonuna arayacagimiz urunu yazip enter a bastik

        mk.searchBtn.sendKeys("Nars Red Lipstick"+ Keys.ENTER);

        //aranan urun dogrulanir

        WebElement rrr=Driver.getDriver().findElement(By.xpath("//img[@class='product-image']"));

        Assert.assertTrue(rrr.isDisplayed());






    }




}

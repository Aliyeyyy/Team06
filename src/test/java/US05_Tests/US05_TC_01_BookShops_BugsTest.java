package US05_Tests;

import Team06.pages.US05_Pages.US05_TC01_ShopsVisit;
import Team06.utilities.BaseTestReport;
import Team06.utilities.Driver;
import org.junit.Assert;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.annotations.Test;

import java.io.File;
import java.io.IOException;

public class US05_TC_01_BookShops_BugsTest extends BaseTestReport {
    WebDriver driver=Driver.getDriver();


    @Test
    public void bookShopsTest() throws IOException, InterruptedException {
        extentTest=extentReports.createTest("bookShopsTest","booksshopbug");

        Driver.getDriver().get("https://shop-pickbazar-rest.vercel.app/");
        US05_TC01_ShopsVisit bs=new US05_TC01_ShopsVisit();
        bs.shops.click();
        bs.booksShop.click();

        Assert.assertEquals(3,bs.information.size());//fail expected:3, actual:2

    }

}

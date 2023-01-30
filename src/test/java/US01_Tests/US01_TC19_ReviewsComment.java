package US01_Tests;
import Team06.pages.US01_Pages.US01_TC19_Reviews;
import Team06.utilities.BaseTestReport;
import Team06.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.awt.*;
import java.awt.event.InputEvent;
import java.awt.event.KeyEvent;
import java.util.List;

import static org.openqa.selenium.Keys.DOWN;
import static org.openqa.selenium.Keys.ENTER;

public class US01_TC19_ReviewsComment extends BaseTestReport {


    @Test
    public void test() {
        extentTest = extentReports.createTest("US001-testCase019");

        WebDriver ldriver = Driver.getDriver();

        //Kullanıcı UrL gider ,login olur
        US01_TC19_Reviews us = new US01_TC19_Reviews();
        us.loginSeller();

        // Kullanıcı Reviews i tıklar
        us.reviews.click();

        //Kullanıcı müşteri tarafından yapılan yorumu görür.


        List<WebElement> pages = ldriver.findElements(By.xpath("//a[@rel=\"nofollow\"]"));
        for (WebElement page : pages) {
            page.click();


            List<WebElement> comments = ldriver.findElements(By.xpath("//p[@class=\"text-sm leading-6 text-heading\"]"));
            for (WebElement a : comments) {
                Assert.assertTrue(a.isDisplayed());
            }
            //Kullanıcı yorum hakkındaki bilgileri görür.

            List<WebElement> comInf = ldriver.findElements(By.xpath("//div[@class=\"mt-3 flex items-center space-x-4\"]"));
            for (WebElement cI : comInf) {
                Assert.assertTrue(cI.isDisplayed());
            }

        }

    }


}

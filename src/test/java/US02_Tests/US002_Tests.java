package US02_Tests;

import Team06.pages.US002.ContactPage;
import Team06.utilities.BaseTestReport;
import Team06.utilities.ConfigReader;
import Team06.utilities.Driver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class US002_Tests extends BaseTestReport{

    @Test
    public void testCase01() throws InterruptedException {
        extentTest = extentReports.createTest("US001-testCase01");

        Driver.getDriver().get(ConfigReader.getProperty("homePageURL"));

        ContactPage cp = new ContactPage();
        cp.navigateToContact();
        SoftAssert sa = new SoftAssert();
        sa.assertFalse(cp.getWebAddress().isEmpty());
        sa.assertFalse(cp.getAddress().isEmpty());
        sa.assertFalse(cp.getPhone().isEmpty());
        sa.assertAll();


    }

    @Test
    public void testCase02() {
        extentTest = extentReports.createTest("US002-test02");
        Driver.getDriver().get(ConfigReader.getProperty("homePageURL"));

        ContactPage cp = new ContactPage();
        cp.navigateToContact();
        SoftAssert sa = new SoftAssert();
        sa.assertTrue(cp.facebookIsVisitable(), "Facebook linki aktif degil");
        sa.assertTrue(cp.twitterIsVisitable(), "Twitter linki aktif degil");
        sa.assertTrue(cp.instagramIsVisitable(), "Instagram linki aktif degil");
        sa.assertAll();
    }


    @Test
    public void testCase03() {
        extentTest = extentReports.createTest("US002-test03");
        Driver.getDriver().get(ConfigReader.getProperty("homePageURL"));

        ContactPage cp = new ContactPage();
        cp.navigateToContact();
        cp.fillAllTextArea();
        cp.wait.until(ExpectedConditions.visibilityOf(cp.emailAlertMessage));
        Assert.assertTrue(cp.alertMessageIsVisible());


    }

    @Test
    public void testCase04() {
        extentTest = extentReports.createTest("US002-test04");
        Driver.getDriver().get(ConfigReader.getProperty("homePageURL"));

        ContactPage cp = new ContactPage();
        cp.navigateToContact();
        cp.fillAllTextAreaFalse();
        Assert.assertTrue(cp.alertMessage());

    }

    @Test
    public void testCase05() {
        extentTest = extentReports.createTest("US002-test05");
        Driver.getDriver().get(ConfigReader.getProperty("homePageURL"));

        ContactPage cp = new ContactPage();
        cp.navigateToContact();
        Assert.assertTrue(cp.alertMessages());



    }

    @Test
    public void testCase06(){
        extentTest = extentReports.createTest("US002-test06");
        Driver.getDriver().get(ConfigReader.getProperty("homePageURL"));

        ContactPage cp = new ContactPage();
        cp.navigateToContact();
        cp.sendKeysName();
        cp.sendKeysEmail();
        cp.sendKeysSubject();
        cp.sendKeysDescription();
        cp.clickSubmit();
        Assert.assertTrue(cp.emailAlertMessage.isDisplayed(), "Description kisminda herhangi bir sinirlama mevcut degil");



    }
}
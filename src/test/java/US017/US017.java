package US017;

import Team06.pages.US017.PageBags;
import Team06.utilities.BaseTestReport;
import Team06.utilities.ConfigReader;
import Team06.utilities.Driver;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class US017 extends BaseTestReport{

    @Test
    public void testCase01() {
        extentTest = extentReports.createTest("US017-testCase01");
        Driver.getDriver().get(ConfigReader.getProperty("homePageURL"));

        PageBags pb = new PageBags();
        pb.loginCustomer();
        pb.navigateToMenuBags();

        pb.addItemToCart();
        pb.clickCart();
        Assert.assertTrue(pb.itemsAdded());





    }

    @Test
    public void testCase02(){
        extentTest = extentReports.createTest("US017-testCase02");

        Driver.getDriver().get(ConfigReader.getProperty("homePageURL"));

        PageBags pb = new PageBags();
        pb.loginCustomer();
        pb.navigateToMenuBags();

        pb.addItemToCart();
        pb.clickCart();
        SoftAssert sa = new SoftAssert();
        sa.assertTrue(pb.plusMinusButtonIsEnabled(), "Arttirma eksiltme islemleri yapilamiyor");
        sa.assertTrue(pb.removeProductFromCart(), "Ürün sepetten cikarilamadi");
        sa.assertAll();

    }


    @Test
    public void testCase03() {
        extentTest = extentReports.createTest("US017-testCase03");

        Driver.getDriver().get(ConfigReader.getProperty("homePageURL"));

        PageBags pb = new PageBags();
        pb.loginCustomer();
        pb.navigateToMenuBags();
        pb.addItemToCart();
        pb.clickCart();
        Assert.assertTrue(pb.itemsTotalPriceIsEquals(), "Görseldeki ürün fiyati ile sepetteki ürün fiyatlari farkli");

    }

    @Test
    public void testCase04() {
        extentTest = extentReports.createTest("US017-testCase04");

        Driver.getDriver().get(ConfigReader.getProperty("homePageURL"));

        PageBags pb = new PageBags();
        pb.loginCustomer();
        pb.navigateToMenuBags();
        pb.clickFirstItemOnPage();
        pb.addCartOnItem();
        pb.clickPlusButtonOnItem();
        Assert.assertEquals(pb.totalAvailabity(),pb.totalAdded(), "Stoktaki üründen fazlasi sepete eklendi");


    }

    @Test
    public void testCase05() {
        extentTest = extentReports.createTest("US017-testCase05");

        Driver.getDriver().get(ConfigReader.getProperty("homePageURL"));

        PageBags pb = new PageBags();
        pb.loginCustomer();
        pb.navigateToMenuBags();
        pb.clickOutOfStockItem();
        pb.addCartOnItem2();
        Assert.assertNotEquals(pb.totalAdded2(), 1, "Mevcut olmayan ürün sepete eklendi");

    }
    @Test
    public void testCase06() throws InterruptedException {
        extentTest = extentReports.createTest("US017-testCase06");

        Driver.getDriver().get(ConfigReader.getProperty("homePageURL"));

        PageBags pb = new PageBags();
        pb.loginCustomer();
        pb.navigateToMenuBags();
        pb.clickPurseButton();
        Assert.assertTrue(pb.itemsCountIsTrue(), "Ürünlerin hepsi sepete eklenmedi");

    }

}
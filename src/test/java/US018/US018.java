package US018;

import Team06.pages.US018.CheckoutPage;
import Team06.pages.US017.PageBags;
import Team06.utilities.BaseTestReport;
import Team06.utilities.ConfigReader;
import Team06.utilities.Driver;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import java.awt.*;

public class US018 extends BaseTestReport {

    WebDriver driver = Driver.getDriver();
    @Test
    public void testCase01() {
        extentTest = extentReports.createTest("US018-testCase01");


        driver.get(ConfigReader.getProperty("homePageURL"));

        PageBags pb = new PageBags();
        pb.loginCustomer();
        pb.navigateToMenuBags();
        pb.addItemToCart();
        pb.clickCart();

        pb.clickCheckoutButton();
        SoftAssert sa = new SoftAssert();
        sa.assertTrue(pb.isCheckoutpageDisplayed(), "Checkout sayfasi görüntülenmedi");
        sa.assertTrue(pb.isSelectedItemsOnCheckout(), "Ürünler Checkout sayfasinda görüntülenmedi");
        sa.assertAll();

    }


    @Test
    public void testCase02() {
        extentTest = extentReports.createTest("US018-testCase02");

        PageBags pb = new PageBags();

        pb.loginCustomer();
        pb.navigateToMenuBags();
        pb.addItemToCart();
        pb.clickCart();
        pb.clickCheckoutButton();
        CheckoutPage cp = new CheckoutPage();
        cp.updateTelefonNumber();
        Assert.assertTrue(cp.isTelefonNumberUpdated());

    }

    @Test
    public void testCase03() throws AWTException {
        extentTest = extentReports.createTest("US018-testCase03");

        PageBags pb = new PageBags();

        pb.loginCustomer();
        pb.navigateToMenuBags();
        pb.addItemToCart();
        pb.navigateToOffers();
        CheckoutPage cp = new CheckoutPage();
        cp.copyCoupon();
        pb.clickCart();
        pb.clickCheckoutButton();
        cp.addCoupon();
        cp.discountIsDisplayed();


    }

    @Test(priority = 2)
    public void testCase04() throws AWTException {
        extentTest = extentReports.createTest("US018-testCase04");

        PageBags pb = new PageBags();
        CheckoutPage cp = new CheckoutPage();
        pb.loginCustomer();
        pb.navigateToMenuBags();
        pb.addItemToCart();
        pb.navigateToOffers();
        cp.copyCoupon();
        pb.clickCart();
        pb.clickCheckoutButton();
        cp.updateTelefonNumber();
        cp.addCoupon();

        cp.paymentMethodIsClickable();
        cp.choosePaymentMethod();
        cp.isProgress5Steps();


    }

    @Test(priority = 3)
    public void testCase05() {
        extentTest = extentReports.createTest("US018-testCase05");

        CheckoutPage cp = new CheckoutPage();
        cp.loginCustomer();
        cp.navigateToMyOrders();
        Assert.assertTrue(cp.myOffersIsDisplayed());


    }

    @Test
    public void testCase06() {
        extentTest = extentReports.createTest("US018-testCase06");

        PageBags pb = new PageBags();

        pb.loginCustomer();
        pb.navigateToMenuBags();
        pb.addItemToCart();
        pb.clickCart();
        pb.clickCheckoutButton();
        CheckoutPage cp = new CheckoutPage();
        Assert.assertTrue(cp.deliveryIsSelectable());
    }

    @Test
    public void testCase07(){
        extentTest = extentReports.createTest("US018-testCase02");

        PageBags pb = new PageBags();

        pb.loginCustomer();
        pb.navigateToMenuBags();
        pb.addItemToCart();
        pb.clickCart();
        pb.clickCheckoutButton();
        CheckoutPage cp = new CheckoutPage();
        cp.updateBillingAddress();
        SoftAssert sa = new SoftAssert();
        sa.assertTrue(cp.isUpdated(), "Fatura adresi güncellenemedi");
        cp.updateShippingAdress();
        sa.assertTrue(cp.isUpdated(), "Siparis adresi güncellenmedi");
    }

}




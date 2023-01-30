package US13_Tests;

import Team06.pages.US018.CheckoutPage;
import Team06.pages.US13_Pages.US13_MakeUpPage;
import Team06.utilities.BaseTestReport;
import Team06.utilities.ConfigReader;
import Team06.utilities.Driver;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import java.awt.*;

public class US13_MakeUp_PlaceOrderTest extends BaseTestReport {
    @Test
    public void test01() throws InterruptedException {

        extentTest = extentReports.createTest("US13-test01");

        Driver.getDriver().get(ConfigReader.getProperty("homePageURL"));

        US13_MakeUpPage fth = new US13_MakeUpPage();
        // Kullanıcı url ye gider ve login olur
        fth.loginCustomer();
        //kullanıcı anasayfada grocery açılır menüye gider
        //kullanıcı açılır menüye tıklar ve makeupı seçer ve tıklar
        fth.navigateToMenuMakeup();
        //kullanıcı makeup ürünlerinde seçer ve tıklar
        fth.addItemToCart();
        //kullanıcı makeup ürünlerinde cart butonuna tıklar
        fth.clickCart();
        fth.itemsNameCart();
        //kullanıcı Checkout butonuna tıklar
        fth.clickCheckoutButton();
        //kullanıcı Checkout sayfasının göründüğünü doğrular
        SoftAssert fa = new SoftAssert();
        fa.assertTrue(fth.isCheckoutpageDisplayed(), "Checkout sayfasi görüntülenmedi");
        fa.assertTrue(fth.isSelectedItemsOnCheckout(), "Ürünler Checkout sayfasinda görüntülenmedi");
        fa.assertAll();


    }

    @Test
    public void test02() throws InterruptedException {
        extentTest = extentReports.createTest("US013-testCase02");
        US13_MakeUpPage fth = new US13_MakeUpPage();
        CheckoutPage fth1 = new CheckoutPage();
        // Kullanıcı url ye gider ve login olur
        fth.loginCustomer();
        //kullanıcı anasayfada grocery açılır menüye gider
        //kullanıcı açılır menüye tıklar ve makeupı seçer ve tıklar
        fth.navigateToMenuMakeup();
        //kullanıcı makeup ürünlerinde seçer ve tıklar
        fth.addItemToCart();
        //kullanıcı makeup ürünlerinde cart butonuna tıklar
        fth.clickCart();
        //kullanıcı checkout butonuna tıklar
        fth.clickCheckoutButton();
        // kullanıcı billing adres bilgilerini ekleyerek uptade eder
        fth1.updateBillingAddress();
        // kullanıcı billing adres bilgilerini uptade edildiğini doğrular
        Assert.assertTrue(fth1.isUpdated());
        // kullanıcı shipping adres bilgilerini ekleyerek uptade eder
        fth1.updateShippingAdress();
        // kullanıcı shipping adres bilgilerini uptade edildiğini doğrular
        Assert.assertTrue(fth1.isUpdated());
        // kullanıcı sipariş teslim programı seçebildiğini doğrular
        Assert.assertTrue(fth1.deliveryIsSelectable());


    }

    @Test
    public void test03() {
        extentTest = extentReports.createTest("US13-test02");

        US13_MakeUpPage fth = new US13_MakeUpPage();

        fth.loginCustomer();
        fth.navigateToMenuMakeup();
        fth.addItemToCart();
        fth.clickCart();
        fth.clickCheckoutButton();
        CheckoutPage cp = new CheckoutPage();
        //Kullanıcı tel number ekler
        cp.updateTelefonNumber();
        //Kullanıcı tel number eklediğini doğrular
        Assert.assertTrue(cp.isTelefonNumberUpdated());

    }

    @Test
    public void test04() throws AWTException, InterruptedException, AWTException {
        US13_MakeUpPage fth = new US13_MakeUpPage();
        CheckoutPage fth1 = new CheckoutPage();
        // Kullanıcı url ye gider ve login olur
        fth.loginCustomer();
        //kullanıcı anasayfada grocery açılır menüye gider
        //kullanıcı açılır menüye tıklar ve makeupı seçer ve tıklar
        fth.navigateToMenuMakeup();
        //kullanıcı makeup ürünlerinde ürün seçer ve cart a tıklar
        fth.addItemToCart();
        //kullanıcı kupon kısmına gider
        fth.navigateToOffers();
        //kullanıcı kupona tıklar ve kopyalanır
        fth1.copyCoupon();
        // kullanıcı cart a tıklar
        fth.clickCart();
        // kullanıcı checkout a tıklar
        fth.clickCheckoutButton();
        // kullanıcı kuponu ekler
        fth1.addCoupon();
        // kullanıcı kuponu eklediğini doğrular
        fth1.discountIsDisplayed();

    }

    @Test(priority = 2)
    public void test05() throws AWTException {
        extentTest = extentReports.createTest("US13-test05");

        US13_MakeUpPage fth = new US13_MakeUpPage();
        CheckoutPage fth1 = new CheckoutPage();
        fth.loginCustomer();
        fth.navigateToMenuMakeup();
        fth.addItemToCart();
        fth.navigateToOffers();
        fth1.copyCoupon();
        fth.clickCart();
        fth.clickCheckoutButton();
        //kullanıcı tel number uptade eder
        fth1.updateTelefonNumber();
        // kullanıcı kupon ekler
        fth1.addCoupon();
        // kullanıcı ödeme yöntemini seçer
        fth1.paymentMethodIsClickable();
        // kullanıcı  ödemeyi yapar ve siparişi tamamlar
        fth1.choosePaymentMethod();
        //kullanıcı 5 adımlı sipariş sürecini takip eder
        fth1.isProgress5Steps();
    }

    @Test(priority = 3)
    public void test06() {
        extentTest = extentReports.createTest("US13-test06");

        CheckoutPage fth1 = new CheckoutPage();
        // Kullanıcı url ye gider ve login olur
        fth1.loginCustomer();
        // kullanıcı orders sayfasına gider
        fth1.navigateToMyOrders();
        //kullanıcı sipariş özetini gördüğünü doğrular
        Assert.assertTrue(fth1.myOffersIsDisplayed());
    }
    @Test
    public void test07(){
        extentTest = extentReports.createTest("US13-test07");

        US13_MakeUpPage fth = new US13_MakeUpPage();
        // Kullanıcı url ye gider ve login olur
        fth.loginCustomer();
        //kullanıcı anasayfada grocery açılır menüye gider
        //kullanıcı açılır menüye tıklar ve makeupı seçer ve tıklar
        fth.navigateToMenuMakeup();
        //kullanıcı makeup ürünlerinde ürün seçer
        fth.addItemToCart();
        //kullanıcı cart a tıklar
        fth.clickCart();
        // kullanıcı checkout a tıklar
        fth.clickCheckoutButton();
        CheckoutPage fth1 = new CheckoutPage();
        // kullanıcı billing adres bilgilerini ekleyerek uptade eder
        fth1.updateBillingAddress();
        //kullanıcı fatura adresini doğrular
        SoftAssert fa = new SoftAssert();
        fa.assertTrue(fth1.isUpdated(), "Fatura adresi güncellenemedi");
        fth1.updateShippingAdress();
        fa.assertTrue(fth1.isUpdated(), "Siparis adresi güncellenmedi");
    }
}
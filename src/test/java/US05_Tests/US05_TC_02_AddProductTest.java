package US05_Tests;

import Team06.pages.US05_Pages.US05_TC01_ShopsVisit;
import Team06.utilities.BaseTestReport;
import Team06.utilities.Driver;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class US05_TC_02_AddProductTest extends BaseTestReport {
    public static void javaScriptExecutor(WebElement locator){
        JavascriptExecutor js = (JavascriptExecutor) Driver.getDriver();
        js.executeScript("arguments[0].click();", locator);
    }
    WebDriver driver=Driver.getDriver();
    US05_TC01_ShopsVisit ap=new US05_TC01_ShopsVisit();

    @Test
    public void testAddProduct() throws InterruptedException {
        extentTest=extentReports.createTest("testAddProduct","urun miktrı guncelleme");
        //siteye gidildi
        driver.get("https://shop-pickbazar-rest.vercel.app/");
        //shop sekmesini tıklandı
        ap.shops.click();
        //furnitureShop kısmına tıklandı
        ap.furnitureShop.click();
        javaScriptExecutor(ap.sofa);
        //urun tıklandı
        ap.sofa.click();
        //urun miktarı arttırıldı
        ap.addToCart.click();
        //sepete gidildi
        ap.item.click();
        //sepette urun miktarı arttırıldı
        ap.plus.click();
        //Urun miktarının arttırıldıgı dogrulandı
        String actualMiktar= ap.increaseTrue.getText();
        Assert.assertEquals(actualMiktar,"2");
        //sepette urun miktarı azaltıldı
        ap.reduce.click();
        //urun miktarı azalltıldıgı dogrulandı
        actualMiktar = ap.reduceTrue.getText();
        Assert.assertEquals(actualMiktar, "1");
        //checkout sekmesi tıklandı
        ap.checkout.click();
        //login tıklandı
        ap.login.click();
        //checkAvailability tıklandı
        ap.checkAvailability.click();
        //placeOrder tıklandı
        ap.placeOrder.click();
        //odeme sekmesi tıklandı
        ap.pay.click();
        //odemenin basarılı oldugu dogrulandı
        Assert.assertTrue(ap.paySuccess.getText().contains("Payment Success"));
        //avatar tıklandı
        ap.userAvatar.click();
        //logout tıklanıp cıkıs yapıldı
        ap.logout.click();
        //Driver kapatıldı
        Driver.closeDriver();


    }
    @Test public void outofstockTest(){
        extentTest=extentReports.createTest("outofstockTest","stokta olmayan urun");

        driver.get("https://shop-pickbazar-rest.vercel.app/");
        ap.shops.click();
        ap.furnitureShop.click();
        ap.doubleBed.click();
        ap.addToCart.click();
        ap.item.click();
        ap.checkout.click();
        ap.login.click();
        ap.checkAvailability.click();
        Assert.assertFalse(ap.unavailable.getText().contains("Unavailable"));//stokta olmayan urun sepete eklenebiliyor.
        Driver.closeDriver();

    }
}

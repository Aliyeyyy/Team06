package US20_Test;

import Team06.pages.US19_Page.LocaterClass;
import Team06.pages.US20_Page.US019_020_DailyNeeds_Pages;
import Team06.utilities.BaseTestReport;
import Team06.utilities.ConfigReader;
import Team06.utilities.Driver;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class US020 extends BaseTestReport {
    @Test
    public void TC01_kategori_Islem() throws InterruptedException {
        extentTest = extentReports.createTest("TC01_kategori_Islem");
        US019_020_DailyNeeds_Pages cc = new US019_020_DailyNeeds_Pages();
        LocaterClass lc = new LocaterClass();
        SoftAssert sf = new SoftAssert();
        //1-Kullanıcı URL ye gider.
        Driver.getDriver().get(ConfigReader.getProperty("homePageURL"));
        //2-Kullanıcı sol üstteki GROCERY butonuna tıklar.
        lc.clickHomeMenu();
        //3-Kullanıcı açılan menüden DAILYNEEDS sekmesine tıklar
        lc.navigateToMenuDailyNeeds();
        //4-Kullanıcı VAGETABLE kategorisini içindeki ürünlerini sepete ekler ve kontrol eder.
        cc.vegateblesIslem();
        //5-Kullanıcı SNACK kategorisini içindeki ürünlerini sepete ekler ve kontrol eder.
        cc.snackIslem();
        //6- Kullanıcı BAKERY kategorisini içindeki ürünlerini sepete ekler ve kontrol eder.
        cc.bakery();
        // 7- Kullanıcı FRUİTS kategorisini içindeki ürünlerini sepete ekler ve kontrol eder.
        cc.fruits();
        // 8- Kullanıcı FİSH kategorisini içindeki ürünlerini sepete ekler ve kontrol eder.
        cc.fish();
        // 10- Kullanıcı MEAT kategorisini içindeki ürünlerini sepete ekler ve kontrol eder.
        cc.meat();
        // 9- Kullanıcı DAİRYEGGS kategorisini içindeki ürünlerini sepete ekler ve kontrol eder.
         cc.dairyEggs();
        //11 -Kullanıcı RİCEPLUS kategorisini içindeki ürünlerini sepete ekler ve kontrol eder.
        cc.ricePulse();

    }
    @Test
    public void TC02_KategoriGoruntulenme() throws InterruptedException {
        extentTest = extentReports.createTest("TC02_KategoriGoruntulenme");
        US019_020_DailyNeeds_Pages cc = new US019_020_DailyNeeds_Pages();
        LocaterClass lc = new LocaterClass();
        //1-Kullanıcı URL ye gider.
        Driver.getDriver().get(ConfigReader.getProperty("homePageURL"));
        //2-Kullanıcı sol üstteki GROCERY butonuna tıklar.
        lc.clickHomeMenu();
        //3-Kullanıcı açılan menüden DAILYNEEDS sekmesine tıklar
        lc.navigateToMenuDailyNeeds();
        //4-Kullanıcı VAGETABLE kategorisini görüntülediğini kontrol eder.
        cc.vegatablesDisplayed();
        //5-Kullanıcı SNACK kategorisini görüntülediğini kontrol eder.
        cc.snackDisplayed();
        //6- Kullanıcı BAKERY kategorisini görüntülediğini kontrol eder.
        cc.bakeryDisplayed();
        // 7- Kullanıcı FRUİTS kategorisini görüntülediğini kontrol eder.
        cc.fruitDisplayed();
        // 8- Kullanıcı FİSH kategorisini görüntülediğini kontrol eder.
        cc.fishDisplayed();
        // 10- Kullanıcı MEAT kategorisini görüntülediğini kontrol eder.
        cc.meatDisplayed();
        // 9- Kullanıcı DAİRYEGGS kategorisini görüntülediğini kontrol eder.
        cc.dairyEggs();
        //11 -Kullanıcı RİCEPLUS kategorisini görüntülediğini kontrol eder.
        cc.ricePlusDisplayed();

    }
    @Test
    public void TC03_hoverTest() throws Exception {
        extentTest = extentReports.createTest("TC03_hoverTest");
        US019_020_DailyNeeds_Pages cc = new US019_020_DailyNeeds_Pages();
        LocaterClass lc = new LocaterClass();
        SoftAssert sf = new SoftAssert();
        //1-Kullanıcı URL ye gider.
        Driver.getDriver().get(ConfigReader.getProperty("homePageURL"));
        //2-Kullanıcı sol üstteki GROCERY butonuna tıklar.
        lc.clickHomeMenu();
        //3-Kullanıcı açılan menüden DAILYNEEDS sekmesine tıklar
        lc.navigateToMenuDailyNeeds();
        //4- Kullanıcı mouse ile gittiği Vegatables de view more textinin çıktığını kontrol eder
        cc.vegahover();
        //5-Kullanıcı mouse ile gittiği Snack de view more textinin çıktığını kontrol eder
        cc.snackHover();
        //6-Kullanıcı mouse ile gittiği RicePulse da view more textinin çıktığını kontrol eder
        cc.RicePulseHover();
        //7-Kullanıcı mouse ile gittiği Meat de view more textinin çıktığını kontrol eder
        cc.meatHover();
        //8-Kullanıcı mouse ile gittiği Fruits da view more textinin çıktığını kontrol eder
        cc.fruitkHover();
        //9-Kullanıcı mouse ile gittiği Fish de view more textinin çıktığını kontrol eder
        cc.fishHover();
        //10-Kullanıcı mouse ile gittiği Bakery de view more textinin çıktığını kontrol eder
        cc.bakeryHover();
        //11-Kullanıcı mouse ile gittiği DAiryEggs de view more textinin çıktığını kontrol eder
        cc.dairyEggsView();
    }


}

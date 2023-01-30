package US22;

import Team06.pages.US21_US22_DailyNeedsClasses.BakeryCategory;
import Team06.pages.US21_US22_DailyNeedsClasses.FruitCategory;
import Team06.pages.US21_US22_DailyNeedsClasses.MeatCategory;
import Team06.pages.US21_US22_DailyNeedsClasses.DailyNeeds;
import Team06.utilities.BaseTestReport;
import Team06.utilities.Driver;
import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.io.FileHandler;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import java.io.File;
import java.io.IOException;

public class US22_DailyNeedsBugs extends BaseTestReport {
    @Test
    public void appleBug() throws InterruptedException, IOException {
        extentTest = extentReports.createTest("US022-testCase01");


        //Kullanıcı URL e gider,login olur

        WebDriver ldriver = Driver.getDriver();
        DailyNeeds dN=new DailyNeeds();
        FruitCategory fC=new FruitCategory();
        dN.loginCustomer();

        // Kullanıcı Daily Needs kategorisine gider
        dN.menuBUtton.click();

        //Kullanıcı sepete eklemekm istediği ürünlere gider
        fC.appleGit();
        //Kullanıcı ürün üzerine tıklar
        fC.appleNostocks.click();
        //Kullanıcı ürünü sepete ekler
        dN.addNostocks.click();

        dN.screenShot();

        //Kullanıcı sepete gider
        dN.urundenSepeteGit();

        //kullanıcı sepetteki ürün sayısının 1 olduğunu görür
        dN.outOfStockEklendimi();
    }

    @Test
    public void chickenBug() throws InterruptedException, IOException {
        extentTest = extentReports.createTest("US022-testCase02");

        //Kullanıcı URL e gider,login olur

        WebDriver ldriver = Driver.getDriver();
        DailyNeeds dN = new DailyNeeds();
        MeatCategory mC = new MeatCategory();
        dN.loginCustomer();

        // Kullanıcı Daily Needs kategorisine gider
        dN.menuBUtton.click();

        //Kullanıcı sepete eklemekm istediği ürünlere gider
        mC.chickenGit();

        //Kullanıcı ürün üzerine tıklar
        mC.chickenNostocks.click();

        //Kullanıcı ürünü sepete ekler
        dN.addNostocks.click();

        dN.screenShot();

        //Kullanıcı sepete gider
        dN.urundenSepeteGit();

        //kullanıcı sepetteki ürün sayısının 1 olduğunu görür
        dN.outOfStockEklendimi();
    }

    @Test
    public void chesecakeBug() throws InterruptedException, IOException {
        extentTest = extentReports.createTest("US022-testCase03");

        //Kullanıcı URL e gider,login olur

        WebDriver ldriver = Driver.getDriver();
        DailyNeeds dN = new DailyNeeds();
        BakeryCategory bC = new BakeryCategory();
        dN.loginCustomer();

        // Kullanıcı Daily Needs kategorisine gider
        dN.menuBUtton.click();

        //Kullanıcı sepete eklemekm istediği ürünlere gider
        bC.cakeGit();

        //Kullanıcı ürün üzerine tıklar
        bC.chesecakeNostocks.click();

        //Kullanıcı ürünü sepete ekler
        dN.addNostocks.click();

        dN.screenShot();

        //Kullanıcı sepete gider
        dN.urundenSepeteGit();

         //kullanıcı sepetteki ürün sayısının 1 olduğunu görür
        dN.outOfStockEklendimi();

    }

    @Test
    public void waterMelonBug() throws InterruptedException, IOException {
        extentTest = extentReports.createTest("US022-testCase04");

        //Kullanıcı URL e gider,login olur

        WebDriver ldriver = Driver.getDriver();
        DailyNeeds dN = new DailyNeeds();
        FruitCategory fC = new FruitCategory();
        dN.loginCustomer();

        // Kullanıcı Daily Needs kategorisine gider
        dN.menuBUtton.click();

        //Kullanıcı sepete eklemekm istediği ürünlere gider

        fC.stonrFruitsGit();

        //Kullanıcı ürün üzerine tıklar
        fC.wMelonNostocks.click();

        //Kullanıcı ürünü sepete ekler
        dN.addNostocks.click();

        dN.screenShot();

        //Kullanıcı sepete gider
        dN.urundenSepeteGit();

        //kullanıcı sepetteki ürün sayısının 1 olduğunu görür
        dN.outOfStockEklendimi();
        //stokta olmayan ürün sepete eklenerek sepetteki ürün sayısı 1 olmuştur.


    }

}

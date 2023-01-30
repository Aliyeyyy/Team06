package US21;

import Team06.pages.US21_US22_DailyNeedsClasses.DairyEggsCategory;
import Team06.pages.US21_US22_DailyNeedsClasses.FruitCategory;
import Team06.pages.US21_US22_DailyNeedsClasses.DailyNeeds;
import Team06.utilities.BaseTestReport;
import Team06.utilities.Driver;
import org.junit.Assert;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.io.FileHandler;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import java.io.File;
import java.io.IOException;

public class US21_DailyNeedsBugs extends BaseTestReport {
    @Test
    public void productData() throws InterruptedException, IOException {
        extentTest = extentReports.createTest("US021-testCase01");


        //Kullanıcı URL e gider

        WebDriver ldriver = Driver.getDriver();
        ldriver.get("https://shop-pickbazar-rest.vercel.app/");

        //Kullanıcı login olur
        DailyNeeds dN = new DailyNeeds();
        FruitCategory fC = new FruitCategory();
        dN.loginCustomer();

        // Kullanıcı Daily Needs kategorisine gider
        dN.menuBUtton.click();

        //Kullanıcı sepete eklemek istediği ürünlere gider
        fC.stonrFruitsGit();

        //Kullanıcı ürünün iki kere listelendiğini görür
         dN.screenShot();

         Assert.assertEquals(fC.apricot2.getText(),(fC.apricot1.getText()));
         SoftAssert softAssert = new SoftAssert();
         softAssert.assertEquals(fC.apricotPrice1.getText(),(fC.apricotPrice2.getText()));
         softAssert.assertAll();

    }
    @Test
    public void butterTest() throws IOException, InterruptedException {
        //Kullanıcı URL e gider
        extentTest = extentReports.createTest("US021-testCase02");

        WebDriver ldriver = Driver.getDriver();
        ldriver.get("https://shop-pickbazar-rest.vercel.app/");

        //Kullanıcı login olur
        DailyNeeds dN = new DailyNeeds();
        DairyEggsCategory dC = new DairyEggsCategory();
        dN.loginCustomer();

        // Kullanıcı Daily Needs kategorisine gider
        dN.menuBUtton.click();

        //Kullanıcı sepete eklemek istediği ürünlere gider
        dC.dairyGit();

        //Aynı ürün olduğu doğrulandı
        SoftAssert softAssert = new SoftAssert();
        softAssert.assertNotEquals(dC.butter1.getText(),(dC.butter2.getText()));

        // Aldigimiz screenshot istedigimiz path e kaydediyoruz
        dN.screenShot();
        softAssert.assertAll();

    }
    @Test
    public void MelonTest() throws InterruptedException, IOException {
        extentTest = extentReports.createTest("US021-testCase03");

        WebDriver ldriver = Driver.getDriver();
        ldriver.get("https://shop-pickbazar-rest.vercel.app/");

        //Kullanıcı login olur
        DailyNeeds dN = new DailyNeeds();
        FruitCategory fC = new FruitCategory();

        dN.loginCustomer();

        // Kullanıcı Daily Needs kategorisine gider
        dN.menuBUtton.click();

        //Kullanıcı sepete eklemek istediği ürünlere gider
        fC.stonrFruitsGit();

        //Kullanıcı kategoride farklı ürünler görür

        SoftAssert softAssert = new SoftAssert();
        softAssert.assertFalse(fC.stoneFruitstitles.get(17).getText().contains("melon"), "Bu kategoride Melon olmamalıydı");

        // Aldigimiz screenshot istedigimiz path e kaydediyoruz

        Actions act=new Actions(ldriver);
        act.moveToElement(fC.stoneFruitstitles.get(17)).perform();

        dN.screenShot();

        softAssert.assertAll();

    }

    @Test
    public void yogurtTest() throws InterruptedException, IOException {
        extentTest = extentReports.createTest("US021-testCase04");

        WebDriver ldriver = Driver.getDriver();
        ldriver.get("https://shop-pickbazar-rest.vercel.app/");

        //Kullanıcı login olur
        DailyNeeds dN = new DailyNeeds();
        FruitCategory fC = new FruitCategory();
        dN.loginCustomer();

        // Kullanıcı Daily Needs kategorisine gider
        dN.menuBUtton.click();

        //Kullanıcı sepete eklemek istediği ürünlere gider
        fC.tropicalFruitsGit();

        //Kullanıcı kategoride farklı ürünler görür

        SoftAssert softAssert = new SoftAssert();
        softAssert.assertFalse(fC.tropicalTitles.get(3).getText().contains("yogurt"), "Bu kategoride yogurt olmamalıydı");

        // Aldigimiz screenshot istedigimiz path e kaydediyoruz
         dN.screenShot();

         softAssert.assertAll();
    }



}

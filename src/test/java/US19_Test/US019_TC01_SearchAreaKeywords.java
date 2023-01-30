package US19_Test;


import Team06.pages.US19_Page.LocaterClass;
import Team06.utilities.ConfigReader;
import Team06.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class US019_TC01_SearchAreaKeywords {

@Test
    public void searchKeywords() throws InterruptedException {
    SoftAssert sf = new SoftAssert();
    //1-Kullanıcı URL ye gider.
    Driver.getDriver().get(ConfigReader.getProperty("homePageURL"));
    LocaterClass lc = new LocaterClass();
    //2-Kullanıcı sol üstteki GROCERY butonuna tıklar.
    lc.clickHomeMenu();
    //3-Kullanıcı açılan menüden DAILYNEEDS sekmesine tıklar
    lc.navigateToMenuDailyNeeds();
    //4-Kullanıcı SEARCH bölmesine DAILYNEEDS de bulunan ürünlerden birini yazar
    lc.sendKeysHomeSearchBox("organic");
    //5-Kullanıcı aradığı anahtar kelimeyi içeren ürünün listelendiğini görür.
    WebElement keyword = Driver.getDriver().findElement(By.xpath("//*[@id=\"__next\"]/div/div[1]/div[1]/div[4]/div/div/article[1]/header/h3"));

    sf.assertTrue(keyword.getText().contains("orgnaic"));

    Driver.closeDriver();



}

    }









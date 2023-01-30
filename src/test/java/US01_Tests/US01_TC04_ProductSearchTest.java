package US01_Tests;

import Team06.pages.US01_Pages.US01_TC04_ProductSearch;
import Team06.utilities.BaseTestReport;
import Team06.utilities.Driver;
import org.openqa.selenium.Keys;
import org.testng.annotations.Test;

public class US01_TC04_ProductSearchTest extends BaseTestReport {


@Test
    public void product() throws InterruptedException {
    extentTest = extentReports.createTest("US001-testCase04");
    extentTest=extentReports.createTest("product", "urun arttırma ve azaltma dogrulandı");


    US01_TC04_ProductSearch pp = new US01_TC04_ProductSearch();
    //Kullanıcı URL gider
    //Kullanıcı login olur.
    pp.loginSeller();

    //Kullanıcı ürünü arar
    pp.products.click();
    pp.search.sendKeys("Bread" + Keys.ENTER);

    //Kullanıcı arama sonucu listenen ürünleri filtrelemek için Filter butonuna tıklar.
    pp.filter.click();
    pp.clear.click();

    //Kullanıcı filtrelemek istediği kategoriyi seçer.
    pp.filterByCategories("Fruits");

    Driver.closeDriver();



}
}

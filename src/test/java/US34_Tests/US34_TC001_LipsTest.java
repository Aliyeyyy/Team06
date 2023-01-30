package US34_Tests;

import Team06.pages.US034_Pages.US034_TC01_BakeryUrun;
import Team06.utilities.BaseTestReport;
import Team06.utilities.Driver;
import org.junit.Test;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;

import static org.openqa.selenium.Keys.ESCAPE;

public class US34_TC001_LipsTest extends BaseTestReport {


    @Test
    public void test() throws InterruptedException {
        extentTest = extentReports.createTest("US034-testCase01");

        US034_TC01_BakeryUrun ıP = new US034_TC01_BakeryUrun();
        Driver.getDriver().get("https://shop-pickbazar-rest.vercel.app/");

        ıP.searchButton.click();
        ıP.makeupButton.click();

  Actions act =new Actions(Driver.getDriver());
  act.sendKeys(Keys.PAGE_DOWN).perform();
  Thread.sleep(2000);
  act.sendKeys(Keys.PAGE_DOWN).perform();

ıP.urunSec.click();
ıP.urunEkle.click();

        Actions esc = new Actions(Driver.getDriver());
        esc.sendKeys(ESCAPE).perform();  // ürün ekleme penceresini kapattık

ıP.sepet.click();

ıP.urunKontrol.isDisplayed();




    }
}
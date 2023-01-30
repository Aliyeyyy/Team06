package US01_Tests;

import Team06.pages.HomePage;
import Team06.pages.US01_Pages.US01_TC05_ProductEdit;
import Team06.utilities.BaseTestReport;
import Team06.utilities.Driver;
import org.testng.annotations.Test;

public class US01_TC05_ProductEditTest extends BaseTestReport {


    @Test

    public void editproduct() {
        extentTest = extentReports.createTest("US001-testCase05");
      /*
        WebDriver pdriver = Driver.getDriver();

        pdriver.get("https://shop-pickbazar-rest.vercel.app/");



        pr.bsellerBtn.click();

        String homePageWindowHandle = pdriver.getWindowHandle();
        String secondPage = pdriver.getWindowHandle();
        Set<String> wh = pdriver.getWindowHandles();
        for (String each : wh) {
            pdriver.switchTo().window(each);
            if (each.equals(homePageWindowHandle)) {
                pdriver.close();
            }
        }

       */

        //kullanici login olur

        //pr.registerlogin.click();
        // pr.adminlogin.click();


        HomePage hp = new HomePage();

        hp.loginSeller();

        US01_TC05_ProductEdit pr = new US01_TC05_ProductEdit();

        //kullanici product a tiklar

        pr.productBtn.click();

        //kullanici kalembutna tiklar

        pr.kalemBtn.click();

        //kullanici yeni name yazar

        pr.uptname.clear();
        pr.uptname.sendKeys("Avakodo");

        //kullanici update product butonuna tiklar

        pr.updateproductBtn.click();

        //kullanici back butonuna basar

        pr.backBtn.click();

        //kullanici delete butonuna basar

        pr.delete.click();

        //are you sure sayfasinda delete e tikladim

        pr.delete2.click();

        //driveri kapat
        Driver.getDriver().quit();


    }
}
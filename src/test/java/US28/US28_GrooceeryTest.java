package US28;

import Team06.pages.US28_Groceery.Groceery;
import Team06.utilities.BaseTestReport;
import Team06.utilities.Driver;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class US28_GrooceeryTest{
 @Test
    public void test(){
  //   extentTest = extentReports.createTest("US028-testCase01");

     //Kullanıcı URL gider
     Driver.getDriver().get("https://shop-pickbazar-rest.vercel.app/");
     Groceery gP= new Groceery();

     //Kullanıcı ürün fiyatını görür
     System.out.println(gP.prices.size());//30
     for (WebElement e:gP.prices) {
         Assert.assertTrue(e.isDisplayed());
     }
     //Kullanıcı indirim oranını görür
     System.out.println(gP.discount.size());//21
     for (WebElement e:gP.discount) {
         Assert.assertTrue(e.isDisplayed());
     }
     //Kullanıcı ürün ilk fiyatını görür
     System.out.println(gP.previousPrices.size());//21
     for (WebElement e:gP.previousPrices) {
         Assert.assertTrue(e.isDisplayed());
     }


 }

}

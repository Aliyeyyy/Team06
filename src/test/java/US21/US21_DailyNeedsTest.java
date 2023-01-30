package US21;

import Team06.pages.US21_US22_DailyNeedsClasses.BakeryCategory;
import Team06.pages.US21_US22_DailyNeedsClasses.DailyNeeds;
import Team06.utilities.BaseTestReport;
import Team06.utilities.Driver;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class US21_DailyNeedsTest  {
   @Test
    public void priceISDisabled() throws InterruptedException {

       //Kullanıcı URL e gider, login olur

       DailyNeeds dN=new DailyNeeds();
       BakeryCategory bC=new BakeryCategory();
       dN.loginCustomer();

       // Kullanıcı Daily Needs kategorisine gider
       dN.menuBUtton.click();

      //Kullanıcı sepete eklemekm istediği ürünlere gider
      bC.cakeGit();

      //Kullanıcı ürünün fiyatını görmelidir.
      bC.priceIsDisable();

       //Kullanıcı indirim oranını ve indirimli fiyatı görmelidir.
       dN.discountIsDisable();


   }

   @Test(dependsOnMethods = "priceISDisabled")
    public void titleIsDisableTest() {

       DailyNeeds dN=new DailyNeeds();
       BakeryCategory bC=new BakeryCategory();

       //Kullanıcı ürünlerin title ve birimini görmelidir
       dN.pieceAndTitle(bC.pastryCakes);
       Driver.getDriver().quit();
}
    @Test(dependsOnMethods = "priceISDisabled")
    public void islemTest(){

        DailyNeeds dN=new DailyNeeds();
        BakeryCategory bC=new BakeryCategory();

        //Kullanıcı Ürünün sayfasında  gerekli işlemleri yapabilmeli
        bC.cakeIslem();

        //Ürün sayfasında işlem yapıldığı(sepete ekleme)doğrulandı.
        dN.sepetDogrula(bC.pastryCakes);
        Driver.getDriver().quit();
   }

}

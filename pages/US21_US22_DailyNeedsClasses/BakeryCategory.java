package Team06.pages.US21_US22_DailyNeedsClasses;

import Team06.utilities.Driver;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import java.util.List;

public class BakeryCategory {

    public BakeryCategory() {
        PageFactory.initElements(Driver.getDriver(),this);

    }
    DailyNeeds dN=new DailyNeeds();

    @FindBy(xpath = "(//button[text()=\"View More\"])[2]")
    public WebElement cake;

    @FindBy(xpath = "//img[@alt=\"Chuckanut Bay Foods Cheese Cake, 8 oz\"]")//written for bug assert
    public WebElement chesecakeNostocks;

    @FindBy(tagName = "article")
    public List<WebElement> pastryCakes;

    //Cake kategorisindeki ürünler sepete eklenir
  public void cakeIslem() {
      for (WebElement b : pastryCakes) {
          b.click();
          dN.addButton.click();
          Actions act = new Actions(Driver.getDriver());
          act.sendKeys(Keys.ESCAPE).perform();
      }
  }

      //Cake kategorisine gidilir
        public void cakeGit(){
            dN.dNButton.click();dN.bakery.click();cake.click();
        }

        //Kullanıcı ürünlerin fiyatını görür
        public void priceIsDisable() {

            for (WebElement p : dN.prices) {
                Assert.assertTrue(p.isDisplayed());
            }
            Assert.assertEquals(pastryCakes.size(), dN.prices.size());//Her ürünün fiyatı olduğu doğrulandı
        }

  }

package US22;

import Team06.pages.US21_US22_DailyNeedsClasses.DailyNeeds;
import Team06.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;

public class US22_DailyNeedsTest {

    @Test
    public void sepetEklemeTest() throws InterruptedException {

        //Kullanıcı URL e gider

        WebDriver ldriver = Driver.getDriver();

        //Kullanıcı login olur
        DailyNeeds dN=new DailyNeeds();
        dN.loginCustomer();

        // Kullanıcı Daily Needs kategorisine gider
        dN.menuBUtton.click();

       //Kullanıcı sepete eklemekm istediği ürünlere gider
        dN.dNButton.click();
        dN.vegetables.click();
        WebElement categories = ldriver.findElement(By.xpath("(//button[text()=\"View More\"])[1]"));
        categories.click();

        //Kullanıcı ürünleri sepete ekler
        dN.sepeteEkle();

    }

    @Test(dependsOnMethods = {"sepetEklemeTest"})
        public void sepetFiyatıTest() throws InterruptedException {

        WebDriver ldriver = Driver.getDriver();
        //Kullanıcı sepete gider
        DailyNeeds dN=new DailyNeeds();

        //Kullanıcı sepet fiyatını görür.
        Thread.sleep(3000);
        Assert.assertTrue(dN.cartPrice.isDisplayed());

        ldriver.quit();

}
    @Test(dependsOnMethods = {"sepetEklemeTest"})

    public void sepettenSilmeTest() throws InterruptedException {

        WebDriver ldriver = Driver.getDriver();
        DailyNeeds dN=new DailyNeeds();

        //Kullanıcı sepete gider
        dN.cart.click();

        //Kullanıcı sepetteki ürünleri siler
        dN.urunSil();

        //Kullanıcı sepetteki ürünleri sildiğini görür.
        Assert.assertEquals(dN.deletebttn.size(), 0);

        ldriver.quit();
}}








package Team06.pages.US28_Groceery;

import Team06.utilities.Driver;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.ArrayList;
import java.util.List;

public class Groceery  {

    public Groceery() {

        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "//div[@class=\"mb-2 flex items-center\"]")
    public List<WebElement> prices;
    @FindBy(xpath = "//div[@class='absolute top-3 rounded bg-accent px-1.5 text-xs font-semibold leading-6 text-light ltr:right-3 rtl:left-3 sm:px-2 md:top-4 md:px-2.5 ltr:md:right-4 rtl:md:left-4']")
    public   List<WebElement>discount;
    @FindBy(xpath ="//del[@class='text-xs text-muted ltr:ml-2 rtl:mr-2 md:text-sm']" )
    public List<WebElement>previousPrices;

    @FindBy(tagName = "article")
    public List<WebElement> products;

    @FindBy(xpath = "//button[text()=\"Load More\"]")
    public WebElement loadButton;

    @FindBy(xpath = "//li[@class='rounded-md py-1']")
    public
    List<WebElement>categories;

    public void fiyatDogrula() {
        System.out.println(prices.size());//30
        for (WebElement e:prices) {
            Assert.assertTrue(e.isDisplayed());
        }
    }

    public void indirimDogrula(){

        System.out.println(discount.size());//21
        for (WebElement e:discount) {
            Assert.assertTrue(e.isDisplayed());
        }
    }

    public void eskiFiyatDogrrula(){
        System.out.println(previousPrices.size());//21
        for (WebElement e:previousPrices) {
            Assert.assertTrue(e.isDisplayed());
        }
    }

    public void kategorileriDogrula() {
        List<String> catText=new ArrayList<>();
        for (WebElement category :categories) {
            catText.add(category.getText());
        }
        org.testng.Assert.assertTrue(catText.contains("Fruits & Vegetables"));
        org.testng.Assert.assertTrue(catText.contains("Meat & Fish"));
        org.testng.Assert.assertTrue(catText.contains("Snacks"));
        org.testng.Assert.assertTrue(catText.contains("Pet Care"));
        org.testng.Assert.assertTrue(catText.contains("Home & Cleaning"));
        org.testng.Assert.assertTrue(catText.contains("Dairy"));
        org.testng.Assert.assertTrue(catText.contains("Cooking"));
        org.testng.Assert.assertTrue(catText.contains("Breakfast"));
        org.testng.Assert.assertTrue(catText.contains("Beverage"));
        org.testng.Assert.assertTrue(catText.contains("Health & Beauty"));
    }

    public void gorunenUrun(){

        org.testng.Assert.assertEquals(products.size(),30);
        System.out.println(products.size());//30
    }
    public void loadBttnclick() throws InterruptedException {
        loadButton.click();
        Thread.sleep(3000);
        org.testng.Assert.assertNotEquals(products.size(),30);
        System.out.println(products.size());//60
    }
}

package Team06.pages.US21_US22_DailyNeedsClasses;

import Team06.pages.AbstactClass;
import Team06.utilities.Driver;
import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;

import java.io.File;
import java.io.IOException;
import java.util.List;

public class DailyNeeds extends AbstactClass {

    public DailyNeeds() {
        PageFactory.initElements(Driver.getDriver(),this);
    }

  @FindBy(xpath = "(//div[@class='relative inline-block ltr:text-left rtl:text-right'])[1]")
  public WebElement menuBUtton;
  @FindBy(xpath = "//a[@href=\"/daily-needs\"]")
  public WebElement dNButton;

  @FindBy(css = ".hidden.product-cart")
  public WebElement cart;
  @FindBy(xpath = "/html/body/reach-portal/div/aside/div/div[2]/div/div/div/div[4]/div/div/section/footer/button/span[2]")
  public WebElement cartPrice;
  @FindBy(xpath = "//button[@class='flex h-7 w-7 shrink-0 items-center justify-center rounded-full text-muted transition-all duration-200 hover:bg-gray-100 hover:text-red-600 focus:bg-gray-100 focus:text-red-600 focus:outline-none ltr:ml-3 ltr:-mr-2 rtl:mr-3 rtl:-ml-2']")
  public List<WebElement> deletebttn;


  //ürüne tıklandıktan sonra sepete gidilir
  public void urundenSepeteGit(){
    Actions act=new Actions(Driver.getDriver());
    act.sendKeys(Keys.ESCAPE).perform();
    cart.click();

  }

  public void sepeteEkle() throws InterruptedException {
    List<WebElement>productAdd = Driver.getDriver().findElements(By.xpath("//span[@class=\"flex-1\"]"));
    Thread.sleep(   6000);
    for (WebElement ekle :productAdd) {
      ekle.click();
      Thread.sleep(   1000);}

  }



  //Kullanıcı ürünlerin sepete eklendiğini doğrular
  public void sepetDogrula(List<WebElement>products){
    cart.click();
    Assert.assertEquals(products.size(), deletebttn.size());}


  //sepetten ürünler silinir
  public void urunSil() throws InterruptedException {
    for (WebElement pd : deletebttn) {
      Thread.sleep( 2000);
      pd.click();
  }}

  //kullanıcı stokta olmayan ürünü sepette sayısının 1 olduğunu görür

    public void outOfStockEklendimi() {
      SoftAssert softAssert = new SoftAssert();
      softAssert.assertNotEquals(deletebttn.size(), 1);
      softAssert.assertAll();
    }

    public void discountIsDisable() {
      for (WebElement d : discount) {
        Assert.assertTrue(d.isDisplayed());
      }
      Assert.assertEquals(discount.size(), previousPrices.size());//indirim uygulanan her ürünün
      // önceki fiyatı görüldüğü doğrulandı
    }


    public void pieceAndTitle(List<WebElement>products){

      for (WebElement b: products) {
        b.click();
        //Kullanıcı ürünlerin birimini görür.
        Assert.assertTrue(piece.isDisplayed());
        //Kullanıcı İlglii ürün açıklaması ve title ı görür.
        Assert.assertTrue(title1.isDisplayed());

        Actions act=new Actions(Driver.getDriver());
        act.sendKeys(Keys.ESCAPE).perform();
      }
    }




  @FindBy(xpath = "//div[@class=\"mb-2 flex items-center\"]")
  public  List<WebElement>prices;
  @FindBy(xpath = "//div[@class='absolute top-3 rounded bg-accent px-1.5 text-xs font-semibold leading-6 text-light ltr:right-3 rtl:left-3 sm:px-2 md:top-4 md:px-2.5 ltr:md:right-4 rtl:md:left-4']")
  public   List<WebElement>discount;
  @FindBy(xpath ="//del[@class='text-xs text-muted ltr:ml-2 rtl:mr-2 md:text-sm']" )
  public List<WebElement>previousPrices;

  @FindBy(xpath = "//h1[@class='text-lg font-semibold tracking-tight text-heading md:text-xl xl:text-2xl cursor-pointer transition-colors hover:text-accent']")
  public WebElement title1;
  @FindBy(xpath = "//span[@class='block text-sm font-normal text-body']")
  public WebElement piece;
  @FindBy(xpath = "//div[@class='mb-3 w-full lg:mb-0 lg:max-w-[400px]']")
  public WebElement addButton;
  @FindBy(xpath = "//span[text()=\"Add To Shopping Cart\"]")
  public WebElement addNostocks;


  @FindBy(xpath ="//h3[text()=\"Vegetables\"]")
  public WebElement vegetables;
  @FindBy(xpath ="//h3[text()=\"Meat\"]")
  public WebElement meat;
  @FindBy(xpath ="//h3[text()=\"Bakery\"]")
  public WebElement bakery;
  @FindBy(xpath ="//h3[text()=\"Dairy & Eggs\"]")
  public WebElement dairyEggs;


  //screenshot
  public void screenShot() throws InterruptedException, IOException {
    Thread.sleep(3000);
    File kaynak = ((TakesScreenshot)Driver.getDriver()).getScreenshotAs(OutputType.FILE);
    FileHandler.copy(kaynak, new File("src/test/java/Team06/tests/US21/screen.png"));

  }

}
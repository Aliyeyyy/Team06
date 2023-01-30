package Team06.pages.US034_Pages;

import Team06.utilities.Driver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class US034_TC01_BakeryUrun {

    WebDriver driver = Driver.getDriver();

    public US034_TC01_BakeryUrun() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "(//div/button)[1]")
    public WebElement searchButton;
    @FindBy(xpath = "(//span[@class='flex h-5 w-5 items-center justify-center'])[2]")
    public WebElement makeupButton;

    @FindBy(xpath = "//img[@alt=\"Pressed Juicery Super Citrus Plus, 200ml\"]")
    public WebElement urunSec;

   //@FindBy(xpath = "(//button[@class=\"flex w-full items-center justify-center rounded bg-accent py-4 px-5 text-sm font-light text-light transition-colors duration-300 hover:bg-accent-hover focus:bg-accent-hover focus:outline-none lg:text-base\"])[2]")
   //public WebElement urunEkle;
   @FindBy(xpath = "(//button[@class=\"flex w-full items-center justify-center rounded bg-accent py-4 px-5 text-sm font-light text-light transition-colors duration-300 hover:bg-accent-hover focus:bg-accent-hover focus:outline-none lg:text-base\"])[2]")
   public WebElement urunEkle;



    @FindBy(css = ".hidden.product-cart")
    public WebElement sepet;

    @FindBy(xpath = "//p[@class=\"my-2.5 font-semibold text-accent\"]")
    public WebElement urunKontrol;
}

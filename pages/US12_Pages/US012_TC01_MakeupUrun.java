package Team06.pages.US12_Pages;

import Team06.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class US012_TC01_MakeupUrun {

    WebDriver driver = Driver.getDriver();

    public US012_TC01_MakeupUrun() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "(//div/button)[1]")
    public WebElement searchButton;
    @FindBy(xpath = "(//span[@class='flex h-5 w-5 items-center justify-center'])[3]")
    public WebElement makeupButton;

    @FindBy(xpath = "//img[@alt=\"Beauty Pressed Finishing Powder\"]")
    public WebElement faceurun;

    @FindBy(xpath = "(//button[@class=\"flex w-full items-center justify-center rounded bg-accent py-4 px-5 text-sm font-light text-light transition-colors duration-300 hover:bg-accent-hover focus:bg-accent-hover focus:outline-none lg:text-base\"])[2]")
    public WebElement faceUrunSec;

    @FindBy(xpath = "(//button[@class=\"cursor-pointer p-2 transition-colors duration-200 hover:bg-accent-hover focus:outline-none px-5\"])[4]")
    public WebElement faceStokKadarUrunEkle;

    @FindBy(xpath = "(//button[@class=\"cursor-pointer p-2 transition-colors duration-200 hover:bg-accent-hover focus:outline-none px-5\"])[3]")
    public WebElement stoktanUrunAzalt;

    @FindBy(css = ".hidden.product-cart")
    public WebElement sepet;


    @FindBy(xpath = "(//button[contains(@class,'cursor') and .='minus'])[2]")
    public WebElement sepetteUrunAzalt;

    @FindBy(xpath = "(//button[contains(@class,'cursor') and .='plus'])[2]")
    public WebElement sepetteUrunArttır;


    @FindBy(xpath = "//p[@class=\"my-2.5 font-semibold text-accent\"]")
    public WebElement urunBirimFiyat;

    @FindBy(xpath = "//span[@class=\"font-bold text-heading ltr:ml-auto rtl:mr-auto\"]")
    public WebElement urunToplamFiyat;


    @FindBy(xpath = "(//button[@class=\"flex w-full items-center py-2 font-semibold text-body-dark outline-none transition-all ease-in-expo  focus:text-accent focus:outline-none focus:ring-0 ltr:text-left rtl:text-right text-accent text-sm\"])[2]")
    public WebElement eyesButton;





}
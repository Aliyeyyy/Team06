package Team06.pages.US05_Pages;

import Team06.pages.AbstactClass;
import Team06.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;

public class US05_TC01_ShopsVisit extends AbstactClass {



    public US05_TC01_ShopsVisit(){


        PageFactory.initElements(Driver.getDriver(),this);
    }
    @FindBy(xpath = "//a[text()='Shops']")
    public WebElement shops;
    @FindAll({
            @FindBy(xpath = "//span[text()='Furniture Shop']"),
            @FindBy(xpath = "//span[text()='Clothing Shop']"),
            @FindBy(xpath = "//span[text()='Bags Shop']"),
            @FindBy(xpath = "//span[text()='Makeup Shop']"),
            @FindBy(xpath = "//span[text()='Bakery Shop']"),
            @FindBy(xpath = "//span[text()='Grocery Shop']"),
            @FindBy(xpath = "//span[text()='Books Shop']")
    })
    public List<WebElement> shopsCenter;
    @FindBy(xpath = "//span[text()='Furniture Shop']")
    public WebElement furnitureShop;
    @FindAll({
            @FindBy(xpath = "//span[text()='Address']"),
            @FindBy(xpath = "//span[text()='Phone']"),
            @FindBy(xpath = "//span[text()='Website']")
    })
    public List<WebElement> information;
    @FindBy(xpath = "//span[text()='Books Shop']")
    public WebElement booksShop;
    @FindBy(xpath = "//h3[text()='Grey Fir Double Bed']")
    public WebElement sofa;
    @FindBy(xpath = "//span[text()='Add To Shopping Cart']")
    public WebElement addToCart;
    @FindBy(xpath = "(//button[@class='cursor-pointer p-2 transition-colors duration-200 hover:bg-accent-hover focus:outline-none hover:!bg-gray-100'])[2]")
    public WebElement plus;

    @FindBy(xpath = "(//div[text()='1'])[2]")
    public WebElement increase;
    @FindBy(xpath = "(//div[text()='2'])[2]")
    public WebElement increaseTrue;
    @FindBy(xpath = "//span[text()='1 Item']")
    public WebElement item;
    @FindBy(xpath = "//span[text()='Checkout']")
    public WebElement checkout;
    @FindBy(xpath = "(//button[@class='cursor-pointer p-2 transition-colors duration-200 hover:bg-accent-hover focus:outline-none hover:!bg-gray-100'])[1]")
    public WebElement reduce;

    @FindBy(xpath = "/html/body/reach-portal/div/aside/div/div[2]/div/div/div/div[4]/div/div/section/div/div/div[1]/div/div")
    public WebElement reduceTrue;
    @FindBy(xpath ="//button[text()='Check Availability']")
    public WebElement checkAvailability;
    @FindBy(xpath ="//button[text()='Place Order']")
    public WebElement placeOrder;
    @FindBy(xpath = "//button[text()='Pay']")
    public WebElement pay;
    @FindBy(xpath = "//span[text()='Payment Success']")
    public WebElement paySuccess;
    @FindBy(xpath = "//img[@alt='user name']")
    public WebElement userAvatar;
    @FindBy(xpath = "//button[text()='Logout']")
    public WebElement logout;
    @FindBy(xpath = "//button[text()='Login']")
    public WebElement login;

    @FindBy(xpath = "//h3[text()='Ash Double Bed']")
    public WebElement doubleBed;

    @FindBy(xpath = "//span[text()='Unavailable']")
    public WebElement unavailable;

    public static WebElement waitForClickablility(WebElement element, int timeout) {
        WebDriverWait wait = new WebDriverWait(Driver.getDriver(), Duration.ofSeconds(timeout));
        return wait.until(ExpectedConditions.elementToBeClickable(element));
    }









}

package Team06.pages.US04_Pages;

import Team06.pages.AbstactClass;
import Team06.utilities.Driver;
import org.bouncycastle.crypto.params.X25519PrivateKeyParameters;
import org.bouncycastle.crypto.params.X448PrivateKeyParameters;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.locators.RelativeLocator;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class US004_Offers extends AbstactClass {


    public US004_Offers(){

        PageFactory.initElements(Driver.getDriver(),this);

    }


    @FindBy(xpath = "//*[@id=\"__next\"]/div/div[1]/header/div/ul/div/li/button")
    public WebElement joinButton;

    @FindBy(xpath = "(//button[@data-variant='normal'])[3]")
    public WebElement loginButton;

    @FindBy(xpath = "(//div[@class='relative inline-block ltr:text-left rtl:text-right'])[1]")
    public WebElement menuBUtton;

    @FindBy(xpath = "//*[@id=\"headlessui-menu-item-14\"]/a/span[2]")
    public WebElement bagsButton;

    @FindBy(xpath ="//*[@id=\"__next\"]/div/div[1]/div[1]/div[4]/div/div/article[14]/header/div/button")
    public WebElement cart;

    @FindBy(xpath = "//*[@id=\"__next\"]/div/div[1]/header/div/ul/li[2]/a")
    public WebElement offers;

    @FindBy(xpath = "//*[@id=\"__next\"]/div/div[1]/div[1]/div/div[6]/div[2]/button")
    public WebElement copy;


    @FindBy(xpath = "//*[@id=\"__next\"]/div/div[1]/button/span[1]/span")
    public WebElement basket;

    @FindBy(xpath = "/html/body/reach-portal/div/aside/div/div[2]/div/div/div/div[4]/div/div/section/footer/button/span[1]")
    public WebElement checkout;

    @FindBy(xpath = "//button[@data-variant='normal']")
    public WebElement checkAvailability;


   @FindBy(xpath ="//p[@role='button']")
   public WebElement coupon;


    @FindBy(id="code")
    public WebElement enterCoupon;

    @FindBy(xpath = "(//button[@data-variant='normal'])[1]")
    public  WebElement apply;

    @FindBy(xpath = "(//button[@data-variant='normal'])[2]")
    public  WebElement placeOrder;

    @FindBy(xpath = "//*[@id=\"headlessui-dialog-panel-49\"]/div/div[3]/button")
    public WebElement payButton;








}

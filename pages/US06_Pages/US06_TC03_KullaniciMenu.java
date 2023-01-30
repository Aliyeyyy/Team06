package Team06.pages.US06_Pages;

import Team06.pages.AbstactClass;
import Team06.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class US06_TC03_KullaniciMenu extends AbstactClass {

    public US06_TC03_KullaniciMenu(){
        PageFactory.initElements(Driver.getDriver(),this);

    }
    @FindBy(xpath = "//img[@alt='user name']")
    public WebElement userImage;

    @FindAll({
            @FindBy(xpath = "//button[text()='Profile']"),
            @FindBy(xpath = "//button[text()='My Orders']"),
            @FindBy(xpath = "//button[text()='My Wishlists']"),
            @FindBy(xpath = "//button[text()='Checkout']"),
            @FindBy(xpath = "//button[text()='Logout']")

    })
    public List<WebElement> allMenuItems;

    @FindBy(xpath = "//button[text()='Profile']")
    public WebElement profile;

    @FindBy(xpath = "//button[text()='My Orders']")
    public WebElement myOrders;

    @FindBy(xpath = "//button[text()='My Wishlists']")
    public WebElement myWishlists;

    @FindBy(xpath = "//button[text()='Checkout']")
    public WebElement checkout;

    @FindBy(xpath = "//a[text()='Profile']")
    public WebElement profileTrue;
    @FindBy(xpath = "//h3[text()='My Orders']")
    public WebElement myOrdersTrue;

    @FindBy(xpath = "//h1[text()='My Wishlists']")
    public WebElement myWishlistsTrue;

    @FindBy(xpath = "//span[text()='Your Order']")
    public WebElement yourOrder;

    @FindBy(xpath = "//button[text()='Logout']")
    public WebElement logout;

    @FindBy(xpath = "//p[text()='Login with your email & password']")
    public WebElement loginWithEmailAndPassword;





}

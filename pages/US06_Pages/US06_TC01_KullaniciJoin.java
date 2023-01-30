package Team06.pages.US06_Pages;

import Team06.pages.AbstactClass;
import Team06.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class US06_TC01_KullaniciJoin extends AbstactClass {

    public US06_TC01_KullaniciJoin(){
        PageFactory.initElements(Driver.getDriver(),this);
    }
    @FindBy(xpath = "//img[@alt='user name']")
    public WebElement userImage;

    @FindBy(id="email")
    public WebElement emaillocate;

    @FindBy(id="password")
    public WebElement password;

    @FindBy(xpath = "//button[text()='Login']")
    public WebElement login;

    @FindBy(xpath = "//button[text()='Join']")
    public WebElement join;

    @FindBy(xpath = "//*[text()='The credentials was wrong!']")
    public WebElement noEnteredPage;

    @FindBy(xpath = "//button[text()='Forgot password?']")
    public WebElement forgotPassword;

}

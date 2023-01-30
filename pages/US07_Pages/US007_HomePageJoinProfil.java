package Team06.pages.US07_Pages;

import Team06.pages.AbstactClass;
import Team06.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class US007_HomePageJoinProfil extends AbstactClass {

    public US007_HomePageJoinProfil(){

        PageFactory.initElements(Driver.getDriver(),this);

    }

    @FindBy(xpath = "//img[@alt='user name']")
    public WebElement hesabim;
    @FindBy(id ="headlessui-menu-item-12")
    public WebElement profilim;

    @FindBy(id = "name")
    public WebElement name;

    @FindBy(id ="profile.bio")
    public WebElement bio;

    @FindBy(xpath = "//button[@data-variant='normal']")
    public WebElement saveButton;

    @FindBy(xpath = "//a[@href='/change-password']")
    public WebElement changePassword;

    @FindBy(id = "oldPassword")
    public WebElement oldPassword;

    @FindBy(id = "newPassword")
    public WebElement newPassword;

    @FindBy(id = "passwordConfirmation")
    public WebElement confirmPassword;

    @FindBy(xpath = "//*[@id=\"__next\"]/div/div[1]/div[1]/div/form/button")
    public WebElement submitButton;

    @FindBy(xpath ="//a[@href='/orders']")
    public WebElement myOrders;

    @FindBy(xpath ="//a[@href='/wishlists']")
    public WebElement myWishlists;
    @FindBy(xpath = "//*[@id=\"__next\"]/div/div[1]/div[1]/div/div/div[2]/div[2]/div[2]/div/button[2]")
    public WebElement remove;

    @FindBy(xpath = "//*[@id=\"__next\"]/div/div[1]/div[1]/aside/div[2]/ul[2]/li/button")
    public WebElement logout;


}
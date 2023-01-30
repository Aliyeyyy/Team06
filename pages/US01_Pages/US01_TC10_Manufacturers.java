package Team06.pages.US01_Pages;

import Team06.pages.AbstactClass;
import Team06.utilities.Driver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class US01_TC10_Manufacturers extends AbstactClass {

    WebDriver driver = Driver.getDriver();

    public US01_TC10_Manufacturers() {

        PageFactory.initElements(Driver.getDriver(), this);

    }
    //3
    @FindBy(linkText = "Manufacturers/Publications")
    public WebElement Manufacturers;

    //4
    @FindBy(xpath = "//a[@href=\"/manufacturers/create\"]")
    public WebElement create;

    //5
    // @FindBy(xpath = "(//div[@tabindex=\"0\"])[1]")
    // public WebElement logo1;

    //6


    //7
    @FindBy(xpath = "//input[@id=\"name\"]")
    public WebElement name;

    //8
    @FindBy(xpath = "//input[@id=\"website\"]")
    public WebElement website;

    //9
    @FindBy(xpath = "//textarea[@id=\"description\"]")
    public WebElement description;

    //10
    @FindBy(xpath = "//div[@class=\" css-7nmaqj-singleValue\"]")
    public WebElement Group;



    //11a
    @FindBy(xpath = "(//button[@data-variant=\"normal\"])[1]")
    public WebElement SocialEkleButon;

//11b

    @FindBy(xpath = "(//button[@data-variant=\"normal\"])[2]")
    public WebElement socialEkle;

//11c

    @FindBy(xpath = "//input[@id=\"socials.0.url\"]")
    public WebElement profilUrl;


    //
    //12
    @FindBy(xpath = "(//button[@data-variant=\"normal\"])[2]")
    public WebElement addManufacturers;

    //13
    @FindBy(xpath = "//button[@id=\"headlessui-switch-11\"]")
    public WebElement onay;





}
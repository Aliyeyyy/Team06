package Team06.pages.US01_Pages;

import Team06.pages.AbstactClass;
import Team06.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class US01_TC06_GroupEdit extends AbstactClass {
    public US01_TC06_GroupEdit() {

        PageFactory.initElements(Driver.getDriver(), this);

    }

    @FindBy(xpath = "//a[@class='text-start flex w-full items-center text-base text-body-dark focus:text-accent'][6]")
    public WebElement groupBtn;

    @FindBy(xpath = "//span[@class='block md:hidden xl:block']")
    public WebElement addGroupbtn;


    @FindBy(id ="name")
    public WebElement firstname;

    @FindBy(xpath = "//div[@class='css-1unz2q6-indicatorContainer']")
    public WebElement icon;

    @FindBy(xpath = "//span[.='Standard']")
    public WebElement layout;

    @FindBy(xpath = "//span[.='Argon']")
    public WebElement card;

    @FindBy(xpath = "//button[.='Add Banner']")
    public WebElement addBanner;

    @FindBy(id = "banners.0.title")
    public WebElement title;


    @FindBy(id = "banners.0.description")
    public WebElement description;


    @FindBy(xpath = "//button[.='Add Group']")
    public WebElement AddGroup;

    @FindBy(xpath = "//div[@class='css-b62m3t-container']")
    public WebElement filterByGroup;
    @FindBy(xpath = "//span[@class='whitespace-nowrap']")
    public WebElement kontrol;


    @FindBy(xpath = "//button[.='Update Group']")
    public WebElement updategroup;



    @FindBy(xpath = "//button[@data-variant='outline']")
    public WebElement back;

    @FindBy(xpath = "(//a[@class='text-base transition duration-200 hover:text-heading'])[1]")
    public WebElement kalem;

}

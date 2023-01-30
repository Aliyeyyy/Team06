package Team06.pages.US01_Pages;

import Team06.pages.AbstactClass;
import Team06.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class US01_TC05_ProductEdit  {
    public US01_TC05_ProductEdit() {

        PageFactory.initElements(Driver.getDriver(),this);

    }

    @FindBy(linkText = "Become a Seller")
    public WebElement bsellerBtn;

    @FindBy(xpath = "//*[@id=\"__next\"]/div/div[1]/div/div[3]/a")
    public WebElement registerlogin;

    @FindBy(xpath = "//button[@data-variant='normal']")
    public WebElement adminlogin;

    @FindBy(xpath = "//a[@class='text-start flex w-full items-center text-base text-body-dark focus:text-accent'][4]")
    public WebElement productBtn;


    @FindBy(xpath = "//a[@class='text-base transition duration-200 hover:text-heading'][1]")
    public WebElement kalemBtn;


    @FindBy(xpath="//input[@id='name']")
    public WebElement uptname;

    @FindBy(xpath = "//button[@data-variant='normal']")
    public WebElement updateproductBtn;

    @FindBy(xpath = "//button[@data-variant='outline']")
    public WebElement backBtn;


    @FindBy(xpath = "//button[@title='Delete'][1]")
    public WebElement delete;

    @FindBy(xpath = "//*[@id=\"headlessui-dialog-6\"]/div/div[2]/div/div/div/div/div[2]/button")
    public WebElement delete2;
}

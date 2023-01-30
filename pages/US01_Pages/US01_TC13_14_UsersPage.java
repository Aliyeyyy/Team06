package Team06.pages.US01_Pages;
import Team06.pages.AbstactClass;
import Team06.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class US01_TC13_14_UsersPage extends AbstactClass {

    public US01_TC13_14_UsersPage() {

        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//span[text()='Users']")
    public WebElement UsersButton;

    @FindBy(xpath = "//span[text()='Add Customer']")
    public WebElement customerButton;

    @FindBy(id = "name")
    public WebElement name;

    @FindBy(id = "email")
    public WebElement email;

    @FindBy(id = "password")
    public WebElement password;
    // create customer kayıt butonu
    @FindBy(xpath = "//button[text()='Create Customer']")
    public WebElement createCustomer;
    //müşteri ismi
    @FindBy(xpath = "//*[text()='fatih16']")
    public WebElement fatih16;
    //userassing locator
    @FindBy(xpath = "//button[@title='Assign Or Revoke Admin Permission '][1]")
    public WebElement userassign;

    @FindBy(xpath = "//button[text()='Yes']")
    public WebElement userassignYes;

    @FindBy(xpath = "//*[@id=\"__next\"]/div/div[1]/div/main/div/div[2]/div/div/div/table/tbody/tr[2]/td[6]")
    public WebElement active;
    @FindBy(xpath = "//*[@id=\"__next\"]/div/div[1]/div/main/div/div[2]/div/div/div/table/tbody/tr[2]/td[7]/div/button[2]")
    public WebElement walletPoint;
    @FindBy(id = "points")
    public WebElement addPoint;
    @FindBy(xpath = "//*[@id=\"headlessui-dialog-9\"]/div/div[2]/form/div/button")
    public WebElement submintPoint;
    @FindBy(xpath = "//*[@id=\"__next\"]/div/div[1]/div/main/div/div[2]/div/div/div/table/tbody/tr[2]/td[5]")
    public WebElement addPointup;
}
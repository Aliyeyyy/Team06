package Team06.pages;

import Team06.utilities.Driver;
import org.checkerframework.checker.units.qual.C;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class CreateShop extends AbstactClass{



    public CreateShop(){

        PageFactory.initElements(Driver.getDriver(),this);
}


    @FindBy(xpath = "(//input[@accept=\"image/*\"])[1]")
    public WebElement logo;

    @FindBy(xpath = "(//div[@role=\"button\"])[2]")
    public WebElement image;
    @FindBy(id="name")
    public WebElement name;
    @FindBy(id="description")
    public WebElement description;
    @FindBy(id="balance.payment_info.name")
    public WebElement accountName;
    @FindBy(id="balance.payment_info.email")
    public WebElement accountEmail;
    @FindBy(id="balance.payment_info.bank")
    public WebElement bankName;
    @FindBy(id="balance.payment_info.account")
    public WebElement accountNo;
    @FindBy(id="address.country")
    public WebElement country;
    @FindBy(id="address.city")
    public WebElement city;
    @FindBy(id="address.state")
    public WebElement state;
    @FindBy(id="address.zip")
    public WebElement zip;
    @FindBy(id="address.street_address")
    public  WebElement streetAddress;
    @FindBy(xpath = "//*[@id=\"__next\"]/div/div[1]/div/main/div/form/div[6]/div[2]/div[1]/div/input")
    public WebElement location;
    @FindBy(id="settings.contact")
    public WebElement contactNo;
    @FindBy(id="settings.website")
    public WebElement website;

    @FindBy(xpath = "//*[@id=\"__next\"]/div/div[1]/div/main/div/form/div[6]/div[2]/button")
    public WebElement add;
    @FindBy(linkText ="Save")
    public WebElement save;





}


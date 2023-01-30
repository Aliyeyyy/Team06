package Team06.pages.US01_Pages;

import Team06.pages.AbstactClass;
import Team06.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class US01_TC16_Taxes extends AbstactClass {

    public US01_TC16_Taxes(){

        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath ="//span[contains(text(),'Taxes')]")
    public WebElement taxesButton;

    @FindBy(xpath = "//*[@id=\"__next\"]/div/div[1]/div/main/div/div[2]/div/div/div/table/tbody/tr[2]/td[8]/div/a")
    public WebElement editButton;
    @FindBy(id="name")
    public WebElement name;
    @FindBy(id="rate")
    public WebElement rate;
    @FindBy(id="country")
    public WebElement country;
    @FindBy(id="city")
    public WebElement city;
    @FindBy(id="state")
    public WebElement state;
    @FindBy(id="zip")
    public WebElement zip;
    @FindBy(xpath = "//button[@data-variant='normal']")
    public WebElement updateButton;
    @FindBy(xpath = "//button[@data-variant='outline']")
    public WebElement backButton;

    @FindBy(xpath ="//*[@id=\"__next\"]/div/div[1]/div/main/div/div[2]/div/div/div/table/tbody/tr[2]/td[8]/div/button")
    public WebElement deleteButton;

    @FindBy(xpath ="(//button[@data-variant='custom'])[2]")
    public WebElement deleteButton2;

}
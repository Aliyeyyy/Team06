package Team06.pages.US01_Pages;

import Team06.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class US01_TC17_Shippings {

    public US01_TC17_Shippings() {
        PageFactory.initElements(Driver.getDriver(), this);
    }
    @FindBy(xpath = "//span[contains(text(),'Shippings')]")
    public WebElement shippingsButton;
    @FindBy(linkText = "+ Add Shipping")
    public WebElement addShippingsButton;
    @FindBy(id = "name")
    public WebElement shippingName;
    @FindBy(xpath = "//label[@for='FREE']")
    public WebElement free;
    @FindBy(xpath = "//label[@for='FIXED']")
    public WebElement fixed;
    @FindBy(xpath = "//label[@for='PERCENTAGE']")
    public WebElement percentage;
    @FindBy(xpath = "//input[@id='amount']")
    public WebElement amount;
    @FindBy(xpath = "//button[@data-variant='normal']")
    public WebElement addShipping;

}

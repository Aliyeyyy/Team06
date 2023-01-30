package Team06.pages.US08_Pages;

import Team06.pages.AbstactClass;
import Team06.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class US008_HomePage extends AbstactClass {

    public US008_HomePage(){

        PageFactory.initElements(Driver.getDriver(),this);

    }


    @FindBy(xpath = "(//div[@class='relative inline-block ltr:text-left rtl:text-right'])[1]")
    public WebElement menuBUtton;

    @FindBy(xpath = "//a[@href=\"/bakery\"]")
    public WebElement bakeryButton;

    @FindBy(xpath = "//a[@href=\"/makeup\"]")
    public WebElement makeUpButton;

    @FindBy(xpath = "//a[@href=\"/bags\"]")
    public WebElement bagsButton;

    @FindBy(xpath = "//a[@href=\"/clothing\"]")
    public WebElement clothingButton;

    @FindBy(xpath = "//a[@href=\"/furniture\"]")
    public WebElement furnitureButton;

    @FindBy(xpath = "//a[@href=\"/daily-needs\"]")
    public WebElement dNButton;

   // @FindBy(xpath = "//div[@role='menuitem']")
    //public List<WebElement> menuItems;
}

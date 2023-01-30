package Team06.pages.US14_Pages;

import Team06.pages.AbstactClass;
import Team06.utilities.Driver;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class US14_BagsSearchPage extends AbstactClass {

    public WebDriver driver = Driver.getDriver();
    public US14_BagsSearchPage() {PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(id = "headlessui-menu-button-1")
    public WebElement groceryDropdown;
    @FindBy(xpath = "//a[@href='/bags']")
    public WebElement grocerybag;
    @FindBy(id = "search")
    public WebElement searchBag;
    public void searchItem(String value){
        searchBag.sendKeys(value + Keys.ENTER);}

    @FindBy(xpath = "//*[text()='Sorry, No Product Found :(']")
    public WebElement productFound;
    @FindBy(xpath = "//*[@id=\"__next\"]/div/div[1]/div[1]/div[4]/div/div/article[1]/header")
    public WebElement bagsDogrulama;
}

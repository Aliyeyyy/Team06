package Team06.pages.US9_Pages;

import Team06.pages.AbstactClass;
import Team06.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class US09_TC01_MakeUpSearch extends AbstactClass {

    public US09_TC01_MakeUpSearch() {

        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath="(//div[@class='relative inline-block ltr:text-left rtl:text-right'])[1]")
    public WebElement menuBTn;
    public void menubuton(){

        wait.until(ExpectedConditions.elementToBeClickable(menuBTn)).click();
    }

    @FindBy(xpath = "//a[@href='/makeup']")
    public WebElement makeup;

    @FindBy(xpath = "//input[@placeholder='Search your products from here']")
    public WebElement searchBtn;







}

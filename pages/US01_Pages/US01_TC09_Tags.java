package Team06.pages.US01_Pages;

import Team06.pages.AbstactClass;
import Team06.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class US01_TC09_Tags extends AbstactClass {

    WebDriver driver = Driver.getDriver();

    public US01_TC09_Tags() {

        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(linkText = "Tags")
    public WebElement Tags;


    @FindBy(xpath = "//a[@href=\"/tags/create\"]")
    public WebElement Add;





    @FindBy(xpath = "//input[@id=\"name\"]")
    public WebElement name;


    @FindBy(xpath = "//textarea[@id=\"details\"]")
    public WebElement details;




    @FindBy(xpath = "//button[@data-variant=\"normal\"]")
    public WebElement addTag;

    //11
    @FindBy(xpath = "(//a[@class=\"text-base transition duration-200 hover:text-heading\"])[1]")
    public WebElement duzentButon;

    //12
    @FindBy(xpath = "//input[@id=\"name\"]")
    public WebElement güncelName;

    //13
    @FindBy(xpath = "//button[@data-variant=\"normal\"]")
    public WebElement updateTag;


    @FindBy(linkText = "Tags")
    public WebElement Tags1;

    @FindBy(xpath = "(//button[@title=\"Delete\"])[1]")
    public WebElement silButon;

    @FindBy(xpath = "(//button[@data-variant=\"custom\"])[2]")
    public WebElement Delete;
    public void addCategories(String menu,WebElement element){
        wait.until(ExpectedConditions.visibilityOf(element)).click();
        element.findElement(By.xpath("//*[.='"+menu+"']")).click();


    }

}

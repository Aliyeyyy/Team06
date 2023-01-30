package Team06.pages.US01_Pages;
import Team06.pages.AbstactClass;
import Team06.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;



public class US01_TC19_Reviews extends AbstactClass {

    public US01_TC19_Reviews() {

        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(linkText="Reviews")
    public WebElement reviews;

    @FindBy(xpath = "//p[@class=\"text-sm leading-6 text-heading\"]")
    public List<WebElement> comments;

    @FindBy(xpath = "//div[@class=\\\"mt-3 flex items-center space-x-4\\\"]")
    public List<WebElement>comInf;

    @FindBy (xpath = "//a[@rel=\"nofollow\"]")

    public List<WebElement>pages;


}

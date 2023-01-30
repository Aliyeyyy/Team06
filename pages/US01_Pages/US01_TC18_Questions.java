package Team06.pages.US01_Pages;

import Team06.pages.AbstactClass;
import Team06.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class US01_TC18_Questions extends AbstactClass {

    public US01_TC18_Questions(){

        PageFactory.initElements(Driver.getDriver(),this);
    }


    @FindBy(xpath ="//span[contains(text(),'Questions')]")
    public WebElement questionsButton;

    @FindBy(xpath ="//*[@id=\"__next\"]/div/div[1]/div/main/div/div[2]/div/div/div/table/tbody/tr[2]/td[7]/div/button[1]")
    public WebElement deleteButton;

    @FindBy(xpath ="(//button[@data-variant='custom'])[2]")
    public WebElement deleteButton2;
}

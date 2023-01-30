package Team06.pages.US01_Pages;

import Team06.pages.AbstactClass;
import Team06.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class US01_TC04_ProductSearch extends AbstactClass {
    WebDriver driver=Driver.getDriver();
    public US01_TC04_ProductSearch(){

        PageFactory.initElements(Driver.getDriver(),this);
    }


    @FindBy(xpath = "//span[text()='Products']")
    public WebElement products;
    @FindBy(id = "search")
    public WebElement search;
    @FindBy(xpath = "//*[@id=\"__next\"]/div/div[1]/div/main/div/div[1]/div[1]/button")
    public WebElement filter;
    @FindBy(xpath = "(//button[@type='button'])[2]")
    public WebElement clear;
    @FindBy(xpath = "(//div[@class=' css-ackcql'])[1]")
    public WebElement filterByGroup;
    @FindBy(xpath ="//*[@id=\"__next\"]/div/div[1]/div/main/div/div[1]/div[2]/div/div/div[2]/div/div/div[1]/div[2]" )
    public WebElement filterByCategories;
    public void filterByCategories(String menu){
        wait.until(ExpectedConditions.visibilityOf(filterByCategories)).click();
        filterByCategories.findElement(By.xpath("//*[.='"+menu+"']")).click();
    }


}

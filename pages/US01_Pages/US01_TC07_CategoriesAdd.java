package Team06.pages.US01_Pages;

import Team06.pages.AbstactClass;
import Team06.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class US01_TC07_CategoriesAdd extends AbstactClass {


    public US01_TC07_CategoriesAdd(){

        PageFactory.initElements(Driver.getDriver(),this);
    }
    @FindBy(xpath = "//span[text()='Categories']")
    public WebElement categories;
    @FindBy(xpath = "/html/body/div/div/div[1]/div/main/div/div[1]/div/div[2]/a")
    public WebElement add;
    @FindBy(xpath = "//input[@type='file']")
    public WebElement image;
    @FindBy(id="name")
    public WebElement name;
    @FindBy(id="details")
    public WebElement details;
    @FindBy(xpath = "/html/body/div/div/div[1]/div/main/div/form/div[2]/div[2]/div[3]/div/div/div[1]/div[2]")
    public WebElement icon;
    @FindBy(xpath = "//*[@id=\"__next\"]/div/div[1]/div/main/div/form/div[2]/div[2]/div[4]/div/div/div[1]/div[2]")
    public WebElement type;
    @FindBy(xpath = "//*[@id=\"__next\"]/div/div[1]/div/main/div/form/div[2]/div[2]/div[5]/div/div/div[1]/div[2]")
    public WebElement parentcategory;
    @FindBy(xpath = "//button[@data-variant='normal']")
    public WebElement button;
    @FindBy(xpath = "//button[@title='Delete']")
    public WebElement delete;
    @FindBy(xpath = "/html/body/div[2]/div/div/div/div[2]/div/div/div/div/div[2]/button")
    public WebElement dbutton;

    @FindBy(xpath = "(//a[@class='text-base transition duration-200 hover:text-heading'])[1]")
    public WebElement edit;


    @FindBy(xpath = "//*[@id=\"__next\"]/div/div[1]/div/main/div/form/div[3]/button[2]")
    public WebElement updateCategory;
    @FindBy(xpath = "(//button[@type='button'])[2]")
    public WebElement back;

    public void addCategories(String menu,WebElement element){
        wait.until(ExpectedConditions.visibilityOf(element)).click();
        element.findElement(By.xpath("//*[.='"+menu+"']")).click();


    }


}

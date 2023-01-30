package Team06.pages.US03_Pages;

import Team06.pages.AbstactClass;
import Team06.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class US003_FrequentlyAskedQuestions extends AbstactClass {


    public US003_FrequentlyAskedQuestions(){

        PageFactory.initElements(Driver.getDriver(), this);

    }


    @FindBy(xpath = "//*[@id=\"__next\"]/div/div[1]/header/div/ul/li[3]/a")
    public WebElement faqButton;

   @FindBy(xpath = "//*[@id=\"__next\"]/div/div[1]/section/div/div[1]/header")
   public WebElement question1;


    @FindBy(xpath = "//*[@id=\"__next\"]/div/div[1]/section/div/div[2]/header")
    public WebElement question2;

    @FindBy(xpath = "//*[@id=\"__next\"]/div/div[1]/section/div/div[3]/header")
    public WebElement question3;

    @FindBy(xpath = "//*[@id=\"__next\"]/div/div[1]/section/div/div[4]/header")
    public WebElement question4;











}

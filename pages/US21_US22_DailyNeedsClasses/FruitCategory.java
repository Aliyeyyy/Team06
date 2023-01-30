package Team06.pages.US21_US22_DailyNeedsClasses;

import Team06.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class FruitCategory {
    public FruitCategory() {
        PageFactory.initElements(Driver.getDriver(),this);}




        @FindBy(xpath ="//h3[text()=\"Fruits\"]")
        public WebElement fruits;

        @FindBy(xpath = "//h3[text()=\"Apple & Pears\"]")
        public WebElement apple;

       DailyNeeds dN=new DailyNeeds();

       //Stonefruits kategorisine gider
        public void stonrFruitsGit(){
            dN.dNButton.click();fruits.click();stoneFruits.click();
        }

        //Tropical kategorisine gider
        public void tropicalFruitsGit(){
            dN.dNButton.click();fruits.click();topicalFruits.click();
    }
    //Apples kategorisine gider
    public void appleGit() {
        dN.dNButton.click();
        fruits.click();
        apple.click();
    }



        @FindBy(xpath = "//h3[text()=\"Stone Fruits\"]")
        public WebElement stoneFruits;

        @FindBy(tagName = "h3" )
        public List<WebElement> stoneFruitstitles;

        @FindBy(xpath = "//img[@alt=\"Sliced Watermelons 2lb\"]")//written for bug assert
        public WebElement wMelonNostocks;

        @FindBy(xpath = "//img[@alt=\"Red Prince Apples\"]")//written for bug assert
        public WebElement appleNostocks;

        @FindBy(xpath = "(//h3)[1]")
        public WebElement apricot1;

        @FindBy(xpath = "(//span[@class='text-sm font-semibold text-heading md:text-base'])[1]")
        public WebElement apricotPrice1;

        @FindBy(xpath = "(//span[@class='text-sm font-semibold text-heading md:text-base'])[2]")
        public WebElement apricotPrice2;

        @FindBy(xpath = "(//h3)[2]")
        public WebElement apricot2;

       @FindBy(xpath = "//h3[text()=\"Tropical & Exotic Fruits\"]")
       public WebElement topicalFruits;

       @FindBy(tagName = "h3" )
       public List<WebElement>tropicalTitles;




    }




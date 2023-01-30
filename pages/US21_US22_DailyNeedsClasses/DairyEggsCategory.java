package Team06.pages.US21_US22_DailyNeedsClasses;

import Team06.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DairyEggsCategory {

    public DairyEggsCategory() {
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath ="//h3[text()=\"Dairy & Eggs\"]")
    public WebElement dairyEggs;

    @FindBy(xpath ="//h3[text()=\"Dairy\"]")
    public WebElement dairy;

    @FindBy(xpath ="//h3[text()=\"Butter\"]")
    public WebElement butter;

    @FindBy(xpath = "(//h3)[3]")
    public WebElement butter1;

    @FindBy(xpath = "(//h3)[4]")
    public WebElement butter2;

    DailyNeeds dN=new DailyNeeds();

    //Dairy kategorisine gider
    public void dairyGit() {
        dN.dNButton.click();
        dairyEggs.click();
        dairy.click();
        butter.click();
    }
}

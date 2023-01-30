package Team06.pages.US21_US22_DailyNeedsClasses;

import Team06.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MeatCategory {
    public MeatCategory() {
        PageFactory.initElements(Driver.getDriver(),this);
    }
   DailyNeeds dN=new DailyNeeds();

    @FindBy(xpath ="//h3[text()=\"Meat\"]")
    public WebElement meat;
    @FindBy(xpath = "//h3[text()=\"Chicken\"]")
    public WebElement chicken;
    @FindBy(xpath = "//img[@alt=\"Chicken Legs\"]")//written for bug assert
    public WebElement chickenNostocks;

public void chickenGit(){
    dN.dNButton.click();
    dN.meat.click();
    chicken.click();
}

}

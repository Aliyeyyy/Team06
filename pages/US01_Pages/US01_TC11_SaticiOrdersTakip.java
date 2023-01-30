package Team06.pages.US01_Pages;

import Team06.pages.AbstactClass;
import Team06.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;


public class US01_TC11_SaticiOrdersTakip extends AbstactClass {
    public US01_TC11_SaticiOrdersTakip() {
        PageFactory.initElements(Driver.getDriver(), this);
    }


    @FindBy(xpath = "//aside//a[11]")
    private WebElement createOrders;

    public void btnOrders() {

        wait.until(ExpectedConditions.elementToBeClickable(createOrders)).click();

    }

    @FindBy(xpath = "//td[@class='rc-table-cell'][1]")
    public WebElement siparisTakipNo;



    @FindBy(xpath = "//td[@class='rc-table-cell'][3]")
    public WebElement siparisDurum;


}

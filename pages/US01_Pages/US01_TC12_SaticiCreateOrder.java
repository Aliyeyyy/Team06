package Team06.pages.US01_Pages;

import Team06.pages.AbstactClass;
import Team06.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;



public class US01_TC12_SaticiCreateOrder extends AbstactClass {
    public US01_TC12_SaticiCreateOrder() {

        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//aside//a[12]")
    private WebElement createOrders;

    public void btnCreateOrders() {

        wait.until(ExpectedConditions.elementToBeClickable(createOrders)).click();

    }

    @FindBy(xpath = "//button[text()='Filter']")
    private WebElement filter;

    public void btnFilter() {

        wait.until(ExpectedConditions.elementToBeClickable(filter)).click();
    }

    @FindBy(xpath = "//div[@class=' css-b62m3t-container']")
    private WebElement filterByGroup;

    // Gruba göre filitremede açılan pançerede istenen menü seçer
    public void FilterByGroup(String menu) {

        wait.until(ExpectedConditions.visibilityOf(filterByGroup)).click();
        filterByGroup.findElement(By.xpath("//*[.='"+menu+"']")).click();
    }

    public String FilterByGroup() {

        return filterByGroup.getText();
    }



}

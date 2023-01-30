package Team06.pages;

import Team06.utilities.BaseTestReport;
import Team06.utilities.ConfigReader;
import Team06.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.util.Set;

public class HomePage extends AbstactClass{

    WebDriver driver = Driver.getDriver();
    public HomePage(){

        PageFactory.initElements(driver,this);
    }


    public void registerSeller() {
        driver.get(ConfigReader.getProperty("homePageURL"));
        String homePageWindowHandle = driver.getWindowHandle();
        WebElement becomeASellerButton = driver.findElement(By.linkText("Become a Seller"));
        wait.until(ExpectedConditions.visibilityOf(becomeASellerButton)).click();
        //  becomeASellerButton.click();
        String secondPage = driver.getWindowHandle();
        Set<String> wh = driver.getWindowHandles();
        for (String each : wh) {
            driver.switchTo().window(each);
            if (each.equals(homePageWindowHandle)) {
                driver.close();
            }
        }

        WebElement name = driver.findElement(By.id("name"));

        name.sendKeys(ConfigReader.getProperty("sellerName"));
        WebElement email = driver.findElement(By.id("email"));
        email.sendKeys(ConfigReader.getProperty("sellerEmail"));
        WebElement password = driver.findElement(By.id("password"));
        password.sendKeys(ConfigReader.getProperty("sellerPassword") + Keys.ENTER);

    }



}

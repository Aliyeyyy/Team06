package US01_Tests;

import Team06.utilities.BaseTestReport;
import Team06.utilities.ConfigReader;
import Team06.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.Set;


public class US01_TC02_SellerLogin extends BaseTestReport {


WebDriver driver=Driver.getDriver();
WebDriverWait wait = new WebDriverWait(Driver.getDriver(), Duration.ofSeconds(10));

        @Test
        public void loginSeller() {
           // extentTest = extentReports.createTest("US001-testCase02");

            Driver.getDriver().get(ConfigReader.getProperty("homePageURL"));
            String homePageWindowHandle = driver.getWindowHandle();
            WebElement becomeASellerButton = driver.findElement(By.linkText("Become a Seller"));
            wait.until(ExpectedConditions.visibilityOf(becomeASellerButton)).click();
            Set<String> wh = driver.getWindowHandles();
            for (String each : wh) {
                driver.switchTo().window(each);
                if (each.equals(homePageWindowHandle)) {
                    driver.close();
                }
            }
            WebElement loginButton = driver.findElement(By.linkText("Login"));
            loginButton.click();
            WebElement customerEmail = driver.findElement(By.id("email"));
            customerEmail.clear();
            customerEmail.sendKeys(ConfigReader.getProperty("sellerEmail"));
            WebElement password = driver.findElement(By.id("password"));
            password.clear();
            password.sendKeys(ConfigReader.getProperty("sellerPassword"));
            WebElement loginButton2 = driver.findElement(By.xpath("//button[text()='Login']"));
            loginButton2.click();
        }
}


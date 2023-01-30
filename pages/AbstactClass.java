package Team06.pages;

import Team06.utilities.BaseTestReport;
import Team06.utilities.ConfigReader;
import Team06.utilities.Driver;
import com.github.javafaker.Faker;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.Set;

public abstract class AbstactClass extends LocaterClass {

    Select select;

   WebDriver driver = Driver.getDriver();
    public WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    public Faker faker = new Faker();

    public Actions action = new Actions(driver);



    public void loginAdmin() {

        driver.get(ConfigReader.getProperty("homePageURL"));
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

        WebElement loginButton2 = driver.findElement(By.xpath("//button[text()='Login']"));
        loginButton2.click();


    }

    public void loginSeller() {

        driver.get(ConfigReader.getProperty("homePageURL"));
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
        //WebElement customerEmail = driver.findElement(By.id("email"));
        //customerEmail.clear();
        //customerEmail.sendKeys(ConfigReader.getProperty("sellerEmail"));
        //WebElement password = driver.findElement(By.id("password"));
        //password.clear();
        //password.sendKeys(ConfigReader.getProperty("sellerPassword"));
        WebElement loginButton2 = driver.findElement(By.xpath("//button[text()='Login']"));
        loginButton2.click();
    }

    public void logoutSeller() {
        WebElement customerLogo = driver.findElement(By.xpath("//button[@class='flex items-center focus:outline-none']"));
        customerLogo.click();
        WebElement logoutButton = driver.findElement(By.linkText("Logout"));
        logoutButton.click();

    }

    public void registerCustomer() {
        driver.get(ConfigReader.getProperty("homePageURL"));
        WebElement joinButton = driver.findElement(By.xpath("//button[text()='Join']"));
        joinButton.click();
        WebElement registerButton = driver.findElement(By.xpath("//button[text()='Register']"));
        registerButton.click();
        WebElement customerName = driver.findElement(By.id("name"));
        customerName.sendKeys(ConfigReader.getProperty("customerName"));
        WebElement customerEmail = driver.findElement(By.id("email"));
        customerEmail.sendKeys(ConfigReader.getProperty("customerEmail"));
        WebElement password = driver.findElement(By.id("password"));
        password.sendKeys(ConfigReader.getProperty("customerPassword"));
        WebElement register = driver.findElement(By.xpath("//button[text()='Register']"));
        register.click();

    }

    public void loginCustomer() {

        driver.get(ConfigReader.getProperty("homePageURL"));
        WebElement joinButton = driver.findElement(By.xpath("//button[text()='Join']"));
        joinButton.click();
        WebElement customerEmail = driver.findElement(By.id("email"));
        customerEmail.clear();
        customerEmail.sendKeys(ConfigReader.getProperty("customerEmail"));
        WebElement password = driver.findElement(By.id("password"));
        password.clear();
        password.sendKeys(ConfigReader.getProperty("customerPassword"));
        WebElement loginButton = driver.findElement(By.xpath("//button[text()='Login']"));
        loginButton.click();

    }

    public void logoutCustomer() {
        WebElement userLogo = driver.findElement(By.id("headlessui-menu-button-8"));
        userLogo.click();
        WebElement logoutButton = driver.findElement(By.xpath("//button[text()='Logout']"));
        wait.until(ExpectedConditions.visibilityOf(logoutButton)).click();


    }


}

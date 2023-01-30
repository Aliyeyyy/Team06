package Team06.pages.US01_Pages;

import Team06.pages.AbstactClass;
import Team06.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class US01_TC15_Coupons extends AbstactClass {

    public US01_TC15_Coupons(){

        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "//span[text()='Coupons']")
    public WebElement CouponsButton;

    @FindBy(linkText = "+ Add Coupon")
    public WebElement addCouponButton;
    @FindBy(xpath = "//section[@class='upload']")
    public WebElement uploadImage;
    @FindBy(id="code")
    public WebElement code;
    @FindBy(id="description")
    public WebElement description;
    @FindBy(xpath = "//label[@for='fixed']")
    public WebElement fixed;
    @FindBy(id="amount")
    public WebElement discount;
    @FindBy(id="minimum_cart_amount")
    public WebElement minAmount;
    @FindBy(xpath = "(//input[@type='text'])[2]")
    public WebElement activeDate;
    @FindBy(xpath = "(//input[@type='text'])[3]")
    public WebElement willDate;

    @FindBy(xpath = "/html/body/div/div/div[1]/div/main/div/form/div[3]/button")  //button[@data-variant='normal']
    public WebElement addCoupon;

    @FindBy(xpath = "//*[@id=\"__next\"]/div/div[1]/div/main/div/div[2]/div/div/div/table/tbody/tr[3]/td[8]/div/a/svg")
    public WebElement edit;
    @FindBy(xpath = "//button[@title='Delete']")
    public WebElement delete;










}
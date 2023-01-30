package Team06.pages.US018;

import Team06.pages.AbstactClass;
import Team06.utilities.BaseTestReport;
import Team06.utilities.Driver;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import java.util.List;

public class CheckoutPage extends AbstactClass {

WebDriver driver = Driver.getDriver();

    public CheckoutPage() {
        PageFactory.initElements(driver, this);
    }

    @FindBy(css = "button.flex .h-4.w-4")
    private WebElement addTelefonNumber;

    @FindBy(xpath = "(//button[text()='Add'])[2]")
    private WebElement addBillingAdress;

    @FindBy(id = "title")
    private WebElement title;

    @FindBy(xpath = "(//button[text()='Add'])[last()]")
    private WebElement addShippingAdress;

    @FindBy(xpath = "(//input[starts-with(@class,'form-control')])[2]")
    private WebElement addTelefonNumber2;
    @FindBy(xpath = "//input[starts-with(@class,'form-control')]")
    private WebElement addTelefonNumber3;
    @FindBy(xpath = "(//button[starts-with(@class,'inline-flex')])[2]")
    private WebElement addContact;

    @FindBy(xpath = "//div[text()='Profile Updated Successfully']")
    private WebElement alertMessage;

    @FindBy(xpath = "//label[@for='billing']")
    private WebElement billing;

    @FindBy(xpath = "//label[@for='shipping']")
    private WebElement shipping;

    //  @FindBy(xpath = "//div[starts-with(@id,'headlessui')]")
    //  private List<WebElement> delivery;

    @FindBy(xpath = "//button[text()='Check Availability']")
    private WebElement checkAvailabity;

    @FindBy(xpath = "//p[text()='Do you have coupon?']")
    private WebElement addCouponButton;

    @FindBy(css = "#code")
    private WebElement addCoupon;
    @FindBy(xpath = "//button[text()='Apply']")
    private WebElement apllyButton;

    @FindBy(xpath = "//*[@id=\"__next\"]/div/div[1]/div[1]/div[1]/div[2]/div[3]/div[2]/div[5]/span[2]")
    private WebElement price;

    public boolean myOffersIsDisplayed() {
        return price.isDisplayed();
    }

    public void totalPriceand2() {
        System.out.println("Double.parseDouble(price.getText().substring(1)) = " + Double.parseDouble(price.getText().substring(1)));

    }

    @FindBy(xpath = "//span[text()='Copy']")
    private WebElement copyCoupon;

    @FindBy(xpath = "//button[text()='Place Order']")
    private WebElement placeOrderButton;

    @FindBy(xpath = "//p[text()='Discount']")
    private WebElement discount;

    @FindBy(css = "div.progress-box_progress_container___zzev")
    private List<WebElement> progress;

    public boolean isProgress5Steps() {
        return progress.size() == 5;
    }

    @FindBy(xpath = "//span[text()='Cash On Delivery']")
    private WebElement cashButton;

    @FindBy(xpath = "//img[@alt='Stripe']")
    private WebElement creditKartButton;

    @FindBy(xpath = "(//span[text()='Morning']//parent::div//parent::div)[1]")
    private WebElement del1;
    @FindBy(xpath = "(//span[text()='Express Delivery']//parent::div//parent::div)[1]")
    private WebElement del2;
    @FindBy(xpath = "(//span[text()='Noon']//parent::div//parent::div)[1]")
    private WebElement del3;
    @FindBy(xpath = "(//span[text()='Afternoon']//parent::div//parent::div)[1]")
    private WebElement del4;
    @FindBy(xpath = "(//span[text()='Evening']//parent::div//parent::div)[1]")
    private WebElement del5;

    public boolean discountIsDisplayed() {
        return discount.isDisplayed();
    }

    public boolean paymentMethodIsClickable() {
        cashButton.click();

        return cashButton.isSelected();
    }

    public void choosePaymentMethod() {
        cashButton.click();
        placeOrderButton.click();

    }

    public void addCoupon() throws AWTException {

        checkAvailabity.click();
        addCouponButton.click();
        addCoupon.click();
        Robot rbt = new Robot();
        rbt.keyPress(KeyEvent.VK_CONTROL);
        rbt.keyPress(KeyEvent.VK_V);
        rbt.keyRelease(KeyEvent.VK_V);
        rbt.keyRelease(KeyEvent.VK_CONTROL);
        apllyButton.click();
    }

    public void copyCoupon() {
        copyCoupon.click();
    }

    public boolean deliveryIsSelectable(){

        boolean flag = true;
List<WebElement> elements = new ArrayList<>();
elements.add(del2);
elements.add(del1);
elements.add(del3);
elements.add(del4);
elements.add(del5);
        for (int i = 0; i < elements.size(); i++) {
            wait.until(ExpectedConditions.elementToBeClickable(elements.get(i))).click();
            System.out.println(elements.get(i).getText());
            if (elements.get(i).getAttribute("aria-checked").equals("false")) {
                flag = false;
                break;
            }
        }
        return flag;
    }

    public void tryCatch(WebElement element) {
        for (int i = 0; i < 3; i++) {
            try {
                element.click();
                break;
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }

    }

    public void updateTelefonNumber() {
       tryCatch(addTelefonNumber);
       // addTelefonNumber2.clear();
        action.sendKeys(addTelefonNumber2, "1246789632").perform();
        addContact.click();
    }

    public void fillAddressArea() {
        action.sendKeys(title, faker.name().title(), Keys.TAB)
                .sendKeys(faker.country().name() + Keys.TAB)
                .sendKeys(faker.address().city() + Keys.TAB)
                .sendKeys(faker.address().state() + Keys.TAB)
                .sendKeys(faker.address().zipCode() + Keys.TAB)
                .sendKeys(faker.address().streetAddress() + Keys.TAB)
                .sendKeys(Keys.ENTER).perform();

    }

    public void updateBillingAddress() {
        addBillingAdress.click();
        //   billing.click();
        fillAddressArea();

    }


    public void updateShippingAdress() {

        addShippingAdress.click();
        shipping.click();
        //   tryCatch(addShippingAdress);
       // action.moveToElement(addShippingAdress).click();
        // tryCatch(shipping);
        fillAddressArea();

    }

    public boolean isUpdated() {


        wait.until(ExpectedConditions.visibilityOf(alertMessage));
        return alertMessage.isDisplayed();
    }

    public boolean isTelefonNumberUpdated() {
        boolean flag = true;
        for (int i = 0; i < 3; i++) {
            try {
                flag = addTelefonNumber3.getAttribute("value").substring(2).replaceAll("\\D", "").equals("1246789632");
                break;
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
        return flag;
    }


}

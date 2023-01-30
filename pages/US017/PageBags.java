package Team06.pages.US017;

import Team06.pages.AbstactClass;
import Team06.utilities.BaseTestReport;
import Team06.utilities.Driver;
import org.openqa.selenium.*;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class PageBags extends AbstactClass {

    JavascriptExecutor jse = (JavascriptExecutor) Driver.getDriver();

    WebDriver driver = Driver.getDriver();


    //  private static List<String> itemsNameInCart = new ArrayList<>();
    //  private static List<String> itemsNameInCheckout = new ArrayList<>();
    private static double totalCartPrice;
    public static double price;

    public PageBags() {

        PageFactory.initElements(driver, this);

    }

    public double getTotalPrice() {
        price = totalCartPrice;
        return totalCartPrice;
    }


    @FindBy(xpath = "(//span[contains(text(),'Cart')])[2]//parent::button")
    private WebElement secondItemCart;

    @FindBy(css = ".hidden.product-cart")
    private WebElement cartButton;

    @FindBy(xpath = "(//span[text()='plus'])[1]")
    private WebElement plusButtonOnPage;

    @FindBy(xpath = "(//span[text()='minus'])[1]")
    private WebElement minusButtonOnPage;

    @FindBy(xpath = "(//button[@class='cursor-pointer p-2 transition-colors duration-200 hover:bg-accent-hover focus:outline-none hover:!bg-gray-100'])[2]")
    private WebElement plusButtonInCart;

    @FindBy(xpath = "(//button[@class='cursor-pointer p-2 transition-colors duration-200 hover:bg-accent-hover focus:outline-none hover:!bg-gray-100'])[1]")
    private WebElement minusButtonInCart;

    @FindAll(@FindBy(xpath = "(//span[text()='Product Image'])"))
    private List<WebElement> ItemsOnPage;

    @FindBy(xpath = "//span[text()='Cart']/ancestor::article/div")
    private WebElement firstItemOnPage;

    @FindBy(xpath = "(//span[text()='Product Image'])[1]")
    private WebElement secondItemOnPage;

    @FindBy(xpath = "//span[text()='pieces available']")
    private WebElement itemAvailabilityOnCart;

    @FindBy(xpath = "(//span[text()='Add To Shopping Cart'])[2]")
    private WebElement addToCartInItem;

    @FindBy(xpath = "(//button[@class='cursor-pointer p-2 transition-colors duration-200 hover:bg-accent-hover focus:outline-none px-5'])[4]")
    private WebElement plusButtonInItem;

    @FindBy(xpath = "(//div[@class='flex flex-1 items-center justify-center px-3 text-sm font-semibold'])[3]")
    private WebElement totalAddedItem;

    @FindBy(xpath = "//div[@class='flex flex-1 items-center justify-center px-3 text-sm font-semibold']")
    private WebElement totalAddedItem2;

    @FindBy(xpath = "(//span[text()='minus'])[3]")
    private WebElement minusButtonInItem;


    @FindBy(xpath = "//span[contains(text(),'Purse')]")
    private WebElement purseButton;

    public void clickPurseButton() {
        action.sendKeys(Keys.ESCAPE).sendKeys(Keys.PAGE_DOWN).perform();
        // purseButton.click();
    }

    @FindBy(xpath = "(//span[contains(text(),'Cart')])[1]//parent::button")
    private WebElement firstItemCart;

    @FindBy(xpath = "//span[contains(text(),'Cart')]")
    private static List<WebElement> addableItems;

    @FindBy(xpath = "//p[@class='my-2.5 font-semibold text-accent']")
    private WebElement firstItemOnCartPrice;

    @FindBy(xpath = "(//p[@class='my-2.5 font-semibold text-accent'])[2]")
    private WebElement secondItemOnCartPrice;

    @FindBy(xpath = "//div[text()='Out Of Stock']/ancestor::article/div")
    private WebElement outOfStockElement;

    @FindBy(css = ".flex-shrink-0")
    private List<WebElement> itemsInCart;

    @FindBy(xpath = "(//div[text()='2'])[2]")
    private WebElement plusSize;

    @FindBy(xpath = "//span[contains(text(),'Item')]")
    private WebElement itemCount;

    @FindBy(xpath = "(//span[contains(text(),'$')])[last()]")
    private WebElement totalPrice;

    @FindBy(css = ".whitespace-nowrap.text-base")
    private WebElement countOfItem;

    @FindBy(xpath = "(//span[text()='Add To Shopping Cart'])[2]")
    private WebElement addCartOnItem;

    @FindBy(xpath = "//span[text()='Add To Shopping Cart']")
    private WebElement addCartOnItem2;

    @FindBy(xpath = "(//div[@class='flex flex-1 items-center justify-center px-3 text-sm font-semibold'])[4]")
    private WebElement totalAddedItemOnItem;

    @FindBy(css = "li>button.flex")
    private List<WebElement> menuList;

    @FindBy(xpath = "(//div[@class='mt-4 space-y-2']/div/span)[1]")
    private WebElement checkoutPrice;


    @FindBy(xpath = "//span[text()='Checkout']")
    private WebElement checkoutButton;

    public boolean isCheckoutpageDisplayed() {
        wait.until(ExpectedConditions.visibilityOf(checkoutPrice));
        return driver.getCurrentUrl().equals("https://shop-pickbazar-rest.vercel.app/checkout");
    }


    @FindBy(css = "h3.font-bold")
    private List<WebElement> itemsNameElementCartList;


    @FindBy(xpath = "//span[@class='text-sm text-body']/span[2]/following-sibling::span[1]")
    private List<WebElement> itemsNameElementCheckoutList;


    public void clickCheckoutButton() {
        checkoutButton.click();
    }

    public boolean isSelectedItemsOnCheckout() {
        boolean flag = true;
        for (int i = 0; i < itemsNameElementCheckoutList.size(); i++) {
            if (!itemsNameElementCheckoutList.get(i).isDisplayed()) {
                flag = false;
                break;
            }
        }
        return flag;
    }


    public int totalAdded() {
        return Integer.parseInt(totalAddedItem.getText());
    }

    public int totalAdded2() {
        return Integer.parseInt(totalAddedItem2.getText());
    }

    public int totalAvailabity() {
        String str = itemAvailabilityOnCart.getText();
        return Integer.parseInt(str.substring(0, str.indexOf(" ")));
    }

    public void clickPlusButtonOnItem() {

        for (int i = 0; i < totalAvailabity(); i++) {
            plusButtonInItem.click();
        }
    }


    public void addCartOnItem() {
        addCartOnItem.click();
    }

    public void addCartOnItem2() {
        addCartOnItem2.click();
    }

    public void clickOutOfStockItem() {
        action.sendKeys(Keys.ESCAPE).sendKeys(Keys.PAGE_DOWN).perform();
        wait.until(ExpectedConditions.visibilityOf(outOfStockElement)).click();

    }


    public boolean itemsAdded() {
        return itemsInCart.size() == 2;
    }

    public void clickCart() {
        cartButton.click();
    }

    public boolean plusMinusButtonIsEnabled() {
        wait.until(ExpectedConditions.visibilityOf(plusButtonInCart));
        plusButtonInCart.click();
        minusButtonInCart.click();
        plusButtonInCart.click();

        return Integer.parseInt(plusSize.getText()) == 2;
    }

    public boolean removeProductFromCart() {
        minusButtonInCart.click();
        minusButtonInCart.click();
        return Integer.parseInt(itemCount.getText().substring(0, 1)) == 1;

    }


    public void addItemToCart() {
        action.sendKeys(Keys.ESCAPE).sendKeys(Keys.PAGE_DOWN).perform();
        wait.until(ExpectedConditions.visibilityOf(firstItemCart)).click();
        secondItemCart.click();

    }

    public boolean itemsCountIsTrue() throws InterruptedException {
        int count = 0;
        for (int i = 0; i < menuList.size(); i++) {
            menuList.get(i).click();
            Thread.sleep(2000);
            if (addableItems.size() > 1) {
                wait.until(ExpectedConditions.visibilityOf(firstItemCart)).click();
                count++;
            }
        }
        clickCart();
        return count == itemsInCart.size();
    }

    public double totalPrice() {
        wait.until(ExpectedConditions.visibilityOf(firstItemCart));
        return Double.parseDouble(firstItemOnCartPrice.getText().substring(1))
                + Double.parseDouble(secondItemOnCartPrice.getText().substring(1));

    }

    public void totalPriceOnCart() {
        totalCartPrice = Double.parseDouble(totalPrice.getText().substring(1));
    }


    public double checkoutPrice() {
        return Double.parseDouble(checkoutPrice.getText().substring(1));
    }

    public boolean totalPriceIsEquals() {
        return totalCartPrice == checkoutPrice();
    }

    public boolean itemsTotalPriceIsEquals() {

        wait.until(ExpectedConditions.visibilityOf(totalPrice));
        return Double.parseDouble(totalPrice.getText().substring(1)) == totalPrice();

    }


    public void clickFirstItemOnPage() {
        action.sendKeys(Keys.ESCAPE).sendKeys(Keys.PAGE_DOWN).perform();
        firstItemOnPage.click();
    }


}

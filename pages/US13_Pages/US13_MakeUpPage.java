package Team06.pages.US13_Pages;


import Team06.pages.AbstactClass;
import Team06.utilities.Driver;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class US13_MakeUpPage extends AbstactClass {
    JavascriptExecutor jse = (JavascriptExecutor) Driver.getDriver();

    WebDriver driver = Driver.getDriver();

    public static List<String> itemsNameInCart = new ArrayList<>();
    public static List<String> itemsNameInCheckout = new ArrayList<>();
    public static double totalCartPrice;



    public US13_MakeUpPage() {
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "(//span[contains(text(),'Cart')])[2]")
    public WebElement secondItemCart;

    @FindBy(css = ".hidden.product-cart")
    private WebElement cartButton;

    @FindAll(@FindBy(xpath = "(//span[text()='Product Image'])"))
    private List<WebElement> ItemsOnPage;

    @FindBy(xpath = "(//span[text()='Product Image'])[1]")
    private WebElement secondItemOnPage;

    @FindBy(xpath = "//span[text()='pieces available']")
    private WebElement itemAvailabilityOnCart;

    @FindBy(xpath = "(//span[text()='Add To Shopping Cart'])[2]")
    private WebElement addToCartInItem;

    @FindBy(xpath = "(//div[@class='flex flex-1 items-center justify-center px-3 text-sm font-semibold'])[3]")
    private WebElement totalAddedItem;

    @FindBy(xpath = "//div[@class='flex flex-1 items-center justify-center px-3 text-sm font-semibold']")
    private WebElement totalAddedItem2;

    @FindBy(xpath = "(//span[contains(text(),'Cart')]/parent::*)[1]")
    public WebElement firstItemCart;

    @FindBy(xpath = "//span[contains(text(),'Cart')]")
    private static List<WebElement> addableItems;

    @FindBy(xpath = "//p[@class='my-2.5 font-semibold text-accent']")
    public WebElement firstItemOnCartPrice;

    @FindBy(xpath = "(//p[@class='my-2.5 font-semibold text-accent'])[2]")
    private WebElement secondItemOnCartPrice;


    @FindBy(css = ".flex-shrink-0")
    private List<WebElement> itemsInCart;


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
        return Driver.getDriver().getCurrentUrl().equals("https://shop-pickbazar-rest.vercel.app/checkout");
    }


    @FindBy(css = "h3.font-bold")
    private List<WebElement> itemsNameElementCartList;


    @FindBy(xpath = "//span[@class='text-sm text-body']/span[2]/following-sibling::span[1]")
    private List<WebElement> itemsNameElementCheckoutList;

    public void itemsNameCart() {
        for (int i = 0; i < itemsNameElementCartList.size(); i++) {
            itemsNameInCart.add(itemsNameElementCartList.get(i).getText());
            Collections.sort(itemsNameInCart);
        }
    }

    public void itemsNameCheckout() {
        for (int i = 0; i < itemsNameElementCheckoutList.size(); i++) {
            itemsNameInCheckout.add(itemsNameElementCheckoutList.get(i).getText());
            Collections.sort(itemsNameInCheckout);
        }
    }

    public void clickCheckoutButton() {
        checkoutButton.click();
    }

    public boolean isSelectedItemsOnCheckout() {
        boolean flag = true;
        for (int i = 0; i < itemsNameInCheckout.size(); i++) {
            if (!itemsNameInCart.get(i).equals(itemsNameInCheckout.get(i))) {
                System.out.println(itemsNameInCart.get(i));
                System.out.println(itemsNameInCheckout);
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

    public void addCartOnItem() {
        addCartOnItem.click();
    }

    public void addCartOnItem2() {
        addCartOnItem2.click();
    }


    public boolean itemsAdded() {
        return itemsInCart.size() == 2;
    }

    public void clickCart() {
        cartButton.click();
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

    public boolean totalPriceIsEquals(){
        return totalCartPrice==checkoutPrice();
    }

    public boolean itemsTotalPriceIsEquals() {

        wait.until(ExpectedConditions.visibilityOf(totalPrice));
        return Double.parseDouble(totalPrice.getText().substring(1)) == totalPrice();

    }



}





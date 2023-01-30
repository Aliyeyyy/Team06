package Team06.pages.US16_Pages;

import Team06.pages.AbstactClass;
import Team06.utilities.Driver;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.util.List;

public class US016_UrUnMiktariPage extends AbstactClass {
    WebDriver driver = Driver.getDriver();
    JavascriptExecutor js = (JavascriptExecutor) driver;

    public US016_UrUnMiktariPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }


    @FindBy(xpath = "//button[contains(@id,'headlessui-menu-button')]")
    public WebElement groceryDropdown;

    //bags katesorisi seçimi
    @FindBy(xpath = "//a[@href='/bags']")
    private WebElement selectBags;

    public void btnSelectBags() {
        wait.until(ExpectedConditions.elementToBeClickable(groceryDropdown));
        groceryDropdown.click();
        wait.until(ExpectedConditions.elementToBeClickable(selectBags)).click();
        groceryDropdown.click();
    }

    //bags katesorisi seçimi
    @FindBy(xpath = "//a[@href='/makeup']")
    private WebElement selectMakeup;

    public void btnSelectMakeup() {
        wait.until(ExpectedConditions.elementToBeClickable(groceryDropdown));
        groceryDropdown.click();
        wait.until(ExpectedConditions.elementToBeClickable(selectMakeup)).click();
        groceryDropdown.click();
    }


    @FindBy(xpath = "//button[.='Cart']")
    public WebElement aktifCart;

    public void btnFirstItemCart() {
        Actions actions = new Actions(driver);
        actions.scrollToElement(aktifCart).perform();
        actions.doubleClick(aktifCart).perform();

    }


    @FindBy(xpath = "(//button[contains(@class,'cursor') and .='plus'])[1]")
    public WebElement plus;

    public void btnPlusSayfa() {
        wait.until(ExpectedConditions.elementToBeClickable(plus)).click();

    }


    @FindBy(xpath = "(//button[contains(@class,'cursor') and .='plus'])[2]")
    public WebElement plusSepet;

    public void btnPlusSepet() {
        wait.until(ExpectedConditions.elementToBeClickable(plusSepet)).click();

    }

    @FindBy(xpath = "(//button[contains(@class,'cursor') and .='minus'])[1]")
    public WebElement minus;

    public void btnMinusSayfa() {
        wait.until(ExpectedConditions.elementToBeClickable(minus)).click();

    }

    @FindBy(xpath = "(//button[contains(@class,'cursor') and .='minus'])[2]")
    public WebElement minusSepet;

    public void btnMinusSepet() {
        wait.until(ExpectedConditions.elementToBeClickable(minusSepet)).click();

    }


    @FindBy(xpath = "//div[contains(@class,'text-sm font-semibold')]")
    public List<WebElement> urunEklemeSonuc;

    public String sayfaUrunEklemeSonuc() {
        return urunEklemeSonuc.get(0).getText();
    }

    public String sepetUrunEklemeSonuc() {
        return urunEklemeSonuc.get(1).getText();
    }

    @FindBy(xpath = "//p[contains(@class,'semibold text')]")
    public WebElement sepetBirimFiyat;

    public float floatSepetBirimFiyat() {

        String text = sepetBirimFiyat.getText().substring(1);
        return Float.parseFloat(text);
    }
 @FindBy(xpath = "//p[contains(@class,'semibold text')]")
    public WebElement sepetToplamFiyat;

    public float floatSepetToplamFiyat() {

        String text = sepetToplamFiyat.getText().substring(1);
        return Float.parseFloat(text);
    }


    @FindBy(css = ".hidden.product-cart")
    private WebElement cartButton;

    public void btnCart() {
        cartButton.click();
    }

    @FindBy(xpath = "//button[contains(@class,'focus:bg-accent focus:text-light focus:outline-none') and .='close']")
    private WebElement cartCloseButton;

    public void btnCloseCart() {
        cartCloseButton.click();
    }


}

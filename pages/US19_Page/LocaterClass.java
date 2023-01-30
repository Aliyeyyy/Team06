package Team06.pages.US19_Page;

import Team06.utilities.Driver;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LocaterClass {
public LocaterClass (){
    PageFactory.initElements(Driver.getDriver(),this);

}

    @FindBy(xpath = "//img[@alt='Pickbazar']")
    private WebElement homePickPazarLink;


    //ana sayfa sol üst kösede bulunan PickPazar logosu
    public void clickHomePickPazar(){
        homePickPazarLink.click();
    }

    @FindBy(xpath = "(//header//descendant::button[@type='button'])[1]")
    private WebElement homeMenu;



    // Ana sayfada bulunan acilir Menu
    public void clickHomeMenu(){
        homeMenu.click();
    }
    @FindBy(xpath = "(//span[text()='Grocery'])[1]")
    private WebElement menuGrocery;

    // Ana sayfada bulunan acilir Menu
    public void navigateToMenuGrocery(){
        clickHomeMenu();
        menuGrocery.click();
    }


    // Ana sayfada bulunan acilir Menu
    @FindBy(xpath = "(//span[text()='Bakery'])[1]")
    private WebElement menuBakery;

    public void navigateToMenuBakery(){
        clickHomeMenu();
        menuBakery.click();
    }

    // Ana sayfada bulunan acilir Menu
    @FindBy(xpath = "(//span[text()='Makeup'])[1]")
    private WebElement menuMakeup;

    public void navigateToMenuMakeup(){
        clickHomeMenu();
        menuMakeup.click();

        Actions action = new Actions(Driver.getDriver());
        action.sendKeys(Keys.ESCAPE).sendKeys(Keys.PAGE_DOWN).perform();


    }

    // Ana sayfada bulunan acilir Menu
    @FindBy(xpath = "(//span[text()='Bags'])[1]")
    private WebElement menuBags;

    public void navigateToMenuBags(){
        clickHomeMenu();
        menuBags.click();
    }

    // Ana sayfada bulunan acilir Menu
    @FindBy(xpath = "(//span[text()='Clothing'])[1]")
    private WebElement menuClothing;

    public void navigateToMenuClothing(){
        clickHomeMenu();
        menuClothing.click();
    }

    // Ana sayfada bulunan acilir Menu
    @FindBy(xpath = "(//span[text()='Furniture'])[1]")
    private WebElement menuFurniture;

    public void navigateToMenuFurniture(){
        clickHomeMenu();
        menuFurniture.click();
    }

    // Ana sayfada bulunan acilir Menu
    @FindBy(xpath = "//a[@href='/daily-needs']")
    private WebElement menuDailyNeeds;

    public void navigateToMenuDailyNeeds() throws InterruptedException {
        Thread.sleep(3000);
        clickHomeMenu();
        menuDailyNeeds.click();
    }

    // Ana sayfada üst tarafta bulunan Shops linki
    @FindBy(linkText = "Shops")
    private WebElement linkShops;

    public void navigateToShops(){
        linkShops.click();
    }

    // Ana sayfada üst tarafta bulunan Offers linki
    @FindBy(linkText = "Offers")
    private WebElement linkOffers;

    public void navigateToOffers(){
        linkOffers.click();
    }

    // Ana sayfada üst tarafta bulunan FAQ linki
    @FindBy(linkText = "FAQ")
    private WebElement linkFaq;

    public void navigateToFaq(){
        linkFaq.click();
    }

    // Ana sayfada üst tarafta bulunan Contact linki
    @FindBy(linkText = "Contact")
    private WebElement linkContact;

    public void navigateToContact(){
        linkContact.click();
    }

    // Ana sayfada üst tarafta bulunan Become A Seller linki

    @FindBy(linkText = "Become a Seller")
    private WebElement linkBecomeASeller;

    public void navigateToBecomeASeller(){
        linkBecomeASeller.click();
    }

    // Ana sayfada üst tarafta bulunan Join linki

    @FindBy(xpath = "//button[text()='Join']")
    private WebElement joinButton;

    public void clickJoinButton(){
        joinButton.click();
    }

    // Ana sayfada bulunan Arama Cubugu linki

    @FindBy(id = "search")
    private WebElement homeSearchBox;

    public void sendKeysHomeSearchBox(String value){
        homeSearchBox.sendKeys(value+ Keys.ENTER);

    }

    // Ana sayfada bulunan Sepet Butonu

    @FindBy(css = ".hidden.product-cart")
    private WebElement cartButton;

    public void clickCartButton(){
        cartButton.click();
    }





}

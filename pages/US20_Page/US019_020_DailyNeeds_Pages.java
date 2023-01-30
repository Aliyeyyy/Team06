package Team06.pages.US20_Page;

import Team06.pages.US19_Page.LocaterClass;
import Team06.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.asserts.SoftAssert;

import java.util.List;

public class US019_020_DailyNeeds_Pages {

    public US019_020_DailyNeeds_Pages() {

        PageFactory.initElements(Driver.getDriver(), this);
    }

    LocaterClass lc = new LocaterClass();
    SoftAssert sf = new SoftAssert();
    Actions act = new Actions(Driver.getDriver());

    @FindBy(xpath = "//img[@alt='Pickbazar']")
    private WebElement homePage;
    @FindBy(xpath = "//*[@id=\"__next\"]/div/div[1]/div[1]/div[2]/div[2]/div/div[1]/div[1]")
    private WebElement vegetables;
    @FindBy(xpath = "//h3")
    private WebElement allium;
    @FindBy(xpath = "//*[@id=\"__next\"]/div/div[1]/div[1]/div[2]/div[2]/div[2]/div/article[1]/header/button/span[2]")
    private WebElement alliumaddCart;
    @FindBy(xpath = "//*[@id=\"__next\"]/div/div[1]/div[1]/div[2]/div[2]/div[2]/div/article[1]/header/div[2]/div")
    private WebElement addCartControl;

    public void vegahover() throws InterruptedException {
        lc.clickHomeMenu();
        lc.navigateToMenuDailyNeeds();
        act.sendKeys(Keys.PAGE_DOWN);
        act.moveToElement(vegetables).perform();
        WebElement hoverText = Driver.getDriver().findElement(By.xpath("//*[@id=\"__next\"]/div/div[1]/div[1]/div[2]/div[2]/div/div[1]/div[1]/button"));
        String text = hoverText.getText();
        if (text.equals("View More")) {
            System.out.println("Hover text doğrulandı");
        } else {
            System.out.println("Hover text doğrulanamadı");
        }
    }

    public void vegatablesDisplayed() throws InterruptedException {
        lc.clickHomeMenu();
        lc.navigateToMenuDailyNeeds();
        vegetables.click();
        sf.assertTrue(vegetables.isDisplayed());
        homePage.click();
    }

    public void vegateblesIslem() throws InterruptedException {

        act.sendKeys(Keys.PAGE_DOWN);

        vegetables.click();
        Thread.sleep(2000);
        allium.click();
        List<WebElement> elements = Driver.getDriver().findElements(By.xpath("//span[.='Add']"));
        for (WebElement element : elements) {
            element.click();
        }

        WebElement cardSize = Driver.getDriver().findElement(By.xpath("(//span[.='6'])[1]"));
        sf.assertEquals(cardSize.getText(), elements.size());
        lc.clickHomeMenu();
        homePage.click();


    }

    @FindBy(xpath = "//h3[.='Snacks']")
    private WebElement snacks;
    @FindBy(xpath = "//h3[.='Cold Drinks']")
    private WebElement colddrinks;

    public void snackHover() throws InterruptedException {
        lc.clickHomeMenu();
        lc.navigateToMenuDailyNeeds();
        act.sendKeys(Keys.PAGE_DOWN);
        act.moveToElement(snacks).perform();
        WebElement hoverText = Driver.getDriver().findElement(By.xpath("//*[@id=\"__next\"]/div/div[1]/div[1]/div[2]/div[2]/div/div[1]/div[1]/button"));
        String text = hoverText.getText();
        if (text.equals("View More")) {
            System.out.println("Hover text doğrulandı");
        } else {
            System.out.println("Hover text doğrulanamadı");
        }

    }

    public void snackDisplayed() throws InterruptedException {
        lc.clickHomeMenu();
        lc.navigateToMenuDailyNeeds();
        snacks.click();
        sf.assertTrue(snacks.isDisplayed());
        homePage.click();

    }

    public void snackIslem() throws InterruptedException {
        Thread.sleep(2000);
        act.sendKeys(Keys.PAGE_UP);
        homePage.click();
        lc.clickHomeMenu();
        lc.navigateToMenuDailyNeeds();
        snacks.click();
        colddrinks.click();


        List<WebElement> elements = Driver.getDriver().findElements(By.xpath("//span[.='Add']"));
        for (WebElement element : elements) {
            element.click();
        }

        WebElement cardSize = Driver.getDriver().findElement(By.xpath("(//span[.='6'])[1]"));
        sf.assertEquals(cardSize.getText(), elements.size());

        lc.clickHomeMenu();
        homePage.click();
    }

    @FindBy(xpath = "//*[@id=\"__next\"]/div/div[1]/div[1]/div[2]/div[2]/div/div[3]/div[1]/button")
    private WebElement ricePulse;
    @FindBy(xpath = "//h3[.='Rice']")
    private WebElement rice;

    public void RicePulseHover() throws InterruptedException {

        lc.clickHomeMenu();
        lc.navigateToMenuDailyNeeds();
        act.sendKeys(Keys.PAGE_DOWN);
        act.moveToElement(ricePulse).perform();
        Thread.sleep(2000);
        WebElement hoverText = Driver.getDriver().findElement(By.xpath("//*[@id=\"__next\"]/div/div[1]/div[1]/div[2]/div[2]/div/div[2]/div[1]/button"));
        String text = hoverText.getText();
        if (text.equals("View More")) {
            System.out.println("Hover text doğrulandı");
        } else {
            System.out.println("Hover text doğrulanamadı");
        }

    }

    public void ricePlusDisplayed() throws InterruptedException {
        lc.clickHomeMenu();
        lc.navigateToMenuDailyNeeds();
        ricePulse.click();
        sf.assertTrue(ricePulse.isDisplayed());
        homePage.click();


    }

    public void ricePulse() throws InterruptedException {
        lc.clickHomeMenu();
        lc.navigateToMenuDailyNeeds();
        ricePulse.click();
        rice.click();
        List<WebElement> elements = Driver.getDriver().findElements(By.xpath("//span[.='Add']"));
        for (WebElement element : elements) {
            element.click();
        }

        WebElement cardSize = Driver.getDriver().findElement(By.xpath("(//span[.='6'])[1]"));
        sf.assertEquals(cardSize.getText(), elements.size());
        homePage.click();

    }


    @FindBy(xpath = "//h3[.='Meat']")
    private WebElement meat;
    @FindBy(xpath = "//h3[.='Beef']")
    private WebElement beef;

    public void meatHover() throws InterruptedException {
        lc.clickHomeMenu();
        lc.navigateToMenuDailyNeeds();
        act.sendKeys(Keys.PAGE_DOWN);
        act.moveToElement(meat).perform();
        WebElement hoverText = Driver.getDriver().findElement(By.xpath("//*[@id=\"__next\"]/div/div[1]/div[1]/div[2]/div[2]/div/div[1]/div[1]/button"));
        String text = hoverText.getText();
        if (text.equals("View More")) {
            System.out.println("Hover text doğrulandı");
        } else {
            System.out.println("Hover text doğrulanamadı");
        }

    }

    public void meat() throws InterruptedException {
        lc.clickHomeMenu();
        lc.navigateToMenuDailyNeeds();
        meat.click();
        beef.click();
        List<WebElement> elements = Driver.getDriver().findElements(By.xpath("//span[.='Add']"));
        for (WebElement element : elements) {
            element.click();
        }

        WebElement cardSize = Driver.getDriver().findElement(By.xpath("(//span[.='6'])[1]"));
        sf.assertEquals(cardSize.getText(), elements.size());
        homePage.click();

    }


    public void meatDisplayed() throws InterruptedException {
        lc.clickHomeMenu();
        lc.navigateToMenuDailyNeeds();
        meat.click();
        sf.assertTrue(Driver.getDriver().getTitle().contains("meat"));
        homePage.click();


    }

    @FindBy(xpath = "//h3[.='Fruits']")
    private WebElement fruits;
    @FindBy(xpath = "//h3[.='Citrus']")
    private WebElement citrus;

    public void fruitkHover() throws InterruptedException {
        lc.clickHomeMenu();
        lc.navigateToMenuDailyNeeds();
        act.sendKeys(Keys.PAGE_DOWN);
        act.moveToElement(fruits).perform();
        WebElement hoverText = Driver.getDriver().findElement(By.xpath("//*[@id=\"__next\"]/div/div[1]/div[1]/div[2]/div[2]/div/div[1]/div[1]/button"));
        String text = hoverText.getText();
        if (text.equals("View More")) {
            System.out.println("Hover text doğrulandı");
        } else {
            System.out.println("Hover text doğrulanamadı");
        }

    }

    public void fruitDisplayed() throws InterruptedException {
        lc.clickHomeMenu();
        lc.navigateToMenuDailyNeeds();
        fruits.click();
        sf.assertTrue(fruits.isDisplayed());
        homePage.click();
    }

    public void fruits() throws InterruptedException {
        lc.clickHomeMenu();
        lc.navigateToMenuDailyNeeds();
        fruits.click();
        citrus.click();
        List<WebElement> elements = Driver.getDriver().findElements(By.xpath("//span[.='Add']"));
        for (WebElement element : elements) {
            element.click();
        }

        WebElement cardSize = Driver.getDriver().findElement(By.xpath("(//span[.='6'])[1]"));
        sf.assertEquals(cardSize.getText(), elements.size());
        homePage.click();

    }

    @FindBy(xpath = "(//h3)[6]")
    private WebElement fish;
    @FindBy(xpath = "//h3[.='Farmed Fish']")
    private WebElement farmedFish;

    public void fishHover() throws InterruptedException {
        lc.clickHomeMenu();
        lc.navigateToMenuDailyNeeds();
        act.sendKeys(Keys.PAGE_DOWN);
        act.moveToElement(fish).perform();
        WebElement hoverText = Driver.getDriver().findElement(By.xpath("//*[@id=\"__next\"]/div/div[1]/div[1]/div[2]/div[2]/div/div[1]/div[1]/button"));
        String text = hoverText.getText();
        if (text.equals("View More")) {
            System.out.println("Hover text doğrulandı");
        } else {
            System.out.println("Hover text doğrulanamadı");
        }

    }

    public void fishDisplayed() throws InterruptedException {
        lc.clickHomeMenu();
        lc.navigateToMenuDailyNeeds();
        fish.click();
        sf.assertTrue(fruits.isDisplayed());
        homePage.click();
    }

    public void fish() throws InterruptedException {
        lc.clickHomeMenu();
        lc.navigateToMenuDailyNeeds();
        fish.click();
        farmedFish.click();
        List<WebElement> elements = Driver.getDriver().findElements(By.xpath("//span[.='Add']"));
        for (WebElement element : elements) {
            element.click();
        }

        WebElement cardSize = Driver.getDriver().findElement(By.xpath("(//span[.='6'])[1]"));
        sf.assertEquals(cardSize.getText(), elements.size());
        homePage.click();


    }

    @FindBy(xpath = "//*[@id=\"__next\"]/div/div[1]/div[1]/div[2]/div[2]/div/div[7]/div[1]/button")
    private WebElement dairyEggs;
    @FindBy(xpath = "//h3[.='Eggs']")
    private WebElement eggs;
    @FindBy(xpath = "//h3[.='Brown Eggs']")
    private WebElement brEggs;

    public void dairyEggs() throws InterruptedException {
        lc.clickHomeMenu();
        lc.navigateToMenuDailyNeeds();
        dairyEggs.click();
        eggs.click();
        brEggs.click();
        List<WebElement> elements = Driver.getDriver().findElements(By.xpath("//span[.='Add']"));
        for (WebElement element : elements) {
            element.click();
        }

        WebElement cardSize = Driver.getDriver().findElement(By.xpath("(//span[.='6'])[1]"));
        sf.assertEquals(cardSize.getText(), elements.size());
        homePage.click();

        // sf.assertTrue(Driver.getDriver().getTitle().contains("Dairy"));
        //homePage.click();
    }

    public void dairyDisplayed() throws InterruptedException {
        lc.clickHomeMenu();
        lc.navigateToMenuDailyNeeds();
        dairyEggs.click();
        sf.assertTrue(dairyEggs.isDisplayed());
        homePage.click();

    }

    public void dairyEggsView() throws InterruptedException {
        lc.clickHomeMenu();
        lc.navigateToMenuDailyNeeds();
        dairyEggs.click();
        act.sendKeys(Keys.PAGE_DOWN);
        act.moveToElement(dairyEggs).perform();
        WebElement hoverText = Driver.getDriver().findElement(By.xpath("//*[@id=\"__next\"]/div/div[1]/div[1]/div[2]/div[2]/div/div[1]/div[1]/button"));
        String text = hoverText.getText();
        if (text.equals("View More")) {
            System.out.println("Hover text doğrulandı");
        } else {
            System.out.println("Hover text doğrulanamadı");
        }

    }


    @FindBy(xpath = "//h3[.='Bakery']")
    private WebElement bakery;
    @FindBy(xpath = "//h3[.='Cookies']")
    private WebElement cookies;

    public void bakeryHover() throws InterruptedException {
        lc.clickHomeMenu();
        lc.navigateToMenuDailyNeeds();
        act.sendKeys(Keys.PAGE_DOWN);
        act.moveToElement(bakery).perform();
        WebElement hoverText = Driver.getDriver().findElement(By.xpath("//*[@id=\"__next\"]/div/div[1]/div[1]/div[2]/div[2]/div/div[1]/div[1]/button"));
        String text = hoverText.getText();
        if (text.equals("View More")) {
            System.out.println("Hover text doğrulandı");
        } else {
            System.out.println("Hover text doğrulanamadı");
        }

    }

    public void bakeryDisplayed() throws InterruptedException {
        lc.clickHomeMenu();
        lc.navigateToMenuDailyNeeds();
        bakery.click();
        sf.assertTrue(Driver.getDriver().getTitle().contains("Bakery"));
        homePage.click();
    }

    public void bakery() throws InterruptedException {
        lc.clickHomeMenu();
        lc.navigateToMenuDailyNeeds();
        bakery.click();
        cookies.click();
        List<WebElement> elements = Driver.getDriver().findElements(By.xpath("//span[.='Add']"));
        for (WebElement element : elements) {
            element.click();
        }

        WebElement cardSize = Driver.getDriver().findElement(By.xpath("(//span[.='6'])[1]"));
        sf.assertEquals(cardSize.getText(), elements.size());
        homePage.click();
    }



}


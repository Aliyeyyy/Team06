package Team06.pages.US12_Pages;

import Team06.pages.AbstactClass;
import Team06.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.util.List;

public class US12_TC01_MakeupOrder extends AbstactClass {

    public US12_TC01_MakeupOrder() {

        PageFactory.initElements(Driver.getDriver(), this);


    }

    @FindBy(xpath="(//div[@class='relative inline-block ltr:text-left rtl:text-right'])[1]")
    public WebElement menuBTn;
    public void menubuton(){

        wait.until(ExpectedConditions.elementToBeClickable(menuBTn)).click();
    }

    @FindBy(xpath = "//a[@href='/makeup']")
    public WebElement makeup;

    @FindBy(xpath = "//input[@placeholder='Search your products from here']")
    public WebElement searchBtn;

    @FindBy(xpath = "//div[contains(@role,'button')]//img")
    public List<WebElement> urunListesi;


    @FindBy(xpath = "(//span[contains(text(),'Cart')])[1]//parent::button")
    public WebElement firstItemCart;


    //urun stok miktari fazlasi eklenecek olan urun
    @FindBy(xpath="(//div[@class='relative flex h-48 w-auto items-center justify-center sm:h-64'])[2]")
    public WebElement Eklencekurun;

    //ürüne tıklandıktan sonra acılan sayfadaki stok miktari
    @FindBy(xpath="(//div[@class='mt-6 flex flex-col items-center md:mt-6 lg:flex-row']//span)[3]")
    public WebElement Urunstokmiktari;

    //textten alınan string ifadedeki sayı bölümü alınıp int cevrildi

    public int intStokMiktari(){
        String text=Urunstokmiktari.getText();
        return Integer.valueOf(text.replaceAll("\\D",""));

    }

    //ürüne tıklandıktan sonra acılan sayfadaki add to shoping cart bölümü
    @FindBy(xpath="//div[@class='mb-3 w-full lg:mb-0 lg:max-w-[400px]']")
    public WebElement AddCart;
    public void btnAddToShopingCart(){

        wait.until(ExpectedConditions.elementToBeClickable(AddCart)).click();
    }

    //ürüne tıklandıktan sonra acılan sayfadaki plus bölümü
    @FindBy(xpath="(//button[@class='cursor-pointer p-2 transition-colors duration-200 hover:bg-accent-hover focus:outline-none px-5'])[4]")
    public WebElement arti;
    public void plusBtn(){
        wait.until(ExpectedConditions.elementToBeClickable(arti)).click();
    }

    //ürüne tıklandıktan sonra acılan sayfadaki eklenen ürün miktari
    @FindBy(xpath = "(//div[contains(@class,'text-sm font-semibold')])[3]")
    public WebElement eklenenUrunMiktari;

    //textten alınan string ifadedeki sayı bölümü alınıp int cevrildi
    public int intEklenenUrunMiktari(){

        String text=eklenenUrunMiktari.getText();

        return Integer.valueOf(text);

    }






}

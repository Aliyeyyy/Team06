package Team06.pages.US15_Pages;

import Team06.pages.AbstactClass;
import Team06.utilities.Driver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;


import java.util.List;

public class US015_BagsOperationPage extends AbstactClass {

    WebDriver driver = Driver.getDriver();
    public US015_BagsOperationPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//div[contains(@role,'button')]//img")
    public List<WebElement> urunListesi;

    //1sayfadaki 12. urunu gider ve tıklar.Not:0. index ürün değil başlık menüsü
    public void btnUrun(){
        Actions actions = new Actions(driver);
        actions.scrollToElement(urunListesi.get(12)).perform();
        actions.click(urunListesi.get(12)).perform();
    }

    @FindBy(xpath = "//div[contains(@class,'items-start justify-between')]//button")
    public WebElement favoriKalp;

    //1sayfadaki 1. urunu gider ve tıklar.Not:0. index ürün değil başlık menüsü
    public void btnFavoriKalp(){
        wait.until(ExpectedConditions.elementToBeClickable(favoriKalp)).click();
    }

    //ürüne tıklandıktan sonra acılan sayfadaki details bölümü
    @FindBy(xpath = "//div[contains(@class,'items-start justify-between')]//button")
    public WebElement detailstxt;

//ürüne tıklandıktan sonra acılan sayfadaki plus bölümü
    @FindBy(xpath = "(//button[@class='cursor-pointer p-2 transition-colors duration-200 hover:bg-accent-hover focus:outline-none px-5'])[4]")
    public WebElement urunsecimiSonrasiPlus;
    public void btnUrunsecimiSonrasiPlus(){
        wait.until(ExpectedConditions.elementToBeClickable(urunsecimiSonrasiPlus)).click();
    }


//ürüne tıklandıktan sonra acılan sayfadaki add to shoping cart bölümü
    @FindBy(xpath = "//div[@class='mb-3 w-full lg:mb-0 lg:max-w-[400px]']")
    public WebElement addToShopingCart;

    public void btnAddToShopingCart(){
        wait.until(ExpectedConditions.elementToBeClickable(addToShopingCart)).click();
    }

//ürüne tıklandıktan sonra acılan sayfadaki stok miktari
    @FindBy(xpath = "(//div[@class='mt-6 flex flex-col items-center md:mt-6 lg:flex-row']//span)[3]")
    public WebElement stokMiktari;

    //textten alınan string ifadedeki sayı bölümü alınıp int cevrildi
    public int intStokMiktari(){
        String text=stokMiktari.getText();
       return Integer.valueOf(text.replaceAll("\\D",""));

    }

//ürüne tıklandıktan sonra acılan sayfadaki eklenen ürün miktari
    @FindBy(xpath = "(//div[contains(@class,'text-sm font-semibold')])[3]")
    public WebElement acilanSayfadakineklenenUrunMiktari;

    //textten alınan string ifadedeki sayı bölümü alınıp int cevrildi
    public int intEklenenUrunMiktari(){
        String text=acilanSayfadakineklenenUrunMiktari.getText();
       return Integer.valueOf(text);

    }


    //ürüne tıklandıktan sonra acılan sayfadaki fiyat
    @FindBy(xpath = "//del[contains(@class,' font-normal text-muted ltr:ml-2 rtl:mr-2 md')]")
    public WebElement fiyat;



    //ürüne tıklandıktan sonra acılan sayfadaki indirimli fiyat
    @FindBy(xpath = "//ins[contains(@class,'font-semibold text-accent no-underline md')]")
    public WebElement indirimliFiyat;

 //ürüne tıklandıktan sonra acılan sayfadaki indirimli oranı
    @FindBy(xpath = "//div[contains(@class,' text-xs font-semibold leading-6 text-light ltr:ml')]")
    public WebElement indirimOrani;



 //ürüne tıklandıktan sonra acılan sayfadaki ürünün resmi
    @FindBy(xpath = "//img[contains(@class,'ltr:ml-auto rtl:mr-auto')]")
    public WebElement urunSayfasindakiResim;






}

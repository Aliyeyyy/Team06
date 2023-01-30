package Team06.pages.US10_Pages;

import Team06.pages.AbstactClass;
import Team06.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;

import java.util.List;

public class US010_MakeUpOperation extends AbstactClass {

    public US010_MakeUpOperation() {

        PageFactory.initElements(Driver.getDriver(), this);


    }


    public void urunaramauruntiklama(){
        searchBtn.click();
        searchBtn.sendKeys("Mascara"+Keys.ENTER);
        urun.click();
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

    @FindBy(xpath="//div[contains(@class,'items-start justify-between')]//button")
    public WebElement kalp;
    public void btnKalp(){

        wait.until(ExpectedConditions.elementToBeClickable(kalp)).click();
    }

    @FindBy(xpath = "//div[@class='os-size-auto-observer observed']")
    public WebElement kategori;

    @FindBy(xpath="(//div[@class='relative flex h-48 w-auto items-center justify-center sm:h-64'])[1]")
    public WebElement urun;

    @FindBy(xpath="//h3[.='Lancome Definicils Mascara']")
    public WebElement urunlink;

    @FindBy(xpath="//div[@id='headlessui-dialog-panel-23']")
    public WebElement urunsayfa;

    @FindBy(xpath="//div[contains(@class,' text-xs font-semibold leading-6 text-light ltr:ml')]")
    public WebElement indirimyuzdesi;

    @FindBy(xpath="//del[contains(@class,' font-normal text-muted ltr:ml-2 rtl:mr-2 md')]")
    public WebElement fiyat;


    @FindBy(xpath="//ins[contains(@class,'font-semibold text-accent no-underline md')]")
    public WebElement indirimlifiyat;

    @FindBy(xpath = "//div[contains(@class,'items-start justify-between')]//button")
    public WebElement details;

    //urun stok miktari fazlasi eklenecek olan urun
    @FindBy(xpath="(//div[@class='relative flex h-48 w-auto items-center justify-center sm:h-64'])[2]")
    public WebElement eklencekurun;

    //ürüne tıklandıktan sonra acılan sayfadaki stok miktari
    @FindBy(xpath="(//div[@class='mt-6 flex flex-col items-center md:mt-6 lg:flex-row']//span)[3]")
    public WebElement urunstokmiktari;

    //textten alınan string ifadedeki sayı bölümü alınıp int cevrildi

    public int intStokMiktari(){
        String text=urunstokmiktari.getText();
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





    WebDriver ldriver=Driver.getDriver();
    Actions action =new Actions(ldriver);


    public boolean image(){

        List<WebElement> urunelementleri=Driver.getDriver().findElements(By.xpath("//img[@class='product-image']"));
        List<WebElement>resimsayisi=Driver.getDriver().findElements(By.xpath("//img[starts-with(@alt,'Product')]"));
        boolean flag =true;

        for(int i =0; i<urunelementleri.size() ;i++){

            urunelementleri.get(i).click();

            if(resimsayisi.size()<2){//en az 2 resim olmali
                flag=false;
                break;
            }

            action.sendKeys(Keys.ESCAPE).perform();//if dongusune girmezse geri gelip diger elmente tiklamali
        }
        return flag;
    }





}

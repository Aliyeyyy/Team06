package US15_Test;

import Team06.pages.US15_Pages.US015_BagsOperationPage;
import Team06.pages.US16_Pages.US016_UrUnMiktariPage;
import Team06.utilities.BaseTestReport;
import Team06.utilities.Driver;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class US015_BagsOperation extends BaseTestReport {


    @Test
    public void test_US015_TC01_BagsUrunFavoriEkleme() throws InterruptedException {

        extentTest = extentReports.createTest("test_US015_TC01_BagsUrunFavoriEkleme");

        US016_UrUnMiktariPage ump = new US016_UrUnMiktariPage();
        US015_BagsOperationPage bop = new US015_BagsOperationPage();



        ump.loginCustomer();
        Thread.sleep(3000);

        //Bags seçilir
        ump.btnSelectBags();
        //ürüne gidilir ve tıklanır
        bop.btnUrun();

        //favori kalp butonuna tıklanır
        bop.btnFavoriKalp();

        //butonun aktif oldugunu kontrol eder
        SoftAssert softAssert = new SoftAssert();
        softAssert.assertTrue(bop.favoriKalp.isSelected());

        //favori kalp butonuna tekrar tıklanır ve favorilerden kaldırılır
        bop.btnFavoriKalp();



    }


    @Test
    public void test_US015_TC02_urunKategorileriniGoruntuleyebilmelidir(){

        extentTest = extentReports.createTest("test_US015_TC02_urunKategorileriniGoruntuleyebilmelidir");

        US016_UrUnMiktariPage ump = new US016_UrUnMiktariPage();

        Driver.getDriver().get("https://shop-pickbazar-rest.vercel.app/");

        //Bags seçilir
        ump.btnSelectBags();

        //kategori Bags oldugu kontrol eder
        SoftAssert softAssert = new SoftAssert();
        softAssert.assertTrue(ump.groceryDropdown.getText().contains("Bags"));



    }

    @Test
    public void test_US015_TC03_bagsUrunStogundanFazlaEklemeYapamamalidir() {

        extentTest = extentReports.createTest("test_US015_TC03_bagsUrunStogundanFazlaEklemeYapamamalidir");

        US016_UrUnMiktariPage ump = new US016_UrUnMiktariPage();
        US015_BagsOperationPage bop = new US015_BagsOperationPage();

        Driver.getDriver().get("https://shop-pickbazar-rest.vercel.app/");


        //Bags seçilir
        ump.btnSelectBags();

        // ürüne gidilir ve tıklanır
        bop.btnUrun();

        //acılan sayfadaki sepete ekleme butonuna tıklıyoruz
        bop.btnAddToShopingCart();

        try {


            //sepere ekleme ile ürüm miktarının fazlası tıklayınca exception veriyor
            for (int i = 0; i < (bop.intStokMiktari() + 1); i++) {
                bop.btnUrunsecimiSonrasiPlus();
            }
        } catch (Exception e) {
            System.out.println("Ürün miktarı daha stok miktarından fazla tıklandı");
        }

        //butonun aktif oldugunu kontrol eder
        SoftAssert softAssert = new SoftAssert();
        softAssert.assertEquals(bop.intStokMiktari(), bop.intEklenenUrunMiktari());

        //ürün sayfası kapatılır
        Actions act = new Actions(Driver.getDriver());
        act.sendKeys(Keys.ESCAPE).perform();


    }


    @Test
    public void test_US015_TC04_bagsDetailsBolumundeUrunAyrintiliBilgiGormelidir()  {

        extentTest = extentReports.createTest("test_US015_TC04_bagsDetailsBolumundeUrunAyrintiliBilgiGormelidir");
        US016_UrUnMiktariPage ump = new US016_UrUnMiktariPage();
        US015_BagsOperationPage bop = new US015_BagsOperationPage();

        Driver.getDriver().get("https://shop-pickbazar-rest.vercel.app/");

        //Bags seçilir
        ump.btnSelectBags();

        //  gidilir ve tıklanır
        bop.btnUrun();

        //butonun aktif oldugunu kontrol eder
        SoftAssert softAssert = new SoftAssert();
        softAssert.assertTrue(bop.detailstxt.isDisplayed());

        //ürün sayfasından cıkış yapılır
        Actions act = new Actions(Driver.getDriver());
        act.sendKeys(Keys.ESCAPE).perform();



    }

    @Test
    public void test_US015_TC06_urunGorebilmekIcinScrollYapmalidir() {

        extentTest = extentReports.createTest("test_US015_TC06_urunGorebilmekIcinScrollYapmalidir");

        US016_UrUnMiktariPage ump = new US016_UrUnMiktariPage();
        US015_BagsOperationPage bop = new US015_BagsOperationPage();

        Driver.getDriver().get("https://shop-pickbazar-rest.vercel.app/");

        //Bags seçilir
        ump.btnSelectBags();

        //scrol ile alttaki ürüne gidilir ürüne gidilir ve tıklanır
        bop.btnUrun();


        //ürünün görüntülendiğini dogrular
        SoftAssert softAssert = new SoftAssert();
        softAssert.assertTrue(bop.urunListesi.get(13).isDisplayed());



    }

    @Test
    public void test_US015_TC07_IndirimVarsaFiyatiIndirimliFiyatIndirimOraniGormelidir(){

        extentTest = extentReports.createTest("test_US015_TC07_IndirimVarsaFiyatiIndirimliFiyatIndirimOraniGormelidir");

        US016_UrUnMiktariPage ump = new US016_UrUnMiktariPage();
        US015_BagsOperationPage bop = new US015_BagsOperationPage();

        Driver.getDriver().get("https://shop-pickbazar-rest.vercel.app/");

        //Bags seçilir
        ump.btnSelectBags();

        // ürüne gidilir ürüne gidilir ve tıklanır
        bop.btnUrun();

        //ürünün fiyatı
        SoftAssert softAssert = new SoftAssert();
        softAssert.assertTrue(bop.fiyat.isDisplayed());

        //ürünün indirimli fiyatı
        softAssert.assertTrue(bop.indirimliFiyat.isDisplayed());

        //ürünün indirimOranı
        softAssert.assertTrue(bop.indirimOrani.isDisplayed());

        //ürün sayfasından cıkış yapılır
        Actions act = new Actions(Driver.getDriver());
        act.sendKeys(Keys.ESCAPE).perform();




    }


    @Test
    public void test_US015_TC08_urunLinkineTiklayarakUrunSayfasinaGidebilmelidir(){

        extentTest = extentReports.createTest("test_US015_TC08_urunLinkineTiklayarakUrunSayfasinaGidebilmelidir");

        US016_UrUnMiktariPage ump = new US016_UrUnMiktariPage();
        US015_BagsOperationPage bop = new US015_BagsOperationPage();

        Driver.getDriver().get("https://shop-pickbazar-rest.vercel.app/");

        //Bags seçilir
        ump.btnSelectBags();

        //ürüne gidilir ve tıklanır
        bop.btnUrun();

        //acılan sayfa doğrulanır
        SoftAssert softAssert = new SoftAssert();
        softAssert.assertTrue(bop.urunSayfasindakiResim.isDisplayed());

        //ürün sayfasından cıkış yapılır
        Actions act = new Actions(Driver.getDriver());
        act.sendKeys(Keys.ESCAPE).perform();


    }


}

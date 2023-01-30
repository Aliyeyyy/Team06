package US12_Test;


import Team06.pages.US16_Pages.US016_UrUnMiktariPage;
import Team06.utilities.BaseTestReport;
import Team06.utilities.Driver;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class US12_TC04_SepetteUrunBirimVeToplamFiyatiniGörmeli extends BaseTestReport {


    @Test
    public void testUS12_TC04_SepetteUrunBirimVeToplamFiyatiniGormeli() {

        extentTest = extentReports.createTest("testUS12_TC04_SepetteUrunBirimVeToplamFiyatiniGormeli");
        US016_UrUnMiktariPage ump = new US016_UrUnMiktariPage();



        Driver.getDriver().get("https://shop-pickbazar-rest.vercel.app/");



        //kategori seçilir
        ump.btnSelectMakeup();


        //sepete ekleme butonu aktif olan ilk ürünün butonu tıklanır
        ump.btnFirstItemCart();


        //sepete gidilir
        ump.btnCart();

        //Sepetteki ürün arttırmak için bir kere plus butonuna tıklanır
        ump.btnPlusSepet();

        //Sepetteki ürün miktarı kontrol edilir
        SoftAssert softAssert= new SoftAssert();
        softAssert.assertEquals(2,ump.sepetUrunEklemeSonuc());


        //Sepetteki birim fiyatın göründüğünü  kontrol edilir
        softAssert.assertTrue(ump.sepetBirimFiyat.isDisplayed());

        //Sepetteki toplam fiyatın göründüğünü  kontrol edilir
        softAssert.assertTrue(ump.sepetToplamFiyat.isDisplayed());


        //Sepetteki birim fiyat toplam fiyata doğrulugu kontrol eder
        softAssert.assertEquals(ump.floatSepetBirimFiyat()*2, ump.floatSepetToplamFiyat());


        //sepet kapatma butonu
        ump.btnCloseCart();


    }
}

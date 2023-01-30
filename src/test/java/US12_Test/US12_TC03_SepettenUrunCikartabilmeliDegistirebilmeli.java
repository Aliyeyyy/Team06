package US12_Test;


import Team06.pages.US16_Pages.US016_UrUnMiktariPage;
import Team06.utilities.BaseTestReport;
import Team06.utilities.Driver;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class US12_TC03_SepettenUrunCikartabilmeliDegistirebilmeli extends BaseTestReport {


    @Test
    public void testUS12_TC03_SepettenUrunCikartabilmeliDegistirebilmeli() {

        extentTest = extentReports.createTest("testUS12_TC03_SepettenUrunCikartabilmeliDegistirebilmeli");
        US016_UrUnMiktariPage ump = new US016_UrUnMiktariPage();


        Driver.getDriver().get("https://shop-pickbazar-rest.vercel.app/");


        //Kategori seçilir
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

        //Sepetteki ürün bir azaltmak için bir kere minus butonuna tıklanır
        ump.btnMinusSepet();

        //Sepetteki ürün miktarı kontrol edilir
        softAssert.assertEquals(1,ump.sepetUrunEklemeSonuc());


        //sepet kapatma butonu
        ump.btnCloseCart();



    }
}

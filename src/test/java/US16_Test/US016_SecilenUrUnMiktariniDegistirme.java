package US16_Test;

import Team06.pages.US16_Pages.US016_UrUnMiktariPage;
import Team06.utilities.BaseTestReport;
import Team06.utilities.Driver;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class US016_SecilenUrUnMiktariniDegistirme extends BaseTestReport {


    @Test
    public void test_US016_TC01_SayfadaSecilenUrunMiktariniDegistirme() throws InterruptedException {

        extentTest = extentReports.createTest("test_US016_TC01_SayfadaSecilenUrunMiktariniDegistirme");
        US016_UrUnMiktariPage ump =new US016_UrUnMiktariPage();

       // ump.Login();
        ump.loginCustomer();
        Thread.sleep(3000);
        //Bags seçilir
        ump.btnSelectBags();
        //sepete ekleme butonu aktif olan ilk ürünün butonu tıklanır
        ump.btnFirstItemCart();

        //ürün arttırmak için bir kere plus butonuna tıklanır
        ump.btnPlusSayfa();

        //ürün miktarı kontrol edilir
        SoftAssert softAssert= new SoftAssert();
        softAssert.assertEquals(2,ump.sayfaUrunEklemeSonuc());

        //kullanıcı cıkış
        ump.logoutCustomer();

        //driver kapat
        Driver.getDriver().quit();


    }


    @Test
    public void test_US016_TC02_sepettekiUrunMiktariniDegistirme() throws InterruptedException {

        US016_UrUnMiktariPage ump =new US016_UrUnMiktariPage();


        // ump.Login();
        ump.loginCustomer();
        Thread.sleep(3000);
        //Bags seçilir
        ump.btnSelectBags();
        //sepete ekleme butonu aktif olan ilk ürünün butonu tıklanır
        ump.btnFirstItemCart();

        //sepete gidilir
        ump.btnCart();

        //Sepetteki ürün arttırmak için bir kere plus butonuna tıklanır
        ump.btnPlusSepet();

        //Sepetteki ürün miktarı kontrol edilir
        SoftAssert softAssert= new SoftAssert();
        softAssert.assertEquals(2,ump.sepetUrunEklemeSonuc());

        //sepet kapatma butonu
        ump.btnCloseCart();

        //kullanıcı cıkış
        ump.logoutCustomer();

        //driver kapat
        Driver.getDriver().quit();


    }


}

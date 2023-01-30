package US07_Tests;

import Team06.pages.US07_Pages.US007_HomePageJoinProfil;
import Team06.utilities.BaseTestReport;
import Team06.utilities.Driver;
import org.testng.annotations.Test;

public class US007_HomePageJoinProfilTest extends BaseTestReport {

    US007_HomePageJoinProfil hp= new US007_HomePageJoinProfil();



    @Test
    public void joinProfilTest(){

        //Kullanıcı Url'e gider
        Driver.getDriver().get("https://shop-pickbazar-rest.vercel.app/");

        //Kullanıcı join e tıklar
        hp.loginCustomer();

        //Kullanıcı Profil simgesine tıklar
        hp.hesabim.click();

        //Kullanıcı Profil seçeneğine tıklar
        hp.profilim.click();

        //Kullanıcı Name i Düzenler
        hp.name.clear();
        hp.name.sendKeys("ahmetSelim");


        //Kullanıcı Bıografisine işlem girer
        hp.bio.sendKeys("Hello Papa");

        //Kullanıcı düzenlemeleri kaydetmek için save butonuna tıklar
        hp.saveButton.click();
        Driver.getDriver().switchTo().alert().accept();

        //Kullanıcı Change passworda tıklar
        hp.changePassword.click();

        //Kullanıcı eski şifreyi girer
        hp.oldPassword.sendKeys("123456");

        //Kullanıcı Yeni şifreyi girer
        hp.newPassword.sendKeys("234567");

        //Kullanıcı Yeni şifreyi tekrar girer
        hp.confirmPassword.sendKeys("234567");

        //Kullanıcı Submit butonuna tıklar
        hp.submitButton.click();
        Driver.getDriver().switchTo().alert().accept();

        //Kullanıcı My orders butonuna tıklar
        hp.myOrders.click();

        //Kullanıcı My wishlist butonuna tıklar
        hp.myWishlists.click();
        //Kullanıcı Mywishlistten Remove butonuyla ürünü kaldırır
        hp.remove.click();

        //Kullanıcı Logout olur
        hp.logout.click();



    }


}

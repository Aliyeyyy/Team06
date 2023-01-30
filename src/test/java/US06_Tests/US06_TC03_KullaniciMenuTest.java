package US06_Tests;

import Team06.pages.US06_Pages.US06_TC03_KullaniciMenu;
import Team06.utilities.BaseTestReport;
import Team06.utilities.Driver;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class US06_TC03_KullaniciMenuTest extends BaseTestReport {
    US06_TC03_KullaniciMenu km=new US06_TC03_KullaniciMenu();
     WebDriver driver = Driver.getDriver();
    @Test
    public void menuTest(){
        extentTest=extentReports.createTest("menuTest","menu secenekleri goruntulenir");
        //driver.get("https://shop-pickbazar-rest.vercel.app/");
        //Kullanıcı login olur
        km.loginCustomer();

        //Kullanıcı avatara tıklar
        km.userImage.click();
        //Menu seceneklerini görebildigini dogrular
        Assert.assertEquals(5,km.allMenuItems.size());
        //profil sekmesini tıklar
        km.profile.click();
        //profil sekmesine erisebildigini dogrular
        Assert.assertTrue(km.profileTrue.getText().contains("Profile"));
        //avatarı tıklar
        km.userImage.click();
        //my orders sekmesini tıklar
        km.myOrders.click();
        //my orders sekmesine erisebildigini dogrular
        Assert.assertTrue(km.myOrdersTrue.getText().contains("My Orders"));
        //avatarı tıklar
        km.userImage.click();
        //my wishlist sekmesini tıklar
        km.myWishlists.click();
        //my wishliste erisebildigini dogrular
        Assert.assertTrue(km.myWishlistsTrue.getText().contains("My Wishlists"));
        //avatarı tıklar
        km.userImage.click();
        //checkout sekmesini tıklar
        km.checkout.click();
        //checkout sekmesine erisebildigini dogrular
        Assert.assertTrue(km.yourOrder.getText().contains("Your Order"));
        //avatarı tıklar
        km.userImage.click();
        //logout sekmesini tıklar
        km.logout.click();
        //logout yapabildigini dogrular
        Assert.assertTrue(km.loginWithEmailAndPassword.getText().contains("Login with your email & password"));

    }
}

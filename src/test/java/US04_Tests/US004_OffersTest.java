package US04_Tests;

import Team06.pages.US04_Pages.US004_Offers;
import Team06.utilities.BaseTestReport;
import Team06.utilities.Driver;
import org.testng.annotations.Test;

public class US004_OffersTest extends BaseTestReport {

    US004_Offers offer= new US004_Offers();

    @Test
    public void offerTest(){

        //Kullanıcı URL ye gider
        Driver.getDriver().get("https://shop-pickbazar-rest.vercel.app/");

        //Kullanıcı join e tıklar
        offer.joinButton.click();
        offer.loginButton.click();

        //Kullanıcı kategorilerden bags e tıklar

        offer.menuBUtton.click();
        offer.bagsButton.click();

        //Kullanıcı bir ürün secip sepete ekler
        offer.cart.click();

        //Kullanıcı Offers butonuna tıklar
        offer.offers.click();


        //Kullanıcı copy butonlarından birine tıklar tıklar
        offer.copy.click();

        //Kullanıcı sepetine gider
        offer.basket.click();

        //Kullanıcı checkout butonuna tıklar
        offer.checkout.click();

        //Kullanıcı Check Availability butonuna tıklar
        offer.checkAvailability.click();


        //Kullanıcı Do you have coupon butonuna tıklar
        offer.coupon.click();

        //Kullanıcı kupon kodunu girip apply butonuna tıklar
        offer.enterCoupon.click();
        offer.enterCoupon.sendKeys("HELLO15");

        offer.apply.click();


        //Kullanıcı place order butonuna tıklar
        offer.placeOrder.click();

        //Kullanıcı pay butona tıklar
        offer.payButton.click();





    }
}

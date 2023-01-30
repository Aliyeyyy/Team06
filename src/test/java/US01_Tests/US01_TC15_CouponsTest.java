package US01_Tests;

import Team06.pages.US01_Pages.US01_TC15_Coupons;

import Team06.utilities.BaseTestReport;
import Team06.utilities.Driver;
import org.junit.Test;

public class US01_TC15_CouponsTest extends BaseTestReport {


    US01_TC15_Coupons cp=new US01_TC15_Coupons();


    @Test
    public void couponTest (){
        extentTest = extentReports.createTest("US001-testCase015");
        //Kullanıcı login olur
        cp.loginSeller();

        //Kullanıcı coupons e tıklar
        cp.CouponsButton.click();

        //Kullanıcı add coupon butonuna tıklar
        cp.addCouponButton.click();

        //Kullanıcı coupon fotoğrafını jpg, png formatında yükler

        // cp.uploadImage.sendKeys("/Users/saidcetmi/IdeaProjects/Team06_TestNG_Project/CouponFoto.png");


        //Kullanıcı coupon kodunu girer
        cp.code.sendKeys("12345678-001");


        //Kullanıcı kupon bilgilerini girer
        cp.description.sendKeys("This weekend only special offer");

        //Kullanıcı coupon türünü seçer
        cp.fixed.click();


        //Kullanıcı couponun indirim tutarını girer
        cp.discount.clear();
        cp.discount.sendKeys("10");


        //Kullanıcı minimum alışveriş tutarını girer
        cp.minAmount.clear();
        cp.minAmount.sendKeys("50");

        //Kullanıcı kuponun başlangıç ve bitiş tarihini seçer
        cp.activeDate.clear();
        cp.activeDate.sendKeys("18/02/2023");
        cp.willDate.clear();
        cp.willDate.sendKeys("28/02/2023");


        //Kullanıcı add kupon butonuna tıklar
        cp.addCoupon.click();
        //Driver.getDriver().navigate().back();



    //Kullanıcı kuponu düzenlemek için kalem butonuna tıklar
        //cp.edit.click();

        //Kullanıcı kuponu silmek için silme butonuna tıklar
        //cp.delete.click();



    }




}

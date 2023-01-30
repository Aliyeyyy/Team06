package US05_Tests;

import Team06.pages.US05_Pages.US05_TC01_ShopsVisit;
import Team06.utilities.BaseTestReport;
import Team06.utilities.Driver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class US05_TC01_ShopsVisitTest extends BaseTestReport {

    @Test
    public void shopsTest(){
        extentTest=extentReports.createTest("shopsTest","alısveris senekleri");

        Driver.getDriver().get("https://shop-pickbazar-rest.vercel.app/");
        US05_TC01_ShopsVisit sv=new US05_TC01_ShopsVisit();
        //siteye gidildi
        sv.shops.click();
        // System.out.println(sv.shopsCenter.size());
        //Sitede butun alısveriş seceneklerinin görüntülendigi dogrulandı
        Assert.assertEquals(7,sv.shopsCenter.size());
        //kullanıcı furnite Shop a tıklandı
        sv.furnitureShop.click();
        //System.out.println(sv.information.size());
        //Furniture shop kısmında adress, phone ve website bilgilerinin görüntülendiği dogrulandı
        Assert.assertEquals(3,sv.information.size());


    }




}

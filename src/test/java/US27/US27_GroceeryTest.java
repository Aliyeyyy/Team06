package US27;

import Team06.pages.US28_Groceery.Groceery;
import Team06.utilities.BaseTestReport;
import Team06.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.List;

public class US27_GroceeryTest extends BaseTestReport {

    @Test
    public void groceeryTest() throws InterruptedException {
        extentTest = extentReports.createTest("US027-testCase01");


        //Kullanıcı URL gider
        Driver.getDriver().get("https://shop-pickbazar-rest.vercel.app/");
        Groceery gP= new Groceery();

        //Kullanıcı max 30 ürün görür
        gP.gorunenUrun();

        //Kullanıcı load butonununa basar
        //Kullanıcı daha fazla ürün görür
        gP.loadBttnclick();

    }

    @Test
    public void test(){
        extentTest = extentReports.createTest("US027-testCase02");

        //Kullanıcı URL gider
        Driver.getDriver().get("https://shop-pickbazar-rest.vercel.app/");
        Groceery gP= new Groceery();

        //Kullanıcı kategorileri görmelidir
        gP.kategorileriDogrula();


    }
}

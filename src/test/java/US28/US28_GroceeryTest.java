package US28;

import Team06.pages.US28_Groceery.Groceery;
import Team06.utilities.BaseTestReport;
import Team06.utilities.Driver;
import org.testng.annotations.Test;

public class US28_GroceeryTest {
 @Test
    public void test(){
 // extentTest = extentReports.createTest("US028-testCase01");

     //Kullanıcı URL gider
     Driver.getDriver().get("https://shop-pickbazar-rest.vercel.app/");
     Groceery gP= new Groceery();

     //Kullanıcı ürün fiyatını görür
     gP.fiyatDogrula();

     //Kullanıcı indirim oranını görür
     gP.indirimDogrula();

     //Kullanıcı ürün ilk fiyatını görür
     gP.eskiFiyatDogrrula();


 }

}

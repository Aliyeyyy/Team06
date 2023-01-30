package US01_Tests;

import Team06.pages.US01_Pages.US01_TC18_Questions;
import Team06.utilities.BaseTestReport;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class US01_TC18_QuestionsTest extends BaseTestReport {


    US01_TC18_Questions qp=new US01_TC18_Questions();

    @Test
    public void questionsTest(){
        extentTest = extentReports.createTest("US001-testCase018");

        //Kullanıcı login olur
        qp.loginSeller();

        //Kullanıcı questions e tıklar
        qp.questionsButton.click();



        //Kullanıcı soru soran müşterilerin bilgilerini görür
        SoftAssert softAssert=new SoftAssert();
        softAssert.assertTrue(qp.questionsButton.isDisplayed());


        //Kullanıcı soruları silmek için silme butonuna tıklar

        qp.deleteButton.click();

        qp.deleteButton2.click();

        softAssert.assertAll();


    }
}
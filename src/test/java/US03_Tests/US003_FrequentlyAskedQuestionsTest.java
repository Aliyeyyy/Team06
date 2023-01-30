package US03_Tests;

import Team06.pages.US03_Pages.US003_FrequentlyAskedQuestions;
import Team06.utilities.BaseTestReport;
import Team06.utilities.Driver;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class US003_FrequentlyAskedQuestionsTest extends BaseTestReport {


    US003_FrequentlyAskedQuestions faq= new US003_FrequentlyAskedQuestions();

    @Test
    public void faqTest(){

        //Kullanıcı URL ye gider
         Driver.getDriver().get("https://shop-pickbazar-rest.vercel.app/");

        //Kullanıcı FAQ butonuna tıklar
         faq.faqButton.click();

        //Kullanıcı sıkça sorulan dört soruyu goruntuler
        SoftAssert softAssert=new SoftAssert();
        softAssert.assertTrue(faq.question1.isDisplayed());
        softAssert.assertTrue(faq.question2.isDisplayed());
        softAssert.assertTrue(faq.question3.isDisplayed());
        softAssert.assertTrue(faq.question4.isDisplayed());


        //Kullanıcı + sembolune tıklayıp sorunun cevabını goruntuler
        faq.question1.click();
        faq.question2.click();
        faq.question3.click();
        faq.question4.click();
        faq.question4.click();

        softAssert.assertAll();








    }
}

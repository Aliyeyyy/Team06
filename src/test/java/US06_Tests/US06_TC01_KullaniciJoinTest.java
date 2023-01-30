package US06_Tests;

import Team06.pages.US06_Pages.US06_TC01_KullaniciJoin;
import Team06.utilities.BaseTestReport;
import Team06.utilities.Driver;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class US06_TC01_KullaniciJoinTest extends BaseTestReport {
   US06_TC01_KullaniciJoin jt = new US06_TC01_KullaniciJoin();
   WebDriver driver=Driver.getDriver();

   @Test
    public void joinTest() {
       extentTest=extentReports.createTest("joinTest","kullanıcı login olur");

       //driver.get("https://shop-pickbazar-rest.vercel.app/");
      jt.loginCustomer();
      Assert.assertTrue(jt.userImage.isDisplayed());
      jt.logoutCustomer();

   }
       @Test
       public void failEmailTest(){
           extentTest=extentReports.createTest("failEmailTest","kullanıcı yanlış email girer");

      driver.get("https://shop-pickbazar-rest.vercel.app/");
       jt.join.click();
       jt.emaillocate.click();
       jt.emaillocate.clear();
       jt.emaillocate.sendKeys(jt.faker.internet().emailAddress());
       jt.login.click();
       Assert.assertTrue(jt.noEnteredPage.getText().contains("The credentials was wrong!"));

   }
   @Test
    public void failPasswordTest(){
       extentTest=extentReports.createTest("failPasswordTest","kullanıcı yanlış password girer");

       driver.get("https://shop-pickbazar-rest.vercel.app/");
       jt.join.click();
       jt.password.click();
       jt.password.clear();
       jt.password.sendKeys(jt.faker.internet().password());
       jt.login.click();
       Assert.assertTrue(jt.forgotPassword.getText().contains("Forgot password?"));


   }
   @Test
    public void failTest(){
       extentTest=extentReports.createTest("failTest","kullanıcı yanlış password ve email girer");

       driver.get("https://shop-pickbazar-rest.vercel.app/");
       jt.join.click();
       jt.emaillocate.click();
       jt.emaillocate.clear();
       jt.emaillocate.sendKeys(jt.faker.internet().emailAddress());
       jt.password.click();
       jt.password.clear();
       jt.password.sendKeys(jt.faker.internet().password());
       jt.login.click();
       Assert.assertTrue(jt.noEnteredPage.getText().contains("The credentials was wrong!"));


   }


}

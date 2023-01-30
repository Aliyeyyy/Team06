package US01_Tests;

import Team06.pages.US01_Pages.US01_TC13_14_UsersPage;
import Team06.utilities.BaseTestReport;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.time.Duration;


public class US01_TC13_UsersTest extends BaseTestReport {

    US01_TC13_14_UsersPage user=new US01_TC13_14_UsersPage();
    @Test
    public void UsersTest () {

        extentTest = extentReports.createTest("US001-testCase013");
        //Kullanıcı login olur
        user.loginSeller();
        //Kullanıcı users e tıklar
        user.UsersButton.click();
        //kullanıcı müşteri eklemeye girer
        user.customerButton.click();

        //kullanıcı müşteri ismi girer
        user.name.sendKeys("fatih16");
        //kullanıcı müşteri emaili girer
        user.email.sendKeys("fatih1116@gmail.com");
        //kullanıcı müşteri sifresi girer
        user.password.sendKeys("1610616dfsd");
        // kullanıcı create customer butonuna tıklar
        user.createCustomer.click();
        // kullanıcı user butonuna tıklar
        user.UsersButton.click();
        user.wait.withTimeout(Duration.ofSeconds(8000));
        //Kullanıcı müşterinin eklendiğini doğrular
        Assert.assertTrue(user.fatih16.getText().contains("fatih16"));
    }

}
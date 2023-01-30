package US01_Tests;


import Team06.pages.US01_Pages.US01_TC13_14_UsersPage;
import Team06.utilities.BaseTestReport;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import java.time.Duration;

public class US01_TC14_UsersUptade extends BaseTestReport {

    US01_TC13_14_UsersPage user=new US01_TC13_14_UsersPage();
    @Test
    public void UsersTest () {
        extentTest = extentReports.createTest("US001-testCase014");
        //Kullanıcı login olur
        user.loginSeller();
        //Kullanıcı users e tıklar
        user.UsersButton.click();
        //Kullanıcı assign butonuna tıklar
        user.userassign.click();
        //Kullanıcı assign butonuna tıklar
        user.userassignYes.click();
        //kullanıcı durumunu değiştirdiğini doğrular
        Assert.assertTrue(user.active.isDisplayed());
        //kullanıcı cüzdan pointe tıklar
        user.walletPoint.click();
        //kullanıcı cüzdan pointe değer girer
        user.addPoint.sendKeys("10");
        //kullanıcı cüzdan pointe girdiği değeri kaydeder
        user.submintPoint.click();
        //kullanıcı cüzdan pointedeğerin arttiğını doğrular
        Assert.assertTrue(user.addPointup.getText().contains("110"));







    }

}

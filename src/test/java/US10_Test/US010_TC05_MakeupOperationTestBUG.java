package US10_Test;

import Team06.pages.HomePage;
import Team06.pages.US10_Pages.US010_MakeUpOperation;


import Team06.utilities.BaseTestReport;
import Team06.utilities.Driver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class US010_TC05_MakeupOperationTestBUG extends BaseTestReport {

    @Test
    public void testCase05() throws InterruptedException {

        extentTest = extentReports.createTest("US010-testCase05");

        HomePage hp = new HomePage();

        hp.loginCustomer();

        US010_MakeUpOperation make =new US010_MakeUpOperation();

        Thread.sleep(2000);

        make.menubuton();

        make.makeup.click();

        Thread.sleep(2000);

        make.image();

        Assert.assertEquals(1, 2);

        //urun baska resmi varmi dogruladik _BUG_RESIM YOK!!!

        Driver.getDriver().close();




    }



}

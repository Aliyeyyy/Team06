package US01_Tests;

import Team06.pages.HomePage;
import Team06.pages.US01_Pages.US01_TC06_GroupEdit;
import Team06.utilities.BaseTestReport;
import Team06.utilities.Driver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class US01_TC06_GroupEditTest extends BaseTestReport {

    @Test
    public void editGroup() throws InterruptedException {
        extentTest = extentReports.createTest("US001-testCase06");

    /*Us01_Editproduct pr = new Us01_Editproduct();

    pr.bsellerBtn.click();

    String homePageWindowHandle = ed.getWindowHandle();
    String secondPage = ed.getWindowHandle();
    Set<String> wh = ed.getWindowHandles();
    for (String each : wh) {
       ed.switchTo().window(each);
        if (each.equals(homePageWindowHandle)) {
            ed.close();
        }
    }

    //kullanici login olur

    pr.registerlogin.click();
    pr.adminlogin.click();*/

        HomePage hp = new HomePage();

        hp.loginSeller();

        //kullanici groups butonuna tiklar

        US01_TC06_GroupEdit group= new US01_TC06_GroupEdit();

        group.groupBtn.click();

        //kullanici add groups butonuna tiklar

        group.addGroupbtn.click();

        //kullanici acilan sayfada name girer

        group.firstname.sendKeys("bal");


        //Layout secer

        group.layout.isSelected();

        // product card secer

        group.card.isSelected();
        //Add Banner butonuna tikladik

        group.addBanner.click();

        //title girer

        group.title.sendKeys(hp.faker.lorem().sentence());

        //description girer

        group.description.sendKeys(hp.faker.lorem().paragraph());
        //Add Group butonunu basar

        group.AddGroup.click();



        //group ismi goruntuleniyormu dogruladik

        Assert.assertTrue(group.kontrol.isDisplayed());


        //kullanici kalem iconuna basar

        group.kalem.click();

        //duzenleme islemi yapilir

        group.firstname.clear();
        group.firstname.sendKeys("ballar");

        //kullanici update butonuna basar

        group.updategroup.click();

        //kullanici back tusuna basar

        group.back.click();

        //driveri kapat
        Driver.closeDriver();
    }

}

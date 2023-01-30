package US01_Tests;



import Team06.pages.US01_Pages.US01_TC09_Tags;
import Team06.utilities.BaseTestReport;
import Team06.utilities.Driver;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import static org.openqa.selenium.Keys.DOWN;
import static org.openqa.selenium.Keys.ENTER;

public class US01_TC09_TagTests extends BaseTestReport {


    //  1- Satıcı URL girer.//  2- Satıcı Login olur.
    @Test
    public void test(){
        extentTest = extentReports.createTest("US001-testCase01");
        US01_TC09_Tags pT =new US01_TC09_Tags();
        pT.loginSeller();

        //  Satıcı "Tags" bölümüne tıklar.
        pT.Tags.click();

        //  Satıcı "Add Tag" butonuna tıklar.
        pT.Add.click();

        //  Satıcı "unload an image" tıklar ve etiket fotoğrafı yüklemesi yapar.



        //  Satıcı  Tag "Name" girer.
        pT.name.sendKeys("İndirim");

        //  Satıcı "Details" bölümüne Tag/Etiket  açıklaması girer.
        pT.details.sendKeys("Bayrama özel indirimler sizleri bekliyor");

        //  Satıcı "Select Icon" sekmesinden eklediği taga uygun simge seçimi yapar
        WebElement sIcon= Driver.getDriver().findElement(By.xpath("(//div[@class=\" css-ackcql\"])[1]"));
        sIcon.click();
        Actions act=new Actions(Driver.getDriver());
        act.sendKeys(DOWN).perform();
        act.sendKeys(ENTER).perform();


        //  Satıcı "Types" sekmesinden eklediği tagına uygun türü seçer.
        WebElement Types= Driver.getDriver().findElement(By.xpath("(//div[@class=\" css-ackcql\"])[2]"));
        Types.click();
        Actions act1=new Actions(Driver.getDriver());
        act.sendKeys(DOWN).perform();
        act.sendKeys(ENTER).perform();



        //  Satıcı "Update Tag" butonuna basarak yaptığı güncellemeleri kaydeder.
        pT.addTag.click();

        //  Satıcı actions bölümünde "tag düzenleme" sekmesine tıklar.
        //pT.duzentButon.click();
        pT.addCategories("Bags",pT.duzentButon);

        //  Satıcı tag menüsünde ilgili düzenlemeyi yapar.
        pT.güncelName.clear();
        pT.güncelName.sendKeys("Kampanya");

        //  Satıcı "Update Tag" butonuna basarak yaptığı güncellemeleri kaydeder.
        pT.updateTag.click();

        //  Satıcı "Tags" bölümüne tıklar.

        pT.Tags1.click();

        // Satıcı silmek istediği tagın "silme" butonuna basar.
        pT.silButon.click();

        //  Satıcı açılan pencerede "Delete" butonun basar ve tag silme işlemini yapar.
        pT.Delete.click();

    }

}
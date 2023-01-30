package US01_Tests;


import Team06.pages.US01_Pages.US01_TC10_Manufacturers;
import Team06.utilities.BaseTestReport;
import Team06.utilities.Driver;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import static org.openqa.selenium.Keys.*;

public class US01_TC10_Manufacturers_Test extends BaseTestReport {


    //1-Satıcı URL girer.//2- Satıcı Login olur.
    @Test
    public void test() {
        extentTest = extentReports.createTest("US001-testCase010");

        US01_TC10_Manufacturers pM=new US01_TC10_Manufacturers();
        pM.loginSeller();

        US01_TC10_Manufacturers mP= new US01_TC10_Manufacturers();
//3- Satıcı "Manufacturers/Publications bölümüne tıklar.
        pM.Manufacturers.click();

//4- Satıcı "Add Manufacturer/Publication" butonuna tıklar.
        pM.create.click();

//5- Satıcı "Unload an image" bölümüne tıklar ve profil fotografı oluşturur..
//6- Satıcı "Cover Image" bölümüne tıklar ve kapak fotoğrafı oluşturur.


//7- Satıcı "Name" bölümüne üretici/yayıncı adı girer.
        pM.name.sendKeys(   "Eko Shop");


//8- Satıcı "Website" bölümünde üretici/yayıncı web site girer.
        pM.website.sendKeys("www.Ekoshop.com");


//9- Satıcı "Description" bölümüne tanıtım metni girer.(//span[@class="whitespace-nowrap"])[2]
        pM.description.sendKeys("Güvenli ve Hesaplı alış-verişin adresi !!!");


//10- Satıcı "Group" bölümünden katagori seçimi yapar.
        WebElement Types= Driver.getDriver().findElement(By.xpath("//div[@class=\" css-ackcql\"]"));
        Types.click();
        Actions act2=new Actions(Driver.getDriver());
        act2.sendKeys(DOWN).perform();
        act2.sendKeys(ENTER).perform();



//11/a- Satıcı sosyal medya platformu eklemek isterse "Add  New Social Profile" butonuna tıklar.
        pM.SocialEkleButon.click();

//11/b- Satıcı "Select social Platform" bölümüne tıklar ve eklemek istediği sosyal medya platformunu seçer.
        pM.socialEkle.click();
        Actions act3=new Actions(Driver.getDriver());
        act3.sendKeys(TAB).perform();

//11/c- Satıcı "Add profile url" bölümüne girdiği sosyal medya platformunun URL'sini girer.
        pM.profilUrl.sendKeys("www.ekoshop.com");

//12- Satıcı Add Manufacturer/Publication butonuna tıklar ve kayıt işlemini yapar.


        pM.addManufacturers.click();
//13- Satıcı "Approval Action" sekmesine tıklar onaylama işlemini gerçekleştirir.
        pM.onay.click();




    }
}
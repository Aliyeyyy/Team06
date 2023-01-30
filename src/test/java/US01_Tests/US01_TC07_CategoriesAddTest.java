package US01_Tests;

import Team06.pages.US01_Pages.US01_TC07_CategoriesAdd;
import Team06.utilities.BaseTestReport;
import Team06.utilities.Driver;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class US01_TC07_CategoriesAddTest extends BaseTestReport {

    public static void javaScriptExecutor(WebElement locator){
        JavascriptExecutor js = (JavascriptExecutor) Driver.getDriver();
        js.executeScript("arguments[0].click();", locator);
    }

    @Test
    public void test() throws InterruptedException {
        extentTest=extentReports.createTest("test","kategori eklendi");
        US01_TC07_CategoriesAdd pc=new US01_TC07_CategoriesAdd();
        //Kullanıcı Url 'ye gider
        //Kullanıcı become a seller a tıklar ve login olur
        pc.loginSeller();

        //Kullanıcı categories kısımını tıklar
        pc.categories.click();

        //Kullanıcı add categories butonuna tıklar
        pc.add.click();

        //Kullanıcı image ekler
        pc.image.sendKeys("C:\\Users\\HUAWEI\\IdeaProjects\\Team06_TestNG_Project\\images.png");

        //Kullanıcı name girer.
        pc.name.sendKeys("mycategory");

        //Kullanıcı details girer.
        pc.details.sendKeys("adssassdddd");

        //Kullanıcı icon secer
        pc.addCategories("Purse",pc.icon);

        //Kullanıcı type secer
        pc.addCategories("Bags",pc.type);

        //Kullanıcı parent category secer.
        pc.addCategories("Hand bags",pc.parentcategory);

        //Kullanıcı add category butonunu tıklar
        pc.button.click();


        //javaScriptExecutor(pc.delete);

        //Kullanıcı silmel için cop kutusunu tıklar
        pc.delete.click();

        //Kullanıcı silme işlemini onaylar
        pc.dbutton.click();

        //Kullanıcı kategoriyi duzenlemek icin kalem logosunu tıklar
        pc.edit.click();

        //Kullanıcı yeni isim gire.
        pc.name.sendKeys("aaasssss");

        //Kullanıcı yeni kategori secer
        pc.addCategories("Makeup",pc.type);

        //Kullanıcı update butonunu tıklar
        pc.updateCategory.click();

        //Kullanıcı back butonuna tıklar
        pc.back.click();

        Driver.closeDriver();










    }
}

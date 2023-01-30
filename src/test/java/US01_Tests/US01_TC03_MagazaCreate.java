package US01_Tests;


import Team06.pages.CreateShop;
import Team06.pages.HomePage;
import Team06.utilities.BaseTestReport;
import Team06.utilities.Driver;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;



public class US01_TC03_MagazaCreate extends BaseTestReport {

    @Test

    public void test() throws InterruptedException { //magaza create
        extentTest = extentReports.createTest("US001-testCase03");

        // Driver.getDriver().get("https://admin-pickbazar-rest.vercel.app/login");

        HomePage hp = new HomePage();
        hp.loginSeller();

       WebElement h1 = Driver.getDriver().findElement(By.tagName("h1"));

        Assert.assertTrue(h1.getText().contains("My Shops"));

        Driver.getDriver().findElement(By.linkText("Create Shop")).click();


        CreateShop cS=new CreateShop();

      //  cS.logo.sendKeys("C:\\Users\\seyitbey\\IdeaProjects\\TestNG_Team06_Project\\images.png");
      //  cS.image.sendKeys("C:\\Users\\seyitbey\\IdeaProjects\\TestNG_Team06_Project\\images.png");
        cS.name.sendKeys("team6Bazar");

        cS.description.sendKeys("Müşterilerimizin günlük yaşamlarında güvenilir, yenilikçi ve samimi bir yol arkadaşı olarak, ekosistemimizdeki her bir paydaşımızın \"İyi ki varsın Team6\" diye düşünmeleri için var gücümüzle çalışıyoruz.");
        cS.accountName.sendKeys("TeamBankAccount");
        cS.accountEmail.sendKeys("www.team6@gmail.com");
        cS.bankName.sendKeys("xBank");
        cS.accountNo.sendKeys("123123");
        cS.country.sendKeys("Turkey");
        cS.city.sendKeys("Bursa");
        cS.state.sendKeys("Osmangazi");
        cS.zip.sendKeys("16000");
        cS.streetAddress.sendKeys("Cumhuriyet");


        cS.location.sendKeys("Bursa Cumhuriyet");
        cS.location.sendKeys(Keys.ARROW_DOWN);
        cS.location.sendKeys(Keys.TAB);

        cS.contactNo.sendKeys("+902241000000");
        cS.website.sendKeys("http://www.team6Bazaar.com");
        //  cS.add.click();
        Thread.sleep(3000);
        Actions action = new Actions(Driver.getDriver());

        action.click(cS.save).perform();


    }
}


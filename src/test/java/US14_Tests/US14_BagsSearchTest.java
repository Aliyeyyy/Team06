package US14_Tests;


import Team06.pages.US14_Pages.US14_BagsSearchPage;

import Team06.utilities.BaseTestReport;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import java.time.Duration;

public class US14_BagsSearchTest extends BaseTestReport {
US14_BagsSearchPage bags = new US14_BagsSearchPage();

@Test
    public void Test01(){
    extentTest = extentReports.createTest("US014-testCase01");

    bags.driver.get("https://shop-pickbazar-rest.vercel.app/");
        bags.groceryDropdown.click();
    bags.wait.withTimeout(Duration.ofSeconds(2000));
        bags.grocerybag.click();
        bags.searchItem("Gucci");
    System.out.println("bags.bagsDogrulama.getText() = " + bags.bagsDogrulama.getText());
    SoftAssert softAssert=new SoftAssert();
    softAssert.assertTrue(bags.bagsDogrulama.getText().contains("Gucci"));

    }

    @Test
    public void Test02(){
        extentTest = extentReports.createTest("US014-testCase02");
        bags.driver.get("https://shop-pickbazar-rest.vercel.app/");
        bags.groceryDropdown.click();
        bags.wait.withTimeout(Duration.ofSeconds(2000));
        bags.grocerybag.click();
        bags.searchItem("Laptop");
        System.out.println("bags.productFound.getText() = " + bags.productFound.getText());
        SoftAssert softAssert=new SoftAssert();
        softAssert.assertTrue(bags.productFound.getText().contains("Sorry, No Product Found :("));

    }
}

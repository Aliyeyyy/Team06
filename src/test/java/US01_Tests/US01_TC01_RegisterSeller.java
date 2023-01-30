package US01_Tests;

import Team06.pages.HomePage;
import Team06.utilities.BaseTestReport;
import Team06.utilities.Driver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import java.time.Duration;

public class US01_TC01_RegisterSeller extends BaseTestReport {




        WebDriver driver = Driver.getDriver();
        WebDriverWait wait = new WebDriverWait(Driver.getDriver(), Duration.ofSeconds(10));

        @Test
        public void registerSeller() {
            extentTest = extentReports.createTest("US001-testCase01");

            HomePage hp = new HomePage();
            hp.registerSeller();

        }
    }
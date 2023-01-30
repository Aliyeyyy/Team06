package Team06.utilities;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.ITestResult;
import org.testng.annotations.*;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.Date;

public class BaseTestReport {

    protected ExtentReports extentReports;
    protected ExtentHtmlReporter extentHtmlReporter;
    protected ExtentTest extentTest;

    @BeforeSuite
    public void beforeSuite() {

        extentReports = new ExtentReports();


        String currentDate = new SimpleDateFormat("yyyyMMdd_HHmmss").format(new Date());
        String filePath = System.getProperty("user.dir") + "/test-output/report/" + currentDate + "test_report.html";


        extentHtmlReporter = new ExtentHtmlReporter(filePath);
        extentReports.attachReporter(extentHtmlReporter);

        // Add custom information
        // İstediğiniz bilgileri buraya ekeyebiliyorsunuz.
        extentReports.setSystemInfo("Environment", "QA");
        extentReports.setSystemInfo("Browser", "Chrome"); // chrome, firefox
        extentReports.setSystemInfo("QA Engineer", "Team06");
        extentHtmlReporter.config().setDocumentTitle("Report");
        extentHtmlReporter.config().setReportName("TestNG Reports");
        extentHtmlReporter.config().setDocumentTitle(new SimpleDateFormat("ddMMyyyy_HHmmss").format(new Date()) + "_Son Test");//test doc uzerinde tarih yazili olacak


    }




   @BeforeMethod
   public void setup(){


       Driver.getDriver();


   }

    @AfterMethod
    public void teardown(ITestResult result) throws IOException {

        if (result.getStatus() == ITestResult.FAILURE) {
            String screenShotLocation = ReusableMethods.getScreenShot(Driver.getDriver(), result.getName());
            extentTest.fail(result.getName());
            extentTest.addScreenCaptureFromPath(screenShotLocation);
            extentTest.fail(result.getThrowable());
        } else if (result.getStatus() == ITestResult.SKIP) {
            extentTest.skip("Test Case is skipped: " + result.getName());
        }
        Driver.closeDriver();
    }

    @AfterSuite
    public void afterSuite() {
        extentReports.flush();
    }

}
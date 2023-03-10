package Team06.utilities;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class ReusableMethods {

    public static String getScreenShot(WebDriver driver, String name) throws IOException {
        String date = formatCurrentDate("yyyyMMdd_HHmmss");
        File source = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
        String target = System.getProperty("user.dir") + "\\test-output\\Screenshots\\"+name+date+".png";
        File file = new File(target);
        FileUtils.copyFile(source,file);
        return target;
    }

    public static String formatCurrentDate(String pattern){

        return new SimpleDateFormat(pattern).format(new Date());
    }


}

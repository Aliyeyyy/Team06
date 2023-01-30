package Team06.pages.US11_Pages;

import Team06.pages.AbstactClass;
import Team06.utilities.Driver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class US011_TC01_MekaupAdd extends AbstactClass {


    WebDriver driver = Driver.getDriver();

    public US011_TC01_MekaupAdd() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

        @FindBy(xpath = "(//div/button)[1]")
        public WebElement searchButton;
        @FindBy(xpath = "(//span[@class='flex h-5 w-5 items-center justify-center'])[3]")
        public WebElement makeupButton;

        @FindBy(xpath = "(//div[@class=\"relative flex h-48 w-auto items-center justify-center sm:h-64\"])[5]")
        public WebElement urunSec;

        @FindBy(xpath = "//div[@class=\"mb-3 w-full lg:mb-0 lg:max-w-[400px]\"]")
        public WebElement urunSepeteEkle;



        @FindBy(xpath = "(//button[@class=\"cursor-pointer p-2 transition-colors duration-200 hover:bg-accent-hover focus:outline-none px-5\"])[4]")
        public WebElement urunArttır;

         @FindBy(xpath = "(//button[@class=\"cursor-pointer p-2 transition-colors duration-200 hover:bg-accent-hover focus:outline-none px-5\"])[3]")
        public WebElement urunAzalt;

        @FindBy(css = ".hidden.product-cart")
        public WebElement urunSepeti;

        @FindBy(xpath = "(//button[@class=\"cursor-pointer p-2 transition-colors duration-200 hover:bg-accent-hover focus:outline-none hover:!bg-gray-100\"])[2]")
        public WebElement sepetUrunArttır;

        @FindBy(xpath = "(//button[@class=\"cursor-pointer p-2 transition-colors duration-200 hover:bg-accent-hover focus:outline-none hover:!bg-gray-100\"])[1]")
        public WebElement sepetUrunAzalt;

}

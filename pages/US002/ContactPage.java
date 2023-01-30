package Team06.pages.US002;

import Team06.pages.AbstactClass;
import Team06.utilities.Driver;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;
import java.util.Set;

public class ContactPage extends AbstactClass {

    WebDriver driver = Driver.getDriver();

    public ContactPage() {
        PageFactory.initElements(driver, this);
    }

    @FindBy(id = "name")
    private WebElement name;

    @FindBy(id = "email")
    private WebElement email;

    @FindBy(id = "subject")
    private WebElement subject;

    @FindBy(id = "description")
    private WebElement description;

    @FindBy(xpath = "//button[text()='Submit']")
    private WebElement submitButton;

    @FindBy(xpath = "(//span[@class='text-sm text-body'])[1]")
    private WebElement address;

    @FindBy(xpath = "(//span[@class='text-sm text-body'])[2]")
    private WebElement phoneNumber;

    @FindBy(xpath = "(//span[@class='text-sm text-body'])[3]")
    private WebElement webAddress;

    @FindBy(linkText = "Visit This Site")
    private WebElement visitButton;

    @FindBy(css = "a:nth-child(1) > svg")
    private WebElement facebookLink;

    @FindBy(css = "a:nth-child(2) > svg")
    private WebElement twitterLink;

    @FindBy(css = "a:nth-child(3) > svg")
    private WebElement instagramLink;

    @FindBy(xpath = "//div[text()='Email successfully sent']")
    public WebElement emailAlertMessage;

    @FindBy(xpath = "//p[contains(text(),' ')]")
    private WebElement alertMessage;

    @FindAll({@FindBy(xpath = "//p[text()='You must need to provide your email address']"),
            @FindBy(xpath = "//p[text()='You must need to provide your name']"),
            @FindBy(xpath = "//p[text()='What subject do you want to discuss with us?']"),
            @FindBy(xpath = "//p[text()='Tell us more about it']")})
    private List<WebElement> alertMessage3;


    @FindBy(linkText = "Contact")
    private WebElement linkContact;
    public void navigateToContact(){
        linkContact.click();
    }

    public void clickSubmit(){
        submitButton.click();
    }


   public void fillAllTextAreaFalse() {
       action.click(name).sendKeys(faker.name().name() + Keys.TAB)
               .sendKeys(faker.name().name() + Keys.TAB)
               .sendKeys(faker.lorem().fixedString(20) + Keys.TAB)
               .sendKeys(faker.lorem().characters(5, 300) + Keys.TAB)
               .sendKeys(Keys.ENTER).perform();
   }

   public boolean alertMessage() {
       return alertMessage.isDisplayed();

   }

   public boolean alertMessages() {
       boolean flag = true;
       submitButton.click();
       for (WebElement each : alertMessage3) {;
           if (!each.isDisplayed()) {
               flag = false;
               break;
           }
       }
       return flag;
   }


   public boolean alertMessageIsVisible() {
       return emailAlertMessage.isDisplayed();
   }

  public void fillAllTextArea() {
      action.click(name).sendKeys(faker.name().name() + Keys.TAB)
              .sendKeys(faker.internet().emailAddress() + Keys.TAB)
              .sendKeys(faker.lorem().fixedString(20) + Keys.TAB)
              .sendKeys(faker.lorem().characters(5, 300) + Keys.TAB)
              .sendKeys(Keys.ENTER).perform();
  }

   public void sendKeysDescription() {
       description.sendKeys(faker.lorem().characters(500, 5000));
   }

   public void sendKeysName() {
       name.sendKeys(faker.name().name());
   }

   public void sendKeysEmail() {
       email.sendKeys(faker.internet().emailAddress());
   }

   public void sendKeysSubject() {
       subject.sendKeys(faker.lorem().sentence(1));
   }



   public String getAddress() {
       return address.getText();
   }

   public String getPhone() {
       return phoneNumber.getText();
   }

   public String getWebAddress() {
       return webAddress.getText();
   }


   public boolean facebookIsVisitable() {
       return siteIsVisitable(facebookLink, "facebook");
   }

   public boolean twitterIsVisitable() {
       return siteIsVisitable(twitterLink, "twitter");
   }

   public boolean instagramIsVisitable() {
       return siteIsVisitable(instagramLink, "instagram");
   }

   private boolean siteIsVisitable(WebElement element, String value) {
       boolean flag = false;
       String homePage = driver.getWindowHandle();
       try {
           element.click();
           Set<String> wh = driver.getWindowHandles();
           if (wh.size() > 1) {
               for (String each : wh) {
                   driver.switchTo().window(each);
                   if (!driver.getWindowHandle().equals(homePage)) {
                       flag = true;
                       driver.close();
                       driver.switchTo().window(homePage);
                       break;
                   }
               }
           }
       } catch (Exception e) {
           e.printStackTrace();
       }

       return flag;

   }




}




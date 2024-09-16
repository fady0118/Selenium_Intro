package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

/* create HomePage class */
public class HomePage {
    /* def WebDriver object */
    private final WebDriver driver;

    /* create a constructor, which will specify that when you instantiate this class
    you must pass in the WebDriver, and we'll use that driver in order to interact with the webpage. */
    public HomePage(WebDriver driver){
        this.driver =driver;
    }

    /* ClickLink method */
    public void ClickLink(String link){
        driver.findElement(By.linkText(link)).click();
    }

    /* clickFormAuthentication method */
    public LoginPage clickFormAuthentication(){
        /* click on link */
        ClickLink("Form Authentication");
        /* return a “Login Page” object which is an instance of the class "LoginPage"*/
        return new LoginPage(driver);
    }

    /* click Dropdown method */
    public DropdownPage clickDropdown(){
        /* click link */
        ClickLink("Dropdown");
        /* return DropdownPage */
        return new DropdownPage(driver);
    }
    /* click Hovers method */
    public HoversPage clickHovers(){
        ClickLink("Hovers");
        return new HoversPage(driver);
    }
    /* click Key Presses method */
    public KeyPressesPage ClickKeyPresses(){
        ClickLink("Key Presses");
        return new KeyPressesPage(driver);
    }
    /* return KeyPressesPage*/
    public KeyPressesPage returnKeyPresses(){
        return new KeyPressesPage(driver);
    }

    /* click Horizontal Slider method */
    public HorizontalSlider clickHorizontalSlider(){
        ClickLink("Horizontal Slider");
        return new HorizontalSlider(driver);
    }
    /* Click JavaScript Alerts method */
    public JavaScriptAlerts ClickJavascriptalerts(){
        ClickLink("JavaScript Alerts");
        return new JavaScriptAlerts(driver);
    }

    public FileUploadPage ClickFileUpload(){
        ClickLink("File Upload");
        return new FileUploadPage(driver);
    }

    public WysiwygEditorPage ClickWysiwygEditor(){
        ClickLink("WYSIWYG Editor");
        return new WysiwygEditorPage(driver);
    }
    public DynamicLoadingPage ClickDynamicLoading(){
        ClickLink("Dynamic Loading");
        return new DynamicLoadingPage(driver);
    }
    public LargeAndDeepDomPage clickLargeAndDeepDom(){
        ClickLink("Large & Deep DOM");
        return new LargeAndDeepDomPage(driver);
    }
    public MultipleWindowsPage ClickMultipleWindows(){
        ClickLink("Multiple Windows");
        return new MultipleWindowsPage(driver);
    }

}

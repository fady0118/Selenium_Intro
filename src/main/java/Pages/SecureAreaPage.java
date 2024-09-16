package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

/* create SecureAreaPage class */
public class SecureAreaPage {
    /* def Webdriver obj */
    private final WebDriver driver;
    /* create class constructor*/
    SecureAreaPage(WebDriver driver){
        this.driver = driver;
    }
    private By statusAlert = By.id("flash");
    public String getstatusAlert(){
        return driver.findElement(statusAlert).getText();
    }
}

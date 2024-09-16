package Pages;

import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;

public class KeyPressesPage {
    private WebDriver driver;
    KeyPressesPage(WebDriver driver){
        this.driver = driver;
    }
    /* input textbox By.link */
    private By textinput = By.id("target");
    /* result By.link */
    private By Results = By.id("result");
    /* SendKeyText method */
    public void SendKeyText(String text){
        driver.findElement(textinput).sendKeys(text);
    }

    /* Get Result method */
    public String Result(){
        return driver.findElement(Results).getText();
    }

}

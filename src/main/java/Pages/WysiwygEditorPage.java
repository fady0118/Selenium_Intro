package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class WysiwygEditorPage {
    private WebDriver driver;
    String iFrameid = "mce_0_ifr";
    private By textArea = By.id("tinymce");
    WysiwygEditorPage(WebDriver driver){
        this.driver = driver;
    }
    public  void switchToEditArea(){
        driver.switchTo().frame(iFrameid);
    }
    private void switchToMainArea(){
        driver.switchTo().parentFrame();
    }
    public  void ClearToEditArea(){
        switchToEditArea();
        driver.findElement(textArea).clear();
        switchToMainArea();
    }
    public void setTextArea(String text){
        switchToEditArea();
        driver.findElement(textArea).sendKeys(text);
        switchToMainArea();
    }
    public String getTextFromEditor(){
        switchToEditArea();
        String text = driver.findElement(textArea).getText();
        switchToMainArea();
        return text;
    }
}

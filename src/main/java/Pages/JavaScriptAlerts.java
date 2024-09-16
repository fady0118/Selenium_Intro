package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class JavaScriptAlerts {
    private WebDriver driver;
    JavaScriptAlerts(WebDriver driver){
        this.driver = driver;
    }
    private By AlertButton = By.xpath(".//button[text()='Click for JS Alert']");
    private By ConfirmButton = By.xpath(".//button[text()='Click for JS Confirm']");
    private By PromptButton = By.xpath(".//button[text()='Click for JS Prompt']");

    public void ClickAlertButton(){
        driver.findElement(AlertButton).click();
    }
    public void AcceptAlert(){
        driver.switchTo().alert().accept();
    }
    public void Click_Accept_ConfirmButton(){
        driver.findElement(ConfirmButton).click();
        driver.switchTo().alert().accept();
    }
    public void Click_Cancel_ConfirmButton(){
        driver.findElement(ConfirmButton).click();
        driver.switchTo().alert().dismiss();
    }
    public void Click_Enter_PromptButton(String text){
        driver.findElement(PromptButton).click();
        driver.switchTo().alert().sendKeys(text);
        driver.switchTo().alert().accept();

    }
    public void Click_Cancel_PromptButton(){
        driver.findElement(PromptButton).click();
        driver.switchTo().alert().dismiss();
    }
    public String GetResultText(){
        return driver.findElement(By.id("result")).getText();
    }
}

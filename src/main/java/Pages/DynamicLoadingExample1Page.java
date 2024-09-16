package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class DynamicLoadingExample1Page {
    private WebDriver driver;
    private By StartButton = By.cssSelector("#start button");
    private By loadingIndicator = By.id("loading");
    private By LoadedText = By.id("finish");


    DynamicLoadingExample1Page(WebDriver driver){
        this.driver =driver;
    }

    public String GetLoadedTexe(){
        driver.findElement(StartButton).click();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.invisibilityOf(driver.findElement(loadingIndicator)));
        return driver.findElement(LoadedText).getText();
    }

}

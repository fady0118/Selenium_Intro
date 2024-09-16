package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;

import java.time.Duration;

public class DynamicLoadingExample2Page {
    private WebDriver driver;
    private By StartButton = By.cssSelector("#start button");
    private By LoadingBar = By.id("loading");
    private By LoadedText = By.id("finish");

    DynamicLoadingExample2Page(WebDriver driver){
        this.driver = driver;
    }
    FluentWait waiting = new FluentWait(driver).withTimeout(Duration.ofSeconds(10))
            .pollingEvery(Duration.ofSeconds(1)).ignoring(NoSuchFieldError.class);

    public String GetLoadedText(){
        driver.findElement(StartButton).click();
        waiting.until(ExpectedConditions.invisibilityOf(driver.findElement(LoadingBar)));
        return driver.findElement(LoadedText).getText();
    }
}

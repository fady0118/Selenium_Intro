package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LargeAndDeepDomPage {
    private WebDriver driver;
    private By table = By.id("large-table");
    LargeAndDeepDomPage(WebDriver driver){
        this.driver = driver;
    }
    public void ScrollToTable(){
        WebElement TableElement = driver.findElement(table);
        String Script = "arguments[0].scrollIntoView();";
        ((JavascriptExecutor)driver).executeScript(Script,TableElement);
    }
}

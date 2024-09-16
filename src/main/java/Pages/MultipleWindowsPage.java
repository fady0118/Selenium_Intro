package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class MultipleWindowsPage {
    private WebDriver driver;
    MultipleWindowsPage(WebDriver driver){
        this.driver = driver;
    }
    public void Clickhere(){
        driver.findElement(By.linkText("Click Here")).click();
    }

}

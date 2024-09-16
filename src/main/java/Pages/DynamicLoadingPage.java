package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import Pages.HomePage;
public class DynamicLoadingPage {
    private WebDriver driver;
    DynamicLoadingPage(WebDriver driver){
        this.driver =driver;
    }
    public DynamicLoadingExample1Page ClickDynamicLoadingExample1(){
        driver.findElement(By.linkText("Example 1: Element on page that is hidden")).click();
        return new DynamicLoadingExample1Page(driver);
    }
    public DynamicLoadingExample2Page ClickDynamicLoadingExample2(){
        driver.findElement(By.linkText("Example 2: Element rendered after the fact")).click();
        return new DynamicLoadingExample2Page(driver);
    }
}

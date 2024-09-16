package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;

public class HorizontalSlider {
    private WebDriver driver;
    HorizontalSlider(WebDriver driver){
        this.driver = driver;
    }
    /* def slider link */
    private By slidervar = By.cssSelector(".sliderContainer input");
    /* click on slider method */
    public void clickonslider(){
        driver.findElement(slidervar).click();
    }
    /* press right arrow once method */
    public void rightarrow(){
        Actions action = new Actions(driver);
        action.keyUp(Keys.ARROW_RIGHT).perform();
        action.keyDown(Keys.ARROW_RIGHT).perform();
    }
    /* press left arrow once method */
    public void leftarrow(){
        Actions action = new Actions(driver);
        action.keyUp(Keys.ARROW_LEFT).perform();
        action.keyDown(Keys.ARROW_LEFT).perform();
    }
    /* Send right key */
    public void Sendrightkey(){
        driver.findElement(slidervar).sendKeys(Keys.ARROW_RIGHT);
    }
    /* Send 8 right key */
    public void Send9rightkey(){
        for(var i=0;i<=8;i++){
            Sendrightkey();
        }
    }
    /* get slidervalue method */
    public String  slidervalue(){
        return driver.findElement(By.id("range")).getText();
    }


}

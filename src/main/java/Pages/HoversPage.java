package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class HoversPage {
    /* def Webdriver obj */
    public WebDriver driver;
    /* create class constructor*/
    HoversPage(WebDriver driver){
        this.driver = driver;
    }
    /* create a link for the figureBox web element */
    private final By figureBox = By.cssSelector("div.figure");
    private final By boxCaption  = By.className("figcaption");

    /* hoverOverFigure method */
    public FigureCaption hoverOverFigure(int index){
        Actions action = new Actions(driver);

        WebElement figure = driver.findElements(figureBox).get(index-1);
        action.moveToElement(figure).perform();
        return new FigureCaption(figure.findElement(boxCaption));
    }
    public class FigureCaption{
        private WebElement caption;
        FigureCaption(WebElement caption){
            this.caption = caption;
        }
        private By header = By.tagName("h5");
        private By link  = By.tagName("a");

        public boolean Iscaptiondisplayed(){
            return caption.isDisplayed();
        }
        public String GetTitle(){
            return caption.findElement(header).getText();
        }
        public String GetLink(){
            return caption.findElement(link).getAttribute("href");
        }
        public String GetLinkText(){
            return caption.findElement(link).getText();
        }
    }
}


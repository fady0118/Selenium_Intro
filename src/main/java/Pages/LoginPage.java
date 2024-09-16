package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

/* create LoginPage class */
public class LoginPage {

    /* def WebDriver obj */
    private final WebDriver driver;

    /* def class constructor (assigns the webdriver to the webdriver-obj) */
    public LoginPage(WebDriver driver){
        this.driver =driver;
    }

    /* create links for the web elements of interest */
    private By usernamefield = By.id("username");
    private By passwordfield = By.id("password");
    private By LoginButton = By.cssSelector("#login button");
    /* create methods to interact with the elements */
    public void setUsername(String username){
        driver.findElement(usernamefield).sendKeys(username);
    }
    public void setPassword(String password){
        driver.findElement(passwordfield).sendKeys(password);
    }
    public SecureAreaPage clickLoginButton(){
        driver.findElement(LoginButton).click();
        /* return a “SecureAreaPage” object which is an instance of the class "SecureAreaPage"*/
        return new SecureAreaPage(driver);
    }
}

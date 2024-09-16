package base;

import Pages.HomePage;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;/* import Selenium ChromeDriver */
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.time.Duration;
import java.util.List;
import java.time.Instant;

import Pages.HomePage;
import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import utilities.WindowManager;

/* create a new Java class */
public class basetests {
    /* def a WebDriver object */
    private WebDriver driver;
    /* def a HomePage var (protected) */
    protected HomePage homePage;
    protected WindowManager Windowmanager;

    /* create a method */
    @BeforeClass
    public void setUp() {
        /* let Selenium WebDriver know where executable file is */
        System.setProperty("webdriver.chrome.driver", "resources/chromedriver.exe");
        /* instantiate our driver as a ChromeDriver */
        driver = new ChromeDriver(getChromeOptions());
        /* Implicit Wait */
        //driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        /* give a URL to the driver */
        driver.get("https://the-internet.herokuapp.com");
        /* command to print the application title */
        System.out.println(driver.getTitle());

        /* Create a handle in our test layer to our application */
        homePage = new HomePage(driver);
        Windowmanager = new WindowManager(driver);

        }
    /* create a handle to WindowManager */

    public WindowManager GetWindowManager(){
        return new WindowManager(driver);
    }
    private ChromeOptions getChromeOptions(){
        ChromeOptions options = new ChromeOptions();
//        options.addArguments("--start-maximized");
        options.addArguments("--disable-extensions");
//        options.addArguments("--incognito");
//        options.addArguments("--headless");
        return options;
    }

    /* Close session */
    //driver.quit();
    @AfterClass
    public void tearDown(){
        //driver.quit();
    }


}
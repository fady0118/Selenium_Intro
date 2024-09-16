package utilities;

import org.openqa.selenium.WebDriver;

import java.util.Set;

import static java.awt.SystemColor.window;

public class WindowManager {
    private WebDriver driver;
    private WebDriver.Navigation navigate;

    public WindowManager(WebDriver driver){
        this.driver = driver;
        navigate = driver.navigate();
    }
    /* Navigation methods */
    public void goBack(){
        navigate.back();
    }
    public void goForward(){
        navigate.forward();
    }

    public void refreshPage(){
        navigate.refresh();
    }

    public void goTo(String url){
        navigate.to(url);
    }
    public void SwitchToTab(String TabTitle){
        /* create handles object */
        Set<String> Windows = driver.getWindowHandles();
        /* get windows number */
        System.out.println("Number of windows:"+Windows.size());
        /* get handles text */
        System.out.println("Windows handles:");
        Windows.forEach(System.out::println);

        String title = "false";
        /* switch to desired tab */
        for(String window:Windows){
            System.out.println("Switching to window:"+window);
            driver.switchTo().window(window);
            System.out.println(driver.getTitle());

            if(TabTitle.equals(driver.getTitle())){
                title = "true";
                break;
            }
        }
        if(title.equals("false")){
                try {
                    throw new Exception("Window not found");
                } catch (Exception e) {
                    throw new RuntimeException(e);
                }
        }

    }

}

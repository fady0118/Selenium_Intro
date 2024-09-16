package Navigation;
import Pages.MultipleWindowsPage;
import base.basetests;
import org.openqa.selenium.WebDriver;
import Pages.HomePage;
import org.testng.annotations.Test;
import utilities.WindowManager;
public class NavigationTests extends basetests {

    @Test
    public void testNavigation(){
        homePage.ClickDynamicLoading().ClickDynamicLoadingExample1();

        GetWindowManager().goForward();
        GetWindowManager().goBack();
        GetWindowManager().refreshPage();
        var url = "https://www.selenium.dev/selenium/docs/api/java/org/openqa/selenium/WebDriver.Navigation";
        GetWindowManager().goTo(url);

    }
    @Test
    public void SwitchWindowTest(){
        MultipleWindowsPage MultipleWindowspage = homePage.ClickMultipleWindows();
        MultipleWindowspage.Clickhere();
        MultipleWindowspage.Clickhere();
        GetWindowManager().SwitchToTab("New Window");
    }
}

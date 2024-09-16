package KeyPress;

import Pages.HomePage;
import Pages.KeyPressesPage;
import base.basetests;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import static org.testng.Assert.*;


public class KeyPressTest extends basetests {

    /* create test method */
    @Test
    public void testKeyPress(){
        KeyPressesPage keyPressesPage = homePage.ClickKeyPresses();
        keyPressesPage.SendKeyText("M");
        assertEquals(keyPressesPage.Result(),"You entered: M","Incorrect Result");
    }
    @Test(priority = 1)
    public void testBackspace(){
        KeyPressesPage keyPressesPage = homePage.returnKeyPresses();
        keyPressesPage.SendKeyText(String.valueOf(Keys.BACK_SPACE));
        assertEquals(keyPressesPage.Result(),"You entered: BACK_SPACE","Backspace test failed");
    }
}

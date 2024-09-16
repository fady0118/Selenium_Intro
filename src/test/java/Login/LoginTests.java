package Login;
import Pages.LoginPage;
import Pages.SecureAreaPage;
import base.basetests;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

/* create LoginTests class*/
public class LoginTests extends basetests{
    /* create test method */
    @Test
    public void testSuccessfulLogin(){
        /* use clickFormAuthentication and assign the returned object to a new object for the login page */
        LoginPage loginPage = homePage.clickFormAuthentication();
        /* enter the username, the password & click the login button. */
        loginPage.setUsername("tomsmith");
        loginPage.setPassword("SuperSecretPassword!");
        /* The login button will send us to SecureAreaPage so we'll create an object for it */
        SecureAreaPage secureareapage = loginPage.clickLoginButton();
        /* call getstatusAlert method from SecureAreaPage */
        secureareapage.getstatusAlert();
        /* add assertEquals test from TestNG to our project */
        assertTrue(secureareapage.getstatusAlert().contains("You logged into a secure area!"), "Alert text is incorrect");

    }

}

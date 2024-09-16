package Alerts;

import Pages.JavaScriptAlerts;
import base.basetests;
import org.testng.annotations.Test;

import static org.testng.Assert.*;
import static org.testng.Assert.assertEquals;

public class AlertsTest extends basetests {
    @Test
    public void testalert(){
        JavaScriptAlerts JavaScriptAlertsPage = homePage.ClickJavascriptalerts();

        JavaScriptAlertsPage.ClickAlertButton();
        JavaScriptAlertsPage.AcceptAlert();
        assertEquals(JavaScriptAlertsPage.GetResultText(),"You successfully clicked an alert","Result Incorrect");

        JavaScriptAlertsPage.Click_Accept_ConfirmButton();
        assertEquals(JavaScriptAlertsPage.GetResultText(),"You clicked: Ok","Result Incorrect");

        JavaScriptAlertsPage.Click_Cancel_ConfirmButton();
        assertEquals(JavaScriptAlertsPage.GetResultText(),"You clicked: Cancel","Result Incorrect");

        String text = "I AM MAN";
        JavaScriptAlertsPage.Click_Enter_PromptButton(text);
        assertTrue(JavaScriptAlertsPage.GetResultText().contains(text),"Result Incorrect");

        JavaScriptAlertsPage.Click_Cancel_PromptButton();
        assertEquals(JavaScriptAlertsPage.GetResultText(),"You entered: null","Result Incorrect");

    }

}

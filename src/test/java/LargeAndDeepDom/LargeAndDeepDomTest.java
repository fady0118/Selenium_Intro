package LargeAndDeepDom;

import Pages.LargeAndDeepDomPage;
import base.basetests;
import org.testng.annotations.Test;

public class LargeAndDeepDomTest extends basetests {
    @Test
    public void TestLargeAndDeepDom(){
        LargeAndDeepDomPage LargeAndDeepDompage = homePage.clickLargeAndDeepDom();
        LargeAndDeepDompage.ScrollToTable();
    }

}

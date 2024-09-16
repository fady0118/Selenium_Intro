package Wait;

import Pages.DynamicLoadingExample1Page;
import Pages.DynamicLoadingExample2Page;
import Pages.DynamicLoadingPage;
import base.basetests;
import com.google.errorprone.annotations.Var;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class WaitTests extends basetests {

    @Test
    public void testExplicitloading(){
        DynamicLoadingPage Dynamicloadingpage = homePage.ClickDynamicLoading();
        DynamicLoadingExample1Page Dynamicloadingexample1page = Dynamicloadingpage.ClickDynamicLoadingExample1();

        var Actualtext = "Hello World!";
        assertEquals(Dynamicloadingexample1page.GetLoadedTexe(),Actualtext,"Loaded Text Incorrect");

    }
    @Test
    public void testFluentloading(){
        DynamicLoadingPage Dynamicloadingpage = homePage.ClickDynamicLoading();
        DynamicLoadingExample2Page Dynamicloadingexample2page = Dynamicloadingpage.ClickDynamicLoadingExample2();

        var Actualtext = "Hello World!";
        assertEquals(Dynamicloadingexample2page.GetLoadedText(),Actualtext,"Loaded Text Incorrect");

    }
}

package HorizontalSlider;

import Pages.HomePage;
import Pages.HorizontalSlider;
import base.basetests;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class HorizontalSliderTest extends basetests {

    @Test
    public void testSlider(){
        HorizontalSlider HorizontalSlider = homePage.clickHorizontalSlider();
        HorizontalSlider.Send9rightkey();
        assertEquals(HorizontalSlider.slidervalue(),"4.5","Slider Value incorrect");
    }
}

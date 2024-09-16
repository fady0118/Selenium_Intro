package Hovers;

import base.basetests;
import Pages.HoversPage;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class HoversTests extends basetests {
    /* create test method */
    @Test
    public void testHoverUser1() {
        /* use clickHovers method to click on Hovers and assign the returned object */
        var hoverspage = homePage.clickHovers();
        /* call hoverOverFigure method with the figure index (index 1 == 1st) */
        var caption = hoverspage.hoverOverFigure(1);
        assertTrue(caption.Iscaptiondisplayed(), "Caption not displayed");
        assertEquals(caption.GetTitle(), "name: user1", "Caption title incorrect");
        assertEquals(caption.GetLinkText(), "View profile", "Link text incorrect");
        assertTrue(caption.GetLink().endsWith("/users/1"), "Link incorrect");
    }
}
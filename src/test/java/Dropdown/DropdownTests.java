package Dropdown;

import Pages.DropdownPage;
import base.basetests;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

public class DropdownTests extends basetests {
    /* create test method */
    @Test
    public void testDropdown(){
        /* use clickDropdown and assign the returned object to a new object for the dropdown page */
        DropdownPage dropdownpage = homePage.clickDropdown();

        /* click Option 1 (no need for a new object since we're not moving to a new page */
        String Option="Option 1";
        dropdownpage.selectFromDropDown(Option);

        var selectedOptions = dropdownpage.getSelectedOptions();
        assertEquals(selectedOptions.size(),1,"Incorrect number of selections");
        assertTrue(selectedOptions.contains(Option),"Option not selected");
    }
}

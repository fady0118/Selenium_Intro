package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.List;
import java.util.stream.Collectors;

/* create DropdownPage class */
public class DropdownPage {
    /* def WebDriver obj */
    private WebDriver driver;

    /* def class constructor (assigns the webdriver to the webdriver-obj) */
    DropdownPage(WebDriver driver) {
        this.driver = driver;
    }
    /* ClickLink method */
    public void ClickLink(String link){
        driver.findElement(By.linkText(link)).click();
    }
    private By dropdown = By.id("dropdown");
    /* SelectFromDropdown method */
//    public void SelectFromDropdown(String option){
//        driver.findElement(dropdown).click();
//
//        Select dropdownElement = new Select(driver.findElement(dropdown));
//        dropdownElement.selectByValue(option);
//    }
    /* Select dropdown element*/
    private Select findDropDownElement(){
        /* return an instance of the Select class for the dropdown element */
        return new Select(driver.findElement(dropdown));
    }
    /* Method that gets the selected option so that we can assert on this for our test */
    public List<String> getSelectedOptions(){
        List<WebElement> SelectedElements = findDropDownElement().getAllSelectedOptions();
        return SelectedElements.stream().map(e->e.getText()).collect(Collectors.toList());
    }
    /* select option from dropdown */
    public void selectFromDropDown(String option){
        findDropDownElement().selectByVisibleText(option);
    }


}

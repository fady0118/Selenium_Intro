package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class FileUploadPage {
    private WebDriver driver;
    private By ChooseFile = By.id("file-upload");
    private By UploadButton =By.id("file-submit");
    FileUploadPage(WebDriver driver){
        this.driver = driver;
    }

    public void ClickUploadButton(){
        driver.findElement(UploadButton).click();
    }
    public void UploadFile(String AbsooluteFilePath){
        driver.findElement(ChooseFile).sendKeys(AbsooluteFilePath);
        ClickUploadButton();
    }
    private By Result = By.id("uploaded-files");
    public String GetUploadedFile(){
        return driver.findElement(Result).getText();
    }

}

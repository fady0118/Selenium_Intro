package FileUpload;

import Pages.FileUploadPage;
import base.basetests;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class FileUploadTest extends basetests {
    @Test
    public void testfileupload() {
        FileUploadPage Fileuploadpage = homePage.ClickFileUpload();
        String AbsoluteFilePath = "D:\\ITI\\SW testing\\Selenium\\Selenium_Intro\\resources\\Musashi.jpg";
        Fileuploadpage.UploadFile(AbsoluteFilePath);

        assertEquals(Fileuploadpage.GetUploadedFile(),"Musashi.jpg","Incorrect Result");
    }
}
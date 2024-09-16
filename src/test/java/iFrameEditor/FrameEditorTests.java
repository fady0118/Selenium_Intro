package iFrameEditor;

import Pages.WysiwygEditorPage;
import base.basetests;
import org.testng.annotations.Test;

public class FrameEditorTests extends basetests {
    @Test
    public void testframe(){
        WysiwygEditorPage WysiwygEditorpage = homePage.ClickWysiwygEditor();
        WysiwygEditorpage.setTextArea("set text");
    }
}

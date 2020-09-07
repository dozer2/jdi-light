package nativeapp_android.tests;

import com.epam.jdi.light.mobile.elements.common.AppManager;
import nativeapp.android.apiDemos.ButtonsPage;
import nativeapp.android.apiDemos.IndexPage;
import nativeapp.android.apiDemos.ViewsPage;
import nativeapp_android.ToggleButtonTestInit;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class ToggleButtonTest extends ToggleButtonTestInit {

    @Test
    public void toggleButtonTest() {
        IndexPage.viewsPage.click();
        ViewsPage.buttonsPage.click();
        assertEquals(ButtonsPage.toggleButton.isToggleButtonDisplayed(), true);
        assertEquals("OFF", ButtonsPage.toggleButton.getToggleButtonText());
        ButtonsPage.toggleButton.toggleButtonClick();
        assertEquals("ON",ButtonsPage.toggleButton.getToggleButtonText());
        ButtonsPage.toggleButton.toggleButtonClick();
        assertEquals("OFF", ButtonsPage.toggleButton.getToggleButtonText());
    }
}

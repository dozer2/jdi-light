package nativeapp_android;

import com.epam.jdi.light.driver.WebDriverFactory;
import com.epam.jdi.light.mobile.elements.common.AppManager;
import nativeapp.android.ClockApp;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;

import static com.epam.jdi.light.mobile.elements.init.PageFactory.initMobile;
import static com.epam.jdi.light.settings.WebSettings.logger;

public class ClockAppTestsInit {
    @BeforeClass(alwaysRun = true)
    public void setUp() {
        initMobile(ClockApp.class);
        logger.toLog("Run Clock Application Tests");
        AppManager.launchApp();
    }

    @AfterMethod(alwaysRun = true)
    public void resetApp() {
        AppManager.resetApp();
    }

    @AfterClass(alwaysRun = true)
    public void tearDown() {
        WebDriverFactory.quitDriverNativeApp();
    }
}

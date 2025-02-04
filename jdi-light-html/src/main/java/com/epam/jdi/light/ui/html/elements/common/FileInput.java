package com.epam.jdi.light.ui.html.elements.common;

import com.epam.jdi.light.asserts.generic.TextAssert;
import com.epam.jdi.light.common.JDIAction;
import com.epam.jdi.light.elements.base.UIBaseElement;
import com.epam.jdi.light.elements.interfaces.base.HasLabel;
import com.epam.jdi.light.elements.interfaces.base.SetValue;
import com.epam.jdi.light.elements.interfaces.common.IsText;
import org.openqa.selenium.remote.LocalFileDetector;
import org.openqa.selenium.remote.RemoteWebDriver;

import static com.epam.jdi.light.common.ElementArea.JS;
import static com.epam.jdi.light.common.Exceptions.runtimeException;
import static com.epam.jdi.light.common.TextTypes.VALUE;
import static com.epam.jdi.light.settings.JDISettings.DRIVER;
import static com.jdiai.tools.ReflectionUtils.isClass;

/**
 * Created by Roman Iovlev on 26.09.2019
 * Email: roman.iovlev.jdi@gmail.com; Skype: roman.iovlev
 */
public class FileInput extends UIBaseElement<TextAssert> implements HasLabel, IsText, SetValue {
    // region Actions
    @JDIAction("Upload file '{0}' for '{name}'")
    public void uploadFile(String path) {
        if (isDisabled()) {
            throw runtimeException("FileInput '%s' is disabled. Can't upload file", getName());
        }
        if (DRIVER.remoteRun && isClass(core().driver().getClass(), RemoteWebDriver.class)) {
            ((RemoteWebDriver)core().driver()).setFileDetector(new LocalFileDetector());
        }
        core().sendKeys(path);
    }

    @JDIAction("Upload file '{0}' for '{name}'")
    public void uploadFileWithRobot(String path, long mSec) {
        if (isDisabled()) {
            throw runtimeException("FileInput '%s' is disabled. Can't upload file", getName());
        }
        core().click(JS);
        pasteText(path, mSec);
    }
    // endregion

    // region Set and get value for Forms
    public void setValue(String value) {
        uploadFile(value);
    }
    @JDIAction("Get '{name}' file name ") @Override
    public String text() {
        return core().text(VALUE);
    }
    public String getValue() {
        return text();
    }
    // endregion
    @Override
    public TextAssert is() { return new TextAssert().set(this); }
}

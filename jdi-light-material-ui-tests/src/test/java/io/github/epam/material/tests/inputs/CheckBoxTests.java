package io.github.epam.material.tests.inputs;

import io.github.epam.TestsInit;
import org.testng.annotations.Test;

import static io.github.com.StaticSite.checkboxFrame;
import static io.github.com.StaticSite.groupCheckBox;
import static io.github.com.StaticSite.inputCheckboxDisabled;
import static io.github.com.StaticSite.primaryCheckBoxPage;

public class CheckBoxTests extends TestsInit {

    @Test
    public void primaryCheckBoxTest() {
        primaryCheckBoxPage.shouldBeOpened();
        checkboxFrame.checkbox.is().enabled();
        checkboxFrame.checkbox.click();
        checkboxFrame.checkbox.check();
        checkboxFrame.checkbox.is().selected();
        checkboxFrame.checkbox.click();
        checkboxFrame.checkbox.is().unSelected();
        checkboxFrame.checkbox.unCheck();
    }

    @Test
    public void disabledCheckboxTest() {
        inputCheckboxDisabled.shouldBeOpened();
        checkboxFrame.checkbox.is().disabled();
    }

    @Test
    public void groupCheckBoxTest() {
        groupCheckBox.shouldBeOpened();
        checkboxFrame.groupCheckBox.is().assertGroupDisabled();
        checkboxFrame.groupCheckBox.is().assertGroupChecked();
        checkboxFrame.checkbox.is().enabled();
        checkboxFrame.checkbox.click();
        checkboxFrame.checkbox.check();
        checkboxFrame.checkbox.click();
        checkboxFrame.checkbox.unCheck();
    }

}

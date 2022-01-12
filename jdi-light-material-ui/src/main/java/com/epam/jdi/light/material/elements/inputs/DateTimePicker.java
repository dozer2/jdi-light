package com.epam.jdi.light.material.elements.inputs;

import com.epam.jdi.light.common.JDIAction;
import com.epam.jdi.light.elements.base.UIBaseElement;
import com.epam.jdi.light.elements.common.UIElement;
import com.epam.jdi.light.elements.complex.WebList;

import static com.epam.jdi.light.elements.init.UIFactory.$;
import static com.epam.jdi.light.elements.init.UIFactory.$$;
import com.epam.jdi.light.material.asserts.inputs.DateTimePickerAssert;

/**
 * To see an example of Material Date and Time pickers
 * please visit https://material.io/components/date-pickers#usage.
 */

public class DateTimePicker extends UIBaseElement<DateTimePickerAssert> {

    @Override
    public DateTimePickerAssert is() {
        return new DateTimePickerAssert().set(this);
    }

    private UIElement input() {
        return linked("input[class*='MuiInput-input']", "input");
    }

    private WebList calender() {
        return $$("//div[@class = 'MuiPickersBasePicker-pickerView']//p");
    }

    private UIElement toggle() {
        return find("button[aria-label*='change']");
    }

    @JDIAction("Get list of hours in {name}")
    public WebList timer() {
        return $$("//div[@class = 'MuiPickersClock-clock']//span");
    }

    @JDIAction("Select {0} in {name}")
    public void selectDate(String value) {
        if (!isExpanded()) {
            expand();
        }
        calender().select(value);
    }

    @JDIAction("Expand {name}")
    public void expand() {
        toggle().click();
    }

    @JDIAction("Cancel changes in {name} and close")
    public void cancel() {
        $("//div[contains(@role,'dialog')]//*[contains(text(),'Cancel')]").click();
    }

    @JDIAction("Confirm changes in {name} and close")
    public void confirm() {
        $("//div[contains(@role,'dialog')]//*[contains(text(),'OK')]").click();
    }

    @JDIAction("Set text in {name} input field")
    public void input(String text) {
        input().setText(text);
    }

    @JDIAction("Get {name} title")
    public String title() {
        return find("label").text();
    }

    @JDIAction("Check that {name} is expanded")
    public boolean isExpanded() {
        return calender().isExist();
    }

    @JDIAction("Get text from {name} input field")
    public String getText() {
        return input().text();
    }
}

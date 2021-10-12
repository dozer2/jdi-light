package io.github.com.custom;

import com.epam.jdi.light.elements.complex.WebList;
import com.epam.jdi.light.elements.complex.dropdown.Dropdown;

import static com.epam.jdi.light.common.TextTypes.INNER;
import static com.epam.jdi.light.elements.init.UIFactory.$;

public class VuetifyDropdown extends Dropdown {

    @Override
    public WebList list() {
        return $(String.format("#%s", getListId())).finds(listLocator).setUIElementName(INNER);
    }

    private String getListId() {
        return core().attr("aria-owns");
    }

}

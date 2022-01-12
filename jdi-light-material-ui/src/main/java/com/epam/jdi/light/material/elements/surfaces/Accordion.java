package com.epam.jdi.light.material.elements.surfaces;

import com.epam.jdi.light.common.JDIAction;
import com.epam.jdi.light.elements.complex.dropdown.Dropdown;

/**
 * To see an example of Accordion web element please visit
 * https://mui.com/components/accordion/
 */
public class Accordion extends Dropdown {

    @JDIAction("Is '{name} enabled")
    @Override
    public boolean isEnabled() {
        return !value().hasClass("Mui-disabled");
    }
}

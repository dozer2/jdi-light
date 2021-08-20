package io.github.com.custom;

import com.epam.jdi.light.elements.complex.dropdown.DropdownExpand;

public class CustomDropdown extends DropdownExpand {
    public CustomDropdown() {
        expandLocator = ".caret";
        valueLocator = ".filter-option";
        listLocator = "li";
    }
}

package io.github.com.sections.navbar;

import com.epam.jdi.light.elements.composite.Section;
import com.epam.jdi.light.elements.pageobjects.annotations.locators.UI;
import com.epam.jdi.light.ui.bootstrap.elements.complex.ListGroup;
import com.epam.jdi.light.ui.html.elements.common.Link;
import com.epam.jdi.light.ui.html.elements.common.Text;

public class NavbarTextLinks extends Section {
    @UI(".navbar-brand") public Link brand;
    @UI("ul li") public ListGroup listPages;
    @UI(".navbar-text") public Text simpleText;
}

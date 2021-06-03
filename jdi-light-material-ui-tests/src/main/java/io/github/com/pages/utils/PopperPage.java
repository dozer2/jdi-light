package io.github.com.pages.utils;

import com.epam.jdi.light.elements.common.UIElement;
import com.epam.jdi.light.elements.composite.WebPage;
import com.epam.jdi.light.elements.pageobjects.annotations.locators.UI;

import java.util.List;

public class PopperPage extends WebPage {
    @UI("button")
    public static List<com.epam.jdi.light.ui.html.elements.common.Button> buttons;

    @UI("[role='tooltip']")
    public static UIElement tooltip;
}

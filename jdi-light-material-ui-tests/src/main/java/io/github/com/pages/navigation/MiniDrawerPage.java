package io.github.com.pages.navigation;

import com.epam.jdi.light.elements.composite.WebPage;
import com.epam.jdi.light.elements.pageobjects.annotations.locators.UI;
import com.epam.jdi.light.material.annotations.JAppBar;
import com.epam.jdi.light.material.elements.navigation.Drawer;
import com.epam.jdi.light.material.elements.surfaces.AppBar;

public class MiniDrawerPage extends WebPage {

    @UI(".MuiDrawer-paper")
    public static Drawer miniDrawer;

    @JAppBar(
            root = "header.MuiAppBar-root",
            overflowMenuButton = "button"
    )
    public static AppBar appBar;
}

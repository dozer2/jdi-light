package io.github.com.pages.navigation;

import com.epam.jdi.light.elements.composite.WebPage;
import com.epam.jdi.light.elements.pageobjects.annotations.locators.UI;
import com.epam.jdi.light.material.elements.navigation.Tabs;

public class TabPage extends WebPage {
    @UI("h2+div[1] .MuiTab-root")
    public static Tabs simpleTabs;

    @UI("h2+div[2] .MuiTab-root")
    public static Tabs scrollableTabs;

    @UI("h2+div[3] .MuiTab-root")
    public static Tabs preventScrollTabs;

    @UI("h2+div[4] .MuiTab-root")
    public static Tabs verticalTabs;
}

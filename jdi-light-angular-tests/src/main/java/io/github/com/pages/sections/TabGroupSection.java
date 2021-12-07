package io.github.com.pages.sections;

import com.epam.jdi.light.angular.elements.complex.ButtonToggle;
import com.epam.jdi.light.angular.elements.complex.TabGroup;
import com.epam.jdi.light.elements.composite.Section;
import com.epam.jdi.light.ui.html.elements.common.Button;
import com.epam.jdi.light.ui.html.elements.common.Checkbox;
import com.epam.jdi.light.ui.html.elements.common.TextArea;

public class TabGroupSection extends Section {

    public TabGroup basicTab;

    public TabGroup tabWithCustomLabel;

    public TabGroup tabDynamicHeightBasedOnContent;

    public TabGroup tabWithHeadersOnTheBottom;

    public TabGroup tabsWithLazyLoadedContent;

    public TabGroup tabsAsyncLoadingContent;

    public TabGroup tabGroupThemeExample;
    public ButtonToggle matButtonToggleGroupColor;
    public ButtonToggle matButtonToggleGroupBackgroundColor;

    public TabGroup tabsNavBar;
    public Button addLinkButton;
    public Button toggleBackgroundButton;

    public TabGroup dynamicallyChangingTabs;
    public Button addNewTabButton;
    public Button deleteTabButton;
    public Checkbox selectAfterAddingCheckbox;
    public TextArea selectByIndexInput;
}

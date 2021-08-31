package io.github.com.pages.navigation;

import com.epam.jdi.light.elements.common.UIElement;
import com.epam.jdi.light.elements.composite.WebPage;
import com.epam.jdi.light.elements.pageobjects.annotations.locators.UI;
import com.epam.jdi.light.material.elements.displaydata.Lists;
import com.epam.jdi.light.material.elements.navigation.Breadcrumbs;

import java.util.List;

/**
 * To see an example of a Breadcrumbs web element, please visit
 * https://material-ui.com/components/breadcrumbs/
 */

public class RouterBreadcrumbsPage extends WebPage {

    @UI(".MuiBox-root>div>div>:nth-child(1)")
    public static Breadcrumbs routerBreadcrumbs;

    @UI("//span[text()='Trash']")
    public static Lists trashDisplayBlock;

    @UI("//span[text()='Important']")
    public static Lists importantDisplayBlock;

    @UI("//span[text()='Inbox']")
    public static Lists inboxDisplayBlock;

}

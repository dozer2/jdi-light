package io.github.epam.material.tests.navigation.drawer;

import io.github.epam.TestsInit;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import static io.github.com.StaticSite.persistentDrawerPage;
import static io.github.com.pages.navigation.PersistentDrawerPage.appBar;
import static io.github.com.pages.navigation.PersistentDrawerPage.persistentDrawer;

public class PersistentDrawerTests extends TestsInit {

    @BeforeMethod
    public void before() {
        persistentDrawerPage.open();
        persistentDrawerPage.shouldBeOpened();
    }

    @Test
    public void persistentDrawerTest() {
        persistentDrawer.is().notVisible();
        appBar.getOverflowMenuButton().click();
        persistentDrawer.is().displayed();
        persistentDrawer.has().position("left");
        persistentDrawer.has().numberOfListItems(7);
        persistentDrawer.topList().has().size(4);
        persistentDrawer.topList().items().get(3).has().text("Drafts");
        persistentDrawer.topList().items().get(2).icon().is().displayed();
        persistentDrawer.bottomList().has().size(3);
        persistentDrawer.has().width(240);
        persistentDrawer.close();
        persistentDrawer.is().notVisible();
    }
}

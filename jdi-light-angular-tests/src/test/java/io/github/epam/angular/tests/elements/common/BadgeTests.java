package io.github.epam.angular.tests.elements.common;

import io.github.epam.TestsInit;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import static io.github.com.StaticSite.angularPage;
import static io.github.com.pages.AngularPage.badgeSection;
import static io.github.epam.site.steps.States.shouldBeLoggedIn;

public class BadgeTests extends TestsInit {

    @BeforeMethod
    public void before() {
        shouldBeLoggedIn();
        angularPage.shouldBeOpened();
    }

    @Test
    public void basicBadgeTest() {
        badgeSection.badgeWithText.is().displayed();
        badgeSection.badgeWithButton.is().displayed();
        badgeSection.badgeWithIcon.is().displayed();
    }

    @Test
    public void badgeTextTest() {
        badgeSection.badgeWithText.isDisplayed();
        badgeSection.badgeWithText.has().text("4");

        badgeSection.badgeWithButton.isDisplayed();
        badgeSection.badgeWithButton.has().text("8");

        badgeSection.badgeWithIcon.isDisplayed();
        badgeSection.badgeWithIcon.has().text("15");

    }

    @Test
    public void hiddenMessageTest() {
        badgeSection.buttonWithBadge.isDisplayed();
        badgeSection.textOnButton.has().text("Show message");
        badgeSection.hiddenText.isNotExist();
        badgeSection.buttonWithBadge.click();
        badgeSection.textOnButton.has().text("Hide message");
        badgeSection.hiddenText.is().displayed();
        badgeSection.hiddenText.has().text("Top secret message");
    }
}

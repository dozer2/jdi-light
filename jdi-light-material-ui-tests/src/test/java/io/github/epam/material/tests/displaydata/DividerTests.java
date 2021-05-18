package io.github.epam.material.tests.displaydata;

import static io.github.com.StaticSite.insetDividersPage;
import static io.github.com.StaticSite.verticalDividerPage;

import io.github.epam.TestsInit;
import org.testng.annotations.Test;

/**
 * To see an example of Divider web element please visit https://material-ui.com/components/dividers/
 */

public class DividerTests extends TestsInit {

    @Test
    public void insetDividerTest() {
        insetDividersPage.open();
        insetDividersPage.insetDivider.forEach(
                d -> d.is().inset()
        );
    }

    @Test
    public void verticalDividerTest() {
        verticalDividerPage.open();
        verticalDividerPage.verticalDivider.is().vertical();
    }

}

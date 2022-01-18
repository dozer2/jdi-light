package com.jdiai.tests;

import com.jdiai.DataList;
import com.jdiai.TestInit;
import com.jdiai.entities.SearchItem;
import com.jdiai.testng.TestNGListener;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import java.util.List;

import static com.jdiai.asserts.Conditions.size;
import static com.jdiai.entities.User.Roman;
import static com.jdiai.site.JDISite.homePage;
import static com.jdiai.site.JDISite.searchPage;
import static com.jdiai.states.States.atHomePage;
import static com.jdiai.states.States.logout;
import static com.jdiai.test.data.TestData.AllSearchResults;
import static com.jdiai.test.data.TestData.SearchResults;
import static com.jdiai.tools.Alerts.validateAlertText;
import static com.jdiai.tools.PrintUtils.print;
import static org.testng.Assert.assertEquals;

@Listeners(TestNGListener.class)
public class ListEntitiesPOTest implements TestInit {

    @BeforeMethod
    public void before() {
        logout();
        atHomePage();
        homePage.userIcon.click();
        homePage.loginForm.loginAs(Roman);
        homePage.searchIcon.click();
        homePage.searchField.input("jdi");
        homePage.searchIcon.click();
    }

    @Test
    public void entitiesListTest() {
        List<SearchItem> results = searchPage.searchResults;
        assertEquals(results.size(), 6);
        assertEquals(results.get(2).title, "JDI TEST SITE");
        assertEquals(print(results, SearchItem::toString), SearchResults);
    }

    @Test
    public void entitiesDataTest() {
        DataList<SearchItem> results = searchPage.searchData;
        assertEquals(results.size(), 6);
        assertEquals(results.get("JDI TEST SITE").link, "https://jdi-testing.github.io/jdi-light/");
        assertEquals(print(results, SearchItem::toString), SearchResults);
    }

    @Test
    public void genericDataTest() {
        DataList<SearchItem> results = searchPage.searchDataGeneric.searchData;
        assertEquals(results.size(), 6);
        assertEquals(results.get("JDI TEST SITE").link, "https://jdi-testing.github.io/jdi-light/");
        assertEquals(print(results, SearchItem::toString), SearchResults);
    }

    @Test
    public void waitForSizeDataTest() {
        DataList<SearchItem> results = searchPage.searchData;
        assertEquals(results.size(), 6);
        assertEquals(print(results, SearchItem::toString), SearchResults);
        results.waitFor(size(s -> s > 6));
        assertEquals(results.size(), 8);
        assertEquals(print(results, SearchItem::toString), AllSearchResults);
    }

    @Test
    public void waitByValueDataTest() {
        DataList<SearchItem> results = searchPage.searchData;
        assertEquals(results.get("JDI FACEBOOK GROUP").link, "https://www.facebook.com/groups/jdi.framework/");
        assertEquals(print(results, SearchItem::toString), AllSearchResults);
    }

    @Test
    public void waitByIndexDataTest() {
        DataList<SearchItem> results = searchPage.searchData;
        assertEquals(results.get(6).link, "https://www.facebook.com/groups/jdi.framework/");
        assertEquals(print(results, SearchItem::toString), AllSearchResults);
    }

    @Test
    public void selectValue() {
        DataList<SearchItem> results = searchPage.searchData;
        results.select("JDI OWNER CONTACT");
        validateAlertText("JDI Owner contact!");
        validateAlertText("JDI Owner contact-");
    }

    @Test
    public void waitSelectValue() {
        DataList<SearchItem> results = searchPage.searchData;
        results.select("JDI FACEBOOK GROUP");
        validateAlertText("JDI Facebook Group!");
        validateAlertText("JDI Facebook Group-");
    }

    @Test
    public void selectIndex() {
        DataList<SearchItem> results = searchPage.searchData;
        results.select(1);
        validateAlertText("JDI Owner contact-");
    }

    @Test
    public void waitSelectIndex() {
        DataList<SearchItem> results = searchPage.searchData;
        results.select(6);
        validateAlertText("JDI Facebook Group-");
    }
}

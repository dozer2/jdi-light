package io.github.epam.html.tests.elements.complex.combobox;

import io.github.epam.TestsInit;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import static com.epam.jdi.light.settings.JDISettings.ELEMENT;
import static io.github.com.StaticSite.html5Page;
import static io.github.com.pages.HtmlElementsPage.iceCream;
import static io.github.epam.html.tests.elements.BaseValidations.baseValidation;
import static io.github.epam.html.tests.elements.complex.enums.IceCreamFlavors.Strawberry;
import static io.github.epam.html.tests.elements.complex.enums.IceCreamFlavors.Vanilla;
import static io.github.epam.html.tests.site.steps.States.shouldBeLoggedIn;
import static org.hamcrest.Matchers.containsString;
import static org.hamcrest.Matchers.is;
import static org.testng.Assert.assertEquals;

public class DataListTests implements TestsInit {

    private String defaultText = "Coconut";
    private String[] values = {"Chocolate", "Coconut", "Mint", "Strawberry", "Vanilla"};

    @BeforeMethod
    public void before() {
        shouldBeLoggedIn();
        html5Page.shouldBeOpened();
        iceCream.select(defaultText);
    }

    @Test
    public void getValueTest() {
        assertEquals(iceCream.getValue(), defaultText);
    }

    @Test
    public void getTextTest() {
        assertEquals(iceCream.getText(), defaultText);
    }

    @Test
    public void inputTest() {
        iceCream.input("New text");
        assertEquals(iceCream.getText(), "New text");
    }

    @Test
    public void inputNullValueTest() {
        String value = iceCream.getText();
        iceCream.input(null);
        iceCream.has().text(value);
    }

    @Test
    public void clearTest() {
        iceCream.clear();
        assertEquals(iceCream.getText(), "");
    }

    @Test
    public void placeholderTest() {
        assertEquals(iceCream.placeholder(), "Ice cream");
    }

    @Test
    public void focusTest() {
        iceCream.focus();
    }

    @Test
    public void sendKeysTest() {
        iceCream.sendKeys("Test");
        assertEquals(iceCream.getValue(), defaultText +"Test");
    }

    @Test
    public void sendNullValueTest() {
        String optionName = null;
        iceCream.sendKeys(optionName);
        iceCream.has().text(defaultText);
    }

    @Test
    public void sendFirstNullValueTest() {
        iceCream.sendKeys(null, "Test");
        iceCream.has().text(defaultText);
    }

    @Test
    public void selectTest() {
        iceCream.select("Chocolate");
        assertEquals(iceCream.getValue(), "Chocolate");
    }

    @Test
    public void setNullValueTest() {
        String optionName = null;
        iceCream.select(optionName);
        iceCream.has().text(defaultText);
    }

    @Test
    public void selectEnumTest() {
        iceCream.select(Strawberry);
        assertEquals(iceCream.getValue(), "Strawberry");
    }
    @Test
    public void selectNumTest() {
        iceCream.clear();
        iceCream.select(ELEMENT.startIndex + 4);
        assertEquals(iceCream.getValue(), "Vanilla");
    }
    @Test
    public void selectedTest() {
        assertEquals(iceCream.selected(), defaultText);
    }

    @Test
    public void labelTest() {
        assertEquals(iceCream.label().getText(), "Choose your lovely icecream");
        iceCream.label().is().text(containsString("lovely icecream"));
    }

    @Test
    public void isValidationTest() {
        iceCream.is().enabled();
        iceCream.is().text(is(defaultText));
        iceCream.select(Vanilla);
        iceCream.is().text(containsString("Van"));
    }

    @Test
    public void assertValidationTest() {
        iceCream.assertThat().text(is(defaultText));
    }

    @Test
    public void baseValidationTest() {
        baseValidation(iceCream);
    }

    @Test
    public void valuesTest() {
        iceCream.is().values(values);
    }

    @Test
    public void attrsTest() {
        assertEquals(iceCream.list().attrs("value").toArray(), values);
    }
}

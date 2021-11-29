package io.github.epam.vuetify.tests.common;

import static io.github.com.StaticSite.radioButtonsPage;
import static io.github.com.pages.RadioButtonsPage.colorRadioButton;
import static io.github.com.pages.RadioButtonsPage.directionRadioButton;
import static io.github.com.pages.RadioButtonsPage.labelRadioButton;
import static io.github.com.pages.RadioButtonsPage.mandatoryRadioButton;
import static io.github.com.pages.RadioButtonsPage.mandatoryText;

import io.github.com.enums.Colors;
import io.github.epam.TestsInit;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class RadioButtonsTests extends TestsInit {


    @BeforeClass
    public void before() {
        radioButtonsPage.open();
    }

    @Test
    public void colorsTest() {
        colorRadioButton.get(1).is().checked();
        colorRadioButton.get(1).is().color(Colors.RED.value());
        colorRadioButton.get(1).is().labelText("red");

        colorRadioButton.get(6).is().unchecked();
        colorRadioButton.get(6).check();
        colorRadioButton.get(6).is().checked();
        colorRadioButton.get(6).is().color(Colors.ORANGE_DARKEN_3.value());
        colorRadioButton.get(6).is().labelText("orange darken-3");
    }

    @Test
    public void directionTest() {
        directionRadioButton.get(1).is().groupDirection("column");
        directionRadioButton.get(3).is().groupDirection("row");
    }

    @Test
    public void mandatoryTest() {
        mandatoryRadioButton.get(1).check();
        mandatoryText.is().text("radio-1");
        mandatoryRadioButton.get(2).check();
        mandatoryText.is().text("radio-2");
    }

    @Test
    public void labelTest() {
        labelRadioButton.get(1).is().labelText("Of course it's Google");
        labelRadioButton.get(2).is().labelText("Definitely Duckduckgo");
    }
}

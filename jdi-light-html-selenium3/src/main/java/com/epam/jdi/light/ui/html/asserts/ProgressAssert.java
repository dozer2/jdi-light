package com.epam.jdi.light.ui.html.asserts;

import com.epam.jdi.light.asserts.generic.UIAssert;
import com.epam.jdi.light.common.JDIAction;
import com.epam.jdi.light.ui.html.elements.common.ProgressBar;
import org.hamcrest.Matcher;
import org.hamcrest.Matchers;

import static com.epam.jdi.light.asserts.core.SoftAssert.jdiAssert;

/**
 * Created by Roman Iovlev on 14.02.2018
 * Email: roman.iovlev.jdi@gmail.com; Skype: roman.iovlev
 */
public class ProgressAssert extends UIAssert<ProgressAssert, ProgressBar> {
    @JDIAction("Assert that '{name}' max value {0}")
    public ProgressAssert max(Matcher<Integer> max) {
        jdiAssert(element().max(), max);
        return this;
    }
    public ProgressAssert max(int maxVolume) { return max(Matchers.is(maxVolume)); }

    @JDIAction("Assert that '{name}' value {0}")
    public ProgressAssert value(Matcher<Integer> value) {
        jdiAssert(element().value(), value);
        return this;
    }
    public ProgressAssert value(int value) { return value(Matchers.is(value)); }
}
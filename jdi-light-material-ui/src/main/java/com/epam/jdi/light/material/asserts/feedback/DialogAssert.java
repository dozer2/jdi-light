package com.epam.jdi.light.material.asserts.feedback;

import com.epam.jdi.light.asserts.generic.UIAssert;
import com.epam.jdi.light.common.JDIAction;
import com.epam.jdi.light.material.elements.feedback.Dialog;
import org.hamcrest.Matchers;

import static com.epam.jdi.light.asserts.core.SoftAssert.jdiAssert;

public class DialogAssert extends UIAssert<DialogAssert, Dialog> {

    @JDIAction("Assert that '{name}' has scrollable content")
    public DialogAssert scrollableContent() {
        jdiAssert(element().hasScrollableContent() ? "has scrollable content" : "does not have scrollable content",
                Matchers.is("has scrollable content"));
        return this;
    }

    @JDIAction("Assert that '{name}' has scrollable body")
    public DialogAssert scrollableBody() {
        jdiAssert(element().hasScrollableBody() ? "has scrollable body" : "does not have scrollable body",
                Matchers.is("has scrollable body"));
        return this;
    }
}

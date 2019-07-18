package com.epam.jdi.light.elements.base;

import com.epam.jdi.light.common.JDIAction;
import com.epam.jdi.light.elements.common.Label;
import org.openqa.selenium.By;

public interface WithLabel extends IBaseElement {
    default Label label() {
        return new Label().setup(Label.class, j->j
            .setLocator(By.cssSelector("[for="+ core().attr("id")+"]"))
            .setName(getName() + " label"));
    }
    /**
     * Gets label text
     * @return String text
     */
    @JDIAction("Get '{name}' label text")
    default String labelText() {
        return label().getText();
    }
}

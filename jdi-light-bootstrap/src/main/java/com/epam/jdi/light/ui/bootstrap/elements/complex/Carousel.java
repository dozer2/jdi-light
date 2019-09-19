package com.epam.jdi.light.ui.bootstrap.elements.complex;

import static com.epam.jdi.light.common.Exceptions.exception;
import static com.epam.jdi.light.common.TextTypes.TEXT;

import com.epam.jdi.light.asserts.generic.TextAssert;
import com.epam.jdi.light.common.JDIAction;
import com.epam.jdi.light.elements.base.UIBaseElement;
import com.epam.jdi.light.elements.common.UIElement;
import com.epam.jdi.light.elements.complex.WebList;
import com.epam.jdi.light.elements.interfaces.common.IsButton;
import com.epam.jdi.light.elements.interfaces.common.IsText;

public class Carousel extends UIBaseElement<TextAssert> implements IsText, IsButton{
	public String getText() { return text(TEXT); }
	
    public String currentSlideLocator = "//div[contains(@class,'carousel-item active')]";
	
	public UIElement currentSlide() {
        return linked(currentSlideLocator, "current");
    }
	
	public String nextLocator = ".carousel-control-next";
	
	public UIElement nextControl() {
        return linked(nextLocator, "next");
    }
	
	@JDIAction("Click 'next control' in '{name}'")
	public void next() {
		nextControl().click();
	}
	
	public String prevLocator = ".carousel-control-prev";
    
	public UIElement prevControl() {
        return linked(prevLocator, "prev");
    }
	
	@JDIAction("Click 'prev control' in '{name}'")
	public void prev() {
		prevControl().click();
	}
	
	public String indicatorsLocator = "li";
		
    public WebList indicators() {
        return linkedList(indicatorsLocator, "indicators");
    }
    
    public void select(int index) {
        if (index < 1)
            throw exception("Can't get element with index '%s'. Index should be 1 or more", index);
        indicators().select(index - 1);
    }
    
    @JDIAction("Current slide interval in '{name}'")
    public int interval() {
    	return Integer.valueOf(currentSlide().getAttribute("data-interval"));
    }
    
    @Override
    public TextAssert is() { return new TextAssert().set(this); }
}

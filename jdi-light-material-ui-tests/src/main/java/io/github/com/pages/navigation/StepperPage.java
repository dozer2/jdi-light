package io.github.com.pages.navigation;

import com.epam.jdi.light.elements.composite.WebPage;
import com.epam.jdi.light.elements.pageobjects.annotations.locators.UI;
import com.epam.jdi.light.material.elements.navigation.Stepper;
import com.epam.jdi.light.ui.html.elements.common.Button;
import com.epam.jdi.light.ui.html.elements.common.Text;

public class StepperPage extends WebPage {
    @UI("#simpleStepper .MuiStep-root")
    public static Stepper simpleLinearStepper;

    @UI("//div[@id='simpleStepper']/..//button[1]")
    public static Button simpleLinearStepperBackButton;

    @UI("//div[@id='simpleStepper']/..//button[2]")
    public static Button simpleLinearStepperNextButton;

    @UI("#nonLinearStepper .MuiStep-root")
    public static Stepper nonlinearStepper;

    @UI("//p[@id='activeNonLinearStep']/..//button[1]")
    public static Button nonlinearStepperBackButton;

    @UI("//p[@id='activeNonLinearStep']/..//button[2]")
    public static Button nonlinearStepperNextButton;

    @UI("//p[@id='activeNonLinearStep']/..//button[3]")
    public static Button nonlinearStepperCompleteStepButton;

    @UI(".MuiStep-vertical")
    public static Stepper verticalStepper;

    @UI("//h2[text()='Vertical stepper']/following-sibling::div[1]//button[1]")
    public static Button verticalStepperBackButton;

    @UI("//h2[text()='Vertical stepper']/following-sibling::div[1]//button[2]")
    public static Button verticalStepperNextButton;

    @UI("(//*[text()='Mobile text stepper']/following-sibling::div//*[contains(@class, 'MuiMobileStepper-root')])[1]")
    public static Stepper mobileTextStepper;

    @UI("//*[@id='activeDotStep']")
    public static Text mobileDotsStepperTitle;

    @UI("(//*[text()='Mobile text stepper']/following-sibling::div//*[contains(@class, 'MuiMobileStepper-root')])[2]")
    public static Stepper mobileDotsStepper;

    @UI("//*[@id='activeProgressStep']")
    public static Text mobileProgressStepperTitle;

    @UI("(//*[text()='Mobile text stepper']/following-sibling::div//*[contains(@class, 'MuiMobileStepper-root')])[3]")
    public static Stepper mobileProgressStepper;
}

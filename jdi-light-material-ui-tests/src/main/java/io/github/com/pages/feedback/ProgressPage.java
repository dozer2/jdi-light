package io.github.com.pages.feedback;

import com.epam.jdi.light.elements.composite.WebPage;
import com.epam.jdi.light.elements.pageobjects.annotations.locators.UI;
import com.epam.jdi.light.material.annotations.JProgress;
import com.epam.jdi.light.material.elements.feedback.progress.CircularProgress;
import com.epam.jdi.light.material.elements.feedback.progress.LinearProgress;
import com.epam.jdi.light.ui.html.elements.common.Button;
import com.epam.jdi.light.ui.html.elements.common.Text;

public class ProgressPage extends WebPage {
    @JProgress(root = "#circularIndeterminateProgress")
    public static CircularProgress circularIndeterminate;

    @JProgress(root = "(//div[@aria-valuenow='25'])[1]")
    public static CircularProgress circularDeterminateWithValue25;

    @JProgress(root = "(//div[@aria-valuenow='50'])[1]")
    public static CircularProgress circularDeterminateWithValue50;

    @JProgress(root = "(//div[@aria-valuenow='75'])[1]")
    public static CircularProgress circularDeterminateWithValue75;

    @JProgress(root = "(//div[@aria-valuenow='100'])[1]")
    public static CircularProgress circularDeterminateWithValue100;

    @JProgress(root = "(//div[@aria-valuenow='100']/following-sibling::div)[1]")
    public static CircularProgress circularDeterminateProgress;

    @JProgress(root = "(//h2[text()='Circular determinate']/following::div[@role='progressbar'])[6]")
    public static CircularProgress circularDeterminateIndeterminateProgress;

    @UI("//button[@aria-label='save']")
    public static Button interactiveIntegrationCircularButton;

    @JProgress(root = "//button[@aria-label='save']/following-sibling::div")
    public static CircularProgress interactiveIntegrationCircularIndeterminate;

    @JProgress(root = "(//h2[text()='Circular with label']/following::div[@role='progressbar'])[1]",
            label = "div.MuiTypography-caption")
    public static CircularProgress circularDeterminateProgressWithLabel;

    @JProgress(root = "(//h2[text()='Linear indeterminate']/following::div)[2]",
            bar1 = ".MuiLinearProgress-bar1Indeterminate",
            bar2 = ".MuiLinearProgress-bar2Indeterminate")
    public static LinearProgress linearIndeterminate;

    @JProgress(root = "(//h2[text()='Linear determinate']/following::div)[2]")
    public static LinearProgress linearDeterminate;

    @JProgress(root = "(//h2[text()='Linear buffer']/following::div)[2]")
    public static LinearProgress linearBuffer;

    @JProgress(root = "//h2[text()='Linear with label']/following::*[contains(@class, 'MuiLinearProgress-root')]",
            label = "p.MuiTypography-root")
    public static LinearProgress linearWithLabel;

    @JProgress(root = "(//h2[text()='Customized progress']/following::div[@role='progressbar'])[2]")
    public static CircularProgress circularIndeterminateCustomized;

    @JProgress(root = "(//h2[text()='Customized progress']/following::div[@role='progressbar'])[3]")
    public static LinearProgress linearDeterminateCustomized;

    @UI("//*[text()='Loading']/..")
    public static Button startLoadingButton;

    @JProgress(root = "//*[text()='Stop loading']/../../div/div")
    public static CircularProgress loadingCircularIndeterminate;

    @UI("//*[text()='Simulate a load']")
    public static Button simulateLoadButton;

    @JProgress(root = "//*[text()='Reset']/../preceding-sibling::div[1]/div")
    public static CircularProgress simulateLoadCircularIndeterminate;

    @UI("//p[text()='Success!']")
    public static Text successMessage;
}

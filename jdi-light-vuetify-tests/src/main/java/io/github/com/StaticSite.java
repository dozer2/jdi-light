package io.github.com;
import com.epam.jdi.light.elements.composite.Form;
import com.epam.jdi.light.elements.pageobjects.annotations.JSite;
import com.epam.jdi.light.elements.pageobjects.annotations.Url;
import com.epam.jdi.light.elements.pageobjects.annotations.locators.Css;
import com.epam.jdi.light.elements.pageobjects.annotations.locators.UI;
import com.epam.jdi.light.ui.html.elements.common.Button;
import com.epam.jdi.light.ui.html.elements.common.Text;
import io.github.com.entities.User;
import io.github.com.pages.VuetifyPage;

@JSite("https://jdi-testing.github.io/jdi-light/")
public class StaticSite {

    public static User DEFAULT_USER = new User();

    @Url("/vuetify.html")
    public static VuetifyPage vuetifyPage;

    @UI("#login-form")
    public static Form<User> loginForm;

    @Css(".logout")
    public static Button logout;
    public static Button userIcon;
    public static Text userName;
}

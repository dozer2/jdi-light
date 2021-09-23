package io.github.com.pages;

import com.epam.jdi.light.elements.pageobjects.annotations.locators.UI;
import com.epam.jdi.light.vuetify.elements.common.Avatar;
import io.github.com.custom.ProfileCard;

import java.util.List;

import static io.github.com.custom.ProfileCard.PROFILE_CARD_LOCATOR;

public class AvatarsPage extends VuetifyPage {

    @UI("//div[@id = 'avatarsWithSize']/div/div")
    public static List<Avatar> avatarsWithSize;

    @UI("//div[@id = 'tileAvatar']//div[contains(@class, 'v-avatar')]")
    public static Avatar tileAvatar;

    @UI("//div[@id = 'slotAvatars']//div[contains(@class, 'v-avatar')]")
    public static List<Avatar> slotAvatars;

    @UI(PROFILE_CARD_LOCATOR)
    public static ProfileCard profileCard;

}

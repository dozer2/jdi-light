package nativeapp_ios.tests;

import nativeapp.ios.messages.ContactsListPage;
import nativeapp.ios.messages.MessagesListPage;
import nativeapp.ios.messages.NewMessagePage;
import nativeapp.ios.messages.WhatsNewPage;
import nativeapp_ios.MessagesAppTestsInit;
import org.testng.annotations.Test;

public class MessagesAppTests extends MessagesAppTestsInit {

    @Test
    public void addContactButtonTest() {
        if (WhatsNewPage.continueButton.isDisplayed()) {
            WhatsNewPage.continueButton.tap();
        }

        MessagesListPage.newMessageButton.tap();

        NewMessagePage.addContactButton.openContacts();

        ContactsListPage.contactNavBar.is().displayed();
        ContactsListPage.cancelButton.cancel();

        NewMessagePage.addContactButton.is().displayed();
    }

    @Test
    public void editMenuTest() {
        if (WhatsNewPage.continueButton.isDisplayed()) {
            WhatsNewPage.continueButton.tap();
        }

        MessagesListPage.newMessageButton.tap();

        NewMessagePage.messageTextField.setValue("Test");
        NewMessagePage.messageTextField.doubleTap();
        NewMessagePage.messageEditMenu.copy();
        NewMessagePage.messageTextField.doubleTap();
        NewMessagePage.messageEditMenu.cut();
        NewMessagePage.messageTextField.is().empty();
        NewMessagePage.messageTextField.doubleTap();
        NewMessagePage.messageEditMenu.paste();
        NewMessagePage.messageTextField.is().text("Test");
    }
}

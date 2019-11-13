package io.github.com.sections.form;

import com.epam.jdi.light.ui.bootstrap.elements.common.Button;
import com.epam.jdi.light.ui.bootstrap.elements.common.TextArea;
import com.epam.jdi.light.ui.bootstrap.elements.common.TextField;
import com.epam.jdi.light.ui.bootstrap.elements.composite.Form;
import io.github.com.entities.SupportMessage;

public class SupportMessageForm extends Form<SupportMessage> {

    public TextField supportEmail;
    public TextArea supportMessage;

    public Button supportButtonSubmit;
    public Button supportButtonClear;
}

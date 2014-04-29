package by.bsuir.graduationproject.registration.gui.field;

import by.bsuir.graduationproject.common.gui.component.GUIComponent;
import by.bsuir.graduationproject.registration.gui.utils.RegistrationKeys;

import javax.swing.JTextField;

/**
 * @author l.zverugo Date: 26.04.14 Time: 17:41.
 */
public class RegistrationFirstNameField extends JTextField implements GUIComponent {

    public RegistrationFirstNameField() {
        super(15);
        build();
    }

    private void build() {
        initializeBounds();
        setComponentSpecificAttributes();
    }

    @Override
    public void initializeBounds() {
        this.setBounds(
                RegistrationKeys.FIRST_NAME_TEXT_FIELD_X_POSITION,
                RegistrationKeys.FIRST_NAME_TEXT_FIELD_Y_POSITION,
                RegistrationKeys.FIRST_NAME_TEXT_FIELD_WIDTH,
                RegistrationKeys.FIRST_NAME_TEXT_FIELD_HEIGHT
        );
    }

    @Override
    public void setComponentSpecificAttributes() {
        this.setFont(RegistrationKeys.FIRST_NAME_TEXT_FIELD_FONT);
    }
}

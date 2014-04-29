package by.bsuir.graduationproject.registration.gui.field;

import by.bsuir.graduationproject.common.gui.component.GUIComponent;
import by.bsuir.graduationproject.registration.gui.utils.RegistrationKeys;

import javax.swing.JTextField;

/**
 * @author l.zverugo Date: 26.04.14 Time: 17:46.
 */
public class RegistrationGroupNumberField extends JTextField implements GUIComponent {

    public RegistrationGroupNumberField() {
        super(6);
        build();
    }

    private void build() {
        initializeBounds();
        setComponentSpecificAttributes();
    }

    @Override
    public void initializeBounds() {
        this.setBounds(
                RegistrationKeys.GROUP_TEXT_FIELD_X_POSITION,
                RegistrationKeys.GROUP_TEXT_FIELD_Y_POSITION,
                RegistrationKeys.GROUP_TEXT_FIELD_WIDTH,
                RegistrationKeys.GROUP_TEXT_FIELD_HEIGHT
        );
    }

    @Override
    public void setComponentSpecificAttributes() {
        this.setFont(RegistrationKeys.GROUP_TEXT_FIELD_FONT);
    }
}

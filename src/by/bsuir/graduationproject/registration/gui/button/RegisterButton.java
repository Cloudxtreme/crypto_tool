package by.bsuir.graduationproject.registration.gui.button;

import by.bsuir.graduationproject.common.gui.component.GUIComponent;
import by.bsuir.graduationproject.registration.gui.utils.RegistrationKeys;

import javax.swing.JButton;

/**
 * @author l.zverugo Date: 26.04.14 Time: 20:12.
 */
public class RegisterButton extends JButton implements GUIComponent {
    public RegisterButton() {
        build();
    }

    private void build() {
        initializeBounds();
        setComponentSpecificAttributes();
    }

    @Override
    public void initializeBounds() {
        this.setBounds(
                RegistrationKeys.REGISTRATION_BUTTON_X_POSITION,
                RegistrationKeys.REGISTRATION_BUTTON_Y_POSITION,
                RegistrationKeys.REGISTRATION_BUTTON_WIDTH,
                RegistrationKeys.REGISTRATION_BUTTON_HEIGHT
        );
    }

    @Override
    public void setComponentSpecificAttributes() {
        this.setText(RegistrationKeys.REGISTRATION_BUTTON_LABEL);
    }
}

package by.bsuir.graduationproject.registration.gui.label;

import by.bsuir.graduationproject.common.gui.component.GUIComponent;
import by.bsuir.graduationproject.registration.gui.utils.RegistrationKeys;

import javax.swing.JLabel;

/**
 * @author l.zverugo Date: 26.04.14 Time: 17:50.
 */
public class RegistrationFirstNameLabel extends JLabel implements GUIComponent {
    public RegistrationFirstNameLabel() {
        build();
    }

    private void build() {
        initializeBounds();
        setComponentSpecificAttributes();
    }

    @Override
    public void initializeBounds() {
        this.setBounds(
                RegistrationKeys.FIRST_NAME_LABEL_X_POSITION,
                RegistrationKeys.FIRST_NAME_LABEL_Y_POSITION,
                RegistrationKeys.FIRST_NAME_LABEL_WIDTH,
                RegistrationKeys.FIRST_NAME_LABEL_HEIGHT
        );
    }

    @Override
    public void setComponentSpecificAttributes() {
        this.setText(RegistrationKeys.FIRST_NAME_LABEL_TEXT);
        this.setForeground(RegistrationKeys.REGISTRATION_PANEL_FOREGROUND_TEXT_COLOR);
        this.setFont(RegistrationKeys.FIRST_NAME_LABEL_FONT);
    }
}

package by.bsuir.graduationproject.registration.gui.label;

import by.bsuir.graduationproject.common.gui.component.GUIComponent;
import by.bsuir.graduationproject.registration.gui.utils.RegistrationKeys;

import javax.swing.JLabel;

/**
 * @author l.zverugo Date: 26.04.14 Time: 17:48.
 */
public class RegistrationInformationLabel extends JLabel implements GUIComponent {
    public RegistrationInformationLabel() {
        build();
    }

    private void build() {
        initializeBounds();
        setComponentSpecificAttributes();
    }

    @Override
    public void initializeBounds() {
        this.setBounds(
                RegistrationKeys.REGISTRATION_INFORMATION_LABEL_X_POSITION,
                RegistrationKeys.REGISTRATION_INFORMATION_LABEL_Y_POSITION,
                RegistrationKeys.REGISTRATION_INFORMATION_LABEL_WIDTH,
                RegistrationKeys.REGISTRATION_INFORMATION_LABEL_HEIGHT
        );
    }

    @Override
    public void setComponentSpecificAttributes() {
        this.setText(RegistrationKeys.REGISTRATION_INFORMATION_LABEL_TEXT);
        this.setForeground(RegistrationKeys.REGISTRATION_FRAME_FOREGROUND_TEXT_COLOR);
        this.setFont(RegistrationKeys.REGISTRATION_INFORMATION_LABEL_FONT);
    }
}

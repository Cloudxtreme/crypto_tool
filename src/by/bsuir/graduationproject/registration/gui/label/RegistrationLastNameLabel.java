package by.bsuir.graduationproject.registration.gui.label;

import by.bsuir.graduationproject.common.gui.component.GUIComponent;
import by.bsuir.graduationproject.registration.gui.utils.RegistrationKeys;

import javax.swing.JLabel;

/**
 * @author l.zverugo Date: 26.04.14 Time: 17:51.
 */
public class RegistrationLastNameLabel extends JLabel implements GUIComponent {
    public RegistrationLastNameLabel() {
        build();
    }

    private void build() {
        initializeBounds();
        setComponentSpecificAttributes();
    }

    @Override
    public void initializeBounds() {
        this.setBounds(
                RegistrationKeys.LAST_NAME_LABEL_X_POSITION,
                RegistrationKeys.LAST_NAME_LABEL_Y_POSITION,
                RegistrationKeys.LAST_NAME_LABEL_WIDTH,
                RegistrationKeys.LAST_NAME_LABEL_HEIGHT
        );
    }

    @Override
    public void setComponentSpecificAttributes() {
        this.setText(RegistrationKeys.LAST_NAME_LABEL_TEXT);
        this.setForeground(RegistrationKeys.REGISTRATION_FRAME_FOREGROUND_TEXT_COLOR);
        this.setFont(RegistrationKeys.LAST_NAME_LABEL_FONT);
    }
}

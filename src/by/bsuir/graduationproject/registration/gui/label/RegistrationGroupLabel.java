package by.bsuir.graduationproject.registration.gui.label;

import by.bsuir.graduationproject.common.gui.component.GUIComponent;
import by.bsuir.graduationproject.registration.gui.utils.RegistrationKeys;

import javax.swing.JLabel;

/**
 * @author l.zverugo Date: 26.04.14 Time: 17:49.
 */
public class RegistrationGroupLabel extends JLabel implements GUIComponent {
    public RegistrationGroupLabel() {
        build();
    }

    private void build() {
        initializeBounds();
        setComponentSpecificAttributes();
    }

    @Override
    public void initializeBounds() {
        this.setBounds(
                RegistrationKeys.GROUP_LABEL_X_POSITION,
                RegistrationKeys.GROUP_LABEL_Y_POSITION,
                RegistrationKeys.GROUP_LABEL_WIDTH,
                RegistrationKeys.GROUP_LABEL_HEIGHT
        );
    }

    @Override
    public void setComponentSpecificAttributes() {
        this.setText(RegistrationKeys.GROUP_LABEL_TEXT);
        this.setFont(RegistrationKeys.GROUP_LABEL_FONT);
        this.setForeground(RegistrationKeys.REGISTRATION_FRAME_FOREGROUND_TEXT_COLOR);
    }
}

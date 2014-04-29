package by.bsuir.graduationproject.registration.gui.frame;

import by.bsuir.graduationproject.common.gui.component.Container;
import by.bsuir.graduationproject.common.gui.component.GUIComponent;
import by.bsuir.graduationproject.registration.gui.panel.RegistrationPanel;
import by.bsuir.graduationproject.registration.gui.utils.RegistrationKeys;

import javax.swing.JFrame;
import javax.swing.WindowConstants;

/**
 * @author l.zverugo Date: 26.04.14 Time: 17:15.
 */
public class RegistrationFrame extends JFrame implements GUIComponent, Container {

    public RegistrationFrame() {
        super(RegistrationKeys.REGISTRATION_FRAME_NAME);
        build();
    }

    private void build() {
        initializeBounds();
        setComponentSpecificAttributes();
        addContent();
    }

    @Override
    public void initializeBounds() {
        this.setBounds(
                RegistrationKeys.REGISTRATION_FRAME_X_POSITION,
                RegistrationKeys.REGISTRATION_FRAME_Y_POSITION,
                RegistrationKeys.REGISTRATION_FRAME_WIDTH,
                RegistrationKeys.REGISTRATION_FRAME_HEIGHT
        );
    }

    @Override
    public void setComponentSpecificAttributes() {
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        this.setResizable(false);
    }

    @Override
    public void addContent() {
        this.add(new RegistrationPanel());
    }
}

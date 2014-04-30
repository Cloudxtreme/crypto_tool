package by.bsuir.graduationproject.registration.gui.frame;

import by.bsuir.graduationproject.common.gui.component.Container;
import by.bsuir.graduationproject.common.gui.component.GUIComponent;
import by.bsuir.graduationproject.common.utils.CommonKeys;
import by.bsuir.graduationproject.registration.controller.RegistrationController;
import by.bsuir.graduationproject.registration.gui.button.RegisterButton;
import by.bsuir.graduationproject.registration.gui.field.RegistrationFirstNameField;
import by.bsuir.graduationproject.registration.gui.field.RegistrationGroupNumberField;
import by.bsuir.graduationproject.registration.gui.field.RegistrationLastNameField;
import by.bsuir.graduationproject.registration.gui.label.RegistrationFirstNameLabel;
import by.bsuir.graduationproject.registration.gui.label.RegistrationGroupLabel;
import by.bsuir.graduationproject.registration.gui.label.RegistrationInformationLabel;
import by.bsuir.graduationproject.registration.gui.label.RegistrationLastNameLabel;
import by.bsuir.graduationproject.registration.gui.utils.RegistrationKeys;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.WindowConstants;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * @author l.zverugo Date: 26.04.14 Time: 17:15.
 */
public class RegistrationFrame extends JFrame implements GUIComponent, Container {
    private RegistrationFirstNameField firstNameField;
    private RegistrationLastNameField lastNameField;
    private RegistrationGroupNumberField groupNumberField;
    private RegisterButton registerButton;

    private RegistrationController controller = new RegistrationController();

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
        this.setContentPane(new JLabel(new ImageIcon(CommonKeys.BG_IMAGE_PATH)));
    }

    @Override
    public void addContent() {
        addRegistrationInformationLabel();
        addFirstNameLabel();
        addLastNameLabel();
        addGroupLabel();
        addFirstNameTextField();
        addLastNameTextField();
        addGroupTextField();
        addRegistrationButton();
    }

    private void addRegistrationInformationLabel() {
        this.add(new RegistrationInformationLabel());
    }

    private void addFirstNameLabel() {
        this.add(new RegistrationFirstNameLabel());
    }

    private void addLastNameLabel() {
        this.add(new RegistrationLastNameLabel());
    }

    private void addGroupLabel() {
        this.add(new RegistrationGroupLabel());
    }

    private void addFirstNameTextField() {
        firstNameField = new RegistrationFirstNameField();
        this.add(firstNameField);
    }

    private void addLastNameTextField() {
        lastNameField = new RegistrationLastNameField();
        this.add(lastNameField);
    }

    private void addGroupTextField() {
        groupNumberField = new RegistrationGroupNumberField();
        this.add(groupNumberField);
    }

    private void addRegistrationButton() {
        registerButton = new RegisterButton();
        registerButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                controller.handleRegisterEvent(firstNameField.getText(), lastNameField.getText(),
                        groupNumberField.getText(), getCurrentInstance());
            }
        });
        this.add(registerButton);
    }

    private RegistrationFrame getCurrentInstance() {
        return this;
    }
}

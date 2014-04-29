package by.bsuir.graduationproject.registration.gui.panel;

import by.bsuir.graduationproject.common.gui.component.Container;
import by.bsuir.graduationproject.registration.controller.RegistrationController;
import by.bsuir.graduationproject.registration.gui.button.RegisterButton;
import by.bsuir.graduationproject.common.gui.component.GUIComponent;
import by.bsuir.graduationproject.registration.gui.field.RegistrationFirstNameField;
import by.bsuir.graduationproject.registration.gui.field.RegistrationGroupNumberField;
import by.bsuir.graduationproject.registration.gui.field.RegistrationLastNameField;
import by.bsuir.graduationproject.registration.gui.label.RegistrationFirstNameLabel;
import by.bsuir.graduationproject.registration.gui.label.RegistrationGroupLabel;
import by.bsuir.graduationproject.registration.gui.label.RegistrationInformationLabel;
import by.bsuir.graduationproject.registration.gui.label.RegistrationLastNameLabel;
import by.bsuir.graduationproject.registration.gui.utils.RegistrationKeys;

import javax.swing.JPanel;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * @author l.zverugo Date: 26.04.14 Time: 17:34.
 */
public class RegistrationPanel extends JPanel implements GUIComponent, Container {
    private RegistrationFirstNameField firstNameField;
    private RegistrationLastNameField lastNameField;
    private RegistrationGroupNumberField groupNumberField;
    private RegisterButton registerButton;

    private Image bgImage;

    private RegistrationController controller = new RegistrationController();

    public RegistrationPanel(Image bgImage) {
        super(null);
        this.bgImage = bgImage;
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
                0,
                0,
                RegistrationKeys.REGISTRATION_FRAME_WIDTH,
                RegistrationKeys.REGISTRATION_FRAME_HEIGHT
        );
    }

    @Override
    public void setComponentSpecificAttributes() {
        setBackground(RegistrationKeys.REGISTRATION_PANEL_BACKGROUND_COLOR);
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

    private RegistrationPanel getCurrentInstance() {
        return this;
    }

    @Override
    public void paint(Graphics graphics) {
        super.paint(graphics);
        graphics.drawImage(bgImage, 0, 0, null);
    }
}

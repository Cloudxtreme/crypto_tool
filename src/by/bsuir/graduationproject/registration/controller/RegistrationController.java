package by.bsuir.graduationproject.registration.controller;

import by.bsuir.graduationproject.registration.gui.panel.RegistrationPanel;
import by.bsuir.graduationproject.registration.logic.RegistrationLogic;

/**
 * @author l.zverugo Date: 26.04.14 Time: 18:19.
 */
public class RegistrationController {
    private RegistrationLogic logic = new RegistrationLogic();

    public void handleRegisterEvent(String firstName, String lastName, String groupNumber, RegistrationPanel panel) {
        logic.processRegisterRequest(firstName, lastName, groupNumber, panel);
    }
}

package by.bsuir.graduationproject.registration.controller;

import by.bsuir.graduationproject.registration.logic.RegistrationLogic;

/**
 * @author l.zverugo Date: 26.04.14 Time: 18:19.
 */
public class RegistrationController {
    private static RegistrationLogic logic = new RegistrationLogic();

    public void handleRegisterEvent(String firstName, String lastName, String groupNumber) {
        logic.processRegisterRequest(firstName, lastName, groupNumber);
    }
}
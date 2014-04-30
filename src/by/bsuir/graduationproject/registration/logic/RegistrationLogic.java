package by.bsuir.graduationproject.registration.logic;

import by.bsuir.graduationproject.common.language.LanguageTools;
import by.bsuir.graduationproject.common.utils.CommonKeys;
import by.bsuir.graduationproject.common.validator.impl.NumberFieldValidator;
import by.bsuir.graduationproject.common.validator.impl.TextFieldValidator;
import by.bsuir.graduationproject.core.session.InternalSession;
import by.bsuir.graduationproject.core.user.User;
import by.bsuir.graduationproject.registration.gui.frame.RegistrationFrame;
import by.bsuir.graduationproject.registration.gui.utils.RegistrationKeys;

import javax.swing.JOptionPane;

/**
 * @author l.zverugo Date: 26.04.14 Time: 18:20.
 */
public class RegistrationLogic {
    private TextFieldValidator textFieldValidator = new TextFieldValidator();
    private NumberFieldValidator numberFieldValidator = new NumberFieldValidator();

    public void processRegisterRequest(String firstName, String lastName, String groupNumber, RegistrationFrame frame) {
        StringBuilder errors = new StringBuilder();

        validateFirstName(firstName, errors);
        validateLastName(lastName, errors);
        validateGroupNumber(groupNumber, errors);

        completeRequest(errors, firstName, lastName, groupNumber, frame);
    }

    private void validateFirstName(String firstName, StringBuilder errors) {
        if (!textFieldValidator.validate(firstName)) {
            appendErrorsHeader(errors);
            errors.append(RegistrationKeys.FIRST_NAME_LABEL_TEXT);
            errors.append(CommonKeys.NEW_LINE);
        }
    }

    private void validateLastName(String lastName, StringBuilder errors) {
        if (!textFieldValidator.validate(lastName)) {
            appendErrorsHeader(errors);
            errors.append(RegistrationKeys.LAST_NAME_LABEL_TEXT);
            errors.append(CommonKeys.NEW_LINE);
        }
    }

    private void validateGroupNumber(String groupNumber, StringBuilder errors) {
        if (!numberFieldValidator.validate(groupNumber)) {
            appendErrorsHeader(errors);
            errors.append(RegistrationKeys.GROUP_LABEL_TEXT);
            errors.append(CommonKeys.NEW_LINE);
        }
    }

    private void appendErrorsHeader(StringBuilder errors) {
        if (errors.length() == 0) {
            errors.append(LanguageTools.translate(CommonKeys.FOLLOWING_FIELDS_NOT_VALID))
                    .append(CommonKeys.NEW_LINE);
        }
    }

    private void completeRequest(StringBuilder errors, String firstName, String lastName, String groupNumber,
                                 RegistrationFrame frame) {
        if (errors.length() > 0) {
            JOptionPane.showMessageDialog(frame, errors.toString(), RegistrationKeys.REGISTRATION_FRAME_ERROR_MESSAGE,
                    JOptionPane.ERROR_MESSAGE);
        } else {

        }
    }

    private void createSession(String firstName, String lastName, String groupNumber) {
        User user = new User(firstName, lastName, groupNumber);
        InternalSession session = new InternalSession(user);
    }
}

package by.bsuir.graduationproject.report.utils;

import by.bsuir.graduationproject.common.utils.ApplicationPropertiesUtils;
import by.bsuir.graduationproject.common.utils.CommonKeys;

/**
 * @author l.zverugo Date: 29.04.14 Time: 17:22.
 */
public class PasswordChecker {
    private static final String PASSWORD = ApplicationPropertiesUtils.getStringProperty(CommonKeys.EXIT_PASSWORD);
    private boolean valid = true;

    public void validate(char[] enteredValue) {
        char[] password = PASSWORD.toCharArray();

        if (enteredValue.length != password.length) {
            valid = false;
        } else {
            for (int i = 0; i < enteredValue.length; i++) {
                valid &= password[i] == enteredValue[i];
            }
        }
    }

    public boolean isValid() {
        return valid;
    }
}

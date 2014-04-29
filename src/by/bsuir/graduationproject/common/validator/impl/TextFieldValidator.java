package by.bsuir.graduationproject.common.validator.impl;

import by.bsuir.graduationproject.common.validator.Validator;

/**
 * @author l.zverugo Date: 29.04.14 Time: 17:40.
 */
public class TextFieldValidator implements Validator {

    @Override
    public boolean validate(Object o) {
        boolean result = true;

        if (o == null) {
            result = false;
        } else {
            String value = (String) o;
            value = value.trim();

            if (value.isEmpty()) {
                result = false;
            } else {
                char[] chars = value.toCharArray();

                for (char c : chars) {
                    if (!Character.isLetter(c)) {
                        result = false;
                        break;
                    }
                }
            }
        }

        return result;
    }
}

package by.bsuir.graduationproject.registration.gui.utils;

import by.bsuir.graduationproject.common.gui.GUITools;
import by.bsuir.graduationproject.common.language.LanguageTools;

import java.awt.Color;
import java.awt.Font;

/**
 * @author l.zverugo Date: 26.04.14 Time: 17:18.
 */
public final class RegistrationKeys {
    // Registration Frame
    public static final int REGISTRATION_FRAME_X_POSITION =
            GUITools.getRelativeValue(GUITools.getScreenWorkingWidth(), 33);
    public static final int REGISTRATION_FRAME_Y_POSITION =
            GUITools.getRelativeValue(GUITools.getScreenWorkingHeight(), 33);
    public static final int REGISTRATION_FRAME_WIDTH =
            GUITools.getRelativeValue(GUITools.getScreenWorkingWidth(), 25);
    public static final int REGISTRATION_FRAME_HEIGHT =
            GUITools.getRelativeValue(GUITools.getScreenWorkingHeight(), 33);
    public static final String REGISTRATION_FRAME_NAME = LanguageTools.translate("registration.frame.name");
    public static final Color REGISTRATION_FRAME_FOREGROUND_TEXT_COLOR = Color.red;
    public static final String REGISTRATION_FRAME_ERROR_MESSAGE = LanguageTools.translate("error");

    // Registration Information Label
    public static final int REGISTRATION_INFORMATION_LABEL_X_POSITION =
            GUITools.getRelativeValue(REGISTRATION_FRAME_WIDTH, 10);
    public static final int REGISTRATION_INFORMATION_LABEL_Y_POSITION =
            GUITools.getRelativeValue(REGISTRATION_FRAME_HEIGHT, 2);
    public static final int REGISTRATION_INFORMATION_LABEL_WIDTH =
            GUITools.getRelativeValue(REGISTRATION_FRAME_WIDTH, 95);
    public static final int REGISTRATION_INFORMATION_LABEL_HEIGHT =
            GUITools.getRelativeValue(REGISTRATION_FRAME_HEIGHT, 10);
    public static final String REGISTRATION_INFORMATION_LABEL_TEXT =
            LanguageTools.translate("registration.information.label");
    public static final Font REGISTRATION_INFORMATION_LABEL_FONT = new Font("Serif", Font.ITALIC, 30);

    // First Name Label
    public static final int FIRST_NAME_LABEL_X_POSITION = GUITools.getRelativeValue(REGISTRATION_FRAME_WIDTH, 2);
    public static final int FIRST_NAME_LABEL_Y_POSITION = GUITools.getRelativeValue(REGISTRATION_FRAME_HEIGHT, 10);
    public static final int FIRST_NAME_LABEL_WIDTH = GUITools.getRelativeValue(REGISTRATION_FRAME_WIDTH, 25);
    public static final int FIRST_NAME_LABEL_HEIGHT = GUITools.getRelativeValue(REGISTRATION_FRAME_HEIGHT, 20);
    public static final String FIRST_NAME_LABEL_TEXT = LanguageTools.translate("first.name");
    public static final Font FIRST_NAME_LABEL_FONT = new Font("Serif", Font.ITALIC, 19);

    // Last Name Label
    public static final int LAST_NAME_LABEL_X_POSITION = GUITools.getRelativeValue(REGISTRATION_FRAME_WIDTH, 2);
    public static final int LAST_NAME_LABEL_Y_POSITION = GUITools.getRelativeValue(REGISTRATION_FRAME_HEIGHT, 30);
    public static final int LAST_NAME_LABEL_WIDTH = GUITools.getRelativeValue(REGISTRATION_FRAME_WIDTH, 25);
    public static final int LAST_NAME_LABEL_HEIGHT = GUITools.getRelativeValue(REGISTRATION_FRAME_HEIGHT, 20);
    public static final String LAST_NAME_LABEL_TEXT = LanguageTools.translate("last.name");
    public static final Font LAST_NAME_LABEL_FONT = FIRST_NAME_LABEL_FONT;

    // Group Label
    public static final int GROUP_LABEL_X_POSITION = GUITools.getRelativeValue(REGISTRATION_FRAME_WIDTH, 2);
    public static final int GROUP_LABEL_Y_POSITION = GUITools.getRelativeValue(REGISTRATION_FRAME_HEIGHT, 50);
    public static final int GROUP_LABEL_WIDTH = GUITools.getRelativeValue(REGISTRATION_FRAME_WIDTH, 25);
    public static final int GROUP_LABEL_HEIGHT = GUITools.getRelativeValue(REGISTRATION_FRAME_HEIGHT, 20);
    public static final String GROUP_LABEL_TEXT = LanguageTools.translate("group.number");
    public static final Font GROUP_LABEL_FONT = FIRST_NAME_LABEL_FONT;

    // First Name TextField
    public static final int FIRST_NAME_TEXT_FIELD_X_POSITION = GUITools.getRelativeValue(REGISTRATION_FRAME_WIDTH, 30);
    public static final int FIRST_NAME_TEXT_FIELD_Y_POSITION = GUITools.getRelativeValue(REGISTRATION_FRAME_HEIGHT, 15);
    public static final int FIRST_NAME_TEXT_FIELD_WIDTH = GUITools.getRelativeValue(REGISTRATION_FRAME_WIDTH, 60);
    public static final int FIRST_NAME_TEXT_FIELD_HEIGHT = GUITools.getRelativeValue(REGISTRATION_FRAME_HEIGHT, 10);
    public static final Font FIRST_NAME_TEXT_FIELD_FONT = FIRST_NAME_LABEL_FONT;

    // Last Name TextField
    public static final int LAST_NAME_TEXT_FIELD_X_POSITION = GUITools.getRelativeValue(REGISTRATION_FRAME_WIDTH, 30);
    public static final int LAST_NAME_TEXT_FIELD_Y_POSITION = GUITools.getRelativeValue(REGISTRATION_FRAME_HEIGHT, 35);
    public static final int LAST_NAME_TEXT_FIELD_WIDTH = GUITools.getRelativeValue(REGISTRATION_FRAME_WIDTH, 60);
    public static final int LAST_NAME_TEXT_FIELD_HEIGHT = GUITools.getRelativeValue(REGISTRATION_FRAME_HEIGHT, 10);
    public static final Font LAST_NAME_TEXT_FIELD_FONT = LAST_NAME_LABEL_FONT;

    // Group TextField
    public static final int GROUP_TEXT_FIELD_X_POSITION = GUITools.getRelativeValue(REGISTRATION_FRAME_WIDTH, 30);
    public static final int GROUP_TEXT_FIELD_Y_POSITION = GUITools.getRelativeValue(REGISTRATION_FRAME_HEIGHT, 55);
    public static final int GROUP_TEXT_FIELD_WIDTH = GUITools.getRelativeValue(REGISTRATION_FRAME_WIDTH, 60);
    public static final int GROUP_TEXT_FIELD_HEIGHT = GUITools.getRelativeValue(REGISTRATION_FRAME_HEIGHT, 10);
    public static final Font GROUP_TEXT_FIELD_FONT = GROUP_LABEL_FONT;

    // Registration Button
    public static final int REGISTRATION_BUTTON_X_POSITION = GUITools.getRelativeValue(REGISTRATION_FRAME_WIDTH, 15);
    public static final int REGISTRATION_BUTTON_Y_POSITION = GUITools.getRelativeValue(REGISTRATION_FRAME_HEIGHT, 75);
    public static final int REGISTRATION_BUTTON_WIDTH = GUITools.getRelativeValue(REGISTRATION_FRAME_WIDTH, 70);
    public static final int REGISTRATION_BUTTON_HEIGHT = GUITools.getRelativeValue(REGISTRATION_FRAME_HEIGHT, 10);
    public static final String REGISTRATION_BUTTON_LABEL = LanguageTools.translate("register.button.label");
    public static final Font REGISTRATION_BUTTON_FONT = GROUP_TEXT_FIELD_FONT;

    private RegistrationKeys() {
    }
}

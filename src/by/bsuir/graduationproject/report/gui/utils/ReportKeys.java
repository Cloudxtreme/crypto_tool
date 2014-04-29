package by.bsuir.graduationproject.report.gui.utils;

import by.bsuir.graduationproject.common.gui.GUITools;
import by.bsuir.graduationproject.common.language.LanguageTools;

import java.awt.Color;
import java.awt.Font;

/**
 * @author l.zverugo Date: 26.04.14 Time: 20:39.
 */
public final class ReportKeys {
    public static final String FULL_REPORT_PATH = "full.report.path";
    public static final String FULL_REPORT_TEMPLATE_PATH = "full.report.template.path";
    public static final String ENTER_PASSWORD = "enter.password";
    public static final String INVALID_PASSWORD = "invalid.password";

    private ReportKeys() {
    }

    // Report Frame
    public static final int REPORT_FRAME_X_POSITION = GUITools.getRelativeValue(GUITools.getScreenWorkingWidth(), 20);
    public static final int REPORT_FRAME_Y_POSITION = GUITools.getRelativeValue(GUITools.getScreenWorkingHeight(), 20);
    public static final int REPORT_FRAME_WIDTH = GUITools.getRelativeValue(GUITools.getScreenWorkingWidth(), 30);
    public static final int REPORT_FRAME_HEIGHT = GUITools.getRelativeValue(GUITools.getScreenWorkingHeight(), 30);
    public static final String REPORT_FRAME_NAME = LanguageTools.translate("report.frame.name");

    // Report Panel
    public static final Color REPORT_PANEL_BACKGROUND_COLOR = Color.gray;
    public static final Font LABELS_FONT = new Font("Serif", Font.PLAIN, 18);
    public static final Color LABELS_FOREGROUND_COLOR = Color.white;

    // Result Label
    public static final int RESULT_LABEL_X_POSITION = GUITools.getRelativeValue(REPORT_FRAME_WIDTH, 35);
    public static final int RESULT_LABEL_Y_POSITION = GUITools.getRelativeValue(REPORT_FRAME_HEIGHT, 10);
    public static final int RESULT_LABEL_WIDTH = GUITools.getRelativeValue(REPORT_FRAME_WIDTH, 100);
    public static final int RESULT_LABEL_HEIGHT = GUITools.getRelativeValue(REPORT_FRAME_HEIGHT, 10);
    public static final String RESULT_LABEL_TEXT = LanguageTools.translate("result.label.text");

    // Time Label
    public static final int TIME_LABEL_X_POSITION = GUITools.getRelativeValue(REPORT_FRAME_WIDTH, 45);
    public static final int TIME_LABEL_Y_POSITION = GUITools.getRelativeValue(REPORT_FRAME_HEIGHT, 25);
    public static final int TIME_LABEL_WIDTH = GUITools.getRelativeValue(REPORT_FRAME_WIDTH, 50);
    public static final int TIME_LABEL_HEIGHT = GUITools.getRelativeValue(REPORT_FRAME_HEIGHT, 10);
    public static final String MILLISECONDS = LanguageTools.translate("milliseconds");

    // Full Report Button
    public static final int FULL_REPORT_BUTTON_X_POSITION = GUITools.getRelativeValue(REPORT_FRAME_WIDTH, 30);
    public static final int FULL_REPORT_BUTTON_Y_POSITION = GUITools.getRelativeValue(REPORT_FRAME_HEIGHT, 50);
    public static final int FULL_REPORT_BUTTON_WIDTH = GUITools.getRelativeValue(REPORT_FRAME_WIDTH, 40);
    public static final int FULL_REPORT_BUTTON_HEIGHT = GUITools.getRelativeValue(REPORT_FRAME_HEIGHT, 20);
    public static final String FULL_REPORT_BUTTON_TEXT = LanguageTools.translate("open.full.report");
}

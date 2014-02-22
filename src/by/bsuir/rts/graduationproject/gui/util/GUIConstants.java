package by.bsuir.rts.graduationproject.gui.util;

import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;

/**
 * @author l.zverugo
 */
public class GUIConstants {
    public static final int MAIN_WINDOW_WIDTH = 575;
    public static final int MAIN_WINDOW_HEIGHT = 406;
    public static final int MAIN_WINDOW_X_POSITION = 300;
    public static final int MAIN_WINDOW_Y_POSITION = 100;
    public static final int TEXT_FIELD_X_POSITION = 100;
    public static final int TEXT_FIELD_Y_POSITION = 50;
    public static final int TEXT_FIELD_WIDTH = 400;
    public static final int TEXT_FIELD_HEIGHT = 30;
    public static final Font TEXT_FIELD_FONT = new Font("Verdana", Font.ITALIC, 18);
    public static final int SUBMIT_BUTTON_X_POSITION = 225;
    public static final int SUBMIT_BUTTON_Y_POSITION = 150;
    public static final int SUBMIT_BUTTON_WIDTH = 128;
    public static final int SUBMIT_BUTTON_HEIGHT = 128;
    public static final String CONNECTION_REFUSED_ERROR_MESSAGE = "Connection refused: server is not available.";
    public static final String MAIN_PANEL_BACKGROUND_IMAGE_PATH = "src/resources/bg_image.jpg";
    public static final String SUBMIT_BUTTON_IMAGE_PATH = "src/resources/run.png";
    public static final String MAIN_WINDOW_CAPTION = "CryptoTools 0.0.1";
    public static final Border TEXT_FIELD_BORDER = BorderFactory.createLineBorder(new Color(173, 255, 47), 2);
    public static final Cursor SUBMIT_BUTTON_CURSOR = new Cursor(Cursor.HAND_CURSOR);
}

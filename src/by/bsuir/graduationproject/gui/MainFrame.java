package by.bsuir.graduationproject.gui;

import by.bsuir.graduationproject.gui.util.GUIConstants;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.io.File;
import java.io.IOException;

/**
 * @author l.zverugo
 */
public class MainFrame extends JFrame {

    public MainFrame() throws IOException {
        super();
        initialize();
    }

    private void initialize() throws IOException {
        setBounds(GUIConstants.MAIN_WINDOW_X_POSITION, GUIConstants.MAIN_WINDOW_Y_POSITION,
                GUIConstants.MAIN_WINDOW_WIDTH, GUIConstants.MAIN_WINDOW_HEIGHT);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setTitle(GUIConstants.MAIN_WINDOW_CAPTION);
        setResizable(false);
        MainPanel panel = new MainPanel(ImageIO.read(new File(GUIConstants.MAIN_PANEL_BACKGROUND_IMAGE_PATH)));
        add(panel);
    }
}

package by.bsuir.rts.graduationproject.gui;

import by.bsuir.rts.graduationproject.gui.builder.MainPanelContentBuilder;
import by.bsuir.rts.graduationproject.gui.util.GUIConstants;

import javax.swing.*;
import java.awt.*;
import java.io.IOException;

/**
 * @author l.zverugo
 */
public class MainPanel extends JPanel {
    private Image backgroundImage;

    public MainPanel(Image backgroundImage) throws IOException {
        super(null);
        this.backgroundImage = backgroundImage;
        initialize();
        new MainPanelContentBuilder().build(this);
    }

    private void initialize() {
        setBounds(0, 0, GUIConstants.MAIN_WINDOW_WIDTH, GUIConstants.MAIN_WINDOW_HEIGHT);
    }

    @Override
    protected void paintComponent(Graphics g) {
        g.drawImage(backgroundImage, 0, 0, null);
    }
}

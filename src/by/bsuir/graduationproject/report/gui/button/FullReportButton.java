package by.bsuir.graduationproject.report.gui.button;

import by.bsuir.graduationproject.common.gui.component.GUIComponent;
import by.bsuir.graduationproject.common.utils.CommonKeys;
import by.bsuir.graduationproject.report.gui.utils.ReportKeys;

import javax.swing.ImageIcon;
import javax.swing.JButton;

/**
 * @author l.zverugo Date: 29.04.14 Time: 13:58.
 */
public class FullReportButton extends JButton implements GUIComponent {
    public FullReportButton() {
        build();
    }

    private void build() {
        initializeBounds();
        setComponentSpecificAttributes();
    }

    @Override
    public void initializeBounds() {
        this.setBounds(
                ReportKeys.FULL_REPORT_BUTTON_X_POSITION,
                ReportKeys.FULL_REPORT_BUTTON_Y_POSITION,
                ReportKeys.FULL_REPORT_BUTTON_WIDTH,
                ReportKeys.FULL_REPORT_BUTTON_HEIGHT
        );
    }

    @Override
    public void setComponentSpecificAttributes() {
        this.setFocusPainted(false);
        this.setIcon(new ImageIcon(CommonKeys.REPORT_BUTTON_IMAGE_PATH));
    }
}

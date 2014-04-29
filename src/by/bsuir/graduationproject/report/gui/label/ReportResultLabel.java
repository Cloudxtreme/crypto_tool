package by.bsuir.graduationproject.report.gui.label;

import by.bsuir.graduationproject.common.gui.component.GUIComponent;
import by.bsuir.graduationproject.report.gui.utils.ReportKeys;

import javax.swing.JLabel;

/**
 * @author l.zverugo Date: 29.04.14 Time: 13:36.
 */
public class ReportResultLabel extends JLabel implements GUIComponent {
    public ReportResultLabel() {
        build();
    }

    private void build() {
        initializeBounds();
        setComponentSpecificAttributes();
    }

    @Override
    public void initializeBounds() {
        this.setBounds(
                ReportKeys.RESULT_LABEL_X_POSITION,
                ReportKeys.RESULT_LABEL_Y_POSITION,
                ReportKeys.RESULT_LABEL_WIDTH,
                ReportKeys.RESULT_LABEL_HEIGHT
        );
    }

    @Override
    public void setComponentSpecificAttributes() {
        this.setFont(ReportKeys.LABELS_FONT);
        this.setForeground(ReportKeys.LABELS_FOREGROUND_COLOR);
        this.setText(ReportKeys.RESULT_LABEL_TEXT);
    }
}

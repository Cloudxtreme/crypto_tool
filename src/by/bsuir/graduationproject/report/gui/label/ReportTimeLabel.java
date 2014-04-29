package by.bsuir.graduationproject.report.gui.label;

import by.bsuir.graduationproject.common.gui.component.GUIComponent;
import by.bsuir.graduationproject.common.utils.CommonKeys;
import by.bsuir.graduationproject.report.gui.utils.ReportKeys;

import javax.swing.JLabel;

/**
 * @author l.zverugo Date: 29.04.14 Time: 13:47.
 */
public class ReportTimeLabel extends JLabel implements GUIComponent {
    private String time = CommonKeys.BLANK;

    public ReportTimeLabel(String time) {
        this.time = time;
        build();
    }

    private void build() {
        initializeBounds();
        setComponentSpecificAttributes();
    }

    @Override
    public void initializeBounds() {
        this.setBounds(
                ReportKeys.TIME_LABEL_X_POSITION,
                ReportKeys.TIME_LABEL_Y_POSITION,
                ReportKeys.TIME_LABEL_WIDTH,
                ReportKeys.TIME_LABEL_HEIGHT
        );
    }

    @Override
    public void setComponentSpecificAttributes() {
        this.setForeground(ReportKeys.LABELS_FOREGROUND_COLOR);
        this.setFont(ReportKeys.LABELS_FONT);
        this.setText(time + CommonKeys.SPACE + ReportKeys.MILLISECONDS);
    }
}

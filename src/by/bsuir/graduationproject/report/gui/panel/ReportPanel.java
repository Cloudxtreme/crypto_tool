package by.bsuir.graduationproject.report.gui.panel;

import by.bsuir.graduationproject.common.gui.component.Container;
import by.bsuir.graduationproject.common.gui.component.GUIComponent;
import by.bsuir.graduationproject.common.utils.CommonKeys;
import by.bsuir.graduationproject.core.session.InternalSession;
import by.bsuir.graduationproject.report.controller.ReportController;
import by.bsuir.graduationproject.report.gui.button.FullReportButton;
import by.bsuir.graduationproject.report.gui.label.ReportResultLabel;
import by.bsuir.graduationproject.report.gui.label.ReportTimeLabel;
import by.bsuir.graduationproject.report.gui.utils.ReportKeys;

import javax.swing.JButton;
import javax.swing.JPanel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * @author l.zverugo Date: 26.04.14 Time: 20:48.
 */
public class ReportPanel extends JPanel implements GUIComponent, Container {
    private String time = CommonKeys.BLANK;
    private InternalSession session;

    private JButton fullReportButton;
    private static ReportController controller = new ReportController();

    public ReportPanel(String time, InternalSession session) {
        super(null);
        this.time = time;
        this.session = session;
        build();
    }

    private void build() {
        initializeBounds();
        setComponentSpecificAttributes();
        addContent();
    }

    @Override
    public void initializeBounds() {
        this.setBounds(
                0,
                0,
                ReportKeys.REPORT_FRAME_WIDTH,
                ReportKeys.REPORT_FRAME_HEIGHT
        );
    }

    @Override
    public void setComponentSpecificAttributes() {
        this.setBackground(ReportKeys.REPORT_PANEL_BACKGROUND_COLOR);
    }

    @Override
    public void addContent() {
        addResultLabel();
        addTimeLabel();
        addFullReportButton();
    }

    private void addResultLabel() {
        this.add(new ReportResultLabel());
    }

    private void addTimeLabel() {
        this.add(new ReportTimeLabel(time));
    }

    private void addFullReportButton() {
        fullReportButton = new FullReportButton();
        fullReportButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                controller.handleFullReportAction(session);
            }
        });
        this.add(fullReportButton);
    }
}

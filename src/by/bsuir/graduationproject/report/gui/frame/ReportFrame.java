package by.bsuir.graduationproject.report.gui.frame;

import by.bsuir.graduationproject.common.gui.component.Container;
import by.bsuir.graduationproject.common.gui.component.GUIComponent;
import by.bsuir.graduationproject.common.utils.CommonKeys;
import by.bsuir.graduationproject.core.session.InternalSession;
import by.bsuir.graduationproject.report.controller.ReportController;
import by.bsuir.graduationproject.report.gui.button.FullReportButton;
import by.bsuir.graduationproject.report.gui.label.ReportResultLabel;
import by.bsuir.graduationproject.report.gui.label.ReportTimeLabel;
import by.bsuir.graduationproject.report.gui.utils.ReportKeys;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

/**
 * @author l.zverugo Date: 26.04.14 Time: 20:30.
 */
public class ReportFrame extends JFrame implements GUIComponent, Container {
    private String time = CommonKeys.BLANK;

    private InternalSession session;

    private ReportController controller = new ReportController();

    private JButton fullReportButton;


    public ReportFrame(String time, InternalSession session) {
        super(ReportKeys.REPORT_FRAME_NAME);
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
                ReportKeys.REPORT_FRAME_X_POSITION,
                ReportKeys.REPORT_FRAME_Y_POSITION,
                ReportKeys.REPORT_FRAME_WIDTH,
                ReportKeys.REPORT_FRAME_HEIGHT
        );
    }

    @Override
    public void setComponentSpecificAttributes() {
        this.setResizable(false);
        this.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                controller.handleCloseApplicationAction(e);
            }
        });
        this.setContentPane(new JLabel(new ImageIcon(CommonKeys.BG_IMAGE_PATH)));
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

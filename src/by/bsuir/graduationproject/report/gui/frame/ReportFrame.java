package by.bsuir.graduationproject.report.gui.frame;

import by.bsuir.graduationproject.common.gui.component.Container;
import by.bsuir.graduationproject.common.gui.component.GUIComponent;
import by.bsuir.graduationproject.common.utils.CommonKeys;
import by.bsuir.graduationproject.core.session.InternalSession;
import by.bsuir.graduationproject.report.controller.ReportController;
import by.bsuir.graduationproject.report.gui.panel.ReportPanel;
import by.bsuir.graduationproject.report.gui.utils.ReportKeys;

import javax.swing.JFrame;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

/**
 * @author l.zverugo Date: 26.04.14 Time: 20:30.
 */
public class ReportFrame extends JFrame implements GUIComponent, Container {
    private String time = CommonKeys.BLANK;
    private InternalSession session;
    private ReportController controller = new ReportController();

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
    }

    @Override
    public void addContent() {
        add(new ReportPanel(time, session));
    }
}

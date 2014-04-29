package by.bsuir.graduationproject.report.gui.frame;

import by.bsuir.graduationproject.common.gui.component.Container;
import by.bsuir.graduationproject.common.gui.component.GUIComponent;
import by.bsuir.graduationproject.common.utils.CommonKeys;
import by.bsuir.graduationproject.core.session.InternalSession;
import by.bsuir.graduationproject.report.gui.panel.ReportPanel;
import by.bsuir.graduationproject.report.gui.utils.ReportKeys;

import javax.swing.JFrame;
import javax.swing.WindowConstants;

/**
 * @author l.zverugo Date: 26.04.14 Time: 20:30.
 */
public class ReportFrame extends JFrame implements GUIComponent, Container {
    private String time = CommonKeys.BLANK;
    private InternalSession session;

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
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        this.setResizable(false);
    }

    @Override
    public void addContent() {
        add(new ReportPanel(time, session));
    }
}

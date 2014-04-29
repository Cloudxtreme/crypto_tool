package by.bsuir.graduationproject.report.controller;

import by.bsuir.graduationproject.core.session.InternalSession;
import by.bsuir.graduationproject.report.logic.ReportLogic;

import java.awt.event.WindowEvent;

/**
 * @author l.zverugo Date: 29.04.14 Time: 14:00.
 */
public class ReportController {
    private static ReportLogic logic = new ReportLogic();

    public void handleFullReportAction(InternalSession session) {
        logic.processFullReportAction(session);
    }

    public void handleCloseApplicationAction(WindowEvent e) {
        logic.processCloseApplicationAction(e);
    }
}

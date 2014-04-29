package by.bsuir.graduationproject.report;

import by.bsuir.graduationproject.core.session.InternalSession;
import by.bsuir.graduationproject.core.user.User;
import by.bsuir.graduationproject.report.gui.frame.ReportFrame;

import java.awt.EventQueue;

/**
 * @author l.zverugo Date: 26.04.14 Time: 20:45.
 */
public class TestReportRunner {
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new ReportFrame("123456", buildFakeSession()).setVisible(true);
            }
        });
    }

    private static InternalSession buildFakeSession() {
        User user = new User("Алексей", "Коньков", "841301");

        InternalSession internalSession = new InternalSession(user);

        internalSession.addAttempt(1);
        internalSession.addAttempt(3);
        internalSession.addAttempt(5);
        internalSession.addAttempt(11);
        internalSession.addAttempt(34);
        internalSession.addAttempt(12);
        internalSession.addAttempt(3);
        internalSession.addAttempt(4);
        internalSession.addAttempt(9);
        internalSession.addAttempt(5);
        internalSession.addAttempt(55);
        internalSession.addAttempt(65);
        internalSession.addAttempt(34);
        internalSession.addAttempt(3);

        return internalSession;
    }
}

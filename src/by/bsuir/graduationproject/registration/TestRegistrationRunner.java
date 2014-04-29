package by.bsuir.graduationproject.registration;

import by.bsuir.graduationproject.registration.gui.frame.RegistrationFrame;

/**
 * @author l.zverugo Date: 26.04.14 Time: 17:15.
 */
public class TestRegistrationRunner {
    public static void main(String[] args) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new RegistrationFrame().setVisible(true);
            }
        });
    }
}

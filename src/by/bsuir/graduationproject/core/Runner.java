package by.bsuir.graduationproject.core;

import by.bsuir.graduationproject.gui.MainFrame;

import java.io.IOException;

/**
 * @author l.zverugo
 */
public class Runner {
    public static void main(String[] args) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                try {
                    new MainFrame().setVisible(true);
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        });
    }
}

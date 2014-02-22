package by.bsuir.rts.graduationproject.gui.builder;

import by.bsuir.graduationproject.core.TCPClientLogic;
import by.bsuir.rts.graduationproject.gui.button.RoundedButton;
import by.bsuir.rts.graduationproject.gui.util.GUIConstants;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;

/**
 * @author l.zverugo
 */
public class MainPanelContentBuilder implements Builder {
    JTextField field;

    @Override
    public void build(JComponent component) throws IOException {
        addTextField(component);
        addSubmitButton(component);
    }

    private void addTextField(JComponent component) {
        field = new JTextField();
        field.setBounds(GUIConstants.TEXT_FIELD_X_POSITION, GUIConstants.TEXT_FIELD_Y_POSITION,
                GUIConstants.TEXT_FIELD_WIDTH, GUIConstants.TEXT_FIELD_HEIGHT);
        field.setFont(GUIConstants.TEXT_FIELD_FONT);
        field.setBorder(GUIConstants.TEXT_FIELD_BORDER);
        component.add(field);
    }

    private void addSubmitButton(JComponent component) throws IOException {
        RoundedButton button = new RoundedButton();
        button.setCursor(GUIConstants.SUBMIT_BUTTON_CURSOR);
        button.setBounds(GUIConstants.SUBMIT_BUTTON_X_POSITION, GUIConstants.SUBMIT_BUTTON_Y_POSITION,
                GUIConstants.SUBMIT_BUTTON_WIDTH, GUIConstants.SUBMIT_BUTTON_HEIGHT);
        addSubmitButtonActionListener(button);
        component.add(button);
    }

    private void addSubmitButtonActionListener(RoundedButton button) {
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    String modifiedMessage = TCPClientLogic.run(field.getText());
                    JOptionPane.showMessageDialog(null, modifiedMessage);
                } catch (IOException e1) {
                    e1.printStackTrace();
                }
            }
        });
    }
}

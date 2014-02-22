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
    JTextField firstField;
    JTextField secondField;

    @Override
    public void build(JComponent component) throws IOException {
        addTextFieldsWithLabels(component);
        addSubmitButton(component);
    }

    private void addTextFieldsWithLabels(JComponent component) {
        firstField = new JTextField();
        firstField.setBounds(GUIConstants.FIRST_TEXT_FIELD_X_POSITION, GUIConstants.FIRST_TEXT_FIELD_Y_POSITION,
                GUIConstants.FIRST_TEXT_FIELD_WIDTH, GUIConstants.FIRST_TEXT_FIELD_HEIGHT);
        firstField.setFont(GUIConstants.TEXT_FIELD_FONT);
        firstField.setBorder(GUIConstants.TEXT_FIELD_BORDER);
        firstField.setText(GUIConstants.VECTOR_DEFAULT_CONTENT);
        JLabel firstFieldLabel = new JLabel(GUIConstants.FIRST_VECTOR_LABEL_TEXT);
        firstFieldLabel.setFont(GUIConstants.LABEL_FONT);
        firstFieldLabel.setForeground(GUIConstants.BG_COLOR);
        firstFieldLabel.setBounds(GUIConstants.FIRST_TEXT_FIELD_LABEL_X_POSITION,
                GUIConstants.FIRST_TEXT_FIELD_LABEL_Y_POSITION, GUIConstants.FIRST_TEXT_FIELD_LABEL_WIDTH,
                GUIConstants.FIRST_TEXT_FIELD_LABEL_HEIGHT);
        JLabel firstClosingBracket = new JLabel(GUIConstants.CLOSING_BRACKET);
        firstClosingBracket.setFont(GUIConstants.LABEL_FONT);
        firstClosingBracket.setForeground(GUIConstants.BG_COLOR);
        firstClosingBracket.setBounds(GUIConstants.CLOSING_BRACKET_X_POSITION,
                GUIConstants.FIRST_CLOSING_BRACKET_Y_POSITION, GUIConstants.CLOSING_BRACKET_WIDTH,
                GUIConstants.FIRST_TEXT_FIELD_LABEL_HEIGHT);
        component.add(firstField);
        component.add(firstFieldLabel);
        component.add(firstClosingBracket);
        secondField = new JTextField();
        secondField.setBounds(GUIConstants.SECOND_TEXT_FIELD_X_POSITION, GUIConstants.SECOND_TEXT_FIELD_Y_POSITION,
                GUIConstants.SECOND_TEXT_FIELD_WIDTH, GUIConstants.SECOND_TEXT_FIELD_HEIGHT);
        secondField.setFont(GUIConstants.TEXT_FIELD_FONT);
        secondField.setBorder(GUIConstants.TEXT_FIELD_BORDER);
        secondField.setText(GUIConstants.VECTOR_DEFAULT_CONTENT);
        JLabel secondFieldLabel = new JLabel(GUIConstants.SECOND_VECTOR_LABEL_TEXT);
        secondFieldLabel.setFont(GUIConstants.LABEL_FONT);
        secondFieldLabel.setForeground(GUIConstants.BG_COLOR);
        secondFieldLabel.setBounds(GUIConstants.SECOND_TEXT_FIELD_LABEL_X_POSITION,
                GUIConstants.SECOND_TEXT_FIELD_LABEL_Y_POSITION, GUIConstants.SECOND_TEXT_FIELD_LABEL_WIDTH,
                GUIConstants.SECOND_TEXT_FIELD_LABEL_HEIGHT);
        JLabel secondClosingBracket = new JLabel(GUIConstants.CLOSING_BRACKET);
        secondClosingBracket.setFont(GUIConstants.LABEL_FONT);
        secondClosingBracket.setForeground(GUIConstants.BG_COLOR);
        secondClosingBracket.setBounds(GUIConstants.CLOSING_BRACKET_X_POSITION,
                GUIConstants.SECOND_CLOSING_BRACKET_Y_POSITION, GUIConstants.CLOSING_BRACKET_WIDTH,
                GUIConstants.FIRST_TEXT_FIELD_LABEL_HEIGHT);
        component.add(secondField);
        component.add(secondFieldLabel);
        component.add(secondClosingBracket);
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
                    String modifiedMessage = TCPClientLogic.run(firstField.getText());
                    JOptionPane.showMessageDialog(null, modifiedMessage);
                } catch (IOException e1) {
                    e1.printStackTrace();
                }
            }
        });
    }
}

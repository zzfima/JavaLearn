package com.codebind;

import javax.swing.JLabel;
import javax.swing.JRadioButton;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class RadioButtonListener implements ActionListener {
    private final JLabel label;

    public RadioButtonListener(JLabel label) {
        this.label = label;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        Object o = e.getSource();
        if (o instanceof JRadioButton b) {
            this.label.setText(b.getText());
        }
    }
}

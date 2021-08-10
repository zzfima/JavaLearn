package com.codebind;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class ClockGUI extends JFrame {
    private JButton btnClock;
    private JPanel mainPanel;
    private JTextField txtClock;
    private JLabel lblClock;

    public ClockGUI(String title) {
        super(title);

        btnClock.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Calendar calendar = Calendar.getInstance();
                SimpleDateFormat formatter = new SimpleDateFormat("dd-MM-yyyy HH:mm:ss");
                String msg = formatter.format(calendar.getTime());
                txtClock.setText(msg);
                lblClock.setText(msg);
            }
        });

        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        this.setContentPane(mainPanel);
        this.pack();
    }

    public static void main(String[] args) {
        JFrame frame = new ClockGUI("Clock for All!");
        frame.setVisible(true);
    }
}
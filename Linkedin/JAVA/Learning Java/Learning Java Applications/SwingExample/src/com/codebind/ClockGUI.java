package com.codebind;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class ClockGUI extends JFrame {
    private JButton btnClock;
    private JPanel mainPanel;
    private JTextField txtClock;
    private JLabel lblClock;
    private JProgressBar progressBarClock;
    private JButton btnClear;
    private JRadioButton radioButton1RadioButton;
    private JRadioButton radioButton2RadioButton;
    private JRadioButton radioButton3RadioButton;
    private JRadioButton radioButton4RadioButton;
    private int cnt;

    public ClockGUI(String title) {
        super(title);
        cnt = 0;

        btnClock.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Calendar calendar = Calendar.getInstance();
                SimpleDateFormat formatter = new SimpleDateFormat("dd-MM-yyyy HH:mm:ss");
                String msg = formatter.format(calendar.getTime());
                txtClock.setText(msg);
                lblClock.setText(msg);

                cnt += 10;
                if (cnt == 110)
                    cnt = 0;
                progressBarClock.setValue(cnt);
            }
        });

        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        this.setContentPane(mainPanel);
        this.pack();
        btnClear.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                lblClock.setText("");
                txtClock.setText("");
                cnt = 0;
                progressBarClock.setValue(cnt);
            }
        });
        btnClear.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {
                btnClear.setBackground(Color.red);
            }
        });
        btnClear.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseExited(MouseEvent e) {
                btnClear.setBackground(btnClock.getBackground());
            }
        });
        ActionListener listener = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("fd");
                Object o = e.getSource();
                System.out.println(o == radioButton1RadioButton);
            }
        };
        radioButton1RadioButton.addActionListener(listener);
        radioButton2RadioButton.addActionListener(listener);
        radioButton3RadioButton.addActionListener(listener);
        radioButton4RadioButton.addActionListener(listener);
    }

    public static void main(String[] args) {
        JFrame frame = new ClockGUI("Clock for All!");
        frame.setVisible(true);
    }
}
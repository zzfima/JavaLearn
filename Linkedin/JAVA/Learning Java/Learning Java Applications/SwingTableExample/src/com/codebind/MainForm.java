package com.codebind;

import javax.swing.*;

public class MainForm extends JFrame {
    private JTable mainTable;
    private JPanel mainPanel;

    public MainForm() {
        TableData tableData = new TableData();
        mainTable.setModel(tableData);

        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        this.setContentPane(mainPanel);
        this.pack();
    }

    public static void main(String[] args) {
        JFrame frame = new MainForm();
        frame.setVisible(true);
    }
}

package com.codebind;

import javax.swing.table.AbstractTableModel;

public class TableData extends AbstractTableModel {
    @Override
    public int getRowCount() {
        return 10;
    }

    @Override
    public int getColumnCount() {
        return 10;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        return "Hello " + "(" + rowIndex + ", " + columnIndex + ")";
    }
}

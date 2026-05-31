/*
 * Decompiled with CFR 0.152.
 */
package nc.vo.jcom.ui;

import javax.swing.JTable;
import nc.vo.jcom.lang.StringUtil;

public class TableUtil {
    public static int findExactMatchedRow(JTable table, int columnIndex, String strSample) {
        int iRow = -1;
        if (null != (strSample = StringUtil.spaceToNull(strSample)) && table.getModel().getRowCount() > 0 && columnIndex >= 0 && columnIndex < table.getModel().getColumnCount()) {
            Object o = null;
            for (int i = 0; i < table.getModel().getRowCount(); ++i) {
                o = table.getModel().getValueAt(i, columnIndex);
                if (null == o) continue;
                String strCell = o.toString().trim();
                if (strSample.length() != strCell.length() || !strCell.equalsIgnoreCase(strSample)) continue;
                iRow = i;
                break;
            }
        }
        return iRow;
    }

    public static int findMatchedRow(JTable table, int columnIndex, String strPrefix) {
        int iRow = -1;
        if ((strPrefix = StringUtil.spaceToNull(strPrefix)) != null && table.getModel().getRowCount() > 0 && columnIndex >= 0 && columnIndex < table.getModel().getColumnCount()) {
            Object o = null;
            for (int i = 0; i < table.getModel().getRowCount(); ++i) {
                o = table.getModel().getValueAt(i, columnIndex);
                if (o == null) continue;
                String strCell = o.toString().trim();
                if (strPrefix.length() > strCell.length() || !strCell.startsWith(strPrefix)) continue;
                iRow = i;
                break;
            }
        }
        if (iRow >= 0) {
            table.setRowSelectionInterval(iRow, iRow);
            table.scrollRectToVisible(table.getCellRect(iRow, columnIndex, true));
        }
        return iRow;
    }
}


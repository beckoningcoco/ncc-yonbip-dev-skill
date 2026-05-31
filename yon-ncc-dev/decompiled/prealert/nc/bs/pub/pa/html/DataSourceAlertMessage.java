/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  nc.ui.pub.print.IDataSource
 *  nc.vo.jcom.lang.StringUtil
 */
package nc.bs.pub.pa.html;

import nc.bs.pub.pa.html.IAlertMessage;
import nc.ui.pub.print.IDataSource;
import nc.vo.jcom.lang.StringUtil;

@Deprecated
public class DataSourceAlertMessage
implements IAlertMessage {
    IDataSource datasource;
    String title = "";

    public DataSourceAlertMessage(IDataSource datasource, String title) {
        this.datasource = datasource;
        this.title = title;
    }

    @Override
    public String[] getBodyFields() {
        return this.datasource.getAllDataItemNames();
    }

    @Override
    public Object[][] getBodyValue() {
        String[] varNames = this.datasource.getAllDataItemExpress();
        int rowNum = 0;
        if (varNames == null || varNames.length <= 0) {
            return new String[rowNum][];
        }
        rowNum = this.datasource.getItemValuesByExpress(varNames[0]).length;
        Object[][] values = new Object[rowNum][varNames.length];
        for (int column = 0; column < varNames.length; ++column) {
            String[] columnValues = this.datasource.getItemValuesByExpress(varNames[column]);
            for (int row = 0; row < columnValues.length; ++row) {
                values[row][column] = columnValues[row];
            }
        }
        return values;
    }

    @Override
    public float[] getBodyWidths() {
        return null;
    }

    @Override
    public String[] getBottom() {
        return null;
    }

    @Override
    public String getTitle() {
        return StringUtil.isEmptyWithTrim((String)this.title) ? "PreAlert Message" : this.title;
    }

    @Override
    public String[] getTop() {
        return null;
    }

    public String[] getBodyFieldExpresses() {
        return this.datasource.getAllDataItemExpress();
    }
}


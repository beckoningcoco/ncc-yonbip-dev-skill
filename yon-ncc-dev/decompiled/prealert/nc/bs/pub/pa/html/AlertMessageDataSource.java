/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  nc.ui.pub.print.IDataSource
 */
package nc.bs.pub.pa.html;

import java.util.ArrayList;
import nc.bs.pub.pa.html.IAlertMessage;
import nc.bs.pub.pa.html.IAlertMessage2;
import nc.ui.pub.print.IDataSource;

@Deprecated
public class AlertMessageDataSource
implements IDataSource {
    IAlertMessage message;

    public AlertMessageDataSource(IAlertMessage message) {
        this.message = message;
    }

    public String[] getItemValuesByExpress(String itemExpress) {
        int rowIndex = this.findRowIndexByName(itemExpress);
        if (rowIndex != -1) {
            return this.getValuesByRowIndex(this.message.getBodyValue(), rowIndex);
        }
        return null;
    }

    private int findRowIndexByName(String itemExpress) {
        int rowIndex = -1;
        if (this.message.getBodyFields() == null) {
            return -1;
        }
        for (int i = 0; i < this.message.getBodyFields().length; ++i) {
            String itemExp = this.message.getBodyFields()[i];
            if (itemExp == null || !itemExp.equals(itemExpress)) continue;
            rowIndex = i;
            break;
        }
        return rowIndex;
    }

    private String[] getValuesByRowIndex(Object[][] bodyValue, int rowIndex) {
        ArrayList<String> values = new ArrayList<String>();
        for (int i = 1; i < bodyValue.length; ++i) {
            values.add(bodyValue[i][rowIndex].toString());
        }
        return values.toArray(new String[0]);
    }

    public boolean isNumber(String itemExpress) {
        if (this.message instanceof IAlertMessage2) {
            int dataType;
            int[] dataTypes = ((IAlertMessage2)this.message).getBodyColumnType();
            int index = this.findRowIndexByName(itemExpress);
            if (index != -1 && ((dataType = dataTypes[index]) == 5 || dataType == 4)) {
                return true;
            }
        }
        return false;
    }

    public String[] getDependentItemExpressByExpress(String itemExpress) {
        return null;
    }

    public String[] getAllDataItemExpress() {
        return this.message.getBodyFields();
    }

    public String[] getAllDataItemNames() {
        return this.message.getBodyFields();
    }

    public String getModuleName() {
        return null;
    }
}


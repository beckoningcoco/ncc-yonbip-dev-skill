/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  nc.bs.framework.common.InvocationInfoProxy
 *  nc.ui.pub.print.IMetaDataDataSource
 *  nc.vo.arap.reminder.AggReminderVO
 *  nccloud.dto.arap.arappub.ArapBillMulTime
 */
package nccloud.pubimpl.arap.arappub;

import nc.bs.framework.common.InvocationInfoProxy;
import nc.ui.pub.print.IMetaDataDataSource;
import nc.vo.arap.reminder.AggReminderVO;
import nccloud.dto.arap.arappub.ArapBillMulTime;

public class ArapPrintRemindDatasource
implements IMetaDataDataSource {
    private static final long serialVersionUID = 1L;
    private AggReminderVO[] datas;

    public ArapPrintRemindDatasource(AggReminderVO[] datas) {
        this.datas = datas;
    }

    public String[] getItemValuesByExpress(String itemExpress) {
        return null;
    }

    public boolean isNumber(String itemExpress) {
        return false;
    }

    public String[] getDependentItemExpressByExpress(String itemExpress) {
        return null;
    }

    public String[] getAllDataItemExpress() {
        return null;
    }

    public String[] getAllDataItemNames() {
        return null;
    }

    public String getModuleName() {
        return null;
    }

    public Object[] getMDObjects() {
        Boolean isSensitiveTimeZone = InvocationInfoProxy.getInstance().getSensitiveTimeZone();
        if (isSensitiveTimeZone.booleanValue()) {
            ArapBillMulTime.processTimeZone((Object[])this.datas);
        }
        return this.datas;
    }
}


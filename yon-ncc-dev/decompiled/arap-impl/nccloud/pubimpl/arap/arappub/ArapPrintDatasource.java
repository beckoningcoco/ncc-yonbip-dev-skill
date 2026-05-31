/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  nc.bs.framework.common.InvocationInfoProxy
 *  nc.bs.logging.Log
 *  nc.ui.pub.print.IMetaDataDataSource
 *  nc.vo.arap.tally.AggRecStatementVO
 *  nc.vo.arap.utils.ArapPrintDigitUtil
 *  nccloud.commons.lang.ArrayUtils
 *  nccloud.dto.arap.arappub.ArapBillMulTime
 */
package nccloud.pubimpl.arap.arappub;

import java.util.HashMap;
import nc.bs.framework.common.InvocationInfoProxy;
import nc.bs.logging.Log;
import nc.ui.pub.print.IMetaDataDataSource;
import nc.vo.arap.tally.AggRecStatementVO;
import nc.vo.arap.utils.ArapPrintDigitUtil;
import nccloud.commons.lang.ArrayUtils;
import nccloud.dto.arap.arappub.ArapBillMulTime;

public class ArapPrintDatasource
implements IMetaDataDataSource {
    private static final long serialVersionUID = 1L;
    private AggRecStatementVO[] datas;

    public ArapPrintDatasource(AggRecStatementVO[] datas) {
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
        if (!ArrayUtils.isEmpty((Object[])this.datas)) {
            String[] globle = new String[]{"gl_debt_loc", "gl_credit_loc", "gl_bal_loc"};
            String[] group = new String[]{"gr_debt_loc", "gr_credit_loc", "gr_bal_loc"};
            String[] local = new String[]{"debt_loc", "credit_loc", "bal_loc"};
            String[] money = new String[]{"debt_ori", "credit_ori", "bal_ori"};
            HashMap<String, String[]> fieldsMap = new HashMap<String, String[]>();
            fieldsMap.put("field_global_money", globle);
            fieldsMap.put("field_group_money", group);
            fieldsMap.put("field_local_currtype", local);
            fieldsMap.put("field_money", money);
            try {
                this.datas = (AggRecStatementVO[])ArapPrintDigitUtil.getDatas((Object[])this.datas, fieldsMap, (String)"pk_org", (String)"pk_currtype");
                Boolean isSensitiveTimeZone = InvocationInfoProxy.getInstance().getSensitiveTimeZone();
                if (isSensitiveTimeZone.booleanValue()) {
                    ArapBillMulTime.processTimeZone((Object[])this.datas);
                }
            }
            catch (Exception e) {
                Log.getInstance(this.getClass()).error((Object)e.getMessage(), (Throwable)e);
            }
        }
        return this.datas;
    }
}


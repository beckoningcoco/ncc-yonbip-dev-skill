/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  nc.bs.dao.BaseDAO
 *  nc.bs.pub.pf.IBusiBillStatusCallBack
 *  nc.bs.pub.pf.JumpStatusCallbackContext
 *  nc.jdbc.framework.SQLParameter
 *  nc.vo.pub.AggregatedValueObject
 *  nc.vo.pub.BusinessException
 *  nc.vo.pub.lang.UFDateTime
 */
package nc.bs.arap.bill;

import nc.bs.dao.BaseDAO;
import nc.bs.pub.pf.IBusiBillStatusCallBack;
import nc.bs.pub.pf.JumpStatusCallbackContext;
import nc.jdbc.framework.SQLParameter;
import nc.vo.arap.pub.ArapBillTypeInfo;
import nc.vo.arap.pub.IArapBilltypeInfo;
import nc.vo.pub.AggregatedValueObject;
import nc.vo.pub.BusinessException;
import nc.vo.pub.lang.UFDateTime;

public class ArapBusiBillStatusCallBack
implements IBusiBillStatusCallBack {
    public UFDateTime callCheckStatus(JumpStatusCallbackContext context) throws BusinessException {
        AggregatedValueObject vo = (AggregatedValueObject)context.getBillVo();
        Object vobusitype = vo.getParentVO().getAttributeValue("pk_busitype");
        if (vobusitype != null && context.getBusitype().equals(vobusitype.toString())) {
            return null;
        }
        String pk_billtype = (String)vo.getParentVO().getAttributeValue("pk_billtype");
        IArapBilltypeInfo info = ArapBillTypeInfo.getInstance(pk_billtype);
        String sql = "update " + info.getTableNameBill() + " set pk_busitype = ? where dr = 0 and " + info.getTablePrimaryKeyBill() + " = ?";
        SQLParameter para = new SQLParameter();
        para.addParam(context.getBusitype());
        para.addParam(vo.getParentVO().getPrimaryKey());
        new BaseDAO().executeUpdate(sql, para);
        return null;
    }
}


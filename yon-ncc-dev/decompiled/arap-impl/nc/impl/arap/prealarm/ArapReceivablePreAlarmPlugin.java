/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  nc.bs.framework.common.NCLocator
 *  nc.bs.pub.pa.PreAlertContext
 *  nc.itf.arap.prealarm.IArapPreAlarmCall_RequiresNew
 *  nc.itf.fi.pub.Currency
 *  nc.vo.arap.prealarm.ArapPrealarmBaseVO
 *  nc.vo.arap.prealarm.ArapRecivablePrealarmVO
 *  nc.vo.fipub.utils.CurrencyControlBO
 *  nc.vo.pub.BusinessException
 *  nc.vo.pub.lang.UFDouble
 *  nc.vo.pub.rs.MemoryResultSet
 */
package nc.impl.arap.prealarm;

import java.math.BigDecimal;
import java.sql.SQLException;
import java.util.ArrayList;
import nc.bs.framework.common.NCLocator;
import nc.bs.pub.pa.PreAlertContext;
import nc.impl.arap.prealarm.ArapBasePreAlarmPlugin;
import nc.impl.arap.prealarm.ArapPrealarmDataSource;
import nc.itf.arap.prealarm.IArapPreAlarmCall_RequiresNew;
import nc.itf.fi.pub.Currency;
import nc.vo.arap.prealarm.ArapPrealarmBaseVO;
import nc.vo.arap.prealarm.ArapRecivablePrealarmVO;
import nc.vo.fipub.utils.CurrencyControlBO;
import nc.vo.pub.BusinessException;
import nc.vo.pub.lang.UFDouble;
import nc.vo.pub.rs.MemoryResultSet;

public class ArapReceivablePreAlarmPlugin
extends ArapBasePreAlarmPlugin {
    @Override
    protected MemoryResultSet queryAlarmResult(PreAlertContext context) throws BusinessException {
        try {
            return ((IArapPreAlarmCall_RequiresNew)NCLocator.getInstance().lookup(IArapPreAlarmCall_RequiresNew.class)).getReceivablePreAlarmResult(context);
        }
        catch (SQLException e) {
            throw new BusinessException(e.getMessage(), (Throwable)e);
        }
    }

    @Override
    protected String getBillType() {
        return "F0";
    }

    @Override
    protected ArapPrealarmDataSource getPrealarmDataSource(MemoryResultSet resultSet) throws SQLException, BusinessException {
        ArrayList<ArapPrealarmBaseVO> dataList = new ArrayList<ArapPrealarmBaseVO>();
        int i = 0;
        ArrayList row = null;
        String pk_currtype = null;
        ArapRecivablePrealarmVO recPrealarmVO = null;
        CurrencyControlBO ccBo = new CurrencyControlBO();
        String pk_localcurrtype = Currency.getOrgLocalCurrPK((String)this.getPK_org());
        while (resultSet.next()) {
            row = resultSet.getRowArrayList();
            recPrealarmVO = new ArapRecivablePrealarmVO();
            i = 0;
            recPrealarmVO.setCustomer(this.getDocNameByPk("e4f48eaf-5567-4383-a370-a59cb3e8a451", row.get(i)));
            recPrealarmVO.setDept(this.getDocNameByPk("b26fa3cb-4087-4027-a3b6-c83ab2a086a9", row.get(++i)));
            recPrealarmVO.setPsndoc(this.getDocNameByPk("40d39c26-a2b6-4f16-a018-45664cac1a1f", row.get(++i)));
            recPrealarmVO.setBillno((String)row.get(++i));
            recPrealarmVO.setBilldate(row.get(++i) == null ? null : row.get(i).toString().substring(0, 11));
            recPrealarmVO.setBrief((String)row.get(++i));
            pk_currtype = row.get(++i) == null ? null : row.get(i).toString();
            recPrealarmVO.setCurrency(Currency.getCurrNameByPk((String)pk_currtype));
            recPrealarmVO.setInvoceno((String)row.get(++i));
            recPrealarmVO.setMoney(ccBo.getFormat(pk_currtype, new UFDouble((BigDecimal)row.get(++i))));
            recPrealarmVO.setLocalmoney(ccBo.getFormat(pk_localcurrtype, new UFDouble((BigDecimal)row.get(++i))));
            recPrealarmVO.setMoneybal(ccBo.getFormat(pk_currtype, new UFDouble((BigDecimal)row.get(++i))));
            recPrealarmVO.setLocalmoneybal(ccBo.getFormat(pk_localcurrtype, new UFDouble((BigDecimal)row.get(++i))));
            dataList.add((ArapPrealarmBaseVO)recPrealarmVO);
        }
        return new ArapPrealarmDataSource(dataList, ArapRecivablePrealarmVO.class);
    }
}


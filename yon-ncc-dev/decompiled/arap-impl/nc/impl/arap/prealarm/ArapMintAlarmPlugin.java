/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  nc.bs.framework.common.NCLocator
 *  nc.bs.pub.pa.PreAlertContext
 *  nc.itf.arap.prealarm.IArapPreAlarmCall_RequiresNew
 *  nc.itf.fi.pub.Currency
 *  nc.vo.arap.prealarm.ArapMintPrealarmVO
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
import nc.vo.arap.prealarm.ArapMintPrealarmVO;
import nc.vo.arap.prealarm.ArapPrealarmBaseVO;
import nc.vo.arap.prealarm.ArapRecivablePrealarmVO;
import nc.vo.fipub.utils.CurrencyControlBO;
import nc.vo.pub.BusinessException;
import nc.vo.pub.lang.UFDouble;
import nc.vo.pub.rs.MemoryResultSet;

public class ArapMintAlarmPlugin
extends ArapBasePreAlarmPlugin {
    @Override
    protected MemoryResultSet queryAlarmResult(PreAlertContext context) throws BusinessException {
        try {
            return ((IArapPreAlarmCall_RequiresNew)NCLocator.getInstance().lookup(IArapPreAlarmCall_RequiresNew.class)).getArapMintAlarmResult(context);
        }
        catch (SQLException e) {
            throw new BusinessException(e.getMessage(), (Throwable)e);
        }
    }

    @Override
    @Deprecated
    protected Object[][] getBodyValues(MemoryResultSet resultSet) throws SQLException, BusinessException {
        int i = 0;
        ArrayList row = null;
        Object[] rowDatas = null;
        String billclass = null;
        String pk_currtype = null;
        String pk_localcurrtype = Currency.getOrgLocalCurrPK((String)this.getPK_org());
        CurrencyControlBO ccBo = new CurrencyControlBO();
        ArrayList<Object[]> resultDatas = new ArrayList<Object[]>();
        int billclassindex = resultSet.getColumnIndex("BILLCLASS") - 1;
        while (resultSet.next()) {
            row = resultSet.getRowArrayList();
            rowDatas = new Object[row.size() - 2];
            i = 0;
            billclass = row.get(billclassindex).toString();
            if ("zs".equals(billclass) || "ys".equals(billclass) || "sk".equals(billclass)) {
                rowDatas[i] = this.getDocNameByPk("e4f48eaf-5567-4383-a370-a59cb3e8a451", row.get(i));
                ++i;
            } else {
                rowDatas[i] = this.getDocNameByPk("720dcc7c-ff19-48f4-b9c5-b90906682f45", row.get(i + 1));
                ++i;
            }
            rowDatas[i] = this.getDocNameByPk("b26fa3cb-4087-4027-a3b6-c83ab2a086a9", row.get(i + 1));
            rowDatas[++i] = this.getDocNameByPk("40d39c26-a2b6-4f16-a018-45664cac1a1f", row.get(i + 1));
            rowDatas[++i] = row.get(i + 1);
            CharSequence charSequence = row.get(++i + 1) == null ? null : row.get(i + 1).toString().subSequence(0, 11);
            rowDatas[i] = charSequence;
            rowDatas[++i] = row.get(i + 1);
            pk_currtype = row.get(++i + 1) == null ? null : row.get(i + 1).toString();
            rowDatas[i] = Currency.getCurrNameByPk((String)pk_currtype);
            rowDatas[++i] = row.get(i + 1);
            rowDatas[++i] = ccBo.getFormat(pk_currtype, new UFDouble((BigDecimal)row.get(i + 1)));
            rowDatas[++i] = ccBo.getFormat(pk_localcurrtype, new UFDouble((BigDecimal)row.get(i + 1)));
            ++i;
            resultDatas.add(rowDatas);
        }
        return (Object[][])resultDatas.toArray((T[])new Object[0][0]);
    }

    @Override
    protected ArapPrealarmDataSource getPrealarmDataSource(MemoryResultSet resultSet) throws SQLException, BusinessException {
        ArrayList<ArapPrealarmBaseVO> dataList = new ArrayList<ArapPrealarmBaseVO>();
        int i = 0;
        ArrayList row = null;
        String billclass = null;
        String pk_currtype = null;
        ArapMintPrealarmVO recPrealarmVO = null;
        CurrencyControlBO ccBo = new CurrencyControlBO();
        String pk_localcurrtype = Currency.getOrgLocalCurrPK((String)this.getPK_org());
        int billclassindex = resultSet.getColumnIndex("BILLCLASS") - 1;
        while (resultSet.next()) {
            row = resultSet.getRowArrayList();
            billclass = row.get(billclassindex).toString();
            recPrealarmVO = new ArapMintPrealarmVO();
            i = 0;
            if ("zs".equals(billclass) || "ys".equals(billclass) || "sk".equals(billclass)) {
                recPrealarmVO.setCust_supplier(this.getDocNameByPk("e4f48eaf-5567-4383-a370-a59cb3e8a451", row.get(i)));
                ++i;
            } else {
                recPrealarmVO.setCust_supplier(this.getDocNameByPk("720dcc7c-ff19-48f4-b9c5-b90906682f45", row.get(i + 1)));
                ++i;
            }
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
            dataList.add((ArapPrealarmBaseVO)recPrealarmVO);
        }
        return new ArapPrealarmDataSource(dataList, ArapRecivablePrealarmVO.class);
    }
}


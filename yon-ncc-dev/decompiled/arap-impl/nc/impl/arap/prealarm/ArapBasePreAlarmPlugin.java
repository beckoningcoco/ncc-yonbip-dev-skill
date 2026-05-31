/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  nc.bs.pub.pa.IBusiCalculater
 *  nc.bs.pub.pa.IPreAlertPlugin
 *  nc.bs.pub.pa.PreAlertContext
 *  nc.bs.pub.pa.PreAlertObject
 *  nc.bs.pub.pa.PreAlertReturnType
 *  nc.itf.fi.pub.Currency
 *  nc.pubitf.bd.accessor.GeneralAccessorFactory
 *  nc.ui.pub.print.IDataSource
 *  nc.vo.arap.pub.ArapConstant
 *  nc.vo.bd.accessor.IBDData
 *  nc.vo.fipub.exception.ExceptionHandler
 *  nc.vo.fipub.utils.CurrencyControlBO
 *  nc.vo.pub.BusinessException
 *  nc.vo.pub.lang.MultiLangText
 *  nc.vo.pub.lang.UFDouble
 *  nc.vo.pub.rs.MemoryResultSet
 *  nccloud.commons.lang.StringUtils
 */
package nc.impl.arap.prealarm;

import java.math.BigDecimal;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import nc.bs.pub.pa.IBusiCalculater;
import nc.bs.pub.pa.IPreAlertPlugin;
import nc.bs.pub.pa.PreAlertContext;
import nc.bs.pub.pa.PreAlertObject;
import nc.bs.pub.pa.PreAlertReturnType;
import nc.impl.arap.prealarm.ArapPrealarmDataSource;
import nc.itf.fi.pub.Currency;
import nc.pubitf.bd.accessor.GeneralAccessorFactory;
import nc.ui.pub.print.IDataSource;
import nc.vo.arap.pub.ArapConstant;
import nc.vo.bd.accessor.IBDData;
import nc.vo.fipub.exception.ExceptionHandler;
import nc.vo.fipub.utils.CurrencyControlBO;
import nc.vo.pub.BusinessException;
import nc.vo.pub.lang.MultiLangText;
import nc.vo.pub.lang.UFDouble;
import nc.vo.pub.rs.MemoryResultSet;
import nccloud.commons.lang.StringUtils;

public abstract class ArapBasePreAlarmPlugin
implements IPreAlertPlugin {
    protected PreAlertContext context = null;

    public PreAlertObject executeTask(PreAlertContext context) throws BusinessException {
        try {
            this.context = context;
            MemoryResultSet resultSet = this.queryAlarmResult(context);
            return this.constructPreAlertObject(resultSet);
        }
        catch (Exception e) {
            throw ExceptionHandler.handleException((Exception)e);
        }
    }

    protected abstract MemoryResultSet queryAlarmResult(PreAlertContext var1) throws BusinessException;

    protected abstract ArapPrealarmDataSource getPrealarmDataSource(MemoryResultSet var1) throws BusinessException, SQLException;

    protected String getPreAlarmTitle() {
        return this.context.getAlertTypeName();
    }

    private PreAlertObject constructPreAlertObject(MemoryResultSet resultSet) throws SQLException, BusinessException {
        ArapPrealarmDataSource dataSource = this.getPrealarmDataSource(resultSet);
        PreAlertObject preAlertObject = new PreAlertObject();
        preAlertObject.setReturnObj((Object)dataSource);
        if (dataSource.getDatas() == null || dataSource.getDatas().size() == 0) {
            preAlertObject.setReturnType(PreAlertReturnType.RETURNNOTHING);
        } else {
            preAlertObject.setReturnType(PreAlertReturnType.RETURNDATASOURCE);
        }
        preAlertObject.setBusiCalculater((IBusiCalculater)new ArapBusiCal(dataSource));
        return preAlertObject;
    }

    @Deprecated
    protected Object[][] getBodyValues(MemoryResultSet resultSet) throws SQLException, BusinessException {
        int i = 0;
        ArrayList row = null;
        Object[] rowDatas = null;
        String pk_currtype = null;
        String pk_localcurrtype = Currency.getOrgLocalCurrPK((String)this.getPK_org());
        CurrencyControlBO ccBo = new CurrencyControlBO();
        ArrayList<Object[]> resultDatas = new ArrayList<Object[]>();
        while (resultSet.next()) {
            row = resultSet.getRowArrayList();
            rowDatas = new Object[row.size()];
            i = 0;
            if ("F0".equals(this.getBillType())) {
                rowDatas[i] = this.getDocNameByPk("e4f48eaf-5567-4383-a370-a59cb3e8a451", row.get(i));
                ++i;
            } else {
                rowDatas[i] = this.getDocNameByPk("720dcc7c-ff19-48f4-b9c5-b90906682f45", row.get(i));
                ++i;
            }
            rowDatas[i] = this.getDocNameByPk("b26fa3cb-4087-4027-a3b6-c83ab2a086a9", row.get(i));
            rowDatas[++i] = this.getDocNameByPk("40d39c26-a2b6-4f16-a018-45664cac1a1f", row.get(i));
            rowDatas[++i] = row.get(i);
            CharSequence charSequence = row.get(++i) == null ? null : row.get(i).toString().subSequence(0, 11);
            rowDatas[i] = charSequence;
            rowDatas[++i] = row.get(i);
            pk_currtype = row.get(++i) == null ? null : row.get(i).toString();
            rowDatas[i] = Currency.getCurrNameByPk((String)pk_currtype);
            rowDatas[++i] = row.get(i);
            rowDatas[++i] = ccBo.getFormat(pk_currtype, new UFDouble((BigDecimal)row.get(i)));
            rowDatas[++i] = ccBo.getFormat(pk_localcurrtype, new UFDouble((BigDecimal)row.get(i)));
            rowDatas[++i] = ccBo.getFormat(pk_currtype, new UFDouble((BigDecimal)row.get(i)));
            rowDatas[++i] = ccBo.getFormat(pk_localcurrtype, new UFDouble((BigDecimal)row.get(i)));
            resultDatas.add(rowDatas);
        }
        return (Object[][])resultDatas.toArray((T[])new Object[0][0]);
    }

    public String getPK_org() {
        String[] pk_orgs = this.context.getPk_orgs();
        if (pk_orgs != null && pk_orgs.length > 0) {
            return pk_orgs[0];
        }
        return null;
    }

    protected String getBillType() {
        return null;
    }

    protected String getDocNameByPk(String docMetaDataID, Object docPK) {
        if (StringUtils.isEmpty((CharSequence)docMetaDataID) || docPK == null || "".equals(docPK)) {
            return null;
        }
        IBDData docByPk = GeneralAccessorFactory.getAccessor((String)docMetaDataID).getDocByPk(docPK.toString());
        if (docByPk == null) {
            return null;
        }
        MultiLangText name = docByPk.getName();
        if (name == null) {
            return null;
        }
        String docName = name.getText(name.getCurrLangIndex());
        return StringUtils.isEmpty((CharSequence)docName) ? name.getText() : docName;
    }

    protected String getBillTypeName(Object object) {
        if (object == null) {
            return null;
        }
        String billtype = object.toString();
        HashMap<String, String> nameMap = new HashMap<String, String>();
        ArapConstant constant = new ArapConstant();
        nameMap.put("F0", constant.ARAP_MDNAME_RECBILL);
        nameMap.put("F1", constant.ARAP_MDNAME_PAYABLEBILL);
        nameMap.put("F2", constant.ARAP_MDNAME_GATHERBILL);
        nameMap.put("F3", constant.ARAP_MDNAME_PAYBILL);
        return (String)nameMap.get(billtype);
    }

    class ArapBusiCal
    implements IBusiCalculater {
        IDataSource dataSource = null;

        public ArapBusiCal(IDataSource dataSource) {
            this.dataSource = dataSource;
        }

        public String calculateValue(String express) {
            if (this.dataSource == null) {
                return null;
            }
            String[] valuesByExpress = this.dataSource.getItemValuesByExpress(express);
            StringBuffer stringBuffer = new StringBuffer();
            for (int i = 0; i < valuesByExpress.length; ++i) {
                if (valuesByExpress[i] == null) continue;
                stringBuffer.append(valuesByExpress[i]);
                stringBuffer.append("/");
            }
            return stringBuffer.toString();
        }
    }
}


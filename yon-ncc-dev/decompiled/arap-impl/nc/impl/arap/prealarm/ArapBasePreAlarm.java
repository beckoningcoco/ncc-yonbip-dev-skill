/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  nc.bs.arap.utils.TmpTableCreator
 *  nc.bs.dao.BaseDAO
 *  nc.bs.framework.common.InvocationInfoProxy
 *  nc.bs.framework.common.NCLocator
 *  nc.bs.logging.Logger
 *  nc.bs.pub.pa.PreAlertContext
 *  nc.itf.bd.timezone.TimezoneUtil
 *  nc.pubitf.bd.accessor.GeneralAccessorFactory
 *  nc.pubitf.org.IOrgUnitPubService
 *  nc.vo.arap.pub.BillEnumCollection$InureSign
 *  nc.vo.bd.accessor.IBDData
 *  nc.vo.bd.cust.CustomerVO
 *  nc.vo.bd.psn.PsndocVO
 *  nc.vo.bd.supplier.SupplierVO
 *  nc.vo.fi.pub.SqlUtils
 *  nc.vo.org.DeptVO
 *  nc.vo.org.OrgVO
 *  nc.vo.pub.BusinessException
 *  nc.vo.pub.billtype.BilltypeVO
 *  nc.vo.pub.lang.MultiLangText
 *  nc.vo.pub.lang.UFDate
 *  nc.vo.pub.lang.UFDateTime
 *  nc.vo.pub.lang.UFDouble
 *  nc.vo.pubapp.pattern.exception.ExceptionUtils
 *  nccloud.commons.lang.ArrayUtils
 *  nccloud.commons.lang.StringUtils
 */
package nc.impl.arap.prealarm;

import java.sql.SQLException;
import java.util.Collection;
import java.util.GregorianCalendar;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.TimeZone;
import nc.bs.arap.utils.TmpTableCreator;
import nc.bs.dao.BaseDAO;
import nc.bs.framework.common.InvocationInfoProxy;
import nc.bs.framework.common.NCLocator;
import nc.bs.logging.Logger;
import nc.bs.pub.pa.PreAlertContext;
import nc.impl.arap.prealarm.ArapPreAlarmEnumCollection;
import nc.itf.bd.timezone.TimezoneUtil;
import nc.pubitf.bd.accessor.GeneralAccessorFactory;
import nc.pubitf.org.IOrgUnitPubService;
import nc.vo.arap.pub.BillEnumCollection;
import nc.vo.bd.accessor.IBDData;
import nc.vo.bd.cust.CustomerVO;
import nc.vo.bd.psn.PsndocVO;
import nc.vo.bd.supplier.SupplierVO;
import nc.vo.fi.pub.SqlUtils;
import nc.vo.org.DeptVO;
import nc.vo.org.OrgVO;
import nc.vo.pub.BusinessException;
import nc.vo.pub.billtype.BilltypeVO;
import nc.vo.pub.lang.MultiLangText;
import nc.vo.pub.lang.UFDate;
import nc.vo.pub.lang.UFDateTime;
import nc.vo.pub.lang.UFDouble;
import nc.vo.pubapp.pattern.exception.ExceptionUtils;
import nccloud.commons.lang.ArrayUtils;
import nccloud.commons.lang.StringUtils;

public abstract class ArapBasePreAlarm {
    protected PreAlertContext context = null;
    protected String zbAlias = "zb";
    protected String fbAlias = "fb";
    protected String xybAlias = "xyb";
    protected String blank = " ";
    protected String and = " and ";
    protected String union = " union all ";
    protected String pk_group = null;
    protected String[] pk_org = null;
    protected String customerstart = null;
    protected String customerend = null;
    protected String supplierstart = null;
    protected String supplierend = null;
    protected String deptstart = null;
    protected String deptend = null;
    protected String busimanstart = null;
    protected String busimanend = null;
    protected String[] billtype = null;
    protected String[] tradetype = null;
    protected String[] currtype = null;
    protected String assoobj = null;
    protected String billstatus = null;
    protected Integer alarmtype = null;
    protected Integer alarmscope = null;
    protected Integer alarmdays = null;
    protected Integer daysbefore = 0;
    protected UFDouble moneystart = null;
    protected UFDouble moneyend = null;
    private String tmpTblName = null;

    public abstract String getAlarmResultSql() throws SQLException, BusinessException;

    public void init(PreAlertContext context) throws BusinessException {
        this.context = context;
        this.constructPreAlarmCondition();
    }

    protected abstract String getBillType();

    protected String getGroupSql() {
        StringBuffer groupSql = new StringBuffer();
        groupSql.append(this.zbAlias).append(".").append("pk_group").append(" = '").append(this.pk_group).append("' ");
        groupSql.append(this.and);
        groupSql.append(this.fbAlias).append(".").append("pk_group").append(" = '").append(this.pk_group).append("' ");
        return groupSql.toString();
    }

    protected String getOrgSql() throws BusinessException {
        if (ArrayUtils.isEmpty((Object[])this.pk_org)) {
            return " 1 = 1 ";
        }
        StringBuffer orgSql = new StringBuffer();
        orgSql.append(this.zbAlias).append(".").append(SqlUtils.getInStr((String)"pk_org", (String[])this.pk_org, (boolean)false));
        orgSql.append(this.and);
        orgSql.append(this.fbAlias).append(".").append(SqlUtils.getInStr((String)"pk_org", (String[])this.pk_org, (boolean)false));
        return orgSql.toString();
    }

    protected String getCustomerSql() throws SQLException {
        if (StringUtils.isEmpty((CharSequence)this.customerstart) && StringUtils.isEmpty((CharSequence)this.customerend)) {
            return " 1 = 1 ";
        }
        StringBuffer customerSql = new StringBuffer();
        customerSql.append(this.fbAlias).append(".").append("customer").append(" in ");
        customerSql.append(" (select pk_obj from ").append(this.getTmpTblName()).append(" where obj = ").append(ArapPreAlarmEnumCollection.AssoObject.CUSTOMER.getCode()).append(")");
        return customerSql.toString();
    }

    protected String getSupplierSql() throws SQLException {
        if (StringUtils.isEmpty((CharSequence)this.supplierstart) && StringUtils.isEmpty((CharSequence)this.supplierend)) {
            return " 1 = 1 ";
        }
        StringBuffer supplierSql = new StringBuffer();
        supplierSql.append(this.fbAlias).append(".").append("supplier").append(" in ");
        supplierSql.append(" (select pk_obj from ").append(this.getTmpTblName()).append(" where obj = ").append(ArapPreAlarmEnumCollection.AssoObject.SUPPLIER.getCode()).append(")");
        return supplierSql.toString();
    }

    protected String getDeptSql() throws SQLException {
        if (StringUtils.isEmpty((CharSequence)this.deptstart) && StringUtils.isEmpty((CharSequence)this.deptend)) {
            return " 1 = 1 ";
        }
        StringBuffer deptSql = new StringBuffer();
        deptSql.append(this.fbAlias).append(".").append("pk_deptid").append(" in ");
        deptSql.append(" (select pk_obj from ").append(this.getTmpTblName()).append(" where obj = ").append(ArapPreAlarmEnumCollection.AssoObject.DEPT.getCode()).append(")");
        return deptSql.toString();
    }

    protected String getBusimanSql() throws SQLException {
        if (StringUtils.isEmpty((CharSequence)this.busimanstart) && StringUtils.isEmpty((CharSequence)this.busimanend)) {
            return " 1 = 1 ";
        }
        StringBuffer busimanSql = new StringBuffer();
        busimanSql.append(this.fbAlias).append(".").append("pk_psndoc").append(" in ");
        busimanSql.append(" (select pk_obj from ").append(this.getTmpTblName()).append(" where obj = ").append(ArapPreAlarmEnumCollection.AssoObject.BUSIMAN.getCode()).append(")");
        return busimanSql.toString();
    }

    protected String getAssoObjSql() {
        if (StringUtils.isEmpty((CharSequence)this.assoobj)) {
            return " 1 = 1 ";
        }
        StringBuffer assoObjSql = new StringBuffer();
        assoObjSql.append(this.fbAlias).append(".").append("objtype").append(" = ").append(this.assoobj);
        return assoObjSql.toString();
    }

    protected String getTradeTypeSql() throws BusinessException {
        if (ArrayUtils.isEmpty((Object[])this.tradetype)) {
            return " 1 = 1 ";
        }
        StringBuffer tradeTypeSql = new StringBuffer();
        tradeTypeSql.append(SqlUtils.getInStr((String)(this.zbAlias + "." + "pk_tradetype"), (String[])this.tradetype, (boolean)false));
        tradeTypeSql.append(this.and);
        tradeTypeSql.append(SqlUtils.getInStr((String)(this.fbAlias + "." + "pk_tradetype"), (String[])this.tradetype, (boolean)false));
        return tradeTypeSql.toString();
    }

    protected String getCurrtypeSql() throws BusinessException {
        if (ArrayUtils.isEmpty((Object[])this.currtype)) {
            return " 1 = 1 ";
        }
        return SqlUtils.getInStr((String)(this.fbAlias + "." + "pk_currtype"), (String[])this.currtype, (boolean)false);
    }

    protected String getBillStatusSql() {
        if (StringUtils.isEmpty((CharSequence)this.billstatus) || ArapPreAlarmEnumCollection.BillStatus.ALL.getCode().toString().equals(this.billstatus)) {
            return " 1 = 1 ";
        }
        StringBuffer billStatusSql = new StringBuffer();
        billStatusSql.append(this.zbAlias).append(".").append("effectstatus");
        if (ArapPreAlarmEnumCollection.BillStatus.UNEFFECT.getCode().toString().equals(this.billstatus)) {
            billStatusSql.append(" < ").append(BillEnumCollection.InureSign.OKINURE.VALUE);
        } else if (ArapPreAlarmEnumCollection.BillStatus.EFFECT.getCode().toString().equals(this.billstatus)) {
            billStatusSql.append(" = ").append(BillEnumCollection.InureSign.OKINURE.VALUE);
        }
        return billStatusSql.toString();
    }

    protected String getFieldNameWithoutTableName(String fieldName) {
        if (StringUtils.isEmpty((CharSequence)fieldName) || fieldName.indexOf(".") < 0) {
            return fieldName;
        }
        return fieldName.split("\\.")[1];
    }

    public String getObjTypeScopeSql() throws SQLException {
        boolean hasObjType = false;
        StringBuffer cusSql = new StringBuffer(" (select ");
        cusSql.append(ArapPreAlarmEnumCollection.AssoObject.CUSTOMER.getCode()).append(" obj, ").append("pk_customer").append(" pk_obj ");
        cusSql.append(" from ").append(CustomerVO.getDefaultTableName());
        cusSql.append(" where ");
        cusSql.append("pk_group").append(" = '").append(this.pk_group).append("' ");
        if (!StringUtils.isEmpty((CharSequence)this.customerstart)) {
            hasObjType = true;
            cusSql.append(this.and).append("code").append(" >= ");
            cusSql.append(" (select ").append("code").append(" from ").append(CustomerVO.getDefaultTableName()).append(" where ").append("pk_customer").append(" = '").append(this.customerstart).append("') ");
        }
        if (!StringUtils.isEmpty((CharSequence)this.customerend)) {
            hasObjType = true;
            cusSql.append(this.and).append("code").append(" <= ");
            cusSql.append(" (select ").append("code").append(" from ").append(CustomerVO.getDefaultTableName()).append(" where ").append("pk_customer").append(" = '").append(this.customerend).append("') ");
        }
        cusSql.append(") ");
        StringBuffer supSql = new StringBuffer(" (select ");
        supSql.append(ArapPreAlarmEnumCollection.AssoObject.SUPPLIER.getCode()).append(" obj, ").append("pk_supplier").append(" pk_obj ");
        supSql.append(" from ").append(SupplierVO.getDefaultTableName());
        supSql.append(" where ");
        supSql.append("pk_group").append(" = '").append(this.pk_group).append("' ");
        if (!StringUtils.isEmpty((CharSequence)this.supplierstart)) {
            hasObjType = true;
            supSql.append(this.and).append("code").append(" >= ");
            supSql.append(" (select ").append("code").append(" from ").append(SupplierVO.getDefaultTableName()).append(" where ").append("pk_supplier").append(" = '").append(this.supplierstart).append("') ");
        }
        if (!StringUtils.isEmpty((CharSequence)this.supplierend)) {
            hasObjType = true;
            supSql.append(this.and).append("code").append(" <= ");
            supSql.append(" (select ").append("code").append(" from ").append(SupplierVO.getDefaultTableName()).append(" where ").append("pk_supplier").append(" = '").append(this.supplierend).append("') ");
        }
        supSql.append(") ");
        StringBuffer deptSql = new StringBuffer(" (select ");
        deptSql.append(ArapPreAlarmEnumCollection.AssoObject.DEPT.getCode()).append(" obj, ").append("pk_dept").append(" pk_obj ");
        deptSql.append(" from ").append(DeptVO.getDefaultTableName());
        deptSql.append(" where ");
        deptSql.append("pk_group").append(" = '").append(this.pk_group).append("' ");
        if (!StringUtils.isEmpty((CharSequence)this.deptstart)) {
            hasObjType = true;
            deptSql.append(this.and).append("code").append(" >= ");
            deptSql.append(" (select ").append("code").append(" from ").append(DeptVO.getDefaultTableName()).append(" where ").append("pk_dept").append(" = '").append(this.deptstart).append("') ");
        }
        if (!StringUtils.isEmpty((CharSequence)this.deptend)) {
            hasObjType = true;
            deptSql.append(this.and).append("code").append(" <= ");
            deptSql.append(" (select ").append("code").append(" from ").append(DeptVO.getDefaultTableName()).append(" where ").append("pk_dept").append(" = '").append(this.deptend).append("') ");
        }
        deptSql.append(") ");
        StringBuffer busiSql = new StringBuffer(" (select ");
        String psnTable = new PsndocVO().getTableName();
        busiSql.append(ArapPreAlarmEnumCollection.AssoObject.BUSIMAN.getCode()).append(" obj, ").append("pk_psndoc").append(" pk_obj ");
        busiSql.append(" from ").append(psnTable);
        busiSql.append(" where ");
        busiSql.append("pk_group").append(" = '").append(this.pk_group).append("' ");
        if (!StringUtils.isEmpty((CharSequence)this.busimanstart)) {
            hasObjType = true;
            busiSql.append(this.and).append("code").append(" >= ");
            busiSql.append(" (select ").append("code").append(" from ").append(psnTable).append(" where ").append("pk_psndoc").append(" = '").append(this.busimanstart).append("') ");
        }
        if (!StringUtils.isEmpty((CharSequence)this.busimanend)) {
            hasObjType = true;
            busiSql.append(this.and).append("code").append(" <= ");
            busiSql.append(" (select ").append("code").append(" from ").append(psnTable).append(" where ").append("pk_psndoc").append(" = '").append(this.busimanend).append("') ");
        }
        busiSql.append(") ");
        if (!hasObjType) {
            return null;
        }
        boolean hasJoinTable = false;
        StringBuffer sqlBuffer = new StringBuffer(" insert into ");
        sqlBuffer.append(this.getTmpTblName());
        sqlBuffer.append(" select v.* from ");
        sqlBuffer.append(" (");
        if (!StringUtils.isEmpty((CharSequence)this.customerstart) || !StringUtils.isEmpty((CharSequence)this.customerend)) {
            hasJoinTable = true;
            sqlBuffer.append(cusSql);
        }
        if (!StringUtils.isEmpty((CharSequence)this.supplierstart) || !StringUtils.isEmpty((CharSequence)this.supplierend)) {
            if (hasJoinTable) {
                sqlBuffer.append(" union all ");
            }
            hasJoinTable = true;
            sqlBuffer.append(supSql);
        }
        if (!StringUtils.isEmpty((CharSequence)this.deptstart) || !StringUtils.isEmpty((CharSequence)this.deptend)) {
            if (hasJoinTable) {
                sqlBuffer.append(" union all ");
            }
            hasJoinTable = true;
            sqlBuffer.append(deptSql);
        }
        if (!StringUtils.isEmpty((CharSequence)this.busimanstart) || !StringUtils.isEmpty((CharSequence)this.busimanend)) {
            if (hasJoinTable) {
                sqlBuffer.append(" union all ");
            }
            hasJoinTable = true;
            sqlBuffer.append(busiSql);
        }
        sqlBuffer.append(") v ");
        return sqlBuffer.toString();
    }

    protected String getAlarmSql() {
        this.alarmscope = this.alarmscope == null ? ArapPreAlarmEnumCollection.AlarmScope.ALL.getCode() : this.alarmscope;
        this.alarmdays = this.alarmdays == null ? 0 : this.alarmdays;
        GregorianCalendar calendar = new GregorianCalendar();
        UFDate currDate = new UFDate(new UFDate(calendar.getTimeInMillis()).toStdString(), true);
        Boolean isSensitiveTimeZone = InvocationInfoProxy.getInstance().getSensitiveTimeZone();
        if (isSensitiveTimeZone.booleanValue()) {
            OrgVO[] orgVOs = null;
            TimeZone clientTimeZone = null;
            try {
                orgVOs = ArapBasePreAlarm.getOrgUnitPubService().getOrgs(this.getPK_org(), new String[]{"pk_org", "pk_vid", "name", "pk_group", "pk_timezone"});
                if (orgVOs != null && orgVOs[0] != null) {
                    clientTimeZone = TimezoneUtil.getTimeZone((String)orgVOs[0].getPk_timezone());
                }
            }
            catch (BusinessException e) {
                ExceptionUtils.wrappException((Exception)((Object)e));
            }
            if (orgVOs == null || clientTimeZone == null) {
                clientTimeZone = TimeZone.getTimeZone(InvocationInfoProxy.getInstance().getTimeZone());
            }
            String datelineDate = new UFDateTime(currDate.toString()).getDate().toStdString(clientTimeZone);
            currDate = new UFDate(datelineDate, clientTimeZone, false);
        }
        UFDate alarmDate = new UFDate(currDate.getDateAfter(this.alarmdays.intValue()).toStdString(), false);
        StringBuffer alarmSql = new StringBuffer(" (");
        alarmSql.append(this.xybAlias).append(".").append("pk_group").append(" = '").append(this.pk_group).append("' ");
        alarmSql.append(this.and);
        if (ArapPreAlarmEnumCollection.AlarmScope.ALL.equals((Object)ArapPreAlarmEnumCollection.AlarmScope.valueOf(this.alarmscope))) {
            alarmSql.append(this.xybAlias).append(".").append(this.getAlarmTypeField(this.alarmtype)).append(" <= '").append(alarmDate).append("' ");
        } else if (ArapPreAlarmEnumCollection.AlarmScope.DUETO.equals((Object)ArapPreAlarmEnumCollection.AlarmScope.valueOf(this.alarmscope))) {
            alarmSql.append(this.xybAlias).append(".").append(this.getAlarmTypeField(this.alarmtype)).append(" < '").append(currDate).append("' ");
        } else if (ArapPreAlarmEnumCollection.AlarmScope.UNDUETO.equals((Object)ArapPreAlarmEnumCollection.AlarmScope.valueOf(this.alarmscope))) {
            alarmSql.append(this.xybAlias).append(".").append(this.getAlarmTypeField(this.alarmtype)).append(" >= '").append(currDate).append("' ");
            alarmSql.append(this.and).append(this.xybAlias).append(".").append(this.getAlarmTypeField(this.alarmtype)).append(" <= '").append(alarmDate).append("' ");
        }
        alarmSql.append(") ");
        return alarmSql.toString();
    }

    private String getAlarmTypeField(Integer alarmType) {
        String field = "expiredate";
        if (ArapPreAlarmEnumCollection.AlarmType.CREDIT.equals((Object)ArapPreAlarmEnumCollection.AlarmType.valueOf(alarmType))) {
            field = "expiredate";
        } else if (ArapPreAlarmEnumCollection.AlarmType.DISCOUNT.equals((Object)ArapPreAlarmEnumCollection.AlarmType.valueOf(alarmType))) {
            field = "lastdiscountdate";
        }
        return field;
    }

    private String[] getPK_org() {
        String[] pk_orgs = this.context.getPk_orgs();
        if (pk_orgs != null && pk_orgs.length > 0) {
            return pk_orgs;
        }
        return null;
    }

    private void constructPreAlarmCondition() throws BusinessException {
        LinkedHashMap keyMap = this.context.getKeyMap();
        this.pk_group = InvocationInfoProxy.getInstance().getGroupId();
        this.pk_org = this.getPK_org();
        Object obj = null;
        obj = keyMap.get("customerstart");
        this.customerstart = obj == null || obj.toString().length() == 0 ? null : obj.toString();
        obj = keyMap.get("customerend");
        this.customerend = obj == null || obj.toString().length() == 0 ? null : obj.toString();
        obj = keyMap.get("supplierstart");
        this.supplierstart = obj == null || obj.toString().length() == 0 ? null : obj.toString();
        obj = keyMap.get("supplierend");
        this.supplierend = obj == null || obj.toString().length() == 0 ? null : obj.toString();
        obj = keyMap.get("deptstart");
        this.deptstart = obj == null || obj.toString().length() == 0 ? null : obj.toString();
        obj = keyMap.get("deptend");
        this.deptend = obj == null || obj.toString().length() == 0 ? null : obj.toString();
        obj = keyMap.get("busimanstart");
        this.busimanstart = obj == null || obj.toString().length() == 0 ? null : obj.toString();
        obj = keyMap.get("busimanend");
        this.busimanend = obj == null || obj.toString().length() == 0 ? null : obj.toString();
        obj = keyMap.get("assoobj");
        this.assoobj = obj == null || obj.toString().length() == 0 ? null : obj.toString();
        obj = keyMap.get("billtype");
        this.billtype = obj == null || obj.toString().length() == 0 ? null : this.getBillTypeCodeByPk(obj.toString());
        this.tradetype = obj == null || obj.toString().length() == 0 ? null : this.getTradeTypeCodeByPk(obj.toString());
        obj = keyMap.get("currtype");
        this.currtype = obj == null || obj.toString().length() == 0 ? null : this.getCurrencyPk(obj.toString());
        obj = keyMap.get("billstatus");
        this.billstatus = obj == null || obj.toString().length() == 0 ? null : obj.toString();
        obj = keyMap.get("alarmtype");
        this.alarmtype = obj == null || obj.toString().length() == 0 ? null : Integer.valueOf(obj.toString());
        obj = keyMap.get("alarmscope");
        this.alarmscope = obj == null || obj.toString().length() == 0 ? null : Integer.valueOf(obj.toString());
        obj = keyMap.get("alarmdays");
        this.alarmdays = obj == null || obj.toString().length() == 0 ? null : Integer.valueOf(obj.toString());
        obj = keyMap.get("daysbefore");
        this.daysbefore = obj == null || obj.toString().length() == 0 ? null : Integer.valueOf(obj.toString());
        obj = keyMap.get("moneystart");
        this.moneystart = obj == null || obj.toString().length() == 0 ? null : new UFDouble(obj.toString());
        obj = keyMap.get("moneyend");
        this.moneyend = obj == null || obj.toString().length() == 0 ? null : new UFDouble(obj.toString());
    }

    protected String getDocNameByPk(String docMetaDataID, Object docPK) {
        if (StringUtils.isEmpty((CharSequence)docMetaDataID) || StringUtils.isEmpty((CharSequence)((String)docPK))) {
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
        return name.getText(name.getCurrLangIndex());
    }

    public String getDropTmpTblSql() throws SQLException {
        return null;
    }

    private String getTmpTblName() throws SQLException {
        if (StringUtils.isEmpty((CharSequence)this.tmpTblName)) {
            this.tmpTblName = TmpTableCreator.createTmpTable((String)"tmp_arap_alarm", (String[])this.getTmpTblColNames(), (Integer[])this.getTmpTblColTypes());
        }
        return this.tmpTblName;
    }

    private String[] getTmpTblColNames() {
        return new String[]{"obj", "pk_obj"};
    }

    private Integer[] getTmpTblColTypes() {
        return new Integer[]{4, 12};
    }

    private String[] getCurrencyPk(String currency) {
        if (StringUtils.isEmpty((CharSequence)currency)) {
            return null;
        }
        String[] currencys = currency.split(",");
        for (int i = 0; i < currencys.length; ++i) {
            currencys[i] = currencys[i].trim();
        }
        return currencys;
    }

    private String[] getBillTypeCodeByPk(String pk_billtype) throws BusinessException {
        if (StringUtils.isEmpty((CharSequence)pk_billtype)) {
            return null;
        }
        String[] billtypes = pk_billtype.split(",");
        for (int i = 0; i < billtypes.length; ++i) {
            billtypes[i] = billtypes[i].trim();
        }
        Collection coll = new BaseDAO().retrieveByClause(BilltypeVO.class, SqlUtils.getInStr((String)"pk_billtypeid", (String[])billtypes, (boolean)false));
        if (coll == null || coll.size() == 0) {
            return null;
        }
        HashSet<String> billtypeSet = new HashSet<String>();
        for (BilltypeVO billtypeVO : coll) {
            billtypeSet.add(billtypeVO.getParentbilltype() == null ? billtypeVO.getPk_billtypecode() : billtypeVO.getParentbilltype());
        }
        return billtypeSet.toArray(new String[0]);
    }

    private String[] getTradeTypeCodeByPk(String pk_billtype) throws BusinessException {
        if (StringUtils.isEmpty((CharSequence)pk_billtype)) {
            return null;
        }
        String[] billtypes = pk_billtype.split(",");
        for (int i = 0; i < billtypes.length; ++i) {
            billtypes[i] = billtypes[i].trim();
        }
        Collection coll = new BaseDAO().retrieveByClause(BilltypeVO.class, SqlUtils.getInStr((String)"pk_billtypeid", (String[])billtypes, (boolean)false));
        if (coll == null || coll.size() == 0) {
            return null;
        }
        HashSet<String> tradetypeSet = new HashSet<String>();
        for (BilltypeVO billtypeVO : coll) {
            tradetypeSet.add(billtypeVO.getPk_billtypecode());
        }
        return tradetypeSet.toArray(new String[0]);
    }

    public static IOrgUnitPubService getOrgUnitPubService() {
        try {
            return (IOrgUnitPubService)NCLocator.getInstance().lookup(IOrgUnitPubService.class.getName());
        }
        catch (Exception ex) {
            Logger.error((Object)ex);
            return null;
        }
    }
}


/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  nc.bs.arap.utils.TmpTableCreator
 *  nc.bs.bd.util.DBAUtil
 *  nc.bs.dao.BaseDAO
 *  nc.bs.dao.DAOException
 *  nc.bs.framework.common.InvocationInfoProxy
 *  nc.bs.framework.common.NCLocator
 *  nc.bs.logging.Log
 *  nc.bs.logging.Logger
 *  nc.bs.pub.IInitData
 *  nc.bs.pub.InitDataException
 *  nc.bs.sm.accountmanage.AbstractUpdateAccount
 *  nc.impl.sscrp.update.SSCRPUpdateUtil
 *  nc.itf.bd.predata.IPredataImportService
 *  nc.itf.fip.initdata.IFipInitDataService
 *  nc.itf.framework.ejb.CMTProxy
 *  nc.jdbc.framework.ConnectionFactory
 *  nc.jdbc.framework.JdbcSession
 *  nc.jdbc.framework.PersistenceManager
 *  nc.jdbc.framework.SQLParameter
 *  nc.jdbc.framework.exception.DbException
 *  nc.jdbc.framework.generator.IdGenerator
 *  nc.jdbc.framework.processor.ArrayListProcessor
 *  nc.jdbc.framework.processor.ColumnListProcessor
 *  nc.jdbc.framework.processor.ColumnProcessor
 *  nc.jdbc.framework.processor.ResultSetProcessor
 *  nc.vo.arap.djlx.DjLXVO
 *  nc.vo.arap.utils.ARAPModuleEnableUtil
 *  nc.vo.arap.utils.StringUtil
 *  nc.vo.fi.pub.SqlUtils
 *  nc.vo.org.closeaccbook.CheckItemVO
 *  nc.vo.pf.change.ExchangeRuleVO
 *  nc.vo.pf.change.ExchangeSplitVO
 *  nc.vo.pf.change.ExchangeVO
 *  nc.vo.pf.change.SplitItemVO
 *  nc.vo.pub.BusinessException
 *  nc.vo.pub.SuperVO
 *  nc.vo.pub.billtype.BilltypeVO
 *  nc.vo.pub.lang.UFBoolean
 *  nc.vo.pub.lang.UFDate
 *  nc.vo.pub.lang.UFDateTime
 *  nc.vo.pub.pfflow.BillactionVO
 *  nc.vo.pub.pftemplate.SystemplateBaseVO
 *  nc.vo.pub.pftemplate.SystemplateVO
 *  nc.vo.pubapp.pattern.exception.ExceptionUtils
 *  org.apache.commons.collections4.CollectionUtils
 */
package nc.bs.arap.initdata;

import java.lang.reflect.Method;
import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import nc.bs.arap.utils.TmpTableCreator;
import nc.bs.bd.util.DBAUtil;
import nc.bs.dao.BaseDAO;
import nc.bs.dao.DAOException;
import nc.bs.framework.common.InvocationInfoProxy;
import nc.bs.framework.common.NCLocator;
import nc.bs.logging.Log;
import nc.bs.logging.Logger;
import nc.bs.pub.IInitData;
import nc.bs.pub.InitDataException;
import nc.bs.sm.accountmanage.AbstractUpdateAccount;
import nc.impl.sscrp.update.SSCRPUpdateUtil;
import nc.itf.bd.predata.IPredataImportService;
import nc.itf.fip.initdata.IFipInitDataService;
import nc.itf.framework.ejb.CMTProxy;
import nc.jdbc.framework.ConnectionFactory;
import nc.jdbc.framework.JdbcSession;
import nc.jdbc.framework.PersistenceManager;
import nc.jdbc.framework.SQLParameter;
import nc.jdbc.framework.exception.DbException;
import nc.jdbc.framework.generator.IdGenerator;
import nc.jdbc.framework.processor.ArrayListProcessor;
import nc.jdbc.framework.processor.ColumnListProcessor;
import nc.jdbc.framework.processor.ColumnProcessor;
import nc.jdbc.framework.processor.ResultSetProcessor;
import nc.vo.arap.djlx.DjLXVO;
import nc.vo.arap.utils.ARAPModuleEnableUtil;
import nc.vo.arap.utils.StringUtil;
import nc.vo.fi.pub.SqlUtils;
import nc.vo.org.closeaccbook.CheckItemVO;
import nc.vo.pf.change.ExchangeRuleVO;
import nc.vo.pf.change.ExchangeSplitVO;
import nc.vo.pf.change.ExchangeVO;
import nc.vo.pf.change.SplitItemVO;
import nc.vo.pub.BusinessException;
import nc.vo.pub.SuperVO;
import nc.vo.pub.billtype.BilltypeVO;
import nc.vo.pub.lang.UFBoolean;
import nc.vo.pub.lang.UFDate;
import nc.vo.pub.lang.UFDateTime;
import nc.vo.pub.pfflow.BillactionVO;
import nc.vo.pub.pftemplate.SystemplateBaseVO;
import nc.vo.pub.pftemplate.SystemplateVO;
import nc.vo.pubapp.pattern.exception.ExceptionUtils;
import org.apache.commons.collections4.CollectionUtils;

public class ArapInitDAtaBO
extends AbstractUpdateAccount
implements IInitData {
    private BaseDAO dao;

    public BaseDAO getDao() {
        if (this.dao == null) {
            this.dao = new BaseDAO();
        }
        return this.dao;
    }

    public void initAccountData(String dataSourceName) throws InitDataException {
    }

    public void initCorpData(String pkCorp) throws InitDataException {
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public void doAfterUpdateData(String oldVersion, String newVersion) throws Exception {
        long time1 = System.currentTimeMillis();
        try {
            String[] sagaSql;
            Logger.error((Object)"-----------------\u6536\u4ed8\u5347\u7ea7\u540e\u5904\u7406----------------------");
            this.updateBillAction();
            if (oldVersion != null && oldVersion.startsWith("6.5")) {
                String mindate;
                String pk_org;
                Logger.error((Object)"-----------------\u6536\u4ed8\u5347\u7ea7\u540e\u811a\u672c\u5904\u7406\u5f00\u59cb----------------------");
                CMTProxy proxySrv = (CMTProxy)NCLocator.getInstance().lookup(CMTProxy.class);
                this.update(proxySrv, "update bd_billtype set ISLIGHTBILL='Y' where systemcode in ('AR','AP') and ISLIGHTBILL is null and PARENTBILLTYPE in ('F3','F2','F1','F0','23E0','23E1')");
                this.updateSysinit();
                this.update(proxySrv, "update arap_billmap set ismanual='N' ");
                List orgList = (List)this.getDao().executeQuery("select distinct pk_org from arap_busidata ", (ResultSetProcessor)new ColumnListProcessor());
                if (orgList != null && orgList.size() > 0) {
                    for (String pk_org2 : orgList) {
                        for (int i = 16; i <= 80; ++i) {
                            this.update(proxySrv, "update arap_busidata set def" + i + "=(select def" + i + " from ar_recitem where arap_busidata.pk_item = ar_recitem.pk_recitem and ar_recitem.dr=0 ) where PK_BILLTYPE='F0' and pk_org = '" + pk_org2 + "'");
                            this.update(proxySrv, "update arap_busidata set def" + i + "=(select def" + i + " from ar_gatheritem where arap_busidata.pk_item = ar_gatheritem.pk_gatheritem and ar_gatheritem.dr=0 ) where PK_BILLTYPE='F2' and pk_org = '" + pk_org2 + "'");
                            this.update(proxySrv, "update arap_busidata set def" + i + "=(select def" + i + " from ap_payableitem where arap_busidata.pk_item = ap_payableitem.pk_payableitem and ap_payableitem.dr=0 ) where PK_BILLTYPE='F1' and pk_org = '" + pk_org2 + "'");
                            this.update(proxySrv, "update arap_busidata set def" + i + "=(select def" + i + " from ap_payitem where arap_busidata.pk_item = ap_payitem.pk_payitem and ap_payitem.dr=0 ) where PK_BILLTYPE='F3' and pk_org = '" + pk_org2 + "'");
                        }
                    }
                }
                UFDate date = new UFDate();
                String year = date.toLocalString().substring(0, 4);
                int lastyear = Integer.valueOf(year) - 1;
                String compdate = String.valueOf(lastyear) + "-01-01 00:00:00";
                UFDate startdate = new UFDate(compdate);
                List result = (List)this.getDao().executeQuery("select pk_org,min(billdate) from ar_recbill where effectstatus =0 and dr=0 group by pk_org", (ResultSetProcessor)new ArrayListProcessor());
                if (result != null && result.size() > 0) {
                    for (Object[] objs : result) {
                        pk_org = (String)objs[0];
                        mindate = (String)objs[1];
                        startdate = compdate.compareTo(mindate) > 0 ? new UFDate(mindate) : new UFDate(compdate);
                        this.update(proxySrv, " update ar_recbill set BILLSTATUS='-1' where BILLSTATUS='2' and dr=0 and pk_org = '" + pk_org + "' and billdate >= '" + startdate + "'");
                        this.update(proxySrv, " update ar_recbill set APPROVESTATUS='-1' where BILLSTATUS in ('-99','9') and dr=0 and pk_org = '" + pk_org + "' and billdate >= '" + startdate + "'");
                    }
                }
                if ((result = (List)this.getDao().executeQuery("select pk_org,min(billdate) from ar_gatherbill where effectstatus =0 and dr=0 group by pk_org", (ResultSetProcessor)new ArrayListProcessor())) != null && result.size() > 0) {
                    for (Object[] objs : result) {
                        pk_org = (String)objs[0];
                        mindate = (String)objs[1];
                        startdate = compdate.compareTo(mindate) > 0 ? new UFDate(mindate) : new UFDate(compdate);
                        this.update(proxySrv, " update ar_gatherbill set BILLSTATUS='-1' where BILLSTATUS='2' and dr=0 and pk_org = '" + pk_org + "' and billdate >= '" + startdate + "'");
                        this.update(proxySrv, " update ar_gatherbill set APPROVESTATUS='-1' where BILLSTATUS in ('-99','9') and dr=0 and pk_org = '" + pk_org + "' and billdate >= '" + startdate + "'");
                        this.update(proxySrv, "update arap_tally set pk_recpaytype=(select pk_recpaytype from ar_gatheritem where arap_tally.pk_item = ar_gatheritem.pk_gatheritem and ar_gatheritem.dr=0 ) where PK_BILLTYPE='F2' and pk_org = '" + pk_org + "' and billdate >= '" + startdate + "'");
                    }
                }
                if ((result = (List)this.getDao().executeQuery("select pk_org,min(billdate) from ap_payablebill where effectstatus =0 and dr=0 group by pk_org", (ResultSetProcessor)new ArrayListProcessor())) != null && result.size() > 0) {
                    for (Object[] objs : result) {
                        pk_org = (String)objs[0];
                        mindate = (String)objs[1];
                        startdate = compdate.compareTo(mindate) > 0 ? new UFDate(mindate) : new UFDate(compdate);
                        this.update(proxySrv, " update ap_payablebill set BILLSTATUS='-1' where BILLSTATUS='2' and dr=0 and pk_org = '" + pk_org + "' and billdate >= '" + startdate + "'");
                        this.update(proxySrv, " update ap_payablebill set APPROVESTATUS='-1' where BILLSTATUS in ('-99','9') and dr=0 and pk_org = '" + pk_org + "' and billdate >= '" + startdate + "'");
                    }
                }
                if ((result = (List)this.getDao().executeQuery("select pk_org,min(billdate) from ap_paybill where effectstatus =0 and dr=0 group by pk_org", (ResultSetProcessor)new ArrayListProcessor())) != null && result.size() > 0) {
                    for (Object[] objs : result) {
                        pk_org = (String)objs[0];
                        mindate = (String)objs[1];
                        startdate = compdate.compareTo(mindate) > 0 ? new UFDate(mindate) : new UFDate(compdate);
                        this.update(proxySrv, " update ap_paybill set BILLSTATUS='-1' where BILLSTATUS='2' and dr=0 and pk_org = '" + pk_org + "' and billdate >= '" + startdate + "'");
                        this.update(proxySrv, " update ap_paybill set APPROVESTATUS='-1' where BILLSTATUS in ('-99','9') and dr=0 and pk_org = '" + pk_org + "' and billdate >= '" + startdate + "'");
                        this.update(proxySrv, " update arap_tally set pk_recpaytype=(select pk_recpaytype from ap_payitem where arap_tally.pk_item = ap_payitem.pk_payitem and ap_payitem.dr=0 ) where PK_BILLTYPE='F3' and pk_org = '" + pk_org + "' and billdate >= '" + startdate + "'");
                    }
                }
                if ((result = (List)this.getDao().executeQuery("select pk_org,min(billdate) from ar_estirecbill where effectstatus =0 and dr=0 group by pk_org", (ResultSetProcessor)new ArrayListProcessor())) != null && result.size() > 0) {
                    for (Object[] objs : result) {
                        pk_org = (String)objs[0];
                        mindate = (String)objs[1];
                        startdate = compdate.compareTo(mindate) > 0 ? new UFDate(mindate) : new UFDate(compdate);
                        this.update(proxySrv, " update ar_estirecbill set BILLSTATUS='-1' where BILLSTATUS='2' and dr=0 and pk_org = '" + pk_org + "' and billdate >= '" + startdate + "'");
                    }
                }
                if ((result = (List)this.getDao().executeQuery("select pk_org,min(billdate) from ap_estipayablebill where effectstatus =0 and dr=0 group by pk_org", (ResultSetProcessor)new ArrayListProcessor())) != null && result.size() > 0) {
                    for (Object[] objs : result) {
                        pk_org = (String)objs[0];
                        mindate = (String)objs[1];
                        startdate = compdate.compareTo(mindate) > 0 ? new UFDate(mindate) : new UFDate(compdate);
                        this.update(proxySrv, " update ap_estipayablebill set BILLSTATUS='-1' where BILLSTATUS='2' and dr=0 and pk_org = '" + pk_org + "' and billdate >= '" + startdate + "'");
                    }
                }
                this.update(proxySrv, " update org_checkitem set CHECKITEM_URL='arap/arappub/closeaccComponent/list/index' where moduleid in ('2006','2008') and CHECKITEM_URL is null ");
                String dbType = this.getDbType();
                if ("ORACLE".equalsIgnoreCase(dbType)) {
                    this.update(proxySrv, " alter table ap_payablebill modify COORDFLAG default null ");
                } else if ("SQL".equalsIgnoreCase(dbType)) {
                    result = (List)this.getDao().executeQuery("select c.name from sysconstraints a inner join syscolumns b on a.colid=b.colid inner join sysobjects c on a.constid=c.id where a.id=object_id('ap_payablebill') and b.name='coordflag'", (ResultSetProcessor)new ArrayListProcessor());
                    if (result != null && result.size() > 0) {
                        for (Object[] objs : result) {
                            this.update(proxySrv, " alter table ap_payablebill drop constraint " + (String)objs[0]);
                        }
                    }
                } else if ("POSTGRESQL".equalsIgnoreCase(dbType)) {
                    this.update(proxySrv, " ALTER TABLE ap_payablebill ALTER COLUMN coordflag DROP DEFAULT ");
                } else if ("DB2".equalsIgnoreCase(dbType)) {
                    this.update(proxySrv, " ALTER TABLE ap_payablebill ALTER COLUMN coordflag {DROP DEFAULT} ");
                }
                this.updateVOChange();
                if (newVersion.contains("2021.11")) {
                    this.updateVOchange4Rate();
                }
                this.updateSystemplete();
            }
            if (oldVersion != null && (oldVersion.startsWith("6.5") || oldVersion.contains("Cloud") && oldVersion.contains("1903"))) {
                this.updateBillAction();
            }
            if (!(oldVersion == null || oldVersion.contains("Cloud") && (oldVersion.contains("1909") || oldVersion.contains("2020.05")))) {
                this.updateBilltype();
                this.updateVOChange2();
                this.deleteSSCCTListener();
                this.deleteReportMenu();
                this.updateSscrpFieldMap();
                this.updateArapCheckNOLength();
            }
            this.dealBaddebtBill(oldVersion);
            if (oldVersion != null && (oldVersion.contains("6.5") || oldVersion.contains("1903") || oldVersion.contains("1904") || oldVersion.contains("1909"))) {
                this.updateButtonResid();
                this.updateCheckItemVO();
                this.updateTemplet();
            }
            if (oldVersion != null && (oldVersion.startsWith("6.5") || oldVersion.contains("Cloud") && (oldVersion.contains("1811") || oldVersion.contains("1903") || oldVersion.contains("1909") || oldVersion.contains("2005") || oldVersion.contains("2105")))) {
                for (String sql : sagaSql = new String[]{"update ap_payitem set customer_v = customer,supplier_v = supplier,ordercubasdoc_v = ordercubasdoc;", "update ap_payableitem set customer_v = customer,supplier_v = supplier,ordercubasdoc_v = ordercubasdoc;", "update ar_recitem set customer_v = customer,supplier_v = supplier,ordercubasdoc_v = ordercubasdoc;", "update ar_gatheritem set customer_v = customer,supplier_v = supplier,ordercubasdoc_v = ordercubasdoc;", "update ar_estirecitem set customer_v = customer,ordercubasdoc_v = ordercubasdoc;", "update ap_estipayableitem set supplier_v = supplier;"}) {
                    this.updateSql(sql);
                }
            }
            if (oldVersion != null && (oldVersion.contains("1909") || oldVersion.contains("2005") || oldVersion.contains("2105"))) {
                for (String sql : sagaSql = new String[]{"update arap_bdprovision set creationtime = creatortime;", "update arap_bdloss set creationtime = creatortime;", "update arap_bdrecovery set creationtime = creatortime;", "update arap_indiprovision set creationtime = creatortime;"}) {
                    this.updateSql(sql);
                }
            }
            if (oldVersion == null || !oldVersion.contains("2021.05") && !oldVersion.contains("2021.11")) {
                Logger.error((Object)"-----------------\u6536\u4ed8\u5220\u9664\u4f1a\u8ba1\u5e73\u53f0\u5229\u6da6\u4e2d\u5fc3\u76f8\u5173\u5b57\u6bb5\u5f00\u59cb----------------------");
                this.deleteFipTable();
                Logger.error((Object)"-----------------\u6536\u4ed8\u5220\u9664\u4f1a\u8ba1\u5e73\u53f0\u5229\u6da6\u4e2d\u5fc3\u76f8\u5173\u5b57\u6bb5\u7ed3\u675f----------------------");
            }
            if (oldVersion != null && !oldVersion.contains("2021.05") && !oldVersion.contains("2021.11")) {
                Logger.error((Object)"-----------------\u6536\u4ed8\u5904\u7406\u4f1a\u8ba1\u5e73\u53f0\u5229\u6da6\u4e2d\u5fc3\u76f8\u5173\u5b57\u6bb5\u5f00\u59cb----------------------");
                this.updateFipTable();
                Logger.error((Object)"-----------------\u6536\u4ed8\u5904\u7406\u4f1a\u8ba1\u5e73\u53f0\u5229\u6da6\u4e2d\u5fc3\u76f8\u5173\u5b57\u6bb5\u7ed3\u675f----------------------");
                this.updateBilltypeRMCF();
            }
            if (oldVersion != null && !oldVersion.contains("2021.05") && !oldVersion.contains("2021.11")) {
                Logger.error((Object)"-----------------\u6536\u4ed8\u5904\u7406\u574f\u8d26\u5229\u6da6\u4e2d\u5fc3\u76f8\u5173\u5b57\u6bb5\u5f00\u59cb----------------------");
                this.updateProficenter();
                Logger.error((Object)"-----------------\u6536\u4ed8\u5904\u7406\u574f\u8d26\u5229\u6da6\u4e2d\u5fc3\u76f8\u5173\u5b57\u6bb5\u7ed3\u675f----------------------");
            }
            if (oldVersion != null && (oldVersion.startsWith("6.5") || oldVersion.startsWith("2021.05"))) {
                this.updatePaybillSrc();
            }
            if (oldVersion != null && (oldVersion.startsWith("6.5") || !oldVersion.contains("2021.11"))) {
                this.updateFacard();
            }
            Logger.error((Object)("\u8001\u7248\u672c\u53f7\uff1a " + oldVersion + "\u65b0\u7248\u672c\u53f7\uff1a " + newVersion));
            Logger.error((Object)"-----------------\u6536\u4ed8\u5347\u7ea7\u540e\u811a\u672c\u5904\u7406\u7ed3\u675f----------------------");
        }
        catch (Exception e) {
            Logger.error((Object)("-----------------\u5347\u7ea7\u5904\u7406\u5f02\u5e38----------------------" + e.getMessage()));
        }
        finally {
            long time2 = System.currentTimeMillis();
            Logger.error((Object)("-----------------\u6536\u4ed8\u5347\u7ea7\u540e\u811a\u672c\u5904\u7406\u7ed3\u675f---------------------\u8017\u65f6\uff1a" + (time2 - time1) + "ms"));
        }
    }

    private void updatePaybillSrc() throws Exception {
        String sql1 = "select pay.pk_payitem,cmp.pk_srcbill as src_billid,cmp.pk_srcbillrowid as src_itemid,cmp.srcbilltypecode as src_billtype  from (select top_itemid,pk_payitem,src_billtype,src_billid,src_itemid from ap_payitem  where top_billtype='36D1' and dr=0 and (src_billtype in ('FCT1','~') or src_billtype is null)) pay  inner join (select pk_apply_b,pk_srcbill,pk_srcbillrowid,srcbilltypecode from cmp_apply_b where srcbilltypecode in ('21','Z2') and dr=0)cmp  on  pay.top_itemid=cmp.pk_apply_b";
        String sql2 = " select p.pk_payitem,t.src_billid,t.src_itemid,t.src_billtype  from(select term.pk_termitem,item.src_billtype,item.src_billid,item.src_itemid from ap_payableitem item inner join arap_termitem term  on item.pk_payableitem=term.pk_item where item.src_billtype='21' and item.dr=0 ) t  inner join ap_payitem p on t.pk_termitem=p.top_termch where p.src_billtype<>'21' and p.dr=0";
        String tableName = "temp_arap_upmultipay";
        String[] colNames = new String[]{"pk_payitem", "src_billid", "src_itemid", "src_billtype"};
        Integer[] colTypes = new Integer[]{12, 12, 12, 12};
        String tablename = TmpTableCreator.createTmpTable((String)tableName, (String[])colNames, (Integer[])colTypes);
        String insertSql = "insert into " + tablename + " " + sql1 + " union " + sql2;
        new BaseDAO().executeUpdate(insertSql);
        String updateSql = " update ap_payitem pay set (src_billid,src_itemid,src_billtype)=(select t.src_billid,t.src_itemid,t.src_billtype from " + tablename + " t where t.pk_payitem=pay.pk_payitem) where pay.pk_payitem in (select pk_payitem from " + tablename + ")";
        new BaseDAO().executeUpdate(updateSql);
    }

    private void updateBilltypeRMCF() throws Exception {
        String billsql = "update bd_billtype set forwardbilltype='F2,F3,F1,SSCIVA,F0,RMCF' where parentbilltype='F0'";
        new BaseDAO().executeUpdate(billsql);
    }

    private void updateSscrpFieldMap() throws Exception {
        try {
            String billsql = "UPDATE sscrp_fieldmap_b  SET isdef = 'Y' WHERE destcode = 'orgamount' AND ruledata = 'local_money';";
            new BaseDAO().executeUpdate(billsql);
        }
        catch (Exception e) {
            Logger.error((Object)(e.getMessage() + "\u5347\u7ea7\u62a5\u8d26\u5e73\u53f0\u5355\u636e\u6620\u5c04\u89c4\u5219\u5931\u8d25"));
        }
    }

    private void updateArapCheckNOLength() throws DAOException {
        int dbType = new BaseDAO().getDBType();
        String apsql = " ";
        String arsql = " ";
        switch (dbType) {
            case 1: {
                apsql = "alter table ap_payitem modify checkno  varchar2(36)";
                arsql = "alter table ar_gatheritem modify checkno  varchar2(36)";
                break;
            }
            case 2: {
                apsql = "alter table ap_payitem alter column checkno nvarchar(36)";
                arsql = "alter table ar_gatheritem alter column checkno  nvarchar(36)";
                break;
            }
            case 0: {
                apsql = "alter table ap_payitem alter column checkno set data type varchar(36)";
                arsql = "alter table ar_gatheritem alter column checkno set data type varchar(36)";
            }
        }
        if (StringUtil.isEmpty((String)apsql) && StringUtil.isEmpty((String)arsql)) {
            new BaseDAO().executeUpdate(apsql);
            new BaseDAO().executeUpdate(arsql);
        }
    }

    private void updateProficenter() throws Exception {
        CMTProxy proxySrv = (CMTProxy)NCLocator.getInstance().lookup(CMTProxy.class);
        this.update(proxySrv, " update pub_form_property set metadataproperty = 'riaorg.profitcenter.name' where metadataproperty like 'riaorg.profitcenter.%' and areaid in (select pk_area from pub_area where templetid in (select pk_page_templet from pub_page_templet where appcode in ('20060BDL', '20060BDR'))) ");
        this.update(proxySrv, " update pub_form_property set metadataproperty = 'riaorg.profitcenterVersion.name' where metadataproperty like 'riaorg.profitcenterVersion.%' and areaid in (select pk_area from pub_area where templetid in (select pk_page_templet from pub_page_templet where appcode in ('20060BDL', '20060BDR'))) ");
    }

    private void updateFacard() throws Exception {
        CMTProxy proxySrv = (CMTProxy)NCLocator.getInstance().lookup(CMTProxy.class);
        this.update(proxySrv, " update pub_form_property set  metaid = null,metadataproperty = null,refcode=null where code  in ('facard') and areaid in (select pk_area from pub_area  where templetid in (select pk_page_templet from pub_page_templet where code like '2008%'));");
        this.update(proxySrv, " update pub_form_property set  metaid = null,metadataproperty = null,refcode=null where code  in ('facard') and areaid in (select pk_area from pub_area  where templetid in (select pk_page_templet from pub_page_templet where code like '2006%'));");
    }

    private void updateFipTable() throws Exception {
        CMTProxy proxySrv = (CMTProxy)NCLocator.getInstance().lookup(CMTProxy.class);
        this.update(proxySrv, " update fip_billitem set doctype = '310e1300-0681-4062-9ca7-6276d9833901' where attrcode in ('pk_pcorg','zb.pk_pcorg','fb.pk_pcorg') and pk_billtype in ('DE','23E0','F3','F1','DF','23E1','F0','F2') ");
        this.update(proxySrv, " update fip_factor set entityid = '310e1300-0681-4062-9ca7-6276d9833901' where  pk_factor in(select pk_factor from fip_factor where entityid='5461ada1-ef2a-419a-af14-656cf0641d34' and pk_systypecode in ('AR','AP')) ");
    }

    private void deleteFipTable() throws Exception {
        BaseDAO dao = this.getDao();
        dao.executeUpdate(" delete from fip_billfactor  where  pk_factor in(select pk_factor from fip_factor where entityid='310e1300-0681-4062-9ca7-6276d9833901' and pk_systypecode in ('AR','AP')) and pk_group<>'GLOBLE00000000000000' and entity_attr ='#pk_pcorg' ");
        dao.executeUpdate(" delete from fip_factor  where  pk_factor in(select pk_factor from fip_factor where entityid='310e1300-0681-4062-9ca7-6276d9833901' and pk_systypecode in ('AR','AP')) and pk_group<>'GLOBLE00000000000000'");
    }

    private void updateTemplet() throws BusinessException {
        String sql = "select page.appcode,page.PAGECODE,area.code,formproperty.PK_FORM_PROPERTY,formproperty.AREAID,formproperty.CODE,formproperty.POSITION,formproperty.METADATAPROPERTY,formproperty.REQUIRED,formproperty.VISIBLE  from pub_form_property formproperty inner join pub_area area on formproperty.AREAID = area.PK_AREA  inner join pub_page_templet page on area.templetid = page.pk_page_templet  where page.appcode in (select CODE from sm_appregister where SOURCE_APP_CODE in ('20060RBM')) and page.pk_group is not null and formproperty.code in ('pk_org','pk_org_v') and area.code in ('head','transfermain','20060RBM_list','list') ";
        this.updateTemplet(sql);
        sql = "select page.appcode,page.PAGECODE,area.code,formproperty.PK_FORM_PROPERTY,formproperty.AREAID,formproperty.CODE,formproperty.POSITION,formproperty.METADATAPROPERTY,formproperty.REQUIRED,formproperty.VISIBLE  from pub_form_property formproperty inner join pub_area area on formproperty.AREAID = area.PK_AREA  inner join pub_page_templet page on area.templetid = page.pk_page_templet  where page.appcode in (select CODE from sm_appregister where SOURCE_APP_CODE in ('20060GBM')) and page.pk_group is not null and formproperty.code in ('pk_org','pk_org_v') and area.code in ('head','transfermain','20060GBM_head','list') ";
        this.updateTemplet(sql);
        sql = "select page.appcode,page.PAGECODE,area.code,formproperty.PK_FORM_PROPERTY,formproperty.AREAID,formproperty.CODE,formproperty.POSITION,formproperty.METADATAPROPERTY,formproperty.REQUIRED,formproperty.VISIBLE  from pub_form_property formproperty inner join pub_area area on formproperty.AREAID = area.PK_AREA  inner join pub_page_templet page on area.templetid = page.pk_page_templet  where page.appcode in (select CODE from sm_appregister where SOURCE_APP_CODE in ('20080PBM')) and page.pk_group is not null and formproperty.code in ('pk_org','pk_org_v') and area.code in ('head','transfermain','20080PBM_head','list') ";
        this.updateTemplet(sql);
        sql = "select page.appcode,page.PAGECODE,area.code,formproperty.PK_FORM_PROPERTY,formproperty.AREAID,formproperty.CODE,formproperty.POSITION,formproperty.METADATAPROPERTY,formproperty.REQUIRED,formproperty.VISIBLE  from pub_form_property formproperty inner join pub_area area on formproperty.AREAID = area.PK_AREA  inner join pub_page_templet page on area.templetid = page.pk_page_templet  where page.appcode in (select CODE from sm_appregister where SOURCE_APP_CODE in ('20080EBM')) and page.pk_group is not null and formproperty.code in ('pk_org','pk_org_v') and area.code in ('head','transfermain','20080EBM_head','list') ";
        this.updateTemplet(sql);
    }

    private void updateTemplet(String sql) throws BusinessException {
        List result = (List)this.getDao().executeQuery(sql, (ResultSetProcessor)new ArrayListProcessor());
        if (result == null || result.size() == 0) {
            return;
        }
        HashMap<String, Object[][]> areaid2object = new HashMap<String, Object[][]>();
        for (Object[] r : result) {
            String areaid = (String)r[4];
            if (!areaid2object.containsKey(areaid)) {
                areaid2object.put(areaid, new Object[2][]);
            }
            Object[][] obj = (Object[][])areaid2object.get(areaid);
            String orgcode = (String)r[5];
            if ("pk_org".equals(orgcode)) {
                obj[1] = r;
                continue;
            }
            obj[0] = r;
        }
        ArrayList<SQLParameter> paramList = new ArrayList<SQLParameter>();
        String update = "update pub_form_property set POSITION=?,REQUIRED=?,VISIBLE=? where PK_FORM_PROPERTY = ?";
        for (Map.Entry entry : areaid2object.entrySet()) {
            Object[][] obj = (Object[][])entry.getValue();
            String areacode = (String)obj[0][2];
            boolean position = Integer.valueOf(obj[0][6].toString()) < Integer.valueOf(obj[1][6].toString());
            SQLParameter param = new SQLParameter();
            if (position) {
                param.addParam(obj[0][6].toString());
            } else {
                param.addParam(obj[1][6].toString());
            }
            if ("head".equals(areacode)) {
                param.addParam("Y");
            } else {
                param.addParam("N");
            }
            param.addParam("Y");
            param.addParam((String)obj[0][3]);
            paramList.add(param);
            SQLParameter param2 = new SQLParameter();
            if (position) {
                param2.addParam(obj[1][6].toString());
            } else {
                param2.addParam(obj[0][6].toString());
            }
            param2.addParam("N");
            param2.addParam("N");
            param2.addParam((String)obj[1][3]);
            paramList.add(param2);
        }
        ArapInitDAtaBO.execBatchSql(update, paramList);
    }

    private void updateCheckItemVO() throws BusinessException {
        this.getDao().deleteByClause(CheckItemVO.class, " CODE='AR1003' and PK_CHECKITEM not in (select id from bd_predataidmap) ");
        LinkedHashMap beanID_predateFilePathList_map = new LinkedHashMap();
        ArrayList<String> list = new ArrayList<String>();
        list.add("predata/ar/checktype_arap.csv");
        list.add("predata/ap/checktype_arap.csv");
        beanID_predateFilePathList_map.put("b135cc21-d8cf-4682-8792-682cf4b82482", list);
        ArrayList<String> list2 = new ArrayList<String>();
        list2.add("predata/ar/checkitem_arap.csv");
        list2.add("predata/ap/checkitem_arap.csv");
        beanID_predateFilePathList_map.put("78c94013-ac59-4993-8905-9a967d1cd9bf", list2);
        String[] validModuleCodeList = new String[]{"ar", "ap"};
        String userID = InvocationInfoProxy.getInstance().getUserId();
        List groupList = (List)this.getDao().executeQuery("select distinct pk_group from org_group", (ResultSetProcessor)new ColumnListProcessor());
        if (groupList != null && groupList.size() > 0) {
            IPredataImportService service = (IPredataImportService)NCLocator.getInstance().lookup(IPredataImportService.class);
            for (String pk_group : groupList) {
                service.savePredataForInstallUpdate(beanID_predateFilePathList_map, pk_group, pk_group, userID, validModuleCodeList);
            }
        }
    }

    private void updateButtonResid() throws Exception {
        CMTProxy proxySrv = (CMTProxy)NCLocator.getInstance().lookup(CMTProxy.class);
        String sql1 = "update sm_appbutnregister set sm_appbutnregister.resid =(select  CONCAT(s.code,CONCAT('_',b.btncode)) from sm_appregister a,sm_appregister s,sm_appbutnregister b where a.source_app_code = s.code and a.pk_appregister=b.appid and b.pk_btn=sm_appbutnregister.pk_btn )where sm_appbutnregister.appid in (select pk_appregister from sm_appregister where (code like '2006%'or code like '2008%') or (source_app_code like '2006%'or source_app_code like '2008%')) and (sm_appbutnregister.resid not like '200%') and sm_appbutnregister.btncode not in ('Confirm','CancelConfirm','InitBuild','CancelInitBuild','InitBuild_g1','initbuild') and (sm_appbutnregister.resid not like 'ReportPage%') ";
        String sql2 = "update sm_appbutnregister set resid ='20060RBC_Confirm' where btncode ='Confirm' and appid in (select pk_appregister from sm_appregister where code like '2006%'or code like '2008%' ) and (resid not like '200%')";
        String sql3 = "update sm_appbutnregister set resid ='20060RBC_CancelConfirm' where btncode ='CancelConfirm' and appid in (select pk_appregister from sm_appregister where code like '2006%'or code like '2008%' )and (resid not like '200%')";
        String sql4 = "update sm_appbutnregister set resid ='20060ARO_InitBuild' where btncode ='InitBuild' and appid in (select pk_appregister from sm_appregister where code like '2006%'or code like '2008%' )and (resid not like '200%')";
        String sql5 = "update sm_appbutnregister set resid ='20060ARO_CancelInitBuild' where btncode ='CancelInitBuild' and appid in (select pk_appregister from sm_appregister where code like '2006%'or code like '2008%' )and (resid not like '200%')";
        String sql6 = "update sm_appbutnregister set resid ='20060ARO_InitBuild_g1' where btncode ='InitBuild_g1' and appid in (select pk_appregister from sm_appregister where code like '2006%'or code like '2008%' )and (resid not like '200%')";
        String sql7 = "update sm_appbutnregister set resid ='20060RO_initbuild' where btncode ='initbuild' and appid in (select pk_appregister from sm_appregister where code like '2006%'or code like '2008%' )and (resid not like '200%')";
        this.update(proxySrv, sql1);
        this.update(proxySrv, sql2);
        this.update(proxySrv, sql3);
        this.update(proxySrv, sql4);
        this.update(proxySrv, sql5);
        this.update(proxySrv, sql6);
        this.update(proxySrv, sql7);
        String sql8 = "update sm_appbutnregister set pageareacode ='card_body' where appid in (select pk_appregister from sm_appregister where code like '2006%' or code like '2008%') and btncode ='AddLine' and btnarea ='card_body' and pageareacode is null;";
        this.update(proxySrv, sql8);
    }

    private void deleteReportMenu() throws Exception {
        CMTProxy proxySrv = (CMTProxy)NCLocator.getInstance().lookup(CMTProxy.class);
        this.update(proxySrv, "delete from sm_menuitemreg\twhere menuitemcode in('20062005','2006200501','20082005','2008200501')");
    }

    private void deleteSSCCTListener() throws Exception {
        Integer sscctnum;
        String sscversion = (String)this.dao.executeQuery(" select version from sm_product_version where PRODUCTCODE  in (select MODULEID from dap_dapsystem where SYSTYPECODE ='sscct') ", (ResultSetProcessor)new ColumnProcessor());
        if (null != sscversion && !sscversion.equals("") && (sscctnum = (Integer)this.dao.executeQuery(" select count(pk_paycontract) from sscct_paycontract  ", (ResultSetProcessor)new ColumnProcessor())) > 0) {
            CMTProxy proxySrv = (CMTProxy)NCLocator.getInstance().lookup(CMTProxy.class);
            String sql = " delete from pub_eventlistener where owner = '7100' ";
            this.update(proxySrv, sql);
        }
    }

    private void dealBaddebtBill(String oldVersion) throws Exception {
        this.updateBaddebtFipTemplet();
        if (ARAPModuleEnableUtil.isSscrpEnabled((String)InvocationInfoProxy.getInstance().getGroupId())) {
            String[] billtypes;
            for (String billtype : billtypes = new String[]{"BDP", "BDPI", "BDL", "BDR"}) {
                SSCRPUpdateUtil.initRPData((String)billtype);
            }
        }
        Logger.error((Object)"-----------------\u6536\u4ed8\u5355\u636e\u65b0\u589e\u62a5\u8d26\u5e73\u53f0\u5355\u636e\u6620\u5c04\u5f00\u59cb----------------------");
        SSCRPUpdateUtil.updateMapFiled((String)"F0", (String[])new String[]{"supplier"});
        SSCRPUpdateUtil.updateMapFiled((String)"F1", (String[])new String[]{"customer"});
        SSCRPUpdateUtil.updateMapFiled((String)"F2", (String[])new String[]{"supplier"});
        SSCRPUpdateUtil.updateMapFiled((String)"F3", (String[])new String[]{"customer"});
        Logger.error((Object)"-----------------\u6536\u4ed8\u5355\u636e\u65b0\u589e\u62a5\u8d26\u5e73\u53f0\u5355\u636e\u6620\u5c04\u7ed3\u675f----------------------");
        Logger.error((Object)"-----------------\u5220\u9664\u574f\u8d26\u83dc\u5355\u811a\u672c\u5904\u7406\u5f00\u59cb----------------------");
        CMTProxy proxySrv = (CMTProxy)NCLocator.getInstance().lookup(CMTProxy.class);
        this.update(proxySrv, "delete from sm_menuitemreg\twhere menuitemcode in('200609','20060901','20060902','20060903','20060904','20060905','20060906');");
        Logger.error((Object)"-----------------\u5220\u9664\u574f\u8d26\u83dc\u5355\u811a\u672c\u5904\u7406\u7ed3\u675f----------------------");
        if (oldVersion != null && oldVersion.contains("6.5")) {
            Logger.error((Object)"-----------------\u5220\u966465\u574f\u8d26\u5355\u636e\u7c7b\u578b\u811a\u672c\u5904\u7406\u5f00\u59cb----------------------");
            this.update(proxySrv, " delete from bd_billtype where  pk_billtypecode in ('DL','DK','DSTL') and systemcode='AR' ;");
            this.update(proxySrv, " delete from fip_billregister where modulecode ='arap' and pk_billtype in ('DL','DK','DSTL');");
            Logger.error((Object)"-----------------\u5220\u966465\u574f\u8d26\u5355\u636e\u7c7b\u578b\u811a\u672c\u5904\u7406\u7ed3\u675f----------------------");
        }
    }

    private void updateBaddebtFipTemplet() throws BusinessException {
        String groupSql = "select pk_group from org_group";
        List groupPks = (List)this.getDao().executeQuery(groupSql, (ResultSetProcessor)new ColumnListProcessor());
        if (groupPks != null && groupPks.size() > 0) {
            ((IFipInitDataService)NCLocator.getInstance().lookup(IFipInitDataService.class)).initData("AR");
        }
    }

    private void updateVOChange2() throws BusinessException {
        this.updateVOChangeAttr("F0", "F1", new String[]{"bodys.objtype", "bodys.supplier", "objtype", "bodys.recaccount", "bodys.payaccount", "bodys.customer", "isrefund", "bodys.top_changets", "bodys.top_changeitemts"});
        this.updateVOChangeAttr("F1", "F3", new String[]{"bodys.pk_tradetype", "bodys.customer", "isrefund", "customer", "pk_paybill", "bodys.top_changets", "bodys.top_changeitemts"});
        this.updateVOChangeAttr("36D1", "F3", new String[]{"bodys.objtype", "bodys.customer", "isrefund", "customer", "bodys.recaccount", "bodys.payaccount", "bodys.top_changets", "bodys.top_changeitemts"});
        this.updateVOChangeAttr("F3", "F2", new String[]{"bodys.customer", "customer", "bodys.objtype", "objtype", "bodys.recaccount", "bodys.payaccount", "isrefund", "bodys.top_changets", "bodys.top_changeitemts"});
        this.updateVOChangeAttr("F2", "F1", new String[]{"bodys.taxcodeid", "bodys.top_changets", "bodys.top_changeitemts"});
        this.updateVOChangeAttr("F0", "F1", new String[]{"bodys.settlecurr", "bodys.settlemoney", "bodys.supplier", "supplier", "bodys.src_billid", "bodys.src_itemid", "bodys.recaccount", "bodys.payaccount", "bodys.money_bal", "bodys.money_cr", "bodys.customer", "customer", "bodys.taxcodeid", "bodys.top_changets", "bodys.top_changeitemts"});
        this.updateVOChangeAttr("F0", "F2", new String[]{"bodys.supplier", "supplier", "bodys.taxcodeid", "bodys.top_changets", "bodys.top_changeitemts"});
        this.updateVOChangeAttr("F0", "F3", new String[]{"bodys.payaccount", "bodys.recaccount", "bodys.top_changets", "bodys.top_changeitemts"});
        this.updateVOChangeAttr("F1", "F0", new String[]{"bodys.settlecurr", "bodys.settlemoney", "bodys.supplier", "supplier", "bodys.objtype", "objtype", "bodys.src_billid", "bodys.src_itemid", "bodys.recaccount", "bodys.payaccount", "bodys.money_bal", "bodys.money_de", "bodys.customer", "customer", "bodys.taxcodeid", "bodys.top_changets", "bodys.top_changeitemts"});
        this.updateVOChangeAttr("F1", "F3", new String[]{"bodys.pk_payitem", "bodys.src_billid", "bodys.src_billtype", "bodys.src_itemid", "bodys.src_tradetype", "bodys.taxcodeid", "bodys.top_changets", "bodys.top_changeitemts"});
        this.updateVOChangeAttr("F2", "F0", new String[]{"bodys.supplier", "supplier", "src_syscode", "bodys.pk_payitem", "bodys.src_billid", "bodys.taxcodeid", "billmaker", "bodys.top_changets", "bodys.top_changeitemts"});
        this.updateVOChangeAttr("F2", "F3", new String[]{"bodys.supplier", "supplier", "src_syscode", "bodys.settlecurr", "bodys.objtype", "objtype", "bodys.settlemoney", "bodys.src_billid", "bodys.src_billtype", "bodys.src_itemid", "bodys.src_tradetype", "bodys.money_bal", "bodys.money_de", "bodys.payaccount", "bodys.recaccount", "bodys.taxcodeid", "bodys.top_changets", "bodys.top_changeitemts"});
        this.updateVOChangeAttr("F3", "F1", new String[]{"bodys.customer", "customer", "bodys.src_billid", "bodys.src_billtype", "bodys.src_itemid", "bodys.src_tradetype", "bodys.pk_payterm", "bodys.taxcodeid", "bodys.top_changets", "bodys.top_changeitemts"});
        this.updateVOChangeAttr("F3", "F2", new String[]{"bodys.supplier", "supplier", "src_syscode", "bodys.settlecurr", "bodys.customer", "customer", "bodys.settlemoney", "bodys.src_billid", "bodys.src_billtype", "bodys.src_itemid", "bodys.src_tradetype", "bodys.money_bal", "bodys.money_cr", "bodys.payaccount", "bodys.recaccount", "bodys.direction", "bodys.taxcodeid", "bodys.top_changets", "bodys.top_changeitemts"});
        this.updateVOChangeAttr("36D1", "F3", new String[]{"bodys.objtype", "objtype", "bodys.supplier", "bodys.top_changets", "bodys.top_changeitemts"});
        this.updateVOChangeAttr("36J3", "F2", new String[]{"bodys.top_changets", "bodys.top_changeitemts"});
        this.updateVOChangeAttr("30", "F2", new String[]{"bodys.taxcodeid", "bodys.taxrate", "bodys.top_changets", "bodys.top_changeitemts"});
        this.updateVOChangeAttr("Z3", "F2", new String[]{"bodys.taxcodeid", "bodys.taxrate", "bodys.top_changets", "bodys.top_changeitemts"});
        this.updateVOChangeAttr("Z2", "F3", new String[]{"bodys.top_changets", "bodys.top_changeitemts"});
        this.updateVOChangeAttr("21", "F3", new String[]{"bodys.top_changets", "bodys.top_changeitemts"});
        this.updateVOChangeAttr("4A3H", "F1", new String[]{"bodys.direction", "bodys.top_changets", "bodys.top_changeitemts"});
        this.updateVOChangeAttr("4A87", "F1", new String[]{"bodys.contractno", "bodys.direction", "bodys.top_changets", "bodys.top_changeitemts"});
        this.updateVOChangeAttr("4A3F", "F1", new String[]{"bodys.top_changets", "bodys.top_changeitemts"});
        this.updateVOChangeAttr("4A18", "F1", new String[]{"bodys.top_changets", "bodys.top_changeitemts"});
        this.updateVOChangeAttr("4A24", "F1", new String[]{"bodys.top_changets", "bodys.top_changeitemts"});
        this.updateVOChangeAttr("4A23", "F1", new String[]{"bodys.top_changets", "bodys.top_changeitemts"});
        this.updateVOChangeAttr("4A3A", "F1", new String[]{"bodys.top_changets", "bodys.top_changeitemts"});
        this.updateVOChangeAttr("4A3D", "F1", new String[]{"bodys.top_changets", "bodys.top_changeitemts"});
        this.updateVOChangeAttr("4A77", "F0", new String[]{"bodys.contractno", "bodys.direction", "bodys.top_changets", "bodys.top_changeitemts"});
        this.updateVOChangeAttr("4A49", "F0", new String[]{"bodys.status", "bodys.top_changets", "bodys.top_changeitemts"});
        this.updateVOChangeAttr("4A2F", "F0", new String[]{"bodys.top_changets", "bodys.top_changeitemts"});
        this.updateVOChangeAttr("4A18", "F0", new String[]{"bodys.top_changets", "bodys.top_changeitemts"});
        this.updateVOChangeAttr("4BL3", "F0", new String[]{"bodys.top_changets", "bodys.top_changeitemts", "pk_currtype", "bodys.pk_currtype"});
        this.updateVOChangeAttr("4BL9", "F0", new String[]{"bodys.top_changets", "bodys.top_changeitemts"});
        this.updateVOChangeAttr("4BL0", "F0", new String[]{"bodys.top_changets", "bodys.top_changeitemts"});
        this.updateVOChangeAttr("4B36", "F0", new String[]{"pk_pcorg", "pk_pcorg_v"});
        this.updateVOChangeAttr("4B36", "F1", new String[]{"pk_pcorg", "pk_pcorg_v"});
        this.updateVOChangeAttr("FCT1", "F3", new String[]{"bodys.money_de", "bodys.local_money_de", "bodys.top_billid", "bodys.src_billid", "bodys.top_itemid", "bodys.src_itemid"});
        this.updateVOChangeAttr("FCT1", "F1", new String[]{"bodys.money_cr", "bodys.local_money_cr", "bodys.top_billid", "bodys.src_billid", "bodys.top_itemid", "bodys.src_itemid"});
        this.updateVOChangeAttr("FCT2", "F0", new String[]{"bodys.money_de", "bodys.local_money_de", "bodys.top_billid", "bodys.src_billid", "bodys.top_itemid", "bodys.src_itemid"});
        this.updateVOChangeAttr("FCT2", "F2", new String[]{"bodys.money_cr", "bodys.local_money_cr", "bodys.top_billid", "bodys.src_billid", "bodys.top_itemid", "bodys.src_itemid"});
        this.updateVOChangeAttr("25", "F1", new String[]{"pk_busitype"});
        this.updateVOChangeAttr("4A49", "F0", new String[]{"customer"});
        this.updateVOChangeAttr("4353", "F0", new String[]{"bodys.outstoreno"});
        this.updateVOChangeAttr2("F1", "F3", new String[]{"isrefund"});
    }

    private void updateVOChangeAttr2(String srcbilltype, String desbilltype, String[] updateAttrs) throws BusinessException {
        if (updateAttrs == null) {
            return;
        }
        Collection splititemvOs = this.getDao().retrieveByClause(SplitItemVO.class, "DEST_BILLTYPE='" + desbilltype + "' and billtype='" + srcbilltype + "'  and " + SqlUtils.getInStr((String)"item", (String[])updateAttrs, (boolean)true));
        if (splititemvOs == null || splititemvOs.size() == 0) {
            return;
        }
        Collection exchangevos = this.getDao().retrieveByClause(ExchangeVO.class, "DEST_BILLTYPE='" + desbilltype + "' and SRC_BILLTYPE='" + srcbilltype + "'  and pk_group<>'global00000000000000'");
        if (exchangevos == null || exchangevos.size() == 0) {
            return;
        }
        ArrayList<String> pk_vosplititems = new ArrayList<String>();
        for (Object itemvo : splititemvOs) {
            pk_vosplititems.add(itemvo.getPk_vosplititem());
        }
        ArrayList<String> pk_vochanges = new ArrayList<String>();
        for (ExchangeVO vo : exchangevos) {
            pk_vochanges.add(vo.getPk_vochange());
        }
        if (exchangevos != null && exchangevos.size() > 0) {
            ArrayList<ExchangeSplitVO> newList = new ArrayList<ExchangeSplitVO>();
            ArrayList delList = new ArrayList();
            Collection exchangesplitvos = this.getDao().retrieveByClause(ExchangeSplitVO.class, SqlUtils.getInStr((String)"pk_vochange", (String[])pk_vochanges.toArray(new String[0]), (boolean)true) + " and " + SqlUtils.getInStr((String)"pk_vosplititem", (String[])pk_vosplititems.toArray(new String[0]), (boolean)true));
            delList.addAll(exchangesplitvos);
            if (exchangesplitvos.size() > 0) {
                this.getDao().deleteVOList(delList);
            }
            for (String pk_vochange : pk_vochanges) {
                for (String pk_vosplititem : pk_vosplititems) {
                    ExchangeSplitVO splitvo = new ExchangeSplitVO();
                    splitvo.setPk_vochange(pk_vochange);
                    splitvo.setPk_vosplititem(pk_vosplititem);
                    splitvo.setPrimaryKey(null);
                    newList.add(splitvo);
                }
            }
            if (newList != null && newList.size() > 0) {
                this.getDao().insertVOList(newList);
            }
        }
    }

    private void updateVOChangeAttr(String srcbilltype, String desbilltype, String[] updateAttrs) throws BusinessException {
        if (updateAttrs == null) {
            return;
        }
        Collection result = (Collection)this.getDao().executeQuery("select pk_group,pk_vochange from pub_vochange where DEST_BILLTYPE='" + desbilltype + "' and SRC_BILLTYPE='" + srcbilltype + "' ", (ResultSetProcessor)new ArrayListProcessor());
        if (result != null && result.size() > 0) {
            String globalChange = null;
            ArrayList<String> vochangeList = new ArrayList<String>();
            for (Object[] objs : result) {
                vochangeList.add((String)objs[1]);
                if (!"global00000000000000".equals(objs[0])) continue;
                globalChange = (String)objs[1];
            }
            Collection changeRuleVOs = this.getDao().retrieveByClause(ExchangeRuleVO.class, SqlUtils.getInStr((String)"pk_vochange", vochangeList, (boolean)true) + " and " + SqlUtils.getInStr((String)"DEST_ATTR", (String[])updateAttrs, (boolean)true));
            if (changeRuleVOs != null && changeRuleVOs.size() > 0) {
                ArrayList<ExchangeRuleVO> globalVOList = new ArrayList<ExchangeRuleVO>();
                ArrayList<ExchangeRuleVO> delVOList = new ArrayList<ExchangeRuleVO>();
                for (ExchangeRuleVO changeRuleVO : changeRuleVOs) {
                    if (globalChange.equals(changeRuleVO.getPk_vochange())) {
                        globalVOList.add(changeRuleVO);
                        continue;
                    }
                    delVOList.add(changeRuleVO);
                }
                if (delVOList.size() > 0) {
                    this.getDao().deleteVOList(delVOList);
                }
                if (globalVOList.size() > 0) {
                    ArrayList<ExchangeRuleVO> addVOList = new ArrayList<ExchangeRuleVO>();
                    for (ExchangeRuleVO globalVO : globalVOList) {
                        for (String vochangePK : vochangeList) {
                            if (globalChange.equals(vochangePK)) continue;
                            ExchangeRuleVO vo = (ExchangeRuleVO)globalVO.clone();
                            vo.setPrimaryKey(null);
                            vo.setPk_vochange(vochangePK);
                            addVOList.add(vo);
                        }
                    }
                    if (addVOList.size() > 0) {
                        this.getDao().insertVOList(addVOList);
                    }
                }
            }
        }
    }

    private void updateBilltype() throws DAOException {
        Collection billtypeVOs;
        List groupPKs = (List)this.getDao().executeQuery("select distinct pk_group from org_group ", (ResultSetProcessor)new ColumnListProcessor());
        if (groupPKs != null && groupPKs.size() > 0 && (billtypeVOs = this.getDao().retrieveByClause(BilltypeVO.class, " pk_billtypecode in ('F0-Refund','F1-Refund','F2-Refund','F3-Refund')")) != null && billtypeVOs.size() > 0) {
            Collection djlxVOs;
            HashMap<String, Object> globalVOMap = new HashMap<String, Object>();
            HashMap<String, Object> groupVOMap = new HashMap<String, Object>();
            for (Object billtypeVO : billtypeVOs) {
                if ("global00000000000000".equals(billtypeVO.getPk_group())) {
                    globalVOMap.put(billtypeVO.getPk_billtypecode(), billtypeVO);
                    continue;
                }
                groupVOMap.put(billtypeVO.getPk_billtypecode() + billtypeVO.getPk_group(), billtypeVO);
            }
            ArrayList<BilltypeVO> list = new ArrayList<BilltypeVO>();
            for (String groupPK : groupPKs) {
                BilltypeVO vo;
                String F0Refund = "F0-Refund" + groupPK;
                String F1Refund = "F1-Refund" + groupPK;
                String F2Refund = "F2-Refund" + groupPK;
                String F3Refund = "F3-Refund" + groupPK;
                if (!groupVOMap.containsKey(F0Refund)) {
                    vo = (BilltypeVO)((BilltypeVO)globalVOMap.get("F0-Refund")).clone();
                    vo.setPk_group(groupPK);
                    vo.setPrimaryKey(null);
                    list.add(vo);
                }
                if (!groupVOMap.containsKey(F1Refund)) {
                    vo = (BilltypeVO)((BilltypeVO)globalVOMap.get("F1-Refund")).clone();
                    vo.setPk_group(groupPK);
                    vo.setPrimaryKey(null);
                    list.add(vo);
                }
                if (!groupVOMap.containsKey(F2Refund)) {
                    vo = (BilltypeVO)((BilltypeVO)globalVOMap.get("F2-Refund")).clone();
                    vo.setPk_group(groupPK);
                    vo.setPrimaryKey(null);
                    list.add(vo);
                }
                if (groupVOMap.containsKey(F3Refund)) continue;
                vo = (BilltypeVO)((BilltypeVO)globalVOMap.get("F3-Refund")).clone();
                vo.setPk_group(groupPK);
                vo.setPrimaryKey(null);
                list.add(vo);
            }
            if (list.size() > 0) {
                this.getDao().insertVOList(list);
            }
            if ((billtypeVOs = this.getDao().retrieveByClause(BilltypeVO.class, " pk_billtypecode in ('F0-Refund','F1-Refund','F2-Refund','F3-Refund') and pk_group<>'global00000000000000' ")) != null && billtypeVOs.size() > 0 && (djlxVOs = this.getDao().retrieveByClause(DjLXVO.class, " DJLXBM in ('F0-Refund','F1-Refund','F2-Refund','F3-Refund') ")) != null && djlxVOs.size() > 0) {
                HashMap<String, DjLXVO> globalDjLXVOMap = new HashMap<String, DjLXVO>();
                HashMap<String, DjLXVO> groupDjLXVOMap = new HashMap<String, DjLXVO>();
                for (DjLXVO djLXVO : djlxVOs) {
                    if ("GLOBLE00000000000000".equals(djLXVO.getPk_group())) {
                        globalDjLXVOMap.put(djLXVO.getDjlxbm(), djLXVO);
                        continue;
                    }
                    groupDjLXVOMap.put(djLXVO.getDjlxbm() + djLXVO.getPk_group(), djLXVO);
                }
                ArrayList<DjLXVO> voList = new ArrayList<DjLXVO>();
                for (BilltypeVO billtypeVO : billtypeVOs) {
                    String key = billtypeVO.getPk_billtypecode() + billtypeVO.getPk_group();
                    if (groupDjLXVOMap.containsKey(key)) continue;
                    DjLXVO vo = (DjLXVO)((DjLXVO)globalDjLXVOMap.get(billtypeVO.getPk_billtypecode())).clone();
                    vo.setPk_group(billtypeVO.getPk_group());
                    vo.setPk_billtype(billtypeVO.getPk_billtypeid());
                    vo.setPrimaryKey(null);
                    voList.add(vo);
                }
                if (voList.size() > 0) {
                    this.getDao().insertVOList(voList);
                }
            }
        }
    }

    private void updateBillAction() throws DAOException {
        List list = (List)this.getDao().executeQuery("select parentbilltype,pk_billtypecode,pk_billtypeid from bd_billtype where systemcode in ('AR','AP') and parentbilltype in ('F3','F2','F1','F0') and PK_GROUP<>'global00000000000000'", (ResultSetProcessor)new ArrayListProcessor());
        if (list != null && list.size() > 0) {
            Collection actionVOs;
            List actionList = (List)this.getDao().executeQuery("select distinct PK_BILLTYPE,PK_BILLTYPEID from pub_billaction where PK_BILLTYPEID in (select PK_BILLTYPEID from BD_BILLTYPE where systemcode in ('AR','AP') and parentbilltype in ('F3','F2','F1','F0') and pk_group<>'global00000000000000')", (ResultSetProcessor)new ArrayListProcessor());
            HashSet<String> set = new HashSet<String>();
            if (actionList != null && actionList.size() > 0) {
                for (Object[] action : actionList) {
                    set.add((String)action[0] + action[1]);
                }
            }
            if ((actionVOs = this.getDao().retrieveByClause(BillactionVO.class, "PK_BILLTYPEID in (select PK_BILLTYPEID from BD_BILLTYPE where systemcode in ('AR','AP') and (pk_org ='global00000000000000' or istransaction ='N')and pk_billtypecode in ('F3','F2','F1','F0')) ")) != null) {
                HashMap billtype2BillactionVO = new HashMap();
                for (BillactionVO actionVO : actionVOs) {
                    String pk_billtype = actionVO.getPk_billtype();
                    if (!billtype2BillactionVO.containsKey(pk_billtype)) {
                        billtype2BillactionVO.put(pk_billtype, new ArrayList());
                    }
                    ((List)billtype2BillactionVO.get(pk_billtype)).add(actionVO);
                }
                ArrayList<BillactionVO> vos = new ArrayList<BillactionVO>();
                UFDateTime ts = new UFDateTime();
                for (Object[] objs : list) {
                    if (set.contains((String)objs[1] + objs[2])) continue;
                    String parentbilltype = (String)objs[0];
                    List actionVOList = (List)billtype2BillactionVO.get(parentbilltype);
                    for (BillactionVO actionVO : actionVOList) {
                        BillactionVO newActionVO = (BillactionVO)actionVO.clone();
                        newActionVO.setPk_billtype((String)objs[1]);
                        newActionVO.setPk_billtypeid((String)objs[2]);
                        newActionVO.setPrimaryKey(null);
                        newActionVO.setTs(ts);
                        vos.add(newActionVO);
                    }
                }
                if (vos.size() > 0) {
                    this.getDao().insertVOList(vos);
                }
            }
        }
    }

    private void updateVOChange() throws DAOException, BusinessException {
        List result = (List)this.getDao().executeQuery("select pk_vochange from pub_vochange where DEST_BILLTYPE in( SELECT pk_billtypecode FROM BD_BILLTYPE WHERE SYSTEMCODE in('AR','AP')) and pk_group in (select distinct pk_group from org_group) and DEST_BILLTYPE in ('F0','F1','F2','F3') and SRC_BILLTYPE in ('F0','F1','F2','F3') ", (ResultSetProcessor)new ColumnListProcessor());
        if (result != null && result.size() > 0) {
            List keyList = (List)this.getDao().executeQuery("select dest_attr||pk_vochange||ruledata from pub_vochange_b where dest_attr like '%def%' and " + SqlUtils.getInStr((String)"pk_vochange", (List)result, (boolean)true), (ResultSetProcessor)new ColumnListProcessor());
            String insertSql = "INSERT INTO pub_vochange_b (DEST_ATTR, PK_VOCHANGE, RULEDATA, PK_VOCHANGE_B, RULETYPE, DR, ts) VALUES (?, ?, ?, ?, ?, ?, ?)";
            ArrayList<SQLParameter> paramList = new ArrayList<SQLParameter>();
            IdGenerator idGenerator = DBAUtil.getIdGenerator();
            for (String pk_vochange : result) {
                for (int i = 31; i < 81; ++i) {
                    String key = "def" + i + pk_vochange + "def" + i;
                    if (keyList == null || keyList.size() > 0 || !keyList.contains(key)) {
                        SQLParameter param = new SQLParameter();
                        param.addParam("def" + i);
                        param.addParam(pk_vochange);
                        param.addParam("def" + i);
                        param.addParam(idGenerator.generate());
                        param.addParam(2);
                        param.addParam(0);
                        param.addParam(new UFDate().toString());
                        paramList.add(param);
                    }
                    String bodykey = "bodys.def" + i + pk_vochange + "bodys.def" + i;
                    if (keyList != null && keyList.size() <= 0 && keyList.contains(bodykey)) continue;
                    SQLParameter param = new SQLParameter();
                    param.addParam("bodys.def" + i);
                    param.addParam(pk_vochange);
                    param.addParam("bodys.def" + i);
                    param.addParam(idGenerator.generate());
                    param.addParam(2);
                    param.addParam(0);
                    param.addParam(new UFDate().toString());
                    paramList.add(param);
                }
            }
            ArapInitDAtaBO.execBatchSql(insertSql, paramList);
        }
    }

    private void updateVOchange4Rate() throws DAOException, BusinessException {
        String value;
        String key;
        String pubSql = " pk_vochange in (select pk_vochange from pub_vochange where DEST_BILLTYPE in (SELECT pk_billtypecode FROM BD_BILLTYPE WHERE SYSTEMCODE in ('AR', 'AP')) and ";
        String allmainSql = "  (pk_group <> '~' and pk_group = 'global00000000000000')) ";
        String sqlCondition = " (pk_group = 'global00000000000000' or pk_group = '~')) and dest_attr in ('pk_ratetype','ratedate','bodys.pk_ratedate','bodys.ratedate') and dr=0 and ruletype = 2";
        String mainSql = "  (pk_group <> '~' and pk_group <> 'global00000000000000')) ";
        List allVos = (List)this.getDao().retrieveByClause(ExchangeRuleVO.class, pubSql + sqlCondition);
        List mainallVos = (List)this.getDao().retrieveByClause(ExchangeVO.class, pubSql + mainSql);
        List allmainVos = (List)this.getDao().retrieveByClause(ExchangeVO.class, pubSql + allmainSql);
        HashMap<String, String> parmMap = new HashMap<String, String>();
        HashMap<String, String> midMap = new HashMap<String, String>();
        if (CollectionUtils.isEmpty((Collection)mainallVos) || CollectionUtils.isEmpty((Collection)allmainVos)) {
            return;
        }
        String pk_group = InvocationInfoProxy.getInstance().getGroupId();
        for (ExchangeVO vo : mainallVos) {
            if ((StringUtil.isEmptyWithTrim((String)pk_group) || !pk_group.equals(vo.getPk_group())) && !StringUtil.isEmptyWithTrim((String)pk_group)) continue;
            key = vo.getDest_billtype() + vo.getSrc_billtype();
            value = vo.getPk_vochange();
            parmMap.put(key, value);
        }
        for (ExchangeVO vo : allmainVos) {
            key = vo.getPk_vochange();
            value = vo.getDest_billtype() + vo.getSrc_billtype();
            midMap.put(key, value);
        }
        this.publicUpdateVochange(allVos, parmMap, midMap);
    }

    private void publicUpdateVochange(List<ExchangeRuleVO> vos, Map<String, String> parmMap, Map<String, String> midMap) throws DAOException, BusinessException {
        if (CollectionUtils.isEmpty(vos)) {
            return;
        }
        String insertSql = "INSERT INTO pub_vochange_b (DEST_ATTR, PK_VOCHANGE, RULEDATA, PK_VOCHANGE_B, RULETYPE, DR, ts) VALUES (?, ?, ?, ?, ?, ?, ?)";
        IdGenerator idGenerator = DBAUtil.getIdGenerator();
        ArrayList<SQLParameter> paramList = new ArrayList<SQLParameter>();
        for (ExchangeRuleVO vo : vos) {
            String pk_vochange = parmMap.get(midMap.get(vo.getPk_vochange()));
            if (StringUtil.isEmptyWithTrim((String)pk_vochange)) continue;
            SQLParameter param = new SQLParameter();
            param.addParam(vo.getDest_attr());
            param.addParam(pk_vochange);
            param.addParam(vo.getRuleData());
            param.addParam(idGenerator.generate());
            param.addParam(2);
            param.addParam(0);
            param.addParam(new UFDate().toString());
            paramList.add(param);
        }
        ArapInitDAtaBO.execBatchSql(insertSql, paramList);
    }

    private void updateSysinit() throws DAOException, BusinessException {
        SQLParameter param;
        String user;
        IdGenerator idGenerator;
        ArrayList<SQLParameter> paramList;
        String insertSql;
        Object[] obj;
        ArrayList sysinit;
        String sql = "select distinct pk_org from pub_sysinit where initcode='AR5' and pk_org not in (select distinct pk_org from pub_sysinit where initcode='AR40')";
        List orgPKs = (List)this.getDao().executeQuery(sql, (ResultSetProcessor)new ColumnListProcessor());
        if (orgPKs != null && orgPKs.size() > 0) {
            sql = "select INITNAME,PK_SYSINITTEMP from PUB_SYSINITTEMP where INITCODE='AR40'";
            sysinit = (ArrayList)this.getDao().executeQuery(sql, (ResultSetProcessor)new ArrayListProcessor());
            obj = (Object[])sysinit.get(0);
            insertSql = "INSERT INTO PUB_SYSINIT (CONTROLFLAG, DATAORIGINFLAG, DR, EDITFLAG, INITCODE, INITNAME, MODIFIEDTIME, MODIFIER, PK_ORG, PK_SYSINIT, SYSINIT, TS, VALUE) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?,?, ?, ?)";
            paramList = new ArrayList<SQLParameter>();
            idGenerator = DBAUtil.getIdGenerator();
            user = InvocationInfoProxy.getInstance().getUserId();
            for (String pk_org : orgPKs) {
                param = new SQLParameter();
                param.addParam("N");
                param.addParam("0");
                param.addParam("0");
                param.addParam("Y");
                param.addParam("AR40");
                param.addParam((String)obj[0]);
                param.addParam(new UFDate().toString());
                param.addParam(user);
                param.addParam(pk_org);
                param.addParam(idGenerator.generate());
                param.addParam((String)obj[1]);
                param.addParam(new UFDate().toString());
                param.addParam(1);
                paramList.add(param);
            }
            ArapInitDAtaBO.execBatchSql(insertSql, paramList);
            Logger.error((Object)"*****ARAP\u6536\u4ed8\u4e1a\u52a1\u53c2\u6570AR40\u66f4\u65b0\u7ed3\u675f******");
        }
        sql = "select distinct pk_org from pub_sysinit where initcode='AP3' and pk_org not in (select distinct pk_org from pub_sysinit where initcode='AP40')";
        orgPKs = (List)this.getDao().executeQuery(sql, (ResultSetProcessor)new ColumnListProcessor());
        if (orgPKs != null && orgPKs.size() > 0) {
            sql = "select INITNAME,PK_SYSINITTEMP from PUB_SYSINITTEMP where INITCODE='AP40'";
            sysinit = (ArrayList)this.getDao().executeQuery(sql, (ResultSetProcessor)new ArrayListProcessor());
            obj = (Object[])sysinit.get(0);
            insertSql = "INSERT INTO PUB_SYSINIT (CONTROLFLAG, DATAORIGINFLAG, DR, EDITFLAG, INITCODE, INITNAME, MODIFIEDTIME, MODIFIER, PK_ORG, PK_SYSINIT, SYSINIT, TS, VALUE) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?,?, ?, ?)";
            paramList = new ArrayList();
            idGenerator = DBAUtil.getIdGenerator();
            user = InvocationInfoProxy.getInstance().getUserId();
            for (String pk_org : orgPKs) {
                param = new SQLParameter();
                param.addParam("N");
                param.addParam("0");
                param.addParam("0");
                param.addParam("Y");
                param.addParam("AP40");
                param.addParam((String)obj[0]);
                param.addParam(new UFDate().toString());
                param.addParam(user);
                param.addParam(pk_org);
                param.addParam(idGenerator.generate());
                param.addParam((String)obj[1]);
                param.addParam(new UFDate().toString());
                param.addParam(1);
                paramList.add(param);
            }
            ArapInitDAtaBO.execBatchSql(insertSql, paramList);
            Logger.error((Object)"*****ARAP\u6536\u4ed8\u4e1a\u52a1\u53c2\u6570AP40\u66f4\u65b0\u7ed3\u675f******");
        }
    }

    protected boolean isOracle() throws BusinessException {
        int deftype = new BaseDAO().getDBType();
        return deftype == 1;
    }

    public void doBeforeUpdateDB(String oldVersion, String newVersion) throws Exception {
    }

    public void doBeforeUpdateData(String oldVersion, String newVersion) throws Exception {
        Logger.error((Object)"-----------------\u6536\u4ed8\u5347\u7ea7\u524d\u5904\u7406----------------------");
        Logger.error((Object)("oldVersion:" + oldVersion + ",newVersion:" + newVersion));
        CMTProxy proxySrv = (CMTProxy)NCLocator.getInstance().lookup(CMTProxy.class);
        this.update(proxySrv, "delete from pub_billaction where PK_BILLTYPEID in (select PK_BILLTYPEID from BD_BILLTYPE where pk_billtypecode in ('F3','F2','F1','F0') or PARENTBILLTYPE in ('F3','F2','F1','F0') )");
        this.update(proxySrv, "delete from pub_busiclass where PK_BILLTYPEID in (select PK_BILLTYPEID from BD_BILLTYPE where pk_billtypecode in ('F3','F2','F1','F0') or PARENTBILLTYPE in ('F3','F2','F1','F0') )");
        if (oldVersion != null && oldVersion.startsWith("6.5")) {
            Logger.error((Object)"-----------------\u6536\u4ed8\u5347\u7ea7\u524d\u811a\u672c\u5904\u7406\u5f00\u59cb----------------------");
            this.update(proxySrv, "delete from pub_sysinit where INITCODE in ('ARAPF0','ARAPF2','ARAPF1','ARAPF3')");
            this.update(proxySrv, "delete from pub_sysinittemp where INITCODE in ('ARAPF0','ARAPF2','ARAPF1','ARAPF3')");
            this.update(proxySrv, "delete from pub_vochange_b where dest_attr = 'billperiod' and ruledata ='xxxxxxxxxx' ");
            this.update(proxySrv, "delete from pub_vochange_b where dest_attr = 'bodys.pk_payterm' and ruledata ='bodys.pk_payterm' and pk_vochange_b in ('0001A110000000001RRP', '0001A110000000001RWR', '1001Z31000000003CUVR', '1001Z31000000003CUZS')");
            this.update(proxySrv, "delete from pub_vochange_b where dest_attr = 'bodys.status' and ruledata = '-1' and pk_vochange in (select pk_vochange from pub_vochange where dest_billtype ='F0' and src_billtype ='4A49')");
            this.update(proxySrv, "delete from pub_vochange_b where dest_attr = 'pk_paybill' and ruledata = '2' and pk_vochange in (select pk_vochange from pub_vochange where src_billtype ='F1' and dest_billtype ='F3')");
            this.update(proxySrv, "update md_component set VERSION='500' where id in ('622816fd-9894-4470-a440-8a8673f0f67a','97fb6843-4991-4840-a555-847ebec18424')");
            this.update(proxySrv, "delete from pub_eventlistener where owner in('2006','2008','20') and implclassname in  ('nc.bs.arap.busireg.UpdateApplyMoneyListener','nc.bs.arap.busireg.ArapExpamortizeControlListener','nc.bs.arap.busireg.BillRegisterForFIWEBUnVerify', 'nc.bs.arap.busireg.BillRegisterForFIWEBVerify','nc.bs.arap.busireg.BillRegisterForDelVerifyRelation','nc.bs.arap.busireg.BillRegisterForVerifyRelBillUnEffect')");
            try {
                List bb = (List)this.getDao().executeQuery("select version from sm_product_version where productcode='20082'", (ResultSetProcessor)new ColumnListProcessor());
                if (bb != null && bb.size() > 0) {
                    boolean isdel = false;
                    for (String v : bb) {
                        if (!v.contains("ssc")) continue;
                        isdel = true;
                        break;
                    }
                    if (isdel) {
                        this.getDao().executeUpdate("alter table arap_billtype drop column FLOWTYPE");
                        this.getDao().executeUpdate("alter table arap_billtype drop column ISPULL");
                        this.getDao().executeUpdate("alter table arap_billtype drop column SRCBILLTYPE");
                        this.getDao().executeUpdate("alter table arap_billtype drop column SRCTRUEBILLTYPE");
                    }
                }
            }
            catch (Exception e) {
                Logger.error((Object)e.getMessage());
            }
            this.update(proxySrv, "delete from bd_billtype where PK_BILLTYPECODE in ('F1-Cxx-YFK','F0-Cxx-YSK')  and PK_GROUP='global00000000000000'");
            this.update(proxySrv, "delete from bd_billtype2 where CLASSNAME= 'nc.ui.arap.billtype.TranstypeBiz2'");
            this.update(proxySrv, "delete from bd_billtype where (PK_BILLTYPECODE in ('FIV') or parentbilltype='FIV') and PK_GROUP in ('global00000000000000','~')");
            this.update(proxySrv, "delete from pub_vochange_b where dest_attr = 'pk_paybill' and ruledata = '2' and pk_vochange in (select pk_vochange from pub_vochange where src_billtype ='F1' and dest_billtype ='F3')");
            this.update(proxySrv, "delete from PUB_SYSTEMPLATE where MODULEID in ('2006','2008') and TEMPSTYLE=3 and appcode is null and TEMPLATEID in (select TEMPLATEID from PUB_SYSTEMPLATE_BASE where MODULEID in ('2006','2008') and TEMPSTYLE=3 and APPCODE is not null)");
            this.update(proxySrv, "delete from sm_appbutnregister where pagecode in ('20080CONFER_LIST','20060CONFER_LIST') and EXISTS (select 1 from SM_APPREGISTER where sm_appbutnregister.appid =  SM_APPREGISTER.PK_APPREGISTER)");
            this.update(proxySrv, "delete from sm_appbutnregister where BTNCODE = 'LinkTerm'and EXISTS (select 1 from SM_APPREGISTER where sm_appbutnregister.appid =  SM_APPREGISTER.PK_APPREGISTER and SM_APPREGISTER.code ='20080PO')");
            this.update(proxySrv, "delete from pub_vosplititem where PK_VOSPLITITEM in ('F1F0Z310000000007KDL','F1F3Z310000000007KDL','1001Z610000000007KDP','1001Z610000000007KDQ') and billtype = 'F1' AND dest_billtype = '36OV'");
            this.update(proxySrv, "delete from pub_vosplititem where PK_VOSPLITITEM in ('1001Z310000000007KDM','0001Z31000000002MNG0','1001Z31000000001EC14','1001Z31000000001EC15') and billtype = 'F1' AND dest_billtype = '36D1'");
            this.update(proxySrv, "delete from pub_vosplititem where PK_VOSPLITITEM in ('0001Z31000000000AZTR','0001Z31000000000AZTS') and BILLTYPE='4353' and DEST_BILLTYPE='23E0'");
            this.update(proxySrv, "delete from PUB_VOCHANGE_S where PK_VOCHANGE_S in ('1001Z31000000000RI31','1001Z31000000000RIQD') or PK_VOCHANGE in ('0001Z310000000000QBX','1001Z310000000002U62','0001Z310000000000WG0')");
        }
        if (oldVersion != null && (oldVersion.startsWith("6.5") || oldVersion.startsWith("1903"))) {
            this.update(proxySrv, "delete from bd_fwdbilltype where pk_billtypeid in (select pk_billtypeid from bd_billtype where systemcode in ('AR','AP') and (pk_group ='global00000000000000' or istransaction ='N'))");
        }
        this.update(proxySrv, "delete from pub_vochange_b where pk_vochange in (select pk_vochange from pub_vochange where src_billtype ='F0' and dest_billtype ='F1'and pk_group ='global00000000000000') ");
        this.update(proxySrv, "delete from pub_vochange_b where pk_vochange in (select pk_vochange from pub_vochange where src_billtype ='F0' and dest_billtype ='F2'and pk_group ='global00000000000000') ");
        this.update(proxySrv, "delete from pub_vochange_b where pk_vochange in (select pk_vochange from pub_vochange where src_billtype ='F0' and dest_billtype ='F3'and pk_group ='global00000000000000') ");
        this.update(proxySrv, "delete from pub_vochange_b where pk_vochange in (select pk_vochange from pub_vochange where src_billtype ='F1' and dest_billtype ='F0'and pk_group ='global00000000000000') ");
        this.update(proxySrv, "delete from pub_vochange_b where pk_vochange in (select pk_vochange from pub_vochange where src_billtype ='F1' and dest_billtype ='F3'and pk_group ='global00000000000000') ");
        this.update(proxySrv, "delete from pub_vochange_b where pk_vochange in (select pk_vochange from pub_vochange where src_billtype ='F2' and dest_billtype ='F0'and pk_group ='global00000000000000') ");
        this.update(proxySrv, "delete from pub_vochange_b where pk_vochange in (select pk_vochange from pub_vochange where src_billtype ='F2' and dest_billtype ='F3'and pk_group ='global00000000000000') ");
        this.update(proxySrv, "delete from pub_vochange_b where pk_vochange in (select pk_vochange from pub_vochange where src_billtype ='F3' and dest_billtype ='F1'and pk_group ='global00000000000000') ");
        this.update(proxySrv, "delete from pub_vochange_b where pk_vochange in (select pk_vochange from pub_vochange where src_billtype ='F3' and dest_billtype ='F2'and pk_group ='global00000000000000') ");
        this.update(proxySrv, "delete from pub_vochange_b where dest_attr = 'bodys.status' and ruledata = '-1' and pk_vochange in (select pk_vochange from pub_vochange where dest_billtype ='F0' and src_billtype ='4A49')");
        this.update(proxySrv, "delete from pub_wfgadget_b where PK_WFGADGET in (select PK_WORKFLOWGADGET from pub_workflowgadget where BILLTYPE in ('F0','F1','F2','F3','BDP','BDPI','BDL','BDR'))");
        this.update(proxySrv, "delete from fip_templatecell where pk_templaterow in (select pk_templaterow from fip_templaterow where pk_transtemplate in (select pk_transtemplate from fip_transtemplate where src_billtype in ('DU','DUAP') and des_billtype ='C0' and pk_group ='GLOBLE00000000000000'))");
        this.update(proxySrv, "delete from fip_templaterow where pk_transtemplate in (select pk_transtemplate from fip_transtemplate where src_billtype in ('DU','DUAP') and des_billtype ='C0' and pk_group ='GLOBLE00000000000000')");
        this.update(proxySrv, "delete from fip_transtemplate where src_billtype in ('DU','DUAP') and des_billtype ='C0' and pk_group ='GLOBLE00000000000000'");
        this.update(proxySrv, "delete from pub_eventlistener where owner in('2006','2008','20') and implclassname in  ('nc.bs.arap.busireg.BillRegisterForFaexpense','nc.bs.arap.busireg.BillRegisterForMakeAlter','nc.bs.arap.busireg.BillRegisterForAutoDeleteFacard','nc.bs.arap.busireg.ChangeStatusForBusiData','nc.bs.arap.busireg.OrderCloseForBusiData','nc.bs.arap.busireg.TBBCtrlListener', 'nc.bs.arap.busireg.EffectDapMessageListener','nc.bs.arap.listener.ArapBillAutoDeleteListener','nc.bs.arap.closeacc.ArapGLCloseAccListener','nc.bs.arap.busireg.PayBillFreezeUnFreezeEventListener','nc.bs.arap.busireg.CommissionWritebacktListener','nc.bs.arap.busireg.CancelPSApplyForBusiData')");
        if (oldVersion.contains("2020.05")) {
            Logger.error((Object)"-----------------\u6536\u4ed8\u5220\u9664\u5197\u4f59\u76d1\u542c\u5904\u7406\u5f00\u59cb----------------------");
            this.update(proxySrv, "delete from pub_eventlistener where implclassname='nc.bs.arap.busireg.WriteBack4Cmp36DxListener'");
            Logger.error((Object)"-----------------\u6536\u4ed8\u5220\u9664\u5197\u4f59\u76d1\u542c\u5904\u7406\u7ed3\u675f----------------------");
        }
        this.update(proxySrv, "delete from pub_eventlistener where PK_EVENTLISTENER in ('1001A71000000000Q37Q','1001A71000000000Q39O')");
        this.update(proxySrv, "delete from pub_function where classname like 'nc.pf.credit.function.CreditForMF0Func'");
        this.deleteTempTable();
        this.update(proxySrv, "delete from bd_billtype2 where CLASSNAME='nccloud.dto.arap.sence.ArapExtendSence'");
        this.update(proxySrv, "delete from sm_appbutnregister where appid in ('1001Z31000000002V1VQ','1001Z31000000002VO6A')");
        this.update(proxySrv, "delete from pub_form_property where areaid in('1001Z31000000002VNK1', '1001Z31000000002V1VU', '1001Z31000000002V1VV', '1001Z31000000002VNIN', '1001Z31000000002VO6J', '1001Z31000000002VO6K','1001Z31000000002VO6L', '1001Z31000000002VO6N')");
        this.update(proxySrv, "delete from pub_area where  templetid in ('1001Z31000000002V1VS','1001Z31000000002VO6I')");
        this.update(proxySrv, "delete from pub_page_templet where pk_page_templet in('1001Z31000000002V1VS','1001Z31000000002VO6I')");
        this.update(proxySrv, "delete from sm_appregister where code in('20062006','20082006')");
        this.update(proxySrv, "delete from sm_appmenuitem where appcode in ('20062006','20082006')");
        this.update(proxySrv, "delete from sm_appbutnregister where pk_btn in('1001Z31000000003NBVA','1001Z31000000003NBV6')");
        Logger.error((Object)"-----------------\u6536\u4ed8\u5347\u7ea7\u524d\u811a\u672c\u5904\u7406\u7ed3\u675f----------------------");
    }

    private void deleteTempTable() throws BusinessException {
        try {
            List result;
            String dbname = this.getDbType();
            if ("ORACLE".equalsIgnoreCase(dbname) && (result = (List)this.getDao().executeQuery("select table_name from user_tables where table_name like '%TMP_ARAP_RECEIVEANALYZE%'", (ResultSetProcessor)new ColumnListProcessor())) != null && result.size() > 0) {
                String sql = "drop table ? ";
                ArrayList<SQLParameter> paramList = new ArrayList<SQLParameter>();
                for (String table : result) {
                    SQLParameter param = new SQLParameter();
                    param.addParam(table);
                }
                ArapInitDAtaBO.execBatchSql(sql, paramList);
            }
        }
        catch (SQLException e) {
            Log.getInstance(((Object)((Object)this)).getClass()).error((Object)e.getMessage());
        }
    }

    public void updateSystemplete() throws BusinessException {
        String sql = "select appcode,nodekey,pk_corp from pub_systemplate where moduleid in ('2006','2008') and tempstyle=3 and appcode is not null ";
        List result = (List)this.getDao().executeQuery(sql, (ResultSetProcessor)new ArrayListProcessor());
        HashSet<String> existSet = new HashSet<String>();
        if (result != null && result.size() > 0) {
            for (Object[] r : result) {
                existSet.add((String)r[0] + (String)r[1] + (String)r[2]);
            }
        }
        String whereSql = " moduleid in ('2006','2008') and TEMPSTYLE=3 and nodekey in ('D0','D1','D2','D3') and appcode is not null";
        Collection systemplateBaseVOs = this.getDao().retrieveByClause(SystemplateBaseVO.class, whereSql.toString());
        if (systemplateBaseVOs.isEmpty()) {
            return;
        }
        whereSql = " parentbilltype in ('F0','F1','F2','F3') and pk_group<>'global00000000000000'";
        Collection billtypeVOs = this.getDao().retrieveByClause(BilltypeVO.class, whereSql.toString(), new String[]{"pk_billtypecode", "parentbilltype", "pk_group"});
        if (billtypeVOs.isEmpty()) {
            return;
        }
        HashMap<String, String> tradetype2parent = new HashMap<String, String>();
        for (BilltypeVO billtypeVO : billtypeVOs) {
            tradetype2parent.put(billtypeVO.getPk_billtypecode(), billtypeVO.getParentbilltype());
        }
        ArrayList<SystemplateVO> creadedSystemplateVOs = new ArrayList<SystemplateVO>();
        for (BilltypeVO billtypeVO : billtypeVOs) {
            for (SystemplateBaseVO baseVO : systemplateBaseVOs) {
                String key = baseVO.getAppcode() + billtypeVO.getPk_billtypecode() + billtypeVO.getPk_group();
                if (existSet.contains(key) || !billtypeVO.getParentbilltype().equals(tradetype2parent.get(baseVO.getNodekey()))) continue;
                SystemplateVO systemplateVO = baseVO.toSystemplateVO();
                systemplateVO.setPrimaryKey(null);
                systemplateVO.setOrgtypecode("11");
                systemplateVO.setStatus(2);
                systemplateVO.setPk_corp(billtypeVO.getPk_group());
                systemplateVO.setSysflag(Integer.valueOf(1));
                if (baseVO.getAppcode() != null) {
                    systemplateVO.setAppcode(baseVO.getAppcode());
                } else {
                    systemplateVO.setFunnode(baseVO.getFunnode());
                }
                systemplateVO.setTemplateflag(UFBoolean.TRUE);
                systemplateVO.setNodekey(billtypeVO.getPk_billtypecode());
                creadedSystemplateVOs.add(systemplateVO);
            }
        }
        this.getDao().insertVOArray((SuperVO[])creadedSystemplateVOs.toArray(new SystemplateVO[0]));
    }

    private void update(CMTProxy proxySrv, String sql) throws Exception {
        Method method = this.getMethod((Object)this);
        Object[] paras = new Object[]{sql};
        proxySrv.delegate_RequiresNew((Object)this, method, paras);
    }

    public void updateSql(String sql) throws DAOException {
        this.getDao().executeUpdate(sql);
    }

    private Method getMethod(Object target) {
        Class[] parameterTypes = new Class[]{String.class};
        Method method = null;
        try {
            method = target.getClass().getDeclaredMethod("updateSql", parameterTypes);
        }
        catch (Exception e) {
            ExceptionUtils.wrappException((Exception)e);
        }
        return method;
    }

    private static void execBatchSql(String sql, List<SQLParameter> list) throws BusinessException {
        PersistenceManager manager = null;
        try {
            manager = PersistenceManager.getInstance();
            JdbcSession session = manager.getJdbcSession();
            for (SQLParameter param : list) {
                session.addBatch(sql, param);
            }
            session.executeBatch();
        }
        catch (DbException e) {
            Logger.error((Object)e.getMessage(), (Throwable)e);
            throw new BusinessException(e.getMessage());
        }
        finally {
            if (manager != null) {
                manager.release();
            }
        }
    }

    private String getDbType() throws SQLException {
        Connection con = ConnectionFactory.getConnection();
        String m_dbname = "";
        DatabaseMetaData dmd = con.getMetaData();
        String dpn = dmd.getDatabaseProductName();
        if (dpn.toUpperCase().indexOf("POSTGRESQL") != -1) {
            m_dbname = "POSTGRESQL";
        }
        if (dpn.toUpperCase().indexOf("DB2") != -1) {
            m_dbname = "DB2";
        }
        if (dpn.toUpperCase().indexOf("ORACLE") != -1) {
            m_dbname = "ORACLE";
        }
        if (dpn.toUpperCase().indexOf("SQL") != -1) {
            m_dbname = "SQL";
        }
        if (dpn.toUpperCase().indexOf("INFORMIX") != -1) {
            m_dbname = "INFORMIX";
        }
        if (dpn.toUpperCase().indexOf("OSCAR") != -1) {
            m_dbname = "OSCAR";
        }
        if (dpn.toUpperCase().indexOf("GBASE") != -1) {
            m_dbname = "GBASE";
        }
        return m_dbname;
    }
}


/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  nc.bd.accperiod.AccperiodAccessor
 *  nc.bd.accperiod.AccperiodParamAccessor
 *  nc.bd.accperiod.AccperiodmonthAccessor
 *  nc.bs.dao.BaseDAO
 *  nc.bs.framework.common.NCLocator
 *  nc.bs.logging.Logger
 *  nc.itf.arap.audit.IArapAuditExportTask
 *  nc.itf.fi.pub.Currency
 *  nc.itf.mapub.dutyvouchertype.IDutyVoucherTypeQueryService
 *  nc.itf.uap.sf.IProductVersionQueryService
 *  nc.jdbc.framework.processor.ResultSetProcessor
 *  nc.md.persist.framework.MDPersistenceService
 *  nc.pubitf.fip.service.IFipBillQueryService
 *  nc.pubitf.uapbd.CurrencyRateUtilHelper
 *  nc.utils.fipub.MemoryResultSetProcessor
 *  nc.vo.arap.audit.APDetailVO
 *  nc.vo.arap.audit.ARDetailVO
 *  nc.vo.arap.audit.BillTypeVO
 *  nc.vo.arap.audit.TradeTypeVO
 *  nc.vo.arap.comreport.ArapTempVoucherVO
 *  nc.vo.bd.currtype.CurrtypeVO
 *  nc.vo.bd.period.AccperiodVO
 *  nc.vo.bd.period2.AccperiodmonthVO
 *  nc.vo.bd.vouchertype.VoucherTypeVO
 *  nc.vo.fbm.register.RegisterVO
 *  nc.vo.fi.pub.SqlUtils
 *  nc.vo.fip.external.FipExtendAggVO
 *  nc.vo.fip.service.FipRelationInfoVO
 *  nc.vo.fipub.exception.ExceptionHandler
 *  nc.vo.fipub.report.PubCommonReportMethod
 *  nc.vo.fipub.utils.SqlBuilder
 *  nc.vo.ml.NCLangRes4VoTransl
 *  nc.vo.pub.BusinessException
 *  nc.vo.pub.CircularlyAccessibleValueObject
 *  nc.vo.pub.lang.UFBoolean
 *  nc.vo.pub.lang.UFDate
 *  nc.vo.pub.rs.MemoryResultSet
 *  nc.vo.pub.rs.MemoryResultSetMetaData
 *  nc.vo.pub.rs.MetaDataVO
 *  nc.vo.sm.install.ProductVersionVO
 *  nccloud.commons.lang.StringUtils
 *  org.apache.commons.lang3.ArrayUtils
 */
package nc.impl.arap.audit;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import nc.bd.accperiod.AccperiodAccessor;
import nc.bd.accperiod.AccperiodParamAccessor;
import nc.bd.accperiod.AccperiodmonthAccessor;
import nc.bs.dao.BaseDAO;
import nc.bs.framework.common.NCLocator;
import nc.bs.logging.Logger;
import nc.itf.arap.audit.IArapAuditExportTask;
import nc.itf.fi.pub.Currency;
import nc.itf.mapub.dutyvouchertype.IDutyVoucherTypeQueryService;
import nc.itf.uap.sf.IProductVersionQueryService;
import nc.jdbc.framework.processor.ResultSetProcessor;
import nc.md.persist.framework.MDPersistenceService;
import nc.pubitf.fip.service.IFipBillQueryService;
import nc.pubitf.uapbd.CurrencyRateUtilHelper;
import nc.utils.fipub.MemoryResultSetProcessor;
import nc.vo.arap.audit.APDetailVO;
import nc.vo.arap.audit.ARDetailVO;
import nc.vo.arap.audit.BillTypeVO;
import nc.vo.arap.audit.TradeTypeVO;
import nc.vo.arap.comreport.ArapTempVoucherVO;
import nc.vo.bd.currtype.CurrtypeVO;
import nc.vo.bd.period.AccperiodVO;
import nc.vo.bd.period2.AccperiodmonthVO;
import nc.vo.bd.vouchertype.VoucherTypeVO;
import nc.vo.fbm.register.RegisterVO;
import nc.vo.fi.pub.SqlUtils;
import nc.vo.fip.external.FipExtendAggVO;
import nc.vo.fip.service.FipRelationInfoVO;
import nc.vo.fipub.exception.ExceptionHandler;
import nc.vo.fipub.report.PubCommonReportMethod;
import nc.vo.fipub.utils.SqlBuilder;
import nc.vo.ml.NCLangRes4VoTransl;
import nc.vo.pub.BusinessException;
import nc.vo.pub.CircularlyAccessibleValueObject;
import nc.vo.pub.lang.UFBoolean;
import nc.vo.pub.lang.UFDate;
import nc.vo.pub.rs.MemoryResultSet;
import nc.vo.pub.rs.MemoryResultSetMetaData;
import nc.vo.pub.rs.MetaDataVO;
import nc.vo.sm.install.ProductVersionVO;
import nccloud.commons.lang.StringUtils;
import org.apache.commons.lang3.ArrayUtils;

public class ArapAuditExportTaskImpl
implements IArapAuditExportTask {
    public final String MDID_RESA_VOUCHERTYPE = "9d51c1f7-e9c9-4a25-801a-63eff11926fb";

    public List<BillTypeVO> getBilltypeVOs() throws SQLException, BusinessException {
        String sql = "select pk_billtypecode, billtypename from bd_billtype where pk_billtypecode in ('F0','F1','F2','F3','BDL','BDR')";
        List billtypeVOs = (List)new BaseDAO().executeQuery(sql, new ResultSetProcessor(){
            private static final long serialVersionUID = 2244036624513966990L;

            public Object handleResultSet(ResultSet rs) throws SQLException {
                ArrayList<BillTypeVO> ret = new ArrayList<BillTypeVO>();
                while (rs.next()) {
                    BillTypeVO billtypeVO = new BillTypeVO();
                    billtypeVO.setBilltypecode(rs.getString(1));
                    billtypeVO.setBilltypename(rs.getString(2));
                    ret.add(billtypeVO);
                }
                return ret;
            }
        });
        return billtypeVOs;
    }

    public List<TradeTypeVO> getTradetypeVOs() throws SQLException, BusinessException {
        String sql = "select pk_billtypecode, billtypename from bd_billtype where parentbilltype in ('F0','F1','F2','F3','BDL','BDR')";
        List tradetypeVOs = (List)new BaseDAO().executeQuery(sql, new ResultSetProcessor(){
            private static final long serialVersionUID = 2244036624513966990L;

            public Object handleResultSet(ResultSet rs) throws SQLException {
                ArrayList<TradeTypeVO> ret = new ArrayList<TradeTypeVO>();
                while (rs.next()) {
                    TradeTypeVO billtypeVO = new TradeTypeVO();
                    billtypeVO.setTradetypecode(rs.getString(1));
                    billtypeVO.setTradetypename(rs.getString(2));
                    ret.add(billtypeVO);
                }
                return ret;
            }
        });
        return tradetypeVOs;
    }

    public List<Object> getArDetailSubjs(String pk_org, UFDate begindate, UFDate enddate, boolean hasjun, List<String> pks) throws Exception {
        List<Object> sqlList = new ArrayList();
        sqlList = this.getArBillSql(pk_org, begindate, enddate, hasjun, pks);
        String tallySql = this.getARTallySql(pk_org, begindate, enddate, pks);
        sqlList.add(tallySql);
        String billSql = "select a.subjectcode,a.billno,pk_bill from (";
        for (String string : sqlList) {
            billSql = billSql + " (" + string + ") union ";
        }
        billSql = billSql.substring(0, billSql.length() - 6) + ") a ";
        MemoryResultSet resultSet = (MemoryResultSet)new BaseDAO().executeQuery(billSql, (ResultSetProcessor)new MemoryResultSetProcessor());
        MemoryResultSetMetaData memoryResultSetMetaData = resultSet.getMetaData0();
        ArrayList dataRowList = resultSet.getResultArrayList();
        Object[] dataRow = null;
        boolean issubjnull = false;
        String billno = "";
        ArrayList<Object> retList = new ArrayList<Object>();
        for (int i = 0; i < dataRowList.size(); ++i) {
            dataRow = ((List)dataRowList.get(i)).toArray();
            if (dataRow[memoryResultSetMetaData.getNameIndex("subjectcode")] != null) continue;
            issubjnull = true;
            billno = (String)dataRow[memoryResultSetMetaData.getNameIndex("billno")];
            break;
        }
        retList.add(UFBoolean.valueOf((boolean)issubjnull));
        retList.add(billno);
        return retList;
    }

    public List<Object> getApDetailSubjs(String pk_org, UFDate begindate, UFDate enddate, boolean hasjun, List<String> pks) throws Exception {
        List<Object> sqlList = new ArrayList();
        sqlList = this.getApBillSql(pk_org, begindate, enddate, hasjun, pks);
        String tallySql = this.getAPTallySql(pk_org, begindate, enddate, pks);
        sqlList.add(tallySql);
        String billSql = "select a.subjectcode,a.billno from (";
        for (String string : sqlList) {
            billSql = billSql + " (" + string + ") union ";
        }
        billSql = billSql.substring(0, billSql.length() - 6) + ") a ";
        MemoryResultSet resultSet = (MemoryResultSet)new BaseDAO().executeQuery(billSql, (ResultSetProcessor)new MemoryResultSetProcessor());
        MemoryResultSetMetaData memoryResultSetMetaData = resultSet.getMetaData0();
        ArrayList dataRowList = resultSet.getResultArrayList();
        Object[] dataRow = null;
        boolean issubjnull = false;
        String billno = "";
        ArrayList<Object> retList = new ArrayList<Object>();
        for (int i = 0; i < dataRowList.size(); ++i) {
            dataRow = ((List)dataRowList.get(i)).toArray();
            if (dataRow[memoryResultSetMetaData.getNameIndex("subjectcode")] != null) continue;
            issubjnull = true;
            billno = (String)dataRow[memoryResultSetMetaData.getNameIndex("billno")];
            break;
        }
        retList.add(UFBoolean.valueOf((boolean)issubjnull));
        retList.add(billno);
        return retList;
    }

    public List<ARDetailVO> getArDetailVOs(String pk_org, UFDate begindate, UFDate enddate, boolean hasjun, List<String> pks) throws Exception {
        CurrtypeVO currtypeVO = Currency.getCurrInfo((String)CurrencyRateUtilHelper.getInstance().getLocalCurrtypeByOrgID(pk_org));
        String local_currtype = currtypeVO.getName();
        ArrayList<ARDetailVO> ardetailList = new ArrayList<ARDetailVO>();
        List<Object> sqlList = new ArrayList();
        sqlList = this.getArBillSql(pk_org, begindate, enddate, hasjun, pks);
        String tallySql = this.getARTallySql(pk_org, begindate, enddate, pks);
        sqlList.add(tallySql);
        String billSql = "select a.pk_org,a.pk_group,a.pk_bill,a.pk_bill2, a.customer,bd_customer.code custcode,a.project,bd_project.project_code projectcode,bd_balatype.code balatypecode,a.subjectcode,a.accvoucherdate,a.tallydate,a.accountperiod,a.accountyear,a.rate,a.baldirection,a.money_loc,a.money_ori,a.pk_currtype,a.brief,a.expiredate,a.verifyflag,a.busidate,a.pk_billtype,a.pk_tradetype,a.billno,a.invoice,a.contractno,a.recdate,a.draftno from (";
        for (String string : sqlList) {
            billSql = billSql + " (" + string + ") union ";
        }
        billSql = billSql.substring(0, billSql.length() - 6) + ") a left outer join bd_customer on a.customer = bd_customer.pk_customer left outer join bd_project on a.project = bd_project.pk_project left outer join bd_balatype on a.pk_balatype = bd_balatype.pk_balatype  order by pk_org,accvoucherdate";
        MemoryResultSet resultSet = (MemoryResultSet)new BaseDAO().executeQuery(billSql, (ResultSetProcessor)new MemoryResultSetProcessor());
        PubCommonReportMethod.insertNameColumn((MemoryResultSet)resultSet, (String)"b498bc9a-e5fd-4613-8da8-bdae2a05704a", (String)"pk_currtype", (String)"curr_ori");
        MetaDataVO metaDataVO = new MetaDataVO();
        metaDataVO.setFieldName("vouchertypecode");
        resultSet.insertColumnByDefaultValue(metaDataVO, (Object)"", 0);
        MemoryResultSetMetaData metaData0 = resultSet.getMetaData0();
        ArrayList<List<Object>> dataRowList = resultSet.getResultArrayList();
        dataRowList = this.computeVoucher(dataRowList, metaData0);
        dataRowList = this.resetAccperiod(dataRowList, metaData0, pk_org);
        Object[] dataRow = null;
        AccperiodmonthVO accperiodmonthVO = new AccperiodmonthVO();
        for (int i = 0; i < dataRowList.size(); ++i) {
            String accountperiod;
            dataRow = dataRowList.get(i).toArray();
            ARDetailVO arDetailVO = new ARDetailVO();
            String custcode = dataRow[metaData0.getNameIndex("custcode")] == null ? null : (String)dataRow[metaData0.getNameIndex("custcode")];
            arDetailVO.setCustcode(custcode);
            String subjectcode = dataRow[metaData0.getNameIndex("subjectcode")] == null ? null : (String)dataRow[metaData0.getNameIndex("subjectcode")];
            arDetailVO.setSubjectcode(subjectcode);
            String accvoucherdate = dataRow[metaData0.getNameIndex("accvoucherdate")] == null ? null : ((String)dataRow[metaData0.getNameIndex("accvoucherdate")]).substring(0, 10);
            arDetailVO.setAccvoucherdate(accvoucherdate);
            String tallydate = dataRow[metaData0.getNameIndex("tallydate")] == null ? null : ((String)dataRow[metaData0.getNameIndex("tallydate")]).substring(0, 10);
            arDetailVO.setTallydate(tallydate);
            String string = accountperiod = dataRow[metaData0.getNameIndex("accountperiod")] == null ? null : (String)dataRow[metaData0.getNameIndex("accountperiod")];
            if (accountperiod.endsWith("00")) {
                if (accountperiod.contains("-")) {
                    accperiodmonthVO = this.getAccperiod(pk_org, accountperiod);
                    String accperiod = accperiodmonthVO.getAccperiodmth().trim();
                    arDetailVO.setAccountperiod(accperiod);
                } else {
                    arDetailVO.setAccountperiod(accountperiod);
                }
            } else {
                arDetailVO.setAccountperiod(accountperiod);
            }
            String accountyear = dataRow[metaData0.getNameIndex("accountyear")] == null ? null : (String)dataRow[metaData0.getNameIndex("accountyear")];
            arDetailVO.setAccountyear(accountyear);
            String vouchertypecode = dataRow[metaData0.getNameIndex("vouchertypecode")] == null ? null : (String)dataRow[metaData0.getNameIndex("vouchertypecode")];
            arDetailVO.setVouchertypecode(vouchertypecode);
            String accvoucherno = dataRow[metaData0.getNameIndex("pk_bill")] == null ? null : (String)dataRow[metaData0.getNameIndex("pk_bill")];
            arDetailVO.setAccvoucherno(accvoucherno);
            arDetailVO.setLocalcurrtype(local_currtype);
            arDetailVO.setRate(dataRow[metaData0.getNameIndex("rate")].toString());
            arDetailVO.setBaldirection((String)dataRow[metaData0.getNameIndex("baldirection")]);
            arDetailVO.setBal_local(null);
            arDetailVO.setBal_ori(null);
            arDetailVO.setMoney_loc(dataRow[metaData0.getNameIndex("money_loc")].toString());
            arDetailVO.setMoney_ori(dataRow[metaData0.getNameIndex("money_ori")].toString());
            String curr_ori = dataRow[metaData0.getNameIndex("curr_ori")] == null ? null : (String)dataRow[metaData0.getNameIndex("curr_ori")];
            arDetailVO.setCurr_ori(curr_ori);
            String brief = dataRow[metaData0.getNameIndex("brief")] == null ? null : (String)dataRow[metaData0.getNameIndex("brief")];
            arDetailVO.setBrief(brief);
            String experidate = dataRow[metaData0.getNameIndex("expiredate")] == null ? null : ((String)dataRow[metaData0.getNameIndex("expiredate")]).substring(0, 10);
            arDetailVO.setExperidate(experidate);
            String verifyvoucherno = dataRow[metaData0.getNameIndex("pk_bill2")] == null ? null : (String)dataRow[metaData0.getNameIndex("pk_bill2")];
            arDetailVO.setVerifyvoucherno(verifyvoucherno);
            String verifyflag = dataRow[metaData0.getNameIndex("verifyflag")].toString();
            String busidate = dataRow[metaData0.getNameIndex("busidate")] == null ? null : ((String)dataRow[metaData0.getNameIndex("busidate")]).substring(0, 10);
            arDetailVO.setVerifydate("1".equals(verifyflag) ? busidate : null);
            String pk_billtype = dataRow[metaData0.getNameIndex("pk_billtype")] == null ? null : (String)dataRow[metaData0.getNameIndex("pk_billtype")];
            arDetailVO.setBilltypecode(pk_billtype);
            String pk_tradetype = dataRow[metaData0.getNameIndex("pk_tradetype")] == null ? null : (String)dataRow[metaData0.getNameIndex("pk_tradetype")];
            arDetailVO.setTradetypedate(pk_tradetype);
            String billno = dataRow[metaData0.getNameIndex("billno")] == null ? null : (String)dataRow[metaData0.getNameIndex("billno")];
            arDetailVO.setBillno(billno);
            String invoice = dataRow[metaData0.getNameIndex("invoice")] == null ? null : (String)dataRow[metaData0.getNameIndex("invoice")];
            arDetailVO.setInvoice(invoice);
            String contractno = dataRow[metaData0.getNameIndex("contractno")] == null ? null : (String)dataRow[metaData0.getNameIndex("contractno")];
            arDetailVO.setContractno(contractno);
            String projectcode = dataRow[metaData0.getNameIndex("projectcode")] == null ? null : (String)dataRow[metaData0.getNameIndex("projectcode")];
            arDetailVO.setProjectcode(projectcode);
            String balatypecode = dataRow[metaData0.getNameIndex("balatypecode")] == null ? null : (String)dataRow[metaData0.getNameIndex("balatypecode")];
            arDetailVO.setBalatypecode(balatypecode);
            String recdate = dataRow[metaData0.getNameIndex("recdate")] == null ? null : ((String)dataRow[metaData0.getNameIndex("recdate")]).substring(0, 10);
            arDetailVO.setRecdate(recdate);
            arDetailVO.setVerifyflag(verifyflag);
            String draftno = dataRow[metaData0.getNameIndex("draftno")] == null ? null : (String)dataRow[metaData0.getNameIndex("draftno")];
            arDetailVO.setDraftno(draftno);
            ardetailList.add(arDetailVO);
        }
        if (this.isProductTbbInstalled("3618")) {
            this.resetARCheckno(ardetailList);
        }
        return ardetailList;
    }

    private AccperiodmonthVO getAccperiod(String pk_org, String currDate) throws BusinessException {
        AccperiodmonthVO vo = AccperiodmonthAccessor.getInstance().queryAccperiodmonthVOByYearMonth(AccperiodParamAccessor.getInstance().getAccperiodschemePkByPk_org(pk_org), currDate);
        if (vo == null) {
            ExceptionHandler.createAndThrowException((String)NCLangRes4VoTransl.getNCLangRes().getStrByID("2006pub_0", "02006pub-0579"));
        }
        return vo;
    }

    public List<APDetailVO> getApDetailVOs(String pk_org, UFDate begindate, UFDate enddate, boolean hasjun, List<String> pks) throws Exception {
        CurrtypeVO currtypeVO = Currency.getCurrInfo((String)CurrencyRateUtilHelper.getInstance().getLocalCurrtypeByOrgID(pk_org));
        String local_currtype = currtypeVO.getName();
        ArrayList<APDetailVO> apdetailList = new ArrayList<APDetailVO>();
        List<Object> sqlList = new ArrayList();
        sqlList = this.getApBillSql(pk_org, begindate, enddate, hasjun, pks);
        String tallySql = this.getAPTallySql(pk_org, begindate, enddate, pks);
        sqlList.add(tallySql);
        String billSql = "select a.pk_org,a.pk_group,a.pk_bill,a.pk_bill2, a.supplier,bd_supplier.code suppcode,a.project,bd_project.project_code projectcode,bd_balatype.code balatypecode,a.subjectcode,a.accvoucherdate,a.tallydate,a.accountperiod,a.accountyear,a.rate,a.baldirection,a.money_loc,a.money_ori,a.pk_currtype,a.brief,a.expiredate,a.verifyflag,a.busidate,a.pk_billtype,a.pk_tradetype,a.billno,a.invoice,a.contractno,a.recdate,a.draftno from (";
        for (String string : sqlList) {
            billSql = billSql + " (" + string + ") union ";
        }
        billSql = billSql.substring(0, billSql.length() - 6) + ") a left outer join bd_supplier on a.supplier = bd_supplier.pk_supplier left outer join bd_project on a.project = bd_project.pk_project left outer join bd_balatype on a.pk_balatype = bd_balatype.pk_balatype  order by pk_org,accvoucherdate";
        MemoryResultSet resultSet = (MemoryResultSet)new BaseDAO().executeQuery(billSql, (ResultSetProcessor)new MemoryResultSetProcessor());
        PubCommonReportMethod.insertNameColumn((MemoryResultSet)resultSet, (String)"b498bc9a-e5fd-4613-8da8-bdae2a05704a", (String)"pk_currtype", (String)"curr_ori");
        MetaDataVO metaDataVO = new MetaDataVO();
        metaDataVO.setFieldName("vouchertypecode");
        resultSet.insertColumnByDefaultValue(metaDataVO, (Object)"", 0);
        MemoryResultSetMetaData metaData0 = resultSet.getMetaData0();
        ArrayList<List<Object>> dataRowList = resultSet.getResultArrayList();
        dataRowList = this.computeVoucher(dataRowList, metaData0);
        dataRowList = this.resetAccperiod(dataRowList, metaData0, pk_org);
        Object[] dataRow = null;
        AccperiodmonthVO accperiodmonthVO = new AccperiodmonthVO();
        for (int i = 0; i < dataRowList.size(); ++i) {
            String accountperiod;
            dataRow = dataRowList.get(i).toArray();
            APDetailVO apDetailVO = new APDetailVO();
            String suppcode = dataRow[metaData0.getNameIndex("suppcode")] == null ? null : (String)dataRow[metaData0.getNameIndex("suppcode")];
            apDetailVO.setSuppcode(suppcode);
            String subjectcode = dataRow[metaData0.getNameIndex("subjectcode")] == null ? null : (String)dataRow[metaData0.getNameIndex("subjectcode")];
            apDetailVO.setSubjectcode(subjectcode);
            String accvoucherdate = dataRow[metaData0.getNameIndex("accvoucherdate")] == null ? null : ((String)dataRow[metaData0.getNameIndex("accvoucherdate")]).substring(0, 10);
            apDetailVO.setAccvoucherdate(accvoucherdate);
            String tallydate = dataRow[metaData0.getNameIndex("tallydate")] == null ? null : ((String)dataRow[metaData0.getNameIndex("tallydate")]).substring(0, 10);
            apDetailVO.setTallydate(tallydate);
            String string = accountperiod = dataRow[metaData0.getNameIndex("accountperiod")] == null ? null : (String)dataRow[metaData0.getNameIndex("accountperiod")];
            if (accountperiod.endsWith("00")) {
                if (accountperiod.contains("-")) {
                    accperiodmonthVO = this.getAccperiod(pk_org, accountperiod);
                    String accperiod = accperiodmonthVO.getAccperiodmth().trim();
                    apDetailVO.setAccountperiod(accperiod);
                } else {
                    apDetailVO.setAccountperiod(accountperiod);
                }
            } else {
                apDetailVO.setAccountperiod(accountperiod);
            }
            String accountyear = dataRow[metaData0.getNameIndex("accountyear")] == null ? null : (String)dataRow[metaData0.getNameIndex("accountyear")];
            apDetailVO.setAccountyear(accountyear);
            String vouchertypecode = dataRow[metaData0.getNameIndex("vouchertypecode")] == null ? null : (String)dataRow[metaData0.getNameIndex("vouchertypecode")];
            apDetailVO.setVouchertypecode(vouchertypecode);
            String accvoucherno = dataRow[metaData0.getNameIndex("pk_bill")] == null ? null : (String)dataRow[metaData0.getNameIndex("pk_bill")];
            apDetailVO.setAccvoucherno(accvoucherno);
            apDetailVO.setLocalcurrtype(local_currtype);
            apDetailVO.setRate(dataRow[metaData0.getNameIndex("rate")].toString());
            apDetailVO.setBaldirection((String)dataRow[metaData0.getNameIndex("baldirection")]);
            apDetailVO.setBal_local(null);
            apDetailVO.setBal_ori(null);
            apDetailVO.setMoney_loc(dataRow[metaData0.getNameIndex("money_loc")].toString());
            apDetailVO.setMoney_ori(dataRow[metaData0.getNameIndex("money_ori")].toString());
            String curr_ori = dataRow[metaData0.getNameIndex("curr_ori")] == null ? null : (String)dataRow[metaData0.getNameIndex("curr_ori")];
            apDetailVO.setCurr_ori(curr_ori);
            String brief = dataRow[metaData0.getNameIndex("brief")] == null ? null : (String)dataRow[metaData0.getNameIndex("brief")];
            apDetailVO.setBrief(brief);
            String experidate = dataRow[metaData0.getNameIndex("expiredate")] == null ? null : ((String)dataRow[metaData0.getNameIndex("expiredate")]).substring(0, 10);
            apDetailVO.setExperidate(experidate);
            String verifyvoucherno = dataRow[metaData0.getNameIndex("pk_bill2")] == null ? null : (String)dataRow[metaData0.getNameIndex("pk_bill2")];
            apDetailVO.setVerifyvoucherno(verifyvoucherno);
            String verifyflag = dataRow[metaData0.getNameIndex("verifyflag")].toString();
            String busidate = dataRow[metaData0.getNameIndex("busidate")] == null ? null : ((String)dataRow[metaData0.getNameIndex("busidate")]).substring(0, 10);
            apDetailVO.setVerifydate("1".equals(verifyflag) ? busidate : null);
            String pk_billtype = dataRow[metaData0.getNameIndex("pk_billtype")] == null ? null : (String)dataRow[metaData0.getNameIndex("pk_billtype")];
            apDetailVO.setBilltypecode(pk_billtype);
            String pk_tradetype = dataRow[metaData0.getNameIndex("pk_tradetype")] == null ? null : (String)dataRow[metaData0.getNameIndex("pk_tradetype")];
            apDetailVO.setTradetypedate(pk_tradetype);
            String billno = dataRow[metaData0.getNameIndex("billno")] == null ? null : (String)dataRow[metaData0.getNameIndex("billno")];
            apDetailVO.setBillno(billno);
            String invoice = dataRow[metaData0.getNameIndex("invoice")] == null ? null : (String)dataRow[metaData0.getNameIndex("invoice")];
            apDetailVO.setInvoice(invoice);
            String contractno = dataRow[metaData0.getNameIndex("contractno")] == null ? null : (String)dataRow[metaData0.getNameIndex("contractno")];
            apDetailVO.setContractno(contractno);
            String projectcode = dataRow[metaData0.getNameIndex("projectcode")] == null ? null : (String)dataRow[metaData0.getNameIndex("projectcode")];
            apDetailVO.setProjectcode(projectcode);
            String balatypecode = dataRow[metaData0.getNameIndex("balatypecode")] == null ? null : (String)dataRow[metaData0.getNameIndex("balatypecode")];
            apDetailVO.setBalatypecode(balatypecode);
            String paydate = dataRow[metaData0.getNameIndex("recdate")] == null ? null : ((String)dataRow[metaData0.getNameIndex("recdate")]).substring(0, 10);
            apDetailVO.setRecdate(paydate);
            apDetailVO.setVerifyflag(verifyflag);
            String draftno = dataRow[metaData0.getNameIndex("draftno")] == null ? null : (String)dataRow[metaData0.getNameIndex("draftno")];
            apDetailVO.setDraftno(draftno);
            apdetailList.add(apDetailVO);
        }
        if (this.isProductTbbInstalled("3618")) {
            this.resetAPCheckno(apdetailList);
        }
        return apdetailList;
    }

    private List<String> getArBillSql(String pk_org, UFDate begindate, UFDate enddate, boolean hasjun, List<String> pks) throws Exception {
        ArrayList<String> list = new ArrayList<String>();
        String recbillsql = "select ar_recbill.pk_group,ar_recbill.pk_org,ar_recbill.billperiod as accountperiod, ar_recbill.billyear as accountyear,ar_recitem.pk_recbill pk_bill,null pk_bill2,ar_recitem.customer,ar_recitem.subjcode subjectcode,ar_recbill.effectdate accvoucherdate,ar_recbill.effectdate tallydate,ar_recitem.rate,'\u501f' baldirection,null bal_ori,null bal_local,ar_recitem.local_money_bal money_loc,ar_recitem.money_bal money_ori,ar_recitem.scomment brief,ar_recitem.pk_currtype,arap_termitem.expiredate,null verifyvoucherno,null busidate,ar_recitem.pk_billtype,ar_recitem.pk_tradetype,ar_recbill.billno,ar_recitem.invoiceno invoice,ar_recitem.contractno,ar_recitem.project,ar_recitem.pk_balatype,0 verifyflag, null recdate,null draftno  from ar_recitem  inner join ar_recbill on ar_recbill.pk_recbill = ar_recitem.pk_recbill inner join arap_termitem  on ar_recbill.pk_recbill = arap_termitem.pk_bill and ar_recitem.pk_recitem = arap_termitem.pk_item  where ar_recitem.pk_org = '" + pk_org + "' and ar_recitem.money_bal <> 0 ";
        recbillsql = hasjun ? recbillsql + "and ar_recitem.billdate <= '" + enddate + "' " : recbillsql + "and ar_recitem.billdate >= '" + begindate + "' and ar_recitem.billdate <= '" + enddate + "' ";
        recbillsql = recbillsql + " and ar_recbill.effectstatus = 10 ";
        if (pks.size() < 101) {
            recbillsql = recbillsql + SqlUtils.getInStr((String)" and ar_recitem.pk_recbill ", (String[])pks.toArray(new String[0]), (boolean)true);
        }
        String gatherbillsql = "select ar_gatherbill.pk_group,ar_gatherbill.pk_org,ar_gatherbill.billperiod as accountperiod, ar_gatherbill.billyear as accountyear,ar_gatheritem.pk_gatherbill pk_bill,null pk_bill2,ar_gatheritem.customer,ar_gatheritem.subjcode subjectcode,ar_gatherbill.effectdate accvoucherdate,ar_gatherbill.effectdate tallydate,ar_gatheritem.rate,'\u501f' baldirection,null bal_ori,null bal_local,-ar_gatheritem.local_money_bal money_loc,-ar_gatheritem.money_bal money_ori,ar_gatheritem.scomment brief,ar_gatheritem.pk_currtype,arap_termitem.expiredate,null verifyvoucherno,null busidate,ar_gatheritem.pk_billtype,ar_gatheritem.pk_tradetype,ar_gatherbill.billno,ar_gatheritem.invoiceno invoice,ar_gatheritem.contractno,ar_gatheritem.project,ar_gatheritem.pk_balatype,0 verifyflag, ar_gatheritem.paydate recdate,ar_gatheritem.checkno draftno from ar_gatheritem inner join ar_gatherbill on ar_gatherbill.pk_gatherbill = ar_gatheritem.pk_gatherbill inner join arap_termitem  on ar_gatherbill.pk_gatherbill = arap_termitem.pk_bill and ar_gatheritem.pk_gatheritem = arap_termitem.pk_item where ar_gatheritem.pk_org = '" + pk_org + "' and ar_gatheritem.money_bal <> 0 ";
        gatherbillsql = hasjun ? gatherbillsql + " and ar_gatheritem.billdate <= '" + enddate + "'" : gatherbillsql + "and ar_gatheritem.billdate >= '" + begindate + "' and ar_gatheritem.billdate <= '" + enddate + "'";
        gatherbillsql = gatherbillsql + " and ar_gatherbill.effectstatus = 10 ";
        if (pks.size() < 101) {
            gatherbillsql = gatherbillsql + SqlUtils.getInStr((String)" and ar_gatheritem.pk_gatherbill ", (String[])pks.toArray(new String[0]), (boolean)true);
        }
        list.add(recbillsql);
        list.add(gatherbillsql);
        return list;
    }

    private String getAPTallySql(String pk_org, UFDate begindate, UFDate enddate, List<String> pks) throws Exception {
        String tallysql = "select arap_tally.pk_group,arap_tally.pk_org,arap_tally.accperiod accountperiod,arap_tally.accyear accountyear,arap_tally.pk_bill as pk_bill,case when (arap_tally.dealflag > 10 and arap_tally.dealflag < 20 ) then arap_tally.pk_corbill else null end as pk_bill2, arap_tally.supplier,arap_tally.subjcode subjectcode,arap_tally.effectdate accvoucherdate,arap_tally.effectdate tallydate,case when arap_tally.pk_billtype = 'F1' then ap_payableitem.rate else ap_payitem.rate end as rate,'\u8d37' baldirection,null bal_ori,null bal_local, (arap_tally.local_money_de + arap_tally.local_money_cr) money_loc,(arap_tally.money_de + arap_tally.money_cr) money_ori,case when arap_tally.pk_billtype = 'F1' then ap_payableitem.scomment else ap_payitem.scomment end as brief,arap_tally.pk_currtype, arap_termitem.expiredate,null verifyvoucherno,arap_tally.tallydate as busidate,case when dealflag in ('31','33') then 'BDR' when dealflag in ('32','34') then 'BDL' else arap_tally.pk_billtype end as pk_billtype , case when dealflag in ('31','33') then 'BDR' when dealflag in ('32','34') then 'BDL' else arap_tally.pk_tradetype end as pk_tradetype, arap_tally.billno,arap_tally.invoiceno invoice,arap_tally_all.contractno,arap_tally_all.project,case when arap_tally.pk_billtype = 'F1' then ap_payableitem.pk_balatype else ap_payitem.pk_balatype end as pk_balatype,1 verifyflag,  case when arap_tally.pk_billtype = 'F3' then ap_payitem.paydate else null end as paydate,case when arap_tally.pk_billtype = 'F3' then ap_payitem.checkno else null end as draftno from arap_tally left outer join arap_tally_all on arap_tally.pk_bill = arap_tally_all.pk_bill and arap_tally.pk_item = arap_tally_all.pk_item  left outer join arap_termitem on arap_tally.pk_bill = arap_termitem.pk_bill and arap_tally.pk_item = arap_termitem.pk_item  left outer join ap_payableitem on arap_tally.pk_bill = ap_payableitem.pk_payablebill and arap_tally.pk_item = ap_payableitem.pk_payableitem  left outer join ap_payitem on arap_tally.pk_bill = ap_payitem.pk_paybill and arap_tally.pk_item = ap_payitem.pk_payitem left outer join arap_verify on arap_tally.pk_dealnum = arap_verify.busino  left outer join arap_bdloss on arap_tally.pk_dealnum = arap_bdloss.pk_bdloss where arap_tally.billdate >= '" + begindate + "' and arap_tally.billdate <= '" + enddate + "' and arap_tally.pk_org = '" + pk_org + "' and arap_tally.pk_billtype in ( 'F1','F3') and arap_tally.dealflag in ('31','33','32','34','11','12') and arap_tally.effectstatus = 10 ";
        if (pks.size() < 101) {
            tallysql = tallysql + SqlUtils.getInStr((String)" and arap_tally.pk_bill ", (String[])pks.toArray(new String[0]), (boolean)true);
        }
        return tallysql;
    }

    private String getARTallySql(String pk_org, UFDate begindate, UFDate enddate, List<String> pks) throws Exception {
        String tallysql = "select arap_tally.pk_group,arap_tally.pk_org,arap_tally.accperiod accountperiod,arap_tally.accyear accountyear,arap_tally.pk_bill as pk_bill,case when (arap_tally.dealflag > 10 and arap_tally.dealflag < 20 ) then arap_tally.pk_corbill else null end as pk_bill2,arap_tally.customer,arap_tally.subjcode subjectcode,arap_tally.effectdate accvoucherdate,arap_tally.effectdate tallydate,case when arap_tally.pk_billtype = 'F0' then ar_recitem.rate else ar_gatheritem.rate end as rate,'\u501f' baldirection,null bal_ori,null bal_local,(arap_tally.local_money_de + arap_tally.local_money_cr) money_loc,(arap_tally.money_de + arap_tally.money_cr) money_ori,case when arap_tally.pk_billtype = 'F0' then ar_recitem.scomment else ar_gatheritem.scomment end as brief,arap_tally.pk_currtype,arap_termitem.expiredate,null verifyvoucherno,arap_tally.tallydate as busidate,case when dealflag in ('31','33') then 'BDR' when dealflag in ('32','34') then 'BDL' else arap_tally.pk_billtype end as pk_billtype ,case when dealflag in ('31','33') then 'BDR' when dealflag in ('32','34') then 'BDL' else arap_tally.pk_tradetype end as pk_tradetype ,arap_tally.billno,arap_tally.invoiceno invoice,arap_tally_all.contractno,arap_tally_all.project,case when arap_tally.pk_billtype = 'F0' then ar_recitem.pk_balatype else ar_gatheritem.pk_balatype end as pk_balatype,1 verifyflag, case when arap_tally.pk_billtype = 'F2' then ar_gatheritem.paydate else null end as recdate,case when arap_tally.pk_billtype = 'F2' then ar_gatheritem.checkno else null end as draftno from arap_tally left outer join arap_tally_all on arap_tally.pk_bill = arap_tally_all.pk_bill and arap_tally.pk_item = arap_tally_all.pk_item left outer join arap_termitem on arap_tally.pk_bill = arap_termitem.pk_bill and arap_tally.pk_item = arap_termitem.pk_item left outer join ar_recitem on arap_tally.pk_bill = ar_recitem.pk_recbill and arap_tally.pk_item = ar_recitem.pk_recitem left outer join ar_gatheritem on arap_tally.pk_bill = ar_gatheritem.pk_gatherbill and arap_tally.pk_item = ar_gatheritem.pk_gatheritem left outer join arap_verify on arap_tally.pk_dealnum = arap_verify.busino left outer join arap_bdloss on arap_tally.pk_dealnum = arap_bdloss.pk_bdloss where arap_tally.billdate >= '" + begindate + "' and arap_tally.billdate <= '" + enddate + "' and arap_tally.pk_org = '" + pk_org + "' and arap_tally.pk_billtype in ( 'F0','F2') and arap_tally.dealflag in ('31','33','32','34','11','12') and arap_tally.effectstatus = 10 ";
        if (pks.size() < 101) {
            tallysql = tallysql + SqlUtils.getInStr((String)" and arap_tally.pk_bill ", (String[])pks.toArray(new String[0]), (boolean)true);
        }
        return tallysql;
    }

    private List<String> getApBillSql(String pk_org, UFDate begindate, UFDate enddate, boolean hasjun, List<String> pks) throws Exception {
        ArrayList<String> list = new ArrayList<String>();
        String payablebillsql = "select ap_payablebill.pk_group,ap_payablebill.pk_org,ap_payablebill.billperiod as accountperiod, ap_payablebill.billyear as accountyear, ap_payableitem.pk_payablebill pk_bill,null pk_bill2,ap_payableitem.supplier,ap_payableitem.subjcode subjectcode,ap_payablebill.effectdate accvoucherdate,ap_payablebill.effectdate tallydate, ap_payableitem.rate,'\u8d37' baldirection,null bal_ori,null bal_local,ap_payableitem.local_money_bal money_loc,ap_payableitem.money_bal money_ori,ap_payableitem.scomment brief, ap_payableitem.pk_currtype,arap_termitem.expiredate,null verifyvoucherno,null busidate,ap_payableitem.pk_billtype,ap_payableitem.pk_tradetype,ap_payablebill.billno,ap_payableitem.invoiceno invoice,ap_payableitem.contractno,ap_payableitem.project,ap_payableitem.pk_balatype,0 verifyflag, null recdate,null draftno from ap_payableitem inner join ap_payablebill on ap_payablebill.pk_payablebill = ap_payableitem.pk_payablebill   inner join arap_termitem  on ap_payablebill.pk_payablebill = arap_termitem.pk_bill and ap_payableitem.pk_payableitem = arap_termitem.pk_item  where ap_payableitem.pk_org = '" + pk_org + "' and ap_payableitem.money_bal <> 0 ";
        payablebillsql = hasjun ? payablebillsql + "and ap_payableitem.billdate <= '" + enddate + "' " : payablebillsql + "and ap_payableitem.billdate >= '" + begindate + "' and ap_payableitem.billdate <= '" + enddate + "' ";
        payablebillsql = payablebillsql + " and ap_payablebill.effectstatus = 10 ";
        if (pks.size() < 101) {
            payablebillsql = payablebillsql + SqlUtils.getInStr((String)" and ap_payableitem.pk_payablebill ", (String[])pks.toArray(new String[0]), (boolean)true);
        }
        String paybillsql = "select ap_paybill.pk_group,ap_paybill.pk_org,ap_paybill.billperiod as accountperiod, ap_paybill.billyear as accountyear, ap_payitem.pk_paybill pk_bill,null pk_bill2,ap_payitem.supplier,ap_payitem.subjcode subjectcode,ap_paybill.effectdate accvoucherdate,ap_paybill.effectdate tallydate, ap_payitem.rate,'\u8d37' baldirection,null bal_ori,null bal_local,-ap_payitem.local_money_bal money_loc,-ap_payitem.money_bal money_ori,ap_payitem.scomment brief, ap_payitem.pk_currtype,arap_termitem.expiredate,null verifyvoucherno,null busidate,ap_payitem.pk_billtype,ap_payitem.pk_tradetype, ap_paybill.billno,ap_payitem.invoiceno invoice,ap_payitem.contractno,ap_payitem.project,ap_payitem.pk_balatype,0 verifyflag,ap_payitem.paydate recdate,ap_payitem.checkno draftno  from ap_payitem inner join ap_paybill on ap_paybill.pk_paybill = ap_payitem.pk_paybill  inner join arap_termitem  on ap_paybill.pk_paybill = arap_termitem.pk_bill and ap_payitem.pk_payitem = arap_termitem.pk_item  where ap_payitem.pk_org = '" + pk_org + "' and ap_payitem.money_bal <> 0 ";
        paybillsql = hasjun ? paybillsql + " and ap_payitem.billdate <= '" + enddate + "'" : paybillsql + "and ap_payitem.billdate >= '" + begindate + "' and ap_payitem.billdate <= '" + enddate + "'";
        paybillsql = paybillsql + " and ap_paybill.effectstatus = 10 ";
        if (pks.size() < 101) {
            paybillsql = paybillsql + SqlUtils.getInStr((String)" and ap_payitem.pk_paybill ", (String[])pks.toArray(new String[0]), (boolean)true);
        }
        list.add(payablebillsql);
        list.add(paybillsql);
        return list;
    }

    private ArrayList<List<Object>> resetAccperiod(ArrayList<List<Object>> dataRowList, MemoryResultSetMetaData metaData0, String pk_org) throws Exception {
        AccperiodVO yearVO = null;
        AccperiodmonthVO monthVO = null;
        int pk_voucherdateIdx = metaData0.getNameIndex("accvoucherdate");
        int pk_accperiodIdx = metaData0.getNameIndex("accountperiod");
        int pk_accyearIdx = metaData0.getNameIndex("accountyear");
        Object pk_voucherdateObj = null;
        UFDate voucherdate = null;
        String billPeriod = null;
        String billYear = null;
        for (List<Object> rowData : dataRowList) {
            pk_voucherdateObj = rowData.get(pk_voucherdateIdx);
            if (pk_voucherdateObj == null || !StringUtils.isNotEmpty((CharSequence)((String)pk_voucherdateObj)) || ((String)rowData.get(pk_accperiodIdx)).endsWith("00")) continue;
            voucherdate = new UFDate((String)pk_voucherdateObj);
            yearVO = ArapAuditExportTaskImpl.getYearVO(pk_org, voucherdate);
            monthVO = ArapAuditExportTaskImpl.getMonthVO(pk_org, voucherdate);
            if (null == yearVO || null == monthVO) {
                throw new BusinessException(NCLangRes4VoTransl.getNCLangRes().getStrByID("2006pub_0", "02006pub-0578"));
            }
            billYear = yearVO.getPeriodyear();
            billPeriod = monthVO.getAccperiodmth().trim();
            rowData.set(pk_accyearIdx, billYear);
            rowData.set(pk_accperiodIdx, billPeriod);
        }
        return dataRowList;
    }

    private Map getPkTradetypeMap(String[] pks) throws Exception {
        String billSql = "select pk_bill,pk_tradetype from arap_tally where " + SqlUtils.getInStr((String)" pk_bill ", (String[])pks, (boolean)true);
        MemoryResultSet resultSet = (MemoryResultSet)new BaseDAO().executeQuery(billSql, (ResultSetProcessor)new MemoryResultSetProcessor());
        MemoryResultSetMetaData metaData0 = resultSet.getMetaData0();
        ArrayList dataRowList = resultSet.getResultArrayList();
        Object[] dataRow = null;
        HashMap<Object, Object> pkTradetypeMap = new HashMap<Object, Object>();
        for (int i = 0; i < dataRowList.size(); ++i) {
            dataRow = ((List)dataRowList.get(i)).toArray();
            pkTradetypeMap.put(dataRow[metaData0.getNameIndex("pk_bill")], dataRow[metaData0.getNameIndex("pk_tradetype")]);
        }
        return pkTradetypeMap;
    }

    protected ArrayList<List<Object>> computeVoucher(ArrayList<List<Object>> dataRowList, MemoryResultSetMetaData metaData0) throws Exception {
        ArrayList<FipRelationInfoVO> relationInfoVOs = new ArrayList<FipRelationInfoVO>();
        Object pk_billObj = null;
        Object pk_bill2Obj = null;
        int pk_groupIdx = metaData0.getNameIndex("pk_group");
        int pk_orgIdx = metaData0.getNameIndex("pk_org");
        int pk_billIdx = metaData0.getNameIndex("pk_bill");
        int pk_bill2Idx = metaData0.getNameIndex("pk_bill2");
        int pk_tradetypeIdx = metaData0.getNameIndex("pk_tradetype");
        int vouchertypecodeIdx = metaData0.getNameIndex("vouchertypecode");
        HashSet<String> pkList = new HashSet<String>();
        FipRelationInfoVO relationInfoVO = null;
        Map relaTypeMap = new HashMap();
        for (List<Object> rowData : dataRowList) {
            pk_billObj = rowData.get(pk_billIdx);
            pk_bill2Obj = rowData.get(pk_bill2Idx);
            if (pk_billObj != null && StringUtils.isNotEmpty((CharSequence)((String)pk_billObj))) {
                pkList.add((String)pk_billObj);
            }
            if (pk_bill2Obj == null || !StringUtils.isNotEmpty((CharSequence)((String)pk_bill2Obj))) continue;
            pkList.add((String)pk_bill2Obj);
        }
        relaTypeMap = this.getPkTradetypeMap(pkList.toArray(new String[0]));
        for (List<Object> rowData : dataRowList) {
            pk_billObj = rowData.get(pk_billIdx);
            pk_bill2Obj = rowData.get(pk_bill2Idx);
            if (pk_billObj != null && StringUtils.isNotEmpty((CharSequence)((String)pk_billObj))) {
                relationInfoVO = new FipRelationInfoVO();
                relationInfoVO.setPk_group(rowData.get(pk_groupIdx).toString());
                relationInfoVO.setPk_org(rowData.get(pk_orgIdx).toString());
                relationInfoVO.setRelationID(pk_billObj.toString());
                relationInfoVO.setPk_billtype(rowData.get(pk_tradetypeIdx).toString());
                relationInfoVOs.add(relationInfoVO);
            }
            if (pk_bill2Obj == null || !StringUtils.isNotEmpty((CharSequence)((String)pk_bill2Obj))) continue;
            relationInfoVO = new FipRelationInfoVO();
            relationInfoVO.setPk_group(rowData.get(pk_groupIdx).toString());
            relationInfoVO.setPk_org(rowData.get(pk_orgIdx).toString());
            relationInfoVO.setRelationID(pk_bill2Obj.toString());
            if (relaTypeMap.get(pk_bill2Obj) == null) continue;
            relationInfoVO.setPk_billtype((String)relaTypeMap.get(pk_bill2Obj));
            relationInfoVOs.add(relationInfoVO);
        }
        List desBills = ((IFipBillQueryService)NCLocator.getInstance().lookup(IFipBillQueryService.class)).queryDesBillBySrc4WFW(relationInfoVOs.toArray(new FipRelationInfoVO[0]), null);
        Map<String, List<String>> voucherMap = this.recombine(desBills);
        if (voucherMap == null) {
            return dataRowList;
        }
        Object pk_billVal = null;
        Object pk_bill2Val = null;
        List<Object> voucherList = new ArrayList();
        for (List<Object> rowData : dataRowList) {
            pk_billVal = rowData.get(pk_billIdx);
            pk_bill2Val = rowData.get(pk_bill2Idx);
            if (!StringUtils.isEmpty((CharSequence)((String)pk_billVal))) {
                voucherList = voucherMap.get(pk_billVal);
                if (voucherList != null && voucherList.size() > 0) {
                    rowData.set(pk_billIdx, voucherList.get(0));
                    rowData.set(vouchertypecodeIdx, voucherList.get(1));
                } else {
                    rowData.set(pk_billIdx, "");
                }
            }
            if (StringUtils.isEmpty((CharSequence)((String)pk_bill2Val))) continue;
            voucherList = voucherMap.get(pk_bill2Val);
            if (voucherList != null && voucherList.size() > 0) {
                rowData.set(pk_bill2Idx, voucherList.get(0));
                continue;
            }
            rowData.set(pk_bill2Idx, "");
        }
        return dataRowList;
    }

    public static AccperiodVO getYearVO(String pk_org, UFDate currDate) throws BusinessException {
        return AccperiodAccessor.getInstance().queryAccperiodVOByPk(ArapAuditExportTaskImpl.getMonthVO(pk_org, currDate).getPk_accperiod());
    }

    public static AccperiodmonthVO getMonthVO(String pk_org, UFDate currDate) throws BusinessException {
        AccperiodmonthVO vo = AccperiodmonthAccessor.getInstance().queryAccperiodmonthVOByDate(AccperiodParamAccessor.getInstance().getAccperiodschemePkByPk_org(pk_org), currDate);
        if (vo == null) {
            ExceptionHandler.createAndThrowException((String)NCLangRes4VoTransl.getNCLangRes().getStrByID("2006pub_0", "02006pub-0579"));
        }
        return vo;
    }

    /*
     * WARNING - void declaration
     */
    protected Map<String, List<String>> recombine(List<Map<String, Object>> desBills) throws BusinessException {
        ArapTempVoucherVO tempVO = null;
        HashSet<String> resaVoucherTypeSet = new HashSet<String>();
        HashSet<String> glVoucherTypeSet = new HashSet<String>();
        ArrayList<ArapTempVoucherVO> tempVOList = new ArrayList<ArapTempVoucherVO>();
        if (desBills == null || desBills.size() <= 0) {
            return null;
        }
        for (Map<String, Object> desBill : desBills) {
            void var9_9;
            tempVO = new ArapTempVoucherVO();
            Object pk_vouchertype = desBill.get("pk_vouchertype");
            if (pk_vouchertype == null) continue;
            tempVO.setPk_vouchertype((String)pk_vouchertype);
            Object var9_10 = null;
            if (desBill.get("no") instanceof Integer) {
                String string = desBill.get("no").toString();
            } else if (desBill.get("no") == null) {
                Object var9_12 = null;
                Logger.error((Object)("-------------\u51ed\u8bc1\u4e3b\u952e" + desBill.get("des_relationid") + "------------\u7684\u51ed\u8bc1\u53f7\u4e3a\u7a7a,\u8bf7\u68c0\u67e5\u662f\u5426\u4e3a\u4e34\u65f6\u51ed\u8bc1\uff0c\u51ed\u8bc1\u7c7b\u578b\uff1a" + desBill.get("des_billtype")));
            } else {
                String string = (String)desBill.get("no");
            }
            tempVO.setVoucherid((String)var9_9);
            tempVO.setRelationID((String)desBill.get("relationId"));
            String pk_voucher = (String)desBill.get("des_relationid");
            tempVO.setPk_voucher(pk_voucher);
            String des_billtype = (String)desBill.get("des_billtype");
            if ("NRESA03".equals(des_billtype) || "RA00".equals(des_billtype)) {
                resaVoucherTypeSet.add((String)pk_vouchertype);
            } else {
                if (!"C0".equals(des_billtype)) continue;
                glVoucherTypeSet.add((String)pk_vouchertype);
            }
            tempVOList.add(tempVO);
        }
        HashMap voucherTypeMap = new HashMap();
        if (glVoucherTypeSet.size() > 0) {
            VoucherTypeVO[] glVoucherTypeVOs;
            String nameFld = "name" + PubCommonReportMethod.getMultiLangIndex();
            for (VoucherTypeVO vo : glVoucherTypeVOs = PubCommonReportMethod.queryVoucherTypeByPKs((String[])glVoucherTypeSet.toArray(new String[0]))) {
                ArrayList<String> vouchertypeList = new ArrayList<String>();
                vouchertypeList.add((String)vo.getAttributeValue(nameFld));
                vouchertypeList.add((String)vo.getAttributeValue("code"));
                voucherTypeMap.put(vo.getPk_vouchertype(), vouchertypeList);
            }
        }
        if (resaVoucherTypeSet.size() > 0) {
            SqlBuilder sql = new SqlBuilder();
            sql.append("pk_vouchertype", resaVoucherTypeSet.toArray(new String[0]));
            Object[] voucherTypes = ((IDutyVoucherTypeQueryService)NCLocator.getInstance().lookup(IDutyVoucherTypeQueryService.class)).listVoucherType(sql.toString());
            ArrayList<String> arrayList = new ArrayList<String>();
            if (ArrayUtils.isNotEmpty((Object[])voucherTypes)) {
                for (Object voucherType : voucherTypes) {
                    arrayList.add(voucherType.getName());
                    arrayList.add(voucherType.getCode());
                    voucherTypeMap.put(voucherType.getPrimaryKey(), arrayList);
                }
            }
        }
        String voucherNo = null;
        String voucherTypeCode = null;
        Object var9_18 = null;
        HashMap<String, List<String>> voucherMap = new HashMap<String, List<String>>();
        for (ArapTempVoucherVO voucherVO : tempVOList) {
            voucherVO.setVouchertypename((String)((List)voucherTypeMap.get(voucherVO.getPk_vouchertype())).get(0));
            voucherVO.setVouchertypecode((String)((List)voucherTypeMap.get(voucherVO.getPk_vouchertype())).get(1));
            if (!StringUtils.isNotEmpty((CharSequence)voucherVO.getVoucherid())) continue;
            String[] stringArray = voucherVO.getRelationID().split(",");
            ArrayList<String> voucherList = new ArrayList<String>();
            for (String relationID : stringArray) {
                voucherList.clear();
                voucherNo = voucherVO.getVoucherid();
                voucherTypeCode = voucherVO.getVouchertypecode();
                voucherList.add(voucherNo);
                voucherList.add(voucherTypeCode);
                if (voucherMap.get(relationID) == null) {
                    voucherMap.put(relationID, voucherList);
                    continue;
                }
                voucherList.clear();
                voucherList.add(voucherMap.get(relationID) + ", " + voucherNo);
                voucherList.add(voucherVO.getVouchertypecode());
                voucherMap.put(relationID, voucherList);
            }
        }
        return voucherMap;
    }

    protected Map<String, List<String>> recombine(FipExtendAggVO[] fipExtendAggVOs) throws BusinessException {
        ArapTempVoucherVO tempVO = null;
        HashSet<String> resaVoucherTypeSet = new HashSet<String>();
        HashSet<String> glVoucherTypeSet = new HashSet<String>();
        ArrayList<ArapTempVoucherVO> tempVOList = new ArrayList<ArapTempVoucherVO>();
        if (fipExtendAggVOs == null || fipExtendAggVOs.length <= 0) {
            return null;
        }
        for (FipExtendAggVO fipExtendAggVO : fipExtendAggVOs) {
            if (!(fipExtendAggVO.getBillVO() instanceof CircularlyAccessibleValueObject)) continue;
            tempVO = new ArapTempVoucherVO();
            CircularlyAccessibleValueObject voucherVO = (CircularlyAccessibleValueObject)fipExtendAggVO.getBillVO();
            if (Arrays.asList(voucherVO.getAttributeNames()).contains("vouchertype")) {
                tempVO.setPk_vouchertype((String)voucherVO.getAttributeValue("vouchertype"));
                if (StringUtils.isEmpty((CharSequence)tempVO.getPk_vouchertype())) continue;
                tempVO.setPk_voucher((String)voucherVO.getAttributeValue("pk_voucher"));
                tempVO.setVoucherid((String)voucherVO.getAttributeValue("voucherno"));
                tempVO.setRelationID(fipExtendAggVO.getRelationID());
                resaVoucherTypeSet.add(tempVO.getPk_vouchertype());
            } else {
                if (!Arrays.asList(voucherVO.getAttributeNames()).contains("pk_vouchertype")) continue;
                tempVO.setPk_vouchertype((String)voucherVO.getAttributeValue("pk_vouchertype"));
                if (StringUtils.isEmpty((CharSequence)tempVO.getPk_vouchertype())) continue;
                tempVO.setPk_voucher((String)voucherVO.getAttributeValue("pk_voucher"));
                Integer voucherid = (Integer)voucherVO.getAttributeValue("num");
                tempVO.setVoucherid(voucherid == null ? null : voucherid.toString());
                tempVO.setRelationID(fipExtendAggVO.getRelationID());
                glVoucherTypeSet.add(tempVO.getPk_vouchertype());
            }
            tempVOList.add(tempVO);
        }
        HashMap voucherTypeMap = new HashMap();
        if (glVoucherTypeSet.size() > 0) {
            VoucherTypeVO[] glVoucherTypeVOs;
            String nameFld = "name" + PubCommonReportMethod.getMultiLangIndex();
            for (VoucherTypeVO vo : glVoucherTypeVOs = PubCommonReportMethod.queryVoucherTypeByPKs((String[])glVoucherTypeSet.toArray(new String[0]))) {
                ArrayList<String> vouchertypeList = new ArrayList<String>();
                vouchertypeList.add((String)vo.getAttributeValue(nameFld));
                vouchertypeList.add((String)vo.getAttributeValue("code"));
                voucherTypeMap.put(vo.getPk_vouchertype(), vouchertypeList);
            }
        }
        if (resaVoucherTypeSet.size() > 0) {
            SqlBuilder sql = new SqlBuilder();
            sql.append("pk_vouchertype", resaVoucherTypeSet.toArray(new String[0]));
            Object[] voucherTypes = ((IDutyVoucherTypeQueryService)NCLocator.getInstance().lookup(IDutyVoucherTypeQueryService.class)).listVoucherType(sql.toString());
            ArrayList<String> arrayList = new ArrayList<String>();
            if (ArrayUtils.isNotEmpty((Object[])voucherTypes)) {
                for (Object voucherType : voucherTypes) {
                    arrayList.add(voucherType.getName());
                    arrayList.add(voucherType.getCode());
                    voucherTypeMap.put(voucherType.getPrimaryKey(), arrayList);
                }
            }
        }
        String voucherNo = null;
        String voucherTypeCode = null;
        Object var9_20 = null;
        HashMap<String, List<String>> voucherMap = new HashMap<String, List<String>>();
        for (ArapTempVoucherVO voucherVO : tempVOList) {
            voucherVO.setVouchertypename((String)((List)voucherTypeMap.get(voucherVO.getPk_vouchertype())).get(0));
            voucherVO.setVouchertypecode((String)((List)voucherTypeMap.get(voucherVO.getPk_vouchertype())).get(1));
            if (!StringUtils.isNotEmpty((CharSequence)voucherVO.getVoucherid())) continue;
            String[] stringArray = voucherVO.getRelationID().split(",");
            ArrayList<String> voucherList = new ArrayList<String>();
            for (String relationID : stringArray) {
                voucherList.clear();
                voucherNo = voucherVO.getVoucherid();
                voucherTypeCode = voucherVO.getVouchertypecode();
                voucherList.add(voucherNo);
                voucherList.add(voucherTypeCode);
                if (voucherMap.get(relationID) == null) {
                    voucherMap.put(relationID, voucherList);
                    continue;
                }
                voucherList.clear();
                voucherList.add(voucherMap.get(relationID) + ", " + voucherNo);
                voucherList.add(voucherVO.getVouchertypecode());
                voucherMap.put(relationID, voucherList);
            }
        }
        return voucherMap;
    }

    private void resetARCheckno(List<ARDetailVO> arDetailVOList) {
        HashSet<String> checknoSet = new HashSet<String>();
        String checkno = "";
        HashMap<String, String> map = new HashMap<String, String>();
        for (int i = 0; i < arDetailVOList.size(); ++i) {
            checkno = arDetailVOList.get(i).getDraftno();
            if (checkno == null || checkno.equals("")) continue;
            checknoSet.add(checkno);
            map.put(checkno, checkno);
        }
        try {
            Collection result = MDPersistenceService.lookupPersistenceQueryService().queryBillOfVOByPKs(RegisterVO.class, checknoSet.toArray(new String[0]), false);
            if (result != null && result.size() > 0) {
                RegisterVO[] registerVO = result.toArray(new RegisterVO[0]);
                for (int i = 0; i < result.size(); ++i) {
                    map.put(registerVO[i].getPk_register(), registerVO[i].getFbmbillno());
                }
            }
        }
        catch (Exception result) {
            // empty catch block
        }
        for (int i = 0; i < arDetailVOList.size(); ++i) {
            checkno = arDetailVOList.get(i).getDraftno();
            if (checkno == null || checkno.equals("")) continue;
            arDetailVOList.get(i).setDraftno((String)map.get(checkno));
        }
    }

    private void resetAPCheckno(List<APDetailVO> apDetailVOList) {
        HashSet<String> checknoSet = new HashSet<String>();
        String checkno = "";
        HashMap<String, String> map = new HashMap<String, String>();
        for (int i = 0; i < apDetailVOList.size(); ++i) {
            checkno = apDetailVOList.get(i).getDraftno();
            if (checkno == null || checkno.equals("")) continue;
            checknoSet.add(checkno);
            map.put(checkno, checkno);
        }
        try {
            Collection result = MDPersistenceService.lookupPersistenceQueryService().queryBillOfVOByPKs(RegisterVO.class, checknoSet.toArray(new String[0]), false);
            if (result != null && result.size() > 0) {
                RegisterVO[] registerVO = result.toArray(new RegisterVO[0]);
                for (int i = 0; i < result.size(); ++i) {
                    map.put(registerVO[i].getPk_register(), registerVO[i].getFbmbillno());
                }
            }
        }
        catch (Exception result) {
            // empty catch block
        }
        for (int i = 0; i < apDetailVOList.size(); ++i) {
            checkno = apDetailVOList.get(i).getDraftno();
            if (checkno == null || checkno.equals("")) continue;
            apDetailVOList.get(i).setDraftno((String)map.get(checkno));
        }
    }

    private boolean isProductTbbInstalled(String pro) {
        boolean value = false;
        try {
            ProductVersionVO[] ProductVersionVOs = ((IProductVersionQueryService)NCLocator.getInstance().lookup(IProductVersionQueryService.class)).queryByProductCode(pro);
            value = ProductVersionVOs != null && ProductVersionVOs.length != 0;
        }
        catch (BusinessException e) {
            ExceptionHandler.consume((Throwable)e);
        }
        return value;
    }
}


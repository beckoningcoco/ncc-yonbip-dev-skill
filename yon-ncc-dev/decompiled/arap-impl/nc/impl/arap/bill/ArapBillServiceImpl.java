/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  nc.bs.arap.bill.brdeal.BRConditionVO
 *  nc.bs.arap.util.SqlUtils
 *  nc.bs.dao.BaseDAO
 *  nc.bs.dao.DAOException
 *  nc.bs.framework.common.NCLocator
 *  nc.bs.logging.Logger
 *  nc.itf.arap.bill.IArapBillService
 *  nc.itf.arap.initgatheringbill.IArapInitGatheringService
 *  nc.itf.arap.initpayablebill.IArapInitPayableService
 *  nc.itf.arap.initpaybill.IArapInitPaybillService
 *  nc.itf.arap.initreceivable.IArapInitRecService
 *  nc.jdbc.framework.processor.ArrayListProcessor
 *  nc.jdbc.framework.processor.ColumnProcessor
 *  nc.jdbc.framework.processor.ResultSetProcessor
 *  nc.md.model.MetaDataException
 *  nc.md.persist.framework.MDPersistenceService
 *  nc.utils.fipub.MemoryResultSetProcessor
 *  nc.vo.arap.basebill.BaseAggVO
 *  nc.vo.arap.basebill.BaseBillVO
 *  nc.vo.arap.gathering.AggGatheringBillVO
 *  nc.vo.arap.global.ArapCommonTool
 *  nc.vo.arap.pay.AggPayBillVO
 *  nc.vo.arap.payable.AggPayableBillVO
 *  nc.vo.arap.receivable.AggReceivableBillVO
 *  nc.vo.fipub.annotation.Business
 *  nc.vo.fipub.report.AggReportInitializeVO
 *  nc.vo.fipub.report.PubCommonReportMethod
 *  nc.vo.fipub.report.QryObj
 *  nc.vo.gl.busirecon.query.BusiReconQryVO
 *  nc.vo.gl.busirecon.query.BusiRuleVO
 *  nc.vo.pub.AggregatedValueObject
 *  nc.vo.pub.BusinessException
 *  nc.vo.pub.SuperVO
 *  nc.vo.pub.billtype.BilltypeVO
 *  nc.vo.pub.lang.UFDate
 *  nc.vo.pub.rs.MemoryResultSet
 *  nccloud.commons.lang.ArrayUtils
 */
package nc.impl.arap.bill;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import nc.bs.arap.bill.brdeal.BRConditionVO;
import nc.bs.arap.util.SqlUtils;
import nc.bs.dao.BaseDAO;
import nc.bs.dao.DAOException;
import nc.bs.framework.common.NCLocator;
import nc.bs.logging.Logger;
import nc.itf.arap.bill.IArapBillService;
import nc.itf.arap.initgatheringbill.IArapInitGatheringService;
import nc.itf.arap.initpayablebill.IArapInitPayableService;
import nc.itf.arap.initpaybill.IArapInitPaybillService;
import nc.itf.arap.initreceivable.IArapInitRecService;
import nc.jdbc.framework.processor.ArrayListProcessor;
import nc.jdbc.framework.processor.ColumnProcessor;
import nc.jdbc.framework.processor.ResultSetProcessor;
import nc.md.model.MetaDataException;
import nc.md.persist.framework.MDPersistenceService;
import nc.utils.fipub.MemoryResultSetProcessor;
import nc.vo.arap.basebill.BaseAggVO;
import nc.vo.arap.basebill.BaseBillVO;
import nc.vo.arap.gathering.AggGatheringBillVO;
import nc.vo.arap.global.ArapCommonTool;
import nc.vo.arap.pay.AggPayBillVO;
import nc.vo.arap.payable.AggPayableBillVO;
import nc.vo.arap.receivable.AggReceivableBillVO;
import nc.vo.fipub.annotation.Business;
import nc.vo.fipub.report.AggReportInitializeVO;
import nc.vo.fipub.report.PubCommonReportMethod;
import nc.vo.fipub.report.QryObj;
import nc.vo.gl.busirecon.query.BusiReconQryVO;
import nc.vo.gl.busirecon.query.BusiRuleVO;
import nc.vo.pub.AggregatedValueObject;
import nc.vo.pub.BusinessException;
import nc.vo.pub.SuperVO;
import nc.vo.pub.billtype.BilltypeVO;
import nc.vo.pub.lang.UFDate;
import nc.vo.pub.rs.MemoryResultSet;
import nccloud.commons.lang.ArrayUtils;

public class ArapBillServiceImpl
implements IArapBillService {
    public int updatePrintStatus(String table, String pkname, String pk, String printer, UFDate printtime) throws BusinessException {
        int value = 0;
        String sql = "update " + table + " set officialprintdate = '" + printtime.toLocalString() + "',officialprintuser = '" + printer + "' where " + pkname + " = '" + pk + "'";
        BaseDAO dao = new BaseDAO();
        value = dao.executeUpdate(sql);
        return value;
    }

    @Business(business="\u57fa\u7840\u5355\u636e", subBusiness="\u7ea2\u51b2", description="\u5220\u9664\u7ea2\u51b2\u5355\u636e\u56de\u5199\u539f\u5355\u636e\u662f\u5426\u7ea2\u51b2\u72b6\u6001", type="\u666e\u901a\u4e1a\u52a1")
    public void updateIsredFlag(String table, String pkfield, String primarykey) throws BusinessException {
        String sql = "update " + table + " set isreded = 'N' where " + pkfield + " = '" + primarykey + "'";
        BaseDAO dao = new BaseDAO();
        dao.executeUpdate(sql);
    }

    public int updateParentVO(BaseBillVO vo) throws BusinessException {
        BaseDAO dao = new BaseDAO();
        MDPersistenceService.lookupPersistenceService().saveBill((Object)vo);
        return dao.updateVO((SuperVO)vo);
    }

    public String updateCancelConfirmInfo(String table, String pkfield, String primarykey) throws BusinessException {
        int i = 0;
        String ts = null;
        BaseDAO dao = new BaseDAO();
        String sql = "update " + table + " set coordflag = 0 , billstatus = '" + 9 + "' where " + pkfield + " = '" + primarykey + "'";
        i = dao.executeUpdate(sql);
        if (i > 0) {
            sql = "select ts from " + table + " where " + pkfield + " = '" + primarykey + "'";
            ts = (String)dao.executeQuery(sql, (ResultSetProcessor)new ColumnProcessor(1));
        }
        return ts;
    }

    public void updateConfirmInfo(String table, String pkfield, String primarykey) throws BusinessException {
        String sql = "update " + table + " set coordflag = 0 , billstatus = '" + 9 + "' where " + pkfield + " = '" + primarykey + "'";
        BaseDAO dao = new BaseDAO();
        dao.executeUpdate(sql);
    }

    public AggReportInitializeVO getAggReportInitializeVO(String pk) throws DAOException {
        AggReportInitializeVO aggReportInitializeVO = null;
        BaseDAO dao = new BaseDAO();
        aggReportInitializeVO = (AggReportInitializeVO)dao.retrieveByPK(AggReportInitializeVO.class, pk);
        return aggReportInitializeVO;
    }

    public List<QryObj> getReportQryObj(String bd_mdid) {
        String sql = "select * from fipub_reportinitialize_b where pk_reportinitialize in ( select b.pk_reportinitialize from fipub_reportinitialize a, fipub_reportinitialize_b b where a.pk_reportinitialize = b.pk_reportinitialize and reporttype = 'balance' group by b.pk_reportinitialize having count(*) = 1 )\tand bd_mdid = '" + bd_mdid + "'";
        BaseDAO dao = new BaseDAO();
        final ArrayList<QryObj> result = new ArrayList<QryObj>();
        try {
            dao.executeQuery(sql, new ResultSetProcessor(){
                private static final long serialVersionUID = 1L;

                public Object handleResultSet(ResultSet rs) throws SQLException {
                    while (rs.next()) {
                        QryObj qryObj = new QryObj();
                        qryObj.setOwnModule("arap");
                        qryObj.setDspName(rs.getString("dsp_objname"));
                        qryObj.setOriginTbl(rs.getString("qry_objtablename"));
                        qryObj.setOriginFld(rs.getString("qry_objfieldname"));
                        qryObj.setPk_bdinfo(rs.getString("bd_mdid"));
                        qryObj.setIncludeLowLevel(false);
                        qryObj.setBd_name(rs.getString("bd_refname"));
                        qryObj.setBd_table(rs.getString("bd_tablename"));
                        qryObj.setBd_pkField(rs.getString("bd_pkfield"));
                        qryObj.setBd_codeField(rs.getString("bd_codefield"));
                        qryObj.setBd_nameField(rs.getString("bd_namefield"));
                        qryObj.setBillFieldName(rs.getString("billfieldname"));
                        qryObj.setTallyFieldName(rs.getString("tallyfieldname"));
                        qryObj.setBalFieldName(rs.getString("balfieldname"));
                        result.add(qryObj);
                    }
                    return rs;
                }
            });
        }
        catch (DAOException e) {
            Logger.error((Object)e.getMessage(), (Throwable)e);
        }
        return result;
    }

    public List<QryObj> getReportQryObjForIUFO(String bd_mdid) {
        String sql = "select * from fipub_queryobj where ownmodule = 'arap' and bd_mdid = '" + bd_mdid + "'";
        BaseDAO dao = new BaseDAO();
        final ArrayList<QryObj> result = new ArrayList<QryObj>();
        try {
            dao.executeQuery(sql, new ResultSetProcessor(){
                private static final long serialVersionUID = 1L;

                public Object handleResultSet(ResultSet rs) throws SQLException {
                    while (rs.next()) {
                        QryObj qryObj = new QryObj();
                        qryObj.setOwnModule("arap");
                        qryObj.setDspName(rs.getString("dsp_objname"));
                        qryObj.setOriginTbl(rs.getString("qry_objtablename"));
                        qryObj.setOriginFld(rs.getString("qry_objfieldname"));
                        qryObj.setPk_bdinfo(rs.getString("bd_mdid"));
                        qryObj.setIncludeLowLevel(false);
                        qryObj.setBd_name(rs.getString("bd_refname"));
                        qryObj.setBd_table(rs.getString("bd_tablename"));
                        qryObj.setBd_pkField(rs.getString("bd_pkfield"));
                        qryObj.setBd_codeField(rs.getString("bd_codefield"));
                        qryObj.setBd_nameField(rs.getString("bd_namefield"));
                        qryObj.setBillFieldName(rs.getString("billfieldname"));
                        qryObj.setTallyFieldName(rs.getString("tallyfieldname"));
                        qryObj.setBalFieldName(rs.getString("balfieldname"));
                        result.add(qryObj);
                    }
                    return rs;
                }
            });
        }
        catch (DAOException e) {
            Logger.error((Object)e.getMessage(), (Throwable)e);
        }
        return result;
    }

    public String getNodeCodeByMdid(String bd_mdid) {
        String sql = "select a.nodecode from fipub_reportinitialize a, fipub_reportinitialize_b b where a.pk_reportinitialize in ( select b.pk_reportinitialize from fipub_reportinitialize a, fipub_reportinitialize_b b where a.pk_reportinitialize = b.pk_reportinitialize and reporttype = 'balance' group by b.pk_reportinitialize having count(*) = 1 ) and a.pk_reportinitialize = b.pk_reportinitialize\tand b.bd_mdid = '" + bd_mdid + "'";
        BaseDAO dao = new BaseDAO();
        String result = null;
        try {
            result = (String)dao.executeQuery(sql, (ResultSetProcessor)new ColumnProcessor(1));
        }
        catch (DAOException e) {
            Logger.error((Object)e.getMessage(), (Throwable)e);
        }
        return result;
    }

    public AggReportInitializeVO getReportInitializeVOByMdid(String bd_mdid) throws BusinessException {
        String sql = "select a.pk_reportinitialize from fipub_reportinitialize a, fipub_reportinitialize_b b where a.pk_reportinitialize in ( select b.pk_reportinitialize from fipub_reportinitialize a, fipub_reportinitialize_b b where a.pk_reportinitialize = b.pk_reportinitialize and reporttype = 'balance' and (isweb is null or isweb = 'N') group by b.pk_reportinitialize having count(*) = 1 ) and a.pk_reportinitialize = b.pk_reportinitialize\tand b.bd_mdid = '" + bd_mdid + "'";
        Object result = new BaseDAO().executeQuery(sql, (ResultSetProcessor)new ArrayListProcessor());
        if (result == null || !(result instanceof List) || ((List)result).size() == 0) {
            return null;
        }
        List resultList = (List)result;
        String pk_reportinitialize = (String)((Object[])resultList.get(0))[0];
        return (AggReportInitializeVO)MDPersistenceService.lookupPersistenceQueryService().queryBillOfVOByPK(AggReportInitializeVO.class, pk_reportinitialize, false);
    }

    public String getFuncIdByNodeCode(String nodeCode) throws BusinessException {
        String sql = "select cfunid from sm_funcregister where funcode = '" + nodeCode + "'";
        BaseDAO dao = new BaseDAO();
        return (String)dao.executeQuery(sql, (ResultSetProcessor)new ColumnProcessor(1));
    }

    public BilltypeVO[] queryBillTypeByWhereStr(String where) throws BusinessException {
        BaseDAO dao = new BaseDAO();
        Collection cl = dao.retrieveByClause(BilltypeVO.class, where);
        BilltypeVO[] billTypeVO = (BilltypeVO[])ArapCommonTool.changeCollection2Array((Collection)cl, BilltypeVO.class);
        return billTypeVO;
    }

    public String getParentBillTypeByTradeType(String tradeType, String pk_group) {
        String sql = "select parentbilltype from bd_billtype where pk_billtypecode = '" + tradeType + "' and pk_group = '" + pk_group + "'";
        BaseDAO dao = new BaseDAO();
        String result = null;
        try {
            result = (String)dao.executeQuery(sql, (ResultSetProcessor)new ColumnProcessor(1));
        }
        catch (DAOException e) {
            Logger.error((Object)e.getMessage(), (Throwable)e);
        }
        return result;
    }

    public boolean isInitBillCanEditOrDelete(String[] pk_bills) {
        if (!ArrayUtils.isEmpty((Object[])pk_bills)) {
            BaseDAO dao = new BaseDAO();
            try {
                String sql = "select count(1) from arap_tally where " + SqlUtils.getInStr((String)"pk_bill", (String[])pk_bills) + " and pk_dealnum != '~'";
                Integer result = (Integer)dao.executeQuery(sql, (ResultSetProcessor)new ColumnProcessor(1));
                if (result != null && result > 0) {
                    return false;
                }
            }
            catch (BusinessException e) {
                Logger.error((Object)e.getMessage(), (Throwable)e);
            }
        }
        return true;
    }

    public MemoryResultSet[] queryBrBillForGL(BusiReconQryVO queryVO, BusiRuleVO ruleVO) throws SQLException, BusinessException {
        BRConditionVO brConditionVO = (BRConditionVO)ruleVO.getBrQueryObj();
        String[] billTypes = brConditionVO.getBilltypecodes();
        MemoryResultSet[] resultSets = new MemoryResultSet[billTypes.length];
        for (int i = 0; i < billTypes.length; ++i) {
            String[] tableName = this.getTableName(billTypes[i]);
            String sql = "select ";
            sql = sql + tableName[1] + this.getPkBillField(billTypes[i]) + " as pk_bill, " + tableName[1] + ".pk_org, " + tableName[1] + ".billdate, " + tableName[1] + ".pk_billtype, " + tableName[1] + ".pk_tradetype, " + tableName[1] + ".billno, " + tableName[1] + ".pk_currtype, " + tableName[1] + ".postunit, sum(" + tableName[1] + ".quantity_bal) as quantity_bal, sum(" + tableName[1] + ".money_bal) as money_bal, sum(" + tableName[1] + ".local_money_bal) as local_money_bal, sum(" + tableName[1] + ".groupbalance) as groupbalance, sum(" + tableName[1] + ".globalbalance) as globalbalance";
            sql = sql + " from " + tableName[2];
            sql = sql + " where " + tableName[1] + ".objtype = " + brConditionVO.getObjtype() + " and " + tableName[1] + ".pk_billtype = '" + billTypes[i] + "' and " + tableName[1] + ".billdate >= '" + queryVO.getBeginDate() + "' and " + tableName[1] + ".billdate <= '" + queryVO.getEndDate() + "' and " + tableName[1] + ".dr = 0 and " + tableName[1] + ".pk_group = '" + queryVO.getPk_group() + "' and " + tableName[1] + ".pk_org = '" + queryVO.getPk_org() + "' and " + SqlUtils.getInStr((String)(tableName[1] + ".pk_currtype "), (String[])queryVO.getPk_currtype(), (boolean[])new boolean[]{true});
            sql = sql + this.getFreeValues(ruleVO);
            if (brConditionVO.getPk_tradetypes() != null && brConditionVO.getPk_tradetypes().length > 0) {
                sql = sql + " and " + SqlUtils.getInStr((String)(tableName[1] + ".pk_tradetype "), (String[])brConditionVO.getTradetypecodes(), (boolean[])new boolean[]{true});
            }
            if (brConditionVO.getSubjcodes() != null && brConditionVO.getSubjcodes().length > 0) {
                sql = sql + " and " + SqlUtils.getInStr((String)(tableName[1] + ".subjcode "), (String[])brConditionVO.getSubjcodes(), (boolean[])new boolean[]{true});
            }
            if (brConditionVO.getSubjcode_hs() != null && brConditionVO.getSubjcode_hs().length > 0) {
                sql = sql + " and " + SqlUtils.getInStr((String)(tableName[0] + ".subjcode "), (String[])brConditionVO.getSubjcode_hs(), (boolean[])new boolean[]{true});
            }
            sql = sql + " and " + tableName[0] + ".effectstatus = 10 ";
            sql = sql + " group by " + tableName[1] + this.getPkBillField(billTypes[i]) + ", " + tableName[1] + ".pk_org, " + tableName[1] + ".billdate, " + tableName[1] + ".pk_billtype, " + tableName[1] + ".pk_tradetype, " + tableName[1] + ".billno, " + tableName[1] + ".pk_currtype, " + tableName[1] + ".postunit";
            this.doQuery(resultSets, i, sql);
        }
        return resultSets;
    }

    private void doQuery(MemoryResultSet[] resultSets, int i, String sql) throws SQLException, MetaDataException {
        BaseDAO dao = new BaseDAO();
        try {
            MemoryResultSet resultSet = (MemoryResultSet)dao.executeQuery(sql, (ResultSetProcessor)new MemoryResultSetProcessor());
            if (resultSet != null && resultSet.getResultArrayList() != null && resultSet.getResultArrayList().size() > 0) {
                PubCommonReportMethod.insertNameColumn((MemoryResultSet)resultSet, (String)"985be8a4-3a36-4778-8afe-2d8ed3902659", (String)"pk_org", (String)"org");
                PubCommonReportMethod.insertNameColumn((MemoryResultSet)resultSet, (String)"b0fa41cd-a649-4309-b685-d341a5d1b0ed", (String)"pk_billtype", (String)"billtype");
                PubCommonReportMethod.insertNameColumn((MemoryResultSet)resultSet, (String)"b0fa41cd-a649-4309-b685-d341a5d1b0ed", (String)"pk_tradetype", (String)"tradetype");
                resultSets[i] = resultSet;
            }
        }
        catch (DAOException e) {
            Logger.error((Object)e.getMessage(), (Throwable)e);
        }
    }

    private String getFreeValues(BusiRuleVO ruleVO) {
        String wheresql = "";
        String[] freeTypes = ruleVO.getBrFreeTypes();
        String[] freeValues = ruleVO.getBrFreeValues();
        if (freeTypes != null && freeValues != null && freeTypes.length == freeValues.length) {
            for (int i = 0; i < freeTypes.length; ++i) {
                wheresql = wheresql + " and " + freeTypes[i] + " = '" + freeValues[i] + "' ";
            }
        }
        return wheresql;
    }

    private String getPkBillField(String billType) {
        String relationIDField = "";
        if ("F0".equals(billType)) {
            relationIDField = ".pk_recbill";
        } else if ("F1".equals(billType)) {
            relationIDField = ".pk_payablebill";
        } else if ("F2".equals(billType)) {
            relationIDField = ".pk_gatherbill";
        } else if ("F3".equals(billType)) {
            relationIDField = ".pk_paybill";
        } else if ("23E0".equals(billType)) {
            relationIDField = ".pk_estirecbill";
        } else if ("23E1".equals(billType)) {
            relationIDField = ".pk_estipayablebill";
        }
        return relationIDField;
    }

    private String[] getTableName(String billType) {
        String[] tableName = new String[3];
        if ("F0".equals(billType)) {
            tableName[0] = "ar_recbill";
            tableName[1] = "ar_recitem";
            tableName[2] = "ar_recbill inner join ar_recitem on ar_recbill.pk_recbill = ar_recitem.pk_recbill";
        } else if ("F1".equals(billType)) {
            tableName[0] = "ap_payablebill";
            tableName[1] = "ap_payableitem";
            tableName[2] = "ap_payablebill inner join ap_payableitem on ap_payablebill.pk_payablebill = ap_payableitem.pk_payablebill";
        } else if ("F2".equals(billType)) {
            tableName[0] = "ar_gatherbill";
            tableName[1] = "ar_gatheritem";
            tableName[2] = "ar_gatherbill inner join ar_gatheritem on ar_gatherbill.pk_gatherbill = ar_gatheritem.pk_gatherbill";
        } else if ("F3".equals(billType)) {
            tableName[0] = "ap_paybill";
            tableName[1] = "ap_payitem";
            tableName[2] = "ap_paybill inner join ap_payitem on ap_paybill.pk_paybill = ap_payitem.pk_paybill";
        } else if ("23E0".equals(billType)) {
            tableName[0] = "ar_estirecbill";
            tableName[1] = "ar_estirecitem";
            tableName[2] = "ar_estirecbill inner join ar_estirecitem on ar_estirecbill.pk_estirecbill = ar_estirecitem.pk_estirecbill";
        } else if ("23E1".equals(billType)) {
            tableName[0] = "ap_estipayablebill";
            tableName[1] = "ap_estipayableitem";
            tableName[2] = "ap_estipayablebill inner join ap_estipayableitem on ap_estipayablebill.pk_estipayablebill = ap_estipayableitem.pk_estipayablebill";
        }
        return tableName;
    }

    public Object[] save(AggregatedValueObject[] bills, String pkBilltype) throws BusinessException {
        Object[] bill = new Object[bills.length];
        int i = 0;
        for (AggregatedValueObject vo : bills) {
            String object = null;
            try {
                if ("F0".equals(pkBilltype)) {
                    ((IArapInitRecService)NCLocator.getInstance().lookup(IArapInitRecService.class)).save((BaseAggVO)((AggReceivableBillVO)vo));
                } else if ("F1".equals(pkBilltype)) {
                    ((IArapInitPayableService)NCLocator.getInstance().lookup(IArapInitPayableService.class)).save((BaseAggVO)((AggPayableBillVO)vo));
                } else if ("F2".equals(pkBilltype)) {
                    ((IArapInitGatheringService)NCLocator.getInstance().lookup(IArapInitGatheringService.class)).save((BaseAggVO)((AggGatheringBillVO)vo));
                } else if ("F3".equals(pkBilltype)) {
                    ((IArapInitPaybillService)NCLocator.getInstance().lookup(IArapInitPaybillService.class)).save((BaseAggVO)((AggPayBillVO)vo));
                }
            }
            catch (Exception exception) {
                object = exception.getMessage();
            }
            bill[i] = object;
            ++i;
        }
        return bill;
    }
}


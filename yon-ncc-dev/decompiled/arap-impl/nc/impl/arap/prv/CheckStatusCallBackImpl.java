/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  nc.bs.arap.billact.BillBaseBSAction
 *  nc.bs.arap.util.BillTradetypeUtils
 *  nc.bs.dao.BaseDAO
 *  nc.bs.dao.DAOException
 *  nc.bs.framework.common.InvocationInfoProxy
 *  nc.bs.framework.common.NCLocator
 *  nc.bs.framework.common.RuntimeEnv
 *  nc.bs.logging.Logger
 *  nc.bs.pf.pub.PfDataCache
 *  nc.bs.pub.pf.CheckStatusCallbackContext
 *  nc.bs.pub.pf.IPrintDataGetter
 *  nc.bs.pub.pf.PfUtilTools
 *  nc.bs.uap.lock.PKLock
 *  nc.bs.uif2.LockFailedException
 *  nc.itf.arap.prv.ICheckStatusCallBack
 *  nc.itf.uap.print.IPrintEntry
 *  nc.jdbc.framework.JdbcSession
 *  nc.jdbc.framework.PersistenceManager
 *  nc.jdbc.framework.SQLParameter
 *  nc.jdbc.framework.exception.DbException
 *  nc.jdbc.framework.processor.ColumnListProcessor
 *  nc.jdbc.framework.processor.ColumnProcessor
 *  nc.jdbc.framework.processor.ResultSetProcessor
 *  nc.ui.pub.print.IDataSource
 *  nc.vo.arap.basebill.BaseAggVO
 *  nc.vo.arap.basebill.BaseBillVO
 *  nc.vo.arap.pub.BillEnumCollection$ApproveStatus
 *  nc.vo.arap.pub.BillEnumCollection$BillSatus
 *  nc.vo.fipub.utils.SqlBuilder
 *  nc.vo.gl.vouchertools.XML_VoucherTranslator
 *  nc.vo.jcom.io.FileUtil
 *  nc.vo.jcom.lang.StringUtil
 *  nc.vo.ml.NCLangRes4VoTransl
 *  nc.vo.pub.AggregatedValueObject
 *  nc.vo.pub.BusinessException
 *  nc.vo.pub.billtype.BilltypeVO
 *  nc.vo.pub.lang.UFDate
 *  nc.vo.pub.lang.UFDateTime
 *  nc.vo.trade.sqlutil.IInSqlBatchCallBack
 *  nc.vo.trade.sqlutil.InSqlBatchCaller
 *  nc.vo.uap.pf.PFBusinessException
 *  nc.vo.wfengine.definition.WorkflowTypeEnum
 *  nc.vo.wfengine.pub.WfTaskOrInstanceStatus
 *  nccloud.bs.arap.sagas.compensate.info.ApproveInfo
 *  nccloud.bs.arap.sagas.compensate.utils.ApproveCompenstateUtils
 *  nccloud.bs.arap.sagas.util.SagasUtils
 *  nccloud.commons.lang.StringUtils
 *  uap.iweb.wf.vo.WorkFlowQueryUtil
 */
package nc.impl.arap.prv;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Serializable;
import java.io.Writer;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashSet;
import nc.bs.arap.billact.BillBaseBSAction;
import nc.bs.arap.util.BillTradetypeUtils;
import nc.bs.dao.BaseDAO;
import nc.bs.dao.DAOException;
import nc.bs.framework.common.InvocationInfoProxy;
import nc.bs.framework.common.NCLocator;
import nc.bs.framework.common.RuntimeEnv;
import nc.bs.logging.Logger;
import nc.bs.pf.pub.PfDataCache;
import nc.bs.pub.pf.CheckStatusCallbackContext;
import nc.bs.pub.pf.IPrintDataGetter;
import nc.bs.pub.pf.PfUtilTools;
import nc.bs.uap.lock.PKLock;
import nc.bs.uif2.LockFailedException;
import nc.itf.arap.prv.ICheckStatusCallBack;
import nc.itf.uap.print.IPrintEntry;
import nc.jdbc.framework.JdbcSession;
import nc.jdbc.framework.PersistenceManager;
import nc.jdbc.framework.SQLParameter;
import nc.jdbc.framework.exception.DbException;
import nc.jdbc.framework.processor.ColumnListProcessor;
import nc.jdbc.framework.processor.ColumnProcessor;
import nc.jdbc.framework.processor.ResultSetProcessor;
import nc.ui.pub.print.IDataSource;
import nc.vo.arap.basebill.BaseAggVO;
import nc.vo.arap.basebill.BaseBillVO;
import nc.vo.arap.pub.BillEnumCollection;
import nc.vo.fipub.utils.SqlBuilder;
import nc.vo.gl.vouchertools.XML_VoucherTranslator;
import nc.vo.jcom.io.FileUtil;
import nc.vo.jcom.lang.StringUtil;
import nc.vo.ml.NCLangRes4VoTransl;
import nc.vo.pub.AggregatedValueObject;
import nc.vo.pub.BusinessException;
import nc.vo.pub.billtype.BilltypeVO;
import nc.vo.pub.lang.UFDate;
import nc.vo.pub.lang.UFDateTime;
import nc.vo.trade.sqlutil.IInSqlBatchCallBack;
import nc.vo.trade.sqlutil.InSqlBatchCaller;
import nc.vo.uap.pf.PFBusinessException;
import nc.vo.wfengine.definition.WorkflowTypeEnum;
import nc.vo.wfengine.pub.WfTaskOrInstanceStatus;
import nccloud.bs.arap.sagas.compensate.info.ApproveInfo;
import nccloud.bs.arap.sagas.compensate.utils.ApproveCompenstateUtils;
import nccloud.bs.arap.sagas.util.SagasUtils;
import nccloud.commons.lang.StringUtils;
import uap.iweb.wf.vo.WorkFlowQueryUtil;

public class CheckStatusCallBackImpl
implements ICheckStatusCallBack {
    private static final String NCHOME = RuntimeEnv.getInstance().getNCHome();
    private static final String UPLOAD_CONFIG = NCHOME + "/webapps/nc_web/ncupload/";

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public String generateBillHtml(String billno, String billID, String billType, String templateid) throws BusinessException {
        String billHtml = null;
        String documentid = null;
        String filePath = "";
        try (ByteArrayOutputStream bos = new ByteArrayOutputStream();
             OutputStreamWriter osw = new OutputStreamWriter((OutputStream)bos, "UTF-8");){
            if (StringUtil.isEmptyWithTrim((String)templateid)) {
                String string = null;
                return string;
            }
            IDataSource ds = this.getDataSourceOf(billType, billID);
            if (ds == null) {
                String string = null;
                return string;
            }
            IPrintEntry printEntry = (IPrintEntry)NCLocator.getInstance().lookup(IPrintEntry.class.getName());
            IDataSource[] dataSources = new IDataSource[]{ds};
            printEntry.exportHtml(dataSources, templateid, (Writer)osw);
            billHtml = bos.toString();
            billHtml = "<p align=center>" + billHtml + "</p>";
            filePath = UPLOAD_CONFIG + billno + ".html";
            XML_VoucherTranslator.saveToFile((String)filePath, (StringBuffer)new StringBuffer(billHtml));
            return documentid;
        }
        catch (Exception e) {
            Logger.error((Object)(">>\u540e\u53f0\u6253\u5370\u6a21\u677f\u8f93\u51faHTML\u51fa\u9519=" + e.getMessage()), (Throwable)e);
            return documentid;
        }
        finally {
            FileUtil.delete((File)new File(filePath));
        }
    }

    private IDataSource getDataSourceOf(String billType, String billid) throws BusinessException {
        Object o;
        BilltypeVO btVO = PfDataCache.getBillType((String)billType);
        String referClzName = btVO.getReferclassname();
        IDataSource ds = null;
        if (!StringUtil.isEmptyWithTrim((String)referClzName) && (o = PfUtilTools.instantizeObject((String)billType, (String)referClzName.trim())) instanceof IPrintDataGetter) {
            String checkman = InvocationInfoProxy.getInstance().getUserId();
            try {
                ds = ((IPrintDataGetter)o).getPrintDs(billid, billType, checkman);
            }
            catch (BusinessException e) {
                Logger.error((Object)("\u83b7\u53d6\u5355\u636e\u6253\u5370\u6570\u636e\u6e90\u51fa\u9519: " + e.getMessage() + ", \u6539\u7528\u5355\u636e\u5b9e\u4f53vo\u6784\u9020\u5143\u6570\u636e\u6570\u636e\u6e90"), (Throwable)e);
            }
        }
        return ds;
    }

    public void checkStatus(BaseBillVO headVO, CheckStatusCallbackContext cscc) throws BusinessException {
        String primaryKey;
        if (headVO.getBillstatus() == -99 || headVO.getBillstatus() == 9) {
            throw new BusinessException(NCLangRes4VoTransl.getNCLangRes().getStrByID("2006pub_0", "02006pub-0869"));
        }
        boolean isqr = false;
        boolean exp1 = BillEnumCollection.BillSatus.SIGN.VALUE.equals(headVO.getBillstatus());
        boolean exp2 = BillTradetypeUtils.isqr((String)headVO.getPk_tradetype());
        if (exp1 && exp2) {
            isqr = true;
        }
        if (StringUtils.isEmpty((CharSequence)(primaryKey = headVO.getPrimaryKey()))) {
            throw new BusinessException(NCLangRes4VoTransl.getNCLangRes().getStrByID("2006v61008_0", "02006v61008-0266"));
        }
        int checkStatus = cscc.getCheckStatus();
        this.frozenAndAddSagas(headVO, checkStatus);
        long currentTimeMillis = System.currentTimeMillis();
        String strCurrentTS = BillBaseBSAction.getTimeStampString((long)currentTimeMillis);
        StringBuffer updateSql = new StringBuffer();
        updateSql.append("update ").append(headVO.getTableName()).append(" ").append("set ");
        updateSql.append("ts ").append("= ").append("'").append(strCurrentTS).append("'").append(", ");
        updateSql.append("approvestatus").append(" ").append("= ").append(checkStatus);
        updateSql.append(", ").append("approver").append(" ").append("= ").append("'").append(StringUtils.isEmpty((CharSequence)cscc.getApproveId()) ? "~" : cscc.getApproveId()).append("' ");
        if (cscc.getApproveDate() != null) {
            updateSql.append(", ").append("approvedate").append(" ").append("= ").append("'").append(cscc.getApproveDate()).append("' ");
        } else {
            updateSql.append(", ").append("approvedate").append(" ").append("= null");
        }
        updateSql.append(" where ");
        updateSql.append(headVO.getPKFieldName()).append(" ").append("= ").append("'").append(primaryKey).append("' ");
        updateSql.append("and ");
        updateSql.append("ts").append(" ").append("= ").append("'").append(headVO.getTs()).append("'");
        if (new BaseDAO().executeUpdate(updateSql.toString()) <= 0) {
            throw new BusinessException(NCLangRes4VoTransl.getNCLangRes().getStrByID("2006pub_0", "02006pub-0356"));
        }
        headVO.setTs(new UFDateTime(currentTimeMillis));
        headVO.setApprover(cscc.getApproveId());
        if (cscc.getApproveDate() != null) {
            headVO.setApprovedate(new UFDateTime(cscc.getApproveDate()));
        } else {
            headVO.setApprovedate(null);
        }
        headVO.setBillstatus(BillEnumCollection.BillSatus.SAVE.VALUE);
        headVO.setApprovestatus(Integer.valueOf(checkStatus));
        headVO.setAttributeValue("isqr", (Object)isqr);
    }

    private void frozenAndAddSagas(BaseBillVO headVO, int checkStatus) throws BusinessException {
        ApproveInfo approveInfo = this.getOriApproveInfo(headVO);
        Integer approveStatus = approveInfo.getApprovestatus();
        if (BillEnumCollection.ApproveStatus.GOINGON.VALUE == approveStatus && BillEnumCollection.ApproveStatus.PASSING.VALUE == checkStatus || BillEnumCollection.ApproveStatus.PASSING.VALUE == approveStatus && BillEnumCollection.ApproveStatus.GOINGON.VALUE == checkStatus || BillEnumCollection.ApproveStatus.PASSING.VALUE == approveStatus && BillEnumCollection.ApproveStatus.NOSTATE.VALUE == checkStatus) {
            ApproveCompenstateUtils.recordApproveInfo((ApproveInfo)approveInfo);
            return;
        }
        String operation = "going";
        this.dynamicLock(headVO);
        SagasUtils.frozenAndAddSaga((String)operation, (BaseBillVO[])new BaseBillVO[]{headVO}, (boolean)false);
    }

    private ApproveInfo getOriApproveInfo(BaseBillVO headVO) throws BusinessException {
        SqlBuilder querySql = new SqlBuilder();
        querySql.append("select ");
        querySql.append("approver");
        querySql.append(", ");
        querySql.append("approvedate");
        querySql.append(", ");
        querySql.append("approvestatus");
        querySql.append(", ");
        querySql.append("billstatus");
        querySql.append(", ");
        querySql.append("officialprintuser");
        querySql.append(", ");
        querySql.append("officialprintdate");
        querySql.append(" from ");
        querySql.append(headVO.getTableName());
        querySql.append(" where ");
        querySql.append(headVO.getPKFieldName(), headVO.getPrimaryKey());
        ApproveInfo approveInfo = null;
        try {
            approveInfo = (ApproveInfo)new BaseDAO().executeQuery(querySql.toString(), (ResultSetProcessor & Serializable)resultSet -> {
                ApproveInfo info = null;
                if (resultSet.next()) {
                    info = new ApproveInfo();
                    info.setPrimaryKey(headVO.getPrimaryKey());
                    info.setApprover(resultSet.getString(1));
                    info.setApprovedate(resultSet.getString(2) == null ? null : new UFDateTime(resultSet.getString(2)));
                    info.setApprovestatus(Integer.valueOf(resultSet.getInt(3)));
                    info.setBillstatus(Integer.valueOf(resultSet.getInt(4)));
                    info.setOfficialprintuser(resultSet.getString(5));
                    info.setOfficialprintdate(resultSet.getString(6) == null ? null : new UFDate(resultSet.getString(6)));
                }
                return info;
            });
        }
        catch (DAOException e) {
            throw new BusinessException((Throwable)e);
        }
        if (approveInfo == null) {
            throw new BusinessException(NCLangRes4VoTransl.getNCLangRes().getStrByID("2006v61008_0", "02006pub-1206"));
        }
        return approveInfo;
    }

    public boolean canCommitOrStartFlow(String billtype, String primaryKey) throws BusinessException {
        return new WorkFlowQueryUtil().canCommitOrStartFlow(billtype, primaryKey);
    }

    public boolean isWorkFlowStartup(String billId, String billType) throws BusinessException {
        HashSet<String> hsRet = this.hasInstanceOfValid(new String[]{billId}, billType, WorkflowTypeEnum.Workflow.getIntValue());
        return hsRet.contains(billId);
    }

    public boolean isApproveFlowStartup(String billId, String billType) throws BusinessException {
        HashSet<String> hsRet = this.hasInstanceOfValid(new String[]{billId}, billType, WorkflowTypeEnum.Approveflow.getIntValue());
        return hsRet.contains(billId);
    }

    public boolean isContainWorkFlowStartup(String[] billIds, String billType) throws BusinessException {
        HashSet<String> hsRet = this.hasInstanceOfValid(billIds, billType, WorkflowTypeEnum.Workflow.getIntValue());
        return !hsRet.isEmpty();
    }

    public boolean isContainApproveFlowStartup(String[] billIds, String billType) throws BusinessException {
        HashSet<String> hsRet = this.hasInstanceOfValid(billIds, billType, WorkflowTypeEnum.Approveflow.getIntValue());
        return !hsRet.isEmpty();
    }

    private HashSet<String> hasInstanceOfValid(String[] billIdAry, String billType, final int iWorkflowOrApproveflow) throws BusinessException {
        final HashSet<String> hsRet = new HashSet<String>();
        InSqlBatchCaller caller = new InSqlBatchCaller(billIdAry);
        PersistenceManager persist = null;
        try {
            persist = PersistenceManager.getInstance();
            final JdbcSession jdbc = persist.getJdbcSession();
            caller.execute(new IInSqlBatchCallBack(){

                public Object doWithInSql(String inSql) throws BusinessException, SQLException {
                    String sql = "select billversionpk from pub_wf_instance where billversionpk in " + inSql + " and procstatus!=?" + CheckStatusCallBackImpl.this.getWorkflowTypeAndWhere(iWorkflowOrApproveflow, "");
                    SQLParameter para = new SQLParameter();
                    para.addParam(WfTaskOrInstanceStatus.Inefficient.getIntValue());
                    try {
                        ArrayList alBillId = (ArrayList)jdbc.executeQuery(sql, para, (ResultSetProcessor)new ColumnListProcessor(1));
                        hsRet.addAll(alBillId);
                    }
                    catch (DbException e) {
                        Logger.error((Object)e.getMessage(), (Throwable)e);
                        throw new PFBusinessException(NCLangRes4VoTransl.getNCLangRes().getStrByID("pfworkflow", "UPPpfworkflow-000060") + e.getMessage(), (Throwable)e);
                    }
                    return null;
                }
            });
            HashSet<String> hashSet = hsRet;
            return hashSet;
        }
        catch (DbException e) {
            Logger.error((Object)e.getMessage(), (Throwable)e);
            throw new PFBusinessException(NCLangRes4VoTransl.getNCLangRes().getStrByID("pfworkflow", "UPPpfworkflow-000060") + e.getMessage(), (Throwable)e);
        }
        catch (SQLException e) {
            Logger.error((Object)e.getMessage(), (Throwable)e);
            throw new PFBusinessException(NCLangRes4VoTransl.getNCLangRes().getStrByID("pfworkflow", "UPPpfworkflow-000060") + e.getMessage(), (Throwable)e);
        }
        finally {
            if (persist != null) {
                persist.release();
            }
        }
    }

    private String getWorkflowTypeAndWhere(int iWorkflowOrApproveflow, String tableAlias) {
        String strWfTypeSql = "";
        if (StringUtil.isEmptyWithTrim((String)tableAlias)) {
            tableAlias = "";
        }
        strWfTypeSql = " and " + tableAlias + "workflow_type in" + this.getInstanceTypeInSql(iWorkflowOrApproveflow);
        return strWfTypeSql;
    }

    private String getInstanceTypeInSql(int iInstanceType) {
        String str = "";
        str = iInstanceType == WorkflowTypeEnum.Approveflow.getIntValue() ? "(" + WorkflowTypeEnum.Approveflow.getIntValue() + ")" : "(" + WorkflowTypeEnum.Workflow.getIntValue() + ")";
        return str;
    }

    public boolean isapproved(String billId, String billType) throws BusinessException {
        String sql = "select pk_wf_task from pub_workflownote where pk_wf_task !='~' and approvestatus='1' and billversionpk=? and pk_billtype=? ";
        PersistenceManager persist = null;
        try {
            persist = PersistenceManager.getInstance();
            JdbcSession jdbc = persist.getJdbcSession();
            SQLParameter para = new SQLParameter();
            para.addParam(billId);
            para.addParam(billType);
            Object obj = jdbc.executeQuery(sql, para, (ResultSetProcessor)new ColumnProcessor(1));
            if (obj == null) {
                boolean bl = false;
                return bl;
            }
        }
        catch (DbException de) {
            throw new BusinessException(de.getMessage());
        }
        finally {
            if (persist != null) {
                persist.release();
            }
        }
        return true;
    }

    public boolean isCheckman(String billId, String billType, String userId) throws BusinessException {
        String sql = "select pk_wf_task from pub_workflownote where pk_wf_task !='~' and billversionpk=? and pk_billtype=? and checkman=? and approvestatus in(" + WfTaskOrInstanceStatus.getUnfinishedStatusSet() + ")";
        PersistenceManager persist = null;
        try {
            persist = PersistenceManager.getInstance();
            JdbcSession jdbc = persist.getJdbcSession();
            SQLParameter para = new SQLParameter();
            para.addParam(billId);
            para.addParam(billType);
            para.addParam(userId);
            Object obj = jdbc.executeQuery(sql, para, (ResultSetProcessor)new ColumnProcessor(1));
            if (obj == null) {
                boolean bl = false;
                return bl;
            }
        }
        catch (DbException de) {
            throw new BusinessException(de.getMessage());
        }
        finally {
            if (persist != null) {
                persist.release();
            }
        }
        return true;
    }

    public void changeApproveStatus(AggregatedValueObject aggvo) throws BusinessException {
        BaseBillVO parent = (BaseBillVO)aggvo.getParentVO();
        String primaryKey = parent.getPrimaryKey();
        String tradetype = (String)parent.getAttributeValue("pk_tradetype");
        if (!BillEnumCollection.ApproveStatus.NOPASS.VALUE.equals(parent.getApprovestatus()) && !BillEnumCollection.ApproveStatus.PASSING.VALUE.equals(parent.getApprovestatus())) {
            if (((ICheckStatusCallBack)NCLocator.getInstance().lookup(ICheckStatusCallBack.class)).isapproved(primaryKey, tradetype)) {
                this.callCheckStatusStatus((BaseAggVO)aggvo, BillEnumCollection.ApproveStatus.GOINGON.VALUE);
            } else {
                this.callCheckStatusStatus((BaseAggVO)aggvo, BillEnumCollection.ApproveStatus.COMMIT.VALUE);
            }
        }
    }

    private void callCheckStatusStatus(BaseAggVO v, int approveStatus) throws BusinessException {
        CheckStatusCallbackContext cscc = new CheckStatusCallbackContext();
        cscc.setApproveDate(v.getHeadVO().getApprovedate() == null ? null : v.getHeadVO().getApprovedate().toString());
        cscc.setApproveId(v.getHeadVO().getApprover() == null ? null : v.getHeadVO().getApprover());
        cscc.setCheckStatus(approveStatus);
        cscc.setReject(false);
        this.checkStatus(v.getHeadVO(), cscc);
    }

    public String dynamicLock(BaseBillVO headVO) throws BusinessException {
        String key = headVO.getPrimaryKey();
        if (key != null && !PKLock.getInstance().addDynamicLock(key)) {
            throw new LockFailedException(key);
        }
        return null;
    }
}


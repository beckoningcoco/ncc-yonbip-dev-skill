/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  nc.bs.arap.bill.ArapBillDAO
 *  nc.bs.arap.bill.ArapBillPubUtil
 *  nc.bs.framework.common.InvocationInfoProxy
 *  nc.bs.framework.common.NCLocator
 *  nc.bs.pub.pf.PfUtilTools
 *  nc.pubitf.bd.accessor.GeneralAccessorFactory
 *  nc.pubitf.org.ICloseAccQryPubServicer
 *  nc.vo.arap.basebill.BaseAggVO
 *  nc.vo.arap.basebill.BaseBillVO
 *  nc.vo.arap.billstatus.ARAPBillStatus
 *  nc.vo.arap.pub.BillEnumCollection$ApproveStatus
 *  nc.vo.arap.utils.ArrayUtil
 *  nc.vo.bd.accessor.IBDData
 *  nc.vo.jcom.lang.StringUtil
 *  nc.vo.ml.NCLangRes4VoTransl
 *  nc.vo.org.CloseAccBookVO
 *  nc.vo.pub.AggregatedValueObject
 *  nc.vo.pub.BusinessException
 *  nc.vo.pub.lang.UFBoolean
 *  nc.vo.pub.lang.UFDate
 *  nc.vo.pubapp.pflow.PfUserObject
 *  nc.vo.uap.pf.PFBatchExceptionInfo
 *  nc.vo.uap.pf.PfProcessBatchRetObject
 *  nc.vo.wfengine.definition.WorkflowTypeEnum
 *  nccloud.dto.arap.arappub.RebuildInfo
 *  nccloud.dto.arap.arappub.info.CommonInfo
 *  nccloud.pubitf.arap.accountquery.IReportQueryObjRegService
 *  nccloud.pubitf.arap.arappub.IArapFlowUtilService
 *  nccloud.pubitf.arap.openapi.IARAPOpenAPIService
 *  nccloud.pubitf.riart.pflow.CloudPFlowContext
 *  nccloud.pubitf.riart.pflow.ICloudScriptPFlowService
 *  org.apache.commons.lang3.ArrayUtils
 *  org.apache.commons.lang3.StringUtils
 */
package nccloud.pubimpl.arap.openapi;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import nc.bs.arap.bill.ArapBillDAO;
import nc.bs.arap.bill.ArapBillPubUtil;
import nc.bs.framework.common.InvocationInfoProxy;
import nc.bs.framework.common.NCLocator;
import nc.bs.pub.pf.PfUtilTools;
import nc.pubitf.bd.accessor.GeneralAccessorFactory;
import nc.pubitf.org.ICloseAccQryPubServicer;
import nc.vo.arap.basebill.BaseAggVO;
import nc.vo.arap.basebill.BaseBillVO;
import nc.vo.arap.billstatus.ARAPBillStatus;
import nc.vo.arap.pub.BillEnumCollection;
import nc.vo.arap.utils.ArrayUtil;
import nc.vo.bd.accessor.IBDData;
import nc.vo.jcom.lang.StringUtil;
import nc.vo.ml.NCLangRes4VoTransl;
import nc.vo.org.CloseAccBookVO;
import nc.vo.pub.AggregatedValueObject;
import nc.vo.pub.BusinessException;
import nc.vo.pub.lang.UFBoolean;
import nc.vo.pub.lang.UFDate;
import nc.vo.pubapp.pflow.PfUserObject;
import nc.vo.uap.pf.PFBatchExceptionInfo;
import nc.vo.uap.pf.PfProcessBatchRetObject;
import nc.vo.wfengine.definition.WorkflowTypeEnum;
import nccloud.dto.arap.arappub.RebuildInfo;
import nccloud.dto.arap.arappub.info.CommonInfo;
import nccloud.pubimpl.arap.openapi.OpenApiBillUtil;
import nccloud.pubitf.arap.accountquery.IReportQueryObjRegService;
import nccloud.pubitf.arap.arappub.IArapFlowUtilService;
import nccloud.pubitf.arap.openapi.IARAPOpenAPIService;
import nccloud.pubitf.riart.pflow.CloudPFlowContext;
import nccloud.pubitf.riart.pflow.ICloudScriptPFlowService;
import org.apache.commons.lang3.ArrayUtils;
import org.apache.commons.lang3.StringUtils;

public class ARAPOpenAPIServiceImpl
implements IARAPOpenAPIService {
    public Map<String, String> rebuild(RebuildInfo ri) throws BusinessException {
        IBDData bddata;
        String orgCode = ri.getPk_org();
        if (!StringUtils.isEmpty((CharSequence)orgCode)) {
            bddata = GeneralAccessorFactory.getAccessor((String)"2cfe13c5-9757-4ae8-9327-f5c2d34bcb46").getDocByCode(InvocationInfoProxy.getInstance().getGroupId(), orgCode);
            if (bddata == null) {
                throw new BusinessException(NCLangRes4VoTransl.getNCLangRes().getStrByID("2006pub_0", "02006pub-0967"));
            }
        } else {
            throw new BusinessException(NCLangRes4VoTransl.getNCLangRes().getStrByID("2006v61008_0", "02006v61008-0008"));
        }
        ri.setPk_org(bddata.getPk());
        String endtime = ri.getEndtime();
        if (StringUtils.isEmpty((CharSequence)endtime)) {
            throw new BusinessException(NCLangRes4VoTransl.getNCLangRes().getStrByID("2006v61008_0", "02006v61008-0010"));
        }
        Object[] refnames = ri.getRefpks();
        if (ArrayUtils.isNotEmpty((Object[])refnames)) {
            ArrayList<String> refpklist;
            IBDData[] bddatas;
            if (ri.getFlag().equals(3)) {
                bddatas = null;
                bddatas = GeneralAccessorFactory.getAccessor((String)"e4f48eaf-5567-4383-a370-a59cb3e8a451").getDocByNamesWithMainLang(ri.getPk_org(), (String[])refnames);
                if (bddatas == null || bddatas.length == 0 || bddatas[0] == null) {
                    bddatas = GeneralAccessorFactory.getAccessor((String)"e4f48eaf-5567-4383-a370-a59cb3e8a451").getDocByCodes(ri.getPk_org(), (String[])refnames);
                }
                if (bddatas != null && bddatas.length > 0) {
                    refpklist = new ArrayList<String>();
                    for (IBDData bddata2 : bddatas) {
                        if (bddata2 == null) continue;
                        refpklist.add(bddata2.getPk());
                    }
                    ri.setRefpks(refpklist.toArray(new String[0]));
                }
            } else if (ri.getFlag().equals(3)) {
                bddatas = null;
                bddatas = GeneralAccessorFactory.getAccessor((String)"720dcc7c-ff19-48f4-b9c5-b90906682f45").getDocByNamesWithMainLang(ri.getPk_org(), (String[])refnames);
                if (bddatas == null || bddatas.length == 0 || bddatas[0] == null) {
                    bddatas = GeneralAccessorFactory.getAccessor((String)"720dcc7c-ff19-48f4-b9c5-b90906682f45").getDocByCodes(ri.getPk_org(), (String[])refnames);
                }
                if (bddatas != null && bddatas.length > 0) {
                    refpklist = new ArrayList();
                    for (IBDData bddata3 : bddatas) {
                        refpklist.add(bddata3.getPk());
                    }
                    ri.setRefpks(refpklist.toArray(new String[0]));
                }
            }
        }
        IReportQueryObjRegService service = (IReportQueryObjRegService)NCLocator.getInstance().lookup(IReportQueryObjRegService.class);
        Boolean success = service.rebuild(ri);
        HashMap<String, String> map = new HashMap<String, String>();
        if (success.booleanValue()) {
            map.put("sucess", "sucess");
        } else {
            map.put("sucess", "fail");
        }
        return map;
    }

    public Object executeBatchPM(String actionType, BaseAggVO[] bills) throws BusinessException {
        return OpenApiBillUtil.executeBatchPM(actionType, bills);
    }

    public Map<String, Object> doBatchCommit(String[] pks, String billtype, String actionName) throws BusinessException {
        List<PfProcessBatchRetObject> pfInfo;
        InvocationInfoProxy.getInstance().setBizDateTime(new UFDate().getMillis());
        int failNum = 0;
        int successNum = 0;
        StringBuilder errMsg = new StringBuilder();
        HashMap<String, Object> responseMap = new HashMap<String, Object>();
        List billVOs = ArapBillDAO.getInstance().queryParentVOByPKs(pks, billtype);
        ArrayList<CommonInfo> infoList = new ArrayList<CommonInfo>();
        for (BaseBillVO billVO : billVOs) {
            CommonInfo info = new CommonInfo();
            info.setBillType(billVO.getPk_billtype());
            info.setPk_bill(billVO.getPrimaryKey());
            info.setTs(billVO.getTs());
            infoList.add(info);
        }
        IArapFlowUtilService service = (IArapFlowUtilService)NCLocator.getInstance().lookup(IArapFlowUtilService.class);
        Map params = service.getBatchCloudPFlowContext(infoList.toArray(new CommonInfo[0]), actionName);
        List noFlowParams = (List)params.get(0);
        List hasFlowParams = (List)params.get(1);
        ArrayList<PfProcessBatchRetObject> pfInfoLst = new ArrayList<PfProcessBatchRetObject>();
        if (hasFlowParams != null && hasFlowParams.size() > 0) {
            throw new BusinessException(NCLangRes4VoTransl.getNCLangRes().getStrByID("2006pub_0", "02006pub-1010"));
        }
        if (noFlowParams != null && noFlowParams.size() > 0 && (pfInfo = OpenApiBillUtil.executeBatchPM_noFlow(noFlowParams, actionName)) != null && pfInfo.size() > 0) {
            pfInfoLst.addAll(pfInfo);
        }
        if (pfInfoLst != null && pfInfoLst.size() > 0) {
            for (PfProcessBatchRetObject pfObj : pfInfoLst) {
                Object[] retObj = pfObj.getRetObj();
                PFBatchExceptionInfo errInfo = pfObj.getExceptionInfo();
                for (Map.Entry entry : errInfo.getHm_index_billVO().entrySet()) {
                    AggregatedValueObject aggvo = (AggregatedValueObject)entry.getValue();
                    String billno = (String)aggvo.getParentVO().getAttributeValue("billno");
                    ++failNum;
                    errMsg.append(NCLangRes4VoTransl.getNCLangRes().getStrByID("2006pub_0", "02006pub-0899", null, new String[]{billno, (String)errInfo.getErrorMessageMap().get(entry.getKey())}) + ";\n");
                }
                if (retObj == null) continue;
                for (Object obj : retObj) {
                    if (obj == null) continue;
                    ++successNum;
                }
            }
        }
        responseMap.put("pk_bill", pks);
        responseMap.put("message", NCLangRes4VoTransl.getNCLangRes().getStrByID("2006pub_0", "02006pub-0900", null, new String[]{String.valueOf(successNum + failNum), String.valueOf(successNum), String.valueOf(failNum)}) + "\n" + errMsg.toString());
        responseMap.put("failNum", String.valueOf(failNum));
        responseMap.put("successNum", String.valueOf(successNum));
        return responseMap;
    }

    public Map<String, String> queryIscloseOrIsendaccStatus(Map<String, String> conditionMap, String module) throws BusinessException {
        String pk_group = InvocationInfoProxy.getInstance().getGroupId();
        String orgCodes = conditionMap.get("pk_org");
        ArrayList<String> orgs = new ArrayList<String>();
        if (!StringUtils.isEmpty((CharSequence)orgCodes)) {
            String[] pk_orgs = orgCodes.split(",");
            IBDData[] datas = GeneralAccessorFactory.getAccessor((String)"2cfe13c5-9757-4ae8-9327-f5c2d34bcb46").getDocByCodes(pk_group, pk_orgs);
            if (datas != null && datas.length > 0) {
                for (IBDData data : datas) {
                    orgs.add(data.getPk());
                }
            }
        }
        String billyear = conditionMap.get("billyear");
        String billperiod = conditionMap.get("billperiod");
        String pk_accperiodmonth = null;
        if (!StringUtils.isEmpty((CharSequence)billyear) || !StringUtils.isEmpty((CharSequence)billperiod)) {
            pk_accperiodmonth = OpenApiBillUtil.getPeriodByBillDate(orgs.toArray(new String[orgs.size()]), billyear, billperiod);
        }
        String[] moduleid = new String[]{module};
        List result = ((ICloseAccQryPubServicer)NCLocator.getInstance().lookup(ICloseAccQryPubServicer.class)).queryClosedBookVOsByModuleIDsAndOrgIDsAndPeriodID(moduleid, orgs.toArray(new String[orgs.size()]), pk_accperiodmonth, new String[]{"isclose", "isendacc"});
        HashMap<String, String> map = new HashMap<String, String>();
        if (result.size() < 1) {
            map.put("isclose", "false");
            map.put("isendacc", "false");
            return map;
        }
        for (CloseAccBookVO closeAccBookVO : result) {
            UFBoolean isclose = closeAccBookVO.getIsclose();
            UFBoolean isendacc = closeAccBookVO.getIsendacc();
            if (isclose.booleanValue()) {
                map.put("isclose", "true");
            } else {
                map.put("isclose", "false");
            }
            if (isendacc.booleanValue()) {
                map.put("isendacc", "true");
                continue;
            }
            map.put("isendacc", "false");
        }
        return map;
    }

    public BaseAggVO doCommit(BaseAggVO aggVO, String billtype) throws BusinessException {
        if (aggVO == null) {
            return null;
        }
        boolean hasApproveflowDef = false;
        ArapBillPubUtil.refreshChildVO2HeadVO((AggregatedValueObject[])new AggregatedValueObject[]{aggVO});
        BaseBillVO parent = (BaseBillVO)aggVO.getParentVO();
        String actionCode = ((IArapFlowUtilService)NCLocator.getInstance().lookup(IArapFlowUtilService.class)).getCommitActionCode(aggVO.getHeadVO().getPk_org(), parent.getPk_billtype());
        if ("COMMIT".equals(actionCode)) {
            hasApproveflowDef = PfUtilTools.hasflowDef((String)parent.getPk_tradetype(), (AggregatedValueObject)aggVO, (WorkflowTypeEnum)WorkflowTypeEnum.Approveflow);
        } else {
            hasApproveflowDef = PfUtilTools.hasflowDef((String)parent.getPk_tradetype(), (AggregatedValueObject)aggVO, (WorkflowTypeEnum)WorkflowTypeEnum.Workflow);
            if (!hasApproveflowDef) {
                throw new BusinessException(NCLangRes4VoTransl.getNCLangRes().getStrByID("2006pub_0", "02006pub-0759"));
            }
        }
        CloudPFlowContext context = new CloudPFlowContext();
        context.setBillType(parent.getPk_billtype());
        context.setTrantype(parent.getPk_tradetype());
        context.setUserObj(new PfUserObject[]{new PfUserObject()});
        context.setBillVos(new AggregatedValueObject[]{aggVO});
        context.setBatch(false);
        Object[] objs = null;
        ICloudScriptPFlowService service = (ICloudScriptPFlowService)NCLocator.getInstance().lookup(ICloudScriptPFlowService.class);
        if (hasApproveflowDef) {
            context.setActionName(actionCode);
            objs = service.exeScriptPFlow(context);
        } else {
            context.setActionName("COMMIT");
            objs = service.exeScriptPFlow_CommitNoFlowBatchNew(context);
        }
        return this.getAggVO(objs);
    }

    private BaseAggVO getAggVO(Object[] objs) throws BusinessException {
        if (ArrayUtil.isArrayIsNull((Object[])objs)) {
            return null;
        }
        BaseAggVO aggVO = null;
        if (objs[0] instanceof AggregatedValueObject) {
            aggVO = (BaseAggVO)objs[0];
        } else {
            PfProcessBatchRetObject retObj = (PfProcessBatchRetObject)objs[0];
            if (StringUtil.isEmptyWithTrim((String)retObj.getExceptionMsg())) {
                aggVO = (BaseAggVO)retObj.getRetObj()[0];
            } else {
                Exception exception = (Exception)retObj.getExceptionInfo().getHm_index_exception().get(0);
                throw new BusinessException(exception.getMessage());
            }
        }
        return aggVO;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public BaseAggVO doUnCommitAndDelete_RequiresNew(BaseAggVO aggVO, String billtype) throws BusinessException {
        if (aggVO == null) {
            return null;
        }
        boolean hasApproveflowDef = false;
        ArapBillPubUtil.refreshChildVO2HeadVO((AggregatedValueObject[])new AggregatedValueObject[]{aggVO});
        BaseBillVO parent = (BaseBillVO)aggVO.getParentVO();
        String actionCode = ((IArapFlowUtilService)NCLocator.getInstance().lookup(IArapFlowUtilService.class)).getUnCommitActionCode(parent.getPk_org(), parent.getPk_billtype());
        WorkflowTypeEnum eNum = PfUtilTools.runningFlowStatus((String)parent.getPk_tradetype(), (String)parent.getPrimaryKey());
        Integer billStatus = parent.getBillstatus();
        Integer approvestatus = parent.getApprovestatus();
        if (eNum != null) {
            if (eNum.getIntValue() == 4 && "RECALL".equals(actionCode)) {
                if (billStatus.intValue() != ARAPBillStatus.SAVE.VALUE.intValue() || approvestatus.intValue() != BillEnumCollection.ApproveStatus.COMMIT.VALUE.intValue()) throw new BusinessException(NCLangRes4VoTransl.getNCLangRes().getStrByID("2006pub_0", "02006pub-0915"));
                hasApproveflowDef = true;
            } else {
                if (eNum.getIntValue() == 4 && "UNCOMMIT".equals(actionCode)) {
                    throw new BusinessException(NCLangRes4VoTransl.getNCLangRes().getStrByID("2006pub_0", "02006pub-0916"));
                }
                if (eNum.getIntValue() == 2 && "RECALL".equals(actionCode)) {
                    throw new BusinessException(NCLangRes4VoTransl.getNCLangRes().getStrByID("2006pub_0", "02006pub-0917"));
                }
                if (eNum.getIntValue() == 2 && "UNCOMMIT".equals(actionCode)) {
                    if (billStatus.intValue() != ARAPBillStatus.SAVE.VALUE.intValue() || approvestatus.intValue() != BillEnumCollection.ApproveStatus.COMMIT.VALUE.intValue()) throw new BusinessException(NCLangRes4VoTransl.getNCLangRes().getStrByID("2006pub_0", "02006pub-0915"));
                    hasApproveflowDef = true;
                }
            }
        }
        CloudPFlowContext context = new CloudPFlowContext();
        context.setBillType(parent.getPk_billtype());
        context.setTrantype(parent.getPk_tradetype());
        context.setUserObj(new PfUserObject[]{new PfUserObject()});
        context.setBillVos(new AggregatedValueObject[]{aggVO});
        context.setBatch(false);
        Object[] objs = null;
        ICloudScriptPFlowService service = (ICloudScriptPFlowService)NCLocator.getInstance().lookup(ICloudScriptPFlowService.class);
        if (hasApproveflowDef) {
            context.setActionName(actionCode);
            objs = service.exeScriptPFlow(context);
        } else {
            context.setActionName("UNAPPROVE");
            objs = service.exeScriptPFlow(context);
            aggVO = this.getAggVO(objs);
        }
        aggVO = this.getAggVO(objs);
        if (aggVO == null) return this.getAggVO(objs);
        context.setActionName("DELETE");
        context.setBillVos(new AggregatedValueObject[]{aggVO});
        objs = service.exeScriptPFlow(context);
        return this.getAggVO(objs);
    }
}


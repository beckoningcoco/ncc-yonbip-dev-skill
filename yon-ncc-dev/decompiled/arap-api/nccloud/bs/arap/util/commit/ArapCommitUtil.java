/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  nc.bs.framework.common.NCLocator
 *  nc.itf.uap.pf.IWorkflowDefine
 *  nc.itf.uap.pf.IWorkflowMachine
 *  nc.vo.jcom.lang.StringUtil
 *  nc.vo.ml.NCLangRes4VoTransl
 *  nc.vo.pub.AggregatedValueObject
 *  nc.vo.pub.BusinessException
 *  nc.vo.pub.lang.UFDateTime
 *  nc.vo.pub.workflownote.WorkflownoteVO
 *  nc.vo.pubapp.pflow.PfUserObject
 *  nc.vo.uap.pf.PfProcessBatchRetObject
 *  nc.vo.wfengine.definition.WorkflowTypeEnum
 *  nccloud.pubitf.arap.arappub.IArapFlowUtilService
 *  nccloud.pubitf.riart.pflow.CloudPFlowContext
 *  nccloud.pubitf.riart.pflow.ICloudScriptPFlowService
 *  org.apache.commons.collections4.CollectionUtils
 *  org.apache.commons.lang3.ArrayUtils
 */
package nccloud.bs.arap.util.commit;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import nc.bs.framework.common.NCLocator;
import nc.itf.uap.pf.IWorkflowDefine;
import nc.itf.uap.pf.IWorkflowMachine;
import nc.vo.arap.basebill.BaseAggVO;
import nc.vo.arap.basebill.BaseBillVO;
import nc.vo.arap.exception.ArapCommitException;
import nc.vo.arap.pub.BillEnumCollection;
import nc.vo.jcom.lang.StringUtil;
import nc.vo.ml.NCLangRes4VoTransl;
import nc.vo.pub.AggregatedValueObject;
import nc.vo.pub.BusinessException;
import nc.vo.pub.lang.UFDateTime;
import nc.vo.pub.workflownote.WorkflownoteVO;
import nc.vo.pubapp.pflow.PfUserObject;
import nc.vo.uap.pf.PfProcessBatchRetObject;
import nc.vo.wfengine.definition.WorkflowTypeEnum;
import nccloud.pubitf.arap.arappub.IArapFlowUtilService;
import nccloud.pubitf.riart.pflow.CloudPFlowContext;
import nccloud.pubitf.riart.pflow.ICloudScriptPFlowService;
import org.apache.commons.collections4.CollectionUtils;
import org.apache.commons.lang3.ArrayUtils;

public class ArapCommitUtil {
    private static final String COMMITMAP = "commitMap";

    public Object autoCommit(Object obj) throws BusinessException {
        AggregatedValueObject[] bills = null;
        if (obj instanceof AggregatedValueObject[]) {
            bills = (AggregatedValueObject[])obj;
        } else if (obj instanceof AggregatedValueObject) {
            bills = new AggregatedValueObject[]{(AggregatedValueObject)obj};
        }
        List<AggregatedValueObject> retList = this.checkBillStatus(bills);
        if (CollectionUtils.isEmpty(retList)) {
            return obj;
        }
        Object[] newbills = retList.toArray(new AggregatedValueObject[0]);
        if (ArrayUtils.isNotEmpty((Object[])newbills) && ((BaseAggVO)((Object)newbills[0])).isSaveorSaveAndCommit()) {
            obj = this.doCommit((BaseAggVO)((Object)newbills[0]));
        }
        return obj;
    }

    private Object doCommit(BaseAggVO bill) throws BusinessException {
        Map commitMap = (Map)bill.getParentVO().getAttributeValue(COMMITMAP);
        if (commitMap.get("extype") != null && "1".equals(commitMap.get("extype"))) {
            bill.setAlarmPassed((Boolean)commitMap.get("isflag"));
        }
        if (commitMap.get("extype") != null && "2".equals(commitMap.get("extype"))) {
            bill.setCrossCheckPassed((Boolean)commitMap.get("isflag"));
        }
        BaseBillVO parent = (BaseBillVO)bill.getParentVO();
        UFDateTime ts = parent.getTs();
        boolean hasApproveflowDef = false;
        String actionCode = ((IArapFlowUtilService)NCLocator.getInstance().lookup(IArapFlowUtilService.class)).getCommitActionCode(bill.getHeadVO().getPk_org(), bill.getHeadVO().getPk_billtype());
        if ("COMMIT".equals(actionCode)) {
            hasApproveflowDef = ((IWorkflowDefine)NCLocator.getInstance().lookup(IWorkflowDefine.class)).hasflowDef(parent.getPk_tradetype(), (AggregatedValueObject)bill, WorkflowTypeEnum.Approveflow);
        } else {
            hasApproveflowDef = ((IWorkflowDefine)NCLocator.getInstance().lookup(IWorkflowDefine.class)).hasflowDef(parent.getPk_tradetype(), (AggregatedValueObject)bill, WorkflowTypeEnum.Workflow);
            if (!hasApproveflowDef) {
                throw new BusinessException(NCLangRes4VoTransl.getNCLangRes().getStrByID("2006pub_0", "02006pub-0759"));
            }
        }
        if (hasApproveflowDef) {
            Object returnObj;
            WorkflownoteVO[] noteVO;
            String tranType = bill.getHeadVO().getPk_tradetype();
            String billPk = bill.getHeadVO().getPrimaryKey();
            String userId = bill.getHeadVO().getBillmaker();
            if ("START".equals(actionCode) && (noteVO = ((IWorkflowMachine)NCLocator.getInstance().lookup(IWorkflowMachine.class)).queryWorkitemsNotCheck(tranType, billPk, userId)) != null && noteVO.length != 0) {
                actionCode = "SIGNAL";
            }
            if ((returnObj = this.executeBatchPM(actionCode, bill, commitMap)) instanceof AggregatedValueObject) {
                return returnObj;
            }
            HashMap<String, Object> resultMap = new HashMap<String, Object>();
            resultMap.put("pk_bill", parent.getPrimaryKey());
            resultMap.put("ts", ts);
            resultMap.put("exType", commitMap.get("extype"));
            resultMap.put("aggvo", (Object)bill);
            resultMap.put("assignInfo", returnObj);
            throw new ArapCommitException(resultMap);
        }
        CloudPFlowContext cloudPFlowContext = new CloudPFlowContext();
        cloudPFlowContext.setActionName("COMMIT");
        cloudPFlowContext.setBillType(parent.getPk_billtype());
        cloudPFlowContext.setTrantype(parent.getPk_tradetype());
        cloudPFlowContext.setBillVos((AggregatedValueObject[])new BaseAggVO[]{bill});
        cloudPFlowContext.setUserObj(new PfUserObject[]{new PfUserObject()});
        cloudPFlowContext.setBatch(false);
        cloudPFlowContext.seteParam(new HashMap());
        Object[] objs = ((ICloudScriptPFlowService)NCLocator.getInstance().lookup(ICloudScriptPFlowService.class)).exeScriptPFlow_CommitNoFlowBatchNew(cloudPFlowContext);
        PfProcessBatchRetObject retObj = (PfProcessBatchRetObject)objs[0];
        if (StringUtil.isEmptyWithTrim((String)retObj.getExceptionMsg())) {
            return retObj.getRetObj()[0];
        }
        String exception = ((Exception)retObj.getExceptionInfo().getHm_index_exception().get(0)).toString();
        if (exception.indexOf("nc.vo.arap.exception.ArapTbbException") != -1) {
            HashMap<String, String> map = new HashMap<String, String>();
            map.put("message", retObj.getExceptionMsg().toString());
            map.put("exType", "1");
            map.put("pk_bill", parent.getPrimaryKey());
            map.put("ts", (String)ts);
            return map;
        }
        if (exception.indexOf("nc.vo.arap.exception.ARAP4CmpAuthorizationException") != -1) {
            HashMap<String, String> map = new HashMap<String, String>();
            map.put("message", retObj.getExceptionMsg().toString());
            map.put("exType", "2");
            map.put("pk_bill", parent.getPrimaryKey());
            map.put("ts", (String)ts);
            return map;
        }
        return null;
    }

    private Object executeBatchPM(String actionType, BaseAggVO bill, Map<String, Object> mapcommit) throws BusinessException {
        Map map;
        Object obj;
        CloudPFlowContext context = new CloudPFlowContext();
        if (mapcommit.get("assignObj") != null && !"".equals(mapcommit.get("assignObj"))) {
            context.seteParam(new HashMap());
            context.geteParam().put("content", mapcommit.get("assignObj"));
        }
        context.setActionName(actionType);
        String billType = (String)bill.getParentVO().getAttributeValue("pk_billtype");
        context.setBillType(billType);
        context.setTrantype((String)bill.getParentVO().getAttributeValue("pk_tradetype"));
        context.setBillVos(new AggregatedValueObject[]{bill});
        context.setUserObj(new PfUserObject[]{new PfUserObject()});
        context.setBatch(false);
        ICloudScriptPFlowService service = (ICloudScriptPFlowService)NCLocator.getInstance().lookup(ICloudScriptPFlowService.class);
        Object[] objects = service.exeScriptPFlow(context);
        if ((mapcommit.get("assignObj") == null || "".equals(mapcommit.get("assignObj"))) && (obj = objects[0]) instanceof Map && ((Map)obj).get("workflow") != null && ("approveflow".equals(String.valueOf(((Map)obj).get("workflow"))) || "workflow".equals(String.valueOf(((Map)obj).get("workflow")))) && (map = (Map)obj).get("workflow") != null) {
            return map;
        }
        return objects[0];
    }

    private List<AggregatedValueObject> checkBillStatus(AggregatedValueObject[] bills) {
        if (ArrayUtils.isEmpty((Object[])bills)) {
            return null;
        }
        boolean ret = false;
        ArrayList<AggregatedValueObject> retList = new ArrayList<AggregatedValueObject>();
        for (AggregatedValueObject bill : bills) {
            Integer billstatus = (Integer)bill.getParentVO().getAttributeValue("billstatus");
            if (BillEnumCollection.BillSatus.SAVE.VALUE != billstatus) continue;
            retList.add(bill);
        }
        return retList;
    }
}


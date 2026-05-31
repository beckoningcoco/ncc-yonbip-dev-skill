/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  nc.bs.arap.bill.ArapBillPubUtil
 *  nc.bs.arap.util.ArapFlowUtil
 *  nc.bs.framework.common.NCLocator
 *  nc.bs.pub.pf.PfUtilTools
 *  nc.itf.arap.pub.IArapBillService
 *  nc.itf.uap.pf.IWorkflowMachine
 *  nc.vo.arap.basebill.BaseAggVO
 *  nc.vo.arap.basebill.BaseBillVO
 *  nc.vo.arap.billstatus.ARAPBillStatus
 *  nc.vo.arap.pub.BillEnumCollection$ApproveStatus
 *  nc.vo.arap.pub.BillEnumCollection$BillSatus
 *  nc.vo.ml.NCLangRes4VoTransl
 *  nc.vo.pub.AggregatedValueObject
 *  nc.vo.pub.BusinessException
 *  nc.vo.pub.CircularlyAccessibleValueObject
 *  nc.vo.pub.lang.UFDateTime
 *  nc.vo.pub.workflownote.WorkflownoteVO
 *  nc.vo.pubapp.pattern.exception.ExceptionUtils
 *  nc.vo.pubapp.pflow.PfUserObject
 *  nc.vo.wfengine.definition.WorkflowTypeEnum
 *  nccloud.dto.arap.arappub.info.CommonInfo
 *  nccloud.pubitf.arap.arappub.IArapFlowUtilService
 *  nccloud.pubitf.arap.baddebts.IBaddebtsBillQueryService
 *  nccloud.pubitf.riart.pflow.CloudPFlowContext
 *  org.apache.commons.collections4.CollectionUtils
 */
package nccloud.pubimpl.arap.arappub;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.Map;
import nc.bs.arap.bill.ArapBillPubUtil;
import nc.bs.arap.util.ArapFlowUtil;
import nc.bs.framework.common.NCLocator;
import nc.bs.pub.pf.PfUtilTools;
import nc.itf.arap.pub.IArapBillService;
import nc.itf.uap.pf.IWorkflowMachine;
import nc.vo.arap.basebill.BaseAggVO;
import nc.vo.arap.basebill.BaseBillVO;
import nc.vo.arap.billstatus.ARAPBillStatus;
import nc.vo.arap.pub.BillEnumCollection;
import nc.vo.ml.NCLangRes4VoTransl;
import nc.vo.pub.AggregatedValueObject;
import nc.vo.pub.BusinessException;
import nc.vo.pub.CircularlyAccessibleValueObject;
import nc.vo.pub.lang.UFDateTime;
import nc.vo.pub.workflownote.WorkflownoteVO;
import nc.vo.pubapp.pattern.exception.ExceptionUtils;
import nc.vo.pubapp.pflow.PfUserObject;
import nc.vo.wfengine.definition.WorkflowTypeEnum;
import nccloud.dto.arap.arappub.info.CommonInfo;
import nccloud.pubitf.arap.arappub.IArapFlowUtilService;
import nccloud.pubitf.arap.baddebts.IBaddebtsBillQueryService;
import nccloud.pubitf.riart.pflow.CloudPFlowContext;
import org.apache.commons.collections4.CollectionUtils;

public class ArapFlowUtilServiceServiceImpl
implements IArapFlowUtilService {
    public boolean isUseApproveFlow(String pk_org, String billtypecode) throws BusinessException {
        return !ArapFlowUtil.isUseWorkFlow((String)pk_org, (String)billtypecode);
    }

    public String getCommitActionCode(String pk_org, String billtypecode) {
        return ArapFlowUtil.getCommitActionCodeBySSC((String)pk_org, (String)billtypecode);
    }

    public String getBadCommitActionCode(String pk_org, String billtypecode) {
        return ArapFlowUtil.getBadCommitActionCodeBySSC((String)pk_org, (String)billtypecode);
    }

    public String getUnCommitActionCode(String pk_org, String billtypecode) {
        return ArapFlowUtil.getUnCommitActionCode((String)pk_org, (String)billtypecode);
    }

    public String getBadUnCommitActionCode(String pk_org, String billtypecode) {
        return ArapFlowUtil.getBadUnCommitActionCode((String)pk_org, (String)billtypecode);
    }

    public String getApproveActionCode(String pk_org, String billtypecode) {
        return ArapFlowUtil.getApproveActionCode((String)pk_org, (String)billtypecode);
    }

    public String getUnApproveActionCode(String pk_org, String billtypecode) {
        return ArapFlowUtil.getUnApproveActionCode((String)pk_org, (String)billtypecode);
    }

    /*
     * Enabled aggressive block sorting
     */
    public Map<Integer, Object> getBatchCloudPFlowContext(CommonInfo[] infos, String actionName) throws BusinessException {
        if (infos == null || infos.length < 1) {
            ExceptionUtils.wrappBusinessException((String)NCLangRes4VoTransl.getNCLangRes().getStrByID("2006pub_0", "02006pub-0782"));
        }
        HashMap<String, UFDateTime> pk2Ts = new HashMap<String, UFDateTime>();
        String billType = infos[0].getBillType();
        ArrayList<String> allPKs = new ArrayList<String>();
        HashSet<String> allOrg = new HashSet<String>();
        for (CommonInfo info : infos) {
            allPKs.add(info.getPk_bill());
            pk2Ts.put(info.getPk_bill(), info.getTs());
        }
        IArapBillService service = (IArapBillService)NCLocator.getInstance().lookup(IArapBillService.class);
        BaseAggVO[] bills = service.queryArapBillByPKs(allPKs.toArray(new String[0]), billType);
        if (bills == null || bills.length == 0 || bills.length == 1 && bills[0] == null) {
            ExceptionUtils.wrappBusinessException((String)NCLangRes4VoTransl.getNCLangRes().getStrByID("2006pub_0", "02006pub-0782"));
        }
        for (BaseAggVO aggVO : bills) {
            String pk = aggVO.getHeadVO().getPrimaryKey();
            UFDateTime serverTS = aggVO.getHeadVO().getTs();
            UFDateTime clientTS = (UFDateTime)pk2Ts.get(pk);
            if (!clientTS.equals((Object)serverTS)) {
                ExceptionUtils.wrappBusinessException((String)NCLangRes4VoTransl.getNCLangRes().getStrByID("2006pub_0", "02006pub-0782"));
            }
            allOrg.add(aggVO.getHeadVO().getPk_org());
        }
        HashMap<String, String> actionMap = new HashMap<String, String>();
        HashMap<String, CloudPFlowContext> noFlowMap = new HashMap<String, CloudPFlowContext>();
        HashMap<String, CloudPFlowContext> hasFlowMap = new HashMap<String, CloudPFlowContext>();
        ArrayList<CloudPFlowContext> unFlowList = new ArrayList<CloudPFlowContext>();
        HashMap<String, String> billno2error = new HashMap<String, String>();
        for (String pk_org : allOrg) {
            String actionCode = "";
            actionCode = "COMMIT".equals(actionName) ? this.getCommitActionCode(pk_org, billType) : this.getUnCommitActionCode(pk_org, billType);
            actionMap.put(pk_org, actionCode);
        }
        ArapBillPubUtil.refreshChildVO2HeadVO((AggregatedValueObject[])bills);
        for (BaseAggVO aggVO : bills) {
            ArrayList<Object> billVos;
            CloudPFlowContext context;
            String actionCode;
            String tranType;
            boolean hasApproveflowDef;
            Integer approvestatus;
            block44: {
                BaseBillVO headVO = aggVO.getHeadVO();
                Integer billStatus = headVO.getBillstatus();
                approvestatus = headVO.getApprovestatus();
                Integer n = approvestatus = approvestatus == null ? BillEnumCollection.ApproveStatus.NOSTATE.VALUE : approvestatus;
                if ("COMMIT".equals(actionName)) {
                    if (billStatus.intValue() == ARAPBillStatus.TEMPSAVE.VALUE.intValue()) {
                        billno2error.put(headVO.getBillno(), NCLangRes4VoTransl.getNCLangRes().getStrByID("2006pub_0", "02006pub-0691"));
                        continue;
                    }
                    if (billStatus.intValue() == ARAPBillStatus.AUDIT.VALUE.intValue() || billStatus.intValue() == ARAPBillStatus.SIGN.VALUE.intValue()) {
                        billno2error.put(headVO.getBillno(), NCLangRes4VoTransl.getNCLangRes().getStrByID("2006pub_0", "02006pub-0692"));
                        continue;
                    }
                    if (approvestatus.intValue() != BillEnumCollection.ApproveStatus.NOSTATE.VALUE.intValue()) {
                        billno2error.put(headVO.getBillno(), NCLangRes4VoTransl.getNCLangRes().getStrByID("2006pub_0", "02006pub-0693"));
                        continue;
                    }
                } else if ("UNCOMMIT".equals(actionName)) {
                    if (billStatus.intValue() == ARAPBillStatus.TEMPSAVE.VALUE.intValue()) {
                        billno2error.put(headVO.getBillno(), NCLangRes4VoTransl.getNCLangRes().getStrByID("2006pub_0", "02006pub-0912"));
                        continue;
                    }
                    if (approvestatus.intValue() != BillEnumCollection.ApproveStatus.COMMIT.VALUE.intValue() && billStatus.intValue() != BillEnumCollection.BillSatus.AUDIT.VALUE.intValue() && billStatus.intValue() != BillEnumCollection.BillSatus.SIGN.VALUE.intValue()) {
                        billno2error.put(headVO.getBillno(), NCLangRes4VoTransl.getNCLangRes().getStrByID("2006pub_0", "02006pub-0785"));
                        continue;
                    }
                }
                String pk_org = headVO.getPk_org();
                hasApproveflowDef = false;
                tranType = headVO.getPk_tradetype();
                actionCode = (String)actionMap.get(pk_org);
                WorkflowTypeEnum eNum = PfUtilTools.runningFlowStatus((String)headVO.getPk_tradetype(), (String)headVO.getPrimaryKey());
                if ("COMMIT".equals(actionName)) {
                    if ("COMMIT".equals(actionCode)) {
                        hasApproveflowDef = PfUtilTools.hasflowDef((String)tranType, (AggregatedValueObject)aggVO, (WorkflowTypeEnum)WorkflowTypeEnum.Approveflow);
                    } else {
                        hasApproveflowDef = PfUtilTools.hasflowDef((String)tranType, (AggregatedValueObject)aggVO, (WorkflowTypeEnum)WorkflowTypeEnum.Workflow);
                        if (!hasApproveflowDef) {
                            billno2error.put(headVO.getBillno(), NCLangRes4VoTransl.getNCLangRes().getStrByID("2006pub_0", "02006pub-0759"));
                            continue;
                        }
                    }
                } else if ("UNCOMMIT".equals(actionName) && eNum != null) {
                    if (eNum.getIntValue() == 4 && "RECALL".equals(actionCode)) {
                        if (billStatus.intValue() == ARAPBillStatus.SAVE.VALUE.intValue() && approvestatus.intValue() == BillEnumCollection.ApproveStatus.COMMIT.VALUE.intValue()) {
                            hasApproveflowDef = true;
                            break block44;
                        } else {
                            billno2error.put(headVO.getBillno(), NCLangRes4VoTransl.getNCLangRes().getStrByID("2006pub_0", "02006pub-0915"));
                            continue;
                        }
                    }
                    if (eNum.getIntValue() == 4 && "UNCOMMIT".equals(actionCode)) {
                        billno2error.put(headVO.getBillno(), NCLangRes4VoTransl.getNCLangRes().getStrByID("2006pub_0", "02006pub-0916"));
                        continue;
                    }
                    if (eNum.getIntValue() == 2 && "RECALL".equals(actionCode)) {
                        billno2error.put(headVO.getBillno(), NCLangRes4VoTransl.getNCLangRes().getStrByID("2006pub_0", "02006pub-0917"));
                        continue;
                    }
                    if (eNum.getIntValue() == 2 && "UNCOMMIT".equals(actionCode)) {
                        if (billStatus.intValue() == ARAPBillStatus.SAVE.VALUE.intValue() && approvestatus.intValue() == BillEnumCollection.ApproveStatus.COMMIT.VALUE.intValue()) {
                            hasApproveflowDef = true;
                        } else {
                            billno2error.put(headVO.getBillno(), NCLangRes4VoTransl.getNCLangRes().getStrByID("2006pub_0", "02006pub-0915"));
                            continue;
                        }
                    }
                }
            }
            if ("START".equals(actionCode)) {
                WorkflownoteVO[] noteVO = null;
                noteVO = ((IWorkflowMachine)NCLocator.getInstance().lookup(IWorkflowMachine.class)).queryWorkitemsNotCheck(tranType, aggVO.getHeadVO().getPrimaryKey(), aggVO.getHeadVO().getBillmaker());
                if (noteVO != null && noteVO.length != 0) {
                    actionCode = "SIGNAL";
                }
            }
            if (!hasApproveflowDef) {
                actionCode = "COMMIT".equals(actionName) ? "COMMIT" : "UNCOMMIT";
            }
            String key = billType + tranType + actionCode;
            if (hasApproveflowDef) {
                context = (CloudPFlowContext)hasFlowMap.get(key);
                if (context == null) {
                    context = new CloudPFlowContext();
                    context.setActionName(actionCode);
                    context.setBillType(billType);
                    context.setTrantype(tranType);
                    context.setUserObj(new PfUserObject[]{new PfUserObject()});
                    context.setBatch(false);
                    hasFlowMap.put(key, context);
                }
                billVos = new ArrayList<Object>();
                if (context.getBillVos() != null && context.getBillVos().length > 0) {
                    for (AggregatedValueObject vo : context.getBillVos()) {
                        billVos.add(vo);
                    }
                }
                billVos.add(aggVO);
                context.setBillVos(billVos.toArray(new AggregatedValueObject[0]));
                continue;
            }
            if ("UNCOMMIT".equals(actionName) && approvestatus.intValue() == BillEnumCollection.ApproveStatus.COMMIT.VALUE.intValue()) {
                context = new CloudPFlowContext();
                context.setActionName(actionCode);
                context.setTrantype(tranType);
                context.setBatch(false);
                context.setBillVos(new AggregatedValueObject[]{aggVO});
                unFlowList.add(context);
                continue;
            }
            context = (CloudPFlowContext)noFlowMap.get(key);
            if (context == null) {
                context = new CloudPFlowContext();
                context.setActionName(actionCode);
                context.setBillType(billType);
                context.setTrantype(tranType);
                context.setUserObj(new PfUserObject[]{new PfUserObject()});
                context.setBatch(false);
                noFlowMap.put(key, context);
            }
            billVos = new ArrayList();
            if (context.getBillVos() != null && context.getBillVos().length > 0) {
                for (AggregatedValueObject vo : context.getBillVos()) {
                    billVos.add(vo);
                }
            }
            billVos.add(aggVO);
            context.setBillVos(billVos.toArray(new AggregatedValueObject[0]));
        }
        HashMap<Integer, Object> result = new HashMap<Integer, Object>();
        if (!noFlowMap.isEmpty() && noFlowMap.size() > 0) {
            ArrayList noFlowLst = new ArrayList();
            noFlowLst.addAll(noFlowMap.values());
            result.put(0, noFlowLst);
        }
        if (!hasFlowMap.isEmpty() && hasFlowMap.size() > 0) {
            ArrayList hasFlowLst = new ArrayList();
            hasFlowLst.addAll(hasFlowMap.values());
            result.put(1, hasFlowLst);
        }
        if (billno2error.size() > 0) {
            result.put(2, billno2error);
        }
        if (CollectionUtils.isNotEmpty(unFlowList)) {
            result.put(3, unFlowList);
        }
        return result;
    }

    /*
     * Enabled aggressive block sorting
     */
    public Map<Integer, Object> getBadBatchCloudPFlowContext(CommonInfo[] infos, String actionName) throws BusinessException {
        if (infos == null || infos.length < 1) {
            ExceptionUtils.wrappBusinessException((String)NCLangRes4VoTransl.getNCLangRes().getStrByID("2006pub_0", "02006pub-0782"));
        }
        HashMap<String, UFDateTime> pk2Ts = new HashMap<String, UFDateTime>();
        String billType = infos[0].getBillType();
        ArrayList<String> allPKs = new ArrayList<String>();
        HashSet<String> allOrg = new HashSet<String>();
        for (CommonInfo info : infos) {
            allPKs.add(info.getPk_bill());
            pk2Ts.put(info.getPk_bill(), info.getTs());
        }
        IBaddebtsBillQueryService service = (IBaddebtsBillQueryService)NCLocator.getInstance().lookup(IBaddebtsBillQueryService.class);
        AggregatedValueObject[] bills = service.queryBillsByPKs(allPKs.toArray(new String[0]), billType);
        if (bills == null || bills.length == 0 || bills.length == 1 && bills[0] == null) {
            ExceptionUtils.wrappBusinessException((String)NCLangRes4VoTransl.getNCLangRes().getStrByID("2006pub_0", "02006pub-0782"));
        }
        for (AggregatedValueObject aggVO : bills) {
            CircularlyAccessibleValueObject parentVO = aggVO.getParentVO();
            String pk = parentVO.getPrimaryKey();
            UFDateTime serverTS = (UFDateTime)parentVO.getAttributeValue("ts");
            UFDateTime clientTS = (UFDateTime)pk2Ts.get(pk);
            if (!clientTS.equals((Object)serverTS)) {
                ExceptionUtils.wrappBusinessException((String)NCLangRes4VoTransl.getNCLangRes().getStrByID("2006pub_0", "02006pub-0782"));
            }
            allOrg.add((String)parentVO.getAttributeValue("pk_org"));
        }
        HashMap<String, String> actionMap = new HashMap<String, String>();
        HashMap<String, CloudPFlowContext> noFlowMap = new HashMap<String, CloudPFlowContext>();
        HashMap<String, CloudPFlowContext> hasFlowMap = new HashMap<String, CloudPFlowContext>();
        LinkedHashMap<String, String> billno2error = new LinkedHashMap<String, String>();
        for (String pk_org : allOrg) {
            String actionCode = "";
            actionCode = "SAVE".equals(actionName) ? this.getBadCommitActionCode(pk_org, billType) : this.getBadUnCommitActionCode(pk_org, billType);
            actionMap.put(pk_org, actionCode);
        }
        for (int i = 0; i < bills.length; ++i) {
            ArrayList<AggregatedValueObject> billVos;
            CloudPFlowContext context;
            String actionCode;
            boolean hasApproveflowDef;
            AggregatedValueObject aggVO;
            block42: {
                aggVO = bills[i];
                CircularlyAccessibleValueObject headVO = aggVO.getParentVO();
                Integer billStatus = (Integer)headVO.getAttributeValue("billstatus");
                Integer approvestatus = (Integer)headVO.getAttributeValue("approvestatus");
                String billno = (String)headVO.getAttributeValue("billno");
                String pk_org = (String)headVO.getAttributeValue("pk_org");
                String pk_billtype = (String)headVO.getAttributeValue("pk_billtype");
                billno = billno == null ? String.valueOf(i) : billno;
                Integer n = approvestatus = approvestatus == null ? BillEnumCollection.ApproveStatus.NOSTATE.VALUE : approvestatus;
                if ("SAVE".equals(actionName)) {
                    if (billStatus == null || approvestatus == null) {
                        billno2error.put(billno, NCLangRes4VoTransl.getNCLangRes().getStrByID("2006pub_0", "02006pub-0693"));
                        continue;
                    }
                    if (billStatus.intValue() == ARAPBillStatus.AUDIT.VALUE.intValue() || billStatus.intValue() == ARAPBillStatus.SIGN.VALUE.intValue()) {
                        billno2error.put(billno, NCLangRes4VoTransl.getNCLangRes().getStrByID("2006pub_0", "02006pub-0692"));
                        continue;
                    }
                    if (approvestatus.intValue() != BillEnumCollection.ApproveStatus.NOSTATE.VALUE.intValue()) {
                        billno2error.put(billno, NCLangRes4VoTransl.getNCLangRes().getStrByID("2006pub_0", "02006pub-0693"));
                        continue;
                    }
                } else if ("UNSAVE".equals(actionName)) {
                    if (billStatus == null || approvestatus == null) {
                        billno2error.put(billno, NCLangRes4VoTransl.getNCLangRes().getStrByID("2006pub_0", "02006pub-0785"));
                        continue;
                    }
                    if (approvestatus.intValue() != BillEnumCollection.ApproveStatus.COMMIT.VALUE.intValue() && billStatus.intValue() != BillEnumCollection.BillSatus.AUDIT.VALUE.intValue() && billStatus.intValue() != BillEnumCollection.BillSatus.SIGN.VALUE.intValue()) {
                        billno2error.put(billno, NCLangRes4VoTransl.getNCLangRes().getStrByID("2006pub_0", "02006pub-0785"));
                        continue;
                    }
                }
                hasApproveflowDef = false;
                actionCode = (String)actionMap.get(pk_org);
                WorkflowTypeEnum eNum = PfUtilTools.runningFlowStatus((String)pk_billtype, (String)headVO.getPrimaryKey());
                if ("SAVE".equals(actionName)) {
                    if ("SAVE".equals(actionCode)) {
                        hasApproveflowDef = PfUtilTools.hasflowDef((String)pk_billtype, (AggregatedValueObject)aggVO, (WorkflowTypeEnum)WorkflowTypeEnum.Approveflow);
                    } else {
                        hasApproveflowDef = PfUtilTools.hasflowDef((String)pk_billtype, (AggregatedValueObject)aggVO, (WorkflowTypeEnum)WorkflowTypeEnum.Workflow);
                        if (!hasApproveflowDef) {
                            billno2error.put(billno, NCLangRes4VoTransl.getNCLangRes().getStrByID("2006pub_0", "02006pub-0759"));
                            continue;
                        }
                    }
                } else if ("UNSAVE".equals(actionName) && eNum != null) {
                    if (eNum.getIntValue() == 4 && "RECALL".equals(actionCode)) {
                        if (billStatus.intValue() == ARAPBillStatus.SAVE.VALUE.intValue() && approvestatus.intValue() == BillEnumCollection.ApproveStatus.COMMIT.VALUE.intValue()) {
                            hasApproveflowDef = true;
                            break block42;
                        } else {
                            billno2error.put(billno, NCLangRes4VoTransl.getNCLangRes().getStrByID("2006pub_0", "02006pub-0915"));
                            continue;
                        }
                    }
                    if (eNum.getIntValue() == 4 && "UNSAVE".equals(actionCode)) {
                        billno2error.put(billno, NCLangRes4VoTransl.getNCLangRes().getStrByID("2006pub_0", "02006pub-0916"));
                        continue;
                    }
                    if (eNum.getIntValue() == 2 && "RECALL".equals(actionCode)) {
                        billno2error.put(billno, NCLangRes4VoTransl.getNCLangRes().getStrByID("2006pub_0", "02006pub-0917"));
                        continue;
                    }
                    if (eNum.getIntValue() == 2 && "UNSAVE".equals(actionCode)) {
                        if (billStatus.intValue() == ARAPBillStatus.SAVE.VALUE.intValue() && approvestatus.intValue() == BillEnumCollection.ApproveStatus.COMMIT.VALUE.intValue()) {
                            hasApproveflowDef = true;
                        } else {
                            billno2error.put(billno, NCLangRes4VoTransl.getNCLangRes().getStrByID("2006pub_0", "02006pub-0915"));
                            continue;
                        }
                    }
                }
            }
            if ("START".equals(actionCode)) {
                WorkflownoteVO[] noteVO = null;
                String tranType = (String)aggVO.getParentVO().getAttributeValue("pk_tradetype");
                noteVO = ((IWorkflowMachine)NCLocator.getInstance().lookup(IWorkflowMachine.class)).queryWorkitemsNotCheck(tranType, aggVO.getParentVO().getPrimaryKey(), (String)aggVO.getParentVO().getAttributeValue("billmaker"));
                if (noteVO != null && noteVO.length != 0) {
                    actionCode = "SIGNAL";
                }
            }
            if (!hasApproveflowDef) {
                actionCode = "SAVE".equals(actionName) ? "SAVE" : "UNSAVE";
            }
            String key = billType + actionCode;
            if (hasApproveflowDef) {
                context = (CloudPFlowContext)hasFlowMap.get(key);
                if (context == null) {
                    context = new CloudPFlowContext();
                    context.setActionName(actionCode);
                    context.setBillType(billType);
                    context.setUserObj(new PfUserObject[]{new PfUserObject()});
                    context.setBatch(false);
                    hasFlowMap.put(key, context);
                }
                billVos = new ArrayList<AggregatedValueObject>();
                if (context.getBillVos() != null && context.getBillVos().length > 0) {
                    for (AggregatedValueObject vo : context.getBillVos()) {
                        billVos.add(vo);
                    }
                }
                billVos.add(aggVO);
                context.setBillVos(billVos.toArray(new AggregatedValueObject[0]));
                continue;
            }
            context = (CloudPFlowContext)noFlowMap.get(key);
            if (context == null) {
                context = new CloudPFlowContext();
                context.setActionName(actionCode);
                context.setBillType(billType);
                context.setUserObj(new PfUserObject[]{new PfUserObject()});
                context.setBatch(false);
                noFlowMap.put(key, context);
            }
            billVos = new ArrayList();
            if (context.getBillVos() != null && context.getBillVos().length > 0) {
                for (AggregatedValueObject vo : context.getBillVos()) {
                    billVos.add(vo);
                }
            }
            billVos.add(aggVO);
            context.setBillVos(billVos.toArray(new AggregatedValueObject[0]));
        }
        HashMap<Integer, Object> result = new HashMap<Integer, Object>();
        if (!noFlowMap.isEmpty() && noFlowMap.size() > 0) {
            ArrayList noFlowLst = new ArrayList();
            noFlowLst.addAll(noFlowMap.values());
            result.put(0, noFlowLst);
        }
        if (!hasFlowMap.isEmpty() && hasFlowMap.size() > 0) {
            ArrayList hasFlowLst = new ArrayList();
            hasFlowLst.addAll(hasFlowMap.values());
            result.put(1, hasFlowLst);
        }
        if (billno2error.size() > 0) {
            result.put(2, billno2error);
        }
        return result;
    }

    public WorkflownoteVO[] getNoteVO(String tranType, AggregatedValueObject bill) throws BusinessException {
        String billmaker = (String)bill.getParentVO().getAttributeValue("billmaker");
        if ("BDP".equals(tranType) || "BDPI".equals(tranType) || "BDL".equals(tranType) || "BDR".equals(tranType)) {
            billmaker = (String)bill.getParentVO().getAttributeValue("creator");
        }
        WorkflownoteVO[] vo = null;
        vo = ((IWorkflowMachine)NCLocator.getInstance().lookup(IWorkflowMachine.class)).queryWorkitemsNotCheck(tranType, bill.getParentVO().getPrimaryKey(), billmaker);
        return vo;
    }
}


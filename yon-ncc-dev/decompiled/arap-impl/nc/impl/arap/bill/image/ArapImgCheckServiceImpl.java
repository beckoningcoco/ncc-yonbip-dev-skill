/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  nc.bs.framework.common.InvocationInfoProxy
 *  nc.bs.framework.common.NCLocator
 *  nc.bs.logging.Logger
 *  nc.bs.pf.pub.PfDataCache
 *  nc.bs.uif2.validation.ValidationFailure
 *  nc.imag.itf.IImagUtil
 *  nc.itf.arap.bill.image.IArapImgCheckService
 *  nc.itf.imag.lightbus.IImagPubService
 *  nc.itf.uap.pf.IWorkflowMachine
 *  nc.vo.arap.pub.BillEnumCollection$BillSatus
 *  nc.vo.arap.utils.ARAPModuleEnableUtil
 *  nc.vo.ml.NCLangRes4VoTransl
 *  nc.vo.pub.AggregatedValueObject
 *  nc.vo.pub.BusinessException
 *  nc.vo.pub.workflownote.WorkflownoteVO
 *  nc.vo.wfengine.core.activity.Activity
 *  nc.vo.wfengine.core.workflow.BasicWorkflowProcess
 */
package nc.impl.arap.bill.image;

import nc.bs.framework.common.InvocationInfoProxy;
import nc.bs.framework.common.NCLocator;
import nc.bs.logging.Logger;
import nc.bs.pf.pub.PfDataCache;
import nc.bs.uif2.validation.ValidationFailure;
import nc.imag.itf.IImagUtil;
import nc.itf.arap.bill.image.IArapImgCheckService;
import nc.itf.imag.lightbus.IImagPubService;
import nc.itf.uap.pf.IWorkflowMachine;
import nc.vo.arap.pub.BillEnumCollection;
import nc.vo.arap.utils.ARAPModuleEnableUtil;
import nc.vo.ml.NCLangRes4VoTransl;
import nc.vo.pub.AggregatedValueObject;
import nc.vo.pub.BusinessException;
import nc.vo.pub.workflownote.WorkflownoteVO;
import nc.vo.wfengine.core.activity.Activity;
import nc.vo.wfengine.core.workflow.BasicWorkflowProcess;

public class ArapImgCheckServiceImpl
implements IArapImgCheckService {
    public void checkPermissionBeforeScan(AggregatedValueObject aggVO, String uiState) throws Exception {
        Logger.debug((Object)"\u5f71\u50cf\u626b\u63cf\u68c0\u67e5\u5f00\u59cb");
        String userID = InvocationInfoProxy.getInstance().getUserId();
        if (!ARAPModuleEnableUtil.isImagEnabled((String)aggVO.getParentVO().getAttributeValue("pk_group").toString())) {
            throw new BusinessException(NCLangRes4VoTransl.getNCLangRes().getStrByID("common", "arapcommonv6-0194"));
        }
        String pk_org = (String)aggVO.getParentVO().getAttributeValue("pk_org");
        String billType = this.getbillTypeByAggVO(aggVO);
        int needScan = ((IImagPubService)NCLocator.getInstance().lookup(IImagPubService.class)).getImageScanType(pk_org, billType);
        if (needScan == 0) {
            throw new BusinessException(NCLangRes4VoTransl.getNCLangRes().getStrByID("common", "arapcommonv6-0181"));
        }
        if (needScan == -1 || needScan == 1) {
            int billstatus;
            if (!"ADD".equals(uiState.toUpperCase()) && !"EDIT".equals(uiState.toUpperCase()) && (billstatus = ((Integer)aggVO.getParentVO().getAttributeValue("billstatus")).intValue()) != BillEnumCollection.BillSatus.TEMPEORARY.VALUE) {
                Logger.debug((Object)"\u5236\u5355\u4eba\u626b\u63cf\uff1a\u4e0d\u662f\u65b0\u589e\u548c\u7f16\u8f91\u72b6\u6001\uff0c\u4e0d\u5141\u8bb8\u626b\u63cf");
                throw new BusinessException(NCLangRes4VoTransl.getNCLangRes().getStrByID("common", "arapcommonv6-0182"));
            }
            String billMaker = (String)aggVO.getParentVO().getAttributeValue("billmaker");
            if (billMaker != null && !billMaker.equals(userID)) {
                Logger.debug((Object)"\u5236\u5355\u4eba\u626b\u63cf\uff1a\u5f53\u524d\u7528\u6237\u4e0d\u662f\u5236\u5355\u4eba\uff0c\u4e0d\u5141\u8bb8\u626b\u63cf");
                throw new BusinessException(NCLangRes4VoTransl.getNCLangRes().getStrByID("common", "arapcommonv6-0193"));
            }
        } else if (needScan == -2 || needScan == 2) {
            WorkflownoteVO[] noteVO = null;
            IWorkflowMachine workflowMachine = (IWorkflowMachine)NCLocator.getInstance().lookup(IWorkflowMachine.class);
            noteVO = workflowMachine.queryWorkitemsNotCheck(billType, aggVO.getParentVO().getPrimaryKey(), userID);
            if (noteVO == null) {
                Logger.debug((Object)"\u4e13\u5c97\u626b\u63cf\uff1a\u6ca1\u6709\u627e\u5230\u5ba1\u6279\u6d41");
                throw new BusinessException(NCLangRes4VoTransl.getNCLangRes().getStrByID("common", "arapcommonv6-0182"));
            }
            String actID = noteVO[0].getTaskInfo().getTask().getActivityID();
            String defPK = noteVO[0].getTaskInfo().getTask().getWfProcessDefPK();
            BasicWorkflowProcess wfProcess = PfDataCache.getWorkflowProcess((String)defPK);
            Activity act = wfProcess.findActivityByID(actID);
            boolean isOn = false;
            isOn = ((IImagUtil)NCLocator.getInstance().lookup(IImagUtil.class)).isImagActivity(act, billType);
            if (!isOn) {
                throw new BusinessException(NCLangRes4VoTransl.getNCLangRes().getStrByID("common", "arapcommonv6-0183"));
            }
        }
        Logger.debug((Object)"\u5f71\u50cf\u626b\u63cf\u68c0\u67e5\u7ed3\u675f");
    }

    public ValidationFailure checkPermissionBeforeSave(AggregatedValueObject aggVO) throws BusinessException {
        if (!ARAPModuleEnableUtil.isImagEnabled((String)aggVO.getParentVO().getAttributeValue("pk_group").toString())) {
            return null;
        }
        String pk_org = (String)aggVO.getParentVO().getAttributeValue("pk_org");
        String billType = this.getbillTypeByAggVO(aggVO);
        IImagPubService service = (IImagPubService)NCLocator.getInstance().lookup(IImagPubService.class);
        int needScan = service.getImageScanType(pk_org, billType);
        if (needScan == 1) {
            String pk_bill = aggVO.getParentVO().getPrimaryKey();
            if (pk_bill == null) {
                return new ValidationFailure(NCLangRes4VoTransl.getNCLangRes().getStrByID("common", "arapcommonv6-0184"));
            }
            boolean hasScaned = service.ifImageHasScaned(pk_bill);
            if (!hasScaned) {
                return new ValidationFailure(NCLangRes4VoTransl.getNCLangRes().getStrByID("common", "arapcommonv6-0184"));
            }
        }
        return null;
    }

    private String getbillTypeByAggVO(AggregatedValueObject aggVO) {
        String billType = (String)aggVO.getParentVO().getAttributeValue("pk_billtype");
        String tradeType = (String)aggVO.getParentVO().getAttributeValue("pk_tradetype");
        return tradeType != null ? tradeType : billType;
    }
}


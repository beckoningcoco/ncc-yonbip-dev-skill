/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  nc.bs.framework.common.InvocationInfoProxy
 *  nc.bs.framework.common.NCLocator
 *  nc.impl.pubapp.env.BSContext
 *  nc.itf.tb.control.IAccessableBusiVO
 *  nc.itf.tb.control.IBudgetControl
 *  nc.itf.uap.pf.IPFWorkflowQry
 *  nc.md.persist.framework.MDPersistenceService
 *  nc.vo.arap.basebill.BaseAggVO
 *  nc.vo.arap.basebill.BaseBillVO
 *  nc.vo.arap.basebill.BaseItemVO
 *  nc.vo.arap.exception.ArapTbbException
 *  nc.vo.arap.gathering.AggGatheringBillVO
 *  nc.vo.arap.ntb.ArapAccessableBusiVO
 *  nc.vo.arap.pay.AggPayBillVO
 *  nc.vo.arap.payable.AggPayableBillVO
 *  nc.vo.arap.pub.ArapConstant
 *  nc.vo.arap.pub.BillEnumCollection$BillSatus
 *  nc.vo.arap.receivable.AggReceivableBillVO
 *  nc.vo.pub.AggregatedValueObject
 *  nc.vo.pub.BusinessException
 *  nc.vo.pub.lang.UFBoolean
 *  nc.vo.pub.lang.UFDateTime
 *  nc.vo.tb.control.DataRuleVO
 *  nc.vo.tb.control.NtbCtlInfoVO
 *  nccloud.commons.lang.ArrayUtils
 */
package nc.bs.arap.tbb;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import nc.bs.framework.common.InvocationInfoProxy;
import nc.bs.framework.common.NCLocator;
import nc.impl.pubapp.env.BSContext;
import nc.itf.tb.control.IAccessableBusiVO;
import nc.itf.tb.control.IBudgetControl;
import nc.itf.uap.pf.IPFWorkflowQry;
import nc.md.persist.framework.MDPersistenceService;
import nc.vo.arap.basebill.BaseAggVO;
import nc.vo.arap.basebill.BaseBillVO;
import nc.vo.arap.basebill.BaseItemVO;
import nc.vo.arap.exception.ArapTbbException;
import nc.vo.arap.gathering.AggGatheringBillVO;
import nc.vo.arap.ntb.ArapAccessableBusiVO;
import nc.vo.arap.pay.AggPayBillVO;
import nc.vo.arap.payable.AggPayableBillVO;
import nc.vo.arap.pub.ArapConstant;
import nc.vo.arap.pub.BillEnumCollection;
import nc.vo.arap.receivable.AggReceivableBillVO;
import nc.vo.pub.AggregatedValueObject;
import nc.vo.pub.BusinessException;
import nc.vo.pub.lang.UFBoolean;
import nc.vo.pub.lang.UFDateTime;
import nc.vo.tb.control.DataRuleVO;
import nc.vo.tb.control.NtbCtlInfoVO;
import nccloud.commons.lang.ArrayUtils;

public class TbbCtrlBO {
    private Map<String, DataRuleVO[]> tbbDataRuleCache = new HashMap<String, DataRuleVO[]>();

    public boolean budgetControl(BaseAggVO[] aggVOs, String actionType, int isControl) throws BusinessException {
        String message;
        ArapAccessableBusiVO temp;
        int i;
        InvocationInfoProxy.getInstance().setProperty("tm_tbbctrltype", null);
        BaseBillVO head = aggVOs[0].getHeadVO();
        String key = head.getPk_billtype() + actionType;
        Object[] accessableBusiVOs = null;
        ArapConstant constant = new ArapConstant();
        boolean isNeedAfter = this.dealSpecialFieldBefore(aggVOs, actionType);
        IBudgetControl budgetControlServ = (IBudgetControl)NCLocator.getInstance().lookup(IBudgetControl.class);
        if (!actionType.equals(constant.ARAP_NTB_EDIT_KEY)) {
            Object[] ruleVOs = this.tbbDataRuleCache.get(key);
            if (ruleVOs == null) {
                ruleVOs = budgetControlServ.queryControlTactics(head.getPk_billtype(), actionType, true);
                this.tbbDataRuleCache.put(key, (DataRuleVO[])(ArrayUtils.isEmpty((Object[])ruleVOs) ? new DataRuleVO[]{} : ruleVOs));
            }
            if (ruleVOs == null || ruleVOs.length == 0) {
                return true;
            }
            ArrayList<ArapAccessableBusiVO> list = new ArrayList<ArapAccessableBusiVO>();
            for (int j = 0; j < ruleVOs.length; ++j) {
                for (BaseAggVO aggvo : aggVOs) {
                    if (BillEnumCollection.BillSatus.TEMPEORARY.VALUE.equals(aggvo.getHeadVO().getBillstatus()) || BillEnumCollection.BillSatus.UNCOMFIRM.VALUE.equals(aggvo.getHeadVO().getBillstatus())) continue;
                    BaseItemVO[] items = aggvo.getItems();
                    for (i = 0; i < items.length; ++i) {
                        temp = new ArapAccessableBusiVO(head, items[i]);
                        temp.setDataType(ruleVOs[j].getDataType());
                        temp.setAdd(ruleVOs[j].isAdd());
                        list.add(temp);
                    }
                }
            }
            accessableBusiVOs = new ArapAccessableBusiVO[list.size()];
            for (int i2 = 0; i2 < list.size(); ++i2) {
                accessableBusiVOs[i2] = (ArapAccessableBusiVO)list.get(i2);
                if ((!constant.ARAP_NTB_EFFECT_KEY.equals(actionType) || accessableBusiVOs[i2].isAdd()) && (!constant.ARAP_NTB_UNEFFECT_KEY.equals(actionType) || !accessableBusiVOs[i2].isAdd())) continue;
                accessableBusiVOs[i2].getBillVO().setEffectdate(null);
                accessableBusiVOs[i2].getBillVO().setApprovedate(null);
            }
        } else {
            BaseItemVO[] items = aggVOs[0].getItems();
            Object[] ruleVOs = this.tbbDataRuleCache.get(head.getPk_billtype() + constant.ARAP_NTB_SAVE_KEY);
            if (ruleVOs == null) {
                ruleVOs = budgetControlServ.queryControlTactics(head.getPk_billtype(), constant.ARAP_NTB_SAVE_KEY, true);
                this.tbbDataRuleCache.put(head.getPk_billtype() + constant.ARAP_NTB_SAVE_KEY, (DataRuleVO[])(ArrayUtils.isEmpty((Object[])ruleVOs) ? new DataRuleVO[]{} : ruleVOs));
            }
            if (ruleVOs == null || ruleVOs.length == 0) {
                return true;
            }
            String dataType = ruleVOs[0].getDataType();
            String pk = head.getPrimaryKey();
            String billType = head.getPk_billtype();
            BaseAggVO preVO = null;
            BaseItemVO[] preItems = null;
            BaseBillVO preHead = null;
            if ("F2".equals(billType)) {
                preVO = (BaseAggVO)MDPersistenceService.lookupPersistenceQueryService().queryBillOfVOByPK(AggGatheringBillVO.class, pk, false);
            } else if ("F3".equals(billType)) {
                preVO = (BaseAggVO)MDPersistenceService.lookupPersistenceQueryService().queryBillOfVOByPK(AggPayBillVO.class, pk, false);
            } else if ("F0".equals(billType)) {
                preVO = (BaseAggVO)MDPersistenceService.lookupPersistenceQueryService().queryBillOfVOByPK(AggReceivableBillVO.class, pk, false);
            } else if ("F1".equals(billType)) {
                preVO = (BaseAggVO)MDPersistenceService.lookupPersistenceQueryService().queryBillOfVOByPK(AggPayableBillVO.class, pk, false);
            }
            if (preVO != null) {
                preItems = preVO.getItems();
                preHead = preVO.getHeadVO();
            }
            accessableBusiVOs = new ArapAccessableBusiVO[preItems.length + items.length];
            for (i = 0; i < preItems.length; ++i) {
                temp = new ArapAccessableBusiVO(preHead, preItems[i]);
                temp.setDataType(dataType);
                temp.setAdd(false);
                accessableBusiVOs[i] = temp;
            }
            for (i = preItems.length; i < preItems.length + items.length; ++i) {
                temp = new ArapAccessableBusiVO(head, items[i - preItems.length]);
                temp.setDataType(dataType);
                temp.setAdd(true);
                accessableBusiVOs[i] = temp;
            }
        }
        NtbCtlInfoVO ctrlInfo = null;
        if (!ArrayUtils.isEmpty((Object[])accessableBusiVOs)) {
            if (isControl == 1) {
                ctrlInfo = budgetControlServ.getControlInfo((IAccessableBusiVO[])accessableBusiVOs);
            } else if (isControl == 2) {
                ctrlInfo = budgetControlServ.getCheckInfo((IAccessableBusiVO[])accessableBusiVOs);
            } else if (isControl == 3) {
                budgetControlServ.noCheckUpdateExe((IAccessableBusiVO[])accessableBusiVOs);
            }
        }
        if (isNeedAfter) {
            this.dealSpecialFieldAfter(aggVOs, actionType);
        }
        if (ctrlInfo != null && ctrlInfo.isControl()) {
            message = "";
            String[] infos = ctrlInfo.getControlInfos();
            for (int i3 = 0; i3 < infos.length; ++i3) {
                message = message + infos[i3];
            }
            throw new BusinessException(message);
        }
        if (ctrlInfo != null && ctrlInfo.isMayBeControl()) {
            message = "";
            String[] infos = ctrlInfo.getFlexibleControlInfos();
            for (int i4 = 0; i4 < infos.length; ++i4) {
                message = message + infos[i4];
            }
            boolean result = true;
            for (BaseAggVO aggVO : aggVOs) {
                if (((IPFWorkflowQry)NCLocator.getInstance().lookup(IPFWorkflowQry.class)).isApproveFlowStartup(aggVO.getParent().getPrimaryKey(), ((BaseBillVO)aggVO.getParent()).getPk_billtype()) || ((IPFWorkflowQry)NCLocator.getInstance().lookup(IPFWorkflowQry.class)).isWorkFlowStartup(aggVO.getParent().getPrimaryKey(), ((BaseBillVO)aggVO.getParent()).getPk_billtype())) {
                    aggVO.setTbbMsg(message);
                    result = false;
                    continue;
                }
                Object checkFlag = BSContext.getInstance().getSession(ArapConstant.ARAP_TBB_ACTIONNAME);
                if (checkFlag != null && (String.valueOf(checkFlag).equals(constant.ARAP_NTB_SAVE_KEY) || String.valueOf(checkFlag).equals(constant.ARAP_NTB_EDIT_KEY) || String.valueOf(checkFlag).equals(constant.ARAP_NTB_DELETE_KEY))) {
                    aggVO.setTbbMsg(message);
                    result = false;
                    continue;
                }
                throw new BusinessException(message);
            }
            return result;
        }
        if (ctrlInfo != null && ctrlInfo.isAlarm()) {
            InvocationInfoProxy.getInstance().setProperty("tm_tbbctrltype", ArapConstant.TM_TBB_CTRL_ALAM);
            String flag = InvocationInfoProxy.getInstance().getProperty("tm_tbbalarmconfirm");
            Object checkFlag = BSContext.getInstance().getSession(ArapConstant.ARAP_TBB_FLAG);
            if (checkFlag != null && String.valueOf(checkFlag).equals(ArapConstant.ARAP_TBB_NOCHECK) || flag != null && Boolean.parseBoolean(flag)) {
                BSContext.getInstance().setSession(ArapConstant.ARAP_TBB_FLAG, (Object)ArapConstant.ARAP_TBB_CHECK);
                return true;
            }
            String message2 = "";
            String[] infos = ctrlInfo.getAlarmInfos();
            for (int i5 = 0; i5 < infos.length; ++i5) {
                message2 = message2 + infos[i5];
            }
            if (aggVOs[0].isFromCmpSignEffect() || aggVOs[0].isFromCmpSettleEffect() || aggVOs[0].isFromCmpSignAndAutoSettleEffect()) {
                aggVOs[0].setTbbMsg(message2);
            } else {
                throw new ArapTbbException(message2);
            }
        }
        return true;
    }

    private boolean dealSpecialFieldBefore(BaseAggVO[] aggVOs, String actionType) {
        boolean result = false;
        ArapConstant constant = new ArapConstant();
        for (BaseAggVO aggVO : aggVOs) {
            BaseBillVO parentVO;
            if (!constant.ARAP_NTB_UNEFFECT_KEY.equals(actionType) && !constant.ARAP_NTB_UNAPPROVE_KEY.equals(actionType) || (parentVO = (BaseBillVO)aggVO.getParentVO()).getApprovedate() != null) continue;
            parentVO.setApprovedate(parentVO.getApprovedate_bak());
            result = true;
        }
        return result;
    }

    private void dealSpecialFieldAfter(BaseAggVO[] aggVOs, String actionType) {
        ArapConstant constant = new ArapConstant();
        for (BaseAggVO aggVO : aggVOs) {
            if (!constant.ARAP_NTB_UNEFFECT_KEY.equals(actionType) && !constant.ARAP_NTB_UNAPPROVE_KEY.equals(actionType)) continue;
            BaseBillVO parentVO = (BaseBillVO)aggVO.getParentVO();
            parentVO.setApprovedate(null);
        }
    }

    public UFBoolean isBugetOverFLow(AggregatedValueObject aggVO) {
        try {
            BaseBillVO headVO = ((BaseAggVO)aggVO).getHeadVO();
            boolean flag = false;
            if (headVO.getApprovedate() == null) {
                flag = true;
            }
            if (flag) {
                headVO.setApprovedate(new UFDateTime(InvocationInfoProxy.getInstance().getBizDateTime()));
            }
            ArapConstant constant = new ArapConstant();
            UFBoolean result = UFBoolean.valueOf((!this.budgetControl(new BaseAggVO[]{(BaseAggVO)aggVO}, constant.ARAP_NTB_EFFECT_KEY, 2) ? 1 : 0) != 0);
            if (flag) {
                headVO.setApprovedate(null);
            }
            return result;
        }
        catch (BusinessException e) {
            return UFBoolean.TRUE;
        }
    }
}


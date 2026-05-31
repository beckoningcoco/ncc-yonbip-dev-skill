/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  nc.bs.framework.common.InvocationInfoProxy
 *  nc.bs.framework.common.NCLocator
 *  nc.impl.pubapp.env.BSContext
 *  nc.itf.cmp.settlement.ISettlementQueryService
 *  nc.md.persist.framework.MDPersistenceService
 *  nc.vo.arap.basebill.BaseAggVO
 *  nc.vo.arap.pub.ArapConstant
 *  nc.vo.arap.utils.ARAPModuleEnableUtil
 *  nc.vo.jcom.lang.StringUtil
 *  nc.vo.pub.AggregatedValueObject
 *  nc.vo.pub.BusinessException
 *  nc.vo.pub.lang.UFBoolean
 */
package nccloud.bs.arap.tbb;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import nc.bs.arap.tbb.TbbCtrlBO;
import nc.bs.framework.common.InvocationInfoProxy;
import nc.bs.framework.common.NCLocator;
import nc.impl.pubapp.env.BSContext;
import nc.itf.cmp.settlement.ISettlementQueryService;
import nc.md.persist.framework.MDPersistenceService;
import nc.vo.arap.basebill.BaseAggVO;
import nc.vo.arap.pub.ArapConstant;
import nc.vo.arap.utils.ARAPModuleEnableUtil;
import nc.vo.jcom.lang.StringUtil;
import nc.vo.pub.AggregatedValueObject;
import nc.vo.pub.BusinessException;
import nc.vo.pub.lang.UFBoolean;

public class TBBCtrlUtils {
    String eventTypeTmp = null;

    public void budgetControl(AggregatedValueObject[] bills, String eventType, int isControl) throws BusinessException {
        if (!this.isNeedTBBCtrl(bills, eventType)) {
            return;
        }
        TbbCtrlBO tbbCtrlBO = new TbbCtrlBO();
        String actionType = this.getActionTypeByEventType(this.eventTypeTmp);
        HashMap orgMap = new HashMap();
        ArrayList<String> pkList = new ArrayList<String>();
        for (AggregatedValueObject destVo : bills) {
            String pk_org = ((BaseAggVO)destVo).getHeadVO().getPk_org();
            if (orgMap.get(pk_org) == null) {
                orgMap.put(pk_org, new ArrayList());
            }
            pkList.add(destVo.getParentVO().getPrimaryKey());
            ((List)orgMap.get(pk_org)).add(destVo);
        }
        boolean cmpEnable = ARAPModuleEnableUtil.isCMPEnable(null);
        String billtype = (String)bills[0].getParentVO().getAttributeValue("pk_billtype");
        boolean isF2F3 = billtype != null ? billtype.equals("F2") || billtype.equals("F3") : false;
        Map needBackTbbMap = new HashMap();
        if (cmpEnable && isF2F3) {
            needBackTbbMap = ((ISettlementQueryService)NCLocator.getInstance().lookup(ISettlementQueryService.class)).isNeedWriteBackTbb(pkList.toArray(new String[0]));
        }
        if ("200604".equals(eventType) && needBackTbbMap != null && needBackTbbMap.size() > 0) {
            String check = (String)BSContext.getInstance().getSession(ArapConstant.ARAP_TBB_FLAG);
            for (String pk_org : orgMap.keySet()) {
                List list = (List)orgMap.get(pk_org);
                ArrayList<AggregatedValueObject> noCheckTbbList = new ArrayList<AggregatedValueObject>();
                ArrayList<AggregatedValueObject> checkTbbList = new ArrayList<AggregatedValueObject>();
                for (AggregatedValueObject baseVo : list) {
                    String pk = baseVo.getParentVO().getPrimaryKey();
                    if (needBackTbbMap != null && needBackTbbMap.get(pk) != null && ((UFBoolean)needBackTbbMap.get(pk)).booleanValue()) {
                        noCheckTbbList.add(baseVo);
                        continue;
                    }
                    checkTbbList.add(baseVo);
                }
                if (noCheckTbbList.size() > 0) {
                    BSContext.getInstance().setSession(ArapConstant.ARAP_TBB_FLAG, (Object)ArapConstant.ARAP_TBB_NOCHECK);
                    tbbCtrlBO.budgetControl(noCheckTbbList.toArray(new BaseAggVO[0]), actionType, isControl);
                }
                if (checkTbbList.size() <= 0) continue;
                BSContext.getInstance().setSession(ArapConstant.ARAP_TBB_FLAG, (Object)check);
                tbbCtrlBO.budgetControl(checkTbbList.toArray(new BaseAggVO[0]), actionType, isControl);
            }
        } else {
            for (String pk_org : orgMap.keySet()) {
                tbbCtrlBO.budgetControl(((List)orgMap.get(pk_org)).toArray(new BaseAggVO[0]), actionType, isControl);
            }
        }
    }

    private boolean isNeedTBBCtrl(AggregatedValueObject[] bills, String eventType) throws BusinessException {
        if (!("1001".equals(eventType) || "200604".equals(eventType) || "200605".equals(eventType) || "1006".equals(eventType) || "1003".equals(eventType))) {
            return false;
        }
        if (!ARAPModuleEnableUtil.isTbbEnabled((String)InvocationInfoProxy.getInstance().getGroupId())) {
            return false;
        }
        return this.isTBB(bills, eventType);
    }

    private boolean isTBB(AggregatedValueObject[] bills, String eventType) throws BusinessException {
        int objtype;
        boolean istbb = true;
        this.eventTypeTmp = eventType;
        String pk_billtype = (String)bills[0].getParentVO().getAttributeValue("pk_billtype");
        if ("F0".equals(pk_billtype) || "F1".equals(pk_billtype)) {
            String start_period = (String)bills[0].getParentVO().getAttributeValue("start_period");
            Integer total_period = (Integer)bills[0].getParentVO().getAttributeValue("total_period");
            if (!StringUtil.isEmptyWithTrim((String)start_period) || total_period != null) {
                istbb = false;
            }
            if ("1003".equals(eventType)) {
                String pk_bill = bills[0].getParentVO().getPrimaryKey();
                Collection vo = MDPersistenceService.lookupPersistenceQueryService().queryBillOfVOByPKs(bills[0].getClass(), new String[]{pk_bill}, true);
                if (vo != null && vo.size() > 0) {
                    BaseAggVO oriVO = (BaseAggVO)vo.iterator().next();
                    String start_period_ori = (String)oriVO.getParentVO().getAttributeValue("start_period");
                    if (!istbb && StringUtil.isEmptyWithTrim((String)start_period_ori)) {
                        this.eventTypeTmp = "1006";
                    } else if (istbb && !StringUtil.isEmptyWithTrim((String)start_period_ori)) {
                        this.eventTypeTmp = "1001";
                    }
                }
            }
        }
        UFBoolean isrefund = (UFBoolean)bills[0].getParentVO().getAttributeValue("isrefund");
        if (UFBoolean.valueOf((String)"Y").equals((Object)isrefund) && ("F3".equals(pk_billtype) || "F1".equals(pk_billtype)) && 0 == (objtype = ((Integer)bills[0].getChildrenVO()[0].getAttributeValue("objtype")).intValue())) {
            istbb = false;
        }
        return istbb || !this.eventTypeTmp.equals(eventType);
    }

    private String getActionTypeByEventType(String eventType) {
        String actionType = null;
        ArapConstant constant = new ArapConstant();
        if ("1001".equals(eventType)) {
            actionType = constant.ARAP_NTB_SAVE_KEY;
        } else if ("200604".equals(eventType)) {
            actionType = constant.ARAP_NTB_EFFECT_KEY;
        } else if ("200605".equals(eventType)) {
            actionType = constant.ARAP_NTB_UNEFFECT_KEY;
        } else if ("1006".equals(eventType)) {
            actionType = constant.ARAP_NTB_DELETE_KEY;
        } else if ("1003".equals(eventType)) {
            actionType = constant.ARAP_NTB_EDIT_KEY;
        }
        return actionType;
    }
}


/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  nc.bs.framework.common.InvocationInfoProxy
 *  nc.bs.framework.common.NCLocator
 *  nc.vo.fipub.exception.ExceptionHandler
 *  nc.vo.pub.BusinessException
 *  nc.vo.pub.lang.UFBoolean
 *  nc.vo.wfengine.definition.WorkflowTypeEnum
 *  nccloud.pubitf.arap.arappub.IArapCommonUtilService
 *  nccloud.pubitf.ssctp.sscbd.lientage.ISSClientageMatchService
 *  nccloud.pubitf.ssctp.sscbd.lientage.ISSClientageMatchService$BusiUnitTypeEnum
 */
package nc.bs.arap.util;

import nc.bs.framework.common.InvocationInfoProxy;
import nc.bs.framework.common.NCLocator;
import nc.vo.fipub.exception.ExceptionHandler;
import nc.vo.pub.BusinessException;
import nc.vo.pub.lang.UFBoolean;
import nc.vo.wfengine.definition.WorkflowTypeEnum;
import nccloud.pubitf.arap.arappub.IArapCommonUtilService;
import nccloud.pubitf.ssctp.sscbd.lientage.ISSClientageMatchService;

public class ArapFlowUtil {
    public static final String FLOW_TYPE_WORKFLOW = "2";
    public static final String FLOW_TYPE_APPROVEFLOW = "1";

    public static String getParamCode(String billtype) {
        return "ARAP" + billtype;
    }

    public static String getApproveActionCode(String pk_org, String billtypecode) {
        String actionCode = "APPROVE";
        if ("23E0".equals(billtypecode) || "23E1".equals(billtypecode)) {
            return actionCode;
        }
        if (ArapFlowUtil.isUseWorkFlow(pk_org, billtypecode)) {
            actionCode = "SIGNAL";
        }
        return actionCode;
    }

    public static String getUnApproveActionCode(String pk_org, String billtypecode) {
        String actionCode = "UNAPPROVE";
        if ("23E0".equals(billtypecode) || "23E1".equals(billtypecode)) {
            return actionCode;
        }
        if (ArapFlowUtil.isUseWorkFlow(pk_org, billtypecode)) {
            actionCode = "ROLLBACK";
        }
        return actionCode;
    }

    public static String getCommitActionCode(String pk_org, String billtypecode) {
        return "SAVE";
    }

    public static String getCommitActionCodeBySSC(String pk_org, String billtypecode) {
        String actionCode = "COMMIT";
        if (ArapFlowUtil.isUseWorkFlow(pk_org, billtypecode)) {
            actionCode = "START";
        }
        return actionCode;
    }

    public static String getBadCommitActionCodeBySSC(String pk_org, String billtypecode) {
        String actionCode = "SAVE";
        if (ArapFlowUtil.isUseWorkFlow(pk_org, billtypecode)) {
            actionCode = "START";
        }
        return actionCode;
    }

    public static String getUnCommitActionCode(String pk_org, String billtypecode) {
        String actionCode = "UNCOMMIT";
        if (ArapFlowUtil.isUseWorkFlow(pk_org, billtypecode)) {
            actionCode = "RECALL";
        }
        return actionCode;
    }

    public static String getBadUnCommitActionCode(String pk_org, String billtypecode) {
        String actionCode = "UNSAVE";
        if (ArapFlowUtil.isUseWorkFlow(pk_org, billtypecode)) {
            actionCode = "RECALL";
        }
        return actionCode;
    }

    public static boolean isUseWorkFlow(String pk_org, String billtypecode) {
        UFBoolean isExist = UFBoolean.FALSE;
        try {
            boolean isUse = ((IArapCommonUtilService)NCLocator.getInstance().lookup(IArapCommonUtilService.class)).isModuleEnable(InvocationInfoProxy.getInstance().getGroupId(), "7010");
            if (isUse) {
                ISSClientageMatchService.BusiUnitTypeEnum busiUnitTypeEnum = ISSClientageMatchService.BusiUnitTypeEnum.AR;
                if ("F1".equals(billtypecode) || "F3".equals(billtypecode)) {
                    busiUnitTypeEnum = ISSClientageMatchService.BusiUnitTypeEnum.AP;
                }
                String pk_group = InvocationInfoProxy.getInstance().getGroupId();
                isExist = ((ISSClientageMatchService)NCLocator.getInstance().lookup(ISSClientageMatchService.class)).queryUnitsByBusiUnitAndOrgPk(pk_group, pk_org, busiUnitTypeEnum);
            }
        }
        catch (BusinessException e) {
            ExceptionHandler.consume((Throwable)e);
        }
        return isExist.booleanValue();
    }

    public static int getWorkFlowType(String pk_org, String billtypecode) {
        int flowtype = WorkflowTypeEnum.Approveflow.getIntValue();
        if (ArapFlowUtil.isUseWorkFlow(pk_org, billtypecode)) {
            flowtype = WorkflowTypeEnum.Workflow.getIntValue();
        }
        return flowtype;
    }
}


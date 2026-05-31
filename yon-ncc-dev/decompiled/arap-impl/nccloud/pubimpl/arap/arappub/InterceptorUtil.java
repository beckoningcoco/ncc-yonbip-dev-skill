/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  nc.bs.framework.common.InvocationInfoProxy
 *  nc.bs.framework.common.NCLocator
 *  nc.itf.uap.pf.IPFWorkflowQry
 *  nc.pubitf.rbac.IDataPermissionPubService
 *  nc.vo.arap.basebill.BaseAggVO
 *  nc.vo.arap.basebill.BaseBillVO
 *  nc.vo.arap.pub.ArapConstant
 *  nc.vo.fipub.exception.ExceptionHandler
 *  nc.vo.ml.NCLangRes4VoTransl
 *  nc.vo.pub.AggregatedValueObject
 *  nc.vo.pub.BusinessException
 *  nc.vo.pub.BusinessRuntimeException
 *  nc.vo.pub.CircularlyAccessibleValueObject
 *  nc.vo.util.remotecallcombination.RemoteCallCombinator
 *  nc.vo.util.remotecallcombination.RemoteCallInfo
 *  nccloud.pubitf.baseapp.apprbac.IDataPermPubService4NCC
 */
package nccloud.pubimpl.arap.arappub;

import nc.bs.framework.common.InvocationInfoProxy;
import nc.bs.framework.common.NCLocator;
import nc.itf.uap.pf.IPFWorkflowQry;
import nc.pubitf.rbac.IDataPermissionPubService;
import nc.vo.arap.basebill.BaseAggVO;
import nc.vo.arap.basebill.BaseBillVO;
import nc.vo.arap.pub.ArapConstant;
import nc.vo.fipub.exception.ExceptionHandler;
import nc.vo.ml.NCLangRes4VoTransl;
import nc.vo.pub.AggregatedValueObject;
import nc.vo.pub.BusinessException;
import nc.vo.pub.BusinessRuntimeException;
import nc.vo.pub.CircularlyAccessibleValueObject;
import nc.vo.util.remotecallcombination.RemoteCallCombinator;
import nc.vo.util.remotecallcombination.RemoteCallInfo;
import nccloud.pubitf.baseapp.apprbac.IDataPermPubService4NCC;

public class InterceptorUtil {
    private String message = null;

    public String getMessage() {
        return this.message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public boolean interceptorDoAction(AggregatedValueObject[] bill, String operateCode) throws BusinessException {
        if (operateCode != null) {
            if (ArapConstant.APPROVE.equals(operateCode)) {
                return true;
            }
            for (int i = 0; i < bill.length; ++i) {
                try {
                    this.isUserHasPermissionForUI(bill[i], operateCode);
                    continue;
                }
                catch (BusinessException e1) {
                    throw new BusinessException((Throwable)e1);
                }
            }
            if (ArapConstant.UNAPPROVE.equals(operateCode)) {
                this.isUserHasUnapprovePermission(bill);
            }
        }
        return true;
    }

    public boolean isUserHasPermissionForUI(BaseAggVO aggVO, String operationCode) throws BusinessException {
        boolean flag = false;
        BaseBillVO head = aggVO.getHeadVO();
        String pk_group = InvocationInfoProxy.getInstance().getGroupId();
        String userId = InvocationInfoProxy.getInstance().getUserId();
        if ("NC_USER0000000000000".equals(userId)) {
            return true;
        }
        String billType = head.getPk_billtype();
        String resourceCode = InterceptorUtil.getResourceCodeByBillType(billType);
        flag = this.isHasPermissionForBill(userId, resourceCode, operationCode, pk_group, (AggregatedValueObject)aggVO);
        if (!flag) {
            StringBuilder error = new StringBuilder();
            error.append(NCLangRes4VoTransl.getNCLangRes().getStrByID("2006pub_0", "02006pub-0045"));
            error.append(NCLangRes4VoTransl.getNCLangRes().getStrByID("2006pub_0", "02006pub-0274", null, new String[]{operationCode}));
            throw new BusinessRuntimeException(error.toString());
        }
        return flag;
    }

    public boolean isUserHasPermissionForUI(AggregatedValueObject aggVO, String operationCode) throws BusinessException {
        String resourceCode;
        boolean flag = false;
        CircularlyAccessibleValueObject head = aggVO.getParentVO();
        String billType = (String)head.getAttributeValue("pk_billtype");
        String pk_group = (String)head.getAttributeValue("pk_group");
        String userId = InvocationInfoProxy.getInstance().getUserId();
        flag = this.isHasPermissionForBill(userId, resourceCode = InterceptorUtil.getResourceCodeByBillType(billType), operationCode, pk_group, aggVO);
        if (!flag) {
            StringBuilder error = new StringBuilder();
            error.append(NCLangRes4VoTransl.getNCLangRes().getStrByID("2006pub_0", "02006pub-0045"));
            error.append(NCLangRes4VoTransl.getNCLangRes().getStrByID("2006pub_0", "02006pub-0274", null, new String[]{operationCode}));
            throw new BusinessRuntimeException(error.toString());
        }
        return flag;
    }

    public void isUserHasUnapprovePermission(AggregatedValueObject ... aggs) throws BusinessException {
        RemoteCallCombinator rcc = new RemoteCallCombinator();
        String pk_group = InvocationInfoProxy.getInstance().getGroupId();
        String userId = InvocationInfoProxy.getInstance().getUserId();
        for (AggregatedValueObject aggVO : aggs) {
            CircularlyAccessibleValueObject parentVO = aggVO.getParentVO();
            String pk_billtype = (String)parentVO.getAttributeValue("pk_billtype");
            RemoteCallInfo info = new RemoteCallInfo();
            info.setClassName(IPFWorkflowQry.class.getName());
            info.setMethodName("isApproveFlowStartup");
            info.setParamTypes(new Class[]{String.class, String.class});
            info.setParams(new Object[]{parentVO.getPrimaryKey(), pk_billtype});
            rcc.addRemoteCallInfo(info);
            RemoteCallInfo info2 = new RemoteCallInfo();
            info2.setClassName(IDataPermissionPubService.class.getName());
            info2.setMethodName("isEnableApproverPerm");
            info2.setParamTypes(new Class[]{String.class, String.class, String.class});
            info2.setParams(new Object[]{userId, InterceptorUtil.getResourceCodeByBillType(pk_billtype), pk_group});
            rcc.addRemoteCallInfo(info2);
        }
        try {
            rcc.doRemoteCall();
            for (int i = 0; i < aggs.length; ++i) {
                String approver;
                boolean approveFlowStartup = (Boolean)rcc.getResult(i * 2);
                boolean flag = (Boolean)rcc.getResult(i * 2 + 1);
                if (approveFlowStartup || !flag || userId.equals(approver = (String)aggs[i].getParentVO().getAttributeValue("approver"))) continue;
                String error = NCLangRes4VoTransl.getNCLangRes().getStrByID("2006pub_0", "02006pub-0276");
                throw new BusinessRuntimeException(error);
            }
        }
        catch (BusinessException e) {
            ExceptionHandler.consume((Throwable)e);
        }
    }

    private boolean isHasPermissionForBill(String userId, String resourceCode, String operationCode, String pk_group, AggregatedValueObject bill) throws BusinessException {
        operationCode = this.changeOperationCode(operationCode);
        return ((IDataPermPubService4NCC)NCLocator.getInstance().lookup(IDataPermPubService4NCC.class)).isUserHasPermission(userId, resourceCode, operationCode, pk_group, (Object)bill);
    }

    private String changeOperationCode(String operationCode) {
        switch (operationCode) {
            case "save": {
                return "makebill";
            }
        }
        return operationCode;
    }

    public static String getResourceCodeByBillType(String billType) {
        String resourceCode = null;
        if ("F0".equals(billType)) {
            resourceCode = "arrecbill";
        } else if ("23F0".equals(billType)) {
            resourceCode = "suprecbill";
        } else if ("F1".equals(billType)) {
            resourceCode = "appayablebill";
        } else if ("23F1".equals(billType)) {
            resourceCode = "cuspayablebill";
        } else if ("F2".equals(billType)) {
            resourceCode = "argatherbill";
        } else if ("23F2".equals(billType)) {
            resourceCode = "supgatherbill";
        } else if ("F3".equals(billType)) {
            resourceCode = "appaybill";
        } else if ("23F3".equals(billType)) {
            resourceCode = "cuspaybill";
        } else if ("23E0".equals(billType)) {
            resourceCode = "arestirecbill";
        } else if ("23E1".equals(billType)) {
            resourceCode = "apestipayablebill";
        } else if ("BDP".equals(billType)) {
            resourceCode = "badbdprovision";
        } else if ("BDPI".equals(billType)) {
            resourceCode = "badindiprovision";
        } else if ("BDL".equals(billType)) {
            resourceCode = "badbdloss";
        } else if ("BDR".equals(billType)) {
            resourceCode = "badbdrecovery";
        }
        return resourceCode;
    }
}


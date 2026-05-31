/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  nc.bd.accperiod.InvalidAccperiodExcetion
 *  nc.bs.framework.common.NCLocator
 *  nc.pubitf.accperiod.AccountCalendar
 *  nc.vo.arap.basebill.BaseAggVO
 *  nc.vo.bd.period2.AccperiodmonthVO
 *  nc.vo.pub.AggregatedValueObject
 *  nc.vo.pub.BusinessException
 *  nc.vo.pubapp.pflow.PfUserObject
 *  nc.vo.uap.pf.PFBatchExceptionInfo
 *  nc.vo.uap.pf.PfProcessBatchRetObject
 *  nccloud.base.exception.ExceptionUtils
 *  nccloud.pubitf.riart.pflow.CloudPFlowContext
 *  nccloud.pubitf.riart.pflow.ICloudScriptPFlowService
 */
package nccloud.pubimpl.arap.openapi;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import nc.bd.accperiod.InvalidAccperiodExcetion;
import nc.bs.framework.common.NCLocator;
import nc.pubitf.accperiod.AccountCalendar;
import nc.vo.arap.basebill.BaseAggVO;
import nc.vo.bd.period2.AccperiodmonthVO;
import nc.vo.pub.AggregatedValueObject;
import nc.vo.pub.BusinessException;
import nc.vo.pubapp.pflow.PfUserObject;
import nc.vo.uap.pf.PFBatchExceptionInfo;
import nc.vo.uap.pf.PfProcessBatchRetObject;
import nccloud.base.exception.ExceptionUtils;
import nccloud.pubitf.riart.pflow.CloudPFlowContext;
import nccloud.pubitf.riart.pflow.ICloudScriptPFlowService;

public class OpenApiBillUtil {
    public static List<PfProcessBatchRetObject> executeBatchPM_noFlow(List<CloudPFlowContext> noFlowParams, String actionName) {
        if (noFlowParams == null || noFlowParams.size() < 1) {
            return null;
        }
        ArrayList<PfProcessBatchRetObject> pfInfoLst = new ArrayList<PfProcessBatchRetObject>();
        ICloudScriptPFlowService service = (ICloudScriptPFlowService)NCLocator.getInstance().lookup(ICloudScriptPFlowService.class);
        for (CloudPFlowContext context : noFlowParams) {
            Object[] errObj = null;
            try {
                errObj = "COMMIT".equals(actionName) ? service.exeScriptPFlow_CommitNoFlowBatch(context) : service.exeScriptPFlow_UnSaveNoFlowBatch(context);
            }
            catch (Exception e) {
                String msg = ExceptionUtils.unmarsh((Throwable)e).getMessage();
                Object[] obt = new Object[]{context.getBillVos()[0]};
                PFBatchExceptionInfo info = new PFBatchExceptionInfo();
                info.putErrorMessage(0, obt[0], msg);
                PfProcessBatchRetObject obj = new PfProcessBatchRetObject(null, info);
                pfInfoLst.add(obj);
            }
            if (errObj == null) continue;
            for (int i = 0; i < errObj.length; ++i) {
                if (errObj[i] == null) continue;
                PfProcessBatchRetObject obj = (PfProcessBatchRetObject)errObj[i];
                pfInfoLst.add(obj);
            }
        }
        return pfInfoLst;
    }

    public static Object executeBatchPM(String actionType, BaseAggVO[] bills) throws BusinessException {
        if (null == bills || bills.length == 0) {
            return bills;
        }
        ArrayList<BaseAggVO> list = new ArrayList<BaseAggVO>();
        for (BaseAggVO agg : bills) {
            if (agg == null) continue;
            list.add(agg);
        }
        bills = list.toArray(new BaseAggVO[0]);
        PfUserObject[] userObjAry = new PfUserObject[bills.length];
        for (int i = 0; i < bills.length; ++i) {
            userObjAry[i] = new PfUserObject();
        }
        CloudPFlowContext context = new CloudPFlowContext();
        context.seteParam(new HashMap());
        context.setActionName(actionType);
        String billType = (String)bills[0].getParentVO().getAttributeValue("pk_billtype");
        context.setBillType(billType);
        context.setUserObj(userObjAry);
        BaseAggVO[] bills2 = null;
        try {
            bills2 = bills;
        }
        catch (ClassCastException e) {
            bills2 = new BaseAggVO[bills.length];
            System.arraycopy(bills, 0, bills2, 0, bills.length);
        }
        context.setBillVos((AggregatedValueObject[])bills2);
        ICloudScriptPFlowService service = (ICloudScriptPFlowService)NCLocator.getInstance().lookup(ICloudScriptPFlowService.class);
        Object[] objects = service.exeScriptPFlow(context);
        return objects;
    }

    public static String getPeriodByBillDate(String[] pk_orgs, String billyear, String billperiod) throws InvalidAccperiodExcetion {
        Map calendar = AccountCalendar.getInstanceByPk_orgs((String[])pk_orgs);
        String pk_accperiodmonth = null;
        for (String pk_org : pk_orgs) {
            ((AccountCalendar)calendar.get(pk_org)).set(billyear, billperiod);
            AccperiodmonthVO monthVO = ((AccountCalendar)calendar.get(pk_org)).getMonthVO();
            pk_accperiodmonth = monthVO.getPk_accperiodmonth();
        }
        return pk_accperiodmonth;
    }
}


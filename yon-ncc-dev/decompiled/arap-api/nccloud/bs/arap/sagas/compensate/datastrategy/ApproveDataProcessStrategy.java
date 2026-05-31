/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  nc.vo.pub.AggregatedValueObject
 *  nc.vo.pub.BusinessException
 *  nc.vo.pub.CircularlyAccessibleValueObject
 *  org.apache.commons.lang3.ArrayUtils
 *  org.granite.lang.util.Collections
 */
package nccloud.bs.arap.sagas.compensate.datastrategy;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import nc.vo.pub.AggregatedValueObject;
import nc.vo.pub.BusinessException;
import nc.vo.pub.CircularlyAccessibleValueObject;
import nccloud.bs.arap.sagas.compensate.datastrategy.CommonDataProcessStragy;
import nccloud.bs.arap.sagas.compensate.info.ApproveInfo;
import nccloud.bs.arap.sagas.compensate.utils.ApproveCompenstateUtils;
import org.apache.commons.lang3.ArrayUtils;
import org.granite.lang.util.Collections;

public class ApproveDataProcessStrategy
extends CommonDataProcessStragy {
    @Override
    public Map<String, Serializable> packingCompensateData(AggregatedValueObject[] bills) throws BusinessException {
        Map<String, Serializable> paramMap = super.packingCompensateData(bills);
        ArrayList<ApproveInfo> approveInfos = ApproveCompenstateUtils.fetchApproveInfos();
        HashMap data = (HashMap)paramMap.get("SAGAS_CALL_DATA");
        data.put("COMPENSATE_APPROVE_INFOS", approveInfos);
        paramMap.put("SAGAS_CALL_DATA", data);
        return paramMap;
    }

    @Override
    public AggregatedValueObject[] unPackingCompensateData(Map<String, Serializable> paramMap) throws BusinessException {
        AggregatedValueObject[] bills = null;
        HashMap data = (HashMap)paramMap.get("SAGAS_CALL_DATA");
        if (data == null) {
            return bills;
        }
        ArrayList approveInfoList = (ArrayList)data.get("COMPENSATE_APPROVE_INFOS");
        bills = this.queryBills((String)data.get("BILLTYPE"), (String[])data.get("KEYS"));
        this.updateApproveInfo(bills, approveInfoList);
        return bills;
    }

    private void updateApproveInfo(AggregatedValueObject[] bills, ArrayList<ApproveInfo> approveInfoList) throws BusinessException {
        if (ArrayUtils.isEmpty((Object[])bills) || Collections.isEmpty(approveInfoList)) {
            return;
        }
        HashMap<String, ApproveInfo> approveInfoMap = new HashMap<String, ApproveInfo>(16);
        for (ApproveInfo approveInfo : approveInfoList) {
            approveInfoMap.put(approveInfo.getPrimaryKey(), approveInfo);
        }
        for (AggregatedValueObject bill : bills) {
            CircularlyAccessibleValueObject headVO = bill.getParentVO();
            ApproveInfo approveInfo = (ApproveInfo)approveInfoMap.get(headVO.getPrimaryKey());
            if (approveInfo == null || approveInfo.getApprovestatus() == null) continue;
            headVO.setAttributeValue("approvestatus", (Object)approveInfo.getApprovestatus());
            headVO.setAttributeValue("approver", (Object)approveInfo.getApprover());
            headVO.setAttributeValue("approvedate", (Object)approveInfo.getApprovedate());
            headVO.setAttributeValue("approvenote", (Object)approveInfo.getApprovenote());
            headVO.setAttributeValue("billstatus", (Object)approveInfo.getBillstatus());
            headVO.setAttributeValue("officialprintuser", (Object)approveInfo.getOfficialprintuser());
            headVO.setAttributeValue("officialprintdate", (Object)approveInfo.getOfficialprintdate());
        }
    }
}


/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  nc.vo.pub.AggregatedValueObject
 *  nc.vo.pub.BusinessException
 *  nc.vo.pub.CircularlyAccessibleValueObject
 *  nc.vo.pub.lang.UFDate
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
import nc.vo.pub.lang.UFDate;
import nccloud.bs.arap.sagas.compensate.datastrategy.CommonDataProcessStragy;
import nccloud.bs.arap.sagas.compensate.info.EffectInfo;
import org.apache.commons.lang3.ArrayUtils;
import org.granite.lang.util.Collections;

public class UnEffecDataProcessStrategy
extends CommonDataProcessStragy {
    private static final String COMPENSATE_EFFECT_INFOS = "COMPENSATE_EFFECT_INFOS";

    @Override
    public Map<String, Serializable> packingCompensateData(AggregatedValueObject[] bills) throws BusinessException {
        Map<String, Serializable> paramMap = super.packingCompensateData(bills);
        ArrayList<EffectInfo> effectInfos = new ArrayList<EffectInfo>();
        for (AggregatedValueObject bill : bills) {
            CircularlyAccessibleValueObject headVO = bill.getParentVO();
            EffectInfo effectInfo = new EffectInfo();
            effectInfo.setPrimaryKey(headVO.getPrimaryKey());
            effectInfo.setBillstatus((Integer)headVO.getAttributeValue("billstatus"));
            effectInfo.setEffectstatus((Integer)headVO.getAttributeValue("effectstatus"));
            effectInfo.setEffectdate((UFDate)headVO.getAttributeValue("effectdate"));
            effectInfo.setEffectuser((String)headVO.getAttributeValue("effectuser"));
            effectInfo.setSigndate((UFDate)headVO.getAttributeValue("signdate"));
            effectInfo.setSignuser((String)headVO.getAttributeValue("signuser"));
            effectInfo.setSettleflag((Integer)headVO.getAttributeValue("settleflag"));
            effectInfo.setApprovestatus((Integer)headVO.getAttributeValue("approvestatus"));
            effectInfo.setBodyspayflag(this.getBodysFieldValue(bill, "payflag"));
            effectInfo.setBodyscommpaystatus(this.getBodysFieldValue(bill, "commpaystatus"));
            effectInfo.setBodyscommpaytype(this.getBodysFieldValue(bill, "commpaytype"));
            effectInfo.setPayman((String)headVO.getAttributeValue("payman"));
            effectInfo.setPaydate((UFDate)headVO.getAttributeValue("paydate"));
            effectInfo.setSignyear((String)headVO.getAttributeValue("signyear"));
            effectInfo.setSignperiod((String)headVO.getAttributeValue("signperiod"));
            effectInfos.add(effectInfo);
        }
        HashMap data = (HashMap)paramMap.get("SAGAS_CALL_DATA");
        data.put(COMPENSATE_EFFECT_INFOS, effectInfos);
        paramMap.put("SAGAS_CALL_DATA", data);
        return paramMap;
    }

    @Override
    public AggregatedValueObject[] unPackingCompensateData(Map<String, Serializable> paramMap) throws BusinessException {
        AggregatedValueObject[] bills = null;
        HashMap data = (HashMap)paramMap.get("SAGAS_CALL_DATA");
        if (data == null) {
            return null;
        }
        bills = this.queryBills((String)data.get("BILLTYPE"), (String[])data.get("KEYS"));
        ArrayList effectInfos = (ArrayList)data.get(COMPENSATE_EFFECT_INFOS);
        this.updateEffectInfo(bills, effectInfos);
        return bills;
    }

    private Map<String, Integer> getBodysFieldValue(AggregatedValueObject bill, String field) throws BusinessException {
        CircularlyAccessibleValueObject[] childrenVO;
        HashMap<String, Integer> ret = new HashMap<String, Integer>();
        for (CircularlyAccessibleValueObject vo : childrenVO = bill.getChildrenVO()) {
            ret.put(vo.getPrimaryKey(), (Integer)vo.getAttributeValue(field));
        }
        return ret;
    }

    private void updateEffectInfo(AggregatedValueObject[] bills, ArrayList<EffectInfo> effectInfos) throws BusinessException {
        if (ArrayUtils.isEmpty((Object[])bills) || Collections.isEmpty(effectInfos)) {
            return;
        }
        HashMap<String, EffectInfo> effectInfoMap = new HashMap<String, EffectInfo>(16);
        for (EffectInfo effectInfo : effectInfos) {
            effectInfoMap.put(effectInfo.getPrimaryKey(), effectInfo);
        }
        for (AggregatedValueObject bill : bills) {
            CircularlyAccessibleValueObject[] childrenVO;
            CircularlyAccessibleValueObject headVO = bill.getParentVO();
            EffectInfo effectInfo = (EffectInfo)effectInfoMap.get(headVO.getPrimaryKey());
            if (effectInfo != null && effectInfo.getEffectstatus() != null) {
                headVO.setAttributeValue("billstatus", (Object)effectInfo.getBillstatus());
                headVO.setAttributeValue("effectstatus", (Object)effectInfo.getEffectstatus());
                headVO.setAttributeValue("effectdate", (Object)effectInfo.getEffectdate());
                headVO.setAttributeValue("effectuser", (Object)effectInfo.getEffectuser());
                headVO.setAttributeValue("signdate", (Object)effectInfo.getSigndate());
                headVO.setAttributeValue("signuser", (Object)effectInfo.getSignuser());
                headVO.setAttributeValue("settleflag", (Object)effectInfo.getSettleflag());
                headVO.setAttributeValue("approvestatus", (Object)effectInfo.getApprovestatus());
                headVO.setAttributeValue("payman", (Object)effectInfo.getPayman());
                headVO.setAttributeValue("paydate", (Object)effectInfo.getPaydate());
                headVO.setAttributeValue("signyear", (Object)effectInfo.getSignyear());
                headVO.setAttributeValue("signperiod", (Object)effectInfo.getSignperiod());
            }
            Map<String, Integer> bodyspayflag = effectInfo.getBodyspayflag();
            Map<String, Integer> bodyscommstatus = effectInfo.getBodyscommpaystatus();
            Map<String, Integer> bodyscommtype = effectInfo.getBodyscommpaytype();
            for (CircularlyAccessibleValueObject vo : childrenVO = bill.getChildrenVO()) {
                Integer payflag = bodyspayflag.get(vo.getPrimaryKey());
                Integer commpaystatus = bodyscommstatus.get(vo.getPrimaryKey());
                Integer commpaytype = bodyscommtype.get(vo.getPrimaryKey());
                vo.setAttributeValue("payflag", (Object)payflag);
                vo.setAttributeValue("commpaystatus", (Object)commpaystatus);
                vo.setAttributeValue("commpaytype", (Object)commpaytype);
            }
        }
    }
}


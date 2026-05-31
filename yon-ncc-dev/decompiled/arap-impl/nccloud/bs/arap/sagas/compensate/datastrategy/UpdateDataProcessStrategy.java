/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  nc.vo.pub.AggregatedValueObject
 *  nc.vo.pub.BusinessException
 */
package nccloud.bs.arap.sagas.compensate.datastrategy;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;
import nc.vo.pub.AggregatedValueObject;
import nc.vo.pub.BusinessException;
import nccloud.bs.arap.sagas.compensate.datastrategy.CommonDataProcessStragy;
import nccloud.bs.arap.util.LightVOProducer;

public class UpdateDataProcessStrategy
extends CommonDataProcessStragy {
    private static final String LIGHTVOS = "LIGHTVOS";

    @Override
    public Map<String, Serializable> packingCompensateData(AggregatedValueObject[] bills) throws BusinessException {
        Map<String, Serializable> paramMap = super.packingCompensateData(bills);
        HashMap data = (HashMap)paramMap.get("SAGAS_CALL_DATA");
        data.put(LIGHTVOS, bills);
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
        AggregatedValueObject[] ligthVOs = (AggregatedValueObject[])data.get(LIGHTVOS);
        bills = this.queryBills((String)data.get("BILLTYPE"), (String[])data.get("KEYS"));
        LightVOProducer.combinLightVO(bills, ligthVOs);
        return bills;
    }
}


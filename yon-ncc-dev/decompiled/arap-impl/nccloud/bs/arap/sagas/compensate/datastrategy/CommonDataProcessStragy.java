/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  nc.vo.pub.AggregatedValueObject
 *  nc.vo.pub.BusinessException
 *  org.apache.commons.lang3.ArrayUtils
 */
package nccloud.bs.arap.sagas.compensate.datastrategy;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;
import nc.bs.arap.bill.ArapBillDAO;
import nc.vo.pub.AggregatedValueObject;
import nc.vo.pub.BusinessException;
import nccloud.bs.arap.sagas.compensate.datastrategy.AbstractDataProcessStrategy;
import org.apache.commons.lang3.ArrayUtils;

public class CommonDataProcessStragy
extends AbstractDataProcessStrategy {
    @Override
    public Map<String, Serializable> packingCompensateData(AggregatedValueObject[] bills) throws BusinessException {
        HashMap<String, Serializable> paramMap = new HashMap<String, Serializable>(16);
        if (ArrayUtils.isEmpty((Object[])bills)) {
            return paramMap;
        }
        String billType = (String)bills[0].getParentVO().getAttributeValue("pk_billtype");
        String[] keys = new String[bills.length];
        for (int i = 0; i < bills.length; ++i) {
            keys[i] = bills[0].getParentVO().getPrimaryKey();
        }
        HashMap<String, Object> data = new HashMap<String, Object>(8);
        data.put("BILLTYPE", billType);
        data.put("KEYS", keys);
        paramMap.put("SAGAS_CALL_DATA", data);
        return paramMap;
    }

    @Override
    public AggregatedValueObject[] unPackingCompensateData(Map<String, Serializable> paramMap) throws BusinessException {
        AggregatedValueObject[] bills = null;
        HashMap data = (HashMap)paramMap.get("SAGAS_CALL_DATA");
        if (data != null) {
            bills = this.queryBills((String)data.get("BILLTYPE"), (String[])data.get("KEYS"));
        }
        return bills;
    }

    protected AggregatedValueObject[] queryBills(String billType, String[] keys) throws BusinessException {
        if (billType == null || ArrayUtils.isEmpty((Object[])keys)) {
            return null;
        }
        AggregatedValueObject[] bills = new ArapBillDAO().queryBillByPrimaryKeys(keys, billType);
        return bills;
    }
}


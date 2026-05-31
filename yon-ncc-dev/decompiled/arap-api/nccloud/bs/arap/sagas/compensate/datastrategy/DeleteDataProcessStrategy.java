/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  nc.vo.pub.AggregatedValueObject
 *  nc.vo.pub.BusinessException
 *  org.apache.commons.lang3.ArrayUtils
 */
package nccloud.bs.arap.sagas.compensate.datastrategy;

import nc.bs.arap.bill.ArapBillDAO;
import nc.vo.pub.AggregatedValueObject;
import nc.vo.pub.BusinessException;
import nccloud.bs.arap.sagas.compensate.datastrategy.CommonDataProcessStragy;
import org.apache.commons.lang3.ArrayUtils;

public class DeleteDataProcessStrategy
extends CommonDataProcessStragy {
    @Override
    protected AggregatedValueObject[] queryBills(String billType, String[] keys) throws BusinessException {
        if (billType == null || ArrayUtils.isEmpty((Object[])keys)) {
            return null;
        }
        AggregatedValueObject[] bills = new ArapBillDAO().queryBillByKeysForDelete(keys, billType);
        return bills;
    }
}


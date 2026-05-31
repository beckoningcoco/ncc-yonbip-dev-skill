/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  nc.vo.pub.AggregatedValueObject
 *  nc.vo.pub.BusinessException
 */
package nccloud.bs.arap.sagas.compensate.datastrategy;

import java.io.Serializable;
import java.util.Map;
import nc.vo.pub.AggregatedValueObject;
import nc.vo.pub.BusinessException;

public abstract class AbstractDataProcessStrategy {
    public static final String BILLTYPE = "BILLTYPE";
    public static final String KEYS = "KEYS";

    public abstract Map<String, Serializable> packingCompensateData(AggregatedValueObject[] var1) throws BusinessException;

    public abstract AggregatedValueObject[] unPackingCompensateData(Map<String, Serializable> var1) throws BusinessException;
}


/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  nc.vo.pub.AggregatedValueObject
 *  nc.vo.pub.BusinessException
 */
package nccloud.bs.arap.sagas.compensate.utils;

import java.io.Serializable;
import java.util.Map;
import nc.vo.pub.AggregatedValueObject;
import nc.vo.pub.BusinessException;
import nccloud.bs.arap.sagas.compensate.datastrategy.AbstractDataProcessStrategy;
import nccloud.bs.arap.sagas.compensate.factory.DataProcessStragyFactory;
import nccloud.bs.arap.sagas.compensate.factory.SagasCompensateServiceFactory;
import nccloud.bs.arap.sagas.util.SagasUtils;
import nccloud.itf.arap.sagas.compensate.action.IBusiActionSagasCompensateService;

public class SagasCompensateUtils
extends SagasUtils {
    public static void setCompensateService(String operation, AggregatedValueObject[] bills) throws BusinessException {
        Class<? extends IBusiActionSagasCompensateService> serviceClazz = SagasCompensateUtils.getCompensateService(operation);
        if (serviceClazz == null) {
            return;
        }
        Map<String, Serializable> paramMap = SagasCompensateUtils.getCompensateParam(operation, bills);
        SagasCompensateUtils.setCompensateService(serviceClazz, paramMap);
    }

    public static Map<String, Serializable> getCompensateParam(String operation, AggregatedValueObject[] bills) throws BusinessException {
        return SagasCompensateUtils.getDataProcessStrategy(operation).packingCompensateData(bills);
    }

    public static AbstractDataProcessStrategy getDataProcessStrategy(String operation) {
        return new DataProcessStragyFactory().getDataProcessStrategy(operation);
    }

    public static Class<? extends IBusiActionSagasCompensateService> getCompensateService(String operation) throws BusinessException {
        return new SagasCompensateServiceFactory().getCompensateService(operation);
    }
}


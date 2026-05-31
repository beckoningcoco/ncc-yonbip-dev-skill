/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  nc.bs.framework.core.util.ObjectCreator
 *  nc.vo.pub.AggregatedValueObject
 *  nc.vo.pub.BusinessException
 *  org.apache.commons.lang3.ArrayUtils
 */
package nccloud.itf.arap.sagas.compensate.action;

import java.io.Serializable;
import java.util.Map;
import nc.bs.framework.core.util.ObjectCreator;
import nc.vo.arap.pub.ArapConstant;
import nc.vo.pub.AggregatedValueObject;
import nc.vo.pub.BusinessException;
import nccloud.bs.arap.sagas.compensate.billact.IBaseSagasCompensateAction;
import nccloud.bs.arap.sagas.compensate.factory.SagasCompensateActionFactory;
import nccloud.bs.arap.sagas.compensate.utils.SagasCompensateUtils;
import nccloud.itf.arap.sagas.compensate.IArapSagasCompensateService;
import org.apache.commons.lang3.ArrayUtils;

public interface IBusiActionSagasCompensateService
extends IArapSagasCompensateService {
    public String getBusiActionType();

    @Override
    default public void doCompensate(Map<String, Serializable> paramMap) throws BusinessException {
        if (paramMap == null || paramMap.isEmpty()) {
            return;
        }
        Object[] bills = this.processData(paramMap);
        if (ArrayUtils.isEmpty((Object[])bills)) {
            return;
        }
        this.getSagasCompensateAction(this.getBillType((AggregatedValueObject)bills[0])).doSagasCompensate((AggregatedValueObject[])bills);
    }

    default public AggregatedValueObject[] processData(Map<String, Serializable> paramMap) throws BusinessException {
        return SagasCompensateUtils.getDataProcessStrategy(this.getBusiActionType()).unPackingCompensateData(paramMap);
    }

    default public IBaseSagasCompensateAction getSagasCompensateAction(String pk_billtype) throws BusinessException {
        String actionClassName = this.getSagasCompensateActionFactory().getSagasCompensateAction(this.getBusiActionType(), pk_billtype);
        return (IBaseSagasCompensateAction)ObjectCreator.newInstance((String)ArapConstant.SYS_NAME, (String)actionClassName);
    }

    default public SagasCompensateActionFactory getSagasCompensateActionFactory() {
        return new SagasCompensateActionFactory();
    }
}


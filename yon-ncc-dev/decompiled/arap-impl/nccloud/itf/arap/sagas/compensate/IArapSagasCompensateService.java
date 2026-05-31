/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.yonyou.cloud.ncc.irf.INCCSagasCompensateCall
 *  nc.bs.logging.Log
 *  nc.bs.logging.Logger
 *  nc.vo.pub.AggregatedValueObject
 *  nc.vo.pub.BusinessException
 *  nc.vo.pubapp.pattern.exception.ExceptionUtils
 */
package nccloud.itf.arap.sagas.compensate;

import com.yonyou.cloud.ncc.irf.INCCSagasCompensateCall;
import java.io.Serializable;
import java.time.Duration;
import java.time.Instant;
import java.util.Map;
import nc.bs.logging.Log;
import nc.bs.logging.Logger;
import nc.vo.pub.AggregatedValueObject;
import nc.vo.pub.BusinessException;
import nc.vo.pubapp.pattern.exception.ExceptionUtils;
import nccloud.bs.arap.sagas.util.SagasUtils;

public interface IArapSagasCompensateService
extends INCCSagasCompensateCall {
    public void doCompensate(Map<String, Serializable> var1) throws BusinessException;

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    default public void compensate(Map<String, Serializable> map) {
        Instant startTime = Instant.now();
        this.setSagasCompensateFlag();
        try {
            this.doCompensate(map);
        }
        catch (Exception e) {
            Logger.error((Object)("ArapSagasCompensateService[" + this.getClass().getName() + "] Error"), (Throwable)e);
            ExceptionUtils.wrappException((Exception)e);
        }
        finally {
            this.clearSagasCompensateFlag();
            Log.getInstance(this.getClass()).debug((Object)("ArapSagasCompensateService[" + this.getClass().getName() + "] Cost:" + Duration.between(startTime, Instant.now()).toMillis() + " ms."));
        }
    }

    default public void setSagasCompensateFlag() {
        SagasUtils.setBSContextSagaStage("SAGA_COMPENSATE_STAGE");
    }

    default public void clearSagasCompensateFlag() {
        SagasUtils.setBSContextSagaStage(null);
    }

    default public String getBillType(AggregatedValueObject bill) {
        return (String)bill.getParentVO().getAttributeValue("pk_billtype");
    }
}


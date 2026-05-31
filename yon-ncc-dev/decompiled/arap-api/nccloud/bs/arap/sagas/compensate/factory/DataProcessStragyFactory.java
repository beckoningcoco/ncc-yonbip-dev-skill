/*
 * Decompiled with CFR 0.152.
 */
package nccloud.bs.arap.sagas.compensate.factory;

import java.util.HashMap;
import java.util.Map;
import nccloud.bs.arap.sagas.compensate.datastrategy.AbstractDataProcessStrategy;
import nccloud.bs.arap.sagas.compensate.datastrategy.ApproveDataProcessStrategy;
import nccloud.bs.arap.sagas.compensate.datastrategy.CommonDataProcessStragy;
import nccloud.bs.arap.sagas.compensate.datastrategy.DeleteDataProcessStrategy;
import nccloud.bs.arap.sagas.compensate.datastrategy.UnEffecDataProcessStrategy;
import nccloud.bs.arap.sagas.compensate.datastrategy.UpdateDataProcessStrategy;

public class DataProcessStragyFactory {
    private static Map<String, AbstractDataProcessStrategy> strategyMap = null;

    public AbstractDataProcessStrategy getDataProcessStrategy(String operation) {
        AbstractDataProcessStrategy stategy = DataProcessStragyFactory.getStrategyMap().get(operation);
        if (stategy == null) {
            stategy = new CommonDataProcessStragy();
        }
        return stategy;
    }

    private static synchronized Map<String, AbstractDataProcessStrategy> getStrategyMap() {
        if (strategyMap == null) {
            strategyMap = new HashMap<String, AbstractDataProcessStrategy>(16);
            strategyMap.put("delete", new DeleteDataProcessStrategy());
            strategyMap.put("update", new UpdateDataProcessStrategy());
            strategyMap.put("approve", new ApproveDataProcessStrategy());
            strategyMap.put("unapprove", new ApproveDataProcessStrategy());
            strategyMap.put("effect", new UnEffecDataProcessStrategy());
            strategyMap.put("uneffect", new UnEffecDataProcessStrategy());
            strategyMap.put("unsign", new UnEffecDataProcessStrategy());
            strategyMap.put("sign", new UnEffecDataProcessStrategy());
        }
        return strategyMap;
    }
}


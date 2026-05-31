/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.yonyou.iuap.apdoc.coredoc.enums.CoreDocBusinessErrorEnum
 *  com.yonyou.iuap.apdoc.coredoc.exceptions.CoreDocBusinessException
 *  org.slf4j.Logger
 *  org.slf4j.LoggerFactory
 *  org.springframework.beans.factory.annotation.Autowired
 *  org.springframework.context.annotation.Lazy
 *  org.springframework.stereotype.Component
 */
package com.yonyoucloud.upc.datarule;

import com.yonyou.iuap.apdoc.coredoc.enums.CoreDocBusinessErrorEnum;
import com.yonyou.iuap.apdoc.coredoc.exceptions.CoreDocBusinessException;
import com.yonyoucloud.upc.datarule.DataConsumer;
import java.util.List;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Component
public class DataConsumerProxy {
    private Logger logger = LoggerFactory.getLogger(this.getClass());
    @Autowired
    @Lazy
    private List<DataConsumer> consumers;

    public void checkReference(String dataKey, List<Long> ids) throws Exception {
        if (this.consumers == null) {
            return;
        }
        for (DataConsumer consumer : this.consumers) {
            if (!consumer.getDataKeys().contains(dataKey)) continue;
            try {
                List<Long> usedIds = consumer.getRemote().hasReference(dataKey, ids);
                if (usedIds == null || usedIds.size() <= 0) continue;
                throw new CoreDocBusinessException(CoreDocBusinessErrorEnum.COMMON_CHECK_REFERENCE, new Object[]{consumer.getName()});
            }
            catch (Exception e) {
                this.logger.error("\u8fdc\u7a0b\u8c03\u7528\u5f02\u5e38" + e.getMessage(), (Throwable)e);
                throw new CoreDocBusinessException(CoreDocBusinessErrorEnum.COMMON_CHECK_REFERENCE_ERROR, new Object[]{consumer.getName()});
            }
        }
    }
}


/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.yonyou.ucf.mdd.common.interfaces.partition.IPartitionContextPostHandle
 *  org.imeta.core.model.Entity
 *  org.imeta.orm.base.PartitionContext
 *  org.springframework.stereotype.Service
 */
package com.yonyoucloud.upc.divert;

import com.yonyou.ucf.mdd.common.interfaces.partition.IPartitionContextPostHandle;
import org.imeta.core.model.Entity;
import org.imeta.orm.base.PartitionContext;
import org.springframework.stereotype.Service;

@Service
public class PartitionContextService
implements IPartitionContextPostHandle {
    public PartitionContext postHandle(PartitionContext partitionContext) {
        return partitionContext;
    }

    public PartitionContext postHandle4DeleteAndUpdate(PartitionContext partitionContext, Entity entity) {
        if ("aa.merchant.Merchant".equalsIgnoreCase(entity.fullname()) || "aa.merchant.MerchantApplyRange".equalsIgnoreCase(entity.fullname())) {
            partitionContext.put((Object)"isPotential", (Object)"*");
            partitionContext.put((Object)"shop", (Object)"*");
        }
        return partitionContext;
    }
}


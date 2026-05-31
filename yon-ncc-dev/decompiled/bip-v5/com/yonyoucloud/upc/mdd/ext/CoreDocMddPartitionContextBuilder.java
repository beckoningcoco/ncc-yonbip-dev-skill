/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.yonyou.iuap.apdoc.coredoc.utils.BooleanUtil
 *  com.yonyou.ucf.mdd.ext.core.AppContext
 *  com.yonyou.ucf.mdf.query.core.PartitionContextBuilder
 *  org.imeta.biz.base.BizContext
 *  org.imeta.core.lang.BooleanUtils
 *  org.imeta.core.model.Entity
 *  org.imeta.orm.base.PartitionContext
 *  org.slf4j.Logger
 *  org.slf4j.LoggerFactory
 *  org.springframework.context.annotation.Primary
 *  org.springframework.stereotype.Service
 */
package com.yonyoucloud.upc.mdd.ext;

import com.yonyou.iuap.apdoc.coredoc.utils.BooleanUtil;
import com.yonyou.ucf.mdd.ext.core.AppContext;
import com.yonyou.ucf.mdf.query.core.PartitionContextBuilder;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import org.imeta.biz.base.BizContext;
import org.imeta.core.lang.BooleanUtils;
import org.imeta.core.model.Entity;
import org.imeta.orm.base.PartitionContext;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

@Primary
@Service
public class CoreDocMddPartitionContextBuilder
implements PartitionContextBuilder {
    private Logger logger = LoggerFactory.getLogger(CoreDocMddPartitionContextBuilder.class);

    public Map<String, PartitionContext> buildPartitionContext(List<String> fullNames) {
        return fullNames.stream().distinct().collect(Collectors.toMap(fullName -> fullName, fullName -> {
            Entity entity = BizContext.getMetaRepository().entity(fullName);
            try {
                PartitionContext partitionContext = AppContext.getPartitionContextData((Entity)entity);
                partitionContext.put((Object)"base.itf.ITenant.tenant", AppContext.getTenantId());
                PartitionContext contextData = new PartitionContext();
                entity.attributes().forEach(attr -> {
                    if (BooleanUtils.b((Object)attr.isPartition())) {
                        String partitionName = attr.partitionName();
                        String attrFullName = attr.fullname();
                        Object partitionValue = partitionContext.get((Object)attrFullName);
                        if (partitionValue == null) {
                            partitionValue = partitionContext.get((Object)partitionName);
                        }
                        contextData.put((Object)attrFullName, partitionValue == null ? "*" : partitionValue);
                    }
                });
                Boolean includeShopPartion = (Boolean)AppContext.getThreadContext((String)"INCLUDE_SHOP_PARITION_QUERY_SCHEMA");
                if (BooleanUtil.isFalse((Object)includeShopPartion)) {
                    partitionContext.remove((Object)"base.itf.IShop");
                    partitionContext.remove((Object)"shop");
                }
                return contextData;
            }
            catch (Exception e) {
                this.logger.error("getPartitionContextData fail \uff0cfullName \uff1a " + fullName + ",message:" + e.getMessage(), (Throwable)e);
                throw new RuntimeException(e);
            }
        }));
    }
}


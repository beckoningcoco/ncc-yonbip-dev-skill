/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.yonyou.iuap.apdoc.coredoc.utils.BooleanUtil
 *  com.yonyou.ucf.mdd.ext.core.AppContext
 *  com.yonyou.ucf.mdd.ext.model.BillContext
 *  com.yonyou.ucf.mdd.plugin.base.QuerySchemaExecutorPlugin
 *  org.imeta.core.model.Entity
 *  org.imeta.orm.schema.QueryContext
 *  org.imeta.orm.schema.QuerySchema
 *  org.springframework.stereotype.Component
 */
package com.yonyoucloud.upc.mdd.ext;

import com.yonyou.iuap.apdoc.coredoc.utils.BooleanUtil;
import com.yonyou.ucf.mdd.ext.core.AppContext;
import com.yonyou.ucf.mdd.ext.model.BillContext;
import com.yonyou.ucf.mdd.plugin.base.QuerySchemaExecutorPlugin;
import org.imeta.core.model.Entity;
import org.imeta.orm.schema.QueryContext;
import org.imeta.orm.schema.QuerySchema;
import org.springframework.stereotype.Component;

@Component
public class PartitionQuerySchemaExtPlugin
implements QuerySchemaExecutorPlugin {
    public static final String INCLUDE_SHOP_PARITION_QUERY_SCHEMA = "INCLUDE_SHOP_PARITION_QUERY_SCHEMA";

    public void extendQuerySchema(Entity entity, QuerySchema querySchema, BillContext billContext) {
        QueryContext queryContext;
        Boolean includeShopPartion = (Boolean)AppContext.getThreadContext((String)INCLUDE_SHOP_PARITION_QUERY_SCHEMA);
        if (BooleanUtil.isFalse((Object)includeShopPartion) && (queryContext = querySchema.queryContext()) != null && queryContext.getPartitionContext() != null) {
            queryContext.getPartitionContext().remove((Object)"shop");
            queryContext.getPartitionContext().remove((Object)"base.itf.IShop");
        }
    }

    public int order() {
        return 4;
    }
}


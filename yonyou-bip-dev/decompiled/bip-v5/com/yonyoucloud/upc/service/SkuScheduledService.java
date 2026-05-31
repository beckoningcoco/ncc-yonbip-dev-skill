/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.yonyou.iuap.apdoc.coredoc.constants.UPCConstants
 *  com.yonyou.ucf.mdd.ext.dao.meta.MetaDaoHelper
 *  com.yonyou.ucf.mdd.ext.util.RedisTool
 *  com.yonyoucloud.upc.coredoc.common.TimeTaskData
 *  com.yonyoucloud.upc.pc.product.ProductApplyRange
 *  com.yonyoucloud.upc.utils.RedisLockKeyConstants
 *  org.imeta.orm.base.BizObject
 *  org.imeta.orm.base.EntityStatus
 *  org.imeta.orm.schema.ConditionExpression
 *  org.imeta.orm.schema.QueryCondition
 *  org.imeta.orm.schema.QueryConditionGroup
 *  org.imeta.orm.schema.QuerySchema
 *  org.slf4j.Logger
 *  org.slf4j.LoggerFactory
 *  org.springframework.beans.factory.annotation.Autowired
 *  org.springframework.stereotype.Service
 *  org.springframework.transaction.annotation.Transactional
 *  org.springframework.util.CollectionUtils
 */
package com.yonyoucloud.upc.service;

import com.yonyou.iuap.apdoc.coredoc.constants.UPCConstants;
import com.yonyou.ucf.mdd.ext.dao.meta.MetaDaoHelper;
import com.yonyou.ucf.mdd.ext.util.RedisTool;
import com.yonyoucloud.upc.coredoc.common.TimeTaskData;
import com.yonyoucloud.upc.pc.product.ProductApplyRange;
import com.yonyoucloud.upc.service.ProductSkuService;
import com.yonyoucloud.upc.service.UPCProductShelfService;
import com.yonyoucloud.upc.utils.RedisLockKeyConstants;
import java.util.Collection;
import java.util.List;
import java.util.UUID;
import org.imeta.orm.base.BizObject;
import org.imeta.orm.base.EntityStatus;
import org.imeta.orm.schema.ConditionExpression;
import org.imeta.orm.schema.QueryCondition;
import org.imeta.orm.schema.QueryConditionGroup;
import org.imeta.orm.schema.QuerySchema;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.util.CollectionUtils;

@Service
public class SkuScheduledService {
    private static final Logger log = LoggerFactory.getLogger(SkuScheduledService.class);
    @Autowired
    ProductSkuService productSkuService;
    @Autowired
    UPCProductShelfService upcProductShelfService;

    @Transactional(rollbackFor={Throwable.class})
    public void scanSkuImport(TimeTaskData timeTaskData) throws Exception {
        String productId = timeTaskData.getDataId();
        timeTaskData.setEntityStatus(EntityStatus.Update);
        this.dealCount(productId);
        timeTaskData.setDealStatus(Integer.valueOf(1));
        timeTaskData.setResult("success");
        this.writeResult(timeTaskData);
    }

    @Transactional(rollbackFor={Throwable.class})
    public void writeResult(TimeTaskData timeTaskData) throws Exception {
        MetaDaoHelper.update((String)"coredoc.common.TimeTaskData", (BizObject)timeTaskData);
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    private void dealCount(String productId) throws Exception {
        String requestId = UUID.randomUUID().toString();
        try {
            if (RedisTool.tryGetLock((String)(RedisLockKeyConstants.SKUIMPORT_TASK + productId), (String)requestId, (int)UPCConstants.LOCK_EXPIRE_TIME)) {
                QueryConditionGroup queryConditionGroup = QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"productId").eq((Object)productId), QueryCondition.name((String)"isCreator").eq((Object)true)});
                QuerySchema schema = QuerySchema.create().addSelect(new String[]{"productId", "productDetailId", "isCreator", "id"}).addCondition((ConditionExpression)queryConditionGroup);
                List ranges = this.productSkuService.query("pc.product.ProductApplyRange", schema);
                if (!CollectionUtils.isEmpty((Collection)ranges)) {
                    ProductApplyRange range = (ProductApplyRange)ranges.get(0);
                    this.upcProductShelfService.setShelfAndlLnventoryProductSKU(range.getProductId(), range.getProductDetailId(), (Long)range.getId(), range.getIsCreator(), true, true);
                }
            }
        }
        finally {
            RedisTool.releaseLock((String)(RedisLockKeyConstants.SKUIMPORT_TASK + productId), (String)requestId);
        }
    }
}


/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.yonyou.iuap.apdoc.coredoc.enums.CoreDocBusinessErrorEnum
 *  com.yonyou.iuap.apdoc.coredoc.exceptions.CoreDocBusinessException
 *  com.yonyou.iuap.apdoc.coredoc.option.service.PubOptionService
 *  com.yonyou.iuap.context.InvocationInfoProxy
 *  com.yonyou.ucf.mdd.common.model.rule.RuleExecuteResult
 *  com.yonyou.ucf.mdd.ext.bill.rule.base.AbstractCommonRule
 *  com.yonyou.ucf.mdd.ext.model.BillContext
 *  com.yonyou.ucf.mdd.ext.util.RedisTool
 *  com.yonyoucloud.upc.pc.product.Product
 *  com.yonyoucloud.upc.pc.product.ProductSKU
 *  com.yonyoucloud.upc.utils.RedisLockKeyConstants
 *  org.imeta.orm.base.EntityStatus
 *  org.imeta.orm.schema.ConditionExpression
 *  org.imeta.orm.schema.QueryCondition
 *  org.imeta.orm.schema.QueryConditionGroup
 *  org.imeta.orm.schema.QuerySchema
 *  org.springframework.beans.factory.annotation.Autowired
 *  org.springframework.stereotype.Component
 *  org.springframework.util.CollectionUtils
 */
package com.yonyoucloud.upc.billrule.productsku;

import com.yonyou.iuap.apdoc.coredoc.enums.CoreDocBusinessErrorEnum;
import com.yonyou.iuap.apdoc.coredoc.exceptions.CoreDocBusinessException;
import com.yonyou.iuap.apdoc.coredoc.option.service.PubOptionService;
import com.yonyou.iuap.context.InvocationInfoProxy;
import com.yonyou.ucf.mdd.common.model.rule.RuleExecuteResult;
import com.yonyou.ucf.mdd.ext.bill.rule.base.AbstractCommonRule;
import com.yonyou.ucf.mdd.ext.model.BillContext;
import com.yonyou.ucf.mdd.ext.util.RedisTool;
import com.yonyoucloud.upc.pc.product.Product;
import com.yonyoucloud.upc.pc.product.ProductSKU;
import com.yonyoucloud.upc.service.ProductSkuAsyncSaveService;
import com.yonyoucloud.upc.service.ProductSkuRealmService;
import com.yonyoucloud.upc.service.ProductSkuService;
import com.yonyoucloud.upc.utils.RedisLockKeyConstants;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import java.util.stream.Collectors;
import org.imeta.orm.base.EntityStatus;
import org.imeta.orm.schema.ConditionExpression;
import org.imeta.orm.schema.QueryCondition;
import org.imeta.orm.schema.QueryConditionGroup;
import org.imeta.orm.schema.QuerySchema;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.util.CollectionUtils;

@Component(value="productSkuAddAfterSaveRule")
public class ProductSkuAddAfterSaveRule
extends AbstractCommonRule {
    @Autowired
    ProductSkuAsyncSaveService productSkuAsyncSaveService;
    @Autowired
    PubOptionService pubOptionService;
    @Autowired
    ProductSkuService productSkuService;
    @Autowired
    ProductSkuRealmService productSkuRealmService;

    public RuleExecuteResult execute(BillContext billContext, Map<String, Object> paramMap) throws Exception {
        List bills = this.getBills(billContext, paramMap);
        Product product = (Product)bills.get(0);
        String token = InvocationInfoProxy.getYhtAccessToken();
        Object billnumMode = paramMap.get("billCodeContext_billnumMode");
        product.put("billCodeContext_billnumMode", billnumMode);
        if (this.pubOptionService.getProductSkuSaveAsync() > 0 && CollectionUtils.isEmpty((Collection)product.productskus())) {
            product.set("skuasyncfromskuadd", (Object)1);
            String lockKey = RedisLockKeyConstants.PRODUCTSKU_ASYNCSSAVE_CONCURRENCY + product.getId();
            product.put("skuasyncsaveLockKey", (Object)UUID.randomUUID().toString());
            if (RedisTool.tryGetLock((String)lockKey, (String)((String)product.get("skuasyncsaveLockKey")), (int)360)) {
                this.productSkuAsyncSaveService.asyncSaveSku(product, token, EntityStatus.Update);
            }
        } else {
            this.productSkuService.checkSkuCodeUniqueBatch(product.productskus(), (Long)product.getId());
            this.productSkuService.updateCount(product);
            this.checkSkuRepeat(product.productskus(), (Long)product.getId());
            this.returnSkuCode(product.productskus());
        }
        product.put("isCreator", (Object)true);
        product.put("isApplied", (Object)true);
        product.setEntityStatus(EntityStatus.Update);
        this.sendEvent((Long)product.getId(), product.productskus(), (Long)product.get("productApplyRangeId"));
        return null;
    }

    private void returnSkuCode(List<ProductSKU> skus) {
        if (!CollectionUtils.isEmpty(skus)) {
            ArrayList<String> skuCodes = new ArrayList<String>();
            for (ProductSKU sku : skus) {
                if (EntityStatus.Delete != sku.getEntityStatus()) continue;
                skuCodes.add(sku.getCode());
            }
            if (!CollectionUtils.isEmpty(skuCodes)) {
                String[] billCodes = new String[skuCodes.size()];
                billCodes = skuCodes.toArray(billCodes);
                this.productSkuService.returnSkuCodes(billCodes);
            }
        }
    }

    private void checkSkuRepeat(List<ProductSKU> productskus, Long productId) throws Exception {
        if (!CollectionUtils.isEmpty(productskus)) {
            QueryConditionGroup queryConditionGroup = QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"productId").eq((Object)productId), QueryCondition.name((String)"isSKU").eq((Object)1)});
            QuerySchema schema = QuerySchema.create().addSelect("id, freeValueIdsMd5").addCondition((ConditionExpression)queryConditionGroup);
            List skuInDbs = this.productSkuService.query("pc.product.ProductSKU", schema);
            if (!CollectionUtils.isEmpty((Collection)skuInDbs)) {
                HashMap<String, Integer> freeMd5Count = new HashMap<String, Integer>(skuInDbs.size());
                for (ProductSKU skuInDb : skuInDbs) {
                    String freeValueIdsMd5 = skuInDb.getFreeValueIdsMd5();
                    if (null == freeMd5Count.get(freeValueIdsMd5)) {
                        freeMd5Count.put(freeValueIdsMd5, 1);
                        continue;
                    }
                    Integer count = (Integer)freeMd5Count.get(freeValueIdsMd5) + 1;
                    freeMd5Count.put(freeValueIdsMd5, count);
                }
                for (ProductSKU newSku : productskus) {
                    Integer count;
                    if (EntityStatus.Insert != newSku.getEntityStatus() || (count = (Integer)freeMd5Count.get(newSku.getFreeValueIdsMd5())) <= 1) continue;
                    throw new CoreDocBusinessException(CoreDocBusinessErrorEnum.PRODUCT_SENSITIVE_REPEAT_DATA, new Object[]{newSku.getFreeValues()});
                }
            }
        }
    }

    public void sendEvent(Long productId, List<ProductSKU> productskus, Long productApplyRangeId) throws Exception {
        HashMap<String, Object> eventMap = new HashMap<String, Object>();
        List<Object> productUpdateSKUIds = new ArrayList();
        List<Object> productDeleteSKUIds = new ArrayList();
        if (!CollectionUtils.isEmpty(productskus)) {
            productUpdateSKUIds = productskus.stream().filter(productsku -> productsku.getEntityStatus() != EntityStatus.Delete).map(productsku -> productsku.getId().toString()).collect(Collectors.toList());
            productDeleteSKUIds = productskus.stream().filter(productsku -> productsku.getEntityStatus() == EntityStatus.Delete).map(productsku -> productsku.getId().toString()).collect(Collectors.toList());
        }
        eventMap.put("productId", productId.toString());
        if (!CollectionUtils.isEmpty(productUpdateSKUIds)) {
            eventMap.put("productApplyRangeId", productApplyRangeId);
            eventMap.put("productSKUIds", productUpdateSKUIds);
            this.productSkuService.sendEvent(eventMap);
        }
        if (!CollectionUtils.isEmpty(productDeleteSKUIds)) {
            eventMap.put("productSKUIds", productDeleteSKUIds);
            this.productSkuService.sendDeleteEvent(eventMap);
        }
    }
}


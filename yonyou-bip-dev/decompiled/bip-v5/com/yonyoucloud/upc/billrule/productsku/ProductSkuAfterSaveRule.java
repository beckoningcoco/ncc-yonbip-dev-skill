/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.yonyou.iuap.context.InvocationInfoProxy
 *  com.yonyou.ucf.mdd.common.model.rule.RuleExecuteResult
 *  com.yonyou.ucf.mdd.ext.bill.dto.BillDataDto
 *  com.yonyou.ucf.mdd.ext.bill.rule.base.AbstractCommonRule
 *  com.yonyou.ucf.mdd.ext.dao.meta.MetaDaoHelper
 *  com.yonyou.ucf.mdd.ext.dao.sql.SqlHelper
 *  com.yonyou.ucf.mdd.ext.model.BillContext
 *  com.yonyoucloud.upc.coredoc.common.TimeTaskData
 *  com.yonyoucloud.upc.coredoc.common.TimeTaskTypeEnum
 *  com.yonyoucloud.upc.pc.product.ProductApplyRange
 *  com.yonyoucloud.upc.pc.product.ProductSKU
 *  com.yonyoucloud.upc.service.utils.PubOptionDataQueryUtil
 *  org.imeta.orm.base.BizObject
 *  org.imeta.orm.base.EntityStatus
 *  org.imeta.orm.schema.ConditionExpression
 *  org.imeta.orm.schema.QueryCondition
 *  org.imeta.orm.schema.QueryConditionGroup
 *  org.imeta.orm.schema.QuerySchema
 *  org.imeta.spring.support.id.IdManager
 *  org.slf4j.Logger
 *  org.slf4j.LoggerFactory
 *  org.springframework.beans.factory.annotation.Autowired
 *  org.springframework.stereotype.Component
 *  org.springframework.util.CollectionUtils
 */
package com.yonyoucloud.upc.billrule.productsku;

import com.yonyou.iuap.context.InvocationInfoProxy;
import com.yonyou.ucf.mdd.common.model.rule.RuleExecuteResult;
import com.yonyou.ucf.mdd.ext.bill.dto.BillDataDto;
import com.yonyou.ucf.mdd.ext.bill.rule.base.AbstractCommonRule;
import com.yonyou.ucf.mdd.ext.dao.meta.MetaDaoHelper;
import com.yonyou.ucf.mdd.ext.dao.sql.SqlHelper;
import com.yonyou.ucf.mdd.ext.model.BillContext;
import com.yonyoucloud.iuap.upc.api.service.IUPCProductShelfService;
import com.yonyoucloud.upc.coredoc.common.TimeTaskData;
import com.yonyoucloud.upc.coredoc.common.TimeTaskTypeEnum;
import com.yonyoucloud.upc.pc.product.ProductApplyRange;
import com.yonyoucloud.upc.pc.product.ProductSKU;
import com.yonyoucloud.upc.service.ProductSkuAsyncSaveService;
import com.yonyoucloud.upc.service.ProductSkuDetailSaveService;
import com.yonyoucloud.upc.service.ProductSkuRealmService;
import com.yonyoucloud.upc.service.ProductSkuService;
import com.yonyoucloud.upc.service.utils.PubOptionDataQueryUtil;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.imeta.orm.base.BizObject;
import org.imeta.orm.base.EntityStatus;
import org.imeta.orm.schema.ConditionExpression;
import org.imeta.orm.schema.QueryCondition;
import org.imeta.orm.schema.QueryConditionGroup;
import org.imeta.orm.schema.QuerySchema;
import org.imeta.spring.support.id.IdManager;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.util.CollectionUtils;

@Component(value="productSkuAfterSaveRule")
public class ProductSkuAfterSaveRule
extends AbstractCommonRule {
    private static final Logger log = LoggerFactory.getLogger(ProductSkuAfterSaveRule.class);
    @Autowired
    ProductSkuDetailSaveService productSkuDetailSaveService;
    @Autowired
    ProductSkuAsyncSaveService productSkuAsyncSaveService;
    @Autowired
    private IUPCProductShelfService upcProductShelfService;
    @Autowired
    ProductSkuService productSkuService;
    @Autowired
    ProductSkuRealmService productSkuRealmService;
    @Autowired
    PubOptionDataQueryUtil pubOptionDataQueryUtil;

    public RuleExecuteResult execute(BillContext billContext, Map<String, Object> paramMap) throws Exception {
        List bills = this.getBills(billContext, paramMap);
        for (int i = 0; i < bills.size(); ++i) {
            ProductSKU sku = (ProductSKU)bills.get(0);
            QueryConditionGroup queryConditionGroup = QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"productId").eq(sku.get("productId")), QueryCondition.name((String)"orgId").eq(sku.get("orgId"))});
            QuerySchema schema = QuerySchema.create().addSelect("productDetailId, id, isCreator").addCondition((ConditionExpression)queryConditionGroup);
            List ranges = this.productSkuService.query("pc.product.ProductApplyRange", schema);
            ProductApplyRange range = (ProductApplyRange)ranges.get(0);
            if (sku.containsKey((Object)"__APIImportCommand") && ((Boolean)sku.get("__APIImportCommand")).booleanValue()) {
                this.sendProductToTimeTask(sku.get("productId").toString(), TimeTaskTypeEnum.SKU_IMPORT.getValue());
            } else if (sku.containsKey((Object)"_fromApi") && ((Boolean)sku.get("_fromApi")).booleanValue()) {
                this.sendProductToTimeTask(sku.get("productId").toString(), TimeTaskTypeEnum.SKU_API.getValue());
            } else {
                this.upcProductShelfService.setShelfAndlLnventoryProductSKU(sku.getProductId(), range.getProductDetailId(), (Long)range.getId(), range.getIsCreator(), true, true);
            }
            ArrayList<String> productSKUIds = new ArrayList<String>();
            productSKUIds.add(sku.getId().toString());
            HashMap<String, Object> eventMap = new HashMap<String, Object>();
            eventMap.put("productId", sku.get("productId").toString());
            eventMap.put("productApplyRangeId", range.getId().toString());
            eventMap.put("productSKUIds", productSKUIds);
            if (EntityStatus.Insert == sku.getEntityStatus()) {
                BillDataDto billDataDto = (BillDataDto)this.getParam(paramMap);
                String asyncKey = billDataDto.getAsyncKey();
                this.productSkuRealmService.writeImportCache(asyncKey, sku.getProductId());
            }
            this.productSkuService.sendEvent(eventMap);
        }
        return null;
    }

    private void sendProductToTimeTask(String productId, Integer type) throws Exception {
        TimeTaskData timeTaskData = new TimeTaskData();
        timeTaskData.setId((Object)String.valueOf(IdManager.getInstance().nextId()));
        timeTaskData.setDataId(productId);
        timeTaskData.setType(type);
        timeTaskData.setDealStatus(Integer.valueOf(0));
        timeTaskData.setEntityStatus(EntityStatus.Insert);
        timeTaskData.setEntityName("pc.product.Product");
        timeTaskData.setYtenant(InvocationInfoProxy.getTenantid());
        List timeTaskDatas = SqlHelper.selectList((String)"com.yonyoucloud.upc.product.dao.productSkuSelect.selectProductTaskData", (Object)timeTaskData);
        if (CollectionUtils.isEmpty((Collection)timeTaskDatas)) {
            MetaDaoHelper.insert((String)"coredoc.common.TimeTaskData", (BizObject)timeTaskData);
        }
    }
}


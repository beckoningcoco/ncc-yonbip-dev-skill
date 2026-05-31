/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.yonyou.ucf.mdd.common.model.rule.RuleExecuteResult
 *  com.yonyou.ucf.mdd.ext.bill.rule.base.AbstractCommonRule
 *  com.yonyou.ucf.mdd.ext.core.AppContext
 *  com.yonyou.ucf.mdd.ext.dao.meta.MetaDaoHelper
 *  com.yonyou.ucf.mdd.ext.model.BillContext
 *  com.yonyoucloud.upc.service.utils.PubOptionDataQueryUtil
 *  org.imeta.orm.base.BizObject
 *  org.imeta.orm.base.EntityStatus
 *  org.imeta.orm.schema.ConditionExpression
 *  org.imeta.orm.schema.QueryCondition
 *  org.imeta.orm.schema.QueryConditionGroup
 *  org.imeta.orm.schema.QuerySchema
 *  org.imeta.spring.support.id.IdManager
 *  org.springframework.beans.factory.annotation.Autowired
 *  org.springframework.stereotype.Component
 *  org.springframework.util.CollectionUtils
 */
package com.yonyoucloud.upc.billrule.product;

import com.yonyou.ucf.mdd.common.model.rule.RuleExecuteResult;
import com.yonyou.ucf.mdd.ext.bill.rule.base.AbstractCommonRule;
import com.yonyou.ucf.mdd.ext.core.AppContext;
import com.yonyou.ucf.mdd.ext.dao.meta.MetaDaoHelper;
import com.yonyou.ucf.mdd.ext.model.BillContext;
import com.yonyoucloud.iuap.upc.api.service.IUPCProductShelfService;
import com.yonyoucloud.upc.billrule.goodsAchive.ProductSKUShelveRule;
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
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.util.CollectionUtils;

@Component(value="productTaggingRule")
public class ProductTaggingRule
extends AbstractCommonRule {
    @Autowired
    private IUPCProductShelfService upcProductShelfService;
    @Autowired
    ProductSKUShelveRule productSKUShelveRule;
    @Autowired
    PubOptionDataQueryUtil pubOptionDataQueryUtil;

    public RuleExecuteResult execute(BillContext billContext, Map<String, Object> paramMap) throws Exception {
        List bills = this.getBills(billContext, paramMap);
        if (null != bills && !bills.isEmpty()) {
            AppContext.delThreadContext((String)"isSupportAsync");
            for (BizObject bill : bills) {
                List tags = (List)bill.get("tags");
                if (tags == null || tags.isEmpty()) {
                    return new RuleExecuteResult();
                }
                Boolean isCreator = bill.getBoolean("isCreator");
                Long productApplyRangeId = Long.parseLong(bill.get("productApplyRangeId").toString());
                List ranges = MetaDaoHelper.queryById((String)"pc.product.ProductApplyRange", (String)"id, productId, isApplied, productDetailId", (Object)productApplyRangeId);
                Map range = (Map)ranges.get(0);
                if (!Boolean.parseBoolean(range.get("isApplied").toString())) {
                    this.productSKUShelveRule.initRangeData(range.get("productId").toString(), Long.parseLong(range.get("id").toString()));
                    ranges = MetaDaoHelper.queryById((String)"pc.product.ProductApplyRange", (String)"*", (Object)productApplyRangeId);
                    range = (Map)ranges.get(0);
                }
                Long productDetailId = Long.parseLong(range.get("productDetailId").toString());
                Long productId = Long.parseLong(bill.get("id").toString());
                this.dealProductTagNew(bill, billContext.getAction(), productDetailId, isCreator);
                this.upcProductShelfService.updateAutoModifyInfo(productId, productApplyRangeId.toString());
            }
        }
        return new RuleExecuteResult();
    }

    private void dealProductTagNew(BizObject bill, String action, Long productDetailId, Boolean isCreator) throws Exception {
        QuerySchema schema = QuerySchema.create().addSelect("id,tagId").addCondition((ConditionExpression)QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"productId").eq(bill.get("id")), QueryCondition.name((String)"productDetailId").eq((Object)productDetailId)}));
        List tags = (List)bill.get("tags");
        List existsTagsNew = MetaDaoHelper.query((String)"pc.product.ProductTagNew", (QuerySchema)schema);
        ArrayList tagsNew2Db = new ArrayList();
        if ("batchcleartag".equalsIgnoreCase(action)) {
            if (!CollectionUtils.isEmpty((Collection)existsTagsNew)) {
                existsTagsNew.forEach(tag -> {
                    if (tags.contains(tag.get("tagId").toString())) {
                        BizObject productTagNew = new BizObject();
                        productTagNew.setId(tag.get("id"));
                        productTagNew.set("productId", bill.get("id"));
                        productTagNew.set("productApplyRangeId", bill.get("productApplyRangeId"));
                        productTagNew.setEntityStatus(EntityStatus.Delete);
                        tagsNew2Db.add(productTagNew);
                    }
                });
            }
        } else if ("batchtag".equalsIgnoreCase(action)) {
            Map productApplyRangeMap = (Map)MetaDaoHelper.queryById((String)"pc.product.ProductApplyRange", (String)"id,productDetailId", (Object)bill.get("productApplyRangeId")).get(0);
            HashMap tagIdMap = new HashMap();
            existsTagsNew.forEach(a -> tagIdMap.put(a.get("tagId").toString(), a.get("id").toString()));
            tags.forEach(tag -> {
                BizObject productTagNew = new BizObject();
                productTagNew.setId((Object)IdManager.getInstance().nextId());
                productTagNew.set("productId", bill.get("id"));
                productTagNew.set("productApplyRangeId", bill.get("productApplyRangeId"));
                productTagNew.set("tagId", tag);
                productTagNew.set("productDetailId", productApplyRangeMap.get("productDetailId"));
                productTagNew.set("isCreator", (Object)isCreator);
                if (tagIdMap.containsKey(tag)) {
                    productTagNew.setId(tagIdMap.get("tag"));
                    productTagNew.setEntityStatus(EntityStatus.Unchanged);
                } else {
                    productTagNew.setEntityStatus(EntityStatus.Insert);
                }
                tagsNew2Db.add(productTagNew);
            });
        }
        if (!tagsNew2Db.isEmpty()) {
            MetaDaoHelper.update((String)"pc.product.ProductTagNew", tagsNew2Db);
        }
    }
}


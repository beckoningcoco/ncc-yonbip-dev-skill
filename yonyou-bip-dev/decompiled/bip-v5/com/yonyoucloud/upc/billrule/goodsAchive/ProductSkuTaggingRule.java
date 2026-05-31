/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.yonyou.iuap.apdoc.coredoc.enums.CoreExtrateBusinessErrorEnum
 *  com.yonyou.iuap.apdoc.coredoc.exceptions.CoreDocBusinessException
 *  com.yonyou.ucf.mdd.common.model.rule.RuleExecuteResult
 *  com.yonyou.ucf.mdd.ext.bill.rule.base.AbstractCommonRule
 *  com.yonyou.ucf.mdd.ext.core.AppContext
 *  com.yonyou.ucf.mdd.ext.dao.meta.MetaDaoHelper
 *  com.yonyou.ucf.mdd.ext.dao.sql.SqlHelper
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
package com.yonyoucloud.upc.billrule.goodsAchive;

import com.yonyou.iuap.apdoc.coredoc.enums.CoreExtrateBusinessErrorEnum;
import com.yonyou.iuap.apdoc.coredoc.exceptions.CoreDocBusinessException;
import com.yonyou.ucf.mdd.common.model.rule.RuleExecuteResult;
import com.yonyou.ucf.mdd.ext.bill.rule.base.AbstractCommonRule;
import com.yonyou.ucf.mdd.ext.core.AppContext;
import com.yonyou.ucf.mdd.ext.dao.meta.MetaDaoHelper;
import com.yonyou.ucf.mdd.ext.dao.sql.SqlHelper;
import com.yonyou.ucf.mdd.ext.model.BillContext;
import com.yonyoucloud.upc.billrule.goodsAchive.ProductSKUShelveRule;
import com.yonyoucloud.upc.service.utils.PubOptionDataQueryUtil;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
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

@Component(value="productSkuTaggingRule")
public class ProductSkuTaggingRule
extends AbstractCommonRule {
    @Autowired
    ProductSKUShelveRule productSKUShelveRule;
    @Autowired
    PubOptionDataQueryUtil pubOptionDataQueryUtil;

    public RuleExecuteResult execute(BillContext billContext, Map<String, Object> paramMap) throws Exception {
        List bills = this.getBills(billContext, paramMap);
        if (null != bills && !bills.isEmpty()) {
            AppContext.delThreadContext((String)"isSupportAsync");
            for (BizObject bill : bills) {
                List tags;
                Long productApplyRangeId = Long.parseLong(bill.get("productApplyRangeId").toString());
                List ranges = MetaDaoHelper.queryById((String)"pc.product.ProductApplyRange", (String)"*", (Object)productApplyRangeId);
                Map range = (Map)ranges.get(0);
                if (!Boolean.parseBoolean(range.get("isApplied").toString())) {
                    this.productSKUShelveRule.initRangeData(range.get("productId").toString(), Long.parseLong(range.get("id").toString()));
                    ranges = MetaDaoHelper.queryById((String)"pc.product.ProductApplyRange", (String)"*", (Object)productApplyRangeId);
                    range = (Map)ranges.get(0);
                }
                if ((tags = (List)bill.get("tags")) == null || tags.isEmpty()) {
                    return new RuleExecuteResult();
                }
                this.dealSkuTagNew(bill, billContext.getAction(), Long.parseLong(range.get("productDetailId").toString()));
            }
        }
        return new RuleExecuteResult();
    }

    private void dealSkuTagOld(String action, List<String> tagIds, Boolean isCreator, Long skuId, Long productApplyRangeId) throws Exception {
        HashMap<String, Object> params = new HashMap<String, Object>();
        params.put("ytenant", AppContext.getYTenantId());
        params.put("skuId", skuId);
        params.put("productApplyRangeId", productApplyRangeId);
        List existsTags = isCreator != false ? SqlHelper.selectList((String)"com.yonyoucloud.upc.data.ProductDoubleWriteDao.selectSkuTagExtendByCondition", params) : SqlHelper.selectList((String)"com.yonyoucloud.upc.data.ProductDoubleWriteDao.selectSkuTagByCondition", params);
        Map<Object, Object> existsTagMap = Collections.emptyMap();
        HashSet<String> tagInDbSet = new HashSet<String>();
        if (!CollectionUtils.isEmpty((Collection)existsTags)) {
            existsTagMap = existsTags.stream().collect(Collectors.groupingBy(map -> map.get("tagId").toString()));
            for (Map tagInDb : existsTags) {
                tagInDbSet.add(tagInDb.get("tagId").toString());
            }
        }
        if ("batchcleartag".equalsIgnoreCase(action)) {
            if (!CollectionUtils.isEmpty(tagInDbSet)) {
                ArrayList removedIds = new ArrayList();
                for (String tagId2 : tagIds) {
                    if (!tagInDbSet.contains(tagId2)) continue;
                    ((List)existsTagMap.get(tagId2)).forEach(a -> removedIds.add(Long.parseLong(a.get("id").toString())));
                }
                if (!CollectionUtils.isEmpty(removedIds)) {
                    params.put("ids", removedIds);
                    if (isCreator.booleanValue()) {
                        SqlHelper.delete((String)"com.yonyoucloud.upc.data.ProductDoubleWriteDao.deleteSkuTagExtendByPrimaryKey", params);
                    } else {
                        SqlHelper.delete((String)"com.yonyoucloud.upc.data.ProductDoubleWriteDao.deleteSkuTagByPrimaryKey", params);
                    }
                }
            }
        } else if ("batchtag".equalsIgnoreCase(action)) {
            ArrayList tagsToDbList = new ArrayList();
            tagIds.forEach(tagId -> {
                if (!tagInDbSet.contains(tagId)) {
                    BizObject tagToDb = new BizObject();
                    tagToDb.setId((Object)IdManager.getInstance().nextId());
                    tagToDb.set("skuId", (Object)skuId);
                    tagToDb.set("productApplyRangeId", (Object)productApplyRangeId);
                    tagToDb.set("tagId", tagId);
                    tagToDb.put("tenant", (Object)AppContext.getCurrentUser().getYxyTenantId());
                    tagToDb.put("ytenant", AppContext.getYTenantId());
                    tagToDb.setEntityStatus(EntityStatus.Insert);
                    tagsToDbList.add(tagToDb);
                }
            });
            if (!tagsToDbList.isEmpty()) {
                if (isCreator.booleanValue()) {
                    SqlHelper.insert((String)"com.yonyoucloud.upc.data.ProductDoubleWriteDao.insertSkuTagExtendBatch", tagsToDbList);
                } else {
                    SqlHelper.delete((String)"com.yonyoucloud.upc.data.ProductDoubleWriteDao.insertSkuTagBatch", tagsToDbList);
                }
            }
        } else {
            throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_800080);
        }
    }

    private void dealSkuTagNew(BizObject bill, String action, Long productDetailId) throws Exception {
        List tags = (List)bill.get("tags");
        QuerySchema schema = QuerySchema.create().addSelect("id,tagId").addCondition((ConditionExpression)QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"skuId").eq(bill.get("id")), QueryCondition.name((String)"productDetailId").eq((Object)productDetailId)}));
        List existsSkuTagsNew = MetaDaoHelper.query((String)"pc.product.SkuTagNew", (QuerySchema)schema);
        ArrayList tagsNew2Db = new ArrayList();
        if ("batchcleartag".equalsIgnoreCase(action)) {
            if (!CollectionUtils.isEmpty((Collection)existsSkuTagsNew)) {
                existsSkuTagsNew.forEach(tag -> {
                    if (tags.contains(tag.get("tagId").toString())) {
                        BizObject skuTagNew = new BizObject();
                        skuTagNew.setId(tag.get("id"));
                        skuTagNew.set("skuId", bill.get("id"));
                        skuTagNew.set("productApplyRangeId", bill.get("productApplyRangeId"));
                        skuTagNew.setEntityStatus(EntityStatus.Delete);
                        tagsNew2Db.add(skuTagNew);
                    }
                });
            }
        } else if ("batchtag".equalsIgnoreCase(action)) {
            HashMap tagIdMap = new HashMap();
            existsSkuTagsNew.forEach(a -> tagIdMap.put(a.get("tagId").toString(), a.get("id").toString()));
            tags.forEach(tag -> {
                BizObject skuTagNew = new BizObject();
                skuTagNew.setId((Object)IdManager.getInstance().nextId());
                skuTagNew.set("skuId", bill.get("id"));
                skuTagNew.set("productApplyRangeId", bill.get("productApplyRangeId"));
                skuTagNew.set("productDetailId", (Object)productDetailId);
                skuTagNew.set("tagId", tag);
                if (tagIdMap.containsKey(tag)) {
                    skuTagNew.setId(tagIdMap.get(tag));
                    skuTagNew.setEntityStatus(EntityStatus.Unchanged);
                } else {
                    skuTagNew.setEntityStatus(EntityStatus.Insert);
                }
                tagsNew2Db.add(skuTagNew);
            });
        }
        if (!tagsNew2Db.isEmpty()) {
            MetaDaoHelper.update((String)"pc.product.SkuTagNew", tagsNew2Db);
        }
    }
}


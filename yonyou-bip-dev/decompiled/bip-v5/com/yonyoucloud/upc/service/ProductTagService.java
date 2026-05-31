/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.yonyou.iuap.apdoc.coredoc.enums.CoreExtrateBusinessErrorEnum
 *  com.yonyou.iuap.apdoc.coredoc.exceptions.CoreDocBusinessException
 *  com.yonyou.ucf.mdd.ext.dao.meta.MetaDaoHelper
 *  com.yonyoucloud.upc.service.utils.PubOptionDataQueryUtil
 *  org.imeta.orm.base.BizObject
 *  org.imeta.orm.base.EntityStatus
 *  org.imeta.orm.schema.ConditionExpression
 *  org.imeta.orm.schema.QueryCondition
 *  org.imeta.orm.schema.QueryConditionGroup
 *  org.imeta.orm.schema.QuerySchema
 *  org.imeta.spring.support.id.IdManager
 *  org.springframework.beans.factory.annotation.Autowired
 *  org.springframework.stereotype.Service
 *  org.springframework.util.CollectionUtils
 */
package com.yonyoucloud.upc.service;

import com.yonyou.iuap.apdoc.coredoc.enums.CoreExtrateBusinessErrorEnum;
import com.yonyou.iuap.apdoc.coredoc.exceptions.CoreDocBusinessException;
import com.yonyou.ucf.mdd.ext.dao.meta.MetaDaoHelper;
import com.yonyoucloud.upc.service.utils.PubOptionDataQueryUtil;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.imeta.orm.base.BizObject;
import org.imeta.orm.base.EntityStatus;
import org.imeta.orm.schema.ConditionExpression;
import org.imeta.orm.schema.QueryCondition;
import org.imeta.orm.schema.QueryConditionGroup;
import org.imeta.orm.schema.QuerySchema;
import org.imeta.spring.support.id.IdManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;

@Service
public class ProductTagService {
    @Autowired
    PubOptionDataQueryUtil pubOptionDataQueryUtil;
    public static final int MAX_COUNT = 1000;

    public void synProductTag(List<Map<String, Object>> productTags) throws Exception {
        Map<String, List<Map<String, Object>>> queryResult = this.dealAndQueryProductTag(productTags);
        List<Map<String, Object>> existsTagNew = queryResult.get("existsTagNew");
        ArrayList tags2Db = new ArrayList();
        ArrayList<BizObject> tagsNew2Db = new ArrayList<BizObject>();
        if (existsTagNew != null) {
            for (Map<String, Object> existsTag : existsTagNew) {
                BizObject tag = new BizObject();
                tag.setId(existsTag.get("id"));
                tag.set("productId", existsTag.get("productId"));
                tag.set("productApplyRangeId", existsTag.get("productApplyRangeId"));
                tag.setEntityStatus(EntityStatus.Delete);
                tagsNew2Db.add(tag);
            }
        }
        for (Map<String, Object> productTag : productTags) {
            Set tags = (Set)productTag.get("tags");
            if (CollectionUtils.isEmpty((Collection)tags) || productTag.get("productId") == null || productTag.get("productApplyRangeId") == null) continue;
            for (Long tag : tags) {
                BizObject tagNew = new BizObject();
                tagNew.setId((Object)IdManager.getInstance().nextId());
                tagNew.set("productId", productTag.get("productId"));
                tagNew.set("productApplyRangeId", productTag.get("productApplyRangeId"));
                tagNew.set("tagId", (Object)tag);
                tagNew.set("productDetailId", productTag.get("productDetailId"));
                tagNew.setEntityStatus(EntityStatus.Insert);
                tagsNew2Db.add(tagNew);
            }
        }
        if (!tags2Db.isEmpty() && tags2Db.size() > 1000) {
            throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_801422);
        }
        if (!tagsNew2Db.isEmpty() && tagsNew2Db.size() > 1000) {
            throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_801422);
        }
        if (!tagsNew2Db.isEmpty()) {
            MetaDaoHelper.update((String)"pc.product.ProductTagNew", tagsNew2Db);
        }
    }

    private Map<String, List<Map<String, Object>>> dealAndQueryProductTag(List<Map<String, Object>> productTags) throws Exception {
        if (productTags == null) {
            throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_801423);
        }
        HashSet<String> erpCodeProducts = new HashSet<String>();
        ArrayList erpCodeTags = new ArrayList();
        for (Map<String, Object> productTag : productTags) {
            erpCodeProducts.add(productTag.get("erpCode").toString());
            erpCodeTags.addAll((List)productTag.get("tagErpCodes"));
        }
        if (erpCodeProducts.size() != productTags.size()) {
            throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_801424);
        }
        QuerySchema schema = QuerySchema.create().addSelect("id,erpCode").addCondition((ConditionExpression)QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"erpCode").in(erpCodeProducts)}));
        List productIdList = MetaDaoHelper.query((String)"pc.product.Product", (QuerySchema)schema);
        ArrayList<Long> productIds = new ArrayList<Long>();
        HashMap<String, Long> productIdAndErpCodeMap = new HashMap<String, Long>();
        if (productIdList != null) {
            for (Map productId : productIdList) {
                productIds.add((Long)productId.get("id"));
                productIdAndErpCodeMap.put((String)productId.get("erpCode"), (Long)productId.get("id"));
            }
        }
        schema = QuerySchema.create().addSelect("id,erpCode").addCondition((ConditionExpression)QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"erpCode").in(erpCodeTags)}));
        List tagList = MetaDaoHelper.query((String)"pc.tag.Tag", (QuerySchema)schema);
        HashMap<String, Long> tagErpCodeAndId = new HashMap<String, Long>();
        if (tagList != null) {
            for (Map map : tagList) {
                tagErpCodeAndId.put((String)map.get("erpCode"), (Long)map.get("id"));
            }
        }
        for (Map map : productTags) {
            List tagErpCodes = (List)map.get("tagErpCodes");
            if (tagErpCodes == null) continue;
            HashSet<Long> tags = new HashSet<Long>();
            for (String string : tagErpCodes) {
                if (tagErpCodeAndId.get(string) == null) continue;
                tags.add((Long)tagErpCodeAndId.get(string));
            }
            map.put("tags", tags);
        }
        schema = QuerySchema.create().addSelect("productId, id, productDetailId").addCondition((ConditionExpression)QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"productId").in(productIds), QueryCondition.name((String)"isCreator").eq((Object)true)}));
        List productApplyRanges = MetaDaoHelper.query((String)"pc.product.ProductApplyRange", (QuerySchema)schema);
        ArrayList<Long> arrayList = new ArrayList<Long>();
        HashMap<Long, Long> applyAndProductMap = new HashMap<Long, Long>();
        HashMap<Long, Long> detailAndProductMap = new HashMap<Long, Long>();
        if (productApplyRanges != null) {
            for (Map map : productApplyRanges) {
                if (map == null) continue;
                arrayList.add((Long)map.get("id"));
                applyAndProductMap.put((Long)map.get("productId"), (Long)map.get("id"));
                detailAndProductMap.put((Long)map.get("productId"), (Long)map.get("productDetailId"));
            }
        }
        for (Map map : productTags) {
            if (map == null || map.get("erpCode") == null || productIdAndErpCodeMap == null || productIdAndErpCodeMap.get(map.get("erpCode").toString()) == null) continue;
            map.put("productId", productIdAndErpCodeMap.get(map.get("erpCode").toString()));
            map.put("productApplyRangeId", applyAndProductMap.get((Long)map.get("productId")));
            map.put("productDetailId", detailAndProductMap.get((Long)map.get("productId")));
        }
        schema = QuerySchema.create().addSelect("id,tagId,productId,productApplyRangeId").addCondition((ConditionExpression)QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"productId").in(productIds), QueryCondition.name((String)"productApplyRangeId").in(arrayList)}));
        List existsTagNew = MetaDaoHelper.query((String)"pc.product.ProductTagNew", (QuerySchema)schema);
        HashMap<String, List<Map<String, Object>>> hashMap = new HashMap<String, List<Map<String, Object>>>();
        hashMap.put("existsTagNew", existsTagNew);
        return hashMap;
    }
}


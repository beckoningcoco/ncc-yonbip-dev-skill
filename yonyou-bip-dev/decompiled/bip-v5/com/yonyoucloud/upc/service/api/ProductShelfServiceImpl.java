/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.yonyou.cloud.middleware.rpc.RemoteCall
 *  com.yonyou.iuap.apdoc.coredoc.enums.CoreExtrateBusinessErrorEnum
 *  com.yonyou.iuap.apdoc.coredoc.exceptions.CoreDocBusinessException
 *  com.yonyou.ucf.mdd.common.model.rule.RuleExecuteResult
 *  com.yonyou.ucf.mdd.ext.bill.biz.BillBiz
 *  com.yonyou.ucf.mdd.ext.bill.dto.BillDataDto
 *  com.yonyou.ucf.mdd.ext.dao.meta.MetaDaoHelper
 *  com.yonyoucloud.iuap.upc.api.IProductShelveServiceV2
 *  com.yonyoucloud.iuap.upc.dto.ext.UPCRuleExecuteResult
 *  com.yonyoucloud.upc.utils.CoreDocJsonResult
 *  com.yonyoucloud.upc.utils.UPCResultConverter
 *  org.apache.commons.collections4.MapUtils
 *  org.imeta.orm.base.BizObject
 *  org.imeta.orm.schema.ConditionExpression
 *  org.imeta.orm.schema.QueryCondition
 *  org.imeta.orm.schema.QueryConditionGroup
 *  org.imeta.orm.schema.QuerySchema
 *  org.slf4j.Logger
 *  org.slf4j.LoggerFactory
 *  org.springframework.beans.factory.annotation.Autowired
 *  org.springframework.stereotype.Service
 *  org.springframework.util.CollectionUtils
 */
package com.yonyoucloud.upc.service.api;

import com.yonyou.cloud.middleware.rpc.RemoteCall;
import com.yonyou.iuap.apdoc.coredoc.enums.CoreExtrateBusinessErrorEnum;
import com.yonyou.iuap.apdoc.coredoc.exceptions.CoreDocBusinessException;
import com.yonyou.ucf.mdd.common.model.rule.RuleExecuteResult;
import com.yonyou.ucf.mdd.ext.bill.biz.BillBiz;
import com.yonyou.ucf.mdd.ext.bill.dto.BillDataDto;
import com.yonyou.ucf.mdd.ext.dao.meta.MetaDaoHelper;
import com.yonyoucloud.iuap.upc.api.IProductShelveService;
import com.yonyoucloud.iuap.upc.api.IProductShelveServiceV2;
import com.yonyoucloud.iuap.upc.dto.ext.UPCRuleExecuteResult;
import com.yonyoucloud.upc.service.api.SkuServiceImpl;
import com.yonyoucloud.upc.service.api.UPCBizServiceImpl;
import com.yonyoucloud.upc.utils.CoreDocJsonResult;
import com.yonyoucloud.upc.utils.UPCResultConverter;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.apache.commons.collections4.MapUtils;
import org.imeta.orm.base.BizObject;
import org.imeta.orm.schema.ConditionExpression;
import org.imeta.orm.schema.QueryCondition;
import org.imeta.orm.schema.QueryConditionGroup;
import org.imeta.orm.schema.QuerySchema;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;

@Service
@RemoteCall(value="productcenter-ext@c87e2267-1001-4c70-bb2a-ab41f3b81aa3")
public class ProductShelfServiceImpl
implements IProductShelveService,
IProductShelveServiceV2 {
    private static final Logger log = LoggerFactory.getLogger(ProductShelfServiceImpl.class);
    @Autowired
    SkuServiceImpl skuService;
    @Autowired
    UPCBizServiceImpl upcBizService;

    @Override
    public RuleExecuteResult shelfUorderProduct(Long productId, List<String> productApplyRangeIds) throws Exception {
        return this.shelfProduct(productId, productApplyRangeIds, "shelve", "uorder");
    }

    @Override
    public RuleExecuteResult unShelfUorderProduct(Long productId, List<String> productApplyRangeIds) throws Exception {
        return this.shelfProduct(productId, productApplyRangeIds, "unshelve", "uorder");
    }

    @Override
    public RuleExecuteResult shelfUmallProduct(Long productId, List<String> productApplyRangeIds) throws Exception {
        return this.shelfProduct(productId, productApplyRangeIds, "shelve", "umall");
    }

    @Override
    public RuleExecuteResult unShelfUmallProduct(Long productId, List<String> productApplyRangeIds) throws Exception {
        return this.shelfProduct(productId, productApplyRangeIds, "unshelve", "umall");
    }

    private RuleExecuteResult shelfProduct(Long productId, List<String> productApplyRangeIds, String action, String bizType) throws Exception {
        if (null == productId) {
            throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_800938);
        }
        if (CollectionUtils.isEmpty(productApplyRangeIds)) {
            throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_801146);
        }
        if (productApplyRangeIds.size() > 500) {
            throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_801147);
        }
        QueryConditionGroup queryConditionGroup = QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"productId").eq((Object)productId), QueryCondition.name((String)"id").in(productApplyRangeIds)});
        QuerySchema schema = QuerySchema.create().addSelect("id, isCreator").addCondition((ConditionExpression)queryConditionGroup);
        List ranges = MetaDaoHelper.query((String)"pc.product.ProductApplyRange", (QuerySchema)schema);
        if (CollectionUtils.isEmpty((Collection)ranges)) {
            throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_801148);
        }
        HashMap<String, Map> rangesMap = new HashMap<String, Map>(ranges.size());
        for (Map range : ranges) {
            rangesMap.put(range.get("id").toString(), range);
        }
        BillDataDto dto = new BillDataDto();
        dto.setBillnum("pc_productdetail");
        dto.setAction(action);
        ArrayList<BizObject> datas = new ArrayList<BizObject>();
        for (String productApplyRangeId : productApplyRangeIds) {
            if (!rangesMap.containsKey(productApplyRangeId)) {
                throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_801149);
            }
            BizObject biz = new BizObject();
            biz.setId((Object)productId);
            biz.set("productApplyRangeId", (Object)productApplyRangeId);
            Object isCreator = ((Map)rangesMap.get(productApplyRangeId)).get("isCreator");
            biz.set("isCreator", (Object)Boolean.parseBoolean(isCreator.toString()));
            biz.set("biz", (Object)bizType);
            datas.add(biz);
        }
        dto.setData(datas);
        return BillBiz.executeUpdate((String)action, (BillDataDto)dto);
    }

    public UPCRuleExecuteResult shelfUorderProductV2(Long productId, List<String> productApplyRangeIds) throws Exception {
        RuleExecuteResult ruleExecuteResult = this.shelfUorderProduct(productId, productApplyRangeIds);
        return UPCResultConverter.ruleExecuteConvert((RuleExecuteResult)ruleExecuteResult);
    }

    public UPCRuleExecuteResult unShelfUorderProductV2(Long productId, List<String> productApplyRangeIds) throws Exception {
        RuleExecuteResult ruleExecuteResult = this.unShelfUorderProduct(productId, productApplyRangeIds);
        return UPCResultConverter.ruleExecuteConvert((RuleExecuteResult)ruleExecuteResult);
    }

    public UPCRuleExecuteResult shelfUmallProductV2(Long productId, List<String> productApplyRangeIds) throws Exception {
        RuleExecuteResult ruleExecuteResult = this.shelfUmallProduct(productId, productApplyRangeIds);
        return UPCResultConverter.ruleExecuteConvert((RuleExecuteResult)ruleExecuteResult);
    }

    public UPCRuleExecuteResult unShelfUmallProductV2(Long productId, List<String> productApplyRangeIds) throws Exception {
        RuleExecuteResult ruleExecuteResult = this.unShelfUmallProduct(productId, productApplyRangeIds);
        return UPCResultConverter.ruleExecuteConvert((RuleExecuteResult)ruleExecuteResult);
    }

    public CoreDocJsonResult unShelfUmallProductV3(Long productId, String orgId) throws Exception {
        this.skuService.checkShelfData(productId, orgId);
        HashMap<String, Object> params = new HashMap<String, Object>(2);
        params.put("biz", "umall");
        return this.excuteBatchAction(productId, orgId, "unshelve", params);
    }

    public CoreDocJsonResult shelfUmallProductV3(Long productId, String orgId) throws Exception {
        this.skuService.checkShelfData(productId, orgId);
        HashMap<String, Object> params = new HashMap<String, Object>(2);
        params.put("biz", "umall");
        return this.excuteBatchAction(productId, orgId, "shelve", params);
    }

    public CoreDocJsonResult unShelfUorderProductV3(Long productId, String orgId) throws Exception {
        this.skuService.checkShelfData(productId, orgId);
        HashMap<String, Object> params = new HashMap<String, Object>(2);
        params.put("biz", "uorder");
        return this.excuteBatchAction(productId, orgId, "unshelve", params);
    }

    public CoreDocJsonResult shelfUorderProductV3(Long productId, String orgId) throws Exception {
        this.skuService.checkShelfData(productId, orgId);
        HashMap<String, Object> params = new HashMap<String, Object>(2);
        params.put("biz", "uorder");
        return this.excuteBatchAction(productId, orgId, "shelve", params);
    }

    public CoreDocJsonResult excuteBatchAction(Long productId, String orgId, String action, Map<String, Object> params) throws Exception {
        Map<String, Object> productMap = this.queryProductByIdAndOrgId(productId, orgId);
        if (MapUtils.isNotEmpty(params)) {
            productMap.putAll(params);
        }
        return this.upcBizService.excuteUpdateOne(productMap, action, "pc_productdetail");
    }

    private Map<String, Object> queryProductByIdAndOrgId(Long productId, String orgId) throws Exception {
        QueryConditionGroup queryConditionGroup = QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"productApplyRange.orgId").eq((Object)orgId), QueryCondition.name((String)"id").eq((Object)productId)});
        String selectFields = "id as id, code as code, productApplyRange.orgId as orgId, productApplyRange.id as productApplyRangeId, productApplyRange.isCreator as isCreator";
        QuerySchema schema = QuerySchema.create().addSelect(selectFields).addCondition((ConditionExpression)queryConditionGroup);
        List skus = MetaDaoHelper.query((String)"pc.product.Product", (QuerySchema)schema);
        if (CollectionUtils.isEmpty((Collection)skus)) {
            throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_801150, new Object[]{productId.toString(), orgId});
        }
        return (Map)skus.get(0);
    }
}


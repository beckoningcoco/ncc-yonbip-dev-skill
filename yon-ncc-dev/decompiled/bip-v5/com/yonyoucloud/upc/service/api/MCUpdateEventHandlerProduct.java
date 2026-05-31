/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.yonyou.iuap.apdoc.coredoc.utils.ListSplitUtil
 *  com.yonyou.ucf.mdd.ext.dao.meta.MetaDaoHelper
 *  com.yonyoucloud.upc.pc.org.PubOrgGroupDetail
 *  com.yonyoucloud.upc.pc.product.ProductApplyRange
 *  org.imeta.orm.schema.ConditionExpression
 *  org.imeta.orm.schema.QueryCondition
 *  org.imeta.orm.schema.QueryConditionGroup
 *  org.imeta.orm.schema.QuerySchema
 *  org.slf4j.Logger
 *  org.slf4j.LoggerFactory
 *  org.springframework.beans.factory.annotation.Autowired
 *  org.springframework.stereotype.Component
 *  org.springframework.util.CollectionUtils
 */
package com.yonyoucloud.upc.service.api;

import com.yonyou.iuap.apdoc.coredoc.utils.ListSplitUtil;
import com.yonyou.ucf.mdd.ext.dao.meta.MetaDaoHelper;
import com.yonyoucloud.iuap.upc.api.service.IMCUpdateEventHandler;
import com.yonyoucloud.iuap.upc.api.service.IUPCControlRuleService;
import com.yonyoucloud.upc.pc.org.PubOrgGroupDetail;
import com.yonyoucloud.upc.pc.product.ProductApplyRange;
import com.yonyoucloud.upc.service.ProductApplyRangeGroupService;
import com.yonyoucloud.upc.service.product.ProductAddRangeService;
import com.yonyoucloud.upc.service.utils.ProductUtil;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;
import org.imeta.orm.schema.ConditionExpression;
import org.imeta.orm.schema.QueryCondition;
import org.imeta.orm.schema.QueryConditionGroup;
import org.imeta.orm.schema.QuerySchema;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.util.CollectionUtils;

@Component(value="pc.mcUpdateEventHandlerProduct")
public class MCUpdateEventHandlerProduct
implements IMCUpdateEventHandler {
    private static final Logger log = LoggerFactory.getLogger(MCUpdateEventHandlerProduct.class);
    @Autowired
    private IUPCControlRuleService upcControlRuleService;
    @Autowired
    ProductApplyRangeGroupService productApplyRangeGroupService;
    @Autowired
    private ProductAddRangeService productAddRangeService;

    @Override
    public void Handle(List<String> orgIds) throws Exception {
        if (!CollectionUtils.isEmpty(orgIds)) {
            HashSet<String> orgIdsSet = new HashSet<String>(orgIds);
            for (String orgId : orgIdsSet) {
                List<String> subOrgs = this.upcControlRuleService.getSubOrgs(orgId);
                if (CollectionUtils.isEmpty(subOrgs)) continue;
                HashSet<String> subOrgIdsSet = new HashSet<String>(subOrgs);
                List<String> creatProductIds = this.upcControlRuleService.getSelfCreateVoucherByCreateOrg("pc.product.Product", new ArrayList<String>(Collections.singletonList(orgId)));
                if (CollectionUtils.isEmpty(creatProductIds)) continue;
                List productIdLists = ListSplitUtil.splitListByCapacity(creatProductIds, (int)50);
                List subOrgsLists = ListSplitUtil.splitListByCapacity(new ArrayList<String>(subOrgIdsSet), (int)50);
                for (List productIdList : productIdLists) {
                    for (List subOrgsList : subOrgsLists) {
                        this.productAddRangeService.dealProSuitOrgBykafka(productIdList, subOrgsList);
                    }
                }
            }
        }
    }

    private void batchDealHandle(List<String> productIds, Set<String> subOrgs) throws Exception {
        ArrayList<ProductApplyRange> ranges = new ArrayList<ProductApplyRange>();
        List rangesInDb = MetaDaoHelper.query((String)"pc.product.ProductApplyRange", (QuerySchema)QuerySchema.create().addSelect("id as productApplyRangeId, productId, orgId,isCreator,productDetailId,productDepositTimeDetailId").addCondition((ConditionExpression)QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"productId").in(productIds), QueryCondition.name((String)"orgId").is_not_null()})));
        ArrayList allRangeList = new ArrayList(rangesInDb);
        Map<String, Integer> productRangesMap = this.getRangeIndbMap(rangesInDb);
        HashMap allRangeMap = new HashMap();
        List<Map> creatorRangeIdList = allRangeList.stream().filter(a -> Boolean.TRUE.equals(a.get("isCreator")) || a.get("isCreator").equals(true)).collect(Collectors.toList());
        creatorRangeIdList.forEach(a -> allRangeMap.put(a.get("productId").toString(), a));
        HashSet<String> allProductOrgNew = new HashSet<String>();
        for (String productId : productIds) {
            for (String subOrgId : subOrgs) {
                if (productRangesMap.containsKey(productId + subOrgId) || allProductOrgNew.contains(productId + subOrgId)) continue;
                allProductOrgNew.add(productId + subOrgId);
                ProductApplyRange range = ProductUtil.buildProductApplyRange(Long.valueOf(productId), 1, subOrgId, -1L);
                if (allRangeMap.get(productId) != null) {
                    if (((Map)allRangeMap.get(productId)).get("productDetailId") != null) {
                        range.setProductDetailId(Long.valueOf(Long.parseLong(((Map)allRangeMap.get(productId)).get("productDetailId").toString())));
                    }
                    if (((Map)allRangeMap.get(productId)).get("productDepositTimeDetailId") != null) {
                        range.setProductDepositTimeDetailId(Long.valueOf(Long.parseLong(((Map)allRangeMap.get(productId)).get("productDepositTimeDetailId").toString())));
                    }
                }
                ranges.add(range);
                if (ranges.size() <= 500) continue;
                MetaDaoHelper.insert((String)"pc.product.ProductApplyRange", ranges);
                ranges.clear();
            }
        }
        if (ranges.size() > 0) {
            MetaDaoHelper.insert((String)"pc.product.ProductApplyRange", ranges);
        }
    }

    @Override
    public void HandleShareRange(Map shareRangeData) throws Exception {
        for (final Object key : shareRangeData.keySet()) {
            List beSharedOrgIds = (List)shareRangeData.get(key);
            HashSet<String> sharedOrgIdsSet = new HashSet<String>();
            for (String orgId : beSharedOrgIds) {
                sharedOrgIdsSet.add(orgId);
            }
            List<String> creatProductIds = this.upcControlRuleService.getSelfCreateVoucherByCreateOrg("pc.product.Product", (List<String>)new ArrayList<String>(){
                {
                    this.add(key.toString());
                }
            });
            if (creatProductIds == null || creatProductIds.isEmpty() || creatProductIds.isEmpty()) continue;
            List productIdLists = ListSplitUtil.splitListByCapacity(creatProductIds, (int)50);
            for (List productIdList : productIdLists) {
                this.batchHandleShareRange(productIdList, sharedOrgIdsSet);
                this.dealProductApplyRangeGroup(productIdList, sharedOrgIdsSet);
            }
        }
    }

    private void batchHandleShareRange(List<String> productIds, Set<String> beSharedOrgIds) throws Exception {
        ArrayList<ProductApplyRange> ranges = new ArrayList<ProductApplyRange>();
        List rangesInDb = MetaDaoHelper.query((String)"pc.product.ProductApplyRange", (QuerySchema)QuerySchema.create().addSelect("id as productApplyRangeId, productId, orgId,isCreator,productDetailId,productDepositTimeDetailId").addCondition((ConditionExpression)QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"productId").in(productIds), QueryCondition.name((String)"orgId").is_not_null()})));
        Map<String, Integer> productRangesMap = this.getRangeIndbMap(rangesInDb);
        ArrayList allRangeList = new ArrayList(rangesInDb);
        HashMap allRangeMap = new HashMap();
        List<Map> creatorRangeIdList = allRangeList.stream().filter(a -> Boolean.TRUE.equals(a.get("isCreator")) || a.get("isCreator").equals(true)).collect(Collectors.toList());
        creatorRangeIdList.forEach(a -> allRangeMap.put(a.get("productId").toString(), a));
        HashSet<String> allProductOrgNew = new HashSet<String>();
        for (String productId : productIds) {
            for (String subOrgId : beSharedOrgIds) {
                if (productRangesMap.containsKey(productId + subOrgId) || allProductOrgNew.contains(productId + subOrgId)) continue;
                allProductOrgNew.add(productId + subOrgId);
                ProductApplyRange range = ProductUtil.buildProductApplyRange(Long.valueOf(productId), 1, subOrgId, null);
                if (allRangeMap.get(productId) != null) {
                    if (((Map)allRangeMap.get(productId)).get("productDetailId") != null) {
                        range.setProductDetailId(Long.valueOf(Long.parseLong(((Map)allRangeMap.get(productId)).get("productDetailId").toString())));
                    }
                    if (((Map)allRangeMap.get(productId)).get("productDepositTimeDetailId") != null) {
                        range.setProductDepositTimeDetailId(Long.valueOf(Long.parseLong(((Map)allRangeMap.get(productId)).get("productDepositTimeDetailId").toString())));
                    }
                }
                ranges.add(range);
                if (ranges.size() <= 500) continue;
                MetaDaoHelper.insert((String)"pc.product.ProductApplyRange", ranges);
                ranges.clear();
            }
        }
        if (!ranges.isEmpty()) {
            MetaDaoHelper.insert((String)"pc.product.ProductApplyRange", ranges);
        }
    }

    private void dealProductApplyRangeGroup(List<String> productIds, Set<String> subOrgList) throws Exception {
        ArrayList<Long> productIdList = new ArrayList<Long>();
        productIds.forEach(a -> productIdList.add(Long.parseLong(a)));
        ArrayList<PubOrgGroupDetail> pubOrgGroupDetailList = new ArrayList<PubOrgGroupDetail>();
        subOrgList.forEach(a -> {
            PubOrgGroupDetail pubOrgGroupDetail = new PubOrgGroupDetail();
            pubOrgGroupDetail.setOrgId(a);
            pubOrgGroupDetail.setOrgType("1");
            pubOrgGroupDetailList.add(pubOrgGroupDetail);
        });
        this.productApplyRangeGroupService.dealProductApplyRangeGroup(productIdList, pubOrgGroupDetailList);
    }

    private Map<String, Integer> getRangeIndbMap(List<Map> rangesInDb) {
        HashMap<String, Integer> rangeIndbMap = new HashMap<String, Integer>(rangesInDb.size());
        for (Map range : rangesInDb) {
            rangeIndbMap.put(range.get("productId").toString() + range.get("orgId").toString(), 1);
        }
        return rangeIndbMap;
    }
}


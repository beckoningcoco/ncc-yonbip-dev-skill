/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.yonyou.iuap.apdoc.coredoc.enums.LanguagesEnum
 *  com.yonyou.iuap.basedoc.mc.service.GroupService
 *  com.yonyou.iuap.context.InvocationInfoProxy
 *  com.yonyou.iuap.ucf.common.ml.MultiLangContext
 *  com.yonyou.ucf.mdd.ext.core.AppContext
 *  com.yonyou.ucf.mdd.ext.dao.meta.MetaDaoHelper
 *  com.yonyoucloud.upc.attrcontrol.CarryType
 *  com.yonyoucloud.upc.attrcontrol.DocAttributeControlConfig
 *  com.yonyoucloud.upc.attrcontrol.DocAttributeControlConfigDTO
 *  com.yonyoucloud.upc.pc.org.PubOrgGroup
 *  com.yonyoucloud.upc.pc.org.PubOrgGroupDetail
 *  com.yonyoucloud.upc.pc.product.ProductApplyRange
 *  com.yonyoucloud.upc.pc.product.ProductApplyRangeGroup
 *  com.yonyoucloud.upc.pc.product.ProductDepositTimeDetail
 *  com.yonyoucloud.upc.pc.product.ProductDetail
 *  com.yonyoucloud.upc.pc.product.ProductLoadWay
 *  com.yonyoucloud.upc.pc.product.ProductParameters
 *  com.yonyoucloud.upc.pc.product.ProductSkuDetailNew
 *  com.yonyoucloud.upc.pc.product.ProductTagNew
 *  com.yonyoucloud.upc.pc.product.SkuTagNew
 *  com.yonyoucloud.upc.service.attrcontrol.DocAttributeControlConfigService
 *  org.apache.commons.lang3.ObjectUtils
 *  org.imeta.biz.base.Objectlizer
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
 *  org.springframework.stereotype.Service
 *  org.springframework.util.CollectionUtils
 */
package com.yonyoucloud.upc.service.utils;

import com.yonyou.iuap.apdoc.coredoc.enums.LanguagesEnum;
import com.yonyou.iuap.basedoc.mc.service.GroupService;
import com.yonyou.iuap.context.InvocationInfoProxy;
import com.yonyou.iuap.ucf.common.ml.MultiLangContext;
import com.yonyou.ucf.mdd.ext.core.AppContext;
import com.yonyou.ucf.mdd.ext.dao.meta.MetaDaoHelper;
import com.yonyoucloud.upc.attrcontrol.CarryType;
import com.yonyoucloud.upc.attrcontrol.DocAttributeControlConfig;
import com.yonyoucloud.upc.attrcontrol.DocAttributeControlConfigDTO;
import com.yonyoucloud.upc.pc.org.PubOrgGroup;
import com.yonyoucloud.upc.pc.org.PubOrgGroupDetail;
import com.yonyoucloud.upc.pc.product.ProductApplyRange;
import com.yonyoucloud.upc.pc.product.ProductApplyRangeGroup;
import com.yonyoucloud.upc.pc.product.ProductDepositTimeDetail;
import com.yonyoucloud.upc.pc.product.ProductDetail;
import com.yonyoucloud.upc.pc.product.ProductLoadWay;
import com.yonyoucloud.upc.pc.product.ProductParameters;
import com.yonyoucloud.upc.pc.product.ProductSkuDetailNew;
import com.yonyoucloud.upc.pc.product.ProductTagNew;
import com.yonyoucloud.upc.pc.product.SkuTagNew;
import com.yonyoucloud.upc.service.attrcontrol.DocAttributeControlConfigService;
import com.yonyoucloud.upc.service.utils.ProductUtil;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import org.apache.commons.lang3.ObjectUtils;
import org.imeta.biz.base.Objectlizer;
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
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;

@Service
public class ProductOrgShareUtil {
    private static final Logger log = LoggerFactory.getLogger(ProductOrgShareUtil.class);
    @Autowired
    GroupService groupService;
    @Autowired
    DocAttributeControlConfigService docAttributeControlConfigService;
    private static final List<String> MUL_lANGUAGE_FIELDS = new ArrayList<String>();

    public ProductDetail getProductDetail(Long productId, List<String> orgs, String orgType, long allocatorId, String allocatorName) throws Exception {
        ProductDetail productDetail = new ProductDetail();
        ProductApplyRange productApplyRange = new ProductApplyRange();
        QueryConditionGroup queryProductConditionGroup = QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"id").eq((Object)productId)});
        QuerySchema queryProductSchema = QuerySchema.create().addSelect("orgId").addCondition((ConditionExpression)queryProductConditionGroup);
        Map productMap = MetaDaoHelper.queryOne((String)"pc.product.Product", (QuerySchema)queryProductSchema);
        DocAttributeControlConfigDTO attributeControlConfigDTO = this.docAttributeControlConfigService.queryAttrControlConfigOnlyForOrgAdd("pc.product.Product", productMap.get("orgId").toString());
        Map productDetailMap = MetaDaoHelper.queryOne((String)"pc.product.ProductDetail", (QuerySchema)QuerySchema.create().addSelect("*").addCondition((ConditionExpression)QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"productId").eq((Object)productId), QueryCondition.name((String)"isCreator").eq((Object)true)})));
        QueryConditionGroup proApplyRangeConditionGroup = QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"productId").eq((Object)productId)});
        if (null != attributeControlConfigDTO) {
            int verSion = attributeControlConfigDTO.getVersion();
            proApplyRangeConditionGroup.appendCondition(new ConditionExpression[]{QueryCondition.name((String)"isApplied").eq((Object)false), QueryCondition.name((String)"controlRuleVersion").eq((Object)verSion)});
        } else {
            proApplyRangeConditionGroup.appendCondition(new ConditionExpression[]{QueryCondition.name((String)"isCreator").eq((Object)true)});
        }
        QuerySchema proApplyRangeShcema = QuerySchema.create().addSelect(new String[]{"id", "orgId", "productDetailId", "productDepositTimeDetailId", "isCreator", "isApplied", "controlRuleVersion"}).addCondition((ConditionExpression)proApplyRangeConditionGroup);
        Map proApplyRangeMap = MetaDaoHelper.queryOne((String)"pc.product.ProductApplyRange", (QuerySchema)proApplyRangeShcema);
        if (null == attributeControlConfigDTO && proApplyRangeMap != null && !proApplyRangeMap.isEmpty()) {
            productDetail.init(productDetailMap);
            productApplyRange.init(proApplyRangeMap);
            String groupType = productApplyRange.getIsApplied() != false ? "0" : "2";
            ArrayList<ProductApplyRange> ranges2Db = new ArrayList<ProductApplyRange>();
            for (String orgId : orgs) {
                ProductApplyRange range = ProductUtil.buildProductApplyRange(productId, null != orgType ? Integer.valueOf(orgType) : 1, orgId, "3".equals(orgType) ? Long.valueOf(orgId) : null);
                if (null != allocatorName) {
                    range.setAllocatorId(Long.valueOf(allocatorId));
                    range.setAllocatorName(allocatorName);
                }
                range.setProductDetailId(productApplyRange.getProductDetailId());
                range.setProductDepositTimeDetailId(productApplyRange.getProductDepositTimeDetailId());
                range.setControlRuleVersion(null != attributeControlConfigDTO ? attributeControlConfigDTO.getVersion() : null);
                ranges2Db.add(range);
            }
            MetaDaoHelper.insert((String)"pc.product.ProductApplyRange", ranges2Db);
            List<Long> productIdList = Collections.singletonList(productId);
            ArrayList<PubOrgGroupDetail> pubOrgGroupDetailList = new ArrayList<PubOrgGroupDetail>();
            orgs.forEach(org -> {
                PubOrgGroupDetail pubOrgGroupDetail = new PubOrgGroupDetail();
                pubOrgGroupDetail.setOrgId(org);
                pubOrgGroupDetail.setOrgType(orgType);
                pubOrgGroupDetailList.add(pubOrgGroupDetail);
            });
            this.dealProductApplyRangeGroup(productIdList, pubOrgGroupDetailList, groupType, attributeControlConfigDTO);
        } else {
            productDetail = this.creatShareDetail(productId, orgs, attributeControlConfigDTO, orgType);
        }
        return productDetail;
    }

    private ProductDetail creatShareDetail(Long productId, List<String> orgs, DocAttributeControlConfigDTO attributeControlConfigDTO, String orgType) throws Exception {
        try {
            Map productDetailCreatorMap = MetaDaoHelper.queryOne((String)"pc.product.ProductDetail", (QuerySchema)QuerySchema.create().addSelect("*").addCondition((ConditionExpression)QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"productId").eq((Object)productId), QueryCondition.name((String)"isCreator").eq((Object)true)})));
            Long originProductDetailId = Long.valueOf(productDetailCreatorMap.get("id").toString());
            ProductDetail productDetail = this.dealProductDetail(attributeControlConfigDTO, productDetailCreatorMap);
            ProductDepositTimeDetail productDepositTimeDetail = ProductOrgShareUtil.dealProductDepositTimeDetail(productId, productDetail);
            ProductOrgShareUtil.dealProductTagNew(productId, productDetail);
            ProductOrgShareUtil.dealProductParameters(productId, productDetail);
            ProductOrgShareUtil.dealProductLoadWay(productId, originProductDetailId, productDetail);
            ProductOrgShareUtil.dealProductSKU(productId, productDetail);
            ProductRangeResult rangeResult = this.dealProductApplyRange(productId, orgs, attributeControlConfigDTO, productDetail, productDepositTimeDetail, orgType);
            MetaDaoHelper.insert((String)"pc.product.ProductDetail", (BizObject)productDetail);
            MetaDaoHelper.insert((String)"pc.product.ProductApplyRange", rangeResult.ranges2Db);
            MetaDaoHelper.insert((String)"pc.product.ProductApplyRangeGroup", (BizObject)rangeResult.productApplyRangeGroup);
            return productDetail;
        }
        catch (Exception e) {
            log.error("ProductOrgShareUtil.dealProductOrgShare error", (Throwable)e);
            return null;
        }
    }

    private ProductDetail dealProductDetail(DocAttributeControlConfigDTO attributeControlConfigDTO, Map<String, Object> productDetailCreatorMap) {
        Map extendCharacterDef;
        ProductDetail productDetail = new ProductDetail();
        productDetail.init(productDetailCreatorMap);
        productDetail.setId((Object)IdManager.getInstance().nextId());
        productDetail.setEntityStatus(EntityStatus.Insert);
        List productDetailControlConfigList = null;
        if (null != attributeControlConfigDTO && null != attributeControlConfigDTO.getDocAttributeControlConfigList()) {
            productDetailControlConfigList = attributeControlConfigDTO.getDocAttributeControlConfigList().stream().filter(docAttributeControlConfig -> "pc.product.ProductDetail".equals(docAttributeControlConfig.getEntityUri())).collect(Collectors.toList());
        }
        if (null != productDetailControlConfigList) {
            this.buildControlAttribute(productDetailControlConfigList, productDetail);
        }
        if (ObjectUtils.isNotEmpty((Object)(extendCharacterDef = (Map)productDetail.get("productExtendCharacterDef")))) {
            BizObject characterDef = new BizObject();
            characterDef.putAll(extendCharacterDef);
            characterDef.put("id", (Object)IdManager.getInstance().nextId());
            characterDef.put("_status", (Object)EntityStatus.Insert);
            productDetail.put("productExtendCharacterDef", (Object)characterDef);
        }
        productDetail.setOrgId(null);
        productDetail.setIsCreator(Boolean.valueOf(false));
        productDetail.setProductApplyRangeId(null);
        productDetail.setCreator(AppContext.getCurrentUser().getName());
        productDetail.setCreatorId((Long)AppContext.getCurrentUser().getId());
        productDetail.setCreateDate(new Date());
        productDetail.setCreateTime(new Date());
        productDetail.setModifier(null);
        productDetail.setModifyDate(null);
        productDetail.setModifyTime(null);
        productDetail.setModifierId(null);
        return productDetail;
    }

    private static ProductDepositTimeDetail dealProductDepositTimeDetail(Long productId, ProductDetail productDetail) throws Exception {
        Map productDepositTimeDetailCreatorMap = MetaDaoHelper.queryOne((String)"pc.product.ProductDepositTimeDetail", (QuerySchema)QuerySchema.create().addSelect("*").addCondition((ConditionExpression)QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"productId").eq((Object)productId), QueryCondition.name((String)"isCreator").eq((Object)true)})));
        ProductDepositTimeDetail productDepositTimeDetail = new ProductDepositTimeDetail();
        if (null != productDepositTimeDetailCreatorMap) {
            productDepositTimeDetail.putAll(productDepositTimeDetailCreatorMap);
            productDepositTimeDetail.setId((Object)IdManager.getInstance().nextId());
            productDepositTimeDetail.setEntityStatus(EntityStatus.Insert);
            productDepositTimeDetail.setProductDetailId((Long)productDetail.getId());
            productDepositTimeDetail.setIsCreator(Boolean.valueOf(false));
            productDepositTimeDetail.setProductApplyRangeId(null);
            MetaDaoHelper.insert((String)"pc.product.ProductDepositTimeDetail", (BizObject)productDepositTimeDetail);
        }
        return productDepositTimeDetail;
    }

    private static void dealProductTagNew(Long productId, ProductDetail productDetail) throws Exception {
        List productTagNewCreatorList = MetaDaoHelper.query((String)"pc.product.ProductTagNew", (QuerySchema)QuerySchema.create().addSelect("*").addCondition((ConditionExpression)QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"productId").eq((Object)productId), QueryCondition.name((String)"isCreator").eq((Object)true)})));
        ArrayList<ProductTagNew> productTagNewList = new ArrayList<ProductTagNew>();
        if (null != productTagNewCreatorList) {
            for (Map productTagNewCreatorMap : productTagNewCreatorList) {
                ProductTagNew productTagNew = new ProductTagNew();
                productTagNew.init(productTagNewCreatorMap);
                productTagNew.setId((Object)IdManager.getInstance().nextId());
                productTagNew.setEntityStatus(EntityStatus.Insert);
                productTagNew.setProductDetailId((Long)productDetail.getId());
                productTagNew.setIsCreator(Boolean.valueOf(false));
                productTagNew.setProductApplyRangeId(null);
                productTagNewList.add(productTagNew);
            }
            MetaDaoHelper.insert((String)"pc.product.ProductTagNew", productTagNewList);
        }
    }

    private static void dealProductParameters(Long productId, ProductDetail productDetail) throws Exception {
        List productParametersCreatorList = MetaDaoHelper.query((String)"pc.product.ProductParameters", (QuerySchema)QuerySchema.create().addSelect("*").addCondition((ConditionExpression)QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"productId").eq((Object)productId), QueryCondition.name((String)"isCreator").eq((Object)true)})));
        ArrayList<ProductParameters> productParametersList = new ArrayList<ProductParameters>();
        if (null != productParametersCreatorList) {
            for (Map productParametersCreatorMap : productParametersCreatorList) {
                ProductParameters productParameters = new ProductParameters();
                productParameters.init(productParametersCreatorMap);
                productParameters.setId((Object)IdManager.getInstance().nextId());
                productParameters.setEntityStatus(EntityStatus.Insert);
                productParameters.setProductDetailId((Long)productDetail.getId());
                productParameters.setIsCreator(Boolean.valueOf(false));
                productParameters.setProductApplyRangeId(null);
                productParametersList.add(productParameters);
            }
            MetaDaoHelper.insert((String)"pc.product.ProductParameters", productParametersList);
        }
    }

    private static void dealProductLoadWay(Long productId, Long originProductDetailId, ProductDetail productDetail) throws Exception {
        List productloadwayCreatorList = MetaDaoHelper.query((String)"pc.product.ProductLoadWay", (QuerySchema)QuerySchema.create().addSelect("*").addCondition((ConditionExpression)QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"productId").eq((Object)productId), QueryCondition.name((String)"productDetailId").eq((Object)originProductDetailId)})));
        ArrayList<ProductLoadWay> productLoadWayList = new ArrayList<ProductLoadWay>();
        if (null != productloadwayCreatorList) {
            for (Map productloadwayCreatorMap : productloadwayCreatorList) {
                ProductLoadWay productLoadWay = new ProductLoadWay();
                productLoadWay.init(productloadwayCreatorMap);
                productLoadWay.setId((Object)IdManager.getInstance().nextId());
                productLoadWay.setEntityStatus(EntityStatus.Insert);
                productLoadWay.setProductDetailId((Long)productDetail.getId());
                productLoadWay.setProductApplyRangeId(null);
                productLoadWayList.add(productLoadWay);
            }
            MetaDaoHelper.insert((String)"pc.product.ProductLoadWay", productLoadWayList);
        }
    }

    private static void dealProductSKU(Long productId, ProductDetail productDetail) throws Exception {
        List productSkuDetailNewCreatorList = MetaDaoHelper.query((String)"pc.product.ProductSkuDetailNew", (QuerySchema)QuerySchema.create().addSelect("*").addCondition((ConditionExpression)QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"productId").eq((Object)productId), QueryCondition.name((String)"isCreator").eq((Object)true)})));
        ArrayList<ProductSkuDetailNew> productSkuDetailNewList = new ArrayList<ProductSkuDetailNew>();
        ArrayList<SkuTagNew> skuTagNewList = new ArrayList<SkuTagNew>();
        if (null != productSkuDetailNewCreatorList) {
            ArrayList<Long> skuIds = new ArrayList<Long>(productSkuDetailNewCreatorList.size());
            for (Map productSkuDetailNewCreatorMap : productSkuDetailNewCreatorList) {
                skuIds.add(Long.valueOf(String.valueOf(productSkuDetailNewCreatorMap.get("skuId"))));
                ProductSkuDetailNew productSkuDetailNew = new ProductSkuDetailNew();
                productSkuDetailNew.init(productSkuDetailNewCreatorMap);
                productSkuDetailNew.setId((Object)IdManager.getInstance().nextId());
                productSkuDetailNew.setEntityStatus(EntityStatus.Insert);
                productSkuDetailNew.setProductDetailId((Long)productDetail.getId());
                productSkuDetailNew.setIsCreator(Boolean.valueOf(false));
                productSkuDetailNew.setProductApplyRangeId(null);
                productSkuDetailNewList.add(productSkuDetailNew);
            }
            MetaDaoHelper.insert((String)"pc.product.ProductSkuDetailNew", productSkuDetailNewList);
            List skuTagNewCreatorList = MetaDaoHelper.query((String)"pc.product.SkuTagNew", (QuerySchema)QuerySchema.create().addSelect("*").addCondition((ConditionExpression)QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"skuId").in(skuIds), QueryCondition.name((String)"isCreator").eq((Object)true)})));
            if (null != skuTagNewCreatorList) {
                for (Map skuTagNewCreatorMap : skuTagNewCreatorList) {
                    SkuTagNew skuTagNew = new SkuTagNew();
                    skuTagNew.init(skuTagNewCreatorMap);
                    skuTagNew.setId((Object)IdManager.getInstance().nextId());
                    skuTagNew.setEntityStatus(EntityStatus.Insert);
                    skuTagNew.setProductDetailId((Long)productDetail.getId());
                    skuTagNew.setIsCreator(Boolean.valueOf(false));
                    skuTagNew.setProductApplyRangeId(null);
                    skuTagNewList.add(skuTagNew);
                }
                MetaDaoHelper.insert((String)"pc.product.SkuTagNew", skuTagNewList);
            }
        }
    }

    private ProductRangeResult dealProductApplyRange(Long productId, List<String> orgs, DocAttributeControlConfigDTO attributeControlConfigDTO, ProductDetail productDetail, ProductDepositTimeDetail productDepositTimeDetail, String orgType) {
        ArrayList<ProductApplyRange> ranges2Db = new ArrayList<ProductApplyRange>();
        ArrayList<PubOrgGroupDetail> pubOrgGroupDetailList = new ArrayList<PubOrgGroupDetail>();
        for (String orgId : orgs) {
            ProductApplyRange range = ProductUtil.buildProductApplyRange(productId, null != orgType ? Integer.valueOf(orgType) : 1, orgId, "3".equals(orgType) ? Long.valueOf(orgId) : null);
            range.setProductDetailId((Long)productDetail.getId());
            range.setProductDepositTimeDetailId((Long)productDepositTimeDetail.getId());
            range.setControlRuleVersion(null != attributeControlConfigDTO ? attributeControlConfigDTO.getVersion() : null);
            ranges2Db.add(range);
            PubOrgGroupDetail pubOrgGroupDetail = new PubOrgGroupDetail();
            pubOrgGroupDetail.setOrgId(orgId);
            pubOrgGroupDetail.setOrgType(orgType);
            pubOrgGroupDetailList.add(pubOrgGroupDetail);
        }
        PubOrgGroup pubOrgGroup = new PubOrgGroup();
        pubOrgGroup.setOrgGroupDetailList(pubOrgGroupDetailList);
        pubOrgGroup.setOrgGroupType("2");
        String groupId = this.groupService.saveGroup((Map)pubOrgGroup, "pc.pub_org_group.PubOrgGroup");
        ProductApplyRangeGroup productApplyRangeGroup = ProductUtil.buildProductApplyRangeGroup(productId);
        productApplyRangeGroup.setOrgGroupId(groupId);
        productApplyRangeGroup.setOrgGroupType("2");
        productApplyRangeGroup.setProductDetailId((Long)productDetail.getId());
        productApplyRangeGroup.setControlRuleVersion(null != attributeControlConfigDTO ? attributeControlConfigDTO.getVersion() : null);
        return new ProductRangeResult(ranges2Db, productApplyRangeGroup);
    }

    public void dealProductApplyRangeGroup(List<Long> productIds, List<PubOrgGroupDetail> pubOrgGroupDetailParamList, String groupType, DocAttributeControlConfigDTO attributeControlConfigDTO) throws Exception {
        QuerySchema productRangeGroupSchema;
        List originalProductApplyRangeGroupList;
        QueryConditionGroup productRangeGroupCondition = QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"productId").in(productIds), QueryCondition.name((String)"orgGroupType").eq((Object)groupType)});
        if (null != attributeControlConfigDTO) {
            productRangeGroupCondition.appendCondition(new ConditionExpression[]{QueryCondition.name((String)"controlRuleVersion").eq((Object)attributeControlConfigDTO.getVersion())});
        }
        if (CollectionUtils.isEmpty((Collection)(originalProductApplyRangeGroupList = MetaDaoHelper.queryObject((String)"pc.product.ProductApplyRangeGroup", (QuerySchema)(productRangeGroupSchema = QuerySchema.create().addSelect("id,orgGroupId,productId").addCondition((ConditionExpression)productRangeGroupCondition)), null)))) {
            log.error("\u5f53\u524d\u7269\u6599\u5bf9\u5e94\u7684\u9002\u7528\u8303\u56f4\u7ec4\u7c7b\u578b\u4e0b\u672a\u67e5\u8be2\u5230\u7269\u6599\u9002\u7528\u8303\u56f4\u7ec4\u4fe1\u606f\uff0c\u65e0\u6cd5\u8fdb\u884c\u6570\u636e\u5347\u7ea7\u5904\u7406\uff01");
            return;
        }
        List orgGroupIdList = originalProductApplyRangeGroupList.stream().map(ProductApplyRangeGroup::getOrgGroupId).collect(Collectors.toList());
        QueryConditionGroup condition = QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"groupId").in(orgGroupIdList)});
        QuerySchema schema = QuerySchema.create().addSelect("id,orgType,orgId,groupId").addCondition((ConditionExpression)condition);
        List originalPubOrgGroupDetailMapList = MetaDaoHelper.query((String)"pc.pub_org_group.PubOrgGroupDetail", (QuerySchema)schema);
        ArrayList originalPubOrgGroupDetailList = new ArrayList();
        originalPubOrgGroupDetailMapList.forEach(originalPubOrgGroupDetailMap -> {
            PubOrgGroupDetail pubOrgGroupDetail = new PubOrgGroupDetail();
            pubOrgGroupDetail.setOrgId(originalPubOrgGroupDetailMap.get("orgId") == null ? "" : originalPubOrgGroupDetailMap.get("orgId").toString());
            pubOrgGroupDetail.setGroupId(originalPubOrgGroupDetailMap.get("groupId") == null ? "" : originalPubOrgGroupDetailMap.get("groupId").toString());
            pubOrgGroupDetail.setOrgType(originalPubOrgGroupDetailMap.get("orgType") == null ? "" : originalPubOrgGroupDetailMap.get("orgType").toString());
            originalPubOrgGroupDetailList.add(pubOrgGroupDetail);
        });
        Map<String, List<PubOrgGroupDetail>> originalPubOrgGroupDetailMap2 = originalPubOrgGroupDetailList.stream().collect(Collectors.groupingBy(PubOrgGroupDetail::getGroupId));
        for (ProductApplyRangeGroup productApplyRangeGroup : originalProductApplyRangeGroupList) {
            ArrayList<PubOrgGroupDetail> pubOrgGroupDetailList = new ArrayList<PubOrgGroupDetail>((Collection)originalPubOrgGroupDetailMap2.get(productApplyRangeGroup.getOrgGroupId()));
            List originalPubOrgList = pubOrgGroupDetailList.stream().map(PubOrgGroupDetail::getOrgId).collect(Collectors.toList());
            List pubOrgGroupDetailParamForAddList = pubOrgGroupDetailParamList.stream().filter(b -> !originalPubOrgList.contains(b.getOrgId())).collect(Collectors.toList());
            for (PubOrgGroupDetail pubOrgGroupDetailParam : pubOrgGroupDetailParamForAddList) {
                PubOrgGroupDetail pubOrgGroupDetail = new PubOrgGroupDetail();
                pubOrgGroupDetail.setOrgId(pubOrgGroupDetailParam.getOrgId());
                pubOrgGroupDetail.setOrgType(pubOrgGroupDetailParam.getOrgType());
                pubOrgGroupDetailList.add(pubOrgGroupDetail);
            }
            PubOrgGroup pubOrgGroup = new PubOrgGroup();
            pubOrgGroup.setOrgGroupDetailList(pubOrgGroupDetailList);
            pubOrgGroup.setOrgGroupType(groupType);
            String groupId = this.groupService.saveGroup((Map)pubOrgGroup, "pc.pub_org_group.PubOrgGroup");
            productApplyRangeGroup.setOrgGroupId(groupId);
            productApplyRangeGroup.setEntityStatus(EntityStatus.Update);
        }
        MetaDaoHelper.update((String)"pc.product.ProductApplyRangeGroup", (List)originalProductApplyRangeGroupList);
    }

    public Boolean checkShareFlag(Long productId, int verSion) throws Exception {
        QueryConditionGroup proApplyRangeConditionGroup = QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"productId").eq((Object)productId)});
        proApplyRangeConditionGroup.appendCondition(new ConditionExpression[]{QueryCondition.name((String)"isApplied").eq((Object)false), QueryCondition.name((String)"controlRuleVersion").eq((Object)verSion)});
        QuerySchema proApplyRangeShcema = QuerySchema.create().addSelect(new String[]{"id", "orgId", "orgId.name as org_Name", "productDetailId", "productDepositTimeDetailId", "isCreator", "ifnull(customerId,0) as customerId", "ifnull(shopId,0) as shopId"}).addCondition((ConditionExpression)proApplyRangeConditionGroup);
        Map proApplyRangeMap = MetaDaoHelper.queryOne((String)"pc.product.ProductApplyRange", (QuerySchema)proApplyRangeShcema);
        if (null != proApplyRangeMap) {
            return true;
        }
        return false;
    }

    public void buildControlAttribute(List<DocAttributeControlConfig> productDetailControlConfigList, ProductDetail productDetail) {
        for (DocAttributeControlConfig docAttributeControlConfig : productDetailControlConfigList) {
            if (String.valueOf(CarryType.FromDefault.getValue()).equals(docAttributeControlConfig.getCarryType())) {
                if (MUL_lANGUAGE_FIELDS.contains(docAttributeControlConfig.getAttributeCode())) {
                    BizObject mulField = new BizObject();
                    String defaultLocale = null != MultiLangContext.getInstance().getDefaultLocaleCode() ? MultiLangContext.getInstance().getDefaultLocaleCode() : LanguagesEnum.zh_CN.getName();
                    String locale = null != InvocationInfoProxy.getLocale() ? InvocationInfoProxy.getLocale() : LanguagesEnum.zh_CN.getName();
                    mulField.put(defaultLocale, (Object)docAttributeControlConfig.getAttributeDefaultValue());
                    mulField.put(locale, (Object)docAttributeControlConfig.getAttributeDefaultValue());
                    productDetail.put(docAttributeControlConfig.getAttributeCode(), (Object)mulField);
                } else {
                    productDetail.put(docAttributeControlConfig.getAttributeCode(), (Object)docAttributeControlConfig.getAttributeDefaultValue());
                }
            }
            if (String.valueOf(CarryType.NotCarry.getValue()).equals(docAttributeControlConfig.getCarryType())) {
                productDetail.put(docAttributeControlConfig.getAttributeCode(), null);
            }
            productDetail = (ProductDetail)Objectlizer.convert((Map)productDetail, (String)"pc.product.ProductDetail");
        }
    }

    static {
        MUL_lANGUAGE_FIELDS.add("remark");
        MUL_lANGUAGE_FIELDS.add("metaDescription");
        MUL_lANGUAGE_FIELDS.add("displayName");
        MUL_lANGUAGE_FIELDS.add("receiptName");
        MUL_lANGUAGE_FIELDS.add("receiptModel");
        MUL_lANGUAGE_FIELDS.add("receiptSpec");
    }

    private static class ProductRangeResult {
        public final List<ProductApplyRange> ranges2Db;
        public final ProductApplyRangeGroup productApplyRangeGroup;

        public ProductRangeResult(List<ProductApplyRange> ranges2Db, ProductApplyRangeGroup productApplyRangeGroup) {
            this.ranges2Db = ranges2Db;
            this.productApplyRangeGroup = productApplyRangeGroup;
        }
    }
}


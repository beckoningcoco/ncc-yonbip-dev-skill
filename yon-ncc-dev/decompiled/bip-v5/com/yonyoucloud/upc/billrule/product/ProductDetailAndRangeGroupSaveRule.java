/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.alibaba.fastjson.util.TypeUtils
 *  com.yonyou.iuap.apdoc.coredoc.exceptions.CoreDocBusinessException
 *  com.yonyou.iuap.apdoc.coredoc.utils.BooleanUtil
 *  com.yonyou.iuap.basedoc.mc.service.GroupService
 *  com.yonyou.iuap.log.cons.BusinessLogMode
 *  com.yonyou.iuap.log.model.BusinessLogObjectBuilder
 *  com.yonyou.iuap.log.rpc.IBusiLogService
 *  com.yonyou.iuap.ucf.common.i18n.InternationalUtils
 *  com.yonyou.ucf.mdd.common.model.rule.RuleExecuteResult
 *  com.yonyou.ucf.mdd.ext.bill.dto.BillDataDto
 *  com.yonyou.ucf.mdd.ext.bill.rule.base.AbstractCommonRule
 *  com.yonyou.ucf.mdd.ext.core.AppContext
 *  com.yonyou.ucf.mdd.ext.dao.meta.MetaDaoHelper
 *  com.yonyou.ucf.mdd.ext.dao.sql.SqlHelper
 *  com.yonyou.ucf.mdd.ext.model.BillContext
 *  com.yonyou.ucf.mdd.ext.util.RedisTool
 *  com.yonyoucloud.upc.attrcontrol.DocAttributeControlConfig
 *  com.yonyoucloud.upc.attrcontrol.DocAttributeControlConfigDTO
 *  com.yonyoucloud.upc.pc.org.PubOrgGroup
 *  com.yonyoucloud.upc.pc.org.PubOrgGroupDetail
 *  com.yonyoucloud.upc.pc.product.Product
 *  com.yonyoucloud.upc.pc.product.ProductApplyRange
 *  com.yonyoucloud.upc.pc.product.ProductApplyRangeDetail
 *  com.yonyoucloud.upc.pc.product.ProductApplyRangeGroup
 *  com.yonyoucloud.upc.pc.product.ProductAssistUnitExchange
 *  com.yonyoucloud.upc.pc.product.ProductDepositTime
 *  com.yonyoucloud.upc.pc.product.ProductDepositTimeDetail
 *  com.yonyoucloud.upc.pc.product.ProductDepositTimeExtend
 *  com.yonyoucloud.upc.pc.product.ProductDetail
 *  com.yonyoucloud.upc.pc.product.ProductExtend
 *  com.yonyoucloud.upc.pc.product.ProductLoadWay
 *  com.yonyoucloud.upc.pc.product.ProductParameter
 *  com.yonyoucloud.upc.pc.product.ProductParameterExtend
 *  com.yonyoucloud.upc.pc.product.ProductParameters
 *  com.yonyoucloud.upc.pc.product.ProductSKU
 *  com.yonyoucloud.upc.pc.product.ProductSKUDetail
 *  com.yonyoucloud.upc.pc.product.ProductSKUExtend
 *  com.yonyoucloud.upc.pc.product.ProductSkuDetailNew
 *  com.yonyoucloud.upc.pc.product.ProductSkuOrderProperty
 *  com.yonyoucloud.upc.pc.product.ProductTag
 *  com.yonyoucloud.upc.pc.product.ProductTagExtend
 *  com.yonyoucloud.upc.pc.product.ProductTagNew
 *  com.yonyoucloud.upc.pc.product.SKUOrderProperty
 *  com.yonyoucloud.upc.pc.product.SKUOrderPropertyExtend
 *  com.yonyoucloud.upc.pc.product.SKUTag
 *  com.yonyoucloud.upc.pc.product.SKUTagExtend
 *  com.yonyoucloud.upc.pc.product.SkuTagNew
 *  com.yonyoucloud.upc.pc.product.UnitUseTypeEnum
 *  com.yonyoucloud.upc.service.attrcontrol.DocAttributeControlConfigService
 *  com.yonyoucloud.upc.service.utils.PubOptionDataQueryUtil
 *  org.apache.commons.lang3.ObjectUtils
 *  org.imeta.orm.base.BizObject
 *  org.imeta.orm.base.EntityStatus
 *  org.imeta.orm.schema.ConditionExpression
 *  org.imeta.orm.schema.QueryCondition
 *  org.imeta.orm.schema.QueryConditionGroup
 *  org.imeta.orm.schema.QuerySchema
 *  org.imeta.spring.support.id.IdManager
 *  org.slf4j.Logger
 *  org.slf4j.LoggerFactory
 *  org.springframework.beans.BeanUtils
 *  org.springframework.beans.factory.annotation.Autowired
 *  org.springframework.stereotype.Component
 *  org.springframework.transaction.support.TransactionSynchronization
 *  org.springframework.transaction.support.TransactionSynchronizationManager
 *  org.springframework.util.CollectionUtils
 */
package com.yonyoucloud.upc.billrule.product;

import com.alibaba.fastjson.util.TypeUtils;
import com.yonyou.iuap.apdoc.coredoc.exceptions.CoreDocBusinessException;
import com.yonyou.iuap.apdoc.coredoc.utils.BooleanUtil;
import com.yonyou.iuap.basedoc.mc.service.GroupService;
import com.yonyou.iuap.log.cons.BusinessLogMode;
import com.yonyou.iuap.log.model.BusinessLogObjectBuilder;
import com.yonyou.iuap.log.rpc.IBusiLogService;
import com.yonyou.iuap.ucf.common.i18n.InternationalUtils;
import com.yonyou.ucf.mdd.common.model.rule.RuleExecuteResult;
import com.yonyou.ucf.mdd.ext.bill.dto.BillDataDto;
import com.yonyou.ucf.mdd.ext.bill.rule.base.AbstractCommonRule;
import com.yonyou.ucf.mdd.ext.core.AppContext;
import com.yonyou.ucf.mdd.ext.dao.meta.MetaDaoHelper;
import com.yonyou.ucf.mdd.ext.dao.sql.SqlHelper;
import com.yonyou.ucf.mdd.ext.model.BillContext;
import com.yonyou.ucf.mdd.ext.util.RedisTool;
import com.yonyoucloud.iuap.upc.api.service.IUPCBillService;
import com.yonyoucloud.iuap.upc.api.service.IUPCProductUpdateService;
import com.yonyoucloud.upc.attrcontrol.DocAttributeControlConfig;
import com.yonyoucloud.upc.attrcontrol.DocAttributeControlConfigDTO;
import com.yonyoucloud.upc.pc.org.PubOrgGroup;
import com.yonyoucloud.upc.pc.org.PubOrgGroupDetail;
import com.yonyoucloud.upc.pc.product.Product;
import com.yonyoucloud.upc.pc.product.ProductApplyRange;
import com.yonyoucloud.upc.pc.product.ProductApplyRangeDetail;
import com.yonyoucloud.upc.pc.product.ProductApplyRangeGroup;
import com.yonyoucloud.upc.pc.product.ProductAssistUnitExchange;
import com.yonyoucloud.upc.pc.product.ProductDepositTime;
import com.yonyoucloud.upc.pc.product.ProductDepositTimeDetail;
import com.yonyoucloud.upc.pc.product.ProductDepositTimeExtend;
import com.yonyoucloud.upc.pc.product.ProductDetail;
import com.yonyoucloud.upc.pc.product.ProductExtend;
import com.yonyoucloud.upc.pc.product.ProductLoadWay;
import com.yonyoucloud.upc.pc.product.ProductParameter;
import com.yonyoucloud.upc.pc.product.ProductParameterExtend;
import com.yonyoucloud.upc.pc.product.ProductParameters;
import com.yonyoucloud.upc.pc.product.ProductSKU;
import com.yonyoucloud.upc.pc.product.ProductSKUDetail;
import com.yonyoucloud.upc.pc.product.ProductSKUExtend;
import com.yonyoucloud.upc.pc.product.ProductSkuDetailNew;
import com.yonyoucloud.upc.pc.product.ProductSkuOrderProperty;
import com.yonyoucloud.upc.pc.product.ProductTag;
import com.yonyoucloud.upc.pc.product.ProductTagExtend;
import com.yonyoucloud.upc.pc.product.ProductTagNew;
import com.yonyoucloud.upc.pc.product.SKUOrderProperty;
import com.yonyoucloud.upc.pc.product.SKUOrderPropertyExtend;
import com.yonyoucloud.upc.pc.product.SKUTag;
import com.yonyoucloud.upc.pc.product.SKUTagExtend;
import com.yonyoucloud.upc.pc.product.SkuTagNew;
import com.yonyoucloud.upc.pc.product.UnitUseTypeEnum;
import com.yonyoucloud.upc.service.attrcontrol.DocAttributeControlConfigService;
import com.yonyoucloud.upc.service.bill.product.ProductDoubleWriteService;
import com.yonyoucloud.upc.service.utils.OrgPermissionsUtil;
import com.yonyoucloud.upc.service.utils.ProductOrgShareUtil;
import com.yonyoucloud.upc.service.utils.PubOptionDataQueryUtil;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.UUID;
import java.util.concurrent.TimeUnit;
import java.util.stream.Collectors;
import org.apache.commons.lang3.ObjectUtils;
import org.imeta.orm.base.BizObject;
import org.imeta.orm.base.EntityStatus;
import org.imeta.orm.schema.ConditionExpression;
import org.imeta.orm.schema.QueryCondition;
import org.imeta.orm.schema.QueryConditionGroup;
import org.imeta.orm.schema.QuerySchema;
import org.imeta.spring.support.id.IdManager;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.support.TransactionSynchronization;
import org.springframework.transaction.support.TransactionSynchronizationManager;
import org.springframework.util.CollectionUtils;

@Component(value="productDetailAndRangeGroupSaveRule")
public class ProductDetailAndRangeGroupSaveRule
extends AbstractCommonRule {
    private static final Logger log = LoggerFactory.getLogger(ProductDetailAndRangeGroupSaveRule.class);
    @Autowired
    private IUPCProductUpdateService upcProductUpdateService;
    @Autowired
    PubOptionDataQueryUtil pubOptionDataQueryUtil;
    @Autowired
    ProductDoubleWriteService productDoubleWriteService;
    @Autowired
    OrgPermissionsUtil orgPermissionsUtil;
    @Autowired
    GroupService groupService;
    @Autowired
    DocAttributeControlConfigService docAttributeControlConfigService;
    @Autowired
    private ProductOrgShareUtil productOrgShareUtil;
    @Autowired
    private IUPCBillService billService;
    @Autowired
    private IBusiLogService busiLogService;
    private static final String INSERT = "INSERT";
    private static final String CREATOR_UPDATE = "CREATOR_UPDATE";
    private static final String USER_INSERT = "USER_INSERT";
    private static final String USER_UPDATE = "USER_UPDATE";

    public RuleExecuteResult execute(BillContext billContext, Map<String, Object> paramMap) throws Exception {
        BillDataDto billDataDto = (BillDataDto)this.getParam(paramMap);
        if (null == billContext || billDataDto == null) {
            return new RuleExecuteResult();
        }
        List bills = this.getBills(billContext, paramMap);
        for (BizObject bill : bills) {
            Product product = (Product)bill;
            this.saveProductDetail(product);
            this.productDoubleWriteService.removeOldProductModel(product);
        }
        return new RuleExecuteResult();
    }

    private void saveProductDetail(Product product) throws Exception {
        ArrayList<ProductDetail> productDetailList = new ArrayList<ProductDetail>();
        ArrayList<ProductApplyRangeGroup> productApplyRangeGroupList = new ArrayList<ProductApplyRangeGroup>();
        ArrayList<ProductDepositTimeDetail> productDepositTimeDetailList = new ArrayList<ProductDepositTimeDetail>();
        DocAttributeControlConfigDTO attributeControlConfigDTO = this.docAttributeControlConfigService.queryAttrControlConfigOnlyForOrgAdd("pc.product.Product", product.getOrgId());
        ArrayList<String> shareOrgs = new ArrayList();
        ArrayList<String> originalOrgs = new ArrayList<String>();
        if (null != attributeControlConfigDTO) {
            shareOrgs = product.productApplyRange().stream().map(ProductApplyRange::getOrgId).filter(orgId -> !product.getOrgId().equals(orgId)).collect(Collectors.toList());
            originalOrgs.add(product.getOrgId());
        }
        if (product.getEntityStatus() == EntityStatus.Insert) {
            this.setCommonData(product, productDetailList, productApplyRangeGroupList, productDepositTimeDetailList, originalOrgs, INSERT, "0", null);
            if (null != attributeControlConfigDTO && !CollectionUtils.isEmpty(shareOrgs)) {
                this.setCommonData(product, productDetailList, productApplyRangeGroupList, productDepositTimeDetailList, shareOrgs, INSERT, "2", attributeControlConfigDTO);
            }
        } else {
            attributeControlConfigDTO = this.docAttributeControlConfigService.queryAttrControlConfigForOrg("pc.product.Product", product.getOrgId());
            if (product.containsKey((Object)"isCreator") && product.get("isCreator").equals(true)) {
                this.setCommonData(product, productDetailList, productApplyRangeGroupList, productDepositTimeDetailList, originalOrgs, CREATOR_UPDATE, "0", attributeControlConfigDTO);
            } else {
                List productApplyRangeMapList = MetaDaoHelper.queryById((String)"pc.product.ProductApplyRange", (String)"id,productDetailId,productDepositTimeDetailId", (Object)product.get("productApplyRangeId"));
                List productDetailMap = MetaDaoHelper.queryById((String)"pc.product.ProductDetail", (String)"id,productApplyRangeId", ((Map)productApplyRangeMapList.get(0)).get("productDetailId"));
                if (productDetailMap != null && productDetailMap.size() > 0 && null != ((Map)productDetailMap.get(0)).get("productApplyRangeId") && product.get("productApplyRangeId").toString().equals(((Map)productDetailMap.get(0)).get("productApplyRangeId").toString())) {
                    this.setCommonData(product, productDetailList, productApplyRangeGroupList, productDepositTimeDetailList, null, USER_UPDATE, "1", attributeControlConfigDTO);
                } else {
                    this.saveBusinessLog(product);
                    this.setCommonData(product, productDetailList, productApplyRangeGroupList, productDepositTimeDetailList, null, USER_INSERT, "1", attributeControlConfigDTO);
                }
            }
        }
        product.setProductDetail(productDetailList);
        if (!CollectionUtils.isEmpty(productDepositTimeDetailList)) {
            product.setProductDepositTimeDetail(productDepositTimeDetailList);
        }
        product.setProductApplyRangeGroup(productApplyRangeGroupList);
    }

    private void saveBusinessLog(Product product) throws Exception {
        HashMap<String, Object> params = new HashMap<String, Object>(3);
        params.put("@productApplyRangeId", product.get("productApplyRangeId"));
        params.put("isCreator", false);
        params.put("isApplied", false);
        BillDataDto billDataDtoProductLog = new BillDataDto("pc_productdetail", product.getId().toString());
        billDataDtoProductLog.setMapCondition(params);
        Map productDetail = this.billService.detail(billDataDtoProductLog);
        this.removeDetailModifyInfo(productDetail);
        BusinessLogObjectBuilder businessLogObjectBuilder = new BusinessLogObjectBuilder();
        businessLogObjectBuilder.uri("pc.product.Product").busiObjTypeCode("pc_productdetail").busiObjTypeName("").defaultBusiObjTypeName("\u7269\u6599\u4e1a\u52a1\u4fe1\u606f").operationName("UID:P_COREDOC-FE_17E3D68005A00016").defaultOperationName("\u63d2\u5165").logMode(BusinessLogMode.UI_META).domain("productcenter").serviceCode("pc_product_query").newObject((Object)productDetail).dataId(product.get("productApplyRange_OrgId").toString()).dataCode(product.getCode());
        this.busiLogService.saveBusinessLog(businessLogObjectBuilder.build());
    }

    private void removeDetailModifyInfo(Map productDetail) {
        productDetail.remove("detail!modifyDate");
        productDetail.remove("detail!modifyTime");
        productDetail.remove("detail!modifier");
    }

    private void setCommonData(Product product, List<ProductDetail> productDetailList, List<ProductApplyRangeGroup> productApplyRangeGroupList, List<ProductDepositTimeDetail> productDepositTimeDetailList, List<String> orgIds, String type, String groupType, DocAttributeControlConfigDTO attributeControlConfigDTO) throws Exception {
        List productApplyRangeParamList = (List)product.get("productApplyRange");
        ProductDetail productDetail = new ProductDetail();
        ProductDepositTimeDetail productDepositTimeDetail = null;
        ProductDepositTimeExtend productDepositTimeExtend = (ProductDepositTimeExtend)product.get("time");
        List productApplyRangeList = product.productApplyRange();
        ProductExtend productExtend = (ProductExtend)product.get("detail");
        List productSkuList = (List)product.get("productskus");
        ProductApplyRangeDetail productApplyRangeDetail = null;
        ProductApplyRange productApplyRange = new ProductApplyRange();
        ProductDepositTime productDepositTime = null;
        boolean isApplied = false;
        if (!INSERT.equals(type)) {
            List productApplyRangeMapList = MetaDaoHelper.queryById((String)"pc.product.ProductApplyRange", (String)"id,productDetailId,productDepositTimeDetailId", (Object)product.get("productApplyRangeId"));
            Map productApplyRangeMap = (Map)productApplyRangeMapList.get(0);
            productApplyRange.setId(productApplyRangeMap.get("id"));
            if (productApplyRangeMap.get("productDetailId") != null) {
                productApplyRange.setProductDetailId(Long.valueOf(Long.parseLong(productApplyRangeMap.get("productDetailId").toString())));
            }
            if (productApplyRangeMap.get("productDepositTimeDetailId") != null) {
                productApplyRange.setProductDepositTimeDetailId(Long.valueOf(Long.parseLong(productApplyRangeMap.get("productDepositTimeDetailId").toString())));
            }
            if (product.containsKey((Object)"isCreator") && product.get("isCreator").equals(false)) {
                productApplyRangeDetail = (ProductApplyRangeDetail)((ProductApplyRange)productApplyRangeParamList.get(0)).get("productAppliedDetail");
                productDepositTime = (ProductDepositTime)((ProductApplyRange)productApplyRangeParamList.get(0)).get("productAppliedTime");
                List productDetailMap = MetaDaoHelper.queryById((String)"pc.product.ProductDetail", (String)"id,productApplyRangeId", productApplyRangeMap.get("productDetailId"));
                if (productDetailMap != null && productDetailMap.size() > 0 && null != ((Map)productDetailMap.get(0)).get("productApplyRangeId") && ((Map)productDetailMap.get(0)).get("productApplyRangeId").toString().equals(product.get("productApplyRangeId").toString())) {
                    isApplied = true;
                    if (productApplyRange.getId().equals(((Map)productDetailMap.get(0)).get("productApplyRangeId"))) {
                        productApplyRangeDetail = (ProductApplyRangeDetail)((ProductApplyRange)productApplyRangeParamList.get(0)).get("productAppliedDetail");
                        productDepositTime = (ProductDepositTime)((ProductApplyRange)productApplyRangeParamList.get(0)).get("productAppliedTime");
                    }
                } else if (null == ((ProductApplyRange)productApplyRangeParamList.get(0)).get("productAppliedTime")) {
                    productDepositTime = this.initRangeTime(product.getId(), productApplyRange.get("id"));
                    ((ProductApplyRange)productApplyRangeParamList.get(0)).set("productAppliedTime", (Object)productDepositTime);
                }
            }
        }
        productDetail = this.setProductDetailData(productExtend, productApplyRangeDetail, productApplyRange, type, groupType, attributeControlConfigDTO);
        productDepositTimeDetail = this.setProductDepositTimeDetailData(productDepositTimeExtend, productDepositTime, productApplyRange, type, (Long)productDetail.getId(), groupType);
        this.setSkuDetailNewData(productSkuList, (Long)productDetail.getId(), type, groupType);
        this.setProductTagNewData(product, productDetail, type, groupType);
        this.setProductParametersData(product, productDetail, type, groupType);
        this.setSkuTagNewData(product, productDetail, type, groupType);
        this.setProductLoadWayData(product, productDetail, type, groupType);
        this.setProductApplyRange(product, productApplyRangeList, productApplyRangeGroupList, orgIds, (Long)productDetail.getId(), productDepositTimeDetail, type, isApplied, groupType, null != attributeControlConfigDTO ? attributeControlConfigDTO.getVersion() : null);
        if (product.getEntityStatus() == EntityStatus.Insert) {
            this.setValueForAudoInfo(product, productExtend, productDetail, null, "create");
        } else if (product.containsKey((Object)"isCreator") && product.get("isCreator").equals(true)) {
            if (!CollectionUtils.isEmpty((Map)productDepositTimeExtend)) {
                productDepositTimeExtend.setEntityStatus(EntityStatus.Update);
            }
            if (!CollectionUtils.isEmpty((Collection)productApplyRangeList)) {
                productApplyRangeList.forEach(a -> {
                    a.setProductDepositTimeDetailId(productApplyRange.getProductDepositTimeDetailId());
                    a.setProductDetailId(productApplyRange.getProductDetailId());
                });
            }
            this.UpdateBusinessUnit(productDetail, product);
            this.setValueForAudoInfo(product, productExtend, productDetail, null, "modify");
        } else if (isApplied) {
            this.setValueForAudoInfo(product, null, productDetail, productApplyRangeDetail, "modify");
        } else {
            productApplyRange.setProductDetailId((Long)productDetail.getId());
            if (productDepositTimeDetail != null) {
                productApplyRange.setProductDepositTimeDetailId((Long)productDepositTimeDetail.getId());
            }
            productApplyRange.setEntityStatus(EntityStatus.Update);
            MetaDaoHelper.update((String)"pc.product.ProductApplyRange", (BizObject)productApplyRange);
            this.setValueToNULLForAudoInfo(product, productDetail, productApplyRangeDetail);
        }
        productDetailList.add(productDetail);
        if (null != productDepositTimeDetail) {
            productDepositTimeDetailList.add(productDepositTimeDetail);
        }
        if (productDepositTimeExtend != null) {
            product.setTime(productDepositTimeExtend);
        }
        product.setProductskus(productSkuList);
        product.setProductApplyRange(productApplyRangeList);
    }

    private void setValueToNULLForAudoInfo(Product product, ProductDetail productDetail, ProductApplyRangeDetail productApplyRangeDetail) {
        product.setModifier(null);
        product.setModifyDate(null);
        product.setModifyTime(null);
        product.setModifierId(null);
        productDetail.setModifier(null);
        productDetail.setModifyDate(null);
        productDetail.setModifyTime(null);
        productDetail.setModifierId(null);
        productApplyRangeDetail.setModifier(null);
        productApplyRangeDetail.setModifyDate(null);
        productApplyRangeDetail.setModifyTime(null);
        productApplyRangeDetail.setModifierId(null);
    }

    private void setValueForAudoInfo(Product product, ProductExtend productExtend, ProductDetail detail, ProductApplyRangeDetail applyRangeDetail, String type) {
        boolean sourceFlag;
        boolean bl = sourceFlag = product != null && product.get("sourceMarker") != null && "productApply".equals(product.get("sourceMarker"));
        if (Objects.nonNull(product) && "create".equals(type)) {
            if (null == product.getCreator() || !sourceFlag) {
                product.setCreator(AppContext.getCurrentUser().getName());
                product.setCreatorId((Long)AppContext.getCurrentUser().getId());
            }
            product.setCreateDate(new Date());
            product.setCreateTime(new Date());
            product.setModifier(null);
            product.setModifyDate(null);
            product.setModifyTime(null);
            product.setModifierId(null);
        }
        if (Objects.nonNull(product) && "modify".equals(type)) {
            if (null == product.getModifier() || !sourceFlag) {
                product.setModifier(AppContext.getCurrentUser().getName());
                product.setModifierId((Long)AppContext.getCurrentUser().getId());
            }
            product.setModifyDate(new Date());
            product.setModifyTime(new Date());
        }
        if (Objects.nonNull(productExtend) && "create".equals(type)) {
            if (null == productExtend.getCreator() || !sourceFlag) {
                productExtend.setCreator(AppContext.getCurrentUser().getName());
                productExtend.setCreatorId((Long)AppContext.getCurrentUser().getId());
            }
            productExtend.setCreateDate(new Date());
            productExtend.setCreateTime(new Date());
            productExtend.setModifier(null);
            productExtend.setModifyDate(null);
            productExtend.setModifyTime(null);
            productExtend.setModifierId(null);
        }
        if (Objects.nonNull(productExtend) && "modify".equals(type)) {
            if (null == productExtend.getModifier() || !sourceFlag) {
                productExtend.setModifier(AppContext.getCurrentUser().getName());
                productExtend.setModifierId((Long)AppContext.getCurrentUser().getId());
            }
            productExtend.setModifyDate(new Date());
            productExtend.setModifyTime(new Date());
        }
        if (Objects.nonNull(detail) && "create".equals(type)) {
            if (null == detail.getCreator() || !sourceFlag) {
                detail.setCreator(AppContext.getCurrentUser().getName());
                detail.setCreatorId((Long)AppContext.getCurrentUser().getId());
            }
            detail.setCreateDate(new Date());
            detail.setCreateTime(new Date());
            detail.setModifier(null);
            detail.setModifyDate(null);
            detail.setModifyTime(null);
            detail.setModifierId(null);
        }
        if (Objects.nonNull(detail) && "modify".equals(type)) {
            if (null == detail.getModifier() || !sourceFlag) {
                detail.setModifier(AppContext.getCurrentUser().getName());
                detail.setModifierId((Long)AppContext.getCurrentUser().getId());
            }
            detail.setModifyDate(new Date());
            detail.setModifyTime(new Date());
        }
        if (Objects.nonNull(applyRangeDetail) && "create".equals(type)) {
            if (null == applyRangeDetail.getCreator() || !sourceFlag) {
                applyRangeDetail.setCreator(AppContext.getCurrentUser().getName());
                applyRangeDetail.setCreatorId((Long)AppContext.getCurrentUser().getId());
            }
            applyRangeDetail.setCreateDate(new Date());
            applyRangeDetail.setCreateTime(new Date());
            applyRangeDetail.setModifier(null);
            applyRangeDetail.setModifyDate(null);
            applyRangeDetail.setModifyTime(null);
            applyRangeDetail.setModifierId(null);
        }
        if (Objects.nonNull(applyRangeDetail) && "modify".equals(type)) {
            applyRangeDetail.setModifier(AppContext.getCurrentUser().getName());
            applyRangeDetail.setModifyDate(new Date());
            applyRangeDetail.setModifyTime(new Date());
            applyRangeDetail.setModifierId((Long)AppContext.getCurrentUser().getId());
        }
    }

    private void UpdateBusinessUnit(ProductDetail productDetail, Product product) throws Exception {
        List productAssistUnitExchanges;
        HashMap<String, Object> mapParams = new HashMap<String, Object>();
        HashSet<Long> bussnessUnitSet = new HashSet<Long>();
        mapParams.put("productid", product.getId());
        mapParams.put("tenantid", AppContext.getCurrentUser().getTenant());
        mapParams.put("isCreator", 1);
        if (productDetail.containsKey((Object)"purchaseUnit") && productDetail.get("purchaseUnit") != null) {
            mapParams.put("mainPurchaseUnitId", productDetail.get("purchaseUnit"));
            bussnessUnitSet.add(TypeUtils.castToLong((Object)productDetail.get("purchaseUnit")));
        }
        if (productDetail.containsKey((Object)"purchasePriceUnit") && productDetail.get("purchasePriceUnit") != null) {
            mapParams.put("mainpurchasePriceUnitId", productDetail.get("purchasePriceUnit"));
            bussnessUnitSet.add(TypeUtils.castToLong((Object)productDetail.get("purchasePriceUnit")));
        }
        if (productDetail.containsKey((Object)"stockUnit") && productDetail.get("stockUnit") != null) {
            mapParams.put("mainStockUnitId", productDetail.get("stockUnit"));
            bussnessUnitSet.add(TypeUtils.castToLong((Object)productDetail.get("stockUnit")));
        }
        if (productDetail.containsKey((Object)"produceUnit") && productDetail.get("produceUnit") != null) {
            mapParams.put("mainProduceUnitId", productDetail.get("produceUnit"));
            bussnessUnitSet.add(TypeUtils.castToLong((Object)productDetail.get("produceUnit")));
        }
        if (productDetail.containsKey((Object)"batchPriceUnit") && productDetail.get("batchPriceUnit") != null) {
            mapParams.put("mainBatchPriceUnitId", productDetail.get("batchPriceUnit"));
            bussnessUnitSet.add(TypeUtils.castToLong((Object)productDetail.get("batchPriceUnit")));
        }
        if (productDetail.containsKey((Object)"inspectionUnit") && productDetail.get("inspectionUnit") != null) {
            mapParams.put("mainInspectionUnitId", productDetail.get("inspectionUnit"));
            bussnessUnitSet.add(TypeUtils.castToLong((Object)productDetail.get("inspectionUnit")));
        }
        if (productDetail.containsKey((Object)"batchUnit") && productDetail.get("batchUnit") != null) {
            mapParams.put("mainBatchUnitId", productDetail.get("batchUnit"));
            bussnessUnitSet.add(TypeUtils.castToLong((Object)productDetail.get("batchUnit")));
        }
        if (productDetail.containsKey((Object)"onlineUnit") && productDetail.get("onlineUnit") != null) {
            mapParams.put("mainOnlineUnitId", productDetail.get("onlineUnit"));
            bussnessUnitSet.add(TypeUtils.castToLong((Object)productDetail.get("onlineUnit")));
        }
        if (productDetail.containsKey((Object)"offlineUnit") && productDetail.get("offlineUnit") != null) {
            mapParams.put("mainOfflineUnitId", productDetail.get("offlineUnit"));
            bussnessUnitSet.add(TypeUtils.castToLong((Object)productDetail.get("offlineUnit")));
        }
        if (productDetail.containsKey((Object)"requireUnit") && productDetail.get("requireUnit") != null) {
            mapParams.put("mainRequireUnitId", productDetail.get("requireUnit"));
            bussnessUnitSet.add(TypeUtils.castToLong((Object)productDetail.get("requireUnit")));
        }
        if (productDetail.containsKey((Object)"demandPlanningUnit") && productDetail.get("demandPlanningUnit") != null) {
            mapParams.put("mainDemandPlanningUnitId", productDetail.get("demandPlanningUnit"));
            bussnessUnitSet.add(TypeUtils.castToLong((Object)productDetail.get("demandPlanningUnit")));
        }
        boolean isModify = false;
        QueryConditionGroup productUnitCondition = QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"id").eq(product.getId())});
        QuerySchema productLoadWaysSchema = QuerySchema.create().addSelect("unit,enableAssistUnit,unitUseType").addCondition((ConditionExpression)productUnitCondition);
        List resultList = MetaDaoHelper.query((String)"pc.product.Product", (QuerySchema)productLoadWaysSchema);
        HashMap unitIdMap = new HashMap();
        if (Objects.nonNull(resultList) && resultList.size() > 0) {
            Map resultMap = (Map)resultList.get(0);
            if (resultMap.containsKey("unit") && !Long.valueOf(String.valueOf(resultMap.get("unit"))).equals(product.getUnit())) {
                isModify = true;
            }
            if (!isModify && resultMap.get("unitUseType") != null && "2".equals(resultMap.get("unitUseType").toString())) {
                QueryConditionGroup unitCondition = QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"productId").eq(product.getId())});
                QuerySchema unitSchema = QuerySchema.create().addSelect("id,assistUnit").addCondition((ConditionExpression)unitCondition);
                List unitResultList = MetaDaoHelper.query((String)"pc.product.ProductAssistUnitExchange", (QuerySchema)unitSchema);
                unitResultList.forEach(map -> {
                    if (map.get("id") != null && map.get("assistUnit") != null) {
                        unitIdMap.put(map.get("id").toString(), map.get("assistUnit").toString());
                    }
                });
            }
        }
        if (!isModify && Objects.nonNull(productAssistUnitExchanges = product.productAssistUnitExchanges()) && product.getUnitUseType().shortValue() == UnitUseTypeEnum.USE_PRODUCT.getValue()) {
            for (ProductAssistUnitExchange productAssistUnitExchange : productAssistUnitExchanges) {
                if (productAssistUnitExchange.getEntityStatus() == EntityStatus.Delete || productAssistUnitExchange.getEntityStatus() == EntityStatus.Insert) {
                    isModify = true;
                    break;
                }
                if (productAssistUnitExchange.getEntityStatus() != EntityStatus.Update || productAssistUnitExchange.get("id") == null || !unitIdMap.containsKey(productAssistUnitExchange.getId().toString()) || productAssistUnitExchange.get("assistUnit") == null || ((String)unitIdMap.get(productAssistUnitExchange.getId().toString())).equals(productAssistUnitExchange.getAssistUnit().toString())) continue;
                isModify = true;
                break;
            }
        }
        if (mapParams.size() > 3 && isModify) {
            this.upcProductUpdateService.UpdateBusinessUnit(mapParams);
        }
    }

    private ProductDepositTime initRangeTime(Object productId, Object productApplyRangeId) throws Exception {
        HashMap<String, Object> params = new HashMap<String, Object>(4);
        params.put("ytenant", AppContext.getYTenantId());
        params.put("productId", productId);
        Map productDepositTimeExtend = (Map)SqlHelper.selectOne((String)"com.yonyoucloud.upc.data.ProductDoubleWriteQueryDao.selectProductDepositTimeExtend", params);
        ProductDepositTime productDepositTime = new ProductDepositTime();
        productDepositTime.setProductId(Long.valueOf(Long.parseLong(productId.toString())));
        productDepositTime.setEntityStatus(EntityStatus.Insert);
        productDepositTime.setTenant((Long)AppContext.getTenantId());
        productDepositTime.set("yTenantId", AppContext.getYhtTenantId());
        productDepositTime.setId((Object)IdManager.getInstance().nextId());
        productDepositTime.setProductApplyRangeId(Long.valueOf(Long.parseLong(productApplyRangeId.toString())));
        if (productDepositTimeExtend != null) {
            productDepositTime.putAll(productDepositTimeExtend);
        }
        return productDepositTime;
    }

    private void setProductLoadWayData(Product product, ProductDetail productDetail, String type, String groupType) throws Exception {
        List productLoadWays = new ArrayList();
        if (null != product.get("productLoadWays")) {
            productLoadWays = (List)product.get("productLoadWays");
        }
        ArrayList<ProductLoadWay> productLoadWayList = new ArrayList<ProductLoadWay>();
        if (INSERT.equals(type) && !CollectionUtils.isEmpty(productLoadWays)) {
            for (Map loadWay : productLoadWays) {
                ProductLoadWay way = new ProductLoadWay();
                way.putAll(loadWay);
                way.setId((Object)IdManager.getInstance().nextId());
                way.setProductId((Long)product.getId());
                way.setProductDetailId((Long)productDetail.getId());
                if ("2".equals(groupType)) {
                    way.setProductApplyRangeId(null);
                }
                productLoadWayList.add(way);
            }
        } else if (USER_INSERT.equals(type)) {
            QueryConditionGroup rangeCondition = QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"productId").eq(product.getId()), QueryCondition.name((String)"isCreator").eq((Object)true)});
            QuerySchema rangeConditionSchema = QuerySchema.create().addSelect("id,productDetailId").addCondition((ConditionExpression)rangeCondition);
            Map productApplyRange_Creator = MetaDaoHelper.queryOne((String)"pc.product.ProductApplyRange", (QuerySchema)rangeConditionSchema);
            QueryConditionGroup productLoadWaysCondition = QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"productId").eq(product.getId()), QueryCondition.name((String)"productDetailId").eq(productApplyRange_Creator.get("productDetailId"))});
            QuerySchema productLoadWaysSchema = QuerySchema.create().addSelect("*, loadWay.name as loadWay_Name").addCondition((ConditionExpression)productLoadWaysCondition);
            List resultList = MetaDaoHelper.query((String)"pc.product.ProductLoadWay", (QuerySchema)productLoadWaysSchema);
            if (productLoadWays.size() != 0) {
                for (int i = 0; i < productLoadWays.size(); ++i) {
                    Map loadWay = (Map)productLoadWays.get(i);
                    if ("insert".equalsIgnoreCase(loadWay.get("_status") + "")) {
                        resultList.add(loadWay);
                        continue;
                    }
                    if (!"delete".equalsIgnoreCase(loadWay.get("_status") + "")) continue;
                    resultList = resultList.stream().filter(result -> !(loadWay.get("loadWay") + "").equalsIgnoreCase(result.get("loadWay") + "")).collect(Collectors.toList());
                }
            }
            for (Map loadWay : resultList) {
                ProductLoadWay way = new ProductLoadWay();
                way.putAll(loadWay);
                way.setEntityStatus(EntityStatus.Insert);
                way.setId((Object)IdManager.getInstance().nextId());
                way.setProductId((Long)product.getId());
                way.setProductDetailId((Long)productDetail.getId());
                productLoadWayList.add(way);
            }
        } else {
            QueryConditionGroup condition = QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"productDetailId").eq(productDetail.getId())});
            QuerySchema schema = QuerySchema.create().addSelect("loadWay,id").addCondition((ConditionExpression)condition);
            List productLoadWayMapList = MetaDaoHelper.query((String)"pc.product.ProductLoadWay", (QuerySchema)schema);
            HashMap productLoadWayIdMap = new HashMap();
            productLoadWayMapList.forEach(a -> productLoadWayIdMap.put(a.get("loadWay").toString(), Long.parseLong(a.get("id").toString())));
            if (CREATOR_UPDATE.equals(type) && !CollectionUtils.isEmpty(productLoadWays)) {
                for (Map loadWay : productLoadWays) {
                    ProductLoadWay way = new ProductLoadWay();
                    way.putAll(loadWay);
                    way.setId((Object)IdManager.getInstance().nextId());
                    if (productLoadWayIdMap.containsKey(loadWay.get("loadWay").toString())) {
                        way.setId(productLoadWayIdMap.get(loadWay.get("loadWay").toString()));
                        if (way.getEntityStatus() != EntityStatus.Delete) {
                            way.setEntityStatus(EntityStatus.Update);
                        }
                    }
                    way.setProductId((Long)product.getId());
                    way.setProductDetailId((Long)productDetail.getId());
                    productLoadWayList.add(way);
                }
            } else if (USER_UPDATE.equals(type) && !CollectionUtils.isEmpty(productLoadWays) && !CollectionUtils.isEmpty(productLoadWays)) {
                for (Map loadWay : productLoadWays) {
                    ProductLoadWay way = new ProductLoadWay();
                    way.putAll(loadWay);
                    if (productLoadWayIdMap.containsKey(loadWay.get("loadWay").toString())) {
                        way.setId(productLoadWayIdMap.get(loadWay.get("loadWay").toString()));
                    }
                    way.setProductId((Long)product.getId());
                    way.setProductDetailId((Long)productDetail.getId());
                    productLoadWayList.add(way);
                }
            }
        }
        productDetail.setProductLoadWay(productLoadWayList);
        product.remove("productLoadWays");
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private ProductDetail setProductDetailData(ProductExtend productExtend, ProductApplyRangeDetail productApplyRangeDetail, ProductApplyRange productApplyRange, String type, String groupType, DocAttributeControlConfigDTO attributeControlConfigDTO) {
        ProductDetail productDetail = new ProductDetail();
        List<DocAttributeControlConfig> productDetailControlConfigList = null;
        if (null != attributeControlConfigDTO && null != attributeControlConfigDTO.getDocAttributeControlConfigList()) {
            productDetailControlConfigList = attributeControlConfigDTO.getDocAttributeControlConfigList().stream().filter(docAttributeControlConfig -> "pc.product.ProductDetail".equals(docAttributeControlConfig.getEntityUri())).collect(Collectors.toList());
        }
        if (INSERT.equals(type)) {
            productDetail.putAll((Map)productExtend);
            productDetail.setProductId((Long)productExtend.getId());
            productDetail.setId((Object)IdManager.getInstance().nextId());
            if ("0".equals(groupType)) {
                productDetail.setIsCreator(Boolean.valueOf(true));
                return productDetail;
            } else {
                if (!"2".equals(groupType)) return productDetail;
                Map extendCharacterDef = (Map)productDetail.get("productExtendCharacterDef");
                if (ObjectUtils.isNotEmpty((Object)extendCharacterDef)) {
                    BizObject characterDef = new BizObject();
                    characterDef.putAll(extendCharacterDef);
                    characterDef.put("id", (Object)IdManager.getInstance().nextId());
                    characterDef.put("_status", (Object)EntityStatus.Insert);
                    productDetail.put("productExtendCharacterDef", (Object)characterDef);
                }
                if (null != productDetailControlConfigList) {
                    this.productOrgShareUtil.buildControlAttribute(productDetailControlConfigList, productDetail);
                }
                productDetail.setIsCreator(Boolean.valueOf(false));
                productDetail.setOrgId(null);
                productDetail.setProductApplyRangeId(null);
            }
            return productDetail;
        } else if (CREATOR_UPDATE.equals(type)) {
            productDetail.putAll((Map)productExtend);
            productDetail.setIsCreator(Boolean.valueOf(true));
            productDetail.setProductId((Long)productExtend.getId());
            productDetail.setId((Object)productApplyRange.getProductDetailId());
            if (null == productDetailControlConfigList) return productDetail;
            List productDetailManageOrgControlList = productDetailControlConfigList.stream().filter(productDetailControlConfig -> "0".equals(productDetailControlConfig.getControlType())).collect(Collectors.toList());
            ArrayList<ProductDetail> detail = new ArrayList<ProductDetail>();
            ProductDetail productDetail4Update = new ProductDetail();
            try {
                List productDetailList = MetaDaoHelper.query((String)"pc.product.ProductDetail", (QuerySchema)QuerySchema.create().addSelect("id").addCondition((ConditionExpression)QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"productId").eq(productExtend.getId()), QueryCondition.name((String)"isCreator").eq((Object)false)})));
                for (DocAttributeControlConfig controlConfig : productDetailManageOrgControlList) {
                    if (null == controlConfig || !productExtend.containsKey((Object)controlConfig.getAttributeCode())) continue;
                    productDetail4Update.put(controlConfig.getAttributeCode(), productExtend.get(controlConfig.getAttributeCode()));
                }
                if (productDetail4Update.isEmpty() || CollectionUtils.isEmpty((Collection)productDetailList)) return productDetail;
                for (Map productDetailMap : productDetailList) {
                    ProductDetail updateDetail = new ProductDetail();
                    updateDetail.init((Map)productDetail4Update);
                    updateDetail.setId(productDetailMap.get("id"));
                    updateDetail.setEntityStatus(EntityStatus.Update);
                    detail.add(updateDetail);
                }
                if (detail.isEmpty()) return productDetail;
                MetaDaoHelper.update((String)"pc.product.ProductDetail", detail);
                return productDetail;
            }
            catch (Exception e) {
                log.error("\u53d7\u7ba1\u7406\u7ec4\u7ec7\u7ba1\u63a7\u5b57\u6bb5\u66f4\u65b0\u5931\u8d25\uff1a", (Object)e.getMessage(), (Object)e);
            }
            return productDetail;
        } else if (USER_INSERT.equals(type)) {
            productApplyRangeDetail.setEntityStatus(EntityStatus.Insert);
            productDetail.putAll((Map)productApplyRangeDetail);
            productApplyRangeDetail.setId(productApplyRange.getId());
            productDetail.setId((Object)IdManager.getInstance().nextId());
            if (null == productDetailControlConfigList) return productDetail;
            List productDetailManageOrgControlList = productDetailControlConfigList.stream().filter(productDetailControlConfig -> "0".equals(productDetailControlConfig.getControlType())).collect(Collectors.toList());
            ArrayList<String> selectFieldList = new ArrayList<String>();
            selectFieldList.add("id");
            for (DocAttributeControlConfig productDetailManageOrgControl : productDetailManageOrgControlList) {
                if (null == productDetailManageOrgControl) continue;
                selectFieldList.add(productDetailManageOrgControl.getAttributeCode());
            }
            try {
                Map productDetailMap = MetaDaoHelper.queryOne((String)"pc.product.ProductDetail", (QuerySchema)QuerySchema.create().addSelect(selectFieldList.toArray(new String[productDetailManageOrgControlList.size()])).addCondition((ConditionExpression)QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"productId").eq((Object)productDetail.getProductId()), QueryCondition.name((String)"isCreator").eq((Object)true)})));
                if (null == productDetailMap || productDetailMap.isEmpty()) return productDetail;
                for (DocAttributeControlConfig productDetailManageOrgControl : productDetailManageOrgControlList) {
                    if (null == productDetailManageOrgControl) continue;
                    productDetail.set(productDetailManageOrgControl.getAttributeCode(), productDetailMap.get(productDetailManageOrgControl.getAttributeCode()));
                }
                return productDetail;
            }
            catch (Exception e) {
                log.error("\u7269\u6599\u4e1a\u52a1\u4fe1\u606f\u53d7\u7ba1\u7406\u7ec4\u7ec7\u7ba1\u63a7\u5b57\u6bb5\u67e5\u8be2\u7ba1\u7406\u7ec4\u7ec7\u6570\u636e\u5931\u8d25\uff1a", (Object)e.getMessage(), (Object)e);
                return productDetail;
            }
        } else {
            if (!USER_UPDATE.equals(type)) return productDetail;
            productDetail.putAll((Map)productApplyRangeDetail);
            productDetail.setId((Object)productApplyRange.getProductDetailId());
            if (null == productDetailControlConfigList) return productDetail;
            List productDetailManageOrgControlList = productDetailControlConfigList.stream().filter(productDetailControlConfig -> "0".equals(productDetailControlConfig.getControlType())).collect(Collectors.toList());
            for (DocAttributeControlConfig productDetailManageOrgControl : productDetailManageOrgControlList) {
                productDetail.remove(productDetailManageOrgControl.getAttributeCode());
            }
        }
        return productDetail;
    }

    private ProductDepositTimeDetail setProductDepositTimeDetailData(ProductDepositTimeExtend productDepositTimeExtend, ProductDepositTime productDepositTime, ProductApplyRange productApplyRange, String type, Long productDetilId, String groupType) throws Exception {
        if (CollectionUtils.isEmpty((Map)productDepositTimeExtend) && CollectionUtils.isEmpty((Map)productDepositTime)) {
            return null;
        }
        ProductDepositTimeDetail productDepositTimeDetail = new ProductDepositTimeDetail();
        if (INSERT.equals(type)) {
            productDepositTimeDetail.putAll((Map)productDepositTimeExtend);
            productDepositTimeDetail.setId((Object)IdManager.getInstance().nextId());
            productDepositTimeDetail.setProductDetailId(productDetilId);
            if ("0".equals(groupType)) {
                productDepositTimeDetail.setIsCreator(Boolean.valueOf(true));
            } else if ("2".equals(groupType)) {
                productDepositTimeDetail.setIsCreator(Boolean.valueOf(false));
                productDepositTimeDetail.setProductApplyRangeId(null);
            }
        } else if (CREATOR_UPDATE.equals(type)) {
            productDepositTimeDetail.putAll((Map)productDepositTimeExtend);
            productDepositTimeDetail.setId((Object)productApplyRange.getProductDepositTimeDetailId());
            HashMap<String, Object> params = new HashMap<String, Object>(4);
            params.put("ytenant", AppContext.getYTenantId());
            params.put("productId", productDepositTimeExtend.getProductId());
            productDepositTimeDetail.setProductDetailId(productDetilId);
            productDepositTimeDetail.setIsCreator(Boolean.valueOf(true));
        } else if (USER_INSERT.equals(type)) {
            productDepositTime.setEntityStatus(EntityStatus.Insert);
            productDepositTimeDetail.putAll((Map)productDepositTime);
            productDepositTime.setId((Object)IdManager.getInstance().nextId());
            productDepositTimeDetail.setId((Object)IdManager.getInstance().nextId());
            productDepositTimeDetail.setProductDetailId(productDetilId);
        } else if (USER_UPDATE.equals(type)) {
            productDepositTimeDetail.putAll((Map)productDepositTime);
            if (EntityStatus.Insert == productDepositTime.getEntityStatus()) {
                productDepositTimeDetail.setId((Object)IdManager.getInstance().nextId());
                productApplyRange.setProductDepositTimeDetailId((Long)productDepositTimeDetail.getId());
                productApplyRange.setEntityStatus(EntityStatus.Update);
                MetaDaoHelper.update((String)"pc.product.ProductApplyRange", (BizObject)productApplyRange);
            } else {
                productDepositTimeDetail.setId((Object)productApplyRange.getProductDepositTimeDetailId());
            }
            HashMap<String, Object> params = new HashMap<String, Object>(4);
            params.put("ytenant", AppContext.getYTenantId());
            params.put("productApplyRangeId", productApplyRange.getId());
            productDepositTimeDetail.setProductDetailId(productDetilId);
        }
        return productDepositTimeDetail;
    }

    private void setSkuDetailNewData(List<ProductSKU> productSkuList, Long productDetailId, String type, String groupType) throws Exception {
        if (CollectionUtils.isEmpty(productSkuList)) {
            return;
        }
        HashMap productSkuDetailNewIdMap = new HashMap();
        HashMap productSkuOrderPropertyIdMap = new HashMap();
        if (CREATOR_UPDATE.equals(type) || USER_UPDATE.equals(type)) {
            QueryConditionGroup condition = QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"productId").eq((Object)productSkuList.get(0).getProductId()), QueryCondition.name((String)"productDetailId").eq((Object)productDetailId)});
            QuerySchema schema = QuerySchema.create().addSelect("productDetailId,skuId,id").addCondition((ConditionExpression)condition);
            List productSkuDetailNewMapList = MetaDaoHelper.query((String)"pc.product.ProductSkuDetailNew", (QuerySchema)schema);
            productSkuDetailNewMapList.forEach(a -> productSkuDetailNewIdMap.put(a.get("skuId").toString(), Long.parseLong(a.get("id").toString())));
            QueryConditionGroup productSkuOrderPropertyCondition = QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"productDetailId").eq((Object)productDetailId)});
            QuerySchema productSkuOrderPropertySchema = QuerySchema.create().addSelect("skuId,skuPropertyTypeId,productApplyRangeId,id").addCondition((ConditionExpression)productSkuOrderPropertyCondition);
            List productSkuOrderPropertyMapList = MetaDaoHelper.query((String)"pc.product.ProductSkuOrderProperty", (QuerySchema)productSkuOrderPropertySchema);
            productSkuOrderPropertyMapList.forEach(a -> productSkuOrderPropertyIdMap.put(a.get("skuId").toString() + a.get("skuPropertyTypeId") + a.get("productApplyRangeId"), Long.parseLong(a.get("id").toString())));
        }
        for (ProductSKU productSKU : productSkuList) {
            ProductSkuOrderProperty productSkuOrderProperty;
            Long productSkuDetailNewId = null;
            if (productSkuDetailNewIdMap.containsKey(productSKU.getId().toString())) {
                productSkuDetailNewId = (Long)productSkuDetailNewIdMap.get(productSKU.getId().toString());
            }
            ArrayList<ProductSkuDetailNew> productSkuDetailNewList = new ArrayList<ProductSkuDetailNew>();
            ProductSkuDetailNew productSkuDetailNew = new ProductSkuDetailNew();
            ProductSKUExtend productSkuExtend = (ProductSKUExtend)productSKU.get("productSKUDetail");
            ProductSKUDetail productSKUDetail = (ProductSKUDetail)productSKU.get("productSKUAppliedDetail");
            if (CollectionUtils.isEmpty((Map)productSkuExtend) && CollectionUtils.isEmpty((Map)productSKUDetail)) {
                for (String key : productSKU.keySet()) {
                    if (key.startsWith("productSKUDetail!")) {
                        productSkuExtend.put(key.replace("productSKUDetail!", ""), productSKU.get(key));
                        continue;
                    }
                    if (!key.startsWith("productSKUAppliedDetail!")) continue;
                    productSKUDetail.put(key.replace("productSKUAppliedDetail!", ""), productSKU.get(key));
                }
            }
            productSkuDetailNew.putAll((Map)(CollectionUtils.isEmpty((Map)productSkuExtend) ? productSKUDetail : productSkuExtend));
            productSkuDetailNew.setProductDetailId(productDetailId);
            if (USER_INSERT.equals(type)) {
                productSKUDetail.setEntityStatus(EntityStatus.Insert);
                productSKUDetail.setId((Object)IdManager.getInstance().nextId());
                productSKU.setProductSKUAppliedDetail(productSKUDetail);
                productSkuDetailNew.setEntityStatus(EntityStatus.Insert);
                productSkuDetailNew.setId((Object)IdManager.getInstance().nextId());
            } else {
                if (CREATOR_UPDATE.equals(type) || INSERT.equals(type)) {
                    productSkuDetailNew.setIsCreator(Boolean.valueOf(true));
                    if ("2".equals(groupType)) {
                        productSkuDetailNew.setIsCreator(Boolean.valueOf(false));
                        productSkuDetailNew.setProductApplyRangeId(null);
                    }
                }
                productSkuDetailNew.setId((Object)(productSkuDetailNewId == null ? IdManager.getInstance().nextId() : productSkuDetailNewId.longValue()));
            }
            productSkuDetailNewList.add(productSkuDetailNew);
            productSKU.setProductSkuDetailNew(productSkuDetailNewList);
            List skuOrderPropertyExtends = productSKU.skuOrderProperties();
            List skuOrderProperties = productSKU.skuAppliedOrderProperties();
            ArrayList<ProductSkuOrderProperty> productSkuOrderPropertyList = new ArrayList<ProductSkuOrderProperty>();
            if (USER_UPDATE.equals(type) || USER_INSERT.equals(type)) {
                if (CollectionUtils.isEmpty((Collection)skuOrderProperties)) continue;
                for (SKUOrderProperty skuOrderProperty : skuOrderProperties) {
                    productSkuOrderProperty = new ProductSkuOrderProperty();
                    productSkuOrderProperty.putAll((Map)skuOrderProperty);
                    if (USER_INSERT.equals(type)) {
                        skuOrderProperty.setEntityStatus(EntityStatus.Insert);
                        skuOrderProperty.setId((Object)IdManager.getInstance().nextId());
                        productSkuOrderProperty.setEntityStatus(EntityStatus.Insert);
                        productSkuOrderProperty.setId((Object)IdManager.getInstance().nextId());
                    }
                    productSkuOrderProperty.setProductDetailId(productDetailId);
                    if (productSkuOrderPropertyIdMap.containsKey(skuOrderProperty.getSkuId().toString() + skuOrderProperty.getSkuPropertyTypeId() + skuOrderProperty.getProductApplyRangeId())) {
                        productSkuOrderProperty.setId(productSkuOrderPropertyIdMap.get(skuOrderProperty.getSkuId().toString() + skuOrderProperty.getSkuPropertyTypeId() + skuOrderProperty.getProductApplyRangeId()));
                    } else {
                        productSkuOrderProperty.setId((Object)IdManager.getInstance().nextId());
                    }
                    productSkuOrderPropertyList.add(productSkuOrderProperty);
                }
                productSKU.setProductSkuOrderProperty(productSkuOrderPropertyList);
                continue;
            }
            if (CollectionUtils.isEmpty((Collection)skuOrderPropertyExtends)) continue;
            for (SKUOrderPropertyExtend skuOrderPropertyExtend : skuOrderPropertyExtends) {
                productSkuOrderProperty = new ProductSkuOrderProperty();
                productSkuOrderProperty.putAll((Map)skuOrderPropertyExtend);
                productSkuOrderProperty.setProductDetailId(productDetailId);
                productSkuOrderProperty.setIsCreator(Boolean.valueOf(true));
                if (productSkuOrderPropertyIdMap.containsKey(skuOrderPropertyExtend.getSkuId().toString() + skuOrderPropertyExtend.getSkuPropertyTypeId() + skuOrderPropertyExtend.getProductApplyRangeId())) {
                    productSkuOrderProperty.setId(productSkuOrderPropertyIdMap.get(skuOrderPropertyExtend.getSkuId().toString() + skuOrderPropertyExtend.getSkuPropertyTypeId() + skuOrderPropertyExtend.getProductApplyRangeId()));
                } else {
                    productSkuOrderProperty.setId((Object)IdManager.getInstance().nextId());
                }
                productSkuOrderPropertyList.add(productSkuOrderProperty);
            }
            productSKU.setProductSkuOrderProperty(productSkuOrderPropertyList);
        }
    }

    private void setProductParametersData(Product product, ProductDetail productDetail, String type, String groupType) throws Exception {
        List productParameterExtends = product.productParams();
        List productApplyRangeParamList = (List)product.get("productApplyRange");
        ArrayList<ProductParameters> productParametersList = new ArrayList<ProductParameters>();
        if (INSERT.equals(type) && !CollectionUtils.isEmpty((Collection)productParameterExtends)) {
            for (ProductParameterExtend productParameterExtend : productParameterExtends) {
                ProductParameters productParameters = new ProductParameters();
                productParameters.putAll((Map)productParameterExtend);
                productParameters.setId((Object)IdManager.getInstance().nextId());
                productParameters.setProductDetailId((Long)productDetail.getId());
                if ("0".equals(groupType)) {
                    productParameters.setIsCreator(Boolean.valueOf(true));
                } else if ("2".equals(groupType)) {
                    productParameters.setIsCreator(Boolean.valueOf(false));
                    productParameters.setProductApplyRangeId(Long.valueOf(-1L));
                }
                productParametersList.add(productParameters);
            }
        } else if (USER_INSERT.equals(type)) {
            List productParameterList = ((ProductApplyRange)productApplyRangeParamList.get(0)).productAppliedParams();
            if (!CollectionUtils.isEmpty((Collection)productParameterList)) {
                for (ProductParameter productParameter : productParameterList) {
                    ProductParameters productParameters = new ProductParameters();
                    productParameter.setEntityStatus(EntityStatus.Insert);
                    productParameters.putAll((Map)productParameter);
                    productParameter.setId((Object)IdManager.getInstance().nextId());
                    productParameters.setId((Object)IdManager.getInstance().nextId());
                    productParameters.setProductDetailId((Long)productDetail.getId());
                    productParametersList.add(productParameters);
                }
            }
        } else {
            List productParameterList;
            QueryConditionGroup condition = QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"productDetailId").eq(productDetail.getId())});
            QuerySchema schema = QuerySchema.create().addSelect("param,id").addCondition((ConditionExpression)condition);
            List productParametersMapList = MetaDaoHelper.query((String)"pc.product.ProductParameters", (QuerySchema)schema);
            HashMap productParametersIdMap = new HashMap();
            productParametersMapList.forEach(a -> productParametersIdMap.put(a.get("param").toString(), Long.parseLong(a.get("id").toString())));
            if (CREATOR_UPDATE.equals(type) && !CollectionUtils.isEmpty((Collection)productParameterExtends)) {
                for (ProductParameterExtend productParameterExtend : productParameterExtends) {
                    ProductParameters productParameters = new ProductParameters();
                    productParameters.putAll((Map)productParameterExtend);
                    if (productParametersIdMap.containsKey(productParameterExtend.getParam().toString())) {
                        productParameters.setId(productParametersIdMap.get(productParameterExtend.getParam().toString()));
                    }
                    productParameters.setProductDetailId((Long)productDetail.getId());
                    productParameters.setIsCreator(Boolean.valueOf(true));
                    productParametersList.add(productParameters);
                }
            } else if (USER_UPDATE.equals(type) && !CollectionUtils.isEmpty((Collection)(productParameterList = ((ProductApplyRange)productApplyRangeParamList.get(0)).productAppliedParams()))) {
                for (ProductParameter productParameter : productParameterList) {
                    ProductParameters productParameters = new ProductParameters();
                    productParameters.putAll((Map)productParameter);
                    if (productParametersIdMap.containsKey(productParameter.getParam().toString())) {
                        productParameters.setId(productParametersIdMap.get(productParameter.getParam().toString()));
                    }
                    productParameters.setProductDetailId((Long)productDetail.getId());
                    productParametersList.add(productParameters);
                }
            }
        }
        productDetail.setProductParameters(productParametersList);
    }

    private void setProductTagNewData(Product product, ProductDetail productDetail, String type, String groupType) throws Exception {
        List productTagExtends = product.productTags();
        List productApplyRangeParamList = (List)product.get("productApplyRange");
        ArrayList<ProductTagNew> productTagNewList = new ArrayList<ProductTagNew>();
        if (INSERT.equals(type) && !CollectionUtils.isEmpty((Collection)productTagExtends)) {
            for (ProductTagExtend productTagExtend : productTagExtends) {
                ProductTagNew productTagNew = new ProductTagNew();
                productTagNew.putAll((Map)productTagExtend);
                productTagNew.setId((Object)IdManager.getInstance().nextId());
                productTagNew.setProductDetailId((Long)productDetail.getId());
                if ("0".equals(groupType)) {
                    productTagNew.setIsCreator(Boolean.valueOf(true));
                } else if ("2".equals(groupType)) {
                    productTagNew.setIsCreator(Boolean.valueOf(false));
                    productTagNew.setProductApplyRangeId(null);
                }
                productTagNewList.add(productTagNew);
            }
        } else if (USER_INSERT.equals(type)) {
            List productTags = ((ProductApplyRange)productApplyRangeParamList.get(0)).productAppliedTags();
            if (!CollectionUtils.isEmpty((Collection)productTags)) {
                for (ProductTag productTag : productTags) {
                    ProductTagNew productTagNew = new ProductTagNew();
                    productTag.setEntityStatus(EntityStatus.Insert);
                    productTagNew.putAll((Map)productTag);
                    productTag.setId((Object)IdManager.getInstance().nextId());
                    productTagNew.setId((Object)IdManager.getInstance().nextId());
                    productTagNew.setProductDetailId((Long)productDetail.getId());
                    productTagNewList.add(productTagNew);
                }
            }
        } else {
            List productTags;
            QueryConditionGroup condition = QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"productDetailId").eq(productDetail.getId())});
            QuerySchema schema = QuerySchema.create().addSelect("tagId,id").addCondition((ConditionExpression)condition);
            List productTagNewMapList = MetaDaoHelper.query((String)"pc.product.ProductTagNew", (QuerySchema)schema);
            HashMap productTagNewIdMap = new HashMap();
            productTagNewMapList.forEach(a -> productTagNewIdMap.put(a.get("tagId").toString(), Long.parseLong(a.get("id").toString())));
            if (CREATOR_UPDATE.equals(type) && !CollectionUtils.isEmpty((Collection)productTagExtends)) {
                for (ProductTagExtend productTagExtend : productTagExtends) {
                    ProductTagNew productTagNew = new ProductTagNew();
                    productTagNew.putAll((Map)productTagExtend);
                    productTagNew.setId((Object)IdManager.getInstance().nextId());
                    if (productTagNewIdMap.containsKey(productTagExtend.getTagId().toString())) {
                        productTagNew.setId(productTagNewIdMap.get(productTagExtend.getTagId().toString()));
                        productTagNew.setEntityStatus(productTagExtend.getEntityStatus());
                    }
                    productTagNew.setProductDetailId((Long)productDetail.getId());
                    productTagNew.setIsCreator(Boolean.valueOf(true));
                    productTagNewList.add(productTagNew);
                }
            } else if (USER_UPDATE.equals(type) && !CollectionUtils.isEmpty((Collection)(productTags = ((ProductApplyRange)productApplyRangeParamList.get(0)).productAppliedTags()))) {
                for (ProductTag productTag : productTags) {
                    ProductTagNew productTagNew = new ProductTagNew();
                    productTagNew.putAll((Map)productTag);
                    if (productTagNewIdMap.containsKey(productTag.getTagId().toString())) {
                        productTagNew.setId(productTagNewIdMap.get(productTag.getTagId().toString()));
                    }
                    productTagNew.setProductDetailId((Long)productDetail.getId());
                    productTagNewList.add(productTagNew);
                }
            }
        }
        productDetail.setProductTagNew(productTagNewList);
    }

    private void setSkuTagNewData(Product product, ProductDetail productDetail, String type, String groupType) throws Exception {
        List productApplyRangeParamList = (List)product.get("productApplyRange");
        if (!CollectionUtils.isEmpty((Collection)productApplyRangeParamList)) {
            List skuTagExtends = ((ProductApplyRange)productApplyRangeParamList.get(0)).skuTags();
            List skuTags = ((ProductApplyRange)productApplyRangeParamList.get(0)).skuAppliedTags();
            ArrayList<SkuTagNew> skuTagNewList = new ArrayList<SkuTagNew>();
            if (INSERT.equals(type) && !CollectionUtils.isEmpty((Collection)skuTagExtends)) {
                for (SKUTagExtend skuTagExtend : skuTagExtends) {
                    SkuTagNew skuTagNew = new SkuTagNew();
                    skuTagNew.putAll((Map)skuTagExtend);
                    skuTagNew.setId((Object)IdManager.getInstance().nextId());
                    skuTagNew.setProductDetailId((Long)productDetail.getId());
                    if ("0".equals(groupType)) {
                        skuTagNew.setIsCreator(Boolean.valueOf(true));
                    } else if ("2".equals(groupType)) {
                        skuTagNew.setIsCreator(Boolean.valueOf(false));
                        skuTagNew.setProductApplyRangeId(null);
                    }
                    skuTagNewList.add(skuTagNew);
                }
            } else if (USER_INSERT.equals(type) && !CollectionUtils.isEmpty((Collection)skuTags)) {
                for (SKUTag skuTag : skuTags) {
                    SkuTagNew skuTagNew = new SkuTagNew();
                    skuTag.setEntityStatus(EntityStatus.Insert);
                    skuTagNew.putAll((Map)skuTag);
                    skuTag.setId((Object)IdManager.getInstance().nextId());
                    skuTagNew.setId((Object)IdManager.getInstance().nextId());
                    skuTagNew.setProductDetailId((Long)productDetail.getId());
                    skuTagNewList.add(skuTagNew);
                }
            } else {
                QueryConditionGroup condition = QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"productDetailId").eq(productDetail.getId())});
                QuerySchema schema = QuerySchema.create().addSelect("skuId,tagId,id").addCondition((ConditionExpression)condition);
                List skuTagNewMapList = MetaDaoHelper.query((String)"pc.product.SkuTagNew", (QuerySchema)schema);
                HashMap skuTagNewIdMap = new HashMap();
                skuTagNewMapList.forEach(a -> skuTagNewIdMap.put(a.get("skuId").toString() + a.get("tagId").toString(), Long.parseLong(a.get("id").toString())));
                if (CREATOR_UPDATE.equals(type) && !CollectionUtils.isEmpty((Collection)skuTagExtends)) {
                    for (SKUTagExtend skuTagExtend : skuTagExtends) {
                        SkuTagNew skuTagNew = new SkuTagNew();
                        skuTagNew.putAll((Map)skuTagExtend);
                        if (skuTagNewIdMap.containsKey(skuTagExtend.getSkuId() + skuTagExtend.getTagId().toString())) {
                            skuTagNew.setId(skuTagNewIdMap.get(skuTagExtend.getSkuId() + skuTagExtend.getTagId().toString()));
                        }
                        skuTagNew.setProductDetailId((Long)productDetail.getId());
                        skuTagNew.setIsCreator(Boolean.valueOf(true));
                        skuTagNewList.add(skuTagNew);
                    }
                } else if (USER_UPDATE.equals(type) && !CollectionUtils.isEmpty((Collection)skuTags)) {
                    for (SKUTag skuTag : skuTags) {
                        SkuTagNew skuTagNew = new SkuTagNew();
                        skuTagNew.putAll((Map)skuTag);
                        if (skuTagNewIdMap.containsKey(skuTag.getSkuId() + skuTag.getTagId().toString())) {
                            skuTagNew.setId(skuTagNewIdMap.get(skuTag.getSkuId() + skuTag.getTagId().toString()));
                        }
                        skuTagNew.setProductDetailId((Long)productDetail.getId());
                        skuTagNewList.add(skuTagNew);
                    }
                }
            }
            productDetail.setSkuTagNew(skuTagNewList);
        }
    }

    private void setProductApplyRange(Product product, List<ProductApplyRange> productApplyRangeList, List<ProductApplyRangeGroup> productApplyRangeGroupList, List<String> orgIds, Long productDetailId, ProductDepositTimeDetail productDepositTimeDetail, String type, boolean isApplied, String groupType, Integer version) throws Exception {
        if (BooleanUtil.isTrue((Object)product.get("FROM_UB_LINKER_TAG"))) {
            return;
        }
        ProductApplyRangeGroup productApplyRangeGroup = new ProductApplyRangeGroup();
        PubOrgGroup pubOrgGroup = new PubOrgGroup();
        ArrayList<PubOrgGroupDetail> pubOrgGroupDetailList = new ArrayList<PubOrgGroupDetail>();
        if (INSERT.equals(type)) {
            for (ProductApplyRange productApplyRange : productApplyRangeList) {
                if (!CollectionUtils.isEmpty(orgIds) && !orgIds.contains(productApplyRange.getOrgId())) continue;
                if (productDepositTimeDetail != null) {
                    productApplyRange.setProductDepositTimeDetailId((Long)productDepositTimeDetail.getId());
                }
                productApplyRange.setControlRuleVersion(version);
                productApplyRange.setProductDetailId(productDetailId);
                PubOrgGroupDetail pubOrgGroupDetail = new PubOrgGroupDetail();
                pubOrgGroupDetail.setOrgGroupType(String.valueOf(productApplyRange.getRangeType()));
                pubOrgGroupDetail.setOrgId(productApplyRange.getOrgId() == null ? String.valueOf(productApplyRange.getShopId()) : productApplyRange.getOrgId());
                pubOrgGroupDetail.setOrgType(String.valueOf(productApplyRange.getRangeType()));
                pubOrgGroupDetailList.add(pubOrgGroupDetail);
            }
            pubOrgGroup.setOrgGroupDetailList(pubOrgGroupDetailList);
            pubOrgGroup.setOrgGroupType(groupType);
            String groupId = this.groupService.saveGroup((Map)pubOrgGroup, "pc.pub_org_group.PubOrgGroup");
            BeanUtils.copyProperties((Object)productApplyRangeList.get(0), (Object)productApplyRangeGroup);
            productApplyRangeGroup.remove("pubts");
            productApplyRangeGroup.setProductDetailId(productDetailId);
            productApplyRangeGroup.setOrgGroupId(groupId);
            productApplyRangeGroup.setOrgGroupType(pubOrgGroup.getOrgGroupType());
            productApplyRangeGroup.setId((Object)IdManager.getInstance().nextId());
            productApplyRangeGroup.setEntityStatus(EntityStatus.Insert);
            productApplyRangeGroup.setControlRuleVersion(version);
            productApplyRangeGroupList.add(productApplyRangeGroup);
        } else {
            List productApplyRangeMapList = MetaDaoHelper.queryById((String)"pc.product.ProductApplyRange", (String)"id,orgId,productDetailId", (Object)product.get("productApplyRangeId"));
            Map productApplyRangeMap = (Map)productApplyRangeMapList.get(0);
            QueryConditionGroup productRangeGroupCondition = QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"productId").eq(product.getId())});
            productRangeGroupCondition.appendCondition(new ConditionExpression[]{QueryCondition.name((String)"productDetailId").eq(productApplyRangeMap.get("productDetailId"))});
            List<String> orgGroupTypeList = Arrays.asList("0", "2");
            productRangeGroupCondition.appendCondition(new ConditionExpression[]{QueryCondition.name((String)"orgGroupType").in(orgGroupTypeList)});
            QuerySchema productRangeGroupSchema = QuerySchema.create().addSelect("id,orgGroupId,productId,orgGroupType,productDetailId").addCondition((ConditionExpression)productRangeGroupCondition);
            List originalProductApplyRangeGroupList = MetaDaoHelper.queryObject((String)"pc.product.ProductApplyRangeGroup", (QuerySchema)productRangeGroupSchema, null);
            if (CollectionUtils.isEmpty((Collection)originalProductApplyRangeGroupList)) {
                return;
            }
            if (CREATOR_UPDATE.equals(type)) {
                List<Object> originalPubOrgGroupDetailList = this.getOriginalPubOrgGroupDetailList(((ProductApplyRangeGroup)originalProductApplyRangeGroupList.get(0)).getOrgGroupId());
                if (CollectionUtils.isEmpty(productApplyRangeList)) {
                    return;
                }
                for (ProductApplyRange productApplyRange : productApplyRangeList) {
                    if (EntityStatus.Insert.equals((Object)productApplyRange.getEntityStatus()) && (CollectionUtils.isEmpty(orgIds) || orgIds.contains(productApplyRange.getOrgId()))) {
                        PubOrgGroupDetail pubOrgGroupDetail = new PubOrgGroupDetail();
                        pubOrgGroupDetail.setOrgId(productApplyRange.getOrgId() == null ? String.valueOf(productApplyRange.getShopId()) : productApplyRange.getOrgId());
                        pubOrgGroupDetail.setOrgType(String.valueOf(productApplyRange.getRangeType()));
                        originalPubOrgGroupDetailList.add(pubOrgGroupDetail);
                        continue;
                    }
                    if (EntityStatus.Update.equals((Object)productApplyRange.getEntityStatus())) {
                        List productApplyRangeUpdateList = MetaDaoHelper.queryById((String)"pc.product.ProductApplyRange", (String)"orgId", (Object)productApplyRange.getId());
                        String orgId = ((Map)productApplyRangeUpdateList.get(0)).get("orgId") == null ? "" : ((Map)productApplyRangeUpdateList.get(0)).get("orgId").toString();
                        originalPubOrgGroupDetailList = originalPubOrgGroupDetailList.stream().filter(b -> !b.getOrgId().equals(orgId)).collect(Collectors.toList());
                        PubOrgGroupDetail pubOrgGroupDetail = new PubOrgGroupDetail();
                        pubOrgGroupDetail.setOrgId(productApplyRange.getOrgId() == null ? String.valueOf(productApplyRange.getShopId()) : productApplyRange.getOrgId());
                        pubOrgGroupDetail.setOrgType(String.valueOf(productApplyRange.getRangeType()));
                        originalPubOrgGroupDetailList.add(pubOrgGroupDetail);
                        continue;
                    }
                    if (!EntityStatus.Delete.equals((Object)productApplyRange.getEntityStatus())) continue;
                    originalPubOrgGroupDetailList = originalPubOrgGroupDetailList.stream().filter(b -> !b.getOrgId().equals(productApplyRange.getOrgId())).collect(Collectors.toList());
                }
                pubOrgGroup.setOrgGroupDetailList(originalPubOrgGroupDetailList);
                pubOrgGroup.setOrgGroupType("0");
                String groupId = this.groupService.saveGroup((Map)pubOrgGroup, "pc.pub_org_group.PubOrgGroup");
                productApplyRangeGroup = (ProductApplyRangeGroup)originalProductApplyRangeGroupList.get(0);
                productApplyRangeGroup.setOrgGroupId(groupId);
                productApplyRangeGroup.setEntityStatus(EntityStatus.Update);
                productApplyRangeGroupList.add(productApplyRangeGroup);
            } else {
                String lockKey;
                String lockValue;
                int tryLockNum = 0;
                while (true) {
                    if (tryLockNum > 50) {
                        throw new CoreDocBusinessException(InternationalUtils.getMessageWithDefault((String)"UID:P_COREDOC-BE_1C80F6F4057000BD", (String)"\u8be5\u7269\u6599\u6b63\u5728\u88ab\u7f16\u8f91\uff0c\u8bf7\u7a0d\u540e\u518d\u8bd5\uff01"));
                    }
                    ++tryLockNum;
                    lockValue = UUID.randomUUID().toString();
                    lockKey = "AP_COREDOC_PRODUCT_DETAIL_ORG_EDIT" + product.getId();
                    if (RedisTool.tryGetLock((String)lockKey, (String)lockValue, (int)10)) break;
                    TimeUnit.MILLISECONDS.sleep(200L);
                }
                TransactionSynchronizationManager.registerSynchronization((TransactionSynchronization)new TransactionSynchronization(){

                    public void afterCompletion(int status) {
                        RedisTool.releaseLock((String)lockKey, (String)lockValue);
                    }
                });
                List<PubOrgGroupDetail> originalPubOrgGroupDetailList = this.getOriginalPubOrgGroupDetailList(((ProductApplyRangeGroup)originalProductApplyRangeGroupList.get(0)).getOrgGroupId());
                if (!isApplied) {
                    ArrayList<PubOrgGroupDetail> userPubOrgGroupDetailList = new ArrayList<PubOrgGroupDetail>();
                    if (originalPubOrgGroupDetailList.size() > 1) {
                        Iterator<PubOrgGroupDetail> originalPubOrgGroupDetailIterator = originalPubOrgGroupDetailList.iterator();
                        while (originalPubOrgGroupDetailIterator.hasNext()) {
                            PubOrgGroupDetail pubOrgGroupDetail = originalPubOrgGroupDetailIterator.next();
                            if (!pubOrgGroupDetail.getOrgId().equals(productApplyRangeMap.get("orgId").toString())) continue;
                            userPubOrgGroupDetailList.add(pubOrgGroupDetail);
                            originalPubOrgGroupDetailIterator.remove();
                        }
                        PubOrgGroup userPubOrgGroup = new PubOrgGroup();
                        PubOrgGroup newOriginalPubOrgGroup = new PubOrgGroup();
                        newOriginalPubOrgGroup.setOrgGroupDetailList(originalPubOrgGroupDetailList);
                        userPubOrgGroup.setOrgGroupType("1");
                        userPubOrgGroup.setOrgGroupDetailList(userPubOrgGroupDetailList);
                        String newOriginalGroupId = this.groupService.saveGroup((Map)newOriginalPubOrgGroup, "pc.pub_org_group.PubOrgGroup");
                        ProductApplyRangeGroup newOriginalProductApplyRangeGroup = (ProductApplyRangeGroup)originalProductApplyRangeGroupList.get(0);
                        newOriginalProductApplyRangeGroup.setOrgGroupId(newOriginalGroupId);
                        newOriginalProductApplyRangeGroup.setEntityStatus(EntityStatus.Update);
                        String userGroupId = this.groupService.saveGroup((Map)userPubOrgGroup, "pc.pub_org_group.PubOrgGroup");
                        BeanUtils.copyProperties((Object)newOriginalProductApplyRangeGroup, (Object)productApplyRangeGroup);
                        productApplyRangeGroup.remove("pubts");
                        productApplyRangeGroup.setId((Object)IdManager.getInstance().nextId());
                        productApplyRangeGroup.setOrgGroupId(userGroupId);
                        productApplyRangeGroup.setOrgGroupType("1");
                        productApplyRangeGroup.setProductDetailId(productDetailId);
                        productApplyRangeGroup.setEntityStatus(EntityStatus.Insert);
                        productApplyRangeGroupList.add(newOriginalProductApplyRangeGroup);
                        productApplyRangeGroupList.add(productApplyRangeGroup);
                    } else if (originalPubOrgGroupDetailList.get(0).getOrgId().equals(productApplyRangeMap.get("orgId").toString())) {
                        HashMap<String, Object> param = new HashMap<String, Object>(4);
                        param.put("ytenant_id", AppContext.getYTenantId());
                        param.put("productId", ((ProductApplyRangeGroup)originalProductApplyRangeGroupList.get(0)).getProductId());
                        param.put("productDetailId", ((ProductApplyRangeGroup)originalProductApplyRangeGroupList.get(0)).getProductDetailId());
                        ProductApplyRangeGroup replaceProductApplyRangeGroup = (ProductApplyRangeGroup)originalProductApplyRangeGroupList.get(0);
                        replaceProductApplyRangeGroup.remove("pubts");
                        replaceProductApplyRangeGroup.setOrgGroupType("1");
                        replaceProductApplyRangeGroup.setProductDetailId(productDetailId);
                        replaceProductApplyRangeGroup.setEntityStatus(EntityStatus.Update);
                        productApplyRangeGroupList.add(replaceProductApplyRangeGroup);
                        SqlHelper.delete((String)"com.yonyoucloud.upc.product.dao.ProductManagerControl.deleteShareDetail", param);
                    }
                }
            }
        }
    }

    private List<PubOrgGroupDetail> getOriginalPubOrgGroupDetailList(String groupId) throws Exception {
        QuerySchema schema = QuerySchema.create().addSelect("id,orgType,orgId,groupId").addCondition((ConditionExpression)QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"groupId").eq((Object)groupId)}));
        List originalPubOrgGroupDetailMapList = MetaDaoHelper.query((String)"pc.pub_org_group.PubOrgGroupDetail", (QuerySchema)schema);
        ArrayList<PubOrgGroupDetail> originalPubOrgGroupDetailList = new ArrayList<PubOrgGroupDetail>();
        for (Map a : originalPubOrgGroupDetailMapList) {
            PubOrgGroupDetail pubOrgGroupDetail = new PubOrgGroupDetail();
            pubOrgGroupDetail.setOrgId(a.get("orgId") == null ? "" : a.get("orgId").toString());
            pubOrgGroupDetail.setGroupId(a.get("groupId") == null ? "" : a.get("groupId").toString());
            pubOrgGroupDetail.setOrgType(a.get("orgType") == null ? "" : a.get("orgType").toString());
            originalPubOrgGroupDetailList.add(pubOrgGroupDetail);
        }
        return originalPubOrgGroupDetailList;
    }
}


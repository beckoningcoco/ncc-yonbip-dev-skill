/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.alibaba.fastjson.JSON
 *  com.alibaba.fastjson.JSONObject
 *  com.yonyou.iuap.apdoc.coredoc.constants.UPCConstants
 *  com.yonyou.iuap.apdoc.coredoc.enums.CoreDocBusinessErrorEnum
 *  com.yonyou.iuap.apdoc.coredoc.exceptions.CoreDocBusinessException
 *  com.yonyou.iuap.apdoc.coredoc.option.service.PubOptionService
 *  com.yonyou.iuap.context.InvocationInfoProxy
 *  com.yonyou.iuap.org.dto.ConditionDTO
 *  com.yonyou.iuap.org.service.itf.core.IOrgUnitQueryService
 *  com.yonyou.ucf.mdd.common.model.Pager
 *  com.yonyou.ucf.mdd.common.model.ref.RefEntity
 *  com.yonyou.ucf.mdd.common.model.uimeta.filter.vo.FilterVO
 *  com.yonyou.ucf.mdd.common.model.uimeta.filter.vo.SimpleFilterVO
 *  com.yonyou.ucf.mdd.ext.core.AppContext
 *  com.yonyou.ucf.mdd.ext.filter.model.FieldEntity
 *  com.yonyou.ucf.mdd.ext.ref.service.IRefEvent
 *  com.yonyoucloud.iuap.upc.dto.attachment.AttachmentInfoCollectDTO
 *  com.yonyoucloud.iuap.upc.dto.attachment.AttachmentInfoDTO
 *  com.yonyoucloud.upc.utils.SQLInjectionCheckUtil
 *  org.apache.commons.lang3.StringUtils
 *  org.imeta.core.base.ConditionOperator
 *  org.imeta.core.lang.BooleanUtils
 *  org.imeta.orm.schema.ConditionExpression
 *  org.imeta.orm.schema.QueryCondition
 *  org.imeta.orm.schema.QueryConditionGroup
 *  org.imeta.orm.schema.QueryField
 *  org.slf4j.Logger
 *  org.slf4j.LoggerFactory
 *  org.springframework.beans.factory.annotation.Autowired
 *  org.springframework.stereotype.Component
 *  org.springframework.util.CollectionUtils
 */
package com.yonyoucloud.upc.eventbean.goodsArchives;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.yonyou.iuap.apdoc.coredoc.constants.UPCConstants;
import com.yonyou.iuap.apdoc.coredoc.enums.CoreDocBusinessErrorEnum;
import com.yonyou.iuap.apdoc.coredoc.exceptions.CoreDocBusinessException;
import com.yonyou.iuap.apdoc.coredoc.option.service.PubOptionService;
import com.yonyou.iuap.context.InvocationInfoProxy;
import com.yonyou.iuap.org.dto.ConditionDTO;
import com.yonyou.iuap.org.service.itf.core.IOrgUnitQueryService;
import com.yonyou.ucf.mdd.common.model.Pager;
import com.yonyou.ucf.mdd.common.model.ref.RefEntity;
import com.yonyou.ucf.mdd.common.model.uimeta.filter.vo.FilterVO;
import com.yonyou.ucf.mdd.common.model.uimeta.filter.vo.SimpleFilterVO;
import com.yonyou.ucf.mdd.ext.core.AppContext;
import com.yonyou.ucf.mdd.ext.filter.model.FieldEntity;
import com.yonyou.ucf.mdd.ext.ref.service.IRefEvent;
import com.yonyoucloud.iuap.upc.api.service.IUPCDataAuthService;
import com.yonyoucloud.iuap.upc.constants.ProductFieldMapping;
import com.yonyoucloud.iuap.upc.dto.attachment.AttachmentInfoCollectDTO;
import com.yonyoucloud.iuap.upc.dto.attachment.AttachmentInfoDTO;
import com.yonyoucloud.upc.billrule.cls.ProductClsUtils;
import com.yonyoucloud.upc.service.CoordinatedRefService;
import com.yonyoucloud.upc.service.ManagementClassTreeQueryService;
import com.yonyoucloud.upc.service.utils.OrgPermissionsUtil;
import com.yonyoucloud.upc.utils.SQLInjectionCheckUtil;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.stream.Collectors;
import org.apache.commons.lang3.StringUtils;
import org.imeta.core.base.ConditionOperator;
import org.imeta.core.lang.BooleanUtils;
import org.imeta.orm.schema.ConditionExpression;
import org.imeta.orm.schema.QueryCondition;
import org.imeta.orm.schema.QueryConditionGroup;
import org.imeta.orm.schema.QueryField;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.util.CollectionUtils;

@Component(value="productSKURefEventBean")
public class ProductSKURefEventBean
implements IRefEvent {
    private static final Logger log = LoggerFactory.getLogger(ProductSKURefEventBean.class);
    @Autowired
    private IUPCDataAuthService upcDataAuthService;
    @Autowired
    private OrgPermissionsUtil orgPermissionsUtil;
    @Autowired
    private IOrgUnitQueryService orgUnitQueryService;
    @Autowired
    private ManagementClassTreeQueryService managementClassTreeQueryService;
    @Autowired
    private PubOptionService pubOptionService;
    @Autowired
    CoordinatedRefService coordinatedRefService;

    public void beforeTreeData(RefEntity refEntity, Map<String, Object> map) {
        this.managementClassTreeQueryService.managementClassQueryCondition(refEntity, map);
    }

    public void afterTreeData(RefEntity refEntity, Map<String, Object> map, Object o) {
        if (null != o && o instanceof List) {
            ProductClsUtils.getInstance().sortTree((List)o, "managementClass_Code");
        }
    }

    public void beforeGridData(RefEntity refEntity, Map<String, Object> map) {
        Collection<String> result;
        Object masterOrgValue = map.get("masterOrgValue");
        SQLInjectionCheckUtil.checkMasterOrg((Object)masterOrgValue);
        FilterVO gridFilter = (FilterVO)map.get("condition");
        boolean isOrgGlobalShare = this.pubOptionService.getOrgGlobalShare("pc.product.Product");
        if (gridFilter == null) {
            gridFilter = new FilterVO();
        } else {
            this.orgPermissionsUtil.ignoreOrgId(gridFilter, isOrgGlobalShare);
            if (refEntity.getCode().contains("productskuref")) {
                SimpleFilterVO[] simpleFilterVO;
                String refCode;
                String string = refCode = refEntity.getCode().contains("productcenter") ? refEntity.getCode() : "productcenter." + refEntity.getCode();
                if (gridFilter.getQueryConditionGroup() != null && !gridFilter.getQueryConditionGroup().conditions().isEmpty()) {
                    QueryConditionGroup queryConditionGroup = gridFilter.getQueryConditionGroup();
                    int recurrenceNo = 1;
                    this.queryConditionGroupChangeModel(refEntity, queryConditionGroup, refCode, recurrenceNo);
                }
                if ((simpleFilterVO = gridFilter.getSimpleVOs()) != null && simpleFilterVO.length != 0) {
                    for (int i = 0; i < simpleFilterVO.length; ++i) {
                        List SimpleFilterVOs = simpleFilterVO[i].getConditions();
                        if (null != SimpleFilterVOs && !SimpleFilterVOs.isEmpty()) {
                            int recurrenceNo = 1;
                            this.querySimpleVOsChangeModel(SimpleFilterVOs, refCode, recurrenceNo);
                        }
                        if (simpleFilterVO[i].getField() == null) continue;
                        this.replaceSimpleFilter(refCode, simpleFilterVO[i]);
                    }
                }
            }
        }
        Map<String, List<String>> productIdMap = null;
        try {
            productIdMap = this.upcDataAuthService.getDataPermission(new String[]{"pc.product.Product"});
        }
        catch (Exception e) {
            log.error("beforeGridData error:" + e.getMessage(), (Throwable)e);
            throw new CoreDocBusinessException(e.getMessage());
        }
        if (productIdMap != null && productIdMap.get("pc.product.Product") != null) {
            List<String> productIds = productIdMap.get("pc.product.Product");
            log.info("productSKURefEventBean-getDataPermission-productIds=======>: " + productIds);
            gridFilter.appendCondition(ConditionOperator.and, new SimpleFilterVO[]{new SimpleFilterVO("productId", "in", productIds)});
        }
        JSONObject extMap = null;
        String extendCondition = (String)map.get("extendCondition");
        if (!StringUtils.isEmpty((CharSequence)extendCondition)) {
            extMap = JSON.parseObject((String)extendCondition);
        }
        boolean useAuthOrgFlag = extMap != null && BooleanUtils.b(extMap.get("useAuthOrg")) && Objects.nonNull(masterOrgValue);
        String refCode = refEntity.getCode();
        if (!refCode.contains("productskuref")) {
            if (extMap == null || !BooleanUtils.b(extMap.get("descriptive"))) {
                gridFilter.appendCondition(ConditionOperator.and, new SimpleFilterVO[]{new SimpleFilterVO("productId.realProductAttributeType", "neq", (Object)20)});
                gridFilter.appendCondition(ConditionOperator.and, new SimpleFilterVO[]{new SimpleFilterVO("productId.virtualProductAttribute", "neq", (Object)20)});
            }
            if (!(extMap != null && BooleanUtils.b(extMap.get("includeOuterOrg")) || isOrgGlobalShare || CollectionUtils.isEmpty(result = this.orgUnitQueryService.getIdsByCondition(AppContext.getCurrentUser().getYTenantId(), ConditionDTO.newCondition().onlyOrganization())))) {
                gridFilter.appendCondition(ConditionOperator.and, new SimpleFilterVO[]{new SimpleFilterVO("productId.productApplyRange.orgId", "in", result)});
            }
        }
        if ("pc_productskuquerymaintreeref".equals(refCode)) {
            gridFilter.appendCondition(ConditionOperator.and, new SimpleFilterVO[]{new SimpleFilterVO("productId.productApplyRange.isCreator", "eq", (Object)1)});
        }
        if (refCode.contains("productskuref") && (extMap == null || !BooleanUtils.b(extMap.get("filterByMasterOrgFlag")))) {
            List<String> commonOrgIds;
            result = null;
            List<Object> masterOrgList = null;
            if (!useAuthOrgFlag) {
                result = this.orgPermissionsUtil.getOrgPermissionsNew(false);
            }
            if (!isOrgGlobalShare && masterOrgValue != null && !masterOrgValue.toString().trim().isEmpty()) {
                String masterOrgs = masterOrgValue.toString();
                if (masterOrgs.contains(",")) {
                    masterOrgList = Arrays.asList(masterOrgs.split(","));
                } else {
                    masterOrgList = new ArrayList();
                    masterOrgList.add(masterOrgs);
                }
            }
            if (!CollectionUtils.isEmpty(commonOrgIds = this.orgPermissionsUtil.filterCommonOrgIds((List<String>)result, (List<String>)masterOrgList))) {
                gridFilter.appendCondition(ConditionOperator.and, new SimpleFilterVO[]{new SimpleFilterVO("productId.productApplyRangeGroup.orgGroupId.orgGroupDetailList.orgId", "in", commonOrgIds)});
            }
            if (CollectionUtils.isEmpty(commonOrgIds) || isOrgGlobalShare) {
                SimpleFilterVO simpleFilterVO = new SimpleFilterVO();
                FieldEntity fieldEntity = new FieldEntity("productId.orgId");
                simpleFilterVO.setValue1((Object)fieldEntity);
                simpleFilterVO.setField("productId.productApplyRangeGroup.orgGroupId.orgGroupDetailList.orgId");
                simpleFilterVO.setOp("eq");
                gridFilter.appendCondition(ConditionOperator.and, new SimpleFilterVO[]{simpleFilterVO});
            }
        }
        if ("pc_productskuqueryfiltertreeref".equals(refCode)) {
            result = this.orgPermissionsUtil.getOrgPermissions("pc_product");
            if (!CollectionUtils.isEmpty(result) && !isOrgGlobalShare) {
                gridFilter.appendCondition(ConditionOperator.and, new SimpleFilterVO[]{new SimpleFilterVO("productId.productApplyRange.orgId", "in", result)});
            }
            if (masterOrgValue != null && extMap != null && BooleanUtils.b(extMap.get("filterByMasterOrgFlag")) && !isOrgGlobalShare) {
                gridFilter.appendCondition(ConditionOperator.and, new SimpleFilterVO[]{new SimpleFilterVO("productId.productApplyRange.orgId", "in", masterOrgValue)});
            }
            map.put("isSum", true);
        }
        map.put("condition", gridFilter);
    }

    private void queryConditionGroupChangeModel(RefEntity refEntity, QueryConditionGroup queryConditionGroup, String refCode, int recurrenceNo) {
        List conditionGropList = queryConditionGroup.conditions();
        for (ConditionExpression condition : conditionGropList) {
            if (condition instanceof QueryCondition) {
                QueryCondition queryCondition = (QueryCondition)condition;
                if (condition == null || condition.toString() == null || queryCondition.field() == null) continue;
                if ("productcenter.productskuref".equalsIgnoreCase(refCode)) {
                    if (!StringUtils.isEmpty((CharSequence)ProductFieldMapping.PRODUCTSKU_CARRY_PRODUCT_MAP.get(queryCondition.field()))) {
                        queryCondition.rename(ProductFieldMapping.PRODUCTSKU_CARRY_PRODUCT_MAP.get(queryCondition.field()));
                        continue;
                    }
                    boolean productCoorMap = false;
                    for (Map.Entry<String, String> entry : ProductFieldMapping.COORDINATED_SKUREFMAP.entrySet()) {
                        if (!queryCondition.field().contains(entry.getKey())) continue;
                        queryCondition.rename(queryCondition.field().replace(entry.getKey(), entry.getValue()));
                        productCoorMap = true;
                        break;
                    }
                    if (productCoorMap) continue;
                }
                if (ProductFieldMapping.COORDINATED_REFCODES.get(refCode) != null && StringUtils.isEmpty((CharSequence)ProductFieldMapping.COORDINATED_REFCODES.get(refCode).get(queryCondition.field()))) continue;
                queryCondition.rename(ProductFieldMapping.COORDINATED_REFCODES.get(refCode).get(queryCondition.field()));
                continue;
            }
            if (!(condition instanceof QueryConditionGroup)) continue;
            if (recurrenceNo > UPCConstants.MAX_RECURRENCE_NO) {
                throw new CoreDocBusinessException(CoreDocBusinessErrorEnum.PRODUCT_SKU_REFER_QUERY_CONDITION_ERROR);
            }
            int innerCurrenceNo = recurrenceNo + 1;
            this.queryConditionGroupChangeModel(refEntity, (QueryConditionGroup)condition, refCode, innerCurrenceNo);
        }
    }

    private void querySimpleVOsChangeModel(List<SimpleFilterVO> SimpleFilterVOs, String refCode, int recurrenceNo) {
        for (SimpleFilterVO simpleFilter : SimpleFilterVOs) {
            if (null != simpleFilter.getConditions() && !simpleFilter.getConditions().isEmpty()) {
                if (recurrenceNo > UPCConstants.MAX_RECURRENCE_NO) {
                    throw new CoreDocBusinessException(CoreDocBusinessErrorEnum.PRODUCT_SKU_REFER_QUERY_CONDITION_ERROR);
                }
                int innerCurrenceNo = recurrenceNo + 1;
                this.querySimpleVOsChangeModel(simpleFilter.getConditions(), refCode, innerCurrenceNo);
            }
            if (simpleFilter.getField() == null) continue;
            this.replaceSimpleFilter(refCode, simpleFilter);
        }
    }

    private void replaceSimpleFilter(String refCode, SimpleFilterVO simpleFilterVO) {
        if ("productcenter.productskuref".equalsIgnoreCase(refCode)) {
            if (!StringUtils.isEmpty((CharSequence)ProductFieldMapping.PRODUCTSKU_CARRY_PRODUCT_MAP.get(simpleFilterVO.getField()))) {
                simpleFilterVO.setField(ProductFieldMapping.PRODUCTSKU_CARRY_PRODUCT_MAP.get(simpleFilterVO.getField()));
            }
            boolean productCoorMap = false;
            for (Map.Entry<String, String> entry : ProductFieldMapping.COORDINATED_SKUREFMAP.entrySet()) {
                if (!simpleFilterVO.getField().contains(entry.getKey())) continue;
                simpleFilterVO.setField(simpleFilterVO.getField().replace(entry.getKey(), entry.getValue()));
                break;
            }
        }
        if (ProductFieldMapping.COORDINATED_REFCODES.get(refCode) != null && !StringUtils.isEmpty((CharSequence)ProductFieldMapping.COORDINATED_REFCODES.get(refCode).get(simpleFilterVO.getField()))) {
            simpleFilterVO.setField(ProductFieldMapping.COORDINATED_REFCODES.get(refCode).get(simpleFilterVO.getField()));
        }
    }

    public void afterGridData(RefEntity refEntity, Map<String, Object> refpara, Object result) {
        String masterOrgValue;
        Object extenalData = refpara.get("externalData");
        boolean isFilter = null != extenalData && "filter".equalsIgnoreCase(extenalData.toString());
        String string = masterOrgValue = refpara.get("masterOrgValue") != null ? refpara.get("masterOrgValue").toString() : "";
        if (result != null && result instanceof Pager) {
            List<AttachmentInfoCollectDTO> attachmentInfoCollectDTOList;
            List productSKUList = ((Pager)result).getRecordList();
            ArrayList<String> productSKUIds = new ArrayList<String>();
            ArrayList<String> productIds = new ArrayList<String>();
            HashMap productSKUsMap = new HashMap();
            if (!CollectionUtils.isEmpty((Collection)productSKUList)) {
                productSKUList.stream().forEach(data -> data.remove("productId_url"));
                productSKUList.stream().forEach(data -> {
                    if (data.containsKey("id")) {
                        productSKUIds.add(data.get("id").toString());
                        productSKUsMap.put(data.get("id").toString(), data);
                        if (null != data.get("productId")) {
                            productIds.add(data.get("productId").toString());
                        }
                    }
                });
            }
            if (!CollectionUtils.isEmpty(attachmentInfoCollectDTOList = this.coordinatedRefService.getBtachProductUrl(productIds))) {
                Map productAttMap = attachmentInfoCollectDTOList.stream().filter(Objects::nonNull).collect(Collectors.toMap(AttachmentInfoCollectDTO::getBusinessId, attachmentInfoCollectDTO -> attachmentInfoCollectDTO.getAttachmentInfoDTOList(), (oldValue, newValue) -> {
                    oldValue.addAll(newValue);
                    return oldValue;
                }, HashMap::new));
                if (!CollectionUtils.isEmpty((Collection)productSKUList) && !CollectionUtils.isEmpty((Map)productAttMap)) {
                    productSKUList.stream().forEach(data -> {
                        if (data.containsKey("productId") && productAttMap.containsKey(data.get("productId").toString())) {
                            data.put("productId_url", ((AttachmentInfoDTO)((List)productAttMap.get(data.get("productId").toString())).get(0)).getDownloadUrl());
                        }
                    });
                }
            }
            if (!CollectionUtils.isEmpty((Collection)productSKUList) && refEntity.getCode().contains("productskuref") && isFilter) {
                List<Map<String, Object>> productRefQueryList;
                List<QueryField> queryFieldList = new ArrayList();
                if (null != InvocationInfoProxy.getExtendAttribute((String)"originSelectFields")) {
                    queryFieldList = (List)InvocationInfoProxy.getExtendAttribute((String)"originSelectFields");
                }
                List<Object> extendFieldList = new ArrayList();
                if (null != queryFieldList) {
                    extendFieldList = queryFieldList.stream().filter(Objects::nonNull).filter(f -> null != f.alias() && f.alias().contains("_userDefine_")).map(QueryField::alias).collect(Collectors.toList());
                }
                if (!CollectionUtils.isEmpty(productRefQueryList = this.coordinatedRefService.getProductSKURefDetail(productSKUIds, masterOrgValue, queryFieldList))) {
                    for (Map<String, Object> detailMap : productRefQueryList) {
                        String productSKUId = detailMap.get("id").toString();
                        Map productSKU = (Map)productSKUsMap.get(productSKUId);
                        if (null == productSKU) continue;
                        productSKU.put("productSKUDetailNew!shortName", detailMap.get("productSKUDetailNew!shortName"));
                        productSKU.put("productSKUDetailNew!mnemonicCode", detailMap.get("productSKUDetailNew!mnemonicCode"));
                        if (null == extendFieldList) continue;
                        extendFieldList.forEach(alias -> {
                            Object value = detailMap.get(alias);
                            if (value != null) {
                                productSKU.put(alias, value);
                            }
                        });
                    }
                }
            }
        }
    }

    public void beforeGridMeta(RefEntity refEntity) {
    }

    public void afterGridMeta(RefEntity refEntity, Object o) {
    }
}


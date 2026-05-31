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
 *  com.yonyou.ucf.mdd.common.model.Pager
 *  com.yonyou.ucf.mdd.common.model.ref.RefEntity
 *  com.yonyou.ucf.mdd.common.model.uimeta.filter.vo.FilterVO
 *  com.yonyou.ucf.mdd.common.model.uimeta.filter.vo.SimpleFilterVO
 *  com.yonyou.ucf.mdd.ext.filter.model.FieldEntity
 *  com.yonyou.ucf.mdd.ext.ref.service.IRefEvent
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
import com.yonyou.ucf.mdd.common.model.Pager;
import com.yonyou.ucf.mdd.common.model.ref.RefEntity;
import com.yonyou.ucf.mdd.common.model.uimeta.filter.vo.FilterVO;
import com.yonyou.ucf.mdd.common.model.uimeta.filter.vo.SimpleFilterVO;
import com.yonyou.ucf.mdd.ext.filter.model.FieldEntity;
import com.yonyou.ucf.mdd.ext.ref.service.IRefEvent;
import com.yonyoucloud.iuap.upc.api.service.IUPCDataAuthService;
import com.yonyoucloud.iuap.upc.constants.ProductFieldMapping;
import com.yonyoucloud.upc.service.CoordinatedRefService;
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

@Component(value="goodsRefEventBean")
public class GoodsRefEventBean
implements IRefEvent {
    private static final Logger log = LoggerFactory.getLogger(GoodsRefEventBean.class);
    @Autowired
    CoordinatedRefService coordinatedRefService;
    @Autowired
    private IUPCDataAuthService upcDataAuthService;
    @Autowired
    private OrgPermissionsUtil orgPermissionsUtil;
    @Autowired
    private PubOptionService pubOptionService;

    public void beforeTreeData(RefEntity refEntity, Map<String, Object> map) {
    }

    public void afterTreeData(RefEntity refEntity, Map<String, Object> map, Object o) {
    }

    public void beforeGridData(RefEntity refEntity, Map<String, Object> map) {
        boolean useAuthOrgFlag;
        Object masterOrgValue = map.get("masterOrgValue");
        SQLInjectionCheckUtil.checkMasterOrg((Object)masterOrgValue);
        FilterVO gridFilter = (FilterVO)map.get("condition");
        boolean isOrgGlobalShare = this.pubOptionService.getOrgGlobalShare("pc.product.Product");
        if (gridFilter == null) {
            gridFilter = new FilterVO();
        } else {
            SimpleFilterVO[] simpleFilterVO;
            this.orgPermissionsUtil.ignoreOrgId(gridFilter, isOrgGlobalShare);
            if (gridFilter.getQueryConditionGroup() != null && !gridFilter.getQueryConditionGroup().conditions().isEmpty()) {
                QueryConditionGroup queryConditionGroup = gridFilter.getQueryConditionGroup();
                int recurrenceNo = 1;
                this.queryConditionGroupChangeModel(refEntity, queryConditionGroup, recurrenceNo);
            }
            if ((simpleFilterVO = gridFilter.getSimpleVOs()) != null && simpleFilterVO.length != 0) {
                for (int i = 0; i < simpleFilterVO.length; ++i) {
                    List SimpleFilterVOs = simpleFilterVO[i].getConditions();
                    if (null != SimpleFilterVOs && !SimpleFilterVOs.isEmpty()) {
                        int recurrenceNo = 1;
                        this.querySimpleVOsChangeModel(SimpleFilterVOs, recurrenceNo);
                    }
                    if (simpleFilterVO[i].getField() == null) continue;
                    this.replaceSimpleFilter(simpleFilterVO[i]);
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
            log.error("productSKURefEventBean-getDataPermission-productIds=======>: " + productIds);
            gridFilter.appendCondition(ConditionOperator.and, new SimpleFilterVO[]{new SimpleFilterVO("productId", "in", productIds)});
        }
        JSONObject extMap = null;
        String extendCondition = (String)map.get("extendCondition");
        if (!StringUtils.isEmpty((CharSequence)extendCondition)) {
            extMap = JSON.parseObject((String)extendCondition);
        }
        boolean bl = useAuthOrgFlag = extMap != null && BooleanUtils.b(extMap.get("useAuthOrg")) && Objects.nonNull(masterOrgValue);
        if (extMap == null || !BooleanUtils.b(extMap.get("filterByMasterOrgFlag"))) {
            List<String> commonOrgIds;
            List<String> result = null;
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
            if (!CollectionUtils.isEmpty(commonOrgIds = this.orgPermissionsUtil.filterCommonOrgIds(result, masterOrgList))) {
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
        map.put("condition", gridFilter);
    }

    private void queryConditionGroupChangeModel(RefEntity refEntity, QueryConditionGroup queryConditionGroup, int recurrenceNo) {
        List conditionGropList = queryConditionGroup.conditions();
        for (ConditionExpression condition : conditionGropList) {
            if (condition instanceof QueryCondition) {
                QueryCondition queryCondition = (QueryCondition)condition;
                if (condition == null || condition.toString() == null || queryCondition.field() == null) continue;
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
                if (productCoorMap || !StringUtils.isNotEmpty((CharSequence)ProductFieldMapping.COORDINATED_REFCODES.get("productcenter.goodsRef").get(queryCondition.field()))) continue;
                queryCondition.rename(ProductFieldMapping.COORDINATED_REFCODES.get("productcenter.goodsRef").get(queryCondition.field()));
                continue;
            }
            if (!(condition instanceof QueryConditionGroup)) continue;
            if (recurrenceNo > UPCConstants.MAX_RECURRENCE_NO) {
                throw new CoreDocBusinessException(CoreDocBusinessErrorEnum.PRODUCT_REFER_QUERY_CONDITION_ERROR);
            }
            int innerCurrenceNo = recurrenceNo + 1;
            this.queryConditionGroupChangeModel(refEntity, (QueryConditionGroup)condition, innerCurrenceNo);
        }
    }

    private void querySimpleVOsChangeModel(List<SimpleFilterVO> SimpleFilterVOs, int recurrenceNo) {
        for (SimpleFilterVO simpleFilter : SimpleFilterVOs) {
            if (null != simpleFilter.getConditions() && !simpleFilter.getConditions().isEmpty()) {
                if (recurrenceNo > UPCConstants.MAX_RECURRENCE_NO) {
                    throw new CoreDocBusinessException(CoreDocBusinessErrorEnum.PRODUCT_REFER_QUERY_CONDITION_ERROR);
                }
                int innerCurrenceNo = recurrenceNo + 1;
                this.querySimpleVOsChangeModel(simpleFilter.getConditions(), innerCurrenceNo);
            }
            if (simpleFilter.getField() == null) continue;
            this.replaceSimpleFilter(simpleFilter);
        }
    }

    private void replaceSimpleFilter(SimpleFilterVO simpleFilterVO) {
        if (!StringUtils.isEmpty((CharSequence)ProductFieldMapping.PRODUCTSKU_CARRY_PRODUCT_MAP.get(simpleFilterVO.getField()))) {
            simpleFilterVO.setField(ProductFieldMapping.PRODUCTSKU_CARRY_PRODUCT_MAP.get(simpleFilterVO.getField()));
        }
        for (Map.Entry<String, String> entry : ProductFieldMapping.COORDINATED_SKUREFMAP.entrySet()) {
            if (!simpleFilterVO.getField().contains(entry.getKey())) continue;
            simpleFilterVO.setField(simpleFilterVO.getField().replace(entry.getKey(), entry.getValue()));
            break;
        }
        if (!StringUtils.isEmpty((CharSequence)ProductFieldMapping.COORDINATED_REFCODES.get("productcenter.goodsRef").get(simpleFilterVO.getField()))) {
            simpleFilterVO.setField(ProductFieldMapping.COORDINATED_REFCODES.get("productcenter.goodsRef").get(simpleFilterVO.getField()));
        }
    }

    public void afterGridData(RefEntity refEntity, Map<String, Object> refpara, Object result) {
        String masterOrgValue;
        Object extenalData = refpara.get("externalData");
        boolean isFilter = null != extenalData && "filter".equalsIgnoreCase(extenalData.toString());
        String string = masterOrgValue = refpara.get("masterOrgValue") != null ? refpara.get("masterOrgValue").toString() : "";
        if (null != result && result instanceof Pager) {
            List productSKUList = ((Pager)result).getRecordList();
            ArrayList<String> productSKUIds = new ArrayList<String>();
            HashMap<String, Map> productSKUsMap = new HashMap<String, Map>();
            if (!CollectionUtils.isEmpty((Collection)productSKUList)) {
                for (Map data : productSKUList) {
                    if (null == data.get("id")) continue;
                    productSKUIds.add(data.get("id").toString());
                    productSKUsMap.put(data.get("id").toString(), data);
                }
            }
            if (!CollectionUtils.isEmpty((Collection)productSKUList) && isFilter) {
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


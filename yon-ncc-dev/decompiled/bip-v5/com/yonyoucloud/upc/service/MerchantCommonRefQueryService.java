/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.yonyou.diwork.service.auth.IServiceIsolateService
 *  com.yonyou.iuap.apdoc.coredoc.enums.CoreDocBusinessErrorEnum
 *  com.yonyou.iuap.apdoc.coredoc.enums.CoreExtrateBusinessErrorEnum
 *  com.yonyou.iuap.apdoc.coredoc.exceptions.CoreDocBusinessException
 *  com.yonyou.iuap.apdoc.coredoc.option.service.PubOptionService
 *  com.yonyou.ucf.mdd.common.model.ref.RefEntity
 *  com.yonyou.ucf.mdd.common.model.uimeta.filter.vo.FilterCommonVO
 *  com.yonyou.ucf.mdd.common.model.uimeta.filter.vo.FilterVO
 *  com.yonyou.ucf.mdd.common.model.uimeta.filter.vo.SimpleFilterVO
 *  com.yonyou.ucf.mdd.ext.base.user.UserType
 *  com.yonyou.ucf.mdd.ext.core.AppContext
 *  com.yonyou.ucf.mdd.ext.model.BillContext
 *  com.yonyou.ucf.mdd.ext.model.LoginUser
 *  com.yonyoucloud.upc.utils.MerchantCommonRefUtils
 *  com.yonyoucloud.upc.utils.UPCGlobalShareUtil
 *  org.imeta.core.base.ConditionOperator
 *  org.imeta.orm.schema.ConditionExpression
 *  org.imeta.orm.schema.QueryCondition
 *  org.imeta.orm.schema.QueryConditionGroup
 *  org.imeta.orm.schema.QueryJoin
 *  org.imeta.orm.schema.QuerySchema
 *  org.imeta.orm.schema.QuerySqlCondition
 *  org.slf4j.Logger
 *  org.slf4j.LoggerFactory
 *  org.springframework.beans.factory.annotation.Autowired
 *  org.springframework.stereotype.Service
 *  org.springframework.util.CollectionUtils
 *  org.springframework.util.StringUtils
 */
package com.yonyoucloud.upc.service;

import com.yonyou.diwork.service.auth.IServiceIsolateService;
import com.yonyou.iuap.apdoc.coredoc.enums.CoreDocBusinessErrorEnum;
import com.yonyou.iuap.apdoc.coredoc.enums.CoreExtrateBusinessErrorEnum;
import com.yonyou.iuap.apdoc.coredoc.exceptions.CoreDocBusinessException;
import com.yonyou.iuap.apdoc.coredoc.option.service.PubOptionService;
import com.yonyou.ucf.mdd.common.model.ref.RefEntity;
import com.yonyou.ucf.mdd.common.model.uimeta.filter.vo.FilterCommonVO;
import com.yonyou.ucf.mdd.common.model.uimeta.filter.vo.FilterVO;
import com.yonyou.ucf.mdd.common.model.uimeta.filter.vo.SimpleFilterVO;
import com.yonyou.ucf.mdd.ext.base.user.UserType;
import com.yonyou.ucf.mdd.ext.core.AppContext;
import com.yonyou.ucf.mdd.ext.model.BillContext;
import com.yonyou.ucf.mdd.ext.model.LoginUser;
import com.yonyoucloud.upc.service.utils.OrgPermissionsUtil;
import com.yonyoucloud.upc.utils.MerchantCommonRefUtils;
import com.yonyoucloud.upc.utils.UPCGlobalShareUtil;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;
import org.imeta.core.base.ConditionOperator;
import org.imeta.orm.schema.ConditionExpression;
import org.imeta.orm.schema.QueryCondition;
import org.imeta.orm.schema.QueryConditionGroup;
import org.imeta.orm.schema.QueryJoin;
import org.imeta.orm.schema.QuerySchema;
import org.imeta.orm.schema.QuerySqlCondition;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;
import org.springframework.util.StringUtils;

@Service
public class MerchantCommonRefQueryService {
    private static final Logger log = LoggerFactory.getLogger(MerchantCommonRefQueryService.class);
    private final String RANGE_SQL = "select T0.merchantId from merchantapplyrange T0 where T0.ispotential = 0 and ";
    @Autowired
    private IServiceIsolateService iServiceIsolateService;
    @Autowired
    private PubOptionService pubOptionService;
    @Autowired
    private OrgPermissionsUtil orgPermissionsUtil;

    public void saleAreaQueryRefCondition(RefEntity refEntity, Map<String, Object> refpara) {
        List orgIdList;
        refEntity.setDatasourceType("saleAreaRef");
        if (this.pubOptionService.getOrgGlobalShare("aa.salearea.SaleArea").booleanValue()) {
            UPCGlobalShareUtil.handleTreeCondition(refpara, (String)"saleAreaApplyRange.orgId");
            return;
        }
        FilterVO gridFilter = (FilterVO)refpara.get("treeCondition");
        if (gridFilter == null) {
            gridFilter = new FilterVO();
        }
        Map externalData = new HashMap();
        if (refpara.get("externalData") != null && refpara.get("externalData") instanceof Map && (externalData = (Map)refpara.get("externalData")).containsKey("isMasterOrg") && externalData.get("isMasterOrg") instanceof Boolean && ((Boolean)externalData.get("isMasterOrg")).booleanValue() && !CollectionUtils.isEmpty((Collection)(orgIdList = this.iServiceIsolateService.findMainOrgPermission(AppContext.getCurrentUser().getYhtUserId(), "aa_salearea", AppContext.getCurrentUser().getYhtTenantId())))) {
            gridFilter.appendCondition(ConditionOperator.and, new SimpleFilterVO[]{new SimpleFilterVO("saleAreaApplyRange.orgId", "in", (Object)orgIdList)});
        }
        refpara.put("treeCondition", gridFilter);
    }

    public void customerLevelRefCondition(RefEntity refEntity, Map<String, Object> map) {
        refEntity.setDatasourceType("customerLevelRef");
    }

    public void isPartitionAbleCustomerLevelRef(QuerySchema schema, BillContext billContext) {
        Map extendCondition = billContext.getContext();
        if (!CollectionUtils.isEmpty((Map)extendCondition) && extendCondition.containsKey("shopValue") && extendCondition.get("shopValue") != null) {
            schema.setPartitionable(false);
            QueryConditionGroup queryConditionGroup = schema.queryConditionGroup();
            Iterator conditionExpressionIterator = queryConditionGroup.conditions().iterator();
            while (conditionExpressionIterator.hasNext()) {
                ConditionExpression conditionExpression = (ConditionExpression)conditionExpressionIterator.next();
                if (!(conditionExpression instanceof QueryCondition) || !"shop".equals(((QueryCondition)conditionExpression).field())) continue;
                conditionExpressionIterator.remove();
            }
            schema.appendQueryCondition(new ConditionExpression[]{QueryCondition.name((String)"ytenant").eq((Object)AppContext.getCurrentUser().getYTenantId()), QueryCondition.name((String)"shop").eq((Object)Long.parseLong(extendCondition.get("shopValue").toString()))});
        } else if (!CollectionUtils.isEmpty((Map)extendCondition) && extendCondition.containsKey("shopType")) {
            schema.setPartitionable(false);
            QueryConditionGroup queryConditionGroup = schema.queryConditionGroup();
            Iterator conditionExpressionIterator = queryConditionGroup.conditions().iterator();
            while (conditionExpressionIterator.hasNext()) {
                ConditionExpression conditionExpression = (ConditionExpression)conditionExpressionIterator.next();
                if (!(conditionExpression instanceof QueryCondition) || !"shop".equals(((QueryCondition)conditionExpression).field())) continue;
                conditionExpressionIterator.remove();
            }
            if ("0".equals(extendCondition.get("shopType").toString())) {
                schema.appendQueryCondition(new ConditionExpression[]{QueryCondition.name((String)"ytenant").eq((Object)AppContext.getCurrentUser().getYTenantId()), QueryCondition.name((String)"shop").eq((Object)-1)});
            } else if ("1".equals(extendCondition.get("shopType").toString())) {
                schema.appendQueryCondition(new ConditionExpression[]{QueryCondition.name((String)"ytenant").eq((Object)AppContext.getCurrentUser().getYTenantId()), QueryCondition.name((String)"shop").not_eq((Object)-1)});
            } else if ("2".equals(extendCondition.get("shopType").toString())) {
                schema.appendQueryCondition(new ConditionExpression[]{QueryCondition.name((String)"ytenant").eq((Object)AppContext.getCurrentUser().getYTenantId())});
            }
        }
    }

    public void merchantRefUsageCondition(RefEntity refEntity, Map<String, Object> map) {
        FilterVO gridFilter = (FilterVO)map.get("condition");
        if (gridFilter == null) {
            gridFilter = new FilterVO();
        }
        refEntity.setDatasourceType("merchantRefUsage");
        this.setGroupBelongOrgCondition(gridFilter, map);
        this.setOrgType(gridFilter, map);
        gridFilter.appendCondition(ConditionOperator.and, new SimpleFilterVO[]{new SimpleFilterVO("merchantApplyRanges.isPotential", "eq", (Object)false)});
        map.put("condition", gridFilter);
    }

    public void merchantRefManagementCondition(RefEntity refEntity, Map<String, Object> map) {
        FilterVO gridFilter = (FilterVO)map.get("condition");
        if (gridFilter == null) {
            gridFilter = new FilterVO();
        }
        refEntity.setDatasourceType("merchantRefUsage");
        this.setGroupManagementCondition(gridFilter, map);
        gridFilter.appendCondition(ConditionOperator.and, new SimpleFilterVO[]{new SimpleFilterVO("merchantApplyRanges.isPotential", "eq", (Object)false)});
        map.put("condition", gridFilter);
    }

    public void merchantInorganizationRefCondition(RefEntity refEntity, Map<String, Object> map) {
        FilterVO gridFilter = (FilterVO)map.get("condition");
        if (gridFilter == null) {
            gridFilter = new FilterVO();
        }
        this.setMerchantInorganizationCondition(gridFilter, map);
        if (AppContext.getCurrentUser().getUserType() != UserType.ShopAdminUser && AppContext.getCurrentUser().getUserType() != UserType.ShopUser) {
            gridFilter.appendCondition(ConditionOperator.and, new SimpleFilterVO[]{new SimpleFilterVO("merchantAppliedDetail.merchantApplyRangeId.isCreator", "eq", (Object)1)});
        }
        gridFilter.appendCondition(ConditionOperator.and, new SimpleFilterVO[]{new SimpleFilterVO("merchantAppliedDetail.merchantApplyRangeId.isPotential", "eq", (Object)false)});
        map.put("condition", gridFilter);
    }

    public void setMerchantGroupRefExt(BillContext billContext, RefEntity refEntity, Map<String, Object> map) {
        if ("merchantRef".equals(refEntity.getCode()) || "baseMerchantRef".equals(refEntity.getCode())) {
            boolean isModifySchema = false;
            HashMap<String, Boolean> context = new HashMap<String, Boolean>();
            FilterVO gridFilter = (FilterVO)map.get("condition");
            if (gridFilter != null) {
                if (this.dealCommonCondition(gridFilter, "merchantApplyRangeGroups.merchantSaleArea.saleAreaId")) {
                    context.put("merchantSaleArea", true);
                    isModifySchema = true;
                }
                if (this.dealCommonCondition(gridFilter, "merchantApplyRangeGroups.merchantPrincipal.managementDepartmentId") || this.dealCommonCondition(gridFilter, "merchantApplyRangeGroups.merchantPrincipal.managementSalesmanId")) {
                    context.put("merchantPrincipal", true);
                    isModifySchema = true;
                }
                if (this.dealCommonCondition(gridFilter, "merchantApplyRangeGroups.merchantInvoice.merchantInvoiceId")) {
                    context.put("merchantInvoice", true);
                    isModifySchema = true;
                }
                if (isModifySchema) {
                    context.put("modifySchema", true);
                    billContext.setContext(context);
                }
            }
        }
    }

    public void isPartitionAbleMerchantGroupRef(QuerySchema schema, BillContext billContext) {
        Map extendCondition = billContext.getContext();
        if (!CollectionUtils.isEmpty((Map)extendCondition)) {
            if (extendCondition.containsKey("merchantSaleArea")) {
                schema.addJoin(new QueryJoin[]{new QueryJoin("customerAreas", ".isDefault=1&&.merchantApplyRangeId=merchantApplyRanges.id", "left join")});
            }
            if (extendCondition.containsKey("merchantPrincipal")) {
                schema.addJoin(new QueryJoin[]{new QueryJoin("principals", ".isDefault=1&&.merchantApplyRangeId=merchantApplyRanges.id", "left join")});
            }
            if (extendCondition.containsKey("merchantApplyRangeGroups.merchantInvoice.merchantInvoiceId")) {
                schema.addJoin(new QueryJoin[]{new QueryJoin("invoicingCustomerss", ".isDefault=1&&.merchantApplyRangeId=merchantApplyRanges.id", "left join")});
            }
        }
    }

    public boolean dealCommonCondition(FilterVO condition, String itemName) {
        FilterCommonVO[] commonVOList = condition.getCommonVOs();
        if (commonVOList != null) {
            ArrayList<FilterCommonVO> filterCommonVOList = new ArrayList<FilterCommonVO>(Arrays.asList(commonVOList));
            for (FilterCommonVO filterCommonVO : filterCommonVOList) {
                if (!StringUtils.hasText((String)filterCommonVO.getItemName()) || !itemName.equals(filterCommonVO.getItemName())) continue;
                return true;
            }
        }
        return false;
    }

    public Object getCommonConditionValue(FilterVO condition, String itemName) {
        FilterCommonVO[] commonVOList = condition.getCommonVOs();
        if (commonVOList != null) {
            ArrayList<FilterCommonVO> filterCommonVOList = new ArrayList<FilterCommonVO>(Arrays.asList(commonVOList));
            for (FilterCommonVO filterCommonVO : filterCommonVOList) {
                if (!StringUtils.hasText((String)filterCommonVO.getItemName()) || !itemName.equals(filterCommonVO.getItemName())) continue;
                return filterCommonVO.getValue1();
            }
        }
        return null;
    }

    private void dealRemoveCondition(FilterVO condition, String itemName) {
        FilterCommonVO[] commonVOList = condition.getCommonVOs();
        if (commonVOList != null) {
            ArrayList<FilterCommonVO> filterCommonVOList = new ArrayList<FilterCommonVO>(Arrays.asList(commonVOList));
            filterCommonVOList.removeIf(filterCommonVO -> StringUtils.hasText((String)filterCommonVO.getItemName()) && itemName.equals(filterCommonVO.getItemName()));
            condition.setCommonVOs(filterCommonVOList.toArray(new FilterCommonVO[0]));
        }
    }

    public void setGroupBelongOrgCondition(FilterVO gridFilter, Map<String, Object> map) {
        if (this.pubOptionService.getOrgGlobalShare("aa.merchant.Merchant").booleanValue()) {
            MerchantCommonRefUtils.ignoreOrgId((FilterVO)gridFilter, (boolean)true);
        } else {
            Set<String> orgIdList;
            boolean orgAuth = true;
            if (map.get("externalData") != null && map.get("externalData") instanceof Map) {
                Map externalData = (Map)map.get("externalData");
                if (externalData.get("belongOrg") != null && externalData.get("belongOrg") instanceof String) {
                    orgAuth = false;
                    gridFilter.appendCondition(ConditionOperator.and, new SimpleFilterVO[]{new SimpleFilterVO("merchantApplyRanges.orgId", "eq", (Object)externalData.get("belongOrg").toString())});
                } else if (externalData.get("belongOrg") != null && externalData.get("belongOrg") instanceof List) {
                    orgAuth = false;
                    gridFilter.appendCondition(ConditionOperator.and, new SimpleFilterVO[]{new SimpleFilterVO("merchantApplyRanges.orgId", "in", externalData.get("belongOrg"))});
                }
            }
            if (orgAuth && !CollectionUtils.isEmpty(orgIdList = this.orgPermissionsUtil.getOrgPermissions("aa_merchant"))) {
                gridFilter.appendCondition(ConditionOperator.and, new SimpleFilterVO[]{new SimpleFilterVO("merchantApplyRanges.orgId", "in", orgIdList)});
            }
        }
    }

    public void setOrgType(FilterVO gridFilter, Map<String, Object> map) {
        Map externalData;
        boolean isShop = true;
        if (map.get("externalData") != null && map.get("externalData") instanceof Map && (externalData = (Map)map.get("externalData")).get("shopType") != null && externalData.get("shopType") instanceof String) {
            if ("0".equals(externalData.get("shopType").toString())) {
                isShop = false;
                gridFilter.appendCondition(ConditionOperator.and, new SimpleFilterVO[]{new SimpleFilterVO("merchantApplyRanges.rangeType", "eq", (Object)1)});
            } else if ("1".equals(externalData.get("shopType").toString())) {
                isShop = false;
                gridFilter.appendCondition(ConditionOperator.and, new SimpleFilterVO[]{new SimpleFilterVO("merchantApplyRanges.rangeType", "eq", (Object)3)});
            } else if ("2".equals(externalData.get("shopType").toString())) {
                isShop = false;
            }
        }
        if (isShop) {
            LoginUser currentUser = AppContext.getCurrentUser();
            if (null == currentUser) {
                throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_800108);
            }
            if (currentUser.getUserType() == UserType.ShopAdminUser || currentUser.getUserType() == UserType.ShopUser) {
                gridFilter.appendCondition(ConditionOperator.and, new SimpleFilterVO[]{new SimpleFilterVO("merchantApplyRanges.rangeType", "eq", (Object)3)});
                gridFilter.appendCondition(ConditionOperator.and, new SimpleFilterVO[]{new SimpleFilterVO("merchantApplyRanges.orgId", "eq", AppContext.getCurrentUser().get("singleOrgId"))});
            } else {
                gridFilter.appendCondition(ConditionOperator.and, new SimpleFilterVO[]{new SimpleFilterVO("merchantApplyRanges.rangeType", "eq", (Object)1)});
            }
        }
    }

    public void setGroupManagementCondition(FilterVO gridFilter, Map<String, Object> map) {
        if (this.pubOptionService.getOrgGlobalShare("aa.merchant.Merchant").booleanValue()) {
            MerchantCommonRefUtils.ignoreOrgId((FilterVO)gridFilter, (boolean)true);
            gridFilter.appendCondition(ConditionOperator.and, new SimpleFilterVO[]{new SimpleFilterVO("merchantApplyRanges.isCreator", "eq", (Object)true)});
        } else if (AppContext.getCurrentUser().getUserType() == UserType.ShopAdminUser || AppContext.getCurrentUser().getUserType() == UserType.ShopUser) {
            gridFilter.appendCondition(ConditionOperator.and, new SimpleFilterVO[]{new SimpleFilterVO("merchantApplyRanges.rangeType", "eq", (Object)3)});
            gridFilter.appendCondition(ConditionOperator.and, new SimpleFilterVO[]{new SimpleFilterVO("merchantApplyRanges.orgId", "eq", AppContext.getCurrentUser().get("singleOrgId"))});
        } else {
            List<String> orgGolbalList;
            gridFilter.appendCondition(ConditionOperator.and, new SimpleFilterVO[]{new SimpleFilterVO("merchantApplyRanges.isCreator", "eq", (Object)true)});
            if (map.get("externalData") != null && map.get("externalData") instanceof Map) {
                Map externalData = (Map)map.get("externalData");
                if (externalData.get("masterOrgValue") != null && externalData.get("masterOrgValue") instanceof List) {
                    List masterOrgIds = (List)externalData.get("masterOrgValue");
                    orgGolbalList = this.externalOrgIdHandle(gridFilter, masterOrgIds);
                } else {
                    orgGolbalList = this.orgPermissionsHandle(gridFilter);
                }
            } else {
                orgGolbalList = this.orgPermissionsHandle(gridFilter);
            }
            if (!CollectionUtils.isEmpty(orgGolbalList)) {
                String queryDistinctIdSql = "(select T0.merchantId from merchantapplyrange T0 where T0.ispotential = 0 and  T0.ytenant_id ='" + AppContext.getCurrentUser().getYTenantId() + "'";
                if (orgGolbalList.size() > 1000 && this.orgPermissionsUtil.isOracle()) {
                    StringBuilder orgGlobalPart = new StringBuilder("and ( ");
                    String queryInLimitCount = this.orgPermissionsUtil.queryInLimitCount(orgGolbalList, "T0.orgId", 1000);
                    orgGlobalPart.append(queryInLimitCount);
                    orgGlobalPart.append(")");
                    queryDistinctIdSql = queryDistinctIdSql + orgGlobalPart.toString() + ")";
                } else {
                    String orgIdsStr = orgGolbalList.stream().map(s -> "'" + s + "'").collect(Collectors.joining(", "));
                    queryDistinctIdSql = queryDistinctIdSql + "and T0.orgId in (" + orgIdsStr + "))";
                }
                QueryConditionGroup sqlCondGroup = QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{new QuerySqlCondition("id", queryDistinctIdSql)});
                QueryConditionGroup specCondition = gridFilter.getQueryConditionGroup();
                if (null != specCondition) {
                    sqlCondGroup.appendCondition(new ConditionExpression[]{specCondition});
                }
                gridFilter.setQueryConditionGroup(sqlCondGroup);
            } else {
                throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_800749);
            }
        }
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private List<String> orgPermissionsHandle(FilterVO gridFilter) {
        ArrayList<String> orgGolbalList = new ArrayList<String>();
        Set<String> orgIdList = this.orgPermissionsUtil.getOrgPermissions("aa_merchant");
        if (this.dealCommonCondition(gridFilter, "merchantApplyRangeGroups.orgGroupId.orgGroupDetailList.orgId")) {
            Object value = this.getCommonConditionValue(gridFilter, "merchantApplyRangeGroups.orgGroupId.orgGroupDetailList.orgId");
            if (value instanceof String) {
                if (!orgIdList.contains(value)) throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_800747);
                this.dealRemoveCondition(gridFilter, "merchantApplyRangeGroups.orgGroupId.orgGroupDetailList.orgId");
                orgGolbalList.add(value.toString());
                return orgGolbalList;
            } else {
                if (!(value instanceof List)) throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_800748);
                List orgIdConditionList = (List)value;
                orgIdConditionList.retainAll(orgIdList);
                if (orgIdConditionList.isEmpty()) {
                    throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_800747);
                }
                orgGolbalList.addAll(orgIdConditionList);
                this.dealRemoveCondition(gridFilter, "merchantApplyRangeGroups.orgGroupId.orgGroupDetailList.orgId");
            }
            return orgGolbalList;
        } else {
            orgGolbalList.addAll(orgIdList);
        }
        return orgGolbalList;
    }

    /*
     * WARNING - void declaration
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private List<String> externalOrgIdHandle(FilterVO gridFilter, List<String> masterOrgIds) {
        void var3_7;
        ArrayList arrayList = new ArrayList();
        if (this.dealCommonCondition(gridFilter, "merchantApplyRangeGroups.orgGroupId.orgGroupDetailList.orgId")) {
            void var5_11;
            Object value = this.getCommonConditionValue(gridFilter, "merchantApplyRangeGroups.orgGroupId.orgGroupDetailList.orgId");
            ArrayList<String> arrayList2 = new ArrayList<String>();
            if (value instanceof String) {
                if (!masterOrgIds.contains(value)) throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_800747);
                arrayList2.add(value.toString());
            } else if (value instanceof List) {
                List orgIdConditionList = (List)value;
                orgIdConditionList.retainAll(masterOrgIds);
                if (orgIdConditionList.isEmpty()) {
                    throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_800747);
                }
                List list = orgIdConditionList;
            }
            if (CollectionUtils.isEmpty((Collection)var5_11)) return var3_7;
            void var3_4 = var5_11;
            return var3_7;
        } else {
            List<String> list = masterOrgIds;
        }
        return var3_7;
    }

    public void merchantAddRangeCondition(RefEntity refEntity, Map<String, Object> map) {
        FilterVO gridFilter = (FilterVO)map.get("condition");
        if (gridFilter == null) {
            gridFilter = new FilterVO();
        }
        refEntity.setDatasourceType("merchantAddRange");
        gridFilter.appendCondition(ConditionOperator.and, new SimpleFilterVO[]{new SimpleFilterVO("merchantApplyRanges.isPotential", "eq", (Object)false)});
        map.put("condition", gridFilter);
    }

    public void setMerchantAddRangeRefExt(BillContext billContext, RefEntity refEntity, Map<String, Object> map) {
        if ("aa_merchant_add_range".equals(refEntity.getCode())) {
            HashMap<String, Boolean> context = new HashMap<String, Boolean>();
            context.put("modifySchema", true);
            billContext.setContext(context);
        }
    }

    public void isPartitionAbleMerchantAddRangeRef(QuerySchema schema, BillContext billContext) {
        Map extendCondition = billContext.getContext();
        if (!CollectionUtils.isEmpty((Map)extendCondition) && extendCondition.containsKey("modifySchema")) {
            schema.addJoin(new QueryJoin[]{new QueryJoin("merchantApplyRanges", "createOrg=merchantApplyRanges.orgId&&merchantApplyRanges.isPotential=0", "left join")});
        }
    }

    public void setMerchantInorganizationCondition(FilterVO gridFilter, Map<String, Object> map) {
        if (this.pubOptionService.getOrgGlobalShare("aa.merchant.Merchant").booleanValue()) {
            MerchantCommonRefUtils.ignoreOrgId((FilterVO)gridFilter, (boolean)true);
        } else if (AppContext.getCurrentUser().getUserType() == UserType.ShopAdminUser || AppContext.getCurrentUser().getUserType() == UserType.ShopUser) {
            gridFilter.appendCondition(ConditionOperator.and, new SimpleFilterVO[]{new SimpleFilterVO("merchantAppliedDetail.merchantApplyRangeId.rangeType", "eq", (Object)3)});
            gridFilter.appendCondition(ConditionOperator.and, new SimpleFilterVO[]{new SimpleFilterVO("merchantAppliedDetail.merchantApplyRangeId.orgId", "eq", AppContext.getCurrentUser().get("singleOrgId"))});
        } else {
            ArrayList<String> orgGolbalList = new ArrayList<String>();
            Set<String> orgIdList = this.orgPermissionsUtil.getOrgPermissions("aa_merchant");
            if (!CollectionUtils.isEmpty(orgIdList)) {
                Collection orgIdConditionList;
                Object value;
                if (this.dealConditionGroupChange(gridFilter.getQueryConditionGroup(), "merchantAppliedDetail.merchantApplyRangeId.orgId")) {
                    value = this.getConditionGroupChangeValue(gridFilter.getQueryConditionGroup(), "merchantAppliedDetail.merchantApplyRangeId.orgId");
                    if (value instanceof String) {
                        if (orgIdList.contains(value)) {
                            this.dealRemoveConditionGroupChange(gridFilter.getQueryConditionGroup(), "merchantAppliedDetail.merchantApplyRangeId.orgId");
                            orgGolbalList.add(value.toString());
                        }
                    } else if (value instanceof List) {
                        orgIdConditionList = (List)value;
                        orgIdConditionList.retainAll(orgIdList);
                        if (!orgIdConditionList.isEmpty()) {
                            orgGolbalList.addAll(orgIdConditionList);
                            this.dealRemoveConditionGroupChange(gridFilter.getQueryConditionGroup(), "merchantAppliedDetail.merchantApplyRangeId.orgId");
                        }
                    } else if (value instanceof String[]) {
                        orgIdConditionList = Arrays.stream((String[])value).filter(orgIdList::contains).collect(Collectors.toList());
                        if (!orgIdConditionList.isEmpty()) {
                            orgGolbalList.addAll(orgIdConditionList);
                            this.dealRemoveConditionGroupChange(gridFilter.getQueryConditionGroup(), "merchantAppliedDetail.merchantApplyRangeId.orgId");
                        }
                    } else if (value instanceof Set) {
                        orgIdConditionList = (Set)value;
                        orgIdConditionList.retainAll(orgIdList);
                        if (!orgIdConditionList.isEmpty()) {
                            orgGolbalList.addAll(orgIdConditionList);
                            this.dealRemoveConditionGroupChange(gridFilter.getQueryConditionGroup(), "merchantAppliedDetail.merchantApplyRangeId.orgId");
                        }
                    }
                } else if (this.dealSimpleVoListChange(gridFilter, "merchantAppliedDetail.merchantApplyRangeId.orgId")) {
                    value = this.getSimpleVoListChangeValue(gridFilter, "merchantAppliedDetail.merchantApplyRangeId.orgId");
                    if (value instanceof String) {
                        if (orgIdList.contains(value)) {
                            this.dealRemoveSimpleVoListChange(gridFilter, "merchantAppliedDetail.merchantApplyRangeId.orgId");
                            orgGolbalList.add(value.toString());
                        }
                    } else if (value instanceof List) {
                        orgIdConditionList = (List)value;
                        orgIdConditionList.retainAll(orgIdList);
                        if (!orgIdConditionList.isEmpty()) {
                            orgGolbalList.addAll(orgIdConditionList);
                            this.dealRemoveSimpleVoListChange(gridFilter, "merchantAppliedDetail.merchantApplyRangeId.orgId");
                        }
                    } else if (value instanceof String[]) {
                        orgIdConditionList = Arrays.stream((String[])value).filter(orgIdList::contains).collect(Collectors.toList());
                        if (!orgIdConditionList.isEmpty()) {
                            orgGolbalList.addAll(orgIdConditionList);
                            this.dealRemoveSimpleVoListChange(gridFilter, "merchantAppliedDetail.merchantApplyRangeId.orgId");
                        }
                    } else if (value instanceof Set) {
                        orgIdConditionList = (Set)value;
                        orgIdConditionList.retainAll(orgIdList);
                        if (!orgIdConditionList.isEmpty()) {
                            orgGolbalList.addAll(orgIdConditionList);
                            this.dealRemoveSimpleVoListChange(gridFilter, "merchantAppliedDetail.merchantApplyRangeId.orgId");
                        }
                    }
                } else {
                    orgGolbalList.addAll(orgIdList);
                }
                if (!CollectionUtils.isEmpty(orgGolbalList)) {
                    String queryDistinctIdSql = "(select T0.merchantId from merchantapplyrange T0 where T0.ispotential = 0 and  T0.ytenant_id ='" + AppContext.getCurrentUser().getYTenantId() + "'";
                    if (orgGolbalList.size() > 1000 && this.orgPermissionsUtil.isOracle()) {
                        StringBuilder orgGlobalPart = new StringBuilder("and ( ");
                        String queryInLimitCount = this.orgPermissionsUtil.queryInLimitCount(orgGolbalList, "T0.orgId", 1000);
                        orgGlobalPart.append(queryInLimitCount);
                        orgGlobalPart.append(")");
                        queryDistinctIdSql = queryDistinctIdSql + orgGlobalPart.toString() + ")";
                    } else {
                        String orgIdsStr = orgGolbalList.stream().map(s -> "'" + s + "'").collect(Collectors.joining(", "));
                        queryDistinctIdSql = queryDistinctIdSql + "and T0.orgId in (" + orgIdsStr + "))";
                    }
                    QueryConditionGroup sqlCondGroup = QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{new QuerySqlCondition("id", queryDistinctIdSql)});
                    QueryConditionGroup specCondition = gridFilter.getQueryConditionGroup();
                    if (null != specCondition) {
                        sqlCondGroup.appendCondition(new ConditionExpression[]{specCondition});
                    }
                    gridFilter.setQueryConditionGroup(sqlCondGroup);
                } else {
                    gridFilter.appendCondition(ConditionOperator.and, new SimpleFilterVO[]{new SimpleFilterVO("1", "eq", (Object)"2")});
                }
            }
        }
    }

    public boolean dealConditionGroupChange(QueryConditionGroup queryConditionGroup, String itemName) {
        if (queryConditionGroup != null && !queryConditionGroup.conditions().isEmpty()) {
            List expressions = queryConditionGroup.conditions();
            for (ConditionExpression expression : expressions) {
                QueryCondition condition;
                String field;
                boolean isCondition;
                if (expression instanceof QueryConditionGroup && (isCondition = this.dealConditionGroupChange((QueryConditionGroup)expression, itemName))) {
                    return true;
                }
                if (!(expression instanceof QueryCondition) || !StringUtils.hasLength((String)(field = (condition = (QueryCondition)expression).field())) || !field.contains(itemName)) continue;
                return true;
            }
        }
        return false;
    }

    public Object getConditionGroupChangeValue(QueryConditionGroup queryConditionGroup, String itemName) {
        if (queryConditionGroup != null && !queryConditionGroup.conditions().isEmpty()) {
            List expressions = queryConditionGroup.conditions();
            for (ConditionExpression expression : expressions) {
                QueryCondition condition;
                String field;
                Object value;
                if (expression instanceof QueryConditionGroup && (value = this.getConditionGroupChangeValue((QueryConditionGroup)expression, itemName)) != null) {
                    return value;
                }
                if (!(expression instanceof QueryCondition) || !StringUtils.hasLength((String)(field = (condition = (QueryCondition)expression).field())) || !field.contains(itemName)) continue;
                return condition.getV1();
            }
        }
        return null;
    }

    private void dealRemoveConditionGroupChange(QueryConditionGroup queryConditionGroup, String itemName) {
        if (queryConditionGroup != null && !queryConditionGroup.conditions().isEmpty()) {
            List expressions = queryConditionGroup.conditions();
            ArrayList<ConditionExpression> removeList = new ArrayList<ConditionExpression>();
            for (ConditionExpression expression : expressions) {
                QueryCondition condition;
                String field;
                if (expression instanceof QueryConditionGroup) {
                    this.dealRemoveConditionGroupChange((QueryConditionGroup)expression, itemName);
                }
                if (!(expression instanceof QueryCondition) || !StringUtils.hasLength((String)(field = (condition = (QueryCondition)expression).field())) || !field.contains(itemName)) continue;
                removeList.add(expression);
            }
            if (!removeList.isEmpty()) {
                expressions.removeAll(removeList);
            }
        }
    }

    public boolean dealSimpleVoListChange(FilterVO gridFilter, String itemName) {
        SimpleFilterVO[] simpleFilterVOList = gridFilter.getSimpleVOs();
        if (simpleFilterVOList != null && simpleFilterVOList.length != 0) {
            ArrayList<SimpleFilterVO> simpleFilterNewList = new ArrayList<SimpleFilterVO>(Arrays.asList(simpleFilterVOList));
            for (SimpleFilterVO simpleFilterVO : simpleFilterNewList) {
                boolean isDealSimpleVo;
                List simpleFilterVOs = simpleFilterVO.getConditions();
                if (!(!CollectionUtils.isEmpty((Collection)simpleFilterVOs) ? (isDealSimpleVo = this.dealSimpleVoListChange(simpleFilterVOs, itemName)) : simpleFilterVO.getField() != null && simpleFilterVO.getField().contains(itemName))) continue;
                return true;
            }
        }
        return false;
    }

    public boolean dealSimpleVoListChange(List<SimpleFilterVO> simpleFilterVOList, String itemName) {
        if (!CollectionUtils.isEmpty(simpleFilterVOList)) {
            for (SimpleFilterVO simpleFilter : simpleFilterVOList) {
                boolean isDealSimpleVo;
                if (null != simpleFilter.getConditions() && !simpleFilter.getConditions().isEmpty() && (isDealSimpleVo = this.dealSimpleVoListChange(simpleFilter.getConditions(), itemName))) {
                    return true;
                }
                if (simpleFilter.getField() == null || !simpleFilter.getField().contains(itemName)) continue;
                return true;
            }
        }
        return false;
    }

    public Object getSimpleVoListChangeValue(FilterVO gridFilter, String itemName) {
        SimpleFilterVO[] simpleFilterVOList = gridFilter.getSimpleVOs();
        if (simpleFilterVOList != null && simpleFilterVOList.length != 0) {
            ArrayList<SimpleFilterVO> simpleFilterNewList = new ArrayList<SimpleFilterVO>(Arrays.asList(simpleFilterVOList));
            for (SimpleFilterVO simpleFilterVO : simpleFilterNewList) {
                List simpleFilterVOs = simpleFilterVO.getConditions();
                if (!CollectionUtils.isEmpty((Collection)simpleFilterVOs)) {
                    Object value = this.getSimpleVoListChangeValue(simpleFilterVOs, itemName);
                    if (value == null) continue;
                    return value;
                }
                if (simpleFilterVO.getField() == null || !simpleFilterVO.getField().contains(itemName)) continue;
                return simpleFilterVO.getValue1();
            }
        }
        return null;
    }

    public Object getSimpleVoListChangeValue(List<SimpleFilterVO> simpleFilterVOList, String itemName) {
        if (!CollectionUtils.isEmpty(simpleFilterVOList)) {
            for (SimpleFilterVO simpleFilter : simpleFilterVOList) {
                Object value;
                if (null != simpleFilter.getConditions() && !simpleFilter.getConditions().isEmpty() && (value = this.getSimpleVoListChangeValue(simpleFilter.getConditions(), itemName)) != null) {
                    return value;
                }
                if (simpleFilter.getField() == null || !simpleFilter.getField().contains(itemName)) continue;
                return simpleFilter.getValue1();
            }
        }
        return null;
    }

    private void dealRemoveSimpleVoListChange(FilterVO gridFilter, String itemName) {
        SimpleFilterVO[] simpleFilterVOList = gridFilter.getSimpleVOs();
        if (simpleFilterVOList != null && simpleFilterVOList.length != 0) {
            ArrayList<SimpleFilterVO> simpleFilterNewList = new ArrayList<SimpleFilterVO>(Arrays.asList(simpleFilterVOList));
            Iterator simpleFilterIterator = simpleFilterNewList.iterator();
            while (simpleFilterIterator.hasNext()) {
                SimpleFilterVO simpleFilterVO = (SimpleFilterVO)simpleFilterIterator.next();
                List simpleFilterVOs = simpleFilterVO.getConditions();
                if (!CollectionUtils.isEmpty((Collection)simpleFilterVOs)) {
                    this.dealRemoveSimpleVoListChange(simpleFilterVOs, itemName);
                    continue;
                }
                if (simpleFilterVO.getField() == null || !simpleFilterVO.getField().contains(itemName)) continue;
                simpleFilterIterator.remove();
            }
            gridFilter.setSimpleVOs(simpleFilterNewList.toArray(new SimpleFilterVO[0]));
        }
    }

    private void dealRemoveSimpleVoListChange(List<SimpleFilterVO> simpleFilterVOList, String itemName) {
        if (!CollectionUtils.isEmpty(simpleFilterVOList)) {
            Iterator<SimpleFilterVO> simpleFilterVOIterator = simpleFilterVOList.iterator();
            while (simpleFilterVOIterator.hasNext()) {
                SimpleFilterVO simpleFilter = simpleFilterVOIterator.next();
                if (null != simpleFilter.getConditions() && !simpleFilter.getConditions().isEmpty()) {
                    this.dealRemoveSimpleVoListChange(simpleFilter.getConditions(), itemName);
                }
                if (simpleFilter.getField() == null || !simpleFilter.getField().contains(itemName)) continue;
                simpleFilterVOIterator.remove();
            }
        }
    }

    public void addressDeleteCondition(RefEntity refEntity, Map<String, Object> map) {
        FilterVO gridFilter = (FilterVO)map.get("condition");
        if (gridFilter == null) {
            gridFilter = new FilterVO();
        } else if (!this.dealConditionGroupChange(gridFilter.getQueryConditionGroup(), "merchantId") && !this.dealSimpleVoListChange(gridFilter, "merchantId")) {
            throw new CoreDocBusinessException(CoreDocBusinessErrorEnum.MERCHANT_CHILD_DELETE_REF);
        }
        map.put("condition", gridFilter);
    }

    public void merchantSaleAreaCondition(RefEntity refEntity, Map<String, Object> map) {
        FilterVO gridFilter = (FilterVO)map.get("condition");
        if (gridFilter == null) {
            gridFilter = new FilterVO();
        } else {
            if (!this.dealConditionGroupChange(gridFilter.getQueryConditionGroup(), "merchantId") && !this.dealSimpleVoListChange(gridFilter, "merchantId")) {
                throw new CoreDocBusinessException(CoreDocBusinessErrorEnum.MERCHANT_CHILD_DELETE_REF);
            }
            if (!this.dealConditionGroupChange(gridFilter.getQueryConditionGroup(), "merchantApplyRangeId") && !this.dealSimpleVoListChange(gridFilter, "merchantApplyRangeId")) {
                throw new CoreDocBusinessException(CoreDocBusinessErrorEnum.MERCHANT_CHILD_DELETE_REF);
            }
        }
        map.put("condition", gridFilter);
    }
}


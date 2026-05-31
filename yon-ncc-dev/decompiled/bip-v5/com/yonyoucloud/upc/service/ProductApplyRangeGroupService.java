/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.yonyou.diwork.ott.exexutors.RobotExecutors
 *  com.yonyou.iuap.apdoc.coredoc.config.YMSParamConfig
 *  com.yonyou.iuap.apdoc.coredoc.po.material.MaterialApplyRangeGroupPO
 *  com.yonyou.iuap.apdoc.coredoc.service.pub.CoredocPubService
 *  com.yonyou.iuap.apdoc.coredoc.utils.DocCollectionUtil
 *  com.yonyou.iuap.apdoc.coredoc.utils.ListSplitUtil
 *  com.yonyou.iuap.basedoc.mc.service.GroupService
 *  com.yonyou.iuap.yms.api.IYmsJdbcApi
 *  com.yonyou.iuap.yms.api.YmsJdbcApiProvider
 *  com.yonyou.iuap.yms.factory.YmsJdbcApiProviderFactory
 *  com.yonyou.iuap.yms.param.BaseEntity
 *  com.yonyou.iuap.yms.param.ResultSetProcessor
 *  com.yonyou.iuap.yms.processor.ArrayListProcessor
 *  com.yonyou.iuap.yms.processor.MapListProcessor
 *  com.yonyou.ucf.mdd.ext.base.tenant.Tenant
 *  com.yonyou.ucf.mdd.ext.dao.meta.MetaDaoHelper
 *  com.yonyou.ucf.mdd.ext.dao.sql.SqlHelper
 *  com.yonyoucloud.iuap.upc.api.ISkuServiceV2
 *  com.yonyoucloud.iuap.upc.dto.ProductSkuDTO
 *  com.yonyoucloud.upc.pc.org.PubOrgGroup
 *  com.yonyoucloud.upc.pc.org.PubOrgGroupDetail
 *  com.yonyoucloud.upc.pc.product.ProductApplyRange
 *  com.yonyoucloud.upc.pc.product.ProductApplyRangeGroup
 *  com.yonyoucloud.upc.pc.product.ProductSKU
 *  com.yonyoucloud.upc.utils.UpcStringUtil
 *  iuap.yms.thread.api.YmsExecutors
 *  org.apache.commons.lang3.StringUtils
 *  org.imeta.orm.base.BizObject
 *  org.imeta.orm.base.EntityStatus
 *  org.imeta.orm.schema.ConditionExpression
 *  org.imeta.orm.schema.QueryCondition
 *  org.imeta.orm.schema.QueryConditionGroup
 *  org.imeta.orm.schema.QuerySchema
 *  org.imeta.spring.support.id.IdManager
 *  org.jetbrains.annotations.Nullable
 *  org.slf4j.Logger
 *  org.slf4j.LoggerFactory
 *  org.springframework.beans.BeanUtils
 *  org.springframework.beans.factory.annotation.Autowired
 *  org.springframework.stereotype.Service
 *  org.springframework.transaction.annotation.Propagation
 *  org.springframework.transaction.annotation.Transactional
 *  org.springframework.util.CollectionUtils
 */
package com.yonyoucloud.upc.service;

import com.yonyou.diwork.ott.exexutors.RobotExecutors;
import com.yonyou.iuap.apdoc.coredoc.config.YMSParamConfig;
import com.yonyou.iuap.apdoc.coredoc.po.material.MaterialApplyRangeGroupPO;
import com.yonyou.iuap.apdoc.coredoc.service.pub.CoredocPubService;
import com.yonyou.iuap.apdoc.coredoc.utils.DocCollectionUtil;
import com.yonyou.iuap.apdoc.coredoc.utils.ListSplitUtil;
import com.yonyou.iuap.basedoc.mc.service.GroupService;
import com.yonyou.iuap.yms.api.IYmsJdbcApi;
import com.yonyou.iuap.yms.api.YmsJdbcApiProvider;
import com.yonyou.iuap.yms.factory.YmsJdbcApiProviderFactory;
import com.yonyou.iuap.yms.param.BaseEntity;
import com.yonyou.iuap.yms.param.ResultSetProcessor;
import com.yonyou.iuap.yms.processor.ArrayListProcessor;
import com.yonyou.iuap.yms.processor.MapListProcessor;
import com.yonyou.ucf.mdd.ext.base.tenant.Tenant;
import com.yonyou.ucf.mdd.ext.dao.meta.MetaDaoHelper;
import com.yonyou.ucf.mdd.ext.dao.sql.SqlHelper;
import com.yonyoucloud.iuap.upc.api.ISkuServiceV2;
import com.yonyoucloud.iuap.upc.dto.ProductSkuDTO;
import com.yonyoucloud.upc.pc.org.PubOrgGroup;
import com.yonyoucloud.upc.pc.org.PubOrgGroupDetail;
import com.yonyoucloud.upc.pc.product.ProductApplyRange;
import com.yonyoucloud.upc.pc.product.ProductApplyRangeGroup;
import com.yonyoucloud.upc.pc.product.ProductSKU;
import com.yonyoucloud.upc.utils.UpcStringUtil;
import iuap.yms.thread.api.YmsExecutors;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.function.Supplier;
import java.util.stream.Collectors;
import org.apache.commons.lang3.StringUtils;
import org.imeta.orm.base.BizObject;
import org.imeta.orm.base.EntityStatus;
import org.imeta.orm.schema.ConditionExpression;
import org.imeta.orm.schema.QueryCondition;
import org.imeta.orm.schema.QueryConditionGroup;
import org.imeta.orm.schema.QuerySchema;
import org.imeta.spring.support.id.IdManager;
import org.jetbrains.annotations.Nullable;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.util.CollectionUtils;

@Service
public class ProductApplyRangeGroupService {
    @Autowired
    GroupService groupService;
    @Autowired
    private YMSParamConfig ymsParamConfig;
    @Autowired
    private ISkuServiceV2 skuService;
    @Autowired
    private CoredocPubService coredocPubService;
    private Logger logger = LoggerFactory.getLogger(ProductApplyRangeGroupService.class);

    public void dealProductApplyRangeGroup(List<Long> productIds, List<PubOrgGroupDetail> pubOrgGroupDetailParamList) throws Exception {
        QueryConditionGroup productRangeGroupCondition = QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"productId").in(productIds), QueryCondition.name((String)"orgGroupType").eq((Object)"0")});
        QuerySchema productRangeGroupSchema = QuerySchema.create().addSelect("id,orgGroupId,productId").addCondition((ConditionExpression)productRangeGroupCondition);
        List originalProductApplyRangeGroupList = MetaDaoHelper.queryObject((String)"pc.product.ProductApplyRangeGroup", (QuerySchema)productRangeGroupSchema, null);
        if (CollectionUtils.isEmpty((Collection)originalProductApplyRangeGroupList)) {
            return;
        }
        List orgGroupIdList = originalProductApplyRangeGroupList.stream().map(ProductApplyRangeGroup::getOrgGroupId).collect(Collectors.toList());
        QueryConditionGroup condition = QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"groupId").in(orgGroupIdList)});
        QuerySchema schema = QuerySchema.create().addSelect("id,orgType,orgId,groupId").addCondition((ConditionExpression)condition);
        List originalPubOrgGroupDetailMapList = MetaDaoHelper.query((String)"pc.pub_org_group.PubOrgGroupDetail", (QuerySchema)schema);
        ArrayList originalPubOrgGroupDetailList = new ArrayList();
        originalPubOrgGroupDetailMapList.forEach(a -> {
            PubOrgGroupDetail pubOrgGroupDetail = new PubOrgGroupDetail();
            pubOrgGroupDetail.setOrgId(a.get("orgId") == null ? "" : a.get("orgId").toString());
            pubOrgGroupDetail.setGroupId(a.get("groupId") == null ? "" : a.get("groupId").toString());
            pubOrgGroupDetail.setOrgType(a.get("orgType") == null ? "" : a.get("orgType").toString());
            originalPubOrgGroupDetailList.add(pubOrgGroupDetail);
        });
        QueryConditionGroup userProductRangeGroupCondition = QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"productId").in(productIds), QueryCondition.name((String)"orgGroupType").eq((Object)"1")});
        QuerySchema userProductRangeGroupSchema = QuerySchema.create().addSelect("id,productId,orgGroupId.orgGroupDetailList.orgId as orgId").addCondition((ConditionExpression)userProductRangeGroupCondition);
        List userProductRangeGroupList = MetaDaoHelper.query((String)"pc.product.ProductApplyRangeGroup", (QuerySchema)userProductRangeGroupSchema);
        Map<Object, Object> userProductRangeGroupListMap = new HashMap();
        if (!CollectionUtils.isEmpty((Collection)userProductRangeGroupList)) {
            userProductRangeGroupListMap = userProductRangeGroupList.stream().collect(Collectors.groupingBy(a -> a.get("productId").toString()));
        }
        Map<String, List<PubOrgGroupDetail>> originalPubOrgGroupDetailMap = originalPubOrgGroupDetailList.stream().collect(Collectors.groupingBy(PubOrgGroupDetail::getGroupId));
        for (ProductApplyRangeGroup productApplyRangeGroup : originalProductApplyRangeGroupList) {
            List userProductRangeGroup;
            ArrayList<PubOrgGroupDetail> pubOrgGroupDetailList = new ArrayList<PubOrgGroupDetail>((Collection)originalPubOrgGroupDetailMap.get(productApplyRangeGroup.getOrgGroupId()));
            ArrayList userProductApplyRangeGroup = new ArrayList();
            if (!CollectionUtils.isEmpty(userProductRangeGroupListMap) && !CollectionUtils.isEmpty((Collection)(userProductRangeGroup = (List)userProductRangeGroupListMap.get(String.valueOf(productApplyRangeGroup.getProductId()))))) {
                userProductApplyRangeGroup = new ArrayList(userProductRangeGroup);
            }
            List<Object> userPubOrgList = new ArrayList();
            if (!CollectionUtils.isEmpty(userProductApplyRangeGroup)) {
                userPubOrgList = userProductApplyRangeGroup.stream().map(b -> b.get("orgId").toString()).collect(Collectors.toList());
            }
            List originalPubOrgList = pubOrgGroupDetailList.stream().map(PubOrgGroupDetail::getOrgId).collect(Collectors.toList());
            List pubOrgGroupDetailParamForAddList = pubOrgGroupDetailParamList.stream().filter(b -> !originalPubOrgList.contains(b.getOrgId())).collect(Collectors.toList());
            for (PubOrgGroupDetail pubOrgGroupDetailParam : pubOrgGroupDetailParamForAddList) {
                if (userPubOrgList.contains(pubOrgGroupDetailParam.getOrgId())) continue;
                PubOrgGroupDetail pubOrgGroupDetail = new PubOrgGroupDetail();
                pubOrgGroupDetail.setOrgId(pubOrgGroupDetailParam.getOrgId());
                pubOrgGroupDetail.setOrgType(pubOrgGroupDetailParam.getOrgType());
                pubOrgGroupDetailList.add(pubOrgGroupDetail);
            }
            PubOrgGroup pubOrgGroup = new PubOrgGroup();
            pubOrgGroup.setOrgGroupDetailList(pubOrgGroupDetailList);
            pubOrgGroup.setOrgGroupType("0");
            String groupId = this.groupService.saveGroup((Map)pubOrgGroup, "pc.pub_org_group.PubOrgGroup");
            productApplyRangeGroup.setOrgGroupId(groupId);
            productApplyRangeGroup.setEntityStatus(EntityStatus.Update);
        }
        MetaDaoHelper.update((String)"pc.product.ProductApplyRangeGroup", (List)originalProductApplyRangeGroupList);
    }

    public void dataUpgradeByTenantAndIdList(Long tenantId, List<Long> productIdList) throws Exception {
        Long endTenantId = tenantId + 1L;
        YmsJdbcApiProvider ymsJdbcApiProvider = YmsJdbcApiProviderFactory.getYmsJdbcApiProvider();
        Supplier federalYmsJdbcApi = ymsJdbcApiProvider.getFederalYmsJdbcApi("iuap-apdoc-material_main_dataSource");
        List iYmsJdbcApis = (List)federalYmsJdbcApi.get();
        for (IYmsJdbcApi ymsJdbcApi : iYmsJdbcApis) {
            List tenantList = this.coredocPubService.listAllTenantsBySQL(ymsJdbcApi, this.coredocPubService.listQueryTenantSQL(tenantId, endTenantId));
            if (tenantList == null) continue;
            String yTenantId = ((Tenant)tenantList.get(0)).getYTenantId() == null || "~".equals(((Tenant)tenantList.get(0)).getYTenantId()) ? ((Tenant)tenantList.get(0)).getTenantCenter() : ((Tenant)tenantList.get(0)).getYTenantId();
            RobotExecutors.runAs((String)yTenantId, () -> {
                HashMap<String, Object> deleteRangeGroupParam = new HashMap<String, Object>();
                deleteRangeGroupParam.put("ytenant", ((Tenant)tenantList.get(0)).getYTenantId() == null ? ((Tenant)tenantList.get(0)).getTenantCenter() : ((Tenant)tenantList.get(0)).getYTenantId());
                deleteRangeGroupParam.put("productIdList", productIdList);
                try {
                    SqlHelper.delete((String)"com.yonyoucloud.upc.data.ProductDoubleWriteDao.deleteProductApplyRangeGroupByTenantId", deleteRangeGroupParam);
                }
                catch (Exception e) {
                    throw new RuntimeException(e);
                }
            });
            this.dealOldRangeToNew(productIdList, (Tenant)tenantList.get(0));
        }
    }

    public void rangeGroupDataUpgradeByTenantIdList(Set<Long> tenantIdList, int capacity) {
        if (CollectionUtils.isEmpty(tenantIdList)) {
            return;
        }
        String tenantIds = StringUtils.join(tenantIdList, (String)",");
        String queryTenantSQL = "select id,tenantcenter_id,ytenant_id from tenant where id in (" + tenantIds + ")";
        this.rangeGroupDataUpgrade(queryTenantSQL, capacity);
    }

    private void rangeGroupDataUpgrade(String queryTenantSQL, int capacity) {
        YmsJdbcApiProvider ymsJdbcApiProvider = YmsJdbcApiProviderFactory.getYmsJdbcApiProvider();
        Supplier federalYmsJdbcApi = ymsJdbcApiProvider.getFederalYmsJdbcApi("iuap-apdoc-material_main_dataSource");
        List iYmsJdbcApis = (List)federalYmsJdbcApi.get();
        for (IYmsJdbcApi ymsJdbcApi : iYmsJdbcApis) {
            List tenantList = this.coredocPubService.listAllTenantsBySQL(ymsJdbcApi, queryTenantSQL);
            if (tenantList == null) continue;
            this.applyRangeGroupDataUpgradeFromOld(ymsJdbcApi, tenantList, capacity);
        }
    }

    public void applyRangeGroupDataUpgradeFromOld(IYmsJdbcApi ymsJdbcApi, List<Tenant> tenantList, int capacity) {
        try {
            if (CollectionUtils.isEmpty(tenantList)) {
                String sql = "select id,tenantcenter_id,ytenant_id from tenant";
                HashMap<String, Object> params = new HashMap<String, Object>();
                params.put("sql", sql);
                if (ymsJdbcApi != null) {
                    List tenantMapList = SqlHelper.selectList((String)"com.yonyou.ucf.mdd.ext.meta.dao.selectList", params);
                    for (Map tenantMap : tenantMapList) {
                        Tenant tenant = new Tenant();
                        tenant.setId(tenantMap.get("id"));
                        tenant.setTenantCenter(tenantMap.get("tenantcenter_id") == null ? "" : tenantMap.get("tenantcenter_id").toString());
                        tenant.setYTenantId(tenantMap.get("ytenant_id") == null ? "" : tenantMap.get("ytenant_id").toString());
                        tenantList.add(tenant);
                    }
                } else {
                    tenantList = this.coredocPubService.listAllTenantsBySQL(ymsJdbcApi, sql);
                }
            }
            for (Tenant tenant : tenantList) {
                try {
                    HashMap<String, Number> tenantIdParamMap = new HashMap<String, Number>();
                    String ytenantId = tenant.getYTenantId() == null ? tenant.getTenantCenter() : tenant.getYTenantId();
                    String countSQL = "select count(1) as countNum from product  where ytenant_id = '" + ytenantId + "'";
                    List countObj = ymsJdbcApi.queryForList(countSQL, (ResultSetProcessor)new ArrayListProcessor());
                    ArrayList productIdList = new ArrayList();
                    if (countObj == null || Integer.parseInt(countObj.get(0).toString()) <= 0) continue;
                    Long currentProductId = 0L;
                    int realMaxRowsValue = this.ymsParamConfig.getResultMaxRowsValue() - 1;
                    tenantIdParamMap.put("id", currentProductId);
                    tenantIdParamMap.put("maxRowsValue", realMaxRowsValue);
                    String queryIdSQLTemplate = " select id from product where ytenant_id = '%s' and id > %d order by id limit  %d";
                    String queryIdSQL = String.format(queryIdSQLTemplate, ytenantId, currentProductId, realMaxRowsValue);
                    List productIdListTemp = ymsJdbcApi.queryForList(queryIdSQL, (ResultSetProcessor)new ArrayListProcessor());
                    productIdList.addAll(productIdListTemp);
                    while (productIdListTemp.size() >= realMaxRowsValue) {
                        Long productNewMinId = (Long)productIdListTemp.get(productIdListTemp.size() - 1);
                        tenantIdParamMap.put("id", productNewMinId);
                        queryIdSQL = String.format(queryIdSQLTemplate, ytenantId, productNewMinId, realMaxRowsValue);
                        productIdListTemp = ymsJdbcApi.queryForList(queryIdSQL, (ResultSetProcessor)new ArrayListProcessor());
                        productIdList.addAll(productIdListTemp);
                    }
                    String deleteSQL = String.format(" ytenant_id = '%s' and product_Id in (%s)", ytenantId, DocCollectionUtil.concat(productIdList, (String)","));
                    ymsJdbcApi.removeByClause((BaseEntity)new MaterialApplyRangeGroupPO(), deleteSQL, false);
                    List productIdSplitList = ListSplitUtil.splitListByCapacity(productIdList, (int)capacity);
                    for (List limitProductIdList : productIdSplitList) {
                        this.dealOldRangeToNew(limitProductIdList, tenant);
                    }
                    this.logger.error("\u79df\u6237" + tenant.getId() + "\u7269\u6599\u65b0\u9002\u7528\u8303\u56f4\u6570\u636e\u5347\u7ea7\u5b8c\u6210" + LocalDateTime.now());
                }
                catch (Exception ignored) {
                    this.logger.error("\u79df\u6237" + tenant.getId() + "\u7269\u6599\u65b0\u9002\u7528\u8303\u56f4\u6570\u636e\u5347\u7ea7\u5f02\u5e38" + LocalDateTime.now() + ignored.getMessage(), (Throwable)ignored);
                }
            }
        }
        catch (Exception e) {
            this.logger.error("\u7269\u6599\u65b0\u9002\u7528\u8303\u56f4\u6570\u636e\u5347\u7ea7\u5f02\u5e38" + e.getMessage(), (Throwable)e);
        }
        this.logger.error("\u7269\u6599\u65b0\u9002\u7528\u8303\u56f4\u6570\u636e\u5168\u91cf\u6570\u636e\u5347\u7ea7\u5b8c\u6210" + LocalDateTime.now());
    }

    public void productUpgradeSkuMd5(Long beginTenantId, Long endTenantId, int capacity) {
        this.upgradeSkuMd5(this.coredocPubService.listQueryTenantSQL(beginTenantId, endTenantId), capacity);
    }

    private void upgradeSkuMd5(String selectSQL, int capacity) {
        YmsJdbcApiProvider ymsJdbcApiProvider = YmsJdbcApiProviderFactory.getYmsJdbcApiProvider();
        Supplier federalYmsJdbcApi = ymsJdbcApiProvider.getFederalYmsJdbcApi("iuap-apdoc-material_main_dataSource");
        List iYmsJdbcApis = (List)federalYmsJdbcApi.get();
        for (IYmsJdbcApi ymsJdbcApi : iYmsJdbcApis) {
            List<Tenant> tenantList = ProductApplyRangeGroupService.getTenants(ymsJdbcApi, selectSQL);
            if (tenantList == null) continue;
            this.upgradeSkuMd5(tenantList, capacity);
        }
    }

    @Nullable
    public static List<Tenant> getTenants(IYmsJdbcApi ymsJdbcApi, String selectTenantSQL) {
        ArrayList<Tenant> tenantList = null;
        List tenantMapList = ymsJdbcApi.queryForList(selectTenantSQL, (ResultSetProcessor)new MapListProcessor());
        if (!CollectionUtils.isEmpty((Collection)tenantMapList)) {
            tenantList = new ArrayList<Tenant>();
            for (Map tenantMap : tenantMapList) {
                Tenant tenant = new Tenant();
                tenant.setId(tenantMap.get("id"));
                tenant.setTenantCenter(tenantMap.get("tenantcenter_id") == null ? "" : tenantMap.get("tenantcenter_id").toString());
                tenant.setYTenantId(tenantMap.get("ytenant_id") == null ? "" : tenantMap.get("ytenant_id").toString());
                tenantList.add(tenant);
            }
        }
        return tenantList;
    }

    private void upgradeSkuMd5(List<Tenant> tenantList, int capacity) {
        AtomicInteger totalCount;
        block6: {
            totalCount = new AtomicInteger();
            try {
                if (!CollectionUtils.isEmpty(tenantList)) {
                    for (Tenant tenant : tenantList) {
                        AtomicInteger tenantCount = new AtomicInteger();
                        try {
                            RobotExecutors.runAs((String)tenant.getYTenantId(), () -> {
                                try {
                                    tenantCount.set(this.upgradeSkuMd5(tenant, capacity));
                                }
                                catch (Exception e) {
                                    this.logger.error("\u79df\u6237" + tenant.getId() + "\u66f4\u65b0SKU\u7684MD5\u503c\u5347\u7ea7\u5f02\u5e38" + LocalDateTime.now() + e.getMessage());
                                }
                            }, (ExecutorService)YmsExecutors.getYmsExecutor());
                        }
                        catch (Exception ignored) {
                            this.logger.error("\u79df\u6237" + tenant.getId() + "\u66f4\u65b0SKU\u7684MD5\u503c\u5347\u7ea7\u5f02\u5e38" + LocalDateTime.now() + ignored.getMessage(), (Throwable)ignored);
                        }
                        totalCount.addAndGet(tenantCount.intValue());
                    }
                    break block6;
                }
                this.logger.error("\u66f4\u65b0SKU\u7684MD5\u503c\u5f02\u5e38\uff0c\u672a\u67e5\u8be2\u5230\u9700\u8981\u5347\u7ea7\u7684\u79df\u6237\u6570\u636e");
            }
            catch (Exception e) {
                this.logger.error("\u66f4\u65b0SKU\u7684MD5\u503c\u5f02\u5e38" + e.getMessage(), (Throwable)e);
            }
        }
        this.logger.error(String.format("\u66f4\u65b0SKU\u7684MD5\u503c\u5347\u7ea7\u5b8c\u6210\uff0c\u5171\u8ba1\u5347\u7ea7\u6570\u636e\u3010%d\u3011\u6761", totalCount) + LocalDateTime.now());
    }

    private int upgradeSkuMd5(Tenant tenant, int capacity) throws Exception {
        int tenantCount = 0;
        HashMap<String, Object> tenantIdParamMap = new HashMap<String, Object>(4);
        tenantIdParamMap.put("ytenant", tenant.getYTenantId() == null ? tenant.getTenantCenter() : tenant.getYTenantId());
        Object productCount = SqlHelper.selectOne((String)"com.yonyoucloud.upc.data.ProductDoubleWriteDao.selectProductCountByTenantId", tenantIdParamMap);
        ArrayList<Long> productIdList = new ArrayList<Long>();
        if (productCount != null && Integer.parseInt(productCount.toString()) > 0) {
            List<List<Long>> productIdSplitList = this.getProductIdPageList(capacity, tenantIdParamMap, productIdList);
            for (List<Long> limitProductIdList : productIdSplitList) {
                int updateCount = this.updateSkuMd5(limitProductIdList);
                tenantCount += updateCount;
            }
            this.logger.error(String.format("\u79df\u6237\u3010%s\u3011\u66f4\u65b0SKU\u7684MD5\u503c\u5347\u7ea7\u5b8c\u6210\uff0c\u5171\u8ba1\u5347\u7ea7\u6570\u636e\u3010%d\u3011\u6761\uff0c", tenant.getId().toString(), tenantCount) + LocalDateTime.now());
        }
        return tenantCount;
    }

    private List<List<Long>> getProductIdPageList(int capacity, Map<String, Object> tenantIdParamMap, List<Long> productIdList) throws Exception {
        Long currentProductId = 0L;
        int realMaxRowsValue = this.ymsParamConfig.getResultMaxRowsValue() - 1;
        tenantIdParamMap.put("id", currentProductId);
        tenantIdParamMap.put("maxRowsValue", realMaxRowsValue);
        List productIdListTemp = SqlHelper.selectList((String)"com.yonyoucloud.upc.data.ProductDoubleWriteDao.selectProductIdListByTenantIdAndMinId", tenantIdParamMap);
        productIdList.addAll(productIdListTemp);
        while (productIdListTemp.size() >= realMaxRowsValue) {
            Long productNewMinId = (Long)productIdListTemp.get(productIdListTemp.size() - 1);
            tenantIdParamMap.put("id", productNewMinId);
            productIdListTemp = SqlHelper.selectList((String)"com.yonyoucloud.upc.data.ProductDoubleWriteDao.selectProductIdListByTenantIdAndMinId", tenantIdParamMap);
            productIdList.addAll(productIdListTemp);
        }
        List productIdSplitList = ListSplitUtil.splitListByCapacity(productIdList, (int)capacity);
        return productIdSplitList;
    }

    public Integer updateSkuMd5(List<Long> productIdList) throws Exception {
        int updateCount = 0;
        List skuDTOList = this.skuService.listSkuByProductIds(productIdList, new String[]{"id", "productId", "specIds"});
        if (skuDTOList != null && skuDTOList.size() > 0) {
            ArrayList<ProductSKU> productSKUList = new ArrayList<ProductSKU>();
            for (ProductSkuDTO productSkuDTO : skuDTOList) {
                if (null == productSkuDTO.getSpecIds()) continue;
                String[] idsArray = productSkuDTO.getSpecIds().split(";");
                ArrayList<String> idList = new ArrayList<String>(Arrays.asList(idsArray));
                idList.add(productSkuDTO.getProductId().toString());
                String md5 = UpcStringUtil.sortStrMd5(idList);
                ProductSKU productSKU = new ProductSKU();
                productSKU.setId((Object)productSkuDTO.getId());
                productSKU.setFreeValueIds(productSkuDTO.getSpecIds());
                productSKU.setFreeValueIdsMd5(md5);
                productSKU.setEntityStatus(EntityStatus.Update);
                productSKUList.add(productSKU);
                ++updateCount;
            }
            MetaDaoHelper.update((String)"pc.product.ProductSKU", productSKUList);
        }
        return updateCount;
    }

    @Transactional(rollbackFor={Throwable.class}, propagation=Propagation.REQUIRES_NEW)
    public void dealOldRangeToNewWithDelete(List<Long> productIdList, Tenant tenant) throws Exception {
        HashMap<String, Object> deleteRangeGroupParam = new HashMap<String, Object>();
        deleteRangeGroupParam.put("ytenant", tenant.getYTenantId());
        deleteRangeGroupParam.put("productIdList", productIdList);
        SqlHelper.delete((String)"com.yonyoucloud.upc.data.ProductDoubleWriteDao.deleteProductApplyRangeGroupByTenantId", deleteRangeGroupParam);
        this.dealOldRangeToNew(productIdList, tenant);
    }

    public void dealOldRangeToNew(List<Long> productIdList, Tenant tenant) throws Exception {
        String yTenantId = tenant.getYTenantId() == null || "~".equals(tenant.getYTenantId()) ? tenant.getTenantCenter() : tenant.getYTenantId();
        RobotExecutors.runAs((String)yTenantId, () -> {
            try {
                QueryConditionGroup condition = QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"ytenant").eq((Object)(tenant.getYTenantId() == null ? tenant.getTenantCenter() : tenant.getYTenantId())), QueryCondition.name((String)"productId").in((Collection)productIdList)});
                QuerySchema schema = QuerySchema.create().addSelect("id,productId,rangeType,orgId,isCreator,isApplied,productDetailId,pubts,controlRuleVersion").addCondition((ConditionExpression)condition);
                schema.setPartitionable(false);
                List productApplyRangeMapList = MetaDaoHelper.query((String)"pc.product.ProductApplyRange", (QuerySchema)schema, null);
                List<ProductApplyRange> productApplyRangeList = new ArrayList<ProductApplyRange>();
                for (Map productApplyRangeMap : productApplyRangeMapList) {
                    ProductApplyRange productApplyRange2 = new ProductApplyRange();
                    productApplyRange2.putAll(productApplyRangeMap);
                    productApplyRangeList.add(productApplyRange2);
                }
                productApplyRangeList = this.dealRepeatOldRangeData(productApplyRangeList, productIdList, (Long)tenant.getId(), tenant.getYTenantId());
                Map<Long, List<ProductApplyRange>> productApplyRangeListMap = productApplyRangeList.stream().collect(Collectors.groupingBy(ProductApplyRange::getProductId));
                ArrayList<ProductApplyRangeGroup> productApplyRangeGroupInsertList = new ArrayList<ProductApplyRangeGroup>();
                for (Map.Entry<Long, List<ProductApplyRange>> entry : productApplyRangeListMap.entrySet()) {
                    List<ProductApplyRange> rangeList = entry.getValue();
                    Map<Integer, List<ProductApplyRange>> rangeControlRuleVersionMap = rangeList.stream().filter(productApplyRange -> null != productApplyRange.getControlRuleVersion() && (null == productApplyRange.getIsApplied() || productApplyRange.getIsApplied() == false)).collect(Collectors.groupingBy(ProductApplyRange::getControlRuleVersion));
                    if (null != rangeControlRuleVersionMap) {
                        for (Map.Entry<Integer, List<ProductApplyRange>> versionEntry : rangeControlRuleVersionMap.entrySet()) {
                            ArrayList sharePubOrgGroupDetailList = new ArrayList();
                            ProductApplyRange productApplyRangeForShare = null;
                            List<ProductApplyRange> controlRuleVersionRangeList = versionEntry.getValue();
                            for (ProductApplyRange productApplyRange3 : controlRuleVersionRangeList) {
                                PubOrgGroupDetail pubOrgGroupDetail = new PubOrgGroupDetail();
                                pubOrgGroupDetail.setOrgId(productApplyRange3.getOrgId() == null ? "" : productApplyRange3.getOrgId());
                                pubOrgGroupDetail.setOrgType(productApplyRange3.getRangeType() == null ? "" : String.valueOf(productApplyRange3.getRangeType()));
                                pubOrgGroupDetail.setTenant((Long)tenant.getId());
                                pubOrgGroupDetail.setYtenant(yTenantId);
                                productApplyRange3.put("yTenantId", (Object)yTenantId);
                                productApplyRange3.setTenant((Long)tenant.getId());
                                if (productApplyRangeForShare == null) {
                                    productApplyRangeForShare = productApplyRange3;
                                }
                                sharePubOrgGroupDetailList.add(pubOrgGroupDetail);
                            }
                            ProductApplyRangeGroup productApplyRangeGroup = this.generateApplyRangeGroupFromOldRange(productApplyRangeForShare, sharePubOrgGroupDetailList, "2");
                            productApplyRangeGroup.setControlRuleVersion(versionEntry.getKey());
                            productApplyRangeGroupInsertList.add(productApplyRangeGroup);
                        }
                    }
                    ArrayList<PubOrgGroupDetail> originalPubOrgGroupDetailList = new ArrayList<PubOrgGroupDetail>();
                    ProductApplyRange productApplyRangeForOriginal = null;
                    for (ProductApplyRange productApplyRange4 : rangeList) {
                        PubOrgGroupDetail pubOrgGroupDetail = new PubOrgGroupDetail();
                        pubOrgGroupDetail.setOrgId(productApplyRange4.getOrgId() == null ? "" : productApplyRange4.getOrgId());
                        pubOrgGroupDetail.setOrgType(productApplyRange4.getRangeType() == null ? "" : String.valueOf(productApplyRange4.getRangeType()));
                        pubOrgGroupDetail.setTenant((Long)tenant.getId());
                        pubOrgGroupDetail.setYtenant(yTenantId);
                        productApplyRange4.put("yTenantId", (Object)yTenantId);
                        productApplyRange4.setTenant((Long)tenant.getId());
                        if (productApplyRange4.getIsCreator().equals(Boolean.FALSE) && productApplyRange4.getIsApplied().equals(Boolean.TRUE)) {
                            ArrayList<PubOrgGroupDetail> userPubOrgGroupDetailList = new ArrayList<PubOrgGroupDetail>();
                            userPubOrgGroupDetailList.add(pubOrgGroupDetail);
                            ProductApplyRangeGroup productApplyRangeGroup = this.generateApplyRangeGroupFromOldRange(productApplyRange4, userPubOrgGroupDetailList, "1");
                            productApplyRangeGroupInsertList.add(productApplyRangeGroup);
                            continue;
                        }
                        if (!productApplyRange4.getIsCreator().equals(Boolean.TRUE) && null != productApplyRange4.getControlRuleVersion()) continue;
                        if (productApplyRangeForOriginal == null) {
                            productApplyRangeForOriginal = productApplyRange4;
                        }
                        originalPubOrgGroupDetailList.add(pubOrgGroupDetail);
                    }
                    ProductApplyRangeGroup productApplyRangeGroup = this.generateApplyRangeGroupFromOldRange(productApplyRangeForOriginal, originalPubOrgGroupDetailList, "0");
                    productApplyRangeGroupInsertList.add(productApplyRangeGroup);
                }
                MetaDaoHelper.insertNoPartition((String)"pc.product.ProductApplyRangeGroup", productApplyRangeGroupInsertList);
            }
            catch (Exception e) {
                throw new RuntimeException(e);
            }
        });
    }

    private ProductApplyRangeGroup generateApplyRangeGroupFromOldRange(ProductApplyRange productApplyRange, List<PubOrgGroupDetail> pubOrgGroupDetailList, String groupType) {
        PubOrgGroup pubOrgGroup = new PubOrgGroup();
        pubOrgGroup.setOrgGroupDetailList(pubOrgGroupDetailList);
        pubOrgGroup.setOrgGroupType(groupType);
        pubOrgGroup.setTenant(productApplyRange.getTenant());
        pubOrgGroup.setYtenant((String)productApplyRange.get("yTenantId"));
        String groupId = this.groupService.saveGroup((Map)pubOrgGroup, "pc.pub_org_group.PubOrgGroup");
        ProductApplyRangeGroup productApplyRangeGroup = new ProductApplyRangeGroup();
        BeanUtils.copyProperties((Object)productApplyRange, (Object)productApplyRangeGroup);
        productApplyRangeGroup.put("yTenantId", productApplyRange.get("yTenantId"));
        productApplyRangeGroup.put("ytenant", productApplyRange.get("yTenantId"));
        productApplyRangeGroup.remove("pubts");
        productApplyRangeGroup.setOrgGroupId(groupId);
        productApplyRangeGroup.setOrgGroupType(groupType);
        productApplyRangeGroup.setId((Object)IdManager.getInstance().nextId());
        productApplyRangeGroup.setEntityStatus(EntityStatus.Insert);
        return productApplyRangeGroup;
    }

    private List<ProductApplyRange> dealRepeatOldRangeData(List<ProductApplyRange> productApplyRangeList, List<Long> productIdList, Long tenantId, String yTenantId) throws Exception {
        HashMap<String, Object> queryRangeParamMap = new HashMap<String, Object>();
        queryRangeParamMap.put("ytenant", yTenantId);
        queryRangeParamMap.put("productIdList", productIdList);
        ArrayList<ProductApplyRange> noRepeatList = new ArrayList<ProductApplyRange>();
        ArrayList<ProductApplyRange> repeatList = new ArrayList<ProductApplyRange>();
        ArrayList forDeleteList = new ArrayList();
        List repeatOldRange = SqlHelper.selectList((String)"com.yonyoucloud.upc.data.ProductDoubleWriteDao.getRepeatProductApplyRangeByProductIdList", queryRangeParamMap);
        if (CollectionUtils.isEmpty((Collection)repeatOldRange)) {
            return productApplyRangeList;
        }
        HashMap<String, String> repeatOldRangeMap = new HashMap<String, String>();
        for (Map repeatRange : repeatOldRange) {
            repeatOldRangeMap.put(repeatRange.get("productId").toString() + repeatRange.get("orgId"), "1");
        }
        for (ProductApplyRange productApplyRange2 : productApplyRangeList) {
            if (repeatOldRangeMap.containsKey(productApplyRange2.getProductId() + productApplyRange2.getOrgId())) {
                repeatList.add(productApplyRange2);
                continue;
            }
            noRepeatList.add(productApplyRange2);
        }
        Map<String, List<ProductApplyRange>> repeatProductApplyRangeMapList = repeatList.stream().collect(Collectors.groupingBy(productApplyRange -> productApplyRange.getProductId() + productApplyRange.getOrgId()));
        Set<Map.Entry<String, List<ProductApplyRange>>> repeatProductApplyRangeMapEntries = repeatProductApplyRangeMapList.entrySet();
        for (Map.Entry<String, List<ProductApplyRange>> repeatProductApplyRangeMapEntry : repeatProductApplyRangeMapEntries) {
            List value = repeatProductApplyRangeMapEntry.getValue().stream().sorted(Comparator.comparing(BizObject::getPubts, Comparator.reverseOrder())).collect(Collectors.toList());
            ProductApplyRange productApplyRange3 = (ProductApplyRange)value.get(0);
            noRepeatList.add(productApplyRange3);
            value.remove(0);
            forDeleteList.addAll(value);
        }
        for (ProductApplyRange productApplyRange4 : forDeleteList) {
            productApplyRange4.setTenant(Long.valueOf(tenantId * -1L));
            productApplyRange4.put("ytenant", (Object)("-" + yTenantId));
            productApplyRange4.setEntityStatus(EntityStatus.Update);
        }
        List forDeleteListList = ListSplitUtil.splitListByCapacity(forDeleteList, (int)200);
        for (List productApplyRangeListForDelete : forDeleteListList) {
            MetaDaoHelper.updateNoPartition((String)"pc.product.ProductApplyRange", (List)productApplyRangeListForDelete);
        }
        return noRepeatList;
    }
}


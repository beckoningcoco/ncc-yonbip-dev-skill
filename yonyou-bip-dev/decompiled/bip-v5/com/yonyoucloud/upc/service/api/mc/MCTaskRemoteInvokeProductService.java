/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.yonyou.iuap.apdoc.coredoc.config.YMSParamConfig
 *  com.yonyou.iuap.basedocmc.dto.task.McProgressDTO
 *  com.yonyou.iuap.basedocmc.dto.task.McResult
 *  com.yonyou.iuap.basedocmc.dto.task.McStatus
 *  com.yonyou.iuap.basedocmc.dto.task.McTaskCallBackDTO
 *  com.yonyou.iuap.basedocmc.service.IMCTaskRemoteInvokePlugin
 *  com.yonyou.iuap.basedocmc.service.inner.docrule.IConditionService
 *  com.yonyou.iuap.graphql.builder.IDefaultQuerySchemaBuilder
 *  com.yonyou.iuap.graphql.builder.QueryBuilders
 *  com.yonyou.iuap.graphql.builder.QueryConditions
 *  com.yonyou.iuap.graphql.model.IQuerySchema
 *  com.yonyou.iuap.graphql.model.conditions.IConditionExpression
 *  com.yonyou.iuap.graphql.model.conditions.group.IQueryConditionGroup
 *  com.yonyou.iuap.graphql.query.IMapDataAccessApi
 *  com.yonyou.ucf.mdd.ext.core.AppContext
 *  com.yonyou.ucf.mdd.ext.dao.meta.MetaDaoHelper
 *  com.yonyoucloud.upc.common.AddRangeMessage
 *  com.yonyoucloud.upc.common.enums.DataSource
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
package com.yonyoucloud.upc.service.api.mc;

import com.yonyou.iuap.apdoc.coredoc.config.YMSParamConfig;
import com.yonyou.iuap.basedocmc.dto.task.McProgressDTO;
import com.yonyou.iuap.basedocmc.dto.task.McResult;
import com.yonyou.iuap.basedocmc.dto.task.McStatus;
import com.yonyou.iuap.basedocmc.dto.task.McTaskCallBackDTO;
import com.yonyou.iuap.basedocmc.service.IMCTaskRemoteInvokePlugin;
import com.yonyou.iuap.basedocmc.service.inner.docrule.IConditionService;
import com.yonyou.iuap.graphql.builder.IDefaultQuerySchemaBuilder;
import com.yonyou.iuap.graphql.builder.QueryBuilders;
import com.yonyou.iuap.graphql.builder.QueryConditions;
import com.yonyou.iuap.graphql.model.IQuerySchema;
import com.yonyou.iuap.graphql.model.conditions.IConditionExpression;
import com.yonyou.iuap.graphql.model.conditions.group.IQueryConditionGroup;
import com.yonyou.iuap.graphql.query.IMapDataAccessApi;
import com.yonyou.ucf.mdd.ext.core.AppContext;
import com.yonyou.ucf.mdd.ext.dao.meta.MetaDaoHelper;
import com.yonyoucloud.upc.common.AddRangeMessage;
import com.yonyoucloud.upc.common.enums.DataSource;
import com.yonyoucloud.upc.service.product.ProductAddRangeHandleService;
import com.yonyoucloud.upc.service.product.ProductAddRangeService;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.UUID;
import org.imeta.orm.schema.ConditionExpression;
import org.imeta.orm.schema.QueryCondition;
import org.imeta.orm.schema.QueryConditionGroup;
import org.imeta.orm.schema.QuerySchema;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;

@Service(value="mcTaskRemoteInvokePlugin_pc.product.Product")
public class MCTaskRemoteInvokeProductService
implements IMCTaskRemoteInvokePlugin {
    private static final Logger log = LoggerFactory.getLogger(MCTaskRemoteInvokeProductService.class);
    private static final String PRODUCT_TASK_TOTAL_COUNT_KEY = "MCTaskProduct_TotalCount";
    private static final String PRODUCT_TASK_HANDLE_COUNT_KEY = "MCTaskProduct_HandleCount";
    @Autowired
    IConditionService conditionService;
    @Autowired
    IMapDataAccessApi mapDataAccessApi;
    @Autowired
    ProductAddRangeService productAddRangeService;
    @Autowired
    ProductAddRangeHandleService addRangeHandleService;
    @Autowired
    YMSParamConfig ymsParamConfig;

    public McTaskCallBackDTO mcTasksync(String docUri, String manageOrgId, Set<String> shareOrgIds, IQueryConditionGroup conditionGroup, String taskId) {
        McTaskCallBackDTO mcTaskCallBackDTO = new McTaskCallBackDTO();
        mcTaskCallBackDTO.setDocUri(docUri);
        McResult mcResult = new McResult();
        mcTaskCallBackDTO.setMcResult(mcResult);
        try {
            this.dealRange(docUri, manageOrgId, shareOrgIds, conditionGroup, mcResult, taskId);
        }
        catch (Exception e) {
            log.error("MCTaskRemoteInvokeProductService_mcTasksync:{}", (Object)e.getMessage(), (Object)e);
            mcResult.setStatus(McStatus.FAIL.getStatus());
            mcResult.setPercentage(this.getPercent(mcResult.getHandCount(), mcResult.getTotalCount()));
        }
        return mcTaskCallBackDTO;
    }

    public McProgressDTO askProgress(String docUri, String taskId) {
        McProgressDTO mcProgressDTO = new McProgressDTO();
        String totalCountStr = AppContext.cache().get(this.getTotalCountKey(taskId));
        String handleCountStr = AppContext.cache().get(this.getHandleCount(taskId));
        if (totalCountStr != null && handleCountStr != null) {
            int totalCount = Integer.parseInt(totalCountStr);
            int handleCount = Integer.parseInt(handleCountStr);
            mcProgressDTO.setTotalCount(totalCount);
            mcProgressDTO.setSuccessCount(handleCount);
            mcProgressDTO.setHandCount(handleCount);
            mcProgressDTO.setPercentage(this.getPercent(handleCount, totalCount));
            mcProgressDTO.setStatus(McStatus.PROCESSING.getStatus());
        }
        return mcProgressDTO;
    }

    private double getPercent(Integer handleCount, Integer totalCount) {
        if (null != totalCount && 0 < totalCount) {
            BigDecimal bd1 = new BigDecimal(handleCount * 100);
            BigDecimal bd2 = new BigDecimal(totalCount);
            BigDecimal bigDecimal = bd1.divide(bd2, 2, RoundingMode.HALF_UP);
            return bigDecimal.doubleValue();
        }
        return 100.0;
    }

    private void dealRange(String docUri, String manageOrgId, Set<String> shareOrgIds, IQueryConditionGroup conditionGroup, McResult mcResult, String taskId) {
        List<String> productIds = this.getAllProductByOrgIdAndCondition(docUri, manageOrgId, conditionGroup);
        if (!CollectionUtils.isEmpty(productIds)) {
            this.dealProSuitOrgByMc(productIds, shareOrgIds, taskId, mcResult);
            mcResult.setSuccessCount(productIds.size());
            mcResult.setHandCount(productIds.size());
            mcResult.setTotalCount(productIds.size());
            AppContext.cache().del(new String[]{this.getTotalCountKey(taskId)});
            AppContext.cache().del(new String[]{this.getHandleCount(taskId)});
        }
        mcResult.setStatus(McStatus.SUCESS.getStatus());
        mcResult.setPercentage(100.0);
    }

    public void dealProSuitOrgByMc(List<String> productIdList, Set<String> orgList, String taskId, McResult mcResult) {
        AppContext.cache().set(this.getTotalCountKey(taskId), String.valueOf(productIdList.size()));
        String handleCountKey = this.getHandleCount(taskId);
        mcResult.setTotalCount(productIdList.size());
        int handleCount = 0;
        String asyncKey = UUID.randomUUID().toString();
        for (String productId : productIdList) {
            AddRangeMessage addRangeMessage = this.productAddRangeService.getAddRangeMessage(asyncKey, "1", Long.parseLong(productId), null, new ArrayList<String>(orgList), "pc_product", DataSource.MC_PRODUCT_SUIT_ORG.getSource(), 1);
            this.addRangeHandleService.dealWithAck(Collections.singletonList(addRangeMessage), DataSource.MC_PRODUCT_SUIT_ORG.getSource());
            mcResult.setHandCount(++handleCount);
            mcResult.setSuccessCount(handleCount);
            AppContext.cache().set(handleCountKey, String.valueOf(handleCount));
            log.error(MCTaskRemoteInvokeProductService.class + " dealProSuitOrgByMc " + taskId + " " + AppContext.getYTenantId() + " \u603b\u6761\u6570\uff1a" + productIdList.size() + " \u5df2\u5904\u7406\u6761\u6570\uff1a" + handleCount);
        }
    }

    private List<String> getAllProductByOrgIdAndCondition(String docUri, String orgId, IQueryConditionGroup queryConditionGroup) {
        IDefaultQuerySchemaBuilder schemaBuilder;
        IQuerySchema querySchema;
        List productDatas;
        IQueryConditionGroup queryConditionGroup1 = QueryConditions.and((IConditionExpression[])new IConditionExpression[]{QueryConditions.eq((String)"orgId", (Object)orgId)});
        if (null != queryConditionGroup) {
            queryConditionGroup1 = QueryConditions.and((IConditionExpression[])new IConditionExpression[]{queryConditionGroup, queryConditionGroup1});
        }
        ArrayList<String> productIds = new ArrayList<String>();
        int pageIndex = 1;
        while (!CollectionUtils.isEmpty((Collection)(productDatas = this.mapDataAccessApi.queryForList(querySchema = (schemaBuilder = QueryBuilders.defaultBuilder().from(docUri).distinct().select(new String[]{"id"}).pager(pageIndex, this.ymsParamConfig.getResultMaxRowsValue())).condition(queryConditionGroup1).build())))) {
            for (Map product : productDatas) {
                productIds.add(product.get("id").toString());
            }
            ++pageIndex;
        }
        return productIds;
    }

    public int getAllotTaskTotalCount(String docUri, String orgId, List<String> rangeOrgIds) {
        if ("pc.product.Product".equals(docUri)) {
            try {
                Integer productCount = this.getProductCount(orgId);
                return this.getPeddingCount(orgId, rangeOrgIds, productCount);
            }
            catch (Exception e) {
                log.error(e.getMessage(), (Throwable)e);
            }
        }
        return 0;
    }

    private int getPeddingCount(String orgId, List<String> rangeOrgIds, Integer productCount) throws Exception {
        Integer totalCount = productCount * rangeOrgIds.size();
        Integer totalCountInDb = this.getProductOrgCount(orgId, rangeOrgIds);
        return totalCount - totalCountInDb;
    }

    private Integer getProductCount(String orgId) throws Exception {
        QueryConditionGroup queryProductIdCondition = QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"orgId").eq((Object)orgId)});
        QuerySchema queryProductIdSchema = QuerySchema.create().addSelect("count(1) as productCount").addCondition((ConditionExpression)queryProductIdCondition);
        List products = MetaDaoHelper.query((String)"pc.product.Product", (QuerySchema)queryProductIdSchema);
        return Integer.parseInt(((Map)products.get(0)).get("productCount").toString());
    }

    private Integer getProductOrgCount(String orgId, List<String> rangeOrgIds) throws Exception {
        QueryConditionGroup queryProductIdCondition = QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"orgId").eq((Object)orgId), QueryCondition.name((String)"productApplyRange.orgId").in(rangeOrgIds)});
        QuerySchema queryProductIdSchema = QuerySchema.create().addSelect("count(1) as productCount").addCondition((ConditionExpression)queryProductIdCondition);
        List products = MetaDaoHelper.query((String)"pc.product.Product", (QuerySchema)queryProductIdSchema);
        return Integer.parseInt(((Map)products.get(0)).get("productCount").toString());
    }

    private String getTotalCountKey(String taskId) {
        return PRODUCT_TASK_TOTAL_COUNT_KEY + AppContext.getYTenantId() + taskId;
    }

    private String getHandleCount(String taskId) {
        return PRODUCT_TASK_HANDLE_COUNT_KEY + AppContext.getYTenantId() + taskId;
    }
}


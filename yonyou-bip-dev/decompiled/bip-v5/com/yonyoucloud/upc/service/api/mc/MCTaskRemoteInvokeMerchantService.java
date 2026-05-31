/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.yonyou.iuap.apdoc.coredoc.config.YMSParamConfig
 *  com.yonyou.iuap.basedocmc.dto.task.McDetailError
 *  com.yonyou.iuap.basedocmc.dto.task.McProgressDTO
 *  com.yonyou.iuap.basedocmc.dto.task.McResult
 *  com.yonyou.iuap.basedocmc.dto.task.McStatus
 *  com.yonyou.iuap.basedocmc.dto.task.McTaskCallBackDTO
 *  com.yonyou.iuap.basedocmc.service.IMCTaskRemoteInvokePlugin
 *  com.yonyou.iuap.basedocmc.service.inner.docrule.IConditionService
 *  com.yonyou.iuap.context.InvocationInfoProxy
 *  com.yonyou.iuap.graphql.builder.IDefaultQuerySchemaBuilder
 *  com.yonyou.iuap.graphql.builder.QueryBuilders
 *  com.yonyou.iuap.graphql.builder.QueryConditions
 *  com.yonyou.iuap.graphql.model.IQuerySchema
 *  com.yonyou.iuap.graphql.model.conditions.IConditionExpression
 *  com.yonyou.iuap.graphql.model.conditions.group.IQueryConditionGroup
 *  com.yonyou.iuap.graphql.query.IMapDataAccessApi
 *  com.yonyou.iuap.international.MultiLangText
 *  com.yonyou.iuap.ucf.common.i18n.InternationalUtils
 *  com.yonyou.ucf.mdd.ext.core.AppContext
 *  com.yonyou.ucf.mdd.ext.dao.meta.MetaDaoHelper
 *  com.yonyoucloud.upc.aa.merchant.Merchant
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
import com.yonyou.iuap.basedocmc.dto.task.McDetailError;
import com.yonyou.iuap.basedocmc.dto.task.McProgressDTO;
import com.yonyou.iuap.basedocmc.dto.task.McResult;
import com.yonyou.iuap.basedocmc.dto.task.McStatus;
import com.yonyou.iuap.basedocmc.dto.task.McTaskCallBackDTO;
import com.yonyou.iuap.basedocmc.service.IMCTaskRemoteInvokePlugin;
import com.yonyou.iuap.basedocmc.service.inner.docrule.IConditionService;
import com.yonyou.iuap.context.InvocationInfoProxy;
import com.yonyou.iuap.graphql.builder.IDefaultQuerySchemaBuilder;
import com.yonyou.iuap.graphql.builder.QueryBuilders;
import com.yonyou.iuap.graphql.builder.QueryConditions;
import com.yonyou.iuap.graphql.model.IQuerySchema;
import com.yonyou.iuap.graphql.model.conditions.IConditionExpression;
import com.yonyou.iuap.graphql.model.conditions.group.IQueryConditionGroup;
import com.yonyou.iuap.graphql.query.IMapDataAccessApi;
import com.yonyou.iuap.international.MultiLangText;
import com.yonyou.iuap.ucf.common.i18n.InternationalUtils;
import com.yonyou.ucf.mdd.ext.core.AppContext;
import com.yonyou.ucf.mdd.ext.dao.meta.MetaDaoHelper;
import com.yonyoucloud.upc.aa.merchant.Merchant;
import com.yonyoucloud.upc.common.AddRangeMessage;
import com.yonyoucloud.upc.common.enums.DataSource;
import com.yonyoucloud.upc.service.addrange.KafkaMerchantAddRangeService;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
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

@Service(value="mcTaskRemoteInvokePlugin_aa.merchant.Merchant")
public class MCTaskRemoteInvokeMerchantService
implements IMCTaskRemoteInvokePlugin {
    private static final Logger log = LoggerFactory.getLogger(MCTaskRemoteInvokeMerchantService.class);
    private static final String TASK_KEY = "MCTaskMerchant";
    @Autowired
    private KafkaMerchantAddRangeService kafkaMerchantAddRangeService;
    @Autowired
    private IConditionService conditionService;
    @Autowired
    private IMapDataAccessApi mapDataAccessApi;
    @Autowired
    private YMSParamConfig ymsParamConfig;

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public McTaskCallBackDTO mcTasksync(String docUri, String manageOrgId, Set<String> shareOrgIds, IQueryConditionGroup conditionGroup, String taskId) {
        if ("aa.merchant.Merchant".equals(docUri)) {
            List<Merchant> merchantList;
            String totalCountUniqueKey = TASK_KEY + taskId + AppContext.getCurrentUser().getYhtTenantId() + "totalCount";
            String countUniqueKey = TASK_KEY + taskId + AppContext.getCurrentUser().getYhtTenantId() + "count";
            McTaskCallBackDTO mcTaskCallBackDTO = new McTaskCallBackDTO();
            McResult mcResult = new McResult();
            mcTaskCallBackDTO.setDocUri(docUri);
            String createOrg = manageOrgId;
            try {
                merchantList = this.getMerchantIdList(createOrg, conditionGroup);
            }
            catch (Exception e) {
                log.error("MCTaskMerchant_getMerchantIdList_error:{}", (Object)e.getMessage(), (Object)e);
                ArrayList<McDetailError> mcDetailErrorList = new ArrayList<McDetailError>();
                McDetailError mcDetailError = new McDetailError();
                mcDetailError.setErrorCause(InternationalUtils.getMessageWithDefault((String)"UID:P_COREDOC-BE_1D76AE2404F00004", (String)"\u6839\u636e\u5206\u914d\u89c4\u5219\u67e5\u8be2\u6ee1\u8db3\u6761\u4ef6\u7684\u5ba2\u6237\u65f6\u5f02\u5e38,\u5f02\u5e38\u4fe1\u606f\u4e3a:") + e.getMessage());
                mcDetailErrorList.add(mcDetailError);
                mcResult.setFailCount(0);
                mcResult.setHandCount(0);
                mcResult.setTotalCount(0);
                mcResult.setErrorList(mcDetailErrorList);
                mcResult.setStatus(McStatus.FAIL.getStatus());
                mcTaskCallBackDTO.setMcResult(mcResult);
                return mcTaskCallBackDTO;
            }
            if (!CollectionUtils.isEmpty(merchantList)) {
                if (CollectionUtils.isEmpty(shareOrgIds)) {
                    ArrayList<McDetailError> mcDetailErrorList = new ArrayList<McDetailError>();
                    McDetailError mcDetailError = new McDetailError();
                    mcDetailError.setErrorCause(InternationalUtils.getMessageWithDefault((String)"UID:P_COREDOC-BE_1D76ADA405980004", (String)"\u9700\u8981\u6267\u884c\u5206\u914d\u7684\u4f7f\u7528\u7ec4\u7ec7\u8303\u56f4\u4e3a\u7a7a!"));
                    mcDetailErrorList.add(mcDetailError);
                    mcResult.setFailCount(0);
                    mcResult.setHandCount(0);
                    mcResult.setTotalCount(0);
                    mcResult.setErrorList(mcDetailErrorList);
                    mcResult.setStatus(McStatus.FAIL.getStatus());
                    mcTaskCallBackDTO.setMcResult(mcResult);
                    return mcTaskCallBackDTO;
                }
                ArrayList<McDetailError> mcDetailErrorList = new ArrayList<McDetailError>();
                int successCount = 0;
                int failCount = 0;
                int totalCount = merchantList.size();
                for (Merchant merchant : merchantList) {
                    try {
                        AddRangeMessage addRangeMessage = this.initAddRangeMessage(merchant, shareOrgIds, String.valueOf(merchantList.size()));
                        this.kafkaMerchantAddRangeService.dealWithAck(addRangeMessage);
                        ++successCount;
                    }
                    catch (Exception e) {
                        log.error("MCTaskMerchant_addRange_error:{}", (Object)e.getMessage(), (Object)e);
                        ++failCount;
                        McDetailError mcDetailError = new McDetailError();
                        mcDetailError.setErrorCause(e.getMessage());
                        mcDetailError.setCode(merchant.getCode());
                        HashMap<String, String> multiLangTextMap = new HashMap<String, String>();
                        multiLangTextMap.put(InvocationInfoProxy.getLocale(), merchant.getName());
                        MultiLangText multiLangText = new MultiLangText(multiLangTextMap);
                        mcDetailError.setName(multiLangText);
                        mcDetailErrorList.add(mcDetailError);
                    }
                    finally {
                        int count = successCount + failCount;
                        AppContext.cache().set(totalCountUniqueKey, String.valueOf(totalCount));
                        AppContext.cache().set(countUniqueKey, String.valueOf(count));
                    }
                }
                mcResult.setSuccessCount(successCount);
                mcResult.setFailCount(failCount);
                mcResult.setHandCount(successCount + failCount);
                mcResult.setTotalCount(totalCount);
                mcResult.setErrorList(mcDetailErrorList);
                if (failCount == 0) {
                    mcResult.setStatus(McStatus.SUCESS.getStatus());
                } else {
                    mcResult.setStatus(McStatus.FAIL.getStatus());
                }
                mcTaskCallBackDTO.setMcResult(mcResult);
                AppContext.cache().del(new String[]{countUniqueKey});
                AppContext.cache().del(new String[]{totalCountUniqueKey});
            } else {
                mcResult.setFailCount(0);
                mcResult.setHandCount(0);
                mcResult.setTotalCount(0);
                ArrayList<McDetailError> mcDetailErrorList = new ArrayList<McDetailError>();
                McDetailError mcDetailError = new McDetailError();
                mcDetailError.setErrorCause(InternationalUtils.getMessageWithDefault((String)"UID:P_COREDOC-BE_1D5E69CA04D00000", (String)"\u6839\u636e\u5206\u914d\u89c4\u5219\u6ca1\u6709\u67e5\u8be2\u5230\u6ee1\u8db3\u6761\u4ef6\u7684\u5ba2\u6237!"));
                mcDetailErrorList.add(mcDetailError);
                mcResult.setErrorList(mcDetailErrorList);
                mcResult.setStatus(McStatus.SUCESS.getStatus());
                mcTaskCallBackDTO.setMcResult(mcResult);
            }
            return mcTaskCallBackDTO;
        }
        return null;
    }

    public McProgressDTO askProgress(String docUri, String taskId) {
        McProgressDTO mcProgressDTO = new McProgressDTO();
        if ("aa.merchant.Merchant".equals(docUri)) {
            String totalCountUniqueKey = TASK_KEY + taskId + AppContext.getCurrentUser().getYhtTenantId() + "totalCount";
            String countUniqueKey = TASK_KEY + taskId + AppContext.getCurrentUser().getYhtTenantId() + "count";
            String totalCount = AppContext.cache().get(totalCountUniqueKey);
            String count = AppContext.cache().get(countUniqueKey);
            if (totalCount != null && count != null) {
                mcProgressDTO.setHandCount(Integer.parseInt(count));
                mcProgressDTO.setTotalCount(Integer.parseInt(totalCount));
                mcProgressDTO.setStatus(McStatus.PROCESSING.getStatus());
            }
        }
        return mcProgressDTO;
    }

    public int getAllotTaskTotalCount(String docUri, String orgId, List<String> rangeOrgIds) {
        if ("aa.merchant.Merchant".equals(docUri)) {
            try {
                Integer merchantCount = this.getMerchantCount(orgId);
                return this.getPeddingCount(orgId, rangeOrgIds, merchantCount);
            }
            catch (Exception e) {
                log.error("MCTaskRemoteInvokeMerchantService_getAllotTaskTotalCount:{}", (Object)e.getMessage(), (Object)e);
            }
        }
        return 0;
    }

    private int getPeddingCount(String orgId, List<String> rangeOrgIds, Integer merchantCount) throws Exception {
        Integer totalCount = merchantCount * rangeOrgIds.size();
        Integer totalCountInDb = this.getMerchantOrgCount(orgId, rangeOrgIds);
        return totalCount - totalCountInDb;
    }

    private Integer getMerchantOrgCount(String orgId, List<String> rangeOrgIds) throws Exception {
        QueryConditionGroup queryConditionGroup = QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"orgId").in(rangeOrgIds), QueryCondition.name((String)"rangeType").eq((Object)1), QueryCondition.name((String)"ytenant").eq((Object)AppContext.getCurrentUser().getYTenantId()), QueryCondition.name((String)"merchantId.createOrg").eq((Object)orgId), QueryCondition.name((String)"merchantId.ytenant").eq((Object)AppContext.getCurrentUser().getYTenantId())});
        QuerySchema querySchema = QuerySchema.create().addSelect("count(1) as count").addCondition((ConditionExpression)queryConditionGroup);
        querySchema.setPartitionable(false);
        List merchants = MetaDaoHelper.query((String)"aa.merchant.MerchantApplyRange", (QuerySchema)querySchema);
        return Integer.parseInt(((Map)merchants.get(0)).get("count").toString());
    }

    private Integer getMerchantCount(String orgId) throws Exception {
        QueryConditionGroup queryConditionGroup = QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"createOrg").eq((Object)orgId)});
        QuerySchema querySchema = QuerySchema.create().addSelect("count(1) as count").addCondition((ConditionExpression)queryConditionGroup);
        List merchants = MetaDaoHelper.query((String)"aa.merchant.Merchant", (QuerySchema)querySchema);
        return Integer.parseInt(((Map)merchants.get(0)).get("count").toString());
    }

    public List<Merchant> getMerchantIdList(String createOrg, IQueryConditionGroup queryConditionGroup) {
        IDefaultQuerySchemaBuilder schemaBuilder;
        IQuerySchema querySchema;
        List merchantInDbList;
        IQueryConditionGroup queryConditionGroup1 = QueryConditions.and((IConditionExpression[])new IConditionExpression[]{QueryConditions.eq((String)"createOrg", (Object)createOrg)});
        if (null != queryConditionGroup) {
            queryConditionGroup1 = QueryConditions.and((IConditionExpression[])new IConditionExpression[]{queryConditionGroup, queryConditionGroup1});
        }
        ArrayList<Merchant> merchantList = new ArrayList<Merchant>();
        for (int pageIndex = 1; pageIndex <= 10 && !CollectionUtils.isEmpty((Collection)(merchantInDbList = this.mapDataAccessApi.queryForList(querySchema = (schemaBuilder = QueryBuilders.defaultBuilder().from("aa.merchant.Merchant").distinct().select(new String[]{"id", "code", "name"}).pager(pageIndex, this.ymsParamConfig.getResultMaxRowsValue())).condition(queryConditionGroup1).build()))); ++pageIndex) {
            for (Map merchantInDb : merchantInDbList) {
                Merchant merchant = new Merchant();
                merchant.setId((Object)Long.parseLong(merchantInDb.get("id").toString()));
                merchant.setCode(merchantInDb.get("code").toString());
                merchant.setName(merchantInDb.get("name").toString());
                merchantList.add(merchant);
            }
        }
        return merchantList;
    }

    public AddRangeMessage initAddRangeMessage(Merchant merchant, Set<String> shareOrgIds, String batchCount) {
        String requestId = UUID.randomUUID().toString();
        AddRangeMessage addRangeMessage = new AddRangeMessage();
        addRangeMessage.setId((Long)merchant.getId());
        addRangeMessage.setOrgIdList(new ArrayList<String>(shareOrgIds));
        addRangeMessage.setBatchNo(requestId);
        addRangeMessage.setBatchCount(batchCount);
        addRangeMessage.setArchiveType("aa_merchant");
        addRangeMessage.setDataSource(DataSource.MC_MERCHANT_SUIT_ORG.getSource());
        addRangeMessage.setAllocatorId((Long)AppContext.getCurrentUser().getId());
        addRangeMessage.setAllocatorName(AppContext.getCurrentUser().getName());
        addRangeMessage.setYTenantId((String)AppContext.getYTenantId());
        return addRangeMessage;
    }
}


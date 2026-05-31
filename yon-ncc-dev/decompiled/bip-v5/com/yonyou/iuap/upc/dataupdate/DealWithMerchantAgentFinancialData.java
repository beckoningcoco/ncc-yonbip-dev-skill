/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.yonyou.iuap.apdoc.coredoc.exceptions.CoreDocBusinessException
 *  com.yonyou.iuap.apdoc.coredoc.utils.ListSplitUtil
 *  com.yonyou.ucf.mdd.ext.base.tenant.Tenant
 *  com.yonyou.ucf.mdd.ext.core.AppContext
 *  com.yonyou.ucf.mdd.ext.dao.meta.MetaDaoHelper
 *  com.yonyou.ucf.mdd.ext.dao.sql.SqlHelper
 *  com.yonyoucloud.upc.aa.merchant.AgentFinancial
 *  com.yonyoucloud.upc.utils.MerchantUtils
 *  org.apache.commons.lang3.StringUtils
 *  org.imeta.orm.base.EntityStatus
 *  org.imeta.orm.schema.ConditionExpression
 *  org.imeta.orm.schema.QueryCondition
 *  org.imeta.orm.schema.QueryConditionGroup
 *  org.imeta.orm.schema.QueryPager
 *  org.imeta.orm.schema.QuerySchema
 *  org.slf4j.Logger
 *  org.slf4j.LoggerFactory
 *  org.springframework.stereotype.Service
 *  org.springframework.util.CollectionUtils
 */
package com.yonyou.iuap.upc.dataupdate;

import com.yonyou.iuap.apdoc.coredoc.exceptions.CoreDocBusinessException;
import com.yonyou.iuap.apdoc.coredoc.utils.ListSplitUtil;
import com.yonyou.iuap.upc.dataupdate.DataUpdateBaseServcie;
import com.yonyou.ucf.mdd.ext.base.tenant.Tenant;
import com.yonyou.ucf.mdd.ext.core.AppContext;
import com.yonyou.ucf.mdd.ext.dao.meta.MetaDaoHelper;
import com.yonyou.ucf.mdd.ext.dao.sql.SqlHelper;
import com.yonyoucloud.upc.aa.merchant.AgentFinancial;
import com.yonyoucloud.upc.utils.MerchantUtils;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.stream.Collectors;
import org.apache.commons.lang3.StringUtils;
import org.imeta.orm.base.EntityStatus;
import org.imeta.orm.schema.ConditionExpression;
import org.imeta.orm.schema.QueryCondition;
import org.imeta.orm.schema.QueryConditionGroup;
import org.imeta.orm.schema.QueryPager;
import org.imeta.orm.schema.QuerySchema;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;

@Service
public class DealWithMerchantAgentFinancialData
extends DataUpdateBaseServcie {
    Logger logger = LoggerFactory.getLogger(DealWithMerchantAgentFinancialData.class);

    @Override
    public int businessDataUpdate(Tenant tenant, int capacity) throws Exception {
        return this.upgradeAgentFinancialReplaceStr(tenant, capacity);
    }

    public int dataUpdateForTenant(int capacity) throws Exception {
        Tenant tenant = new Tenant();
        tenant.setId(AppContext.getCurrentUser().getTenant());
        tenant.setTenantCenter(AppContext.getCurrentUser().getYTenantId());
        return this.upgradeAgentFinancialReplaceStr(tenant, capacity);
    }

    @Override
    public String getTaskName() {
        return "\u66f4\u65b0\u5ba2\u6237\u6863\u6848-\u94f6\u884c\u4fe1\u606f\u94f6\u884c\u8d26\u53f7\u975e\u6cd5\u5b57\u7b26";
    }

    private int upgradeAgentFinancialReplaceStr(Tenant tenant, int capacity) throws Exception {
        int tenantCount = 0;
        HashMap<String, String> tenantIdParamMap = new HashMap<String, String>(4);
        tenantIdParamMap.put("yTenantId", tenant.getTenantCenter());
        Object merchantCount = SqlHelper.selectOne((String)"com.yonyoucloud.upc.data.MerchantDoubleWriteDao.selectAgentFinancialCountByYTenantId", tenantIdParamMap);
        if (merchantCount != null && Integer.parseInt(merchantCount.toString()) > 0) {
            List<List<Long>> agentFinancialIdSplitList = this.getSelfAgentFinancialByMinId(capacity);
            for (List<Long> limitAgentFinancialIdList : agentFinancialIdSplitList) {
                int updateCount = this.updateAgentFinancialReplaceStr(limitAgentFinancialIdList);
                tenantCount += updateCount;
            }
            this.logger.error(String.format("\u79df\u6237\u3010%s\u3011\u66f4\u65b0\u5ba2\u6237\u6863\u6848-\u94f6\u884c\u4fe1\u606f\u94f6\u884c\u8d26\u53f7\u53bb\u9664\u7a7a\u683c\u5347\u7ea7\u5b8c\u6210\uff0c\u5171\u8ba1\u5347\u7ea7\u6570\u636e\u3010%d\u3011\u6761\uff0c", tenant.getId().toString(), tenantCount) + LocalDateTime.now());
        }
        return tenantCount;
    }

    public int updateAgentFinancialReplaceStr(List<Long> agentFinancialIdList) throws Exception {
        List<AgentFinancial> originalAgentFinancialList;
        int updateCount = 0;
        if (!CollectionUtils.isEmpty(agentFinancialIdList) && !CollectionUtils.isEmpty(originalAgentFinancialList = this.getAgentFinancialByIdList(agentFinancialIdList))) {
            for (AgentFinancial originalAgentFinancial : originalAgentFinancialList) {
                if (!StringUtils.isEmpty((CharSequence)originalAgentFinancial.getBankAccount())) {
                    originalAgentFinancial.setBankAccount(MerchantUtils.replaceStr((String)originalAgentFinancial.getBankAccount()));
                    originalAgentFinancial.setEntityStatus(EntityStatus.Update);
                } else {
                    originalAgentFinancial.setEntityStatus(EntityStatus.Unchanged);
                }
                ++updateCount;
            }
            MetaDaoHelper.update((String)"aa.merchant.AgentFinancial", originalAgentFinancialList);
        }
        return updateCount;
    }

    private List<AgentFinancial> getAgentFinancialByIdList(List<Long> agentFinancialIdList) throws Exception {
        QuerySchema querySchema = QuerySchema.create();
        querySchema.addSelect("id,bankAccount");
        querySchema.addCondition((ConditionExpression)QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"id").in(agentFinancialIdList)}));
        return MetaDaoHelper.queryObject((String)"aa.merchant.AgentFinancial", (QuerySchema)querySchema, null);
    }

    public List<List<Long>> getSelfAgentFinancialByMinId(int capacity) {
        Long currentRangeId = 0L;
        int realMaxRowsValue = this.ymsParamConfig.getResultMaxRowsValue() - 1;
        ArrayList<Long> agentFinancialIds = new ArrayList<Long>();
        List<Long> agentFinancialIdList = this.getSelfAgentFinancialByMinId(currentRangeId, realMaxRowsValue);
        agentFinancialIds.addAll(agentFinancialIdList);
        while (agentFinancialIdList.size() >= realMaxRowsValue) {
            currentRangeId = agentFinancialIdList.get(agentFinancialIdList.size() - 1);
            agentFinancialIdList = this.getSelfAgentFinancialByMinId(currentRangeId, realMaxRowsValue);
            agentFinancialIds.addAll(agentFinancialIdList);
        }
        return ListSplitUtil.splitListByCapacity(agentFinancialIds, (int)capacity);
    }

    public List<Long> getSelfAgentFinancialByMinId(Long minId, int realMaxRowsValue) {
        try {
            List<Long> idList = new ArrayList<Long>();
            QuerySchema querySchema = QuerySchema.create();
            querySchema.addSelect("id");
            querySchema.addCondition((ConditionExpression)QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"id").gt((Object)minId)}));
            querySchema.addOrderBy("id");
            QueryPager queryPager = new QueryPager();
            queryPager.setPageIndex(1);
            queryPager.setPageSize(realMaxRowsValue);
            querySchema.pager(queryPager);
            List agentFinancialList = MetaDaoHelper.queryObject((String)"aa.merchant.AgentFinancial", (QuerySchema)querySchema, null);
            if (!CollectionUtils.isEmpty((Collection)agentFinancialList)) {
                idList = agentFinancialList.stream().map(map -> Long.parseLong(map.getId().toString())).collect(Collectors.toList());
            }
            return idList;
        }
        catch (Exception e) {
            throw new CoreDocBusinessException("\u5ba2\u6237\u6863\u6848\u94f6\u884c\u4fe1\u606f\u94f6\u884c\u8d26\u53f7\u53bb\u9664\u7a7a\u683c\u67e5\u8be2MinId\u62a5\u9519\uff0c\u8bf7\u786e\u8ba4\uff01");
        }
    }
}


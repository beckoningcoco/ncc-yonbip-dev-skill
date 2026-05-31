/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.yonyou.iuap.context.InvocationInfoProxy
 *  com.yonyou.iuap.yms.api.IYmsJdbcApi
 *  com.yonyou.iuap.yms.param.BaseEntity
 *  com.yonyou.iuap.yms.param.SQLParameter
 *  com.yonyoucloud.upc.aa.merchant.AgentFinancialEntity
 *  org.slf4j.Logger
 *  org.slf4j.LoggerFactory
 *  org.springframework.beans.factory.annotation.Autowired
 *  org.springframework.stereotype.Service
 */
package com.yonyoucloud.upc.service.merchant;

import com.yonyou.iuap.context.InvocationInfoProxy;
import com.yonyou.iuap.yms.api.IYmsJdbcApi;
import com.yonyou.iuap.yms.param.BaseEntity;
import com.yonyou.iuap.yms.param.SQLParameter;
import com.yonyoucloud.upc.aa.merchant.AgentFinancialEntity;
import java.util.HashMap;
import java.util.List;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AgentFinancialEntityService {
    private static final Logger log = LoggerFactory.getLogger(AgentFinancialEntityService.class);
    @Autowired
    private IYmsJdbcApi ymsJdbcApi;

    public AgentFinancialEntity queryAgentFinancialEntityById(Long id) {
        HashMap<String, Long> conditions = new HashMap<String, Long>();
        conditions.put("id", id);
        AgentFinancialEntity agentFinancialEntity = new AgentFinancialEntity();
        String[] selectedFields = new String[]{"id", "merchantId", "bank", "openBank", "bankAccount", "bankAccountName", "isDefault"};
        return (AgentFinancialEntity)this.ymsJdbcApi.selectOne((BaseEntity)agentFinancialEntity, conditions, selectedFields);
    }

    public List<AgentFinancialEntity> queryAgentFinancialEntityByMerchantId(Long merchantId) {
        SQLParameter sqlParameter = new SQLParameter();
        sqlParameter.addParam(InvocationInfoProxy.getTenantid());
        sqlParameter.addParam((Object)merchantId);
        String sql = "select * from agentfinancialnew where ytenant_id = ? and imerchantId = ?";
        return this.ymsJdbcApi.queryForDTOList(sql, sqlParameter, AgentFinancialEntity.class);
    }

    public List<AgentFinancialEntity> queryAgentFinancialEntityByNoId(Long merchantId, Long id) {
        SQLParameter sqlParameter = new SQLParameter();
        sqlParameter.addParam(InvocationInfoProxy.getTenantid());
        sqlParameter.addParam((Object)merchantId);
        sqlParameter.addParam((Object)id);
        String sql = "select * from agentfinancialnew where ytenant_id = ? and imerchantId = ? and id <> ?";
        return this.ymsJdbcApi.queryForDTOList(sql, sqlParameter, AgentFinancialEntity.class);
    }

    public void deleteAgentFinancialEntity(AgentFinancialEntity agentFinancialEntity) {
        this.ymsJdbcApi.remove((BaseEntity)agentFinancialEntity);
    }
}


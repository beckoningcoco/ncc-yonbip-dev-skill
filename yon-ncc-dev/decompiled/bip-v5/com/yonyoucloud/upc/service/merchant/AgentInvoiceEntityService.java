/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.yonyou.iuap.context.InvocationInfoProxy
 *  com.yonyou.iuap.yms.api.IYmsJdbcApi
 *  com.yonyou.iuap.yms.param.BaseEntity
 *  com.yonyou.iuap.yms.param.SQLParameter
 *  com.yonyoucloud.upc.aa.merchant.AgentInvoiceEntity
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
import com.yonyoucloud.upc.aa.merchant.AgentInvoiceEntity;
import java.util.HashMap;
import java.util.List;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AgentInvoiceEntityService {
    private static final Logger log = LoggerFactory.getLogger(AgentInvoiceEntityService.class);
    @Autowired
    private IYmsJdbcApi ymsJdbcApi;

    public AgentInvoiceEntity queryAgentInvoiceEntityById(Long id) {
        HashMap<String, Long> conditions = new HashMap<String, Long>();
        conditions.put("id", id);
        AgentInvoiceEntity agentInvoiceEntity = new AgentInvoiceEntity();
        String[] selectedFields = new String[]{"id", "merchantId", "bdBillingType", "title", "bankAccount", "isDefault"};
        return (AgentInvoiceEntity)this.ymsJdbcApi.selectOne((BaseEntity)agentInvoiceEntity, conditions, selectedFields);
    }

    public List<AgentInvoiceEntity> queryAgentInvoiceEntityByMerchantId(Long merchantId) {
        SQLParameter sqlParameter = new SQLParameter();
        sqlParameter.addParam(InvocationInfoProxy.getTenantid());
        sqlParameter.addParam((Object)merchantId);
        String sql = "select * from agentinvoicenew where ytenant_id = ? and imerchantId = ?";
        return this.ymsJdbcApi.queryForDTOList(sql, sqlParameter, AgentInvoiceEntity.class);
    }

    public List<AgentInvoiceEntity> queryAgentInvoiceEntityByNoId(Long merchantId, Long id) {
        SQLParameter sqlParameter = new SQLParameter();
        sqlParameter.addParam(InvocationInfoProxy.getTenantid());
        sqlParameter.addParam((Object)merchantId);
        sqlParameter.addParam((Object)id);
        String sql = "select * from agentinvoicenew where ytenant_id = ? and imerchantId = ? and id <> ?";
        return this.ymsJdbcApi.queryForDTOList(sql, sqlParameter, AgentInvoiceEntity.class);
    }

    public void deleteAgentInvoiceEntity(AgentInvoiceEntity agentInvoiceEntity) {
        this.ymsJdbcApi.remove((BaseEntity)agentInvoiceEntity);
    }
}


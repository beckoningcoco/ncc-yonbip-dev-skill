/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.yonyou.iuap.context.InvocationInfoProxy
 *  com.yonyou.iuap.yms.api.IYmsJdbcApi
 *  com.yonyou.iuap.yms.param.BaseEntity
 *  com.yonyou.iuap.yms.param.SQLParameter
 *  com.yonyoucloud.upc.aa.merchant.CustomerAreaEntity
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
import com.yonyoucloud.upc.aa.merchant.CustomerAreaEntity;
import java.util.HashMap;
import java.util.List;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CustomerAreaEntityService {
    private static final Logger log = LoggerFactory.getLogger(CustomerAreaEntityService.class);
    @Autowired
    private IYmsJdbcApi ymsJdbcApi;

    public CustomerAreaEntity queryCustomerAreaEntityById(Long id) {
        HashMap<String, Long> conditions = new HashMap<String, Long>();
        conditions.put("id", id);
        CustomerAreaEntity customerAreaEntity = new CustomerAreaEntity();
        String[] selectedFields = new String[]{"id", "merchantId", "merchantApplyRangeId", "saleAreaId", "isDefault"};
        return (CustomerAreaEntity)this.ymsJdbcApi.selectOne((BaseEntity)customerAreaEntity, conditions, selectedFields);
    }

    public List<CustomerAreaEntity> queryCustomerAreaEntityByMerchantId(Long merchantId, Long merchantApplyRangeId) {
        SQLParameter sqlParameter = new SQLParameter();
        sqlParameter.addParam(InvocationInfoProxy.getTenantid());
        sqlParameter.addParam((Object)merchantId);
        sqlParameter.addParam((Object)merchantApplyRangeId);
        String sql = "select * from customerarea where ytenant_id = ? and imerchantId = ? and merchantApplyRangeId = ?";
        return this.ymsJdbcApi.queryForDTOList(sql, sqlParameter, CustomerAreaEntity.class);
    }

    public List<CustomerAreaEntity> queryCustomerAreaEntityByNoId(Long merchantId, Long merchantApplyRangeId, Long id) {
        SQLParameter sqlParameter = new SQLParameter();
        sqlParameter.addParam(InvocationInfoProxy.getTenantid());
        sqlParameter.addParam((Object)merchantId);
        sqlParameter.addParam((Object)merchantApplyRangeId);
        sqlParameter.addParam((Object)id);
        String sql = "select * from customerarea where ytenant_id = ? and imerchantId = ? and merchantApplyRangeId = ? and id <> ?";
        return this.ymsJdbcApi.queryForDTOList(sql, sqlParameter, CustomerAreaEntity.class);
    }

    public void deleteCustomerAreaEntity(CustomerAreaEntity customerAreaEntity) {
        this.ymsJdbcApi.remove((BaseEntity)customerAreaEntity);
    }
}


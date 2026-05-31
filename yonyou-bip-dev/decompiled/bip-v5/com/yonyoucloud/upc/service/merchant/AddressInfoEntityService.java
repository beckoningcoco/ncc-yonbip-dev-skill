/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.yonyou.iuap.context.InvocationInfoProxy
 *  com.yonyou.iuap.yms.api.IYmsJdbcApi
 *  com.yonyou.iuap.yms.param.BaseEntity
 *  com.yonyou.iuap.yms.param.SQLParameter
 *  com.yonyoucloud.upc.aa.merchant.AddressInfoEntity
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
import com.yonyoucloud.upc.aa.merchant.AddressInfoEntity;
import java.util.HashMap;
import java.util.List;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AddressInfoEntityService {
    private static final Logger log = LoggerFactory.getLogger(AddressInfoEntityService.class);
    @Autowired
    private IYmsJdbcApi ymsJdbcApi;

    public AddressInfoEntity queryAddressEntityById(Long id) {
        HashMap<String, Long> conditions = new HashMap<String, Long>();
        conditions.put("id", id);
        AddressInfoEntity addressInfoEntity = new AddressInfoEntity();
        String[] selectedFields = new String[]{"id", "merchantId", "addressCode", "address", "isDefault"};
        return (AddressInfoEntity)this.ymsJdbcApi.selectOne((BaseEntity)addressInfoEntity, conditions, selectedFields);
    }

    public List<AddressInfoEntity> queryAddressEntityByMerchantId(Long merchantId) {
        SQLParameter sqlParameter = new SQLParameter();
        sqlParameter.addParam(InvocationInfoProxy.getTenantid());
        sqlParameter.addParam((Object)merchantId);
        String sql = "select * from addressinfo where ytenant_id = ? and imerchantId = ?";
        return this.ymsJdbcApi.queryForDTOList(sql, sqlParameter, AddressInfoEntity.class);
    }

    public List<AddressInfoEntity> queryAddressEntityByNoId(Long merchantId, Long id) {
        SQLParameter sqlParameter = new SQLParameter();
        sqlParameter.addParam(InvocationInfoProxy.getTenantid());
        sqlParameter.addParam((Object)merchantId);
        sqlParameter.addParam((Object)id);
        String sql = "select * from addressinfo where ytenant_id = ? and imerchantId = ? and id <> ?";
        return this.ymsJdbcApi.queryForDTOList(sql, sqlParameter, AddressInfoEntity.class);
    }

    public void deleteAddressEntity(AddressInfoEntity addressInfoEntity) {
        this.ymsJdbcApi.remove((BaseEntity)addressInfoEntity);
    }
}


/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.yonyou.iuap.apdoc.coredoc.po.merchant.MerchantPrincipalPO
 *  com.yonyou.iuap.context.InvocationInfoProxy
 *  com.yonyou.iuap.yms.api.IYmsJdbcApi
 *  com.yonyou.iuap.yms.param.BaseEntity
 *  com.yonyou.iuap.yms.param.SQLParameter
 *  org.slf4j.Logger
 *  org.slf4j.LoggerFactory
 *  org.springframework.beans.factory.annotation.Autowired
 *  org.springframework.stereotype.Service
 */
package com.yonyoucloud.upc.service.merchant;

import com.yonyou.iuap.apdoc.coredoc.po.merchant.MerchantPrincipalPO;
import com.yonyou.iuap.context.InvocationInfoProxy;
import com.yonyou.iuap.yms.api.IYmsJdbcApi;
import com.yonyou.iuap.yms.param.BaseEntity;
import com.yonyou.iuap.yms.param.SQLParameter;
import java.util.HashMap;
import java.util.List;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PrincipalEntityService {
    private static final Logger log = LoggerFactory.getLogger(PrincipalEntityService.class);
    @Autowired
    private IYmsJdbcApi ymsJdbcApi;

    public MerchantPrincipalPO queryPrincipalEntityById(Long id) {
        HashMap<String, Long> conditions = new HashMap<String, Long>();
        conditions.put("id", id);
        MerchantPrincipalPO principalEntity = new MerchantPrincipalPO();
        String[] selectedFields = new String[]{"id", "merchantId", "merchantApplyRangeId", "specialManagementDep", "professSalesman", "isDefault"};
        return (MerchantPrincipalPO)this.ymsJdbcApi.selectOne((BaseEntity)principalEntity, conditions, selectedFields);
    }

    public List<MerchantPrincipalPO> queryPrincipalEntityByMerchantId(Long merchantId, Long merchantApplyRangeId) {
        SQLParameter sqlParameter = new SQLParameter();
        sqlParameter.addParam(InvocationInfoProxy.getTenantid());
        sqlParameter.addParam((Object)merchantId);
        sqlParameter.addParam((Object)merchantApplyRangeId);
        String sql = "select * from principal where ytenant_id = ? and imerchantId = ? and merchantApplyRangeId = ?";
        return this.ymsJdbcApi.queryForDTOList(sql, sqlParameter, MerchantPrincipalPO.class);
    }

    public List<MerchantPrincipalPO> queryPrincipalEntityByNoId(Long merchantId, Long merchantApplyRangeId, Long id) {
        SQLParameter sqlParameter = new SQLParameter();
        sqlParameter.addParam(InvocationInfoProxy.getTenantid());
        sqlParameter.addParam((Object)merchantId);
        sqlParameter.addParam((Object)merchantApplyRangeId);
        sqlParameter.addParam((Object)id);
        String sql = "select * from principal where ytenant_id = ? and imerchantId = ? and merchantApplyRangeId = ? and id <> ?";
        return this.ymsJdbcApi.queryForDTOList(sql, sqlParameter, MerchantPrincipalPO.class);
    }

    public void deletePrincipalEntity(MerchantPrincipalPO principalEntity) {
        this.ymsJdbcApi.remove((BaseEntity)principalEntity);
    }
}


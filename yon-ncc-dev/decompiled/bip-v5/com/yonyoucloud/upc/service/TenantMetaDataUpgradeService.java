/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.alibaba.fastjson.JSON
 *  com.alibaba.fastjson.JSONObject
 *  com.yonyou.iuap.ucf.common.i18n.InternationalUtils
 *  com.yonyou.iuap.yms.api.IYmsJdbcApi
 *  com.yonyou.iuap.yms.api.YmsJdbcApiProvider
 *  com.yonyou.iuap.yms.factory.YmsJdbcApiProviderFactory
 *  com.yonyou.iuap.yms.param.ResultSetProcessor
 *  com.yonyou.iuap.yms.processor.MapListProcessor
 *  com.yonyou.ucf.mdd.ext.base.tenant.Tenant
 *  com.yonyou.ucf.mdd.ext.dao.sql.SqlHelper
 *  org.slf4j.Logger
 *  org.slf4j.LoggerFactory
 *  org.springframework.beans.factory.annotation.Autowired
 *  org.springframework.data.redis.core.RedisTemplate
 *  org.springframework.stereotype.Service
 *  org.springframework.util.CollectionUtils
 */
package com.yonyoucloud.upc.service;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.yonyou.iuap.ucf.common.i18n.InternationalUtils;
import com.yonyou.iuap.yms.api.IYmsJdbcApi;
import com.yonyou.iuap.yms.api.YmsJdbcApiProvider;
import com.yonyou.iuap.yms.factory.YmsJdbcApiProviderFactory;
import com.yonyou.iuap.yms.param.ResultSetProcessor;
import com.yonyou.iuap.yms.processor.MapListProcessor;
import com.yonyou.ucf.mdd.ext.base.tenant.Tenant;
import com.yonyou.ucf.mdd.ext.dao.sql.SqlHelper;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Supplier;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;

@Service
public class TenantMetaDataUpgradeService {
    private static final HashMap<String, String> FULLNAME_URI;
    private static String SIMPLIFY_PRODUCT_CONDITION;
    @Autowired
    RedisTemplate redisTemplate;
    private Logger logger = LoggerFactory.getLogger(TenantMetaDataUpgradeService.class);

    public void updataTenantMetaData(String fullName, Long beginTenantId, Long endTenantId) {
        YmsJdbcApiProvider ymsJdbcApiProvider = YmsJdbcApiProviderFactory.getYmsJdbcApiProvider();
        Supplier federalYmsJdbcApi = ymsJdbcApiProvider.getFederalYmsJdbcApi("iuap-apdoc-material_main_dataSource");
        List iYmsJdbcApis = (List)federalYmsJdbcApi.get();
        for (IYmsJdbcApi ymsJdbcApi : iYmsJdbcApis) {
            try {
                String sql;
                List tenantMapList;
                if (!FULLNAME_URI.containsKey(fullName) || CollectionUtils.isEmpty((Collection)(tenantMapList = ymsJdbcApi.queryForList(sql = "select id,tenantcenter_id,ytenant_id from tenant where id >=" + beginTenantId + " and id <" + endTenantId, (ResultSetProcessor)new MapListProcessor())))) continue;
                ArrayList<Tenant> tenantList = new ArrayList<Tenant>();
                for (Map tenantMap : tenantMapList) {
                    Tenant tenant = new Tenant();
                    tenant.setId(tenantMap.get("id"));
                    tenant.setTenantCenter(tenantMap.get("tenantcenter_id") == null ? "" : tenantMap.get("tenantcenter_id").toString());
                    tenant.setYTenantId(tenantMap.get("ytenant_id") == null ? "" : tenantMap.get("ytenant_id").toString());
                    tenantList.add(tenant);
                }
            }
            catch (Exception e) {
                this.logger.error("updataTenantMetaData\u5347\u7ea7\u79df\u6237\u5143\u6570\u636e\u5f02\u5e38" + e.getMessage(), (Throwable)e);
            }
        }
    }

    public String simpleConditionTenant(Long beginTenantId, Long endTenantId) {
        ArrayList<Long> tenantIdList = new ArrayList<Long>();
        try {
            String sql = "select id from tenant where id >=" + beginTenantId + " and id <" + endTenantId;
            HashMap<String, String> params = new HashMap<String, String>();
            params.put("sql", sql);
            List tenantIdMapList = SqlHelper.selectList((String)"com.yonyou.ucf.mdd.ext.meta.dao.selectList", params);
            if (CollectionUtils.isEmpty((Collection)tenantIdMapList)) {
                String result = String.format(InternationalUtils.getMessageWithDefault((String)"UID:P_COREDOC-BE_181E96BE0590002A", (String)"\u672c\u6b21\u7b80\u5316\u53c2\u7167\u67e5\u8be2\u66f4\u65b0redis\u79df\u6237\u6570\u636e\uff1a%s - %s \uff0c\u672a\u67e5\u8be2\u5230\u76f8\u5173\u79df\u6237\u6570\u636e\uff0c\u8bf7\u68c0\u67e5"), String.valueOf(beginTenantId), String.valueOf(endTenantId));
                return result;
            }
            for (Map tenant : tenantIdMapList) {
                tenantIdList.add((Long)tenant.get("id"));
            }
            if (null == this.redisTemplate.opsForValue().get((Object)SIMPLIFY_PRODUCT_CONDITION)) {
                this.redisTemplate.opsForValue().set((Object)SIMPLIFY_PRODUCT_CONDITION, (Object)JSON.toJSON(tenantIdList).toString());
            } else {
                tenantIdList.addAll(JSONObject.parseArray((String)JSON.toJSONString((Object)JSON.parse((String)this.redisTemplate.opsForValue().get((Object)SIMPLIFY_PRODUCT_CONDITION).toString())), Long.class));
                this.redisTemplate.opsForValue().set((Object)SIMPLIFY_PRODUCT_CONDITION, (Object)JSON.toJSON(tenantIdList).toString());
            }
            String result = (String)this.redisTemplate.opsForValue().get((Object)SIMPLIFY_PRODUCT_CONDITION);
            return result;
        }
        catch (Exception e) {
            this.logger.error("updataTenantMetaData\u5347\u7ea7\u79df\u6237\u5143\u6570\u636e\u5f02\u5e38" + e.getMessage(), (Throwable)e);
            String result = e.getMessage();
            return result;
        }
    }

    static {
        SIMPLIFY_PRODUCT_CONDITION = "simplify_product_condition";
        FULLNAME_URI = new HashMap();
        FULLNAME_URI.put("pc_productpro", "pc.product.ProductDefine");
    }
}


/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.yonyou.diwork.ott.exexutors.RobotExecutors
 *  com.yonyou.iuap.apdoc.coredoc.config.YMSParamConfig
 *  com.yonyou.iuap.yms.api.IYmsJdbcApi
 *  com.yonyou.iuap.yms.api.YmsJdbcApiProvider
 *  com.yonyou.iuap.yms.factory.YmsJdbcApiProviderFactory
 *  com.yonyou.iuap.yms.param.ResultSetProcessor
 *  com.yonyou.iuap.yms.processor.MapListProcessor
 *  com.yonyou.ucf.mdd.ext.base.tenant.Tenant
 *  org.jetbrains.annotations.Nullable
 *  org.slf4j.Logger
 *  org.slf4j.LoggerFactory
 *  org.springframework.beans.factory.annotation.Autowired
 *  org.springframework.beans.factory.annotation.Qualifier
 *  org.springframework.stereotype.Service
 *  org.springframework.util.CollectionUtils
 */
package com.yonyou.iuap.upc.dataupdate;

import com.yonyou.diwork.ott.exexutors.RobotExecutors;
import com.yonyou.iuap.apdoc.coredoc.config.YMSParamConfig;
import com.yonyou.iuap.yms.api.IYmsJdbcApi;
import com.yonyou.iuap.yms.api.YmsJdbcApiProvider;
import com.yonyou.iuap.yms.factory.YmsJdbcApiProviderFactory;
import com.yonyou.iuap.yms.param.ResultSetProcessor;
import com.yonyou.iuap.yms.processor.MapListProcessor;
import com.yonyou.ucf.mdd.ext.base.tenant.Tenant;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.function.Supplier;
import org.jetbrains.annotations.Nullable;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;

@Service
public abstract class DataUpdateBaseServcie {
    private static final Logger log = LoggerFactory.getLogger(DataUpdateBaseServcie.class);
    @Autowired
    YMSParamConfig ymsParamConfig;
    @Autowired
    @Qualifier(value="ymsLongTaskExecutorService")
    private ExecutorService ymsLongTaskExecutorService;

    public abstract int businessDataUpdate(Tenant var1, int var2) throws Exception;

    public abstract String getTaskName();

    public void dataUpdate(Long beginTenantId, Long endTenantId, int capacity) {
        YmsJdbcApiProvider ymsJdbcApiProvider = YmsJdbcApiProviderFactory.getYmsJdbcApiProvider();
        Supplier federalYmsJdbcApi = ymsJdbcApiProvider.getFederalYmsJdbcApi("iuap-apdoc-material_main_dataSource");
        List iYmsJdbcApis = (List)federalYmsJdbcApi.get();
        for (IYmsJdbcApi ymsJdbcApi : iYmsJdbcApis) {
            List<Tenant> tenantList = this.listTenants(ymsJdbcApi, beginTenantId, endTenantId);
            this.dataUpdate(tenantList, capacity);
        }
    }

    private void dataUpdate(List<Tenant> tenantList, int capacity) {
        if (tenantList != null) {
            AtomicInteger totalCount = new AtomicInteger();
            for (Tenant tenant : tenantList) {
                AtomicInteger tenantCount = new AtomicInteger();
                try {
                    RobotExecutors.runAs((String)tenant.getYTenantId(), () -> {
                        try {
                            tenantCount.set(this.businessDataUpdate(tenant, capacity));
                        }
                        catch (Exception e) {
                            log.error("\u79df\u6237" + tenant.getId() + this.getTaskName() + "\u5347\u7ea7\u5f02\u5e38" + LocalDateTime.now() + e.getMessage());
                        }
                    }, (ExecutorService)this.ymsLongTaskExecutorService);
                }
                catch (Exception e) {
                    tenantCount.set(0);
                    log.error("\u79df\u6237" + tenant.getId() + this.getTaskName() + "\u5347\u7ea7\u5f02\u5e38" + LocalDateTime.now() + e.getMessage());
                }
                totalCount.addAndGet(tenantCount.intValue());
            }
            log.error(String.format(this.getTaskName() + "\u5347\u7ea7\u5b8c\u6210\uff0c\u5171\u8ba1\u5347\u7ea7\u6570\u636e\u3010%d\u3011\u6761", totalCount.intValue()) + LocalDateTime.now());
        } else {
            log.error(this.getTaskName() + "\u6570\u636e\u5347\u7ea7\u5f02\u5e38\uff0c\u672a\u67e5\u8be2\u5230\u9700\u8981\u5347\u7ea7\u7684\u79df\u6237\u6570\u636e");
        }
    }

    private List<Tenant> listTenants(IYmsJdbcApi ymsJdbcApi, Long beginTenantId, Long endTenantId) {
        List<Tenant> tenantList = this.listSelfDefineTenants();
        if (CollectionUtils.isEmpty(tenantList)) {
            tenantList = DataUpdateBaseServcie.listDefaultTenants(ymsJdbcApi, beginTenantId, endTenantId);
        }
        return tenantList;
    }

    public List<Tenant> listSelfDefineTenants() {
        return null;
    }

    @Nullable
    private static List<Tenant> listDefaultTenants(IYmsJdbcApi ymsJdbcApi, Long beginTenantId, Long endTenantId) {
        String sql = "select id,tenantcenter_id,ytenant_id from tenant where id >=" + beginTenantId + " and id <" + endTenantId;
        HashMap<String, String> queryTenantSQLList = new HashMap<String, String>();
        queryTenantSQLList.put("sql", sql);
        ArrayList<Tenant> tenantList = null;
        List tenantMapList = ymsJdbcApi.queryForList(sql, (ResultSetProcessor)new MapListProcessor());
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
}


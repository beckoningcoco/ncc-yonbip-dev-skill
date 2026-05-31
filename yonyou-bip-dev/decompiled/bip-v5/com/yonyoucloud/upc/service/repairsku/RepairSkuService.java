/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.alibaba.fastjson.JSON
 *  com.alibaba.fastjson.JSONObject
 *  com.yonyou.cloud.util.IrisDynamicInvokeUtil
 *  com.yonyou.diwork.ott.exexutors.RobotExecutors
 *  com.yonyou.iuap.apdoc.coredoc.config.YMSParamConfig
 *  com.yonyou.iuap.context.InvocationInfoProxy
 *  com.yonyou.iuap.metadata.api.itf.MetadataDependencyService
 *  com.yonyou.iuap.metadata.api.model.base.IAttribute
 *  com.yonyou.iuap.metadata.api.model.base.IColumnAttribute
 *  com.yonyou.iuap.metadata.api.model.base.IEntity
 *  com.yonyou.iuap.metadata.api.model.dependency.IDependencyAttribute
 *  com.yonyou.iuap.ucf.common.i18n.InternationalUtils
 *  com.yonyou.iuap.yms.api.IYmsJdbcApi
 *  com.yonyou.iuap.yms.api.YmsJdbcApiProvider
 *  com.yonyou.iuap.yms.factory.YmsJdbcApiProviderFactory
 *  com.yonyou.iuap.yms.http.YmsHttpClient
 *  com.yonyou.iuap.yms.http.YmsHttpHeader
 *  com.yonyou.iuap.yms.http.YmsHttpMethod
 *  com.yonyou.iuap.yms.http.YmsHttpRequest
 *  com.yonyou.iuap.yms.http.YmsHttpRequestBuilder
 *  com.yonyou.iuap.yms.http.YmsHttpResponse
 *  com.yonyou.iuap.yms.param.ResultSetProcessor
 *  com.yonyou.iuap.yms.processor.MapListProcessor
 *  com.yonyou.ucf.mdd.api.interfaces.rpc.IComOperateApi
 *  com.yonyou.ucf.mdd.ext.base.tenant.Tenant
 *  com.yonyou.ucf.mdd.ext.core.AppContext
 *  com.yonyou.ucf.mdd.ext.dao.meta.MetaDaoHelper
 *  com.yonyou.ucf.mdd.ext.dao.sql.SqlHelper
 *  com.yonyoucloud.upc.coredoc.common.RepeatSkuRepairResult
 *  com.yonyoucloud.upc.pc.product.ProductSKUDetail
 *  com.yonyoucloud.upc.pc.product.ProductSkuDetailNew
 *  iuap.yms.thread.api.YmsExecutors
 *  org.apache.commons.lang3.StringUtils
 *  org.imeta.orm.base.BizObject
 *  org.imeta.orm.base.EntityStatus
 *  org.imeta.orm.schema.ConditionExpression
 *  org.imeta.orm.schema.QueryCondition
 *  org.imeta.orm.schema.QueryConditionGroup
 *  org.imeta.orm.schema.QuerySchema
 *  org.imeta.spring.support.id.IdManager
 *  org.slf4j.Logger
 *  org.slf4j.LoggerFactory
 *  org.springframework.beans.factory.annotation.Autowired
 *  org.springframework.beans.factory.annotation.Qualifier
 *  org.springframework.stereotype.Service
 *  org.springframework.util.CollectionUtils
 */
package com.yonyoucloud.upc.service.repairsku;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.yonyou.cloud.util.IrisDynamicInvokeUtil;
import com.yonyou.diwork.ott.exexutors.RobotExecutors;
import com.yonyou.iuap.apdoc.coredoc.config.YMSParamConfig;
import com.yonyou.iuap.context.InvocationInfoProxy;
import com.yonyou.iuap.metadata.api.itf.MetadataDependencyService;
import com.yonyou.iuap.metadata.api.model.base.IAttribute;
import com.yonyou.iuap.metadata.api.model.base.IColumnAttribute;
import com.yonyou.iuap.metadata.api.model.base.IEntity;
import com.yonyou.iuap.metadata.api.model.dependency.IDependencyAttribute;
import com.yonyou.iuap.ucf.common.i18n.InternationalUtils;
import com.yonyou.iuap.yms.api.IYmsJdbcApi;
import com.yonyou.iuap.yms.api.YmsJdbcApiProvider;
import com.yonyou.iuap.yms.factory.YmsJdbcApiProviderFactory;
import com.yonyou.iuap.yms.http.YmsHttpClient;
import com.yonyou.iuap.yms.http.YmsHttpHeader;
import com.yonyou.iuap.yms.http.YmsHttpMethod;
import com.yonyou.iuap.yms.http.YmsHttpRequest;
import com.yonyou.iuap.yms.http.YmsHttpRequestBuilder;
import com.yonyou.iuap.yms.http.YmsHttpResponse;
import com.yonyou.iuap.yms.param.ResultSetProcessor;
import com.yonyou.iuap.yms.processor.MapListProcessor;
import com.yonyou.ucf.mdd.api.interfaces.rpc.IComOperateApi;
import com.yonyou.ucf.mdd.ext.base.tenant.Tenant;
import com.yonyou.ucf.mdd.ext.core.AppContext;
import com.yonyou.ucf.mdd.ext.dao.meta.MetaDaoHelper;
import com.yonyou.ucf.mdd.ext.dao.sql.SqlHelper;
import com.yonyoucloud.upc.coredoc.common.RepeatSkuRepairResult;
import com.yonyoucloud.upc.pc.product.ProductSKUDetail;
import com.yonyoucloud.upc.pc.product.ProductSkuDetailNew;
import iuap.yms.thread.api.YmsExecutors;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import java.util.function.Supplier;
import org.apache.commons.lang3.StringUtils;
import org.imeta.orm.base.BizObject;
import org.imeta.orm.base.EntityStatus;
import org.imeta.orm.schema.ConditionExpression;
import org.imeta.orm.schema.QueryCondition;
import org.imeta.orm.schema.QueryConditionGroup;
import org.imeta.orm.schema.QuerySchema;
import org.imeta.spring.support.id.IdManager;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;

@Service
public class RepairSkuService {
    private static final Logger log = LoggerFactory.getLogger(RepairSkuService.class);
    private static List<String> domains = new ArrayList<String>();
    @Autowired
    @Qualifier(value="coredocYmsHttpClient")
    private YmsHttpClient ymsHttpClient;
    private static final String PC_AA_PRODUCTSKU = "pc.aa.ProductSKU";
    private static List<String> excludeUris = new ArrayList<String>();
    @Autowired
    private YMSParamConfig ymsParamConfig;
    @Autowired
    MetadataDependencyService metadataDependencyService;

    public String repairSkuByTenant(Long beginTenantId, Long endTenantId) {
        YmsJdbcApiProvider ymsJdbcApiProvider = YmsJdbcApiProviderFactory.getYmsJdbcApiProvider();
        Supplier federalYmsJdbcApi = ymsJdbcApiProvider.getFederalYmsJdbcApi("iuap-apdoc-material_main_dataSource");
        List iYmsJdbcApis = (List)federalYmsJdbcApi.get();
        for (IYmsJdbcApi ymsJdbcApi : iYmsJdbcApis) {
            List<Tenant> tenants = this.getTenants(ymsJdbcApi, beginTenantId, endTenantId);
            if (CollectionUtils.isEmpty(tenants)) continue;
            for (Tenant tenant : tenants) {
                RobotExecutors.runAs((String)tenant.getTenantCenter(), () -> {
                    try {
                        this.dealRepeatSkuByTenantId();
                    }
                    catch (Exception e) {
                        log.error(RepairSkuService.class + " repairSkuByTenant \u5904\u7406\u79df\u6237\u7ea7\u6570\u636e\u5f02\u5e38\uff1a" + tenant.getYTenantId() + " " + e.getMessage(), (Throwable)e);
                    }
                }, (ExecutorService)YmsExecutors.getYmsExecutor());
            }
        }
        return InternationalUtils.getMessageWithDefault((String)"UID:P_COREDOC-BE_1823B80A05880026", (String)"\u6570\u636e\u5904\u7406\u4e2d");
    }

    public void repairSkuByTenant(String ytenantsStr) {
        String[] ytenants;
        for (String ytenant : ytenants = ytenantsStr.split(";")) {
            RobotExecutors.runAs((String)ytenant, () -> {
                try {
                    this.dealRepeatSkuByTenantId();
                }
                catch (Exception e) {
                    log.error(RepairSkuService.class + " repairSkuByTenant \u5904\u7406\u79df\u6237\u7ea7\u6570\u636e\u5f02\u5e38\uff1a" + ytenant + " " + e.getMessage(), (Throwable)e);
                }
            }, (ExecutorService)YmsExecutors.getYmsExecutor());
        }
    }

    public void dealRepeatSkuByProductId(Long productId) throws Exception {
        List<Map<String, Object>> repeatSku = this.getRepeatSku(productId);
        this.replaceSkuIds(repeatSku);
    }

    public int dealRepeatSkuByTenantId() throws Exception {
        int result = 0;
        List<Map<String, Object>> repeatSku = this.getRepeatSku(null);
        if (!CollectionUtils.isEmpty(repeatSku)) {
            this.replaceSkuIds(repeatSku);
            result = repeatSku.size();
        }
        return result;
    }

    private void replaceSkuIds(List<Map<String, Object>> repeatSku) throws Exception {
        if (!CollectionUtils.isEmpty(repeatSku)) {
            HashMap<String, Map<String, String>> domainTableFieldNameMap = new HashMap<String, Map<String, String>>(16);
            this.getDependencyAttributesByUri("pc.product.ProductSKU", domainTableFieldNameMap);
            this.getDependencyAttributesByUri(PC_AA_PRODUCTSKU, domainTableFieldNameMap);
            for (Map<String, Object> sku : repeatSku) {
                Object md5 = sku.get("freeValueIdsMd5");
                Object productId = sku.get("productId");
                Long skuId = null;
                ArrayList<Long> delSkuIds = new ArrayList<Long>();
                List<Map<String, Object>> skusInDb = this.getRepeatSkuId(md5, productId);
                if (CollectionUtils.isEmpty(skusInDb)) continue;
                for (int index = 0; index < skusInDb.size(); ++index) {
                    if (index == 0) {
                        skuId = Long.parseLong(skusInDb.get(index).get("id").toString());
                        continue;
                    }
                    delSkuIds.add(Long.parseLong(skusInDb.get(index).get("id").toString()));
                }
                if (null == skuId || CollectionUtils.isEmpty(delSkuIds)) continue;
                RepeatSkuRepairResult repeatSkuRepairResult = new RepeatSkuRepairResult();
                repeatSkuRepairResult.setDealStatus(Integer.valueOf(1));
                String resultSqls = this.replaceSkuIdDoamain(skuId, delSkuIds, repeatSkuRepairResult, domainTableFieldNameMap);
                this.deleleteRepeatSku(delSkuIds);
                this.writeResult(skuId, delSkuIds, resultSqls, repeatSkuRepairResult);
            }
        }
    }

    private void writeResult(Long skuId, List<Long> delSkuIds, String resultSqls, RepeatSkuRepairResult repeatSkuRepairResult) throws Exception {
        repeatSkuRepairResult.setEntityStatus(EntityStatus.Insert);
        repeatSkuRepairResult.setId((Object)String.valueOf(IdManager.getInstance().nextId()));
        repeatSkuRepairResult.setSkuId(skuId.toString());
        repeatSkuRepairResult.setDelSkuIds(this.getDelSkuIdsStr(delSkuIds));
        repeatSkuRepairResult.setResult(resultSqls);
        MetaDaoHelper.insert((String)"coredoc.common.RepeatSkuRepairResult", (BizObject)repeatSkuRepairResult);
    }

    private void deleleteRepeatSku(List<Long> delSkuIds) throws Exception {
        if (!CollectionUtils.isEmpty(delSkuIds)) {
            String idsStr = "";
            for (int i = 0; i < delSkuIds.size(); ++i) {
                idsStr = idsStr + delSkuIds.get(i);
                if (i >= delSkuIds.size() - 1) continue;
                idsStr = idsStr + ",";
            }
            String yTenantId = AppContext.getCurrentUser().getYTenantId();
            StringBuilder sql = new StringBuilder();
            sql.append("update productskudetailnew set ytenant_id = '-" + yTenantId + "', tenant_id = -tenant_id ").append(" where skuid in (").append(idsStr).append(") and ytenant_id = '").append(yTenantId).append("';");
            sql.append("update skufreecharacteritem  set ytenant_id = '-" + yTenantId + "' ").append(" where sku_id in (").append(idsStr).append(") and ytenant_id = '").append(yTenantId).append("';");
            sql.append("update productsku set ytenant_id = '-" + yTenantId + "', iDeleted = 0 , tenant_id = -tenant_id ").append(" where id in (").append(idsStr).append(") and ytenant_id = '").append(yTenantId).append("';");
            HashMap<String, String> params = new HashMap<String, String>(2);
            params.put("sql", sql.toString());
            SqlHelper.update((String)"com.yonyou.ucf.mdd.ext.meta.dao.selectList", params);
        }
    }

    private String replaceSkuIdDoamain(Long skuId, List<Long> delSkuIds, RepeatSkuRepairResult repeatSkuRepairResult, Map<String, Map<String, String>> domainTableFieldNameMap) throws Exception {
        HashMap<String, Map<String, Map<String, String>>> allDomainSql = new HashMap<String, Map<String, Map<String, String>>>(16);
        for (String domain : domains) {
            this.dealDomainData(skuId, delSkuIds, domain, allDomainSql, repeatSkuRepairResult, domainTableFieldNameMap);
        }
        this.dealEdData(skuId, delSkuIds, allDomainSql, repeatSkuRepairResult);
        return JSONObject.toJSONString(allDomainSql);
    }

    private void getDependencyAttributesByUri(String uri, Map<String, Map<String, String>> domainTableFieldNameMap) throws Exception {
        List dependencyAttributes = this.metadataDependencyService.getDependencyAttributes(uri, new HashSet());
        block0: for (IDependencyAttribute dependencyAttribute : dependencyAttributes) {
            IAttribute dependencyAttribute1 = dependencyAttribute.getDependencyAttribute();
            IEntity propEntity = dependencyAttribute.getDependencyEntity();
            if (null == dependencyAttribute1 || null == propEntity) continue;
            String propDomain = propEntity.getDomain();
            String propertyName = dependencyAttribute1.getName();
            if (!StringUtils.isNotEmpty((CharSequence)propEntity.getTableName()) || excludeUris.contains(propEntity.getFullName()) || !domains.contains(propDomain)) continue;
            if (null == domainTableFieldNameMap.get(propDomain)) {
                domainTableFieldNameMap.put(propDomain, new HashMap());
            }
            Map<String, String> fieldTableName = domainTableFieldNameMap.get(propDomain);
            List attributes = propEntity.getAttributes();
            for (IAttribute pro : attributes) {
                if (!(pro instanceof IColumnAttribute) || null == pro.getName() || !pro.getName().equals(propertyName)) continue;
                IColumnAttribute proColumn = (IColumnAttribute)pro;
                fieldTableName.put(proColumn.getTableName(), proColumn.getColumnName());
                continue block0;
            }
        }
    }

    private void dealEdData(Long skuId, List<Long> delSkuIds, Map<String, Map<String, Map<String, String>>> allDomainSql, RepeatSkuRepairResult repeatSkuRepairResult) {
        HashMap edResultMap = new HashMap();
        HashMap<String, String> successMap = new HashMap<String, String>();
        HashMap<String, String> failMap = new HashMap<String, String>();
        edResultMap.put("success", successMap);
        edResultMap.put("failed", failMap);
        allDomainSql.put("engineringdata", edResultMap);
        HashMap<String, Object> params = new HashMap<String, Object>();
        params.put("skuId", skuId);
        params.put("delSkuIds", delSkuIds);
        HashMap<String, String> headers = new HashMap<String, String>();
        headers.put("Content-Type", "application/json");
        headers.put("yht_access_token", InvocationInfoProxy.getYhtAccessToken());
        String domainUrl = this.ymsParamConfig.getDomainYonbipmmMfed();
        String url = domainUrl + "/edMaterial/repairBillMaterialBySku";
        YmsHttpHeader ymsHttpHeader = new YmsHttpHeader();
        ymsHttpHeader.add("Content-Type", "application/json;charset=utf-8");
        YmsHttpRequest request = new YmsHttpRequestBuilder().url(url).method(YmsHttpMethod.POST).body((Object)JSON.toJSONString(params)).addHeader(ymsHttpHeader.addAllMap(headers)).build();
        try (YmsHttpResponse ymsHttpResponse = this.ymsHttpClient.execute(request);){
            String result = ymsHttpResponse.getBodyString();
            Map map = (Map)JSONObject.parseObject((String)result, Map.class);
            Object code = map.get("code");
            if (code != null && "200".equals(code.toString())) {
                successMap.put("nofullname", result);
            } else {
                failMap.put("nofullname", result);
                failMap.put("params", JSON.toJSONString(params));
                failMap.put("yht_access_token", InvocationInfoProxy.getYhtAccessToken());
                repeatSkuRepairResult.setDealStatus(Integer.valueOf(2));
            }
        }
        catch (Exception e) {
            log.error(this.getClass() + e.getMessage(), (Throwable)e);
            failMap.put("nofullname", e.getMessage());
            failMap.put("msg", e.getMessage());
            failMap.put("params", JSON.toJSONString(params));
            failMap.put("yht_access_token", InvocationInfoProxy.getYhtAccessToken());
            repeatSkuRepairResult.setDealStatus(Integer.valueOf(2));
        }
    }

    private List<Map<String, Object>> getRepeatSkuId(Object freeValueIdsMd5, Object productId) throws Exception {
        QueryConditionGroup queryConditionGroup = QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"freeValueIdsMd5").eq(freeValueIdsMd5), QueryCondition.name((String)"productId").eq(productId)});
        QuerySchema schema = QuerySchema.create().addSelect("code, id").addCondition((ConditionExpression)queryConditionGroup).addOrderBy("id asc");
        List skusInDb = MetaDaoHelper.query((String)"pc.product.ProductSKU", (QuerySchema)schema);
        return skusInDb;
    }

    private List<Map<String, Object>> getRepeatSku(Long productId) {
        StringBuilder sql = new StringBuilder();
        sql.append("select free_value_ids_md5 as freeValueIdsMd5, productId as productId from productsku where ytenant_id = '");
        sql.append(AppContext.getYhtTenantId().toString()).append("' ");
        sql.append(" and tenant_id = ").append(AppContext.getTenantId().toString());
        if (null != productId) {
            sql.append(" and productId = " + productId);
        }
        sql.append(" group by productId, free_value_ids_md5 HAVING count(productId) > 1 ");
        HashMap<String, String> querySqlMap = new HashMap<String, String>();
        querySqlMap.put("sql", sql.toString());
        List repeatsMd5s = SqlHelper.selectList((String)"com.yonyou.ucf.mdd.ext.meta.dao.selectList", querySqlMap);
        return repeatsMd5s;
    }

    private List<Tenant> getTenants(IYmsJdbcApi ymsJdbcApi, Long beginTenantId, Long endTenantId) {
        String sql = "select id,tenantcenter_id,ytenant_id from tenant where id >=" + beginTenantId + " and id <" + endTenantId;
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

    private void dealDomainData(Long skuId, List<Long> delSkuIds, String domain, Map<String, Map<String, Map<String, String>>> allDomainSql, RepeatSkuRepairResult repeatSkuRepairResult, Map<String, Map<String, String>> domainTableFieldNameMap) throws Exception {
        IComOperateApi comOperateApi = (IComOperateApi)IrisDynamicInvokeUtil.getService((String)domain, (String)"c87e2267-1001-4c70-bb2a-ab41f3b81aa3", null, IComOperateApi.class);
        if (null != comOperateApi) {
            Map<String, Map<String, String>> domainSqls;
            if (null == allDomainSql.get(domain)) {
                allDomainSql.put(domain, new HashMap());
            }
            if (null == (domainSqls = allDomainSql.get(domain)).get("success")) {
                domainSqls.put("success", new HashMap());
            }
            Map<String, String> successSql = domainSqls.get("success");
            if (null == domainSqls.get("failed")) {
                domainSqls.put("failed", new HashMap());
            }
            Map<String, String> failedSql = domainSqls.get("failed");
            StringBuilder sqlBuilder = new StringBuilder();
            this.scanAndReplaceSkuId(skuId, delSkuIds, domain, sqlBuilder, domainTableFieldNameMap);
            if (StringUtils.isNotEmpty((CharSequence)sqlBuilder)) {
                HashMap<String, StringBuilder> params = new HashMap<String, StringBuilder>(2);
                params.put("sql", sqlBuilder);
                try {
                    comOperateApi.executeSql("com.yonyou.ucf.mdd.ext.meta.dao.update", params);
                    successSql.put("success", sqlBuilder.toString());
                }
                catch (Exception e) {
                    failedSql.put("failed", sqlBuilder.toString());
                    failedSql.put("msg", e.getMessage());
                    log.error(this.getClass() + ".scanAndReplaceSkuId failed " + sqlBuilder, (Throwable)e);
                    repeatSkuRepairResult.setDealStatus(Integer.valueOf(2));
                }
            }
        }
    }

    private void scanAndReplaceSkuId(Long skuId, List<Long> delSkuIds, String domain, StringBuilder sqlBuilder, Map<String, Map<String, String>> domainTableFieldNameMap) {
        String delIdsStr = this.getDelSkuIdsStr(delSkuIds);
        Map<String, String> fieldTableName = domainTableFieldNameMap.get(domain);
        if (fieldTableName != null && !fieldTableName.isEmpty()) {
            for (Map.Entry<String, String> next : fieldTableName.entrySet()) {
                String tableName = next.getKey();
                String field = next.getValue();
                sqlBuilder.append(" update ");
                sqlBuilder.append(tableName);
                sqlBuilder.append(" set ");
                sqlBuilder.append(field);
                sqlBuilder.append(" = ");
                sqlBuilder.append(skuId);
                sqlBuilder.append(" where ");
                sqlBuilder.append(" ytenant_id = '");
                sqlBuilder.append(AppContext.getYhtTenantId().toString());
                sqlBuilder.append("' and ");
                sqlBuilder.append(field);
                sqlBuilder.append(" in ( ");
                sqlBuilder.append(delIdsStr);
                sqlBuilder.append(" ); ");
            }
        }
    }

    private String getDelSkuIdsStr(List<Long> delSkuIds) {
        String idsStr = "";
        for (int i = 0; i < delSkuIds.size(); ++i) {
            if (i == 0) {
                idsStr = idsStr + delSkuIds.get(i);
                continue;
            }
            idsStr = idsStr + ",";
            idsStr = idsStr + delSkuIds.get(i);
        }
        return idsStr;
    }

    public String repairSkuDetailByTenant(Long beginTenantId, Long endTenantId) {
        YmsJdbcApiProvider ymsJdbcApiProvider = YmsJdbcApiProviderFactory.getYmsJdbcApiProvider();
        Supplier federalYmsJdbcApi = ymsJdbcApiProvider.getFederalYmsJdbcApi("iuap-apdoc-material_main_dataSource");
        List iYmsJdbcApis = (List)federalYmsJdbcApi.get();
        for (IYmsJdbcApi ymsJdbcApi : iYmsJdbcApis) {
            List<Tenant> tenants = this.getTenants(ymsJdbcApi, beginTenantId, endTenantId);
            if (CollectionUtils.isEmpty(tenants)) continue;
            for (Tenant tenant : tenants) {
                RobotExecutors.runAs((String)tenant.getTenantCenter(), () -> {
                    try {
                        this.dealRepeatSkuDetailByTenantId();
                    }
                    catch (Exception e) {
                        log.error(RepairSkuService.class + " repairSkuDetailByTenant \u5904\u7406\u79df\u6237\u7ea7\u6570\u636e\u5f02\u5e38\uff1a" + tenant.getYTenantId() + " " + e.getMessage(), (Throwable)e);
                    }
                }, (ExecutorService)YmsExecutors.getYmsExecutor());
            }
        }
        return InternationalUtils.getMessageWithDefault((String)"UID:P_COREDOC-BE_1823B80A05880026", (String)"\u6570\u636e\u5904\u7406\u4e2d");
    }

    public String dealRepeatSkuDetailByTenantId() throws Exception {
        HashMap<String, Object> params = new HashMap<String, Object>(2);
        params.put("ytenantId", AppContext.getYhtTenantId());
        List skuDetails = SqlHelper.selectList((String)"com.yonyoucloud.upc.productsku.dao.ProductSKURealm.getSkuDetailErrorDatasByTenant", params);
        if (!CollectionUtils.isEmpty((Collection)skuDetails)) {
            Long skuId;
            HashMap skuGroupDetails = new HashMap(skuDetails.size());
            for (Map data : skuDetails) {
                skuId = Long.parseLong(data.get("id").toString());
                if (!skuGroupDetails.containsKey(skuId)) {
                    skuGroupDetails.put(skuId, new ArrayList());
                }
                List skuIdDetails = (List)skuGroupDetails.get(skuId);
                skuIdDetails.add(data);
            }
            if (!skuGroupDetails.isEmpty()) {
                for (Map.Entry dataEntry : skuGroupDetails.entrySet()) {
                    skuId = (Long)dataEntry.getKey();
                    List datas = (List)dataEntry.getValue();
                    QuerySchema schema = QuerySchema.create().addSelect("*").addCondition((ConditionExpression)QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"skuId").eq((Object)skuId)}));
                    List skuExtends = MetaDaoHelper.query((String)"pc.product.ProductSKUExtend", (QuerySchema)schema);
                    if (CollectionUtils.isEmpty((Collection)skuExtends)) continue;
                    Map skuExtend = (Map)skuExtends.get(0);
                    ArrayList<ProductSkuDetailNew> skuDetailNewList = new ArrayList<ProductSkuDetailNew>();
                    ArrayList<ProductSKUDetail> skuDetailList = new ArrayList<ProductSKUDetail>();
                    for (Map data : datas) {
                        ProductSkuDetailNew skuDetailNew = new ProductSkuDetailNew();
                        ProductSKUDetail skuDetail = new ProductSKUDetail();
                        skuDetailNew.putAll(skuExtend);
                        skuDetail.putAll(skuExtend);
                        skuDetailNew.setProductApplyRangeId(Long.valueOf(Long.parseLong(data.get("rangeId").toString())));
                        skuDetailNew.setProductDetailId(Long.valueOf(Long.parseLong(data.get("productDetailId").toString())));
                        skuDetailNew.setId((Object)IdManager.getInstance().nextId());
                        skuDetailNew.setEntityStatus(EntityStatus.Insert);
                        skuDetailNewList.add(skuDetailNew);
                        skuDetail.putAll(skuExtend);
                        skuDetail.setProductApplyRangeId(Long.valueOf(Long.parseLong(data.get("rangeId").toString())));
                        skuDetail.setId((Object)IdManager.getInstance().nextId());
                        skuDetail.setEntityStatus(EntityStatus.Insert);
                        skuDetailList.add(skuDetail);
                        if (skuDetailNewList.size() <= 500) continue;
                        MetaDaoHelper.insert((String)"pc.product.ProductSkuDetailNew", skuDetailNewList);
                        MetaDaoHelper.insert((String)"pc.product.ProductSKUDetail", skuDetailList);
                        skuDetailNewList.clear();
                        skuDetailList.clear();
                    }
                    MetaDaoHelper.insert((String)"pc.product.ProductSkuDetailNew", skuDetailNewList);
                    MetaDaoHelper.insert((String)"pc.product.ProductSKUDetail", skuDetailList);
                }
            }
        }
        return "success";
    }

    static {
        excludeUris.add("st.AnyuechenTestInRecored.AnyuechenTestInRecoreds");
        excludeUris.add("quote.coursewaresaleorder.SaleOrderDetail");
        excludeUris.add("voucher.order.OrderShippingPlan");
        excludeUris.add("ec.ec_liygytest.LiygytestDemoSubTable");
        excludeUris.add("ec.crxTestStatement.CrxTestStatementDetail");
        domains.add("yonbip-scm-scmbd");
        domains.add("ustock");
        domains.add("udinghuo");
        domains.add("upu");
        domains.add("sact");
        domains.add("quote");
        domains.add("cpu-base");
        domains.add("retail");
        domains.add("dst");
        domains.add("umall");
        domains.add("upromotion");
        domains.add("dispatchCenter");
        domains.add("yonbip-mm-qms");
    }
}


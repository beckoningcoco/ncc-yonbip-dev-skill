/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.yonyou.iuap.BusinessException
 *  com.yonyou.iuap.apdoc.coredoc.config.YMSParamConfig
 *  com.yonyou.iuap.apdoc.coredoc.enums.CoreDocBusinessErrorEnum
 *  com.yonyou.iuap.apdoc.coredoc.exceptions.CoreDocBusinessException
 *  com.yonyou.iuap.apdoc.coredoc.service.config.YmsThreadPoolConfig4UPC
 *  com.yonyou.iuap.apdoc.coredoc.service.elasticsearch.ESQueryCacheService
 *  com.yonyou.iuap.apdoc.coredoc.service.elasticsearch.ElasticsearchManager
 *  com.yonyou.iuap.apdoc.coredoc.utils.LocalESCacheUtil
 *  com.yonyou.iuap.context.InvocationInfoProxy
 *  com.yonyou.iuap.yms.multitenant.UserExecutors
 *  com.yonyou.ucf.mdd.ext.core.AppContext
 *  com.yonyou.ucf.mdd.ext.model.BillContext
 *  com.yonyou.ucf.mdd.plugin.base.QuerySchemaExecutorPlugin
 *  org.imeta.core.base.ConditionOperator
 *  org.imeta.core.model.Entity
 *  org.imeta.orm.schema.ConditionExpression
 *  org.imeta.orm.schema.QueryCondition
 *  org.imeta.orm.schema.QueryConditionGroup
 *  org.imeta.orm.schema.QuerySchema
 *  org.slf4j.Logger
 *  org.slf4j.LoggerFactory
 *  org.springframework.beans.factory.annotation.Autowired
 *  org.springframework.data.redis.core.RedisTemplate
 *  org.springframework.stereotype.Component
 *  org.springframework.util.CollectionUtils
 *  org.springframework.util.StringUtils
 */
package com.yonyoucloud.upc.divert;

import com.yonyou.iuap.BusinessException;
import com.yonyou.iuap.apdoc.coredoc.config.YMSParamConfig;
import com.yonyou.iuap.apdoc.coredoc.enums.CoreDocBusinessErrorEnum;
import com.yonyou.iuap.apdoc.coredoc.exceptions.CoreDocBusinessException;
import com.yonyou.iuap.apdoc.coredoc.service.config.YmsThreadPoolConfig4UPC;
import com.yonyou.iuap.apdoc.coredoc.service.elasticsearch.ESQueryCacheService;
import com.yonyou.iuap.apdoc.coredoc.service.elasticsearch.ElasticsearchManager;
import com.yonyou.iuap.apdoc.coredoc.utils.LocalESCacheUtil;
import com.yonyou.iuap.context.InvocationInfoProxy;
import com.yonyou.iuap.yms.multitenant.UserExecutors;
import com.yonyou.ucf.mdd.ext.core.AppContext;
import com.yonyou.ucf.mdd.ext.model.BillContext;
import com.yonyou.ucf.mdd.plugin.base.QuerySchemaExecutorPlugin;
import java.util.Collection;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.Optional;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import org.imeta.core.base.ConditionOperator;
import org.imeta.core.model.Entity;
import org.imeta.orm.schema.ConditionExpression;
import org.imeta.orm.schema.QueryCondition;
import org.imeta.orm.schema.QueryConditionGroup;
import org.imeta.orm.schema.QuerySchema;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Component;
import org.springframework.util.CollectionUtils;
import org.springframework.util.StringUtils;

@Component
public class QuerySchemalExecutorAspector
implements QuerySchemaExecutorPlugin {
    private final Logger logger = LoggerFactory.getLogger(this.getClass());
    @Autowired
    private ESQueryCacheService esQueryCacheService;
    @Autowired
    private YmsThreadPoolConfig4UPC ymsThreadPoolConfig4UPC;
    private ExecutorService esQueryExecutorService;
    @Autowired
    RedisTemplate redisTemplate;
    @Autowired
    private YMSParamConfig ymsParamConfig;
    @Autowired
    ElasticsearchManager elasticsearchManager;

    public void extendQuerySchema(Entity entity, QuerySchema schema, BillContext billContext) {
        block10: {
            try {
                if (!this.ymsParamConfig.getEsReplaceLikeFlag().booleanValue()) break block10;
                if (InvocationInfoProxy.getTenantid() == null) {
                    return;
                }
                if (LocalESCacheUtil.get((String)"fullNameKey_for_esquery") == null) {
                    this.esQueryCacheService.initEsConditionCache();
                }
                if (LocalESCacheUtil.get((String)"fullNameKey_for_esquery") == null || entity.fullname() == null || !LocalESCacheUtil.get((String)"fullNameKey_for_esquery").toString().contains(entity.fullname())) break block10;
                if (this.esQueryCacheService.isCloseES(InvocationInfoProxy.getTenantid()).booleanValue()) {
                    return;
                }
                QueryConditionGroup queryConditionGroup = schema.queryConditionGroup();
                if (null == queryConditionGroup) break block10;
                Boolean isSmartSearch = AppContext.getThreadContext((String)"searchType") != null && "smartSearch".equals(AppContext.getThreadContext((String)"searchType"));
                Runnable runnable = () -> {
                    this.logger.info("\u4e1a\u52a1\u4f7f\u7528 tenantId:{} userId:{}", (Object)InvocationInfoProxy.getTenantid(), (Object)InvocationInfoProxy.getUserid());
                    try {
                        this.dealConditionGroup(queryConditionGroup, entity.fullname(), InvocationInfoProxy.getTenantid(), isSmartSearch);
                    }
                    catch (BusinessException e) {
                        throw new CoreDocBusinessException(null, e.getMessage());
                    }
                    catch (Exception e) {
                        this.logger.error("\u5207\u5165ES\u6a21\u7cca\u67e5\u8be2\u5f02\u5e38{}" + e.getMessage(), (Throwable)e);
                    }
                };
                Future future = UserExecutors.executeInDetachedThread((ExecutorService)this.getEsQueryExecutorService(), (Runnable)runnable);
                try {
                    future.get(2L, TimeUnit.SECONDS);
                }
                catch (ExecutionException e) {
                    this.logger.error("\u4efb\u52a1\u6267\u884c\u51fa\u73b0\u5f02\u5e38");
                }
                catch (TimeoutException e) {
                    this.logger.error("\u83b7\u53d6\u7ed3\u679c\u8d85\u65f6");
                    boolean cancelled = future.cancel(true);
                    if (cancelled) {
                        this.logger.error("\u4efb\u52a1\u5df2\u6210\u529f\u53d6\u6d88");
                    }
                    this.logger.error("\u4efb\u52a1\u53d6\u6d88\u5931\u8d25");
                }
                if (isSmartSearch.booleanValue()) {
                    AppContext.delThreadContext((String)"searchType");
                }
            }
            catch (Exception e) {
                this.logger.error("\u5207\u5165ES\u6a21\u7cca\u67e5\u8be2\u5f02\u5e38{}" + e.getMessage(), (Throwable)e);
            }
        }
    }

    private void dealConditionGroup(QueryConditionGroup conditionGroup, String fullname, String yhtTenantId, Boolean isSmartSearch) throws Exception {
        List expressions = conditionGroup.conditions();
        ListIterator<QueryCondition> conditionIterator = expressions.listIterator();
        while (conditionIterator.hasNext()) {
            ConditionExpression expression = (ConditionExpression)conditionIterator.next();
            if (expression instanceof QueryConditionGroup) {
                this.dealConditionGroup((QueryConditionGroup)expression, fullname, yhtTenantId, isSmartSearch);
            }
            if (!(expression instanceof QueryCondition)) continue;
            QueryCondition condition = (QueryCondition)expression;
            ConditionOperator op = condition.op();
            String field = condition.field();
            if (ConditionOperator.like != op) continue;
            String cacheKey = this.esQueryCacheService.getEsQryReidsKey(fullname, field);
            String esIndex = "";
            String esField = "";
            String queryId = "";
            String filedDesc = "";
            Object val = condition.v1();
            if (val != null && val.toString().length() > 20) continue;
            if (LocalESCacheUtil.get((String)cacheKey) == null) {
                esIndex = Optional.ofNullable(this.redisTemplate.opsForHash().get((Object)cacheKey, (Object)"es_index")).map(Object::toString).orElse("");
                esField = Optional.ofNullable(this.redisTemplate.opsForHash().get((Object)cacheKey, (Object)"es_field")).map(Object::toString).orElse("");
                queryId = Optional.ofNullable(this.redisTemplate.opsForHash().get((Object)cacheKey, (Object)"query_id")).map(Object::toString).orElse("");
                filedDesc = Optional.ofNullable(this.redisTemplate.opsForHash().get((Object)cacheKey, (Object)"field_desc")).map(Object::toString).orElse("");
            } else {
                Map cacheMap = (Map)LocalESCacheUtil.get((String)cacheKey);
                if (cacheMap != null && !cacheMap.isEmpty()) {
                    esIndex = Optional.ofNullable(cacheMap.get("es_index")).map(Object::toString).orElse("");
                    esField = Optional.ofNullable(cacheMap.get("es_field")).map(Object::toString).orElse("");
                    queryId = Optional.ofNullable(cacheMap.get("query_id")).map(Object::toString).orElse("");
                    filedDesc = Optional.ofNullable(cacheMap.get("field_desc")).map(Object::toString).orElse("");
                }
            }
            if (!StringUtils.hasText((String)esIndex) || !StringUtils.hasText((String)esField) || !StringUtils.hasText((String)queryId)) continue;
            List ids = this.elasticsearchManager.getIdsByConditionFromSmartSearch(esField, esIndex, val, yhtTenantId);
            if (ids.size() >= 5000) {
                if (isSmartSearch.booleanValue() || !this.ymsParamConfig.getEsErrorHint().booleanValue()) {
                    ids = ids.subList(0, this.ymsParamConfig.getEsSearchMaxPageSize());
                } else {
                    if (this.ymsParamConfig.getOverMaxNumDowngrade2DB().booleanValue()) {
                        throw new Exception("ES\u67e5\u8be2ID\u8fd4\u56de\u6570\u91cf\u8d85\u8fc7\u9884\u8bbe\u6700\u5927\u503c\uff0c\u964d\u7ea7\u81f3\u6570\u636e\u5e93\u67e5\u8be2");
                    }
                    throw new CoreDocBusinessException(CoreDocBusinessErrorEnum.COMMON_QUERY_RESULT, new Object[]{filedDesc, 5000});
                }
            }
            QueryCondition tempCondition = CollectionUtils.isEmpty((Collection)ids) ? new QueryCondition(queryId, ConditionOperator.eq, (Object)-1) : new QueryCondition(queryId, ConditionOperator.in, (Object)ids);
            conditionIterator.set(tempCondition);
        }
    }

    public ExecutorService getEsQueryExecutorService() {
        if (this.esQueryExecutorService == null) {
            this.esQueryExecutorService = this.ymsThreadPoolConfig4UPC.getFixedThreadPoolExecutor("esQuery");
        }
        return this.esQueryExecutorService;
    }

    public int order() {
        return 0;
    }
}


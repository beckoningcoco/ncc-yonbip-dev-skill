/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.alibaba.fastjson.util.TypeUtils
 *  com.yonyou.iuap.apdoc.coredoc.enums.CoreExtrateBusinessErrorEnum
 *  com.yonyou.iuap.apdoc.coredoc.exceptions.CoreDocBusinessException
 *  com.yonyou.ucf.mdd.ext.dao.meta.MetaDaoHelper
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
package com.yonyoucloud.upc.service.api;

import com.alibaba.fastjson.util.TypeUtils;
import com.yonyou.iuap.apdoc.coredoc.enums.CoreExtrateBusinessErrorEnum;
import com.yonyou.iuap.apdoc.coredoc.exceptions.CoreDocBusinessException;
import com.yonyou.ucf.mdd.ext.dao.meta.MetaDaoHelper;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
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
public class MCUpdateEventHandlerCommon {
    Logger logger = LoggerFactory.getLogger(MCUpdateEventHandlerCommon.class);

    public int getDivisor(int totalCount, int pageSize) {
        int divisor = totalCount / pageSize;
        int remainder = totalCount % pageSize;
        if (remainder > 0) {
            ++divisor;
        }
        return divisor;
    }

    public List<String> getSelfCreateVoucherByCreateOrg(String fullName, String field, String createOrg, int pageIndex, int pageSize) {
        try {
            List<String> idList = new ArrayList<String>();
            QuerySchema querySchema = QuerySchema.create();
            querySchema.addSelect("id");
            querySchema.addCondition((ConditionExpression)QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)field).eq((Object)createOrg)}));
            querySchema.addOrderBy("id");
            QueryPager queryPager = new QueryPager();
            queryPager.setPageIndex(pageIndex);
            queryPager.setPageSize(pageSize);
            querySchema.pager(queryPager);
            List bizObjectList = MetaDaoHelper.queryObject((String)fullName, (QuerySchema)querySchema, null);
            if (!CollectionUtils.isEmpty((Collection)bizObjectList)) {
                idList = bizObjectList.stream().map(map -> map.getId().toString()).collect(Collectors.toList());
            }
            return idList;
        }
        catch (Exception e) {
            this.logger.error("\u5206\u7ea7\u7ba1\u63a7\u67e5\u8be2CreateOrg" + e.getMessage(), (Throwable)e);
            throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_801265);
        }
    }

    public int getTotalCount(String fullName, String field, String createOrg) {
        try {
            int totalCount = 0;
            QuerySchema querySchema = QuerySchema.create();
            querySchema.addSelect("id");
            querySchema.addCondition((ConditionExpression)QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)field).eq((Object)createOrg)}));
            querySchema.isCountSchema(true);
            List idList = MetaDaoHelper.query((String)fullName, (QuerySchema)querySchema, null);
            if (!CollectionUtils.isEmpty((Collection)idList)) {
                totalCount = TypeUtils.castToLong(((Map)idList.get(0)).get("totalCount")).intValue();
            }
            return totalCount;
        }
        catch (Exception e) {
            this.logger.error("\u5206\u7ea7\u7ba1\u63a7\u67e5\u8be2\u603b\u6570\u62a5\u9519" + e.getMessage(), (Throwable)e);
            throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_801266);
        }
    }
}


/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.yonyou.ucf.mdd.ext.core.AppContext
 *  com.yonyou.ucf.mdd.ext.dao.meta.MetaDaoHelper
 *  com.yonyou.ucf.mdd.ext.model.LoginUser
 *  com.yonyou.ucf.mdd.ext.poi.model.ExcelStreamingThreadLocalHolder
 *  org.imeta.orm.schema.ConditionExpression
 *  org.imeta.orm.schema.QueryCondition
 *  org.imeta.orm.schema.QueryConditionGroup
 *  org.imeta.orm.schema.QuerySchema
 *  org.springframework.stereotype.Service
 *  org.springframework.util.CollectionUtils
 */
package com.yonyoucloud.iuap.upc.dataauth;

import com.yonyou.ucf.mdd.ext.core.AppContext;
import com.yonyou.ucf.mdd.ext.dao.meta.MetaDaoHelper;
import com.yonyou.ucf.mdd.ext.model.LoginUser;
import com.yonyou.ucf.mdd.ext.poi.model.ExcelStreamingThreadLocalHolder;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.imeta.orm.schema.ConditionExpression;
import org.imeta.orm.schema.QueryCondition;
import org.imeta.orm.schema.QueryConditionGroup;
import org.imeta.orm.schema.QuerySchema;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;

@Service
public class PersonService {
    public String getCurrentPersonId() throws Exception {
        LoginUser user = AppContext.getCurrentUser();
        return this.getCurrentPersonId(user.getYhtTenantId(), user.getYhtUserId());
    }

    public void setCurrentPersonId(String personId) {
        LoginUser user = AppContext.getCurrentUser();
        String redisKey = "personId_" + user.getYhtTenantId() + "_" + user.getYhtUserId();
        if (personId == null) {
            AppContext.cache().set(redisKey, "null", 300);
        } else {
            AppContext.cache().set(redisKey, personId, 3600);
        }
    }

    public String getCurrentPersonId(String yhtTenantId, String yhtUserId) throws Exception {
        String redisKey = "personId_" + yhtTenantId + "_" + yhtUserId;
        String personId = AppContext.cache().get(redisKey);
        if (personId == null) {
            QueryConditionGroup conditionGroup = QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"user_id").eq((Object)yhtUserId), QueryCondition.name((String)"dr").eq((Object)0), QueryCondition.name((String)"enable").eq((Object)1), QueryCondition.name((String)"is_outer_staff").eq((Object)0)});
            QuerySchema schema = QuerySchema.create().addSelect("id").addCondition((ConditionExpression)conditionGroup);
            ExcelStreamingThreadLocalHolder.addIgnoreStreamingQueryFullName((String[])new String[]{"bd.staff.Staff"});
            List staffList = MetaDaoHelper.query((String)"bd.staff.Staff", (QuerySchema)schema, (String)"ucf-staff-center");
            if (!CollectionUtils.isEmpty((Collection)staffList) && staffList.size() > 0) {
                personId = (String)((Map)staffList.get(0)).get("id");
            }
            if (personId == null) {
                AppContext.cache().set(redisKey, "null", 300);
            } else {
                AppContext.cache().set(redisKey, personId, 3600);
            }
            return personId;
        }
        return "null".equals(personId) ? null : personId;
    }

    public String currentPersionName(String id) throws Exception {
        QueryConditionGroup conditionGroup = QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"id").eq((Object)id)});
        QuerySchema schema = QuerySchema.create().addSelect("name").addCondition((ConditionExpression)conditionGroup);
        List staffList = MetaDaoHelper.query((String)"bd.staff.Staff", (QuerySchema)schema, (String)"ucf-staff-center");
        String persionName = null;
        if (!CollectionUtils.isEmpty((Collection)staffList) && staffList.size() > 0) {
            persionName = (String)((Map)staffList.get(0)).get("name");
        }
        return persionName;
    }

    public Map<String, Object> getCurrentPerson() throws Exception {
        LoginUser currentUser = AppContext.getCurrentUser();
        QueryConditionGroup conditionGroup = QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"user_id").eq((Object)currentUser.getYhtUserId()), QueryCondition.name((String)"dr").eq((Object)0), QueryCondition.name((String)"enable").eq((Object)1)});
        QuerySchema querySchema = QuerySchema.create().addSelect("id,name,code as currentPersonCode,email").addCondition((ConditionExpression)conditionGroup);
        List staffList = MetaDaoHelper.query((String)"bd.staff.Staff", (QuerySchema)querySchema, (String)"ucf-staff-center");
        if (!CollectionUtils.isEmpty((Collection)staffList) && staffList.size() > 0) {
            return (Map)staffList.get(0);
        }
        return new HashMap<String, Object>();
    }
}


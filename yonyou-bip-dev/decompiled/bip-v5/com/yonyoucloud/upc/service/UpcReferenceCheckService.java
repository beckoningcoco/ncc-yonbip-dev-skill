/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.yonyou.iuap.apdoc.coredoc.enums.CoreExtrateBusinessErrorEnum
 *  com.yonyou.iuap.apdoc.coredoc.exceptions.CoreDocBusinessException
 *  com.yonyou.ucf.mdd.ext.dao.meta.MetaDaoHelper
 *  com.yonyoucloud.upc.common.UpcReferenceCheck
 *  com.yonyoucloud.upc.data.upcReferenceCheck.UpcReferenceCheckDao
 *  org.imeta.orm.schema.ConditionExpression
 *  org.imeta.orm.schema.QueryCondition
 *  org.imeta.orm.schema.QueryConditionGroup
 *  org.imeta.orm.schema.QuerySchema
 *  org.slf4j.Logger
 *  org.slf4j.LoggerFactory
 *  org.springframework.beans.factory.annotation.Autowired
 *  org.springframework.stereotype.Service
 *  org.springframework.util.CollectionUtils
 */
package com.yonyoucloud.upc.service;

import com.yonyou.iuap.apdoc.coredoc.enums.CoreExtrateBusinessErrorEnum;
import com.yonyou.iuap.apdoc.coredoc.exceptions.CoreDocBusinessException;
import com.yonyou.ucf.mdd.ext.dao.meta.MetaDaoHelper;
import com.yonyoucloud.upc.common.UpcReferenceCheck;
import com.yonyoucloud.upc.data.upcReferenceCheck.UpcReferenceCheckDao;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import org.imeta.orm.schema.ConditionExpression;
import org.imeta.orm.schema.QueryCondition;
import org.imeta.orm.schema.QueryConditionGroup;
import org.imeta.orm.schema.QuerySchema;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;

@Service
public class UpcReferenceCheckService {
    Logger logger = LoggerFactory.getLogger(UpcReferenceCheckService.class);
    @Autowired
    private UpcReferenceCheckDao upcReferenceCheckDao;

    public void adminOrgCheck(String id) throws Exception {
        List<UpcReferenceCheck> upcReferenceCheckRedisList = this.setUnionKeyCheckLicenseRedis("org");
        if (!CollectionUtils.isEmpty(upcReferenceCheckRedisList)) {
            for (UpcReferenceCheck upcReferenceCheck : upcReferenceCheckRedisList) {
                if (!this.commonCheckQuery(upcReferenceCheck.getFullName(), upcReferenceCheck.getAttributeName(), id)) continue;
                throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_800521, new Object[]{id, upcReferenceCheck.getModuleName()});
            }
        }
    }

    public void adminDepartmentCheck(String id) throws Exception {
        List<UpcReferenceCheck> upcReferenceCheckRedisList = this.setUnionKeyCheckLicenseRedis("department");
        if (!CollectionUtils.isEmpty(upcReferenceCheckRedisList)) {
            for (UpcReferenceCheck upcReferenceCheck : upcReferenceCheckRedisList) {
                if (!this.commonCheckQuery(upcReferenceCheck.getFullName(), upcReferenceCheck.getAttributeName(), id)) continue;
                throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_800522, new Object[]{id, upcReferenceCheck.getModuleName()});
            }
        }
    }

    private boolean commonCheckQuery(String fullName, String attributeName, String id) throws Exception {
        int num;
        boolean isCheck = false;
        QuerySchema querySchema = QuerySchema.create();
        querySchema.addSelect("count(id) as num");
        String[] attributes = attributeName.split(",");
        ArrayList<QueryCondition> conditionExpressions = new ArrayList<QueryCondition>();
        for (String attribute : attributes) {
            conditionExpressions.add(QueryCondition.name((String)attribute).eq((Object)id));
        }
        ConditionExpression[] ces = new ConditionExpression[conditionExpressions.size()];
        QueryConditionGroup queryConditionGroup = QueryConditionGroup.or((ConditionExpression[])conditionExpressions.toArray(ces));
        querySchema.addCondition((ConditionExpression)queryConditionGroup);
        Map materialList = MetaDaoHelper.queryOne((String)fullName, (QuerySchema)querySchema);
        if (!CollectionUtils.isEmpty((Map)materialList) && materialList.containsKey("num") && (num = Integer.parseInt(materialList.get("num").toString())) != 0) {
            isCheck = true;
        }
        return isCheck;
    }

    private List<UpcReferenceCheck> setUnionKeyCheckLicenseRedis(String typeCode) {
        List upcReferenceCheckList = this.upcReferenceCheckDao.getUpcReferenceCheckByTypeCode(typeCode);
        if (!CollectionUtils.isEmpty((Collection)upcReferenceCheckList)) {
            return upcReferenceCheckList;
        }
        throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_800523, new Object[]{typeCode});
    }
}


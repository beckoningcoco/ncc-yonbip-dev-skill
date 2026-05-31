/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.yonyou.iuap.apdoc.coredoc.config.YMSParamConfig
 *  com.yonyou.permission.util.AuthSdkFacadeUtils
 *  com.yonyou.ucf.mdd.ext.dao.meta.MetaDaoHelper
 *  com.yonyoucloud.upc.aa.merchant.Principal
 *  com.yonyoucloud.uretail.sys.auth.CustomAuthContent
 *  org.imeta.orm.schema.ConditionExpression
 *  org.imeta.orm.schema.QueryCondition
 *  org.imeta.orm.schema.QueryConditionGroup
 *  org.imeta.orm.schema.QueryPager
 *  org.imeta.orm.schema.QuerySchema
 *  org.springframework.beans.factory.annotation.Autowired
 *  org.springframework.stereotype.Component
 *  org.springframework.util.CollectionUtils
 */
package com.yonyoucloud.iuap.upc.dataauth;

import com.yonyou.iuap.apdoc.coredoc.config.YMSParamConfig;
import com.yonyou.permission.util.AuthSdkFacadeUtils;
import com.yonyou.ucf.mdd.ext.dao.meta.MetaDaoHelper;
import com.yonyoucloud.iuap.upc.dataauth.DPBaseRule;
import com.yonyoucloud.upc.aa.merchant.Principal;
import com.yonyoucloud.uretail.sys.auth.CustomAuthContent;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import org.imeta.orm.schema.ConditionExpression;
import org.imeta.orm.schema.QueryCondition;
import org.imeta.orm.schema.QueryConditionGroup;
import org.imeta.orm.schema.QueryPager;
import org.imeta.orm.schema.QuerySchema;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.util.CollectionUtils;

@Component
public class DmCustomerAuthRule
extends DPBaseRule {
    @Autowired
    private YMSParamConfig ymsParamConfig;

    @Override
    protected Set<String> getCustomValues(CustomAuthContent content, String personId) throws Exception {
        ArrayList<String> personIds = new ArrayList<String>(1);
        personIds.add(personId);
        return this.queryCustomers(content.getYhtUserId(), content.getYhtTenantId(), personIds);
    }

    public Set<String> queryCustomers(String yhtUserId, String yhtTenantId, List<String> personIds) throws Exception {
        Set<String> authOrgSet = this.getAuthOrgSet(yhtUserId, yhtTenantId);
        Long currentRangeId = 0L;
        int realMaxRowsValue = this.ymsParamConfig.getResultMaxRowsValue() - 1;
        List<Principal> principalList = this.queryCustomersByMinId(authOrgSet, personIds, currentRangeId, realMaxRowsValue);
        ArrayList<Principal> principals = new ArrayList<Principal>(principalList);
        while (principalList.size() >= realMaxRowsValue) {
            currentRangeId = (Long)principalList.get(principalList.size() - 1).getId();
            principalList = this.queryCustomersByMinId(authOrgSet, personIds, currentRangeId, realMaxRowsValue);
            principals.addAll(principalList);
        }
        if (!CollectionUtils.isEmpty(principals)) {
            return principals.stream().map(principal -> String.valueOf(principal.getMerchantId())).collect(Collectors.toSet());
        }
        return new HashSet<String>();
    }

    public List<Principal> queryCustomersByMinId(Set<String> authOrgSet, List<String> personIds, Long minId, int realMaxRowsValue) throws Exception {
        QueryConditionGroup conditionGroup = QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"professSalesman").in(personIds), QueryCondition.name((String)"id").gt((Object)minId)});
        if (authOrgSet != null) {
            if (authOrgSet.isEmpty()) {
                return new ArrayList<Principal>(0);
            }
            conditionGroup.addCondition((ConditionExpression)QueryCondition.name((String)"merchantApplyRangeId.orgId").in(authOrgSet));
        }
        QuerySchema querySchema = QuerySchema.create().addSelect("id,merchantId").addCondition((ConditionExpression)conditionGroup);
        querySchema.addOrderBy("id");
        QueryPager queryPager = new QueryPager();
        queryPager.setPageIndex(1);
        queryPager.setPageSize(realMaxRowsValue);
        querySchema.pager(queryPager);
        List principalList = MetaDaoHelper.queryObject((String)"aa.merchant.Principal", (QuerySchema)querySchema, null);
        if (!CollectionUtils.isEmpty((Collection)principalList)) {
            return principalList;
        }
        return new ArrayList<Principal>();
    }

    public Set<String> getAuthOrgSet(String yhtUserId, String yhtTenantId) throws Exception {
        if ("qyic8c7o".equals(yhtTenantId) || "0000L6OWXCP82GGGLI0000".equals(yhtTenantId)) {
            HashSet<String> orgSet = new HashSet<String>();
            Set formalCustomerOrgSet = AuthSdkFacadeUtils.getUserMasterOrgPermission((String)yhtUserId, (String)yhtTenantId, (String)"formalcustomer", (Boolean)true);
            if (!CollectionUtils.isEmpty((Collection)formalCustomerOrgSet)) {
                orgSet.addAll(formalCustomerOrgSet);
            } else {
                Set potentialCustomerOrgSet = AuthSdkFacadeUtils.getUserMasterOrgPermission((String)yhtUserId, (String)yhtTenantId, (String)"potentialcustomer", (Boolean)true);
                if (!CollectionUtils.isEmpty((Collection)potentialCustomerOrgSet)) {
                    orgSet.addAll(potentialCustomerOrgSet);
                } else {
                    Set allCustomerOrgSet = AuthSdkFacadeUtils.getUserMasterOrgPermission((String)yhtUserId, (String)yhtTenantId, (String)"customer", (Boolean)true);
                    if (!CollectionUtils.isEmpty((Collection)allCustomerOrgSet)) {
                        orgSet.addAll(allCustomerOrgSet);
                    }
                }
            }
            if (orgSet.isEmpty()) {
                return new HashSet<String>(0);
            }
            return orgSet;
        }
        return null;
    }
}


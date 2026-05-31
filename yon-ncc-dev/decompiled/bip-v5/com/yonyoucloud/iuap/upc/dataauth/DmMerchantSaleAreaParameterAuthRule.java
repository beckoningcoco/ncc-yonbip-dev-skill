/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.yonyou.ucf.mdd.ext.dao.meta.MetaDaoHelper
 *  com.yonyoucloud.uretail.sys.auth.CustomAuthExtContent
 *  com.yonyoucloud.uretail.sys.auth.CustomAuthRuleResponse
 *  com.yonyoucloud.uretail.sys.itf.custom.ICustomVersionAuthReferRpcZoneService
 *  org.imeta.orm.schema.ConditionExpression
 *  org.imeta.orm.schema.QueryCondition
 *  org.imeta.orm.schema.QueryConditionGroup
 *  org.imeta.orm.schema.QuerySchema
 *  org.slf4j.Logger
 *  org.slf4j.LoggerFactory
 *  org.springframework.stereotype.Component
 *  org.springframework.util.CollectionUtils
 */
package com.yonyoucloud.iuap.upc.dataauth;

import com.yonyou.ucf.mdd.ext.dao.meta.MetaDaoHelper;
import com.yonyoucloud.uretail.sys.auth.CustomAuthExtContent;
import com.yonyoucloud.uretail.sys.auth.CustomAuthRuleResponse;
import com.yonyoucloud.uretail.sys.itf.custom.ICustomVersionAuthReferRpcZoneService;
import java.util.Collection;
import java.util.Date;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;
import org.imeta.orm.schema.ConditionExpression;
import org.imeta.orm.schema.QueryCondition;
import org.imeta.orm.schema.QueryConditionGroup;
import org.imeta.orm.schema.QuerySchema;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;
import org.springframework.util.CollectionUtils;

@Component
public class DmMerchantSaleAreaParameterAuthRule
implements ICustomVersionAuthReferRpcZoneService {
    private static final Logger log = LoggerFactory.getLogger(DmMerchantSaleAreaParameterAuthRule.class);

    public CustomAuthRuleResponse getValues(CustomAuthExtContent content) throws Exception {
        CustomAuthRuleResponse customAuthRuleResponse = new CustomAuthRuleResponse();
        try {
            Map param = content.getParam();
            List saleAreaIds = (List)param.get("saleAreaIds");
            if (!CollectionUtils.isEmpty((Collection)saleAreaIds)) {
                customAuthRuleResponse.setiSuccess(Boolean.valueOf(true));
                customAuthRuleResponse.setVersion(new Date());
                customAuthRuleResponse.setValues(this.getMerchantBySaleArea(saleAreaIds));
            } else {
                customAuthRuleResponse.setiSuccess(Boolean.valueOf(true));
                customAuthRuleResponse.setVersion(new Date());
                customAuthRuleResponse.setValues(new HashSet(0));
            }
        }
        catch (Exception e) {
            log.error("DmMerchantSaleAreaParameterAuthRule" + e.getMessage(), (Throwable)e);
            customAuthRuleResponse.setiSuccess(Boolean.valueOf(false));
            customAuthRuleResponse.setVersion(new Date());
            customAuthRuleResponse.setFailMessage(e.getMessage());
        }
        return customAuthRuleResponse;
    }

    public Set<String> getMerchantBySaleArea(List<String> saleAreaIds) throws Exception {
        QueryConditionGroup conditionGroup = QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"saleAreaId").in(saleAreaIds)});
        QuerySchema schema = QuerySchema.create().addSelect("merchantId").addCondition((ConditionExpression)conditionGroup);
        List saleAreaList = MetaDaoHelper.queryObject((String)"aa.merchant.CustomerArea", (QuerySchema)schema, null);
        if (!CollectionUtils.isEmpty((Collection)saleAreaList)) {
            return saleAreaList.stream().map(map -> String.valueOf(map.getMerchantId())).collect(Collectors.toSet());
        }
        return new HashSet<String>(0);
    }
}


/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.yonyoucloud.uretail.sys.auth.CustomAuthExtContent
 *  com.yonyoucloud.uretail.sys.auth.CustomAuthRuleResponse
 *  com.yonyoucloud.uretail.sys.itf.custom.ICustomVersionAuthReferRpcZoneService
 *  org.slf4j.Logger
 *  org.slf4j.LoggerFactory
 *  org.springframework.beans.factory.annotation.Autowired
 *  org.springframework.stereotype.Component
 *  org.springframework.util.CollectionUtils
 */
package com.yonyoucloud.iuap.upc.dataauth;

import com.yonyoucloud.iuap.upc.dataauth.DmCustomerAuthRule;
import com.yonyoucloud.uretail.sys.auth.CustomAuthExtContent;
import com.yonyoucloud.uretail.sys.auth.CustomAuthRuleResponse;
import com.yonyoucloud.uretail.sys.itf.custom.ICustomVersionAuthReferRpcZoneService;
import java.util.Collection;
import java.util.Date;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.util.CollectionUtils;

@Component
public class DmMerchantSmParameterAuthRule
implements ICustomVersionAuthReferRpcZoneService {
    private static final Logger log = LoggerFactory.getLogger(DmMerchantSmParameterAuthRule.class);
    @Autowired
    private DmCustomerAuthRule dmCustomerAuthRule;

    public CustomAuthRuleResponse getValues(CustomAuthExtContent content) throws Exception {
        CustomAuthRuleResponse customAuthRuleResponse = new CustomAuthRuleResponse();
        try {
            Map param = content.getParam();
            List staffIds = (List)param.get("staffIds");
            if (!CollectionUtils.isEmpty((Collection)staffIds)) {
                customAuthRuleResponse.setiSuccess(Boolean.valueOf(true));
                customAuthRuleResponse.setVersion(new Date());
                customAuthRuleResponse.setValues(this.dmCustomerAuthRule.queryCustomers(content.getYhtUserId(), content.getYhtTenantId(), staffIds));
            } else {
                customAuthRuleResponse.setiSuccess(Boolean.valueOf(true));
                customAuthRuleResponse.setVersion(new Date());
                customAuthRuleResponse.setValues(new HashSet());
            }
        }
        catch (Exception e) {
            log.error("DmMerchantSmParameterAuthRule" + e.getMessage(), (Throwable)e);
            customAuthRuleResponse.setiSuccess(Boolean.valueOf(false));
            customAuthRuleResponse.setVersion(new Date());
            customAuthRuleResponse.setFailMessage(e.getMessage());
        }
        return customAuthRuleResponse;
    }
}


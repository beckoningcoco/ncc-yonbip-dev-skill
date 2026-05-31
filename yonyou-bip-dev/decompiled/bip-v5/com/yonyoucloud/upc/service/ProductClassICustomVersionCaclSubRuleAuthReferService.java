/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.yonyou.iuap.ucf.common.i18n.InternationalUtils
 *  com.yonyou.ucf.mdd.ext.dao.sql.SqlHelper
 *  com.yonyoucloud.uretail.sys.auth.CustomAuthRuleResponse
 *  com.yonyoucloud.uretail.sys.auth.CustomCaclSubAuthContent
 *  com.yonyoucloud.uretail.sys.itf.custom.ICustomVersionCaclSubRuleAuthReferService
 *  org.slf4j.Logger
 *  org.slf4j.LoggerFactory
 *  org.springframework.stereotype.Service
 */
package com.yonyoucloud.upc.service;

import com.yonyou.iuap.ucf.common.i18n.InternationalUtils;
import com.yonyou.ucf.mdd.ext.dao.sql.SqlHelper;
import com.yonyoucloud.uretail.sys.auth.CustomAuthRuleResponse;
import com.yonyoucloud.uretail.sys.auth.CustomCaclSubAuthContent;
import com.yonyoucloud.uretail.sys.itf.custom.ICustomVersionCaclSubRuleAuthReferService;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

@Service
public class ProductClassICustomVersionCaclSubRuleAuthReferService
implements ICustomVersionCaclSubRuleAuthReferService {
    private static Logger logger = LoggerFactory.getLogger(ProductClassICustomVersionCaclSubRuleAuthReferService.class);

    public CustomAuthRuleResponse getValues(CustomCaclSubAuthContent content) {
        String ytenantId = content.getYhtTenantId();
        List parentList = content.getParentList();
        Date version = content.getVersion();
        String fullName = content.getFullName();
        CustomAuthRuleResponse customAuthRuleResponse = new CustomAuthRuleResponse();
        HashSet<String> subIdSet = new HashSet<String>();
        boolean isSuccess = true;
        String resultStr = "";
        Date maxPubts = version;
        try {
            HashMap<String, Object> params = new HashMap<String, Object>();
            params.put("ytenantid", ytenantId);
            maxPubts = (Date)SqlHelper.selectOne((String)"com.yonyoucloud.upc.bill.dao.productcls.selectMaxPubtsByTenantId", params);
            subIdSet.addAll(parentList);
            if (null != maxPubts && version.before(maxPubts) && "pc.cls.ManagementClass".equals(fullName)) {
                params.put("ids", parentList);
                int index = 0;
                this.findChildren(subIdSet, params, index);
            } else {
                maxPubts = version;
            }
        }
        catch (Exception e) {
            resultStr = InternationalUtils.getMessageWithDefault((String)"UID:P_COREDOC-BE_179F628604080203", (String)"\u67e5\u8be2\u5b50\u7ea7\u6570\u636e\u5f02\u5e38\uff01");
            isSuccess = false;
            logger.info(resultStr);
        }
        if (isSuccess) {
            customAuthRuleResponse.setiSuccess(Boolean.valueOf(true));
            customAuthRuleResponse.setVersion(maxPubts);
            customAuthRuleResponse.setValues(subIdSet);
        } else {
            customAuthRuleResponse.setiSuccess(Boolean.valueOf(false));
            customAuthRuleResponse.setFailMessage(resultStr);
            customAuthRuleResponse.setVersion(version);
        }
        return customAuthRuleResponse;
    }

    private void findChildren(Set<String> subIdSet, Map<String, Object> params, int index) {
        if (++index > 8) {
            return;
        }
        List ids = SqlHelper.selectList((String)"com.yonyoucloud.upc.bill.dao.productcls.selectIdsByParentIdsAndTenantId", params);
        if (null == ids || ids.size() == 0) {
            return;
        }
        subIdSet.addAll(ids);
        params.put("ids", ids);
        this.findChildren(subIdSet, params, index);
    }
}


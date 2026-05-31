/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.yonyou.iuap.apdoc.coredoc.enums.CoreExtrateBusinessErrorEnum
 *  com.yonyou.iuap.apdoc.coredoc.exceptions.CoreDocBusinessException
 *  com.yonyou.ucf.mdd.ext.dao.sql.SqlHelper
 *  org.slf4j.Logger
 *  org.slf4j.LoggerFactory
 *  org.springframework.stereotype.Service
 *  org.springframework.util.CollectionUtils
 */
package com.yonyoucloud.upc.service;

import com.yonyou.iuap.apdoc.coredoc.enums.CoreExtrateBusinessErrorEnum;
import com.yonyou.iuap.apdoc.coredoc.exceptions.CoreDocBusinessException;
import com.yonyou.ucf.mdd.ext.dao.sql.SqlHelper;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;

@Service
public class MerchantApplyRangeGroupService {
    private Logger logger = LoggerFactory.getLogger(MerchantApplyRangeGroupService.class);

    public void updateMerchantAddress(String ytenantId) {
        if (ytenantId == null) {
            throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_800858);
        }
        try {
            HashMap<String, String> params = new HashMap<String, String>();
            params.put("ytenantid", ytenantId);
            List resultList = SqlHelper.selectList((String)"com.yonyoucloud.upc.option.dao.merchant.selectMerchantAddressByTenantid", params);
            ArrayList paramMapList = new ArrayList();
            HashSet<String> addressSet = new HashSet<String>();
            int num = 1;
            if (!CollectionUtils.isEmpty((Collection)resultList)) {
                for (int i = 0; i < resultList.size(); ++i) {
                    Map result = (Map)resultList.get(i);
                    HashMap paramMap = new HashMap();
                    if (result.get("ytenant_id") == null || result.get("id") == null || result.get("cAddressCode") == null) continue;
                    String addressCode = result.get("cAddressCode").toString();
                    if (addressSet.contains(addressCode)) {
                        addressCode = addressCode + "_" + String.format("%04d", num);
                        ++num;
                        paramMap.put("ytenantid", result.get("ytenant_id"));
                        paramMap.put("id", result.get("id"));
                        paramMap.put("addressCode", addressCode);
                        paramMapList.add(paramMap);
                    }
                    addressSet.add(addressCode);
                }
            }
            if (!paramMapList.isEmpty()) {
                SqlHelper.update((String)"com.yonyoucloud.upc.option.dao.merchant.updateAddress", paramMapList);
            }
        }
        catch (Exception e) {
            this.logger.error("\u5ba2\u6237\u5730\u5740\u7f16\u7801\u5347\u7ea7\u5f02\u5e38" + e.getMessage(), (Throwable)e);
        }
    }
}


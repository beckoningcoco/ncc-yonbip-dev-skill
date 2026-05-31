/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.yonyou.iuap.apdoc.coredoc.enums.CoreExtrateBusinessErrorEnum
 *  com.yonyou.iuap.apdoc.coredoc.exceptions.CoreDocBusinessException
 *  com.yonyou.ucf.mdd.ext.core.AppContext
 *  com.yonyou.ucf.mdd.ext.dao.sql.SqlHelper
 *  org.springframework.stereotype.Service
 */
package com.yonyoucloud.upc.service;

import com.yonyou.iuap.apdoc.coredoc.enums.CoreExtrateBusinessErrorEnum;
import com.yonyou.iuap.apdoc.coredoc.exceptions.CoreDocBusinessException;
import com.yonyou.ucf.mdd.ext.core.AppContext;
import com.yonyou.ucf.mdd.ext.dao.sql.SqlHelper;
import com.yonyoucloud.iuap.upc.api.service.IUPCVendorQueryService;
import java.util.HashMap;
import java.util.Map;
import org.springframework.stereotype.Service;

@Service
public class UPCVendorQueryService
implements IUPCVendorQueryService {
    @Override
    public Map<String, Object> setParams(Long vendorId, Long vendorApplyRangeId, Long orgId, Long custId, Long shopId) throws Exception {
        HashMap<String, Object> params = new HashMap<String, Object>();
        params.put("vendorId", vendorId);
        params.put("tenantId", AppContext.getCurrentUser().getTenant());
        Map result = new HashMap();
        if (vendorApplyRangeId == null || vendorApplyRangeId == 0L) {
            if (orgId != null) {
                params.put("orgId", orgId);
                result = (Map)SqlHelper.selectFirst((String)"com.yonyoucloud.upc.vendor.dao.VendorQuery.QueryRangeByorgId", params);
            } else if (custId != null) {
                params.put("custId", custId);
                result = (Map)SqlHelper.selectFirst((String)"com.yonyoucloud.upc.vendor.dao.VendorQuery.QueryRangeBycustId", params);
            } else if (shopId != null) {
                params.put("shopId", shopId);
                result = (Map)SqlHelper.selectFirst((String)"com.yonyoucloud.upc.vendor.dao.VendorQuery.QueryRangeByshopId", params);
            } else {
                params.put("isCreator", true);
                result = (Map)SqlHelper.selectFirst((String)"com.yonyoucloud.upc.vendor.dao.VendorQuery.QueryRangeByIsCreator", params);
            }
            if (result == null || result.isEmpty()) {
                throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_801038);
            }
            vendorApplyRangeId = (Long)result.get("id");
        } else {
            params.put("vendorApplyRangeId", vendorApplyRangeId);
            result = (Map)SqlHelper.selectFirst((String)"com.yonyoucloud.upc.vendor.dao.VendorQuery.QueryRangeByRangeId", params);
        }
        if (result == null || result.isEmpty()) {
            throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_801039);
        }
        params.put("@vendorApplyRangeId", vendorApplyRangeId);
        params.put("isCreator", result.get("isCreator"));
        params.put("isApplied", result.get("isApplied"));
        return params;
    }
}


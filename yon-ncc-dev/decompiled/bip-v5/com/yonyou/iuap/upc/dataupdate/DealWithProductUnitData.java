/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.yonyou.iuap.apdoc.coredoc.exceptions.CoreDocBusinessException
 *  com.yonyou.ucf.mdd.ext.base.tenant.Tenant
 *  com.yonyou.ucf.mdd.ext.core.AppContext
 *  com.yonyou.ucf.mdd.ext.dao.sql.SqlHelper
 *  org.slf4j.Logger
 *  org.slf4j.LoggerFactory
 *  org.springframework.stereotype.Service
 *  org.springframework.util.CollectionUtils
 */
package com.yonyou.iuap.upc.dataupdate;

import com.yonyou.iuap.apdoc.coredoc.exceptions.CoreDocBusinessException;
import com.yonyou.iuap.upc.dataupdate.DataUpdateBaseServcie;
import com.yonyou.ucf.mdd.ext.base.tenant.Tenant;
import com.yonyou.ucf.mdd.ext.core.AppContext;
import com.yonyou.ucf.mdd.ext.dao.sql.SqlHelper;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;

@Service
public class DealWithProductUnitData
extends DataUpdateBaseServcie {
    Logger logger = LoggerFactory.getLogger(DealWithProductUnitData.class);

    @Override
    public int businessDataUpdate(Tenant tenant, int capacity) throws Exception {
        return this.upgradeProductUnit(tenant, capacity);
    }

    public int dataUpdateForTenant(int capacity) throws Exception {
        Tenant tenant = new Tenant();
        tenant.setId(AppContext.getCurrentUser().getTenant());
        tenant.setYTenantId(AppContext.getCurrentUser().getYTenantId());
        return this.upgradeProductUnit(tenant, capacity);
    }

    @Override
    public String getTaskName() {
        return "\u6570\u636e\u6cbb\u7406\uff1a\u7269\u6599\u8ba1\u91cf\u5355\u4f4d\u4e0d\u5b58\u5728";
    }

    private int upgradeProductUnit(Tenant tenant, int capacity) throws Exception {
        int tenantCount = 0;
        HashMap<String, String> tenantIdParamMap = new HashMap<String, String>(4);
        tenantIdParamMap.put("ytenant", tenant.getYTenantId());
        Object productCount = SqlHelper.selectOne((String)"com.yonyoucloud.upc.data.dealWithData.selectProductUnitCountByYtenantId", tenantIdParamMap);
        if (productCount != null && Integer.parseInt(productCount.toString()) > 0) {
            List<Map<String, Object>> productIdList = this.getProductUnitByMinId(tenant.getYTenantId());
            tenantCount = productIdList.size();
            String msg = "";
            for (Map<String, Object> productData : productIdList) {
                msg = msg + productData.get("code").toString() + ",";
            }
            this.logger.error(String.format("\u79df\u6237\u3010%s\u3011\u6cbb\u7406\u7269\u6599\u8ba1\u91cf\u5355\u4f4d\u4e0d\u5b58\u5728\uff0c\u6570\u636e\u5347\u7ea7\u5b8c\u6210\uff0c\u5171\u8ba1\u5347\u7ea7\u6570\u636e\u3010%d\u3011\u6761\uff0c\u5177\u4f53\u7f16\u7801\u5206\u522b\u4e3a\uff1a", tenant.getId().toString(), tenantCount, msg));
        }
        return tenantCount;
    }

    public int updateProductUnitData(List<Long> productIdList) throws Exception {
        List<Map> originalProductSKUList;
        int updateCount = 0;
        if (!CollectionUtils.isEmpty(productIdList) && !CollectionUtils.isEmpty(originalProductSKUList = this.getProductByIdList(productIdList))) {
            for (Map map : originalProductSKUList) {
                ++updateCount;
            }
        }
        return updateCount;
    }

    private List<Map> getProductByIdList(List<Long> productIdList) throws Exception {
        HashMap<String, List<Long>> param = new HashMap<String, List<Long>>(4);
        param.put("productIds", productIdList);
        List errDataList = SqlHelper.selectList((String)"com.yonyoucloud.upc.data.dealWithData.queryProductUnitErrData", param);
        return errDataList;
    }

    public List<Map<String, Object>> getProductUnitByMinId(String ytenant) throws Exception {
        Long currentProductId = 0L;
        int realMaxRowsValue = this.ymsParamConfig.getResultMaxRowsValue() - 1;
        ArrayList<Map<String, Object>> productDatas = new ArrayList<Map<String, Object>>();
        List<Map<String, Object>> productDataList = this.getProductUnitDataByMinId(currentProductId, realMaxRowsValue, ytenant);
        productDatas.addAll(productDataList);
        while (productDataList.size() >= realMaxRowsValue) {
            currentProductId = Long.valueOf(productDataList.get(productDataList.size() - 1).get("id").toString());
            productDataList = this.getProductUnitDataByMinId(currentProductId, realMaxRowsValue, ytenant);
            productDatas.addAll(productDataList);
        }
        return productDatas;
    }

    public List<Map<String, Object>> getProductUnitDataByMinId(Long minId, int realMaxRowsValue, String ytenant) {
        try {
            HashMap<String, Object> paramMap = new HashMap<String, Object>(4);
            paramMap.put("ytenant", ytenant);
            paramMap.put("minId", minId);
            paramMap.put("limit", realMaxRowsValue);
            List productUnitDataList = SqlHelper.selectList((String)"com.yonyoucloud.upc.data.dealWithData.getProductUnitDataByMinId", paramMap);
            return productUnitDataList;
        }
        catch (Exception e) {
            throw new CoreDocBusinessException("\u6570\u636e\u6cbb\u7406\uff1a\u7269\u6599\u8ba1\u91cf\u5355\u4f4d\u67e5\u8be2\u7269\u6599MinId\u62a5\u9519\uff0c\u8bf7\u786e\u8ba4\uff01");
        }
    }
}


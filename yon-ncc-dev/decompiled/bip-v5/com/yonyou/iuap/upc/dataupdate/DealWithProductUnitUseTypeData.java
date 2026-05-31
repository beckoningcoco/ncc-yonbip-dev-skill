/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.yonyou.iuap.apdoc.coredoc.exceptions.CoreDocBusinessException
 *  com.yonyou.iuap.apdoc.coredoc.utils.ListSplitUtil
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
import com.yonyou.iuap.apdoc.coredoc.utils.ListSplitUtil;
import com.yonyou.iuap.upc.dataupdate.DataUpdateBaseServcie;
import com.yonyou.ucf.mdd.ext.base.tenant.Tenant;
import com.yonyou.ucf.mdd.ext.core.AppContext;
import com.yonyou.ucf.mdd.ext.dao.sql.SqlHelper;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;

@Service
public class DealWithProductUnitUseTypeData
extends DataUpdateBaseServcie {
    Logger logger = LoggerFactory.getLogger(DealWithProductUnitUseTypeData.class);

    @Override
    public int businessDataUpdate(Tenant tenant, int capacity) throws Exception {
        return this.upgradeProductUnitUseType(tenant, capacity);
    }

    public int dataUpdateForTenant(int capacity) throws Exception {
        Tenant tenant = new Tenant();
        tenant.setId(AppContext.getCurrentUser().getTenant());
        tenant.setYTenantId(AppContext.getCurrentUser().getYTenantId());
        return this.upgradeProductUnitUseType(tenant, capacity);
    }

    @Override
    public String getTaskName() {
        return "\u6570\u636e\u6cbb\u7406\uff1a\u8ba1\u91cf\u5355\u4f4d\u8bbe\u7f6e\u89c4\u5219\u9009\u62e9\u4f7f\u7528\u7269\u6599\u6a21\u7248\uff0c\u4f46\u662f\u7269\u6599\u521b\u5efa\u4e0a\u7684\u7269\u6599\u6a21\u7248\u4e3a\u7a7a\u7684\u9519\u8bef\u6570\u636e";
    }

    private int upgradeProductUnitUseType(Tenant tenant, int capacity) throws Exception {
        int tenantCount = 0;
        HashMap<String, String> tenantIdParamMap = new HashMap<String, String>(4);
        tenantIdParamMap.put("ytenant", tenant.getYTenantId());
        Object productCount = SqlHelper.selectOne((String)"com.yonyoucloud.upc.data.dealWithData.selectProductUnitUseTypeByYtenantId", tenantIdParamMap);
        if (productCount != null && Integer.parseInt(productCount.toString()) > 0) {
            List<List<Long>> productIdList = this.getProductUnitUseByMinId(capacity, tenant.getYTenantId());
            for (List<Long> productData : productIdList) {
                int updateCount = this.updateProductUnitUseData(productData, tenant.getYTenantId());
                tenantCount += updateCount;
            }
            this.logger.error(String.format("\u79df\u6237\u3010%s\u3011\u6cbb\u7406\u8ba1\u91cf\u5355\u4f4d\u8bbe\u7f6e\u89c4\u5219\u9009\u62e9\u4f7f\u7528\u7269\u6599\u6a21\u7248\uff0c\u4f46\u662f\u7269\u6599\u521b\u5efa\u4e0a\u7684\u7269\u6599\u6a21\u7248\u4e3a\u7a7a\u7684\u9519\u8bef\u6570\u636e\uff0c\u6570\u636e\u5347\u7ea7\u5b8c\u6210\uff0c\u5171\u8ba1\u5347\u7ea7\u6570\u636e\u3010%d\u3011\u6761\uff0c", tenant.getId().toString(), tenantCount) + LocalDateTime.now());
        }
        return tenantCount;
    }

    public int updateProductUnitUseData(List<Long> productData, String ytenantId) throws Exception {
        int updateCount = 0;
        if (!CollectionUtils.isEmpty(productData)) {
            HashMap<String, Object> paramMap = new HashMap<String, Object>(4);
            paramMap.put("ytenant", ytenantId);
            paramMap.put("productIds", productData);
            updateCount = SqlHelper.update((String)"com.yonyoucloud.upc.data.dealWithData.updateProductUnitUseDataByYtenantId", paramMap);
        }
        return updateCount;
    }

    public List<List<Long>> getProductUnitUseByMinId(int capacity, String ytenant) throws Exception {
        Long currentProductId = 0L;
        int realMaxRowsValue = this.ymsParamConfig.getResultMaxRowsValue() - 1;
        ArrayList<Long> productDatas = new ArrayList<Long>();
        List<Long> productDataList = this.getProductUnitUseDataByMinId(currentProductId, realMaxRowsValue, ytenant);
        productDatas.addAll(productDataList);
        while (productDataList.size() >= realMaxRowsValue) {
            currentProductId = productDataList.get(productDataList.size() - 1);
            productDataList = this.getProductUnitUseDataByMinId(currentProductId, realMaxRowsValue, ytenant);
            productDatas.addAll(productDataList);
        }
        return ListSplitUtil.splitListByCapacity(productDatas, (int)capacity);
    }

    public List<Long> getProductUnitUseDataByMinId(Long minId, int realMaxRowsValue, String ytenant) {
        try {
            HashMap<String, Object> paramMap = new HashMap<String, Object>(4);
            paramMap.put("ytenant", ytenant);
            paramMap.put("minId", minId);
            paramMap.put("limit", realMaxRowsValue);
            List productUnitDataList = SqlHelper.selectList((String)"com.yonyoucloud.upc.data.dealWithData.getProductUnitUseDataByMinId", paramMap);
            return productUnitDataList;
        }
        catch (Exception e) {
            throw new CoreDocBusinessException("\u6570\u636e\u6cbb\u7406\uff1a\u7269\u6599\u8ba1\u91cf\u5355\u4f4d\u89c4\u5219\u8bbe\u7f6e\u9519\u8bef\u6570\u636e\uff0c\u67e5\u8be2\u7269\u6599MinId\u62a5\u9519\uff0c\u8bf7\u786e\u8ba4\uff01");
        }
    }
}


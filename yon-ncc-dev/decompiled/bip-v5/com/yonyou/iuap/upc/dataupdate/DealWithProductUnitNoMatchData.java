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
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;

@Service
public class DealWithProductUnitNoMatchData
extends DataUpdateBaseServcie {
    Logger logger = LoggerFactory.getLogger(DealWithProductUnitNoMatchData.class);

    @Override
    public int businessDataUpdate(Tenant tenant, int capacity) throws Exception {
        return this.upgradeProductUnitNoMatchData(tenant, capacity);
    }

    public int dataUpdateForTenant(int capacity) throws Exception {
        Tenant tenant = new Tenant();
        tenant.setId(AppContext.getCurrentUser().getTenant());
        tenant.setYTenantId(AppContext.getCurrentUser().getYTenantId());
        return this.upgradeProductUnitNoMatchData(tenant, capacity);
    }

    @Override
    public String getTaskName() {
        return "\u6570\u636e\u6cbb\u7406\uff1a\u7269\u6599\u4e3b\u8f85\u8ba1\u91cf\u4e0e\u4e1a\u52a1\u8ba1\u91cf\u6570\u636e\u4e0d\u4e00\u81f4\u7684\u4e1a\u52a1\u6570\u636e";
    }

    private int upgradeProductUnitNoMatchData(Tenant tenant, int capacity) throws Exception {
        int totalCount = 0;
        int noAsitCount = 0;
        int asitCount = 0;
        HashMap<String, String> tenantIdParamMap = new HashMap<String, String>(4);
        tenantIdParamMap.put("ytenant", tenant.getYTenantId());
        Object productCount = SqlHelper.selectOne((String)"com.yonyoucloud.upc.data.dealWithData.selectProductUnitNoMatchCountByYtenantId", tenantIdParamMap);
        if (productCount != null && Integer.parseInt(productCount.toString()) > 0) {
            List<List<Long>> productIdsList = this.getProductUnitMatchByMinId(tenant.getYTenantId(), capacity);
            String msg = "";
            for (List<Long> productIds : productIdsList) {
                int updateNoAsitCount = this.updateNoAsitProductData(productIds);
                Map<String, Object> asitProductList = this.queryAsitProductData(productIds);
                totalCount += (noAsitCount += updateNoAsitCount) + (asitCount += ((Integer)asitProductList.get("errCount")).intValue());
                msg = msg + asitProductList.get("errMsg");
            }
            this.logger.error(String.format("\u79df\u6237\u3010%s\u3011\u6cbb\u7406\u7269\u6599\u4e3b\u8f85\u8ba1\u91cf\u4e0e\u4e1a\u52a1\u8ba1\u91cf\u6570\u636e\u4e0d\u4e00\u81f4\u7684\u4e1a\u52a1\u6570\u636e\uff0c\u6570\u636e\u5347\u7ea7\u5b8c\u6210\uff0c\u5171\u8ba1\u5347\u7ea7\u6570\u636e\u3010%s\u3011\u6761\uff0c\u5176\u4e2d\u7269\u6599\u672a\u542f\u7528\u8f85\u8ba1\u91cf\uff0c\u4e1a\u52a1\u8ba1\u91cf\u4e0e\u4e3b\u8ba1\u91cf\u4e0d\u4e00\u81f4\u7684\u9519\u8bef\u6570\u636e\u3010%s\u3011\uff0c\u7269\u6599\u542f\u7528\u8f85\u8ba1\u91cf\uff0c\u4e1a\u52a1\u8ba1\u91cf\u4e0e\u4e3b\u8f85\u8ba1\u91cf\u4e0d\u4e00\u81f4\u7684\u9519\u8bef\u6570\u636e\u3010%s\u3011\uff0c\u5176\u4e2d\u5177\u4f53\u7f16\u7801\u5206\u522b\u4e3a\uff1a", tenant.getId().toString(), totalCount, noAsitCount, asitCount, msg));
        }
        return totalCount;
    }

    public int updateNoAsitProductData(List<Long> productIdList) throws Exception {
        List<Map> originalProductList;
        int updateCount = 0;
        if (!CollectionUtils.isEmpty(productIdList) && !CollectionUtils.isEmpty(originalProductList = this.getProductNoAssistUnitByIdList(productIdList))) {
            HashMap<String, List<Map>> paramMap = new HashMap<String, List<Map>>(4);
            paramMap.put("noAssistUnitProducts", originalProductList);
            updateCount = SqlHelper.update((String)"com.yonyoucloud.upc.data.dealWithData.updateProductNoAssistUnitData", paramMap);
        }
        return updateCount;
    }

    public Map<String, Object> queryAsitProductData(List<Long> productIdList) throws Exception {
        HashMap<String, Object> asitProductErrDataMap = new HashMap<String, Object>();
        int errCount = 0;
        String errMsg = "";
        if (!CollectionUtils.isEmpty(productIdList)) {
            List<Map<String, Object>> unitDataList = this.getProductUnitDataByIdList(productIdList);
            if (!CollectionUtils.isEmpty(unitDataList)) {
                List<Map<String, Object>> businessUnitDataList = this.getProductBusinessUnitDataByIdList(productIdList);
                Map<Long, List<Map>> unitDataMap = unitDataList.stream().collect(Collectors.groupingBy(map -> Long.valueOf(map.get("id").toString())));
                for (Map<String, Object> map2 : businessUnitDataList) {
                    String code = map2.get("code").toString();
                    Long productApplyRangeId = Long.valueOf(map2.get("productApplyRangeId").toString());
                    Long productId = Long.valueOf(map2.get("id").toString());
                    List<Map> unitData = unitDataMap.get(productId);
                    ArrayList unitList = new ArrayList();
                    List units = unitData.stream().map(m -> Long.valueOf(m.get("unitId").toString())).collect(Collectors.toList());
                    List assitUnits = unitData.stream().map(m -> Long.valueOf(m.get("assistUnitId").toString())).collect(Collectors.toList());
                    unitList.addAll(units);
                    unitList.addAll(assitUnits);
                    if (unitList.contains(Long.valueOf(map2.get("stockUnitId").toString())) && unitList.contains(Long.valueOf(map2.get("batchUnitId").toString())) && unitList.contains(Long.valueOf(map2.get("onlineUnitId").toString())) && unitList.contains(Long.valueOf(map2.get("offlineUnitId").toString())) && unitList.contains(Long.valueOf(map2.get("inspectionUnitId").toString())) && unitList.contains(Long.valueOf(map2.get("batchPriceUnitId").toString())) && unitList.contains(Long.valueOf(map2.get("demandPlanningUnitId").toString())) && unitList.contains(Long.valueOf(map2.get("purchaseUnitId").toString())) && unitList.contains(Long.valueOf(map2.get("purchasePriceUnitId").toString())) && unitList.contains(Long.valueOf(map2.get("produceUnitId").toString())) && unitList.contains(Long.valueOf(map2.get("requireUnitId").toString()))) continue;
                    ++errCount;
                    errMsg = errMsg + "code:" + code + "productApplyRangeId :" + String.valueOf(productApplyRangeId) + ";";
                }
            }
            asitProductErrDataMap.put("errCount", errCount);
            asitProductErrDataMap.put("errMsg", errMsg);
        }
        return asitProductErrDataMap;
    }

    private List<Map> getProductNoAssistUnitByIdList(List<Long> productIdList) throws Exception {
        HashMap<String, List<Long>> param = new HashMap<String, List<Long>>(4);
        param.put("productIds", productIdList);
        List originalDataList = SqlHelper.selectList((String)"com.yonyoucloud.upc.data.dealWithData.queryOriginalProductNoAssistUnitData", param);
        return originalDataList;
    }

    private List<Map<String, Object>> getProductUnitDataByIdList(List<Long> productIdList) throws Exception {
        HashMap<String, List<Long>> param = new HashMap<String, List<Long>>(4);
        param.put("productIds", productIdList);
        List unitDataList = SqlHelper.selectList((String)"com.yonyoucloud.upc.data.dealWithData.getProductUnitData", param);
        return unitDataList;
    }

    private List<Map<String, Object>> getProductBusinessUnitDataByIdList(List<Long> productIdList) throws Exception {
        HashMap<String, List<Long>> param = new HashMap<String, List<Long>>(4);
        param.put("productIds", productIdList);
        List businessUnitDataList = SqlHelper.selectList((String)"com.yonyoucloud.upc.data.dealWithData.getProductBusinessUnitData", param);
        return businessUnitDataList;
    }

    public List<List<Long>> getProductUnitMatchByMinId(String ytenant, int capacity) throws Exception {
        Long currentProductId = 0L;
        int realMaxRowsValue = this.ymsParamConfig.getResultMaxRowsValue() - 1;
        ArrayList<Long> productIds = new ArrayList<Long>();
        List<Long> productDataList = this.getProductUnitMatchDataByMinId(currentProductId, realMaxRowsValue, ytenant);
        productIds.addAll(productDataList);
        while (productDataList.size() >= realMaxRowsValue) {
            currentProductId = productDataList.get(productDataList.size() - 1);
            productDataList = this.getProductUnitMatchDataByMinId(currentProductId, realMaxRowsValue, ytenant);
            productIds.addAll(productDataList);
        }
        return ListSplitUtil.splitListByCapacity(productIds, (int)capacity);
    }

    public List<Long> getProductUnitMatchDataByMinId(Long minId, int realMaxRowsValue, String ytenant) {
        try {
            HashMap<String, Object> paramMap = new HashMap<String, Object>(4);
            paramMap.put("ytenant", ytenant);
            paramMap.put("minId", minId);
            paramMap.put("limit", realMaxRowsValue);
            List productIdDataList = SqlHelper.selectList((String)"com.yonyoucloud.upc.data.dealWithData.getProductUnitMatchDataByMinId", paramMap);
            return productIdDataList;
        }
        catch (Exception e) {
            throw new CoreDocBusinessException("\u6570\u636e\u6cbb\u7406\uff1a\u7269\u6599\u4e3b\u8f85\u8ba1\u91cf\u4e0e\u4e1a\u52a1\u8ba1\u91cf\u6570\u636e\u4e0d\u4e00\u81f4\u7684\u4e1a\u52a1\u6570\u636e\u67e5\u8be2\u7269\u6599MinId\u62a5\u9519\uff0c\u8bf7\u786e\u8ba4\uff01");
        }
    }
}


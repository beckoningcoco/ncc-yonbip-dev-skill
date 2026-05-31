/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.yonyou.iuap.apdoc.coredoc.utils.ListSplitUtil
 *  com.yonyou.ucf.mdd.ext.dao.sql.SqlHelper
 *  org.springframework.stereotype.Service
 *  org.springframework.util.CollectionUtils
 */
package com.yonyoucloud.upc.service.impl;

import com.yonyou.iuap.apdoc.coredoc.utils.ListSplitUtil;
import com.yonyou.ucf.mdd.ext.dao.sql.SqlHelper;
import com.yonyoucloud.iuap.upc.api.service.IProductUpdateOtherDbService;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;

@Service
public class ProductUpdateOtherDbServiceImpl
implements IProductUpdateOtherDbService {
    private static final int DATA_FILTER_SIZE = 50;

    @Override
    public int updateProductSkuInventoryCountOtherDb(Map<String, Object> map) throws Exception {
        int count = 0;
        Long productSkuDetailNewId = (Long)SqlHelper.selectOne((String)"com.yonyoucloud.upc.product.dao.ProductUpdate.selectProductSkuDetailNew", map);
        if (productSkuDetailNewId == null) {
            return count;
        }
        map.put("skudetailnewid", productSkuDetailNewId);
        SqlHelper.update((String)"com.yonyoucloud.upc.product.dao.ProductUpdate.updateProductSkuDetailNew", map);
        map.remove("skudetailnewid");
        Map productDetailInventoryCount = (Map)SqlHelper.selectOne((String)"com.yonyoucloud.upc.product.dao.ProductUpdate.selectProductDetailInventoryCount", map);
        if (productSkuDetailNewId == null) {
            return count;
        }
        map.put("skudetailnewinventorycount", productDetailInventoryCount.get("skudetailnewinventorycount"));
        map.put("skudetailnewproductid", productDetailInventoryCount.get("skudetailnewproductid"));
        count = SqlHelper.update((String)"com.yonyoucloud.upc.product.dao.ProductUpdate.updateProductDetailInventoryCount", map);
        map.remove("skudetailnewinventorycount");
        map.remove("skudetailnewproductid");
        return count;
    }

    @Override
    public int updateProductSkuPriceOtherDb(Map<String, Object> map) throws Exception {
        int count = 0;
        List productSkudetailNewIdList = SqlHelper.selectList((String)"com.yonyoucloud.upc.product.dao.ProductUpdate.selectProductSkudetailNewPrice", map);
        if (CollectionUtils.isEmpty((Collection)productSkudetailNewIdList)) {
            return count;
        }
        List productSkudetailNewIdLists = ListSplitUtil.splitListByCapacity((List)productSkudetailNewIdList, (int)50);
        for (List skudetailNewId : productSkudetailNewIdLists) {
            map.put("skudetailnewids", skudetailNewId);
            SqlHelper.update((String)"com.yonyoucloud.upc.product.dao.ProductUpdate.updateProductSkudetailNewPrice", map);
        }
        map.remove("skudetailnewids");
        count = SqlHelper.update((String)"com.yonyoucloud.upc.product.dao.ProductUpdate.updateProductDetailPrice", map);
        return count;
    }

    @Override
    public void updateTenantInnerUnifiedFieldOtherDb(Map<String, Object> map) throws Exception {
        List productDetailUnifiedFieldList = SqlHelper.selectList((String)"com.yonyoucloud.upc.product.dao.ProductUpdate.selectProductDetailUnifiedField", map);
        if (CollectionUtils.isEmpty((Collection)productDetailUnifiedFieldList)) {
            return;
        }
        List productDetailUnifiedFieldLists = ListSplitUtil.splitListByCapacity((List)productDetailUnifiedFieldList, (int)50);
        for (List productDetailUnifiedFields : productDetailUnifiedFieldLists) {
            map.put("productdetailidslist", productDetailUnifiedFields);
            SqlHelper.update((String)"com.yonyoucloud.upc.product.dao.ProductUpdate.updateProductDetailUnifiedField", map);
        }
        map.remove("productdetailidslist");
    }

    @Override
    public int updateProductSkuInventoryCountByShopIdOtherDb(Map<String, Object> map) throws Exception {
        int count = 0;
        List productskudetailnewInventoryCountOtherDBList = SqlHelper.selectList((String)"com.yonyoucloud.upc.product.dao.ProductUpdate.selectProductskudetailnewInventoryCountOtherDB", map);
        if (CollectionUtils.isEmpty((Collection)productskudetailnewInventoryCountOtherDBList)) {
            return count;
        }
        List productskudetailnewInventoryCountOtherDBLists = ListSplitUtil.splitListByCapacity((List)productskudetailnewInventoryCountOtherDBList, (int)50);
        for (List productskudetailnewInventoryCount : productskudetailnewInventoryCountOtherDBLists) {
            map.put("skudetailnewlist", productskudetailnewInventoryCount);
            SqlHelper.update((String)"com.yonyoucloud.upc.product.dao.ProductUpdate.updateProductskudetailnewInventoryCountOtherDB", map);
        }
        map.remove("skudetailnewlist");
        List productdetaillNewInventoryCountList = SqlHelper.selectList((String)"com.yonyoucloud.upc.product.dao.ProductUpdate.selectProductdetaillNewInventoryCountOtherDB", map);
        if (CollectionUtils.isEmpty((Collection)productdetaillNewInventoryCountList)) {
            return count;
        }
        List productdetaillNewInventoryCountLists = ListSplitUtil.splitListByCapacity((List)productdetaillNewInventoryCountList, (int)50);
        for (List productdetaillNewInventoryCount : productdetaillNewInventoryCountLists) {
            map.put("productdetaillNewlist", productdetaillNewInventoryCount);
            count = SqlHelper.update((String)"com.yonyoucloud.upc.product.dao.ProductUpdate.updateProductdetaillNewInventoryCountOtherDB", map);
        }
        map.remove("productdetaillNewlist");
        return count;
    }

    @Override
    public int updateProductSkuInventoryCountByNoShopIdOtherDb(Map<String, Object> map) throws Exception {
        int count = 0;
        Map productskudetailnewInvCountByNoShopId = (Map)SqlHelper.selectOne((String)"com.yonyoucloud.upc.product.dao.ProductUpdate.selectProductskudetailnewInvCountByNoShopIdOtherDB", map);
        if (productskudetailnewInvCountByNoShopId == null || productskudetailnewInvCountByNoShopId.isEmpty()) {
            return count;
        }
        map.put("id", productskudetailnewInvCountByNoShopId.get("id"));
        map.put("lInventoryCount", productskudetailnewInvCountByNoShopId.get("lInventoryCount"));
        map.put("inventoryCount", productskudetailnewInvCountByNoShopId.get("inventoryCount"));
        SqlHelper.update((String)"com.yonyoucloud.upc.product.dao.ProductUpdate.updateProductskudetailnewInvCountByNoShopIdOtherDB", map);
        map.remove("id");
        map.remove("lInventoryCount");
        map.remove("inventoryCount");
        Map productdetailInvCountByNoShopId = (Map)SqlHelper.selectOne((String)"com.yonyoucloud.upc.product.dao.ProductUpdate.selectProductdetailInvCountByNoShopIdOtherDB", map);
        if (productdetailInvCountByNoShopId == null || productdetailInvCountByNoShopId.isEmpty()) {
            return count;
        }
        map.put("id", productdetailInvCountByNoShopId.get("id"));
        map.put("lInventoryCount", productdetailInvCountByNoShopId.get("lInventoryCount"));
        count = SqlHelper.update((String)"com.yonyoucloud.upc.product.dao.ProductUpdate.updateProductdetailInvCountByNoShopIdOtherDB", map);
        map.remove("id");
        map.remove("lInventoryCount");
        return count;
    }

    @Override
    public void updateSkuBackStatusOfApplierOtherDb(Map<String, Object> map) throws Exception {
        List productSkuDetailNewStatusOfApplierList = SqlHelper.selectList((String)"com.yonyoucloud.upc.product.dao.ProductUpdate.selectProductSkuDetailNewStatusOfApplier", map);
        if (CollectionUtils.isEmpty((Collection)productSkuDetailNewStatusOfApplierList)) {
            return;
        }
        List productSkuDetailNewList = ListSplitUtil.splitListByCapacity((List)productSkuDetailNewStatusOfApplierList, (int)50);
        for (List productSkuDetailNew : productSkuDetailNewList) {
            map.put("idsList", productSkuDetailNew);
            SqlHelper.update((String)"com.yonyoucloud.upc.product.dao.ProductUpdate.updateProductSkuDetailNewStatusOfApplier", map);
        }
        map.remove("idsList");
    }

    @Override
    public void updateProductSpecItemOrder(Map<String, Object> map) throws Exception {
        List productSpecItemOrderOtherDBs = SqlHelper.selectList((String)"com.yonyoucloud.upc.product.dao.ProductUpdate.selectProductSpecItemOrderOtherDB", map);
        if (CollectionUtils.isEmpty((Collection)productSpecItemOrderOtherDBs)) {
            return;
        }
        List productSpecItemOrderLists = ListSplitUtil.splitListByCapacity((List)productSpecItemOrderOtherDBs, (int)50);
        for (List productSpecItemOrders : productSpecItemOrderLists) {
            map.put("productspecitemidslist", productSpecItemOrders);
            SqlHelper.update((String)"com.yonyoucloud.upc.product.dao.ProductUpdate.updateProductSpecItemOrderOtherDB", map);
        }
        map.remove("productspecitemidslist");
    }

    @Override
    public void updateBusinessUnitOtherDb(Map<String, Object> map) throws Exception {
        List productDetailUnifiedFieldList = SqlHelper.selectList((String)"com.yonyoucloud.upc.product.dao.ProductUpdate.selectProductDetailUnits", map);
        if (CollectionUtils.isEmpty((Collection)productDetailUnifiedFieldList)) {
            return;
        }
        List productDetailUnifiedFieldLists = ListSplitUtil.splitListByCapacity((List)productDetailUnifiedFieldList, (int)50);
        for (List productDetailUnifiedFields : productDetailUnifiedFieldLists) {
            map.put("productdetailidslist", productDetailUnifiedFields);
            SqlHelper.update((String)"com.yonyoucloud.upc.product.dao.ProductUpdate.updateProductDetailUnits", map);
        }
        map.remove("productdetailidslist");
    }
}


/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.yonyou.iuap.apdoc.coredoc.utils.ListSplitUtil
 *  com.yonyou.ucf.mdd.ext.base.tenant.Tenant
 *  com.yonyou.ucf.mdd.ext.dao.meta.MetaDaoHelper
 *  com.yonyou.ucf.mdd.ext.dao.sql.SqlHelper
 *  com.yonyoucloud.iuap.upc.api.ISkuServiceV2
 *  com.yonyoucloud.iuap.upc.dto.ProductSkuDTO
 *  com.yonyoucloud.upc.pc.product.ProductSKU
 *  com.yonyoucloud.upc.utils.UpcStringUtil
 *  org.imeta.orm.base.EntityStatus
 *  org.slf4j.Logger
 *  org.slf4j.LoggerFactory
 *  org.springframework.beans.factory.annotation.Autowired
 *  org.springframework.stereotype.Service
 */
package com.yonyou.iuap.upc.dataupdate;

import com.yonyou.iuap.apdoc.coredoc.utils.ListSplitUtil;
import com.yonyou.iuap.upc.dataupdate.DataUpdateBaseServcie;
import com.yonyou.ucf.mdd.ext.base.tenant.Tenant;
import com.yonyou.ucf.mdd.ext.dao.meta.MetaDaoHelper;
import com.yonyou.ucf.mdd.ext.dao.sql.SqlHelper;
import com.yonyoucloud.iuap.upc.api.ISkuServiceV2;
import com.yonyoucloud.iuap.upc.dto.ProductSkuDTO;
import com.yonyoucloud.upc.pc.product.ProductSKU;
import com.yonyoucloud.upc.utils.UpcStringUtil;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.imeta.orm.base.EntityStatus;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SkuMd5Update
extends DataUpdateBaseServcie {
    private static final Logger log = LoggerFactory.getLogger(SkuMd5Update.class);
    @Autowired
    private ISkuServiceV2 skuService;

    @Override
    public int businessDataUpdate(Tenant tenant, int capacity) throws Exception {
        return this.upgradeSkuMd5(tenant, capacity);
    }

    @Override
    public String getTaskName() {
        return "SKU\u7684MD5\u503c";
    }

    private int upgradeSkuMd5(Tenant tenant, int capacity) throws Exception {
        int tenantCount = 0;
        HashMap<String, Object> tenantIdParamMap = new HashMap<String, Object>(4);
        tenantIdParamMap.put("tenantId", tenant.getId());
        Object productCount = SqlHelper.selectOne((String)"com.yonyoucloud.upc.data.ProductDoubleWriteDao.selectProductCountByTenantId", tenantIdParamMap);
        ArrayList<Long> productIdList = new ArrayList<Long>();
        if (productCount != null && Integer.parseInt(productCount.toString()) > 0) {
            List<List<Long>> productIdSplitList = this.getProductIdPageList(capacity, tenantIdParamMap, productIdList);
            for (List<Long> limitProductIdList : productIdSplitList) {
                int updateCount = this.updateSkuMd5(limitProductIdList);
                tenantCount += updateCount;
            }
            log.error(String.format("\u79df\u6237\u3010%s\u3011\u66f4\u65b0SKU\u7684MD5\u503c\u5347\u7ea7\u5b8c\u6210\uff0c\u5171\u8ba1\u5347\u7ea7\u6570\u636e\u3010%d\u3011\u6761\uff0c", tenant.getId().toString(), tenantCount) + LocalDateTime.now());
        }
        return tenantCount;
    }

    private List<List<Long>> getProductIdPageList(int capacity, Map<String, Object> tenantIdParamMap, List<Long> productIdList) throws Exception {
        Long currentProductId = 0L;
        int realMaxRowsValue = this.ymsParamConfig.getResultMaxRowsValue() - 1;
        tenantIdParamMap.put("id", currentProductId);
        tenantIdParamMap.put("maxRowsValue", realMaxRowsValue);
        List productIdListTemp = SqlHelper.selectList((String)"com.yonyoucloud.upc.data.ProductDoubleWriteDao.selectProductIdListByTenantIdAndMinId", tenantIdParamMap);
        productIdList.addAll(productIdListTemp);
        while (productIdListTemp.size() >= realMaxRowsValue) {
            Long productNewMinId = (Long)productIdListTemp.get(productIdListTemp.size() - 1);
            tenantIdParamMap.put("id", productNewMinId);
            productIdListTemp = SqlHelper.selectList((String)"com.yonyoucloud.upc.data.ProductDoubleWriteDao.selectProductIdListByTenantIdAndMinId", tenantIdParamMap);
            productIdList.addAll(productIdListTemp);
        }
        List productIdSplitList = ListSplitUtil.splitListByCapacity(productIdList, (int)capacity);
        return productIdSplitList;
    }

    private Integer updateSkuMd5(List<Long> productIdList) throws Exception {
        int updateCount = 0;
        List skuDTOList = this.skuService.listSkuByProductIds(productIdList, new String[]{"id", "productId", "specIds"});
        if (skuDTOList != null && skuDTOList.size() > 0) {
            ArrayList<ProductSKU> productSKUList = new ArrayList<ProductSKU>();
            for (ProductSkuDTO productSkuDTO : skuDTOList) {
                if (null == productSkuDTO.getSpecIds()) continue;
                String[] idsArray = productSkuDTO.getSpecIds().split(";");
                ArrayList<String> idList = new ArrayList<String>(Arrays.asList(idsArray));
                idList.add(productSkuDTO.getProductId().toString());
                String md5 = UpcStringUtil.sortStrMd5(idList);
                ProductSKU productSKU = new ProductSKU();
                productSKU.setId((Object)productSkuDTO.getId());
                productSKU.setFreeValueIds(productSkuDTO.getSpecIds());
                productSKU.setFreeValueIdsMd5(md5);
                productSKU.setEntityStatus(EntityStatus.Update);
                productSKUList.add(productSKU);
                ++updateCount;
            }
            MetaDaoHelper.update((String)"pc.product.ProductSKU", productSKUList);
        }
        return updateCount;
    }
}


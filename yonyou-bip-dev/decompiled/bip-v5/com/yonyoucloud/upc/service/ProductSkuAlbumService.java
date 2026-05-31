/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.yonyou.iuap.fileservice.sdk.module.CooperationFileService
 *  com.yonyou.iuap.fileservice.sdk.module.pojo.BatchBusinessFilesRequest
 *  com.yonyou.iuap.fileservice.sdk.module.pojo.CooperationSuiteFile
 *  com.yonyou.ucf.mdd.ext.core.AppContext
 *  com.yonyou.ucf.mdd.ext.dao.meta.MetaDaoHelper
 *  com.yonyou.ucf.mdd.ext.dao.sql.SqlHelper
 *  com.yonyoucloud.upc.pc.product.Product
 *  org.imeta.orm.base.BizObject
 *  org.imeta.orm.base.EntityStatus
 *  org.slf4j.Logger
 *  org.slf4j.LoggerFactory
 *  org.springframework.beans.factory.annotation.Autowired
 *  org.springframework.stereotype.Service
 *  org.springframework.util.CollectionUtils
 */
package com.yonyoucloud.upc.service;

import com.yonyou.iuap.fileservice.sdk.module.CooperationFileService;
import com.yonyou.iuap.fileservice.sdk.module.pojo.BatchBusinessFilesRequest;
import com.yonyou.iuap.fileservice.sdk.module.pojo.CooperationSuiteFile;
import com.yonyou.ucf.mdd.ext.core.AppContext;
import com.yonyou.ucf.mdd.ext.dao.meta.MetaDaoHelper;
import com.yonyou.ucf.mdd.ext.dao.sql.SqlHelper;
import com.yonyoucloud.upc.pc.product.Product;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.imeta.orm.base.BizObject;
import org.imeta.orm.base.EntityStatus;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;

@Service(value="productSkuAlbumService")
public class ProductSkuAlbumService {
    private static final Logger log = LoggerFactory.getLogger(ProductSkuAlbumService.class);
    @Autowired
    CooperationFileService cooperationFileService;

    public Map<String, List<Map>> getSkuSpecItemAlbums(List<Long> skuIds) throws Exception {
        HashMap<String, List<Map>> result = new HashMap<String, List<Map>>(skuIds.size());
        if (!CollectionUtils.isEmpty(skuIds)) {
            this.getFileFromCooperation(result, skuIds);
        }
        return result;
    }

    private void getFileFromCooperation(Map<String, List<Map>> result, List<Long> skuIds) {
        HashMap<String, Object> params = new HashMap<String, Object>(2);
        params.put("skuIds", skuIds);
        params.put("ytenantId", AppContext.getYhtTenantId());
        List itemList = SqlHelper.selectList((String)"com.yonyoucloud.upc.product.dao.ProductQuery.getSkuFreeItems", params);
        if (!CollectionUtils.isEmpty((Collection)itemList)) {
            ArrayList businessIdList = new ArrayList();
            HashMap businessAndCharacterItemsMap = new HashMap();
            itemList.forEach(data -> {
                if (null != data.get("imgBusinessId")) {
                    businessIdList.add(data.get("imgBusinessId").toString());
                    businessAndCharacterItemsMap.put(data.get("imgBusinessId").toString(), data);
                }
            });
            if (!CollectionUtils.isEmpty(businessIdList)) {
                ArrayList<BatchBusinessFilesRequest> batchBusinessFilesRequestList = new ArrayList<BatchBusinessFilesRequest>();
                BatchBusinessFilesRequest batchBusinessFilesRequest = new BatchBusinessFilesRequest();
                batchBusinessFilesRequest.setBusinessType("iuap-apdoc-material");
                batchBusinessFilesRequest.setBusinessIds(businessIdList);
                batchBusinessFilesRequest.setCancelFileExit(Boolean.valueOf(true));
                batchBusinessFilesRequestList.add(batchBusinessFilesRequest);
                CooperationSuiteFile cooperationSuiteFile = this.cooperationFileService.batchBusinessFiles(batchBusinessFilesRequestList);
                List cooperationFileInfoList = cooperationSuiteFile.getData();
                if (!CollectionUtils.isEmpty((Collection)cooperationFileInfoList)) {
                    cooperationFileInfoList.forEach(cooperationFileVO -> {
                        String objectId = cooperationFileVO.getObjectId();
                        Map data = (Map)businessAndCharacterItemsMap.get(objectId);
                        if (null != data) {
                            String skuId = data.get("skuId").toString();
                            List albumList = result.containsKey(skuId) ? (List)result.get(skuId) : new ArrayList();
                            HashMap<String, String> albumMap = new HashMap<String, String>();
                            albumMap.putAll(data);
                            albumMap.put("folder", cooperationFileVO.getBucketUrl());
                            albumMap.put("imgName", cooperationFileVO.getFileName());
                            albumList.add(albumMap);
                            result.put(skuId, albumList);
                        }
                    });
                }
            }
        }
    }

    public void dealProductDubbleCodes(List<String> yTenantIds) throws Exception {
        String reg = "-copy";
        List list = SqlHelper.selectList((String)"com.yonyoucloud.upc.product.dao.ProductQuery.getProductDubbleCodes", yTenantIds);
        if (!CollectionUtils.isEmpty((Collection)list)) {
            list.forEach(data -> {
                String code = "";
                String ids = "";
                if (null != data.get("code")) {
                    code = data.get("code").toString();
                }
                if (null == data.get("ids")) {
                    return;
                }
                ids = data.get("ids").toString();
                String[] idsArr = ids.split(",");
                for (int i = 0; i < idsArr.length; ++i) {
                    if (i == 0) continue;
                    Product product = new Product();
                    product.setId((Object)Long.parseLong(idsArr[i]));
                    product.setCode(code + reg + i);
                    product.setEntityStatus(EntityStatus.Update);
                    try {
                        MetaDaoHelper.update((String)"pc.product.Product", (BizObject)product);
                    }
                    catch (Exception exception) {
                        // empty catch block
                    }
                    log.error("com.yonyoucloud.upc.service.ProductSkuAlbumService.dealProductDubbleCodes is deal data code: , id :" + idsArr[i]);
                }
            });
        }
        log.error("com.yonyoucloud.upc.service.ProductSkuAlbumService.dealProductDubbleCodesend");
    }
}


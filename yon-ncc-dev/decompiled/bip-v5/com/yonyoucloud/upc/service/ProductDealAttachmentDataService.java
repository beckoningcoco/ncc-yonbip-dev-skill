/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.yonyou.iuap.fileservice.sdk.module.CooperationFileService
 *  com.yonyou.iuap.fileservice.sdk.module.pojo.response.CommonResponse
 *  com.yonyoucloud.upc.pc.product.Product
 *  org.slf4j.Logger
 *  org.slf4j.LoggerFactory
 *  org.springframework.beans.factory.annotation.Autowired
 *  org.springframework.stereotype.Service
 *  org.springframework.util.CollectionUtils
 */
package com.yonyoucloud.upc.service;

import com.yonyou.iuap.fileservice.sdk.module.CooperationFileService;
import com.yonyou.iuap.fileservice.sdk.module.pojo.response.CommonResponse;
import com.yonyoucloud.upc.pc.product.Product;
import com.yonyoucloud.upc.service.AttachmentGroupBindService;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;

@Service(value="productDealAttachmentDataService")
public class ProductDealAttachmentDataService {
    private static final Logger log = LoggerFactory.getLogger(ProductDealAttachmentDataService.class);
    @Autowired
    CooperationFileService cooperationFileService;
    @Autowired
    AttachmentGroupBindService attachmentGroupBindService;

    public void dealProductImgBusinessId(Product product) throws Exception {
        if (product.get("productHomeAlbums_imgName") != null) {
            if (product.get("homepageBusinessId") != null) {
                this.changeBusinessId(product.get("productHomeAlbums_imgName").toString(), product.get("homepageBusinessId").toString());
            } else {
                product.put("homepageBusinessId", product.get("productHomeAlbums_imgName"));
            }
        }
        if (product.get("productAlbums_imgName") != null) {
            if (product.get("imgBusinessId") != null) {
                this.changeBusinessId(product.get("productAlbums_imgName").toString(), product.get("imgBusinessId").toString(), product.get("exportMode"));
            } else {
                product.put("imgBusinessId", product.get("productAlbums_imgName"));
            }
        }
        if (product.get("productVideo_fileName") != null) {
            if (product.get("videoBusinessId") != null) {
                this.changeBusinessId(product.get("productVideo_fileName").toString(), product.get("videoBusinessId").toString(), product.get("exportMode"));
            } else {
                product.put("videoBusinessId", product.get("productVideo_fileName"));
            }
        }
        if (product.get("productAttachment_fileName") != null && product.getId() != null) {
            CommonResponse commonResponse;
            List cooperationFileInfos;
            long businessId = this.changeBusinessId(product.get("productAttachment_fileName").toString(), product.getId().toString(), product.get("exportMode"));
            if (businessId == 0L) {
                log.error("\u7269\u6599\u5bfc\u5165\u9644\u4ef6\u8f6c\u6362\u4e1a\u52a1id\u672a\u6210\u529f\uff0cnewBusinessId:" + product.get("productAttachment_fileName") + "oldBusinessId:" + product.getId());
            } else if (product.get("attachmentGroupItemId_Name") != null && !CollectionUtils.isEmpty((Collection)(cooperationFileInfos = this.cooperationFileService.queryFileList("iuap-apdoc-material", product.getId().toString(), 1, 100))) && (commonResponse = this.attachmentGroupBindService.bindGroupForAttachment(product.getId().toString(), "productcenter.pc_product", product.get("attachmentGroupItemId_Name").toString(), cooperationFileInfos.stream().map(file -> file.getFileId()).collect(Collectors.toList()))).getCode() != 200L) {
                log.error("\u7269\u6599\u5bfc\u5165\u9644\u4ef6\u7ed1\u5b9a\u9644\u4ef6\u5206\u7ec4\u672a\u6210\u529f");
            }
            product.put("_ecsuite_temp", product.getId());
        }
    }

    public Long changeBusinessId(String newBusinessId, String oldBusinessId, Object exportMode) throws Exception {
        if (exportMode == null || "2".equals(exportMode.toString())) {
            this.cooperationFileService.deleteFileByBusiness("iuap-apdoc-material", oldBusinessId);
        }
        long businessId = this.cooperationFileService.changeBusinessId("iuap-apdoc-material", newBusinessId, oldBusinessId);
        return businessId;
    }

    public Long changeBusinessId(String newBusinessId, String oldBusinessId) throws Exception {
        this.cooperationFileService.deleteFileByBusiness("iuap-apdoc-material", oldBusinessId);
        long businessId = this.cooperationFileService.changeBusinessId("iuap-apdoc-material", newBusinessId, oldBusinessId);
        return businessId;
    }
}


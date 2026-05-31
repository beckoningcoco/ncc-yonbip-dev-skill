/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.yonyou.iuap.apdoc.coredoc.attachment.service.AttachmentServiceImpl
 *  com.yonyoucloud.iuap.upc.dto.attachment.AttachmentInfoDTO
 *  com.yonyoucloud.iuap.upc.vo.attachment.AttachmentQueryVO
 *  com.yonyoucloud.upc.utils.AttachmentBusinessTypeEnum
 *  com.yonyoucloud.upc.utils.CoreDocJsonResult
 *  com.yonyoucloud.upc.utils.NumberCheckUtil
 *  org.slf4j.Logger
 *  org.slf4j.LoggerFactory
 *  org.springframework.beans.factory.annotation.Autowired
 *  org.springframework.stereotype.Service
 *  org.springframework.util.CollectionUtils
 *  org.springframework.util.StringUtils
 */
package com.yonyoucloud.upc.service.api;

import com.yonyou.iuap.apdoc.coredoc.attachment.service.AttachmentServiceImpl;
import com.yonyoucloud.iuap.upc.dto.attachment.AttachmentInfoDTO;
import com.yonyoucloud.iuap.upc.vo.attachment.AttachmentQueryVO;
import com.yonyoucloud.upc.utils.AttachmentBusinessTypeEnum;
import com.yonyoucloud.upc.utils.CoreDocJsonResult;
import com.yonyoucloud.upc.utils.NumberCheckUtil;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;
import org.springframework.util.StringUtils;

@Service
public class FormulaPubFuntion {
    private static final Logger log = LoggerFactory.getLogger(FormulaPubFuntion.class);
    @Autowired
    private AttachmentServiceImpl attachmentService;

    protected HashMap<String, List<Long>> groupDocByOrgIds(List<Long> docIdList, List<String> orgIdList) {
        HashMap<String, List<Long>> orgDocMap = new HashMap<String, List<Long>>();
        if (docIdList.size() != orgIdList.size()) {
            log.error("\u7ec4\u7ec7ID\u4e0e\u6863\u6848ID\u6570\u91cf\u4e0d\u5339\u914d\uff0c\u8bf7\u68c0\u67e5\u53c2\u6570\u5408\u6cd5\u6027");
        } else {
            int index = 0;
            for (String orgId : orgIdList) {
                List<Long> productList = orgDocMap.get(orgId);
                if (productList == null) {
                    productList = new ArrayList<Long>();
                }
                productList.add(docIdList.get(index++));
                orgDocMap.put(orgId, productList);
            }
        }
        return orgDocMap;
    }

    protected List<String> createMatchKey(List<Long> docIdList, List<String> orgIdList) {
        ArrayList<String> matchKey = new ArrayList<String>(docIdList.size());
        if (docIdList.size() != orgIdList.size()) {
            log.error("\u7ec4\u7ec7ID\u4e0e\u6863\u6848ID\u6570\u91cf\u4e0d\u5339\u914d\uff0c\u8bf7\u68c0\u67e5\u53c2\u6570\u5408\u6cd5\u6027");
        } else {
            int index = 0;
            for (String orgId : orgIdList) {
                matchKey.add(this.getKey(docIdList.get(index++), orgId));
            }
        }
        return matchKey;
    }

    protected String getKey(Long productId, String orgId) {
        return productId + "_" + orgId;
    }

    protected Object matchValue(List<Long> docIdList, HashMap<Long, Object> valueMap) {
        ArrayList valueList = new ArrayList(docIdList.size());
        docIdList.forEach(docId -> valueList.add(valueMap.get(docId)));
        return valueList;
    }

    protected Object matchStrValue(List<String> docIdList, HashMap<String, Object> valueMap) {
        ArrayList valueList = new ArrayList(docIdList.size());
        docIdList.forEach(docId -> valueList.add(valueMap.get(docId)));
        return valueList;
    }

    protected String getAttachUrl(Long productId) {
        String url = "";
        CoreDocJsonResult<AttachmentInfoDTO> resultVO = this.getAttachUrl(productId, AttachmentBusinessTypeEnum.PRODUCT_HOME_PAGE_IMAGE);
        if (!CollectionUtils.isEmpty((Collection)resultVO.getData())) {
            url = ((AttachmentInfoDTO)resultVO.getData().get(0)).getDownloadUrl();
        }
        return url;
    }

    protected CoreDocJsonResult<AttachmentInfoDTO> getAttachUrl(Long productId, AttachmentBusinessTypeEnum businessType) {
        if (null != productId && businessType != null) {
            AttachmentQueryVO attachmentQueryVO = new AttachmentQueryVO();
            attachmentQueryVO.setArchiveId(productId.toString());
            attachmentQueryVO.setBusinessType(businessType);
            return this.attachmentService.queryAttachmentDetail(attachmentQueryVO);
        }
        return null;
    }

    protected HashMap<Long, Object> fillAttachmentUrl(List<Long> productIds) {
        HashMap<Long, Object> businessIdMap = new HashMap<Long, Object>();
        ArrayList businessIdList = new ArrayList();
        productIds.forEach(productId -> businessIdList.add(productId.toString()));
        AttachmentQueryVO attachmentQueryVO = new AttachmentQueryVO();
        attachmentQueryVO.setArchiveIdList(businessIdList);
        attachmentQueryVO.setBusinessType(AttachmentBusinessTypeEnum.PRODUCT_HOME_PAGE_IMAGE);
        CoreDocJsonResult resultVO = this.attachmentService.queryAttachmentDetailList(attachmentQueryVO);
        if (!CollectionUtils.isEmpty((Collection)resultVO.getData())) {
            HashMap attachUrlMap = new HashMap();
            resultVO.getData().forEach(data -> {
                if (!CollectionUtils.isEmpty((Collection)data.getAttachmentInfoDTOList())) {
                    data.getAttachmentInfoDTOList().forEach(attachmentInfoDTO -> businessIdMap.put(Long.valueOf(attachmentInfoDTO.getBusinessId()), attachmentInfoDTO.getDownloadUrl()));
                }
            });
        }
        return businessIdMap;
    }

    public List<Long> toLongList(List<Object> objectList) {
        ArrayList<Long> longList = new ArrayList<Long>();
        if (!CollectionUtils.isEmpty(objectList)) {
            for (Object element : objectList) {
                if (element != null) {
                    String value = element.toString();
                    if (StringUtils.hasLength((String)value) && NumberCheckUtil.isPositiveInt((Object)value)) {
                        longList.add(Long.parseLong(value));
                        continue;
                    }
                    longList.add(0L);
                    continue;
                }
                longList.add(0L);
            }
        }
        return longList;
    }

    public List<String> toStringList(List<Object> objectList) {
        ArrayList<String> stringList = new ArrayList<String>();
        if (!CollectionUtils.isEmpty(objectList)) {
            for (Object element : objectList) {
                if (element != null) {
                    stringList.add(element.toString());
                    continue;
                }
                stringList.add("");
            }
        }
        return stringList;
    }
}


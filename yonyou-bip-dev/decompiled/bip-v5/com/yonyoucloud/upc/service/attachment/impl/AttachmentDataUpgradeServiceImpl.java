/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.alibaba.fastjson.JSON
 *  com.alibaba.fastjson.JSONObject
 *  com.yonyou.diwork.ott.exexutors.RobotExecutors
 *  com.yonyou.iuap.apdoc.coredoc.config.YMSParamConfig
 *  com.yonyou.iuap.apdoc.coredoc.enums.CoreExtrateBusinessErrorEnum
 *  com.yonyou.iuap.apdoc.coredoc.exceptions.CoreDocBusinessException
 *  com.yonyou.iuap.apdoc.coredoc.utils.ListSplitUtil
 *  com.yonyou.iuap.fileservice.sdk.enums.FileType
 *  com.yonyou.iuap.fileservice.sdk.module.CooperationFileDataService
 *  com.yonyou.iuap.fileservice.sdk.module.CooperationFileGroupService
 *  com.yonyou.iuap.fileservice.sdk.module.CooperationFileImageService
 *  com.yonyou.iuap.fileservice.sdk.module.CooperationFileService
 *  com.yonyou.iuap.fileservice.sdk.module.pojo.CooperationFileInfo
 *  com.yonyou.iuap.fileservice.sdk.module.pojo.FileInfoMoveRequest
 *  com.yonyou.iuap.fileservice.sdk.module.pojo.group.GroupBindFileRequest
 *  com.yonyou.iuap.fileservice.sdk.module.pojo.group.GroupDto
 *  com.yonyou.iuap.fileservice.sdk.module.pojo.response.CommonResponse
 *  com.yonyou.iuap.ucf.common.i18n.InternationalUtils
 *  com.yonyou.ucf.mdd.ext.dao.meta.MetaDaoHelper
 *  com.yonyou.ucf.mdd.ext.dao.sql.SqlHelper
 *  com.yonyoucloud.upc.aa.customerapply.CustomerApply
 *  com.yonyoucloud.upc.aa.merchant.Merchant
 *  com.yonyoucloud.upc.attachment.AttachmentUpgradeResult
 *  com.yonyoucloud.upc.pc.brand.Brand
 *  com.yonyoucloud.upc.pc.cls.PresentationClass
 *  com.yonyoucloud.upc.pc.product.Product
 *  com.yonyoucloud.upc.pc.product.ProductFreeCharacterItem
 *  com.yonyoucloud.upc.pc.product.ProductSpecItem
 *  com.yonyoucloud.upc.pc.productapply.ProductApply
 *  com.yonyoucloud.upc.pc.tag.Tag
 *  com.yonyoucloud.upc.utils.PingYinUtil
 *  org.imeta.orm.base.BizObject
 *  org.imeta.orm.base.EntityStatus
 *  org.imeta.orm.schema.ConditionExpression
 *  org.imeta.orm.schema.QueryCondition
 *  org.imeta.orm.schema.QueryConditionGroup
 *  org.imeta.orm.schema.QuerySchema
 *  org.imeta.spring.support.id.IdManager
 *  org.slf4j.Logger
 *  org.slf4j.LoggerFactory
 *  org.springframework.beans.factory.annotation.Autowired
 *  org.springframework.beans.factory.annotation.Qualifier
 *  org.springframework.stereotype.Service
 *  org.springframework.util.CollectionUtils
 */
package com.yonyoucloud.upc.service.attachment.impl;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.yonyou.diwork.ott.exexutors.RobotExecutors;
import com.yonyou.iuap.apdoc.coredoc.config.YMSParamConfig;
import com.yonyou.iuap.apdoc.coredoc.enums.CoreExtrateBusinessErrorEnum;
import com.yonyou.iuap.apdoc.coredoc.exceptions.CoreDocBusinessException;
import com.yonyou.iuap.apdoc.coredoc.utils.ListSplitUtil;
import com.yonyou.iuap.fileservice.sdk.enums.FileType;
import com.yonyou.iuap.fileservice.sdk.module.CooperationFileDataService;
import com.yonyou.iuap.fileservice.sdk.module.CooperationFileGroupService;
import com.yonyou.iuap.fileservice.sdk.module.CooperationFileImageService;
import com.yonyou.iuap.fileservice.sdk.module.CooperationFileService;
import com.yonyou.iuap.fileservice.sdk.module.pojo.CooperationFileInfo;
import com.yonyou.iuap.fileservice.sdk.module.pojo.FileInfoMoveRequest;
import com.yonyou.iuap.fileservice.sdk.module.pojo.group.GroupBindFileRequest;
import com.yonyou.iuap.fileservice.sdk.module.pojo.group.GroupDto;
import com.yonyou.iuap.fileservice.sdk.module.pojo.response.CommonResponse;
import com.yonyou.iuap.ucf.common.i18n.InternationalUtils;
import com.yonyou.ucf.mdd.ext.dao.meta.MetaDaoHelper;
import com.yonyou.ucf.mdd.ext.dao.sql.SqlHelper;
import com.yonyoucloud.upc.aa.customerapply.CustomerApply;
import com.yonyoucloud.upc.aa.merchant.Merchant;
import com.yonyoucloud.upc.attachment.AttachmentUpgradeResult;
import com.yonyoucloud.upc.enums.AttachmentUpgradeEnum;
import com.yonyoucloud.upc.pc.brand.Brand;
import com.yonyoucloud.upc.pc.cls.PresentationClass;
import com.yonyoucloud.upc.pc.product.Product;
import com.yonyoucloud.upc.pc.product.ProductFreeCharacterItem;
import com.yonyoucloud.upc.pc.product.ProductSpecItem;
import com.yonyoucloud.upc.pc.productapply.ProductApply;
import com.yonyoucloud.upc.pc.tag.Tag;
import com.yonyoucloud.upc.service.LogicDatasourceService;
import com.yonyoucloud.upc.service.attachment.AttachmentDataUpgradeService;
import com.yonyoucloud.upc.utils.PingYinUtil;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collectors;
import org.imeta.orm.base.BizObject;
import org.imeta.orm.base.EntityStatus;
import org.imeta.orm.schema.ConditionExpression;
import org.imeta.orm.schema.QueryCondition;
import org.imeta.orm.schema.QueryConditionGroup;
import org.imeta.orm.schema.QuerySchema;
import org.imeta.spring.support.id.IdManager;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;

@Service
public class AttachmentDataUpgradeServiceImpl
implements AttachmentDataUpgradeService {
    private static final Logger log = LoggerFactory.getLogger(AttachmentDataUpgradeServiceImpl.class);
    @Autowired
    CooperationFileDataService cooperationFileDataService;
    @Autowired
    CooperationFileGroupService cooperationFileGroupService;
    @Autowired
    CooperationFileService cooperationFileService;
    @Autowired
    CooperationFileImageService cooperationFileImageService;
    @Autowired
    private YMSParamConfig ymsParamConfig;
    private Pattern CHINESE_CHARACTER_PATTERN;
    @Autowired
    @Qualifier(value="ymsLongTaskExecutorService")
    private ExecutorService ymsLongTaskExecutorService;
    private static final String APP_CODE = "PF";
    @Autowired
    private LogicDatasourceService logicDatasourceService;

    private Pattern getChineseCharacterPattern() {
        if (this.CHINESE_CHARACTER_PATTERN == null) {
            this.CHINESE_CHARACTER_PATTERN = Pattern.compile(InternationalUtils.getMessageWithDefault((String)"UID:P_COREDOC-BE_181E96BE05900045", (String)"[\u4e00-\u9fa5|\uff01\uff0c\u3002\uff08\uff09\u300a\u300b\u201c\u201d\uff1f\uff1a\uff1b\u3010\u3011]"));
        }
        return this.CHINESE_CHARACTER_PATTERN;
    }

    @Override
    public void allAttachmentDataUpgrade(String yhtToken) {
    }

    @Override
    public void productAttachmentDataUpgrade(List<Long> tenantIdList) {
        if (this.queryIsTriggerUpgrade(AttachmentUpgradeEnum.PRODUCT_ATTACHMENT)) {
            return;
        }
        this.recordBeginUpgrade(AttachmentUpgradeEnum.PRODUCT_ATTACHMENT);
        if (tenantIdList.isEmpty()) {
            QuerySchema queryProductAttachmentTenantSchema = QuerySchema.create().addSelect("tenant").distinct();
            List queryProductAttachmentTenantList = null;
            try {
                queryProductAttachmentTenantList = MetaDaoHelper.queryNoPartition((String)"pc.product.ProductAttachment", (QuerySchema)queryProductAttachmentTenantSchema, null);
            }
            catch (Exception e) {
                log.error("\u67e5\u8be2\u7269\u6599\u9644\u4ef6\u79df\u6237\u5f02\u5e38" + e.getMessage(), (Throwable)e);
            }
            if (CollectionUtils.isEmpty((Collection)queryProductAttachmentTenantList)) {
                this.recordUpgradeSuccess(AttachmentUpgradeEnum.PRODUCT_ATTACHMENT);
                return;
            }
            tenantIdList = queryProductAttachmentTenantList.stream().map(a -> Long.parseLong(a.get("tenant").toString())).collect(Collectors.toList());
        }
        Map<Long, String> tenantIdMapping = this.getTenantIdMapping(tenantIdList);
        for (Long tenantId : tenantIdList) {
            QuerySchema queryProductAttachmentIdSchemaSchema = QuerySchema.create().addSelect("id").addCondition((ConditionExpression)QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"tenant").eq((Object)tenantId)}));
            List queryProductAttachmentIdList = null;
            try {
                queryProductAttachmentIdList = MetaDaoHelper.queryNoPartition((String)"pc.product.ProductAttachment", (QuerySchema)queryProductAttachmentIdSchemaSchema, null);
            }
            catch (Exception e) {
                log.error("\u67e5\u8be2\u7269\u6599\u9644\u4ef6ID\u96c6\u5408\u5f02\u5e38" + e.getMessage(), (Throwable)e);
            }
            List productAttachmentIdList = queryProductAttachmentIdList.stream().map(a -> Long.parseLong(a.get("id").toString())).collect(Collectors.toList());
            List lists = ListSplitUtil.splitListByCapacity(productAttachmentIdList, (int)1000);
            for (List list : lists) {
                try {
                    this.productAttachmentDataUpgradeByIdList(list, tenantIdMapping.get(tenantId));
                }
                catch (Exception e) {
                    log.error("\u5347\u7ea7\u7269\u6599\u9644\u4ef6\u5f02\u5e38\uff0c\u5f02\u5e38\u96c6\u5408:" + list + "\u5f02\u5e38\u4fe1\u606f\uff1a" + e.getMessage(), (Throwable)e);
                    this.recordUpgradeException(AttachmentUpgradeEnum.PRODUCT_ATTACHMENT, list.stream().map(String::valueOf).collect(Collectors.joining(",")), e.getMessage() == null ? e.toString() : e.getMessage());
                }
            }
        }
        this.recordUpgradeSuccess(AttachmentUpgradeEnum.PRODUCT_ATTACHMENT);
    }

    public void productAttachmentDataUpgradeByIdList(List<Long> idList, String ytenantId) throws Exception {
        ArrayList<FileInfoMoveRequest> fileInfoMoveRequestList = new ArrayList<FileInfoMoveRequest>();
        QuerySchema queryProductAttachmentDetailSchema = QuerySchema.create().addSelect("id,productId,folder,fileName,type,size,attachmentGroupItemId").addCondition((ConditionExpression)QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"id").in(idList)}));
        List queryProductAttachmentDetailList = MetaDaoHelper.queryNoPartition((String)"pc.product.ProductAttachment", (QuerySchema)queryProductAttachmentDetailSchema, null);
        for (Map productAttachmentDetailMap : queryProductAttachmentDetailList) {
            FileInfoMoveRequest fileInfoMoveRequest = new FileInfoMoveRequest();
            fileInfoMoveRequest.setBusinessType("iuap-apdoc-material");
            long businessId = IdManager.getInstance().nextId();
            fileInfoMoveRequest.setBusinessId(String.valueOf(businessId));
            Product product = new Product();
            product.setId(productAttachmentDetailMap.get("productId"));
            if (productAttachmentDetailMap.get("type") != null && productAttachmentDetailMap.get("type").toString().contains("video/")) {
                product.setVideoBusinessId(String.valueOf(businessId));
            } else {
                fileInfoMoveRequest.setBusinessId(productAttachmentDetailMap.get("productId").toString());
            }
            product.setEntityStatus(EntityStatus.Update);
            MetaDaoHelper.updateNoPartition((String)"pc.product.Product", (BizObject)product);
            fileInfoMoveRequest.setName(productAttachmentDetailMap.get("fileName") == null ? null : productAttachmentDetailMap.get("fileName").toString());
            fileInfoMoveRequest.setFileSize(productAttachmentDetailMap.get("size") == null ? null : Long.valueOf(Long.parseLong(productAttachmentDetailMap.get("size").toString())));
            String path = null;
            Object folder = productAttachmentDetailMap.get("folder");
            if (folder != null) {
                String fileName = folder.toString().substring(folder.toString().lastIndexOf("/"));
                path = this.ymsParamConfig.getCooperationFileBaseDir() + fileName;
            }
            fileInfoMoveRequest.setPath(path);
            fileInfoMoveRequest.setTenantId(ytenantId);
            fileInfoMoveRequestList.add(fileInfoMoveRequest);
        }
        RobotExecutors.runAs((String)ytenantId, () -> {
            CommonResponse commonResponse = this.cooperationFileDataService.doCopyFileData(fileInfoMoveRequestList);
            if (commonResponse.getCode() != 200L) {
                log.error("\u8c03\u7528\u534f\u540c\u5347\u7ea7\u7269\u6599\u9644\u4ef6\u5f02\u5e38" + commonResponse.getCode() + commonResponse.getMessage());
                this.recordUpgradeException(AttachmentUpgradeEnum.PRODUCT_ATTACHMENT, idList.stream().map(String::valueOf).collect(Collectors.joining(",")), commonResponse.getMessage() == null ? commonResponse.toString() : commonResponse.getMessage());
            }
        }, (ExecutorService)Executors.newFixedThreadPool(1));
    }

    @Override
    public void productUrlDataUpgrade(List<Long> tenantIdList) {
        if (this.queryIsTriggerUpgrade(AttachmentUpgradeEnum.PRODUCT_HOME_PAGE_IMAGE)) {
            return;
        }
        this.recordBeginUpgrade(AttachmentUpgradeEnum.PRODUCT_HOME_PAGE_IMAGE);
        this.upgradeProductAlbumData(true, tenantIdList);
        this.recordUpgradeSuccess(AttachmentUpgradeEnum.PRODUCT_HOME_PAGE_IMAGE);
    }

    @Override
    public void productAlbumDataUpgrade(List<Long> tenantIdList) {
        if (this.queryIsTriggerUpgrade(AttachmentUpgradeEnum.PRODUCT_ALL_IMAGE)) {
            return;
        }
        this.recordBeginUpgrade(AttachmentUpgradeEnum.PRODUCT_ALL_IMAGE);
        this.upgradeProductAlbumData(false, tenantIdList);
        this.recordUpgradeSuccess(AttachmentUpgradeEnum.PRODUCT_ALL_IMAGE);
    }

    private void upgradeProductAlbumData(boolean isHomepage, List<Long> tenantIdList) {
        if (tenantIdList.isEmpty()) {
            QuerySchema queryProductAlbumTenantSchema = QuerySchema.create().addSelect("tenant").distinct();
            List queryProductAlbumTenantList = null;
            try {
                queryProductAlbumTenantList = MetaDaoHelper.queryNoPartition((String)"pc.product.ProductAlbum", (QuerySchema)queryProductAlbumTenantSchema, null);
            }
            catch (Exception e) {
                log.error("\u7269\u6599\u56fe\u7247\u67e5\u8be2\u79df\u6237\u6570\u636e\u5f02\u5e38" + e.getMessage(), (Throwable)e);
            }
            if (CollectionUtils.isEmpty((Collection)queryProductAlbumTenantList)) {
                return;
            }
            tenantIdList = queryProductAlbumTenantList.stream().map(a -> Long.parseLong(a.get("tenant").toString())).collect(Collectors.toList());
        }
        Map<Long, String> tenantIdMapping = this.getTenantIdMapping(tenantIdList);
        for (Long tenantId : tenantIdList) {
            QuerySchema queryProductAlbumIdSchemaSchema = QuerySchema.create().addSelect("productId").addCondition((ConditionExpression)QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"tenant").eq((Object)tenantId)}));
            List queryProductAlbumIdList = null;
            try {
                queryProductAlbumIdList = MetaDaoHelper.queryNoPartition((String)"pc.product.ProductAlbum", (QuerySchema)queryProductAlbumIdSchemaSchema, null);
            }
            catch (Exception e) {
                log.error("\u7269\u6599\u56fe\u7247\u67e5\u8be2\u56fe\u7247\u660e\u7ec6\u6570\u636e\u5f02\u5e38" + e.getMessage(), (Throwable)e);
            }
            List productIdList = queryProductAlbumIdList.stream().map(a -> Long.parseLong(a.get("productId").toString())).collect(Collectors.toList());
            List lists = ListSplitUtil.splitListByCapacity(productIdList, (int)1000);
            for (List list : lists) {
                try {
                    this.upgradeProductAlbumDataByIdList(isHomepage, list, tenantIdMapping.get(tenantId));
                }
                catch (Exception e) {
                    log.error("\u5347\u7ea7\u7269\u6599\u56fe\u7247\u5f02\u5e38\uff0c\u5f02\u5e38\u96c6\u5408:" + list + "\u5f02\u5e38\u4fe1\u606f\uff1a" + e.getMessage(), (Throwable)e);
                    this.recordUpgradeException(isHomepage ? AttachmentUpgradeEnum.PRODUCT_HOME_PAGE_IMAGE : AttachmentUpgradeEnum.PRODUCT_ALL_IMAGE, list.stream().map(String::valueOf).collect(Collectors.joining(",")), e.getMessage() == null ? e.toString() : e.getMessage());
                }
            }
        }
    }

    public void upgradeProductAlbumDataByIdList(boolean isHomepage, List<Long> productIdList, String ytenantId) throws Exception {
        ArrayList<FileInfoMoveRequest> fileInfoMoveRequestList = new ArrayList<FileInfoMoveRequest>();
        QuerySchema queryProductAlbumDetailSchemaSchema = QuerySchema.create().addSelect("id,sort,productId,folder,imgName,type,size").addCondition((ConditionExpression)QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"productId").in(productIdList)}));
        List queryProductAlbumDetailList = MetaDaoHelper.queryNoPartition((String)"pc.product.ProductAlbum", (QuerySchema)queryProductAlbumDetailSchemaSchema, null);
        Map<String, List<Map>> productAlbumListMap = queryProductAlbumDetailList.stream().collect(Collectors.groupingBy(a -> a.get("productId").toString()));
        for (String productId : productAlbumListMap.keySet()) {
            long businessId = IdManager.getInstance().nextId();
            List<Map> productAlbumList = productAlbumListMap.get(productId);
            Product product = new Product();
            product.setId((Object)Long.parseLong(productId));
            if (isHomepage) {
                product.setHomepageBusinessId(String.valueOf(businessId));
                Map productHomepageMap = productAlbumList.stream().min(Comparator.comparing(a -> Integer.parseInt(a.get("sort").toString()))).get();
                FileInfoMoveRequest fileInfoMoveRequest = new FileInfoMoveRequest();
                fileInfoMoveRequest.setBusinessType("iuap-apdoc-material");
                fileInfoMoveRequest.setBusinessId(String.valueOf(businessId));
                String path = null;
                Object folder = productHomepageMap.get("folder");
                if (folder != null) {
                    String fileName = folder.toString().substring(folder.toString().lastIndexOf("/"));
                    path = this.ymsParamConfig.getCooperationFileBaseDir() + fileName;
                }
                fileInfoMoveRequest.setName(productHomepageMap.get("imgName") == null ? null : productHomepageMap.get("imgName").toString());
                fileInfoMoveRequest.setFileSize(productHomepageMap.get("size") == null ? null : Long.valueOf(Long.parseLong(productHomepageMap.get("size").toString())));
                fileInfoMoveRequest.setPath(path);
                fileInfoMoveRequest.setTenantId(ytenantId);
                fileInfoMoveRequestList.add(fileInfoMoveRequest);
            } else {
                product.setImgBusinessId(String.valueOf(businessId));
                for (Map stringObjectMap : productAlbumList) {
                    FileInfoMoveRequest fileInfoMoveRequest = new FileInfoMoveRequest();
                    fileInfoMoveRequest.setBusinessType("iuap-apdoc-material");
                    fileInfoMoveRequest.setBusinessId(String.valueOf(businessId));
                    String path = null;
                    Object folder = stringObjectMap.get("folder");
                    if (folder != null) {
                        String fileName = folder.toString().substring(folder.toString().lastIndexOf("/"));
                        path = this.ymsParamConfig.getCooperationFileBaseDir() + fileName;
                    }
                    fileInfoMoveRequest.setName(stringObjectMap.get("imgName") == null ? null : stringObjectMap.get("imgName").toString());
                    fileInfoMoveRequest.setFileSize(stringObjectMap.get("size") == null ? null : Long.valueOf(Long.parseLong(stringObjectMap.get("size").toString())));
                    fileInfoMoveRequest.setPath(path);
                    fileInfoMoveRequest.setTenantId(ytenantId);
                    fileInfoMoveRequestList.add(fileInfoMoveRequest);
                }
            }
            product.setEntityStatus(EntityStatus.Update);
            MetaDaoHelper.updateNoPartition((String)"pc.product.Product", (BizObject)product);
        }
        RobotExecutors.runAs((String)ytenantId, () -> {
            CommonResponse commonResponse = this.cooperationFileDataService.doCopyFileData(fileInfoMoveRequestList);
            if (commonResponse.getCode() != 200L) {
                log.error("\u8c03\u7528\u534f\u540c\u5347\u7ea7\u7269\u6599\u56fe\u7247\u5f02\u5e38" + commonResponse.getCode() + commonResponse.getMessage());
                this.recordUpgradeException(isHomepage ? AttachmentUpgradeEnum.PRODUCT_HOME_PAGE_IMAGE : AttachmentUpgradeEnum.PRODUCT_ALL_IMAGE, productIdList.stream().map(String::valueOf).collect(Collectors.joining(",")), commonResponse.getMessage() == null ? commonResponse.toString() : commonResponse.getMessage());
            }
        }, (ExecutorService)Executors.newFixedThreadPool(1));
    }

    @Override
    public void productSpecItemAlbumDataUpgrade(List<Long> tenantIdList) {
        if (this.queryIsTriggerUpgrade(AttachmentUpgradeEnum.PRODUCT_SPEC_IMAGE)) {
            return;
        }
        this.recordBeginUpgrade(AttachmentUpgradeEnum.PRODUCT_SPEC_IMAGE);
        if (tenantIdList.isEmpty()) {
            QuerySchema queryProductSpecItemAlbumTenantSchema = QuerySchema.create().addSelect("tenant").distinct();
            List queryProductSpecItemAlbumTenantList = null;
            try {
                queryProductSpecItemAlbumTenantList = MetaDaoHelper.queryNoPartition((String)"pc.product.ProductSpecItemAlbum", (QuerySchema)queryProductSpecItemAlbumTenantSchema, null);
            }
            catch (Exception e) {
                log.error("\u67e5\u8be2\u7269\u6599\u89c4\u683c\u56fe\u7247\u79df\u6237\u5f02\u5e38" + e.getMessage(), (Throwable)e);
            }
            if (CollectionUtils.isEmpty((Collection)queryProductSpecItemAlbumTenantList)) {
                this.recordUpgradeSuccess(AttachmentUpgradeEnum.PRODUCT_SPEC_IMAGE);
                return;
            }
            tenantIdList = queryProductSpecItemAlbumTenantList.stream().map(a -> Long.parseLong(a.get("tenant").toString())).collect(Collectors.toList());
        }
        Map<Long, String> tenantIdMapping = this.getTenantIdMapping(tenantIdList);
        for (Long tenantId : tenantIdList) {
            QuerySchema queryProductSpecItemAlbumIdSchemaSchema = QuerySchema.create().addSelect("id").addCondition((ConditionExpression)QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"tenant").eq((Object)tenantId)}));
            List queryProductSpecItemAlbumIdList = null;
            try {
                queryProductSpecItemAlbumIdList = MetaDaoHelper.queryNoPartition((String)"pc.product.ProductSpecItemAlbum", (QuerySchema)queryProductSpecItemAlbumIdSchemaSchema, null);
            }
            catch (Exception e) {
                log.error("\u67e5\u8be2\u7269\u6599\u89c4\u683c\u56fe\u7247ID\u5f02\u5e38" + e.getMessage(), (Throwable)e);
            }
            List productSpecItemAlbumIdList = queryProductSpecItemAlbumIdList.stream().map(a -> Long.parseLong(a.get("id").toString())).collect(Collectors.toList());
            List lists = ListSplitUtil.splitListByCapacity(productSpecItemAlbumIdList, (int)1000);
            for (List list : lists) {
                try {
                    this.productSpecItemAlbumDataUpgradeByIdList(list, tenantIdMapping.get(tenantId));
                }
                catch (Exception e) {
                    log.error("\u5347\u7ea7\u7269\u6599\u89c4\u683c\u503c\u56fe\u7247\u5f02\u5e38\uff0c\u5f02\u5e38\u96c6\u5408:" + list + "\u5f02\u5e38\u4fe1\u606f\uff1a" + e.getMessage(), (Throwable)e);
                    this.recordUpgradeException(AttachmentUpgradeEnum.PRODUCT_SPEC_IMAGE, list.stream().map(String::valueOf).collect(Collectors.joining(",")), e.getMessage() == null ? e.toString() : e.getMessage());
                }
            }
        }
        this.recordUpgradeSuccess(AttachmentUpgradeEnum.PRODUCT_SPEC_IMAGE);
    }

    public void productSpecItemAlbumDataUpgradeByIdList(List<Long> idList, String ytenantId) throws Exception {
        ArrayList<FileInfoMoveRequest> fileInfoMoveRequestList = new ArrayList<FileInfoMoveRequest>();
        QuerySchema queryProductSpecItemAlbumDetailSchema = QuerySchema.create().addSelect("id,productId,productSpecItemId,productFreeCharacterItemId,folder,imgName,type,size").addCondition((ConditionExpression)QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"id").in(idList)}));
        List queryProductSpecItemAlbumDetailList = MetaDaoHelper.queryNoPartition((String)"pc.product.ProductSpecItemAlbum", (QuerySchema)queryProductSpecItemAlbumDetailSchema, null);
        for (Map productSpecItemAlbumDetailMap : queryProductSpecItemAlbumDetailList) {
            FileInfoMoveRequest fileInfoMoveRequest = new FileInfoMoveRequest();
            fileInfoMoveRequest.setBusinessType("iuap-apdoc-material");
            long businessId = IdManager.getInstance().nextId();
            fileInfoMoveRequest.setBusinessId(String.valueOf(businessId));
            if (productSpecItemAlbumDetailMap.get("productSpecItemId") != null) {
                ProductSpecItem productSpecItem = new ProductSpecItem();
                productSpecItem.setId(productSpecItemAlbumDetailMap.get("productSpecItemId"));
                productSpecItem.setImgBusinessId(String.valueOf(businessId));
                productSpecItem.setEntityStatus(EntityStatus.Update);
                MetaDaoHelper.updateNoPartition((String)"pc.product.ProductSpecItem", (BizObject)productSpecItem);
            }
            if (productSpecItemAlbumDetailMap.get("productFreeCharacterItemId") != null) {
                ProductFreeCharacterItem productFreeCharacterItem = new ProductFreeCharacterItem();
                productFreeCharacterItem.setId(productSpecItemAlbumDetailMap.get("productFreeCharacterItemId"));
                productFreeCharacterItem.setImgBusinessId(String.valueOf(businessId));
                productFreeCharacterItem.setEntityStatus(EntityStatus.Update);
                MetaDaoHelper.updateNoPartition((String)"pc.product.ProductFreeCharacterItem", (BizObject)productFreeCharacterItem);
            }
            fileInfoMoveRequest.setName(productSpecItemAlbumDetailMap.get("imgName") == null ? null : productSpecItemAlbumDetailMap.get("imgName").toString());
            fileInfoMoveRequest.setFileSize(productSpecItemAlbumDetailMap.get("size") == null ? null : Long.valueOf(Long.parseLong(productSpecItemAlbumDetailMap.get("size").toString())));
            String path = null;
            Object folder = productSpecItemAlbumDetailMap.get("folder");
            if (folder != null) {
                String fileName = folder.toString().substring(folder.toString().lastIndexOf("/"));
                path = this.ymsParamConfig.getCooperationFileBaseDir() + fileName;
            }
            fileInfoMoveRequest.setPath(path);
            fileInfoMoveRequest.setTenantId(ytenantId);
            fileInfoMoveRequestList.add(fileInfoMoveRequest);
        }
        RobotExecutors.runAs((String)ytenantId, () -> {
            CommonResponse commonResponse = this.cooperationFileDataService.doCopyFileData(fileInfoMoveRequestList);
            if (commonResponse.getCode() != 200L) {
                log.error("\u8c03\u7528\u534f\u540c\u5347\u7ea7\u7269\u6599\u89c4\u683c\u56fe\u7247\u5f02\u5e38" + commonResponse.getCode() + commonResponse.getMessage());
                this.recordUpgradeException(AttachmentUpgradeEnum.PRODUCT_SPEC_IMAGE, idList.stream().map(String::valueOf).collect(Collectors.joining(",")), commonResponse.getMessage() == null ? commonResponse.toString() : commonResponse.getMessage());
            }
        }, (ExecutorService)Executors.newFixedThreadPool(1));
    }

    @Override
    public void merchantCorpImageAlbumDataUpgrade(List<Long> tenantIdList) {
        if (this.queryIsTriggerUpgrade(AttachmentUpgradeEnum.MERCHANT_CERTIFICATE)) {
            return;
        }
        this.recordBeginUpgrade(AttachmentUpgradeEnum.MERCHANT_CERTIFICATE);
        if (tenantIdList.isEmpty()) {
            QuerySchema queryMerchantCorpImageAlbumTenantSchema = QuerySchema.create().addSelect("tenant").distinct();
            List queryMerchantCorpImageAlbumTenantList = null;
            try {
                queryMerchantCorpImageAlbumTenantList = MetaDaoHelper.queryNoPartition((String)"aa.merchant.MerchantCorpImage", (QuerySchema)queryMerchantCorpImageAlbumTenantSchema, null);
            }
            catch (Exception e) {
                log.error("\u67e5\u8be2\u7269\u6599\u8bc1\u7167\u56fe\u7247\u79df\u6237\u5f02\u5e38" + e.getMessage(), (Throwable)e);
            }
            if (CollectionUtils.isEmpty((Collection)queryMerchantCorpImageAlbumTenantList)) {
                this.recordUpgradeSuccess(AttachmentUpgradeEnum.MERCHANT_CERTIFICATE);
                return;
            }
            tenantIdList = queryMerchantCorpImageAlbumTenantList.stream().map(a -> Long.parseLong(a.get("tenant").toString())).collect(Collectors.toList());
        }
        Map<Long, String> tenantIdMapping = this.getTenantIdMapping(tenantIdList);
        for (Long tenantId : tenantIdList) {
            QuerySchema queryMerchantCorpImageAlbumIdSchemaSchema = QuerySchema.create().addSelect("merchantId").distinct().addCondition((ConditionExpression)QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"tenant").eq((Object)tenantId)}));
            List allMerchantIdList = null;
            try {
                allMerchantIdList = MetaDaoHelper.queryNoPartition((String)"aa.merchant.MerchantCorpImage", (QuerySchema)queryMerchantCorpImageAlbumIdSchemaSchema, null);
            }
            catch (Exception e) {
                log.error("\u67e5\u8be2\u5ba2\u6237\u8bc1\u7167\u8bc1\u4e66\u56fe\u7247ID\u96c6\u5408\u5f02\u5e38" + e.getMessage(), (Throwable)e);
            }
            List merchantIdList = allMerchantIdList.stream().map(a -> Long.parseLong(a.get("merchantId").toString())).collect(Collectors.toList());
            List lists = ListSplitUtil.splitListByCapacity(merchantIdList, (int)1000);
            for (List list : lists) {
                try {
                    this.merchantCorpImageAlbumDataUpgradeByIdList(list, tenantIdMapping.get(tenantId));
                }
                catch (Exception e) {
                    log.error("\u5347\u7ea7\u7269\u6599\u9644\u4ef6\u5f02\u5e38\uff0c\u5f02\u5e38\u96c6\u5408:" + list + "\u5f02\u5e38\u4fe1\u606f\uff1a" + e.getMessage(), (Throwable)e);
                    this.recordUpgradeException(AttachmentUpgradeEnum.MERCHANT_CERTIFICATE, list.stream().map(String::valueOf).collect(Collectors.joining(",")), e.getMessage() == null ? e.toString() : e.getMessage());
                }
            }
        }
        this.recordUpgradeSuccess(AttachmentUpgradeEnum.MERCHANT_CERTIFICATE);
    }

    public void merchantCorpImageAlbumDataUpgradeByIdList(List<Long> merchantIdList, String ytenantId) throws Exception {
        ArrayList<FileInfoMoveRequest> fileInfoMoveRequestList = new ArrayList<FileInfoMoveRequest>();
        QuerySchema queryMerchantCorpImageAlbumDetailSchema = QuerySchema.create().addSelect("id,merchantId,folder,imgName,type,size").addCondition((ConditionExpression)QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"merchantId").in(merchantIdList)}));
        List queryMerchantCorpImageAlbumDetailList = MetaDaoHelper.queryNoPartition((String)"aa.merchant.MerchantCorpImage", (QuerySchema)queryMerchantCorpImageAlbumDetailSchema, null);
        Map<String, List<Map>> merchantCorpImageAlbumListMap = queryMerchantCorpImageAlbumDetailList.stream().collect(Collectors.groupingBy(a -> a.get("merchantId").toString()));
        for (String merchantId : merchantCorpImageAlbumListMap.keySet()) {
            long businessId = IdManager.getInstance().nextId();
            List<Map> merchantCorpImageAlbumList = merchantCorpImageAlbumListMap.get(merchantId);
            Merchant merchant = new Merchant();
            merchant.setId((Object)Long.parseLong(merchantId));
            merchant.setCertificate(String.valueOf(businessId));
            for (Map stringObjectMap : merchantCorpImageAlbumList) {
                FileInfoMoveRequest fileInfoMoveRequest = new FileInfoMoveRequest();
                fileInfoMoveRequest.setBusinessType("iuap-apdoc-material");
                fileInfoMoveRequest.setBusinessId(String.valueOf(businessId));
                String path = null;
                Object folder = stringObjectMap.get("folder");
                if (folder != null) {
                    String fileName = folder.toString().substring(folder.toString().lastIndexOf("/"));
                    path = this.ymsParamConfig.getCooperationFileBaseDir() + fileName;
                }
                fileInfoMoveRequest.setName(stringObjectMap.get("imgName") == null ? null : stringObjectMap.get("imgName").toString());
                fileInfoMoveRequest.setFileSize(stringObjectMap.get("size") == null ? null : Long.valueOf(Long.parseLong(stringObjectMap.get("size").toString())));
                fileInfoMoveRequest.setPath(path);
                fileInfoMoveRequest.setTenantId(ytenantId);
                fileInfoMoveRequestList.add(fileInfoMoveRequest);
            }
            merchant.setEntityStatus(EntityStatus.Update);
            MetaDaoHelper.updateNoPartition((String)"aa.merchant.Merchant", (BizObject)merchant);
        }
        RobotExecutors.runAs((String)ytenantId, () -> {
            CommonResponse commonResponse = this.cooperationFileDataService.doCopyFileData(fileInfoMoveRequestList);
            if (commonResponse.getCode() != 200L) {
                log.error("\u8c03\u7528\u534f\u540c\u5347\u7ea7\u5ba2\u6237\u8bc1\u7167\u8bc1\u4e66\u5f02\u5e38" + commonResponse.getCode() + commonResponse.getMessage());
                this.recordUpgradeException(AttachmentUpgradeEnum.MERCHANT_CERTIFICATE, merchantIdList.stream().map(String::valueOf).collect(Collectors.joining(",")), commonResponse.getMessage() == null ? commonResponse.toString() : commonResponse.getMessage());
            }
        }, (ExecutorService)Executors.newFixedThreadPool(1));
    }

    @Override
    public void merchantAttachmentDataUpgrade(List<Long> tenantIdList) {
        if (this.queryIsTriggerUpgrade(AttachmentUpgradeEnum.MERCHANT_ATTACHMENT)) {
            return;
        }
        this.recordBeginUpgrade(AttachmentUpgradeEnum.MERCHANT_ATTACHMENT);
        if (tenantIdList.isEmpty()) {
            QuerySchema queryMerchantAttachmentTenantSchema = QuerySchema.create().addSelect("tenant").distinct();
            List queryMerchantAttachmentTenantList = null;
            try {
                queryMerchantAttachmentTenantList = MetaDaoHelper.queryNoPartition((String)"aa.merchant.MerchantAttachment", (QuerySchema)queryMerchantAttachmentTenantSchema, null);
            }
            catch (Exception e) {
                log.error("\u67e5\u8be2\u5ba2\u6237\u9644\u4ef6\u79df\u6237\u5f02\u5e38" + e.getMessage(), (Throwable)e);
            }
            if (CollectionUtils.isEmpty((Collection)queryMerchantAttachmentTenantList)) {
                this.recordUpgradeSuccess(AttachmentUpgradeEnum.MERCHANT_ATTACHMENT);
                return;
            }
            tenantIdList = queryMerchantAttachmentTenantList.stream().map(a -> Long.parseLong(a.get("tenant").toString())).collect(Collectors.toList());
        }
        Map<Long, String> tenantIdMapping = this.getTenantIdMapping(tenantIdList);
        for (Long tenantId : tenantIdList) {
            QuerySchema queryMerchantAttachmentIdSchemaSchema = QuerySchema.create().addSelect("id").addCondition((ConditionExpression)QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"tenant").eq((Object)tenantId)}));
            List queryMerchantAttachmentIdList = null;
            try {
                queryMerchantAttachmentIdList = MetaDaoHelper.queryNoPartition((String)"aa.merchant.MerchantAttachment", (QuerySchema)queryMerchantAttachmentIdSchemaSchema, null);
            }
            catch (Exception e) {
                log.error("\u67e5\u8be2\u5ba2\u6237\u9644\u4ef6ID\u96c6\u5408\u5f02\u5e38" + e.getMessage(), (Throwable)e);
            }
            List merchantAttachmentIdList = queryMerchantAttachmentIdList.stream().map(a -> Long.parseLong(a.get("id").toString())).collect(Collectors.toList());
            List lists = ListSplitUtil.splitListByCapacity(merchantAttachmentIdList, (int)1000);
            for (List list : lists) {
                try {
                    this.merchantAttachmentDataUpgradeByIdList(list, tenantIdMapping.get(tenantId));
                }
                catch (Exception e) {
                    log.error("\u5347\u7ea7\u5ba2\u6237\u9644\u4ef6\u5f02\u5e38\uff0c\u5f02\u5e38\u96c6\u5408:" + list + "\u5f02\u5e38\u4fe1\u606f\uff1a" + e.getMessage(), (Throwable)e);
                    this.recordUpgradeException(AttachmentUpgradeEnum.MERCHANT_ATTACHMENT, list.stream().map(String::valueOf).collect(Collectors.joining(",")), e.getMessage() == null ? e.toString() : e.getMessage());
                }
            }
        }
        this.recordUpgradeSuccess(AttachmentUpgradeEnum.MERCHANT_ATTACHMENT);
    }

    public void merchantAttachmentDataUpgradeByIdList(List<Long> idList, String ytenantId) throws Exception {
        ArrayList<FileInfoMoveRequest> fileInfoMoveRequestList = new ArrayList<FileInfoMoveRequest>();
        QuerySchema queryMerchantAttachmentDetailSchema = QuerySchema.create().addSelect("id,merchantId,folder,fileName,type,size,attachmentGroupItemId").addCondition((ConditionExpression)QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"id").in(idList)}));
        List queryMerchantAttachmentDetailList = MetaDaoHelper.queryNoPartition((String)"aa.merchant.MerchantAttachment", (QuerySchema)queryMerchantAttachmentDetailSchema, null);
        for (Map merchantAttachmentDetailMap : queryMerchantAttachmentDetailList) {
            FileInfoMoveRequest fileInfoMoveRequest = new FileInfoMoveRequest();
            fileInfoMoveRequest.setBusinessType("iuap-apdoc-material");
            fileInfoMoveRequest.setBusinessId(merchantAttachmentDetailMap.get("merchantId").toString());
            fileInfoMoveRequest.setName(merchantAttachmentDetailMap.get("fileName") == null ? null : merchantAttachmentDetailMap.get("fileName").toString());
            fileInfoMoveRequest.setFileSize(merchantAttachmentDetailMap.get("size") == null ? null : Long.valueOf(Long.parseLong(merchantAttachmentDetailMap.get("size").toString())));
            String path = null;
            Object folder = merchantAttachmentDetailMap.get("folder");
            if (folder != null) {
                String fileName = folder.toString().substring(folder.toString().lastIndexOf("/"));
                path = this.ymsParamConfig.getCooperationFileBaseDir() + fileName;
            }
            fileInfoMoveRequest.setPath(path);
            fileInfoMoveRequest.setTenantId(ytenantId);
            fileInfoMoveRequestList.add(fileInfoMoveRequest);
        }
        RobotExecutors.runAs((String)ytenantId, () -> {
            CommonResponse commonResponse = this.cooperationFileDataService.doCopyFileData(fileInfoMoveRequestList);
            if (commonResponse.getCode() != 200L) {
                log.error("\u8c03\u7528\u534f\u540c\u5347\u7ea7\u7269\u6599\u56fe\u7247\u5f02\u5e38" + commonResponse.getCode() + commonResponse.getMessage());
                this.recordUpgradeException(AttachmentUpgradeEnum.MERCHANT_ATTACHMENT, idList.stream().map(String::valueOf).collect(Collectors.joining(",")), commonResponse.getMessage() == null ? commonResponse.toString() : commonResponse.getMessage());
            }
        }, (ExecutorService)Executors.newFixedThreadPool(1));
    }

    public void bindProductGroupForAttachment(String yhtToken) {
        if (this.queryIsTriggerUpgrade(AttachmentUpgradeEnum.ATTACHMENT_GROUP_BIND_PRODUCT)) {
            return;
        }
        this.recordBeginUpgrade(AttachmentUpgradeEnum.ATTACHMENT_GROUP_BIND_PRODUCT);
        QuerySchema queryAttachmentTenantSchema = QuerySchema.create().addSelect("tenant").distinct();
        List queryProductAttachmentTenantList = null;
        try {
            queryProductAttachmentTenantList = MetaDaoHelper.queryNoPartition((String)"pc.product.ProductAttachment", (QuerySchema)queryAttachmentTenantSchema, null);
        }
        catch (Exception e) {
            log.error("\u7269\u6599\u9644\u4ef6\u7ed1\u5b9a\u5206\u7ec4\u67e5\u8be2\u79df\u6237\u6570\u636e\u5f02\u5e38" + e.getMessage(), (Throwable)e);
        }
        if (CollectionUtils.isEmpty((Collection)queryProductAttachmentTenantList)) {
            return;
        }
        List<Long> tenantIdList = queryProductAttachmentTenantList.stream().map(a -> Long.parseLong(a.get("tenant").toString())).collect(Collectors.toList());
        Map<Long, String> tenantIdMapping = this.getTenantIdMapping(tenantIdList);
        for (Long tenantId : tenantIdList) {
            QuerySchema queryProductIdSchemaSchema = QuerySchema.create().addSelect("productId").distinct().addCondition((ConditionExpression)QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"tenant").eq((Object)tenantId)}));
            List queryProductIdList = null;
            try {
                queryProductIdList = MetaDaoHelper.queryNoPartition((String)"pc.product.ProductAttachment", (QuerySchema)queryProductIdSchemaSchema, null);
            }
            catch (Exception e) {
                log.error("\u7269\u6599\u9644\u4ef6\u7ed1\u5b9a\u5206\u7ec4\u67e5\u8be2\u5206\u7ec4\u79df\u6237id\u5f02\u5e38" + e.getMessage(), (Throwable)e);
            }
            List productIdList = queryProductIdList.stream().map(a -> a.get("productId").toString()).collect(Collectors.toList());
            List lists = ListSplitUtil.splitListByCapacity(productIdList, (int)500);
            for (List list : lists) {
                try {
                    this.bindGroupForAttachmentByIdList(list, "productcenter.pc_product", yhtToken);
                }
                catch (Exception e) {
                    log.error("\u7269\u6599\u9644\u4ef6\u7ed1\u5b9a\u5206\u7ec4\u67e5\u8be2\u5f02\u5e38\uff0c\u5f02\u5e38\u96c6\u5408:" + list + "\u5f02\u5e38\u4fe1\u606f\uff1a" + e.getMessage(), (Throwable)e);
                    this.recordUpgradeException(AttachmentUpgradeEnum.ATTACHMENT_GROUP_BIND_PRODUCT, list.stream().map(String::valueOf).collect(Collectors.joining(",")), e.getMessage() == null ? e.toString() : e.getMessage());
                }
            }
        }
        this.recordUpgradeSuccess(AttachmentUpgradeEnum.ATTACHMENT_GROUP_BIND_PRODUCT);
    }

    public void bindMerchantGroupForAttachment(String yhtToken) {
        if (this.queryIsTriggerUpgrade(AttachmentUpgradeEnum.ATTACHMENT_GROUP_BIND_MERCHANT)) {
            return;
        }
        this.recordBeginUpgrade(AttachmentUpgradeEnum.ATTACHMENT_GROUP_BIND_MERCHANT);
        QuerySchema queryAttachmentTenantSchema = QuerySchema.create().addSelect("tenant").distinct();
        List queryMerchantAttachmentTenantList = null;
        try {
            queryMerchantAttachmentTenantList = MetaDaoHelper.queryNoPartition((String)"aa.merchant.MerchantAttachment", (QuerySchema)queryAttachmentTenantSchema, null);
        }
        catch (Exception e) {
            log.error("\u5ba2\u6237\u9644\u4ef6\u7ed1\u5b9a\u5206\u7ec4\u67e5\u8be2\u79df\u6237\u6570\u636e\u5f02\u5e38" + e.getMessage(), (Throwable)e);
        }
        if (CollectionUtils.isEmpty((Collection)queryMerchantAttachmentTenantList)) {
            return;
        }
        List<Long> tenantIdList = queryMerchantAttachmentTenantList.stream().map(a -> Long.parseLong(a.get("tenant").toString())).collect(Collectors.toList());
        Map<Long, String> tenantIdMapping = this.getTenantIdMapping(tenantIdList);
        for (Long tenantId : tenantIdList) {
            QuerySchema queryProductIdSchemaSchema = QuerySchema.create().addSelect("merchantId").distinct().addCondition((ConditionExpression)QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"tenant").eq((Object)tenantId)}));
            List queryProductIdList = null;
            try {
                queryProductIdList = MetaDaoHelper.queryNoPartition((String)"aa.merchant.MerchantAttachment", (QuerySchema)queryProductIdSchemaSchema, null);
            }
            catch (Exception e) {
                log.error("\u5ba2\u6237\u9644\u4ef6\u7ed1\u5b9a\u5206\u7ec4\u67e5\u8be2\u5206\u7ec4\u79df\u6237id\u5f02\u5e38" + e.getMessage(), (Throwable)e);
            }
            List productIdList = queryProductIdList.stream().map(a -> a.get("merchantId").toString()).collect(Collectors.toList());
            List lists = ListSplitUtil.splitListByCapacity(productIdList, (int)500);
            for (List list : lists) {
                try {
                    this.bindGroupForAttachmentByIdList(list, "productcenter.aa_merchant", yhtToken);
                }
                catch (Exception e) {
                    log.error("\u7269\u6599\u9644\u4ef6\u7ed1\u5b9a\u5206\u7ec4\u67e5\u8be2\u5f02\u5e38\uff0c\u5f02\u5e38\u96c6\u5408:" + list + "\u5f02\u5e38\u4fe1\u606f\uff1a" + e.getMessage(), (Throwable)e);
                    this.recordUpgradeException(AttachmentUpgradeEnum.ATTACHMENT_GROUP_BIND_MERCHANT, list.stream().map(String::valueOf).collect(Collectors.joining(",")), e.getMessage() == null ? e.toString() : e.getMessage());
                }
            }
        }
        this.recordUpgradeSuccess(AttachmentUpgradeEnum.ATTACHMENT_GROUP_BIND_MERCHANT);
    }

    public void bindGroupForAttachmentByIdList(List<String> businessIdList, String typeCode, String yhtToken) throws Exception {
        if ("productcenter.aa_merchant".equals(typeCode)) {
            QuerySchema queryMerchantAttachmentDetailSchema = QuerySchema.create().addSelect("id,folder,fileName,merchantId,attachmentGroupItemId").addCondition((ConditionExpression)QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"merchantId").in(businessIdList), QueryCondition.name((String)"attachmentGroupItemId").is_not_null()}));
            List merchantAttachmentDetailList = MetaDaoHelper.queryNoPartition((String)"aa.merchant.MerchantAttachment", (QuerySchema)queryMerchantAttachmentDetailSchema, null);
            Map<String, List<Map>> merchantAttachmentListMap = merchantAttachmentDetailList.stream().collect(Collectors.groupingBy(a -> a.get("merchantId").toString()));
            for (String merchantId : merchantAttachmentListMap.keySet()) {
                List cooperationFileInfoList = this.cooperationFileService.queryFileList("iuap-apdoc-material", merchantId, 1, 500);
                Map<String, List<CooperationFileInfo>> cooperationFileInfoListtMap = cooperationFileInfoList.stream().collect(Collectors.groupingBy(CooperationFileInfo::getName));
                Map<String, List<Map>> attachmentGroupItemId = merchantAttachmentListMap.get(merchantId).stream().collect(Collectors.groupingBy(a -> a.get("attachmentGroupItemId").toString()));
                for (String s : attachmentGroupItemId.keySet()) {
                    ArrayList fileIdList = new ArrayList();
                    for (Map stringObjectMap : attachmentGroupItemId.get(s)) {
                        if (!cooperationFileInfoListtMap.containsKey(stringObjectMap.get("fileName").toString())) continue;
                        fileIdList.addAll(cooperationFileInfoListtMap.get(stringObjectMap.get("fileName").toString()).stream().map(CooperationFileInfo::getFileId).collect(Collectors.toList()));
                    }
                    this.ymsLongTaskExecutorService.execute(() -> this.bindGroupForAttachmentCommon(merchantId, fileIdList, typeCode, s, yhtToken));
                }
            }
        } else {
            QuerySchema queryProductAttachmentDetailSchema = QuerySchema.create().addSelect("id,folder,fileName,productId,attachmentGroupItemId").addCondition((ConditionExpression)QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"productId").in(businessIdList), QueryCondition.name((String)"attachmentGroupItemId").is_not_null()}));
            List productAttachmentDetailList = MetaDaoHelper.queryNoPartition((String)"pc.product.ProductAttachment", (QuerySchema)queryProductAttachmentDetailSchema, null);
            Map<String, List<Map>> productAttachmentListMap = productAttachmentDetailList.stream().collect(Collectors.groupingBy(a -> a.get("productId").toString()));
            for (String productId : productAttachmentListMap.keySet()) {
                List cooperationFileInfoList = this.cooperationFileService.queryFileList("iuap-apdoc-material", productId, 1, 500);
                Map<String, List<CooperationFileInfo>> cooperationFileInfoListtMap = cooperationFileInfoList.stream().collect(Collectors.groupingBy(CooperationFileInfo::getName));
                Map<String, List<Map>> attachmentGroupItemId = productAttachmentListMap.get(productId).stream().collect(Collectors.groupingBy(a -> a.get("attachmentGroupItemId").toString()));
                for (String s : attachmentGroupItemId.keySet()) {
                    ArrayList fileIdList = new ArrayList();
                    for (Map stringObjectMap : attachmentGroupItemId.get(s)) {
                        if (!cooperationFileInfoListtMap.containsKey(stringObjectMap.get("fileName").toString())) continue;
                        fileIdList.addAll(cooperationFileInfoListtMap.get(stringObjectMap.get("fileName").toString()).stream().map(CooperationFileInfo::getFileId).collect(Collectors.toList()));
                    }
                    this.ymsLongTaskExecutorService.execute(() -> this.bindGroupForAttachmentCommon(productId, fileIdList, typeCode, s, yhtToken));
                }
            }
        }
    }

    public void bindGroupForAttachmentCommon(String businessId, List<String> fileIdList, String typeCode, String groupItemId, String yhtToken) {
        try {
            QuerySchema queryAttachmentGroupItemSchema = QuerySchema.create().addSelect("code,tenant,groupId").addCondition((ConditionExpression)QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"id").eq((Object)groupItemId)}));
            ArrayList attachmentGroupItemList = null;
            try {
                attachmentGroupItemList = new ArrayList();
            }
            catch (Exception e) {
                log.error("\u7ed1\u5b9a\u5206\u7ec4\u9879\u65f6\u67e5\u8be2\u539f\u59cb\u5206\u7ec4\u9879\u5f02\u5e38" + e.getMessage(), (Throwable)e);
            }
            if (CollectionUtils.isEmpty(attachmentGroupItemList)) {
                return;
            }
            QuerySchema queryAttachmentGroupSchema = QuerySchema.create().addSelect("code").addCondition((ConditionExpression)QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"id").eq(((Map)attachmentGroupItemList.get(0)).get("groupId"))}));
            ArrayList attachmentGroupList = null;
            try {
                attachmentGroupList = new ArrayList();
            }
            catch (Exception e) {
                log.error("\u7ed1\u5b9a\u5206\u7ec4\u65f6\u67e5\u8be2\u539f\u59cb\u5206\u7ec4\u9879\u5f02\u5e38" + e.getMessage(), (Throwable)e);
            }
            if (CollectionUtils.isEmpty(attachmentGroupList)) {
                return;
            }
            Matcher matcher = this.getChineseCharacterPattern().matcher(((Map)attachmentGroupList.get(0)).get("code").toString());
            String firstLevelCode = ((Map)attachmentGroupList.get(0)).get("code").toString();
            if (matcher.find()) {
                firstLevelCode = PingYinUtil.getPingYin((String)((Map)attachmentGroupList.get(0)).get("code").toString());
            }
            String secondLevelCode = ((Map)attachmentGroupItemList.get(0)).get("code").toString();
            if (matcher.find()) {
                secondLevelCode = PingYinUtil.getPingYin((String)((Map)attachmentGroupItemList.get(0)).get("code").toString());
            }
            ((Map)attachmentGroupItemList.get(0)).get("code");
            GroupBindFileRequest groupBindFileRequest = new GroupBindFileRequest();
            groupBindFileRequest.setAppCode(APP_CODE);
            groupBindFileRequest.setBusinessType("iuap-apdoc-material");
            groupBindFileRequest.setBusinessId(businessId);
            groupBindFileRequest.setTypeCode(typeCode);
            groupBindFileRequest.setGroupCode(firstLevelCode + secondLevelCode);
            ArrayList<Long> tenantIdList = new ArrayList<Long>();
            tenantIdList.add(Long.parseLong(((Map)attachmentGroupItemList.get(0)).get("tenant").toString()));
            Map<Long, String> tenantIdMapping = this.getTenantIdMapping(tenantIdList);
            groupBindFileRequest.setTenantId(tenantIdMapping.get(Long.parseLong(((Map)attachmentGroupItemList.get(0)).get("tenant").toString())));
            groupBindFileRequest.setFileIds(fileIdList);
            CommonResponse commonResponse = this.cooperationFileGroupService.groupBindFilesWithToken(groupBindFileRequest, yhtToken);
            if (commonResponse.getCode() != 200L) {
                log.error("\u7269\u6599\u9644\u4ef6\u8c03\u7528\u534f\u540c\u9644\u4ef6\u7ed1\u5b9a\u5206\u7ec4\u5f02\u5e38" + commonResponse.getCode() + commonResponse.getMessage());
                if ("productcenter.aa_merchant".equals(typeCode)) {
                    this.recordUpgradeException(AttachmentUpgradeEnum.ATTACHMENT_GROUP_BIND_MERCHANT, businessId, commonResponse.getMessage() == null ? commonResponse.toString() : commonResponse.getMessage());
                } else {
                    this.recordUpgradeException(AttachmentUpgradeEnum.ATTACHMENT_GROUP_BIND_PRODUCT, businessId, commonResponse.getMessage() == null ? commonResponse.toString() : commonResponse.getMessage());
                }
            }
        }
        catch (Exception e) {
            log.error("\u7ed1\u5b9a\u5206\u7ec4\u5f02\u5e38" + e.getMessage(), (Throwable)e);
            if ("productcenter.aa_merchant".equals(typeCode)) {
                this.recordUpgradeException(AttachmentUpgradeEnum.ATTACHMENT_GROUP_BIND_MERCHANT, businessId, e.getMessage() == null ? e.toString() : e.getMessage());
            }
            this.recordUpgradeException(AttachmentUpgradeEnum.ATTACHMENT_GROUP_BIND_PRODUCT, businessId, e.getMessage() == null ? e.toString() : e.getMessage());
        }
    }

    @Override
    public void attachmentGroupDataUpgrade(List<Long> tenantIdList) {
        if (this.queryIsTriggerUpgrade(AttachmentUpgradeEnum.ATTACHMENT_GROUP)) {
            return;
        }
        this.recordBeginUpgrade(AttachmentUpgradeEnum.ATTACHMENT_GROUP);
        QuerySchema queryAttachmentGroupSchema = QuerySchema.create().addSelect("id,code,name,billType,description,tenant,creatorId");
        if (!tenantIdList.isEmpty()) {
            queryAttachmentGroupSchema.addCondition((ConditionExpression)QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"tenant").in(tenantIdList)}));
        }
        ArrayList<Map<String, Object>> queryAttachmentGroupList = null;
        try {
            queryAttachmentGroupList = new ArrayList<Map<String, Object>>();
        }
        catch (Exception e) {
            log.error("\u67e5\u8be2\u539f\u59cb\u9644\u4ef6\u5206\u7ec4\u5f02\u5e38" + e.getMessage(), (Throwable)e);
        }
        if (CollectionUtils.isEmpty(queryAttachmentGroupList)) {
            this.recordUpgradeSuccess(AttachmentUpgradeEnum.ATTACHMENT_GROUP);
            return;
        }
        this.attachmentGroupDataUpgradeCommon(queryAttachmentGroupList);
        this.recordUpgradeSuccess(AttachmentUpgradeEnum.ATTACHMENT_GROUP);
    }

    public void attachmentGroupDataUpgradeByIds(List<Long> idList) {
        QuerySchema queryAttachmentGroupSchema = QuerySchema.create().addSelect("id,code,name,billType,description,tenant,creatorId");
        queryAttachmentGroupSchema.addCondition((ConditionExpression)QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"id").in(idList)}));
        ArrayList<Map<String, Object>> queryAttachmentGroupList = null;
        try {
            queryAttachmentGroupList = new ArrayList<Map<String, Object>>();
        }
        catch (Exception e) {
            log.error("\u67e5\u8be2\u539f\u59cb\u9644\u4ef6\u5206\u7ec4\u5f02\u5e38" + e.getMessage(), (Throwable)e);
        }
        if (CollectionUtils.isEmpty(queryAttachmentGroupList)) {
            return;
        }
        this.attachmentGroupDataUpgradeCommon(queryAttachmentGroupList);
    }

    private void attachmentGroupDataUpgradeCommon(List<Map<String, Object>> queryAttachmentGroupList) {
        Map<Object, List<Map>> attachmentGroupListMap = queryAttachmentGroupList.stream().collect(Collectors.groupingBy(a -> a.get("tenant")));
        List<Long> tenantIdList = attachmentGroupListMap.keySet().stream().map(a -> Long.parseLong(a.toString())).collect(Collectors.toList());
        Map<Long, String> tenantIdMapping = this.getTenantIdMapping(tenantIdList);
        for (Object tenantId : attachmentGroupListMap.keySet()) {
            for (Map attachmentGroupMap : attachmentGroupListMap.get(Long.parseLong(tenantId.toString()))) {
                try {
                    ArrayList<GroupDto> groupDtoList = new ArrayList<GroupDto>();
                    GroupDto firstLevelGroupTypeDto = new GroupDto();
                    firstLevelGroupTypeDto.setId(attachmentGroupMap.get("id").toString());
                    firstLevelGroupTypeDto.setName((String)Optional.ofNullable(attachmentGroupMap.get("name")).map(Object::toString).orElse(null));
                    String firstLevelCode = null;
                    if (attachmentGroupMap.get("code") != null) {
                        Matcher matcher = this.getChineseCharacterPattern().matcher(attachmentGroupMap.get("code").toString());
                        firstLevelCode = attachmentGroupMap.get("code").toString();
                        if (matcher.find()) {
                            log.error("\u79df\u6237id\u4e3a\uff1a" + tenantId + ",code\u4e3a\uff1a" + firstLevelCode + "\u7684\u9644\u4ef6\u5206\u7ec4\u7f16\u7801\u5b58\u5728\u6c49\u8bed\u5b57\u7b26\uff0c\u5df2\u81ea\u52a8\u8f6c\u6362\u4e3a\u82f1\u6587");
                            firstLevelCode = PingYinUtil.getPingYin((String)attachmentGroupMap.get("code").toString());
                        }
                    }
                    firstLevelGroupTypeDto.setCode(firstLevelCode);
                    firstLevelGroupTypeDto.setDesc((String)Optional.ofNullable(attachmentGroupMap.get("description")).map(Object::toString).orElse(null));
                    firstLevelGroupTypeDto.setAppCode(APP_CODE);
                    String typeCode = attachmentGroupMap.get("billType") != null && "2".equals(attachmentGroupMap.get("billType").toString()) ? "productcenter.aa_merchant" : "productcenter.pc_product";
                    firstLevelGroupTypeDto.setTypeCode(typeCode);
                    firstLevelGroupTypeDto.setStatus(0);
                    firstLevelGroupTypeDto.setIsPublic(0);
                    groupDtoList.add(firstLevelGroupTypeDto);
                    String userId = attachmentGroupMap.get("creatorId").toString();
                    QuerySchema queryAttachmentGroupItemSchema = QuerySchema.create().addSelect("id,code,name,groupId,sort,description").addCondition((ConditionExpression)QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"tenant").eq(tenantId), QueryCondition.name((String)"groupId").eq(attachmentGroupMap.get("id"))}));
                    ArrayList queryAttachmentGroupItemList = new ArrayList();
                    for (Map attachmentGroupItemMap : queryAttachmentGroupItemList) {
                        GroupDto secondLevelGroupDto = new GroupDto();
                        secondLevelGroupDto.setId(attachmentGroupItemMap.get("id").toString());
                        secondLevelGroupDto.setName((String)Optional.ofNullable(attachmentGroupItemMap.get("name")).map(Object::toString).orElse(null));
                        String secondLevelCode = null;
                        if (attachmentGroupItemMap.get("code") != null) {
                            Matcher matcher = this.getChineseCharacterPattern().matcher(attachmentGroupItemMap.get("code").toString());
                            secondLevelCode = attachmentGroupItemMap.get("code").toString();
                            if (matcher.find()) {
                                log.error("\u79df\u6237id\u4e3a\uff1a" + tenantId + ",code\u4e3a\uff1a" + secondLevelCode + "\u7684\u9644\u4ef6\u5206\u7ec4\u7f16\u7801\u5b58\u5728\u6c49\u8bed\u5b57\u7b26\uff0c\u5df2\u81ea\u52a8\u8f6c\u6362\u4e3a\u82f1\u6587");
                                secondLevelCode = PingYinUtil.getPingYin((String)attachmentGroupItemMap.get("code").toString());
                            }
                        }
                        secondLevelGroupDto.setCode(firstLevelCode + secondLevelCode);
                        secondLevelGroupDto.setDesc((String)Optional.ofNullable(attachmentGroupItemMap.get("description")).map(Object::toString).orElse(null));
                        secondLevelGroupDto.setAppCode(APP_CODE);
                        secondLevelGroupDto.setParentGroupId(attachmentGroupMap.get("id").toString());
                        if (attachmentGroupItemMap.get("sort") != null) {
                            secondLevelGroupDto.setOrder(Integer.parseInt(attachmentGroupItemMap.get("sort").toString()));
                        }
                        secondLevelGroupDto.setTypeCode(typeCode);
                        secondLevelGroupDto.setStatus(0);
                        secondLevelGroupDto.setIsPublic(0);
                        groupDtoList.add(secondLevelGroupDto);
                    }
                    RobotExecutors.runAs((String)tenantIdMapping.get(Long.parseLong(tenantId.toString())), () -> {
                        CommonResponse commonResponse = this.cooperationFileGroupService.createGroups(groupDtoList, (String)tenantIdMapping.get(Long.parseLong(tenantId.toString())), userId);
                        if (commonResponse.getCode() != 200L) {
                            log.error("\u8c03\u7528\u534f\u540c\u5347\u7ea7\u9644\u4ef6\u5206\u7ec4\u5931\u8d25\uff0c\u5931\u8d25\u96c6\u5408:" + groupDtoList + "\u5f02\u5e38\u4fe1\u606f\uff1a" + commonResponse.getMessage());
                            this.recordUpgradeException(AttachmentUpgradeEnum.ATTACHMENT_GROUP, attachmentGroupMap.get("id").toString(), commonResponse.getMessage() == null ? commonResponse.toString() : commonResponse.getMessage());
                        }
                    }, (ExecutorService)Executors.newFixedThreadPool(1));
                }
                catch (Exception e) {
                    log.error("\u5347\u7ea7\u9644\u4ef6\u5206\u7ec4\u5f02\u5e38\uff0c\u5f02\u5e38\u96c6\u5408:" + attachmentGroupMap + "\u5f02\u5e38\u4fe1\u606f\uff1a" + e.getMessage(), (Throwable)e);
                    this.recordUpgradeException(AttachmentUpgradeEnum.ATTACHMENT_GROUP, attachmentGroupMap.get("id").toString(), e.getMessage() == null ? e.toString() : e.getMessage());
                }
            }
        }
    }

    @Override
    public void merchantMainDataUpgrade(List<Long> tenantIdList) {
        if (this.queryIsTriggerUpgrade(AttachmentUpgradeEnum.MERCHANT_MAIN_IMAGE)) {
            return;
        }
        this.recordBeginUpgrade(AttachmentUpgradeEnum.MERCHANT_MAIN_IMAGE);
        if (tenantIdList.isEmpty()) {
            QuerySchema queryMerchantMainTenantSchema = QuerySchema.create().addSelect("tenant").distinct();
            List merchantTenantMapList = null;
            try {
                merchantTenantMapList = MetaDaoHelper.queryNoPartition((String)"aa.merchant.Merchant", (QuerySchema)queryMerchantMainTenantSchema, null);
            }
            catch (Exception e) {
                log.error("\u67e5\u8be2\u5ba2\u6237\u4e3b\u8868\u79df\u6237\u5f02\u5e38" + e.getMessage(), (Throwable)e);
            }
            if (CollectionUtils.isEmpty((Collection)merchantTenantMapList)) {
                this.recordUpgradeSuccess(AttachmentUpgradeEnum.MERCHANT_MAIN_IMAGE);
                return;
            }
            tenantIdList = merchantTenantMapList.stream().map(a -> Long.parseLong(a.get("tenant").toString())).collect(Collectors.toList());
        }
        Map<Long, String> tenantIdMapping = this.getTenantIdMapping(tenantIdList);
        for (Long tenantId : tenantIdList) {
            QuerySchema queryMerchantIdSchemaSchema = QuerySchema.create().addSelect("id").addCondition((ConditionExpression)QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"tenant").eq((Object)tenantId), QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"logo").is_not_null(), QueryConditionGroup.or((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"frontIdNo").is_not_null()}), QueryConditionGroup.or((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"backIdNo").is_not_null()}), QueryConditionGroup.or((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"businessLicense").is_not_null()}), QueryConditionGroup.or((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"orgIdNo").is_not_null()})})}));
            List merchantIdMapList = null;
            try {
                merchantIdMapList = MetaDaoHelper.queryNoPartition((String)"aa.merchant.Merchant", (QuerySchema)queryMerchantIdSchemaSchema, null);
            }
            catch (Exception e) {
                log.error("\u67e5\u8be2\u5e26\u6709\u9644\u4ef6\u7684\u5ba2\u6237ID\u96c6\u5408\u5931\u8d25" + e.getMessage(), (Throwable)e);
            }
            if (CollectionUtils.isEmpty((Collection)merchantIdMapList)) continue;
            List merchantIdList = merchantIdMapList.stream().map(a -> Long.parseLong(a.get("id").toString())).collect(Collectors.toList());
            List lists = ListSplitUtil.splitListByCapacity(merchantIdList, (int)1000);
            for (List list : lists) {
                try {
                    this.merchantMainDataUpgradeByIdList(list, tenantIdMapping.get(tenantId));
                }
                catch (Exception e) {
                    log.error("\u5347\u7ea7\u5ba2\u6237\u4e3b\u8868\u56fe\u7247\u9644\u4ef6\u5f02\u5e38" + e.getMessage(), (Throwable)e);
                    this.recordUpgradeException(AttachmentUpgradeEnum.MERCHANT_MAIN_IMAGE, list.stream().map(String::valueOf).collect(Collectors.joining(",")), e.getMessage() == null ? e.toString() : e.getMessage());
                }
            }
        }
        this.recordUpgradeSuccess(AttachmentUpgradeEnum.MERCHANT_MAIN_IMAGE);
    }

    public void merchantMainDataUpgradeByIdList(List<Long> idList, String ytenantId) throws Exception {
        ArrayList<FileInfoMoveRequest> fileInfoMoveRequestList = new ArrayList<FileInfoMoveRequest>();
        QuerySchema queryMerchantDetailSchema = QuerySchema.create().addSelect("id,logo,frontIdNo,backIdNo,businessLicense,orgIdNo").addCondition((ConditionExpression)QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"id").in(idList)}));
        List merchantDetailList = MetaDaoHelper.queryNoPartition((String)"aa.merchant.Merchant", (QuerySchema)queryMerchantDetailSchema, null);
        for (Map merchantDetailMap : merchantDetailList) {
            String businessId;
            Merchant merchant = new Merchant();
            merchant.setId(merchantDetailMap.get("id"));
            if (merchantDetailMap.get("logo") != null) {
                String logoUrl = merchantDetailMap.get("logo").toString();
                businessId = String.valueOf(IdManager.getInstance().nextId());
                fileInfoMoveRequestList.add(this.merchantMainDataCommonUpgrade(logoUrl, businessId, ytenantId));
                merchant.setMerchantLogo(businessId);
            }
            if (merchantDetailMap.get("frontIdNo") != null) {
                String frontIdNoUrl = merchantDetailMap.get("frontIdNo").toString();
                businessId = String.valueOf(IdManager.getInstance().nextId());
                fileInfoMoveRequestList.add(this.merchantMainDataCommonUpgrade(frontIdNoUrl, businessId, ytenantId));
                merchant.setFrontIdCard(businessId);
            }
            if (merchantDetailMap.get("backIdNo") != null) {
                String backIdNoUrl = merchantDetailMap.get("backIdNo").toString();
                businessId = String.valueOf(IdManager.getInstance().nextId());
                fileInfoMoveRequestList.add(this.merchantMainDataCommonUpgrade(backIdNoUrl, businessId, ytenantId));
                merchant.setBackIdCard(businessId);
            }
            if (merchantDetailMap.get("businessLicense") != null) {
                String businessLicenseUrl = merchantDetailMap.get("businessLicense").toString();
                businessId = String.valueOf(IdManager.getInstance().nextId());
                fileInfoMoveRequestList.add(this.merchantMainDataCommonUpgrade(businessLicenseUrl, businessId, ytenantId));
                merchant.setBusinessLicenseNew(businessId);
            }
            if (merchantDetailMap.get("orgIdNo") != null) {
                String orgIdNoUrl = merchantDetailMap.get("orgIdNo").toString();
                businessId = String.valueOf(IdManager.getInstance().nextId());
                fileInfoMoveRequestList.add(this.merchantMainDataCommonUpgrade(orgIdNoUrl, businessId, ytenantId));
                merchant.setOrgCertificate(businessId);
            }
            merchant.setEntityStatus(EntityStatus.Update);
            MetaDaoHelper.updateNoPartition((String)"aa.merchant.Merchant", (BizObject)merchant);
        }
        RobotExecutors.runAs((String)ytenantId, () -> {
            CommonResponse commonResponse = this.cooperationFileDataService.doCopyFileData(fileInfoMoveRequestList);
            if (commonResponse.getCode() != 200L) {
                log.error("\u8c03\u7528\u534f\u540c\u5347\u7ea7\u5ba2\u6237\u4e3b\u8868\u76f8\u5173\u9644\u4ef6\u5f02\u5e38" + commonResponse.getCode() + commonResponse.getMessage());
                this.recordUpgradeException(AttachmentUpgradeEnum.MERCHANT_MAIN_IMAGE, idList.stream().map(String::valueOf).collect(Collectors.joining(",")), commonResponse.getMessage() == null ? commonResponse.toString() : commonResponse.getMessage());
            }
        }, (ExecutorService)Executors.newFixedThreadPool(1));
    }

    private FileInfoMoveRequest merchantMainDataCommonUpgrade(String url, String businessId, String ytenantId) {
        String fileName = url.substring(url.lastIndexOf("/"));
        String path = this.ymsParamConfig.getCooperationFileBaseDir() + fileName;
        FileInfoMoveRequest fileInfoMoveRequest = new FileInfoMoveRequest();
        fileInfoMoveRequest.setBusinessType("iuap-apdoc-material");
        fileInfoMoveRequest.setBusinessId(String.valueOf(businessId));
        fileInfoMoveRequest.setName(fileName);
        fileInfoMoveRequest.setPath(path);
        fileInfoMoveRequest.setTenantId(ytenantId);
        return fileInfoMoveRequest;
    }

    @Override
    public void productDescriptionDataUpgrade(List<Long> tenantIdList) {
    }

    @Override
    public void presentationClassDataUpgrade(List<Long> tenantIdList) {
        if (this.queryIsTriggerUpgrade(AttachmentUpgradeEnum.PRESENTATION_CLASS_IMAGE)) {
            return;
        }
        this.recordBeginUpgrade(AttachmentUpgradeEnum.PRESENTATION_CLASS_IMAGE);
        if (tenantIdList.isEmpty()) {
            QuerySchema queryPresentationClassTenantSchema = QuerySchema.create().addSelect("tenant").distinct();
            List queryPresentationClassTenantList = null;
            try {
                queryPresentationClassTenantList = MetaDaoHelper.queryNoPartition((String)"pc.cls.PresentationClass", (QuerySchema)queryPresentationClassTenantSchema, null);
            }
            catch (Exception e) {
                log.error("\u9644\u4ef6\u5347\u7ea7\u67e5\u8be2\u5546\u54c1\u5206\u7c7b\u79df\u6237\u5f02\u5e38" + e.getMessage(), (Throwable)e);
            }
            if (CollectionUtils.isEmpty((Collection)queryPresentationClassTenantList)) {
                this.recordUpgradeSuccess(AttachmentUpgradeEnum.PRESENTATION_CLASS_IMAGE);
                return;
            }
            tenantIdList = queryPresentationClassTenantList.stream().map(a -> Long.parseLong(a.get("tenant").toString())).collect(Collectors.toList());
        }
        Map<Long, String> tenantIdMapping = this.getTenantIdMapping(tenantIdList);
        for (Long tenantId : tenantIdList) {
            QuerySchema queryPresentationClassIdSchemaSchema = QuerySchema.create().addSelect("id").addCondition((ConditionExpression)QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"tenant").eq((Object)tenantId), QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"image").is_not_null(), QueryConditionGroup.or((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"adImage").is_not_null()})})}));
            List queryPresentationClassIdList = null;
            try {
                queryPresentationClassIdList = MetaDaoHelper.queryNoPartition((String)"pc.cls.PresentationClass", (QuerySchema)queryPresentationClassIdSchemaSchema, null);
            }
            catch (Exception e) {
                log.error("\u9644\u4ef6\u5347\u7ea7\u5546\u54c1\u5206\u7c7b\u67e5\u8be2ID\u96c6\u5408\u5f02\u5e38" + e.getMessage(), (Throwable)e);
            }
            if (CollectionUtils.isEmpty((Collection)queryPresentationClassIdList)) continue;
            List presentationClassIdList = queryPresentationClassIdList.stream().map(a -> Long.parseLong(a.get("id").toString())).collect(Collectors.toList());
            List lists = ListSplitUtil.splitListByCapacity(presentationClassIdList, (int)1000);
            for (List list : lists) {
                try {
                    this.presentationClassDataUpgradeByIdList(list, tenantIdMapping.get(tenantId));
                }
                catch (Exception e) {
                    log.error("\u5347\u7ea7\u5546\u54c1\u5206\u7c7b\u56fe\u7247\u5f02\u5e38\uff0c\u5f02\u5e38\u96c6\u5408:" + list + "\u5f02\u5e38\u4fe1\u606f\uff1a" + e.getMessage(), (Throwable)e);
                    this.recordUpgradeException(AttachmentUpgradeEnum.PRESENTATION_CLASS_IMAGE, list.stream().map(String::valueOf).collect(Collectors.joining(",")), e.getMessage() == null ? e.toString() : e.getMessage());
                }
            }
        }
        this.recordUpgradeSuccess(AttachmentUpgradeEnum.PRESENTATION_CLASS_IMAGE);
    }

    public void presentationClassDataUpgradeByIdList(List<Long> idList, String ytenantId) throws Exception {
        ArrayList<FileInfoMoveRequest> fileInfoMoveRequestList = new ArrayList<FileInfoMoveRequest>();
        QuerySchema queryPresentationClassDetailSchema = QuerySchema.create().addSelect("id,image,adImage").addCondition((ConditionExpression)QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"id").in(idList)}));
        List queryPresentationClassDetailList = MetaDaoHelper.queryNoPartition((String)"pc.cls.PresentationClass", (QuerySchema)queryPresentationClassDetailSchema, null);
        for (Map presentationClassDetailMap : queryPresentationClassDetailList) {
            PresentationClass presentationClass;
            long businessId;
            FileInfoMoveRequest fileInfoMoveRequest;
            String path;
            if (presentationClassDetailMap.get("image") != null) {
                String imageUrl = presentationClassDetailMap.get("image").toString();
                String imageFileName = imageUrl.substring(imageUrl.lastIndexOf("/"));
                path = this.ymsParamConfig.getCooperationFileBaseDir() + imageFileName;
                fileInfoMoveRequest = new FileInfoMoveRequest();
                fileInfoMoveRequest.setBusinessType("iuap-apdoc-material");
                businessId = IdManager.getInstance().nextId();
                fileInfoMoveRequest.setBusinessId(String.valueOf(businessId));
                presentationClass = new PresentationClass();
                presentationClass.setId(presentationClassDetailMap.get("id"));
                presentationClass.setImageBusinessId(String.valueOf(businessId));
                presentationClass.setEntityStatus(EntityStatus.Update);
                MetaDaoHelper.updateNoPartition((String)"pc.cls.PresentationClass", (BizObject)presentationClass);
                fileInfoMoveRequest.setName(imageFileName);
                fileInfoMoveRequest.setPath(path);
                fileInfoMoveRequest.setTenantId(ytenantId);
                fileInfoMoveRequestList.add(fileInfoMoveRequest);
            }
            if (presentationClassDetailMap.get("adImage") == null) continue;
            String adImageUrl = presentationClassDetailMap.get("adImage").toString();
            String adImageFileName = adImageUrl.substring(adImageUrl.lastIndexOf("/"));
            path = this.ymsParamConfig.getCooperationFileBaseDir() + adImageFileName;
            fileInfoMoveRequest = new FileInfoMoveRequest();
            fileInfoMoveRequest.setBusinessType("iuap-apdoc-material");
            businessId = IdManager.getInstance().nextId();
            fileInfoMoveRequest.setBusinessId(String.valueOf(businessId));
            presentationClass = new PresentationClass();
            presentationClass.setId(presentationClassDetailMap.get("id"));
            presentationClass.setAdImageBusinessId(String.valueOf(businessId));
            presentationClass.setEntityStatus(EntityStatus.Update);
            MetaDaoHelper.updateNoPartition((String)"pc.cls.PresentationClass", (BizObject)presentationClass);
            fileInfoMoveRequest.setName(adImageFileName);
            fileInfoMoveRequest.setPath(path);
            fileInfoMoveRequest.setTenantId(ytenantId);
            fileInfoMoveRequestList.add(fileInfoMoveRequest);
        }
        RobotExecutors.runAs((String)ytenantId, () -> {
            CommonResponse commonResponse = this.cooperationFileDataService.doCopyFileData(fileInfoMoveRequestList);
            if (commonResponse.getCode() != 200L) {
                log.error("\u8c03\u7528\u534f\u540c\u5347\u7ea7\u5546\u54c1\u5206\u7c7b\u56fe\u7247\u5f02\u5e38" + commonResponse.getCode() + commonResponse.getMessage());
                this.recordUpgradeException(AttachmentUpgradeEnum.PRESENTATION_CLASS_IMAGE, idList.stream().map(String::valueOf).collect(Collectors.joining(",")), commonResponse.getMessage() == null ? commonResponse.toString() : commonResponse.getMessage());
            }
        }, (ExecutorService)Executors.newFixedThreadPool(1));
    }

    @Override
    public void tagDataUpgrade(List<Long> tenantIdList) {
        if (this.queryIsTriggerUpgrade(AttachmentUpgradeEnum.TAG_IMAGE)) {
            return;
        }
        this.recordBeginUpgrade(AttachmentUpgradeEnum.TAG_IMAGE);
        if (tenantIdList.isEmpty()) {
            QuerySchema queryTagTenantSchema = QuerySchema.create().addSelect("tenant").distinct();
            List queryTagTenantList = null;
            try {
                queryTagTenantList = MetaDaoHelper.queryNoPartition((String)"pc.tag.Tag", (QuerySchema)queryTagTenantSchema, null);
            }
            catch (Exception e) {
                log.error("\u9644\u4ef6\u5347\u7ea7\u6807\u7b7e\u67e5\u8be2\u5f02\u5e38" + e.getMessage(), (Throwable)e);
            }
            if (CollectionUtils.isEmpty((Collection)queryTagTenantList)) {
                this.recordUpgradeSuccess(AttachmentUpgradeEnum.TAG_IMAGE);
                return;
            }
            tenantIdList = queryTagTenantList.stream().map(a -> Long.parseLong(a.get("tenant").toString())).collect(Collectors.toList());
        }
        Map<Long, String> tenantIdMapping = this.getTenantIdMapping(tenantIdList);
        for (Long tenantId : tenantIdList) {
            try {
                QuerySchema queryTagDetailSchema = QuerySchema.create().addSelect("id,tag_image_url").addCondition((ConditionExpression)QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"tenant").eq((Object)tenantId), QueryCondition.name((String)"tag_image_url").is_not_null()}));
                List tagDetailList = MetaDaoHelper.queryNoPartition((String)"pc.tag.Tag", (QuerySchema)queryTagDetailSchema, null);
                if (CollectionUtils.isEmpty((Collection)tagDetailList)) continue;
                this.tagDataUpgradeCommon(tagDetailList, tenantIdMapping.get(tenantId));
            }
            catch (Exception e) {
                log.error("\u5347\u7ea7\u6807\u7b7e\u56fe\u7247\u5f02\u5e38\uff0c\u5f02\u5e38\u79df\u6237:" + tenantId + "\u5f02\u5e38\u4fe1\u606f\uff1a" + e.getMessage(), (Throwable)e);
                this.recordUpgradeException(AttachmentUpgradeEnum.TAG_IMAGE, tenantIdMapping.get(tenantId), e.getMessage() == null ? e.toString() : e.getMessage());
            }
        }
        this.recordUpgradeSuccess(AttachmentUpgradeEnum.TAG_IMAGE);
    }

    public void tagDataUpgradeByIdList(List<Long> idList, String ytenantId) {
        try {
            QuerySchema queryTagDetailSchema = QuerySchema.create().addSelect("id,tag_image_url").addCondition((ConditionExpression)QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"id").in(idList), QueryCondition.name((String)"tag_image_url").is_not_null()}));
            List tagDetailList = MetaDaoHelper.queryNoPartition((String)"pc.tag.Tag", (QuerySchema)queryTagDetailSchema, null);
            if (CollectionUtils.isEmpty((Collection)tagDetailList)) {
                return;
            }
            this.tagDataUpgradeCommon(tagDetailList, ytenantId);
        }
        catch (Exception e) {
            log.error("\u5347\u7ea7\u6807\u7b7e\u56fe\u7247\u5f02\u5e38\uff0c\u5f02\u5e38\u79df\u6237:" + ytenantId + "\u5f02\u5e38\u4fe1\u606f\uff1a" + e.getMessage(), (Throwable)e);
            this.recordUpgradeException(AttachmentUpgradeEnum.TAG_IMAGE, ytenantId, e.getMessage() == null ? e.toString() : e.getMessage());
        }
    }

    private void tagDataUpgradeCommon(List<Map<String, Object>> tagDetailList, String ytenantId) throws Exception {
        ArrayList<FileInfoMoveRequest> fileInfoMoveRequestList = new ArrayList<FileInfoMoveRequest>();
        for (Map<String, Object> tagDetailMap : tagDetailList) {
            String imageUrl = tagDetailMap.get("tag_image_url").toString();
            String imageFileName = imageUrl.substring(imageUrl.lastIndexOf("/"));
            String path = this.ymsParamConfig.getCooperationFileBaseDir() + imageFileName;
            FileInfoMoveRequest fileInfoMoveRequest = new FileInfoMoveRequest();
            fileInfoMoveRequest.setBusinessType("iuap-apdoc-material");
            long businessId = IdManager.getInstance().nextId();
            fileInfoMoveRequest.setBusinessId(String.valueOf(businessId));
            Tag tag = new Tag();
            tag.setId(tagDetailMap.get("id"));
            tag.setTagBusinessId(String.valueOf(businessId));
            tag.setEntityStatus(EntityStatus.Update);
            MetaDaoHelper.updateNoPartition((String)"pc.tag.Tag", (BizObject)tag);
            fileInfoMoveRequest.setName(imageFileName);
            fileInfoMoveRequest.setPath(path);
            fileInfoMoveRequest.setTenantId(ytenantId);
            fileInfoMoveRequestList.add(fileInfoMoveRequest);
        }
        RobotExecutors.runAs((String)ytenantId, () -> {
            CommonResponse commonResponse = this.cooperationFileDataService.doCopyFileData(fileInfoMoveRequestList);
            if (commonResponse.getCode() != 200L) {
                log.error("\u8c03\u7528\u534f\u540c\u5347\u7ea7\u6807\u7b7e\u56fe\u7247\u5f02\u5e38" + commonResponse.getCode() + commonResponse.getMessage());
                this.recordUpgradeException(AttachmentUpgradeEnum.TAG_IMAGE, ytenantId, commonResponse.getMessage() == null ? commonResponse.toString() : commonResponse.getMessage());
            }
        }, (ExecutorService)Executors.newFixedThreadPool(1));
    }

    @Override
    public void brandDataUpgrade(List<Long> tenantIdList) {
        if (this.queryIsTriggerUpgrade(AttachmentUpgradeEnum.BRAND_IMAGE)) {
            return;
        }
        this.recordBeginUpgrade(AttachmentUpgradeEnum.BRAND_IMAGE);
        if (tenantIdList.isEmpty()) {
            QuerySchema queryBrandTenantSchema = QuerySchema.create().addSelect("tenant").distinct();
            List brandTenantList = null;
            try {
                brandTenantList = MetaDaoHelper.queryNoPartition((String)"pc.brand.Brand", (QuerySchema)queryBrandTenantSchema, null);
            }
            catch (Exception e) {
                log.error("\u9644\u4ef6\u5347\u7ea7\u67e5\u8be2\u54c1\u724c\u79df\u6237\u5f02\u5e38" + e.getMessage(), (Throwable)e);
            }
            if (CollectionUtils.isEmpty((Collection)brandTenantList)) {
                this.recordUpgradeSuccess(AttachmentUpgradeEnum.BRAND_IMAGE);
                return;
            }
            tenantIdList = brandTenantList.stream().map(a -> Long.parseLong(a.get("tenant").toString())).collect(Collectors.toList());
        }
        Map<Long, String> tenantIdMapping = this.getTenantIdMapping(tenantIdList);
        for (Long tenantId : tenantIdList) {
            QuerySchema queryBrandIdSchemaSchema = QuerySchema.create().addSelect("id").addCondition((ConditionExpression)QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"tenant").eq((Object)tenantId), QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"brandLogo").is_not_null(), QueryConditionGroup.or((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"adImage").is_not_null()})})}));
            List brandIdMapList = null;
            try {
                brandIdMapList = MetaDaoHelper.queryNoPartition((String)"pc.brand.Brand", (QuerySchema)queryBrandIdSchemaSchema, null);
            }
            catch (Exception e) {
                log.error("\u9644\u4ef6\u5347\u7ea7\u67e5\u8be2\u54c1\u724cID\u96c6\u5408\u5f02\u5e38" + e.getMessage(), (Throwable)e);
            }
            if (CollectionUtils.isEmpty((Collection)brandIdMapList)) continue;
            List brandIdList = brandIdMapList.stream().map(a -> Long.parseLong(a.get("id").toString())).collect(Collectors.toList());
            List lists = ListSplitUtil.splitListByCapacity(brandIdList, (int)1000);
            for (List list : lists) {
                try {
                    this.brandDataUpgradeByIdList(list, tenantIdMapping.get(tenantId));
                }
                catch (Exception e) {
                    log.error("\u5347\u7ea7\u54c1\u724c\u56fe\u7247\u5f02\u5e38\uff0c\u5f02\u5e38\u96c6\u5408:" + list + "\u5f02\u5e38\u4fe1\u606f\uff1a" + e.getMessage(), (Throwable)e);
                    this.recordUpgradeException(AttachmentUpgradeEnum.BRAND_IMAGE, list.stream().map(String::valueOf).collect(Collectors.joining(",")), e.getMessage() == null ? e.toString() : e.getMessage());
                }
            }
        }
        this.recordUpgradeSuccess(AttachmentUpgradeEnum.BRAND_IMAGE);
    }

    public void brandDataUpgradeByIdList(List<Long> idList, String ytenantId) throws Exception {
        ArrayList<FileInfoMoveRequest> fileInfoMoveRequestList = new ArrayList<FileInfoMoveRequest>();
        QuerySchema queryBrandDetailSchema = QuerySchema.create().addSelect("id,brandLogo,adImage").addCondition((ConditionExpression)QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"id").in(idList)}));
        List brandDetailList = MetaDaoHelper.queryNoPartition((String)"pc.brand.Brand", (QuerySchema)queryBrandDetailSchema, null);
        for (Map brandDetailMap : brandDetailList) {
            Brand brand;
            long businessId;
            FileInfoMoveRequest fileInfoMoveRequest;
            String path;
            if (brandDetailMap.get("brandLogo") != null) {
                String imageUrl = brandDetailMap.get("brandLogo").toString();
                String brandLogoFileName = imageUrl.substring(imageUrl.lastIndexOf("/"));
                path = this.ymsParamConfig.getCooperationFileBaseDir() + brandLogoFileName;
                fileInfoMoveRequest = new FileInfoMoveRequest();
                fileInfoMoveRequest.setBusinessType("iuap-apdoc-material");
                businessId = IdManager.getInstance().nextId();
                fileInfoMoveRequest.setBusinessId(String.valueOf(businessId));
                brand = new Brand();
                brand.setId(brandDetailMap.get("id"));
                brand.setBrandLogoBusinessId(String.valueOf(businessId));
                brand.setEntityStatus(EntityStatus.Update);
                MetaDaoHelper.updateNoPartition((String)"pc.brand.Brand", (BizObject)brand);
                fileInfoMoveRequest.setName(brandLogoFileName);
                fileInfoMoveRequest.setPath(path);
                fileInfoMoveRequest.setTenantId(ytenantId);
                fileInfoMoveRequestList.add(fileInfoMoveRequest);
            }
            if (brandDetailMap.get("adImage") == null) continue;
            String adImageUrl = brandDetailMap.get("adImage").toString();
            String adImageFileName = adImageUrl.substring(adImageUrl.lastIndexOf("/"));
            path = this.ymsParamConfig.getCooperationFileBaseDir() + adImageFileName;
            fileInfoMoveRequest = new FileInfoMoveRequest();
            fileInfoMoveRequest.setBusinessType("iuap-apdoc-material");
            businessId = IdManager.getInstance().nextId();
            fileInfoMoveRequest.setBusinessId(String.valueOf(businessId));
            brand = new Brand();
            brand.setId(brandDetailMap.get("id"));
            brand.setAdImageBusinessId(String.valueOf(businessId));
            brand.setEntityStatus(EntityStatus.Update);
            MetaDaoHelper.updateNoPartition((String)"pc.brand.Brand", (BizObject)brand);
            fileInfoMoveRequest.setName(adImageFileName);
            fileInfoMoveRequest.setPath(path);
            fileInfoMoveRequest.setTenantId(ytenantId);
            fileInfoMoveRequestList.add(fileInfoMoveRequest);
        }
        RobotExecutors.runAs((String)ytenantId, () -> {
            CommonResponse commonResponse = this.cooperationFileDataService.doCopyFileData(fileInfoMoveRequestList);
            if (commonResponse.getCode() != 200L) {
                log.error("\u8c03\u7528\u534f\u540c\u5347\u7ea7\u54c1\u724c\u56fe\u7247\u5f02\u5e38" + commonResponse.getCode() + commonResponse.getMessage());
                this.recordUpgradeException(AttachmentUpgradeEnum.BRAND_IMAGE, idList.stream().map(String::valueOf).collect(Collectors.joining(",")), commonResponse.getMessage() == null ? commonResponse.toString() : commonResponse.getMessage());
            }
        }, (ExecutorService)Executors.newFixedThreadPool(1));
    }

    @Override
    public void productApplyDataUpgrade(List<Long> tenantIdList) throws Exception {
        if (this.queryIsTriggerUpgrade(AttachmentUpgradeEnum.PRODUCT_APPLY)) {
            return;
        }
        this.recordBeginUpgrade(AttachmentUpgradeEnum.PRODUCT_APPLY);
        if (tenantIdList.isEmpty()) {
            QuerySchema queryProductApplyTenantSchema = QuerySchema.create().addSelect("tenant").distinct();
            List productApplyTenantList = null;
            try {
                productApplyTenantList = MetaDaoHelper.queryNoPartition((String)"pc.productapply.ProductApply", (QuerySchema)queryProductApplyTenantSchema, null);
            }
            catch (Exception e) {
                log.error("\u9644\u4ef6\u5347\u7ea7\u67e5\u8be2\u7269\u6599\u7533\u8bf7\u5355\u79df\u6237\u5f02\u5e38" + e.getMessage(), (Throwable)e);
            }
            if (CollectionUtils.isEmpty((Collection)productApplyTenantList)) {
                this.recordUpgradeSuccess(AttachmentUpgradeEnum.PRODUCT_APPLY);
                return;
            }
            tenantIdList = productApplyTenantList.stream().map(a -> Long.parseLong(a.get("tenant").toString())).collect(Collectors.toList());
        }
        Map<Long, String> tenantIdMapping = this.getTenantIdMapping(tenantIdList);
        for (Long tenantId : tenantIdList) {
            QuerySchema productApplyQuerySchema = QuerySchema.create().addSelect("id").addCondition((ConditionExpression)QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"tenant").eq((Object)tenantId)}));
            List productApplyIdMapList = null;
            try {
                productApplyIdMapList = MetaDaoHelper.queryNoPartition((String)"pc.brand.Brand", (QuerySchema)productApplyQuerySchema, null);
            }
            catch (Exception e) {
                log.error("\u9644\u4ef6\u5347\u7ea7\u67e5\u8be2\u7269\u6599\u7533\u8bf7\u5355ID\u96c6\u5408\u5f02\u5e38" + e.getMessage(), (Throwable)e);
            }
            if (CollectionUtils.isEmpty((Collection)productApplyIdMapList)) continue;
            List productApplyIdList = productApplyIdMapList.stream().map(a -> Long.parseLong(a.get("id").toString())).collect(Collectors.toList());
            List lists = ListSplitUtil.splitListByCapacity(productApplyIdList, (int)20);
            for (List list : lists) {
                try {
                    this.productApplyDataUpgradeByIdList(list, tenantId);
                }
                catch (Exception e) {
                    log.error("\u5347\u7ea7\u7269\u6599\u7533\u8bf7\u5355\u5f02\u5e38\uff0c\u5f02\u5e38\u96c6\u5408:" + list + "\u5f02\u5e38\u4fe1\u606f\uff1a" + e.getMessage(), (Throwable)e);
                    this.recordUpgradeException(AttachmentUpgradeEnum.PRODUCT_APPLY, list.stream().map(String::valueOf).collect(Collectors.joining(",")), e.getMessage() == null ? e.toString() : e.getMessage());
                }
            }
        }
        this.recordUpgradeSuccess(AttachmentUpgradeEnum.PRODUCT_APPLY);
    }

    @Override
    public void merchantApplyDataUpgrade(List<Long> tenantIdList) throws Exception {
        if (this.queryIsTriggerUpgrade(AttachmentUpgradeEnum.MERCHANT_APPLY)) {
            return;
        }
        this.recordBeginUpgrade(AttachmentUpgradeEnum.MERCHANT_APPLY);
        if (tenantIdList.isEmpty()) {
            QuerySchema merchantApplyQueryTenantSchema = QuerySchema.create().addSelect("tenant").distinct();
            List merchantApplyTenantList = null;
            try {
                merchantApplyTenantList = MetaDaoHelper.queryNoPartition((String)"aa.customerapply.CustomerApply", (QuerySchema)merchantApplyQueryTenantSchema, null);
            }
            catch (Exception e) {
                log.error("\u9644\u4ef6\u5347\u7ea7\u67e5\u8be2\u5ba2\u6237\u7533\u8bf7\u5355\u79df\u6237\u5f02\u5e38" + e.getMessage(), (Throwable)e);
            }
            if (CollectionUtils.isEmpty((Collection)merchantApplyTenantList)) {
                this.recordUpgradeSuccess(AttachmentUpgradeEnum.MERCHANT_APPLY);
                return;
            }
            tenantIdList = merchantApplyTenantList.stream().map(a -> Long.parseLong(a.get("tenant").toString())).collect(Collectors.toList());
        }
        Map<Long, String> tenantIdMapping = this.getTenantIdMapping(tenantIdList);
        for (Long tenantId : tenantIdList) {
            QuerySchema merchantApplyQuerySchema = QuerySchema.create().addSelect("id").addCondition((ConditionExpression)QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"tenant").eq((Object)tenantId)}));
            List merchantApplyIdMapList = null;
            try {
                merchantApplyIdMapList = MetaDaoHelper.queryNoPartition((String)"pc.brand.Brand", (QuerySchema)merchantApplyQuerySchema, null);
            }
            catch (Exception e) {
                log.error("\u9644\u4ef6\u5347\u7ea7\u67e5\u8be2\u5ba2\u6237\u7533\u8bf7\u5355ID\u96c6\u5408\u5f02\u5e38" + e.getMessage(), (Throwable)e);
            }
            if (CollectionUtils.isEmpty((Collection)merchantApplyIdMapList)) continue;
            List merchantApplyIdList = merchantApplyIdMapList.stream().map(a -> Long.parseLong(a.get("id").toString())).collect(Collectors.toList());
            List lists = ListSplitUtil.splitListByCapacity(merchantApplyIdList, (int)20);
            for (List list : lists) {
                try {
                    this.merchantApplyDataUpgradeByIdList(list, tenantId);
                }
                catch (Exception e) {
                    log.error("\u5347\u7ea7\u5ba2\u6237\u7533\u8bf7\u5355\u5f02\u5e38\uff0c\u5f02\u5e38\u96c6\u5408:" + list + "\u5f02\u5e38\u4fe1\u606f\uff1a" + e.getMessage(), (Throwable)e);
                    this.recordUpgradeException(AttachmentUpgradeEnum.MERCHANT_APPLY, list.stream().map(String::valueOf).collect(Collectors.joining(",")), e.getMessage() == null ? e.toString() : e.getMessage());
                }
            }
        }
        this.recordUpgradeSuccess(AttachmentUpgradeEnum.MERCHANT_APPLY);
    }

    public void productApplyDataUpgradeByIdList(List<Long> idList, Long tenantId) throws Exception {
        QuerySchema queryProductApplyDetailSchema = QuerySchema.create().addSelect("id,productCode,productData").addCondition((ConditionExpression)QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"id").in(idList), QueryCondition.name((String)"effectStatus").eq((Object)"2")}));
        List productApplyDetailList = MetaDaoHelper.queryNoPartition((String)"pc.productapply.ProductApply", (QuerySchema)queryProductApplyDetailSchema, null);
        for (Map productApplyDetailMap : productApplyDetailList) {
            List productList;
            String productData;
            Map productBizMap;
            if (productApplyDetailMap.get("productData") == null || (productBizMap = (Map)JSONObject.parseObject((String)(productData = productApplyDetailMap.get("productData").toString()), Map.class)).get("id") == null && productBizMap.get("code") == null) continue;
            QuerySchema queryMerchantSchema = QuerySchema.create().addSelect("id,homepageBusinessId,imgBusinessId,videoBusinessId").addCondition((ConditionExpression)QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"code").eq(productBizMap.get("code")), QueryCondition.name((String)"tenant").eq((Object)tenantId)}));
            if (productBizMap.get("id") != null) {
                queryMerchantSchema.appendQueryCondition(new ConditionExpression[]{QueryCondition.name((String)"id").eq(productBizMap.get("id"))});
            }
            if (CollectionUtils.isEmpty((Collection)(productList = MetaDaoHelper.queryNoPartition((String)"pc.product.Product", (QuerySchema)queryMerchantSchema, null)))) continue;
            if (((Map)productList.get(0)).get("homepageBusinessId") != null) {
                productBizMap.put("homepageBusinessId", ((Map)productList.get(0)).get("homepageBusinessId"));
            }
            if (((Map)productList.get(0)).get("imgBusinessId") != null) {
                productBizMap.put("imgBusinessId", ((Map)productList.get(0)).get("imgBusinessId"));
            }
            if (((Map)productList.get(0)).get("videoBusinessId") != null) {
                productBizMap.put("videoBusinessId", ((Map)productList.get(0)).get("videoBusinessId"));
            }
            productBizMap.put("id", ((Map)productList.get(0)).get("id"));
            ProductApply productApply = new ProductApply();
            productApply.setId(productApplyDetailMap.get("id"));
            productApply.setProductData(JSON.toJSONString((Object)productBizMap));
            productApply.setEntityStatus(EntityStatus.Update);
            MetaDaoHelper.updateNoPartition((String)"pc.productapply.ProductApply", (BizObject)productApply);
        }
    }

    public void merchantApplyDataUpgradeByIdList(List<Long> idList, Long tenantId) throws Exception {
        QuerySchema queryMerchantApplyDetailSchema = QuerySchema.create().addSelect("id,merchantCode,customerData").addCondition((ConditionExpression)QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"id").in(idList), QueryCondition.name((String)"effectStatus").eq((Object)"2")}));
        List merchantApplyDetailList = MetaDaoHelper.queryNoPartition((String)"aa.customerapply.CustomerApply", (QuerySchema)queryMerchantApplyDetailSchema, null);
        for (Map merchantApplyDetailMap : merchantApplyDetailList) {
            List merchantList;
            String merchantData;
            Map merchantBizMap;
            if (merchantApplyDetailMap.get("customerData") == null || (merchantBizMap = (Map)JSONObject.parseObject((String)(merchantData = merchantApplyDetailMap.get("customerData").toString()), Map.class)).get("id") == null && merchantBizMap.get("code") == null) continue;
            QuerySchema queryMerchantSchema = QuerySchema.create().addSelect("id,merchantLogo,frontIdCard,backIdCard,businessLicenseNew,certificate,orgCertificate").addCondition((ConditionExpression)QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"code").eq(merchantBizMap.get("code")), QueryCondition.name((String)"tenant").eq((Object)tenantId)}));
            if (merchantBizMap.get("id") != null) {
                queryMerchantSchema.appendQueryCondition(new ConditionExpression[]{QueryCondition.name((String)"id").eq(merchantBizMap.get("id"))});
            }
            if (CollectionUtils.isEmpty((Collection)(merchantList = MetaDaoHelper.queryNoPartition((String)"aa.merchant.Merchant", (QuerySchema)queryMerchantSchema, null)))) continue;
            if (((Map)merchantList.get(0)).get("merchantLogo") != null) {
                merchantBizMap.put("merchantLogo", ((Map)merchantList.get(0)).get("merchantLogo"));
            }
            if (((Map)merchantList.get(0)).get("frontIdCard") != null) {
                merchantBizMap.put("frontIdCard", ((Map)merchantList.get(0)).get("frontIdCard"));
            }
            if (((Map)merchantList.get(0)).get("backIdCard") != null) {
                merchantBizMap.put("backIdCard", ((Map)merchantList.get(0)).get("backIdCard"));
            }
            if (((Map)merchantList.get(0)).get("businessLicenseNew") != null) {
                merchantBizMap.put("businessLicenseNew", ((Map)merchantList.get(0)).get("businessLicenseNew"));
            }
            if (((Map)merchantList.get(0)).get("certificate") != null) {
                merchantBizMap.put("certificate", ((Map)merchantList.get(0)).get("certificate"));
            }
            if (((Map)merchantList.get(0)).get("orgCertificate") != null) {
                merchantBizMap.put("orgCertificate", ((Map)merchantList.get(0)).get("orgCertificate"));
            }
            merchantBizMap.put("id", ((Map)merchantList.get(0)).get("id"));
            CustomerApply customerApply = new CustomerApply();
            customerApply.setId(merchantApplyDetailMap.get("id"));
            customerApply.setCustomerData(JSON.toJSONString((Object)merchantBizMap));
            customerApply.setEntityStatus(EntityStatus.Update);
            MetaDaoHelper.updateNoPartition((String)"aa.customerapply.CustomerApply", (BizObject)customerApply);
        }
    }

    public Map<Long, String> getTenantIdMapping(List<Long> tenantIdList) {
        String tenantIdListString = tenantIdList.stream().map(String::valueOf).collect(Collectors.joining(","));
        String sql = "select id,tenantcenter_id,ytenant_id from tenant where id in (" + tenantIdListString + ")";
        HashMap<String, String> params = new HashMap<String, String>();
        params.put("sql", sql);
        List tenantMapList = SqlHelper.selectList((String)"com.yonyou.ucf.mdd.ext.meta.dao.selectList", params);
        if (CollectionUtils.isEmpty((Collection)tenantMapList)) {
            log.error("\u6839\u636e\u79df\u6237id\u67e5\u8be2\u79df\u6237\u8868\u6570\u636e\u4e3a\u7a7a,\u53c2\u6570\u4e3a:" + tenantMapList);
            throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_800820);
        }
        HashMap<Long, String> tenantMappingMap = new HashMap<Long, String>();
        for (Map tenantMap : tenantMapList) {
            tenantMappingMap.put(Long.parseLong(tenantMap.get("id").toString()), tenantMap.get("tenantcenter_id") == null ? tenantMap.get("ytenant_id").toString() : tenantMap.get("tenantcenter_id").toString());
        }
        return tenantMappingMap;
    }

    public boolean queryIsTriggerUpgrade(AttachmentUpgradeEnum attachmentUpgradeEnum) {
        QuerySchema querySchema = QuerySchema.create().addSelect("id").addCondition((ConditionExpression)QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"originTableName").eq((Object)attachmentUpgradeEnum.getOriginTableName()), QueryCondition.name((String)"attachmentBusinessType").eq((Object)attachmentUpgradeEnum.getAttachmentBusinessType()), QueryCondition.name((String)"triggerUpgradeStatus").eq((Object)"1")}));
        List maps = null;
        try {
            maps = MetaDaoHelper.queryNoPartition((String)"coredoc.common.AttachmentUpgradeResult", (QuerySchema)querySchema, null);
        }
        catch (Exception e) {
            log.error("\u67e5\u8be2\u662f\u5426\u89e6\u53d1\u8fc7" + attachmentUpgradeEnum.getAttachmentBusinessType() + "\u9644\u4ef6\u5347\u7ea7\u5f02\u5e38" + e.getMessage(), (Throwable)e);
        }
        return !CollectionUtils.isEmpty((Collection)maps);
    }

    public void recordBeginUpgrade(AttachmentUpgradeEnum attachmentUpgradeEnum) {
        AttachmentUpgradeResult attachmentUpgradeResult = new AttachmentUpgradeResult();
        attachmentUpgradeResult.setId((Object)IdManager.getInstance().nextId());
        attachmentUpgradeResult.setOriginTableIds("00000");
        attachmentUpgradeResult.setOriginTableName(attachmentUpgradeEnum.getOriginTableName());
        attachmentUpgradeResult.setAttachmentBusinessType(attachmentUpgradeEnum.getAttachmentBusinessType());
        attachmentUpgradeResult.setTriggerUpgradeStatus("1");
        attachmentUpgradeResult.setYtenant("0");
        try {
            MetaDaoHelper.insertNoPartition((String)"coredoc.common.AttachmentUpgradeResult", (BizObject)attachmentUpgradeResult);
        }
        catch (Exception e) {
            log.error("\u8bb0\u5f55\u9644\u4ef6" + attachmentUpgradeEnum.getAttachmentBusinessType() + "\u5347\u7ea7\u5f00\u59cb\u5199\u5e93\u5f02\u5e38" + e.getMessage(), (Throwable)e);
        }
    }

    public void recordUpgradeException(AttachmentUpgradeEnum attachmentUpgradeEnum, String originIds, String errorMsg) {
        AttachmentUpgradeResult attachmentUpgradeResult = new AttachmentUpgradeResult();
        attachmentUpgradeResult.setId((Object)IdManager.getInstance().nextId());
        attachmentUpgradeResult.setOriginTableIds(originIds);
        attachmentUpgradeResult.setOriginTableName(attachmentUpgradeEnum.getOriginTableName());
        attachmentUpgradeResult.setAttachmentBusinessType(attachmentUpgradeEnum.getAttachmentBusinessType());
        if (errorMsg != null && errorMsg.length() > 500) {
            errorMsg = errorMsg.substring(0, 499);
        }
        attachmentUpgradeResult.setErrorMsg(errorMsg);
        attachmentUpgradeResult.setYtenant("0");
        try {
            MetaDaoHelper.insertNoPartition((String)"coredoc.common.AttachmentUpgradeResult", (BizObject)attachmentUpgradeResult);
        }
        catch (Exception e) {
            log.error("\u9644\u4ef6" + attachmentUpgradeEnum.getAttachmentBusinessType() + "\u5347\u7ea7\u5f02\u5e38\u7ed3\u679c\u5199\u5e93\u5f02\u5e38" + e.getMessage(), (Throwable)e);
        }
    }

    public void recordUpgradeSuccess(AttachmentUpgradeEnum attachmentUpgradeEnum) {
        AttachmentUpgradeResult attachmentUpgradeResult = new AttachmentUpgradeResult();
        attachmentUpgradeResult.setId((Object)IdManager.getInstance().nextId());
        attachmentUpgradeResult.setOriginTableIds("11111");
        attachmentUpgradeResult.setOriginTableName(attachmentUpgradeEnum.getOriginTableName());
        attachmentUpgradeResult.setAttachmentBusinessType(attachmentUpgradeEnum.getAttachmentBusinessType());
        attachmentUpgradeResult.setTotalStatus("1");
        attachmentUpgradeResult.setYtenant("0");
        try {
            MetaDaoHelper.insertNoPartition((String)"coredoc.common.AttachmentUpgradeResult", (BizObject)attachmentUpgradeResult);
        }
        catch (Exception e) {
            log.error("\u8bb0\u5f55" + attachmentUpgradeEnum.getAttachmentBusinessType() + "\u5347\u7ea7\u5b8c\u6210\u5199\u5e93\u5f02\u5e38" + e.getMessage(), (Throwable)e);
        }
    }

    @Override
    public String queryAttachmentDataUpgradeResult() throws Exception {
        String sql = "select count(1) as count from attachment_upgrade_result where total_status = '1'";
        HashMap<String, String> params = new HashMap<String, String>();
        params.put("sql", sql);
        List cacheMapList = SqlHelper.selectList((String)"com.yonyou.ucf.mdd.ext.meta.dao.selectList", params);
        if (!CollectionUtils.isEmpty((Collection)cacheMapList)) {
            int count = Integer.parseInt(((Map)cacheMapList.get(0)).get("count").toString());
            if (count == 0) {
                return "\u672a\u67e5\u8be2\u5230\u5347\u7ea7\u8fdb\u5ea6\uff0c\u8bf7\u7a0d\u540e\u518d\u8bd5\uff0c\u5982\u679c\u4e94\u5206\u949f\u540e\u4f9d\u7136\u65e0\u8fdb\u5ea6\uff0c\u8bf7\u91cd\u65b0\u70b9\u51fb\u5347\u7ea7\uff01";
            }
            if (count < 13) {
                return "\u6b63\u5728\u5347\u7ea7\u4e2d\uff01\uff01";
            }
            return "\u5df2\u5347\u7ea7\u5b8c\u6210\uff01";
        }
        return "\u672a\u67e5\u8be2\u5230\u5347\u7ea7\u8bb0\u5f55\uff0c\u8bf7\u8054\u7cfb\u5f00\u53d1\u4eba\u5458\uff01";
    }

    @Override
    public void buildImageThumb(List<Long> tenantIdList) {
        Map<Long, String> tenantIdMapping = this.getTenantIdMapping(tenantIdList);
        for (Long tenantId : tenantIdList) {
            RobotExecutors.runAs((String)tenantIdMapping.get(Long.parseLong(tenantId.toString())), () -> {
                QuerySchema queryProductAlbumDetailSchemaSchema = QuerySchema.create().addSelect("id,folder").addCondition((ConditionExpression)QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"tenant").eq((Object)tenantId)}));
                try {
                    List queryProductAlbumDetailList = MetaDaoHelper.queryNoPartition((String)"pc.product.ProductAlbum", (QuerySchema)queryProductAlbumDetailSchemaSchema, null);
                    for (Map productAlbumMap : queryProductAlbumDetailList) {
                        Object folder = productAlbumMap.get("folder");
                        if (folder == null) continue;
                        String fileName = folder.toString().substring(folder.toString().lastIndexOf("/"));
                        this.cooperationFileImageService.buildImageThumb(fileName, fileName, FileType.IMAGE);
                    }
                }
                catch (Exception e) {
                    log.error("\u751f\u6210\u7f29\u7565\u56fe\u5f02\u5e38" + e.getMessage(), (Throwable)e);
                }
            }, (ExecutorService)Executors.newFixedThreadPool(1));
        }
    }
}


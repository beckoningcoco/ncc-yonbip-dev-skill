/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.yonyou.iuap.apdoc.coredoc.enums.CoreDocBusinessErrorEnum
 *  com.yonyou.iuap.apdoc.coredoc.exceptions.CoreDocBusinessException
 *  com.yonyou.iuap.fileservice.sdk.module.CooperationFileService
 *  com.yonyou.iuap.fileservice.sdk.module.pojo.DeleteResult
 *  com.yonyou.iuap.fileservice.sdk.module.pojo.response.PageResponse
 *  com.yonyou.iuap.ucf.common.i18n.InternationalUtils
 *  com.yonyou.ucf.mdd.ext.core.AppContext
 *  com.yonyou.ucf.mdd.ext.dao.meta.MetaDaoHelper
 *  com.yonyou.upc.tools.CoreDocJsonResultForOpenApi
 *  com.yonyoucloud.iuap.upc.dto.attachment.AttachmentInfoForSyncDTO
 *  com.yonyoucloud.iuap.upc.dto.ext.UPCPager
 *  com.yonyoucloud.iuap.upc.vo.attachment.AttachmentInfoSyncQueryVO
 *  com.yonyoucloud.iuap.upc.vo.attachment.AttachmentInfoSyncSyncVO
 *  com.yonyoucloud.upc.aa.merchant.Merchant
 *  com.yonyoucloud.upc.pc.brand.Brand
 *  com.yonyoucloud.upc.pc.cls.PresentationClass
 *  com.yonyoucloud.upc.pc.product.Product
 *  com.yonyoucloud.upc.pc.tag.Tag
 *  com.yonyoucloud.upc.utils.AttachmentBusinessTypeEnum
 *  com.yonyoucloud.upc.utils.vo.AttachmentInfoSyncIntegrationVO
 *  org.imeta.orm.base.EntityStatus
 *  org.imeta.orm.schema.ConditionExpression
 *  org.imeta.orm.schema.QueryCondition
 *  org.imeta.orm.schema.QueryConditionGroup
 *  org.imeta.orm.schema.QuerySchema
 *  org.slf4j.Logger
 *  org.slf4j.LoggerFactory
 *  org.springframework.beans.BeanUtils
 *  org.springframework.beans.factory.annotation.Autowired
 *  org.springframework.stereotype.Service
 *  org.springframework.util.CollectionUtils
 */
package com.yonyoucloud.upc.service.attachment.impl;

import com.yonyou.iuap.apdoc.coredoc.enums.CoreDocBusinessErrorEnum;
import com.yonyou.iuap.apdoc.coredoc.exceptions.CoreDocBusinessException;
import com.yonyou.iuap.fileservice.sdk.module.CooperationFileService;
import com.yonyou.iuap.fileservice.sdk.module.pojo.DeleteResult;
import com.yonyou.iuap.fileservice.sdk.module.pojo.response.PageResponse;
import com.yonyou.iuap.ucf.common.i18n.InternationalUtils;
import com.yonyou.ucf.mdd.ext.core.AppContext;
import com.yonyou.ucf.mdd.ext.dao.meta.MetaDaoHelper;
import com.yonyou.upc.tools.CoreDocJsonResultForOpenApi;
import com.yonyoucloud.iuap.upc.dto.attachment.AttachmentInfoForSyncDTO;
import com.yonyoucloud.iuap.upc.dto.ext.UPCPager;
import com.yonyoucloud.iuap.upc.vo.attachment.AttachmentInfoSyncQueryVO;
import com.yonyoucloud.iuap.upc.vo.attachment.AttachmentInfoSyncSyncVO;
import com.yonyoucloud.upc.aa.merchant.Merchant;
import com.yonyoucloud.upc.pc.brand.Brand;
import com.yonyoucloud.upc.pc.cls.PresentationClass;
import com.yonyoucloud.upc.pc.product.Product;
import com.yonyoucloud.upc.pc.tag.Tag;
import com.yonyoucloud.upc.service.attachment.AttachmentSyncService;
import com.yonyoucloud.upc.utils.AttachmentBusinessTypeEnum;
import com.yonyoucloud.upc.utils.vo.AttachmentInfoSyncIntegrationVO;
import java.io.Serializable;
import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneOffset;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import org.imeta.orm.base.EntityStatus;
import org.imeta.orm.schema.ConditionExpression;
import org.imeta.orm.schema.QueryCondition;
import org.imeta.orm.schema.QueryConditionGroup;
import org.imeta.orm.schema.QuerySchema;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;

@Service
public class AttachmentSyncServiceImpl
implements AttachmentSyncService {
    private static final Logger log = LoggerFactory.getLogger(AttachmentSyncServiceImpl.class);
    @Autowired
    CooperationFileService cooperationFileService;
    final DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
    public static final String ATTACHMENT_BUSINESS_TYPE = "iuap-apdoc-material";

    @Override
    public CoreDocJsonResultForOpenApi<Object> batchUpdateAttachmentBusinessId(AttachmentInfoSyncQueryVO attachmentInfoSyncQueryVO) {
        if (attachmentInfoSyncQueryVO.getAttachmentBusinessType().equals((Object)AttachmentBusinessTypeEnum.PRODUCT_ALL_IMAGE) || attachmentInfoSyncQueryVO.getAttachmentBusinessType().equals((Object)AttachmentBusinessTypeEnum.PRODUCT_HOME_PAGE_IMAGE) || attachmentInfoSyncQueryVO.getAttachmentBusinessType().equals((Object)AttachmentBusinessTypeEnum.PRODUCT_VIDEO)) {
            return this.batchUpdateProductFileBusinessId(attachmentInfoSyncQueryVO.getAttachmentBusinessType(), attachmentInfoSyncQueryVO.getAttachmentInfoSyncSyncVOList());
        }
        if (attachmentInfoSyncQueryVO.getAttachmentBusinessType().equals((Object)AttachmentBusinessTypeEnum.MERCHANT_BUSINESS_LICENSE)) {
            return this.batchUpdateMerchantBusinessLicenseBusinessId(attachmentInfoSyncQueryVO.getAttachmentInfoSyncSyncVOList());
        }
        if (attachmentInfoSyncQueryVO.getAttachmentBusinessType().equals((Object)AttachmentBusinessTypeEnum.MERCHANT_LOGO_IMAGE)) {
            return this.batchUpdateMerchantLogoImageBusinessId(attachmentInfoSyncQueryVO.getAttachmentInfoSyncSyncVOList());
        }
        if (attachmentInfoSyncQueryVO.getAttachmentBusinessType().equals((Object)AttachmentBusinessTypeEnum.MERCHANT_CERTIFICATE)) {
            return this.batchUpdateMerchantCertificateBusinessId(attachmentInfoSyncQueryVO.getAttachmentInfoSyncSyncVOList());
        }
        if (attachmentInfoSyncQueryVO.getAttachmentBusinessType().equals((Object)AttachmentBusinessTypeEnum.MERCHANT_ORG_CERTIFICATE)) {
            return this.batchUpdateMerchantOrgCertificateBusinessId(attachmentInfoSyncQueryVO.getAttachmentInfoSyncSyncVOList());
        }
        if (attachmentInfoSyncQueryVO.getAttachmentBusinessType().equals((Object)AttachmentBusinessTypeEnum.MERCHANT_LEGAL_PERSON_CERTIFICATE_FRONT)) {
            return this.batchUpdateMerchantLegalPersonCertificateFrontBusinessId(attachmentInfoSyncQueryVO.getAttachmentInfoSyncSyncVOList());
        }
        if (attachmentInfoSyncQueryVO.getAttachmentBusinessType().equals((Object)AttachmentBusinessTypeEnum.MERCHANT_LEGAL_PERSON_CERTIFICATE_BACK)) {
            return this.batchUpdateMerchantLegalPersonCertificateBackBusinessId(attachmentInfoSyncQueryVO.getAttachmentInfoSyncSyncVOList());
        }
        if (attachmentInfoSyncQueryVO.getAttachmentBusinessType().equals((Object)AttachmentBusinessTypeEnum.BRAND_LOGO_IMAGE)) {
            return this.batchUpdateBrandLogoImageBusinessId(attachmentInfoSyncQueryVO.getAttachmentInfoSyncSyncVOList());
        }
        if (attachmentInfoSyncQueryVO.getAttachmentBusinessType().equals((Object)AttachmentBusinessTypeEnum.BRAND_AD_IMAGE)) {
            return this.batchUpdateBrandAdImageBusinessId(attachmentInfoSyncQueryVO.getAttachmentInfoSyncSyncVOList());
        }
        if (attachmentInfoSyncQueryVO.getAttachmentBusinessType().equals((Object)AttachmentBusinessTypeEnum.PRESENTATION_CLASS_AD_IMAGE)) {
            return this.batchUpdatePresentationClassAdImageBusinessId(attachmentInfoSyncQueryVO.getAttachmentInfoSyncSyncVOList());
        }
        if (attachmentInfoSyncQueryVO.getAttachmentBusinessType().equals((Object)AttachmentBusinessTypeEnum.PRESENTATION_CLASS_IMAGE)) {
            return this.batchUpdatePresentationClassImageBusinessId(attachmentInfoSyncQueryVO.getAttachmentInfoSyncSyncVOList());
        }
        if (attachmentInfoSyncQueryVO.getAttachmentBusinessType().equals((Object)AttachmentBusinessTypeEnum.TAG_IMAGE)) {
            return this.batchUpdateTagImageBusinessId(attachmentInfoSyncQueryVO.getAttachmentInfoSyncSyncVOList());
        }
        return CoreDocJsonResultForOpenApi.error((Long)-1L, (String)InternationalUtils.getMessageWithDefault((String)"UID:P_COREDOC-BE_1940AD0804F00075", (String)"\u6682\u4e0d\u652f\u6301\u8be5\u9644\u4ef6\u7c7b\u578b"));
    }

    @Override
    public CoreDocJsonResultForOpenApi<Object> batchUpdateAttachmentBusinessIdIntegration(List<AttachmentInfoSyncIntegrationVO> attachmentInfoSyncIntegrationVOS) {
        AttachmentInfoSyncQueryVO attachmentInfoSyncQueryVO = new AttachmentInfoSyncQueryVO();
        ArrayList<AttachmentInfoSyncSyncVO> attachmentInfoSyncSyncVOList = new ArrayList<AttachmentInfoSyncSyncVO>();
        attachmentInfoSyncQueryVO.setAttachmentInfoSyncSyncVOList(attachmentInfoSyncSyncVOList);
        for (AttachmentInfoSyncIntegrationVO attachmentInfoSyncIntegrationVO : attachmentInfoSyncIntegrationVOS) {
            AttachmentInfoSyncSyncVO attachmentInfoSyncSyncVO = new AttachmentInfoSyncSyncVO();
            attachmentInfoSyncSyncVO.setAttachmentBusinessId(attachmentInfoSyncIntegrationVO.getAttachmentBusinessId());
            attachmentInfoSyncSyncVO.setArchiveId(attachmentInfoSyncIntegrationVO.getArchiveId());
            attachmentInfoSyncSyncVO.setAttachmentFileId(attachmentInfoSyncIntegrationVO.getAttachmentFileId());
            attachmentInfoSyncSyncVOList.add(attachmentInfoSyncSyncVO);
        }
        attachmentInfoSyncQueryVO.setAttachmentBusinessType(attachmentInfoSyncIntegrationVOS.get(0).getAttachmentBusinessType());
        return this.batchUpdateAttachmentBusinessId(attachmentInfoSyncQueryVO);
    }

    @Override
    public CoreDocJsonResultForOpenApi<Object> batchDeleteAttachmentBusinessId(AttachmentInfoSyncQueryVO attachmentInfoSyncQueryVO) {
        if (attachmentInfoSyncQueryVO.getAttachmentBusinessType().equals((Object)AttachmentBusinessTypeEnum.PRODUCT_ALL_IMAGE) || attachmentInfoSyncQueryVO.getAttachmentBusinessType().equals((Object)AttachmentBusinessTypeEnum.PRODUCT_HOME_PAGE_IMAGE) || attachmentInfoSyncQueryVO.getAttachmentBusinessType().equals((Object)AttachmentBusinessTypeEnum.PRODUCT_VIDEO)) {
            return this.batchDeleteProductFileBusinessId(attachmentInfoSyncQueryVO.getAttachmentBusinessType(), attachmentInfoSyncQueryVO.getAttachmentInfoSyncSyncVOList());
        }
        if (attachmentInfoSyncQueryVO.getAttachmentBusinessType().equals((Object)AttachmentBusinessTypeEnum.MERCHANT_BUSINESS_LICENSE)) {
            return this.batchDeleteMerchantBusinessLicenseBusinessId(attachmentInfoSyncQueryVO.getAttachmentInfoSyncSyncVOList());
        }
        if (attachmentInfoSyncQueryVO.getAttachmentBusinessType().equals((Object)AttachmentBusinessTypeEnum.MERCHANT_LOGO_IMAGE)) {
            return this.batchDeleteMerchantLogoImageBusinessId(attachmentInfoSyncQueryVO.getAttachmentInfoSyncSyncVOList());
        }
        if (attachmentInfoSyncQueryVO.getAttachmentBusinessType().equals((Object)AttachmentBusinessTypeEnum.MERCHANT_CERTIFICATE)) {
            return this.batchDeleteMerchantCertificateBusinessId(attachmentInfoSyncQueryVO.getAttachmentInfoSyncSyncVOList());
        }
        if (attachmentInfoSyncQueryVO.getAttachmentBusinessType().equals((Object)AttachmentBusinessTypeEnum.MERCHANT_ORG_CERTIFICATE)) {
            return this.batchDeleteMerchantOrgCertificateBusinessId(attachmentInfoSyncQueryVO.getAttachmentInfoSyncSyncVOList());
        }
        if (attachmentInfoSyncQueryVO.getAttachmentBusinessType().equals((Object)AttachmentBusinessTypeEnum.MERCHANT_LEGAL_PERSON_CERTIFICATE_FRONT)) {
            return this.batchDeleteMerchantLegalPersonCertificateFrontBusinessId(attachmentInfoSyncQueryVO.getAttachmentInfoSyncSyncVOList());
        }
        if (attachmentInfoSyncQueryVO.getAttachmentBusinessType().equals((Object)AttachmentBusinessTypeEnum.MERCHANT_LEGAL_PERSON_CERTIFICATE_BACK)) {
            return this.batchDeleteMerchantLegalPersonCertificateBackBusinessId(attachmentInfoSyncQueryVO.getAttachmentInfoSyncSyncVOList());
        }
        if (attachmentInfoSyncQueryVO.getAttachmentBusinessType().equals((Object)AttachmentBusinessTypeEnum.BRAND_LOGO_IMAGE)) {
            return this.batchDeleteBrandLogoImageBusinessId(attachmentInfoSyncQueryVO.getAttachmentInfoSyncSyncVOList());
        }
        if (attachmentInfoSyncQueryVO.getAttachmentBusinessType().equals((Object)AttachmentBusinessTypeEnum.BRAND_AD_IMAGE)) {
            return this.batchDeleteBrandAdImageBusinessId(attachmentInfoSyncQueryVO.getAttachmentInfoSyncSyncVOList());
        }
        if (attachmentInfoSyncQueryVO.getAttachmentBusinessType().equals((Object)AttachmentBusinessTypeEnum.PRESENTATION_CLASS_AD_IMAGE)) {
            return this.batchDeletePresentationClassAdImageBusinessId(attachmentInfoSyncQueryVO.getAttachmentInfoSyncSyncVOList());
        }
        if (attachmentInfoSyncQueryVO.getAttachmentBusinessType().equals((Object)AttachmentBusinessTypeEnum.PRESENTATION_CLASS_IMAGE)) {
            return this.batchDeletePresentationClassImageBusinessId(attachmentInfoSyncQueryVO.getAttachmentInfoSyncSyncVOList());
        }
        if (attachmentInfoSyncQueryVO.getAttachmentBusinessType().equals((Object)AttachmentBusinessTypeEnum.TAG_IMAGE)) {
            return this.batchDeleteTagImageBusinessId(attachmentInfoSyncQueryVO.getAttachmentInfoSyncSyncVOList());
        }
        if (attachmentInfoSyncQueryVO.getAttachmentBusinessType().equals((Object)AttachmentBusinessTypeEnum.PRODUCT_ATTACHMENT)) {
            return this.batchDeleteProductOrMerchantAttachment(attachmentInfoSyncQueryVO.getAttachmentInfoSyncSyncVOList());
        }
        if (attachmentInfoSyncQueryVO.getAttachmentBusinessType().equals((Object)AttachmentBusinessTypeEnum.MERCHANT_ATTACHMENT)) {
            return this.batchDeleteProductOrMerchantAttachment(attachmentInfoSyncQueryVO.getAttachmentInfoSyncSyncVOList());
        }
        return CoreDocJsonResultForOpenApi.error((Long)-1L, (String)InternationalUtils.getMessageWithDefault((String)"UID:P_COREDOC-BE_1940AD0804F00075", (String)"\u6682\u4e0d\u652f\u6301\u8be5\u9644\u4ef6\u7c7b\u578b"));
    }

    public CoreDocJsonResultForOpenApi<Object> batchUpdateProductFileBusinessId(AttachmentBusinessTypeEnum attachmentBusinessTypeEnum, List<AttachmentInfoSyncSyncVO> attachmentInfoSyncSyncVOList) {
        ArrayList productList = new ArrayList();
        HashMap<String, Serializable> data = new HashMap<String, Serializable>();
        ArrayList infos = new ArrayList();
        try {
            attachmentInfoSyncSyncVOList.forEach(a -> {
                Product product = new Product();
                product.setId((Object)Long.parseLong(a.getArchiveId()));
                if (attachmentBusinessTypeEnum == AttachmentBusinessTypeEnum.PRODUCT_HOME_PAGE_IMAGE) {
                    product.setHomepageBusinessId(a.getAttachmentBusinessId());
                } else if (attachmentBusinessTypeEnum == AttachmentBusinessTypeEnum.PRODUCT_ALL_IMAGE) {
                    product.setImgBusinessId(a.getAttachmentBusinessId());
                } else if (attachmentBusinessTypeEnum == AttachmentBusinessTypeEnum.PRODUCT_VIDEO) {
                    product.setVideoBusinessId(a.getAttachmentBusinessId());
                }
                product.setEntityStatus(EntityStatus.Update);
                productList.add(product);
                HashMap info = new HashMap();
                infos.add(info);
                HashMap<String, String> infoData = new HashMap<String, String>();
                info.put("data", infoData);
                infoData.put("sourceUnique", a.getAttachmentBusinessId());
                infoData.put("targetUnique", a.getArchiveId());
            });
            MetaDaoHelper.update((String)"pc.product.Product", productList);
        }
        catch (Exception e) {
            log.error("\u6279\u91cf\u66f4\u65b0" + attachmentBusinessTypeEnum.getBusinessTypeName() + "\u4e1a\u52a1ID\u5f02\u5e38\uff1a" + e.getMessage(), (Throwable)e);
            return CoreDocJsonResultForOpenApi.error((CoreDocBusinessException)new CoreDocBusinessException(CoreDocBusinessErrorEnum.SYSTEM_ERROR));
        }
        data.put("count", Integer.valueOf(attachmentInfoSyncSyncVOList.size()));
        data.put("successCount", Integer.valueOf(attachmentInfoSyncSyncVOList.size()));
        data.put("failCount", Integer.valueOf(0));
        data.put("infos", infos);
        return CoreDocJsonResultForOpenApi.success(data);
    }

    public CoreDocJsonResultForOpenApi<Object> batchUpdateMerchantBusinessLicenseBusinessId(List<AttachmentInfoSyncSyncVO> attachmentInfoSyncSyncVOList) {
        ArrayList merchantList = new ArrayList();
        try {
            attachmentInfoSyncSyncVOList.forEach(a -> {
                Merchant merchant = new Merchant();
                merchant.setId((Object)Long.parseLong(a.getArchiveId()));
                merchant.setBusinessLicenseNew(a.getAttachmentBusinessId());
                merchant.setEntityStatus(EntityStatus.Update);
                merchantList.add(merchant);
            });
            MetaDaoHelper.update((String)"aa.merchant.Merchant", merchantList);
        }
        catch (Exception e) {
            log.error("\u6279\u91cf\u66f4\u65b0\u5ba2\u6237\u8425\u4e1a\u6267\u7167\u4e1a\u52a1ID\u5f02\u5e38\uff1a" + e.getMessage(), (Throwable)e);
            return CoreDocJsonResultForOpenApi.error((CoreDocBusinessException)new CoreDocBusinessException(CoreDocBusinessErrorEnum.SYSTEM_ERROR));
        }
        return CoreDocJsonResultForOpenApi.success(null);
    }

    public CoreDocJsonResultForOpenApi<Object> batchUpdateMerchantLogoImageBusinessId(List<AttachmentInfoSyncSyncVO> attachmentInfoSyncSyncVOList) {
        ArrayList merchantList = new ArrayList();
        try {
            attachmentInfoSyncSyncVOList.forEach(a -> {
                Merchant merchant = new Merchant();
                merchant.setId((Object)Long.parseLong(a.getArchiveId()));
                merchant.setMerchantLogo(a.getAttachmentBusinessId());
                merchant.setEntityStatus(EntityStatus.Update);
                merchantList.add(merchant);
            });
            MetaDaoHelper.update((String)"aa.merchant.Merchant", merchantList);
        }
        catch (Exception e) {
            log.error("\u6279\u91cf\u66f4\u65b0\u5ba2\u6237LOGO\u4e1a\u52a1ID\u5f02\u5e38\uff1a" + e.getMessage(), (Throwable)e);
            return CoreDocJsonResultForOpenApi.error((CoreDocBusinessException)new CoreDocBusinessException(CoreDocBusinessErrorEnum.SYSTEM_ERROR));
        }
        return CoreDocJsonResultForOpenApi.success(null);
    }

    public CoreDocJsonResultForOpenApi<Object> batchUpdateMerchantCertificateBusinessId(List<AttachmentInfoSyncSyncVO> attachmentInfoSyncSyncVOList) {
        ArrayList merchantList = new ArrayList();
        try {
            attachmentInfoSyncSyncVOList.forEach(a -> {
                Merchant merchant = new Merchant();
                merchant.setId((Object)Long.parseLong(a.getArchiveId()));
                merchant.setCertificate(a.getAttachmentBusinessId());
                merchant.setEntityStatus(EntityStatus.Update);
                merchantList.add(merchant);
            });
            MetaDaoHelper.update((String)"aa.merchant.Merchant", merchantList);
        }
        catch (Exception e) {
            log.error("\u6279\u91cf\u66f4\u65b0\u5ba2\u6237\u8bc1\u7167\u8bc1\u4e66\u4e1a\u52a1ID\u5f02\u5e38\uff1a" + e.getMessage(), (Throwable)e);
            return CoreDocJsonResultForOpenApi.error((CoreDocBusinessException)new CoreDocBusinessException(CoreDocBusinessErrorEnum.SYSTEM_ERROR));
        }
        return CoreDocJsonResultForOpenApi.success(null);
    }

    public CoreDocJsonResultForOpenApi<Object> batchUpdateMerchantOrgCertificateBusinessId(List<AttachmentInfoSyncSyncVO> attachmentInfoSyncSyncVOList) {
        ArrayList merchantList = new ArrayList();
        try {
            attachmentInfoSyncSyncVOList.forEach(a -> {
                Merchant merchant = new Merchant();
                merchant.setId((Object)Long.parseLong(a.getArchiveId()));
                merchant.setOrgCertificate(a.getAttachmentBusinessId());
                merchant.setEntityStatus(EntityStatus.Update);
                merchantList.add(merchant);
            });
            MetaDaoHelper.update((String)"aa.merchant.Merchant", merchantList);
        }
        catch (Exception e) {
            log.error("\u6279\u91cf\u66f4\u65b0\u5ba2\u6237\u7ec4\u7ec7\u8bc1\u4ef6\u4e1a\u52a1ID\u5f02\u5e38\uff1a" + e.getMessage(), (Throwable)e);
            return CoreDocJsonResultForOpenApi.error((CoreDocBusinessException)new CoreDocBusinessException(CoreDocBusinessErrorEnum.SYSTEM_ERROR));
        }
        return CoreDocJsonResultForOpenApi.success(null);
    }

    public CoreDocJsonResultForOpenApi<Object> batchUpdateMerchantLegalPersonCertificateFrontBusinessId(List<AttachmentInfoSyncSyncVO> attachmentInfoSyncSyncVOList) {
        ArrayList merchantList = new ArrayList();
        try {
            attachmentInfoSyncSyncVOList.forEach(a -> {
                Merchant merchant = new Merchant();
                merchant.setId((Object)Long.parseLong(a.getArchiveId()));
                merchant.setFrontIdCard(a.getAttachmentBusinessId());
                merchant.setEntityStatus(EntityStatus.Update);
                merchantList.add(merchant);
            });
            MetaDaoHelper.update((String)"aa.merchant.Merchant", merchantList);
        }
        catch (Exception e) {
            log.error("\u6279\u91cf\u66f4\u65b0\u5ba2\u6237\u8eab\u4efd\u8bc1\u6b63\u9762\u4e1a\u52a1ID\u5f02\u5e38\uff1a" + e.getMessage(), (Throwable)e);
            return CoreDocJsonResultForOpenApi.error((CoreDocBusinessException)new CoreDocBusinessException(CoreDocBusinessErrorEnum.SYSTEM_ERROR));
        }
        return CoreDocJsonResultForOpenApi.success(null);
    }

    public CoreDocJsonResultForOpenApi<Object> batchUpdateMerchantLegalPersonCertificateBackBusinessId(List<AttachmentInfoSyncSyncVO> attachmentInfoSyncSyncVOList) {
        ArrayList merchantList = new ArrayList();
        try {
            attachmentInfoSyncSyncVOList.forEach(a -> {
                Merchant merchant = new Merchant();
                merchant.setId((Object)Long.parseLong(a.getArchiveId()));
                merchant.setBackIdCard(a.getAttachmentBusinessId());
                merchant.setEntityStatus(EntityStatus.Update);
                merchantList.add(merchant);
            });
            MetaDaoHelper.update((String)"aa.merchant.Merchant", merchantList);
        }
        catch (Exception e) {
            log.error("\u6279\u91cf\u66f4\u65b0\u5ba2\u6237\u8eab\u4efd\u8bc1\u53cd\u9762\u4e1a\u52a1ID\u5f02\u5e38\uff1a" + e.getMessage(), (Throwable)e);
            return CoreDocJsonResultForOpenApi.error((CoreDocBusinessException)new CoreDocBusinessException(CoreDocBusinessErrorEnum.SYSTEM_ERROR));
        }
        return CoreDocJsonResultForOpenApi.success(null);
    }

    public CoreDocJsonResultForOpenApi<Object> batchUpdateBrandLogoImageBusinessId(List<AttachmentInfoSyncSyncVO> attachmentInfoSyncSyncVOList) {
        ArrayList brandList = new ArrayList();
        try {
            attachmentInfoSyncSyncVOList.forEach(a -> {
                Brand brand = new Brand();
                brand.setId((Object)Long.parseLong(a.getArchiveId()));
                brand.setBrandLogoBusinessId(a.getAttachmentBusinessId());
                brand.setEntityStatus(EntityStatus.Update);
                brandList.add(brand);
            });
            MetaDaoHelper.update((String)"pc.brand.Brand", brandList);
        }
        catch (Exception e) {
            log.error("\u6279\u91cf\u66f4\u65b0\u54c1\u724cLOGO\u4e1a\u52a1ID\u5f02\u5e38\uff1a" + e.getMessage(), (Throwable)e);
            return CoreDocJsonResultForOpenApi.error((CoreDocBusinessException)new CoreDocBusinessException(CoreDocBusinessErrorEnum.SYSTEM_ERROR));
        }
        return CoreDocJsonResultForOpenApi.success(null);
    }

    public CoreDocJsonResultForOpenApi<Object> batchUpdateBrandAdImageBusinessId(List<AttachmentInfoSyncSyncVO> attachmentInfoSyncSyncVOList) {
        ArrayList brandList = new ArrayList();
        try {
            attachmentInfoSyncSyncVOList.forEach(a -> {
                Brand brand = new Brand();
                brand.setId((Object)Long.parseLong(a.getArchiveId()));
                brand.setAdImageBusinessId(a.getAttachmentBusinessId());
                brand.setEntityStatus(EntityStatus.Update);
                brandList.add(brand);
            });
            MetaDaoHelper.update((String)"pc.brand.Brand", brandList);
        }
        catch (Exception e) {
            log.error("\u6279\u91cf\u66f4\u65b0\u54c1\u724c\u5e7f\u544a\u56fe\u7247\u4e1a\u52a1ID\u5f02\u5e38\uff1a" + e.getMessage(), (Throwable)e);
            return CoreDocJsonResultForOpenApi.error((CoreDocBusinessException)new CoreDocBusinessException(CoreDocBusinessErrorEnum.SYSTEM_ERROR));
        }
        return CoreDocJsonResultForOpenApi.success(null);
    }

    public CoreDocJsonResultForOpenApi<Object> batchUpdatePresentationClassAdImageBusinessId(List<AttachmentInfoSyncSyncVO> attachmentInfoSyncSyncVOList) {
        ArrayList presentationClassList = new ArrayList();
        try {
            attachmentInfoSyncSyncVOList.forEach(a -> {
                PresentationClass presentationClass = new PresentationClass();
                presentationClass.setId((Object)Long.parseLong(a.getArchiveId()));
                presentationClass.setAdImageBusinessId(a.getAttachmentBusinessId());
                presentationClass.setEntityStatus(EntityStatus.Update);
                presentationClassList.add(presentationClass);
            });
            MetaDaoHelper.update((String)"pc.cls.PresentationClass", presentationClassList);
        }
        catch (Exception e) {
            log.error("\u6279\u91cf\u66f4\u65b0\u5546\u54c1\u5206\u7c7b\u5e7f\u544a\u56fe\u7247\u4e1a\u52a1ID\u5f02\u5e38\uff1a" + e.getMessage(), (Throwable)e);
            return CoreDocJsonResultForOpenApi.error((CoreDocBusinessException)new CoreDocBusinessException(CoreDocBusinessErrorEnum.SYSTEM_ERROR));
        }
        return CoreDocJsonResultForOpenApi.success(null);
    }

    public CoreDocJsonResultForOpenApi<Object> batchUpdatePresentationClassImageBusinessId(List<AttachmentInfoSyncSyncVO> attachmentInfoSyncSyncVOList) {
        ArrayList presentationClassList = new ArrayList();
        try {
            attachmentInfoSyncSyncVOList.forEach(a -> {
                PresentationClass presentationClass = new PresentationClass();
                presentationClass.setId((Object)Long.parseLong(a.getArchiveId()));
                presentationClass.setImageBusinessId(a.getAttachmentBusinessId());
                presentationClass.setEntityStatus(EntityStatus.Update);
                presentationClassList.add(presentationClass);
            });
            MetaDaoHelper.update((String)"pc.cls.PresentationClass", presentationClassList);
        }
        catch (Exception e) {
            log.error("\u6279\u91cf\u66f4\u65b0\u5546\u54c1\u5206\u7c7b\u56fe\u7247\u4e1a\u52a1ID\u5f02\u5e38\uff1a" + e.getMessage(), (Throwable)e);
            return CoreDocJsonResultForOpenApi.error((CoreDocBusinessException)new CoreDocBusinessException(CoreDocBusinessErrorEnum.SYSTEM_ERROR));
        }
        return CoreDocJsonResultForOpenApi.success(null);
    }

    public CoreDocJsonResultForOpenApi<Object> batchUpdateTagImageBusinessId(List<AttachmentInfoSyncSyncVO> attachmentInfoSyncSyncVOList) {
        ArrayList tagList = new ArrayList();
        try {
            attachmentInfoSyncSyncVOList.forEach(a -> {
                Tag tag = new Tag();
                tag.setId((Object)Long.parseLong(a.getArchiveId()));
                tag.setTagBusinessId(a.getAttachmentBusinessId());
                tag.setEntityStatus(EntityStatus.Update);
                tagList.add(tag);
            });
            MetaDaoHelper.update((String)"pc.tag.Tag", tagList);
        }
        catch (Exception e) {
            log.error("\u6279\u91cf\u66f4\u65b0\u6807\u7b7e\u56fe\u7247\u4e1a\u52a1ID\u5f02\u5e38\uff1a" + e.getMessage(), (Throwable)e);
            return CoreDocJsonResultForOpenApi.error((CoreDocBusinessException)new CoreDocBusinessException(CoreDocBusinessErrorEnum.SYSTEM_ERROR));
        }
        return CoreDocJsonResultForOpenApi.success(null);
    }

    public CoreDocJsonResultForOpenApi<Object> batchDeleteProductFileBusinessId(AttachmentBusinessTypeEnum attachmentBusinessTypeEnum, List<AttachmentInfoSyncSyncVO> attachmentInfoSyncSyncVOList) {
        HashMap<String, Serializable> data = new HashMap<String, Serializable>();
        ArrayList infos = new ArrayList();
        try {
            Map<String, List<AttachmentInfoSyncSyncVO>> productFileListMap = attachmentInfoSyncSyncVOList.stream().collect(Collectors.groupingBy(AttachmentInfoSyncSyncVO::getArchiveId));
            ArrayList productForUpdateList = new ArrayList();
            productFileListMap.keySet().forEach(a -> {
                ArrayList fileIdList = new ArrayList();
                ((List)productFileListMap.get(a)).forEach(b -> {
                    fileIdList.add(b.getAttachmentFileId());
                    HashMap info = new HashMap();
                    infos.add(info);
                    HashMap<String, String> infoData = new HashMap<String, String>();
                    info.put("data", infoData);
                    infoData.put("sourceUnique", b.getAttachmentBusinessId());
                    infoData.put("targetUnique", b.getArchiveId());
                });
                DeleteResult deleteResult = this.cooperationFileService.deleteBusinessFiles(ATTACHMENT_BUSINESS_TYPE, ((AttachmentInfoSyncSyncVO)((List)productFileListMap.get(a)).get(0)).getAttachmentBusinessId(), fileIdList);
                if (deleteResult.getLeftCount() <= 0L) {
                    Product product = new Product();
                    product.setId((Object)Long.parseLong(a));
                    if (attachmentBusinessTypeEnum == AttachmentBusinessTypeEnum.PRODUCT_HOME_PAGE_IMAGE) {
                        product.setHomepageBusinessId(null);
                    } else if (attachmentBusinessTypeEnum == AttachmentBusinessTypeEnum.PRODUCT_ALL_IMAGE) {
                        product.setImgBusinessId(null);
                    } else if (attachmentBusinessTypeEnum == AttachmentBusinessTypeEnum.PRODUCT_VIDEO) {
                        product.setVideoBusinessId(null);
                    }
                    product.setEntityStatus(EntityStatus.Update);
                    productForUpdateList.add(product);
                }
            });
            if (!CollectionUtils.isEmpty(productForUpdateList)) {
                MetaDaoHelper.update((String)"pc.product.Product", productForUpdateList);
            }
            data.put("count", Integer.valueOf(attachmentInfoSyncSyncVOList.size()));
            data.put("successCount", Integer.valueOf(attachmentInfoSyncSyncVOList.size()));
            data.put("failCount", Integer.valueOf(0));
            data.put("infos", infos);
        }
        catch (Exception e) {
            log.error("\u6279\u91cf\u5220\u9664" + attachmentBusinessTypeEnum.getBusinessTypeName() + "\u5f02\u5e38\uff1a" + e.getMessage(), (Throwable)e);
            return CoreDocJsonResultForOpenApi.error((CoreDocBusinessException)new CoreDocBusinessException(CoreDocBusinessErrorEnum.SYSTEM_ERROR));
        }
        return CoreDocJsonResultForOpenApi.success(data);
    }

    public CoreDocJsonResultForOpenApi<Object> batchDeleteMerchantBusinessLicenseBusinessId(List<AttachmentInfoSyncSyncVO> attachmentInfoSyncSyncVOList) {
        try {
            Map<String, List<AttachmentInfoSyncSyncVO>> merchantBusinessLicenseListMap = attachmentInfoSyncSyncVOList.stream().collect(Collectors.groupingBy(AttachmentInfoSyncSyncVO::getArchiveId));
            ArrayList merchantForUpdateList = new ArrayList();
            merchantBusinessLicenseListMap.keySet().forEach(a -> {
                ArrayList fileIdList = new ArrayList();
                ((List)merchantBusinessLicenseListMap.get(a)).forEach(b -> fileIdList.add(b.getAttachmentFileId()));
                DeleteResult deleteResult = this.cooperationFileService.deleteBusinessFiles(ATTACHMENT_BUSINESS_TYPE, ((AttachmentInfoSyncSyncVO)((List)merchantBusinessLicenseListMap.get(a)).get(0)).getAttachmentBusinessId(), fileIdList);
                if (deleteResult.getLeftCount() <= 0L) {
                    Merchant merchant = new Merchant();
                    merchant.setId((Object)Long.parseLong(a));
                    merchant.setBusinessLicenseNew(null);
                    merchant.setEntityStatus(EntityStatus.Update);
                    merchantForUpdateList.add(merchant);
                }
            });
            if (!CollectionUtils.isEmpty(merchantForUpdateList)) {
                MetaDaoHelper.update((String)"aa.merchant.Merchant", merchantForUpdateList);
            }
        }
        catch (Exception e) {
            log.error("\u6279\u91cf\u5220\u9664\u5ba2\u6237\u8425\u4e1a\u6267\u7167\u9644\u4ef6\u5f02\u5e38\uff1a" + e.getMessage(), (Throwable)e);
            return CoreDocJsonResultForOpenApi.error((CoreDocBusinessException)new CoreDocBusinessException(CoreDocBusinessErrorEnum.SYSTEM_ERROR));
        }
        return CoreDocJsonResultForOpenApi.success(null);
    }

    public CoreDocJsonResultForOpenApi<Object> batchDeleteMerchantLogoImageBusinessId(List<AttachmentInfoSyncSyncVO> attachmentInfoSyncSyncVOList) {
        try {
            Map<String, List<AttachmentInfoSyncSyncVO>> merchantLogoListMap = attachmentInfoSyncSyncVOList.stream().collect(Collectors.groupingBy(AttachmentInfoSyncSyncVO::getArchiveId));
            ArrayList merchantForUpdateList = new ArrayList();
            merchantLogoListMap.keySet().forEach(a -> {
                ArrayList fileIdList = new ArrayList();
                ((List)merchantLogoListMap.get(a)).forEach(b -> fileIdList.add(b.getAttachmentFileId()));
                DeleteResult deleteResult = this.cooperationFileService.deleteBusinessFiles(ATTACHMENT_BUSINESS_TYPE, ((AttachmentInfoSyncSyncVO)((List)merchantLogoListMap.get(a)).get(0)).getAttachmentBusinessId(), fileIdList);
                if (deleteResult.getLeftCount() <= 0L) {
                    Merchant merchant = new Merchant();
                    merchant.setId((Object)Long.parseLong(a));
                    merchant.setMerchantLogo(null);
                    merchant.setEntityStatus(EntityStatus.Update);
                    merchantForUpdateList.add(merchant);
                }
            });
            if (!CollectionUtils.isEmpty(merchantForUpdateList)) {
                MetaDaoHelper.update((String)"aa.merchant.Merchant", merchantForUpdateList);
            }
        }
        catch (Exception e) {
            log.error("\u6279\u91cf\u5220\u9664\u5ba2\u6237\u8425\u4e1a\u6267\u7167\u9644\u4ef6\u5f02\u5e38\uff1a" + e.getMessage(), (Throwable)e);
            return CoreDocJsonResultForOpenApi.error((CoreDocBusinessException)new CoreDocBusinessException(CoreDocBusinessErrorEnum.SYSTEM_ERROR));
        }
        return CoreDocJsonResultForOpenApi.success(null);
    }

    public CoreDocJsonResultForOpenApi<Object> batchDeleteMerchantCertificateBusinessId(List<AttachmentInfoSyncSyncVO> attachmentInfoSyncSyncVOList) {
        try {
            Map<String, List<AttachmentInfoSyncSyncVO>> merchantCertificateListMap = attachmentInfoSyncSyncVOList.stream().collect(Collectors.groupingBy(AttachmentInfoSyncSyncVO::getArchiveId));
            ArrayList merchantForUpdateList = new ArrayList();
            merchantCertificateListMap.keySet().forEach(a -> {
                ArrayList fileIdList = new ArrayList();
                ((List)merchantCertificateListMap.get(a)).forEach(b -> fileIdList.add(b.getAttachmentFileId()));
                DeleteResult deleteResult = this.cooperationFileService.deleteBusinessFiles(ATTACHMENT_BUSINESS_TYPE, ((AttachmentInfoSyncSyncVO)((List)merchantCertificateListMap.get(a)).get(0)).getAttachmentBusinessId(), fileIdList);
                if (deleteResult.getLeftCount() <= 0L) {
                    Merchant merchant = new Merchant();
                    merchant.setId((Object)Long.parseLong(a));
                    merchant.setCertificate(null);
                    merchant.setEntityStatus(EntityStatus.Update);
                    merchantForUpdateList.add(merchant);
                }
            });
            if (!CollectionUtils.isEmpty(merchantForUpdateList)) {
                MetaDaoHelper.update((String)"aa.merchant.Merchant", merchantForUpdateList);
            }
        }
        catch (Exception e) {
            log.error("\u6279\u91cf\u5220\u9664\u5ba2\u6237\u8bc1\u7167\u8bc1\u4e66\u9644\u4ef6\u5f02\u5e38\uff1a" + e.getMessage(), (Throwable)e);
            return CoreDocJsonResultForOpenApi.error((CoreDocBusinessException)new CoreDocBusinessException(CoreDocBusinessErrorEnum.SYSTEM_ERROR));
        }
        return CoreDocJsonResultForOpenApi.success(null);
    }

    public CoreDocJsonResultForOpenApi<Object> batchDeleteMerchantOrgCertificateBusinessId(List<AttachmentInfoSyncSyncVO> attachmentInfoSyncSyncVOList) {
        try {
            Map<String, List<AttachmentInfoSyncSyncVO>> merchantOrgCertificateListMap = attachmentInfoSyncSyncVOList.stream().collect(Collectors.groupingBy(AttachmentInfoSyncSyncVO::getArchiveId));
            ArrayList merchantForUpdateList = new ArrayList();
            merchantOrgCertificateListMap.keySet().forEach(a -> {
                ArrayList fileIdList = new ArrayList();
                ((List)merchantOrgCertificateListMap.get(a)).forEach(b -> fileIdList.add(b.getAttachmentFileId()));
                DeleteResult deleteResult = this.cooperationFileService.deleteBusinessFiles(ATTACHMENT_BUSINESS_TYPE, ((AttachmentInfoSyncSyncVO)((List)merchantOrgCertificateListMap.get(a)).get(0)).getAttachmentBusinessId(), fileIdList);
                if (deleteResult.getLeftCount() <= 0L) {
                    Merchant merchant = new Merchant();
                    merchant.setId((Object)Long.parseLong(a));
                    merchant.setOrgCertificate(null);
                    merchant.setEntityStatus(EntityStatus.Update);
                    merchantForUpdateList.add(merchant);
                }
            });
            if (!CollectionUtils.isEmpty(merchantForUpdateList)) {
                MetaDaoHelper.update((String)"aa.merchant.Merchant", merchantForUpdateList);
            }
        }
        catch (Exception e) {
            log.error("\u6279\u91cf\u5220\u9664\u5ba2\u6237\u7ec4\u7ec7\u8bc1\u4ef6\u9644\u4ef6\u5f02\u5e38\uff1a" + e.getMessage(), (Throwable)e);
            return CoreDocJsonResultForOpenApi.error((CoreDocBusinessException)new CoreDocBusinessException(CoreDocBusinessErrorEnum.SYSTEM_ERROR));
        }
        return CoreDocJsonResultForOpenApi.success(null);
    }

    public CoreDocJsonResultForOpenApi<Object> batchDeleteMerchantLegalPersonCertificateFrontBusinessId(List<AttachmentInfoSyncSyncVO> attachmentInfoSyncSyncVOList) {
        try {
            Map<String, List<AttachmentInfoSyncSyncVO>> merchantLegalPersonCertificateFrontListMap = attachmentInfoSyncSyncVOList.stream().collect(Collectors.groupingBy(AttachmentInfoSyncSyncVO::getArchiveId));
            ArrayList merchantForUpdateList = new ArrayList();
            merchantLegalPersonCertificateFrontListMap.keySet().forEach(a -> {
                ArrayList fileIdList = new ArrayList();
                ((List)merchantLegalPersonCertificateFrontListMap.get(a)).forEach(b -> fileIdList.add(b.getAttachmentFileId()));
                DeleteResult deleteResult = this.cooperationFileService.deleteBusinessFiles(ATTACHMENT_BUSINESS_TYPE, ((AttachmentInfoSyncSyncVO)((List)merchantLegalPersonCertificateFrontListMap.get(a)).get(0)).getAttachmentBusinessId(), fileIdList);
                if (deleteResult.getLeftCount() <= 0L) {
                    Merchant merchant = new Merchant();
                    merchant.setId((Object)Long.parseLong(a));
                    merchant.setFrontIdCard(null);
                    merchant.setEntityStatus(EntityStatus.Update);
                    merchantForUpdateList.add(merchant);
                }
            });
            if (!CollectionUtils.isEmpty(merchantForUpdateList)) {
                MetaDaoHelper.update((String)"aa.merchant.Merchant", merchantForUpdateList);
            }
        }
        catch (Exception e) {
            log.error("\u6279\u91cf\u5220\u9664\u5ba2\u6237\u8eab\u4efd\u8bc1\u6b63\u9762\u9644\u4ef6\u5f02\u5e38\uff1a" + e.getMessage(), (Throwable)e);
            return CoreDocJsonResultForOpenApi.error((CoreDocBusinessException)new CoreDocBusinessException(CoreDocBusinessErrorEnum.SYSTEM_ERROR));
        }
        return CoreDocJsonResultForOpenApi.success(null);
    }

    public CoreDocJsonResultForOpenApi<Object> batchDeleteMerchantLegalPersonCertificateBackBusinessId(List<AttachmentInfoSyncSyncVO> attachmentInfoSyncSyncVOList) {
        try {
            Map<String, List<AttachmentInfoSyncSyncVO>> merchantLegalPersonCertificateBackListMap = attachmentInfoSyncSyncVOList.stream().collect(Collectors.groupingBy(AttachmentInfoSyncSyncVO::getArchiveId));
            ArrayList merchantForUpdateList = new ArrayList();
            merchantLegalPersonCertificateBackListMap.keySet().forEach(a -> {
                ArrayList fileIdList = new ArrayList();
                ((List)merchantLegalPersonCertificateBackListMap.get(a)).forEach(b -> fileIdList.add(b.getAttachmentFileId()));
                DeleteResult deleteResult = this.cooperationFileService.deleteBusinessFiles(ATTACHMENT_BUSINESS_TYPE, ((AttachmentInfoSyncSyncVO)((List)merchantLegalPersonCertificateBackListMap.get(a)).get(0)).getAttachmentBusinessId(), fileIdList);
                if (deleteResult.getLeftCount() <= 0L) {
                    Merchant merchant = new Merchant();
                    merchant.setId((Object)Long.parseLong(a));
                    merchant.setBackIdNo(null);
                    merchant.setEntityStatus(EntityStatus.Update);
                    merchantForUpdateList.add(merchant);
                }
            });
            if (!CollectionUtils.isEmpty(merchantForUpdateList)) {
                MetaDaoHelper.update((String)"aa.merchant.Merchant", merchantForUpdateList);
            }
        }
        catch (Exception e) {
            log.error("\u6279\u91cf\u5220\u9664\u5ba2\u6237\u8eab\u4efd\u8bc1\u53cd\u9762\u9644\u4ef6\u5f02\u5e38\uff1a" + e.getMessage(), (Throwable)e);
            return CoreDocJsonResultForOpenApi.error((CoreDocBusinessException)new CoreDocBusinessException(CoreDocBusinessErrorEnum.SYSTEM_ERROR));
        }
        return CoreDocJsonResultForOpenApi.success(null);
    }

    public CoreDocJsonResultForOpenApi<Object> batchDeleteBrandLogoImageBusinessId(List<AttachmentInfoSyncSyncVO> attachmentInfoSyncSyncVOList) {
        try {
            Map<String, List<AttachmentInfoSyncSyncVO>> brandLogoImageListMap = attachmentInfoSyncSyncVOList.stream().collect(Collectors.groupingBy(AttachmentInfoSyncSyncVO::getArchiveId));
            ArrayList brandForUpdateList = new ArrayList();
            brandLogoImageListMap.keySet().forEach(a -> {
                ArrayList fileIdList = new ArrayList();
                ((List)brandLogoImageListMap.get(a)).forEach(b -> fileIdList.add(b.getAttachmentFileId()));
                DeleteResult deleteResult = this.cooperationFileService.deleteBusinessFiles(ATTACHMENT_BUSINESS_TYPE, ((AttachmentInfoSyncSyncVO)((List)brandLogoImageListMap.get(a)).get(0)).getAttachmentBusinessId(), fileIdList);
                if (deleteResult.getLeftCount() <= 0L) {
                    Brand brand = new Brand();
                    brand.setId((Object)Long.parseLong(a));
                    brand.setBrandLogoBusinessId(null);
                    brand.setEntityStatus(EntityStatus.Update);
                    brandForUpdateList.add(brand);
                }
            });
            if (!CollectionUtils.isEmpty(brandForUpdateList)) {
                MetaDaoHelper.update((String)"pc.brand.Brand", brandForUpdateList);
            }
        }
        catch (Exception e) {
            log.error("\u6279\u91cf\u5220\u9664\u54c1\u724cLOGO\u56fe\u7247\u5f02\u5e38\uff1a" + e.getMessage(), (Throwable)e);
            return CoreDocJsonResultForOpenApi.error((CoreDocBusinessException)new CoreDocBusinessException(CoreDocBusinessErrorEnum.SYSTEM_ERROR));
        }
        return CoreDocJsonResultForOpenApi.success(null);
    }

    public CoreDocJsonResultForOpenApi<Object> batchDeleteBrandAdImageBusinessId(List<AttachmentInfoSyncSyncVO> attachmentInfoSyncSyncVOList) {
        try {
            Map<String, List<AttachmentInfoSyncSyncVO>> brandAdImageListMap = attachmentInfoSyncSyncVOList.stream().collect(Collectors.groupingBy(AttachmentInfoSyncSyncVO::getArchiveId));
            ArrayList brandForUpdateList = new ArrayList();
            brandAdImageListMap.keySet().forEach(a -> {
                ArrayList fileIdList = new ArrayList();
                ((List)brandAdImageListMap.get(a)).forEach(b -> fileIdList.add(b.getAttachmentFileId()));
                DeleteResult deleteResult = this.cooperationFileService.deleteBusinessFiles(ATTACHMENT_BUSINESS_TYPE, ((AttachmentInfoSyncSyncVO)((List)brandAdImageListMap.get(a)).get(0)).getAttachmentBusinessId(), fileIdList);
                if (deleteResult.getLeftCount() <= 0L) {
                    Brand brand = new Brand();
                    brand.setId((Object)Long.parseLong(a));
                    brand.setAdImageBusinessId(null);
                    brand.setEntityStatus(EntityStatus.Update);
                    brandForUpdateList.add(brand);
                }
            });
            if (!CollectionUtils.isEmpty(brandForUpdateList)) {
                MetaDaoHelper.update((String)"pc.brand.Brand", brandForUpdateList);
            }
        }
        catch (Exception e) {
            log.error("\u6279\u91cf\u5220\u9664\u54c1\u724c\u5e7f\u544a\u56fe\u7247\u5f02\u5e38\uff1a" + e.getMessage(), (Throwable)e);
            return CoreDocJsonResultForOpenApi.error((CoreDocBusinessException)new CoreDocBusinessException(CoreDocBusinessErrorEnum.SYSTEM_ERROR));
        }
        return CoreDocJsonResultForOpenApi.success(null);
    }

    public CoreDocJsonResultForOpenApi<Object> batchDeletePresentationClassAdImageBusinessId(List<AttachmentInfoSyncSyncVO> attachmentInfoSyncSyncVOList) {
        try {
            Map<String, List<AttachmentInfoSyncSyncVO>> presentationClassAdImageListMap = attachmentInfoSyncSyncVOList.stream().collect(Collectors.groupingBy(AttachmentInfoSyncSyncVO::getArchiveId));
            ArrayList presentationClassForUpdateList = new ArrayList();
            presentationClassAdImageListMap.keySet().forEach(a -> {
                ArrayList fileIdList = new ArrayList();
                ((List)presentationClassAdImageListMap.get(a)).forEach(b -> fileIdList.add(b.getAttachmentFileId()));
                DeleteResult deleteResult = this.cooperationFileService.deleteBusinessFiles(ATTACHMENT_BUSINESS_TYPE, ((AttachmentInfoSyncSyncVO)((List)presentationClassAdImageListMap.get(a)).get(0)).getAttachmentBusinessId(), fileIdList);
                if (deleteResult.getLeftCount() <= 0L) {
                    PresentationClass presentationClass = new PresentationClass();
                    presentationClass.setId((Object)Long.parseLong(a));
                    presentationClass.setAdImageBusinessId(null);
                    presentationClass.setEntityStatus(EntityStatus.Update);
                    presentationClassForUpdateList.add(presentationClass);
                }
            });
            if (!CollectionUtils.isEmpty(presentationClassForUpdateList)) {
                MetaDaoHelper.update((String)"pc.cls.PresentationClass", presentationClassForUpdateList);
            }
        }
        catch (Exception e) {
            log.error("\u6279\u91cf\u5220\u9664\u5546\u54c1\u5206\u7c7b\u5e7f\u544a\u56fe\u7247\u5f02\u5e38\uff1a" + e.getMessage(), (Throwable)e);
            return CoreDocJsonResultForOpenApi.error((CoreDocBusinessException)new CoreDocBusinessException(CoreDocBusinessErrorEnum.SYSTEM_ERROR));
        }
        return CoreDocJsonResultForOpenApi.success(null);
    }

    public CoreDocJsonResultForOpenApi<Object> batchDeletePresentationClassImageBusinessId(List<AttachmentInfoSyncSyncVO> attachmentInfoSyncSyncVOList) {
        try {
            Map<String, List<AttachmentInfoSyncSyncVO>> presentationClassImageListMap = attachmentInfoSyncSyncVOList.stream().collect(Collectors.groupingBy(AttachmentInfoSyncSyncVO::getArchiveId));
            ArrayList presentationClassForUpdateList = new ArrayList();
            presentationClassImageListMap.keySet().forEach(a -> {
                ArrayList fileIdList = new ArrayList();
                ((List)presentationClassImageListMap.get(a)).forEach(b -> fileIdList.add(b.getAttachmentFileId()));
                DeleteResult deleteResult = this.cooperationFileService.deleteBusinessFiles(ATTACHMENT_BUSINESS_TYPE, ((AttachmentInfoSyncSyncVO)((List)presentationClassImageListMap.get(a)).get(0)).getAttachmentBusinessId(), fileIdList);
                if (deleteResult.getLeftCount() <= 0L) {
                    PresentationClass presentationClass = new PresentationClass();
                    presentationClass.setId((Object)Long.parseLong(a));
                    presentationClass.setImageBusinessId(null);
                    presentationClass.setEntityStatus(EntityStatus.Update);
                    presentationClassForUpdateList.add(presentationClass);
                }
            });
            if (!CollectionUtils.isEmpty(presentationClassForUpdateList)) {
                MetaDaoHelper.update((String)"pc.cls.PresentationClass", presentationClassForUpdateList);
            }
        }
        catch (Exception e) {
            log.error("\u6279\u91cf\u5220\u9664\u5546\u54c1\u5206\u7c7b\u56fe\u7247\u5f02\u5e38\uff1a" + e.getMessage(), (Throwable)e);
            return CoreDocJsonResultForOpenApi.error((CoreDocBusinessException)new CoreDocBusinessException(CoreDocBusinessErrorEnum.SYSTEM_ERROR));
        }
        return CoreDocJsonResultForOpenApi.success(null);
    }

    public CoreDocJsonResultForOpenApi<Object> batchDeleteProductOrMerchantAttachment(List<AttachmentInfoSyncSyncVO> attachmentInfoSyncSyncVOList) {
        try {
            attachmentInfoSyncSyncVOList.forEach(a -> {
                ArrayList<String> fileIdList = new ArrayList<String>();
                fileIdList.add(a.getAttachmentFileId());
                this.cooperationFileService.deleteBusinessFiles(ATTACHMENT_BUSINESS_TYPE, a.getAttachmentBusinessId(), fileIdList);
            });
        }
        catch (Exception e) {
            log.error("\u6279\u91cf\u5220\u9664\u9644\u4ef6\u5f02\u5e38\uff1a" + e.getMessage(), (Throwable)e);
            return CoreDocJsonResultForOpenApi.error((CoreDocBusinessException)new CoreDocBusinessException(CoreDocBusinessErrorEnum.SYSTEM_ERROR));
        }
        return CoreDocJsonResultForOpenApi.success(null);
    }

    public CoreDocJsonResultForOpenApi<Object> batchDeleteTagImageBusinessId(List<AttachmentInfoSyncSyncVO> attachmentInfoSyncSyncVOList) {
        try {
            Map<String, List<AttachmentInfoSyncSyncVO>> tagImageListMap = attachmentInfoSyncSyncVOList.stream().collect(Collectors.groupingBy(AttachmentInfoSyncSyncVO::getArchiveId));
            ArrayList tagForUpdateList = new ArrayList();
            tagImageListMap.keySet().forEach(a -> {
                ArrayList fileIdList = new ArrayList();
                ((List)tagImageListMap.get(a)).forEach(b -> fileIdList.add(b.getAttachmentFileId()));
                DeleteResult deleteResult = this.cooperationFileService.deleteBusinessFiles(ATTACHMENT_BUSINESS_TYPE, ((AttachmentInfoSyncSyncVO)((List)tagImageListMap.get(a)).get(0)).getAttachmentBusinessId(), fileIdList);
                if (deleteResult.getLeftCount() <= 0L) {
                    Tag tag = new Tag();
                    tag.setId((Object)Long.parseLong(a));
                    tag.setTagBusinessId(null);
                    tag.setEntityStatus(EntityStatus.Update);
                    tagForUpdateList.add(tag);
                }
            });
            if (!CollectionUtils.isEmpty(tagForUpdateList)) {
                MetaDaoHelper.update((String)"pc.tag.Tag", tagForUpdateList);
            }
        }
        catch (Exception e) {
            log.error("\u6279\u91cf\u5220\u9664\u6807\u7b7e\u56fe\u7247\u5f02\u5e38\uff1a" + e.getMessage(), (Throwable)e);
            return CoreDocJsonResultForOpenApi.error((CoreDocBusinessException)new CoreDocBusinessException(CoreDocBusinessErrorEnum.SYSTEM_ERROR));
        }
        return CoreDocJsonResultForOpenApi.success(null);
    }

    @Override
    public UPCPager queryIncrementAttachmentFromCooperation(String beginTime, Integer pageIndex, Integer pageSize) {
        LocalDateTime beginDateTime = LocalDateTime.parse(beginTime, this.dateTimeFormatter);
        LocalDateTime endDateTime = LocalDateTime.now();
        PageResponse pageResponse = this.cooperationFileService.queryBusinessRecentAddFilesByPage(ATTACHMENT_BUSINESS_TYPE, (String)AppContext.getYTenantId(), Long.valueOf(beginDateTime.toInstant(ZoneOffset.ofHours(8)).toEpochMilli()), Long.valueOf(endDateTime.toInstant(ZoneOffset.ofHours(8)).toEpochMilli()), pageIndex, pageSize);
        List cooperationFileVOList = pageResponse.getList();
        QueryConditionGroup condition = QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"pubts").gt((Object)beginTime), QueryConditionGroup.or((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"merchantLogo").is_not_null(), QueryCondition.name((String)"frontIdCard").is_not_null(), QueryCondition.name((String)"backIdCard").is_not_null(), QueryCondition.name((String)"businessLicenseNew").is_not_null(), QueryCondition.name((String)"certificate").is_not_null(), QueryCondition.name((String)"orgCertificate").is_not_null()})});
        QuerySchema merchantSchema = QuerySchema.create().addSelect("id, merchantLogo, frontIdCard, backIdCard, businessLicenseNew,certificate,orgCertificate").addCondition((ConditionExpression)condition);
        List merchantMapList = null;
        try {
            merchantMapList = MetaDaoHelper.query((String)"aa.merchant.Merchant", (QuerySchema)merchantSchema, null);
        }
        catch (Exception e) {
            throw new CoreDocBusinessException(CoreDocBusinessErrorEnum.SYSTEM_ERROR);
        }
        HashMap merchantCommonAttachmentMap = new HashMap();
        merchantMapList.forEach(a -> {
            if (a.get("merchantLogo") != null) {
                merchantCommonAttachmentMap.put(a.get("merchantLogo").toString(), a.get("id").toString());
            }
            if (a.get("frontIdCard") != null) {
                merchantCommonAttachmentMap.put(a.get("frontIdCard").toString(), a.get("id").toString());
            }
            if (a.get("backIdCard") != null) {
                merchantCommonAttachmentMap.put(a.get("backIdCard").toString(), a.get("id").toString());
            }
            if (a.get("businessLicenseNew") != null) {
                merchantCommonAttachmentMap.put(a.get("businessLicenseNew").toString(), a.get("id").toString());
            }
            if (a.get("certificate") != null) {
                merchantCommonAttachmentMap.put(a.get("certificate").toString(), a.get("id").toString());
            }
            if (a.get("orgCertificate") != null) {
                merchantCommonAttachmentMap.put(a.get("orgCertificate").toString(), a.get("id").toString());
            }
        });
        QueryConditionGroup qualificationCondition = QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"pubts").gt((Object)beginTime), QueryCondition.name((String)"attachment").is_not_null()});
        QuerySchema qualificationSchema = QuerySchema.create().addSelect("id, merchantId, attachment").addCondition((ConditionExpression)qualificationCondition);
        List qualificationMapList = null;
        try {
            qualificationMapList = MetaDaoHelper.query((String)"aa.merchant.MerchantQualificationDocument", (QuerySchema)qualificationSchema, null);
        }
        catch (Exception e) {
            throw new CoreDocBusinessException(CoreDocBusinessErrorEnum.SYSTEM_ERROR);
        }
        qualificationMapList.forEach(a -> merchantCommonAttachmentMap.put(a.get("attachment").toString(), a.get("merchantId").toString()));
        List attachmentInfoForSyncDTOList = cooperationFileVOList.stream().map(cooperationFileVO -> {
            AttachmentInfoForSyncDTO attachmentInfoForSyncDTO = new AttachmentInfoForSyncDTO();
            BeanUtils.copyProperties((Object)cooperationFileVO, (Object)attachmentInfoForSyncDTO);
            attachmentInfoForSyncDTO.setDownloadUrl(cooperationFileVO.getBucketUrl());
            if (merchantCommonAttachmentMap.containsKey(cooperationFileVO.getObjectId())) {
                attachmentInfoForSyncDTO.setArchiveId((String)merchantCommonAttachmentMap.get(cooperationFileVO.getObjectId()));
            } else {
                attachmentInfoForSyncDTO.setArchiveId(cooperationFileVO.getObjectId());
            }
            attachmentInfoForSyncDTO.setAttachmentBusinessId(cooperationFileVO.getObjectId());
            attachmentInfoForSyncDTO.setAttachmentFileId(cooperationFileVO.getId());
            attachmentInfoForSyncDTO.setSyncTime(this.dateTimeFormatter.format(endDateTime));
            LocalDateTime fileCreateTime = Instant.ofEpochMilli(cooperationFileVO.getCtime()).atZone(ZoneOffset.ofHours(8)).toLocalDateTime();
            attachmentInfoForSyncDTO.setFileCreateTime(this.dateTimeFormatter.format(fileCreateTime));
            return attachmentInfoForSyncDTO;
        }).collect(Collectors.toList());
        UPCPager upcPager = new UPCPager();
        upcPager.setPageIndex(Integer.valueOf(pageResponse.getPageNum()));
        upcPager.setPageSize(Integer.valueOf(pageResponse.getPageSize()));
        upcPager.setRecordCount(Integer.valueOf(Integer.parseInt(String.valueOf(pageResponse.getCount()))));
        if (upcPager.getPageSize() == upcPager.getRecordCount() && upcPager.getRecordCount() > 0) {
            upcPager.setHaveNextPage(Boolean.valueOf(true));
        } else {
            upcPager.setHaveNextPage(Boolean.valueOf(false));
        }
        upcPager.setRecordList(attachmentInfoForSyncDTOList);
        return upcPager;
    }

    @Override
    public UPCPager queryDeletedAttachmentFromCooperation(String beginTime, Integer pageIndex, Integer pageSize) {
        LocalDateTime beginDateTime = LocalDateTime.parse(beginTime, this.dateTimeFormatter);
        LocalDateTime endDateTime = LocalDateTime.now();
        PageResponse pageResponse = this.cooperationFileService.queryBusinessRecentDeleteFilesByPage(ATTACHMENT_BUSINESS_TYPE, (String)AppContext.getYTenantId(), Long.valueOf(beginDateTime.toInstant(ZoneOffset.ofHours(8)).toEpochMilli()), Long.valueOf(endDateTime.toInstant(ZoneOffset.ofHours(8)).toEpochMilli()), pageIndex, pageSize);
        List cooperationFileVOList = pageResponse.getList();
        List attachmentInfoForSyncDTOList = cooperationFileVOList.stream().map(cooperationFileVO -> {
            AttachmentInfoForSyncDTO attachmentInfoForSyncDTO = new AttachmentInfoForSyncDTO();
            attachmentInfoForSyncDTO.setArchiveId(cooperationFileVO.getObjectId());
            attachmentInfoForSyncDTO.setAttachmentBusinessId(cooperationFileVO.getObjectId());
            attachmentInfoForSyncDTO.setAttachmentFileId(cooperationFileVO.getId());
            attachmentInfoForSyncDTO.setSyncTime(this.dateTimeFormatter.format(endDateTime));
            return attachmentInfoForSyncDTO;
        }).collect(Collectors.toList());
        UPCPager upcPager = new UPCPager();
        upcPager.setPageIndex(Integer.valueOf(pageResponse.getPageNum()));
        upcPager.setPageSize(Integer.valueOf(pageResponse.getPageSize()));
        upcPager.setRecordCount(Integer.valueOf(Integer.parseInt(String.valueOf(pageResponse.getCount()))));
        if (upcPager.getPageSize() == upcPager.getRecordCount() && upcPager.getRecordCount() > 0) {
            upcPager.setHaveNextPage(Boolean.valueOf(true));
        } else {
            upcPager.setHaveNextPage(Boolean.valueOf(false));
        }
        upcPager.setRecordList(attachmentInfoForSyncDTOList);
        return upcPager;
    }
}


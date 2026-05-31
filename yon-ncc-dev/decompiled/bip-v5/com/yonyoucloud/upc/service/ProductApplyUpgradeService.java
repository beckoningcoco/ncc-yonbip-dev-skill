/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.yonyou.iuap.apdoc.coredoc.utils.ListSplitUtil
 *  com.yonyou.ucf.mdd.ext.dao.meta.MetaDaoHelper
 *  com.yonyou.ucf.mdd.ext.dao.sql.SqlHelper
 *  com.yonyou.ucf.mdd.ext.voucher.enums.Status
 *  com.yonyoucloud.upc.pc.product.Product
 *  com.yonyoucloud.upc.utils.MultilangUtil
 *  com.yonyoucloud.upc.utils.encode.MD5Util
 *  org.imeta.biz.base.Objectlizer
 *  org.imeta.orm.base.BizObject
 *  org.imeta.orm.base.Json
 *  org.imeta.orm.schema.ConditionExpression
 *  org.imeta.orm.schema.QueryCondition
 *  org.imeta.orm.schema.QueryConditionGroup
 *  org.imeta.orm.schema.QuerySchema
 *  org.slf4j.Logger
 *  org.slf4j.LoggerFactory
 *  org.springframework.beans.factory.annotation.Autowired
 *  org.springframework.stereotype.Service
 *  org.springframework.util.CollectionUtils
 */
package com.yonyoucloud.upc.service;

import com.yonyou.iuap.apdoc.coredoc.utils.ListSplitUtil;
import com.yonyou.ucf.mdd.ext.dao.meta.MetaDaoHelper;
import com.yonyou.ucf.mdd.ext.dao.sql.SqlHelper;
import com.yonyou.ucf.mdd.ext.voucher.enums.Status;
import com.yonyoucloud.upc.enums.AttachmentUpgradeEnum;
import com.yonyoucloud.upc.pc.product.Product;
import com.yonyoucloud.upc.service.attachment.impl.AttachmentDataUpgradeServiceImpl;
import com.yonyoucloud.upc.utils.MultilangUtil;
import com.yonyoucloud.upc.utils.encode.MD5Util;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import org.imeta.biz.base.Objectlizer;
import org.imeta.orm.base.BizObject;
import org.imeta.orm.base.Json;
import org.imeta.orm.schema.ConditionExpression;
import org.imeta.orm.schema.QueryCondition;
import org.imeta.orm.schema.QueryConditionGroup;
import org.imeta.orm.schema.QuerySchema;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;

@Service
public class ProductApplyUpgradeService {
    private static final Logger log = LoggerFactory.getLogger(ProductApplyUpgradeService.class);
    @Autowired
    AttachmentDataUpgradeServiceImpl attachmentDataUpgradeService;

    public void productApplyDataUpgrade(List<Long> tenantIdList) {
        if (this.attachmentDataUpgradeService.queryIsTriggerUpgrade(AttachmentUpgradeEnum.PRODUCT_APPLY_UNIQUE)) {
            return;
        }
        this.attachmentDataUpgradeService.recordBeginUpgrade(AttachmentUpgradeEnum.PRODUCT_APPLY_UNIQUE);
        if (tenantIdList.isEmpty()) {
            QuerySchema queryProductApplyTenantSchema = QuerySchema.create().addSelect("tenant").distinct().addCondition((ConditionExpression)QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"status").in(new Object[]{Status.newopen.getValue(), Status.confirming.getValue()})}));
            List queryProductAttachmentTenantList = null;
            try {
                queryProductAttachmentTenantList = MetaDaoHelper.queryNoPartition((String)"pc.productapply.ProductApply", (QuerySchema)queryProductApplyTenantSchema, null);
            }
            catch (Exception e) {
                log.error("\u67e5\u8be2\u7269\u6599\u7533\u8bf7\u79df\u6237\u5f02\u5e38" + e.getMessage(), (Throwable)e);
            }
            if (CollectionUtils.isEmpty((Collection)queryProductAttachmentTenantList)) {
                this.attachmentDataUpgradeService.recordUpgradeSuccess(AttachmentUpgradeEnum.PRODUCT_APPLY_UNIQUE);
                return;
            }
            tenantIdList = queryProductAttachmentTenantList.stream().map(a -> Long.parseLong(a.get("tenant").toString())).collect(Collectors.toList());
        }
        Map<Long, String> tenantIdMapping = this.attachmentDataUpgradeService.getTenantIdMapping(tenantIdList);
        for (Long tenantId : tenantIdList) {
            QuerySchema queryProductApplySchema = QuerySchema.create().addSelect("id,productData").addCondition((ConditionExpression)QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"tenant").eq((Object)tenantId), QueryCondition.name((String)"status").in(new Object[]{Status.newopen.getValue(), Status.confirming.getValue()})}));
            List queryProductApplyList = null;
            try {
                queryProductApplyList = MetaDaoHelper.queryNoPartition((String)"pc.productapply.ProductApply", (QuerySchema)queryProductApplySchema, null);
            }
            catch (Exception e) {
                log.error("\u67e5\u8be2\u7269\u6599\u9644\u4ef6ID\u96c6\u5408\u5f02\u5e38" + e.getMessage(), (Throwable)e);
            }
            List lists = ListSplitUtil.splitListByCapacity((List)queryProductApplyList, (int)1000);
            for (List productApplyList : lists) {
                try {
                    this.productApplyUpgrade(productApplyList);
                }
                catch (Exception e) {
                    log.error("\u5347\u7ea7\u7269\u6599\u9644\u4ef6\u5f02\u5e38\uff0c\u5f02\u5e38\u96c6\u5408:" + productApplyList + "\u5f02\u5e38\u4fe1\u606f\uff1a" + e.getMessage(), (Throwable)e);
                    this.attachmentDataUpgradeService.recordUpgradeException(AttachmentUpgradeEnum.PRODUCT_APPLY_UNIQUE, productApplyList.stream().map(data -> data.get("id").toString()).collect(Collectors.joining(",")), e.getMessage() == null ? e.toString() : e.getMessage());
                }
            }
        }
        this.attachmentDataUpgradeService.recordUpgradeSuccess(AttachmentUpgradeEnum.PRODUCT_APPLY_UNIQUE);
    }

    private void productApplyUpgrade(List<Map<String, Object>> productApplyList) throws Exception {
        if (CollectionUtils.isEmpty(productApplyList)) {
            return;
        }
        for (Map<String, Object> productApply : productApplyList) {
            if (productApply.get("productData") == null) continue;
            Product product = (Product)Objectlizer.decodeObj((Json)new Json(productApply.get("productData").toString()), (String)"pc.product.Product");
            String productName = (String)MultilangUtil.getAttr((String)"pc.product.Product", (String)"name", (BizObject)product, (String)"zh_CN");
            String modelDescription = (String)MultilangUtil.getAttr((String)"pc.product.Product", (String)"modelDescription", (BizObject)product, (String)"zh_CN");
            String model = (String)MultilangUtil.getAttr((String)"pc.product.Product", (String)"model", (BizObject)product, (String)"zh_CN");
            String nameModelDescriptionModel = productName;
            if (null != modelDescription && modelDescription.trim().length() != 0) {
                nameModelDescriptionModel = nameModelDescriptionModel + "_" + modelDescription;
            }
            if (null != model && model.trim().length() != 0) {
                nameModelDescriptionModel = nameModelDescriptionModel + "_" + model;
            }
            String nameModelDescriptionModelMd5 = MD5Util.getMD5((String)nameModelDescriptionModel);
            productApply.put("uniqueMD5", nameModelDescriptionModelMd5);
            SqlHelper.update((String)"com.yonyoucloud.upc.mapper.productapply.updateUniqueMD5", productApply);
        }
    }
}


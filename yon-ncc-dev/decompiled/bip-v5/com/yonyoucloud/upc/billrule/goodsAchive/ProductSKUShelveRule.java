/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.yonyou.iuap.apdoc.coredoc.busidoc.warehouse.service.impl.BizDocWarehouseServiceImpl
 *  com.yonyou.iuap.apdoc.coredoc.constants.UPCConstants
 *  com.yonyou.iuap.apdoc.coredoc.enums.CoreDocBusinessErrorEnum
 *  com.yonyou.iuap.apdoc.coredoc.enums.CoreExtrateBusinessErrorEnum
 *  com.yonyou.iuap.apdoc.coredoc.exceptions.CoreDocBusinessException
 *  com.yonyou.iuap.ucf.common.i18n.InternationalUtils
 *  com.yonyou.ucf.mdd.common.model.rule.RuleExecuteResult
 *  com.yonyou.ucf.mdd.ext.bill.dto.BillDataDto
 *  com.yonyou.ucf.mdd.ext.bill.rule.base.AbstractCommonRule
 *  com.yonyou.ucf.mdd.ext.core.AppContext
 *  com.yonyou.ucf.mdd.ext.dao.meta.MetaDaoHelper
 *  com.yonyou.ucf.mdd.ext.model.BillContext
 *  com.yonyou.ucf.mdd.ext.util.RedisTool
 *  com.yonyoucloud.upc.pc.product.Product
 *  com.yonyoucloud.upc.pc.product.ProductAttributeEnum
 *  com.yonyoucloud.upc.pc.product.ProductExtend
 *  com.yonyoucloud.upc.pc.product.RealProductAttributeTypeEnum
 *  com.yonyoucloud.upc.pc.product.VirtualProductAttributeEnum
 *  com.yonyoucloud.upc.utils.RedisLockKeyConstants
 *  org.apache.commons.collections4.MapUtils
 *  org.apache.commons.lang3.StringUtils
 *  org.imeta.biz.base.Objectlizer
 *  org.imeta.orm.base.BizObject
 *  org.imeta.orm.base.EntityStatus
 *  org.imeta.orm.schema.ConditionExpression
 *  org.imeta.orm.schema.QueryCondition
 *  org.imeta.orm.schema.QueryConditionGroup
 *  org.imeta.orm.schema.QuerySchema
 *  org.jetbrains.annotations.NotNull
 *  org.slf4j.Logger
 *  org.slf4j.LoggerFactory
 *  org.springframework.beans.factory.annotation.Autowired
 *  org.springframework.beans.factory.annotation.Qualifier
 *  org.springframework.stereotype.Component
 *  org.springframework.util.CollectionUtils
 */
package com.yonyoucloud.upc.billrule.goodsAchive;

import com.yonyou.iuap.apdoc.coredoc.busidoc.warehouse.service.impl.BizDocWarehouseServiceImpl;
import com.yonyou.iuap.apdoc.coredoc.constants.UPCConstants;
import com.yonyou.iuap.apdoc.coredoc.enums.CoreDocBusinessErrorEnum;
import com.yonyou.iuap.apdoc.coredoc.enums.CoreExtrateBusinessErrorEnum;
import com.yonyou.iuap.apdoc.coredoc.exceptions.CoreDocBusinessException;
import com.yonyou.iuap.ucf.common.i18n.InternationalUtils;
import com.yonyou.ucf.mdd.common.model.rule.RuleExecuteResult;
import com.yonyou.ucf.mdd.ext.bill.dto.BillDataDto;
import com.yonyou.ucf.mdd.ext.bill.rule.base.AbstractCommonRule;
import com.yonyou.ucf.mdd.ext.core.AppContext;
import com.yonyou.ucf.mdd.ext.dao.meta.MetaDaoHelper;
import com.yonyou.ucf.mdd.ext.model.BillContext;
import com.yonyou.ucf.mdd.ext.util.RedisTool;
import com.yonyoucloud.iuap.upc.api.service.IUPCBillService;
import com.yonyoucloud.iuap.upc.api.service.IUPCProductShelfService;
import com.yonyoucloud.upc.event.EventService2;
import com.yonyoucloud.upc.event.EventType;
import com.yonyoucloud.upc.pc.product.Product;
import com.yonyoucloud.upc.pc.product.ProductAttributeEnum;
import com.yonyoucloud.upc.pc.product.ProductExtend;
import com.yonyoucloud.upc.pc.product.RealProductAttributeTypeEnum;
import com.yonyoucloud.upc.pc.product.VirtualProductAttributeEnum;
import com.yonyoucloud.upc.utils.RedisLockKeyConstants;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.UUID;
import org.apache.commons.collections4.MapUtils;
import org.apache.commons.lang3.StringUtils;
import org.imeta.biz.base.Objectlizer;
import org.imeta.orm.base.BizObject;
import org.imeta.orm.base.EntityStatus;
import org.imeta.orm.schema.ConditionExpression;
import org.imeta.orm.schema.QueryCondition;
import org.imeta.orm.schema.QueryConditionGroup;
import org.imeta.orm.schema.QuerySchema;
import org.jetbrains.annotations.NotNull;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
import org.springframework.util.CollectionUtils;

@Component(value="productSKUShelveRule")
public class ProductSKUShelveRule
extends AbstractCommonRule {
    private static final Logger log = LoggerFactory.getLogger(ProductSKUShelveRule.class);
    @Autowired
    private IUPCProductShelfService upcProductShelfService;
    @Autowired
    private EventService2 eventService2;
    @Autowired
    @Qualifier(value="pc.BillService")
    IUPCBillService billService;
    @Autowired
    BizDocWarehouseServiceImpl bizDocWarehouseService;

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public RuleExecuteResult execute(BillContext billContext, Map<String, Object> paramMap) throws Exception {
        List bills = this.getBills(billContext, paramMap);
        if (null == bills || bills.size() <= 0) return new RuleExecuteResult();
        AppContext.delThreadContext((String)"isSupportAsync");
        for (BizObject bill : bills) {
            Long productApplyRangeId = Long.parseLong((String)bill.get("productApplyRangeId"));
            Long skuId = Long.parseLong(bill.get("id").toString());
            QueryConditionGroup queryConditionGroup = QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"id").eq((Object)productApplyRangeId)});
            QuerySchema schema = QuerySchema.create().addSelect("id as id, productId as productId, isCreator as isCreator, isApplied as isApplied, productDetailId.stopstatus as stopstatus, productDetailId.iStatus as iStatus, productDetailId.iUOrderStatus as iUOrderStatus, productId.realProductAttribute as realProductAttribute, productId.realProductAttributeType as realProductAttributeType, productId.virtualProductAttribute as virtualProductAttribute").addCondition((ConditionExpression)queryConditionGroup);
            List rangeDetails = MetaDaoHelper.query((String)"pc.product.ProductApplyRange", (QuerySchema)schema);
            if (CollectionUtils.isEmpty((Collection)rangeDetails)) {
                throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_800081, (Object[])bill.get("id"));
            }
            Map rangeDetail = (Map)rangeDetails.get(0);
            Long productId = Long.parseLong(rangeDetail.get("productId").toString());
            if (!Boolean.parseBoolean(rangeDetail.get("isApplied").toString())) {
                this.initRangeData(productId.toString(), productApplyRangeId);
            }
            boolean isCreator = Boolean.parseBoolean(rangeDetail.get("isCreator").toString());
            if ("skushelve".equalsIgnoreCase(billContext.getAction())) {
                ProductSKUShelveRule.checkShelfBuisness(skuId, rangeDetail);
                if ("umall".equalsIgnoreCase((String)bill.get("biz"))) {
                    if (null != rangeDetail.get("iStatus") && !Boolean.parseBoolean(rangeDetail.get("iStatus").toString())) {
                        throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_800082);
                    }
                    this.upcProductShelfService.shelfMallProductSKU(productId, productApplyRangeId, skuId, isCreator);
                } else {
                    if (!"uorder".equalsIgnoreCase((String)bill.get("biz"))) throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_800084);
                    if (null != rangeDetail.get("iUOrderStatus") && !Boolean.parseBoolean(rangeDetail.get("iUOrderStatus").toString())) {
                        throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_800083);
                    }
                    this.upcProductShelfService.shelfUOrderProductSKU(productId, productApplyRangeId, skuId, isCreator);
                }
            } else {
                if (!"skuunshelve".equalsIgnoreCase(billContext.getAction())) throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_800086);
                if ("umall".equalsIgnoreCase((String)bill.get("biz"))) {
                    this.upcProductShelfService.unShelfMallProductSKU(productId, productApplyRangeId, skuId, isCreator);
                } else {
                    if (!"uorder".equalsIgnoreCase((String)bill.get("biz"))) throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_800085);
                    this.upcProductShelfService.unShelfUOrderProductSKU(productId, productApplyRangeId, skuId, isCreator);
                }
            }
            this.sendEventForShelf(bill, billContext.getAction());
        }
        return new RuleExecuteResult();
    }

    private static void checkShelfBuisness(Long skuId, Map<String, Object> rangeDetail) {
        if (rangeDetail.containsKey("stopstatus") && rangeDetail.get("stopstatus").equals(true)) {
            throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_800081, new Object[]{skuId});
        }
        if (ProductAttributeEnum.Real.getValue().equals(rangeDetail.get("realProductAttribute"))) {
            if (rangeDetail.get("realProductAttributeType").equals(RealProductAttributeTypeEnum.VirtualMaterials.getValue())) {
                throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_800081, new Object[]{skuId});
            }
            if (rangeDetail.get("realProductAttributeType").equals(RealProductAttributeTypeEnum.StoredCard.getValue())) {
                throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_800081, new Object[]{skuId});
            }
        }
        if (ProductAttributeEnum.Virtual.getValue().equals(rangeDetail.get("realProductAttribute")) && rangeDetail.get("virtualProductAttribute").equals(VirtualProductAttributeEnum.CardStored.getValue())) {
            throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_800081, new Object[]{skuId});
        }
    }

    private void sendEventForShelf(BizObject bill, String action) {
        HashMap<String, Object> params = new HashMap<String, Object>(4);
        params.put("productId", bill.get("productId"));
        params.put("skuid", bill.get("id"));
        params.put("productApplyRangeId", bill.get("productApplyRangeId"));
        params.put("biz", bill.get("biz"));
        params.put("action", action);
        EventType eventType = EventType.find("pc_productsku", action, "SKUUpdate");
        HashMap<String, Object> businessObject = new HashMap<String, Object>(2);
        businessObject.put("fullname", "pc.product.ProductSKU");
        businessObject.put("desc", InternationalUtils.getMessageWithDefault((String)"UID:P_COREDOC-BE_179F628604080353", (String)"action:shelve\u4e0a\u67b6\uff1bunshelve\u4e0b\u67b6\u3002biz:umall\u5546\u57ce\uff1buorder\u4e0b\u67b6\u3002"));
        businessObject.putAll(params);
        try {
            this.eventService2.sendEvent("YXYBASEDOC", eventType.toString(), businessObject);
        }
        catch (Exception e) {
            log.error(InternationalUtils.getMessageWithDefault((String)"UID:P_COREDOC-BE_179F628604080357", (String)"\u53d1\u9001\u4e8b\u4ef6\u5931\u8d25"), (Throwable)e);
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public void initRangeData(String productId, Long productApplyRangeId) throws Exception {
        block7: {
            Boolean isCreator = false;
            Boolean isApplied = false;
            String billnum = "pc_productdetail";
            HashMap<String, Comparable<Long>> saveParams = new HashMap<String, Comparable<Long>>(3);
            saveParams.put("@productApplyRangeId", productApplyRangeId);
            saveParams.put("isCreator", isCreator);
            saveParams.put("isApplied", isCreator);
            BillDataDto savebill = new BillDataDto(billnum, productId);
            savebill.setMapCondition(saveParams);
            Map detail = this.billService.detail(savebill);
            detail.put("isCreator", isCreator);
            detail.put("isApplied", isApplied);
            detail.put("isApplied", isApplied);
            detail.put("productApplyRangeId", productApplyRangeId);
            detail.put("_status", EntityStatus.Update);
            if (null != detail.get("productskus")) {
                for (HashMap productsku : (List)detail.get("productskus")) {
                    if (productsku.get("id") == null || StringUtils.isEmpty((CharSequence)productsku.get("id").toString())) continue;
                    productsku.put("_status", EntityStatus.Update);
                }
            }
            if (null != detail.get("time!productId") && !StringUtils.isEmpty((CharSequence)detail.get("time!productId").toString()) && null != detail.get("time!id") && StringUtils.isEmpty((CharSequence)detail.get("time!id").toString())) {
                detail.put("time!_status", EntityStatus.Insert);
            }
            Product productObj = (Product)Objectlizer.convert((Map)detail, (String)"pc.product.Product");
            this.dealWarehouseDefaultValue(productObj);
            BillDataDto saveDto = new BillDataDto();
            saveDto.setData((Object)productObj);
            saveDto.setBillnum(billnum);
            String lockKey = RedisLockKeyConstants.PRODUCTDETAIL_SAVE + productApplyRangeId;
            String requestId = UUID.randomUUID().toString();
            try {
                if (RedisTool.tryGetLock((String)lockKey, (String)requestId, (int)UPCConstants.LOCK_EXPIRE_TIME)) {
                    this.billService.executeUpdate("save", saveDto);
                    break block7;
                }
                throw new CoreDocBusinessException(CoreDocBusinessErrorEnum.PRODUCT_DETAIL_INITING_ERROR);
            }
            finally {
                RedisTool.releaseLock((String)lockKey, (String)requestId);
            }
        }
    }

    private void dealWarehouseDefaultValue(Product productObj) {
        Set<Long> wareIds = this.getWarehouseIdsFromMaterials(productObj);
        Map warehouseAndOrgIdMap = this.bizDocWarehouseService.queryWarehouseAndOrgIdMap(wareIds);
        this.setWarehouseDefaultValue(productObj, warehouseAndOrgIdMap);
    }

    private void setWarehouseDefaultValue(Product productObj, Map<Long, Set<String>> warehouseAndOrgIdMap) {
        if (null != productObj && null != productObj.detail()) {
            ProductExtend materialDetailPO = productObj.detail();
            if (MapUtils.isNotEmpty(warehouseAndOrgIdMap)) {
                if (null != materialDetailPO.getDeliveryWarehouse() && null != warehouseAndOrgIdMap.get(materialDetailPO.getDeliveryWarehouse()) && !warehouseAndOrgIdMap.get(materialDetailPO.getDeliveryWarehouse()).contains(materialDetailPO.getOrgId())) {
                    materialDetailPO.setDeliveryWarehouse(null);
                }
                if (null != materialDetailPO.getReceiptWarehouse() && null != warehouseAndOrgIdMap.get(materialDetailPO.getReceiptWarehouse()) && !warehouseAndOrgIdMap.get(materialDetailPO.getReceiptWarehouse()).contains(materialDetailPO.getOrgId())) {
                    materialDetailPO.setReceiptWarehouse(null);
                }
                if (null != materialDetailPO.getReturnWarehouse() && null != warehouseAndOrgIdMap.get(materialDetailPO.getReturnWarehouse()) && !warehouseAndOrgIdMap.get(materialDetailPO.getReturnWarehouse()).contains(materialDetailPO.getOrgId())) {
                    materialDetailPO.setReturnWarehouse(null);
                }
            } else {
                materialDetailPO.setDeliveryWarehouse(null);
                materialDetailPO.setReceiptWarehouse(null);
                materialDetailPO.setReturnWarehouse(null);
            }
        }
    }

    @NotNull
    public Set<Long> getWarehouseIdsFromMaterials(Product productObj) {
        HashSet<Long> wareIds = new HashSet<Long>();
        if (null != productObj && null != productObj.detail()) {
            if (null != productObj.detail().getDeliveryWarehouse()) {
                wareIds.add(productObj.detail().getDeliveryWarehouse());
            }
            if (null != productObj.detail().getReceiptWarehouse()) {
                wareIds.add(productObj.detail().getReceiptWarehouse());
            }
            if (null != productObj.detail().getReturnWarehouse()) {
                wareIds.add(productObj.detail().getReturnWarehouse());
            }
        }
        return wareIds;
    }
}


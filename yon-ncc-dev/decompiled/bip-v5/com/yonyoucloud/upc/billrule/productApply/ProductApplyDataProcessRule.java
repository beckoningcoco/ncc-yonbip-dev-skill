/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.alibaba.fastjson.JSONObject
 *  com.yonyou.iuap.apdoc.coredoc.config.YMSParamConfig
 *  com.yonyou.iuap.apdoc.coredoc.constants.UPCConstants
 *  com.yonyou.iuap.apdoc.coredoc.enums.CoreDocBusinessErrorEnum
 *  com.yonyou.iuap.apdoc.coredoc.exceptions.CoreDocBusinessException
 *  com.yonyou.iuap.apdoc.coredoc.po.productapply.MaterialOrgDetailPO
 *  com.yonyou.iuap.apdoc.coredoc.utils.UpcJacksonUtils
 *  com.yonyou.iuap.ucf.common.i18n.InternationalUtils
 *  com.yonyou.ucf.mdd.common.model.rule.RuleExecuteResult
 *  com.yonyou.ucf.mdd.ext.bill.dto.BillDataDto
 *  com.yonyou.ucf.mdd.ext.bill.rule.base.AbstractCommonRule
 *  com.yonyou.ucf.mdd.ext.bpm.model.VerifyState
 *  com.yonyou.ucf.mdd.ext.core.AppContext
 *  com.yonyou.ucf.mdd.ext.dao.meta.MetaDaoHelper
 *  com.yonyou.ucf.mdd.ext.model.BillContext
 *  com.yonyou.ucf.mdd.ext.util.RedisTool
 *  com.yonyoucloud.upc.data.product.ProductGroupDao
 *  com.yonyoucloud.upc.data.productapply.ProductApplyAddRangeDao
 *  com.yonyoucloud.upc.data.productapply.ProductApplyQueryDao
 *  com.yonyoucloud.upc.pc.product.Product
 *  com.yonyoucloud.upc.pc.product.ProductApplyRange
 *  com.yonyoucloud.upc.pc.productapply.EffectType
 *  com.yonyoucloud.upc.pc.productapply.ProductApply
 *  com.yonyoucloud.upc.pc.productapply.ProductApplyAddRange
 *  com.yonyoucloud.upc.pc.productapply.ProductApplyType
 *  com.yonyoucloud.upc.pc.productapply.ProductOrgDetail
 *  com.yonyoucloud.upc.utils.BizObjectUtils
 *  com.yonyoucloud.upc.utils.MultilangUtil
 *  org.apache.commons.lang3.StringUtils
 *  org.imeta.biz.base.Objectlizer
 *  org.imeta.biz.walker.ChainWalker
 *  org.imeta.biz.walker.FormatCheckWalker
 *  org.imeta.biz.walker.ObjectFullWalker
 *  org.imeta.orm.base.BizObject
 *  org.imeta.orm.base.EntityStatus
 *  org.imeta.orm.base.Json
 *  org.imeta.orm.schema.ConditionExpression
 *  org.imeta.orm.schema.QueryCondition
 *  org.imeta.orm.schema.QueryConditionGroup
 *  org.imeta.orm.schema.QuerySchema
 *  org.slf4j.Logger
 *  org.slf4j.LoggerFactory
 *  org.springframework.beans.factory.annotation.Autowired
 *  org.springframework.beans.factory.annotation.Qualifier
 *  org.springframework.stereotype.Component
 *  org.springframework.transaction.support.TransactionSynchronization
 *  org.springframework.transaction.support.TransactionSynchronizationManager
 *  org.springframework.util.CollectionUtils
 */
package com.yonyoucloud.upc.billrule.productApply;

import com.alibaba.fastjson.JSONObject;
import com.yonyou.iuap.apdoc.coredoc.config.YMSParamConfig;
import com.yonyou.iuap.apdoc.coredoc.constants.UPCConstants;
import com.yonyou.iuap.apdoc.coredoc.enums.CoreDocBusinessErrorEnum;
import com.yonyou.iuap.apdoc.coredoc.exceptions.CoreDocBusinessException;
import com.yonyou.iuap.apdoc.coredoc.po.productapply.MaterialOrgDetailPO;
import com.yonyou.iuap.apdoc.coredoc.utils.UpcJacksonUtils;
import com.yonyou.iuap.ucf.common.i18n.InternationalUtils;
import com.yonyou.ucf.mdd.common.model.rule.RuleExecuteResult;
import com.yonyou.ucf.mdd.ext.bill.dto.BillDataDto;
import com.yonyou.ucf.mdd.ext.bill.rule.base.AbstractCommonRule;
import com.yonyou.ucf.mdd.ext.bpm.model.VerifyState;
import com.yonyou.ucf.mdd.ext.core.AppContext;
import com.yonyou.ucf.mdd.ext.dao.meta.MetaDaoHelper;
import com.yonyou.ucf.mdd.ext.model.BillContext;
import com.yonyou.ucf.mdd.ext.util.RedisTool;
import com.yonyoucloud.iuap.upc.api.service.IUPCBillService;
import com.yonyoucloud.upc.billrule.product.ProductDataProcessRule;
import com.yonyoucloud.upc.data.product.ProductGroupDao;
import com.yonyoucloud.upc.data.productapply.ProductApplyAddRangeDao;
import com.yonyoucloud.upc.data.productapply.ProductApplyQueryDao;
import com.yonyoucloud.upc.pc.product.Product;
import com.yonyoucloud.upc.pc.product.ProductApplyRange;
import com.yonyoucloud.upc.pc.productapply.EffectType;
import com.yonyoucloud.upc.pc.productapply.ProductApply;
import com.yonyoucloud.upc.pc.productapply.ProductApplyAddRange;
import com.yonyoucloud.upc.pc.productapply.ProductApplyType;
import com.yonyoucloud.upc.pc.productapply.ProductOrgDetail;
import com.yonyoucloud.upc.service.ProductApplyService;
import com.yonyoucloud.upc.service.ProductCheckService;
import com.yonyoucloud.upc.service.UseSkuService;
import com.yonyoucloud.upc.service.productapply.ProductApplyCheckService;
import com.yonyoucloud.upc.utils.BizObjectUtils;
import com.yonyoucloud.upc.utils.MultilangUtil;
import java.math.BigDecimal;
import java.text.MessageFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.UUID;
import java.util.concurrent.TimeUnit;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collectors;
import org.apache.commons.lang3.StringUtils;
import org.imeta.biz.base.Objectlizer;
import org.imeta.biz.walker.ChainWalker;
import org.imeta.biz.walker.FormatCheckWalker;
import org.imeta.biz.walker.ObjectFullWalker;
import org.imeta.orm.base.BizObject;
import org.imeta.orm.base.EntityStatus;
import org.imeta.orm.base.Json;
import org.imeta.orm.schema.ConditionExpression;
import org.imeta.orm.schema.QueryCondition;
import org.imeta.orm.schema.QueryConditionGroup;
import org.imeta.orm.schema.QuerySchema;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
import org.springframework.transaction.support.TransactionSynchronization;
import org.springframework.transaction.support.TransactionSynchronizationManager;
import org.springframework.util.CollectionUtils;

@Component(value="productApplyDataProcessRule")
public class ProductApplyDataProcessRule
extends AbstractCommonRule {
    public static final Pattern DIGITS_PATTERN = Pattern.compile("^[0-9]{0,10}$");
    Logger logger = LoggerFactory.getLogger(ProductApplyDataProcessRule.class);
    public static final String ZH_CN = "zh_CN";
    @Autowired
    ProductApplyService productApplyService;
    @Autowired
    UseSkuService useSkuService;
    @Autowired
    ProductCheckService productCheckService;
    @Autowired
    ProductDataProcessRule productDataProcessRule;
    @Autowired
    ProductApplyCheckService productApplyCheckService;
    @Autowired
    private ProductApplyAddRangeDao productApplyAddRangeDao;
    @Autowired
    private ProductGroupDao productGroupDao;
    @Autowired
    @Qualifier(value="pc.BillService")
    private IUPCBillService billService;
    @Autowired
    ProductApplyQueryDao productApplyQueryDao;
    @Autowired
    private YMSParamConfig ymsParamConfig;

    public RuleExecuteResult execute(BillContext billContext, Map<String, Object> paramMap) throws Exception {
        List bills = this.getBills(billContext, paramMap);
        for (int i = 0; i < bills.size(); ++i) {
            ProductApply productApplyDB;
            ProductApply productApply = (ProductApply)bills.get(i);
            int productApplyCount = this.productApplyCheckService.getProductApplyCountByVerifyState(productApply, Arrays.asList(VerifyState.INIT_NEW_OPEN.getValue(), VerifyState.SUBMITED.getValue(), VerifyState.REJECTED_TO_MAKEBILL.getValue()));
            if (productApplyCount > this.ymsParamConfig.getApplyApprovingtMaxCount()) {
                throw new CoreDocBusinessException(MessageFormat.format(InternationalUtils.getMessageWithDefault((String)"UID:P_COREDOC-BE_1BB32AEE0440000C", (String)"\u672a\u6700\u7ec8\u751f\u6548\u7684\u7269\u6599\u7533\u8bf7\u5355\uff0c\u6700\u591a\u53ea\u652f\u6301{0}\u6761\uff0c\u8bf7\u5904\u7406\u540e\u518d\u65b0\u589e\u7533\u8bf7\u5355\u3002"), this.ymsParamConfig.getApplyApprovingtMaxCount()));
            }
            if (EntityStatus.Update == productApply.getEntityStatus() && (productApplyDB = this.productApplyQueryDao.getProductApplyByIdAndFields((Long)productApply.getId(), new String[]{"applyCode", "verifystate"})).getVerifystate() != null && productApplyDB.getVerifystate().shortValue() == VerifyState.COMPLETED.getValue()) {
                throw new CoreDocBusinessException(CoreDocBusinessErrorEnum.PRODUCT_APPLY_HAS_APPROVED, new Object[]{productApplyDB.getApplyCode()});
            }
            this.productApplyService.fillInsertData(productApply);
            if (ProductApplyType.modify == productApply.getApplyType() || ProductApplyType.add == productApply.getApplyType()) {
                if (ProductApplyType.modify == productApply.getApplyType()) {
                    final String lockKey = "pc.productapply.ProductApply_" + AppContext.getYhtTenantId() + "_" + productApply.getApplyProductId() + "_" + productApply.getApplyProductApplyRangeId();
                    final String requestId = UUID.randomUUID().toString();
                    int tryLockNum = 0;
                    while (true) {
                        if (tryLockNum > 60) {
                            throw new CoreDocBusinessException(CoreDocBusinessErrorEnum.PRODUCT_APPLY_LIMIT_COUNT_FOR_CHECK);
                        }
                        ++tryLockNum;
                        if (RedisTool.tryGetLock((String)lockKey, (String)requestId, (int)UPCConstants.LOCK_EXPIRE_TIME)) {
                            TransactionSynchronizationManager.registerSynchronization((TransactionSynchronization)new TransactionSynchronization(){

                                public void afterCompletion(int status) {
                                    RedisTool.releaseLock((String)lockKey, (String)requestId);
                                }
                            });
                            List list = MetaDaoHelper.query((String)"pc.productapply.ProductApply", (QuerySchema)QuerySchema.create().addSelect(new String[]{"id", "applyCode"}).addCondition((ConditionExpression)QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"id").not_eq(productApply.getId()), QueryCondition.name((String)"applyProductId").eq((Object)productApply.getApplyProductId()), QueryCondition.name((String)"applyProductApplyRangeId").eq((Object)productApply.getApplyProductApplyRangeId()), QueryCondition.name((String)"verifystate").in(new Object[]{0, 1, 4})})));
                            if (CollectionUtils.isEmpty((Collection)list)) break;
                            throw new CoreDocBusinessException(CoreDocBusinessErrorEnum.PRODUCT_APPLY_ALREADY_EXISTS_BY_PRODUCT);
                        }
                        TimeUnit.MILLISECONDS.sleep(200L);
                    }
                }
                if (EntityStatus.Insert == productApply.getEntityStatus() && EffectType.timeing == productApply.getEffectType() && null == productApply.getEffectTime()) {
                    throw new CoreDocBusinessException(CoreDocBusinessErrorEnum.PRODUCT_APPLY_EFFECT_TIME_NOT_NULL_FOR_DELAY_EFFECT);
                }
                if (EffectType.immediately == productApply.getEffectType() && null != productApply.getEffectTime()) {
                    productApply.setEffectTime(null);
                }
                if (EffectType.timeing == productApply.getEffectType() && null != productApply.getEffectTime() && this.productApplyService.compareEffectTime(productApply.getEffectTime())) {
                    throw new CoreDocBusinessException(CoreDocBusinessErrorEnum.PRODUCT_APPLY_EFFECT_TIME_NOT_LESS_THAN_CURRENT_TIME_FOR_DELAY_EFFECT);
                }
                this.productApplyService.fillInfoData(productApply, 1);
                productApply.remove("name");
                this.checkDecimalForApplyCheck(productApply);
                this.checkProductProperties(productApply);
                continue;
            }
            if (!ProductApplyType.ADD_RANGE.equals((Object)productApply.getApplyType())) continue;
            this.checkProductApplyAddRangeIsNull(productApply);
            this.supplementaryData(productApply);
            this.checkProductApplyAddRange(productApply);
            this.processProductApplyRangeDetail(productApply);
        }
        return new RuleExecuteResult();
    }

    private void processProductApplyRangeDetail(ProductApply productApply) {
        if (!CollectionUtils.isEmpty((Collection)productApply.productApplyAddRanges())) {
            ArrayList<ProductOrgDetail> productOrgDetailList = new ArrayList<ProductOrgDetail>();
            if (productApply.getEntityStatus() == EntityStatus.Insert) {
                for (ProductApplyAddRange productApplyAddRange : productApply.productApplyAddRanges()) {
                    ProductOrgDetail productOrgDetail = new ProductOrgDetail();
                    productOrgDetail.setEntityStatus(EntityStatus.Insert);
                    productOrgDetail.setOrgId(productApplyAddRange.getOrgId());
                    productOrgDetail.setProductOrgData(productApplyAddRange.getProductOrgData());
                    productOrgDetailList.add(productOrgDetail);
                }
            } else {
                List materialOrgDetailPOs = this.productApplyQueryDao.listProductOrgDetailByProductApplyId((Long)productApply.getId());
                Map<String, MaterialOrgDetailPO> productOrgDetailMap = materialOrgDetailPOs.stream().collect(Collectors.toMap(MaterialOrgDetailPO::getOrgId, materialOrgDetail -> materialOrgDetail));
                for (ProductApplyAddRange productApplyAddRange : productApply.productApplyAddRanges()) {
                    ProductOrgDetail productOrgDetail = new ProductOrgDetail();
                    if (productOrgDetailMap.get(productApplyAddRange.getOrgId()) != null) {
                        productOrgDetail.setEntityStatus(productApplyAddRange.getEntityStatus());
                        productOrgDetail.setOrgId(productApplyAddRange.getOrgId());
                        productOrgDetail.setProductOrgData(productApplyAddRange.getProductOrgData());
                        productOrgDetail.setProductApplyId((Long)productApply.getId());
                        productOrgDetail.setId((Object)productOrgDetailMap.get(productApplyAddRange.getOrgId()).getId());
                    } else {
                        productOrgDetail.setEntityStatus(EntityStatus.Insert);
                        productOrgDetail.setOrgId(productApplyAddRange.getOrgId());
                        productOrgDetail.setProductOrgData(productApplyAddRange.getProductOrgData());
                    }
                    productOrgDetailList.add(productOrgDetail);
                }
            }
            productApply.setProductOrgDetails(productOrgDetailList);
        }
    }

    private void checkProductApplyAddRange(ProductApply productApply) throws Exception {
        if (productApply.getApplyType() == ProductApplyType.ADD_RANGE) {
            if (CollectionUtils.isEmpty((Collection)productApply.productApplyAddRanges())) {
                return;
            }
            Long productId = productApply.getApplyProductId();
            Product originalProduct = this.productGroupDao.getProductById(productId);
            if (originalProduct != null) {
                List productApplyAddRangeInDbList;
                HashSet<String> orgIdSet = new HashSet<String>();
                ArrayList<String> addRangeIdList = new ArrayList<String>();
                int orgIdCount = 0;
                List originalProductApplyRangeList = this.productGroupDao.getProductApplyRangeByProductId(AppContext.getCurrentUser().getYTenantId(), productId);
                if (CollectionUtils.isEmpty((Collection)originalProductApplyRangeList)) {
                    throw new CoreDocBusinessException(CoreDocBusinessErrorEnum.PRODUCT_APPLY_RANGE_NOT_FOUND_FOR_APPLY);
                }
                List originalMerchantApplyRangeOrgIdList = originalProductApplyRangeList.stream().filter(Objects::nonNull).map(ProductApplyRange::getOrgId).collect(Collectors.toList());
                for (ProductApplyAddRange productApplyAddRange : productApply.productApplyAddRanges()) {
                    if (productApplyAddRange.getEntityStatus() == EntityStatus.Insert || productApplyAddRange.getEntityStatus() == EntityStatus.Update) {
                        orgIdSet.add(productApplyAddRange.getOrgId());
                        ++orgIdCount;
                        if (!CollectionUtils.isEmpty(originalMerchantApplyRangeOrgIdList) && originalMerchantApplyRangeOrgIdList.contains(productApplyAddRange.getOrgId())) {
                            throw new CoreDocBusinessException(CoreDocBusinessErrorEnum.PRODUCT_APPLY_RANGE_ALREADY_EXISTS);
                        }
                    }
                    addRangeIdList.add((String)productApplyAddRange.getId());
                }
                if (productApply.getEntityStatus() == EntityStatus.Update && !CollectionUtils.isEmpty((Collection)(productApplyAddRangeInDbList = this.productApplyAddRangeDao.getApplyAddRangeListByNotInId((Long)productApply.getId(), addRangeIdList)))) {
                    orgIdCount += productApplyAddRangeInDbList.size();
                    productApplyAddRangeInDbList.forEach(customerApplyAddRangeInDb -> orgIdSet.add(customerApplyAddRangeInDb.getOrgId()));
                }
                if (orgIdSet.size() != orgIdCount) {
                    throw new CoreDocBusinessException(CoreDocBusinessErrorEnum.PRODUCT_APPLY_RANGE_ORG_REPEAT);
                }
            } else {
                throw new CoreDocBusinessException(CoreDocBusinessErrorEnum.PRODUCT_APPLY_DATA_NOT_EXIST_IN_APPLY_BILL);
            }
        }
    }

    private void supplementaryData(ProductApply productApply) throws Exception {
        if (productApply.getApplyType() == ProductApplyType.ADD_RANGE) {
            BillDataDto bill = new BillDataDto("pc_product", productApply.getApplyProductId().toString());
            Map productData = this.billService.detail(bill);
            productApply.setProductData(UpcJacksonUtils.OBJECT_MAPPER.writeValueAsString((Object)productData));
            if (!CollectionUtils.isEmpty((Map)productData)) {
                BizObject productBizObject = Objectlizer.convert((Map)productData, (String)"pc.product.Product");
                productApply.setProductCode(productData.get("code").toString());
                String productName = (String)MultilangUtil.getAttr((String)"pc.product.Product", (String)"name", (BizObject)productBizObject, null);
                productApply.setProductName(productName);
                productApply.setRangeOrgId(productData.get("orgId").toString());
            }
        }
    }

    private void checkProductApplyAddRangeIsNull(ProductApply productApply) throws Exception {
        List productApplyAddRangeList;
        if (productApply.getApplyProductId() == null) {
            throw new CoreDocBusinessException(CoreDocBusinessErrorEnum.PRODUCT_APPLY_RANGE_ORG_PRODUCT_NOT_NULL);
        }
        if (productApply.getEntityStatus() == EntityStatus.Insert) {
            List productApplyAddRangeList2 = productApply.productApplyAddRanges();
            if (CollectionUtils.isEmpty((Collection)productApplyAddRangeList2)) {
                throw new CoreDocBusinessException(CoreDocBusinessErrorEnum.PRODUCT_APPLY_RANGE_ORG_NOT_NULL);
            }
            for (ProductApplyAddRange productApplyAddRange : productApplyAddRangeList2) {
                if (!StringUtils.isEmpty((CharSequence)productApplyAddRange.getOrgId())) continue;
                throw new CoreDocBusinessException(CoreDocBusinessErrorEnum.PRODUCT_APPLY_RANGE_ORG_NOT_NULL);
            }
        } else if (productApply.getEntityStatus() == EntityStatus.Update && !CollectionUtils.isEmpty((Collection)(productApplyAddRangeList = productApply.productApplyAddRanges()))) {
            List productApplyAddRangeInDbList;
            ArrayList<String> deleteAddRangeIds = new ArrayList<String>();
            for (ProductApplyAddRange productApplyAddRange : productApplyAddRangeList) {
                if (productApplyAddRange.getEntityStatus() == EntityStatus.Insert && StringUtils.isEmpty((CharSequence)productApplyAddRange.getOrgId())) {
                    throw new CoreDocBusinessException(CoreDocBusinessErrorEnum.PRODUCT_APPLY_RANGE_ORG_NOT_NULL);
                }
                if (productApplyAddRange.getEntityStatus() == EntityStatus.Update && productApplyAddRange.containsKey((Object)"orgId") && StringUtils.isEmpty((CharSequence)productApplyAddRange.getOrgId())) {
                    throw new CoreDocBusinessException(CoreDocBusinessErrorEnum.PRODUCT_APPLY_RANGE_ORG_NOT_NULL);
                }
                if (productApplyAddRange.getEntityStatus() != EntityStatus.Delete || productApplyAddRange.getId() == null) continue;
                deleteAddRangeIds.add((String)productApplyAddRange.getId());
            }
            if (!CollectionUtils.isEmpty(deleteAddRangeIds) && CollectionUtils.isEmpty((Collection)(productApplyAddRangeInDbList = this.productApplyAddRangeDao.getApplyAddRangeListByNotInId((Long)productApply.getId(), deleteAddRangeIds))) && productApplyAddRangeList.size() == deleteAddRangeIds.size()) {
                throw new CoreDocBusinessException(CoreDocBusinessErrorEnum.PRODUCT_APPLY_RANGE_ORG_NOT_NULL);
            }
        }
    }

    private void checkProductProperties(ProductApply productApply) throws Exception {
        Product product = (Product)Objectlizer.decodeObj((Json)new Json(productApply.getProductData()), (String)"pc.product.Product");
        if (ProductApplyType.add == productApply.getApplyType()) {
            product.put("_status", (Object)EntityStatus.Insert);
            product.detail().put("_status", (Object)EntityStatus.Insert);
        } else {
            product.put("_status", (Object)EntityStatus.Update);
            product.detail().put("_status", (Object)EntityStatus.Update);
        }
        this.productFormatCheck(product);
        this.productCheckService.checkNameAndModelDescription(product, productApply, null);
        this.useSkuService.checkProductUseSku(product);
        this.checkManageByInventoryAndOther(product);
        if (!CollectionUtils.isEmpty((Collection)product.productAssistUnitExchanges())) {
            this.productDataProcessRule.processAssistUnitExchanges(product);
        }
        this.productDataProcessRule.verify(product);
    }

    private void productFormatCheck(Product product) {
        product.put("tenant", AppContext.getCurrentUser().getTenant());
        product.put("ytenant", (Object)AppContext.getCurrentUser().getYTenantId());
        BizObjectUtils.addTenantValueForBizObject((BizObject)product, (int)0);
        FormatCheckWalker formatCheckWalker = new FormatCheckWalker();
        ObjectFullWalker.walk((ChainWalker)formatCheckWalker, (BizObject)product, (String)"pc.product.Product");
    }

    private void checkManageByInventoryAndOther(Product product) {
        String valueManageType = null;
        String checkByProject = null;
        String checkBySalesOrders = null;
        String checkByClient = null;
        String checkByOutsourcing = null;
        String manageByInventory = null;
        String projectTrackStrategy = null;
        if (product.detail() != null) {
            if (product.detail().get("valueManageType") != null) {
                valueManageType = product.detail().get("valueManageType").toString();
            }
            if (product.detail().get("checkByProject") != null) {
                checkByProject = product.detail().get("checkByProject").toString();
            }
            if (product.detail().get("checkBySalesOrders") != null) {
                checkBySalesOrders = product.detail().get("checkBySalesOrders").toString();
            }
            if (product.detail().get("checkByClient") != null) {
                checkByClient = product.detail().get("checkByClient").toString();
            }
            if (product.detail().get("checkByOutsourcing") != null) {
                checkByOutsourcing = product.detail().get("checkByOutsourcing").toString();
            }
            if (product.detail().get("manageByInventory") != null) {
                manageByInventory = product.detail().get("manageByInventory").toString();
            }
            if (product.detail().get("projectTrackStrategy") != null) {
                projectTrackStrategy = product.detail().get("projectTrackStrategy").toString();
            }
            this.productCheckService.checkManageByInventory(manageByInventory, checkByProject, projectTrackStrategy);
            this.productCheckService.checkValueManageType(valueManageType, checkByProject, checkBySalesOrders, checkByClient, checkByOutsourcing);
        }
    }

    private void prepare(ProductApply productApply) {
        String local = ZH_CN;
        Object objName = productApply.get("name");
        if (null == objName) {
            return;
        }
        if (objName instanceof JSONObject) {
            if (null != AppContext.getLocale()) {
                local = AppContext.getLocale();
            }
            productApply.put("name", (Object)((JSONObject)objName).getString(local));
        }
    }

    public void checkDecimalForApplyCheck(ProductApply productApply) {
        String productData = productApply.getProductData();
        if (StringUtils.isEmpty((CharSequence)productData)) {
            throw new CoreDocBusinessException(CoreDocBusinessErrorEnum.PRODUCT_APPLY_PRODUCT_DATA_NOT_NULL);
        }
        Map product = (Map)JSONObject.parseObject((String)productData, Map.class);
        if (product.get("detail!lInventoryCount") != null && !this.checkDecimalDigits(String.valueOf(product.get("detail!lInventoryCount"))).booleanValue()) {
            throw new CoreDocBusinessException(CoreDocBusinessErrorEnum.PRODUCT_APPLY_ONLINE_STOCK_MORE_THAN_LIMIT);
        }
        if (product.get("length") != null && !this.checkDecimalDigits(String.valueOf(product.get("length"))).booleanValue()) {
            throw new CoreDocBusinessException(CoreDocBusinessErrorEnum.PRODUCT_APPLY_LENGTH_MORE_THAN_LIMIT);
        }
        if (product.get("width") != null && !this.checkDecimalDigits(String.valueOf(product.get("width"))).booleanValue()) {
            throw new CoreDocBusinessException(CoreDocBusinessErrorEnum.PRODUCT_APPLY_WIDTH_MORE_THAN_LIMIT);
        }
        if (product.get("height") != null && !this.checkDecimalDigits(String.valueOf(product.get("height"))).booleanValue()) {
            throw new CoreDocBusinessException(CoreDocBusinessErrorEnum.PRODUCT_APPLY_HEIGHT_MORE_THAN_LIMIT);
        }
        if (product.get("netWeight") != null && !this.checkDecimalDigits(String.valueOf(product.get("netWeight"))).booleanValue()) {
            throw new CoreDocBusinessException(CoreDocBusinessErrorEnum.PRODUCT_APPLY_NET_WEIGHT_MORE_THAN_LIMIT);
        }
        if (product.get("weight") != null && !this.checkDecimalDigits(String.valueOf(product.get("weight"))).booleanValue()) {
            throw new CoreDocBusinessException(CoreDocBusinessErrorEnum.PRODUCT_APPLY_WEIGHT_MORE_THAN_LIMIT);
        }
        if (product.get("volume") != null && !this.checkDecimalDigits(String.valueOf(product.get("volume"))).booleanValue()) {
            throw new CoreDocBusinessException(CoreDocBusinessErrorEnum.PRODUCT_APPLY_VOLUME_MORE_THAN_LIMIT);
        }
        if (product.get("detail!batchPrice") != null && !this.checkDecimalDigits(String.valueOf(product.get("detail!batchPrice"))).booleanValue()) {
            throw new CoreDocBusinessException(CoreDocBusinessErrorEnum.PRODUCT_APPLY_BATCH_PRICE_MORE_THAN_LIMIT);
        }
        if (product.get("detail!fMarkPrice") != null && !this.checkDecimalDigits(product.get("detail!fMarkPrice").toString()).booleanValue()) {
            throw new CoreDocBusinessException(CoreDocBusinessErrorEnum.PRODUCT_APPLY_MARK_PRICE_MORE_THAN_LIMIT);
        }
        if (product.get("detail!fLowestMarkPrice") != null && !this.checkDecimalDigits(product.get("detail!fLowestMarkPrice").toString()).booleanValue()) {
            throw new CoreDocBusinessException(CoreDocBusinessErrorEnum.PRODUCT_APPLY_LOWEST_MARK_PRICE_MORE_THAN_LIMIT);
        }
        if (product.get("detail!fSalePrice") != null && !this.checkDecimalDigits(product.get("detail!fSalePrice").toString()).booleanValue()) {
            throw new CoreDocBusinessException(CoreDocBusinessErrorEnum.PRODUCT_APPLY_SALE_PRICE_MORE_THAN_LIMIT);
        }
        if (product.get("detail!fMarketPrice") != null && !this.checkDecimalDigits(product.get("detail!fMarketPrice").toString()).booleanValue()) {
            throw new CoreDocBusinessException(CoreDocBusinessErrorEnum.PRODUCT_APPLY_MARKET_PRICE_MORE_THAN_LIMIT);
        }
        if (product.get("detail!fPrimeCosts") != null && !this.checkDecimalDigits(product.get("detail!fPrimeCosts").toString()).booleanValue()) {
            throw new CoreDocBusinessException(CoreDocBusinessErrorEnum.PRODUCT_APPLY_PRIME_COSTS_MORE_THAN_LIMIT);
        }
        if (product.get("detail!fMaxPrimeCosts") != null && !this.checkDecimalDigits(product.get("detail!fMaxPrimeCosts").toString()).booleanValue()) {
            throw new CoreDocBusinessException(CoreDocBusinessErrorEnum.PRODUCT_APPLY_MAX_PRIME_COSTS_MORE_THAN_LIMIT);
        }
        if (product.get("detail!purchaseOrderQuantity") != null && !this.checkDecimalDigits(product.get("detail!purchaseOrderQuantity").toString()).booleanValue()) {
            throw new CoreDocBusinessException(CoreDocBusinessErrorEnum.PRODUCT_APPLY_PURCHASE_ORDER_QUANTITY_MORE_THAN_LIMIT);
        }
        if (product.get("detail!purchaseTimes") != null && !this.checkDecimalDigits(product.get("detail!purchaseTimes").toString()).booleanValue()) {
            throw new CoreDocBusinessException(CoreDocBusinessErrorEnum.PRODUCT_APPLY_PURCHASE_TIMES_MORE_THAN_LIMIT);
        }
        if (product.get("detail!safetyStock") != null && !this.checkDecimalDigits(product.get("detail!safetyStock").toString()).booleanValue()) {
            throw new CoreDocBusinessException(CoreDocBusinessErrorEnum.PRODUCT_APPLY_SAFETY_STOCK_MORE_THAN_LIMIT);
        }
        if (product.get("detail!highestStock") != null && !this.checkDecimalDigits(product.get("detail!highestStock").toString()).booleanValue()) {
            throw new CoreDocBusinessException(CoreDocBusinessErrorEnum.PRODUCT_APPLY_HIGHEST_STOCK_MORE_THAN_LIMIT);
        }
        if (product.get("detail!lowestStock") != null && !this.checkDecimalDigits(product.get("detail!lowestStock").toString()).booleanValue()) {
            throw new CoreDocBusinessException(CoreDocBusinessErrorEnum.PRODUCT_APPLY_LOWEST_STOCK_MORE_THAN_LIMIT);
        }
        if (product.get("detail!ropStock") != null && !this.checkDecimalDigits(product.get("detail!ropStock").toString()).booleanValue()) {
            throw new CoreDocBusinessException(CoreDocBusinessErrorEnum.PRODUCT_APPLY_ROP_STOCK_MORE_THAN_LIMIT);
        }
        if (product.get("detail!iMinOrderQuantity") != null && !this.checkDecimalDigits(product.get("detail!iMinOrderQuantity").toString()).booleanValue()) {
            throw new CoreDocBusinessException(CoreDocBusinessErrorEnum.PRODUCT_APPLY_MIN_ORDER_QUANTITY_MORE_THAN_LIMIT);
        }
        if (product.get("detail!deposits") != null && !this.checkDecimalDigits(product.get("detail!deposits").toString()).booleanValue()) {
            throw new CoreDocBusinessException(CoreDocBusinessErrorEnum.PRODUCT_APPLY_DEPOSITS_MORE_THAN_LIMIT);
        }
        if (product.get("detail!depositPercentage") != null && !this.checkDecimalDigits(product.get("detail!depositPercentage").toString()).booleanValue()) {
            throw new CoreDocBusinessException(CoreDocBusinessErrorEnum.PRODUCT_APPLY_DEPOSIT_PERCENTAGE_MORE_THAN_LIMIT);
        }
        if (product.get("detail!minimumDeposits") != null && !this.checkDecimalDigits(product.get("detail!minimumDeposits").toString()).booleanValue()) {
            throw new CoreDocBusinessException(CoreDocBusinessErrorEnum.PRODUCT_APPLY_MINIMUM_DEPOSITS_MORE_THAN_LIMIT);
        }
        if (product.get("detail!fSettleAccountsRate") != null && !this.checkDecimalDigits(product.get("detail!fSettleAccountsRate").toString()).booleanValue()) {
            throw new CoreDocBusinessException(CoreDocBusinessErrorEnum.PRODUCT_APPLY_SETTLE_ACCOUNTS_RATE_MORE_THAN_LIMIT);
        }
        if (product.get("detail!serviceDuration") != null && !this.checkDecimalDigits(product.get("detail!serviceDuration").toString()).booleanValue()) {
            throw new CoreDocBusinessException(CoreDocBusinessErrorEnum.PRODUCT_APPLY_SERVICE_DURATION_MORE_THAN_LIMIT);
        }
        if (product.get("detail!fNoTaxCostPrice") != null && !this.checkDecimalDigits(product.get("detail!fNoTaxCostPrice").toString()).booleanValue()) {
            throw new CoreDocBusinessException(CoreDocBusinessErrorEnum.PRODUCT_APPLY_NO_TAX_COST_PRICE_MORE_THAN_LIMIT);
        }
        if (product.get("detail!planProduceLimit") != null && !this.checkDecimalDigits(product.get("detail!planProduceLimit").toString()).booleanValue()) {
            throw new CoreDocBusinessException(CoreDocBusinessErrorEnum.PRODUCT_APPLY_PLAN_PRODUCE_MORE_THAN_LIMIT);
        }
        if (product.get("detail!doubleReplenish") != null && !this.checkDecimalDigits(product.get("detail!doubleReplenish").toString()).booleanValue()) {
            throw new CoreDocBusinessException(CoreDocBusinessErrorEnum.PRODUCT_APPLY_DOUBLE_REPLENISH_MORE_THAN_LIMIT);
        }
        if (product.get("detail!minBatchPrice") != null && !this.checkDecimalDigits(product.get("detail!minBatchPrice").toString()).booleanValue()) {
            throw new CoreDocBusinessException(CoreDocBusinessErrorEnum.PRODUCT_APPLY_MIN_BATCH_PRICE_MORE_THAN_LIMIT);
        }
        if (product.get("detail!maxBatchPrice") != null && !this.checkDecimalDigits(product.get("detail!maxBatchPrice").toString()).booleanValue()) {
            throw new CoreDocBusinessException(CoreDocBusinessErrorEnum.PRODUCT_APPLY_MAX_BATCH_PRICE_MORE_THAN_LIMIT);
        }
        if (product.get("detail!iDoubleSale") != null && !this.checkDecimalDigits(product.get("detail!iDoubleSale").toString()).booleanValue()) {
            throw new CoreDocBusinessException(CoreDocBusinessErrorEnum.PRODUCT_APPLY_DOUBLE_SALE_MORE_THAN_LIMIT);
        }
    }

    public Boolean checkDecimalDigits(String value) {
        if (StringUtils.isEmpty((CharSequence)value)) {
            return true;
        }
        try {
            value = new BigDecimal(value).toPlainString();
        }
        catch (Exception e) {
            this.logger.error("\u6570\u636e\u7c7b\u578b\u4e0d\u5408\u6cd5{%s}", (Object)value, (Object)e);
            throw new CoreDocBusinessException(CoreDocBusinessErrorEnum.PRODUCT_APPLY_DATA_TYPE_ILLEGAL, new Object[]{value});
        }
        if (value.indexOf(".") > -1) {
            value = value.substring(0, value.indexOf("."));
        }
        Matcher matcher = DIGITS_PATTERN.matcher(value);
        return matcher.matches();
    }
}


/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.yonyou.iuap.apdoc.coredoc.enums.CoreDocBusinessErrorEnum
 *  com.yonyou.iuap.apdoc.coredoc.exceptions.CoreDocBusinessException
 *  com.yonyou.ucf.mdd.common.model.rule.RuleExecuteResult
 *  com.yonyou.ucf.mdd.ext.bill.dto.BillDataDto
 *  com.yonyou.ucf.mdd.ext.bill.rule.base.AbstractCommonRule
 *  com.yonyou.ucf.mdd.ext.core.AppContext
 *  com.yonyou.ucf.mdd.ext.dao.meta.MetaDaoHelper
 *  com.yonyou.ucf.mdd.ext.model.BillContext
 *  com.yonyou.ucf.mdd.ext.model.LoginUser
 *  com.yonyou.ucf.mdd.ext.option.util.OptionUtils
 *  com.yonyou.ucf.mdd.ext.util.DateKit
 *  com.yonyoucloud.upc.common.enums.OrgGroupTypeEnum
 *  com.yonyoucloud.upc.data.product.ProductApplyRangeDao
 *  com.yonyoucloud.upc.pc.product.Product
 *  com.yonyoucloud.upc.pc.product.ProductApplyRange
 *  com.yonyoucloud.upc.pc.product.ProductDetail
 *  com.yonyoucloud.upc.pc.product.ProductSKU
 *  com.yonyoucloud.upc.pc.product.ProductSKUDetail
 *  com.yonyoucloud.upc.pc.product.ProductSKUExtend
 *  com.yonyoucloud.upc.pc.product.ProductSkuDetailNew
 *  com.yonyoucloud.upc.service.utils.PubOptionDataQueryUtil
 *  org.imeta.orm.base.BizObject
 *  org.imeta.orm.base.EntityStatus
 *  org.imeta.orm.schema.ConditionExpression
 *  org.imeta.orm.schema.QueryCondition
 *  org.imeta.orm.schema.QueryConditionGroup
 *  org.imeta.orm.schema.QuerySchema
 *  org.imeta.spring.support.id.IdManager
 *  org.springframework.beans.factory.annotation.Autowired
 *  org.springframework.stereotype.Component
 *  org.springframework.util.CollectionUtils
 */
package com.yonyoucloud.upc.billrule.product;

import com.yonyou.iuap.apdoc.coredoc.enums.CoreDocBusinessErrorEnum;
import com.yonyou.iuap.apdoc.coredoc.exceptions.CoreDocBusinessException;
import com.yonyou.ucf.mdd.common.model.rule.RuleExecuteResult;
import com.yonyou.ucf.mdd.ext.bill.dto.BillDataDto;
import com.yonyou.ucf.mdd.ext.bill.rule.base.AbstractCommonRule;
import com.yonyou.ucf.mdd.ext.core.AppContext;
import com.yonyou.ucf.mdd.ext.dao.meta.MetaDaoHelper;
import com.yonyou.ucf.mdd.ext.model.BillContext;
import com.yonyou.ucf.mdd.ext.model.LoginUser;
import com.yonyou.ucf.mdd.ext.option.util.OptionUtils;
import com.yonyou.ucf.mdd.ext.util.DateKit;
import com.yonyoucloud.iuap.upc.api.service.IUPCProductUpdateService;
import com.yonyoucloud.upc.common.enums.OrgGroupTypeEnum;
import com.yonyoucloud.upc.data.product.ProductApplyRangeDao;
import com.yonyoucloud.upc.pc.product.Product;
import com.yonyoucloud.upc.pc.product.ProductApplyRange;
import com.yonyoucloud.upc.pc.product.ProductDetail;
import com.yonyoucloud.upc.pc.product.ProductSKU;
import com.yonyoucloud.upc.pc.product.ProductSKUDetail;
import com.yonyoucloud.upc.pc.product.ProductSKUExtend;
import com.yonyoucloud.upc.pc.product.ProductSkuDetailNew;
import com.yonyoucloud.upc.service.ProductSkuAsyncSaveService;
import com.yonyoucloud.upc.service.ProductSkuService;
import com.yonyoucloud.upc.service.utils.ProductUtil;
import com.yonyoucloud.upc.service.utils.PubOptionDataQueryUtil;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;
import org.imeta.orm.base.BizObject;
import org.imeta.orm.base.EntityStatus;
import org.imeta.orm.schema.ConditionExpression;
import org.imeta.orm.schema.QueryCondition;
import org.imeta.orm.schema.QueryConditionGroup;
import org.imeta.orm.schema.QuerySchema;
import org.imeta.spring.support.id.IdManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.util.CollectionUtils;

@Component(value="productDefaultSKURule")
public class ProductDefaultSKURule
extends AbstractCommonRule {
    public static final HashMap<String, String> COPY_FIELDS = new HashMap();
    @Autowired
    private IUPCProductUpdateService upcProductUpdateService;
    @Autowired
    ProductSkuService productSkuService;
    @Autowired
    ProductSkuAsyncSaveService productSkuAsyncSaveService;
    @Autowired
    PubOptionDataQueryUtil pubOptionDataQueryUtil;
    @Autowired
    ProductApplyRangeDao productApplyRangeDao;

    public RuleExecuteResult execute(BillContext billContext, Map<String, Object> paramMap) throws Exception {
        BillDataDto billDataDto = (BillDataDto)this.getParam(paramMap);
        if (null == billContext || billDataDto == null) {
            return new RuleExecuteResult();
        }
        if ("save".equals(billContext.getAction())) {
            this.doSave(billContext, paramMap);
        } else if ("detail".equals(billContext.getAction())) {
            this.doDetail(billContext, paramMap);
        }
        return new RuleExecuteResult();
    }

    private void doDetail(BillContext billContext, Map<String, Object> paramMap) {
        Map data = (Map)paramMap.get("return");
        if (data == null) {
            return;
        }
        if (!data.containsKey("productskus")) {
            return;
        }
        List skus = (List)data.get("productskus");
        skus.stream().filter(sku -> sku.get("isSKU").equals(0)).collect(Collectors.toList()).forEach(skus::remove);
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private void doSave(BillContext billContext, Map<String, Object> paramMap) throws Exception {
        List bills = this.getBills(billContext, paramMap);
        for (int i = 0; i < bills.size(); ++i) {
            HashMap<String, Object> detail;
            Optional<Map> defaultsku;
            Product product = (Product)bills.get(i);
            if (this.productSkuService.isSkuSens(product.getId()) || 0 == product.getUseSku()) {
                this.updateProductDefaultSku(product.getId());
                return;
            }
            QuerySchema productSKUSchema = QuerySchema.create().addSelect("id as id , code as code, isSKU as isSKU").addCondition((ConditionExpression)QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"productId").eq(product.getId())}));
            List skus = MetaDaoHelper.query((String)"pc.product.ProductSKU", (QuerySchema)productSKUSchema);
            boolean isShowSpec = this.isUseSpec(product.getProductTemplate());
            HashMap<String, Object> params = new HashMap<String, Object>();
            params.put("productApplyRangeId", product.get("productApplyRangeId"));
            Map productApplyRangeMap = (Map)MetaDaoHelper.queryById((String)"pc.product.ProductApplyRange", (String)"id,productDetailId", (Object)product.get("productApplyRangeId").toString()).get(0);
            Long productDetailId = Long.parseLong(productApplyRangeMap.get("productDetailId").toString());
            QueryConditionGroup productRangeGroupCondition = QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"productId").eq(product.getId()), QueryCondition.name((String)"orgGroupType").not_eq((Object)"1")});
            QuerySchema productRangeGroupSchema = QuerySchema.create().addSelect("id,productId,orgGroupType,productDetailId").addCondition((ConditionExpression)productRangeGroupCondition);
            List productApplyRangeGroupList = MetaDaoHelper.query((String)"pc.product.ProductApplyRangeGroup", (QuerySchema)productRangeGroupSchema);
            if (CollectionUtils.isEmpty((Collection)productApplyRangeGroupList)) {
                HashMap<String, Object> productApplyRangeGroupTemp = new HashMap<String, Object>();
                productApplyRangeGroupTemp.put("productId", product.getId());
                productApplyRangeGroupTemp.put("orgGroupType", "0");
                productApplyRangeGroupTemp.put("productDetailId", productDetailId);
                productApplyRangeGroupList.add(productApplyRangeGroupTemp);
            }
            List productDetailList = productApplyRangeGroupList.stream().map(map -> Long.parseLong(map.get("productDetailId").toString())).collect(Collectors.toList());
            params.put("productDetailIds", productDetailList);
            params.put("productid", product.get("id"));
            params.put("ytenant", AppContext.getYTenantId());
            if (product.get("isCreator").equals(true)) {
                if (skus == null || skus.isEmpty()) {
                    this.generateDefaultSKU(product, params, isShowSpec, productApplyRangeGroupList);
                } else if (skus.stream().anyMatch(sku -> sku.get("isSKU").equals(0))) {
                    ProductSkuDetailNew productSkuDetailNew;
                    defaultsku = skus.stream().filter(map -> map.get("isSKU").equals(0)).findAny();
                    product.setDefaultSKUId((Long)defaultsku.get().get("id"));
                    detail = new HashMap<String, Object>();
                    QueryConditionGroup groupForSkuDetailNew = QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"productId").eq(product.getId()), QueryCondition.name((String)"skuId.isSKU").eq((Object)0), QueryCondition.name((String)"productDetailId").in(productDetailList)});
                    List productSkuDetailNewResultMapList = MetaDaoHelper.query((String)"pc.product.ProductSkuDetailNew", (QuerySchema)QuerySchema.create().addSelect(new String[]{"id", "productDetailId"}).addCondition((ConditionExpression)groupForSkuDetailNew));
                    detail.put("skuId", ((Map)skus.stream().filter(sku -> sku.get("isSKU").equals(0)).collect(Collectors.toList()).get(0)).get("id"));
                    params.put("skuid", detail.get("skuId"));
                    params.put("skuId", detail.get("skuId"));
                    detail.put("productId", product.getId());
                    if (productSkuDetailNewResultMapList == null || productSkuDetailNewResultMapList.isEmpty()) {
                        ArrayList<ProductSkuDetailNew> productSkuDetailNewList = new ArrayList<ProductSkuDetailNew>(productApplyRangeGroupList.size());
                        for (Map productApplyRangeGroup : productApplyRangeGroupList) {
                            this.copyValues(product, detail, (Long)productApplyRangeGroup.get("productDetailId"));
                            detail.put("_status", EntityStatus.Insert);
                            detail.put("id", IdManager.getInstance().nextId());
                            ProductSKUExtend extend = new ProductSKUExtend();
                            extend.init(detail);
                            if (isShowSpec) {
                                extend.setStopstatus(Boolean.valueOf(true));
                                extend.setStatus(Boolean.valueOf(false));
                                extend.setStatus_b(Boolean.valueOf(false));
                                extend.setUstatus(Boolean.valueOf(false));
                                extend.setUstatus_b(Boolean.valueOf(false));
                            }
                            params.put("status", extend.getStatus());
                            params.put("ustatus", extend.getUstatus());
                            productSkuDetailNew = new ProductSkuDetailNew();
                            productSkuDetailNew.putAll((Map)extend);
                            productSkuDetailNew.put("id", (Object)IdManager.getInstance().nextId());
                            productSkuDetailNew.setProductDetailId((Long)productApplyRangeGroup.get("productDetailId"));
                            productSkuDetailNewList.add(productSkuDetailNew);
                        }
                        MetaDaoHelper.insert((String)"pc.product.ProductSkuDetailNew", productSkuDetailNewList);
                    } else {
                        List productSkuDetailList = productSkuDetailNewResultMapList.stream().map(map -> (Long)map.get("productDetailId")).collect(Collectors.toList());
                        for (Map productApplyRangeGroup : productApplyRangeGroupList) {
                            this.copyValues(product, detail, (Long)productApplyRangeGroup.get("productDetailId"));
                            ProductSKUExtend skuExtend = new ProductSKUExtend();
                            skuExtend.init(detail);
                            params.put("status", skuExtend.getStatus());
                            params.put("ustatus", skuExtend.getUstatus());
                            params.put("skuId", detail.get("skuId"));
                            productSkuDetailNew = new ProductSkuDetailNew();
                            productSkuDetailNew.putAll((Map)skuExtend);
                            productSkuDetailNew.put("id", ((Map)productSkuDetailNewResultMapList.get(0)).get("id"));
                            productSkuDetailNew.setProductDetailId((Long)productApplyRangeGroup.get("productDetailId"));
                            if (productSkuDetailList.contains((Long)productApplyRangeGroup.get("productDetailId"))) {
                                productSkuDetailNew.put("_status", (Object)EntityStatus.Update);
                                MetaDaoHelper.update((String)"pc.product.ProductSkuDetailNew", (BizObject)productSkuDetailNew);
                                continue;
                            }
                            productSkuDetailNew.put("id", (Object)IdManager.getInstance().nextId());
                            productSkuDetailNew.put("_status", (Object)EntityStatus.Insert);
                            MetaDaoHelper.insert((String)"pc.product.ProductSkuDetailNew", (BizObject)productSkuDetailNew);
                        }
                    }
                    ProductSKU sku2 = new ProductSKU();
                    sku2.setId(detail.get("skuId"));
                    sku2.setEntityStatus(EntityStatus.Update);
                    sku2.setCode(product.getCode());
                    sku2.put("name", product.get("name"));
                    sku2.put("model", product.get("model"));
                    sku2.put("modelDescription", ProductDefaultSKURule.subModelDescription(product.get("modelDescription")));
                    sku2.setErpCode(product.getErpCode());
                    sku2.setWeight(product.getWeight());
                    sku2.setVolume(product.getVolume());
                    MetaDaoHelper.update((String)"pc.product.ProductSKU", (BizObject)sku2);
                    if (null != params.get("status") || null != params.get("ustatus")) {
                        this.upcProductUpdateService.UpdateUpDownCountOfCreatorbyParams(params);
                    }
                    this.upcProductUpdateService.UpdateSKUOrderPropsSKUIDNew(params);
                }
                this.upcProductUpdateService.UpdateMaxMinBatchPriceNew(params);
                continue;
            }
            if (skus == null || skus.isEmpty()) {
                if (!ProductUtil.getIsUpdateProductGlobalFields()) throw new CoreDocBusinessException(CoreDocBusinessErrorEnum.PRODUCT_SHOP_HAS_BEEN_MODIFIED, new Object[]{product.getCode()});
                this.generateDefaultSKUByCreatorOrg(product, isShowSpec, params, productApplyRangeGroupList);
            } else if (skus.stream().anyMatch(sku -> sku.get("isSKU").equals(0))) {
                ProductSkuDetailNew productSkuDetailNew;
                ProductSKUDetail skuDetail;
                defaultsku = skus.stream().filter(map -> map.get("isSKU").equals(0)).findAny();
                product.setDefaultSKUId((Long)defaultsku.get().get("id"));
                if (skus.stream().anyMatch(sku -> sku.get("isSKU").equals(1))) {
                    throw new CoreDocBusinessException(CoreDocBusinessErrorEnum.PRODUCT_SHOP_SKU_ERROR, new Object[]{product.getCode()});
                }
                detail = new HashMap();
                QueryConditionGroup group = QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"productId").eq(product.getId()), QueryCondition.name((String)"productApplyRangeId").eq(product.get("productApplyRangeId")), QueryCondition.name((String)"skuId.isSKU").eq((Object)0)});
                List result = MetaDaoHelper.query((String)"pc.product.ProductSkuDetailNew", (QuerySchema)QuerySchema.create().addSelect("id").addCondition((ConditionExpression)group));
                if (result != null && result.size() > 1) {
                    throw new CoreDocBusinessException(CoreDocBusinessErrorEnum.PRODUCT_SHOP_DEFAULT_SKU_ERROR, new Object[]{product.getCode()});
                }
                detail.put("skuId", ((Map)skus.stream().filter(sku -> sku.get("isSKU").equals(0)).collect(Collectors.toList()).get(0)).get("id"));
                params.put("skuid", detail.get("skuId"));
                detail.put("productId", product.getId());
                detail.put("productApplyRangeId", product.get("productApplyRangeId"));
                this.copyValues((ProductDetail)product.productDetail().get(0), detail);
                if (result == null || result.isEmpty()) {
                    detail.put("_status", EntityStatus.Insert);
                    detail.put("id", IdManager.getInstance().nextId());
                    skuDetail = new ProductSKUDetail();
                    skuDetail.init(detail);
                    if (isShowSpec) {
                        skuDetail.setStopstatus(Boolean.valueOf(true));
                        skuDetail.setStatus(Boolean.valueOf(false));
                        skuDetail.setStatus_b(Boolean.valueOf(false));
                        skuDetail.setUstatus(Boolean.valueOf(false));
                        skuDetail.setUstatus_b(Boolean.valueOf(false));
                    }
                    params.put("status", skuDetail.getStatus());
                    params.put("ustatus", skuDetail.getUstatus());
                    productSkuDetailNew = new ProductSkuDetailNew();
                    productSkuDetailNew.putAll((Map)skuDetail);
                    productSkuDetailNew.setProductDetailId(productDetailId);
                    productSkuDetailNew.put("id", (Object)IdManager.getInstance().nextId());
                    MetaDaoHelper.insert((String)"pc.product.ProductSkuDetailNew", (BizObject)productSkuDetailNew);
                } else {
                    detail.put("_status", EntityStatus.Update);
                    skuDetail = new ProductSKUDetail();
                    skuDetail.init(detail);
                    if (isShowSpec) {
                        skuDetail.setStopstatus(Boolean.valueOf(true));
                        skuDetail.setStatus(Boolean.valueOf(false));
                        skuDetail.setStatus_b(Boolean.valueOf(false));
                        skuDetail.setUstatus(Boolean.valueOf(false));
                        skuDetail.setUstatus_b(Boolean.valueOf(false));
                    }
                    params.put("status", skuDetail.getStatus());
                    params.put("ustatus", skuDetail.getUstatus());
                    productSkuDetailNew = new ProductSkuDetailNew();
                    productSkuDetailNew.putAll((Map)skuDetail);
                    productSkuDetailNew.setProductDetailId(productDetailId);
                    QueryConditionGroup groupForSkuDetailNew = QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"productId").eq(product.getId()), QueryCondition.name((String)"skuId.isSKU").eq((Object)0), QueryCondition.name((String)"productDetailId").eq((Object)productDetailId)});
                    List productSkuDetailNewResultMapList = MetaDaoHelper.query((String)"pc.product.ProductSkuDetailNew", (QuerySchema)QuerySchema.create().addSelect("id").addCondition((ConditionExpression)groupForSkuDetailNew));
                    productSkuDetailNew.put("id", ((Map)productSkuDetailNewResultMapList.get(0)).get("id"));
                    MetaDaoHelper.update((String)"pc.product.ProductSkuDetailNew", (BizObject)productSkuDetailNew);
                }
                if (null != params.get("status") || null != params.get("ustatus")) {
                    this.upcProductUpdateService.UpdateUpDownCountOfApplierbyParams(params);
                }
                this.upcProductUpdateService.UpdateSKUOrderPropsSKUIDNew(params);
            }
            this.upcProductUpdateService.UpdateMaxMinBatchPriceNew(params);
        }
    }

    private void generateDefaultSKUByCreatorOrg(Product product, boolean isShowSpec, HashMap<String, Object> params, List<Map<String, Object>> productApplyRangeGroupList) throws Exception {
        List productApplyRanges = this.productApplyRangeDao.queryProductApplyRangeByCondition(QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"productId").eq(product.getId()), QueryCondition.name((String)"orgId").eq((Object)product.getOrgId())}));
        if (CollectionUtils.isEmpty((Collection)productApplyRanges)) {
            return;
        }
        params.put("productApplyRangeId", ((ProductApplyRange)productApplyRanges.get(0)).getId());
        this.generateDefaultSKU(product, params, isShowSpec, productApplyRangeGroupList);
        this.upcProductUpdateService.UpdateMaxMinBatchPriceNew(params);
    }

    public void updateProductDefaultSku(Object productId) throws Exception {
        Product productSave = new Product();
        productSave.setEntityStatus(EntityStatus.Update);
        productSave.setId(productId);
        QueryConditionGroup queryConditionGroup = QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"productId").eq(productId), QueryCondition.name((String)"isSKU").eq((Object)0)});
        QuerySchema schema = QuerySchema.create().addSelect("id").addCondition((ConditionExpression)queryConditionGroup);
        List defaultSkuInDb = this.productSkuService.query("pc.product.ProductSKU", schema);
        if (!CollectionUtils.isEmpty((Collection)defaultSkuInDb)) {
            this.productSkuService.deleteSkuById(((ProductSKU)defaultSkuInDb.get(0)).getId(), productId);
            productSave.setDefaultSKUId(null);
            MetaDaoHelper.update((String)"pc.product.Product", (BizObject)productSave);
        }
    }

    private void checkCodeUnique(String code, Object id) throws Exception {
        Object checkType = OptionUtils.getSysOptionByName((String)"sku_code_global_unique");
        if (null != checkType && Boolean.parseBoolean(checkType.toString())) {
            QueryConditionGroup queryConditionGroup = QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"code").in(new Object[]{code}), QueryCondition.name((String)"id").not_eq(id)});
            QuerySchema schema = QuerySchema.create().addSelect("code").addCondition((ConditionExpression)queryConditionGroup);
            List skusInDb = MetaDaoHelper.query((String)"pc.product.ProductSKU", (QuerySchema)schema);
            if (!CollectionUtils.isEmpty((Collection)skusInDb)) {
                throw new CoreDocBusinessException(CoreDocBusinessErrorEnum.PRODUCT_SKU_CODE_EXIST);
            }
        }
    }

    public boolean isUseSpec(Long productTplId) throws Exception {
        boolean isUseSpec = false;
        if (null != productTplId) {
            QuerySchema showSpecSchema = QuerySchema.create().addSelect("1").appendQueryCondition(new ConditionExpression[]{QueryCondition.name((String)"template").eq((Object)productTplId), QueryCondition.name((String)"skuSens").eq((Object)true)});
            showSpecSchema.addPager(1, 1);
            List isShowSpecList = MetaDaoHelper.query((String)"pc.tpl.ProductTplCharacter", (QuerySchema)showSpecSchema);
            if (!CollectionUtils.isEmpty((Collection)isShowSpecList)) {
                isUseSpec = true;
            }
        }
        return isUseSpec;
    }

    private String[] processDupliField(Collection<String> field) throws Exception {
        LinkedHashSet<String> hashSet = new LinkedHashSet<String>(field);
        return hashSet.toArray(new String[field.size()]);
    }

    private void copyValues(Product product, Map sku, Long productDetailId) throws Exception {
        QuerySchema schema = QuerySchema.create().addSelect(this.processDupliField(COPY_FIELDS.values())).appendQueryCondition(new ConditionExpression[]{QueryCondition.name((String)"productId").eq(product.getId()), QueryCondition.name((String)"id").eq((Object)productDetailId)});
        List extend = MetaDaoHelper.query((String)"pc.product.ProductDetail", (QuerySchema)schema);
        this.copyMapping(sku, extend, null);
    }

    private void copyValues(ProductDetail productDetail, Map sku) throws Exception {
        QuerySchema schema = QuerySchema.create().addSelect(this.processDupliField(COPY_FIELDS.values())).appendQueryCondition(new ConditionExpression[]{QueryCondition.name((String)"id").eq(productDetail.getId())});
        List detail = MetaDaoHelper.query((String)"pc.product.ProductDetail", (QuerySchema)schema);
        this.copyMapping(sku, detail, (Map<String, Object>)productDetail);
    }

    public void copyMapping(Map sku, List<Map<String, Object>> dbDetail, Map<String, Object> pageDetail) {
        if (dbDetail.size() > 0) {
            for (Map.Entry<String, String> entry : COPY_FIELDS.entrySet()) {
                if (dbDetail.get(0).containsKey(entry.getValue())) {
                    sku.put(entry.getKey(), dbDetail.get(0).get(entry.getValue()));
                    continue;
                }
                if (null != pageDetail && pageDetail.containsKey(entry.getValue())) {
                    sku.put(entry.getKey(), pageDetail.get(entry.getValue()));
                    continue;
                }
                sku.put(entry.getKey(), null);
            }
        }
    }

    private void generateDefaultSKU(Product product, HashMap<String, Object> params, boolean isShowSpec, List<Map<String, Object>> productApplyRangeGroupList) throws Exception {
        ProductSKU sku = new ProductSKU();
        sku.setId((Object)IdManager.getInstance().nextId());
        sku.setEntityStatus(EntityStatus.Insert);
        sku.setCode(product.getCode());
        this.checkCodeUnique(product.getCode(), sku.getId());
        sku.put("name", product.get("name"));
        sku.put("model", product.get("model"));
        sku.put("modelDescription", ProductDefaultSKURule.subModelDescription(product.get("modelDescription")));
        sku.setProductId((Long)product.getId());
        sku.setErpCode(product.getErpCode());
        sku.setWeight(product.getWeight());
        sku.setVolume(product.getVolume());
        sku.setIsSKU(Integer.valueOf(0));
        LoginUser user = AppContext.getCurrentUser();
        if (null != user) {
            sku.set("creatorId", user.getId());
            sku.set("creator", (Object)user.getName());
            sku.setCreateTime(DateKit.getNowDate());
            sku.setCreateDate(DateKit.getNowDateShort());
        }
        MetaDaoHelper.insert((String)"pc.product.ProductSKU", (BizObject)sku);
        params.put("skuid", sku.getId());
        ArrayList<ProductSkuDetailNew> productSkuDetailNewList = new ArrayList<ProductSkuDetailNew>(productApplyRangeGroupList.size());
        ProductSkuDetailNew productSkuDetailNewCreator = new ProductSkuDetailNew();
        for (Map<String, Object> productApplyRangeGroup : productApplyRangeGroupList) {
            Object orgGroupType = productApplyRangeGroup.get("orgGroupType");
            if (null == orgGroupType || !OrgGroupTypeEnum.ORIGINAL.getValue().equals(orgGroupType.toString().trim())) continue;
            HashMap<String, Object> detail = new HashMap<String, Object>();
            detail.put("_status", EntityStatus.Insert);
            detail.put("id", IdManager.getInstance().nextId());
            detail.put("productId", product.getId());
            detail.put("skuId", sku.getId());
            detail.put("productApplyRangeId", product.get("productApplyRangeId"));
            this.copyValues(product, detail, (Long)productApplyRangeGroup.get("productDetailId"));
            ProductSKUExtend extend = new ProductSKUExtend();
            extend.init(detail);
            if (isShowSpec) {
                extend.setStopstatus(Boolean.valueOf(true));
                extend.setStatus(Boolean.valueOf(false));
                extend.setStatus_b(Boolean.valueOf(false));
                extend.setUstatus(Boolean.valueOf(false));
                extend.setUstatus_b(Boolean.valueOf(false));
            }
            params.put("status", extend.getStatus());
            params.put("ustatus", extend.getUstatus());
            ProductSkuDetailNew productSkuDetailNew = new ProductSkuDetailNew();
            productSkuDetailNew.putAll((Map)extend);
            productSkuDetailNew.put("id", (Object)IdManager.getInstance().nextId());
            productSkuDetailNew.setProductDetailId((Long)productApplyRangeGroup.get("productDetailId"));
            if ("2".equals(productApplyRangeGroup.get("orgGroupType").toString())) {
                productSkuDetailNew.setProductApplyRangeId(null);
                productSkuDetailNew.setIsCreator(Boolean.valueOf(false));
            } else {
                productSkuDetailNew.setIsCreator(Boolean.valueOf(true));
                productSkuDetailNewCreator.init((Map)productSkuDetailNew);
            }
            productSkuDetailNewList.add(productSkuDetailNew);
        }
        MetaDaoHelper.insert((String)"pc.product.ProductSkuDetailNew", productSkuDetailNewList);
        this.upcProductUpdateService.UpdateDefaultSKUId(params);
        if (null != productSkuDetailNewCreator.getStatus() || null != productSkuDetailNewCreator.getUstatus()) {
            this.upcProductUpdateService.UpdateUpDownCountOfCreatorbyParams(params);
        }
        product.setDefaultSKUId((Long)sku.getId());
        this.upcProductUpdateService.UpdateSKUOrderPropsSKUIDNew(params);
        ArrayList<ProductSkuDetailNew> skuDetailNews = new ArrayList<ProductSkuDetailNew>();
        skuDetailNews.add(productSkuDetailNewCreator);
        sku.setProductSkuDetailNew(skuDetailNews);
        this.productSkuAsyncSaveService.dealSkuDataForApplied(sku, sku.getProductId());
    }

    private static Object subModelDescription(Object modelDescription) {
        if (modelDescription instanceof BizObject) {
            BizObject modelDescriptionObj = (BizObject)modelDescription;
            for (Map.Entry entry : modelDescriptionObj.entrySet()) {
                String strValue;
                Object value = entry.getValue();
                if (value == null || !(value instanceof String) || (strValue = (String)value).length() <= 255) continue;
                modelDescriptionObj.put((String)entry.getKey(), (Object)strValue.substring(0, 255));
            }
            modelDescription = modelDescriptionObj;
        } else if (modelDescription instanceof String) {
            modelDescription = ((String)modelDescription).length() > 255 ? ((String)modelDescription).substring(0, 255) : modelDescription;
        }
        return modelDescription;
    }

    static {
        COPY_FIELDS.put("stopstatus", "stopstatus");
        COPY_FIELDS.put("status", "iStatus");
        COPY_FIELDS.put("ustatus", "iUOrderStatus");
        COPY_FIELDS.put("status_b", "iStatus");
        COPY_FIELDS.put("ustatus_b", "iUOrderStatus");
        COPY_FIELDS.put("batchPrice", "batchPrice");
        COPY_FIELDS.put("markPrice", "fMarkPrice");
        COPY_FIELDS.put("salePrice", "fSalePrice");
        COPY_FIELDS.put("fNoTaxCostPrice", "fNoTaxCostPrice");
        COPY_FIELDS.put("fMarketPrice", "fMarketPrice");
        COPY_FIELDS.put("fLowestMarkPrice", "fLowestMarkPrice");
        COPY_FIELDS.put("fPrimeCosts", "fPrimeCosts");
        COPY_FIELDS.put("fSettleAccountsRate", "fSettleAccountsRate");
        COPY_FIELDS.put("barCode", "barCode");
        COPY_FIELDS.put("inventoryCount", "lInventoryCount");
        COPY_FIELDS.put("salePoints", "salePoints");
        COPY_FIELDS.put("iMinOrderQuantity", "iMinOrderQuantity");
        COPY_FIELDS.put("batchDeliveryDays", "deliveryDays");
        COPY_FIELDS.put("shortName", "shortName");
        COPY_FIELDS.put("mnemonicCode", "mnemonicCode");
        COPY_FIELDS.put("iDoubleSale", "iDoubleSale");
        COPY_FIELDS.put("safetyStock", "safetyStock");
        COPY_FIELDS.put("highestStock", "highestStock");
        COPY_FIELDS.put("lowestStock", "lowestStock");
    }
}


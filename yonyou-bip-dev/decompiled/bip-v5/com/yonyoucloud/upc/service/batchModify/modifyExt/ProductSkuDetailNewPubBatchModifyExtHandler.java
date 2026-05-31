/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.yonyou.iuap.apdoc.coredoc.batchmodify.extinterface.IPubBatchModifyEntityExtService
 *  com.yonyou.iuap.apdoc.coredoc.constant.ApplicationCodeConstant
 *  com.yonyou.iuap.apdoc.coredoc.enums.CoreDocBusinessErrorEnum
 *  com.yonyou.iuap.apdoc.coredoc.exceptions.CoreDocBusinessException
 *  com.yonyou.iuap.apdoc.coredoc.utils.BooleanUtil
 *  com.yonyou.iuap.log.cons.BusinessLogMode
 *  com.yonyou.iuap.log.model.BusinessLogObjectBuilder
 *  com.yonyou.iuap.log.rpc.IBusiLogService
 *  com.yonyou.iuap.ucf.common.i18n.InternationalUtils
 *  com.yonyou.ucf.mdd.common.model.ResultList
 *  com.yonyou.ucf.mdd.common.model.rule.RuleExecuteResult
 *  com.yonyou.ucf.mdd.ext.bill.dto.BillDataDto
 *  com.yonyou.ucf.mdd.ext.core.AppContext
 *  com.yonyou.ucf.mdd.ext.dao.meta.MetaDaoHelper
 *  com.yonyoucloud.upc.coredoc.batchentity.dto.PubBatchModifyEntitySaveDTO
 *  com.yonyoucloud.upc.pc.product.ProductSKU
 *  com.yonyoucloud.upc.pc.product.ProductSKUExtend
 *  com.yonyoucloud.upc.pc.product.ProductSkuDetailNew
 *  org.imeta.biz.base.Objectlizer
 *  org.imeta.orm.base.BizObject
 *  org.imeta.orm.base.EntityStatus
 *  org.imeta.orm.schema.ConditionExpression
 *  org.imeta.orm.schema.QueryCondition
 *  org.imeta.orm.schema.QueryConditionGroup
 *  org.imeta.orm.schema.QuerySchema
 *  org.slf4j.Logger
 *  org.slf4j.LoggerFactory
 *  org.springframework.beans.factory.annotation.Autowired
 *  org.springframework.beans.factory.annotation.Qualifier
 *  org.springframework.stereotype.Service
 *  org.springframework.util.CollectionUtils
 *  org.springframework.util.ObjectUtils
 */
package com.yonyoucloud.upc.service.batchModify.modifyExt;

import com.yonyou.iuap.apdoc.coredoc.batchmodify.extinterface.IPubBatchModifyEntityExtService;
import com.yonyou.iuap.apdoc.coredoc.constant.ApplicationCodeConstant;
import com.yonyou.iuap.apdoc.coredoc.enums.CoreDocBusinessErrorEnum;
import com.yonyou.iuap.apdoc.coredoc.exceptions.CoreDocBusinessException;
import com.yonyou.iuap.apdoc.coredoc.utils.BooleanUtil;
import com.yonyou.iuap.log.cons.BusinessLogMode;
import com.yonyou.iuap.log.model.BusinessLogObjectBuilder;
import com.yonyou.iuap.log.rpc.IBusiLogService;
import com.yonyou.iuap.ucf.common.i18n.InternationalUtils;
import com.yonyou.ucf.mdd.common.model.ResultList;
import com.yonyou.ucf.mdd.common.model.rule.RuleExecuteResult;
import com.yonyou.ucf.mdd.ext.bill.dto.BillDataDto;
import com.yonyou.ucf.mdd.ext.core.AppContext;
import com.yonyou.ucf.mdd.ext.dao.meta.MetaDaoHelper;
import com.yonyoucloud.iuap.upc.api.service.IUPCBillService;
import com.yonyoucloud.upc.billrule.goodsAchive.ProductSKUShelveRule;
import com.yonyoucloud.upc.coredoc.batchentity.dto.PubBatchModifyEntitySaveDTO;
import com.yonyoucloud.upc.pc.product.ProductSKU;
import com.yonyoucloud.upc.pc.product.ProductSKUExtend;
import com.yonyoucloud.upc.pc.product.ProductSkuDetailNew;
import com.yonyoucloud.upc.service.batchModify.modifyExt.ProductPubBatchModifyExtHandler;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.stream.Collectors;
import org.imeta.biz.base.Objectlizer;
import org.imeta.orm.base.BizObject;
import org.imeta.orm.base.EntityStatus;
import org.imeta.orm.schema.ConditionExpression;
import org.imeta.orm.schema.QueryCondition;
import org.imeta.orm.schema.QueryConditionGroup;
import org.imeta.orm.schema.QuerySchema;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;
import org.springframework.util.ObjectUtils;

@Service
public class ProductSkuDetailNewPubBatchModifyExtHandler
implements IPubBatchModifyEntityExtService {
    private static final Logger log = LoggerFactory.getLogger(ProductSkuDetailNewPubBatchModifyExtHandler.class);
    @Autowired
    @Qualifier(value="pc.BillService")
    private IUPCBillService billService;
    @Autowired
    private ProductSKUShelveRule productSKUShelveRule;
    @Autowired
    private IBusiLogService busiLogService;

    public void extendQuerySchema(QuerySchema querySchema, PubBatchModifyEntitySaveDTO pubBatchModifyEntitySaveDTO) throws Exception {
        querySchema.addSelect(new String[]{"id", "skuId", "productDetailId as productDetailId "});
        List productApplyRangeIdList = pubBatchModifyEntitySaveDTO.getExtIdList();
        if (CollectionUtils.isEmpty((Collection)productApplyRangeIdList)) {
            throw new CoreDocBusinessException(CoreDocBusinessErrorEnum.SKU_PRODUCTAPPLYRANGEID_IS_NULL_ERROR);
        }
        Set<Long> productDetailIdSet = this.queryProductDetailId(productApplyRangeIdList);
        querySchema.appendQueryCondition(new ConditionExpression[]{QueryCondition.name((String)"productDetailId").in(productDetailIdSet)});
    }

    public void batchModifyIsCheckField(BizObject bizObject, Map<String, Object> pubBatchModifyEntityFieldSaveIsCheckMap, PubBatchModifyEntitySaveDTO pubBatchModifyEntitySaveDTO) throws Exception {
        ProductSkuDetailNew skuDetailNew = new ProductSkuDetailNew();
        skuDetailNew.init((Map)bizObject);
        ProductSKU productSKU = new ProductSKU();
        productSKU.put("id", (Object)skuDetailNew.getSkuId());
        QuerySchema schema = QuerySchema.create().addSelect(new String[]{"id", "isCreator", "isApplied", "orgId"}).addCondition((ConditionExpression)QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"productDetailId").eq(skuDetailNew.get("productDetailId"))}));
        List ranges = MetaDaoHelper.query((String)"pc.product.ProductApplyRange", (QuerySchema)schema);
        if (!CollectionUtils.isEmpty((Collection)ranges)) {
            productSKU.put("orgId", ((Map)ranges.get(0)).get("orgId"));
            productSKU.put("productApplyRangeId", (Object)((Map)ranges.get(0)).get("id").toString());
            productSKU.put("isCreator", ((Map)ranges.get(0)).get("isCreator"));
            productSKU.put("isApplied", ((Map)ranges.get(0)).get("isApplied"));
        }
        this.detailProductSKU(productSKU);
        for (Map.Entry<String, Object> entry2 : pubBatchModifyEntityFieldSaveIsCheckMap.entrySet()) {
            productSKU.productSKUDetail().put(entry2.getKey(), entry2.getValue());
        }
        productSKU.setEntityStatus(EntityStatus.Update);
        productSKU.productSKUDetail().setEntityStatus(EntityStatus.Update);
        ArrayList<ProductSkuDetailNew> skuDetailNews = new ArrayList<ProductSkuDetailNew>();
        skuDetailNew.init((Map)productSKU.productSKUDetail());
        skuDetailNews.add(skuDetailNew);
        productSKU.setProductSkuDetailNew(skuDetailNews);
        productSKU.set("_fromBatchModify", (Object)true);
        BillDataDto batchModifyDto = new BillDataDto();
        batchModifyDto.setData((Object)Objectlizer.convert((Map)productSKU, (String)"pc.product.ProductSKU"));
        batchModifyDto.setBillnum("pc_goodsproductskuprolist");
        HashMap stringObjectHashMap = new HashMap();
        pubBatchModifyEntityFieldSaveIsCheckMap.entrySet().forEach(entry -> stringObjectHashMap.put("productSKUDetail!" + (String)entry.getKey(), entry.getValue()));
        batchModifyDto.setExternalData(stringObjectHashMap);
        RuleExecuteResult batchModifyRes = this.billService.executeUpdate("batchModify&save", batchModifyDto);
        if (batchModifyRes.getMsgCode() != 1) {
            throw new CoreDocBusinessException(batchModifyRes.getMessage());
        }
    }

    public void initSKUApplyRangeData(Object productApplyRangeId) throws Exception {
        Map range;
        List ranges = MetaDaoHelper.queryById((String)"pc.product.ProductApplyRange", (String)"id,isApplied,productId", (Object)Long.parseLong(productApplyRangeId.toString()));
        if (!ObjectUtils.isEmpty((Object)ranges) && !ObjectUtils.isEmpty(ranges.get(0)) && BooleanUtil.isFalse((Object)(range = (Map)ranges.get(0)).get("isApplied").toString())) {
            this.productSKUShelveRule.initRangeData(range.get("productId").toString(), Long.parseLong(range.get("id").toString()));
        }
    }

    public void detailProductSKU(ProductSKU productSKU) throws Exception {
        BillDataDto billDataDto = new BillDataDto("pc_productsku_edit", productSKU.getId().toString());
        HashMap<String, Object> params = new HashMap<String, Object>();
        params.put("@productApplyRangeId", productSKU.get("productApplyRangeId"));
        params.put("isCreator", productSKU.get("isCreator"));
        params.put("isApplied", productSKU.get("isApplied"));
        billDataDto.setMapCondition(params);
        Map productSkuDetailInDb = this.billService.detail(billDataDto);
        ProductSKUExtend detail = new ProductSKUExtend();
        for (String key : productSkuDetailInDb.keySet()) {
            if (key.startsWith("productSkuDetailNew!")) {
                String newKey = key.replace("productSkuDetailNew!", "");
                if (detail.containsKey((Object)newKey)) continue;
                detail.put(key.replace("productSkuDetailNew!", ""), productSkuDetailInDb.get(key));
                continue;
            }
            if (productSKU.containsKey((Object)key)) continue;
            productSKU.put(key, productSkuDetailInDb.get(key));
        }
        productSKU.put("productSKUDetail", (Object)detail);
        if (BooleanUtil.isFalse((Object)productSKU.get("isCreator"))) {
            productSKU.remove("name");
            productSKU.remove("weight");
            productSKU.remove("volume");
            productSKU.remove("modelDescription");
            productSKU.remove("batchUnit");
        }
    }

    public Set<Long> queryProductDetailId(List<Object> productApplyRangeIdList) throws Exception {
        QuerySchema querySchema;
        List ranges;
        Set<Long> productDetailIdSet = new HashSet<Long>();
        if (!CollectionUtils.isEmpty(productApplyRangeIdList) && !CollectionUtils.isEmpty((Collection)(ranges = MetaDaoHelper.query((String)"pc.product.ProductApplyRange", (QuerySchema)(querySchema = QuerySchema.create().addSelect(new String[]{"id", "productDetailId"}).addCondition((ConditionExpression)QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"id").in(productApplyRangeIdList)}))))))) {
            productDetailIdSet = ranges.stream().map(range -> Long.parseLong(range.get("productDetailId").toString())).collect(Collectors.toSet());
        }
        return productDetailIdSet;
    }

    public void update(String fullName, BizObject newBizObjectUpdate, PubBatchModifyEntitySaveDTO pubBatchModifyEntitySaveDTO) throws Exception {
        HashMap data = new HashMap(newBizObjectUpdate);
        BizObject newBizObjectSKUUpdate = Objectlizer.convert(data, (String)fullName);
        newBizObjectSKUUpdate.setEntityStatus(EntityStatus.Update);
        this.addAuditFields(newBizObjectSKUUpdate);
        MetaDaoHelper.update((String)fullName, (BizObject)newBizObjectUpdate);
        QuerySchema schema = QuerySchema.create().addSelect(new String[]{"id", "isCreator", "isApplied", "orgId"}).addCondition((ConditionExpression)QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"productDetailId").eq(newBizObjectUpdate.get("productDetailId"))}));
        List ranges = MetaDaoHelper.query((String)"pc.product.ProductApplyRange", (QuerySchema)schema);
        if (pubBatchModifyEntitySaveDTO.getUpdateLog().booleanValue()) {
            this.addBusinessLog(newBizObjectUpdate, ranges, newBizObjectUpdate.get("skuId").toString());
        }
    }

    public void initData(PubBatchModifyEntitySaveDTO pubBatchModifyEntitySaveDTO, ConcurrentHashMap<String, ResultList> resultListMap) {
        ResultList resultList = resultListMap.get(AppContext.getYTenantId() + pubBatchModifyEntitySaveDTO.getBillNum());
        List productApplyRangeIdList = pubBatchModifyEntitySaveDTO.getExtIdList();
        if (!CollectionUtils.isEmpty((Collection)productApplyRangeIdList)) {
            for (Object productApplyRangeId : productApplyRangeIdList) {
                try {
                    this.initSKUApplyRangeData(productApplyRangeId);
                }
                catch (Exception e) {
                    resultList.addErrorMessage("\u5b9e\u4f8b\u5316\u5931\u8d25\uff1a" + e.getMessage());
                    resultList.incResultCount(false);
                    log.error("\u5b9e\u4f8b\u5316\u5931\u8d25\uff1a" + productApplyRangeId.toString() + "\uff0cerrorMessage:" + e.getMessage());
                }
            }
        }
        resultListMap.put(AppContext.getYTenantId() + pubBatchModifyEntitySaveDTO.getBillNum(), resultList);
    }

    void addBusinessLog(BizObject newBizObjectUpdate, List<Map<String, Object>> ranges, String skuID) throws Exception {
        ProductSKU productSKU = new ProductSKU();
        productSKU.put("id", (Object)skuID);
        if (!CollectionUtils.isEmpty(ranges)) {
            productSKU.put("orgId", ranges.get(0).get("orgId"));
            productSKU.put("productApplyRangeId", (Object)ranges.get(0).get("id").toString());
            productSKU.put("isCreator", ranges.get(0).get("isCreator"));
            productSKU.put("isApplied", ranges.get(0).get("isApplied"));
        }
        BillDataDto billDataDto = new BillDataDto("pc_productsku_edit", productSKU.getId().toString());
        HashMap<String, Object> params = new HashMap<String, Object>();
        params.put("@productApplyRangeId", productSKU.get("productApplyRangeId"));
        params.put("isCreator", productSKU.get("isCreator"));
        params.put("isApplied", productSKU.get("isApplied"));
        billDataDto.setMapCondition(params);
        Map productSkuDetailInDb = this.billService.detail(billDataDto);
        for (String key : newBizObjectUpdate.keySet()) {
            if (ProductPubBatchModifyExtHandler.notAddFields.contains(key)) continue;
            if ("pc.product.ProductSkuDetailNew".equals(newBizObjectUpdate.get("_entityName"))) {
                productSkuDetailInDb.put("productSkuDetailNew!" + key, newBizObjectUpdate.get(key));
                continue;
            }
            productSkuDetailInDb.put(key, newBizObjectUpdate.get(key));
        }
        String appName = InternationalUtils.getMessageWithDefault((String)"UID:P_COREDOC-BE_179F6286040807D6", (String)"\u57fa\u7840\u6570\u636e");
        String serviceName = InternationalUtils.getMessageWithDefault((String)"UID:P_COREDOC-UI_17AA8032057000C5", (String)"\u5546\u54c1SKU\u6863\u6848");
        String busiObjTypeCode = "pc_productsku_edit";
        String busiObjTypeName = "UID:P_COREDOC-UI_17AA8032057002BE";
        String serviceCode = "pc_goodsproductskupro";
        BusinessLogObjectBuilder businessLogObjectBuilder = new BusinessLogObjectBuilder();
        businessLogObjectBuilder.uri("pc.product.Product").busiObjTypeCode(busiObjTypeCode).busiObjTypeName(busiObjTypeName).defaultBusiObjTypeName("\u7269\u6599SKU").operationName("UID:P_COREDOC-UI_17AAAFC8042017E9").defaultOperationName("\u6279\u6539").logMode(BusinessLogMode.UI_META).domain("productcenter").serviceCode(serviceCode).newObject((Object)productSkuDetailInDb).applicationName(appName).serviceName(serviceName).applicationCode(ApplicationCodeConstant.getApplicationCodeByFullName((String)"pc.product.Product")).dataId(productSkuDetailInDb.get("id").toString()).dataCode(productSkuDetailInDb.get("code").toString()).dataName(productSkuDetailInDb.get("name").toString());
        this.busiLogService.saveBusinessLog(businessLogObjectBuilder.build());
    }

    public void addAuditFields(BizObject newBizObjectUpdate) {
        newBizObjectUpdate.put("modifierId", AppContext.getCurrentUser().getId());
        newBizObjectUpdate.put("modifyTime", (Object)new Date());
        newBizObjectUpdate.put("modifyDate", (Object)new Date());
    }
}


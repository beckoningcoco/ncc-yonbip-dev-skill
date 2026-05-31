/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.alibaba.fastjson.JSONArray
 *  com.yonyou.iuap.apdoc.coredoc.batchmodify.extinterface.IPubBatchModifyEntityExtService
 *  com.yonyou.iuap.apdoc.coredoc.enums.CoreDocBusinessErrorEnum
 *  com.yonyou.iuap.apdoc.coredoc.enums.CoreExtrateBusinessErrorEnum
 *  com.yonyou.iuap.apdoc.coredoc.exceptions.CoreDocBusinessException
 *  com.yonyou.iuap.apdoc.coredoc.utils.BooleanUtil
 *  com.yonyou.iuap.ucf.common.i18n.InternationalUtils
 *  com.yonyou.ucf.mdd.common.model.ResultList
 *  com.yonyou.ucf.mdd.common.model.rule.RuleExecuteResult
 *  com.yonyou.ucf.mdd.ext.bill.dto.BillDataDto
 *  com.yonyou.ucf.mdd.ext.core.AppContext
 *  com.yonyou.ucf.mdd.ext.dao.meta.MetaDaoHelper
 *  com.yonyoucloud.upc.coredoc.batchentity.dto.PubBatchModifyEntitySaveDTO
 *  com.yonyoucloud.upc.pc.product.Product
 *  com.yonyoucloud.upc.pc.product.ProductSKU
 *  com.yonyoucloud.upc.pc.tpl.ProductTpl
 *  org.imeta.biz.base.Objectlizer
 *  org.imeta.orm.base.BizObject
 *  org.imeta.orm.base.EntityStatus
 *  org.imeta.orm.schema.ConditionExpression
 *  org.imeta.orm.schema.QueryCondition
 *  org.imeta.orm.schema.QueryConditionGroup
 *  org.imeta.orm.schema.QuerySchema
 *  org.imeta.spring.support.id.IdManager
 *  org.jetbrains.annotations.NotNull
 *  org.slf4j.Logger
 *  org.slf4j.LoggerFactory
 *  org.springframework.beans.factory.annotation.Autowired
 *  org.springframework.beans.factory.annotation.Qualifier
 *  org.springframework.stereotype.Service
 *  org.springframework.util.CollectionUtils
 */
package com.yonyoucloud.upc.service.batchModify.modifyExt;

import com.alibaba.fastjson.JSONArray;
import com.yonyou.iuap.apdoc.coredoc.batchmodify.extinterface.IPubBatchModifyEntityExtService;
import com.yonyou.iuap.apdoc.coredoc.enums.CoreDocBusinessErrorEnum;
import com.yonyou.iuap.apdoc.coredoc.enums.CoreExtrateBusinessErrorEnum;
import com.yonyou.iuap.apdoc.coredoc.exceptions.CoreDocBusinessException;
import com.yonyou.iuap.apdoc.coredoc.utils.BooleanUtil;
import com.yonyou.iuap.ucf.common.i18n.InternationalUtils;
import com.yonyou.ucf.mdd.common.model.ResultList;
import com.yonyou.ucf.mdd.common.model.rule.RuleExecuteResult;
import com.yonyou.ucf.mdd.ext.bill.dto.BillDataDto;
import com.yonyou.ucf.mdd.ext.core.AppContext;
import com.yonyou.ucf.mdd.ext.dao.meta.MetaDaoHelper;
import com.yonyoucloud.iuap.upc.api.service.IUPCBillService;
import com.yonyoucloud.upc.coredoc.batchentity.dto.PubBatchModifyEntitySaveDTO;
import com.yonyoucloud.upc.datarule.ProductTplService;
import com.yonyoucloud.upc.pc.product.Product;
import com.yonyoucloud.upc.pc.product.ProductSKU;
import com.yonyoucloud.upc.pc.tpl.ProductTpl;
import com.yonyoucloud.upc.service.batchModify.common.ModifyUtils;
import com.yonyoucloud.upc.service.batchModify.modifyExt.ProductSkuDetailNewPubBatchModifyExtHandler;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import org.imeta.biz.base.Objectlizer;
import org.imeta.orm.base.BizObject;
import org.imeta.orm.base.EntityStatus;
import org.imeta.orm.schema.ConditionExpression;
import org.imeta.orm.schema.QueryCondition;
import org.imeta.orm.schema.QueryConditionGroup;
import org.imeta.orm.schema.QuerySchema;
import org.imeta.spring.support.id.IdManager;
import org.jetbrains.annotations.NotNull;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;

@Service
public class ProductSkuPubBatchModifyExtHandler
implements IPubBatchModifyEntityExtService {
    private static final Logger log = LoggerFactory.getLogger(ProductSkuPubBatchModifyExtHandler.class);
    @Autowired
    ProductSkuDetailNewPubBatchModifyExtHandler productSkuDetailNewPubBatchModifyExtHandler;
    @Autowired
    ProductTplService productTplService;
    @Autowired
    @Qualifier(value="pc.BillService")
    private IUPCBillService billService;

    public void batchModifyIsCheckField(BizObject bizObject, Map<String, Object> pubBatchModifyEntityFieldSaveIsCheckMap, PubBatchModifyEntitySaveDTO pubBatchModifyEntitySaveDTO) throws Exception {
        ProductSKU sku = this.createSKU(bizObject, pubBatchModifyEntityFieldSaveIsCheckMap, pubBatchModifyEntitySaveDTO);
        sku.setEntityStatus(EntityStatus.Update);
        sku.productSKUDetail().setEntityStatus(EntityStatus.Unchanged);
        sku.set("_fromBatchModify", (Object)true);
        BillDataDto batchModifyDto = new BillDataDto();
        batchModifyDto.setData((Object)Objectlizer.convert((Map)sku, (String)"pc.product.ProductSKU"));
        batchModifyDto.setBillnum("pc_goodsproductskuprolist");
        HashMap stringObjectHashMap = new HashMap();
        pubBatchModifyEntityFieldSaveIsCheckMap.entrySet().forEach(entry -> stringObjectHashMap.put((String)entry.getKey(), entry.getValue()));
        batchModifyDto.setExternalData(stringObjectHashMap);
        RuleExecuteResult batchModifyRes = this.billService.executeUpdate("batchModify&save", batchModifyDto);
        if (batchModifyRes.getMsgCode() != 1) {
            throw new CoreDocBusinessException(CoreDocBusinessErrorEnum.SKU_BATCH_MODIFY_ERROR, new Object[]{batchModifyRes.getMessage()});
        }
    }

    @NotNull
    public ProductSKU createSKU(BizObject bizObject, Map<String, Object> pubBatchModifyEntityFieldSaveIsCheckMap, PubBatchModifyEntitySaveDTO pubBatchModifyEntitySaveDTO) throws Exception {
        ProductSkuPubBatchModifyExtHandler.checkIsCreatorCanModify(bizObject, pubBatchModifyEntitySaveDTO);
        List<Map> characters = this.checkSKUPropCharacters(bizObject, pubBatchModifyEntityFieldSaveIsCheckMap, pubBatchModifyEntitySaveDTO);
        Map<String, String> skuCharacterTypeMap = ModifyUtils.findMaterialCharacterTypeMap(characters);
        ProductSKU sku = new ProductSKU();
        sku.init((Map)bizObject);
        QuerySchema schema = QuerySchema.create().addSelect(new String[]{"id", "isCreator", "isApplied", "orgId"}).addCondition((ConditionExpression)QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"productId").eq(sku.get("productId")), QueryCondition.name((String)"isCreator").eq((Object)true)}));
        List ranges = MetaDaoHelper.query((String)"pc.product.ProductApplyRange", (QuerySchema)schema);
        if (!CollectionUtils.isEmpty((Collection)ranges)) {
            sku.put("orgId", ((Map)ranges.get(0)).get("orgId"));
            sku.put("productApplyRangeId", (Object)((Map)ranges.get(0)).get("id").toString());
            sku.put("isCreator", ((Map)ranges.get(0)).get("isCreator"));
            sku.put("isApplied", ((Map)ranges.get(0)).get("isApplied"));
        }
        this.productSkuDetailNewPubBatchModifyExtHandler.detailProductSKU(sku);
        for (Map.Entry<String, Object> entry : pubBatchModifyEntityFieldSaveIsCheckMap.entrySet()) {
            if ("skuPropCharacter".equals(entry.getKey())) {
                ProductSkuPubBatchModifyExtHandler.processSKUPropCharacter(pubBatchModifyEntityFieldSaveIsCheckMap, entry, sku, skuCharacterTypeMap);
                continue;
            }
            sku.put(entry.getKey(), entry.getValue());
        }
        return sku;
    }

    public static void processSKUPropCharacter(Map<String, Object> pubBatchModifyEntityFieldSaveIsCheckMap, Map.Entry<String, Object> entry, ProductSKU sku, Map<String, String> skuCharacterTypeMap) {
        Map skuPropCharacterDefine = (Map)sku.get("skuPropCharacter");
        if (skuPropCharacterDefine != null) {
            Map stringObjectMap = (Map)pubBatchModifyEntityFieldSaveIsCheckMap.get(entry.getKey());
            skuPropCharacterDefine.putAll(ModifyUtils.convertPropCharacterTypeMap(stringObjectMap, skuCharacterTypeMap));
            skuPropCharacterDefine.put("_status", EntityStatus.Update);
        } else {
            skuPropCharacterDefine = new BizObject();
            skuPropCharacterDefine.put("ytenant", AppContext.getYTenantId());
            Map stringObjectMap = (Map)pubBatchModifyEntityFieldSaveIsCheckMap.get(entry.getKey());
            skuPropCharacterDefine.putAll(ModifyUtils.convertPropCharacterTypeMap(stringObjectMap, skuCharacterTypeMap));
            skuPropCharacterDefine.put("_status", EntityStatus.Insert);
            skuPropCharacterDefine.put("id", IdManager.getInstance().nextId());
            sku.set("skuPropCharacter", (Object)skuPropCharacterDefine);
        }
    }

    public void extendQuerySchema(QuerySchema querySchema, PubBatchModifyEntitySaveDTO pubBatchModifyEntitySaveDTO) throws Exception {
        querySchema.addSelect("code");
        querySchema.addSelect("productId");
        querySchema.addSelect("productSkuDetailNew.productDetailId as productDetailId,id as skuId");
        List productApplyRangeIdList = pubBatchModifyEntitySaveDTO.getExtIdList();
        if (CollectionUtils.isEmpty((Collection)productApplyRangeIdList)) {
            throw new CoreDocBusinessException(CoreDocBusinessErrorEnum.SKU_PRODUCTAPPLYRANGEID_IS_NULL_ERROR);
        }
        Set<Long> productDetailIdSet = this.productSkuDetailNewPubBatchModifyExtHandler.queryProductDetailId(productApplyRangeIdList);
        querySchema.appendQueryCondition(new ConditionExpression[]{QueryCondition.name((String)"productSkuDetailNew.productDetailId").in(productDetailIdSet)});
    }

    public void update(String fullName, BizObject newBizObjectUpdate, PubBatchModifyEntitySaveDTO pubBatchModifyEntitySaveDTO) throws Exception {
        final Map<String, Object> createRange = ProductSkuPubBatchModifyExtHandler.checkIsCreatorCanModify(newBizObjectUpdate, pubBatchModifyEntitySaveDTO);
        this.addAuditFields(newBizObjectUpdate);
        MetaDaoHelper.update((String)fullName, (BizObject)newBizObjectUpdate);
        ArrayList<Map<String, Object>> list = new ArrayList<Map<String, Object>>(){
            {
                this.add(createRange);
            }
        };
        if (pubBatchModifyEntitySaveDTO.getUpdateLog().booleanValue()) {
            this.productSkuDetailNewPubBatchModifyExtHandler.addBusinessLog(newBizObjectUpdate, (List<Map<String, Object>>)list, newBizObjectUpdate.get("id").toString());
        }
    }

    public void initData(PubBatchModifyEntitySaveDTO pubBatchModifyEntitySaveDTO, ConcurrentHashMap<String, ResultList> resultListMap) {
        ResultList resultList = resultListMap.get(AppContext.getYTenantId() + pubBatchModifyEntitySaveDTO.getBillNum());
        List productApplyRangeIdList = pubBatchModifyEntitySaveDTO.getExtIdList();
        if (!CollectionUtils.isEmpty((Collection)productApplyRangeIdList)) {
            for (Object productApplyRangeId : productApplyRangeIdList) {
                try {
                    this.productSkuDetailNewPubBatchModifyExtHandler.initSKUApplyRangeData(productApplyRangeId);
                }
                catch (Exception e) {
                    resultList.addErrorMessage(InternationalUtils.getMessageWithDefault((String)"UID:P_COREDOC-BE_1E4F233C0538000A", (String)"\u5b9e\u4f8b\u5316\u5931\u8d25\uff1a") + e.getMessage());
                    resultList.incResultCount(false);
                    log.error("\u5b9e\u4f8b\u5316\u5931\u8d25\uff1a" + productApplyRangeId.toString() + "\uff0cerrorMessage:" + e.getMessage());
                }
            }
        }
        resultListMap.put(AppContext.getYTenantId() + pubBatchModifyEntitySaveDTO.getBillNum(), resultList);
    }

    private static Map<String, Object> checkIsCreatorCanModify(BizObject newBizObjectUpdate, PubBatchModifyEntitySaveDTO pubBatchModifyEntitySaveDTO) throws Exception {
        List productApplyRangeIdList = pubBatchModifyEntitySaveDTO.getExtIdList();
        List skuId = pubBatchModifyEntitySaveDTO.getIdList();
        HashMap<String, Set> skuIdAndProductApplyRangeIdMap = new HashMap<String, Set>();
        for (int i = 0; i < skuId.size(); ++i) {
            Set productApplyRangeIdSet = skuIdAndProductApplyRangeIdMap.getOrDefault(skuId.get(i).toString(), new HashSet());
            productApplyRangeIdSet.add(productApplyRangeIdList.get(i).toString());
            skuIdAndProductApplyRangeIdMap.put(skuId.get(i).toString(), productApplyRangeIdSet);
        }
        Map<String, Object> createRange = new HashMap<String, Object>();
        List ranges = new ArrayList();
        for (Map.Entry skuIdAndProductApplyRangeIdEntry : skuIdAndProductApplyRangeIdMap.entrySet()) {
            Set productApplyRangeIdSet = (Set)skuIdAndProductApplyRangeIdEntry.getValue();
            QuerySchema schema = QuerySchema.create().addSelect(new String[]{"id", "isCreator", "isApplied", "orgId"}).addCondition((ConditionExpression)QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"id").in((Collection)productApplyRangeIdSet)}));
            ranges = MetaDaoHelper.query((String)"pc.product.ProductApplyRange", (QuerySchema)schema);
            if (CollectionUtils.isEmpty(ranges)) {
                throw new CoreDocBusinessException(CoreDocBusinessErrorEnum.SKU_BATCH_MODIFY_ERROR, new Object[]{InternationalUtils.getMessageWithDefault((String)"UID:P_COREDOC-BE_21B2E66205880007", (String)"\u6ca1\u6709\u627e\u5230\u5bf9\u5e94\u7684\u9002\u7528\u8303\u56f4")});
            }
            boolean hasCreatorDate = false;
            for (Map range : ranges) {
                if (!BooleanUtil.isTrue(range.get("isCreator"))) continue;
                hasCreatorDate = true;
                createRange = range;
            }
            if (hasCreatorDate) continue;
            throw new CoreDocBusinessException(CoreDocBusinessErrorEnum.SKU_BATCH_MODIFY_ERROR, new Object[]{String.format(InternationalUtils.getMessageWithDefault((String)"UID:P_COREDOC-BE_21048C7204880009", (String)"\u4f7f\u7528\u7ec4\u7ec7SKU\u3010%s\u3011\u4e0d\u5141\u8bb8\u4fee\u6539SKU\u7ba1\u7406\u7ec4\u7ec7\u7ea7\u5c5e\u6027\uff0c\u5305\u62ec\u7ba1\u7406\u7ec4\u7ec7\u7684\u57fa\u672c\u4fe1\u606f\u3001\u4e3b\u8868\u7279\u5f81\u3001\u57fa\u672c\u4fe1\u606f\u6269\u5c55\u5b57\u6bb5\u3001SKU\u5c5e\u6027\u7279\u5f81\u7ec4\u5b57\u6bb5"), newBizObjectUpdate.get("code").toString())});
        }
        return createRange;
    }

    public void addAuditFields(BizObject newBizObjectUpdate) {
        newBizObjectUpdate.put("modifierId", AppContext.getCurrentUser().getId());
        newBizObjectUpdate.put("modifyTime", (Object)new Date());
        newBizObjectUpdate.put("modifyDate", (Object)new Date());
    }

    public List<Map> checkSKUPropCharacters(BizObject bizObject, Map<String, Object> pubBatchModifyEntityFieldSaveIsCheckMap, PubBatchModifyEntitySaveDTO pubBatchModifyEntitySaveDTO) throws Exception {
        List<Map> characteristics = new ArrayList<Map>();
        if (pubBatchModifyEntityFieldSaveIsCheckMap.get("skuPropCharacter") != null) {
            QuerySchema queryTemplateSchema = QuerySchema.create().addSelect(new String[]{"code", "productTemplate"}).addCondition((ConditionExpression)QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"id").eq((Object)Long.parseLong(bizObject.get("productId").toString()))}));
            List products = MetaDaoHelper.queryObject((String)"pc.product.Product", (QuerySchema)queryTemplateSchema, null);
            if (CollectionUtils.isEmpty((Collection)products)) {
                throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_801457);
            }
            if (((Product)products.get(0)).getProductTemplate() == null) {
                throw new CoreDocBusinessException(CoreDocBusinessErrorEnum.PRODUCT_SKU_CT_CAN_NOT_MODIFY_BY_TPL_IS_NULL, new Object[]{((Product)products.get(0)).getCode()});
            }
            Long productTemplateId = ((Product)products.get(0)).getProductTemplate();
            QuerySchema querySKUPropCTSchema = QuerySchema.create().addSelect("skuPropCT").addCondition((ConditionExpression)QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"id").eq((Object)productTemplateId)}));
            List skuPropCTs = MetaDaoHelper.queryObject((String)"pc.tpl.ProductTpl", (QuerySchema)querySKUPropCTSchema, null);
            if (CollectionUtils.isEmpty((Collection)skuPropCTs)) {
                throw new CoreDocBusinessException(CoreDocBusinessErrorEnum.PRODUCT_SKU_CT_CAN_NOT_MODIFY_BY_TPL_IS_NULL, new Object[]{((Product)products.get(0)).getCode()});
            }
            ArrayList<Long> characteristicsIds = new ArrayList<Long>();
            characteristicsIds.add(((ProductTpl)skuPropCTs.get(0)).getSkuPropCT());
            HashMap<String, Object> param = new HashMap<String, Object>();
            param.put("characteristics", characteristicsIds);
            characteristics = this.productTplService.getCharacteristics(param);
            if (!CollectionUtils.isEmpty(characteristics) && characteristics.get(0).get("structs") != null) {
                List productSKUCharacterInTpl = JSONArray.parseArray((String)characteristics.get(0).get("structs").toString(), Map.class);
                HashMap<String, Map> productSKUCharacterMap = new HashMap<String, Map>();
                for (Map productPropCharacter : productSKUCharacterInTpl) {
                    productSKUCharacterMap.put(productPropCharacter.get("cName").toString(), productPropCharacter);
                }
                Map modifyProductSKUCharacter = (Map)pubBatchModifyEntityFieldSaveIsCheckMap.get("skuPropCharacter");
                for (String productSKUCharacterCode : modifyProductSKUCharacter.keySet()) {
                    if (productSKUCharacterMap.containsKey(productSKUCharacterCode)) continue;
                    throw new CoreDocBusinessException(CoreDocBusinessErrorEnum.PRODUCT_SKU_CT_CAN_NOT_MODIFY_BY_PRO_CT_NOT_EXIST, new Object[]{((Product)products.get(0)).getCode(), productSKUCharacterCode});
                }
            }
        }
        return characteristics;
    }

    public void supplementaryReminder(Map<String, Object> pubBatchModifyEntityFieldSaveIsCheckMap) throws Exception {
        this.convertSKUPropCharacterMap(pubBatchModifyEntityFieldSaveIsCheckMap);
    }

    public void convertSKUPropCharacterMap(Map<String, Object> pubBatchModifyEntityFieldSaveIsCheckMap) {
        Iterator<Map.Entry<String, Object>> iterator = pubBatchModifyEntityFieldSaveIsCheckMap.entrySet().iterator();
        HashMap<String, Object> characterMap = new HashMap<String, Object>();
        while (iterator.hasNext()) {
            Map.Entry<String, Object> entry = iterator.next();
            String key = entry.getKey();
            if (!key.startsWith("skuPropCharacter")) continue;
            Object characterValue = entry.getValue();
            String characterCode = key.replace("skuPropCharacter.", "");
            characterMap.put(characterCode, characterValue);
            iterator.remove();
        }
        if (!characterMap.isEmpty()) {
            pubBatchModifyEntityFieldSaveIsCheckMap.put("skuPropCharacter", characterMap);
        }
    }
}


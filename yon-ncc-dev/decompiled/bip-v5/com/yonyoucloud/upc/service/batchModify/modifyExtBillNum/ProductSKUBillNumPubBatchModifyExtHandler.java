/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.yonyou.iuap.apdoc.coredoc.batchmodify.extinterface.IPubBatchModifyBillNumExtService
 *  com.yonyou.iuap.apdoc.coredoc.enums.CoreDocBusinessErrorEnum
 *  com.yonyou.iuap.apdoc.coredoc.exceptions.CoreDocBusinessException
 *  com.yonyou.iuap.apdoc.coredoc.material.service.ProductExportDataDealService
 *  com.yonyou.iuap.apdoc.coredoc.utils.BooleanUtil
 *  com.yonyou.iuap.graphql.query.feature.QueryFeature
 *  com.yonyou.iuap.ucf.common.i18n.InternationalUtils
 *  com.yonyou.ucf.mdd.common.model.ResultList
 *  com.yonyou.ucf.mdd.common.model.rule.RuleExecuteResult
 *  com.yonyou.ucf.mdd.ext.bill.dto.BillDataDto
 *  com.yonyou.ucf.mdd.ext.core.AppContext
 *  com.yonyou.ucf.mdd.ext.dao.meta.MetaDaoHelper
 *  com.yonyou.ucf.mdd.ext.poi.model.ProcessData
 *  com.yonyoucloud.upc.coredoc.batchentity.dto.PubBatchModifyEntityFieldSaveDTO
 *  com.yonyoucloud.upc.coredoc.batchentity.dto.PubBatchModifyEntityQueryFieldSaveDTO
 *  com.yonyoucloud.upc.coredoc.batchentity.dto.PubBatchModifyEntitySaveDTO
 *  com.yonyoucloud.upc.coredoc.batchentity.dto.PubBatchModifyMutilEntitySaveDTO
 *  com.yonyoucloud.upc.coredoc.batchentity.dto.PubBatchModifyOnelEntityDTO
 *  com.yonyoucloud.upc.pc.product.ProductSKU
 *  com.yonyoucloud.upc.pc.product.ProductSkuDetailNew
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
 *  org.springframework.beans.BeanUtils
 *  org.springframework.beans.factory.annotation.Autowired
 *  org.springframework.beans.factory.annotation.Qualifier
 *  org.springframework.stereotype.Service
 *  org.springframework.util.CollectionUtils
 *  org.springframework.util.ObjectUtils
 */
package com.yonyoucloud.upc.service.batchModify.modifyExtBillNum;

import com.yonyou.iuap.apdoc.coredoc.batchmodify.extinterface.IPubBatchModifyBillNumExtService;
import com.yonyou.iuap.apdoc.coredoc.enums.CoreDocBusinessErrorEnum;
import com.yonyou.iuap.apdoc.coredoc.exceptions.CoreDocBusinessException;
import com.yonyou.iuap.apdoc.coredoc.material.service.ProductExportDataDealService;
import com.yonyou.iuap.apdoc.coredoc.utils.BooleanUtil;
import com.yonyou.iuap.graphql.query.feature.QueryFeature;
import com.yonyou.iuap.ucf.common.i18n.InternationalUtils;
import com.yonyou.ucf.mdd.common.model.ResultList;
import com.yonyou.ucf.mdd.common.model.rule.RuleExecuteResult;
import com.yonyou.ucf.mdd.ext.bill.dto.BillDataDto;
import com.yonyou.ucf.mdd.ext.core.AppContext;
import com.yonyou.ucf.mdd.ext.dao.meta.MetaDaoHelper;
import com.yonyou.ucf.mdd.ext.poi.model.ProcessData;
import com.yonyoucloud.iuap.upc.api.service.IUPCBillService;
import com.yonyoucloud.upc.billrule.goodsAchive.ProductSKUShelveRule;
import com.yonyoucloud.upc.coredoc.batchentity.dto.PubBatchModifyEntityFieldSaveDTO;
import com.yonyoucloud.upc.coredoc.batchentity.dto.PubBatchModifyEntityQueryFieldSaveDTO;
import com.yonyoucloud.upc.coredoc.batchentity.dto.PubBatchModifyEntitySaveDTO;
import com.yonyoucloud.upc.coredoc.batchentity.dto.PubBatchModifyMutilEntitySaveDTO;
import com.yonyoucloud.upc.coredoc.batchentity.dto.PubBatchModifyOnelEntityDTO;
import com.yonyoucloud.upc.datarule.ProductTplService;
import com.yonyoucloud.upc.pc.product.ProductSKU;
import com.yonyoucloud.upc.pc.product.ProductSkuDetailNew;
import com.yonyoucloud.upc.service.ProductApiDataService;
import com.yonyoucloud.upc.service.ProductCheckService;
import com.yonyoucloud.upc.service.batchModify.PubBatchModifyEntityServiceImpl;
import com.yonyoucloud.upc.service.batchModify.common.ModifyUtils;
import com.yonyoucloud.upc.service.batchModify.modifyExt.ProductSkuDetailNewPubBatchModifyExtHandler;
import com.yonyoucloud.upc.service.batchModify.modifyExt.ProductSkuPubBatchModifyExtHandler;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.stream.Collectors;
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
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;
import org.springframework.util.ObjectUtils;

@Service
public class ProductSKUBillNumPubBatchModifyExtHandler
implements IPubBatchModifyBillNumExtService {
    private static final Logger log = LoggerFactory.getLogger(ProductSKUBillNumPubBatchModifyExtHandler.class);
    @Autowired
    ProductApiDataService productApiDataService;
    @Autowired
    ProductSkuPubBatchModifyExtHandler productSkuPubBatchModifyExtHandler;
    @Autowired
    ProductSkuDetailNewPubBatchModifyExtHandler productSkuDetailNewPubBatchModifyExtHandler;
    @Autowired
    ProductTplService productTplService;
    @Autowired
    ProductExportDataDealService dealDataService;
    @Autowired
    ProductCheckService checkService;
    @Autowired
    @Qualifier(value="pc.BillService")
    private IUPCBillService billService;
    @Autowired
    private ProductSKUShelveRule productSKUShelveRule;

    public boolean extendQuerySchema(QuerySchema querySchema, PubBatchModifyMutilEntitySaveDTO pubBatchModifyEntitySaveDTO) throws Exception {
        boolean hasExtend = false;
        QueryConditionGroup queryConditionGroup = querySchema.queryConditionGroup();
        List pubBatchModifyMutilEntityDTOList = pubBatchModifyEntitySaveDTO.getPubBatchModifyMutilEntityDTOList();
        for (PubBatchModifyOnelEntityDTO pubBatchModifyOnelEntityDTO : pubBatchModifyMutilEntityDTOList) {
            if (!"pc.product.ProductSkuDetailNew".equals(pubBatchModifyOnelEntityDTO.getFullName()) || pubBatchModifyOnelEntityDTO.getBatchModifyEntityQueryFieldSaveList() == null || pubBatchModifyOnelEntityDTO.getBatchModifyEntityQueryFieldSaveList().size() <= 0 || CollectionUtils.isEmpty((Collection)pubBatchModifyOnelEntityDTO.getBatchModifyEntityQueryFieldSaveList())) continue;
            for (PubBatchModifyEntityQueryFieldSaveDTO pubBatchModifyEntityQueryFieldSaveDTO : pubBatchModifyOnelEntityDTO.getBatchModifyEntityQueryFieldSaveList()) {
                if (pubBatchModifyEntityQueryFieldSaveDTO.getValue() != null) {
                    if (pubBatchModifyEntityQueryFieldSaveDTO.isMultiple()) {
                        List<String> valueList = Arrays.asList(StringUtils.split((String)pubBatchModifyEntityQueryFieldSaveDTO.getValue().toString(), (String)","));
                        queryConditionGroup.addCondition((ConditionExpression)QueryCondition.name((String)("productSKUDetail." + pubBatchModifyEntityQueryFieldSaveDTO.getFieldName())).in(valueList));
                        continue;
                    }
                    queryConditionGroup.addCondition((ConditionExpression)QueryCondition.name((String)("productSKUDetail." + pubBatchModifyEntityQueryFieldSaveDTO.getFieldName())).eq(pubBatchModifyEntityQueryFieldSaveDTO.getValue()));
                    continue;
                }
                queryConditionGroup.addCondition((ConditionExpression)QueryCondition.name((String)("productSKUDetail." + pubBatchModifyEntityQueryFieldSaveDTO.getFieldName())).is_null());
            }
        }
        querySchema.addSelect("productSkuDetailNew.productDetailId as productDetailId,id as skuId");
        querySchema.addSelect(new String[]{"id", "code", "productId"});
        Set<Long> productDetailIdSet = this.productSkuDetailNewPubBatchModifyExtHandler.queryProductDetailId(pubBatchModifyEntitySaveDTO.getExtIdList());
        querySchema.appendQueryCondition(new ConditionExpression[]{QueryCondition.name((String)"productSkuDetailNew.productDetailId").in(productDetailIdSet)});
        querySchema.configQueryFeature(QueryFeature.EnableMultiLangText, true);
        querySchema.configQueryFeature(QueryFeature.MultiLangTextAsMap, true);
        return hasExtend;
    }

    public void initData(PubBatchModifyMutilEntitySaveDTO pubBatchModifyMutilEntitySaveDTO, ConcurrentHashMap<String, ResultList> resultListMap) throws Exception {
        ResultList resultList = resultListMap.get(AppContext.getYTenantId() + pubBatchModifyMutilEntitySaveDTO.getBillNum());
        List productApplyRangeIdList = pubBatchModifyMutilEntitySaveDTO.getExtIdList();
        QuerySchema querySchema = QuerySchema.create();
        querySchema.addSelect("id,isApplied,productId,productId.name as productName,orgId.code as orgCode");
        querySchema.addCondition((ConditionExpression)QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"id").in((Collection)productApplyRangeIdList)}));
        List ranges = MetaDaoHelper.query((String)"pc.product.ProductApplyRange", (QuerySchema)querySchema);
        if (!ObjectUtils.isEmpty((Object)ranges)) {
            for (Map range : ranges) {
                if (Boolean.parseBoolean(range.get("isApplied").toString())) continue;
                try {
                    this.productSKUShelveRule.initRangeData(range.get("productId").toString(), Long.parseLong(range.get("id").toString()));
                }
                catch (Exception e) {
                    String productName = range.get("productName").toString();
                    String orgCode = range.get("orgCode").toString();
                    String errorMesage = e.getMessage();
                    resultList.incResultCount(false);
                    String str = String.format(InternationalUtils.getMessageWithDefault((String)"UID:P_COREDOC-BE_1E4F229C04180018", (String)"\u7ec4\u7ec7\u3010%s\u3011\u4e0b\u7684\u7269\u6599\u3010%s\u3011\u5b9e\u4f8b\u5316\u5931\u8d25,\u539f\u56e0\u4e3a[%s]"), orgCode, productName, errorMesage);
                    resultList.addInfo((Object)str);
                    resultList.addErrorMessage(str);
                    resultList.addFailInfo((Object)str);
                    resultListMap.put(AppContext.getYTenantId() + pubBatchModifyMutilEntitySaveDTO.getBillNum(), resultList);
                }
            }
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public void batchModify(List<BizObject> bizObjectList, PubBatchModifyMutilEntitySaveDTO pubBatchModifyMutilEntitySaveDTO, ConcurrentHashMap<String, ConcurrentHashMap<String, Boolean>> resultYtenentMap, ConcurrentHashMap<String, ResultList> resultListMap) throws Exception {
        ResultList resultList = resultListMap.get(AppContext.getYTenantId() + pubBatchModifyMutilEntitySaveDTO.getBillNum());
        ConcurrentHashMap<String, Boolean> resultMap = resultYtenentMap.get(AppContext.getYTenantId() + pubBatchModifyMutilEntitySaveDTO.getBillNum());
        for (BizObject bizObject : bizObjectList) {
            String uniqueIdentifier = bizObject.get("code").toString();
            String code = bizObject.get("code").toString();
            uniqueIdentifier = ModifyUtils.createDataIdentifier(pubBatchModifyMutilEntitySaveDTO.getBillNum(), bizObject, uniqueIdentifier);
            try {
                HashMap<String, Object> stringObjectHashMap = new HashMap<String, Object>();
                ProductSKU sku = this.generateSKUData(pubBatchModifyMutilEntitySaveDTO, bizObject, stringObjectHashMap);
                sku.set("_fromBatchModify", (Object)true);
                this.saveSKU(sku, stringObjectHashMap, resultList, resultMap, uniqueIdentifier);
            }
            catch (Exception e) {
                String errorMesage = e.getMessage();
                resultList.incResultCount(false);
                resultMap.put(uniqueIdentifier, false);
                String str = String.format(InternationalUtils.getMessageWithDefault((String)"UID:P_COREDOC-BE_1B57FC1805A00006", (String)InternationalUtils.getMessageWithDefault((String)"UID:P_COREDOC-BE_1E4F229C04180019", (String)"%s\u3010%s\u3011\u6279\u6539\u90e8\u5206\u5b57\u6bb5\u5931\u8d25,\u539f\u56e0\u4e3a[%s]")), "SKU", code, errorMesage);
                resultList.addInfo((Object)str);
                resultList.addErrorMessage(str);
                resultList.addFailInfo((Object)str);
            }
            finally {
                double percent = (double)(resultList.getSucessCount() + resultList.getFailCount()) / (double)(resultList.getCount() * PubBatchModifyEntityServiceImpl.modifyTimesAccordingEntitiesMap.get(AppContext.getYTenantId() + pubBatchModifyMutilEntitySaveDTO.getBillNum())) * 100.0 - 0.5;
                BigDecimal bigDecimal = new BigDecimal(percent);
                BigDecimal percentage = bigDecimal.setScale(2, RoundingMode.HALF_UP);
                if (percentage.doubleValue() >= 100.0) {
                    percentage = new BigDecimal(99);
                }
                ProcessData.builder((int)1, (int)200, (Object)resultList, null).percentage(percentage.toString()).build(pubBatchModifyMutilEntitySaveDTO.getAsyncKey(), Integer.valueOf(pubBatchModifyMutilEntitySaveDTO.getExpireTime()));
            }
        }
        resultListMap.put(AppContext.getYTenantId() + pubBatchModifyMutilEntitySaveDTO.getBillNum(), resultList);
        resultYtenentMap.put(AppContext.getYTenantId() + pubBatchModifyMutilEntitySaveDTO.getBillNum(), resultMap);
    }

    private void saveSKU(ProductSKU sku, HashMap<String, Object> stringObjectHashMap, ResultList resultList, ConcurrentHashMap<String, Boolean> resultMap, String uniqueIdentifier) throws Exception {
        BillDataDto batchModifyDto = new BillDataDto();
        batchModifyDto.setData((Object)Objectlizer.convert((Map)sku, (String)"pc.product.ProductSKU"));
        batchModifyDto.setBillnum("pc_goodsproductskuprolist");
        batchModifyDto.setExternalData(stringObjectHashMap);
        RuleExecuteResult batchModifyRes = this.billService.executeUpdate("batchModify&save", batchModifyDto);
        if (batchModifyRes.getMsgCode() != 1) {
            String errorMesage = batchModifyRes.getMessage();
            resultList.incResultCount(false);
            resultMap.put(uniqueIdentifier, false);
            String str = String.format(InternationalUtils.getMessageWithDefault((String)"UID:P_COREDOC-BE_1B57FC1805A00006", (String)InternationalUtils.getMessageWithDefault((String)"UID:P_COREDOC-BE_1E4F229C04180019", (String)"%s\u3010%s\u3011\u6279\u6539\u90e8\u5206\u5b57\u6bb5\u5931\u8d25,\u539f\u56e0\u4e3a[%s]")), "SKU", uniqueIdentifier, errorMesage);
            resultList.addInfo((Object)str);
            resultList.addErrorMessage(str);
            resultList.addFailInfo((Object)str);
        } else {
            if (resultMap.containsKey(uniqueIdentifier)) {
                Boolean codeRes = resultMap.get(uniqueIdentifier);
                resultMap.put(uniqueIdentifier, codeRes != false);
            } else {
                resultMap.put(uniqueIdentifier, true);
            }
            resultList.incResultCount(true);
        }
    }

    @NotNull
    private ProductSKU generateSKUData(PubBatchModifyMutilEntitySaveDTO pubBatchModifyMutilEntitySaveDTO, BizObject bizObject, HashMap<String, Object> stringObjectHashMap) throws Exception {
        List pubBatchModifyMutilEntityDTOList = pubBatchModifyMutilEntitySaveDTO.getPubBatchModifyMutilEntityDTOList();
        List productskuEntityList = pubBatchModifyMutilEntityDTOList.stream().filter(s -> "pc.product.ProductSKU".equals(s.getFullName())).collect(Collectors.toList());
        List productskuDetailEntityList = pubBatchModifyMutilEntityDTOList.stream().filter(s -> "pc.product.ProductSkuDetailNew".equals(s.getFullName())).collect(Collectors.toList());
        ProductSKU sku = new ProductSKU();
        sku.init((Map)bizObject);
        if (!CollectionUtils.isEmpty(productskuEntityList)) {
            Map<String, Object> range = this.checkCanModify(bizObject);
            Iterator<Map.Entry<String, Object>> pubBatchModifyEntityFieldSaveIsCheckMap = new HashMap();
            for (PubBatchModifyEntityFieldSaveDTO pubBatchModifyEntityFieldSaveDTO : ((PubBatchModifyOnelEntityDTO)productskuEntityList.get(0)).getBatchModifyEntityFieldSaveList()) {
                pubBatchModifyEntityFieldSaveIsCheckMap.put(pubBatchModifyEntityFieldSaveDTO.getFieldName(), pubBatchModifyEntityFieldSaveDTO.getValue());
            }
            pubBatchModifyEntityFieldSaveIsCheckMap.entrySet().forEach(entry -> stringObjectHashMap.put((String)entry.getKey(), entry.getValue()));
            this.productSkuPubBatchModifyExtHandler.convertSKUPropCharacterMap((Map<String, Object>)((Object)pubBatchModifyEntityFieldSaveIsCheckMap));
            PubBatchModifyEntitySaveDTO pubBatchModifyEntitySaveDTO = new PubBatchModifyEntitySaveDTO();
            BeanUtils.copyProperties(productskuEntityList.get(0), (Object)pubBatchModifyEntitySaveDTO);
            pubBatchModifyEntitySaveDTO.setAsyncKey(pubBatchModifyMutilEntitySaveDTO.getAsyncKey());
            pubBatchModifyEntitySaveDTO.setExpireTime(pubBatchModifyMutilEntitySaveDTO.getExpireTime());
            pubBatchModifyEntitySaveDTO.setBillNum(pubBatchModifyMutilEntitySaveDTO.getBillNum());
            pubBatchModifyEntitySaveDTO.setIdList(pubBatchModifyMutilEntitySaveDTO.getIdList());
            pubBatchModifyEntitySaveDTO.setExtIdList(pubBatchModifyMutilEntitySaveDTO.getExtIdList());
            List<Map> characters = this.productSkuPubBatchModifyExtHandler.checkSKUPropCharacters(bizObject, (Map<String, Object>)((Object)pubBatchModifyEntityFieldSaveIsCheckMap), pubBatchModifyEntitySaveDTO);
            Map<String, String> skuCharacterTypeMap = ModifyUtils.findMaterialCharacterTypeMap(characters);
            sku.put("orgId", range.get("orgId"));
            sku.put("productApplyRangeId", (Object)range.get("id").toString());
            sku.put("isCreator", range.get("isCreator"));
            sku.put("isApplied", range.get("isApplied"));
            this.productSkuDetailNewPubBatchModifyExtHandler.detailProductSKU(sku);
            for (Map.Entry<String, Object> entry2 : pubBatchModifyEntityFieldSaveIsCheckMap.entrySet()) {
                if ("skuPropCharacter".equals(entry2.getKey())) {
                    ProductSkuPubBatchModifyExtHandler.processSKUPropCharacter(pubBatchModifyEntityFieldSaveIsCheckMap, entry2, sku, skuCharacterTypeMap);
                    continue;
                }
                sku.put((String)entry2.getKey(), entry2.getValue());
            }
            sku.setEntityStatus(EntityStatus.Update);
        }
        if (!CollectionUtils.isEmpty(productskuDetailEntityList) && CollectionUtils.isEmpty(productskuEntityList)) {
            Map<String, Object> rangeData = ProductSKUBillNumPubBatchModifyExtHandler.getRangeData(bizObject);
            sku.put("orgId", rangeData.get("orgId"));
            sku.put("productApplyRangeId", (Object)rangeData.get("id").toString());
            sku.put("isCreator", rangeData.get("isCreator"));
            sku.put("isApplied", rangeData.get("isApplied"));
            this.productSkuDetailNewPubBatchModifyExtHandler.detailProductSKU(sku);
        }
        if (!CollectionUtils.isEmpty(productskuDetailEntityList)) {
            HashMap<String, Object> productskudetailIsCheckFieldMap = new HashMap<String, Object>();
            for (PubBatchModifyEntityFieldSaveDTO productSkuDetailEntity : ((PubBatchModifyOnelEntityDTO)productskuDetailEntityList.get(0)).getBatchModifyEntityFieldSaveList()) {
                productskudetailIsCheckFieldMap.put(productSkuDetailEntity.getFieldName(), productSkuDetailEntity.getValue());
                stringObjectHashMap.put("productSKUDetail!" + productSkuDetailEntity.getFieldName(), productSkuDetailEntity.getValue());
            }
            for (Map.Entry entry3 : productskudetailIsCheckFieldMap.entrySet()) {
                sku.productSKUDetail().put((String)entry3.getKey(), entry3.getValue());
            }
            sku.productSKUDetail().setEntityStatus(EntityStatus.Update);
            ProductSkuDetailNew skuDetailNew = new ProductSkuDetailNew();
            skuDetailNew.init((Map)sku.productSKUDetail());
            ArrayList<ProductSkuDetailNew> skuDetailNews = new ArrayList<ProductSkuDetailNew>();
            skuDetailNews.add(skuDetailNew);
            sku.setProductSkuDetailNew(skuDetailNews);
        }
        return sku;
    }

    private Map<String, Object> checkCanModify(BizObject bizObject) throws Exception {
        Map<String, Object> range = ProductSKUBillNumPubBatchModifyExtHandler.getRangeData(bizObject);
        if (BooleanUtil.isFalse((Object)range.get("isCreator").toString())) {
            throw new CoreDocBusinessException(CoreDocBusinessErrorEnum.SKU_BATCH_MODIFY_ERROR, new Object[]{String.format(InternationalUtils.getMessageWithDefault((String)"UID:P_COREDOC-BE_1E4F229C04180015", (String)"\u4f7f\u7528\u7ec4\u7ec7SKU\u3010%s\u3011\u4e0d\u5141\u8bb8\u6279\u6539SKU\u4e3b\u8868\u7279\u5f81/\u57fa\u672c\u4fe1\u606f\u6269\u5c55\u5b57\u6bb5/SKU\u5c5e\u6027\u7279\u5f81\u7ec4\u5b57\u6bb5/\u5305\u88c5\u5355\u4f4d"), bizObject.get("code").toString())});
        }
        return range;
    }

    private static Map<String, Object> getRangeData(BizObject bizObject) throws Exception {
        QuerySchema schema = QuerySchema.create().addSelect(new String[]{"id", "isCreator", "isApplied", "orgId"}).addCondition((ConditionExpression)QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"productId").eq((Object)bizObject.get("productId").toString()), QueryCondition.name((String)"productDetailId").eq((Object)bizObject.get("productDetailId").toString()), QueryCondition.name((String)"isApplied").eq((Object)1)}));
        List ranges = MetaDaoHelper.query((String)"pc.product.ProductApplyRange", (QuerySchema)schema);
        if (CollectionUtils.isEmpty((Collection)ranges)) {
            throw new CoreDocBusinessException(CoreDocBusinessErrorEnum.SKU_BATCH_MODIFY_ERROR, new Object[]{InternationalUtils.getMessageWithDefault((String)"UID:P_COREDOC-BE_21B2E70E05780004", (String)"\u6ca1\u6709\u627e\u5230\u5bf9\u5e94\u7684\u9002\u7528\u8303\u56f4")});
        }
        if (ranges.size() > 1) {
            throw new CoreDocBusinessException(CoreDocBusinessErrorEnum.SKU_BATCH_MODIFY_ERROR, new Object[]{InternationalUtils.getMessageWithDefault((String)"UID:P_COREDOC-BE_21B2E70E05780005", (String)"\u627e\u5230\u591a\u4e2a\u9002\u7528\u8303\u56f4")});
        }
        Map range = (Map)ranges.get(0);
        return range;
    }
}


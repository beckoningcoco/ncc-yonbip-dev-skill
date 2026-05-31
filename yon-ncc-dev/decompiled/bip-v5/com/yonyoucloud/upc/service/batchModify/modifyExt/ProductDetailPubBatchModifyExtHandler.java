/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.alibaba.fastjson.JSON
 *  com.alibaba.fastjson.JSONObject
 *  com.alibaba.fastjson.serializer.SerializerFeature
 *  com.yonyou.iuap.apdoc.coredoc.batchmodify.extinterface.IPubBatchModifyEntityExtService
 *  com.yonyou.iuap.apdoc.coredoc.constant.ApplicationCodeConstant
 *  com.yonyou.iuap.apdoc.coredoc.constants.UPCConstants
 *  com.yonyou.iuap.apdoc.coredoc.enums.CoreDocBusinessErrorEnum
 *  com.yonyou.iuap.apdoc.coredoc.enums.CoreExtrateBusinessErrorEnum
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
 *  com.yonyoucloud.upc.coredoc.pub.PubBatchModifyEntityField
 *  com.yonyoucloud.upc.pc.product.BusinessAttributeEnum
 *  com.yonyoucloud.upc.pc.product.Product
 *  com.yonyoucloud.upc.pc.product.ProductDetail
 *  com.yonyoucloud.upc.utils.BizObjectUtils
 *  org.apache.commons.lang3.StringUtils
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
 */
package com.yonyoucloud.upc.service.batchModify.modifyExt;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.serializer.SerializerFeature;
import com.yonyou.iuap.apdoc.coredoc.batchmodify.extinterface.IPubBatchModifyEntityExtService;
import com.yonyou.iuap.apdoc.coredoc.constant.ApplicationCodeConstant;
import com.yonyou.iuap.apdoc.coredoc.constants.UPCConstants;
import com.yonyou.iuap.apdoc.coredoc.enums.CoreDocBusinessErrorEnum;
import com.yonyou.iuap.apdoc.coredoc.enums.CoreExtrateBusinessErrorEnum;
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
import com.yonyoucloud.upc.billrule.common.SaveNotifyNewRule;
import com.yonyoucloud.upc.billrule.goodsAchive.ProductSKUShelveRule;
import com.yonyoucloud.upc.coredoc.batchentity.dto.PubBatchModifyEntitySaveDTO;
import com.yonyoucloud.upc.coredoc.pub.PubBatchModifyEntityField;
import com.yonyoucloud.upc.event.EventService2;
import com.yonyoucloud.upc.event.EventType;
import com.yonyoucloud.upc.pc.product.BusinessAttributeEnum;
import com.yonyoucloud.upc.pc.product.Product;
import com.yonyoucloud.upc.pc.product.ProductDetail;
import com.yonyoucloud.upc.service.ProductCheckService;
import com.yonyoucloud.upc.service.batchModify.modifyExt.ProductPubBatchModifyExtHandler;
import com.yonyoucloud.upc.service.utils.ProductUtil;
import com.yonyoucloud.upc.utils.BizObjectUtils;
import java.math.BigDecimal;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.ConcurrentHashMap;
import org.apache.commons.lang3.StringUtils;
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

@Service
public class ProductDetailPubBatchModifyExtHandler
implements IPubBatchModifyEntityExtService {
    private static final Logger log = LoggerFactory.getLogger(ProductDetailPubBatchModifyExtHandler.class);
    @Autowired
    @Qualifier(value="pc.BillService")
    private IUPCBillService billService;
    @Autowired
    private ProductSKUShelveRule productSKUShelveRule;
    @Autowired
    ProductCheckService checkService;
    private HashMap radioFieldNames = new HashMap();
    @Autowired
    SaveNotifyNewRule saveNotifyNewRule;
    @Autowired
    ProductPubBatchModifyExtHandler productPubBatchModifyExtHandler;
    @Autowired
    private IBusiLogService busiLogService;
    @Autowired
    private EventService2 eventService2;

    public void batchModifyIsCheckField(BizObject bizObject, Map<String, Object> pubBatchModifyEntityFieldSaveIsCheckMap, PubBatchModifyEntitySaveDTO pubBatchModifyEntitySaveDTO) throws Exception {
        this.initRadioField(this.radioFieldNames, "Radio");
        ProductDetail productDetail = new ProductDetail();
        productDetail.init((Map)bizObject);
        Product product = new Product();
        product.put("id", (Object)productDetail.getProductId());
        QueryConditionGroup queryConditionGroup = new QueryConditionGroup();
        queryConditionGroup.addCondition((ConditionExpression)QueryCondition.name((String)"id").eq(productDetail.get("id")));
        QuerySchema schemaProduct = QuerySchema.create().addSelect("productApplyRangeId.isCreator as isCreator,productApplyRangeId.isApplied as isApplied, productApplyRangeId.orgId as productApplyRange_OrgId,productApplyRangeId as productApplyRangeId").addCondition((ConditionExpression)queryConditionGroup);
        List productList = MetaDaoHelper.query((String)"pc.product.ProductDetail", (QuerySchema)schemaProduct);
        if (productList == null || productList.size() == 0) {
            throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_801457);
        }
        product.put("productApplyRange_orgId", ((Map)productList.get(0)).get("productApplyRange_OrgId"));
        product.put("productApplyRangeId", ((Map)productList.get(0)).get("productApplyRangeId"));
        product.put("isCreator", (Object)(BooleanUtil.isTrue(((Map)productList.get(0)).get("isCreator")) ? 1 : 0));
        product.put("isApplied", (Object)(BooleanUtil.isTrue(((Map)productList.get(0)).get("isApplied")) ? 1 : 0));
        this.productPubBatchModifyExtHandler.detailProduct(product, ((Map)productList.get(0)).get("productApplyRangeId").toString());
        this.insertNewValueToProduct(pubBatchModifyEntityFieldSaveIsCheckMap, product);
        if (pubBatchModifyEntityFieldSaveIsCheckMap.containsKey("businessAttribute") && pubBatchModifyEntityFieldSaveIsCheckMap.get("businessAttribute") != null && pubBatchModifyEntityFieldSaveIsCheckMap.get("businessAttribute").toString().contains(String.valueOf(BusinessAttributeEnum.SALE.getValue()))) {
            product.setUseSku(Integer.valueOf(1));
            product.setEntityStatus(EntityStatus.Update);
        }
        product.set("_fromBatchModify", (Object)true);
        ProductUtil.dealMutilField(product, UPCConstants.mutilFieldNames);
        product.setEntityStatus(EntityStatus.Update);
        product.detail().setEntityStatus(EntityStatus.Update);
        this.checkService.commonCheckForProductDetail(product);
        if (product.detail() != null) {
            this.checkService.checkDecimalForCommonCheck(product.detail());
        }
        BillDataDto batchModifyDto = new BillDataDto();
        batchModifyDto.setData((Object)product);
        if (pubBatchModifyEntitySaveDTO.getBillNum() == null || "pc_product".equals(pubBatchModifyEntitySaveDTO.getBillNum())) {
            batchModifyDto.setBillnum("pc_productlist");
        } else {
            batchModifyDto.setBillnum("pc_productlist_query");
        }
        this.productPubBatchModifyExtHandler.initBillDataDto(batchModifyDto);
        HashMap stringObjectHashMap = new HashMap();
        pubBatchModifyEntityFieldSaveIsCheckMap.entrySet().forEach(entry -> stringObjectHashMap.put("detail!" + (String)entry.getKey(), entry.getValue()));
        batchModifyDto.setExternalData(stringObjectHashMap);
        RuleExecuteResult batchModifyRes = this.billService.executeUpdate("batchModify&save", batchModifyDto);
        if (batchModifyRes.getMsgCode() != 1) {
            throw new CoreDocBusinessException(batchModifyRes.getMessage());
        }
    }

    private void insertNewValueToProduct(Map<String, Object> pubBatchModifyEntityFieldSaveIsCheckMap, Product product) throws Exception {
        StringBuilder errorMessasge = new StringBuilder();
        for (Map.Entry<String, Object> entry : pubBatchModifyEntityFieldSaveIsCheckMap.entrySet()) {
            this.convertTypeAndInsert(product, entry, errorMessasge);
        }
        if (errorMessasge.length() > 0) {
            throw new CoreDocBusinessException(String.format(InternationalUtils.getMessageWithDefault((String)"UID:P_COREDOC-BE_1B0114E60428000F", (String)"\u5b57\u6bb5\u3010%s\u3011\u4e0d\u80fd\u6279\u6539\u4e3a\u7a7a\uff01"), errorMessasge.substring(0, errorMessasge.length() - 1)));
        }
    }

    public void initRadioField(HashMap radioFieldNames, String type) throws Exception {
        if (radioFieldNames.size() > 0) {
            return;
        }
        QuerySchema querySchema = QuerySchema.create();
        querySchema.addSelect("fieldName,fieldCaption");
        querySchema.addCondition((ConditionExpression)QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"controlType").eq((Object)type), QueryCondition.name((String)"ytenant").eq((Object)"0")}));
        querySchema.setPartitionable(false);
        List listREs = MetaDaoHelper.queryObject((String)"coredoc.pub.PubBatchModifyEntityField", (QuerySchema)querySchema, null);
        for (PubBatchModifyEntityField pub : listREs) {
            radioFieldNames.put(pub.getFieldName(), pub.getFieldCaption());
        }
    }

    public void convertTypeAndInsert(Product product, Map.Entry<String, Object> entry, StringBuilder errorMessasge) throws Exception {
        String key = entry.getKey();
        String keyNewValue = "detail!" + entry.getKey();
        Object value = entry.getValue();
        if (Objects.isNull(value)) {
            if (ProductPubBatchModifyExtHandler.getNotNullFieldsMap().containsKey(key)) {
                errorMessasge.append(ProductPubBatchModifyExtHandler.getNotNullFieldsMap().get(key)).append("\uff0c");
            }
            if (this.radioFieldNames.size() > 0 && this.radioFieldNames.containsKey(key.toString())) {
                errorMessasge.append(this.radioFieldNames.get(key.toString())).append("\uff0c");
                return;
            }
            product.detail().put(key, null);
            product.put(keyNewValue, null);
            return;
        }
        if ("taxClass".equals(key)) {
            product.put(key, value);
            return;
        }
        String fieldType = BizObjectUtils.getFieldType((String)"pc.product.ProductExtend", (String)key);
        if (fieldType != null) {
            if (fieldType.contains("Long")) {
                product.detail().put(key, (Object)Long.parseLong(value.toString()));
                product.put(keyNewValue, (Object)Long.parseLong(value.toString()));
            } else if (fieldType.contains("Integer")) {
                if (BooleanUtil.isTrue((Object)value.toString())) {
                    product.detail().put(key, (Object)1);
                    product.put(keyNewValue, (Object)1);
                } else if (BooleanUtil.isFalse((Object)value.toString())) {
                    product.detail().put(key, (Object)0);
                    product.put(keyNewValue, (Object)0);
                } else {
                    product.detail().put(key, (Object)Integer.parseInt(value.toString()));
                    product.put(keyNewValue, (Object)Integer.parseInt(value.toString()));
                }
            } else if (fieldType.contains("Boolean")) {
                product.detail().put(key, (Object)Boolean.parseBoolean(value.toString()));
                product.put(keyNewValue, (Object)Boolean.parseBoolean(value.toString()));
            } else if (fieldType.contains("Short")) {
                product.detail().put(key, (Object)Short.parseShort(value.toString()));
                product.put(keyNewValue, (Object)Short.parseShort(value.toString()));
            } else if (fieldType.contains("BigDecimal")) {
                product.detail().put(key, (Object)new BigDecimal(value.toString()));
                product.put(keyNewValue, (Object)new BigDecimal(value.toString()));
            } else if (fieldType.contains("String")) {
                if (ProductPubBatchModifyExtHandler.mutilFieldNames.containsKey(key)) {
                    product.detail().put(key, value);
                    product.put(keyNewValue, value);
                } else {
                    product.detail().put(key, (Object)value.toString());
                    product.put(keyNewValue, (Object)value.toString());
                }
            } else if (fieldType.contains("Decimal")) {
                product.detail().put(key, (Object)new BigDecimal(value.toString()));
                product.put(keyNewValue, (Object)new BigDecimal(value.toString()));
            } else {
                product.detail().put(key, value);
                product.put(keyNewValue, value);
            }
        } else {
            product.detail().put(key, value);
            product.put(keyNewValue, value);
        }
    }

    public void extendQuerySchema(QuerySchema querySchema, PubBatchModifyEntitySaveDTO pubBatchModifyEntitySaveDTO) throws Exception {
        ProductPubBatchModifyExtHandler.dealQuerySchemaForTaxClass(querySchema);
        ProductPubBatchModifyExtHandler.dealQuerySchemaForMutil(querySchema);
        querySchema.addSelect("id,productId.code as code,productApplyRangeId as productApplyRangeId");
        if (StringUtils.isEmpty((CharSequence)pubBatchModifyEntitySaveDTO.getBillNum())) {
            throw new CoreDocBusinessException(CoreDocBusinessErrorEnum.BILLNUM_CAN_NOT_BE_NULL_ERROR);
        }
        if ("pc_productdetail".equals(pubBatchModifyEntitySaveDTO.getBillNum())) {
            if (CollectionUtils.isEmpty((Collection)pubBatchModifyEntitySaveDTO.getExtIdList())) {
                throw new CoreDocBusinessException(CoreDocBusinessErrorEnum.PRODUCTAPPLYRANGEID_IS_NULL_ERROR);
            }
            querySchema.appendQueryCondition(new ConditionExpression[]{QueryCondition.name((String)"productApplyRangeId").in((Collection)pubBatchModifyEntitySaveDTO.getExtIdList())});
        } else if ("pc_product".equals(pubBatchModifyEntitySaveDTO.getBillNum())) {
            querySchema.appendQueryCondition(new ConditionExpression[]{QueryCondition.name((String)"isCreator").eq((Object)true)});
        }
    }

    public void initData(PubBatchModifyEntitySaveDTO pubBatchModifyEntitySaveDTO, ConcurrentHashMap<String, ResultList> resultListMap) {
        ResultList resultList = resultListMap.get(AppContext.getYTenantId() + pubBatchModifyEntitySaveDTO.getBillNum());
        if ("pc_productdetail".equals(pubBatchModifyEntitySaveDTO.getBillNum())) {
            this.initRangeProductData(pubBatchModifyEntitySaveDTO, resultList);
        }
        resultListMap.put(AppContext.getYTenantId() + pubBatchModifyEntitySaveDTO.getBillNum(), resultList);
    }

    private void initRangeProductData(PubBatchModifyEntitySaveDTO pubBatchModifyEntitySaveDTO, ResultList resultList) {
        HashMap<String, Object> pubBatchModifyEntityFieldSaveMap = new HashMap<String, Object>();
        pubBatchModifyEntitySaveDTO.getBatchModifyEntityFieldSaveList().stream().forEach(modifyEntityFieldSaveList -> pubBatchModifyEntityFieldSaveMap.put(modifyEntityFieldSaveList.getFieldName(), modifyEntityFieldSaveList.getValue()));
        List productApplyRangeIdList = pubBatchModifyEntitySaveDTO.getExtIdList();
        for (Object productApplyRangeId : productApplyRangeIdList) {
            this.initRangeData(resultList, productApplyRangeId, pubBatchModifyEntityFieldSaveMap);
        }
    }

    private void initRangeData(ResultList resultList, Object productApplyRangeId, Map<String, Object> pubBatchModifyEntityFieldSaveMap) {
        try {
            List ranges = MetaDaoHelper.queryById((String)"pc.product.ProductApplyRange", (String)"id,isApplied,productId", (Object)productApplyRangeId);
            Map range = (Map)ranges.get(0);
            if (!Boolean.parseBoolean(range.get("isApplied").toString())) {
                String productId = range.get("productId").toString();
                Boolean isCreator = false;
                Boolean isApplied = false;
                String billnum = "pc_productdetail";
                HashMap<String, Object> saveParams = new HashMap<String, Object>(3);
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
                Product product = (Product)Objectlizer.convert((Map)detail, (String)"pc.product.Product");
                HashSet<String> fieldSet = new HashSet<String>();
                fieldSet.add("deliveryWarehouse");
                fieldSet.add("deliveryWarehouseId");
                fieldSet.add("returnWarehouse");
                fieldSet.add("receiptWarehouse");
                fieldSet.add("omsWarehouse");
                fieldSet.add("productVendor");
                fieldSet.add("productBuyer");
                fieldSet.add("warehouseManager");
                boolean flag = false;
                for (Map.Entry<String, Object> entry : pubBatchModifyEntityFieldSaveMap.entrySet()) {
                    if (!fieldSet.contains(entry.getKey())) continue;
                    flag = true;
                }
                if (flag) {
                    this.insertNewValueToProduct(pubBatchModifyEntityFieldSaveMap, product);
                }
                BillDataDto saveDto = new BillDataDto();
                saveDto.setData((Object)product);
                saveDto.setBillnum(billnum);
                this.billService.executeUpdate("save", saveDto);
            }
        }
        catch (Exception e) {
            resultList.addErrorMessage("\u5b9e\u4f8b\u5316\u5931\u8d25\uff1a" + e.getMessage());
            resultList.incResultCount(false);
            log.error("\u5b9e\u4f8b\u5316\u5931\u8d25\uff1a" + productApplyRangeId + "\uff0cerrorMessage:" + e.getMessage());
        }
    }

    /*
     * WARNING - void declaration
     */
    public void update(String fullName, BizObject newBizObjectUpdate, PubBatchModifyEntitySaveDTO pubBatchModifyEntitySaveDTO) throws Exception {
        Map productExtendCharacterDef;
        this.productPubBatchModifyExtHandler.addAuditFields(newBizObjectUpdate);
        if (newBizObjectUpdate.containsKey((Object)"productExtendCharacterDef") && "pc_productdetail".equals(pubBatchModifyEntitySaveDTO.getBillNum()) && (productExtendCharacterDef = (Map)newBizObjectUpdate.get("productExtendCharacterDef")).get("_status") != null && EntityStatus.Insert == productExtendCharacterDef.get("_status")) {
            QuerySchema schema = QuerySchema.create().addSelect("productExtendCharacterDef").addCondition((ConditionExpression)QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"id").in(new Object[]{newBizObjectUpdate.get("id").toString()})}));
            List productPropCharacterDefine = MetaDaoHelper.query((String)"pc.product.ProductDetail", (QuerySchema)schema);
            if (!CollectionUtils.isEmpty((Collection)productPropCharacterDefine)) {
                Map map = (Map)productPropCharacterDefine.get(0);
                if (map.containsKey("productExtendCharacterDef") && map.get("productExtendCharacterDef") instanceof Map) {
                    Map stringObjectMap = (Map)map.get("productExtendCharacterDef");
                    String characterId = stringObjectMap.get("id").toString();
                    productExtendCharacterDef.put("id", characterId);
                    productExtendCharacterDef.put("_status", EntityStatus.Update);
                }
            } else {
                QuerySchema schemaCreator = QuerySchema.create().addSelect("productExtendCharacterDef.*").addCondition((ConditionExpression)QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"productId").eq((Object)newBizObjectUpdate.get("productId").toString()), QueryCondition.name((String)"productApplyRangeId.isCreator").eq((Object)true)}));
                List productExtendPropCharacterDefine = MetaDaoHelper.query((String)"pc.product.ProductDetail", (QuerySchema)schemaCreator);
                if (!CollectionUtils.isEmpty((Collection)productExtendPropCharacterDefine)) {
                    for (Map stringObjectMap : productExtendPropCharacterDefine) {
                        for (Map.Entry entry : stringObjectMap.entrySet()) {
                            String strKey = "";
                            if (((String)entry.getKey()).startsWith("productExtendCharacterDef_")) {
                                strKey = ((String)entry.getKey()).substring("productExtendCharacterDef_".length());
                            }
                            if (productExtendCharacterDef.containsKey(strKey)) continue;
                            productExtendCharacterDef.put(strKey, entry.getValue());
                        }
                    }
                }
            }
        }
        MetaDaoHelper.update((String)fullName, (BizObject)newBizObjectUpdate);
        if (pubBatchModifyEntitySaveDTO.getUpdateLog().booleanValue()) {
            Object productDetailId = newBizObjectUpdate.get("id");
            QuerySchema querSchema = QuerySchema.create().addSelect("productId,productId.code as productCode").addCondition((ConditionExpression)QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"id").eq(productDetailId)}));
            List productDetailList = MetaDaoHelper.queryObject((String)"pc.product.ProductDetail", (QuerySchema)querSchema, null);
            if (productDetailList != null && productDetailList.size() > 0) {
                void var12_17;
                String productId = newBizObjectUpdate.get("productId") instanceof Long ? newBizObjectUpdate.get("productId").toString() : newBizObjectUpdate.get("productId").toString();
                String productCode = ((ProductDetail)productDetailList.get(0)).get("productCode").toString();
                BillDataDto billDataDtoProductLog = new BillDataDto("pc_product", productId);
                Map productDetail = this.billService.detail(billDataDtoProductLog);
                for (String string : newBizObjectUpdate.keySet()) {
                    if (!ProductPubBatchModifyExtHandler.notAddFields.contains(string)) {
                        productDetail.put(string, newBizObjectUpdate.get(string));
                    }
                    if (!string.equals("modifierId") && !string.equals("modifyTime") && !string.equals("modifyDate")) continue;
                    productDetail.put("detail!" + string, newBizObjectUpdate.get(string));
                }
                String appName = InternationalUtils.getMessageWithDefault((String)"UID:P_COREDOC-BE_179F6286040807D6", (String)"\u57fa\u7840\u6570\u636e");
                String string = InternationalUtils.getMessageWithDefault((String)"UID:P_COREDOC-BE_179F62860408039A", (String)"\u7269\u6599\u6863\u6848");
                String busiObjTypeCode = "pc_product";
                String busiObjTypeName = "UID:P_COREDOC-UI_17AA8032057002F6";
                String serviceCode = "pc_product";
                if (pubBatchModifyEntitySaveDTO.getBillNum() != null && "pc_productdetail".equals(pubBatchModifyEntitySaveDTO.getBillNum())) {
                    busiObjTypeCode = "pc_productdetail";
                    serviceCode = "pc_product_query";
                    String string2 = InternationalUtils.getMessageWithDefault((String)"UID:P_COREDOC-UI_1CABB9B404380007", (String)"\u7269\u6599\u4e1a\u52a1\u4fe1\u606f");
                }
                BusinessLogObjectBuilder businessLogObjectBuilder = new BusinessLogObjectBuilder();
                businessLogObjectBuilder.uri("pc.product.Product").busiObjTypeCode(busiObjTypeCode).busiObjTypeName(busiObjTypeName).defaultBusiObjTypeName("\u7269\u6599").operationName("UID:P_COREDOC-UI_17AAAFC8042017E9").defaultOperationName("\u6279\u6539").logMode(BusinessLogMode.UI_META).domain("productcenter").serviceCode(serviceCode).newObject((Object)productDetail).applicationName(appName).serviceName((String)var12_17).applicationCode(ApplicationCodeConstant.getApplicationCodeByFullName((String)"pc.product.Product")).dataId(productId).dataCode(productCode).dataName(productDetail.get("name").toString());
                this.busiLogService.saveBusinessLog(businessLogObjectBuilder.build());
                Product product = (Product)JSON.parseObject((String)JSON.toJSONString((Object)productDetail), Product.class);
                this.sendEvent(product);
            }
        }
    }

    public void sendEvent(Product product) {
        Product productData = this.saveNotifyNewRule.dealProductData(product, 100);
        String jsonStr = JSONObject.toJSONString((Object)productData, (SerializerFeature[])new SerializerFeature[]{SerializerFeature.WriteDateUseDateFormat});
        HashMap<String, Object> businessObject = new HashMap<String, Object>();
        businessObject.put("fullname", "pc.product.Product");
        if ("".equals(jsonStr)) {
            return;
        }
        businessObject.put("archive", jsonStr);
        try {
            String eventType = EventType.find("pc_product", "save", EntityStatus.Update.toString()).toString();
            this.eventService2.sendEvent("YXYBASEDOC", eventType, businessObject);
        }
        catch (Exception e) {
            log.error(InternationalUtils.getMessageWithDefault((String)"UID:P_COREDOC-BE_179F62860408021B", (String)"\u4fdd\u5b58\u65f6\u53d1\u9001\u4e8b\u4ef6\u5931\u8d25") + e.getMessage(), (Throwable)e);
        }
    }
}


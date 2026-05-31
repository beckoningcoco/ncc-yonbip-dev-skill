/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.gson.JsonObject
 *  com.yonyou.iuap.apdoc.coredoc.enums.CoreDocBusinessErrorEnum
 *  com.yonyou.iuap.apdoc.coredoc.enums.CoreExtrateBusinessErrorEnum
 *  com.yonyou.iuap.apdoc.coredoc.exceptions.CoreDocBusinessException
 *  com.yonyou.iuap.apdoc.coredoc.option.service.PubOptionService
 *  com.yonyou.iuap.apdoc.coredoc.utils.BooleanUtil
 *  com.yonyou.iuap.ucf.common.i18n.InternationalUtils
 *  com.yonyou.ucf.mdd.ext.bill.dto.BillDataDto
 *  com.yonyou.ucf.mdd.ext.bill.rule.common.ResultList
 *  com.yonyou.ucf.mdd.ext.core.AppContext
 *  com.yonyou.ucf.mdd.ext.dao.meta.MetaDaoHelper
 *  com.yonyou.ucf.mdd.ext.dao.sql.SqlHelper
 *  com.yonyou.ucf.mdd.ext.model.BillContext
 *  com.yonyou.ucf.mdd.ext.option.util.OptionUtils
 *  com.yonyou.ucf.mdd.ext.util.DateKit
 *  com.yonyoucloud.upc.pc.product.AssistUnitType
 *  com.yonyoucloud.upc.pc.product.Product
 *  com.yonyoucloud.upc.pc.product.ProductAssistUnitExchange
 *  com.yonyoucloud.upc.pc.product.ProductExtend
 *  com.yonyoucloud.upc.pc.product.UnitExchangeType
 *  org.imeta.biz.base.Objectlizer
 *  org.imeta.orm.base.BizObject
 *  org.imeta.orm.base.EntityStatus
 *  org.imeta.orm.base.Json
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
package com.yonyoucloud.upc.service;

import com.google.gson.JsonObject;
import com.yonyou.iuap.apdoc.coredoc.enums.CoreDocBusinessErrorEnum;
import com.yonyou.iuap.apdoc.coredoc.enums.CoreExtrateBusinessErrorEnum;
import com.yonyou.iuap.apdoc.coredoc.exceptions.CoreDocBusinessException;
import com.yonyou.iuap.apdoc.coredoc.option.service.PubOptionService;
import com.yonyou.iuap.apdoc.coredoc.utils.BooleanUtil;
import com.yonyou.iuap.ucf.common.i18n.InternationalUtils;
import com.yonyou.ucf.mdd.ext.bill.dto.BillDataDto;
import com.yonyou.ucf.mdd.ext.bill.rule.common.ResultList;
import com.yonyou.ucf.mdd.ext.core.AppContext;
import com.yonyou.ucf.mdd.ext.dao.meta.MetaDaoHelper;
import com.yonyou.ucf.mdd.ext.dao.sql.SqlHelper;
import com.yonyou.ucf.mdd.ext.model.BillContext;
import com.yonyou.ucf.mdd.ext.option.util.OptionUtils;
import com.yonyou.ucf.mdd.ext.util.DateKit;
import com.yonyoucloud.upc.pc.product.AssistUnitType;
import com.yonyoucloud.upc.pc.product.Product;
import com.yonyoucloud.upc.pc.product.ProductAssistUnitExchange;
import com.yonyoucloud.upc.pc.product.ProductExtend;
import com.yonyoucloud.upc.pc.product.UnitExchangeType;
import com.yonyoucloud.upc.service.utils.DomainReferenceFieldCheckUtils;
import java.math.BigDecimal;
import java.math.MathContext;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import java.util.stream.Collectors;
import org.imeta.biz.base.Objectlizer;
import org.imeta.orm.base.BizObject;
import org.imeta.orm.base.EntityStatus;
import org.imeta.orm.base.Json;
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

@Service(value="productAssistUnitService")
public class ProductAssistUnitService {
    private static final Logger log = LoggerFactory.getLogger(ProductAssistUnitService.class);
    @Autowired
    @Qualifier(value="ymsLongTaskExecutorService")
    private ExecutorService longTaskExecutorService;
    @Autowired
    private PubOptionService pubOptionService;

    public ResultList saveProductAssistUnit(BillDataDto dto) throws Exception {
        ResultList result = new ResultList();
        ArrayList<Map<String, Object>> messages = new ArrayList<Map<String, Object>>();
        Object obj = dto.getData();
        List<BizObject> bills = new ArrayList<Product>();
        if (obj instanceof String) {
            Json json = new Json(obj.toString());
            bills = Objectlizer.decode((Json)json, (String)"pc.product.Product");
        } else if (obj instanceof List) {
            List tempDatas = (List)obj;
            for (Object o : tempDatas) {
                BizObject bo = Objectlizer.convert((Map)((Map)o), (String)"pc.product.Product");
                bills.add(bo);
            }
        } else if (obj instanceof BizObject) {
            bills.add((BizObject)((Product)obj));
        } else if (obj instanceof Map) {
            BizObject bo = Objectlizer.convert((Map)((Map)obj), (String)"pc.product.Product");
            bills.add(bo);
        }
        if (CollectionUtils.isEmpty(bills)) {
            return result;
        }
        result.setCount(bills.size());
        for (BizObject data : bills) {
            Product product = (Product)data;
            String erpCode = product.getErpCode();
            QuerySchema schema = QuerySchema.create().addSelect("id, unit, unitUseType,realProductAttribute").addCondition((ConditionExpression)QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"erpCode").eq((Object)erpCode)}));
            List existProducts = MetaDaoHelper.query((String)"pc.product.Product", (QuerySchema)schema);
            if (!CollectionUtils.isEmpty((Collection)existProducts)) {
                if (existProducts.size() > 1) {
                    result.incFailCount();
                    messages.add(this.collectResult(null, InternationalUtils.getMessageWithDefault((String)"UID:P_COREDOC-BE_179F62860408016F", (String)"\u7269\u6599\u5b58\u5728\u591a\u4e2a"), erpCode, false));
                    continue;
                }
                if (null != ((Map)existProducts.get(0)).get("unitUseType") && "1".equals(((Map)existProducts.get(0)).get("unitUseType").toString())) {
                    result.incFailCount();
                    messages.add(this.collectResult(null, InternationalUtils.getMessageWithDefault((String)"UID:P_COREDOC-BE_179F62860408016F", (String)"\u7269\u6599\u5b58\u5728\u591a\u4e2a"), erpCode, false));
                    continue;
                }
            } else {
                result.incFailCount();
                messages.add(this.collectResult(null, InternationalUtils.getMessageWithDefault((String)"UID:P_COREDOC-BE_179F628604080175", (String)"\u7269\u6599\u4e0d\u5b58\u5728"), erpCode, false));
                continue;
            }
            Object id = ((Map)existProducts.get(0)).get("id");
            Object unit = ((Map)existProducts.get(0)).get("unit");
            product.setId(id);
            product.setUnit(Long.valueOf(Long.parseLong(unit.toString())));
            product.setRealProductAttribute(Integer.valueOf(((Map)existProducts.get(0)).get("realProductAttribute").toString()));
            product.setEnableAssistUnit(Boolean.valueOf(true));
            product.setTenant((Long)AppContext.getTenantId());
            product.setEntityStatus(EntityStatus.Update);
            if (!CollectionUtils.isEmpty((Collection)product.productAssistUnitExchanges())) {
                try {
                    String resultMsg = this.checkRepeatAssistUnits(product.productAssistUnitExchanges(), product.getUnit());
                    if (null != resultMsg) {
                        result.incFailCount();
                        messages.add(this.collectResult(null, resultMsg, erpCode, false));
                        continue;
                    }
                    List assistUnits = MetaDaoHelper.query((String)"pc.product.ProductAssistUnitExchange", (QuerySchema)QuerySchema.create().addSelect("*").addCondition((ConditionExpression)QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"productId").eq(product.getId())})));
                    Map<Object, Object> assistUnitMap = new HashMap();
                    if (!CollectionUtils.isEmpty((Collection)assistUnits)) {
                        assistUnitMap = assistUnits.stream().collect(Collectors.toMap(x -> x.get("assistUnit").toString(), y -> y.get("id").toString()));
                    }
                    Boolean existBalance = false;
                    for (ProductAssistUnitExchange assistUnitExchange : product.productAssistUnitExchanges()) {
                        if (assistUnitMap.containsKey(assistUnitExchange.getAssistUnit().toString())) {
                            assistUnitExchange.setEntityStatus(EntityStatus.Update);
                            assistUnitExchange.setId((Object)Long.parseLong((String)assistUnitMap.get(assistUnitExchange.getAssistUnit().toString())));
                            this.processAssistUnitExchange(assistUnitExchange);
                        } else {
                            assistUnitExchange.setId((Object)IdManager.getInstance().nextId());
                            assistUnitExchange.setEntityStatus(EntityStatus.Insert);
                            assistUnitExchange.setProductId((Long)product.getId());
                            this.processAssistUnitExchange(assistUnitExchange);
                        }
                        if (BooleanUtil.isTrue((Object)assistUnitExchange.getBalance())) {
                            existBalance = true;
                        }
                        assistUnitExchange.setTenant((Long)AppContext.getTenantId());
                    }
                    if (this.pubOptionService.isOpenMultiFloat() && existBalance.booleanValue() && "2".equals(product.getRealProductAttribute().toString())) {
                        throw new CoreDocBusinessException(CoreDocBusinessErrorEnum.PRODUCT_REALPRODUCTATTRIBUTE_CAN_NOT_SET_VIRTUAL, new Object[]{erpCode});
                    }
                    MetaDaoHelper.update((String)"pc.product.Product", (BizObject)product);
                    for (ProductAssistUnitExchange assistUnitExchange : product.productAssistUnitExchanges()) {
                        assistUnitExchange.remove("_parent");
                    }
                }
                catch (Exception e) {
                    log.error(e.getMessage(), (Throwable)e);
                    result.incFailCount();
                    messages.add(this.collectResult(null, e.getMessage(), erpCode, false));
                    continue;
                }
            }
            result.incSucessCount();
            result.addInfo(this.collectResult((Map<String, Object>)product, null, erpCode, true));
        }
        result.setMessages(messages);
        return result;
    }

    private String checkRepeatAssistUnits(List<ProductAssistUnitExchange> productAssistUnitExchanges, Long mainUnit) {
        int fixedNum = 0;
        int floatingNum = 0;
        HashMap<String, String> existsUnits = new HashMap<String, String>(8);
        Boolean isOpenMultiFloat = this.pubOptionService.isOpenMultiFloat();
        for (ProductAssistUnitExchange assistUnit : productAssistUnitExchanges) {
            if (mainUnit.equals(assistUnit.getAssistUnit())) {
                return InternationalUtils.getMessageWithDefault((String)"UID:P_COREDOC-BE_179F628604080176", (String)"\u8f85\u8ba1\u91cf\u5355\u4f4d\u4e0d\u53ef\u4ee5\u548c\u4e3b\u8ba1\u91cf\u4e00\u81f4");
            }
            if (!assistUnit.containsKey((Object)"assistUnit")) {
                return InternationalUtils.getMessageWithDefault((String)"UID:P_COREDOC-BE_179F628604080170", (String)"\u8f85\u8ba1\u91cf\u5355\u4f4d\u4e0d\u80fd\u4e3a\u7a7a");
            }
            String assistUnitId = assistUnit.get("assistUnit").toString();
            if (existsUnits.containsKey(assistUnitId)) {
                return InternationalUtils.getMessageWithDefault((String)"UID:P_COREDOC-BE_179F628604080172", (String)"\u5b58\u5728\u91cd\u590d\u7684\u8f85\u8ba1\u91cf\u5355\u4f4d");
            }
            if (null == assistUnit.getUnitExchangeType()) {
                assistUnit.setUnitExchangeType(UnitExchangeType.fixed);
            }
            if (UnitExchangeType.fixed == assistUnit.getUnitExchangeType()) {
                ++fixedNum;
            }
            if (UnitExchangeType.floating == assistUnit.getUnitExchangeType()) {
                ++floatingNum;
            }
            if (floatingNum > 1) {
                return InternationalUtils.getMessageWithDefault((String)"UID:P_COREDOC-BE_179F628604080171", (String)"\u4e0d\u5141\u8bb8\u591a\u4e2a\u6d6e\u52a8\u6362\u7b97\u5355\u4f4d");
            }
            if (!isOpenMultiFloat.booleanValue() && floatingNum == 1 && fixedNum > 0) {
                return InternationalUtils.getMessageWithDefault((String)"UID:P_COREDOC-BE_179F628604080173", (String)"\u5b58\u5728\u6d6e\u52a8\u6362\u7b97\u5355\u4f4d\uff0c\u4e0d\u5141\u8bb8\u5b58\u5728\u56fa\u5b9a\u6362\u7b97\u5355\u4f4d");
            }
            if (!isOpenMultiFloat.booleanValue() && BooleanUtil.isTrue((Object)assistUnit.getBalance())) {
                return InternationalUtils.getMessageWithDefault((String)"UID:P_COREDOC-BE_2185635404680006", (String)"\u5f53\u53c2\u6570\u8bbe\u7f6e\u4e2d\u201c\u7269\u6599\u542f\u7528\u8f85\u8ba1\u91cf\u7ed3\u5b58\u201d\u4e3a\u5426\u65f6\uff0c\u8f85\u8ba1\u91cf\u5355\u4f4d\u4e0d\u652f\u6301\u8bbe\u7f6e\u201c\u7ed3\u5b58\u201d\u3002");
            }
            if (null == assistUnit.getAssistUnitCount()) {
                assistUnit.setAssistUnitCount(new BigDecimal(1));
            }
            if (null == assistUnit.getMainUnitCount()) {
                return InternationalUtils.getMessageWithDefault((String)"UID:P_COREDOC-BE_18630E7004D00034", (String)"\u4e3b\u8ba1\u91cf\u6570\u91cf\u4e0d\u80fd\u4e3a\u7a7a");
            }
            existsUnits.put(assistUnitId, assistUnitId);
        }
        return null;
    }

    private Map<String, Object> collectResult(Map<String, Object> info, Object msg, String code, boolean result) {
        HashMap<String, Object> resultMap = new HashMap<String, Object>();
        if (result) {
            resultMap.put("data", info);
            resultMap.put("key", code);
        } else {
            resultMap.put("message", msg);
            resultMap.put("key", code);
        }
        return resultMap;
    }

    private void processAssistUnitExchange(ProductAssistUnitExchange assistUnitExchange) {
        if (assistUnitExchange != null) {
            int scale = (Integer)OptionUtils.getSysOptionByName((String)"conversionAccuracy") > 2 ? (Integer)OptionUtils.getSysOptionByName((String)"conversionAccuracy") : 2;
            String mainUnitCount = assistUnitExchange.getMainUnitCount().toString();
            String assistUnitCount = assistUnitExchange.getAssistUnitCount().toString();
            BigDecimal mUnitCount = new BigDecimal(mainUnitCount, MathContext.DECIMAL64);
            BigDecimal aUnitCount = new BigDecimal(assistUnitCount, MathContext.DECIMAL64);
            if (aUnitCount.compareTo(BigDecimal.ZERO) <= 0 || mUnitCount.compareTo(BigDecimal.ZERO) <= 0) {
                throw new CoreDocBusinessException(CoreDocBusinessErrorEnum.MAINUNITCOUNT_ASSISTUNITCOUNT_NOT_BE_ZERO);
            }
            mainUnitCount = mUnitCount.stripTrailingZeros().toPlainString();
            assistUnitCount = aUnitCount.stripTrailingZeros().toPlainString();
            BigDecimal mainUnitRate = mUnitCount.divide(aUnitCount, scale, 4);
            if (mainUnitRate.compareTo(BigDecimal.ZERO) <= 0) {
                throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_800259);
            }
            String assistVersValue = mainUnitCount + "/" + assistUnitCount;
            assistUnitExchange.setMainUnitCountNew(mUnitCount);
            assistUnitExchange.setMainUnitCount(mainUnitRate);
            assistUnitExchange.setMainUnitRate(mainUnitRate);
            assistUnitExchange.setAssistVersValue(assistVersValue);
        }
    }

    public void checkBusinessUnit(BillContext billContext, Map<String, Object> paramMap, Product product) throws Exception {
        boolean isNeedInitBusiUnitValue = false;
        String selectFields = "mainUnitRate, iOrder, assistVersValue, unitExchangeType, assistUnit, mainUnitCount, mainUnitCountNew, assistUnitCount, productId, id";
        QuerySchema schema = QuerySchema.create().addSelect(selectFields).addCondition((ConditionExpression)QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"productId").eq(product.getId())}));
        List assistUnitListFromDB = MetaDaoHelper.query((String)"pc.product.ProductAssistUnitExchange", (QuerySchema)schema);
        this.dealProductAssistUnitExchanges(billContext, paramMap, product, assistUnitListFromDB, isNeedInitBusiUnitValue);
    }

    private void dealProductAssistUnitExchanges(BillContext billContext, Map<String, Object> paramMap, Product product, List<Map> assistUnitListFromDB, boolean isNeedInitBusiUnitValue) throws Exception {
        if (!CollectionUtils.isEmpty((Collection)product.productAssistUnitExchanges())) {
            if (!CollectionUtils.isEmpty(assistUnitListFromDB)) {
                Map<String, Map> assistUnitAndMap = assistUnitListFromDB.stream().filter(v -> v.get("assistUnit") != null).collect(Collectors.toMap(x -> x.get("assistUnit").toString(), x -> x));
                Map<String, Map> idAndAssistUnitMap = assistUnitListFromDB.stream().collect(Collectors.toMap(x -> x.get("id").toString(), x -> x));
                for (ProductAssistUnitExchange assistUnitExchange : product.productAssistUnitExchanges()) {
                    Object unitTypeFromDB;
                    Map assistUnitMapFromDB = assistUnitAndMap.get(assistUnitExchange.getAssistUnit().toString());
                    UnitExchangeType unitType = assistUnitExchange.getUnitExchangeType();
                    if (null != assistUnitMapFromDB) {
                        unitTypeFromDB = assistUnitMapFromDB.get("unitExchangeType");
                        assistUnitExchange.setId((Object)Long.parseLong(assistUnitMapFromDB.get("id").toString()));
                        if (EntityStatus.Delete.equals((Object)assistUnitExchange.getEntityStatus())) {
                            this.checkAssiatUnitisUsed(billContext, paramMap, product, EntityStatus.Delete, null);
                            if (null == unitType || !UnitExchangeType.floating.equals((Object)unitType)) continue;
                            isNeedInitBusiUnitValue = true;
                            continue;
                        }
                        assistUnitExchange.setEntityStatus(EntityStatus.Update);
                        boolean checkFlag = true;
                        if (null != unitType && null != unitTypeFromDB && String.valueOf(unitType.getValue()).equals(unitTypeFromDB.toString())) {
                            BigDecimal mainUnitCountNew;
                            BigDecimal bigDecimal = mainUnitCountNew = assistUnitExchange.getMainUnitCountNew() != null ? assistUnitExchange.getMainUnitCountNew() : assistUnitExchange.getMainUnitCount();
                            if (UnitExchangeType.floating.equals((Object)unitType)) {
                                checkFlag = false;
                            } else if (assistUnitExchange.getAssistUnitCount().doubleValue() == ((BigDecimal)assistUnitMapFromDB.get("assistUnitCount")).doubleValue() && mainUnitCountNew.doubleValue() == ((BigDecimal)assistUnitMapFromDB.get("mainUnitCountNew")).doubleValue()) {
                                checkFlag = false;
                            }
                        } else if (null != unitType && null != unitTypeFromDB && !String.valueOf(unitType.getValue()).equals(unitTypeFromDB.toString()) && UnitExchangeType.floating.equals((Object)unitType) && assistUnitExchange.getAssistUnit() != null) {
                            ProductAssistUnitService.businessUnitUpdate(product.detail(), assistUnitExchange.getAssistUnit());
                        }
                        if (!checkFlag) continue;
                        this.checkAssiatUnitisUsed(billContext, paramMap, product, EntityStatus.Update, UnitExchangeType.fixed);
                        continue;
                    }
                    if (EntityStatus.Delete == assistUnitExchange.getEntityStatus()) {
                        assistUnitExchange.setEntityStatus(EntityStatus.Unchanged);
                        continue;
                    }
                    if (EntityStatus.Update != assistUnitExchange.getEntityStatus() || assistUnitExchange.getId() == null) continue;
                    assistUnitMapFromDB = idAndAssistUnitMap.get(assistUnitExchange.getId().toString());
                    if (assistUnitMapFromDB == null) {
                        throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_800571, new Object[]{product.getCode(), assistUnitExchange.getId().toString()});
                    }
                    this.checkAssiatUnitisUsed(billContext, paramMap, product, EntityStatus.Update, UnitExchangeType.fixed);
                    if (assistUnitExchange.getMainUnitCountNew() == null && assistUnitExchange.getMainUnitCount() != null) {
                        assistUnitExchange.setMainUnitCountNew(assistUnitExchange.getMainUnitCount());
                    }
                    unitTypeFromDB = assistUnitMapFromDB.get("unitExchangeType");
                    if (null == unitType || null == unitTypeFromDB || String.valueOf(unitType.getValue()).equals(unitTypeFromDB.toString())) continue;
                    if (UnitExchangeType.floating.equals((Object)unitType) && assistUnitExchange.getAssistUnit() != null) {
                        ProductAssistUnitService.businessUnitUpdate(product.detail(), assistUnitExchange.getAssistUnit());
                        continue;
                    }
                    if (!String.valueOf(UnitExchangeType.floating.getValue()).equals(unitTypeFromDB.toString())) continue;
                    isNeedInitBusiUnitValue = true;
                }
                if ("pc_productimport".equals(billContext.getBillnum())) {
                    List assistUnitIds = product.productAssistUnitExchanges().stream().filter(assistUnit -> assistUnit.get("assistUnit") != null).map(assistUnit -> assistUnit.get("assistUnit").toString()).collect(Collectors.toList());
                    for (String assistUnitId : assistUnitAndMap.keySet()) {
                        if (assistUnitIds.contains(assistUnitId)) continue;
                        ProductAssistUnitExchange productAssistUnitExchange = new ProductAssistUnitExchange();
                        productAssistUnitExchange.putAll(assistUnitAndMap.get(assistUnitId));
                        productAssistUnitExchange.setEntityStatus(EntityStatus.Delete);
                        product.productAssistUnitExchanges().add(productAssistUnitExchange);
                        this.checkAssiatUnitisUsed(billContext, paramMap, product, EntityStatus.Delete, null);
                    }
                }
            } else {
                for (ProductAssistUnitExchange assistUnitExchange : product.productAssistUnitExchanges()) {
                    if (null != assistUnitExchange.getEntityStatus() && !EntityStatus.Insert.equals((Object)assistUnitExchange.getEntityStatus())) {
                        assistUnitExchange.setEntityStatus(EntityStatus.Unchanged);
                        continue;
                    }
                    assistUnitExchange.setEntityStatus(EntityStatus.Insert);
                    if (assistUnitExchange.getMainUnitCountNew() == null && assistUnitExchange.getMainUnitCount() != null) {
                        assistUnitExchange.setMainUnitCountNew(assistUnitExchange.getMainUnitCount());
                    }
                    if (!UnitExchangeType.floating.equals((Object)assistUnitExchange.getUnitExchangeType())) continue;
                    this.checkAssiatUnitisUsed(billContext, paramMap, product, EntityStatus.Insert, UnitExchangeType.floating);
                    if (assistUnitExchange.getAssistUnit() == null) continue;
                    ProductAssistUnitService.businessUnitUpdate(product.detail(), assistUnitExchange.getAssistUnit());
                }
            }
        } else if (!"pc_productdetail_import".equals(billContext.getBillnum())) {
            if (!CollectionUtils.isEmpty(assistUnitListFromDB)) {
                if (product.get("enableAssistUnit") != null && !Boolean.parseBoolean(product.get("enableAssistUnit").toString())) {
                    HashMap<String, Object> params = new HashMap<String, Object>();
                    params.put("id", product.getId());
                    params.put("ytenant_id", AppContext.getYTenantId());
                    this.checkAssiatUnitisUsed(billContext, paramMap, product, EntityStatus.Delete, null);
                    SqlHelper.delete((String)"com.yonyoucloud.upc.productAPI.dao.productdata.deleteProductAssistUnitExchangeByProductId", params);
                    SqlHelper.update((String)"com.yonyoucloud.upc.productAPI.dao.productdata.updateProductSKUByProductId", params);
                } else {
                    product.setEnableAssistUnit(Boolean.valueOf(true));
                }
            } else {
                product.setEnableAssistUnit(Boolean.valueOf(false));
            }
        }
        if (isNeedInitBusiUnitValue && null != product.getUnit()) {
            ProductAssistUnitService.businessUnitUpdate(product.detail(), product.getUnit());
        }
    }

    private static void businessUnitUpdate(ProductExtend detail1, Long assistUnit) {
        detail1.put(AssistUnitType.purchaseUnit.toString(), detail1.containsKey((Object)AssistUnitType.purchaseUnit.toString()) ? detail1.get(AssistUnitType.purchaseUnit.toString()) : assistUnit);
        detail1.put(AssistUnitType.stockUnit.toString(), detail1.containsKey((Object)AssistUnitType.stockUnit.toString()) ? detail1.get(AssistUnitType.stockUnit.toString()) : assistUnit);
        detail1.put(AssistUnitType.batchUnit.toString(), detail1.containsKey((Object)AssistUnitType.batchUnit.toString()) ? detail1.get(AssistUnitType.batchUnit.toString()) : assistUnit);
        detail1.put(AssistUnitType.onlineUnit.toString(), detail1.containsKey((Object)AssistUnitType.onlineUnit.toString()) ? detail1.get(AssistUnitType.onlineUnit.toString()) : assistUnit);
        detail1.put(AssistUnitType.requireUnit.toString(), detail1.containsKey((Object)AssistUnitType.requireUnit.toString()) ? detail1.get(AssistUnitType.requireUnit.toString()) : assistUnit);
        detail1.put(AssistUnitType.produceUnit.toString(), detail1.containsKey((Object)AssistUnitType.produceUnit.toString()) ? detail1.get(AssistUnitType.produceUnit.toString()) : assistUnit);
        detail1.put(AssistUnitType.inspectionUnit.toString(), detail1.containsKey((Object)AssistUnitType.inspectionUnit.toString()) ? detail1.get(AssistUnitType.inspectionUnit.toString()) : assistUnit);
        detail1.put(AssistUnitType.demandPlanningUnit.toString(), detail1.containsKey((Object)AssistUnitType.demandPlanningUnit.toString()) ? detail1.get(AssistUnitType.demandPlanningUnit.toString()) : assistUnit);
    }

    private void checkAssiatUnitisUsed(BillContext billContext, Map<String, Object> paramMap, Product product, EntityStatus entityStatus, UnitExchangeType unitExchangeType) throws Exception {
        if ("2".equals(product.get("unitUseType").toString())) {
            HashMap<String, Object> originalParamMap = new HashMap<String, Object>();
            originalParamMap.putAll(paramMap);
            JsonObject json = new JsonObject();
            json.addProperty("key", "productAssistUnitExchanges");
            ((BillDataDto)originalParamMap.get("param")).setItem(json.toString());
            try {
                log.info(InternationalUtils.getMessageWithDefault((String)"UID:P_COREDOC-BE_179F628604080260", (String)"\u5f00\u59cb\u9488\u5bf9\u8f85\u8ba1\u91cf\u5355\u4f4d\u53d8\u66f4\u8fdb\u884c\u9886\u57df\u6821\u9a8c\uff0c\u65f6\u95f4\u662f") + DateKit.getCurrTime());
                DomainReferenceFieldCheckUtils.checkDomainReference("productAssistUnitExchanges", billContext, originalParamMap, this.longTaskExecutorService);
                log.info(InternationalUtils.getMessageWithDefault((String)"UID:P_COREDOC-BE_179F628604080257", (String)"\u9886\u57df\u6821\u9a8c\u7ed3\u675f\uff0c\u65f6\u95f4\u662f") + DateKit.getCurrTime());
            }
            catch (Exception e) {
                if (EntityStatus.Insert.equals((Object)entityStatus) && UnitExchangeType.floating.equals((Object)unitExchangeType)) {
                    throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_800964, new Object[]{product.getCode()});
                }
                throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_800965, new Object[]{product.getCode()});
            }
        }
    }
}


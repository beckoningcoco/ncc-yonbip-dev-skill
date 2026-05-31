/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.gson.JsonObject
 *  com.yonyou.iuap.apdoc.coredoc.enums.CoreExtrateBusinessErrorEnum
 *  com.yonyou.iuap.apdoc.coredoc.exceptions.CoreDocBusinessException
 *  com.yonyou.iuap.apdoc.coredoc.utils.UpcJacksonUtils
 *  com.yonyou.ucf.mdd.common.model.rule.RuleExecuteResult
 *  com.yonyou.ucf.mdd.common.model.rule.RuleRegister
 *  com.yonyou.ucf.mdd.ext.bill.dto.BillDataDto
 *  com.yonyou.ucf.mdd.ext.bill.rule.base.IRpcRule
 *  com.yonyou.ucf.mdd.ext.core.AppContext
 *  com.yonyou.ucf.mdd.ext.dao.sql.SqlHelper
 *  com.yonyou.ucf.mdd.ext.model.BillContext
 *  com.yonyoucloud.upc.pc.product.Product
 *  com.yonyoucloud.upc.pc.product.ProductAssistUnitExchange
 *  org.imeta.orm.base.EntityStatus
 *  org.slf4j.Logger
 *  org.slf4j.LoggerFactory
 *  org.springframework.stereotype.Service
 *  org.springframework.util.CollectionUtils
 */
package com.yonyoucloud.upc.service;

import com.google.gson.JsonObject;
import com.yonyou.iuap.apdoc.coredoc.enums.CoreExtrateBusinessErrorEnum;
import com.yonyou.iuap.apdoc.coredoc.exceptions.CoreDocBusinessException;
import com.yonyou.iuap.apdoc.coredoc.utils.UpcJacksonUtils;
import com.yonyou.ucf.mdd.common.model.rule.RuleExecuteResult;
import com.yonyou.ucf.mdd.common.model.rule.RuleRegister;
import com.yonyou.ucf.mdd.ext.bill.dto.BillDataDto;
import com.yonyou.ucf.mdd.ext.bill.rule.base.IRpcRule;
import com.yonyou.ucf.mdd.ext.core.AppContext;
import com.yonyou.ucf.mdd.ext.dao.sql.SqlHelper;
import com.yonyou.ucf.mdd.ext.model.BillContext;
import com.yonyoucloud.upc.billrule.product.ProductFieldCheckRule;
import com.yonyoucloud.upc.pc.product.Product;
import com.yonyoucloud.upc.pc.product.ProductAssistUnitExchange;
import com.yonyoucloud.upc.service.utils.ProductUtil;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import org.imeta.orm.base.EntityStatus;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;

@Service(value="ProductReferenceCheckService")
public class ProductReferenceCheckService {
    private static final Logger log = LoggerFactory.getLogger(ProductReferenceCheckService.class);

    public void fieldCheckRule(BillContext billContext, Map<String, Object> paramMap) throws Exception {
        IRpcRule rpcRule = (IRpcRule)AppContext.getBean(IRpcRule.class);
    }

    public void costValuationCheckRule(BillContext billContext, Map<String, Object> paramMap) throws Exception {
        BillDataDto billDataDto = (BillDataDto)paramMap.get("param");
        JsonObject json = new JsonObject();
        json.addProperty("key", "detail!costValuation");
        billDataDto.setItem(json.toString());
        ProductFieldCheckRule checkRule = (ProductFieldCheckRule)((Object)AppContext.getBean((String)"productFieldCheckRule"));
        checkRule.execute(billContext, paramMap);
    }

    public void batchManageCheckRule(BillContext billContext, Map<String, Object> paramMap) throws Exception {
        IRpcRule rpcRule = (IRpcRule)AppContext.getBean(IRpcRule.class);
        if (ProductUtil.checkOpenOption("u8c-config", "app:ST") && null != rpcRule) {
            RuleRegister billRuleRegister = ProductUtil.getBillRuleRegister("pc_product", "delete", "ustockProductQuoteNoOrgCheckRule", "ustock");
            Long time1 = System.currentTimeMillis();
            log.info(String.format("Product@RPC: start. group = %s", "ustock"));
            RuleExecuteResult ruleResult = rpcRule.execute(billRuleRegister, billContext, paramMap);
            log.info("ProductFieldCheckRule check field:[{}] execute rule:[{}], domain:[{}], result:[{}]", new Object[]{"detail!isBatchManage", billRuleRegister.getRuleId(), billRuleRegister.getDomain(), ruleResult});
            Long time2 = System.currentTimeMillis();
            log.info(String.format("Product@RPC: return. group = %s, time=%d", "ustock", time2 - time1));
            if (null != ruleResult && ruleResult.getMsgCode() != 1) {
                throw new CoreDocBusinessException(ruleResult.getMessage());
            }
        }
    }

    public void checkByBatchCheckRule(BillContext billContext, Map<String, Object> paramMap) throws Exception {
        IRpcRule rpcRule = (IRpcRule)AppContext.getBean(IRpcRule.class);
        if (ProductUtil.checkOpenOption("u8c-config", "app:RM") && null != rpcRule) {
            RuleRegister billRuleRegister = ProductUtil.getBillRuleRegister("pc_product", "delete", "retailProductQuoteCheckRule", "retail");
            Long time1 = System.currentTimeMillis();
            log.info(String.format("Product@RPC: start. group = %s", "retail"));
            RuleExecuteResult ruleResult = rpcRule.execute(billRuleRegister, billContext, paramMap);
            log.info("ProductFieldCheckRule check field:[{}] execute rule:[{}], domain:[{}], result:[{}]", new Object[]{"detail!valueManageType", billRuleRegister.getRuleId(), billRuleRegister.getDomain(), ruleResult});
            Long time2 = System.currentTimeMillis();
            log.info(String.format("Product@RPC: return. group = %s, time=%d", "retail", time2 - time1));
            if (null != ruleResult && ruleResult.getMsgCode() != 1) {
                throw new CoreDocBusinessException(null, ruleResult.getMessage());
            }
        }
    }

    public void productCheckRule(BillContext billContext, Map<String, Object> paramMap, String fieldName, String fieldChineseName) {
        try {
            BillContext checkBillContext = (BillContext)billContext.clone();
            checkBillContext.setAction("check");
            JsonObject json = new JsonObject();
            json.addProperty("key", fieldName);
            Object value = ProductReferenceCheckService.dealValue(paramMap, fieldName);
            if (null != value) {
                HashMap<String, Object> changeMap = new HashMap<String, Object>();
                changeMap.put("value", value);
                json.addProperty("value", UpcJacksonUtils.OBJECT_MAPPER.writeValueAsString(changeMap));
            }
            BillDataDto billDataDto = (BillDataDto)paramMap.get("param");
            billDataDto.setItem(json.toString());
            ProductFieldCheckRule checkRule = (ProductFieldCheckRule)((Object)AppContext.getBean((String)"productFieldCheckRule"));
            checkRule.execute(checkBillContext, paramMap);
        }
        catch (Exception e) {
            throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_801086, new Object[]{fieldChineseName, e.getCause() != null ? e.getCause().getMessage() : e.getMessage()});
        }
    }

    private static Object dealValue(Map<String, Object> paramMap, String fieldName) {
        Object value;
        if (fieldName.contains("!")) {
            String[] fields = fieldName.split("!");
            String role = fields[0];
            String colum = fields[1];
            value = null != ((Map)((List)((BillDataDto)paramMap.get("param")).getData()).get(0)).get(role) ? ((Map)((Map)((List)((BillDataDto)paramMap.get("param")).getData()).get(0)).get(role)).get(colum) : null;
        } else {
            value = ((Map)((List)((BillDataDto)paramMap.get("param")).getData()).get(0)).get(fieldName);
        }
        return value;
    }

    public void productCheckAssistUnitSkuUse(Product product) throws Exception {
        if (product.getEntityStatus() == EntityStatus.Update && null != product.get("productAssistUnitExchanges")) {
            HashMap<String, Object> params = new HashMap<String, Object>();
            params.put("ytenant_id", AppContext.getCurrentUser().getYTenantId());
            params.put("productId", product.getId().toString());
            List productAssistUnitExchangesDelete = ((List)product.get("productAssistUnitExchanges")).stream().filter(assistUnitExchange -> assistUnitExchange.getEntityStatus() == EntityStatus.Delete).collect(Collectors.toList());
            if (!CollectionUtils.isEmpty(productAssistUnitExchangesDelete)) {
                List productAssistUnitExchangesIdListDelete = productAssistUnitExchangesDelete.stream().filter(assistUnitExchange -> assistUnitExchange.get("assistUnit") != null && assistUnitExchange.getId() != null).map(assistUnitExchange -> assistUnitExchange.get("id").toString()).collect(Collectors.toList());
                if (!CollectionUtils.isEmpty(productAssistUnitExchangesIdListDelete)) {
                    params.put("assistUnitIdList", productAssistUnitExchangesIdListDelete);
                    List productAssistUnitExchangesInDb = SqlHelper.selectList((String)"com.yonyoucloud.upc.productAPI.dao.productdata.getProductassistunitexchangeByIds", params);
                    if (!CollectionUtils.isEmpty((Collection)productAssistUnitExchangesInDb)) {
                        List assistUnitListDelete = productAssistUnitExchangesInDb.stream().filter(assistUnitExchange -> assistUnitExchange.get("assistUnit") != null).map(assistUnitExchange -> assistUnitExchange.get("assistUnit").toString()).collect(Collectors.toList());
                        params.put("batchUnitList", assistUnitListDelete);
                        List productSkuIds = SqlHelper.selectList((String)"com.yonyoucloud.upc.productAPI.dao.productdata.getProductSkuByBatchUnits", params);
                        if (!CollectionUtils.isEmpty((Collection)productSkuIds)) {
                            throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_801087, new Object[]{product.getCode()});
                        }
                    }
                }
            } else {
                List productAssistUnitExchangesUpdate = ((List)product.get("productAssistUnitExchanges")).stream().filter(assistUnitExchange -> assistUnitExchange.getEntityStatus() == EntityStatus.Update && assistUnitExchange.getId() != null).collect(Collectors.toList());
                if (!CollectionUtils.isEmpty(productAssistUnitExchangesUpdate)) {
                    Map<String, ProductAssistUnitExchange> productAssistUnitExchangesUpdateMap = productAssistUnitExchangesUpdate.stream().collect(Collectors.toMap(assistUnitExchange -> assistUnitExchange.getId().toString(), assistUnitExchange -> assistUnitExchange));
                    ArrayList<String> assistUnitIdList = new ArrayList<String>();
                    assistUnitIdList.addAll(productAssistUnitExchangesUpdateMap.keySet());
                    params.put("assistUnitIdList", assistUnitIdList);
                    List productAssistUnitExchangesInDb = SqlHelper.selectList((String)"com.yonyoucloud.upc.productAPI.dao.productdata.getProductassistunitexchangeByIds", params);
                    if (!CollectionUtils.isEmpty((Collection)productAssistUnitExchangesInDb)) {
                        for (Map productAssistUnitExchangeInDb : productAssistUnitExchangesInDb) {
                            ProductAssistUnitExchange productAssistUnitExchange;
                            if (productAssistUnitExchangesUpdateMap.get(productAssistUnitExchangeInDb.get("id").toString()) == null || (productAssistUnitExchange = productAssistUnitExchangesUpdateMap.get(productAssistUnitExchangeInDb.get("id").toString())).getAssistUnit() == null || productAssistUnitExchangeInDb.get("assistUnit") == null) continue;
                            params.put("batchUnitIdOld", productAssistUnitExchangeInDb.get("assistUnit").toString());
                            params.put("batchUnitIdNew", productAssistUnitExchange.getAssistUnit().toString());
                            params.put("mainUnitRate", productAssistUnitExchange.getMainUnitRate());
                            SqlHelper.update((String)"com.yonyoucloud.upc.productAPI.dao.productdata.updateProductSKUByBatchUnitId", params);
                            params.put("batchPriceUnitIdOld", productAssistUnitExchangeInDb.get("assistUnit").toString());
                            params.put("batchPriceUnitIdNew", productAssistUnitExchange.getAssistUnit().toString());
                            SqlHelper.update((String)"com.yonyoucloud.upc.productAPI.dao.productdata.updateProductSKUByBatchPriceUnitId", params);
                        }
                    }
                }
            }
        }
    }

    public void updateSkuBatchUnitByProductUnit(Product product) throws Exception {
        if (product.getEntityStatus() == EntityStatus.Update) {
            HashMap<String, Object> params = new HashMap<String, Object>();
            params.put("ytenant_id", AppContext.getCurrentUser().getYTenantId());
            params.put("productId", product.getId().toString());
            List productsInDb = SqlHelper.selectList((String)"com.yonyoucloud.upc.productAPI.dao.productdata.getProductByProductId", params);
            if (!CollectionUtils.isEmpty((Collection)productsInDb) && ((Map)productsInDb.get(0)).get("unit") != null && product.getUnit() != null && !((Map)productsInDb.get(0)).get("unit").toString().equals(product.getUnit().toString())) {
                params.put("batchUnitIdOld", ((Map)productsInDb.get(0)).get("unit").toString());
                params.put("batchUnitIdNew", product.getUnit().toString());
                params.put("mainUnitRate", 1);
                SqlHelper.update((String)"com.yonyoucloud.upc.productAPI.dao.productdata.updateProductSKUByBatchUnitId", params);
                params.put("batchPriceUnitIdOld", ((Map)productsInDb.get(0)).get("unit").toString());
                params.put("batchPriceUnitIdNew", product.getUnit().toString());
                SqlHelper.update((String)"com.yonyoucloud.upc.productAPI.dao.productdata.updateProductSKUByBatchPriceUnitId", params);
            }
        }
    }
}


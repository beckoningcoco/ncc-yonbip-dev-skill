/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.slf4j.Logger
 *  org.slf4j.LoggerFactory
 */
package com.yonyoucloud.upc.service.api;

import com.yonyoucloud.upc.service.api.FormulaPubFuntion;
import com.yonyoucloud.upc.service.api.FormulaScopeDTO;
import java.util.HashMap;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ProductFormulaPubService
extends FormulaPubFuntion {
    private static final Logger log = LoggerFactory.getLogger(ProductFormulaPubService.class);
    protected static HashMap<String, Integer> fieldScopeMap = new HashMap();
    protected static HashMap<String, String> fieldMap = new HashMap();
    protected static HashMap<String, String> subAttrMap = new HashMap();
    protected static Integer FIELD_GLOBAL = 1;
    protected static Integer FIELD_ORG = 2;
    protected static Integer FIELD_ASISTANT_UNIT = 3;
    protected static Integer FIELD_DEFFINE = 4;
    protected static Integer FIELD_SKU_ORG = 5;
    protected static String DEFINE_NAME = "define";
    protected static Integer DEFINE_LENGTH = 6;
    protected static Integer SUB_ATTR = 7;
    protected static String PREFFIX_MAIN = "";
    protected static String PREFFIX_ORG = "org!";
    protected static String PREFFIX_CHANGE_RATE = "rate!";
    protected static String PREFFIX_DEFFINE = "define!";
    protected static String PREFFIX_FREE = "free!";
    protected static String PREFFIX_CHARACTER = "character!";
    public static String HOME_PAGE_FIELD = "homepageBusinessId";

    protected FormulaScopeDTO getScope(String field) {
        Integer scope = fieldScopeMap.get(field);
        if (null == scope) {
            if (field.startsWith(PREFFIX_ORG)) {
                field = field.substring(PREFFIX_ORG.length());
                scope = FIELD_ORG;
            } else if (field.startsWith(PREFFIX_CHANGE_RATE)) {
                field = field.substring(PREFFIX_CHANGE_RATE.length());
                scope = FIELD_ASISTANT_UNIT;
            } else if (field.startsWith(PREFFIX_DEFFINE)) {
                field = field.substring(PREFFIX_DEFFINE.length());
                scope = FIELD_DEFFINE;
            } else {
                scope = FIELD_GLOBAL;
            }
        }
        return new FormulaScopeDTO(scope, field);
    }

    static {
        fieldScopeMap.put("unit", FIELD_GLOBAL);
        fieldScopeMap.put("weightUnit", FIELD_GLOBAL);
        fieldScopeMap.put("netWeight", FIELD_GLOBAL);
        fieldScopeMap.put("netWeightUnit", FIELD_GLOBAL);
        fieldScopeMap.put("volume", FIELD_GLOBAL);
        fieldScopeMap.put("volumeUnit", FIELD_GLOBAL);
        fieldScopeMap.put("length", FIELD_GLOBAL);
        fieldScopeMap.put("width", FIELD_GLOBAL);
        fieldScopeMap.put("height", FIELD_GLOBAL);
        fieldScopeMap.put("purchaseUnit", FIELD_ORG);
        fieldScopeMap.put("purchasePriceUnit", FIELD_ORG);
        fieldScopeMap.put("stockUnit", FIELD_ORG);
        fieldScopeMap.put("produceUnit", FIELD_ORG);
        fieldScopeMap.put("batchUnit", FIELD_ORG);
        fieldScopeMap.put("onlineUnit", FIELD_ORG);
        fieldScopeMap.put("offlineUnit", FIELD_ORG);
        fieldScopeMap.put("requireUnit", FIELD_ORG);
        fieldScopeMap.put("inspectionUnit", FIELD_ORG);
        fieldScopeMap.put("batchPriceUnit", FIELD_ORG);
        fieldScopeMap.put("safetyStock", FIELD_ORG);
        fieldScopeMap.put("highestStock", FIELD_ORG);
        fieldScopeMap.put("lowestStock", FIELD_ORG);
        fieldScopeMap.put("isBatchManage", FIELD_ORG);
        fieldScopeMap.put("fNoTaxCostPrice", FIELD_ORG);
        fieldScopeMap.put("purchaseRate", FIELD_ASISTANT_UNIT);
        fieldScopeMap.put("batchRate", FIELD_ASISTANT_UNIT);
        fieldScopeMap.put("stockRate", FIELD_ASISTANT_UNIT);
        fieldScopeMap.put("purchasePriceRate", FIELD_ASISTANT_UNIT);
        fieldScopeMap.put("produceRate", FIELD_ASISTANT_UNIT);
        fieldScopeMap.put("onlineRate", FIELD_ASISTANT_UNIT);
        fieldScopeMap.put("offlineRate", FIELD_ASISTANT_UNIT);
        fieldScopeMap.put("requireRate", FIELD_ASISTANT_UNIT);
        fieldScopeMap.put("inspectionRate", FIELD_ASISTANT_UNIT);
        fieldScopeMap.put("batchPriceRate", FIELD_ASISTANT_UNIT);
        fieldScopeMap.put("inventoryCount", FIELD_SKU_ORG);
        fieldMap.put("purchaseRate", "purchaseUnit");
        fieldMap.put("batchRate", "batchUnit");
        fieldMap.put("stockRate", "stockUnit");
        fieldMap.put("purchasePriceRate", "purchasePriceUnit");
        fieldMap.put("produceRate", "produceUnit");
        fieldMap.put("onlineRate", "onlineUnit");
        fieldMap.put("offlineRate", "offlineUnit");
        fieldMap.put("requireRate", "requireUnit");
        fieldMap.put("inspectionRate", "inspectionUnit");
        fieldMap.put("batchPriceRate", "batchPriceUnit");
        fieldScopeMap.put("productAssistClass", SUB_ATTR);
        fieldScopeMap.put("productAssistClass!code", SUB_ATTR);
        fieldScopeMap.put("productAssistClass!name", SUB_ATTR);
        subAttrMap.put("productAssistClass", "pc.product.ProductAssistClass");
        subAttrMap.put("productAssistClass!id", "pc.product.ProductAssistClass");
        subAttrMap.put("productAssistClass!code", "pc.product.ProductAssistClass");
        subAttrMap.put("productAssistClass!name", "pc.product.ProductAssistClass");
    }
}


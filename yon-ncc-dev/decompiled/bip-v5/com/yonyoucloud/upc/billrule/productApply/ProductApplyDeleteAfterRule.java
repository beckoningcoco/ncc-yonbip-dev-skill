/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.alibaba.fastjson.JSONObject
 *  com.yonyou.uap.billcode.BillCodeComponentParam
 *  com.yonyou.uap.billcode.BillCodeObj
 *  com.yonyou.uap.billcode.service.IBillCodeComponentService
 *  com.yonyou.ucf.mdd.common.model.rule.RuleExecuteResult
 *  com.yonyou.ucf.mdd.ext.bill.rule.base.AbstractCommonRule
 *  com.yonyou.ucf.mdd.ext.core.AppContext
 *  com.yonyou.ucf.mdd.ext.dao.sql.SqlHelper
 *  com.yonyou.ucf.mdd.ext.model.BillContext
 *  com.yonyoucloud.upc.pc.productapply.ProductApply
 *  com.yonyoucloud.upc.pc.productapply.ProductApplyType
 *  org.imeta.orm.base.BizObject
 *  org.springframework.beans.factory.annotation.Autowired
 *  org.springframework.stereotype.Component
 */
package com.yonyoucloud.upc.billrule.productApply;

import com.alibaba.fastjson.JSONObject;
import com.yonyou.uap.billcode.BillCodeComponentParam;
import com.yonyou.uap.billcode.BillCodeObj;
import com.yonyou.uap.billcode.service.IBillCodeComponentService;
import com.yonyou.ucf.mdd.common.model.rule.RuleExecuteResult;
import com.yonyou.ucf.mdd.ext.bill.rule.base.AbstractCommonRule;
import com.yonyou.ucf.mdd.ext.core.AppContext;
import com.yonyou.ucf.mdd.ext.dao.sql.SqlHelper;
import com.yonyou.ucf.mdd.ext.model.BillContext;
import com.yonyoucloud.upc.pc.productapply.ProductApply;
import com.yonyoucloud.upc.pc.productapply.ProductApplyType;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.imeta.orm.base.BizObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component(value="productApplyDeleteAfterRule")
public class ProductApplyDeleteAfterRule
extends AbstractCommonRule {
    @Autowired
    private IBillCodeComponentService billCodeComponentService;

    public RuleExecuteResult execute(BillContext billContext, Map<String, Object> paramMap) throws Exception {
        List bills = this.getBills(billContext, paramMap);
        Map<String, Map<String, Object>> productCodeMap = this.extractProductCodes(bills);
        if (productCodeMap.isEmpty()) {
            return new RuleExecuteResult();
        }
        this.removeExistingProducts(productCodeMap);
        if (productCodeMap.isEmpty()) {
            return new RuleExecuteResult();
        }
        this.returnBillCodesByOrg(productCodeMap);
        return new RuleExecuteResult();
    }

    private Map<String, Map<String, Object>> extractProductCodes(List<BizObject> bills) {
        HashMap<String, Map<String, Object>> productCodeMap = new HashMap<String, Map<String, Object>>();
        for (BizObject bio : bills) {
            ProductApply productApply = (ProductApply)bio;
            if (ProductApplyType.ADD_RANGE.equals((Object)productApply.getApplyType())) continue;
            Map productData = (Map)JSONObject.parseObject((String)productApply.getProductData(), Map.class);
            String productCode = String.valueOf(productData.get("code"));
            productCodeMap.put(productCode, productData);
        }
        return productCodeMap;
    }

    private void removeExistingProducts(Map<String, Map<String, Object>> productCodeMap) {
        HashMap<String, Object> queryParams = new HashMap<String, Object>(3);
        queryParams.put("tenantId", AppContext.getTenantId());
        queryParams.put("yTenantId", AppContext.getCurrentUser().getYTenantId());
        queryParams.put("productCodes", productCodeMap.keySet());
        List existingProducts = SqlHelper.selectList((String)"com.yonyoucloud.upc.mapper.productapply.listProductByCode", queryParams);
        if (existingProducts != null && !existingProducts.isEmpty()) {
            existingProducts.forEach(product -> productCodeMap.remove(product.get("code")));
        }
    }

    private void returnBillCodesByOrg(Map<String, Map<String, Object>> productCodeMap) throws Exception {
        Map<String, List<Map<String, Object>>> productsByOrg = this.groupProductsByOrg(productCodeMap);
        Long tenantId = (Long)AppContext.getTenantId();
        for (Map.Entry<String, List<Map<String, Object>>> entry : productsByOrg.entrySet()) {
            String orgId = entry.getKey();
            List<Map<String, Object>> products = entry.getValue();
            this.returnBillCodesForOrg(tenantId, orgId, products);
        }
    }

    private Map<String, List<Map<String, Object>>> groupProductsByOrg(Map<String, Map<String, Object>> productCodeMap) {
        HashMap<String, List<Map<String, Object>>> groupedByOrg = new HashMap<String, List<Map<String, Object>>>();
        for (Map<String, Object> productData : productCodeMap.values()) {
            String orgId = String.valueOf(productData.get("orgId"));
            groupedByOrg.computeIfAbsent(orgId, k -> new ArrayList()).add(productData);
        }
        return groupedByOrg;
    }

    private void returnBillCodesForOrg(Long tenantId, String orgId, List<Map<String, Object>> products) throws Exception {
        String[] productCodes = (String[])products.stream().map(product -> String.valueOf(product.get("code"))).toArray(String[]::new);
        BillCodeObj[] billCodeObjs = (BillCodeObj[])products.stream().map(BillCodeObj::new).toArray(BillCodeObj[]::new);
        BillCodeComponentParam param = new BillCodeComponentParam("pc_product", "pc_product", String.valueOf(tenantId), orgId, productCodes);
        param.setBills(billCodeObjs);
        this.billCodeComponentService.returnBatchBillCodes(param);
    }
}


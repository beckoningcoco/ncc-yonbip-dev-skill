/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.yonyou.ucf.mdd.common.model.Pager
 *  com.yonyou.ucf.mdd.ext.bill.dto.BillDataDto
 *  com.yonyou.ucf.mdd.ext.bill.rule.common.ResultList
 *  org.imeta.orm.schema.ConditionExpression
 */
package com.yonyoucloud.iuap.upc.api.service;

import com.yonyou.ucf.mdd.common.model.Pager;
import com.yonyou.ucf.mdd.ext.bill.dto.BillDataDto;
import com.yonyou.ucf.mdd.ext.bill.rule.common.ResultList;
import com.yonyoucloud.iuap.upc.api.service.ApiDto;
import java.math.BigDecimal;
import java.util.List;
import java.util.Map;
import org.imeta.orm.schema.ConditionExpression;

public interface IProductApiService {
    public List<Map> queryApplayRanges(ApiDto var1) throws Exception;

    public List<Map> getApplayRanges(ApiDto var1) throws Exception;

    public List<Map> getProductExtends(List<Long> var1) throws Exception;

    public Map getApplayRange(Long var1, ApiDto var2) throws Exception;

    public List<Map> getProducts(ApiDto var1) throws Exception;

    public Map getProduct(Long var1, ApiDto var2) throws Exception;

    public List<Map> getProductSpecs(Long var1) throws Exception;

    public Map<Long, List<Map>> getSkuDetails(Long var1) throws Exception;

    public Map getTemplate(Long var1) throws Exception;

    public Map getTemplateData(Long var1) throws Exception;

    public Map getTemplateByProductId(Long var1) throws Exception;

    public Map<String, Object> dealOrgIdAndCustId(ApiDto var1) throws Exception;

    public List<Map<String, Object>> getAllProductLines() throws Exception;

    public List<Map<String, Object>> getProductLinesByCondition(ApiDto var1) throws Exception;

    public List<Map<String, Object>> getAllBrands() throws Exception;

    public List<Map<String, Object>> getBrandsByCondition(ApiDto var1) throws Exception;

    public Pager queryProductsWithSKU(BillDataDto var1, ConditionExpression var2) throws Exception;

    public List<Map> queryProductSkus(BillDataDto var1) throws Exception;

    public List<Map> queryBizProductSkus(BillDataDto var1) throws Exception;

    public Map<String, String> syncUOrderProductAuthorization(BillDataDto var1) throws Exception;

    public ResultList syncProductRangeByOrg(Map var1) throws Exception;

    public Map<String, String> delProductApplyRange(BillDataDto var1) throws Exception;

    public List<Map<String, Object>> getProductClassByIds(ApiDto var1) throws Exception;

    public List<Map<String, Object>> getOrgsByOrgId(ApiDto var1) throws Exception;

    public List<Map<String, Object>> getProductClassByShop(Long var1, ApiDto var2) throws Exception;

    public boolean checkProductByShopId(ApiDto var1) throws Exception;

    public Map<String, String> updateSKUSaled(ApiDto var1) throws Exception;

    public Map<String, String> updateProductAllArea(ApiDto var1) throws Exception;

    public Map<String, Object> getProductData(Long var1, Long var2) throws Exception;

    public Map<String, Object> getProductSpecSet(Long var1) throws Exception;

    public Map<String, Object> getProductSpecSetByPage(Long var1, Integer var2, Integer var3) throws Exception;

    public List<Map<String, Object>> getProductSpecSets(List<Long> var1) throws Exception;

    public Map<String, BigDecimal> getUnitRate(Long var1, Long var2, BigDecimal var3, BigDecimal var4) throws Exception;
}


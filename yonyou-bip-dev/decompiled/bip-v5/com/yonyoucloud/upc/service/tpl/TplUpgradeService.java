/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.yonyou.diwork.ott.exexutors.RobotExecutors
 *  com.yonyou.iuap.yms.api.IYmsJdbcApi
 *  com.yonyou.iuap.yms.api.YmsJdbcApiProvider
 *  com.yonyou.iuap.yms.factory.YmsJdbcApiProviderFactory
 *  com.yonyou.iuap.yms.param.ResultSetProcessor
 *  com.yonyou.iuap.yms.processor.MapListProcessor
 *  com.yonyou.ucf.mdd.ext.bill.dto.BillDataDto
 *  com.yonyou.ucf.mdd.ext.core.AppContext
 *  com.yonyou.ucf.mdd.ext.dao.sql.SqlHelper
 *  com.yonyoucloud.upc.pc.tpl.ProductTpl
 *  iuap.yms.thread.api.YmsExecutors
 *  org.apache.commons.lang3.StringUtils
 *  org.slf4j.Logger
 *  org.slf4j.LoggerFactory
 *  org.springframework.beans.factory.annotation.Autowired
 *  org.springframework.beans.factory.annotation.Qualifier
 *  org.springframework.stereotype.Service
 *  org.springframework.util.CollectionUtils
 */
package com.yonyoucloud.upc.service.tpl;

import com.yonyou.diwork.ott.exexutors.RobotExecutors;
import com.yonyou.iuap.yms.api.IYmsJdbcApi;
import com.yonyou.iuap.yms.api.YmsJdbcApiProvider;
import com.yonyou.iuap.yms.factory.YmsJdbcApiProviderFactory;
import com.yonyou.iuap.yms.param.ResultSetProcessor;
import com.yonyou.iuap.yms.processor.MapListProcessor;
import com.yonyou.ucf.mdd.ext.bill.dto.BillDataDto;
import com.yonyou.ucf.mdd.ext.core.AppContext;
import com.yonyou.ucf.mdd.ext.dao.sql.SqlHelper;
import com.yonyoucloud.iuap.upc.api.service.IUPCBillService;
import com.yonyoucloud.upc.billrule.tpl.ProductTplDataInitRule;
import com.yonyoucloud.upc.pc.tpl.ProductTpl;
import com.yonyoucloud.upc.service.repairsku.RepairSkuService;
import iuap.yms.thread.api.YmsExecutors;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ExecutorService;
import java.util.function.Supplier;
import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;

@Service
public class TplUpgradeService {
    private static final Logger log = LoggerFactory.getLogger(TplUpgradeService.class);
    @Autowired
    @Qualifier(value="pc.BillService")
    private IUPCBillService billService;
    @Autowired
    ProductTplDataInitRule productTplDataInitRule;

    public void dealDefaultSkuTpl() {
        YmsJdbcApiProvider ymsJdbcApiProvider = YmsJdbcApiProviderFactory.getYmsJdbcApiProvider();
        Supplier federalYmsJdbcApi = ymsJdbcApiProvider.getFederalYmsJdbcApi("iuap-apdoc-material_main_dataSource");
        List iYmsJdbcApis = (List)federalYmsJdbcApi.get();
        for (IYmsJdbcApi ymsJdbcApi : iYmsJdbcApis) {
            String sql = "select DISTINCT a.ytenant_id as ytenantId from product a inner join product_tpl_spec b on a.oSPTemplate_id = b.tpl_id and a.ytenant_id = b.ytenant_id where a.oSPTemplate_id is not null and a.defaultSKUId is not null;";
            List<Map<String, Object>> tenants = this.excuteSql(ymsJdbcApi, sql);
            this.dealByYtenants(tenants);
        }
    }

    public void dealByYtenants(List<Map<String, Object>> tenants) {
        if (!CollectionUtils.isEmpty(tenants)) {
            for (Map<String, Object> tenantMap : tenants) {
                RobotExecutors.runAs((String)tenantMap.get("ytenantId").toString(), () -> {
                    try {
                        this.dealDefaultSkuTplTenant();
                    }
                    catch (Exception e) {
                        log.error(RepairSkuService.class + " repairSkuByTenant \u5904\u7406\u79df\u6237\u7ea7\u6570\u636e\u5f02\u5e38\uff1a" + AppContext.getYhtTenantId() + " " + e.getMessage(), (Throwable)e);
                    }
                }, (ExecutorService)YmsExecutors.getYmsExecutor());
            }
        }
    }

    public void dealDefaultSkuTplTenant() throws Exception {
        List<Map<String, Object>> tplProducts = this.getProductAndTplByTenant();
        if (!CollectionUtils.isEmpty(tplProducts)) {
            Set productIds;
            Long tplId;
            HashMap tplProductsMap = new HashMap();
            for (Map<String, Object> tplProduct : tplProducts) {
                tplId = Long.parseLong(tplProduct.get("tplId").toString());
                if (!tplProductsMap.containsKey(tplId)) {
                    tplProductsMap.put(tplId, new HashSet());
                }
                productIds = (Set)tplProductsMap.get(tplId);
                productIds.add(Long.parseLong(tplProduct.get("productId").toString()));
            }
            if (!tplProductsMap.isEmpty()) {
                for (Map.Entry next : tplProductsMap.entrySet()) {
                    tplId = (Long)next.getKey();
                    productIds = (Set)next.getValue();
                    try {
                        this.dealTplProducts(tplId, productIds);
                    }
                    catch (Exception e) {
                        log.error("com.yonyoucloud.upc.service.tpl.TplUpgradeService.dealTplProducts\uff1a" + e.getMessage(), (Throwable)e);
                    }
                }
            }
        }
    }

    private void dealTplProducts(Long tplId, Set<Long> productIds) throws Exception {
        ProductTpl tplNew = this.productTplDataInitRule.copyTemplate(tplId.toString());
        tplNew.remove("Specs");
        tplNew.remove("SpecSums");
        tplNew.remove("freeCharacters");
        tplNew.setErpCode(null);
        tplNew.setFreeCT(null);
        BillDataDto bill = new BillDataDto();
        bill.setBillnum("pc_producttpl");
        bill.setData((Object)tplNew);
        this.billService.save(bill);
        this.updateProductTplData((Long)tplNew.getId(), productIds);
    }

    private void updateProductTplData(Long tplId, Set<Long> productIds) {
        if (null != tplId && !CollectionUtils.isEmpty(productIds)) {
            String productIdsStr = StringUtils.join(productIds, (String)",");
            String sql = "update product set oSPTemplate_id = " + tplId + " where id in (" + productIdsStr + ");";
            this.excuteSql(sql);
        }
    }

    private List<Map<String, Object>> getProductAndTplByTenant() {
        String sql = "select DISTINCT a.oSPTemplate_id tplId, a.id as productId from product a inner join product_tpl_character b on a.oSPTemplate_id = b.tpl_id and a.ytenant_id = b.ytenant_id inner join productsku c on a.id = c.productid and a.ytenant_id = c.ytenant_id where a.ytenant_id = '" + AppContext.getYhtTenantId() + "' and c.issku = 0 and b.bSkuSens = 1;";
        return this.excuteSql(sql);
    }

    private List<Map<String, Object>> excuteSql(String sql) {
        HashMap<String, String> queryTenantSQLList = new HashMap<String, String>(2);
        queryTenantSQLList.put("sql", sql);
        List tenantMapList = SqlHelper.selectList((String)"com.yonyou.ucf.mdd.ext.meta.dao.selectList", queryTenantSQLList);
        return tenantMapList;
    }

    private List<Map<String, Object>> excuteSql(IYmsJdbcApi ymsJdbcApi, String sql) {
        List tenantMapList = ymsJdbcApi.queryForList(sql, (ResultSetProcessor)new MapListProcessor());
        return tenantMapList;
    }
}


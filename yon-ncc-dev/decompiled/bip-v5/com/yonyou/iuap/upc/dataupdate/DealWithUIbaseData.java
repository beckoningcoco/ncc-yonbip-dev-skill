/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.yonyou.ucf.mdd.ext.base.tenant.Tenant
 *  com.yonyou.ucf.mdd.ext.dao.sql.SqlHelper
 *  org.slf4j.Logger
 *  org.slf4j.LoggerFactory
 *  org.springframework.stereotype.Service
 */
package com.yonyou.iuap.upc.dataupdate;

import com.yonyou.iuap.upc.dataupdate.DataUpdateBaseServcie;
import com.yonyou.ucf.mdd.ext.base.tenant.Tenant;
import com.yonyou.ucf.mdd.ext.dao.sql.SqlHelper;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

@Service
public class DealWithUIbaseData
extends DataUpdateBaseServcie {
    private static final Logger log = LoggerFactory.getLogger(DealWithUIbaseData.class);
    private static final List<String> CBILLNO = new ArrayList<String>(64);

    @Override
    public String getTaskName() {
        return "UI\u6a21\u677f\u4e2d\u9519\u8bef\u7684\u5f15\u7528\u5173\u7cfb\u6570\u636e\u6e05\u7406";
    }

    @Override
    public int businessDataUpdate(Tenant tenant, int capacity) throws Exception {
        return this.upgradeUIbaseErrData(tenant, capacity);
    }

    private int upgradeUIbaseErrData(Tenant tenant, int capacity) throws Exception {
        int tenantCount = 0;
        HashMap<String, Object> tenantIdParamMap = new HashMap<String, Object>(4);
        tenantIdParamMap.put("ytenant", tenant.getYTenantId());
        tenantIdParamMap.put("cBILLNOList", CBILLNO);
        tenantCount = SqlHelper.update((String)"com.yonyoucloud.upc.data.dealWithData.deleteUIbaseErrByYtenantId", tenantIdParamMap);
        log.error(String.format("\u79df\u6237\u3010%s\u3011\u6cbb\u7406UI\u6a21\u677f\u9519\u8bef\u5f15\u7528\u6570\u636e\uff0c\u5171\u8ba1\u4fee\u590d\u3010%d\u3011\u6761\uff0c", tenant.getId().toString(), tenantCount) + LocalDateTime.now());
        return tenantCount;
    }

    static {
        CBILLNO.add("pc_unit");
        CBILLNO.add("pc_unitlist");
        CBILLNO.add("pc_unitgroup");
        CBILLNO.add("pc_tag");
        CBILLNO.add("pc_taglist");
        CBILLNO.add("pc_tagclass");
        CBILLNO.add("pc_tagclasslist");
        CBILLNO.add("pc_managementclass");
        CBILLNO.add("pc_managementclasslist");
        CBILLNO.add("pc_presentationclass");
        CBILLNO.add("pc_presentationclasslist");
        CBILLNO.add("pc_brand");
        CBILLNO.add("pc_brandlist");
        CBILLNO.add("pc_brandclass");
        CBILLNO.add("pc_brandclasslist");
        CBILLNO.add("pc_productbrandprolist");
        CBILLNO.add("pc_productorderpro");
        CBILLNO.add("pc_productorderprolist");
        CBILLNO.add("pc_productline");
        CBILLNO.add("pc_productlinelist");
        CBILLNO.add("pc_producttpl");
        CBILLNO.add("pc_producttpllist");
        CBILLNO.add("aa_custcategory");
        CBILLNO.add("aa_custcategorylist");
        CBILLNO.add("aa_cuslevel");
        CBILLNO.add("aa_cuslevellist");
        CBILLNO.add("aa_customertrade");
        CBILLNO.add("aa_customertradelist");
        CBILLNO.add("aa_merchant");
        CBILLNO.add("aa_merchantlist");
        CBILLNO.add("pc_goodsproductskuprolist");
        CBILLNO.add("pc_product");
        CBILLNO.add("pc_productlist");
        CBILLNO.add("pc_productlist_query");
        CBILLNO.add("pc_purchaseclass");
        CBILLNO.add("pc_purchaseclasslist");
        CBILLNO.add("pc_planclass");
        CBILLNO.add("pc_planclasslist");
        CBILLNO.add("pc_costclass");
        CBILLNO.add("pc_costclasslist");
        CBILLNO.add("pc_productapply");
        CBILLNO.add("pc_productapplylist");
        CBILLNO.add("pc_productdetail");
        CBILLNO.add("pc_productsku_edit");
        CBILLNO.add("pc_productsku_add");
        CBILLNO.add("base_businesspartnerlist");
        CBILLNO.add("base_businesspartner");
    }
}


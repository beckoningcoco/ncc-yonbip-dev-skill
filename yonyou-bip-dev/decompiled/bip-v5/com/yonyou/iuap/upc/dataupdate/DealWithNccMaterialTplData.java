/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.alibaba.fastjson.JSON
 *  com.alibaba.fastjson.JSONObject
 *  com.yonyou.iuap.apdoc.coredoc.dao.materialncc.MaterialNccQryDao
 *  com.yonyou.iuap.apdoc.coredoc.po.pubfw.ProductTplNccPO
 *  com.yonyou.ucf.mdd.ext.base.tenant.Tenant
 *  org.apache.commons.collections4.MapUtils
 *  org.slf4j.Logger
 *  org.slf4j.LoggerFactory
 *  org.springframework.beans.factory.annotation.Autowired
 *  org.springframework.stereotype.Service
 *  org.springframework.transaction.annotation.Transactional
 *  org.springframework.util.CollectionUtils
 *  org.springframework.util.StringUtils
 */
package com.yonyou.iuap.upc.dataupdate;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.yonyou.iuap.apdoc.coredoc.dao.materialncc.MaterialNccQryDao;
import com.yonyou.iuap.apdoc.coredoc.po.pubfw.ProductTplNccPO;
import com.yonyou.iuap.upc.dataupdate.DataUpdateBaseServcie;
import com.yonyou.ucf.mdd.ext.base.tenant.Tenant;
import com.yonyoucloud.upc.service.NcSynProductService;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.apache.commons.collections4.MapUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.util.CollectionUtils;
import org.springframework.util.StringUtils;

@Service
public class DealWithNccMaterialTplData
extends DataUpdateBaseServcie {
    private static final Logger log = LoggerFactory.getLogger(DealWithNccMaterialTplData.class);
    @Autowired
    MaterialNccQryDao materialNccQryDao;
    @Autowired
    NcSynProductService ncSynProductService;

    @Override
    public List<Tenant> listSelfDefineTenants() {
        return this.getTenantByNccTpl();
    }

    private List<Tenant> getTenantByNccTpl() {
        ArrayList<Tenant> tenants = null;
        List tenantMaterialTplNccs = this.materialNccQryDao.getTenantByMaterialTplNcc();
        if (!CollectionUtils.isEmpty((Collection)tenantMaterialTplNccs)) {
            tenants = new ArrayList<Tenant>();
            for (ProductTplNccPO tenantMaterialTplNcc : tenantMaterialTplNccs) {
                Tenant tenant = new Tenant();
                tenant.setYTenantId(tenantMaterialTplNcc.getYtenant());
                tenants.add(tenant);
            }
        }
        return tenants;
    }

    @Override
    @Transactional(rollbackFor={Throwable.class})
    public int businessDataUpdate(Tenant tenant, int capacity) throws Exception {
        List materialTplNccByTenant = this.materialNccQryDao.getMaterialTplNccByTenant();
        if (!CollectionUtils.isEmpty((Collection)materialTplNccByTenant)) {
            for (ProductTplNccPO materialTplNccPO : materialTplNccByTenant) {
                String affecsJson = materialTplNccPO.getAffecsJson();
                Map<String, String> affecsMap = new HashMap();
                if (!StringUtils.hasText((String)affecsJson)) {
                    String freeCharacterIds = materialTplNccPO.getFreeCharacterIds();
                    if (StringUtils.hasText((String)freeCharacterIds)) {
                        affecsMap.put("freeCTCharacterIds_sku", freeCharacterIds);
                        affecsMap.put("freeCTCharacterIds_stock", freeCharacterIds);
                        materialTplNccPO.setAffecsJson(JSON.toJSONString(affecsMap));
                    }
                } else {
                    affecsMap = (Map)JSONObject.parseObject((String)affecsJson, Map.class);
                }
                if (MapUtils.isNotEmpty(affecsMap)) {
                    String characteridsAndSenMd5;
                    String freeCharacterIdsMd5 = materialTplNccPO.getFreeCharacterIdsMd5();
                    if (StringUtils.pathEquals((String)freeCharacterIdsMd5, (String)(characteridsAndSenMd5 = this.ncSynProductService.getCharacteridsAndSenMd5(affecsMap)))) continue;
                    materialTplNccPO.setFreeCharacterIdsMd5(characteridsAndSenMd5);
                    this.materialNccQryDao.updateMaterialTplNccById(materialTplNccPO);
                    this.materialNccQryDao.updateMaterialMd5ByOldMd5(freeCharacterIdsMd5, characteridsAndSenMd5);
                    continue;
                }
                log.error("\u5347\u7ea7ncc\u7269\u6599\u6a21\u677f\u5b58\u5728\u5f02\u5e38\u6570\u636e\uff0c\u9700\u8981\u624b\u52a8\u5904\u7406");
            }
        }
        return 0;
    }

    @Override
    public String getTaskName() {
        return "\u5347\u7ea7\u5347\u8fc1\u6570\u636e\u7269\u6599\u6a21\u677f\u4e2d\u95f4\u8868\u6570\u636e";
    }
}


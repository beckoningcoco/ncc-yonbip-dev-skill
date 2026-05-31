/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.alibaba.fastjson.JSON
 *  com.alibaba.fastjson.JSONObject
 *  com.yonyou.ucf.mdd.common.interfaces.ref.IExtRefDataHandler
 *  com.yonyou.ucf.mdd.common.model.Pager
 *  com.yonyou.ucf.mdd.common.model.ref.RefEntity
 *  com.yonyou.ucf.mdd.ext.model.BillContext
 *  com.yonyou.ucf.mdd.ext.ref.adapter.MetaExtRefDataHandler
 *  org.springframework.stereotype.Component
 *  org.springframework.util.CollectionUtils
 *  org.springframework.util.StringUtils
 */
package com.yonyoucloud.upc.eventbean.salearea;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.yonyou.ucf.mdd.common.interfaces.ref.IExtRefDataHandler;
import com.yonyou.ucf.mdd.common.model.Pager;
import com.yonyou.ucf.mdd.common.model.ref.RefEntity;
import com.yonyou.ucf.mdd.ext.model.BillContext;
import com.yonyou.ucf.mdd.ext.ref.adapter.MetaExtRefDataHandler;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.springframework.stereotype.Component;
import org.springframework.util.CollectionUtils;
import org.springframework.util.StringUtils;

@Component(value="saleAreaRefExtRefDataHandler")
public class SaleAreaRefExtRefDataHandler
extends MetaExtRefDataHandler
implements IExtRefDataHandler {
    public List<?> getTreeData(BillContext billContext, RefEntity refEntity, Map<String, Object> map) throws Exception {
        this.setSaleAreaRefExt(billContext, refEntity, map);
        return super.getTreeData(billContext, refEntity, map);
    }

    public Pager getTreeDataByPage(BillContext billContext, RefEntity entity, Map<String, Object> refpara) throws Exception {
        this.setSaleAreaRefExt(billContext, entity, refpara);
        return super.getTreeDataByPage(billContext, entity, refpara);
    }

    public Pager getGridData(BillContext billContext, RefEntity refEntity, Map<String, Object> map) throws Exception {
        return super.getGridData(billContext, refEntity, map);
    }

    private void setSaleAreaRefExt(BillContext billContext, RefEntity entity, Map<String, Object> refpara) {
        if ("aa_salearearef".equals(entity.getCode())) {
            HashMap<String, Boolean> context = new HashMap<String, Boolean>();
            context.put("modifySchema", true);
            JSONObject extMap = null;
            String extendCondition = (String)refpara.get("extendCondition");
            if (!StringUtils.isEmpty((Object)extendCondition)) {
                extMap = JSON.parseObject((String)extendCondition);
            }
            if (!CollectionUtils.isEmpty(extMap) && extMap.containsKey("isShopSaleAreaRef")) {
                context.put("isShopSaleAreaRef", (Boolean)extMap.get("isShopSaleAreaRef"));
            }
            billContext.setContext(context);
        } else if ("aa_saleareaqueryref".equals(entity.getCode())) {
            HashMap<String, Boolean> context = new HashMap<String, Boolean>();
            context.put("modifySchema", true);
            Map externalData = new HashMap();
            if (refpara.get("externalData") != null && refpara.get("externalData") instanceof Map && (externalData = (Map)refpara.get("externalData")).get("shopType") != null) {
                if ("0".equals(externalData.get("shopType").toString())) {
                    context.put("shopType", (Boolean)externalData.get("shopType"));
                } else if ("1".equals(externalData.get("shopType").toString())) {
                    context.put("shopType", (Boolean)externalData.get("shopType"));
                } else if ("2".equals(externalData.get("shopType").toString())) {
                    context.put("shopType", (Boolean)externalData.get("shopType"));
                }
            }
            billContext.setContext(context);
        }
    }
}


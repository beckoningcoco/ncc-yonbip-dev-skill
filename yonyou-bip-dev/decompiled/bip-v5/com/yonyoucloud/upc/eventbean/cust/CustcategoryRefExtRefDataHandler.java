/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.yonyou.ucf.mdd.common.interfaces.ref.IExtRefDataHandler
 *  com.yonyou.ucf.mdd.common.model.Pager
 *  com.yonyou.ucf.mdd.common.model.ref.RefEntity
 *  com.yonyou.ucf.mdd.ext.model.BillContext
 *  com.yonyou.ucf.mdd.ext.ref.adapter.MetaExtRefDataHandler
 *  org.springframework.stereotype.Component
 */
package com.yonyoucloud.upc.eventbean.cust;

import com.yonyou.ucf.mdd.common.interfaces.ref.IExtRefDataHandler;
import com.yonyou.ucf.mdd.common.model.Pager;
import com.yonyou.ucf.mdd.common.model.ref.RefEntity;
import com.yonyou.ucf.mdd.ext.model.BillContext;
import com.yonyou.ucf.mdd.ext.ref.adapter.MetaExtRefDataHandler;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.springframework.stereotype.Component;

@Component(value="custcategoryRefExtRefDataHandler")
public class CustcategoryRefExtRefDataHandler
extends MetaExtRefDataHandler
implements IExtRefDataHandler {
    public List<?> getTreeData(BillContext billContext, RefEntity refEntity, Map<String, Object> map) throws Exception {
        if ("aa_custcategoryref".equals(refEntity.getCode())) {
            Map<String, Object> context = this.buildContext(map);
            billContext.setContext(context);
        }
        return super.getTreeData(billContext, refEntity, map);
    }

    public Pager getTreeDataByPage(BillContext billContext, RefEntity refEntity, Map<String, Object> map) throws Exception {
        if ("aa_custcategoryref".equals(refEntity.getCode())) {
            Map<String, Object> context = this.buildContext(map);
            billContext.setContext(context);
        }
        return super.getTreeDataByPage(billContext, refEntity, map);
    }

    public Pager getGridData(BillContext billContext, RefEntity refEntity, Map<String, Object> map) throws Exception {
        return super.getGridData(billContext, refEntity, map);
    }

    private Map<String, Object> buildContext(Map<String, Object> refpara) {
        Map externalData;
        HashMap<String, Object> context = new HashMap<String, Object>();
        context.put("modifySchema", true);
        if (refpara.get("externalData") != null && refpara.get("externalData") instanceof Map && (externalData = (Map)refpara.get("externalData")).get("shopType") != null) {
            if ("0".equals(externalData.get("shopType").toString())) {
                context.put("shopType", externalData.get("shopType"));
            } else if ("1".equals(externalData.get("shopType").toString())) {
                context.put("shopType", externalData.get("shopType"));
            } else if ("2".equals(externalData.get("shopType").toString())) {
                context.put("shopType", externalData.get("shopType"));
            }
        }
        return context;
    }
}


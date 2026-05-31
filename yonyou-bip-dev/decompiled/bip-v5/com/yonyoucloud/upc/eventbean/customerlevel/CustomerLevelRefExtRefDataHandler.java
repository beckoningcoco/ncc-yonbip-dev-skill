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
package com.yonyoucloud.upc.eventbean.customerlevel;

import com.yonyou.ucf.mdd.common.interfaces.ref.IExtRefDataHandler;
import com.yonyou.ucf.mdd.common.model.Pager;
import com.yonyou.ucf.mdd.common.model.ref.RefEntity;
import com.yonyou.ucf.mdd.ext.model.BillContext;
import com.yonyou.ucf.mdd.ext.ref.adapter.MetaExtRefDataHandler;
import java.util.HashMap;
import java.util.Map;
import org.springframework.stereotype.Component;

@Component
public class CustomerLevelRefExtRefDataHandler
extends MetaExtRefDataHandler
implements IExtRefDataHandler {
    public Pager getGridData(BillContext billContext, RefEntity refEntity, Map<String, Object> map) throws Exception {
        this.setSaleAreaRefExt(billContext, refEntity, map);
        return super.getGridData(billContext, refEntity, map);
    }

    private void setSaleAreaRefExt(BillContext billContext, RefEntity entity, Map<String, Object> refpara) {
        if ("aa_customerlevelref".equals(entity.getCode())) {
            HashMap<String, Comparable<Boolean>> context = new HashMap<String, Comparable<Boolean>>(8);
            context.put("modifySchema", Boolean.valueOf(true));
            if (refpara.get("externalData") != null && refpara.get("externalData") instanceof Map) {
                Map externalData = (Map)refpara.get("externalData");
                if (externalData.get("shopValue") != null) {
                    context.put("shopValue", Long.valueOf(Long.parseLong(externalData.get("shopValue").toString())));
                } else if (externalData.get("shopType") != null) {
                    if ("0".equals(externalData.get("shopType").toString())) {
                        context.put("shopType", (Comparable<Boolean>)externalData.get("shopType"));
                    } else if ("1".equals(externalData.get("shopType").toString())) {
                        context.put("shopType", (Comparable<Boolean>)externalData.get("shopType"));
                    } else if ("2".equals(externalData.get("shopType").toString())) {
                        context.put("shopType", (Comparable<Boolean>)externalData.get("shopType"));
                    }
                }
            }
            billContext.setContext(context);
        }
    }
}


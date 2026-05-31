/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.yonyou.ucf.mdd.common.model.ref.RefEntity
 *  com.yonyou.ucf.mdd.ext.ref.service.IRefEvent
 *  org.springframework.stereotype.Component
 */
package com.yonyoucloud.upc.eventbean.merchant;

import com.yonyou.ucf.mdd.common.model.ref.RefEntity;
import com.yonyou.ucf.mdd.ext.ref.service.IRefEvent;
import java.util.Map;
import org.springframework.stereotype.Component;

@Component(value="invoiceMerchantRefEventBean")
public class InvoiceMerchantRefEventBean
implements IRefEvent {
    public void beforeTreeData(RefEntity refEntity, Map<String, Object> refpara) {
    }

    public void afterTreeData(RefEntity refEntity, Map<String, Object> refpara, Object result) {
    }

    public void beforeGridData(RefEntity refEntity, Map<String, Object> refpara) {
        refpara.put("isDistinct", true);
    }

    public void afterGridData(RefEntity refEntity, Map<String, Object> refpara, Object result) {
    }

    public void beforeGridMeta(RefEntity refEntity) {
    }

    public void afterGridMeta(RefEntity refEntity, Object result) {
    }
}


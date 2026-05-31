/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.yonyou.ucf.mdd.common.model.ref.RefEntity
 *  com.yonyou.ucf.mdd.ext.ref.service.IRefEvent
 *  org.springframework.beans.factory.annotation.Autowired
 *  org.springframework.stereotype.Component
 */
package com.yonyoucloud.upc.eventbean.merchant;

import com.yonyou.ucf.mdd.common.model.ref.RefEntity;
import com.yonyou.ucf.mdd.ext.ref.service.IRefEvent;
import com.yonyoucloud.upc.service.MerchantCommonRefQueryService;
import java.util.Map;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component(value="addressDeleteRefEventBean")
public class AddressDeleteRefEventBean
implements IRefEvent {
    @Autowired
    private MerchantCommonRefQueryService merchantCommonRefQueryService;

    public void beforeTreeData(RefEntity refEntity, Map<String, Object> map) {
    }

    public void afterTreeData(RefEntity refEntity, Map<String, Object> map, Object o) {
    }

    public void beforeGridData(RefEntity refEntity, Map<String, Object> map) {
        this.merchantCommonRefQueryService.addressDeleteCondition(refEntity, map);
    }

    public void afterGridData(RefEntity refEntity, Map<String, Object> map, Object o) {
    }

    public void beforeGridMeta(RefEntity refEntity) {
    }

    public void afterGridMeta(RefEntity refEntity, Object o) {
    }
}


/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.yonyou.ucf.mdd.common.model.ref.RefEntity
 *  com.yonyou.ucf.mdd.ext.ref.service.IRefEvent
 *  org.springframework.stereotype.Component
 */
package com.yonyoucloud.upc.eventbean.product;

import com.yonyou.ucf.mdd.common.model.ref.RefEntity;
import com.yonyou.ucf.mdd.ext.ref.service.IRefEvent;
import com.yonyoucloud.upc.billrule.cls.ProductClsUtils;
import java.util.List;
import java.util.Map;
import org.springframework.stereotype.Component;

@Component(value="presentationClassRefEventBean")
public class PresentationClassRefEventBean
implements IRefEvent {
    public void beforeTreeData(RefEntity refEntity, Map<String, Object> map) {
    }

    public void afterTreeData(RefEntity refEntity, Map<String, Object> map, Object o) {
        if (o instanceof List) {
            ProductClsUtils.getInstance().sortTree((List)o, "code");
        }
    }

    public void beforeGridData(RefEntity refEntity, Map<String, Object> map) {
    }

    public void afterGridData(RefEntity refEntity, Map<String, Object> map, Object o) {
    }

    public void beforeGridMeta(RefEntity refEntity) {
    }

    public void afterGridMeta(RefEntity refEntity, Object o) {
    }
}


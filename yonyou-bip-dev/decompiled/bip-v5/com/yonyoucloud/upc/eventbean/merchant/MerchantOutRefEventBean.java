/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.yonyou.ucf.mdd.common.model.ref.RefEntity
 *  com.yonyou.ucf.mdd.common.model.uimeta.filter.vo.FilterVO
 *  com.yonyou.ucf.mdd.common.model.uimeta.filter.vo.SimpleFilterVO
 *  com.yonyou.ucf.mdd.ext.ref.service.IRefEvent
 *  org.imeta.core.base.ConditionOperator
 *  org.springframework.stereotype.Component
 */
package com.yonyoucloud.upc.eventbean.merchant;

import com.yonyou.ucf.mdd.common.model.ref.RefEntity;
import com.yonyou.ucf.mdd.common.model.uimeta.filter.vo.FilterVO;
import com.yonyou.ucf.mdd.common.model.uimeta.filter.vo.SimpleFilterVO;
import com.yonyou.ucf.mdd.ext.ref.service.IRefEvent;
import java.util.Map;
import org.imeta.core.base.ConditionOperator;
import org.springframework.stereotype.Component;

@Component(value="merchantOutRefEventBean")
public class MerchantOutRefEventBean
implements IRefEvent {
    public void beforeTreeData(RefEntity refEntity, Map<String, Object> map) {
    }

    public void afterTreeData(RefEntity refEntity, Map<String, Object> map, Object o) {
    }

    public void beforeGridData(RefEntity refEntity, Map<String, Object> map) {
        FilterVO gridFilter = (FilterVO)map.get("condition");
        if (gridFilter == null) {
            gridFilter = new FilterVO();
        }
        gridFilter.appendCondition(ConditionOperator.and, new SimpleFilterVO[]{new SimpleFilterVO("merchantAppliedDetail.merchantApplyRangeId.isPotential", "eq", (Object)0)});
        map.put("condition", gridFilter);
    }

    public void afterGridData(RefEntity refEntity, Map<String, Object> map, Object o) {
    }

    public void beforeGridMeta(RefEntity refEntity) {
    }

    public void afterGridMeta(RefEntity refEntity, Object o) {
    }
}


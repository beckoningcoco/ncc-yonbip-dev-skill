/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.yonyou.ucf.mdd.common.model.ref.RefEntity
 *  com.yonyou.ucf.mdd.common.model.uimeta.filter.vo.FilterVO
 *  com.yonyou.ucf.mdd.common.model.uimeta.filter.vo.SimpleFilterVO
 *  com.yonyou.ucf.mdd.ext.core.AppContext
 *  com.yonyou.ucf.mdd.ext.ref.service.IRefEvent
 *  org.springframework.stereotype.Component
 *  org.springframework.util.CollectionUtils
 */
package com.yonyoucloud.upc.eventbean.product;

import com.yonyou.ucf.mdd.common.model.ref.RefEntity;
import com.yonyou.ucf.mdd.common.model.uimeta.filter.vo.FilterVO;
import com.yonyou.ucf.mdd.common.model.uimeta.filter.vo.SimpleFilterVO;
import com.yonyou.ucf.mdd.ext.core.AppContext;
import com.yonyou.ucf.mdd.ext.ref.service.IRefEvent;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import org.springframework.stereotype.Component;
import org.springframework.util.CollectionUtils;

@Component
public class PubRefListRefEventBean
implements IRefEvent {
    public void beforeTreeData(RefEntity refEntity, Map<String, Object> map) {
    }

    public void afterTreeData(RefEntity refEntity, Map<String, Object> map, Object o) {
    }

    public void beforeGridData(RefEntity refEntity, Map<String, Object> refpara) {
        if (!Objects.isNull(refpara) && refpara.containsKey("condition")) {
            SimpleFilterVO simpleFilterVO2;
            Object value1;
            SimpleFilterVO simpleFilterVO;
            List conditions;
            SimpleFilterVO[] simpleVOs;
            if (null == refpara.get("mapCondition")) {
                refpara.put("mapCondition", new HashMap());
            }
            Map mapCondition = (Map)refpara.get("mapCondition");
            mapCondition.put("ytenant_id", AppContext.getYTenantId());
            FilterVO filterVO = (FilterVO)refpara.get("condition");
            if (null != filterVO && null != filterVO.getSimpleVOs() && null != (simpleVOs = filterVO.getSimpleVOs())[0] && !CollectionUtils.isEmpty((Collection)(conditions = (simpleFilterVO = simpleVOs[0]).getConditions())) && (value1 = (simpleFilterVO2 = (SimpleFilterVO)conditions.get(0)).getValue1()) instanceof String) {
                mapCondition.put("code", value1);
                mapCondition.put("name", value1);
                mapCondition.put("op", "=");
            }
        }
    }

    public void afterGridData(RefEntity refEntity, Map<String, Object> map, Object o) {
    }

    public void beforeGridMeta(RefEntity refEntity) {
    }

    public void afterGridMeta(RefEntity refEntity, Object o) {
    }
}


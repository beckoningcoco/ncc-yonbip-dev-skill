/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.yonyou.ucf.mdd.common.model.ref.RefEntity
 *  com.yonyou.ucf.mdd.common.model.uimeta.filter.vo.FilterVO
 *  com.yonyou.ucf.mdd.common.model.uimeta.filter.vo.SimpleFilterVO
 *  com.yonyou.ucf.mdd.ext.ref.service.IRefEvent
 *  org.apache.commons.lang3.StringUtils
 *  org.imeta.core.base.ConditionOperator
 *  org.springframework.stereotype.Component
 */
package com.yonyoucloud.upc.eventbean.unit;

import com.yonyou.ucf.mdd.common.model.ref.RefEntity;
import com.yonyou.ucf.mdd.common.model.uimeta.filter.vo.FilterVO;
import com.yonyou.ucf.mdd.common.model.uimeta.filter.vo.SimpleFilterVO;
import com.yonyou.ucf.mdd.ext.ref.service.IRefEvent;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import org.apache.commons.lang3.StringUtils;
import org.imeta.core.base.ConditionOperator;
import org.springframework.stereotype.Component;

@Component(value="unitRefEventBean")
public class UnitRefEventBean
implements IRefEvent {
    public void beforeTreeData(RefEntity refEntity, Map<String, Object> refpara) {
    }

    public void afterTreeData(RefEntity refEntity, Map<String, Object> refpara, Object result) {
        if (null != result && result instanceof List) {
            List unitGroup = (List)result;
            List sorted = unitGroup.stream().sorted((a, b) -> {
                int data = StringUtils.compare((String)((String)a.get("code")), (String)((String)b.get("code")));
                return data;
            }).collect(Collectors.toList());
            unitGroup.clear();
            unitGroup.addAll(sorted);
        }
    }

    public void beforeGridData(RefEntity refEntity, Map<String, Object> refpara) {
        if ("pc_unitref_new".equals(refEntity.getCode()) && refpara.get("path") != null) {
            FilterVO gridFilter = (FilterVO)refpara.get("condition");
            if (gridFilter == null) {
                gridFilter = new FilterVO();
            }
            gridFilter.appendCondition(ConditionOperator.and, new SimpleFilterVO[]{new SimpleFilterVO("unitGroup", "eq", refpara.get("path"))});
            refpara.put("condition", gridFilter);
            refpara.put("path", null);
        }
    }

    public void afterGridData(RefEntity refEntity, Map<String, Object> refpara, Object result) {
    }

    public void beforeGridMeta(RefEntity refEntity) {
    }

    public void afterGridMeta(RefEntity refEntity, Object result) {
    }
}


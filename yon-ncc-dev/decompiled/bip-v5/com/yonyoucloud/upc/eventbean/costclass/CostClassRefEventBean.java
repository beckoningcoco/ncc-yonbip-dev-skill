/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.alibaba.fastjson.JSON
 *  com.alibaba.fastjson.JSONObject
 *  com.yonyou.iuap.apdoc.coredoc.option.service.PubOptionService
 *  com.yonyou.ucf.mdd.common.model.ref.RefEntity
 *  com.yonyou.ucf.mdd.common.model.uimeta.filter.vo.FilterVO
 *  com.yonyou.ucf.mdd.common.model.uimeta.filter.vo.SimpleFilterVO
 *  com.yonyou.ucf.mdd.ext.ref.service.IRefEvent
 *  com.yonyoucloud.upc.utils.SQLInjectionCheckUtil
 *  org.imeta.core.base.ConditionOperator
 *  org.springframework.beans.factory.annotation.Autowired
 *  org.springframework.stereotype.Component
 *  org.springframework.util.StringUtils
 */
package com.yonyoucloud.upc.eventbean.costclass;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.yonyou.iuap.apdoc.coredoc.option.service.PubOptionService;
import com.yonyou.ucf.mdd.common.model.ref.RefEntity;
import com.yonyou.ucf.mdd.common.model.uimeta.filter.vo.FilterVO;
import com.yonyou.ucf.mdd.common.model.uimeta.filter.vo.SimpleFilterVO;
import com.yonyou.ucf.mdd.ext.ref.service.IRefEvent;
import com.yonyoucloud.upc.service.utils.OrgPermissionsUtil;
import com.yonyoucloud.upc.utils.SQLInjectionCheckUtil;
import java.util.List;
import java.util.Map;
import org.imeta.core.base.ConditionOperator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.util.StringUtils;

@Component(value="costClassRefEventBean")
public class CostClassRefEventBean
implements IRefEvent {
    @Autowired
    private PubOptionService pubOptionService;
    @Autowired
    private OrgPermissionsUtil orgPermissionsUtil;

    public void beforeTreeData(RefEntity refEntity, Map<String, Object> refpara) {
        Object masterOrgValue = refpara.get("masterOrgValue");
        SQLInjectionCheckUtil.checkMasterOrg((Object)masterOrgValue);
        Boolean isOrgGlobalShare = this.pubOptionService.getOrgGlobalShare("pc.cls.CostClass");
        if (isOrgGlobalShare.booleanValue()) {
            FilterVO filter = (FilterVO)refpara.get("treeCondition");
            this.orgPermissionsUtil.ignoreOrgId(filter, isOrgGlobalShare);
            return;
        }
        FilterVO gridFilter = (FilterVO)refpara.get("treeCondition");
        SimpleFilterVO[] simpleFilterVO = new SimpleFilterVO[]{};
        Boolean mark = true;
        if (gridFilter == null) {
            gridFilter = new FilterVO();
        } else {
            simpleFilterVO = gridFilter.getSimpleVOs();
        }
        if (simpleFilterVO != null && simpleFilterVO.length != 0) {
            for (int i = 0; i < simpleFilterVO.length; ++i) {
                if (simpleFilterVO[i].getField() != null && simpleFilterVO[i].getField().equals("costClassApplyRanges.orgId")) {
                    mark = false;
                    continue;
                }
                if (simpleFilterVO[i].getConditions() == null || simpleFilterVO[i].getConditions().size() == 0) continue;
                List simpleFilterVOList = simpleFilterVO[i].getConditions();
                for (SimpleFilterVO simpleFilterVO1 : simpleFilterVOList) {
                    if (simpleFilterVO1.getField() == null || !simpleFilterVO1.getField().equals("costClassApplyRanges.orgId")) continue;
                    mark = false;
                }
            }
        }
        if (mark.booleanValue()) {
            JSONObject extMap = null;
            String extendCondition = (String)refpara.get("extendCondition");
            if (!StringUtils.isEmpty((Object)extendCondition)) {
                extMap = JSON.parseObject((String)extendCondition);
            }
            if (extMap != null && extMap.get("orgId") != null) {
                gridFilter.appendCondition(ConditionOperator.and, new SimpleFilterVO[]{new SimpleFilterVO("costClassApplyRanges.orgId", "eq", extMap.get("orgId"))});
            } else {
                gridFilter.appendCondition(ConditionOperator.and, new SimpleFilterVO[]{new SimpleFilterVO("costClassApplyRanges.isCreator", "eq", (Object)1)});
            }
            refpara.put("treeCondition", gridFilter);
        }
    }

    public void afterTreeData(RefEntity refEntity, Map<String, Object> refpara, Object result) {
    }

    public void beforeGridData(RefEntity refEntity, Map<String, Object> refpara) {
    }

    public void afterGridData(RefEntity refEntity, Map<String, Object> refpara, Object result) {
    }

    public void beforeGridMeta(RefEntity refEntity) {
    }

    public void afterGridMeta(RefEntity refEntity, Object result) {
    }
}


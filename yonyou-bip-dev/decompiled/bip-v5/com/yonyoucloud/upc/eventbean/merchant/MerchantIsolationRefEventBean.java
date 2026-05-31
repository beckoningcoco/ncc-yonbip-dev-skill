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
 *  com.yonyoucloud.upc.utils.MerchantCommonRefUtils
 *  com.yonyoucloud.upc.utils.SQLInjectionCheckUtil
 *  org.imeta.core.base.ConditionOperator
 *  org.springframework.beans.factory.annotation.Autowired
 *  org.springframework.stereotype.Component
 *  org.springframework.util.CollectionUtils
 *  org.springframework.util.StringUtils
 */
package com.yonyoucloud.upc.eventbean.merchant;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.yonyou.iuap.apdoc.coredoc.option.service.PubOptionService;
import com.yonyou.ucf.mdd.common.model.ref.RefEntity;
import com.yonyou.ucf.mdd.common.model.uimeta.filter.vo.FilterVO;
import com.yonyou.ucf.mdd.common.model.uimeta.filter.vo.SimpleFilterVO;
import com.yonyou.ucf.mdd.ext.ref.service.IRefEvent;
import com.yonyoucloud.upc.service.utils.OrgPermissionsUtil;
import com.yonyoucloud.upc.utils.MerchantCommonRefUtils;
import com.yonyoucloud.upc.utils.SQLInjectionCheckUtil;
import java.util.Map;
import java.util.Set;
import org.imeta.core.base.ConditionOperator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.util.CollectionUtils;
import org.springframework.util.StringUtils;

@Component(value="merchantIsolationRefEventBean")
public class MerchantIsolationRefEventBean
implements IRefEvent {
    @Autowired
    private OrgPermissionsUtil orgPermissionsUtil;
    @Autowired
    private PubOptionService pubOptionService;

    public void beforeTreeData(RefEntity refEntity, Map<String, Object> map) {
    }

    public void afterTreeData(RefEntity refEntity, Map<String, Object> map, Object o) {
    }

    public void beforeGridData(RefEntity refEntity, Map<String, Object> map) {
        Object masterOrgValue = map.get("masterOrgValue");
        SQLInjectionCheckUtil.checkMasterOrg((Object)masterOrgValue);
        FilterVO gridFilter = (FilterVO)map.get("condition");
        if (gridFilter == null) {
            gridFilter = new FilterVO();
        }
        JSONObject extMap = null;
        String extendCondition = (String)map.get("extendCondition");
        if (!StringUtils.isEmpty((Object)extendCondition)) {
            extMap = JSON.parseObject((String)extendCondition);
        }
        Set<String> result = null;
        if (!this.pubOptionService.getOrgGlobalShare("aa.merchant.Merchant").booleanValue()) {
            result = this.orgPermissionsUtil.getOrgPermissions("aa_merchant");
        } else {
            MerchantCommonRefUtils.ignoreOrgId((FilterVO)gridFilter, (boolean)true);
        }
        if (extMap != null && extMap.get("isShopMerchantIsolationRef") != null) {
            if ("0".equals(extMap.get("isShopMerchantIsolationRef").toString())) {
                gridFilter.appendCondition(ConditionOperator.and, new SimpleFilterVO[]{new SimpleFilterVO("merchantAppliedDetail.merchantApplyRangeId.rangeType", "eq", (Object)1)});
            } else if ("1".equals(extMap.get("isShopMerchantIsolationRef").toString())) {
                gridFilter.appendCondition(ConditionOperator.and, new SimpleFilterVO[]{new SimpleFilterVO("merchantAppliedDetail.merchantApplyRangeId.rangeType", "eq", (Object)3)});
            } else if (!"2".equals(extMap.get("isShopMerchantIsolationRef").toString())) {
                if (!CollectionUtils.isEmpty(result)) {
                    gridFilter.appendCondition(ConditionOperator.and, new SimpleFilterVO[]{new SimpleFilterVO("merchantAppliedDetail.merchantApplyRangeId.orgId", "in", result)});
                }
                gridFilter.appendCondition(ConditionOperator.and, new SimpleFilterVO[]{new SimpleFilterVO("merchantAppliedDetail.merchantApplyRangeId.rangeType", "eq", (Object)1)});
            }
        } else {
            if (!CollectionUtils.isEmpty(result)) {
                gridFilter.appendCondition(ConditionOperator.and, new SimpleFilterVO[]{new SimpleFilterVO("merchantAppliedDetail.merchantApplyRangeId.orgId", "in", result)});
            }
            gridFilter.appendCondition(ConditionOperator.and, new SimpleFilterVO[]{new SimpleFilterVO("merchantAppliedDetail.merchantApplyRangeId.rangeType", "eq", (Object)1)});
        }
        gridFilter.appendCondition(ConditionOperator.and, new SimpleFilterVO[]{new SimpleFilterVO("merchantAppliedDetail.merchantApplyRangeId.isPotential", "eq", (Object)false)});
        map.put("isDistinct", true);
        map.put("condition", gridFilter);
    }

    public void afterGridData(RefEntity refEntity, Map<String, Object> map, Object o) {
    }

    public void beforeGridMeta(RefEntity refEntity) {
    }

    public void afterGridMeta(RefEntity refEntity, Object o) {
    }
}


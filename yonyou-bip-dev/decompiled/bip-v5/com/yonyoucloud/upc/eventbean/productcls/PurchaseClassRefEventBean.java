/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.alibaba.fastjson.JSON
 *  com.alibaba.fastjson.JSONObject
 *  com.yonyou.ucf.mdd.common.model.ref.RefEntity
 *  com.yonyou.ucf.mdd.common.model.uimeta.filter.vo.FilterVO
 *  com.yonyou.ucf.mdd.common.model.uimeta.filter.vo.SimpleFilterVO
 *  com.yonyou.ucf.mdd.ext.core.AppContext
 *  com.yonyou.ucf.mdd.ext.ref.service.IRefEvent
 *  com.yonyoucloud.upc.utils.SQLInjectionCheckUtil
 *  org.imeta.core.base.ConditionOperator
 *  org.springframework.beans.factory.annotation.Autowired
 *  org.springframework.stereotype.Component
 *  org.springframework.util.CollectionUtils
 *  org.springframework.util.StringUtils
 */
package com.yonyoucloud.upc.eventbean.productcls;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.yonyou.ucf.mdd.common.model.ref.RefEntity;
import com.yonyou.ucf.mdd.common.model.uimeta.filter.vo.FilterVO;
import com.yonyou.ucf.mdd.common.model.uimeta.filter.vo.SimpleFilterVO;
import com.yonyou.ucf.mdd.ext.core.AppContext;
import com.yonyou.ucf.mdd.ext.ref.service.IRefEvent;
import com.yonyoucloud.upc.billrule.cls.ProductClsUtils;
import com.yonyoucloud.upc.service.utils.OrgPermissionsUtil;
import com.yonyoucloud.upc.service.utils.ProductUtil;
import com.yonyoucloud.upc.utils.SQLInjectionCheckUtil;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.imeta.core.base.ConditionOperator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.util.CollectionUtils;
import org.springframework.util.StringUtils;

@Component(value="purchaseClassRefEventBean")
public class PurchaseClassRefEventBean
implements IRefEvent {
    @Autowired
    private OrgPermissionsUtil orgPermissionsUtil;

    public void beforeTreeData(RefEntity refEntity, Map<String, Object> refpara) {
        Object masterOrgValue = refpara.get("masterOrgValue");
        SQLInjectionCheckUtil.checkMasterOrg((Object)masterOrgValue);
        refEntity.setDatasourceType("purchaseClassRef");
        if ("pc_purchaseclassref".equals(refEntity.getCode())) {
            Set<String> result;
            FilterVO gridFilter = (FilterVO)refpara.get("treeCondition");
            SimpleFilterVO[] simpleFilterVO = new SimpleFilterVO[]{};
            boolean mark = true;
            if (gridFilter == null) {
                gridFilter = new FilterVO();
            } else {
                simpleFilterVO = gridFilter.getSimpleVOs();
            }
            if (simpleFilterVO != null && simpleFilterVO.length != 0) {
                for (int i = 0; i < simpleFilterVO.length; ++i) {
                    if (simpleFilterVO[i].getField() != null && "purchaseClassApplyRanges.orgGroupId.orgGroupDetailList.orgId".equals(simpleFilterVO[i].getField())) {
                        mark = false;
                        continue;
                    }
                    if (simpleFilterVO[i].getConditions() == null || simpleFilterVO[i].getConditions().size() == 0) continue;
                    List simpleFilterVOList = simpleFilterVO[i].getConditions();
                    for (SimpleFilterVO simpleFilterVO1 : simpleFilterVOList) {
                        if (simpleFilterVO1.getField() == null || !"purchaseClassApplyRanges.orgGroupId.orgGroupDetailList.orgId".equals(simpleFilterVO1.getField())) continue;
                        mark = false;
                    }
                }
            }
            if (!CollectionUtils.isEmpty(result = this.orgPermissionsUtil.getOrgPermissions("pc_purchaseclass")) && ProductUtil.checkUserTyoe(AppContext.getCurrentUser()) != 3) {
                gridFilter.appendCondition(ConditionOperator.and, new SimpleFilterVO[]{new SimpleFilterVO("purchaseClassApplyRanges.orgGroupId.orgGroupDetailList.orgId", "in", result)});
            }
            if (mark) {
                JSONObject extMap = null;
                String extendCondition = (String)refpara.get("extendCondition");
                if (!StringUtils.isEmpty((Object)extendCondition)) {
                    extMap = JSON.parseObject((String)extendCondition);
                }
                if (extMap != null && extMap.get("orgId") != null) {
                    gridFilter.appendCondition(ConditionOperator.and, new SimpleFilterVO[]{new SimpleFilterVO("purchaseClassApplyRanges.orgGroupId.orgGroupDetailList.orgId", "eq", extMap.get("orgId"))});
                } else {
                    if (masterOrgValue != null && !"".equals(masterOrgValue)) {
                        gridFilter.appendCondition(ConditionOperator.and, new SimpleFilterVO[]{new SimpleFilterVO("purchaseClassApplyRanges.orgGroupId.orgGroupDetailList.orgId", "in", Arrays.asList(masterOrgValue.toString().split(",")))});
                    }
                    if (ProductUtil.checkUserTyoe(AppContext.getCurrentUser()) == 3 && AppContext.getCurrentUser().getShop() != null) {
                        gridFilter.appendCondition(ConditionOperator.and, new SimpleFilterVO[]{new SimpleFilterVO("purchaseClassApplyRanges.orgGroupId.orgGroupDetailList.orgId", "eq", (Object)AppContext.getCurrentUser().getShop().toString())});
                    }
                }
                refpara.put("treeCondition", gridFilter);
            }
        }
    }

    public void afterTreeData(RefEntity refEntity, Map<String, Object> map, Object o) {
        if (null != o && o instanceof List) {
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


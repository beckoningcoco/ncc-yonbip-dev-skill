/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.alibaba.fastjson.JSON
 *  com.alibaba.fastjson.JSONObject
 *  com.yonyou.iuap.apdoc.coredoc.option.service.PubOptionService
 *  com.yonyou.iuap.apdoc.coredoc.utils.BooleanUtil
 *  com.yonyou.ucf.mdd.common.model.ref.RefEntity
 *  com.yonyou.ucf.mdd.common.model.uimeta.filter.vo.FilterVO
 *  com.yonyou.ucf.mdd.common.model.uimeta.filter.vo.SimpleFilterVO
 *  com.yonyou.ucf.mdd.ext.core.AppContext
 *  com.yonyou.ucf.mdd.ext.ref.service.IRefEvent
 *  com.yonyoucloud.upc.utils.SQLInjectionCheckUtil
 *  org.imeta.core.base.ConditionOperator
 *  org.slf4j.Logger
 *  org.slf4j.LoggerFactory
 *  org.springframework.beans.factory.annotation.Autowired
 *  org.springframework.stereotype.Component
 *  org.springframework.util.CollectionUtils
 *  org.springframework.util.StringUtils
 */
package com.yonyoucloud.upc.eventbean.productcls;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.yonyou.iuap.apdoc.coredoc.option.service.PubOptionService;
import com.yonyou.iuap.apdoc.coredoc.utils.BooleanUtil;
import com.yonyou.ucf.mdd.common.model.ref.RefEntity;
import com.yonyou.ucf.mdd.common.model.uimeta.filter.vo.FilterVO;
import com.yonyou.ucf.mdd.common.model.uimeta.filter.vo.SimpleFilterVO;
import com.yonyou.ucf.mdd.ext.core.AppContext;
import com.yonyou.ucf.mdd.ext.ref.service.IRefEvent;
import com.yonyoucloud.upc.billrule.cls.ProductClsUtils;
import com.yonyoucloud.upc.service.utils.OrgPermissionsUtil;
import com.yonyoucloud.upc.service.utils.ProductUtil;
import com.yonyoucloud.upc.utils.SQLInjectionCheckUtil;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.imeta.core.base.ConditionOperator;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.util.CollectionUtils;
import org.springframework.util.StringUtils;

@Component(value="productClassesRefEventBean")
public class ProductClassRefEventBean
implements IRefEvent {
    private static final Logger log = LoggerFactory.getLogger(ProductClassRefEventBean.class);
    @Autowired
    private OrgPermissionsUtil orgPermissionsUtil;
    @Autowired
    private PubOptionService pubOptionService;

    public void beforeTreeData(RefEntity refEntity, Map<String, Object> refpara) {
        Boolean isOrgGlobalShare;
        Object masterOrgValue = refpara.get("masterOrgValue");
        SQLInjectionCheckUtil.checkMasterOrg((Object)masterOrgValue);
        refEntity.setDatasourceType("productTreeTableRef");
        JSONObject extMap = null;
        String extendCondition = (String)refpara.get("extendCondition");
        if (StringUtils.hasLength((String)extendCondition)) {
            extMap = JSON.parseObject((String)extendCondition);
        }
        FilterVO gridFilter = (FilterVO)refpara.get("treeCondition");
        SimpleFilterVO[] simpleFilterVO = new SimpleFilterVO[]{};
        boolean mark = true;
        if (gridFilter == null) {
            gridFilter = new FilterVO();
        } else {
            simpleFilterVO = gridFilter.getSimpleVOs();
        }
        if (extMap != null && extMap.get("level") != null) {
            gridFilter.appendCondition(ConditionOperator.and, new SimpleFilterVO[]{new SimpleFilterVO("level", "eq", (Object)Integer.valueOf(extMap.get("level").toString()))});
            refpara.put("treeCondition", gridFilter);
        }
        if ("pc_product".equals(AppContext.getThreadContext((String)"serviceCode")) && refpara.get("externalData") != null) {
            boolean isFilter = false;
            if (refpara.get("externalData") instanceof String) {
                if ("filter".equals(refpara.get("externalData"))) {
                    isFilter = true;
                }
            } else if (refpara.get("externalData") instanceof Map && ((Map)refpara.get("externalData")).keySet().contains("filter")) {
                isFilter = true;
            }
            try {
                Map optionData = this.pubOptionService.getOptionByName("managementBaseRef");
                if (optionData != null && isFilter && BooleanUtil.isTrue(optionData.get("value"))) {
                    return;
                }
            }
            catch (Exception e) {
                log.error("\u83b7\u53d6\u53c2\u6570\u914d\u7f6e\u5f02\u5e38\uff1a" + e.getMessage(), (Throwable)e);
            }
        }
        if ((isOrgGlobalShare = this.pubOptionService.getOrgGlobalShare("pc.cls.ManagementClass")).booleanValue()) {
            FilterVO filter = (FilterVO)refpara.get("treeCondition");
            this.orgPermissionsUtil.ignoreOrgId(filter, isOrgGlobalShare);
            return;
        }
        if ("pc_managementclassref".equals(refEntity.getCode())) {
            if (simpleFilterVO != null && simpleFilterVO.length != 0) {
                for (int i = 0; i < simpleFilterVO.length; ++i) {
                    if (simpleFilterVO[i].getField() != null && simpleFilterVO[i].getField().equals("orgGroupId.orgGroupDetailList.orgId")) {
                        mark = false;
                        continue;
                    }
                    if (simpleFilterVO[i].getConditions() == null || simpleFilterVO[i].getConditions().size() == 0) continue;
                    List simpleFilterVOList = simpleFilterVO[i].getConditions();
                    for (SimpleFilterVO simpleFilterVO1 : simpleFilterVOList) {
                        if (simpleFilterVO1.getField() == null || !simpleFilterVO1.getField().equals("orgGroupId.orgGroupDetailList.orgId")) continue;
                        mark = false;
                    }
                }
            }
            Set<Object> result = new HashSet();
            if (!this.orgPermissionsUtil.isTenantAdminByInvocation()) {
                result = this.orgPermissionsUtil.getOrgPermissions("pc_managementclass");
            }
            if (mark) {
                if (extMap != null && extMap.get("orgId") != null) {
                    gridFilter.appendCondition(ConditionOperator.and, new SimpleFilterVO[]{new SimpleFilterVO("orgGroupId.orgGroupDetailList.orgId", "eq", extMap.get("orgId"))});
                } else {
                    if (masterOrgValue != null && !"".equals(masterOrgValue)) {
                        List<String> commonOrgIds = !CollectionUtils.isEmpty(result) && ProductUtil.checkUserTyoe(AppContext.getCurrentUser()) != 3 ? this.orgPermissionsUtil.filterCommonOrgIds(new ArrayList<String>(result), Arrays.asList(masterOrgValue.toString().split(","))) : Arrays.asList(masterOrgValue.toString().split(","));
                        gridFilter.appendCondition(ConditionOperator.and, new SimpleFilterVO[]{new SimpleFilterVO("orgGroupId.orgGroupDetailList.orgId", "in", commonOrgIds)});
                    } else if (!CollectionUtils.isEmpty(result) && ProductUtil.checkUserTyoe(AppContext.getCurrentUser()) != 3) {
                        gridFilter.appendCondition(ConditionOperator.and, new SimpleFilterVO[]{new SimpleFilterVO("orgGroupId.orgGroupDetailList.orgId", "in", result)});
                    }
                    if (ProductUtil.checkUserTyoe(AppContext.getCurrentUser()) == 3) {
                        gridFilter.setQueryConditionGroup(null);
                        if (AppContext.getCurrentUser().getShop() != null) {
                            gridFilter.appendCondition(ConditionOperator.and, new SimpleFilterVO[]{new SimpleFilterVO("orgGroupId.orgGroupDetailList.orgId", "eq", (Object)AppContext.getCurrentUser().getShop().toString())});
                        }
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


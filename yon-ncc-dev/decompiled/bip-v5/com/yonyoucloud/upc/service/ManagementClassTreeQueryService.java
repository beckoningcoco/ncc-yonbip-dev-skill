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
 *  com.yonyou.ucf.mdd.ext.core.AppContext
 *  com.yonyoucloud.upc.utils.SQLInjectionCheckUtil
 *  org.apache.commons.lang3.StringUtils
 *  org.imeta.core.base.ConditionOperator
 *  org.imeta.core.lang.BooleanUtils
 *  org.springframework.beans.factory.annotation.Autowired
 *  org.springframework.stereotype.Service
 *  org.springframework.util.CollectionUtils
 */
package com.yonyoucloud.upc.service;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.yonyou.iuap.apdoc.coredoc.option.service.PubOptionService;
import com.yonyou.ucf.mdd.common.model.ref.RefEntity;
import com.yonyou.ucf.mdd.common.model.uimeta.filter.vo.FilterVO;
import com.yonyou.ucf.mdd.common.model.uimeta.filter.vo.SimpleFilterVO;
import com.yonyou.ucf.mdd.ext.core.AppContext;
import com.yonyoucloud.upc.service.utils.OrgPermissionsUtil;
import com.yonyoucloud.upc.service.utils.ProductUtil;
import com.yonyoucloud.upc.utils.SQLInjectionCheckUtil;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import org.apache.commons.lang3.StringUtils;
import org.imeta.core.base.ConditionOperator;
import org.imeta.core.lang.BooleanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;

@Service
public class ManagementClassTreeQueryService {
    @Autowired
    private OrgPermissionsUtil orgPermissionsUtil;
    @Autowired
    private PubOptionService pubOptionService;

    public void managementClassQueryCondition(RefEntity refEntity, Map<String, Object> refpara) {
        Object masterOrgValue = refpara.get("masterOrgValue");
        SQLInjectionCheckUtil.checkMasterOrg((Object)masterOrgValue);
        refEntity.setDatasourceType("productTreeTableRef");
        Boolean isOrgGlobalShare = this.pubOptionService.getOrgGlobalShare("pc.cls.ManagementClass");
        if (isOrgGlobalShare.booleanValue()) {
            FilterVO filter = (FilterVO)refpara.get("treeCondition");
            this.orgPermissionsUtil.ignoreOrgId(filter, isOrgGlobalShare);
            return;
        }
        if ("pc.cls.ManagementClass".equals(refEntity.getCDataClass_FullName())) {
            boolean useAuthOrgFlag;
            FilterVO filter = (FilterVO)refpara.get("treeCondition");
            if (filter == null) {
                filter = new FilterVO();
            }
            Set<String> result = this.orgPermissionsUtil.getOrgPermissions("pc_managementclass");
            JSONObject extMap = null;
            String extendCondition = (String)refpara.get("extendCondition");
            if (!StringUtils.isEmpty((CharSequence)extendCondition)) {
                extMap = JSON.parseObject((String)extendCondition);
            }
            boolean bl = useAuthOrgFlag = extMap != null && BooleanUtils.b(extMap.get("useAuthOrg")) && Objects.nonNull(masterOrgValue);
            if (useAuthOrgFlag) {
                filter.appendCondition(ConditionOperator.and, new SimpleFilterVO[]{new SimpleFilterVO("orgGroupId.orgGroupDetailList.orgId", "in", Arrays.asList(masterOrgValue.toString().split(",")))});
            } else {
                if (masterOrgValue != null && !"".equals(masterOrgValue)) {
                    List<String> commonOrgIds = !CollectionUtils.isEmpty(result) ? this.orgPermissionsUtil.filterCommonOrgIds(new ArrayList<String>(result), Arrays.asList(masterOrgValue.toString().split(","))) : Arrays.asList(masterOrgValue.toString().split(","));
                    filter.appendCondition(ConditionOperator.and, new SimpleFilterVO[]{new SimpleFilterVO("orgGroupId.orgGroupDetailList.orgId", "in", commonOrgIds)});
                } else if (!CollectionUtils.isEmpty(result) && ProductUtil.checkUserTyoe(AppContext.getCurrentUser()) != 3) {
                    filter.appendCondition(ConditionOperator.and, new SimpleFilterVO[]{new SimpleFilterVO("orgGroupId.orgGroupDetailList.orgId", "in", result)});
                }
                if (ProductUtil.checkUserTyoe(AppContext.getCurrentUser()) == 3) {
                    filter.setQueryConditionGroup(null);
                    if (AppContext.getCurrentUser().getShop() != null) {
                        filter.appendCondition(ConditionOperator.and, new SimpleFilterVO[]{new SimpleFilterVO("orgGroupId.orgGroupDetailList.orgId", "eq", (Object)AppContext.getCurrentUser().getShop().toString())});
                    }
                }
            }
            refpara.put("treeCondition", filter);
        }
    }
}


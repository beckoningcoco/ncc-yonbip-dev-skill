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
 *  com.yonyou.ucf.mdd.ext.base.user.UserType
 *  com.yonyou.ucf.mdd.ext.core.AppContext
 *  com.yonyou.ucf.mdd.ext.model.LoginUser
 *  com.yonyou.ucf.mdd.ext.ref.service.IRefEvent
 *  com.yonyoucloud.upc.utils.SQLInjectionCheckUtil
 *  org.apache.commons.lang3.StringUtils
 *  org.imeta.core.base.ConditionOperator
 *  org.imeta.core.lang.BooleanUtils
 *  org.springframework.beans.factory.annotation.Autowired
 *  org.springframework.stereotype.Component
 *  org.springframework.util.CollectionUtils
 */
package com.yonyoucloud.upc.eventbean.goodsArchives;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.yonyou.iuap.apdoc.coredoc.option.service.PubOptionService;
import com.yonyou.ucf.mdd.common.model.ref.RefEntity;
import com.yonyou.ucf.mdd.common.model.uimeta.filter.vo.FilterVO;
import com.yonyou.ucf.mdd.common.model.uimeta.filter.vo.SimpleFilterVO;
import com.yonyou.ucf.mdd.ext.base.user.UserType;
import com.yonyou.ucf.mdd.ext.core.AppContext;
import com.yonyou.ucf.mdd.ext.model.LoginUser;
import com.yonyou.ucf.mdd.ext.ref.service.IRefEvent;
import com.yonyoucloud.iuap.upc.api.service.IUPCControlRuleService;
import com.yonyoucloud.iuap.upc.api.service.IUPCDataAuthService;
import com.yonyoucloud.upc.billrule.cls.ProductClsUtils;
import com.yonyoucloud.upc.service.ManagementClassTreeQueryService;
import com.yonyoucloud.upc.service.utils.OrgPermissionsUtil;
import com.yonyoucloud.upc.utils.SQLInjectionCheckUtil;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.apache.commons.lang3.StringUtils;
import org.imeta.core.base.ConditionOperator;
import org.imeta.core.lang.BooleanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.util.CollectionUtils;

@Component(value="productRefEventBean")
public class ProductRefEventBean
implements IRefEvent {
    @Autowired
    private IUPCDataAuthService upcDataAuthService;
    @Autowired
    private IUPCControlRuleService upcControlRuleService;
    @Autowired
    private OrgPermissionsUtil orgPermissionsUtil;
    @Autowired
    private ManagementClassTreeQueryService managementClassTreeQueryService;
    @Autowired
    private PubOptionService pubOptionService;

    public void beforeTreeData(RefEntity refEntity, Map<String, Object> map) {
        this.managementClassTreeQueryService.managementClassQueryCondition(refEntity, map);
    }

    public void afterTreeData(RefEntity refEntity, Map<String, Object> map, Object o) {
        if (null != o && o instanceof List) {
            ProductClsUtils.getInstance().sortTree((List)o, "code");
        }
    }

    public void beforeGridData(RefEntity refEntity, Map<String, Object> map) {
        Object masterOrgValue = map.get("masterOrgValue");
        SQLInjectionCheckUtil.checkMasterOrg((Object)masterOrgValue);
        boolean simpleFlag = BooleanUtils.b((Object)AppContext.getEnvConfig((String)"simplify.product.condition", (String)"false"));
        boolean isOrgGlobalShare = this.pubOptionService.getOrgGlobalShare("pc.product.Product");
        FilterVO gridFilter = (FilterVO)map.get("condition");
        if (gridFilter == null) {
            gridFilter = new FilterVO();
        } else {
            this.orgPermissionsUtil.ignoreOrgId(gridFilter, isOrgGlobalShare);
        }
        JSONObject extMap = null;
        String extendCondition = (String)map.get("extendCondition");
        if (!StringUtils.isEmpty((CharSequence)extendCondition)) {
            extMap = JSON.parseObject((String)extendCondition);
        }
        if (!(simpleFlag || extMap != null && BooleanUtils.b(extMap.get("descriptive")))) {
            gridFilter.appendCondition(ConditionOperator.and, new SimpleFilterVO[]{new SimpleFilterVO("realProductAttributeType", "neq", (Object)20)});
            gridFilter.appendCondition(ConditionOperator.and, new SimpleFilterVO[]{new SimpleFilterVO("virtualProductAttribute", "neq", (Object)20)});
        }
        if ("pc_productquerytreeref".equals(refEntity.getCode())) {
            Set<String> orgIds;
            LoginUser currentUser = AppContext.getCurrentUser();
            boolean isAdmin = false;
            if (currentUser.getUserType() == UserType.TenantAdmin || currentUser.getUserType() == UserType.PlatForm) {
                isAdmin = true;
            }
            if (!isAdmin && null != currentUser.get("yht_isAdmin")) {
                isAdmin = (Boolean)currentUser.get("yht_isAdmin");
            }
            if (!(isAdmin || isOrgGlobalShare || CollectionUtils.isEmpty(orgIds = this.orgPermissionsUtil.getOrgPermissions("pc_product")))) {
                gridFilter.appendCondition(ConditionOperator.and, new SimpleFilterVO[]{new SimpleFilterVO("productApplyRange.orgId", "in", orgIds)});
            }
        }
        if (!simpleFlag && "pc_nomalproductref".equals(refEntity.getCode())) {
            UserType userType;
            if (extMap == null || !BooleanUtils.b(extMap.get("ignoreCreator"))) {
                gridFilter.appendCondition(ConditionOperator.and, new SimpleFilterVO[]{new SimpleFilterVO("productApplyRange.isCreator", "eq", (Object)1)});
            }
            if (UserType.TenantAdmin == (userType = AppContext.getCurrentUser().getUserType()) || UserType.TenantEmployee == userType) {
                gridFilter.appendCondition(ConditionOperator.and, new SimpleFilterVO[]{new SimpleFilterVO("productApplyRange.rangeType", "eq", (Object)"1")});
            }
        } else {
            LoginUser user = AppContext.getCurrentUser();
            UserType userType = user.getUserType();
            if (!(UserType.PlatForm == userType || UserType.TenantAdmin == userType || UserType.TenantEmployee == userType || isOrgGlobalShare || extMap != null && BooleanUtils.b(extMap.get("includeOuterOrg")))) {
                gridFilter.appendCondition(ConditionOperator.and, new SimpleFilterVO[]{new SimpleFilterVO("productApplyRange.orgId.externalorg", "eq", (Object)0)});
                gridFilter.appendCondition(ConditionOperator.and, new SimpleFilterVO[]{new SimpleFilterVO("productApplyRange.orgId.isbizunit", "eq", (Object)1)});
                gridFilter.appendCondition(ConditionOperator.and, new SimpleFilterVO[]{new SimpleFilterVO("productApplyRange.orgId.dr", "eq", (Object)0)});
            }
        }
        if (masterOrgValue != null && extMap != null && BooleanUtils.b(extMap.get("filterByMasterOrgFlag")) && !isOrgGlobalShare) {
            gridFilter.appendCondition(ConditionOperator.and, new SimpleFilterVO[]{new SimpleFilterVO("productApplyRange.orgId", "in", masterOrgValue)});
        }
        map.put("condition", gridFilter);
    }

    public void afterGridData(RefEntity refEntity, Map<String, Object> map, Object o) {
    }

    public void beforeGridMeta(RefEntity refEntity) {
    }

    public void afterGridMeta(RefEntity refEntity, Object o) {
    }
}


/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.yonyou.diwork.service.auth.IServiceIsolateService
 *  com.yonyou.iuap.apdoc.coredoc.enums.CoreExtrateBusinessErrorEnum
 *  com.yonyou.iuap.apdoc.coredoc.exceptions.CoreDocBusinessException
 *  com.yonyou.iuap.apdoc.coredoc.utils.ListSplitUtil
 *  com.yonyou.iuap.basedocmc.service.IMCService
 *  com.yonyou.iuap.context.InvocationInfoProxy
 *  com.yonyou.iuap.org.dto.OrgUnitDTO
 *  com.yonyou.iuap.tenant.sdk.UserCenter
 *  com.yonyou.iuap.yms.datasource.api.DSManager
 *  com.yonyou.iuap.yms.datasource.api.DSManagerFactory
 *  com.yonyou.iuap.yms.datasource.api.DbType
 *  com.yonyou.ucf.mdd.common.model.uimeta.filter.vo.FilterVO
 *  com.yonyou.ucf.mdd.common.model.uimeta.filter.vo.SimpleFilterVO
 *  com.yonyou.ucf.mdd.ext.core.AppContext
 *  com.yonyoucloud.uretail.sys.pubItf.IOrgPermissionService
 *  org.apache.commons.lang3.StringUtils
 *  org.imeta.orm.base.BizObject
 *  org.imeta.orm.schema.ConditionExpression
 *  org.imeta.orm.schema.QueryCondition
 *  org.imeta.orm.schema.QueryConditionGroup
 *  org.slf4j.Logger
 *  org.slf4j.LoggerFactory
 *  org.springframework.beans.factory.annotation.Autowired
 *  org.springframework.stereotype.Service
 *  org.springframework.util.CollectionUtils
 */
package com.yonyoucloud.upc.service.utils;

import com.yonyou.diwork.service.auth.IServiceIsolateService;
import com.yonyou.iuap.apdoc.coredoc.enums.CoreExtrateBusinessErrorEnum;
import com.yonyou.iuap.apdoc.coredoc.exceptions.CoreDocBusinessException;
import com.yonyou.iuap.apdoc.coredoc.utils.ListSplitUtil;
import com.yonyou.iuap.basedocmc.service.IMCService;
import com.yonyou.iuap.context.InvocationInfoProxy;
import com.yonyou.iuap.org.dto.OrgUnitDTO;
import com.yonyou.iuap.tenant.sdk.UserCenter;
import com.yonyou.iuap.yms.datasource.api.DSManager;
import com.yonyou.iuap.yms.datasource.api.DSManagerFactory;
import com.yonyou.iuap.yms.datasource.api.DbType;
import com.yonyou.ucf.mdd.common.model.uimeta.filter.vo.FilterVO;
import com.yonyou.ucf.mdd.common.model.uimeta.filter.vo.SimpleFilterVO;
import com.yonyou.ucf.mdd.ext.core.AppContext;
import com.yonyoucloud.iuap.upc.api.service.IUPCControlRuleService;
import com.yonyoucloud.uretail.sys.pubItf.IOrgPermissionService;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;
import org.apache.commons.lang3.StringUtils;
import org.imeta.orm.base.BizObject;
import org.imeta.orm.schema.ConditionExpression;
import org.imeta.orm.schema.QueryCondition;
import org.imeta.orm.schema.QueryConditionGroup;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;

@Service
@Deprecated
public class OrgPermissionsUtil {
    private static final Logger logger = LoggerFactory.getLogger(OrgPermissionsUtil.class);
    @Autowired
    private IOrgPermissionService iOrgPermissionService;
    @Autowired
    private IUPCControlRuleService upcControlRuleService;
    @Autowired
    private IServiceIsolateService serviceIsolateService;
    @Autowired
    private IMCService mcService;

    public Set<String> getOrgPermissions(String billNo) {
        Set<String> orgs = new HashSet<String>();
        if (StringUtils.isEmpty((CharSequence)billNo)) {
            return orgs;
        }
        try {
            if (this.upcControlRuleService.checkSingleOrg().booleanValue()) {
                orgs.add(AppContext.getCurrentUser().getOrgId());
            } else {
                if (AppContext.getThreadContext((String)"serviceCode") != null) {
                    billNo = (String)AppContext.getThreadContext((String)"serviceCode");
                }
                orgs = this.iOrgPermissionService.getOrgPermissions(billNo);
            }
        }
        catch (Exception e) {
            logger.error("\u67e5\u8be2\u7ec4\u7ec7\u6743\u9650\u4fe1\u606f\u62a5\u9519", (Object)e.getMessage(), (Object)e);
        }
        return orgs;
    }

    public boolean isTenantAdminByInvocation() {
        return UserCenter.isTenantAdmin((String)InvocationInfoProxy.getUserid(), (String)InvocationInfoProxy.getTenantid());
    }

    public List<String> getOrgPermissionsNew(Boolean includeDisable) {
        List<String> orgs = new ArrayList<String>();
        try {
            if (this.upcControlRuleService.checkSingleOrg().booleanValue()) {
                orgs.add(AppContext.getCurrentUser().getOrgId());
            } else {
                String serviceCode;
                if (AppContext.getThreadContext((String)"serviceCode") != null) {
                    serviceCode = (String)AppContext.getThreadContext((String)"serviceCode");
                } else {
                    logger.error("\u67e5\u8be2\u7ec4\u7ec7\u6743\u9650\u4fe1\u606f\u672a\u83b7\u53d6serviceCode\uff0c\u9ed8\u8ba4pc_product");
                    serviceCode = "pc_product";
                }
                orgs = this.serviceIsolateService.findMainOrgPermission(AppContext.getCurrentUser().getYhtUserId(), serviceCode, AppContext.getCurrentUser().getYhtTenantId(), includeDisable);
            }
        }
        catch (Exception e) {
            logger.error("\u67e5\u8be2\u7ec4\u7ec7\u6743\u9650\u4fe1\u606f\u62a5\u9519", (Object)e.getMessage(), (Object)e);
        }
        return orgs;
    }

    public void ignoreOrgId(FilterVO gridFilter, boolean isOrgGlobalShare) {
        if (null != gridFilter && isOrgGlobalShare) {
            int i;
            if (gridFilter.getQueryConditionGroup() != null && !gridFilter.getQueryConditionGroup().conditions().isEmpty()) {
                QueryConditionGroup queryConditionGroup = gridFilter.getQueryConditionGroup();
                this.queryConditionGroupChangeModel(queryConditionGroup);
            }
            SimpleFilterVO[] simpleFilterVO = gridFilter.getSimpleVOs();
            ArrayList<SimpleFilterVO> newSimpleFilterVO = new ArrayList<SimpleFilterVO>();
            if (simpleFilterVO != null && simpleFilterVO.length != 0) {
                for (i = 0; i < simpleFilterVO.length; ++i) {
                    SimpleFilterVO filterVO = simpleFilterVO[i];
                    if (filterVO == null || filterVO.getField() == null || filterVO.getField().contains("orgId")) continue;
                    newSimpleFilterVO.add(filterVO);
                }
                simpleFilterVO = newSimpleFilterVO.toArray(new SimpleFilterVO[0]);
            }
            if (simpleFilterVO != null && simpleFilterVO.length != 0) {
                for (i = 0; i < simpleFilterVO.length; ++i) {
                    List simpleFilterVOs = simpleFilterVO[i].getConditions();
                    if (null == simpleFilterVOs || simpleFilterVOs.isEmpty()) continue;
                    this.querySimpleVOsChangeModel(simpleFilterVOs);
                }
            }
            gridFilter.setSimpleVOs(simpleFilterVO);
        }
    }

    private void queryConditionGroupChangeModel(QueryConditionGroup queryConditionGroup) {
        List conditionGropList = queryConditionGroup.conditions();
        Iterator it = conditionGropList.iterator();
        while (it.hasNext()) {
            ConditionExpression condition = (ConditionExpression)it.next();
            if (condition instanceof QueryCondition) {
                QueryCondition queryCondition = (QueryCondition)condition;
                if (queryCondition == null || queryCondition.field() == null || !queryCondition.field().contains("orgId")) continue;
                it.remove();
                continue;
            }
            if (!(condition instanceof QueryConditionGroup)) continue;
            this.queryConditionGroupChangeModel((QueryConditionGroup)condition);
        }
    }

    private void querySimpleVOsChangeModel(List<SimpleFilterVO> SimpleFilterVOs) {
        for (SimpleFilterVO simpleFilter : SimpleFilterVOs) {
            if (null != simpleFilter.getConditions() && !simpleFilter.getConditions().isEmpty()) {
                this.querySimpleVOsChangeModel(simpleFilter.getConditions());
            }
            if (simpleFilter.getField() == null) continue;
            this.replaceSimpleFilter(simpleFilter);
        }
    }

    private void replaceSimpleFilter(SimpleFilterVO simpleFilterVO) {
        if (simpleFilterVO.getField().contains("orgId")) {
            simpleFilterVO.setField("1");
            simpleFilterVO.setValue1((Object)"1");
        }
    }

    public List<OrgUnitDTO> filterVoucherManageOrgs(String fullname, List<OrgUnitDTO> adminAllOrgs) throws Exception {
        List<String> allVoucherManageOrgs;
        if (this.upcControlRuleService.checkSingleOrg().booleanValue()) {
            return adminAllOrgs;
        }
        if (CollectionUtils.isEmpty(adminAllOrgs) || StringUtils.isBlank((CharSequence)fullname)) {
            throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_800855);
        }
        List<String> orgs = adminAllOrgs.stream().map(org -> org.getId()).collect(Collectors.toList());
        try {
            allVoucherManageOrgs = this.upcControlRuleService.getVoucherManageOrgs(fullname, orgs);
        }
        catch (Exception e) {
            logger.error("\u83b7\u53d6\u6863\u6848\u7ba1\u7406\u6743\u7ec4\u7ec7\u5f02\u5e38", (Throwable)e);
            throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_800856);
        }
        if (CollectionUtils.isEmpty(allVoucherManageOrgs)) {
            throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_800857);
        }
        HashMap orgMap = new HashMap();
        allVoucherManageOrgs.forEach(org -> orgMap.put(org, null));
        List<OrgUnitDTO> voucherManageOrgs = adminAllOrgs.stream().filter(o -> orgMap.containsKey(o.getId())).collect(Collectors.toList());
        return voucherManageOrgs;
    }

    public Set<String> getShareOrgDetail(String fullName, String createOrgId, Map<String, Object> docData) {
        Set orgIds = this.mcService.getShareOrgsByManageOrgForAuto(fullName, createOrgId, docData);
        orgIds.add(createOrgId);
        return orgIds;
    }

    public Set<String> getShareOrgDetail4BillDate(String fullName, String createOrgId, BizObject bill) {
        Map<String, Object> billMap = bill.entrySet().stream().filter(map -> null != map.getValue()).collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue));
        return this.getShareOrgDetail(fullName, createOrgId, billMap);
    }

    public Set<String> getShareOrgDetailByManageOrg4BillDate(String fullName, String createOrgId, BizObject bill) {
        Map<String, Object> billMap = bill.entrySet().stream().filter(map -> null != map.getValue()).collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue));
        Set orgIds = this.mcService.getShareOrgsByManageOrg(fullName, createOrgId, billMap);
        orgIds.add(createOrgId);
        return orgIds;
    }

    public List<String> filterCommonOrgIds(List<String> orgPermissions, List<String> masterOrgs) {
        if (CollectionUtils.isEmpty(orgPermissions)) {
            return masterOrgs;
        }
        if (CollectionUtils.isEmpty(masterOrgs)) {
            return orgPermissions;
        }
        return masterOrgs.stream().filter(orgPermissions::contains).collect(Collectors.toList());
    }

    public String queryInLimitCount(List<String> orgIdList, String field, int capacity) {
        if (CollectionUtils.isEmpty(orgIdList) || field == null) {
            return null;
        }
        StringBuilder orgGlobalPart = new StringBuilder();
        List orgGolbalsList = ListSplitUtil.splitListByCapacity(orgIdList, (int)capacity);
        boolean isFirstPart = true;
        for (List orgGlobalListPart : orgGolbalsList) {
            if (!isFirstPart) {
                orgGlobalPart.append(" or ");
            }
            isFirstPart = false;
            String orgIdsStr = orgGlobalListPart.stream().map(s -> "'" + s + "'").collect(Collectors.joining(", "));
            orgGlobalPart.append(field).append(" in (").append(orgIdsStr).append(")");
        }
        return orgGlobalPart.toString();
    }

    public boolean isOracle() {
        boolean isOracle = false;
        DSManager dsManager = DSManagerFactory.getDsManager();
        DbType dbType = dsManager.getDatabaseType(dsManager.getLogicDS("iuap-apdoc-material_main_dataSource"));
        return DbType.ORACLE == dbType;
    }
}


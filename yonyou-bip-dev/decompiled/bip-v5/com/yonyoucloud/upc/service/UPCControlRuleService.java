/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.alibaba.fastjson.JSONObject
 *  com.alibaba.fastjson.serializer.SerializerFeature
 *  com.yonyou.iuap.apdoc.coredoc.config.YMSParamConfig
 *  com.yonyou.iuap.apdoc.coredoc.enums.CoreExtrateBusinessErrorEnum
 *  com.yonyou.iuap.apdoc.coredoc.exceptions.CoreDocBusinessException
 *  com.yonyou.iuap.apdoc.coredoc.option.service.PubOptionService
 *  com.yonyou.iuap.basedocmc.service.IMCService
 *  com.yonyou.iuap.data.entity.dto.FuncOrg
 *  com.yonyou.iuap.data.service.itf.FuncOrgGlobalDataQryApi
 *  com.yonyou.iuap.dto.CheckMCSetDTO
 *  com.yonyou.iuap.dto.MCSetDetailResult
 *  com.yonyou.iuap.dto.MCSetResult
 *  com.yonyou.iuap.enumeration.org.OrgFunc
 *  com.yonyou.iuap.org.dto.FuncOrgQryParentParam
 *  com.yonyou.iuap.org.dto.FuncOrgQrySubParam
 *  com.yonyou.iuap.service.MCSetManageService
 *  com.yonyou.iuap.ucf.common.i18n.InternationalUtils
 *  com.yonyou.permission.itf.bill.IBillAuthOrgPermission
 *  com.yonyou.ucf.mdd.ext.base.user.UserType
 *  com.yonyou.ucf.mdd.ext.core.AppContext
 *  com.yonyou.ucf.mdd.ext.dao.meta.MetaDaoHelper
 *  com.yonyou.ucf.mdd.ext.model.BillContext
 *  com.yonyou.ucf.mdd.ext.model.LoginUser
 *  com.yonyou.ucf.mdd.ext.option.util.OptionUtils
 *  com.yonyou.ucf.mdd.ext.util.OrgPermissionUtils
 *  com.yonyoucloud.upc.aa.controlrule.ControlType
 *  org.apache.commons.lang3.StringUtils
 *  org.imeta.orm.base.BizObject
 *  org.imeta.orm.schema.ConditionExpression
 *  org.imeta.orm.schema.QueryCondition
 *  org.imeta.orm.schema.QueryConditionGroup
 *  org.imeta.orm.schema.QuerySchema
 *  org.slf4j.Logger
 *  org.slf4j.LoggerFactory
 *  org.springframework.beans.factory.annotation.Autowired
 *  org.springframework.beans.factory.annotation.Qualifier
 *  org.springframework.context.annotation.Lazy
 *  org.springframework.stereotype.Service
 *  org.springframework.util.CollectionUtils
 */
package com.yonyoucloud.upc.service;

import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.serializer.SerializerFeature;
import com.yonyou.iuap.apdoc.coredoc.config.YMSParamConfig;
import com.yonyou.iuap.apdoc.coredoc.enums.CoreExtrateBusinessErrorEnum;
import com.yonyou.iuap.apdoc.coredoc.exceptions.CoreDocBusinessException;
import com.yonyou.iuap.apdoc.coredoc.option.service.PubOptionService;
import com.yonyou.iuap.basedocmc.service.IMCService;
import com.yonyou.iuap.data.entity.dto.FuncOrg;
import com.yonyou.iuap.data.service.itf.FuncOrgGlobalDataQryApi;
import com.yonyou.iuap.dto.CheckMCSetDTO;
import com.yonyou.iuap.dto.MCSetDetailResult;
import com.yonyou.iuap.dto.MCSetResult;
import com.yonyou.iuap.enumeration.org.OrgFunc;
import com.yonyou.iuap.org.dto.FuncOrgQryParentParam;
import com.yonyou.iuap.org.dto.FuncOrgQrySubParam;
import com.yonyou.iuap.service.MCSetManageService;
import com.yonyou.iuap.ucf.common.i18n.InternationalUtils;
import com.yonyou.permission.itf.bill.IBillAuthOrgPermission;
import com.yonyou.ucf.mdd.ext.base.user.UserType;
import com.yonyou.ucf.mdd.ext.core.AppContext;
import com.yonyou.ucf.mdd.ext.dao.meta.MetaDaoHelper;
import com.yonyou.ucf.mdd.ext.model.BillContext;
import com.yonyou.ucf.mdd.ext.model.LoginUser;
import com.yonyou.ucf.mdd.ext.option.util.OptionUtils;
import com.yonyou.ucf.mdd.ext.util.OrgPermissionUtils;
import com.yonyoucloud.iuap.upc.api.service.IUPCControlRuleService;
import com.yonyoucloud.iuap.upc.api.service.IUPCProductQueryService;
import com.yonyoucloud.upc.aa.controlrule.ControlType;
import com.yonyoucloud.upc.service.utils.ProductUtil;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;
import java.util.stream.Collectors;
import org.apache.commons.lang3.StringUtils;
import org.imeta.orm.base.BizObject;
import org.imeta.orm.schema.ConditionExpression;
import org.imeta.orm.schema.QueryCondition;
import org.imeta.orm.schema.QueryConditionGroup;
import org.imeta.orm.schema.QuerySchema;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;

@Service
public class UPCControlRuleService
implements IUPCControlRuleService {
    private static final Logger log = LoggerFactory.getLogger(UPCControlRuleService.class);
    @Autowired
    private IUPCProductQueryService upcProductQueryService;
    @Lazy
    @Autowired(required=false)
    private MCSetManageService mcSetManageService;
    @Lazy
    @Autowired(required=false)
    private FuncOrgGlobalDataQryApi funcOrgGlobalDataQryApi;
    @Autowired
    @Qualifier(value="org")
    IBillAuthOrgPermission orgPermissionService;
    @Autowired
    PubOptionService pubOptionService;
    @Autowired
    private YMSParamConfig ymsParamConfig;
    @Autowired
    private IMCService mcService;

    @Override
    public List<Map> getControlRule(String billNumber, String queryType) throws Exception {
        String key = "TENANT_CONTROLINFOS_" + queryType.toUpperCase() + "_" + AppContext.getTenantId();
        List rules = (List)JSONObject.parseObject((String)AppContext.cache().get(key), List.class);
        if (rules == null) {
            ControlType controlType;
            UserType userType = AppContext.getCurrentUser().getUserType();
            if (userType == UserType.TenantAdmin || userType == UserType.TenantEmployee) {
                controlType = ControlType.org;
            } else if (userType == UserType.TenantShopuser || userType == UserType.JoinUser || userType == UserType.ShopAdminUser || userType == UserType.ShopUser) {
                controlType = ControlType.shop;
            } else {
                throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_800530);
            }
            String queryFields = "billNum, childrenField, itemName, registerType, controlType";
            switch (queryType) {
                case "control": {
                    queryFields = queryFields + ", visible, editable";
                    break;
                }
                case "copy": {
                    queryFields = queryFields + ", copyData";
                    break;
                }
                case "batchedit": {
                    queryFields = queryFields + ", canBatchEdit";
                    break;
                }
                default: {
                    throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_800531);
                }
            }
            byte[] registed = this.upcProductQueryService.CheckRegistedInfos();
            int i = 0;
            for (byte c : registed) {
                if (c <= 0) continue;
                i = 1 << c - 1 | i;
            }
            int i1 = i;
            rules = MetaDaoHelper.query((String)"aa.controlrule.ControlRule", (QuerySchema)QuerySchema.create().addSelect(queryFields).addCondition((ConditionExpression)QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"billNum").eq((Object)billNumber), QueryCondition.name((String)"controlType").in((Collection)new ArrayList<Short>(){
                {
                    this.add(ControlType.tenant.getValue());
                    this.add(controlType.getValue());
                }
            })})));
            rules = rules.stream().filter(map -> this.checkRegisted(i1, map.get("registerType").toString())).collect(Collectors.collectingAndThen(Collectors.toCollection(() -> new TreeSet<Map>(Comparator.comparing(a -> ((BizObject)a).get("itemName").toString()))), ArrayList::new));
            AppContext.cache().set(key, JSONObject.toJSONString((Object)rules, (SerializerFeature[])new SerializerFeature[]{SerializerFeature.WriteDateUseDateFormat}), 10);
        }
        return rules;
    }

    private boolean checkRegisted(int i, String s2) {
        String[] strings = s2.split(",");
        int j = 0;
        for (String c : strings) {
            if ("0".equals(c)) continue;
            j = 1 << Integer.valueOf(c).byteValue() - 1 | j;
        }
        return (i & j) != 0;
    }

    @Override
    public List<String> getOrgPermissions(String billnum) throws Exception {
        Set result = OrgPermissionUtils.getOrgPermissions((String)billnum);
        log.info("getOrgPermissions billnum: {}, result: {}", (Object)billnum, (Object)result);
        if (null == result) {
            return new ArrayList<String>();
        }
        return new ArrayList<String>(result);
    }

    @Override
    public List<String> getOrgPermissionsByAuthId(String authId) throws Exception {
        Set result = OrgPermissionUtils.getOrgPermissionsByAuth((String)authId);
        log.info("getOrgPermissions authId: {}, result: {}", (Object)authId, (Object)result);
        if (null == result) {
            return new ArrayList<String>();
        }
        return new ArrayList<String>(result);
    }

    @Override
    public Boolean checkProductLine() throws Exception {
        Object result = OptionUtils.getSysOptionByName((String)"productLine");
        boolean option = null != result ? "u8c".equals(result.toString()) || "diwork".equals(result.toString()) : false;
        log.info("checkProductLine:{}", (Object)option);
        return option;
    }

    @Override
    public Boolean checkSingleOrg() throws Exception {
        Boolean result = AppContext.getCurrentUser().getIsSingleOrg();
        boolean option = null != result ? "1".equals(((Object)result).toString()) || "true".equals(((Object)result).toString()) : false;
        log.info("checkSingleOrg:{}", (Object)option);
        return option;
    }

    @Override
    public Boolean checkAppOpen(String appcode) throws Exception {
        Object result = OptionUtils.getSysOptionByName((String)appcode);
        boolean option = null != result ? "true".equals(result.toString()) : false;
        log.info("checkAppOpen:{}", (Object)option);
        return option;
    }

    @Override
    public Boolean checkVoucherManageShareOrg(String fullClassName, String orgId) throws Exception {
        ArrayList<String> orgs = new ArrayList<String>(1);
        CheckMCSetDTO dto = ProductUtil.getCheckMCSetDTO("diwork", fullClassName, AppContext.getCurrentUser().getYhtTenantId(), orgs, true, true);
        List orgShare = this.mcSetManageService.orgMCFilterByCondition(dto);
        log.info("checkVoucherManageShareOrg fullClassName:{} orgId:{} result:{}", new Object[]{fullClassName, orgId, orgShare});
        if (orgShare == null || orgShare.isEmpty()) {
            return false;
        }
        return true;
    }

    @Override
    public List<String> getVoucherManageOrgs(String fullClassName, List<String> orgs) throws Exception {
        CheckMCSetDTO dto = ProductUtil.getCheckMCSetDTO("diwork", fullClassName, AppContext.getCurrentUser().getYhtTenantId(), orgs, true, null);
        List orgMc = this.mcSetManageService.orgMCFilterByCondition(dto);
        log.info("getVoucherManageOrgs fullClassName:{} orgs:{} result:{}", new Object[]{fullClassName, orgs, orgMc});
        if (null == orgMc) {
            return new ArrayList<String>();
        }
        return orgMc;
    }

    @Override
    public List<String> getSubOrgs(String orgId) throws Exception {
        LoginUser currentUser = AppContext.getCurrentUser();
        log.info(InternationalUtils.getMessageWithDefault((String)"UID:P_COREDOC-BE_179F62860408078A", (String)"\u5f53\u524d\u767b\u5f55\u7528\u6237\u4fe1\u606f(YhtTenantId)\uff1a") + currentUser);
        List subOrgs = this.funcOrgGlobalDataQryApi.listAllSubOrgById(orgId, AppContext.getCurrentUser().getYhtTenantId(), "diwork", OrgFunc.ADMIN_ORG.getCode(), FuncOrgQrySubParam.queryEnabledDataWithoutCurrentNodeExcludeDept());
        if (null == subOrgs) {
            log.info("getSubOrgs orgId:{} result:{null}", (Object)orgId);
            return new ArrayList<String>();
        }
        List<String> result = subOrgs.stream().map(FuncOrg::getId).collect(Collectors.toList());
        log.info("getSubOrgs orgId:{} result:{}", (Object)orgId, result);
        return result;
    }

    @Override
    public List<String> getParentOrgs(String orgId) throws Exception {
        List parentOrgs = this.funcOrgGlobalDataQryApi.listAllParentOrgById(orgId, AppContext.getCurrentUser().getYhtTenantId(), "diwork", OrgFunc.ADMIN_ORG.getCode(), FuncOrgQryParentParam.queryEnabledDateWithoutCurrentNode());
        if (null == parentOrgs) {
            log.info("getParentOrgs orgId:{} result:{}", (Object)orgId, null);
            return new ArrayList<String>();
        }
        List<String> result = parentOrgs.stream().map(FuncOrg::getId).collect(Collectors.toList());
        log.info("getParentOrgs orgId:{} result:{}", (Object)orgId, result);
        return result;
    }

    public List<String> checkOrgIds(List<String> orgIds) throws Exception {
        List<String> result = new ArrayList<String>();
        if (null == orgIds || orgIds.isEmpty()) {
            return result;
        }
        List list = MetaDaoHelper.query((String)"bd.adminOrg.BaseOrgVO", (QuerySchema)QuerySchema.create().addSelect("id").addCondition((ConditionExpression)QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"id").in(orgIds)})));
        result = list.stream().map(map -> map.get("id").toString()).collect(Collectors.toList());
        orgIds.removeAll(result);
        log.info("checkOrgIds not exists orgIds:{}", orgIds);
        return result;
    }

    @Override
    public List<String> getVoucherManageShareOrgs(String fullClassName, List<String> orgs) throws Exception {
        CheckMCSetDTO dto = ProductUtil.getCheckMCSetDTO("diwork", fullClassName, AppContext.getCurrentUser().getYhtTenantId(), orgs, true, true);
        dto.setIsAutoShare(Boolean.valueOf(true));
        List orgShare = this.mcSetManageService.orgMCFilterByCondition(dto);
        log.info("getVoucherManageShareOrgs fullClassName:{} orgs:{} result:{}", new Object[]{fullClassName, orgs, orgShare});
        if (null == orgShare) {
            return new ArrayList<String>();
        }
        return orgShare;
    }

    @Override
    public List<String> getVoucherManageShareParentOrgs(String fullClassName, String orgId) throws Exception {
        List<String> parentOrgs = this.getParentOrgs(orgId);
        List<String> result = this.getVoucherManageShareOrgs(fullClassName, parentOrgs);
        log.info("getVoucherManageShareParentOrgs fullClassName:{} orgId:{} result:{}", new Object[]{fullClassName, orgId, result});
        return result;
    }

    @Override
    public List<String> getSelfCreateVoucherByCreateOrg(String fullClassName, List<String> orgs) throws Exception {
        ArrayList<String> idListResult = new ArrayList<String>();
        QuerySchema queryCountSchema = QuerySchema.create().addSelect("count(1) as count").addCondition((ConditionExpression)QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"orgId").in(orgs)}));
        List queryCountResult = MetaDaoHelper.query((String)fullClassName, (QuerySchema)queryCountSchema);
        if (Integer.parseInt(((Map)queryCountResult.get(0)).get("count").toString()) > 0) {
            long currentProductId = 0L;
            int realMaxRowsValue = this.ymsParamConfig.getResultMaxRowsValue() - 1;
            QuerySchema querySchema = QuerySchema.create().addSelect("id").addCondition((ConditionExpression)QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"orgId").in(orgs)})).appendQueryCondition(new ConditionExpression[]{QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"id").egt((Object)currentProductId)})}).addOrderBy("id").addPager(1, realMaxRowsValue);
            List idMapList = MetaDaoHelper.query((String)fullClassName, (QuerySchema)querySchema);
            List idList = idMapList.stream().map(map -> map.get("id").toString()).collect(Collectors.toList());
            idListResult.addAll(idList);
            while (idMapList.size() == realMaxRowsValue) {
                currentProductId = Long.parseLong(((Map)idMapList.get(idMapList.size() - 1)).get("id").toString());
                QuerySchema queryIdListSchema = QuerySchema.create().addSelect("id").addCondition((ConditionExpression)QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"orgId").in(orgs)})).appendQueryCondition(new ConditionExpression[]{QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"id").gt((Object)currentProductId)})}).addOrderBy("id").addPager(1, realMaxRowsValue);
                idMapList = MetaDaoHelper.query((String)fullClassName, (QuerySchema)queryIdListSchema);
                List idListTemp = idMapList.stream().map(map -> map.get("id").toString()).collect(Collectors.toList());
                idListResult.addAll(idListTemp);
            }
        }
        return idListResult;
    }

    @Override
    public List<String> getUserOrgAndVoucherManageOrg(String fullClassName, String billnum) throws Exception {
        List<String> orgIds;
        if (this.pubOptionService.getOrgGlobalShare(fullClassName).booleanValue()) {
            orgIds = this.getManageOrgGlobalShare(fullClassName);
        } else {
            orgIds = this.getOrgPermissions(billnum);
            if (orgIds.isEmpty()) {
                return orgIds;
            }
            orgIds = this.getVoucherManageOrgs(fullClassName, orgIds);
        }
        return orgIds;
    }

    @Override
    public List<String> getUserOrgAndVoucherManageOrg(String fullClassName, String billnum, String orgId) throws Exception {
        List<String> orgIds;
        if (this.pubOptionService.getOrgGlobalShare(fullClassName).booleanValue()) {
            orgIds = this.getManageOrgGlobalShare(fullClassName);
        } else {
            orgIds = this.getOrgPermissions(billnum);
            if (orgIds.isEmpty()) {
                return orgIds;
            }
            if (!orgIds.contains(orgId)) {
                return orgIds;
            }
            orgIds.clear();
            orgIds.add(orgId);
            orgIds = this.getVoucherManageOrgs(fullClassName, orgIds);
        }
        return orgIds;
    }

    @Override
    public List<String> getUserOrgAndVoucherManageOrgByAuthIdForCRM(String authId) throws Exception {
        List<String> orgIds;
        if (this.pubOptionService.getOrgGlobalShare("aa.merchant.Merchant").booleanValue()) {
            orgIds = this.getManageOrgGlobalShare("aa.merchant.Merchant");
        } else {
            orgIds = this.getOrgPermissionsByAuthId(authId);
            if (orgIds.isEmpty()) {
                return orgIds;
            }
            orgIds = this.getVoucherManageOrgs("aa.merchant.Merchant", orgIds);
        }
        return orgIds;
    }

    @Override
    public List<String> getUserOrgAndVoucherManageOrgByAuthId(BillContext billContext, String fullClassName) throws Exception {
        List<String> orgIds;
        if (this.pubOptionService.getOrgGlobalShare(fullClassName).booleanValue()) {
            orgIds = this.getManageOrgGlobalShare(fullClassName);
        } else {
            String authId = this.getAuthId(billContext);
            List<String> authOrgIds = this.getOrgPermissionsByAuthId(authId);
            if (authOrgIds.isEmpty()) {
                return authOrgIds;
            }
            Set manageOrgIds = this.mcService.orgMCFilter(fullClassName);
            orgIds = authOrgIds.stream().filter(manageOrgIds::contains).collect(Collectors.toList());
        }
        return orgIds;
    }

    public List<String> getManageOrgGlobalShare(String fullClassName) throws Exception {
        CheckMCSetDTO checkMCSetDTO = new CheckMCSetDTO();
        checkMCSetDTO.setTenantid(AppContext.getCurrentUser().getYhtTenantId());
        checkMCSetDTO.setSysid("diwork");
        checkMCSetDTO.setDoctype(fullClassName);
        checkMCSetDTO.setAllOrgs(Boolean.valueOf(true));
        return this.mcSetManageService.orgMCFilter(checkMCSetDTO);
    }

    @Override
    public List<String> getOrgRangeShareAll(String fullClassName, String orgId) throws Exception {
        if (StringUtils.isBlank((CharSequence)orgId) || this.pubOptionService.getOrgGlobalShare(fullClassName).booleanValue()) {
            return new ArrayList<String>();
        }
        ArrayList<String> orgIds = new ArrayList<String>(1);
        orgIds.add(orgId);
        CheckMCSetDTO dto = ProductUtil.getCheckMCSetDTO("diwork", fullClassName, AppContext.getCurrentUser().getYhtTenantId(), orgIds, true, true);
        dto.setIsAutoShare(Boolean.valueOf(true));
        MCSetResult mcSetResult = this.mcSetManageService.shareOrgShareSubDetail(dto);
        log.info("getOrgRangeShareAll fullClassName:{} orgId:{} mcSetResult:{}", new Object[]{fullClassName, orgId, mcSetResult});
        if (mcSetResult == null) {
            return new ArrayList<String>();
        }
        Map details = mcSetResult.getDetails();
        if (details == null || details.isEmpty()) {
            return new ArrayList<String>();
        }
        if (details.get(orgId) == null) {
            return new ArrayList<String>();
        }
        Boolean autoShare = ((MCSetDetailResult)details.get(orgId)).getAutoShare();
        log.info("getOrgRangeShareAll fullClassName:{} orgId:{} result:{} autoShare{}", new Object[]{fullClassName, orgId, mcSetResult.getOrgIds(), autoShare});
        return autoShare != false ? mcSetResult.getOrgIds() : new ArrayList();
    }

    @Override
    public List<String> getOrgRangeShareAllWithoutAutoShare(String fullClassName, String orgId) throws Exception {
        ArrayList<String> orgIds = new ArrayList<String>(1);
        orgIds.add(orgId);
        CheckMCSetDTO dto = ProductUtil.getCheckMCSetDTO("diwork", fullClassName, AppContext.getCurrentUser().getYhtTenantId(), orgIds, true, true);
        List result = this.mcSetManageService.orgRangeShareAll(dto);
        log.info("getOrgRangeShareAllWithoutAutoShare fullClassName:{} orgId:{} result:{}", new Object[]{fullClassName, orgId, result});
        if (null == result) {
            return new ArrayList<String>();
        }
        return result;
    }

    @Override
    public List<Map> getOrgDetail(Set<String> orgIds) throws Exception {
        List orgs = MetaDaoHelper.query((String)"bd.adminOrg.BaseOrgVO", (QuerySchema)QuerySchema.create().addSelect("id, code, name,externalorg").addCondition((ConditionExpression)QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"id").in(orgIds)})), (String)"ucf-org-center");
        return orgs;
    }

    private String getAuthId(BillContext billContext) {
        String billnum = billContext.getBillnum();
        if ("org_batch_generation_partner".equals(billnum)) {
            return "base_businesspartnerlist";
        }
        String customRefParam = billContext.getParameter("customRefParam");
        if (StringUtils.isEmpty((CharSequence)customRefParam)) {
            customRefParam = (String)AppContext.getThreadContext((String)"customRefParam");
        }
        if ("addProductFromApply".equals(customRefParam)) {
            return "pc_productapplyadd";
        }
        if ("changeProductFromApply".equals(customRefParam)) {
            return "pc_productapplyaddmodify";
        }
        if ("addMerchantFromApply".equals(customRefParam)) {
            return "aa_customerapplyadd";
        }
        if ("changeMerchantFromApply".equals(customRefParam)) {
            return "aa_customerapplyaddmodify";
        }
        try {
            return this.orgPermissionService.getAuthId(billnum);
        }
        catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public List<String> getManageOrgList(String fullName, String billNum) throws Exception {
        List<String> orgIds;
        if (this.pubOptionService.getOrgGlobalShare(fullName).booleanValue()) {
            orgIds = this.getManageOrgGlobalShare(fullName);
        } else {
            orgIds = this.getOrgPermissions(billNum);
            if (orgIds.isEmpty()) {
                return null;
            }
            Set orgIdSet = this.mcService.orgMCFilter(fullName);
            if (!CollectionUtils.isEmpty((Collection)orgIdSet)) {
                orgIds = orgIds.stream().filter(orgIdSet::contains).collect(Collectors.toList());
            } else {
                return null;
            }
        }
        return orgIds;
    }
}


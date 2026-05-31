/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.yonyou.iuap.apdoc.coredoc.config.YMSParamConfig
 *  com.yonyou.iuap.apdoc.coredoc.enums.CoreDocBusinessErrorEnum
 *  com.yonyou.iuap.apdoc.coredoc.enums.CoreExtrateBusinessErrorEnum
 *  com.yonyou.iuap.apdoc.coredoc.exceptions.CoreDocBusinessException
 *  com.yonyou.iuap.apdoc.coredoc.utils.BooleanUtil
 *  com.yonyou.iuap.context.InvocationInfoProxy
 *  com.yonyou.ucf.mdd.common.model.rule.RuleExecuteResult
 *  com.yonyou.ucf.mdd.ext.bill.rule.base.AbstractCommonRule
 *  com.yonyou.ucf.mdd.ext.core.AppContext
 *  com.yonyou.ucf.mdd.ext.dao.meta.MetaDaoHelper
 *  com.yonyou.ucf.mdd.ext.model.BillContext
 *  com.yonyoucloud.upc.pc.cls.ManagementClass
 *  com.yonyoucloud.upc.pc.cls.ManagementClassApplyRange
 *  com.yonyoucloud.upc.pc.cls.PresentationClass
 *  com.yonyoucloud.upc.utils.TreeBillDataUtil
 *  org.apache.commons.lang3.ObjectUtils
 *  org.imeta.orm.base.BizObject
 *  org.imeta.orm.base.EntityStatus
 *  org.imeta.orm.schema.ConditionExpression
 *  org.imeta.orm.schema.QueryCondition
 *  org.imeta.orm.schema.QueryConditionGroup
 *  org.imeta.orm.schema.QuerySchema
 *  org.slf4j.Logger
 *  org.slf4j.LoggerFactory
 *  org.springframework.beans.factory.annotation.Autowired
 *  org.springframework.context.annotation.Lazy
 *  org.springframework.stereotype.Component
 *  org.springframework.util.CollectionUtils
 *  org.springframework.util.StringUtils
 */
package com.yonyoucloud.upc.billrule.cls;

import com.yonyou.iuap.apdoc.coredoc.config.YMSParamConfig;
import com.yonyou.iuap.apdoc.coredoc.enums.CoreDocBusinessErrorEnum;
import com.yonyou.iuap.apdoc.coredoc.enums.CoreExtrateBusinessErrorEnum;
import com.yonyou.iuap.apdoc.coredoc.exceptions.CoreDocBusinessException;
import com.yonyou.iuap.apdoc.coredoc.utils.BooleanUtil;
import com.yonyou.iuap.context.InvocationInfoProxy;
import com.yonyou.ucf.mdd.common.model.rule.RuleExecuteResult;
import com.yonyou.ucf.mdd.ext.bill.rule.base.AbstractCommonRule;
import com.yonyou.ucf.mdd.ext.core.AppContext;
import com.yonyou.ucf.mdd.ext.dao.meta.MetaDaoHelper;
import com.yonyou.ucf.mdd.ext.model.BillContext;
import com.yonyoucloud.iuap.upc.api.service.IUPCControlRuleService;
import com.yonyoucloud.upc.pc.cls.ManagementClass;
import com.yonyoucloud.upc.pc.cls.ManagementClassApplyRange;
import com.yonyoucloud.upc.pc.cls.PresentationClass;
import com.yonyoucloud.upc.service.ProductCheckService;
import com.yonyoucloud.upc.service.api.PresentationClassServiceImpl;
import com.yonyoucloud.upc.service.utils.TreeApplyRangeUtils;
import com.yonyoucloud.upc.utils.TreeBillDataUtil;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.apache.commons.lang3.ObjectUtils;
import org.imeta.orm.base.BizObject;
import org.imeta.orm.base.EntityStatus;
import org.imeta.orm.schema.ConditionExpression;
import org.imeta.orm.schema.QueryCondition;
import org.imeta.orm.schema.QueryConditionGroup;
import org.imeta.orm.schema.QuerySchema;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;
import org.springframework.util.CollectionUtils;
import org.springframework.util.StringUtils;

@Component(value="productClassBeforeSaveRule")
public class ProductClassBeforeSaveRule
extends AbstractCommonRule {
    private static final Logger log = LoggerFactory.getLogger(ProductClassBeforeSaveRule.class);
    @Lazy
    @Autowired
    private IUPCControlRuleService iupcControlRuleService;
    @Autowired
    private YMSParamConfig ymsParamConfig;
    @Autowired
    private PresentationClassServiceImpl productClsService;

    public RuleExecuteResult execute(BillContext billContext, Map<String, Object> map) throws Exception {
        List clss = this.getBills(billContext, map);
        HashMap<String, Object> params = new HashMap<String, Object>();
        params.put("tenantid", AppContext.getCurrentUser().getTenant());
        Boolean singleOrg = this.iupcControlRuleService.checkSingleOrg();
        for (BizObject cls : clss) {
            Boolean stopstatus;
            RuleExecuteResult rr;
            int level;
            BizObject bizObject;
            params.put("id", cls.get("id"));
            if ("pc_presentationclass".equals(billContext.getBillnum())) {
                PresentationClass presentcls = (PresentationClass)cls;
                this.checkBooleanNull(presentcls);
                if (presentcls.getEntityStatus() == EntityStatus.Insert) {
                    presentcls.setIsEnd(Boolean.valueOf(true));
                }
                if (presentcls.getParent() != null && (bizObject = MetaDaoHelper.findById((String)"pc.cls.PresentationClass", (Object)presentcls.getParent())) != null && bizObject.containsKey((Object)"level") && bizObject.get("level") != null && (level = ((Integer)bizObject.get("level")).intValue()) > 2) {
                    rr = new RuleExecuteResult();
                    rr.setCancel(true);
                    String datfroms = this.ymsParamConfig.getDataFrom();
                    List<String> datfromsList = Arrays.asList(StringUtils.split((String)(StringUtils.isEmpty((Object)datfroms) ? "" : datfroms), (String)","));
                    if (!CollectionUtils.isEmpty(datfromsList) && datfromsList.contains(cls.get("data_from"))) {
                        this.setIdOfThirdLevel(presentcls);
                        rr.setData((Object)cls);
                    }
                    throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_800161);
                }
                this.checkProStopStatus(presentcls);
                this.checkPPreReferProduct(presentcls);
                stopstatus = presentcls.getStopstatus();
                if (!stopstatus.booleanValue()) {
                    presentcls.setStoptime(null);
                }
                if (presentcls.getId() == null || presentcls.getParent() == null) continue;
                TreeBillDataUtil.checkTreeLevel((String)"pc.cls.PresentationClass", (Long)((Long)presentcls.getId()), (Long)presentcls.getParent());
                continue;
            }
            ManagementClass managementClass = (ManagementClass)cls;
            if (managementClass.getCode() != null && managementClass.getCode().length() > 50) {
                throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_800162, new Object[]{managementClass.getCode()});
            }
            if (managementClass.getParent() != null && (bizObject = MetaDaoHelper.findById((String)"pc.cls.ManagementClass", (Object)managementClass.getParent())) != null && bizObject.containsKey((Object)"level") && bizObject.get("level") != null && (level = ((Integer)bizObject.get("level")).intValue()) > 7) {
                rr = new RuleExecuteResult();
                rr.setCancel(true);
                return rr;
            }
            if (EntityStatus.Insert.equals((Object)managementClass.getEntityStatus())) {
                List<String> orgIds;
                if (!(this.iupcControlRuleService.checkSingleOrg().booleanValue() || managementClass.getOrgId() == null || AppContext.getCurrentUser().getUserType() == null || !ObjectUtils.isEmpty(orgIds = this.iupcControlRuleService.getUserOrgAndVoucherManageOrg("pc.cls.ManagementClass", "pc_managementclass")) && orgIds.contains(managementClass.getOrgId()))) {
                    String msg = managementClass.getOrgId();
                    if (cls.get("orgId_code") != null) {
                        msg = cls.get("orgId_code").toString();
                    }
                    if (cls.get("orgId_name") != null) {
                        msg = cls.get("orgId_name").toString();
                    }
                    throw new CoreDocBusinessException(CoreDocBusinessErrorEnum.MANAGE_ORG_MC_FILTER_CHECK, new Object[]{msg});
                }
                managementClass.setIsEnd(Boolean.valueOf(true));
            } else if (EntityStatus.Update.equals((Object)managementClass.getEntityStatus())) {
                QuerySchema schema;
                Map manageClsDB;
                Map managementClassCharacter = (Map)managementClass.get("managementClassCharacter");
                if (managementClassCharacter != null && (manageClsDB = MetaDaoHelper.queryOne((String)"pc.cls.ManagementClass", (QuerySchema)(schema = QuerySchema.create().addSelect("id,managementClassCharacter.id as managementClassCharacter_id,orgId").addCondition((ConditionExpression)QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"id").eq(managementClass.getId())}))))) != null && manageClsDB.get("managementClassCharacter_id") != null) {
                    managementClassCharacter.put("id", manageClsDB.get("managementClassCharacter_id"));
                    managementClassCharacter.put("_status", EntityStatus.Update);
                }
                if (managementClass.get("_fromApi") != null && BooleanUtil.isTrue((Object)managementClass.get("_fromApi"))) {
                    Map manageClsOrg = MetaDaoHelper.queryOne((String)"pc.cls.ManagementClass", (QuerySchema)QuerySchema.create().addSelect("orgId").addCondition((ConditionExpression)QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"id").eq(managementClass.getId())})));
                    if (manageClsOrg == null || manageClsOrg.isEmpty()) {
                        throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_800163);
                    }
                    if (!singleOrg.booleanValue() && managementClass.containsKey((Object)"orgId") && !manageClsOrg.get("orgId").toString().equals(managementClass.getOrgId())) {
                        throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_800164, new Object[]{this.getName((BizObject)managementClass), managementClass.getCode()});
                    }
                }
                this.checkManageStopStatus(managementClass);
                if (managementClass.getId() != null && managementClass.getParent() != null) {
                    TreeBillDataUtil.checkTreeLevel((String)"pc.cls.ManagementClass", (Long)((Long)managementClass.getId()), (Long)managementClass.getParent());
                }
            }
            this.checkPManReferProduct(managementClass);
            this.checkProductClass(managementClass);
            stopstatus = managementClass.getStopstatus();
            if (stopstatus.booleanValue()) continue;
            managementClass.setStoptime(null);
        }
        return new RuleExecuteResult();
    }

    private void checkProductClass(ManagementClass managementClass) throws Exception {
        if (managementClass.getProductClass() != null && !ProductCheckService.checkProductClassDataIsEnd(managementClass.getProductClass())) {
            throw new CoreDocBusinessException(CoreDocBusinessErrorEnum.PRODUCT_CLASS_IS_NOT_END, new Object[]{managementClass.getCode()});
        }
    }

    private void setIdOfThirdLevel(PresentationClass cls) throws Exception {
        QuerySchema schema;
        List list;
        String erpCode = cls.getErpCode();
        if (!StringUtils.isEmpty((Object)erpCode) && !CollectionUtils.isEmpty((Collection)(list = MetaDaoHelper.query((String)"pc.cls.ManagementClass", (QuerySchema)(schema = QuerySchema.create().addSelect("*").addCondition((ConditionExpression)QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"erpCode").eq((Object)erpCode)}))))))) {
            String path = ((Map)list.get(0)).get("path").toString();
            String[] paths = path.split("\\|");
            String thirdLevelId = null;
            if (path.length() > 3) {
                thirdLevelId = paths[2];
            } else if (path.length() > 0) {
                thirdLevelId = paths[paths.length - 1];
            }
            List thirdLevelMClss = MetaDaoHelper.queryById((String)"pc.cls.ManagementClass", (String)"*", (Object)thirdLevelId);
            if (!CollectionUtils.isEmpty((Collection)thirdLevelMClss)) {
                Object pClsErpCode = ((Map)thirdLevelMClss.get(0)).get("erpCode");
                schema = QuerySchema.create().addSelect("*").addCondition((ConditionExpression)QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"erpCode").eq(pClsErpCode)}));
                list = MetaDaoHelper.query((String)"pc.cls.PresentationClass", (QuerySchema)schema);
                if (!CollectionUtils.isEmpty((Collection)list)) {
                    cls.setId(((Map)list.get(0)).get("id"));
                }
            }
        }
    }

    private void checkPManReferProduct(ManagementClass managementClass) throws Exception {
        Long parent = managementClass.getParent();
        if (parent != null) {
            QuerySchema schema = QuerySchema.create().addSelect("count(1) as count").addCondition((ConditionExpression)QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"manageClass").eq((Object)parent)}));
            Map map = MetaDaoHelper.queryOne((String)"pc.product.Product", (QuerySchema)schema);
            int count = 0;
            if (map != null && map.get("count") != null) {
                count = Integer.valueOf(map.get("count").toString());
            }
            if (count > 0) {
                throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_800165, new Object[]{this.getName((BizObject)managementClass), managementClass.getCode()});
            }
        }
    }

    private void checkPPreReferProduct(PresentationClass presentcls) throws Exception {
        Long parent = presentcls.getParent();
        if (parent != null) {
            QuerySchema schema = QuerySchema.create().addSelect("count(1) as count").addCondition((ConditionExpression)QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"productClass").eq((Object)parent)}));
            Map map = MetaDaoHelper.queryOne((String)"pc.product.Product", (QuerySchema)schema);
            int count = 0;
            if (map != null && map.get("count") != null) {
                count = Integer.valueOf(map.get("count").toString());
            }
            if (count > 0) {
                throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_800151);
            }
        }
    }

    private void checkManageStopStatus(ManagementClass managementClass) throws Exception {
        EntityStatus entityStatus = managementClass.getEntityStatus();
        if (EntityStatus.Update == entityStatus) {
            QuerySchema schema;
            List clss;
            Object id = managementClass.getId();
            Boolean stopstatus = managementClass.getStopstatus();
            if (stopstatus.booleanValue() && (clss = MetaDaoHelper.query((String)"pc.cls.ManagementClass", (QuerySchema)(schema = QuerySchema.create().addSelect("id").addCondition((ConditionExpression)QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"path").like(id), QueryCondition.name((String)"stopstatus").eq((Object)false), QueryCondition.name((String)"id").not_eq(id)}))))) != null && clss.size() > 0) {
                throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_800166, new Object[]{this.getName((BizObject)managementClass), managementClass.getCode()});
            }
        }
    }

    private void checkProStopStatus(PresentationClass presentcls) throws Exception {
        EntityStatus entityStatus = presentcls.getEntityStatus();
        if (EntityStatus.Update == entityStatus) {
            QuerySchema schema;
            List settlemethods;
            Object id = presentcls.getId();
            Boolean stopstatus = presentcls.getStopstatus();
            if (stopstatus.booleanValue() && (settlemethods = MetaDaoHelper.query((String)"pc.cls.PresentationClass", (QuerySchema)(schema = QuerySchema.create().addSelect("id").addCondition((ConditionExpression)QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"path").like(id), QueryCondition.name((String)"stopstatus").eq((Object)false), QueryCondition.name((String)"id").not_eq(id)}))))) != null && settlemethods.size() > 0) {
                throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_800152);
            }
        }
    }

    public void setRanges(ManagementClass cls) {
        ArrayList<ManagementClassApplyRange> managementClassApplyRanges = cls.managementClassApplyRanges();
        if (managementClassApplyRanges == null || managementClassApplyRanges.size() < 1) {
            managementClassApplyRanges = new ArrayList<ManagementClassApplyRange>();
            managementClassApplyRanges.add(TreeApplyRangeUtils.getInstance().getManagementClassApplyRange((Long)cls.getId(), cls.getOrgId(), true, true));
            cls.setManagementClassApplyRanges(managementClassApplyRanges);
        }
    }

    public void setApplierRanges(ManagementClass cls) throws Exception {
        List<String> shareAll;
        ArrayList<ManagementClassApplyRange> ranges = cls.managementClassApplyRanges();
        if (ranges == null) {
            ranges = new ArrayList<ManagementClassApplyRange>();
        }
        ArrayList<String> orgs = new ArrayList<String>();
        orgs.add(cls.getOrgId());
        List<String> autoShareOrg = this.iupcControlRuleService.getVoucherManageShareOrgs("pc.cls.ManagementClass", orgs);
        if (!CollectionUtils.isEmpty(autoShareOrg) && !CollectionUtils.isEmpty(shareAll = this.iupcControlRuleService.getOrgRangeShareAll("pc.cls.ManagementClass", cls.getOrgId()))) {
            for (String org : shareAll) {
                if (org.equals(cls.getOrgId())) continue;
                ranges.add(TreeApplyRangeUtils.getInstance().getManagementClassApplyRange((Long)cls.getId(), org, true, false));
            }
        }
        cls.setManagementClassApplyRanges(ranges);
    }

    private void checkBooleanNull(PresentationClass presentcls) {
        if (!presentcls.containsKey((Object)"iUOrderStatus") || presentcls.getIUOrderStatus() == null) {
            presentcls.set("iUOrderStatus", (Object)false);
        }
        if (!presentcls.containsKey((Object)"showInFront") || presentcls.getShowInFront() == null) {
            presentcls.set("showInFront", (Object)false);
        }
        if (!presentcls.containsKey((Object)"showInTouchpad") || presentcls.getShowInTouchpad() == null) {
            presentcls.set("showInTouchpad", (Object)false);
        }
        if (!presentcls.containsKey((Object)"isRecommend") || presentcls.getIsRecommend() == null) {
            presentcls.set("isRecommend", (Object)false);
        }
        if (!presentcls.containsKey((Object)"isURecommend") || presentcls.getIsURecommend() == null) {
            presentcls.set("isURecommend", (Object)false);
        }
    }

    private String getName(BizObject bizObject) {
        String name = null;
        if (bizObject.get("name") instanceof String) {
            name = (String)bizObject.get("name");
        } else if (InvocationInfoProxy.getLocale().equals("zh_CN")) {
            name = (String)((BizObject)bizObject.get("name")).get("zh_CN");
        } else if (InvocationInfoProxy.getLocale().equals("en_US")) {
            name = (String)((BizObject)bizObject.get("name")).get("en_US");
        } else if (InvocationInfoProxy.getLocale().equals("zh_TW")) {
            name = (String)((BizObject)bizObject.get("name")).get("zh_TW");
        }
        if (name == null) {
            name = (String)((BizObject)bizObject.get("name")).get("zh_CN");
        }
        return name;
    }
}


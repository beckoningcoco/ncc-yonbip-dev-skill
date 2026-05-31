/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.yonyou.iuap.apdoc.coredoc.enums.CoreExtrateBusinessErrorEnum
 *  com.yonyou.iuap.apdoc.coredoc.exceptions.CoreDocBusinessException
 *  com.yonyou.iuap.org.dto.OrgUnitDTO
 *  com.yonyou.ucf.mdd.common.model.rule.RuleExecuteResult
 *  com.yonyou.ucf.mdd.ext.bill.dto.BillDataDto
 *  com.yonyou.ucf.mdd.ext.bill.rule.base.AbstractCommonRule
 *  com.yonyou.ucf.mdd.ext.core.AppContext
 *  com.yonyou.ucf.mdd.ext.dao.meta.MetaDaoHelper
 *  com.yonyou.ucf.mdd.ext.model.BillContext
 *  com.yonyou.ucf.mdd.ext.model.LoginUser
 *  com.yonyou.ucf.mdd.ext.option.util.OptionUtils
 *  com.yonyoucloud.upc.aa.merchant.AgentFinancial
 *  com.yonyoucloud.upc.aa.merchant.Merchant
 *  com.yonyoucloud.upc.aa.merchant.MerchantApplyRangeDetail
 *  com.yonyoucloud.upc.utils.MerchantUtils
 *  org.apache.commons.lang3.StringUtils
 *  org.imeta.core.lang.BooleanUtils
 *  org.imeta.orm.base.BizObject
 *  org.imeta.orm.base.EntityStatus
 *  org.imeta.orm.schema.ConditionExpression
 *  org.imeta.orm.schema.QueryCondition
 *  org.imeta.orm.schema.QueryConditionGroup
 *  org.imeta.orm.schema.QuerySchema
 *  org.slf4j.Logger
 *  org.slf4j.LoggerFactory
 *  org.springframework.beans.factory.annotation.Autowired
 *  org.springframework.stereotype.Component
 *  org.springframework.util.CollectionUtils
 */
package com.yonyoucloud.upc.billrule.merchant;

import com.yonyou.iuap.apdoc.coredoc.enums.CoreExtrateBusinessErrorEnum;
import com.yonyou.iuap.apdoc.coredoc.exceptions.CoreDocBusinessException;
import com.yonyou.iuap.org.dto.OrgUnitDTO;
import com.yonyou.ucf.mdd.common.model.rule.RuleExecuteResult;
import com.yonyou.ucf.mdd.ext.bill.dto.BillDataDto;
import com.yonyou.ucf.mdd.ext.bill.rule.base.AbstractCommonRule;
import com.yonyou.ucf.mdd.ext.core.AppContext;
import com.yonyou.ucf.mdd.ext.dao.meta.MetaDaoHelper;
import com.yonyou.ucf.mdd.ext.model.BillContext;
import com.yonyou.ucf.mdd.ext.model.LoginUser;
import com.yonyou.ucf.mdd.ext.option.util.OptionUtils;
import com.yonyoucloud.upc.aa.merchant.AgentFinancial;
import com.yonyoucloud.upc.aa.merchant.Merchant;
import com.yonyoucloud.upc.aa.merchant.MerchantApplyRangeDetail;
import com.yonyoucloud.upc.coredoc.pub.CheckDomainDeleteService;
import com.yonyoucloud.upc.service.MerchantService;
import com.yonyoucloud.upc.service.UpcCommonFieldCheckService;
import com.yonyoucloud.upc.service.rpcService.OrgService;
import com.yonyoucloud.upc.utils.MerchantUtils;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import org.apache.commons.lang3.StringUtils;
import org.imeta.core.lang.BooleanUtils;
import org.imeta.orm.base.BizObject;
import org.imeta.orm.base.EntityStatus;
import org.imeta.orm.schema.ConditionExpression;
import org.imeta.orm.schema.QueryCondition;
import org.imeta.orm.schema.QueryConditionGroup;
import org.imeta.orm.schema.QuerySchema;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.util.CollectionUtils;

@Component(value="merchantFieldCheckRule")
public class MerchantFieldCheckRule
extends AbstractCommonRule {
    private static final Logger log = LoggerFactory.getLogger(MerchantFieldCheckRule.class);
    @Autowired
    private MerchantService merchantService;
    @Autowired
    private UpcCommonFieldCheckService upcCommonFieldCheckService;
    @Autowired
    private CheckDomainDeleteService checkDomainDeleteService;
    @Autowired
    OrgService orgService;

    public RuleExecuteResult execute(BillContext billContext, Map<String, Object> paramMap) throws Exception {
        LoginUser currentUser = AppContext.getCurrentUser();
        if (null == currentUser) {
            throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_800108);
        }
        BillDataDto billDataDto = (BillDataDto)this.getParam(paramMap);
        if (null == billContext || billDataDto == null) {
            return new RuleExecuteResult();
        }
        List bills = this.getBills(billContext, paramMap);
        for (BizObject bill : bills) {
            Map externalData;
            Merchant merchant = (Merchant)bill;
            if ((!MerchantUtils.isExists((Map)merchant, (String)"data_from") && merchant.get("_fromApi") != null && ((Boolean)merchant.get("_fromApi")).booleanValue() || !MerchantUtils.isExists((Map)merchant, (String)"data_from") && merchant.get("importSpecialKey_merchant") != null) && ((externalData = (Map)billDataDto.getExternalData()) != null && !externalData.isEmpty() && externalData.get("importType") != null && externalData.get("importMode") != null && externalData.get("importType").equals(2) && externalData.get("importMode").equals(2) || merchant.containsKey((Object)"importSpecialKey_merchant"))) {
                QuerySchema querySchema = QuerySchema.create();
                querySchema.addSelect("id,isCreator");
                if (merchant.containsKey((Object)"belongOrg_code")) {
                    querySchema.addCondition((ConditionExpression)QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"merchantId").eq(merchant.getId()), QueryCondition.name((String)"orgId.code").eq(merchant.get("belongOrg_code")), QueryCondition.name((String)"isPotential").eq((Object)false)}));
                } else {
                    querySchema.addCondition((ConditionExpression)QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"merchantId").eq(merchant.getId()), QueryCondition.name((String)"isCreator").eq((Object)1), QueryCondition.name((String)"isPotential").eq((Object)false)}));
                }
                Map map = MetaDaoHelper.queryOne((String)"aa.merchant.MerchantApplyRange", (QuerySchema)querySchema);
                if (map != null && !map.isEmpty()) {
                    if (merchant.getEntityStatus() != EntityStatus.Unchanged) {
                        merchant.setEntityStatus(EntityStatus.Update);
                    }
                    if (merchant.get("merchantApplyRangeId") != null && !merchant.get("merchantApplyRangeId").toString().equals(map.get("id").toString())) {
                        merchant.put("isCreator", (Object)false);
                    } else {
                        merchant.put("isCreator", map.get("isCreator"));
                        merchant.put("merchantApplyRangeId", map.get("id"));
                    }
                }
            }
            if (EntityStatus.Update == merchant.getEntityStatus()) {
                paramMap.put("merchantUInttrade", this.merchantQuoteNoOrgCheck(merchant));
                this.theCheckMerchantBank(merchant);
            }
            this.merchantCheckLicense(merchant);
        }
        return new RuleExecuteResult();
    }

    private boolean merchantQuoteNoOrgCheck(Merchant merchant) throws Exception {
        QuerySchema querySchema = QuerySchema.create();
        querySchema.addSelect("internalOrg,internalOrgId");
        querySchema.addCondition((ConditionExpression)QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"id").eq(merchant.getId())}));
        Map merchantInternalOrg = MetaDaoHelper.queryOne((String)"aa.merchant.Merchant", (QuerySchema)querySchema);
        boolean merchantUInttrade = false;
        if (!CollectionUtils.isEmpty((Map)merchantInternalOrg)) {
            if (MerchantUtils.isExists((Map)merchant, (String)"internalOrgId") && MerchantUtils.isExists((Map)merchantInternalOrg, (String)"internalOrgId") && !merchant.getInternalOrgId().equals(merchantInternalOrg.get("internalOrgId"))) {
                merchantUInttrade = true;
            } else if (MerchantUtils.isExists((Map)merchant, (String)"internalOrg") && !merchant.getInternalOrg().booleanValue() && MerchantUtils.isExists((Map)merchantInternalOrg, (String)"internalOrg") && merchantInternalOrg.get("internalOrg").equals(true)) {
                merchantUInttrade = true;
            }
        }
        return merchantUInttrade;
    }

    private void merchantCheckLicense(Merchant merchant) throws Exception {
        List merchantApplyRangeDetailList = merchant.merchantAppliedDetail();
        if (!CollectionUtils.isEmpty((Collection)merchantApplyRangeDetailList) && ((MerchantApplyRangeDetail)merchantApplyRangeDetailList.get(0)).getStopstatus() != null && ((MerchantApplyRangeDetail)merchantApplyRangeDetailList.get(0)).getStopstatus().booleanValue()) {
            List<Map<String, Object>> merchantRoleInfo;
            List<Map<String, Object>> merchantApplyRangeDetailListSql = this.merchantService.selectMerchantStopStatus((MerchantApplyRangeDetail)merchantApplyRangeDetailList.get(0), (Long)merchant.getId());
            if (!(CollectionUtils.isEmpty(merchantApplyRangeDetailListSql) || BooleanUtils.b((Object)merchantApplyRangeDetailListSql.get(0).get("stopstatus")) || CollectionUtils.isEmpty(merchantRoleInfo = this.merchantService.selectMerchantOf2B((BizObject)merchant)))) {
                this.merchantService.incrUnionKeyCheckLicense((BizObject)merchant, true);
            }
            return;
        }
        Object channelOperateCenter = OptionUtils.getSysOptionByName((String)"app:ChannelOperateCenter");
        String defaultOpen = "true";
        if (channelOperateCenter != null && defaultOpen.equals(channelOperateCenter.toString())) {
            if (EntityStatus.Insert == merchant.getEntityStatus()) {
                if (CollectionUtils.isEmpty((Map)merchant.merchantRole()) || StringUtils.isBlank((CharSequence)merchant.merchantRole().getBusinessRole())) {
                    return;
                }
                String businessRole = merchant.merchantRole().getBusinessRole();
                if (businessRole.contains("3")) {
                    this.merchantService.setUnionKeyCheckLicense(true);
                }
            } else if (EntityStatus.Update == merchant.getEntityStatus()) {
                Boolean isCreator = false;
                if (merchant.get("isCreator") != null) {
                    isCreator = (Boolean)merchant.get("isCreator");
                } else if (merchant.get("merchantApplyRangeId") != null) {
                    Long merchantApplyRangeId = Long.valueOf(merchant.get("merchantApplyRangeId").toString());
                    if (merchantApplyRangeId == 0L) {
                        throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_800255);
                    }
                    QueryConditionGroup queryMerchantApplyRangeid = QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"merchantId").eq(merchant.getId()), QueryCondition.name((String)"id").eq((Object)merchantApplyRangeId), QueryCondition.name((String)"isPotential").eq((Object)false)});
                    QuerySchema schemaId = QuerySchema.create().addSelect("id,isCreator").addCondition((ConditionExpression)queryMerchantApplyRangeid);
                    Map merchantApplyRange = MetaDaoHelper.queryOne((String)"aa.merchant.MerchantApplyRange", (QuerySchema)schemaId);
                    if (!CollectionUtils.isEmpty((Map)merchantApplyRange)) {
                        isCreator = (Boolean)merchantApplyRange.get("isCreator");
                    }
                } else {
                    if (MerchantUtils.isExists((Map)merchant, (String)"srcBill") && "CRM".equals(merchant.get("srcBill"))) {
                        return;
                    }
                    QueryConditionGroup queryMerchantApplyRangeid = QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"merchantId").eq(merchant.getId()), QueryCondition.name((String)"orgId").eq(merchant.get("belongOrg")), QueryCondition.name((String)"isPotential").eq((Object)false)});
                    QuerySchema schemaId = QuerySchema.create().addSelect("id,isCreator").addCondition((ConditionExpression)queryMerchantApplyRangeid);
                    Map merchantApplyRange = MetaDaoHelper.queryOne((String)"aa.merchant.MerchantApplyRange", (QuerySchema)schemaId);
                    if (merchantApplyRange != null && !merchantApplyRange.isEmpty()) {
                        isCreator = (Boolean)merchantApplyRange.get("isCreator");
                    } else {
                        OrgUnitDTO belongOrg = this.orgService.getOrgByOrgId((String)merchant.get("belongOrg"));
                        log.info("\u201c\u5ba2\u6237\u7f16\u7801\uff0c\u540d\u79f0\uff0cID\u7684\u5ba2\u6237\u201d\u672a\u67e5\u8be2\u5230\u5206\u914d\u7ed9\u201cID\u7684\u4f7f\u7528\u7ec4\u7ec7\u6570\u636e\u201d", new Object[]{merchant.getCode(), merchant.getName(), merchant.getId(), merchant.get("belongOrg")});
                        if (belongOrg != null) {
                            throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_800373, new Object[]{merchant.getCode(), merchant.getName(), merchant.getId(), belongOrg.getCode(), merchant.get("belongOrg")});
                        }
                        throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_808373, new Object[]{merchant.getCode(), merchant.getName(), merchant.getId(), merchant.get("belongOrg")});
                    }
                }
                if (this.getUpdateMerchantGlobalFields(merchant, isCreator)) {
                    if (CollectionUtils.isEmpty((Map)merchant.merchantRole()) || StringUtils.isBlank((CharSequence)merchant.merchantRole().getBusinessRole())) {
                        return;
                    }
                    String businessRole = merchant.merchantRole().getBusinessRole();
                    List<Map<String, Object>> merchantRoleInfo = this.merchantService.selectMerchantOf2B((BizObject)merchant);
                    List<Map<String, Object>> merchantApplyRangeDetailListSql = this.merchantService.selectCreateMerchantStopStatus((Long)merchant.getId());
                    if (businessRole.contains("3") && CollectionUtils.isEmpty(merchantRoleInfo)) {
                        this.merchantService.setUnionKeyCheckLicense(true);
                    } else if (!businessRole.contains("3") && !CollectionUtils.isEmpty(merchantRoleInfo)) {
                        this.merchantService.incrUnionKeyCheckLicense((BizObject)merchant, true);
                    } else if (businessRole.contains("3") && !CollectionUtils.isEmpty(merchantApplyRangeDetailListSql) && BooleanUtils.b((Object)merchantApplyRangeDetailListSql.get(0).get("stopstatus"))) {
                        this.merchantService.setUnionKeyCheckLicense(true);
                    }
                }
            }
        }
    }

    private void theCheckMerchantBank(Merchant merchant) throws Exception {
        List agentFinancialList = merchant.merchantAgentFinancialInfos();
        if (!CollectionUtils.isEmpty((Collection)agentFinancialList)) {
            ArrayList<Long> agentFinancialIdList = new ArrayList<Long>();
            for (AgentFinancial agentFinancial : agentFinancialList) {
                if (agentFinancial.getEntityStatus() != EntityStatus.Delete) continue;
                agentFinancialIdList.add((Long)agentFinancial.getId());
            }
            if (!CollectionUtils.isEmpty(agentFinancialIdList)) {
                this.upcCommonFieldCheckService.checkMerchantBank((Long)merchant.getId(), agentFinancialIdList);
                this.checkDomainDeleteService.checkDomainDeleteDTO("aa.merchant.AgentFinancial", "aa_merchant", (BizObject)merchant);
            }
        }
    }

    private boolean getUpdateMerchantGlobalFields(Merchant merchant, Boolean isCreator) {
        if ("customerapply".equals(merchant.get("customerapply")) && MerchantUtils.getIsUpdateMerchantGlobalFields()) {
            return true;
        }
        return isCreator != false;
    }
}


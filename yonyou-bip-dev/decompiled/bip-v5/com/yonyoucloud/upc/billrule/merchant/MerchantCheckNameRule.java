/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.alibaba.fastjson.JSON
 *  com.google.gson.Gson
 *  com.yonyou.iuap.apdoc.coredoc.enums.CoreDocBusinessErrorEnum
 *  com.yonyou.iuap.apdoc.coredoc.enums.CoreExtrateBusinessErrorEnum
 *  com.yonyou.iuap.apdoc.coredoc.exceptions.CoreDocBusinessException
 *  com.yonyou.iuap.data.service.itf.OrgExternalQryService
 *  com.yonyou.iuap.ucf.common.i18n.InternationalUtils
 *  com.yonyou.ucf.mdd.common.model.CheckItem
 *  com.yonyou.ucf.mdd.common.model.rule.RuleExecuteResult
 *  com.yonyou.ucf.mdd.ext.base.user.UserType
 *  com.yonyou.ucf.mdd.ext.bill.dto.BillDataDto
 *  com.yonyou.ucf.mdd.ext.bill.rule.base.AbstractCommonRule
 *  com.yonyou.ucf.mdd.ext.core.AppContext
 *  com.yonyou.ucf.mdd.ext.dao.meta.MetaDaoHelper
 *  com.yonyou.ucf.mdd.ext.model.BillContext
 *  com.yonyou.ucf.mdd.ext.util.OptionUtils
 *  com.yonyoucloud.upc.aa.merchant.EnterpriseNature
 *  com.yonyoucloud.upc.aa.merchant.Merchant
 *  com.yonyoucloud.upc.utils.MerchantUtils
 *  com.yonyoucloud.upc.utils.MultilangUtil
 *  org.apache.commons.lang3.StringUtils
 *  org.imeta.biz.base.MetaUtils
 *  org.imeta.core.model.Property
 *  org.imeta.orm.base.BizObject
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

import com.alibaba.fastjson.JSON;
import com.google.gson.Gson;
import com.yonyou.iuap.apdoc.coredoc.enums.CoreDocBusinessErrorEnum;
import com.yonyou.iuap.apdoc.coredoc.enums.CoreExtrateBusinessErrorEnum;
import com.yonyou.iuap.apdoc.coredoc.exceptions.CoreDocBusinessException;
import com.yonyou.iuap.data.service.itf.OrgExternalQryService;
import com.yonyou.iuap.ucf.common.i18n.InternationalUtils;
import com.yonyou.ucf.mdd.common.model.CheckItem;
import com.yonyou.ucf.mdd.common.model.rule.RuleExecuteResult;
import com.yonyou.ucf.mdd.ext.base.user.UserType;
import com.yonyou.ucf.mdd.ext.bill.dto.BillDataDto;
import com.yonyou.ucf.mdd.ext.bill.rule.base.AbstractCommonRule;
import com.yonyou.ucf.mdd.ext.core.AppContext;
import com.yonyou.ucf.mdd.ext.dao.meta.MetaDaoHelper;
import com.yonyou.ucf.mdd.ext.model.BillContext;
import com.yonyou.ucf.mdd.ext.util.OptionUtils;
import com.yonyoucloud.iuap.upc.api.service.IUPCControlRuleService;
import com.yonyoucloud.upc.aa.merchant.EnterpriseNature;
import com.yonyoucloud.upc.aa.merchant.Merchant;
import com.yonyoucloud.upc.service.MerchantCheckService;
import com.yonyoucloud.upc.service.customerapply.CustomerApplyCheckService;
import com.yonyoucloud.upc.utils.MerchantUtils;
import com.yonyoucloud.upc.utils.MultilangUtil;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import org.apache.commons.lang3.StringUtils;
import org.imeta.biz.base.MetaUtils;
import org.imeta.core.model.Property;
import org.imeta.orm.base.BizObject;
import org.imeta.orm.schema.ConditionExpression;
import org.imeta.orm.schema.QueryCondition;
import org.imeta.orm.schema.QueryConditionGroup;
import org.imeta.orm.schema.QuerySchema;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.util.CollectionUtils;

@Component(value="merchantCheckNameRule")
public class MerchantCheckNameRule
extends AbstractCommonRule {
    private static final Logger log = LoggerFactory.getLogger(MerchantCheckNameRule.class);
    @Autowired
    private IUPCControlRuleService upcControlRuleService;
    @Autowired
    OrgExternalQryService orgExternalQryService;
    @Autowired
    private MerchantCheckService merchantCheckService;
    @Autowired
    CustomerApplyCheckService customerApplyCheckService;

    public RuleExecuteResult execute(BillContext billContext, Map<String, Object> paramMap) throws Exception {
        List bills = this.getBills(billContext, paramMap);
        if (null == bills || bills.size() == 0) {
            return new RuleExecuteResult();
        }
        BillDataDto item = (BillDataDto)this.getParam(paramMap);
        BizObject bill = (BizObject)bills.get(0);
        String merchantFullName = "aa.merchant.Merchant";
        if (null != item.getItem()) {
            String name = (String)MultilangUtil.getAttr((String)merchantFullName, (String)"name", (BizObject)bill, null);
            Map maps = (Map)JSON.parse((String)item.getItem());
            maps.put("value", name);
            CheckItem checkItem = (CheckItem)new Gson().fromJson(new Gson().toJson((Object)maps), CheckItem.class);
            if (null == checkItem || checkItem.getKey() == null) {
                return new RuleExecuteResult();
            }
            Property attribute = MetaUtils.findAttribute((String)billContext.getFullname(), (String)checkItem.getKey());
            this.putParam(paramMap, "bills", bills);
            if (StringUtils.isBlank((CharSequence)name)) {
                log.info(InternationalUtils.getMessageWithDefault((String)"UID:P_COREDOC-BE_179F628604080C5E", (String)"\u5ba2\u6237[") + attribute.name() + InternationalUtils.getMessageWithDefault((String)"UID:P_COREDOC-BE_179F628604080C5D", (String)"]\u4e3a\u7a7a."));
                return new RuleExecuteResult();
            }
            Object merchantNameCheckSwitch = OptionUtils.getSystemOption((Object)AppContext.getTenantId(), (String)"merchantNameCheckSwitch");
            if (merchantNameCheckSwitch == null) {
                merchantNameCheckSwitch = "0";
            }
            UserType userType = AppContext.getCurrentUser().getUserType();
            QueryConditionGroup conditionGroup = new QueryConditionGroup();
            Merchant merchant = new Merchant();
            merchant.init((Map)bill);
            Boolean personal = false;
            if (MerchantUtils.isExists((Map)merchant, (String)"enterpriseNature") && EnterpriseNature.personal.getValue() != merchant.getEnterpriseNature().getValue()) {
                if ("1".equals(merchantNameCheckSwitch)) {
                    if (this.upcControlRuleService.checkSingleOrg().booleanValue()) {
                        if (userType == UserType.ShopAdminUser || userType == UserType.ShopUser) {
                            conditionGroup.addCondition((ConditionExpression)QueryCondition.name((String)"createOrg").eq((Object)AppContext.getCurrentUser().getShop().toString()));
                        } else {
                            List<String> subOrgs = this.upcControlRuleService.getSubOrgs("666666");
                            if (CollectionUtils.isEmpty(subOrgs)) {
                                throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_800396);
                            }
                            subOrgs = subOrgs.stream().filter(orgId -> !orgId.equals("666666")).collect(Collectors.toList());
                            log.info(InternationalUtils.getMessageWithDefault((String)"UID:P_COREDOC-BE_179F628604080C59", (String)"\u5ba2\u6237\u6863\u6848\u5355\u7ec4\u7ec7\u6a21\u5f0f\u4e0b\u83b7\u53d6\u7ec4\u7ec7\u6570\u636e:{}"), subOrgs);
                            if (subOrgs.isEmpty() || subOrgs.size() > 1) {
                                throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_800396);
                            }
                            conditionGroup.addCondition((ConditionExpression)QueryCondition.name((String)"createOrg").eq((Object)subOrgs.get(0)));
                        }
                    } else {
                        conditionGroup.addCondition((ConditionExpression)QueryCondition.name((String)"createOrg").eq((Object)merchant.getCreateOrg()));
                    }
                }
            } else if (MerchantUtils.isExists((Map)merchant, (String)"enterpriseNature") && EnterpriseNature.personal.getValue() == merchant.getEnterpriseNature().getValue()) {
                personal = true;
                if (MerchantUtils.isExists((Map)merchant, (String)"creditCode")) {
                    conditionGroup.addCondition((ConditionExpression)QueryCondition.name((String)"creditCode").eq((Object)merchant.getCreditCode()));
                }
            }
            if (merchant.getId() != null) {
                conditionGroup.addCondition((ConditionExpression)QueryCondition.name((String)"id").not_eq(merchant.getId()));
            }
            conditionGroup.addCondition((ConditionExpression)QueryCondition.name((String)checkItem.getKey()).eq((Object)MerchantUtils.replaceStr((String)checkItem.getValue())));
            QuerySchema queryCheckSchema = QuerySchema.create().addSelect("id,orgId,code").addCondition((ConditionExpression)conditionGroup);
            Map resultCheckMerchant = MetaDaoHelper.queryOne((String)merchantFullName, (QuerySchema)queryCheckSchema);
            if (resultCheckMerchant != null && resultCheckMerchant.get("id") != null && !"".equals(resultCheckMerchant.get("id").toString())) {
                if (personal.booleanValue()) {
                    String creditCode;
                    if (resultCheckMerchant.get("orgId") != null && this.orgExternalQryService.judgeExternalOrg((String)AppContext.getYTenantId(), resultCheckMerchant.get("orgId").toString()).booleanValue()) {
                        paramMap.put("return", "merchant_distribute");
                        return new RuleExecuteResult(paramMap);
                    }
                    if (!MerchantUtils.isExists((Map)merchant, (String)"creditCode")) {
                        paramMap.put("return", "merchant_personal");
                        return new RuleExecuteResult(paramMap);
                    }
                    try {
                        creditCode = merchant.getCreditCode().substring(0, 3) + "*******";
                    }
                    catch (Exception e) {
                        creditCode = merchant.getCreditCode();
                    }
                    if (this.merchantCheckService.checkMerchantFromCrm(Long.valueOf(resultCheckMerchant.get("id").toString()))) {
                        throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_800397, new Object[]{checkItem.getValue(), creditCode});
                    }
                    throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_800398, new Object[]{checkItem.getValue(), creditCode});
                }
                if ("0".equals(merchantNameCheckSwitch)) {
                    if (resultCheckMerchant.get("orgId") != null && this.orgExternalQryService.judgeExternalOrg((String)AppContext.getYTenantId(), resultCheckMerchant.get("orgId").toString()).booleanValue()) {
                        paramMap.put("return", "merchant_distribute");
                        return new RuleExecuteResult(paramMap);
                    }
                    if (this.merchantCheckService.checkMerchantFromCrm(Long.valueOf(resultCheckMerchant.get("id").toString()))) {
                        throw new CoreDocBusinessException(CoreDocBusinessErrorEnum.MERCHANT_NAME_CRM, new Object[]{checkItem.getValue(), resultCheckMerchant.get("code")});
                    }
                    throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_800400, new Object[]{checkItem.getValue()});
                }
                if ("1".equals(merchantNameCheckSwitch)) {
                    if (this.merchantCheckService.checkMerchantFromCrm(Long.valueOf(resultCheckMerchant.get("id").toString()))) {
                        throw new CoreDocBusinessException(CoreDocBusinessErrorEnum.MERCHANT_NAME_CRM_CREATE_ORG, new Object[]{bill.get("createOrg_name"), checkItem.getValue(), resultCheckMerchant.get("code")});
                    }
                    throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_800402, new Object[]{bill.get("createOrg_name"), checkItem.getValue()});
                }
            } else if ("1".equals(merchantNameCheckSwitch)) {
                QuerySchema querySchema = QuerySchema.create();
                querySchema.addSelect("id,createOrg");
                querySchema.addCondition((ConditionExpression)QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)checkItem.getKey()).eq((Object)checkItem.getValue()), QueryCondition.name((String)"id").not_eq(merchant.getId())}));
                List originMerchantList = MetaDaoHelper.queryObject((String)merchantFullName, (QuerySchema)querySchema, null);
                if (!CollectionUtils.isEmpty((Collection)originMerchantList)) {
                    int externalOrgNum = 0;
                    for (Merchant originMerchant : originMerchantList) {
                        if (originMerchant.getCreateOrg() == null || !this.orgExternalQryService.judgeExternalOrg((String)AppContext.getYTenantId(), originMerchant.getCreateOrg()).booleanValue()) continue;
                        ++externalOrgNum;
                    }
                    if (externalOrgNum == 1) {
                        paramMap.put("return", "merchant_distribute");
                        return new RuleExecuteResult(paramMap);
                    }
                    if (externalOrgNum > 1) {
                        throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_800403, new Object[]{checkItem.getValue()});
                    }
                }
            }
            if (!personal.booleanValue()) {
                Long customerApplyId = 0L;
                if (bill.get("customerApplyFromId") != null) {
                    customerApplyId = Long.parseLong(bill.get("customerApplyFromId").toString());
                }
                if (merchant.getId() != null) {
                    this.merchantCheckService.checkMerchantNameForCustomerApply(checkItem.getValue(), merchant.getCreateOrg(), (Long)merchant.getId(), customerApplyId, merchantNameCheckSwitch, merchant.getEnterpriseNature());
                } else {
                    this.merchantCheckService.checkMerchantNameForCustomerApply(checkItem.getValue(), merchant.getCreateOrg(), 0L, customerApplyId, merchantNameCheckSwitch, merchant.getEnterpriseNature());
                }
            }
        }
        return new RuleExecuteResult(paramMap);
    }
}


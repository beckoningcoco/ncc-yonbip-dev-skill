/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.yonyou.iuap.apdoc.coredoc.constant.ApplicationCodeConstant
 *  com.yonyou.iuap.apdoc.coredoc.dao.merchant.MerchantQryDao
 *  com.yonyou.iuap.apdoc.coredoc.enums.CoreExtrateBusinessErrorEnum
 *  com.yonyou.iuap.apdoc.coredoc.enums.LanguagesEnum
 *  com.yonyou.iuap.apdoc.coredoc.exceptions.CoreDocBusinessException
 *  com.yonyou.iuap.apdoc.coredoc.option.service.PubOptionService
 *  com.yonyou.iuap.context.InvocationInfoProxy
 *  com.yonyou.iuap.ucf.common.i18n.InternationalUtils
 *  com.yonyou.iuap.ucf.common.ml.MultiLangContext
 *  com.yonyou.permission.util.AuthSdkFacadeUtils
 *  com.yonyou.ucf.mdd.common.model.rule.RuleExecuteResult
 *  com.yonyou.ucf.mdd.ext.bill.dto.BillDataDto
 *  com.yonyou.ucf.mdd.ext.bill.rule.base.AbstractCommonRule
 *  com.yonyou.ucf.mdd.ext.core.AppContext
 *  com.yonyou.ucf.mdd.ext.dao.meta.MetaDaoHelper
 *  com.yonyou.ucf.mdd.ext.model.BillContext
 *  com.yonyou.ucf.mdd.ext.model.LoginUser
 *  com.yonyou.ucf.transtype.model.BdTransType
 *  com.yonyoucloud.upc.aa.merchant.CustomerArea
 *  com.yonyoucloud.upc.aa.merchant.Merchant
 *  com.yonyoucloud.upc.aa.merchant.MerchantApplyRange
 *  com.yonyoucloud.uretail.sys.auth.DataPermissionRequestDto
 *  com.yonyoucloud.uretail.sys.auth.DataPermissionResponseDto
 *  org.apache.commons.lang3.ObjectUtils
 *  org.imeta.biz.base.Objectlizer
 *  org.imeta.core.lang.StringUtils
 *  org.imeta.orm.base.BizObject
 *  org.imeta.orm.base.EntityStatus
 *  org.imeta.orm.base.Json
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

import com.yonyou.iuap.apdoc.coredoc.constant.ApplicationCodeConstant;
import com.yonyou.iuap.apdoc.coredoc.dao.merchant.MerchantQryDao;
import com.yonyou.iuap.apdoc.coredoc.enums.CoreExtrateBusinessErrorEnum;
import com.yonyou.iuap.apdoc.coredoc.enums.LanguagesEnum;
import com.yonyou.iuap.apdoc.coredoc.exceptions.CoreDocBusinessException;
import com.yonyou.iuap.apdoc.coredoc.option.service.PubOptionService;
import com.yonyou.iuap.context.InvocationInfoProxy;
import com.yonyou.iuap.ucf.common.i18n.InternationalUtils;
import com.yonyou.iuap.ucf.common.ml.MultiLangContext;
import com.yonyou.permission.util.AuthSdkFacadeUtils;
import com.yonyou.ucf.mdd.common.model.rule.RuleExecuteResult;
import com.yonyou.ucf.mdd.ext.bill.dto.BillDataDto;
import com.yonyou.ucf.mdd.ext.bill.rule.base.AbstractCommonRule;
import com.yonyou.ucf.mdd.ext.core.AppContext;
import com.yonyou.ucf.mdd.ext.dao.meta.MetaDaoHelper;
import com.yonyou.ucf.mdd.ext.model.BillContext;
import com.yonyou.ucf.mdd.ext.model.LoginUser;
import com.yonyou.ucf.transtype.model.BdTransType;
import com.yonyoucloud.iuap.upc.api.service.IUPCBillService;
import com.yonyoucloud.iuap.upc.api.service.IUPCControlRuleService;
import com.yonyoucloud.iuap.upc.api.service.IUPCProductQueryService;
import com.yonyoucloud.upc.aa.merchant.CustomerArea;
import com.yonyoucloud.upc.aa.merchant.Merchant;
import com.yonyoucloud.upc.aa.merchant.MerchantApplyRange;
import com.yonyoucloud.upc.service.MerchantService;
import com.yonyoucloud.upc.service.utils.DomainCommonUtils;
import com.yonyoucloud.uretail.sys.auth.DataPermissionRequestDto;
import com.yonyoucloud.uretail.sys.auth.DataPermissionResponseDto;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.apache.commons.lang3.ObjectUtils;
import org.imeta.biz.base.Objectlizer;
import org.imeta.core.lang.StringUtils;
import org.imeta.orm.base.BizObject;
import org.imeta.orm.base.EntityStatus;
import org.imeta.orm.base.Json;
import org.imeta.orm.schema.ConditionExpression;
import org.imeta.orm.schema.QueryCondition;
import org.imeta.orm.schema.QueryConditionGroup;
import org.imeta.orm.schema.QuerySchema;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.util.CollectionUtils;

@Component(value="merchantDataInitRule")
public class MerchantDataInitRule
extends AbstractCommonRule {
    private static final Logger log = LoggerFactory.getLogger(MerchantDataInitRule.class);
    @Autowired
    private IUPCBillService billService;
    @Autowired
    private MerchantQryDao merchantQuery;
    @Autowired
    private IUPCProductQueryService upcProductQueryService;
    @Autowired
    private IUPCControlRuleService iupcControlRuleService;
    @Autowired
    private IUPCControlRuleService upcControlRuleService;
    @Autowired
    private MerchantService merchantService;
    @Autowired
    private PubOptionService pubOptionService;

    public RuleExecuteResult execute(BillContext billContext, Map<String, Object> paramMap) throws Exception {
        BillDataDto billDataDto = (BillDataDto)this.getParam(paramMap);
        if (null == billContext || billDataDto == null) {
            return new RuleExecuteResult();
        }
        if ("add".equals(billContext.getAction()) && billDataDto.getId() != null) {
            List data = (List)billDataDto.getData();
            data.clear();
            paramMap = new HashMap<String, Object>();
            paramMap.put("params", billDataDto);
            data.add(this.copyTemplate(billDataDto));
            return new RuleExecuteResult((Object)Json.encode2((BizObject)((BizObject)data.get(0))).toString());
        }
        List bills = this.getBills(billContext, paramMap);
        Merchant merchant = new Merchant();
        merchant.init((Map)bills.get(0));
        if (!this.iupcControlRuleService.checkProductLine().booleanValue()) {
            switch (AppContext.getCurrentUser().getUserType()) {
                case TenantAdmin: 
                case TenantEmployee: {
                    this.setMerchantOrgs(merchant);
                    break;
                }
            }
            LoginUser currentUser = AppContext.getCurrentUser();
            String orgId = currentUser.getOrgId();
            if (orgId != null) {
                merchant.setCreateOrg(orgId);
            } else if (currentUser.getShop() != null) {
                merchant.setCreateMerchant(currentUser.getShop());
            }
        }
        List<BdTransType> bdTransTypeList = this.merchantService.getBillTransTypeIdIsDefault();
        if (!CollectionUtils.isEmpty(bdTransTypeList)) {
            this.checkTransType(bdTransTypeList.get(0));
            String locale = InvocationInfoProxy.getLocale();
            String transTypeName = this.getTranstypeName(bdTransTypeList.get(0), locale);
            if (StringUtils.isEmpty((String)transTypeName)) {
                String defaultLocale = MultiLangContext.getInstance().getDefaultLocaleCode();
                transTypeName = this.getTranstypeName(bdTransTypeList.get(0), defaultLocale);
            }
            if (StringUtils.isEmpty((String)transTypeName)) {
                transTypeName = bdTransTypeList.get(0).getName();
            }
            merchant.setTransType(bdTransTypeList.get(0).getId());
            ((BizObject)bills.get(0)).set("transType", (Object)bdTransTypeList.get(0).getId());
            merchant.set("transType_Name", (Object)transTypeName);
            ((BizObject)bills.get(0)).set("transType_Name", (Object)transTypeName);
        }
        Map parameters = billDataDto.getParameters();
        String fromServiceCodeCrm = null;
        if (parameters != null && parameters.containsKey("fromServiceCodeCrm")) {
            fromServiceCodeCrm = (String)parameters.get("fromServiceCodeCrm");
        }
        this.dealOrgPermission(merchant, bills, fromServiceCodeCrm);
        this.setCustomerClass(billDataDto, merchant, bills);
        this.putParam(paramMap, merchant);
        return new RuleExecuteResult((Object)Json.encode2((BizObject)merchant).toString());
    }

    private String getTranstypeName(BdTransType bdTransType, String local) {
        String transTypeName = null;
        if (LanguagesEnum.zh_CN.getName().equals(local)) {
            transTypeName = bdTransType.getName();
        } else if (LanguagesEnum.en_US.getName().equals(local)) {
            transTypeName = bdTransType.getName2();
        } else if (LanguagesEnum.zh_TW.getName().equals(local)) {
            transTypeName = bdTransType.getName3();
        }
        return transTypeName;
    }

    private void dealOrgPermission(Merchant merchant, List<BizObject> bills, String fromServiceCodeCrm) throws Exception {
        Boolean singleOrg = this.upcControlRuleService.checkSingleOrg();
        if (singleOrg.booleanValue()) {
            return;
        }
        String orgId = merchant.getCreateOrg();
        if (null != orgId && !this.pubOptionService.getOrgGlobalShare("aa.merchant.Merchant").booleanValue()) {
            List<String> userOrgAndVoucherManageOrgs = null;
            userOrgAndVoucherManageOrgs = StringUtils.isNotEmpty((String)fromServiceCodeCrm) ? this.upcControlRuleService.getUserOrgAndVoucherManageOrgByAuthIdForCRM(fromServiceCodeCrm) : this.upcControlRuleService.getManageOrgList("aa.merchant.Merchant", "aa_merchant");
            if (!CollectionUtils.isEmpty(userOrgAndVoucherManageOrgs)) {
                for (String orgManage : userOrgAndVoucherManageOrgs) {
                    if (!orgId.equals(orgManage)) continue;
                    return;
                }
            }
            bills.get(0).set("createOrg", null);
            merchant.setCreateOrg(null);
            merchant.setMerchantApplyRanges(null);
        }
    }

    private void setMerchantOrgs(Merchant merchant) throws Exception {
        if (!DomainCommonUtils.isU8C().booleanValue() && AppContext.getCurrentUser().getOrgId() == null) {
            throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_800379, (Object[])AppContext.getCurrentUser().getId());
        }
        ArrayList<MerchantApplyRange> merchantList = new ArrayList<MerchantApplyRange>();
        if (!DomainCommonUtils.isU8C().booleanValue()) {
            List<Map> orgs = this.upcProductQueryService.GetPrivilegedAndNextOrgs();
            for (int i = 0; i < orgs.size(); ++i) {
                MerchantApplyRange merchantOrg = new MerchantApplyRange();
                merchantOrg.setEntityStatus(EntityStatus.Insert);
                merchantOrg.setRangeType(Integer.valueOf(1));
                merchantOrg.setOrgId(orgs.get(i).get("id").toString());
                merchantOrg.set("orgCode", orgs.get(i).get("code"));
                merchantOrg.set("orgName", orgs.get(i).get("name"));
                if (orgs.get(i).get("id").toString().equals(AppContext.getCurrentUser().getOrgId())) {
                    merchantOrg.setIsCreator(Boolean.valueOf(true));
                } else {
                    merchantOrg.setIsCreator(Boolean.valueOf(false));
                }
                merchantList.add(merchantOrg);
            }
        }
        merchant.setMerchantApplyRanges(merchantList);
    }

    private void setCurrentShop(Merchant merchant) throws Exception {
        if (AppContext.getCurrentUser().getShop() == null) {
            throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_800078, (Object[])AppContext.getCurrentUser().getId());
        }
        MerchantApplyRange shop = new MerchantApplyRange();
        shop.setEntityStatus(EntityStatus.Insert);
        shop.setRangeType(Integer.valueOf(3));
        shop.setIsCreator(Boolean.valueOf(true));
        shop.setIsApplied(Boolean.valueOf(true));
        ArrayList<MerchantApplyRange> shops = new ArrayList<MerchantApplyRange>();
        shops.add(shop);
        merchant.setMerchantApplyRanges(shops);
    }

    private Merchant copyTemplate(BillDataDto billDataDto) throws Exception {
        BillDataDto bill = new BillDataDto("aa_merchant", billDataDto.getId());
        HashMap<String, String> params = new HashMap<String, String>();
        params.put("@merchantApplyRangeId", billDataDto.getMapCondition().get("@merchantApplyRangeId").toString());
        bill.setMapCondition(params);
        Map map = this.billService.detail(bill);
        Merchant merchant = (Merchant)Objectlizer.convert((Map)map, (String)"aa.merchant.Merchant");
        merchant.setId(null);
        merchant.setName(merchant.getName() + InternationalUtils.getMessageWithDefault((String)"UID:P_COREDOC-BE_179F628604080122", (String)"-\u526f\u672c"));
        merchant.setCode(merchant.getCode() + InternationalUtils.getMessageWithDefault((String)"UID:P_COREDOC-BE_179F628604080122", (String)"-\u526f\u672c"));
        merchant.setPubts(null);
        merchant.setEntityStatus(EntityStatus.Insert);
        if (merchant.merchantAddressInfos() != null) {
            merchant.merchantAddressInfos().stream().forEach(item -> {
                item.setId(null);
                item.setPubts(null);
                item.setEntityStatus(EntityStatus.Insert);
            });
        }
        if (merchant.merchantContacterInfos() != null) {
            merchant.merchantContacterInfos().stream().forEach(item -> {
                item.setId(null);
                item.setPubts(null);
                item.setEntityStatus(EntityStatus.Insert);
            });
        }
        if (merchant.merchantAgentFinancialInfos() != null) {
            merchant.merchantAgentFinancialInfos().stream().forEach(item -> {
                item.setId(null);
                item.setPubts(null);
                item.setEntityStatus(EntityStatus.Insert);
            });
        }
        if (merchant.merchantAgentInvoiceInfos() != null) {
            merchant.merchantAgentInvoiceInfos().stream().forEach(item -> {
                item.setId(null);
                item.setPubts(null);
                item.setEntityStatus(EntityStatus.Insert);
            });
        }
        if (merchant.merchantAttachments() != null) {
            merchant.merchantAttachments().stream().forEach(item -> {
                item.setId(null);
                item.setPubts(null);
                item.setEntityStatus(EntityStatus.Insert);
            });
        }
        if (merchant.merchantCorpImages() != null) {
            merchant.merchantCorpImages().stream().forEach(item -> {
                item.setId(null);
                item.setPubts(null);
                item.setEntityStatus(EntityStatus.Insert);
            });
        }
        if (merchant.merchantApplyRanges() != null) {
            merchant.merchantApplyRanges().stream().forEach(item -> {
                item.setId(null);
                item.setPubts(null);
                item.setEntityStatus(EntityStatus.Insert);
            });
        }
        if (merchant.merchantAppliedDetail() != null) {
            merchant.merchantAppliedDetail().stream().forEach(item -> {
                item.setId(null);
                item.setPubts(null);
                item.setCreator(null);
                item.setCreateDate(null);
                item.setCreateTime(null);
                item.setModifier(null);
                item.setModifyDate(null);
                item.setModifyTime(null);
                item.setPubts(null);
                item.setEntityStatus(EntityStatus.Insert);
            });
        }
        return merchant;
    }

    private void checkTransType(BdTransType transType) throws Exception {
        List ids;
        Map result;
        DataPermissionRequestDto requestDto = new DataPermissionRequestDto();
        requestDto.setEntityUri("aa.merchant.Merchant");
        requestDto.setSysCode(ApplicationCodeConstant.getApplicationCodeByFullName((String)"aa.merchant.Merchant"));
        String[] fieldArgs = new String[]{"transType"};
        requestDto.setFieldNameArgs(fieldArgs);
        requestDto.setYxyUserId(AppContext.getUserId().toString());
        requestDto.setYxyTenantId(AppContext.getTenantId().toString());
        requestDto.setHaveDetail(true);
        DataPermissionResponseDto res = AuthSdkFacadeUtils.getUserDataPermission((DataPermissionRequestDto)requestDto);
        if (!(res == null || CollectionUtils.isEmpty((Collection)res.getDataPermissionMapList()) || CollectionUtils.isEmpty((Map)(result = (Map)res.getDataPermissionMapList().get(0))) || result.get("values") == null || CollectionUtils.isEmpty((Collection)(ids = (List)result.get("values"))) || ids.contains(transType.getId()))) {
            throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_800380);
        }
    }

    private void setCustomerClass(BillDataDto billDataDto, Merchant merchant, List<BizObject> bills) throws Exception {
        Map partParam;
        Map parameters = billDataDto.getParameters();
        String orgId = (String)parameters.get("orgId");
        if (StringUtils.isNotEmpty((String)orgId)) {
            merchant.setCreateOrg(orgId);
        }
        if ((partParam = billDataDto.getPartParam()) != null && !partParam.isEmpty() && merchant.getCreateOrg() != null) {
            Object customerIndustry;
            Object customerArea;
            Object customerLevel;
            Object customerClass = partParam.get("customerClass");
            if (ObjectUtils.isNotEmpty(customerClass)) {
                Long customerClassId = Long.parseLong(customerClass.toString());
                QuerySchema querySchema = QuerySchema.create().addSelect("code, name").addCondition((ConditionExpression)QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"isEnd").eq((Object)true), QueryCondition.name((String)"isEnabled").eq((Object)true), QueryCondition.name((String)"id").eq((Object)customerClassId), QueryCondition.name((String)"custCategoryApplyRanges.orgId").eq((Object)merchant.getCreateOrg())}));
                List dataList = MetaDaoHelper.query((String)"aa.custcategory.CustCategory", (QuerySchema)querySchema);
                if (!CollectionUtils.isEmpty((Collection)dataList)) {
                    bills.get(0).set("customerClass", (Object)customerClassId);
                    bills.get(0).set("customerClass_Name", ((Map)dataList.get(0)).get("name"));
                    bills.get(0).set("customerClass_code", ((Map)dataList.get(0)).get("code"));
                }
            }
            if (ObjectUtils.isNotEmpty(customerLevel = partParam.get("merchantAppliedDetail.customerLevel"))) {
                Long customerLevelId = Long.parseLong(customerLevel.toString());
                QuerySchema querySchema = QuerySchema.create().addSelect("code, name").addCondition((ConditionExpression)QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"isEnabled").eq((Object)true), QueryCondition.name((String)"id").eq((Object)customerLevelId)}));
                List dataList = MetaDaoHelper.query((String)"aa.agentlevel.AgentLevel", (QuerySchema)querySchema);
                if (!CollectionUtils.isEmpty((Collection)dataList)) {
                    bills.get(0).set("merchantAppliedDetail!customerLevel", (Object)customerLevelId);
                    bills.get(0).set("merchantAppliedDetail!customerLevel_Name", ((Map)dataList.get(0)).get("name"));
                    bills.get(0).set("merchantAppliedDetail!customerLevel_code", ((Map)dataList.get(0)).get("code"));
                }
            }
            if (ObjectUtils.isNotEmpty(customerArea = partParam.get("customerArea"))) {
                Long customerAreaId = Long.parseLong(customerArea.toString());
                QuerySchema querySchema = QuerySchema.create().addSelect("code, name").addCondition((ConditionExpression)QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"isEnd").eq((Object)true), QueryCondition.name((String)"stopstatus").eq((Object)false), QueryCondition.name((String)"saleAreaApplyRange.orgId").eq((Object)merchant.getCreateOrg()), QueryCondition.name((String)"id").eq((Object)customerAreaId)}));
                List dataList = MetaDaoHelper.query((String)"aa.salearea.SaleArea", (QuerySchema)querySchema);
                if (!CollectionUtils.isEmpty((Collection)dataList)) {
                    CustomerArea customerAreaNew = new CustomerArea();
                    customerAreaNew.setSaleAreaId(customerAreaId);
                    customerAreaNew.set("saleAreaId_code", ((Map)dataList.get(0)).get("name"));
                    customerAreaNew.set("saleAreaId_name", ((Map)dataList.get(0)).get("code"));
                    customerAreaNew.setIsDefault(Boolean.valueOf(true));
                    ArrayList<CustomerArea> customerAreaList = new ArrayList<CustomerArea>();
                    customerAreaList.add(customerAreaNew);
                    bills.get(0).set("customerAreas", customerAreaList);
                }
            }
            if (ObjectUtils.isNotEmpty(customerIndustry = partParam.get("customerIndustry"))) {
                Long customerIndustryId = Long.parseLong(customerIndustry.toString());
                QuerySchema querySchema = QuerySchema.create().addSelect("code, name").addCondition((ConditionExpression)QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"isEnd").eq((Object)true), QueryCondition.name((String)"stopstatus").eq((Object)false), QueryCondition.name((String)"id").eq((Object)customerIndustryId)}));
                List dataList = MetaDaoHelper.query((String)"aa.customertrade.CustomerTrade", (QuerySchema)querySchema);
                if (!CollectionUtils.isEmpty((Collection)dataList)) {
                    bills.get(0).set("customerIndustry", (Object)customerIndustryId);
                    bills.get(0).set("customerIndustry_code", ((Map)dataList.get(0)).get("code"));
                    bills.get(0).set("customerIndustry_Name", ((Map)dataList.get(0)).get("name"));
                }
            }
        }
    }
}


/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.alibaba.fastjson.JSON
 *  com.yonyou.diwork.service.auth.IServiceIsolateService
 *  com.yonyou.iuap.apdoc.coredoc.enums.CoreExtrateBusinessErrorEnum
 *  com.yonyou.iuap.apdoc.coredoc.exceptions.CoreDocBusinessException
 *  com.yonyou.iuap.apdoc.coredoc.option.service.PubOptionService
 *  com.yonyou.iuap.org.enums.FuncTypeEnum
 *  com.yonyou.iuap.ucf.common.i18n.InternationalUtils
 *  com.yonyou.ucf.mdd.common.model.ref.RefEntity
 *  com.yonyou.ucf.mdd.common.model.rule.RuleExecuteResult
 *  com.yonyou.ucf.mdd.common.model.uimeta.filter.vo.FilterVO
 *  com.yonyou.ucf.mdd.common.model.uimeta.filter.vo.SimpleFilterVO
 *  com.yonyou.ucf.mdd.ext.bill.dto.BillDataDto
 *  com.yonyou.ucf.mdd.ext.bill.rule.base.AbstractCommonRule
 *  com.yonyou.ucf.mdd.ext.core.AppContext
 *  com.yonyou.ucf.mdd.ext.model.BillContext
 *  com.yonyou.ucf.mdd.ext.model.LoginUser
 *  com.yonyoucloud.upc.aa.merchant.Merchant
 *  com.yonyoucloud.upc.utils.MerchantUtils
 *  com.yonyoucloud.upc.utils.MultilangUtil
 *  org.imeta.core.base.ConditionOperator
 *  org.imeta.orm.base.BizObject
 *  org.springframework.beans.factory.annotation.Autowired
 *  org.springframework.stereotype.Component
 *  org.springframework.util.CollectionUtils
 */
package com.yonyoucloud.upc.billrule.merchant;

import com.alibaba.fastjson.JSON;
import com.yonyou.diwork.service.auth.IServiceIsolateService;
import com.yonyou.iuap.apdoc.coredoc.enums.CoreExtrateBusinessErrorEnum;
import com.yonyou.iuap.apdoc.coredoc.exceptions.CoreDocBusinessException;
import com.yonyou.iuap.apdoc.coredoc.option.service.PubOptionService;
import com.yonyou.iuap.org.enums.FuncTypeEnum;
import com.yonyou.iuap.ucf.common.i18n.InternationalUtils;
import com.yonyou.ucf.mdd.common.model.ref.RefEntity;
import com.yonyou.ucf.mdd.common.model.rule.RuleExecuteResult;
import com.yonyou.ucf.mdd.common.model.uimeta.filter.vo.FilterVO;
import com.yonyou.ucf.mdd.common.model.uimeta.filter.vo.SimpleFilterVO;
import com.yonyou.ucf.mdd.ext.bill.dto.BillDataDto;
import com.yonyou.ucf.mdd.ext.bill.rule.base.AbstractCommonRule;
import com.yonyou.ucf.mdd.ext.core.AppContext;
import com.yonyou.ucf.mdd.ext.model.BillContext;
import com.yonyou.ucf.mdd.ext.model.LoginUser;
import com.yonyoucloud.upc.aa.merchant.Merchant;
import com.yonyoucloud.upc.utils.MerchantUtils;
import com.yonyoucloud.upc.utils.MultilangUtil;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.imeta.core.base.ConditionOperator;
import org.imeta.orm.base.BizObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.util.CollectionUtils;

@Component(value="merchantRefFilter")
public class MerchantRefFilter
extends AbstractCommonRule {
    @Autowired
    private IServiceIsolateService serviceIsolateService;
    @Autowired
    private PubOptionService pubOptionService;

    public RuleExecuteResult execute(BillContext billContext, Map<String, Object> map) throws Exception {
        Merchant merchant;
        BillDataDto billDataDto = (BillDataDto)this.getParam(map);
        if (null == billContext || billDataDto == null) {
            return new RuleExecuteResult();
        }
        List bills = this.getBills(billContext, map);
        LoginUser user = AppContext.getCurrentUser();
        if (null == user) {
            throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_800108);
        }
        RefEntity refEntity = billDataDto.getRefEntity();
        FilterVO merchantGridFilter = billDataDto.getCondition();
        FilterVO merchantTreeFilter = billDataDto.getTreeCondition();
        if (merchantTreeFilter == null) {
            merchantTreeFilter = new FilterVO();
        }
        if (merchantGridFilter == null) {
            merchantGridFilter = new FilterVO();
        }
        if ("bd_staff_ref".equalsIgnoreCase(refEntity.refType) && "professSalesman_Name".equals(billDataDto.getKey())) {
            merchantGridFilter.appendCondition("biz_man_tag", "eq", (Object)true);
            merchantGridFilter.appendCondition("enable", "eq", (Object)1);
            merchantGridFilter.appendCondition("dr", "eq", (Object)0);
        }
        if ("bd_currencytenantref".equalsIgnoreCase(refEntity.refType)) {
            merchantGridFilter.appendCondition("enable", "eq", (Object)1);
            merchantGridFilter.appendCondition("dr", "eq", (Object)0);
        }
        if ("bd_bankcard".equalsIgnoreCase(refEntity.refType)) {
            merchantGridFilter.appendCondition("enable", "eq", (Object)1);
            merchantGridFilter.appendCondition("dr", "eq", (Object)0);
        }
        if ("bd_bankdotref".equalsIgnoreCase(refEntity.refType)) {
            merchantGridFilter.appendCondition("enable", "eq", (Object)1);
            merchantGridFilter.appendCondition("dr", "eq", (Object)0);
        }
        if ("bd_taxrate".equalsIgnoreCase(refEntity.refType)) {
            merchantGridFilter.appendCondition("enable", "eq", (Object)1);
            merchantGridFilter.appendCondition("dr", "eq", (Object)0);
        }
        if ("bd_exchangeratetyperef".equalsIgnoreCase(refEntity.refType)) {
            merchantGridFilter.appendCondition("enable", "eq", (Object)1);
            merchantGridFilter.appendCondition("dr", "eq", (Object)0);
        }
        if ("aa_merchantref".equalsIgnoreCase(refEntity.refType)) {
            if ("aa_merchant".equals(billContext.getBillnum()) || "aa_merchantdetail".equals(billContext.getBillnum())) {
                merchantGridFilter.appendCondition(ConditionOperator.and, new SimpleFilterVO[]{new SimpleFilterVO("merchantAppliedDetail.merchantApplyRangeId.isCreator", "eq", (Object)1)});
            } else if ("aa_customerapply".equals(billContext.getBillnum()) && !this.pubOptionService.getOrgGlobalShare("aa.merchant.Merchant").booleanValue()) {
                List userOrgAndVoucherManageOrg = this.serviceIsolateService.findMainOrgPermission(AppContext.getCurrentUser().getYhtUserId(), "aa_customerapply", AppContext.getCurrentUser().getYhtTenantId());
                merchantGridFilter.appendCondition(ConditionOperator.and, new SimpleFilterVO[]{new SimpleFilterVO("merchantAppliedDetail.merchantApplyRangeId.orgId", "in", (Object)userOrgAndVoucherManageOrg)});
            }
        }
        if ("aa_vendor".equalsIgnoreCase(refEntity.refType)) {
            merchantGridFilter.appendCondition(ConditionOperator.and, new SimpleFilterVO[]{new SimpleFilterVO("vendorApplyRange.isCreator", "eq", (Object)1)});
        }
        if ("aa_channeltyperef".equalsIgnoreCase(refEntity.refType)) {
            merchantGridFilter.appendCondition("stopstatus", "eq", (Object)0);
        }
        if ("aa_receiveagreement".equalsIgnoreCase(refEntity.refType)) {
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
            String format = sdf.format(new Date());
            merchantGridFilter.appendCondition(ConditionOperator.and, new SimpleFilterVO[]{new SimpleFilterVO("enableStartDate", "elt", (Object)format)});
            merchantGridFilter.appendCondition(ConditionOperator.or, new SimpleFilterVO[]{new SimpleFilterVO("enableEndDate", "egt", (Object)format), new SimpleFilterVO("enableEndDate", "is_null", null)});
        }
        if ("pc_addressarchivesref".equalsIgnoreCase(refEntity.refType) && "province_Name".equals(billDataDto.getKey())) {
            merchantTreeFilter.appendCondition("level", "eq", (Object)1);
            billDataDto.setIsDistinct(true);
            billDataDto.setTreeCondition(merchantTreeFilter);
            this.putParam(map, billDataDto);
            return new RuleExecuteResult();
        }
        if ("aa_customerTyperef".equalsIgnoreCase(refEntity.refType)) {
            merchantGridFilter.appendCondition("stopstatus", "eq", (Object)0);
        }
        if ("aa_adminorgrangeref".equalsIgnoreCase(refEntity.refType) && "parentManageOrg_Name".equals(billDataDto.getKey())) {
            merchantGridFilter.appendCondition(ConditionOperator.or, new SimpleFilterVO[]{new SimpleFilterVO("id", "eq", ((BizObject)bills.get(0)).get("createOrg")), new SimpleFilterVO("orgAndFuncs.orgFunc.name", "eq", (Object)InternationalUtils.getMessageWithDefault((String)"UID:P_COREDOC-BE_179F6286040807C2", (String)"\u9500\u552e\u7ec4\u7ec7"))});
        }
        if ("bd_billtyperef".equalsIgnoreCase(refEntity.refType)) {
            List billTypeVO = MerchantUtils.getBillTypeVOId();
            if (!CollectionUtils.isEmpty((Collection)billTypeVO)) {
                merchantGridFilter.appendCondition(ConditionOperator.and, new SimpleFilterVO[]{new SimpleFilterVO("billtype_id", "eq", ((Map)billTypeVO.get(0)).get("id"))});
                merchantGridFilter.appendCondition("enable", "eq", (Object)1);
                merchantGridFilter.appendCondition("dr", "eq", (Object)0);
            } else {
                merchantGridFilter.appendCondition(ConditionOperator.and, new SimpleFilterVO[]{new SimpleFilterVO("billtype_id", "eq", (Object)"0")});
            }
        }
        if ("aa_financeorgref".equalsIgnoreCase(refEntity.refType)) {
            merchantGridFilter.appendCondition(ConditionOperator.and, new SimpleFilterVO[]{new SimpleFilterVO("id", "neq", (Object)"666666")});
        }
        if ("base_shipregionref".equalsIgnoreCase(refEntity.refType)) {
            merchantGridFilter.appendCondition("stopstatus", "eq", (Object)0);
            merchantGridFilter.appendCondition("dr", "eq", (Object)0);
        }
        if ("base_businesspartnerref".equalsIgnoreCase(refEntity.refType) && "aa_merchant".equals(billContext.getBillnum()) && !CollectionUtils.isEmpty((Collection)bills)) {
            merchant = (Merchant)bills.get(0);
            if (merchant.containsKey((Object)"name") || merchant.containsKey((Object)"creditCode")) {
                String merchantName = null;
                if (merchant.get("name") != null) {
                    merchantName = (String)MultilangUtil.getAttr((String)"aa.merchant.Merchant", (String)"name", (BizObject)merchant, null);
                }
                if (merchantName == null) {
                    merchantGridFilter.appendCondition(ConditionOperator.and, new SimpleFilterVO[]{new SimpleFilterVO("creditCode", "eq", (Object)merchant.getCreditCode())});
                } else if (merchant.getCreditCode() == null) {
                    merchantGridFilter.appendCondition(ConditionOperator.and, new SimpleFilterVO[]{new SimpleFilterVO("name", "eq", (Object)merchantName)});
                } else {
                    merchantGridFilter.appendCondition(ConditionOperator.or, new SimpleFilterVO[]{new SimpleFilterVO("name", "eq", (Object)merchantName), new SimpleFilterVO("creditCode", "eq", (Object)merchant.getCreditCode())});
                }
            }
            merchantGridFilter.appendCondition("status", "eq", (Object)1);
        }
        if ("aa_salearearef".equals(refEntity.refType) && ("aa_merchant".equals(billContext.getBillnum()) || "aa_merchantdetail".equals(billContext.getBillnum())) && !CollectionUtils.isEmpty((Collection)bills) && !this.pubOptionService.getOrgGlobalShare("aa.merchant.Merchant").booleanValue()) {
            merchant = (Merchant)bills.get(0);
            if (merchant.containsKey((Object)"belongOrg")) {
                merchantTreeFilter.appendCondition(ConditionOperator.and, new SimpleFilterVO[]{new SimpleFilterVO("saleAreaApplyRange.orgId", "eq", merchant.get("belongOrg"))});
            } else if (merchant.containsKey((Object)"createOrg")) {
                merchantTreeFilter.appendCondition(ConditionOperator.and, new SimpleFilterVO[]{new SimpleFilterVO("saleAreaApplyRange.orgId", "eq", (Object)merchant.getCreateOrg())});
            }
        }
        if ("org_fun_filter_list_ref".equals(refEntity.refType)) {
            if (("aa_merchant".equals(billContext.getBillnum()) || "aa_merchantdetail".equals(billContext.getBillnum())) && "internalOrgId_Name".equals(billDataDto.getKey()) && !MerchantUtils.getIsInternalCustomer()) {
                ArrayList<String> funcCodes = new ArrayList<String>();
                funcCodes.add(FuncTypeEnum.PURCHASE_ORG.getCode());
                funcCodes.add(FuncTypeEnum.FINANCE_ORG.getCode());
                HashMap<String, ArrayList<String>> externalData = new HashMap<String, ArrayList<String>>();
                externalData.put("funcCodes", funcCodes);
                billDataDto.setExternalData(externalData);
            } else if (("aa_merchant".equals(billContext.getBillnum()) || "aa_merchantdetail".equals(billContext.getBillnum())) && "parentManageOrg_Name".equals(billDataDto.getKey())) {
                String businessRole = "1";
                if (!CollectionUtils.isEmpty((Collection)bills)) {
                    Merchant merchant2 = (Merchant)bills.get(0);
                    if (merchant2.get("merchantRole!businessRole") != null) {
                        businessRole = (String)merchant2.get("merchantRole!businessRole");
                    } else if (merchant2.merchantRole() != null && merchant2.merchantRole().getBusinessRole() != null) {
                        businessRole = merchant2.merchantRole().getBusinessRole();
                    }
                }
                if (businessRole.contains("3") || businessRole.contains("4") || businessRole.contains("5")) {
                    ArrayList<String> funcCodes = new ArrayList<String>();
                    funcCodes.add(FuncTypeEnum.SALES_ORG.getCode());
                    HashMap<String, ArrayList<String>> externalData = new HashMap<String, ArrayList<String>>();
                    externalData.put("funcCodes", funcCodes);
                    billDataDto.setExternalData(externalData);
                }
            }
        }
        if ("aa_merchantisolationref".equalsIgnoreCase(refEntity.refType)) {
            merchantGridFilter.appendCondition(ConditionOperator.and, new SimpleFilterVO[]{new SimpleFilterVO("merchantRole.merchantOptions", "eq", (Object)"1")});
            HashMap<String, Integer> extendCondition = new HashMap<String, Integer>();
            extendCondition.put("isShopMerchantIsolationRef", 2);
            billDataDto.setExtendCondition(JSON.toJSONString(extendCondition));
        }
        if ("RefTable_839443ba26".equalsIgnoreCase(refEntity.refType) && ("aa_merchant".equals(billContext.getBillnum()) || "aa_merchantdetail".equals(billContext.getBillnum())) && "merchantAppliedDetail!taxRate_NtaxRate".equals(billDataDto.getKey())) {
            merchantGridFilter.appendCondition(ConditionOperator.and, new SimpleFilterVO[]{new SimpleFilterVO("scope", "in", Arrays.asList(1, 3))});
        }
        billDataDto.setCondition(merchantGridFilter);
        billDataDto.setTreeCondition(merchantTreeFilter);
        this.putParam(map, billDataDto);
        return new RuleExecuteResult();
    }
}


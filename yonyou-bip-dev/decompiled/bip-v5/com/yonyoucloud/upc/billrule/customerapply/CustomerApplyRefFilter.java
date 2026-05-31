/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.yonyou.diwork.service.auth.IServiceIsolateService
 *  com.yonyou.ucf.mdd.common.model.ref.RefEntity
 *  com.yonyou.ucf.mdd.common.model.rule.RuleExecuteResult
 *  com.yonyou.ucf.mdd.common.model.uimeta.filter.vo.FilterVO
 *  com.yonyou.ucf.mdd.common.model.uimeta.filter.vo.SimpleFilterVO
 *  com.yonyou.ucf.mdd.ext.bill.dto.BillDataDto
 *  com.yonyou.ucf.mdd.ext.bill.rule.base.AbstractCommonRule
 *  com.yonyou.ucf.mdd.ext.core.AppContext
 *  com.yonyou.ucf.mdd.ext.model.BillContext
 *  com.yonyoucloud.upc.aa.customerapply.CustomerApply
 *  com.yonyoucloud.upc.aa.merchant.Merchant
 *  com.yonyoucloud.upc.aa.merchant.MerchantApplyRange
 *  com.yonyoucloud.upc.data.merchant.MerchantGroupDao
 *  org.imeta.core.base.ConditionOperator
 *  org.slf4j.Logger
 *  org.slf4j.LoggerFactory
 *  org.springframework.beans.factory.annotation.Autowired
 *  org.springframework.stereotype.Component
 *  org.springframework.util.CollectionUtils
 */
package com.yonyoucloud.upc.billrule.customerapply;

import com.yonyou.diwork.service.auth.IServiceIsolateService;
import com.yonyou.ucf.mdd.common.model.ref.RefEntity;
import com.yonyou.ucf.mdd.common.model.rule.RuleExecuteResult;
import com.yonyou.ucf.mdd.common.model.uimeta.filter.vo.FilterVO;
import com.yonyou.ucf.mdd.common.model.uimeta.filter.vo.SimpleFilterVO;
import com.yonyou.ucf.mdd.ext.bill.dto.BillDataDto;
import com.yonyou.ucf.mdd.ext.bill.rule.base.AbstractCommonRule;
import com.yonyou.ucf.mdd.ext.core.AppContext;
import com.yonyou.ucf.mdd.ext.model.BillContext;
import com.yonyoucloud.iuap.upc.api.service.IUPCControlRuleService;
import com.yonyoucloud.upc.aa.customerapply.CustomerApply;
import com.yonyoucloud.upc.aa.merchant.Merchant;
import com.yonyoucloud.upc.aa.merchant.MerchantApplyRange;
import com.yonyoucloud.upc.data.merchant.MerchantGroupDao;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import org.imeta.core.base.ConditionOperator;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.util.CollectionUtils;

@Component(value="customerApplyRefFilter")
public class CustomerApplyRefFilter
extends AbstractCommonRule {
    private static final Logger log = LoggerFactory.getLogger(CustomerApplyRefFilter.class);
    @Autowired
    private IUPCControlRuleService upcControlRuleService;
    @Autowired
    private MerchantGroupDao merchantGroupDao;
    @Autowired
    private IServiceIsolateService iServiceIsolateService;

    public RuleExecuteResult execute(BillContext billContext, Map<String, Object> map) throws Exception {
        BillDataDto billDataDto = (BillDataDto)this.getParam(map);
        if (null == billContext || billDataDto == null) {
            return new RuleExecuteResult();
        }
        List bills = this.getBills(billContext, map);
        CustomerApply customerApply = new CustomerApply();
        if (!CollectionUtils.isEmpty((Collection)bills)) {
            customerApply.init((Map)bills.get(0));
        }
        RefEntity refEntity = billDataDto.getRefEntity();
        FilterVO customerApplyGridFilter = billDataDto.getCondition();
        FilterVO customerApplyTreeFilter = billDataDto.getTreeCondition();
        if (customerApplyTreeFilter == null) {
            customerApplyTreeFilter = new FilterVO();
        }
        if (customerApplyGridFilter == null) {
            customerApplyGridFilter = new FilterVO();
        }
        if ("org_pure_table_ref".equals(refEntity.getCode())) {
            Merchant originalMerchant;
            if ("aa_customerapply".equals(billContext.getBillnum()) && "orgId_name".equals(billDataDto.getKey()) && customerApply.getApplyCustomer() != null && !CollectionUtils.isEmpty((Map)(originalMerchant = this.merchantGroupDao.getMerchantById(customerApply.getApplyCustomer())))) {
                List<String> shareAll;
                List authOrgIdList = this.iServiceIsolateService.findMainOrgPermission(AppContext.getCurrentUser().getYhtUserId(), "aa_customerapply", AppContext.getCurrentUser().getYhtTenantId());
                HashSet<String> orgIdSet = new HashSet<String>();
                List originalMerchantApplyRangeList = this.merchantGroupDao.getMerchantApplyRangeByMerchantId(AppContext.getCurrentUser().getYTenantId(), customerApply.getApplyCustomer());
                if (!CollectionUtils.isEmpty((Collection)originalMerchantApplyRangeList)) {
                    for (MerchantApplyRange merchantApplyRange : originalMerchantApplyRangeList) {
                        orgIdSet.add(merchantApplyRange.getOrgId());
                    }
                }
                if (!CollectionUtils.isEmpty(shareAll = this.upcControlRuleService.getOrgRangeShareAllWithoutAutoShare("aa.merchant.Merchant", originalMerchant.getCreateOrg())) || !CollectionUtils.isEmpty(orgIdSet)) {
                    orgIdSet.addAll(shareAll);
                    if (!CollectionUtils.isEmpty(orgIdSet)) {
                        orgIdSet.retainAll(authOrgIdList);
                    }
                    if (!CollectionUtils.isEmpty(orgIdSet)) {
                        customerApplyGridFilter.appendCondition(ConditionOperator.and, new SimpleFilterVO[]{new SimpleFilterVO("id", "in", orgIdSet)});
                    } else {
                        customerApplyGridFilter.appendCondition(ConditionOperator.and, new SimpleFilterVO[]{new SimpleFilterVO("1", "eq", (Object)"2")});
                    }
                } else {
                    customerApplyGridFilter.appendCondition(ConditionOperator.and, new SimpleFilterVO[]{new SimpleFilterVO("1", "eq", (Object)"2")});
                }
            }
        } else if ("org_pure_tree_ref".equals(refEntity.getCode()) && "aa_customerapply".equals(billContext.getBillnum())) {
            HashMap<String, String> externalData = new HashMap<String, String>();
            externalData.put("ShowGlobal", "true");
            billDataDto.setExternalData(externalData);
        }
        billDataDto.setCondition(customerApplyGridFilter);
        billDataDto.setTreeCondition(customerApplyTreeFilter);
        this.putParam(map, billDataDto);
        return new RuleExecuteResult();
    }
}


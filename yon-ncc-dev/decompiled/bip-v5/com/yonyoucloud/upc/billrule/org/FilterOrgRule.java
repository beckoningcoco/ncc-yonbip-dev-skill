/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.yonyou.iuap.apdoc.coredoc.enums.CoreExtrateBusinessErrorEnum
 *  com.yonyou.iuap.apdoc.coredoc.exceptions.CoreDocBusinessException
 *  com.yonyou.ucf.mdd.common.model.rule.RuleExecuteResult
 *  com.yonyou.ucf.mdd.common.model.uimeta.filter.vo.FilterVO
 *  com.yonyou.ucf.mdd.common.model.uimeta.filter.vo.SimpleFilterVO
 *  com.yonyou.ucf.mdd.ext.bill.dto.BillDataDto
 *  com.yonyou.ucf.mdd.ext.bill.rule.base.AbstractCommonRule
 *  com.yonyou.ucf.mdd.ext.core.AppContext
 *  com.yonyou.ucf.mdd.ext.model.BillContext
 *  com.yonyou.ucf.mdd.ext.model.LoginUser
 *  org.imeta.core.base.ConditionOperator
 *  org.springframework.beans.factory.annotation.Autowired
 *  org.springframework.stereotype.Component
 *  org.springframework.util.CollectionUtils
 */
package com.yonyoucloud.upc.billrule.org;

import com.yonyou.iuap.apdoc.coredoc.enums.CoreExtrateBusinessErrorEnum;
import com.yonyou.iuap.apdoc.coredoc.exceptions.CoreDocBusinessException;
import com.yonyou.ucf.mdd.common.model.rule.RuleExecuteResult;
import com.yonyou.ucf.mdd.common.model.uimeta.filter.vo.FilterVO;
import com.yonyou.ucf.mdd.common.model.uimeta.filter.vo.SimpleFilterVO;
import com.yonyou.ucf.mdd.ext.bill.dto.BillDataDto;
import com.yonyou.ucf.mdd.ext.bill.rule.base.AbstractCommonRule;
import com.yonyou.ucf.mdd.ext.core.AppContext;
import com.yonyou.ucf.mdd.ext.model.BillContext;
import com.yonyou.ucf.mdd.ext.model.LoginUser;
import com.yonyoucloud.iuap.upc.api.service.IUPCControlRuleService;
import java.util.List;
import java.util.Map;
import org.imeta.core.base.ConditionOperator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.util.CollectionUtils;

@Component(value="filterOrgRule")
public class FilterOrgRule
extends AbstractCommonRule {
    private final IUPCControlRuleService upcControlRuleService;

    @Autowired
    public FilterOrgRule(IUPCControlRuleService upcControlRuleService) {
        this.upcControlRuleService = upcControlRuleService;
    }

    public RuleExecuteResult execute(BillContext billContext, Map<String, Object> paramMap) throws Exception {
        String billnum;
        BillDataDto billDataDto = (BillDataDto)this.getParam(paramMap);
        LoginUser user = AppContext.getCurrentUser();
        if (null == user) {
            throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_800106);
        }
        FilterVO treeFilterVO = new FilterVO();
        if (billDataDto.getTreeCondition() != null) {
            treeFilterVO = billDataDto.getTreeCondition();
        }
        if ((billnum = billDataDto.getBillnum()) != null && user.getUserType().getValue() != 0 && "aa_warehouse".equals(billnum)) {
            List<String> orgids = this.upcControlRuleService.getOrgPermissions("aa_warehouselist");
            treeFilterVO.appendCondition(ConditionOperator.and, new SimpleFilterVO[]{new SimpleFilterVO("id", ConditionOperator.neq.name(), (Object)"666666")});
            if (!CollectionUtils.isEmpty(orgids)) {
                treeFilterVO.appendCondition(ConditionOperator.and, new SimpleFilterVO[]{new SimpleFilterVO("id", "in", orgids)});
            } else {
                treeFilterVO.appendCondition(ConditionOperator.and, new SimpleFilterVO[]{new SimpleFilterVO("1", "eq", (Object)2)});
            }
        }
        treeFilterVO.appendCondition(ConditionOperator.and, new SimpleFilterVO[]{new SimpleFilterVO("enable", "eq", (Object)1)});
        billDataDto.setTreeCondition(treeFilterVO);
        this.putParam(paramMap, billDataDto);
        return new RuleExecuteResult();
    }
}


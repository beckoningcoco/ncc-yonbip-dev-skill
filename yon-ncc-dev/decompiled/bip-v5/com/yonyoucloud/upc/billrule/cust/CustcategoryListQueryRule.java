/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.yonyou.iuap.apdoc.coredoc.option.service.PubOptionService
 *  com.yonyou.ucf.mdd.common.model.rule.RuleExecuteResult
 *  com.yonyou.ucf.mdd.ext.bill.dto.BillDataDto
 *  com.yonyou.ucf.mdd.ext.bill.rule.base.AbstractCommonRule
 *  com.yonyou.ucf.mdd.ext.bill.rule.crud.QuerytreeBillRule
 *  com.yonyou.ucf.mdd.ext.model.BillContext
 *  org.apache.commons.lang3.StringUtils
 *  org.springframework.beans.factory.annotation.Autowired
 *  org.springframework.context.annotation.Lazy
 *  org.springframework.stereotype.Component
 */
package com.yonyoucloud.upc.billrule.cust;

import com.yonyou.iuap.apdoc.coredoc.option.service.PubOptionService;
import com.yonyou.ucf.mdd.common.model.rule.RuleExecuteResult;
import com.yonyou.ucf.mdd.ext.bill.dto.BillDataDto;
import com.yonyou.ucf.mdd.ext.bill.rule.base.AbstractCommonRule;
import com.yonyou.ucf.mdd.ext.bill.rule.crud.QuerytreeBillRule;
import com.yonyou.ucf.mdd.ext.model.BillContext;
import com.yonyoucloud.iuap.upc.api.service.IUPCControlRuleService;
import com.yonyoucloud.upc.service.utils.TreeApplyRangeUtils;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Component(value="custcategoryListQueryRule")
public class CustcategoryListQueryRule
extends AbstractCommonRule {
    @Lazy
    @Autowired
    private IUPCControlRuleService iupcControlRuleService;
    @Autowired
    private PubOptionService pubOptionService;
    @Autowired
    private QuerytreeBillRule querytreeBillRule;

    public RuleExecuteResult execute(BillContext billContext, Map<String, Object> paramMap) throws Exception {
        BillDataDto billDataDto = (BillDataDto)this.getParam(paramMap);
        if (!this.pubOptionService.getOrgGlobalShare("aa.custcategory.CustCategory").booleanValue()) {
            TreeApplyRangeUtils.getInstance().queryCheckOrgId(this.iupcControlRuleService, billDataDto, "custCategoryApplyRanges_orgId");
        }
        RuleExecuteResult result = this.querytreeBillRule.execute(billContext, paramMap);
        result.setCancel(true);
        if (result.getData() != null) {
            ArrayList<Map> clsList = new ArrayList<Map>();
            this.sortTree((List)result.getData());
            this.tree2List((List)result.getData(), clsList);
            if (clsList.size() == 0) {
                return result;
            }
        }
        return result;
    }

    private void sortTree(List<Map> data) {
        List sorted = data.stream().sorted((a, b) -> {
            int result = Integer.compare(a.get("order") == null ? 0 : (Integer)a.get("order"), b.get("order") == null ? 0 : (Integer)b.get("order"));
            if (result == 0) {
                result = StringUtils.compare((String)((String)a.get("code")), (String)((String)b.get("code")));
            }
            return result;
        }).collect(Collectors.toList());
        data.clear();
        data.addAll(sorted);
        data.forEach(map -> {
            if (map.containsKey("children")) {
                List children = (List)map.get("children");
                this.sortTree(children);
            }
        });
    }

    private void tree2List(List<Map> topList, List<Map> result) {
        for (Map node : topList) {
            result.add(node);
            if (!node.containsKey("children")) continue;
            List children = (List)node.get("children");
            this.tree2List(children, result);
        }
    }
}


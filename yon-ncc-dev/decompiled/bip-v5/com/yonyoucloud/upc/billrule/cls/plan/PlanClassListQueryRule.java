/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.yonyou.ucf.mdd.common.model.rule.RuleExecuteResult
 *  com.yonyou.ucf.mdd.ext.bill.rule.base.AbstractCommonRule
 *  com.yonyou.ucf.mdd.ext.model.BillContext
 *  org.apache.commons.lang3.StringUtils
 *  org.springframework.stereotype.Component
 */
package com.yonyoucloud.upc.billrule.cls.plan;

import com.yonyou.ucf.mdd.common.model.rule.RuleExecuteResult;
import com.yonyou.ucf.mdd.ext.bill.rule.base.AbstractCommonRule;
import com.yonyou.ucf.mdd.ext.model.BillContext;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import org.apache.commons.lang3.StringUtils;
import org.springframework.stereotype.Component;

@Component(value="planClassListQueryRule")
public class PlanClassListQueryRule
extends AbstractCommonRule {
    public RuleExecuteResult execute(BillContext billContext, Map<String, Object> paramMap) throws Exception {
        List classDatas = (List)paramMap.get("return");
        if (classDatas != null) {
            ArrayList<Map> clsList = new ArrayList<Map>();
            this.sortTree(classDatas);
            this.tree2List(classDatas, clsList);
        }
        return new RuleExecuteResult();
    }

    public long totalProductCount(Map m) {
        long totalCount = Long.parseLong(m.get("productCount").toString());
        if (m.get("children") != null) {
            List chidren = (List)m.get("children");
            for (Map map : chidren) {
                totalCount += this.totalProductCount(map);
            }
        }
        return totalCount;
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


/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.yonyou.ucf.mdd.common.model.rule.RuleExecuteResult
 *  com.yonyou.ucf.mdd.ext.bill.rule.base.AbstractCommonRule
 *  com.yonyou.ucf.mdd.ext.bill.rule.crud.QuerytreeBillRule
 *  com.yonyou.ucf.mdd.ext.dao.meta.MetaDaoHelper
 *  com.yonyou.ucf.mdd.ext.model.BillContext
 *  org.apache.commons.lang3.StringUtils
 *  org.imeta.orm.schema.QuerySchema
 *  org.springframework.beans.factory.annotation.Autowired
 *  org.springframework.stereotype.Component
 */
package com.yonyoucloud.upc.billrule.cls;

import com.yonyou.ucf.mdd.common.model.rule.RuleExecuteResult;
import com.yonyou.ucf.mdd.ext.bill.rule.base.AbstractCommonRule;
import com.yonyou.ucf.mdd.ext.bill.rule.crud.QuerytreeBillRule;
import com.yonyou.ucf.mdd.ext.dao.meta.MetaDaoHelper;
import com.yonyou.ucf.mdd.ext.model.BillContext;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;
import org.apache.commons.lang3.StringUtils;
import org.imeta.orm.schema.QuerySchema;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component(value="shopProductClassListQueryRule")
public class ShopProductClassListQueryRule
extends AbstractCommonRule {
    @Autowired
    private QuerytreeBillRule querytreeBillRule;

    public RuleExecuteResult execute(BillContext billContext, Map<String, Object> paramMap) throws Exception {
        RuleExecuteResult result = this.querytreeBillRule.execute(billContext, paramMap);
        result.setCancel(true);
        if (result.getData() != null) {
            ArrayList<Map> clsList = new ArrayList<Map>();
            this.sortTree((List)result.getData());
            this.tree2List((List)result.getData(), clsList);
            if (clsList.size() == 0) {
                return result;
            }
            String clsFld = "classId";
            QuerySchema schema = QuerySchema.create().addSelect(new String[]{"1 as  isshow ", clsFld}).addGroupBy(clsFld);
            List showShopClassids = MetaDaoHelper.query((String)"pc.cls.ShopPresentationClass", (QuerySchema)schema);
            clsList.stream().forEach(m -> {
                Optional<Map> optCount = showShopClassids.stream().filter(c -> ((Long)c.get(clsFld)).equals((Long)m.get("id"))).findAny();
                m.put("ishow", optCount.isPresent() ? optCount.get().get("isshow") : Integer.valueOf(0));
            });
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


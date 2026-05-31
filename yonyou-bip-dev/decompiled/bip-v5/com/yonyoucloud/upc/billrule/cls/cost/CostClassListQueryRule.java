/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.yonyou.iuap.apdoc.coredoc.option.service.PubOptionService
 *  com.yonyou.ucf.mdd.common.model.rule.RuleExecuteResult
 *  com.yonyou.ucf.mdd.ext.bill.dto.BillDataDto
 *  com.yonyou.ucf.mdd.ext.bill.rule.base.AbstractCommonRule
 *  com.yonyou.ucf.mdd.ext.dao.meta.MetaDaoHelper
 *  com.yonyou.ucf.mdd.ext.model.BillContext
 *  org.apache.commons.lang3.StringUtils
 *  org.imeta.orm.schema.ConditionExpression
 *  org.imeta.orm.schema.QueryCondition
 *  org.imeta.orm.schema.QueryConditionGroup
 *  org.imeta.orm.schema.QuerySchema
 *  org.springframework.beans.factory.annotation.Autowired
 *  org.springframework.context.annotation.Lazy
 *  org.springframework.stereotype.Component
 */
package com.yonyoucloud.upc.billrule.cls.cost;

import com.yonyou.iuap.apdoc.coredoc.option.service.PubOptionService;
import com.yonyou.ucf.mdd.common.model.rule.RuleExecuteResult;
import com.yonyou.ucf.mdd.ext.bill.dto.BillDataDto;
import com.yonyou.ucf.mdd.ext.bill.rule.base.AbstractCommonRule;
import com.yonyou.ucf.mdd.ext.dao.meta.MetaDaoHelper;
import com.yonyou.ucf.mdd.ext.model.BillContext;
import com.yonyoucloud.iuap.upc.api.service.IUPCControlRuleService;
import com.yonyoucloud.upc.service.utils.TreeApplyRangeUtils;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;
import org.apache.commons.lang3.StringUtils;
import org.imeta.orm.schema.ConditionExpression;
import org.imeta.orm.schema.QueryCondition;
import org.imeta.orm.schema.QueryConditionGroup;
import org.imeta.orm.schema.QuerySchema;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Component(value="costClassListQueryRule")
public class CostClassListQueryRule
extends AbstractCommonRule {
    @Lazy
    @Autowired
    private IUPCControlRuleService iupcControlRuleService;
    @Autowired
    private PubOptionService pubOptionService;

    public RuleExecuteResult execute(BillContext billContext, Map<String, Object> paramMap) throws Exception {
        List classDatas;
        BillDataDto billDataDto = (BillDataDto)this.getParam(paramMap);
        if (!this.pubOptionService.getOrgGlobalShare("pc.cls.CostClass").booleanValue()) {
            TreeApplyRangeUtils.getInstance().queryCheckOrgId(this.iupcControlRuleService, billDataDto, "costClassApplyRanges_orgId");
        }
        if ((classDatas = (List)paramMap.get("return")) != null) {
            ArrayList ids = new ArrayList();
            ArrayList tplIds = new ArrayList();
            ArrayList classIds = new ArrayList();
            ArrayList<Map> clsList = new ArrayList<Map>();
            this.sortTree(classDatas);
            this.tree2List(classDatas, clsList);
            if (clsList.size() == 0) {
                return new RuleExecuteResult();
            }
            String clsFld = "costClass";
            String cFieldName = "costClass";
            clsList.stream().forEach(m -> {
                if (m.get("id") != null) {
                    ids.add(Long.parseLong(m.get("id").toString()));
                }
                if (m.containsKey("template") && m.get("template") != null) {
                    tplIds.add((Long)m.get("template"));
                }
                if (m.containsKey(cFieldName) && m.get(cFieldName) != null) {
                    classIds.add((Long)m.get(cFieldName));
                }
            });
            QuerySchema schema = QuerySchema.create().addSelect(new String[]{"count(1) as count", clsFld}).addCondition((ConditionExpression)QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)clsFld).in(ids)})).addGroupBy(clsFld);
            List counts = MetaDaoHelper.query((String)"pc.product.Product", (QuerySchema)schema);
            List classs = new ArrayList();
            if (classIds.size() > 0) {
                schema = QuerySchema.create().addSelect(new String[]{"id", "name"}).addCondition((ConditionExpression)QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"id").in(classIds)}));
                classs = MetaDaoHelper.query((String)"pc.cls.CostClass", (QuerySchema)schema);
            }
            ArrayList finalClasss = classs;
            clsList.stream().forEach(m -> {
                Optional<Map> optClass;
                Optional<Map> optCount = counts.stream().filter(c -> ((Long)c.get(clsFld)).equals((Long)m.get("id"))).findAny();
                m.put("productCount", optCount.isPresent() ? optCount.get().get("count") : Integer.valueOf(0));
                if (finalClasss.size() > 0 && (optClass = finalClasss.stream().filter(t -> ((Long)t.get("id")).equals((Long)m.get(cFieldName))).findAny()).isPresent()) {
                    m.put(cFieldName + "_Name", optClass.get().get("name"));
                }
            });
            clsList.stream().forEach(m -> m.put("productCount", this.totalProductCount((Map)m)));
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


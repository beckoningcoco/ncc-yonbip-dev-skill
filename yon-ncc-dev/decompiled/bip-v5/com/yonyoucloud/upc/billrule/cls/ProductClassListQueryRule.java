/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.yonyou.iuap.apdoc.coredoc.option.service.PubOptionService
 *  com.yonyou.iuap.apdoc.coredoc.utils.BooleanUtil
 *  com.yonyou.iuap.apdoc.coredoc.utils.ListSplitUtil
 *  com.yonyou.ucf.mdd.common.model.rule.RuleExecuteResult
 *  com.yonyou.ucf.mdd.ext.bill.dto.BillDataDto
 *  com.yonyou.ucf.mdd.ext.bill.rule.base.AbstractCommonRule
 *  com.yonyou.ucf.mdd.ext.core.AppContext
 *  com.yonyou.ucf.mdd.ext.dao.meta.MetaDaoHelper
 *  com.yonyou.ucf.mdd.ext.model.BillContext
 *  org.apache.commons.lang3.StringUtils
 *  org.imeta.orm.schema.ConditionExpression
 *  org.imeta.orm.schema.QueryCondition
 *  org.imeta.orm.schema.QueryConditionGroup
 *  org.imeta.orm.schema.QuerySchema
 *  org.springframework.beans.factory.annotation.Autowired
 *  org.springframework.context.annotation.Lazy
 *  org.springframework.data.redis.core.RedisTemplate
 *  org.springframework.stereotype.Component
 */
package com.yonyoucloud.upc.billrule.cls;

import com.yonyou.iuap.apdoc.coredoc.option.service.PubOptionService;
import com.yonyou.iuap.apdoc.coredoc.utils.BooleanUtil;
import com.yonyou.iuap.apdoc.coredoc.utils.ListSplitUtil;
import com.yonyou.ucf.mdd.common.model.rule.RuleExecuteResult;
import com.yonyou.ucf.mdd.ext.bill.dto.BillDataDto;
import com.yonyou.ucf.mdd.ext.bill.rule.base.AbstractCommonRule;
import com.yonyou.ucf.mdd.ext.core.AppContext;
import com.yonyou.ucf.mdd.ext.dao.meta.MetaDaoHelper;
import com.yonyou.ucf.mdd.ext.model.BillContext;
import com.yonyoucloud.iuap.upc.api.service.IUPCControlRuleService;
import com.yonyoucloud.upc.service.api.PresentationClassServiceImpl;
import com.yonyoucloud.upc.service.utils.TreeApplyRangeUtils;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.concurrent.TimeUnit;
import java.util.stream.Collectors;
import org.apache.commons.lang3.StringUtils;
import org.imeta.orm.schema.ConditionExpression;
import org.imeta.orm.schema.QueryCondition;
import org.imeta.orm.schema.QueryConditionGroup;
import org.imeta.orm.schema.QuerySchema;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Component;

@Component(value="productClassListQueryRule")
public class ProductClassListQueryRule
extends AbstractCommonRule {
    @Lazy
    @Autowired
    private IUPCControlRuleService iupcControlRuleService;
    @Autowired
    private PresentationClassServiceImpl presentationClassService;
    @Autowired
    private PubOptionService pubOptionService;
    @Autowired
    RedisTemplate redisTemplate;

    public RuleExecuteResult execute(BillContext billContext, Map<String, Object> paramMap) throws Exception {
        List classDatas;
        BillDataDto billDataDto = (BillDataDto)this.getParam(paramMap);
        if ("pc_managementclasslist".equals(billContext.getBillnum()) && !this.pubOptionService.getOrgGlobalShare("pc.cls.ManagementClass").booleanValue()) {
            TreeApplyRangeUtils.getInstance().queryCheckOrgId(this.iupcControlRuleService, billDataDto, "managementClassApplyRanges_orgId");
        }
        if ((classDatas = (List)paramMap.get("return")) != null) {
            String clsFld;
            ArrayList ids = new ArrayList();
            ArrayList<Map> clsList = new ArrayList<Map>();
            this.sortTree(classDatas);
            this.tree2List(classDatas, clsList);
            if (clsList.size() == 0) {
                return new RuleExecuteResult();
            }
            if ("pc_presentationclasslist".equals(billContext.getBillnum())) {
                List presentationClassList = classDatas;
                this.presentationClassService.batchQueryAndSetPresentationAttachments(presentationClassList);
                for (Map classData : classDatas) {
                    if (classData.containsKey("imageBusinessId")) {
                        classData.remove("imageBusinessId");
                        continue;
                    }
                    if (!classData.containsKey("adImageBusinessId")) continue;
                    classData.remove("adImageBusinessId");
                }
            }
            String string = clsFld = "pc_presentationclasslist".equalsIgnoreCase(billContext.getBillnum()) ? "productClass" : "manageClass";
            if (BooleanUtil.isFalse((Object)this.pubOptionService.getNeedSelectProductCount())) {
                clsList.forEach(m -> {
                    if (m.get("id") != null) {
                        ids.add(Long.parseLong(m.get("id").toString()));
                    }
                });
                List counts = new ArrayList();
                String redisKey = clsFld + "_" + AppContext.getYhtTenantId();
                if (this.redisTemplate.hasKey((Object)redisKey).booleanValue()) {
                    counts = this.redisTemplate.opsForList().range((Object)redisKey, 0L, -1L);
                } else {
                    List idList = ListSplitUtil.splitListByCapacity(ids, (int)1000);
                    for (List idsOne : idList) {
                        QuerySchema schema = QuerySchema.create().addSelect(new String[]{"count(1) as count", clsFld}).addCondition((ConditionExpression)QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)clsFld).in((Collection)idsOne)})).addGroupBy(clsFld);
                        List countsOne = MetaDaoHelper.query((String)"pc.product.Product", (QuerySchema)schema);
                        counts.addAll(countsOne);
                    }
                    if (counts.size() > 0 && counts.size() > 10000) {
                        this.redisTemplate.opsForList().leftPushAll((Object)redisKey, counts);
                        this.redisTemplate.expire((Object)redisKey, 5L, TimeUnit.MINUTES);
                    }
                }
                List finalCounts = counts;
                clsList.stream().forEach(m -> {
                    Optional<Map> optCount = finalCounts.stream().filter(c -> ((Long)c.get(clsFld)).equals((Long)m.get("id"))).findAny();
                    m.put("productCount", optCount.isPresent() ? optCount.get().get("count") : Integer.valueOf(0));
                });
                clsList.stream().forEach(m -> m.put("productCount", this.totalProductCount((Map)m)));
            }
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


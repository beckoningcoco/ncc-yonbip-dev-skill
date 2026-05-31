/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.alibaba.fastjson.JSON
 *  com.alibaba.fastjson.JSONArray
 *  com.yonyou.iuap.apdoc.coredoc.utils.BooleanUtil
 *  com.yonyou.ucf.mdd.common.model.rule.RuleExecuteResult
 *  com.yonyou.ucf.mdd.ext.bill.dto.BillDataDto
 *  com.yonyou.ucf.mdd.ext.bill.rule.base.AbstractCommonRule
 *  com.yonyou.ucf.mdd.ext.model.BillContext
 *  com.yonyoucloud.upc.pc.manage.LifeCycleTemplate
 *  org.springframework.stereotype.Component
 */
package com.yonyoucloud.upc.billrule.materialLifeCycle;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.yonyou.iuap.apdoc.coredoc.utils.BooleanUtil;
import com.yonyou.ucf.mdd.common.model.rule.RuleExecuteResult;
import com.yonyou.ucf.mdd.ext.bill.dto.BillDataDto;
import com.yonyou.ucf.mdd.ext.bill.rule.base.AbstractCommonRule;
import com.yonyou.ucf.mdd.ext.model.BillContext;
import com.yonyoucloud.upc.pc.manage.LifeCycleTemplate;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import org.springframework.stereotype.Component;

@Component(value="lifecycleTemplateAfterSaveQueryRule")
public class LifecycleTemplateAfterSaveQueryRule
extends AbstractCommonRule {
    public RuleExecuteResult execute(BillContext billContext, Map<String, Object> paramMap) throws Exception {
        ArrayList lifeCycleTemplateMapList;
        List bills = this.getBills(billContext, paramMap);
        LifeCycleTemplate lifeCycleTemplate = (LifeCycleTemplate)bills.get(0);
        if (lifeCycleTemplate.containsKey((Object)"_fromApi") && lifeCycleTemplate.get("_fromApi").equals(true)) {
            return new RuleExecuteResult();
        }
        Object requestMap = new HashMap();
        Map<Object, Object> materialStatusIdListMap = new HashMap();
        if (paramMap.get("requestData") instanceof String) {
            requestMap = JSON.parseObject((String)paramMap.get("requestData").toString());
        } else if (paramMap.get("requestData") instanceof Map) {
            requestMap = (Map)paramMap.get("requestData");
        } else if (paramMap.get("requestData") instanceof List) {
            requestMap = (Map)((List)paramMap.get("requestData")).get(0);
        }
        if (null != requestMap.get("lifeCycleDetail")) {
            List lifeCycleDetailRequestMapList = JSONArray.parseArray((String)requestMap.get("lifeCycleDetail").toString(), Map.class);
            materialStatusIdListMap = lifeCycleDetailRequestMapList.stream().collect(Collectors.toMap(p -> p.get("materialStatusId").toString(), p -> p));
        }
        if (null != (lifeCycleTemplateMapList = (ArrayList)((BillDataDto)paramMap.get("param")).getData()) && !lifeCycleTemplateMapList.isEmpty()) {
            if (null != ((Map)lifeCycleTemplateMapList.get(0)).get("stopstatus")) {
                int trunValue = BooleanUtil.isTrue(((Map)lifeCycleTemplateMapList.get(0)).get("stopstatus")) ? 1 : 0;
                ((Map)lifeCycleTemplateMapList.get(0)).replace("stopstatus", trunValue);
            }
            if (null != ((Map)lifeCycleTemplateMapList.get(0)).get("lifeCycleDetail")) {
                ArrayList lifeCycleDetailMapList = (ArrayList)((Map)lifeCycleTemplateMapList.get(0)).get("lifeCycleDetail");
                for (Map map : lifeCycleDetailMapList) {
                    if (null != map.get("materialStatusId!name") || null == map.get("materialStatusId") || null == materialStatusIdListMap.get(map.get("materialStatusId").toString())) continue;
                    map.put("materialStatusId!name", ((Map)materialStatusIdListMap.get(map.get("materialStatusId").toString())).get("materialStatusId!name"));
                    map.put("materialStatusId!code", ((Map)materialStatusIdListMap.get(map.get("materialStatusId").toString())).get("materialStatusId!code"));
                }
            }
        }
        return new RuleExecuteResult();
    }
}


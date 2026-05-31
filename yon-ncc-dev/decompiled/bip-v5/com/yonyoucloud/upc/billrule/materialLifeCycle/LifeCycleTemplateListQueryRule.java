/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.yonyou.iuap.ucf.common.i18n.InternationalUtils
 *  com.yonyou.ucf.mdd.common.model.Pager
 *  com.yonyou.ucf.mdd.common.model.rule.RuleExecuteResult
 *  com.yonyou.ucf.mdd.ext.bill.rule.base.AbstractCommonRule
 *  com.yonyou.ucf.mdd.ext.core.AppContext
 *  com.yonyou.ucf.mdd.ext.dao.sql.SqlHelper
 *  com.yonyou.ucf.mdd.ext.model.BillContext
 *  org.springframework.stereotype.Component
 */
package com.yonyoucloud.upc.billrule.materialLifeCycle;

import com.yonyou.iuap.ucf.common.i18n.InternationalUtils;
import com.yonyou.ucf.mdd.common.model.Pager;
import com.yonyou.ucf.mdd.common.model.rule.RuleExecuteResult;
import com.yonyou.ucf.mdd.ext.bill.rule.base.AbstractCommonRule;
import com.yonyou.ucf.mdd.ext.core.AppContext;
import com.yonyou.ucf.mdd.ext.dao.sql.SqlHelper;
import com.yonyou.ucf.mdd.ext.model.BillContext;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import org.springframework.stereotype.Component;

@Component(value="lifeCycleTemplateListQueryRule")
public class LifeCycleTemplateListQueryRule
extends AbstractCommonRule {
    public RuleExecuteResult execute(BillContext billContext, Map<String, Object> paramMap) throws Exception {
        Pager pager = (Pager)paramMap.get("return");
        if (pager.getRecordList() != null) {
            this.addMaterialStatusDetailAction(pager);
        }
        return new RuleExecuteResult();
    }

    private void addMaterialStatusDetailAction(Pager pager) throws Exception {
        ArrayList ids = new ArrayList();
        List recordList = pager.getRecordList();
        if (null == recordList || recordList.size() == 0) {
            return;
        }
        recordList.stream().forEach(record -> {
            Map map = (Map)record;
            if (null != map.get("lifeCycleDetail!materialStatusId!materialStatusDetail!id")) {
                ids.add(Long.valueOf(map.get("lifeCycleDetail!materialStatusId!materialStatusDetail!id").toString()));
            }
        });
        if (ids.isEmpty()) {
            return;
        }
        HashMap<String, Object> param = new HashMap<String, Object>();
        param.put("materialStatusDetailIds", ids);
        param.put("tenantId", AppContext.getTenantId());
        param.put("ytenantId", AppContext.getYTenantId());
        List materialStatusDetailActionNames = SqlHelper.selectList((String)"com.yonyoucloud.upc.manage.dao.materialLifeCycle.queryActionNamesByMaterialStatusDetailIds", param);
        if (materialStatusDetailActionNames.isEmpty()) {
            return;
        }
        recordList.stream().forEach(record -> {
            Map map = (Map)record;
            List detailActionNames = materialStatusDetailActionNames.stream().filter(actionNames -> actionNames.get("materialStatusDetailId").equals(map.get("lifeCycleDetail!materialStatusId!materialStatusDetail!id"))).collect(Collectors.toList());
            if (detailActionNames.size() > 0) {
                StringBuffer actionNames2 = new StringBuffer();
                for (int i = 0; i < detailActionNames.size(); ++i) {
                    if (null == ((Map)detailActionNames.get(i)).get("actionName")) continue;
                    actionNames2.append(((Map)detailActionNames.get(i)).get("actionName").toString());
                    if (i >= detailActionNames.size() - 1) continue;
                    actionNames2.append(InternationalUtils.getMessageWithDefault((String)"UID:P_COREDOC-BE_179F6286040803D8", (String)"\u3001"));
                }
                map.put("lifeCycleDetail!materialStatusId!materialStatusDetail!action", new String(actionNames2));
            }
        });
    }
}


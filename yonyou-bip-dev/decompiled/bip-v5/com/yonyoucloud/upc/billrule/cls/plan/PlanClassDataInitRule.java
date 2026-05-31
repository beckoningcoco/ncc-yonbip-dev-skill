/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.yonyou.ucf.mdd.common.model.rule.RuleExecuteResult
 *  com.yonyou.ucf.mdd.ext.bill.dto.BillDataDto
 *  com.yonyou.ucf.mdd.ext.bill.rule.base.AbstractCommonRule
 *  com.yonyou.ucf.mdd.ext.dao.meta.MetaDaoHelper
 *  com.yonyou.ucf.mdd.ext.model.BillContext
 *  com.yonyoucloud.upc.pc.cls.ProductClass
 *  org.imeta.orm.base.BizObject
 *  org.imeta.orm.base.Json
 *  org.springframework.stereotype.Component
 */
package com.yonyoucloud.upc.billrule.cls.plan;

import com.yonyou.ucf.mdd.common.model.rule.RuleExecuteResult;
import com.yonyou.ucf.mdd.ext.bill.dto.BillDataDto;
import com.yonyou.ucf.mdd.ext.bill.rule.base.AbstractCommonRule;
import com.yonyou.ucf.mdd.ext.dao.meta.MetaDaoHelper;
import com.yonyou.ucf.mdd.ext.model.BillContext;
import com.yonyoucloud.upc.pc.cls.ProductClass;
import java.util.List;
import java.util.Map;
import org.imeta.orm.base.BizObject;
import org.imeta.orm.base.Json;
import org.springframework.stereotype.Component;

@Component(value="planClassDataInitRule")
public class PlanClassDataInitRule
extends AbstractCommonRule {
    public RuleExecuteResult execute(BillContext billContext, Map<String, Object> map) throws Exception {
        List rows;
        BillDataDto billDataDto = (BillDataDto)this.getParam(map);
        if (null == billContext || billDataDto == null) {
            return new RuleExecuteResult();
        }
        List clss = (List)billDataDto.getData();
        ProductClass cls = (ProductClass)clss.get(0);
        if (billDataDto.getId() != null && (rows = MetaDaoHelper.queryById((String)billContext.getFullname(), (String)"*", (Object)billDataDto.getId())) != null && rows.size() > 0) {
            Map parent = (Map)rows.get(0);
            cls.setParent((Object)((Long)parent.get("id")));
            cls.put("parent_name", parent.get("name"));
        }
        cls.setIsEnd(Boolean.valueOf(true));
        return new RuleExecuteResult((Object)Json.encode2((BizObject)cls).toString());
    }
}


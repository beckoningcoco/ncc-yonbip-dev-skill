/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.yonyou.iuap.apdoc.coredoc.enums.CoreExtrateBusinessErrorEnum
 *  com.yonyou.iuap.apdoc.coredoc.exceptions.CoreDocBusinessException
 *  com.yonyou.ucf.mdd.common.model.rule.RuleExecuteResult
 *  com.yonyou.ucf.mdd.ext.bill.rule.base.AbstractCommonRule
 *  com.yonyou.ucf.mdd.ext.dao.meta.MetaDaoHelper
 *  com.yonyou.ucf.mdd.ext.model.BillContext
 *  org.imeta.orm.base.BizObject
 *  org.imeta.orm.schema.QueryField
 *  org.imeta.orm.schema.QuerySchema
 *  org.springframework.stereotype.Component
 */
package com.yonyoucloud.upc.billrule.position;

import com.yonyou.iuap.apdoc.coredoc.enums.CoreExtrateBusinessErrorEnum;
import com.yonyou.iuap.apdoc.coredoc.exceptions.CoreDocBusinessException;
import com.yonyou.ucf.mdd.common.model.rule.RuleExecuteResult;
import com.yonyou.ucf.mdd.ext.bill.rule.base.AbstractCommonRule;
import com.yonyou.ucf.mdd.ext.dao.meta.MetaDaoHelper;
import com.yonyou.ucf.mdd.ext.model.BillContext;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.imeta.orm.base.BizObject;
import org.imeta.orm.schema.QueryField;
import org.imeta.orm.schema.QuerySchema;
import org.springframework.stereotype.Component;

@Component(value="positionNameUniqueCheckRule")
public class PositionNameUniqueCheckRule
extends AbstractCommonRule {
    public RuleExecuteResult execute(BillContext billContext, Map<String, Object> paramMap) throws Exception {
        String fullname = billContext.getFullname();
        QuerySchema schema = new QuerySchema();
        ArrayList<QueryField> selectFields = new ArrayList<QueryField>();
        selectFields.add(new QueryField("name"));
        selectFields.add(new QueryField("id"));
        schema.selectFields(selectFields);
        List billsInDB = MetaDaoHelper.query((String)fullname, (QuerySchema)schema);
        HashMap<String, String> id_nameMap = new HashMap<String, String>();
        for (Map bill : billsInDB) {
            id_nameMap.put(String.valueOf(bill.get("name")), String.valueOf(bill.get("id")));
        }
        Set nameSet = id_nameMap.keySet();
        List bills = this.getBills(billContext, paramMap);
        for (BizObject bill : bills) {
            String idInDB;
            String cName = (String)bill.get("name");
            String id = bill.get("id").toString();
            if (!nameSet.contains(cName) || id.equals(idInDB = (String)id_nameMap.get(cName))) continue;
            throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_800109);
        }
        return new RuleExecuteResult();
    }
}


/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.yonyou.iuap.apdoc.coredoc.enums.CoreExtrateBusinessErrorEnum
 *  com.yonyou.iuap.apdoc.coredoc.exceptions.CoreDocBusinessException
 *  com.yonyou.iuap.apdoc.coredoc.utils.BooleanUtil
 *  com.yonyou.ucf.mdd.common.model.rule.RuleExecuteResult
 *  com.yonyou.ucf.mdd.ext.bill.dto.BillDataDto
 *  com.yonyou.ucf.mdd.ext.bill.rule.base.AbstractCommonRule
 *  com.yonyou.ucf.mdd.ext.dao.meta.MetaDaoHelper
 *  com.yonyou.ucf.mdd.ext.model.BillContext
 *  org.imeta.orm.base.BizObject
 *  org.imeta.orm.schema.ConditionExpression
 *  org.imeta.orm.schema.QueryCondition
 *  org.imeta.orm.schema.QueryConditionGroup
 *  org.imeta.orm.schema.QuerySchema
 *  org.slf4j.Logger
 *  org.slf4j.LoggerFactory
 *  org.springframework.stereotype.Component
 *  org.springframework.util.CollectionUtils
 */
package com.yonyoucloud.upc.billrule.materialLifeCycle;

import com.yonyou.iuap.apdoc.coredoc.enums.CoreExtrateBusinessErrorEnum;
import com.yonyou.iuap.apdoc.coredoc.exceptions.CoreDocBusinessException;
import com.yonyou.iuap.apdoc.coredoc.utils.BooleanUtil;
import com.yonyou.ucf.mdd.common.model.rule.RuleExecuteResult;
import com.yonyou.ucf.mdd.ext.bill.dto.BillDataDto;
import com.yonyou.ucf.mdd.ext.bill.rule.base.AbstractCommonRule;
import com.yonyou.ucf.mdd.ext.dao.meta.MetaDaoHelper;
import com.yonyou.ucf.mdd.ext.model.BillContext;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import org.imeta.orm.base.BizObject;
import org.imeta.orm.schema.ConditionExpression;
import org.imeta.orm.schema.QueryCondition;
import org.imeta.orm.schema.QueryConditionGroup;
import org.imeta.orm.schema.QuerySchema;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;
import org.springframework.util.CollectionUtils;

@Component(value="materialStatusCheckRule")
public class MaterialStatusCheckRule
extends AbstractCommonRule {
    private static final Logger logger = LoggerFactory.getLogger(MaterialStatusCheckRule.class);

    public RuleExecuteResult execute(BillContext billContext, Map<String, Object> paramMap) throws Exception {
        BillDataDto billDataDto = (BillDataDto)this.getParam(paramMap);
        if (null == billContext || billDataDto == null) {
            return new RuleExecuteResult(paramMap);
        }
        List bills = this.getBills(billContext, paramMap);
        if (!CollectionUtils.isEmpty((Collection)bills)) {
            ArrayList<Long> materialStatusIds = new ArrayList<Long>();
            for (int i = 0; i < bills.size(); ++i) {
                BizObject bill = (BizObject)bills.get(i);
                this.checkIsSystem(bill);
                this.checkIsStop(bill);
                materialStatusIds.add(Long.valueOf((String)bill.getId()));
            }
            this.checkRef(bills, materialStatusIds);
        }
        return new RuleExecuteResult();
    }

    private void checkIsSystem(BizObject bill) throws Exception {
        if (null != bill.get("code") && bill.get("code").toString().toLowerCase().startsWith("system_")) {
            throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_800350, new Object[]{bill.get("name").toString()});
        }
    }

    private void checkIsStop(BizObject bill) throws Exception {
        if (null != bill.get("stopstatus") && BooleanUtil.isFalse((Object)bill.get("stopstatus"))) {
            throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_800351, new Object[]{bill.get("name").toString()});
        }
    }

    private void checkRef(List<BizObject> bills, List<Long> materialStatusIds) throws Exception {
        if (!CollectionUtils.isEmpty(materialStatusIds)) {
            QueryConditionGroup condition = QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"lifeCycleDetail.materialStatusId").in(materialStatusIds)});
            QuerySchema querySchema = QuerySchema.create().addSelect("lifeCycleDetail.materialStatusId as materialStatusId,name as name").appendQueryCondition(new ConditionExpression[]{condition});
            Map referResult = MetaDaoHelper.queryOne((String)"pc.manage.LifeCycleTemplate", (QuerySchema)querySchema);
            if (!CollectionUtils.isEmpty((Map)referResult)) {
                for (int i = 0; i < bills.size(); ++i) {
                    if (referResult.get("materialStatusId") == null || !referResult.get("materialStatusId").equals(bills.get(i).getId().toString())) continue;
                    throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_800352, new Object[]{bills.get(i).get("name").toString(), referResult.get("name")});
                }
            }
        }
    }
}


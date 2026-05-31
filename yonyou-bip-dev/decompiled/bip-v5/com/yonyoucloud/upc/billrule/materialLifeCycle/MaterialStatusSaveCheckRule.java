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
 *  com.yonyoucloud.upc.pc.manage.GranularityControl
 *  com.yonyoucloud.upc.pc.manage.MaterialStatus
 *  com.yonyoucloud.upc.pc.manage.MaterialStatusDetail
 *  com.yonyoucloud.upc.pc.manage.MaterialStatusDetailAction
 *  org.imeta.orm.base.BizObject
 *  org.imeta.orm.base.EntityStatus
 *  org.imeta.orm.schema.ConditionExpression
 *  org.imeta.orm.schema.QueryCondition
 *  org.imeta.orm.schema.QueryConditionGroup
 *  org.imeta.orm.schema.QuerySchema
 *  org.springframework.stereotype.Component
 *  org.springframework.util.CollectionUtils
 */
package com.yonyoucloud.upc.billrule.materialLifeCycle;

import com.yonyou.iuap.apdoc.coredoc.enums.CoreExtrateBusinessErrorEnum;
import com.yonyou.iuap.apdoc.coredoc.exceptions.CoreDocBusinessException;
import com.yonyou.ucf.mdd.common.model.rule.RuleExecuteResult;
import com.yonyou.ucf.mdd.ext.bill.rule.base.AbstractCommonRule;
import com.yonyou.ucf.mdd.ext.dao.meta.MetaDaoHelper;
import com.yonyou.ucf.mdd.ext.model.BillContext;
import com.yonyoucloud.upc.pc.manage.GranularityControl;
import com.yonyoucloud.upc.pc.manage.MaterialStatus;
import com.yonyoucloud.upc.pc.manage.MaterialStatusDetail;
import com.yonyoucloud.upc.pc.manage.MaterialStatusDetailAction;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import org.imeta.orm.base.BizObject;
import org.imeta.orm.base.EntityStatus;
import org.imeta.orm.schema.ConditionExpression;
import org.imeta.orm.schema.QueryCondition;
import org.imeta.orm.schema.QueryConditionGroup;
import org.imeta.orm.schema.QuerySchema;
import org.springframework.stereotype.Component;
import org.springframework.util.CollectionUtils;

@Component(value="materialStatusSaveCheckRule")
public class MaterialStatusSaveCheckRule
extends AbstractCommonRule {
    public RuleExecuteResult execute(BillContext billContext, Map<String, Object> paramMap) throws Exception {
        List bills = this.getBills(billContext, paramMap);
        if (CollectionUtils.isEmpty((Collection)bills)) {
            return new RuleExecuteResult();
        }
        this.checkMateralStatusCode((BizObject)bills.get(0));
        this.checkMateralStatusUnique((BizObject)bills.get(0));
        return new RuleExecuteResult();
    }

    private void checkMateralStatusCode(BizObject bill) throws Exception {
        if (EntityStatus.Update == bill.getEntityStatus()) {
            QueryConditionGroup condition = QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"id").eq(bill.get("id")), QueryCondition.name((String)"code").left_like((Object)"system_")});
            QuerySchema querySchema = QuerySchema.create().addSelect("1").appendQueryCondition(new ConditionExpression[]{condition});
            Map systemFlagResult = MetaDaoHelper.queryOne((String)"pc.manage.MaterialStatus", (QuerySchema)querySchema);
            if (null != systemFlagResult && !systemFlagResult.isEmpty()) {
                throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_800333, new Object[]{bill.get("name").toString()});
            }
        }
        if (null != bill.get("code") && bill.get("code").toString().toLowerCase().startsWith("system_")) {
            throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_800334, new Object[]{bill.get("name").toString()});
        }
    }

    private void checkMateralStatusUnique(BizObject bill) throws Exception {
        MaterialStatus materialStatus = (MaterialStatus)bill;
        if (null == materialStatus.materialStatusDetail()) {
            return;
        }
        List materialStatusDetails = materialStatus.materialStatusDetail();
        ArrayList<String> repeatList = new ArrayList<String>();
        for (MaterialStatusDetail materialStatusDetail : materialStatusDetails) {
            if (null == materialStatusDetail.getServiceCode() && null == materialStatusDetail.getTransType()) {
                throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_800335, new Object[]{bill.get("name").toString()});
            }
            if (null == materialStatusDetail.materialStatusDetailAction()) {
                throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_800336, new Object[]{bill.get("name").toString()});
            }
            if (null == materialStatusDetail.getGranularityControl()) {
                throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_800337, new Object[]{bill.get("name").toString()});
            }
            if (GranularityControl.controlByService.getValue() == materialStatusDetail.getGranularityControl().shortValue()) {
                for (MaterialStatusDetailAction materialStatusDetailAction : materialStatusDetail.materialStatusDetailAction()) {
                    if (EntityStatus.Delete == materialStatusDetailAction.getEntityStatus()) continue;
                    String serviceRepeat = materialStatusDetail.getServiceCode() + "|" + materialStatusDetailAction.getAction();
                    if (repeatList.contains(serviceRepeat)) {
                        throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_800338, new Object[]{bill.get("name").toString()});
                    }
                    repeatList.add(serviceRepeat);
                }
                continue;
            }
            if (GranularityControl.controlByTransType.getValue() == materialStatusDetail.getGranularityControl().shortValue()) {
                for (MaterialStatusDetailAction materialStatusDetailAction : materialStatusDetail.materialStatusDetailAction()) {
                    if (EntityStatus.Delete == materialStatusDetailAction.getEntityStatus()) continue;
                    String transTypeRepeat = materialStatusDetail.getTransType() + "|" + materialStatusDetailAction.getAction();
                    if (repeatList.contains(transTypeRepeat)) {
                        throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_800339, new Object[]{bill.get("name").toString()});
                    }
                    repeatList.add(transTypeRepeat);
                }
                continue;
            }
            throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_800340, new Object[]{bill.get("name").toString()});
        }
    }
}


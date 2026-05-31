/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.yonyou.iuap.apdoc.coredoc.enums.CoreExtrateBusinessErrorEnum
 *  com.yonyou.iuap.apdoc.coredoc.exceptions.CoreDocBusinessException
 *  com.yonyou.ucf.mdd.common.model.rule.RuleExecuteResult
 *  com.yonyou.ucf.mdd.ext.bill.dto.BillDataDto
 *  com.yonyou.ucf.mdd.ext.bill.rule.base.AbstractCommonRule
 *  com.yonyou.ucf.mdd.ext.core.AppContext
 *  com.yonyou.ucf.mdd.ext.dao.meta.MetaDaoHelper
 *  com.yonyou.ucf.mdd.ext.model.BillContext
 *  com.yonyoucloud.upc.pc.manage.LifeCycleDetail
 *  com.yonyoucloud.upc.pc.manage.LifeCycleTemplate
 *  org.imeta.orm.base.EntityStatus
 *  org.imeta.orm.schema.ConditionExpression
 *  org.imeta.orm.schema.QueryCondition
 *  org.imeta.orm.schema.QueryConditionGroup
 *  org.imeta.orm.schema.QuerySchema
 *  org.imeta.spring.support.id.IdManager
 *  org.springframework.stereotype.Component
 */
package com.yonyoucloud.upc.billrule.materialLifeCycle;

import com.yonyou.iuap.apdoc.coredoc.enums.CoreExtrateBusinessErrorEnum;
import com.yonyou.iuap.apdoc.coredoc.exceptions.CoreDocBusinessException;
import com.yonyou.ucf.mdd.common.model.rule.RuleExecuteResult;
import com.yonyou.ucf.mdd.ext.bill.dto.BillDataDto;
import com.yonyou.ucf.mdd.ext.bill.rule.base.AbstractCommonRule;
import com.yonyou.ucf.mdd.ext.core.AppContext;
import com.yonyou.ucf.mdd.ext.dao.meta.MetaDaoHelper;
import com.yonyou.ucf.mdd.ext.model.BillContext;
import com.yonyoucloud.upc.pc.manage.LifeCycleDetail;
import com.yonyoucloud.upc.pc.manage.LifeCycleTemplate;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import org.imeta.orm.base.EntityStatus;
import org.imeta.orm.schema.ConditionExpression;
import org.imeta.orm.schema.QueryCondition;
import org.imeta.orm.schema.QueryConditionGroup;
import org.imeta.orm.schema.QuerySchema;
import org.imeta.spring.support.id.IdManager;
import org.springframework.stereotype.Component;

@Component(value="lifeCycleTemplateAPIProcessRule")
public class LifeCycleTemplateAPIProcessRule
extends AbstractCommonRule {
    public RuleExecuteResult execute(BillContext billContext, Map<String, Object> paramMap) throws Exception {
        BillDataDto billDataDto = (BillDataDto)this.getParam(paramMap);
        if (null == billContext || billDataDto == null) {
            return new RuleExecuteResult();
        }
        List bills = this.getBills(billContext, paramMap);
        for (int i = 0; i < bills.size(); ++i) {
            LifeCycleTemplate lifeCycleTemplate = (LifeCycleTemplate)bills.get(i);
            if (!lifeCycleTemplate.containsKey((Object)"_fromApi") || !lifeCycleTemplate.get("_fromApi").equals(true)) continue;
            String lifecycleTplId = (String)lifeCycleTemplate.getId();
            List materialStatusList = MetaDaoHelper.query((String)"pc.manage.MaterialStatus", (QuerySchema)QuerySchema.create().addSelect("id,code").addCondition((ConditionExpression)QueryCondition.name((String)"tenant").eq(AppContext.getTenantId())));
            if (null == materialStatusList || materialStatusList.isEmpty()) {
                throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_800344);
            }
            Map<String, String> materialStatusCodeIdMap = materialStatusList.stream().collect(Collectors.toMap(x -> x.get("code").toString(), y -> y.get("id").toString()));
            QueryConditionGroup condition = QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"lifeCycleTemplateId").eq((Object)lifecycleTplId)});
            QuerySchema schema = QuerySchema.create().addSelect("materialStatusId,id").addCondition((ConditionExpression)condition);
            List lifeCycleDetailMapList = MetaDaoHelper.query((String)"pc.manage.LifeCycleDetail", (QuerySchema)schema);
            HashMap lifeCycleDetailMap = new HashMap();
            lifeCycleDetailMapList.forEach(a -> lifeCycleDetailMap.put(a.get("materialStatusId").toString(), a.get("id").toString()));
            if (!lifeCycleTemplate.containsKey((Object)"lifeCycleDetail") || null == lifeCycleTemplate.get("lifeCycleDetail")) continue;
            for (LifeCycleDetail detail : lifeCycleTemplate.lifeCycleDetail()) {
                if (null == detail.getMaterialStatusId()) {
                    String materialStatusCodeIdKey;
                    String string = materialStatusCodeIdKey = null != detail.get("materialStatusCode") ? detail.get("materialStatusCode").toString() : "";
                    if (null == materialStatusCodeIdMap.get(materialStatusCodeIdKey)) {
                        throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_800345, new Object[]{materialStatusCodeIdKey});
                    }
                    detail.setMaterialStatusId(materialStatusCodeIdMap.get(materialStatusCodeIdKey));
                }
                if (lifeCycleDetailMap.containsKey(detail.getMaterialStatusId())) {
                    detail.setId(lifeCycleDetailMap.get(detail.getMaterialStatusId()));
                    if (null != detail.getEntityStatus() && EntityStatus.Insert != detail.getEntityStatus()) continue;
                    detail.setEntityStatus(EntityStatus.Update);
                    continue;
                }
                detail.setId((Object)String.valueOf(IdManager.getInstance().nextId()));
                detail.setLifeCycleTemplateId(lifecycleTplId);
                detail.setEntityStatus(EntityStatus.Insert);
            }
        }
        return new RuleExecuteResult();
    }
}


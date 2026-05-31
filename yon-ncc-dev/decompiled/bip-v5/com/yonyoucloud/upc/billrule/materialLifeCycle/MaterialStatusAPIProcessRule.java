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
 *  com.yonyoucloud.upc.pc.manage.MaterialStatus
 *  com.yonyoucloud.upc.pc.manage.MaterialStatusDetail
 *  com.yonyoucloud.upc.pc.manage.MaterialStatusDetailAction
 *  org.apache.commons.lang3.StringUtils
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
import com.yonyoucloud.upc.pc.manage.MaterialStatus;
import com.yonyoucloud.upc.pc.manage.MaterialStatusDetail;
import com.yonyoucloud.upc.pc.manage.MaterialStatusDetailAction;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import org.apache.commons.lang3.StringUtils;
import org.imeta.orm.base.EntityStatus;
import org.imeta.orm.schema.ConditionExpression;
import org.imeta.orm.schema.QueryCondition;
import org.imeta.orm.schema.QueryConditionGroup;
import org.imeta.orm.schema.QuerySchema;
import org.imeta.spring.support.id.IdManager;
import org.springframework.stereotype.Component;

@Component(value="materialStatusAPIProcessRule")
public class MaterialStatusAPIProcessRule
extends AbstractCommonRule {
    public RuleExecuteResult execute(BillContext billContext, Map<String, Object> paramMap) throws Exception {
        BillDataDto billDataDto = (BillDataDto)this.getParam(paramMap);
        if (null == billContext || billDataDto == null) {
            return new RuleExecuteResult();
        }
        List bills = this.getBills(billContext, paramMap);
        for (int i = 0; i < bills.size(); ++i) {
            List materialStatusDetailActionList;
            MaterialStatus materialStatus = (MaterialStatus)bills.get(i);
            Map<Object, Object> serviceActionIdMap = new HashMap();
            Map<Object, Object> materialStatusDetailActionMap = new HashMap();
            if (!materialStatus.containsKey((Object)"_fromApi") || !materialStatus.get("_fromApi").equals(true)) continue;
            List serviceActionList = MetaDaoHelper.query((String)"pc.manage.ServiceControlType", (QuerySchema)QuerySchema.create().addSelect("id,serviceCode,action").addCondition((ConditionExpression)QueryCondition.name((String)"tenant").eq(AppContext.getTenantId())));
            if (null == serviceActionList || serviceActionList.isEmpty()) {
                throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_800341);
            }
            serviceActionIdMap = serviceActionList.stream().collect(Collectors.toMap(x -> x.get("serviceCode").toString() + x.get("action").toString(), y -> y.get("id").toString()));
            String materialStatusId = (String)materialStatus.getId();
            if (!materialStatus.containsKey((Object)"materialStatusDetail") || null == materialStatus.get("materialStatusDetail")) continue;
            if (EntityStatus.Update.equals((Object)materialStatus.getEntityStatus()) && !(materialStatusDetailActionList = MetaDaoHelper.query((String)"pc.manage.MaterialStatusDetail", (QuerySchema)QuerySchema.create().addSelect("materialStatusDetailAction.id as id, materialStatusDetailAction.materialStatusDetailId as materialStatusDetailId, materialStatusDetailAction.action as action").addCondition((ConditionExpression)QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"materialStatusId").eq((Object)materialStatusId)})))).isEmpty()) {
                materialStatusDetailActionMap = materialStatusDetailActionList.stream().collect(Collectors.groupingBy(map -> map.get("materialStatusDetailId").toString()));
            }
            for (MaterialStatusDetail detail : materialStatus.materialStatusDetail()) {
                List actionList;
                int granularityControl = detail.getGranularityControl();
                if (EntityStatus.Insert.equals((Object)detail.getEntityStatus())) {
                    detail.setId((Object)String.valueOf(IdManager.getInstance().nextId()));
                    detail.setMaterialStatusId(materialStatusId);
                }
                if (!detail.containsKey((Object)"materialStatusDetailAction") || null == detail.get("materialStatusDetailAction")) continue;
                String materialStatusDetailId = (String)detail.getId();
                Map<Object, Object> detailActionMap = new HashMap();
                if (!materialStatusDetailActionMap.isEmpty() && null != (actionList = (List)materialStatusDetailActionMap.get(materialStatusDetailId)) && !actionList.isEmpty()) {
                    detailActionMap = actionList.stream().collect(Collectors.toMap(x -> x.get("action").toString(), x -> x));
                }
                for (MaterialStatusDetailAction detailAction : detail.materialStatusDetailAction()) {
                    if (1 == granularityControl && null == detailAction.get("serviceCode") && null == detail.getServiceCode()) {
                        throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_800342);
                    }
                    if (StringUtils.isEmpty((CharSequence)detailAction.getAction())) {
                        String serviceCode = null != detailAction.get("serviceCode") ? detailAction.get("serviceCode").toString() : detail.getServiceCode();
                        String serviceCodeactionKey = serviceCode + (null != detailAction.get("actionCode") ? detailAction.get("actionCode").toString() : "");
                        if (null == serviceActionIdMap.get(serviceCodeactionKey)) {
                            throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_800343);
                        }
                        detailAction.setAction((String)serviceActionIdMap.get(serviceCodeactionKey));
                    }
                    if (!detailActionMap.isEmpty()) {
                        Map oldActionMap = (Map)detailActionMap.get(detailAction.getAction());
                        if (null == oldActionMap || oldActionMap.isEmpty()) {
                            detailAction.setId((Object)IdManager.getInstance().nextId());
                            detailAction.setMaterialStatusDetailId(materialStatusDetailId);
                            detailAction.setEntityStatus(EntityStatus.Insert);
                            continue;
                        }
                        detailAction.setId((Object)oldActionMap.get("id").toString());
                        detailAction.setMaterialStatusDetailId(materialStatusDetailId);
                        if (EntityStatus.Delete.equals((Object)detailAction.getEntityStatus())) continue;
                        detailAction.setEntityStatus(EntityStatus.Update);
                        continue;
                    }
                    if (!EntityStatus.Insert.equals((Object)detailAction.getEntityStatus())) continue;
                    detailAction.setId((Object)IdManager.getInstance().nextId());
                    detailAction.setMaterialStatusDetailId(materialStatusDetailId);
                }
            }
        }
        return new RuleExecuteResult();
    }
}


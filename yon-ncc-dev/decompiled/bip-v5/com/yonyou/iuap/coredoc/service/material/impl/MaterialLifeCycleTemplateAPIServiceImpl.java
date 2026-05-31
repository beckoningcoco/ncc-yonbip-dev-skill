/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.alibaba.fastjson.JSON
 *  com.yonyou.iuap.apdoc.coredoc.enums.CoreExtrateBusinessErrorEnum
 *  com.yonyou.iuap.apdoc.coredoc.exceptions.CoreDocBusinessException
 *  com.yonyou.iuap.apdoc.coredoc.vo.materiallifecycle.LifeCycleTemplateVO
 *  com.yonyou.iuap.international.MultiLangText
 *  com.yonyou.ucf.mdd.common.model.rule.RuleExecuteResult
 *  com.yonyou.ucf.mdd.ext.bill.dto.BillDataDto
 *  com.yonyou.ucf.mdd.ext.dao.meta.MetaDaoHelper
 *  com.yonyou.ucf.mdd.ext.data.fill.DataTransferUtils
 *  com.yonyoucloud.upc.constants.ConvertTypeConstants
 *  com.yonyoucloud.upc.pc.manage.LifeCycleDetail
 *  com.yonyoucloud.upc.pc.manage.LifeCycleTemplate
 *  org.imeta.orm.base.BizObject
 *  org.imeta.orm.base.EntityStatus
 *  org.imeta.orm.schema.ConditionExpression
 *  org.imeta.orm.schema.QueryCondition
 *  org.imeta.orm.schema.QueryConditionGroup
 *  org.imeta.orm.schema.QuerySchema
 *  org.springframework.beans.factory.annotation.Autowired
 *  org.springframework.beans.factory.annotation.Qualifier
 *  org.springframework.stereotype.Service
 *  org.springframework.util.CollectionUtils
 */
package com.yonyou.iuap.coredoc.service.material.impl;

import com.alibaba.fastjson.JSON;
import com.yonyou.iuap.apdoc.coredoc.enums.CoreExtrateBusinessErrorEnum;
import com.yonyou.iuap.apdoc.coredoc.exceptions.CoreDocBusinessException;
import com.yonyou.iuap.apdoc.coredoc.vo.materiallifecycle.LifeCycleTemplateVO;
import com.yonyou.iuap.coredoc.service.material.MaterialLifeCycleTemplateAPIService;
import com.yonyou.iuap.international.MultiLangText;
import com.yonyou.ucf.mdd.common.model.rule.RuleExecuteResult;
import com.yonyou.ucf.mdd.ext.bill.dto.BillDataDto;
import com.yonyou.ucf.mdd.ext.dao.meta.MetaDaoHelper;
import com.yonyou.ucf.mdd.ext.data.fill.DataTransferUtils;
import com.yonyoucloud.iuap.upc.api.service.IUPCBillService;
import com.yonyoucloud.upc.constants.ConvertTypeConstants;
import com.yonyoucloud.upc.pc.manage.LifeCycleDetail;
import com.yonyoucloud.upc.pc.manage.LifeCycleTemplate;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.imeta.orm.base.BizObject;
import org.imeta.orm.base.EntityStatus;
import org.imeta.orm.schema.ConditionExpression;
import org.imeta.orm.schema.QueryCondition;
import org.imeta.orm.schema.QueryConditionGroup;
import org.imeta.orm.schema.QuerySchema;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;

@Service
public class MaterialLifeCycleTemplateAPIServiceImpl
implements MaterialLifeCycleTemplateAPIService {
    @Autowired
    @Qualifier(value="pc.BillService")
    private IUPCBillService billService;

    @Override
    public LifeCycleTemplateVO materialLifeCycleTemplateSaveForApi(LifeCycleTemplateVO lifeCycleTemplateVO, Integer convertType, String matchRule) throws Exception {
        if (null == lifeCycleTemplateVO) {
            throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_801417);
        }
        LifeCycleTemplate lifeCycleTemplate = new LifeCycleTemplate();
        lifeCycleTemplate.put("_fromApi", (Object)true);
        lifeCycleTemplate.init((Map)JSON.parseObject((String)JSON.toJSONString((Object)lifeCycleTemplateVO), LifeCycleTemplate.class));
        this.dealStatus(lifeCycleTemplate, matchRule);
        DataTransferUtils.fill((String)"pc_lifecycletemplate", (String)"pc.manage.LifeCycleTemplate", (Object)lifeCycleTemplate, (int)ConvertTypeConstants.API_TYPE4);
        this.convertMaterialStatusMultilangText(lifeCycleTemplateVO, lifeCycleTemplate);
        BillDataDto billDataDto = new BillDataDto();
        billDataDto.setBillnum("pc_lifecycletemplate");
        billDataDto.setAction("save");
        billDataDto.setConvertType(ConvertTypeConstants.API_TYPE4);
        billDataDto.setFromApi(true);
        billDataDto.setData((Object)lifeCycleTemplate);
        RuleExecuteResult result = this.billService.executeUpdate("save", billDataDto);
        if (result != null) {
            lifeCycleTemplateVO.setId(((Map)result.getData()).get("id").toString());
            return lifeCycleTemplateVO;
        }
        return null;
    }

    private void dealStatus(LifeCycleTemplate lifeCycleTemplate, String matchRule) throws Exception {
        List lifeCycleTemplateList;
        QuerySchema schema;
        QueryConditionGroup condition;
        if (!"id".equals(matchRule)) {
            condition = QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"code").eq((Object)lifeCycleTemplate.getCode())});
            schema = QuerySchema.create().addSelect("id").addCondition((ConditionExpression)condition);
            lifeCycleTemplateList = MetaDaoHelper.queryObject((String)"pc.manage.LifeCycleTemplate", (boolean)true, (QuerySchema)schema, null);
            if (!CollectionUtils.isEmpty((Collection)lifeCycleTemplateList)) {
                lifeCycleTemplate.setId(((LifeCycleTemplate)lifeCycleTemplateList.get(0)).getId());
                lifeCycleTemplate.setEntityStatus(EntityStatus.Update);
            } else {
                lifeCycleTemplate.setEntityStatus(EntityStatus.Insert);
            }
        } else if (lifeCycleTemplate != null && lifeCycleTemplate.getId() != null && !"".equals(lifeCycleTemplate.getId())) {
            condition = QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"id").eq(lifeCycleTemplate.getId())});
            schema = QuerySchema.create().addSelect("id").addCondition((ConditionExpression)condition);
            lifeCycleTemplateList = MetaDaoHelper.queryObject((String)"pc.manage.LifeCycleTemplate", (boolean)true, (QuerySchema)schema, null);
            if (!CollectionUtils.isEmpty((Collection)lifeCycleTemplateList)) {
                lifeCycleTemplate.setId(((LifeCycleTemplate)lifeCycleTemplateList.get(0)).getId());
                lifeCycleTemplate.setEntityStatus(EntityStatus.Update);
            } else {
                lifeCycleTemplate.setEntityStatus(EntityStatus.Insert);
            }
        } else {
            lifeCycleTemplate.setEntityStatus(EntityStatus.Insert);
        }
        if (null != lifeCycleTemplate.get("lifeCycleDetail")) {
            for (LifeCycleDetail lifeCycleDetail : lifeCycleTemplate.lifeCycleDetail()) {
                lifeCycleDetail.set("_status", lifeCycleTemplate.get("_status"));
                lifeCycleDetail.set("materialStatusCode", lifeCycleDetail.get("materialStatusId___code"));
            }
        }
    }

    private void convertMaterialStatusMultilangText(LifeCycleTemplateVO lifeCycleTemplateVO, LifeCycleTemplate lifeCycleTemplate) {
        if (lifeCycleTemplateVO.getName() != null && lifeCycleTemplateVO.getName() instanceof MultiLangText) {
            lifeCycleTemplate.put("name", (Object)BizObject.fromMap(new HashMap(lifeCycleTemplateVO.getName().toMap())));
        }
    }
}


/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.alibaba.fastjson.JSON
 *  com.yonyou.iuap.apdoc.coredoc.enums.CoreExtrateBusinessErrorEnum
 *  com.yonyou.iuap.apdoc.coredoc.exceptions.CoreDocBusinessException
 *  com.yonyou.iuap.apdoc.coredoc.vo.materiallifecycle.MaterialStatusVO
 *  com.yonyou.iuap.international.MultiLangText
 *  com.yonyou.ucf.mdd.common.model.rule.RuleExecuteResult
 *  com.yonyou.ucf.mdd.ext.bill.dto.BillDataDto
 *  com.yonyou.ucf.mdd.ext.dao.meta.MetaDaoHelper
 *  com.yonyou.ucf.mdd.ext.data.fill.DataTransferUtils
 *  com.yonyoucloud.upc.constants.ConvertTypeConstants
 *  com.yonyoucloud.upc.pc.manage.MaterialStatus
 *  com.yonyoucloud.upc.pc.manage.MaterialStatusDetail
 *  com.yonyoucloud.upc.pc.manage.MaterialStatusDetailAction
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
import com.yonyou.iuap.apdoc.coredoc.vo.materiallifecycle.MaterialStatusVO;
import com.yonyou.iuap.coredoc.service.material.MaterialStatusAPIService;
import com.yonyou.iuap.international.MultiLangText;
import com.yonyou.ucf.mdd.common.model.rule.RuleExecuteResult;
import com.yonyou.ucf.mdd.ext.bill.dto.BillDataDto;
import com.yonyou.ucf.mdd.ext.dao.meta.MetaDaoHelper;
import com.yonyou.ucf.mdd.ext.data.fill.DataTransferUtils;
import com.yonyoucloud.iuap.upc.api.service.IUPCBillService;
import com.yonyoucloud.upc.constants.ConvertTypeConstants;
import com.yonyoucloud.upc.pc.manage.MaterialStatus;
import com.yonyoucloud.upc.pc.manage.MaterialStatusDetail;
import com.yonyoucloud.upc.pc.manage.MaterialStatusDetailAction;
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
public class MaterialStatusAPIServiceImpl
implements MaterialStatusAPIService {
    @Autowired
    @Qualifier(value="pc.BillService")
    private IUPCBillService billService;

    @Override
    public MaterialStatusVO materialStatusSaveForApi(MaterialStatusVO materialStatusVO, Integer convertType, String matchRule) throws Exception {
        if (null == materialStatusVO) {
            throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_801417);
        }
        MaterialStatus materialStatus = new MaterialStatus();
        materialStatus.put("_fromApi", (Object)true);
        materialStatus.init((Map)JSON.parseObject((String)JSON.toJSONString((Object)materialStatusVO), MaterialStatus.class));
        this.dealStatus(materialStatus, matchRule);
        DataTransferUtils.fill((String)"pc_materialstatus", (String)"pc.manage.MaterialStatus", (Object)materialStatus, (int)ConvertTypeConstants.API_TYPE4);
        this.convertMaterialStatusMultilangText(materialStatusVO, materialStatus);
        BillDataDto billDataDto = new BillDataDto();
        billDataDto.setBillnum("pc_materialstatus");
        billDataDto.setAction("save");
        billDataDto.setConvertType(ConvertTypeConstants.API_TYPE4);
        billDataDto.setFromApi(true);
        billDataDto.setData((Object)materialStatus);
        RuleExecuteResult result = this.billService.executeUpdate("save", billDataDto);
        if (result != null) {
            materialStatusVO.setId(((Map)result.getData()).get("id").toString());
            return materialStatusVO;
        }
        return null;
    }

    private void dealStatus(MaterialStatus materialStatus, String matchRule) throws Exception {
        List materialStatusList;
        QuerySchema schema;
        QueryConditionGroup condition;
        if (!"id".equals(matchRule)) {
            condition = QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"code").eq((Object)materialStatus.getCode())});
            schema = QuerySchema.create().addSelect("id").addCondition((ConditionExpression)condition);
            materialStatusList = MetaDaoHelper.queryObject((String)"pc.manage.MaterialStatus", (boolean)true, (QuerySchema)schema, null);
            if (!CollectionUtils.isEmpty((Collection)materialStatusList)) {
                materialStatus.setId(((MaterialStatus)materialStatusList.get(0)).getId());
                materialStatus.setEntityStatus(EntityStatus.Update);
            } else {
                materialStatus.setEntityStatus(EntityStatus.Insert);
            }
        } else if (materialStatus != null && materialStatus.getId() != null && !"".equals(materialStatus.getId())) {
            condition = QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"id").eq(materialStatus.getId())});
            schema = QuerySchema.create().addSelect("id").addCondition((ConditionExpression)condition);
            materialStatusList = MetaDaoHelper.queryObject((String)"pc.manage.MaterialStatus", (boolean)true, (QuerySchema)schema, null);
            if (!CollectionUtils.isEmpty((Collection)materialStatusList)) {
                materialStatus.setId(((MaterialStatus)materialStatusList.get(0)).getId());
                materialStatus.setEntityStatus(EntityStatus.Update);
            } else {
                materialStatus.setEntityStatus(EntityStatus.Insert);
            }
        } else {
            materialStatus.setEntityStatus(EntityStatus.Insert);
        }
        if (null != materialStatus.get("materialStatusDetail")) {
            for (MaterialStatusDetail materialStatusDetail : materialStatus.materialStatusDetail()) {
                materialStatusDetail.set("_status", materialStatus.get("_status"));
                if (null == materialStatusDetail.get("materialStatusDetailAction")) continue;
                for (MaterialStatusDetailAction materialStatusDetailAction : materialStatusDetail.materialStatusDetailAction()) {
                    materialStatusDetailAction.set("_status", materialStatus.get("_status"));
                }
            }
        }
    }

    private void convertMaterialStatusMultilangText(MaterialStatusVO materialStatusVO, MaterialStatus materialStatus) {
        if (materialStatusVO.getName() != null && materialStatusVO.getName() instanceof MultiLangText) {
            materialStatus.put("name", (Object)BizObject.fromMap(new HashMap(materialStatusVO.getName().toMap())));
        }
    }
}


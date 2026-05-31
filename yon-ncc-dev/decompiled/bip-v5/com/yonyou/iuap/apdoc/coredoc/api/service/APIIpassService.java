/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.yonyou.iuap.apdoc.coredoc.dto.keymapping.UpcAPiTool
 *  com.yonyou.iuap.apdoc.coredoc.po.pub.PubCommonVO
 *  com.yonyou.iuap.yms.common.utils.JacksonUtils
 *  com.yonyou.ucf.mdd.common.model.rule.RuleExecuteResult
 *  com.yonyou.ucf.mdd.ext.api.service.ApiImportCommandService
 *  com.yonyou.ucf.mdd.ext.bill.biz.BillBiz
 *  com.yonyou.ucf.mdd.ext.bill.dto.BillDataDto
 *  com.yonyou.ucf.mdd.ext.dao.meta.MetaDaoHelper
 *  com.yonyou.ucf.mdd.ext.data.fill.DataTransferUtils
 *  org.imeta.orm.base.BizObject
 *  org.imeta.orm.base.EntityStatus
 *  org.imeta.orm.schema.ConditionExpression
 *  org.imeta.orm.schema.QueryCondition
 *  org.imeta.orm.schema.QueryConditionGroup
 *  org.imeta.orm.schema.QuerySchema
 *  org.springframework.beans.factory.annotation.Autowired
 *  org.springframework.stereotype.Service
 *  org.springframework.util.CollectionUtils
 *  org.springframework.util.StringUtils
 */
package com.yonyou.iuap.apdoc.coredoc.api.service;

import com.yonyou.iuap.apdoc.coredoc.dto.keymapping.UpcAPiTool;
import com.yonyou.iuap.apdoc.coredoc.po.pub.PubCommonVO;
import com.yonyou.iuap.yms.common.utils.JacksonUtils;
import com.yonyou.ucf.mdd.common.model.rule.RuleExecuteResult;
import com.yonyou.ucf.mdd.ext.api.service.ApiImportCommandService;
import com.yonyou.ucf.mdd.ext.bill.biz.BillBiz;
import com.yonyou.ucf.mdd.ext.bill.dto.BillDataDto;
import com.yonyou.ucf.mdd.ext.dao.meta.MetaDaoHelper;
import com.yonyou.ucf.mdd.ext.data.fill.DataTransferUtils;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import org.imeta.orm.base.BizObject;
import org.imeta.orm.base.EntityStatus;
import org.imeta.orm.schema.ConditionExpression;
import org.imeta.orm.schema.QueryCondition;
import org.imeta.orm.schema.QueryConditionGroup;
import org.imeta.orm.schema.QuerySchema;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;
import org.springframework.util.StringUtils;

@Service
public class APIIpassService {
    @Autowired
    private ApiImportCommandService apiImportSingleService;

    public Long pubSave(String matchRule, PubCommonVO pubCommonVO, String bullnum, String entityName, String unionField) throws Exception {
        Long id = 0L;
        BizObject bizObject = this.convertBizObject(matchRule, pubCommonVO);
        DataTransferUtils.fill((String)bullnum, (String)entityName, (Object)bizObject, (int)4);
        this.dataPreprocessing(matchRule, bizObject, unionField, entityName);
        bizObject.put("_fromApi", (Object)true);
        BillDataDto billDataDto = UpcAPiTool.builderBillData((String)bullnum, (Object)bizObject, (boolean)true, (int)4);
        Object result = this.apiImportSingleService.singleSave4Api(billDataDto);
        if (result != null) {
            id = (Long)((BizObject)result).getId();
        }
        return id;
    }

    public void dataPreprocessing(String matchRule, BizObject bizObject, String unionField, String entityName) throws Exception {
        if (!"id".equals(matchRule)) {
            QueryConditionGroup condition = QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)unionField).eq(bizObject.get(unionField))});
            QuerySchema schema = QuerySchema.create().addSelect("id").addCondition((ConditionExpression)condition);
            List bizObjectList = MetaDaoHelper.query((String)entityName, (boolean)true, (QuerySchema)schema, null);
            if (!CollectionUtils.isEmpty((Collection)bizObjectList)) {
                bizObject.setId(((Map)bizObjectList.get(0)).get("id"));
                bizObject.setEntityStatus(EntityStatus.Update);
            } else {
                bizObject.setEntityStatus(EntityStatus.Insert);
            }
        } else if (bizObject != null && bizObject.getId() != null && !"".equals(bizObject.getId())) {
            QueryConditionGroup condition = QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"id").eq(bizObject.getId())});
            QuerySchema schema = QuerySchema.create().addSelect("id").addCondition((ConditionExpression)condition);
            List bizObjectList = MetaDaoHelper.query((String)entityName, (boolean)true, (QuerySchema)schema, null);
            if (!CollectionUtils.isEmpty((Collection)bizObjectList)) {
                bizObject.setId(((Map)bizObjectList.get(0)).get("id"));
                bizObject.setEntityStatus(EntityStatus.Update);
            } else {
                bizObject.setEntityStatus(EntityStatus.Insert);
            }
        } else {
            bizObject.setEntityStatus(EntityStatus.Insert);
        }
        this.extendPreprocessing(bizObject);
    }

    public String pubDelete(String id, String code, String fieldString, String entityName, String billnum) throws Exception {
        if (!StringUtils.hasLength((String)id) && !StringUtils.hasLength((String)code)) {
            return null;
        }
        QueryConditionGroup queryConditionGroup = new QueryConditionGroup();
        if (StringUtils.hasLength((String)id)) {
            queryConditionGroup.addCondition((ConditionExpression)QueryCondition.name((String)"id").eq((Object)Long.parseLong(id)));
        } else if (StringUtils.hasLength((String)code)) {
            queryConditionGroup.addCondition((ConditionExpression)QueryCondition.name((String)"code").eq((Object)code));
        }
        QuerySchema schema = QuerySchema.create().addSelect(fieldString).addCondition((ConditionExpression)queryConditionGroup);
        List bizObjectList = MetaDaoHelper.query((String)entityName, (QuerySchema)schema, null);
        if (CollectionUtils.isEmpty((Collection)bizObjectList)) {
            return null;
        }
        BillDataDto bill = new BillDataDto();
        bill.setData((Object)bizObjectList);
        bill.setBillnum(billnum);
        RuleExecuteResult result = BillBiz.delete((BillDataDto)bill);
        if (!CollectionUtils.isEmpty((Collection)result.getMessages())) {
            return result.getMessages().get(0).toString();
        }
        return null;
    }

    public void extendPreprocessing(BizObject bizObject) throws Exception {
    }

    public BizObject convertBizObject(String matchRule, PubCommonVO pubCommonVO) {
        BizObject bizObject = (BizObject)JacksonUtils.parseObject((String)JacksonUtils.toJSONString((Object)pubCommonVO), BizObject.class);
        return bizObject;
    }
}


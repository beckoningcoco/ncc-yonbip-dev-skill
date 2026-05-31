/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.alibaba.fastjson.JSON
 *  com.yonyou.iuap.apdoc.coredoc.dto.keymapping.UpcAPiTool
 *  com.yonyou.iuap.apdoc.coredoc.enums.CoreDocBusinessErrorEnum
 *  com.yonyou.iuap.apdoc.coredoc.exceptions.CoreDocBusinessException
 *  com.yonyou.iuap.apdoc.coredoc.po.pub.BatchApiQueryParamWithOrg
 *  com.yonyou.iuap.apdoc.coredoc.vo.materialcls.PlanClassVO
 *  com.yonyou.iuap.international.MultiLangText
 *  com.yonyou.ucf.mdd.common.model.rule.RuleExecuteResult
 *  com.yonyou.ucf.mdd.ext.api.service.ApiImportCommandService
 *  com.yonyou.ucf.mdd.ext.bill.biz.BillBiz
 *  com.yonyou.ucf.mdd.ext.bill.dto.BillDataDto
 *  com.yonyou.ucf.mdd.ext.core.AppContext
 *  com.yonyou.ucf.mdd.ext.dao.meta.MetaDaoHelper
 *  com.yonyoucloud.upc.pc.cls.PlanClass
 *  com.yonyoucloud.upc.utils.CoreDocJsonResult
 *  org.imeta.orm.base.EntityStatus
 *  org.imeta.orm.schema.ConditionExpression
 *  org.imeta.orm.schema.QueryCondition
 *  org.imeta.orm.schema.QueryConditionGroup
 *  org.imeta.orm.schema.QuerySchema
 *  org.slf4j.Logger
 *  org.slf4j.LoggerFactory
 *  org.springframework.beans.factory.annotation.Autowired
 *  org.springframework.stereotype.Service
 *  org.springframework.util.CollectionUtils
 *  org.springframework.util.ObjectUtils
 *  org.springframework.util.StringUtils
 */
package com.yonyoucloud.upc.service.api;

import com.alibaba.fastjson.JSON;
import com.yonyou.iuap.apdoc.coredoc.dto.keymapping.UpcAPiTool;
import com.yonyou.iuap.apdoc.coredoc.enums.CoreDocBusinessErrorEnum;
import com.yonyou.iuap.apdoc.coredoc.exceptions.CoreDocBusinessException;
import com.yonyou.iuap.apdoc.coredoc.po.pub.BatchApiQueryParamWithOrg;
import com.yonyou.iuap.apdoc.coredoc.vo.materialcls.PlanClassVO;
import com.yonyou.iuap.international.MultiLangText;
import com.yonyou.ucf.mdd.common.model.rule.RuleExecuteResult;
import com.yonyou.ucf.mdd.ext.api.service.ApiImportCommandService;
import com.yonyou.ucf.mdd.ext.bill.biz.BillBiz;
import com.yonyou.ucf.mdd.ext.bill.dto.BillDataDto;
import com.yonyou.ucf.mdd.ext.core.AppContext;
import com.yonyou.ucf.mdd.ext.dao.meta.MetaDaoHelper;
import com.yonyoucloud.iuap.ipass.utils.IPassServiceUtils;
import com.yonyoucloud.upc.pc.cls.PlanClass;
import com.yonyoucloud.upc.utils.CoreDocJsonResult;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import org.imeta.orm.base.EntityStatus;
import org.imeta.orm.schema.ConditionExpression;
import org.imeta.orm.schema.QueryCondition;
import org.imeta.orm.schema.QueryConditionGroup;
import org.imeta.orm.schema.QuerySchema;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;
import org.springframework.util.ObjectUtils;
import org.springframework.util.StringUtils;

@Service
public class PlanClassServiceImpl {
    private static final Logger log = LoggerFactory.getLogger(PlanClassServiceImpl.class);
    @Autowired
    private ApiImportCommandService apiImportSingleService;

    public CoreDocJsonResult<PlanClassVO> queryPlanClass(BatchApiQueryParamWithOrg batchApiQueryParamWithOrg) throws Exception {
        CoreDocJsonResult coreDocJsonResult;
        int recordCount = IPassServiceUtils.getRecordsCount(batchApiQueryParamWithOrg, "pc.cls.PlanClass");
        if (recordCount > 0) {
            if (batchApiQueryParamWithOrg.getPageSize() > (long)UpcAPiTool.PAGE_MAX_SIZE.intValue()) {
                batchApiQueryParamWithOrg.setPageSize((long)UpcAPiTool.PAGE_MAX_SIZE.intValue());
            }
            QuerySchema schema = QuerySchema.create().addSelect("id,code,name,remark,order,erpCode,stopstatus,parent,parent.code as parent___code,parent.name as parent___name,level,isEnd").addCondition((ConditionExpression)IPassServiceUtils.getQueryConditionGroup(batchApiQueryParamWithOrg)).addPager(Long.valueOf(batchApiQueryParamWithOrg.getPageIndex()).intValue(), Long.valueOf(batchApiQueryParamWithOrg.getPageSize()).intValue());
            List planClassList = MetaDaoHelper.queryObject((String)"pc.cls.PlanClass", (boolean)true, (QuerySchema)schema, null);
            ArrayList<PlanClassVO> planClassVOList = new ArrayList<PlanClassVO>();
            for (PlanClass planClass : planClassList) {
                PlanClassVO planClassVO = (PlanClassVO)JSON.parseObject((String)JSON.toJSONString((Object)planClass), PlanClassVO.class);
                if (planClass.get("name") != null) {
                    planClassVO.setName(new MultiLangText((Map)planClass.get("name")));
                }
                if (planClass.get("remark") != null) {
                    planClassVO.setRemark(new MultiLangText((Map)planClass.get("remark")));
                }
                planClassVOList.add(planClassVO);
            }
            coreDocJsonResult = CoreDocJsonResult.success(planClassVOList);
        } else {
            coreDocJsonResult = CoreDocJsonResult.success(null);
        }
        coreDocJsonResult.setTotalCount(Integer.valueOf(recordCount));
        return coreDocJsonResult;
    }

    public Long planClassSave(String matchRule, PlanClassVO planClassVO) throws Exception {
        Long id = 0L;
        PlanClass planClass = this.convertPlanClass(matchRule, planClassVO);
        this.dataPreprocessing(matchRule, planClass);
        planClass.put("_fromApi", (Object)true);
        BillDataDto billDataDto = UpcAPiTool.builderBillData((String)"pc_planclass", (Object)planClass, (boolean)true, (int)4);
        Object result = this.apiImportSingleService.singleSave4Api(billDataDto);
        if (result != null) {
            id = (Long)((PlanClass)result).getId();
        }
        return id;
    }

    private void dataPreprocessing(String matchRule, PlanClass planClass) throws Exception {
        if (!"id".equals(matchRule)) {
            QueryConditionGroup condition = QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"code").eq((Object)planClass.getCode())});
            QuerySchema schema = QuerySchema.create().addSelect("id").addCondition((ConditionExpression)condition);
            List planClassList = MetaDaoHelper.queryObject((String)"pc.cls.PlanClass", (boolean)true, (QuerySchema)schema, null);
            if (!CollectionUtils.isEmpty((Collection)planClassList)) {
                planClass.setId(((PlanClass)planClassList.get(0)).getId());
                planClass.setEntityStatus(EntityStatus.Update);
            } else {
                planClass.setEntityStatus(EntityStatus.Insert);
                if (planClass.getStopstatus() == null) {
                    planClass.setStopstatus(Boolean.valueOf(false));
                }
            }
        } else if (planClass != null && planClass.getId() != null && !"".equals(planClass.getId())) {
            QueryConditionGroup condition = QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"id").eq(planClass.getId())});
            QuerySchema schema = QuerySchema.create().addSelect("id").addCondition((ConditionExpression)condition);
            List planClassList = MetaDaoHelper.queryObject((String)"pc.cls.PlanClass", (boolean)true, (QuerySchema)schema, null);
            if (!CollectionUtils.isEmpty((Collection)planClassList)) {
                planClass.setId(((PlanClass)planClassList.get(0)).getId());
                planClass.setEntityStatus(EntityStatus.Update);
            } else {
                planClass.setEntityStatus(EntityStatus.Insert);
                if (planClass.getStopstatus() == null) {
                    planClass.setStopstatus(Boolean.valueOf(false));
                }
            }
        } else {
            planClass.setEntityStatus(EntityStatus.Insert);
            if (planClass.getStopstatus() == null) {
                planClass.setStopstatus(Boolean.valueOf(false));
            }
        }
    }

    private PlanClass convertPlanClass(String matchRule, PlanClassVO planClassVO) {
        PlanClass planClass = (PlanClass)JSON.parseObject((String)JSON.toJSONString((Object)planClassVO), PlanClass.class);
        if (ObjectUtils.isEmpty((Object)planClassVO.getName())) {
            throw new CoreDocBusinessException(CoreDocBusinessErrorEnum.CUSTOMER_TRADE_NAME_NOT_NULL);
        }
        planClass.set("name", (Object)planClassVO.getName().toMap());
        if (!ObjectUtils.isEmpty((Object)planClassVO.getRemark())) {
            planClass.set("remark", (Object)planClassVO.getRemark().toMap());
        }
        if (planClassVO.getParent() != null && !"".equals(planClassVO.getParent())) {
            planClass.setParent(planClassVO.getParent());
            planClass.remove("parent___code");
        } else if (!StringUtils.isEmpty((Object)planClassVO.getParent___code())) {
            planClass.set("parent___code", (Object)planClassVO.getParent___code());
        }
        return planClass;
    }

    public String delete(String planClassId, String planClassCode) throws Exception {
        if (!StringUtils.hasLength((String)planClassId) && !StringUtils.hasLength((String)planClassCode)) {
            return null;
        }
        QueryConditionGroup queryConditionGroup = QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"ytenant").eq((Object)AppContext.getCurrentUser().getYTenantId())});
        if (StringUtils.hasLength((String)planClassId)) {
            queryConditionGroup.addCondition((ConditionExpression)QueryCondition.name((String)"id").eq((Object)Long.parseLong(planClassId)));
        } else if (StringUtils.hasLength((String)planClassCode)) {
            queryConditionGroup.addCondition((ConditionExpression)QueryCondition.name((String)"code").eq((Object)planClassCode));
        }
        QuerySchema schema = QuerySchema.create().addSelect("id,code,name,remark,order,stopstatus,parent,isEnd").addCondition((ConditionExpression)queryConditionGroup);
        List planClassList = MetaDaoHelper.queryObject((String)"pc.cls.PlanClass", (QuerySchema)schema, null);
        if (CollectionUtils.isEmpty((Collection)planClassList)) {
            return null;
        }
        BillDataDto bill = new BillDataDto();
        bill.setData((Object)planClassList);
        bill.setBillnum("pc_planclasslist");
        RuleExecuteResult result = BillBiz.delete((BillDataDto)bill);
        if (!CollectionUtils.isEmpty((Collection)result.getMessages())) {
            return result.getMessages().get(0).toString();
        }
        return null;
    }
}


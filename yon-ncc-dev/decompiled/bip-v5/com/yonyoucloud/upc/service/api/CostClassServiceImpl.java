/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.alibaba.fastjson.JSON
 *  com.yonyou.iuap.apdoc.coredoc.dto.keymapping.UpcAPiTool
 *  com.yonyou.iuap.apdoc.coredoc.enums.CoreDocBusinessErrorEnum
 *  com.yonyou.iuap.apdoc.coredoc.exceptions.CoreDocBusinessException
 *  com.yonyou.iuap.apdoc.coredoc.po.pub.BatchApiQueryParamWithOrg
 *  com.yonyou.iuap.apdoc.coredoc.vo.materialcls.CostClassVO
 *  com.yonyou.iuap.international.MultiLangText
 *  com.yonyou.ucf.mdd.common.model.rule.RuleExecuteResult
 *  com.yonyou.ucf.mdd.ext.api.service.ApiImportCommandService
 *  com.yonyou.ucf.mdd.ext.bill.biz.BillBiz
 *  com.yonyou.ucf.mdd.ext.bill.dto.BillDataDto
 *  com.yonyou.ucf.mdd.ext.core.AppContext
 *  com.yonyou.ucf.mdd.ext.dao.meta.MetaDaoHelper
 *  com.yonyou.ucf.mdd.ext.data.fill.DataTransferUtils
 *  com.yonyoucloud.upc.pc.cls.CostClass
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
import com.yonyou.iuap.apdoc.coredoc.vo.materialcls.CostClassVO;
import com.yonyou.iuap.international.MultiLangText;
import com.yonyou.ucf.mdd.common.model.rule.RuleExecuteResult;
import com.yonyou.ucf.mdd.ext.api.service.ApiImportCommandService;
import com.yonyou.ucf.mdd.ext.bill.biz.BillBiz;
import com.yonyou.ucf.mdd.ext.bill.dto.BillDataDto;
import com.yonyou.ucf.mdd.ext.core.AppContext;
import com.yonyou.ucf.mdd.ext.dao.meta.MetaDaoHelper;
import com.yonyou.ucf.mdd.ext.data.fill.DataTransferUtils;
import com.yonyoucloud.iuap.ipass.utils.IPassServiceUtils;
import com.yonyoucloud.iuap.upc.api.service.IUPCControlRuleService;
import com.yonyoucloud.upc.pc.cls.CostClass;
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
public class CostClassServiceImpl {
    private static final Logger log = LoggerFactory.getLogger(CostClassServiceImpl.class);
    @Autowired
    private ApiImportCommandService apiImportSingleService;
    @Autowired
    private IUPCControlRuleService upcControlRuleService;

    public CoreDocJsonResult<CostClassVO> queryCostClass(BatchApiQueryParamWithOrg batchApiQueryParamWithOrg) throws Exception {
        CoreDocJsonResult coreDocJsonResult;
        int recordCount = IPassServiceUtils.getRecordsCount(batchApiQueryParamWithOrg, "pc.cls.CostClass");
        if (recordCount > 0) {
            if (batchApiQueryParamWithOrg.getPageSize() > (long)UpcAPiTool.PAGE_MAX_SIZE.intValue()) {
                batchApiQueryParamWithOrg.setPageSize((long)UpcAPiTool.PAGE_MAX_SIZE.intValue());
            }
            QuerySchema schema = QuerySchema.create().addSelect("id,code,name,remark,erpCode,stopstatus,parent,parent.code as parent___code,parent.name as parent___name,orgId,orgId.code as orgId___code,orgId.name as orgId___name,level,isEnd").addCondition((ConditionExpression)IPassServiceUtils.getQueryConditionGroup(batchApiQueryParamWithOrg)).addPager(Long.valueOf(batchApiQueryParamWithOrg.getPageIndex()).intValue(), Long.valueOf(batchApiQueryParamWithOrg.getPageSize()).intValue());
            List costClassList = MetaDaoHelper.queryObject((String)"pc.cls.CostClass", (boolean)true, (QuerySchema)schema, null);
            ArrayList<CostClassVO> costClassVOList = new ArrayList<CostClassVO>();
            for (CostClass costClass : costClassList) {
                CostClassVO costClassVO = (CostClassVO)JSON.parseObject((String)JSON.toJSONString((Object)costClass), CostClassVO.class);
                if (costClass.get("name") != null) {
                    costClassVO.setName(new MultiLangText((Map)costClass.get("name")));
                }
                if (costClass.get("remark") != null) {
                    costClassVO.setRemark(new MultiLangText((Map)costClass.get("remark")));
                }
                costClassVOList.add(costClassVO);
            }
            coreDocJsonResult = CoreDocJsonResult.success(costClassVOList);
        } else {
            coreDocJsonResult = CoreDocJsonResult.success(null);
        }
        coreDocJsonResult.setTotalCount(Integer.valueOf(recordCount));
        return coreDocJsonResult;
    }

    public Long costClassSave(String matchRule, CostClassVO costClassVO) throws Exception {
        Long id = 0L;
        CostClass costClass = this.convertCostClass(matchRule, costClassVO);
        DataTransferUtils.fill((String)"pc_costclass", (String)"pc.cls.CostClass", (Object)costClass, (int)4);
        this.dataPreprocessing(matchRule, costClass);
        costClass.put("_fromApi", (Object)true);
        BillDataDto billDataDto = UpcAPiTool.builderBillData((String)"pc_costclass", (Object)costClass, (boolean)true, (int)4);
        Object result = this.apiImportSingleService.singleSave4Api(billDataDto);
        if (result != null) {
            id = (Long)((CostClass)result).getId();
        }
        return id;
    }

    private void dataPreprocessing(String matchRule, CostClass costClass) throws Exception {
        List<String> orgIds;
        List costClassList;
        QuerySchema schema;
        QueryConditionGroup condition;
        if (!"id".equals(matchRule)) {
            condition = QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"code").eq((Object)costClass.getCode())});
            schema = QuerySchema.create().addSelect("id").addCondition((ConditionExpression)condition);
            costClassList = MetaDaoHelper.queryObject((String)"pc.cls.CostClass", (boolean)true, (QuerySchema)schema, null);
            if (!CollectionUtils.isEmpty((Collection)costClassList)) {
                costClass.setId(((CostClass)costClassList.get(0)).getId());
                costClass.setEntityStatus(EntityStatus.Update);
            } else {
                costClass.setEntityStatus(EntityStatus.Insert);
                if (costClass.getStopstatus() == null) {
                    costClass.setStopstatus(Boolean.valueOf(false));
                }
            }
        } else if (costClass != null && costClass.getId() != null && !"".equals(costClass.getId())) {
            condition = QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"id").eq(costClass.getId())});
            schema = QuerySchema.create().addSelect("id").addCondition((ConditionExpression)condition);
            costClassList = MetaDaoHelper.queryObject((String)"pc.cls.CostClass", (boolean)true, (QuerySchema)schema, null);
            if (!CollectionUtils.isEmpty((Collection)costClassList)) {
                costClass.setId(((CostClass)costClassList.get(0)).getId());
                costClass.setEntityStatus(EntityStatus.Update);
            } else {
                costClass.setEntityStatus(EntityStatus.Insert);
                if (costClass.getStopstatus() == null) {
                    costClass.setStopstatus(Boolean.valueOf(false));
                }
            }
        } else {
            costClass.setEntityStatus(EntityStatus.Insert);
            if (costClass.getStopstatus() == null) {
                costClass.setStopstatus(Boolean.valueOf(false));
            }
        }
        Boolean singleOrg = this.upcControlRuleService.checkSingleOrg();
        if (!(ObjectUtils.isEmpty((Object)costClass.getOrgId()) || singleOrg.booleanValue() || !ObjectUtils.isEmpty(orgIds = this.upcControlRuleService.getUserOrgAndVoucherManageOrg("pc.cls.CostClass", "pc_costclass")) && orgIds.contains(costClass.getOrgId()))) {
            String msg = costClass.getOrgId();
            if (costClass.get("orgId___code") != null) {
                msg = costClass.get("orgId___code").toString();
            }
            throw new CoreDocBusinessException(CoreDocBusinessErrorEnum.MANAGE_ORG_MC_FILTER_CHECK, new Object[]{msg});
        }
    }

    private CostClass convertCostClass(String matchRule, CostClassVO costClassVO) {
        CostClass costClass = (CostClass)JSON.parseObject((String)JSON.toJSONString((Object)costClassVO), CostClass.class);
        if (ObjectUtils.isEmpty((Object)costClassVO.getName())) {
            throw new CoreDocBusinessException(CoreDocBusinessErrorEnum.NAME_NOT_NULL);
        }
        costClass.set("name", (Object)costClassVO.getName().toMap());
        if (!ObjectUtils.isEmpty((Object)costClassVO.getRemark())) {
            costClass.set("remark", (Object)costClassVO.getRemark().toMap());
        }
        if (StringUtils.hasLength((String)costClassVO.getOrgId())) {
            costClass.setOrgId(costClassVO.getOrgId());
            costClass.remove("orgId___code");
        } else if (!StringUtils.isEmpty((Object)costClassVO.getOrgId___code())) {
            costClass.set("orgId___code", (Object)costClassVO.getOrgId___code());
        }
        if (costClass.getParent() != null && !"".equals(costClass.getParent())) {
            costClass.setParent((Object)costClassVO.getParent());
            costClass.remove("parent___code");
        } else if (!StringUtils.isEmpty((Object)costClassVO.getParent___code())) {
            costClass.set("parent___code", (Object)costClassVO.getParent___code());
        }
        return costClass;
    }

    public String delete(String costClassId, String costClassCode) throws Exception {
        if (!StringUtils.hasLength((String)costClassId) && !StringUtils.hasLength((String)costClassCode)) {
            return null;
        }
        QueryConditionGroup queryConditionGroup = QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"ytenant").eq((Object)AppContext.getCurrentUser().getYTenantId())});
        if (StringUtils.hasLength((String)costClassId)) {
            queryConditionGroup.addCondition((ConditionExpression)QueryCondition.name((String)"id").eq((Object)Long.parseLong(costClassId)));
        } else if (StringUtils.hasLength((String)costClassCode)) {
            queryConditionGroup.addCondition((ConditionExpression)QueryCondition.name((String)"code").eq((Object)costClassCode));
        }
        QuerySchema schema = QuerySchema.create().addSelect("id,code,name,remark,stopstatus,parent,orgId,isEnd").addCondition((ConditionExpression)queryConditionGroup);
        List costClassList = MetaDaoHelper.queryObject((String)"pc.cls.CostClass", (QuerySchema)schema, null);
        if (CollectionUtils.isEmpty((Collection)costClassList)) {
            return null;
        }
        BillDataDto bill = new BillDataDto();
        bill.setData((Object)costClassList);
        bill.setBillnum("pc_costclasslist");
        RuleExecuteResult result = BillBiz.delete((BillDataDto)bill);
        if (!CollectionUtils.isEmpty((Collection)result.getMessages())) {
            return result.getMessages().get(0).toString();
        }
        return null;
    }
}


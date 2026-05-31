/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.alibaba.fastjson.JSON
 *  com.yonyou.iuap.apdoc.coredoc.dto.keymapping.UpcAPiTool
 *  com.yonyou.iuap.apdoc.coredoc.enums.CoreDocBusinessErrorEnum
 *  com.yonyou.iuap.apdoc.coredoc.exceptions.CoreDocBusinessException
 *  com.yonyou.iuap.apdoc.coredoc.po.pub.BatchApiQueryParamWithOrg
 *  com.yonyou.iuap.apdoc.coredoc.vo.brand.BrandClassVO
 *  com.yonyou.iuap.international.MultiLangText
 *  com.yonyou.iuap.yms.common.utils.JacksonUtils
 *  com.yonyou.ucf.mdd.common.model.rule.RuleExecuteResult
 *  com.yonyou.ucf.mdd.ext.api.service.ApiImportCommandService
 *  com.yonyou.ucf.mdd.ext.bill.biz.BillBiz
 *  com.yonyou.ucf.mdd.ext.bill.dto.BillDataDto
 *  com.yonyou.ucf.mdd.ext.core.AppContext
 *  com.yonyou.ucf.mdd.ext.dao.meta.MetaDaoHelper
 *  com.yonyoucloud.upc.pc.brand.BrandClass
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
import com.yonyou.iuap.apdoc.coredoc.vo.brand.BrandClassVO;
import com.yonyou.iuap.international.MultiLangText;
import com.yonyou.iuap.yms.common.utils.JacksonUtils;
import com.yonyou.ucf.mdd.common.model.rule.RuleExecuteResult;
import com.yonyou.ucf.mdd.ext.api.service.ApiImportCommandService;
import com.yonyou.ucf.mdd.ext.bill.biz.BillBiz;
import com.yonyou.ucf.mdd.ext.bill.dto.BillDataDto;
import com.yonyou.ucf.mdd.ext.core.AppContext;
import com.yonyou.ucf.mdd.ext.dao.meta.MetaDaoHelper;
import com.yonyoucloud.iuap.ipass.utils.IPassServiceUtils;
import com.yonyoucloud.upc.pc.brand.BrandClass;
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
public class BrandClassServiceImpl {
    private static final Logger log = LoggerFactory.getLogger(BrandClassServiceImpl.class);
    @Autowired
    private ApiImportCommandService apiImportSingleService;

    public CoreDocJsonResult<BrandClassVO> queryBrandClass(BatchApiQueryParamWithOrg batchApiQueryParamWithOrg) throws Exception {
        CoreDocJsonResult coreDocJsonResult;
        int recordCount = IPassServiceUtils.getRecordsCount(batchApiQueryParamWithOrg, "pc.brand.BrandClass");
        if (recordCount > 0) {
            if (batchApiQueryParamWithOrg.getPageSize() > (long)UpcAPiTool.PAGE_MAX_SIZE.intValue()) {
                batchApiQueryParamWithOrg.setPageSize((long)UpcAPiTool.PAGE_MAX_SIZE.intValue());
            }
            QuerySchema schema = QuerySchema.create().addSelect("id,code,name,brandclassAbbr,stopstatus,erpCode").addCondition((ConditionExpression)IPassServiceUtils.getQueryConditionGroup(batchApiQueryParamWithOrg)).addPager(Long.valueOf(batchApiQueryParamWithOrg.getPageIndex()).intValue(), Long.valueOf(batchApiQueryParamWithOrg.getPageSize()).intValue());
            List brandClassList = MetaDaoHelper.queryObject((String)"pc.brand.BrandClass", (boolean)true, (QuerySchema)schema, null);
            ArrayList<BrandClassVO> brandClassVOList = new ArrayList<BrandClassVO>();
            for (BrandClass brandClass : brandClassList) {
                BrandClassVO brandClassVO = (BrandClassVO)JSON.parseObject((String)JSON.toJSONString((Object)brandClass), BrandClassVO.class);
                if (brandClass.get("name") != null) {
                    brandClassVO.setName(new MultiLangText((Map)brandClass.get("name")));
                }
                if (brandClass.get("brandclassAbbr") != null) {
                    brandClassVO.setBrandclassAbbr(new MultiLangText((Map)brandClass.get("brandclassAbbr")));
                }
                brandClassVOList.add(brandClassVO);
            }
            coreDocJsonResult = CoreDocJsonResult.success(brandClassVOList);
        } else {
            coreDocJsonResult = CoreDocJsonResult.success(null);
        }
        coreDocJsonResult.setTotalCount(Integer.valueOf(recordCount));
        return coreDocJsonResult;
    }

    public Long brandClassSave(String matchRule, BrandClassVO brandClassVO) throws Exception {
        Long id = 0L;
        BrandClass brandClass = this.convertBrandClass(matchRule, brandClassVO);
        this.dataPreprocessing(matchRule, brandClass);
        brandClass.put("_fromApi", (Object)true);
        BillDataDto billDataDto = UpcAPiTool.builderBillData((String)"pc_brandclass", (Object)brandClass, (boolean)true, (int)4);
        Object result = this.apiImportSingleService.singleSave4Api(billDataDto);
        if (result != null) {
            id = (Long)((BrandClass)result).getId();
        }
        return id;
    }

    private void dataPreprocessing(String matchRule, BrandClass brandClass) throws Exception {
        if (!"id".equals(matchRule)) {
            QueryConditionGroup condition = QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"code").eq((Object)brandClass.getCode())});
            QuerySchema schema = QuerySchema.create().addSelect("id").addCondition((ConditionExpression)condition);
            List brandClassList = MetaDaoHelper.queryObject((String)"pc.brand.BrandClass", (boolean)true, (QuerySchema)schema, null);
            if (!CollectionUtils.isEmpty((Collection)brandClassList)) {
                brandClass.setId(((BrandClass)brandClassList.get(0)).getId());
                brandClass.setEntityStatus(EntityStatus.Update);
            } else {
                brandClass.setEntityStatus(EntityStatus.Insert);
                if (brandClass.getStopstatus() == null) {
                    brandClass.setStopstatus(Boolean.valueOf(false));
                }
            }
        } else if (brandClass != null && brandClass.getId() != null && !"".equals(brandClass.getId())) {
            QueryConditionGroup condition = QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"id").eq(brandClass.getId())});
            QuerySchema schema = QuerySchema.create().addSelect("id").addCondition((ConditionExpression)condition);
            List brandClassList = MetaDaoHelper.queryObject((String)"pc.brand.BrandClass", (boolean)true, (QuerySchema)schema, null);
            if (!CollectionUtils.isEmpty((Collection)brandClassList)) {
                brandClass.setId(((BrandClass)brandClassList.get(0)).getId());
                brandClass.setEntityStatus(EntityStatus.Update);
            } else {
                brandClass.setEntityStatus(EntityStatus.Insert);
                if (brandClass.getStopstatus() == null) {
                    brandClass.setStopstatus(Boolean.valueOf(false));
                }
            }
        } else {
            brandClass.setEntityStatus(EntityStatus.Insert);
            if (brandClass.getStopstatus() == null) {
                brandClass.setStopstatus(Boolean.valueOf(false));
            }
        }
    }

    private BrandClass convertBrandClass(String matchRule, BrandClassVO brandClassVO) {
        BrandClass brandClass = (BrandClass)JacksonUtils.parseObject((String)JacksonUtils.toJSONString((Object)brandClassVO), BrandClass.class);
        if (ObjectUtils.isEmpty((Object)brandClassVO.getName())) {
            throw new CoreDocBusinessException(CoreDocBusinessErrorEnum.NAME_NOT_NULL);
        }
        brandClass.set("name", (Object)brandClassVO.getName().toMap());
        if (!ObjectUtils.isEmpty((Object)brandClassVO.getBrandclassAbbr())) {
            brandClass.set("brandclassAbbr", (Object)brandClassVO.getBrandclassAbbr().toMap());
        }
        return brandClass;
    }

    public String deleteBrandClass(String brandClassId, String brandClassCode) throws Exception {
        if (!StringUtils.hasLength((String)brandClassId) && !StringUtils.hasLength((String)brandClassCode)) {
            return null;
        }
        QueryConditionGroup queryConditionGroup = QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"ytenant").eq((Object)AppContext.getCurrentUser().getYTenantId())});
        if (StringUtils.hasLength((String)brandClassId)) {
            queryConditionGroup.addCondition((ConditionExpression)QueryCondition.name((String)"id").eq((Object)Long.parseLong(brandClassId)));
        } else if (StringUtils.hasLength((String)brandClassCode)) {
            queryConditionGroup.addCondition((ConditionExpression)QueryCondition.name((String)"code").eq((Object)brandClassCode));
        }
        QuerySchema schema = QuerySchema.create().addSelect("id,code,name,brandclassAbbr,stopstatus").addCondition((ConditionExpression)queryConditionGroup);
        List brandClassList = MetaDaoHelper.queryObject((String)"pc.brand.BrandClass", (QuerySchema)schema, null);
        if (CollectionUtils.isEmpty((Collection)brandClassList)) {
            return null;
        }
        BillDataDto bill = new BillDataDto();
        bill.setData((Object)brandClassList);
        bill.setBillnum("pc_brandclasslist");
        RuleExecuteResult result = BillBiz.delete((BillDataDto)bill);
        if (!CollectionUtils.isEmpty((Collection)result.getMessages())) {
            return result.getMessages().get(0).toString();
        }
        return null;
    }
}


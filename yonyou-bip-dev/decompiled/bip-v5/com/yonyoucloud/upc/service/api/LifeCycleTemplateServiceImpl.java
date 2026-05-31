/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.alibaba.fastjson.JSON
 *  com.yonyou.cloud.middleware.rpc.RemoteCall
 *  com.yonyou.iuap.apdoc.coredoc.dto.keymapping.UpcAPiTool
 *  com.yonyou.iuap.apdoc.coredoc.enums.CoreExtrateBusinessErrorEnum
 *  com.yonyou.iuap.apdoc.coredoc.exceptions.CoreDocBusinessException
 *  com.yonyou.iuap.ucf.common.i18n.InternationalUtils
 *  com.yonyou.ucf.mdd.common.model.rule.RuleExecuteResult
 *  com.yonyou.ucf.mdd.ext.bill.dto.BillDataDto
 *  com.yonyou.ucf.mdd.ext.bill.rule.common.ResultList
 *  com.yonyou.ucf.mdd.ext.dao.meta.MetaDaoHelper
 *  com.yonyou.ucf.mdd.ext.data.fill.DataTransferUtils
 *  com.yonyou.ucf.mdd.ext.util.ResultMessage
 *  com.yonyoucloud.iuap.upc.api.ILifeCycleTemplateService
 *  com.yonyoucloud.iuap.upc.dto.ResultMessageDTO
 *  com.yonyoucloud.iuap.upc.vo.LifeCycleTemplateApiVO
 *  com.yonyoucloud.iuap.upc.vo.LifeCycleTemplateQueryVO
 *  com.yonyoucloud.upc.pc.manage.LifeCycleTemplate
 *  org.imeta.orm.schema.ConditionExpression
 *  org.imeta.orm.schema.QueryCondition
 *  org.imeta.orm.schema.QueryConditionGroup
 *  org.imeta.orm.schema.QuerySchema
 *  org.slf4j.Logger
 *  org.slf4j.LoggerFactory
 *  org.springframework.beans.factory.annotation.Autowired
 *  org.springframework.beans.factory.annotation.Qualifier
 *  org.springframework.stereotype.Service
 *  org.springframework.util.CollectionUtils
 */
package com.yonyoucloud.upc.service.api;

import com.alibaba.fastjson.JSON;
import com.yonyou.cloud.middleware.rpc.RemoteCall;
import com.yonyou.iuap.apdoc.coredoc.dto.keymapping.UpcAPiTool;
import com.yonyou.iuap.apdoc.coredoc.enums.CoreExtrateBusinessErrorEnum;
import com.yonyou.iuap.apdoc.coredoc.exceptions.CoreDocBusinessException;
import com.yonyou.iuap.ucf.common.i18n.InternationalUtils;
import com.yonyou.ucf.mdd.common.model.rule.RuleExecuteResult;
import com.yonyou.ucf.mdd.ext.bill.dto.BillDataDto;
import com.yonyou.ucf.mdd.ext.bill.rule.common.ResultList;
import com.yonyou.ucf.mdd.ext.dao.meta.MetaDaoHelper;
import com.yonyou.ucf.mdd.ext.data.fill.DataTransferUtils;
import com.yonyou.ucf.mdd.ext.util.ResultMessage;
import com.yonyoucloud.iuap.upc.api.ILifeCycleTemplateService;
import com.yonyoucloud.iuap.upc.api.service.IUPCBillService;
import com.yonyoucloud.iuap.upc.constants.MaterialLifeCycFieldMap;
import com.yonyoucloud.iuap.upc.dto.ResultMessageDTO;
import com.yonyoucloud.iuap.upc.vo.LifeCycleTemplateApiVO;
import com.yonyoucloud.iuap.upc.vo.LifeCycleTemplateQueryVO;
import com.yonyoucloud.upc.pc.manage.LifeCycleTemplate;
import com.yonyoucloud.upc.service.api.MaterialStatusServiceImpl;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import org.imeta.orm.schema.ConditionExpression;
import org.imeta.orm.schema.QueryCondition;
import org.imeta.orm.schema.QueryConditionGroup;
import org.imeta.orm.schema.QuerySchema;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;

@Service
@RemoteCall(value="productcenter@c87e2267-1001-4c70-bb2a-ab41f3b81aa3")
public class LifeCycleTemplateServiceImpl
implements ILifeCycleTemplateService {
    private static final Logger log = LoggerFactory.getLogger(LifeCycleTemplateServiceImpl.class);
    @Autowired
    MaterialStatusServiceImpl materialStatusService;
    @Autowired
    @Qualifier(value="pc.BillService")
    private IUPCBillService billService;

    public LifeCycleTemplateApiVO lifeCycleTemplateSave(LifeCycleTemplateApiVO lifeCycleTemplateApiVO) throws Exception {
        if (null == lifeCycleTemplateApiVO) {
            throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_801215);
        }
        LifeCycleTemplateApiVO lifeCycleTemplateResult = new LifeCycleTemplateApiVO();
        if (null == lifeCycleTemplateApiVO.getStopstatus()) {
            lifeCycleTemplateApiVO.setStopstatus(Integer.valueOf(0));
        }
        LifeCycleTemplate lifeCycleTemplate = new LifeCycleTemplate();
        lifeCycleTemplate.put("_fromApi", (Object)true);
        lifeCycleTemplate.init((Map)JSON.parseObject((String)JSON.toJSONString((Object)lifeCycleTemplateApiVO), Map.class));
        Map map = UpcAPiTool.beanToMap((Object)lifeCycleTemplateApiVO, MaterialLifeCycFieldMap.materialFieldType, MaterialLifeCycFieldMap.materialRenameMap, (String)"Insert");
        lifeCycleTemplate.putAll(map);
        DataTransferUtils.fill((String)"pc_lifecycletemplate", (String)"pc.manage.LifeCycleTemplate", (Object)lifeCycleTemplate, (int)2);
        BillDataDto billDataDto = new BillDataDto();
        billDataDto.setBillnum("pc_lifecycletemplate");
        billDataDto.setAction("save");
        billDataDto.setConvertType(Integer.valueOf(2));
        billDataDto.setFromApi(true);
        billDataDto.setData((Object)lifeCycleTemplate);
        RuleExecuteResult result = this.billService.executeUpdate("save", billDataDto);
        if (result.getMsgCode() != 1) {
            throw new CoreDocBusinessException(result.getMessage());
        }
        this.materialStatusService.mapToBean(lifeCycleTemplateResult, MaterialLifeCycFieldMap.materialFieldType, (HashMap)result.getData(), null);
        return lifeCycleTemplateResult;
    }

    public List<LifeCycleTemplateApiVO> lifeCycleTemplateQuery(LifeCycleTemplateQueryVO lifeCycleTemplateQueryVO) throws Exception {
        UpcAPiTool.checkTenantInfo();
        if (null == lifeCycleTemplateQueryVO) {
            throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_801171);
        }
        ArrayList<LifeCycleTemplateApiVO> lifeCycleTemplateApiVOS = new ArrayList<LifeCycleTemplateApiVO>();
        ArrayList<QueryCondition> conditionExpressions = new ArrayList<QueryCondition>();
        if (!CollectionUtils.isEmpty((Collection)lifeCycleTemplateQueryVO.getIdList())) {
            if (lifeCycleTemplateQueryVO.getIdList().size() > UpcAPiTool.List_LENGTH) {
                throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_801216, new Object[]{UpcAPiTool.List_LENGTH});
            }
            conditionExpressions.add(QueryCondition.name((String)"id").in((Collection)lifeCycleTemplateQueryVO.getIdList()));
        } else if (!CollectionUtils.isEmpty((Collection)lifeCycleTemplateQueryVO.getCodeList())) {
            if (lifeCycleTemplateQueryVO.getCodeList().size() > UpcAPiTool.List_LENGTH) {
                throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_801217, new Object[]{UpcAPiTool.List_LENGTH});
            }
            conditionExpressions.add(QueryCondition.name((String)"code").in((Collection)lifeCycleTemplateQueryVO.getCodeList()));
        } else {
            throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_801171);
        }
        try {
            ConditionExpression[] ces = new ConditionExpression[conditionExpressions.size()];
            QueryConditionGroup queryConditionGroup = QueryConditionGroup.and((ConditionExpression[])conditionExpressions.toArray(ces));
            QuerySchema lifeCycleTemplateschema = QuerySchema.create().addSelect("id as id , code as code ,name as name,systemFlag as systemFlag,stopstatus as stopstatus").appendQueryCondition(new ConditionExpression[0]).addCondition((ConditionExpression)queryConditionGroup);
            QuerySchema lifeCycleTemplateDetailschema = QuerySchema.create().name("lifeCycleDetail").fullname("pc.manage.LifeCycleDetail").addSelect("id as id,lifeCycleTemplateId as lifeCycleTemplateId,materialStatusId as materialStatusId,materialStatusId.code as materialStatusCode, materialStatusId.name as materialStatusName,isDefault as isDefault ");
            lifeCycleTemplateschema.addCompositionSchema(lifeCycleTemplateDetailschema);
            List lifeCycleTemplateList = MetaDaoHelper.query((String)"pc.manage.LifeCycleTemplate", (boolean)true, (QuerySchema)lifeCycleTemplateschema, null);
            if (null != lifeCycleTemplateList && lifeCycleTemplateList.size() > 0) {
                for (HashMap lifeCycleTemplate : lifeCycleTemplateList) {
                    LifeCycleTemplateApiVO lifeCycleTemplateApiVO = new LifeCycleTemplateApiVO();
                    this.materialStatusService.mapToBean(lifeCycleTemplateApiVO, MaterialLifeCycFieldMap.materialFieldType, lifeCycleTemplate, null);
                    lifeCycleTemplateApiVOS.add(lifeCycleTemplateApiVO);
                }
            }
        }
        catch (Exception e) {
            log.error(InternationalUtils.getMessageWithDefault((String)"UID:P_COREDOC-BE_179F628604080288", (String)"\u67e5\u8be2\u751f\u547d\u5468\u671f\u6a21\u677f\u4fe1\u606f\u6570\u636e\u5931\u8d25"), (Object)e.getMessage(), (Object)e);
            throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_801218, new Object[]{e.getMessage()});
        }
        return lifeCycleTemplateApiVOS;
    }

    public ResultMessageDTO lifeCycleTemplateDelete(LifeCycleTemplateQueryVO lifeCycleTemplateQueryVO) throws Exception {
        ResultMessageDTO resultMessageDTO;
        UpcAPiTool.checkTenantInfo();
        if (null == lifeCycleTemplateQueryVO) {
            throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_801219);
        }
        ArrayList<QueryCondition> conditionExpressions = new ArrayList<QueryCondition>();
        if (!CollectionUtils.isEmpty((Collection)lifeCycleTemplateQueryVO.getIdList())) {
            if (lifeCycleTemplateQueryVO.getIdList().size() > UpcAPiTool.List_LENGTH) {
                throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_801220, new Object[]{UpcAPiTool.List_LENGTH});
            }
            conditionExpressions.add(QueryCondition.name((String)"id").in((Collection)lifeCycleTemplateQueryVO.getIdList()));
        } else if (!CollectionUtils.isEmpty((Collection)lifeCycleTemplateQueryVO.getCodeList())) {
            if (lifeCycleTemplateQueryVO.getCodeList().size() > UpcAPiTool.List_LENGTH) {
                throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_801221, new Object[]{UpcAPiTool.List_LENGTH});
            }
            conditionExpressions.add(QueryCondition.name((String)"code").in((Collection)lifeCycleTemplateQueryVO.getCodeList()));
        } else if (null != lifeCycleTemplateQueryVO.getId()) {
            conditionExpressions.add(QueryCondition.name((String)"id").eq((Object)lifeCycleTemplateQueryVO.getId()));
        } else if (null != lifeCycleTemplateQueryVO.getCode()) {
            conditionExpressions.add(QueryCondition.name((String)"code").eq((Object)lifeCycleTemplateQueryVO.getCode()));
        } else {
            throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_801219);
        }
        ConditionExpression[] ces = new ConditionExpression[conditionExpressions.size()];
        QueryConditionGroup queryConditionGroup = QueryConditionGroup.and((ConditionExpression[])conditionExpressions.toArray(ces));
        QuerySchema materialStatusschema = QuerySchema.create().addSelect("id as id , code as code ,name as name,systemFlag as systemFlag,stopstatus as stopstatus").appendQueryCondition(new ConditionExpression[0]).addCondition((ConditionExpression)queryConditionGroup);
        List lifeCycleTemplateList = MetaDaoHelper.query((String)"pc.manage.LifeCycleTemplate", (QuerySchema)materialStatusschema);
        if (null == lifeCycleTemplateList || lifeCycleTemplateList.isEmpty()) {
            throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_801222);
        }
        Map<String, Map> lifeCycleTemplateCodeMap = lifeCycleTemplateList.stream().collect(Collectors.toMap(p -> p.get("code").toString(), p -> p));
        if (!CollectionUtils.isEmpty((Collection)lifeCycleTemplateQueryVO.getCodeList()) && CollectionUtils.isEmpty((Collection)lifeCycleTemplateQueryVO.getIdList())) {
            for (String lifeCycleTemplateCode : lifeCycleTemplateQueryVO.getCodeList()) {
                HashMap<String, String> map = new HashMap<String, String>();
                if (null != lifeCycleTemplateCodeMap.get(lifeCycleTemplateCode)) continue;
                map.put("code", lifeCycleTemplateCode);
                lifeCycleTemplateList.add(map);
            }
        }
        BillDataDto bill = new BillDataDto();
        bill.setBillnum("pc_lifecycletemplate");
        bill.setData((Object)lifeCycleTemplateList);
        try {
            ResultList resultList = this.billService.batchdelete(bill);
            resultMessageDTO = (ResultMessageDTO)JSON.parseObject((String)ResultMessage.data((Object)resultList), ResultMessageDTO.class);
        }
        catch (Exception e) {
            resultMessageDTO = (ResultMessageDTO)JSON.parseObject((String)ResultMessage.error((String)e.getMessage()), ResultMessageDTO.class);
        }
        return resultMessageDTO;
    }
}


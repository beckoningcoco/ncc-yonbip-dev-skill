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
 *  com.yonyou.ucf.mdd.ext.api.service.ApiImportCommandService
 *  com.yonyou.ucf.mdd.ext.bill.dto.BillDataDto
 *  com.yonyou.ucf.mdd.ext.bill.rule.common.ResultList
 *  com.yonyou.ucf.mdd.ext.dao.meta.MetaDaoHelper
 *  com.yonyou.ucf.mdd.ext.data.fill.DataTransferUtils
 *  com.yonyou.ucf.mdd.ext.util.ResultMessage
 *  com.yonyoucloud.iuap.upc.api.IMaterialStatusService
 *  com.yonyoucloud.iuap.upc.dto.ResultMessageDTO
 *  com.yonyoucloud.iuap.upc.vo.MaterialStatusApiVO
 *  com.yonyoucloud.iuap.upc.vo.MaterialStatusQueryVO
 *  com.yonyoucloud.iuap.upc.vo.MultilingualVO
 *  com.yonyoucloud.upc.pc.manage.MaterialStatus
 *  org.imeta.orm.base.BizObject
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
import com.yonyou.ucf.mdd.ext.api.service.ApiImportCommandService;
import com.yonyou.ucf.mdd.ext.bill.dto.BillDataDto;
import com.yonyou.ucf.mdd.ext.bill.rule.common.ResultList;
import com.yonyou.ucf.mdd.ext.dao.meta.MetaDaoHelper;
import com.yonyou.ucf.mdd.ext.data.fill.DataTransferUtils;
import com.yonyou.ucf.mdd.ext.util.ResultMessage;
import com.yonyoucloud.iuap.upc.api.IMaterialStatusService;
import com.yonyoucloud.iuap.upc.api.service.IUPCBillService;
import com.yonyoucloud.iuap.upc.constants.MaterialLifeCycFieldMap;
import com.yonyoucloud.iuap.upc.dto.ResultMessageDTO;
import com.yonyoucloud.iuap.upc.vo.MaterialStatusApiVO;
import com.yonyoucloud.iuap.upc.vo.MaterialStatusQueryVO;
import com.yonyoucloud.iuap.upc.vo.MultilingualVO;
import com.yonyoucloud.upc.pc.manage.MaterialStatus;
import java.lang.reflect.Field;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import org.imeta.orm.base.BizObject;
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
public class MaterialStatusServiceImpl
implements IMaterialStatusService {
    private static final Logger log = LoggerFactory.getLogger(MaterialStatusServiceImpl.class);
    @Autowired
    private ApiImportCommandService apiImportSingleService;
    @Autowired
    @Qualifier(value="pc.BillService")
    private IUPCBillService billService;

    public MaterialStatusApiVO materialStatusSave(MaterialStatusApiVO materialStatusApiVO) throws Exception {
        if (null == materialStatusApiVO) {
            throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_801417);
        }
        MaterialStatusApiVO materialStatusResultVO = new MaterialStatusApiVO();
        if (null == materialStatusApiVO.getStopstatus()) {
            materialStatusApiVO.setStopstatus(Integer.valueOf(0));
        }
        MaterialStatus materialStatus = new MaterialStatus();
        materialStatus.put("_fromApi", (Object)true);
        materialStatus.init((Map)JSON.parseObject((String)JSON.toJSONString((Object)materialStatusApiVO), Map.class));
        Map map = UpcAPiTool.beanToMap((Object)materialStatusApiVO, MaterialLifeCycFieldMap.materialFieldType, MaterialLifeCycFieldMap.materialRenameMap, (String)"Insert");
        materialStatus.putAll(map);
        DataTransferUtils.fill((String)"pc_materialstatus", (String)"pc.manage.MaterialStatus", (Object)materialStatus, (int)2);
        BillDataDto billDataDto = new BillDataDto();
        billDataDto.setBillnum("pc_materialstatus");
        billDataDto.setAction("save");
        billDataDto.setConvertType(Integer.valueOf(2));
        billDataDto.setFromApi(true);
        billDataDto.setData((Object)materialStatus);
        RuleExecuteResult result = this.billService.executeUpdate("save", billDataDto);
        if (result.getMsgCode() != 1) {
            throw new CoreDocBusinessException(result.getMessage());
        }
        this.mapToBean(materialStatusResultVO, MaterialLifeCycFieldMap.materialFieldType, (HashMap)result.getData(), null);
        return materialStatusResultVO;
    }

    public List<MaterialStatusApiVO> materialStatusQuery(MaterialStatusQueryVO materialStatusQueryVO) throws Exception {
        UpcAPiTool.checkTenantInfo();
        if (null == materialStatusQueryVO) {
            throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_801171);
        }
        ArrayList<MaterialStatusApiVO> materialStatusApiVOList = new ArrayList<MaterialStatusApiVO>();
        ArrayList<QueryCondition> conditionExpressions = new ArrayList<QueryCondition>();
        if (!CollectionUtils.isEmpty((Collection)materialStatusQueryVO.getIdList())) {
            if (materialStatusQueryVO.getIdList().size() > UpcAPiTool.List_LENGTH) {
                throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_801418, new Object[]{UpcAPiTool.List_LENGTH});
            }
            conditionExpressions.add(QueryCondition.name((String)"id").in((Collection)materialStatusQueryVO.getIdList()));
        } else if (!CollectionUtils.isEmpty((Collection)materialStatusQueryVO.getCodeList())) {
            if (materialStatusQueryVO.getCodeList().size() > UpcAPiTool.List_LENGTH) {
                throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_801217, new Object[]{UpcAPiTool.List_LENGTH});
            }
            conditionExpressions.add(QueryCondition.name((String)"code").in((Collection)materialStatusQueryVO.getCodeList()));
        } else {
            throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_801171);
        }
        try {
            ConditionExpression[] ces = new ConditionExpression[conditionExpressions.size()];
            QueryConditionGroup queryConditionGroup = QueryConditionGroup.and((ConditionExpression[])conditionExpressions.toArray(ces));
            QuerySchema materialStatusschema = QuerySchema.create().addSelect("id as id , code as code ,name as name,systemFlag as systemFlag,stopstatus as stopstatus").appendQueryCondition(new ConditionExpression[0]).addCondition((ConditionExpression)queryConditionGroup);
            QuerySchema materialStatusDetailschema = QuerySchema.create().name("materialStatusDetail").fullname("pc.manage.MaterialStatusDetail").addSelect("id as id,materialStatusId as materialStatusId,systemFlag as systemFlag,serviceCode as serviceCode,serviceName as serviceName,transType as transType,transType.name as transType_Name,transType.code as transType_Code, granularityControl as granularityControl, controlRule as controlRule");
            QuerySchema materialStatusDetalActionsschema = QuerySchema.create().name("materialStatusDetailAction").fullname("pc.manage.MaterialStatusDetailAction").addSelect("id as id,materialStatusDetailId as materialStatusDetailId,action as action,action.action as actionCode,action.actionName as actionName");
            materialStatusDetailschema.addCompositionSchema(materialStatusDetalActionsschema);
            materialStatusschema.addCompositionSchema(materialStatusDetailschema);
            List materialStatusList = MetaDaoHelper.query((String)"pc.manage.MaterialStatus", (boolean)true, (QuerySchema)materialStatusschema, null);
            if (null != materialStatusList && materialStatusList.size() > 0) {
                for (HashMap materialStatus : materialStatusList) {
                    MaterialStatusApiVO materialStatusApiVO = new MaterialStatusApiVO();
                    this.mapToBean(materialStatusApiVO, MaterialLifeCycFieldMap.materialFieldType, materialStatus, null);
                    materialStatusApiVOList.add(materialStatusApiVO);
                }
            }
        }
        catch (Exception e) {
            log.error(InternationalUtils.getMessageWithDefault((String)"UID:P_COREDOC-BE_179F6286040801B5", (String)"\u67e5\u8be2\u7269\u6599\u72b6\u6001\u4fe1\u606f\u6570\u636e\u5931\u8d25"), (Object)e.getMessage(), (Object)e);
            throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_801419, new Object[]{e.getMessage()});
        }
        return materialStatusApiVOList;
    }

    public ResultMessageDTO materialStatusDelete(MaterialStatusQueryVO materialStatusQueryVO) throws Exception {
        ResultMessageDTO resultMessageDTO;
        UpcAPiTool.checkTenantInfo();
        if (null == materialStatusQueryVO) {
            throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_801420);
        }
        ArrayList<QueryCondition> conditionExpressions = new ArrayList<QueryCondition>();
        if (!CollectionUtils.isEmpty((Collection)materialStatusQueryVO.getIdList())) {
            if (materialStatusQueryVO.getIdList().size() > UpcAPiTool.List_LENGTH) {
                throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_801221, new Object[]{UpcAPiTool.List_LENGTH});
            }
            conditionExpressions.add(QueryCondition.name((String)"id").in((Collection)materialStatusQueryVO.getIdList()));
        } else if (!CollectionUtils.isEmpty((Collection)materialStatusQueryVO.getCodeList())) {
            if (materialStatusQueryVO.getCodeList().size() > UpcAPiTool.List_LENGTH) {
                throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_801221, new Object[]{UpcAPiTool.List_LENGTH});
            }
            conditionExpressions.add(QueryCondition.name((String)"code").in((Collection)materialStatusQueryVO.getCodeList()));
        } else if (null != materialStatusQueryVO.getId()) {
            conditionExpressions.add(QueryCondition.name((String)"id").eq((Object)materialStatusQueryVO.getId()));
        } else if (null != materialStatusQueryVO.getCode()) {
            conditionExpressions.add(QueryCondition.name((String)"code").eq((Object)materialStatusQueryVO.getCode()));
        } else {
            throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_801420);
        }
        ConditionExpression[] ces = new ConditionExpression[conditionExpressions.size()];
        QueryConditionGroup queryConditionGroup = QueryConditionGroup.and((ConditionExpression[])conditionExpressions.toArray(ces));
        QuerySchema materialStatusschema = QuerySchema.create().addSelect("id as id , code as code ,name as name,systemFlag as systemFlag,stopstatus as stopstatus").appendQueryCondition(new ConditionExpression[0]).addCondition((ConditionExpression)queryConditionGroup);
        List materialStatusList = MetaDaoHelper.query((String)"pc.manage.MaterialStatus", (QuerySchema)materialStatusschema);
        if (null == materialStatusList || materialStatusList.isEmpty()) {
            throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_801421);
        }
        BillDataDto bill = new BillDataDto();
        bill.setBillnum("pc_materialstatus");
        bill.setData((Object)materialStatusList);
        try {
            ResultList resultList = this.billService.batchdelete(bill);
            resultMessageDTO = (ResultMessageDTO)JSON.parseObject((String)ResultMessage.data((Object)resultList), ResultMessageDTO.class);
        }
        catch (Exception e) {
            resultMessageDTO = (ResultMessageDTO)JSON.parseObject((String)ResultMessage.error((String)e.getMessage()), ResultMessageDTO.class);
        }
        return resultMessageDTO;
    }

    public void mapToBean(Object bean, HashSet<String> fieldTypeSet, HashMap<String, Object> source, HashMap<String, String> fieldRenameMap) throws Exception {
        Class<?> aClass = bean.getClass();
        while (!Object.class.getTypeName().equals(aClass.getTypeName())) {
            Field[] declaredFields;
            String className = aClass.getName();
            for (Field field : declaredFields = aClass.getDeclaredFields()) {
                Type actualTypeArgument;
                Type genericType;
                MultilingualVO multilingualVO;
                HashMap o;
                field.setAccessible(true);
                String fieldName = field.getName();
                String fieldTypeName = field.getType().getName();
                Object sourceField = null;
                if (source.containsKey(fieldName) && source.get(fieldName) != null) {
                    sourceField = source.get(fieldName);
                    if (source.get(fieldName).getClass().getName().equals(fieldTypeName)) {
                        field.set(bean, source.get(fieldName));
                        continue;
                    }
                    if ("com.yonyoucloud.iuap.upc.vo.MultilingualVO".equals(fieldTypeName)) {
                        o = (HashMap)source.get(fieldName);
                        multilingualVO = new MultilingualVO();
                        multilingualVO.setSimplifiedName((String)o.get("zh_CN"));
                        multilingualVO.setEnglishName((String)o.get("en_US"));
                        multilingualVO.setTraditionalName((String)o.get("zh_TW"));
                        field.set(bean, multilingualVO);
                        continue;
                    }
                    if (sourceField instanceof Boolean) {
                        field.set(bean, (Boolean)source.get(fieldName) != false ? 1 : 0);
                        continue;
                    }
                } else if (fieldRenameMap != null && fieldRenameMap.containsKey(className + "." + fieldName) && source.containsKey(fieldRenameMap.get(className + "." + fieldName)) && source.get(fieldRenameMap.get(className + "." + fieldName)) != null) {
                    sourceField = source.get(fieldRenameMap.get(className + "." + fieldName));
                    if (source.get(fieldRenameMap.get(className + "." + fieldName)).getClass().getName().equals(fieldTypeName)) {
                        field.set(bean, source.get(fieldRenameMap.get(className + "." + fieldName)));
                        continue;
                    }
                    if ("com.yonyoucloud.iuap.upc.vo.MultilingualVO".equals(fieldTypeName)) {
                        o = (BizObject)source.get(fieldRenameMap.get(className + "." + fieldName));
                        multilingualVO = new MultilingualVO();
                        multilingualVO.setSimplifiedName((String)o.get("zh_CN"));
                        multilingualVO.setEnglishName((String)o.get("en_US"));
                        multilingualVO.setTraditionalName((String)o.get("zh_TW"));
                        field.set(bean, multilingualVO);
                        continue;
                    }
                }
                if (fieldTypeSet == null || sourceField == null || !List.class.getName().equals(fieldTypeName) || !((genericType = field.getGenericType()) instanceof ParameterizedType) || !fieldTypeSet.contains((actualTypeArgument = ((ParameterizedType)genericType).getActualTypeArguments()[0]).getTypeName())) continue;
                ArrayList arrayList = new ArrayList();
                for (Object a : (List)sourceField) {
                    Object childObject = Class.forName(actualTypeArgument.getTypeName()).newInstance();
                    this.mapToBean(childObject, fieldTypeSet, (HashMap)a, fieldRenameMap);
                    arrayList.add(childObject);
                }
                field.set(bean, arrayList);
            }
            aClass = aClass.getSuperclass();
        }
    }
}


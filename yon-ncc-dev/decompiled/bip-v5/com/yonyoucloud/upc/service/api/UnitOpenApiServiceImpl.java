/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.alibaba.fastjson.JSON
 *  com.yonyou.iuap.BusinessException
 *  com.yonyou.iuap.apdoc.coredoc.dto.keymapping.ProductAPIUtils
 *  com.yonyou.iuap.apdoc.coredoc.dto.keymapping.UpcAPiTool
 *  com.yonyou.iuap.apdoc.coredoc.enums.CoreDocBusinessErrorEnum
 *  com.yonyou.iuap.apdoc.coredoc.enums.CoreExtrateBusinessErrorEnum
 *  com.yonyou.iuap.apdoc.coredoc.exceptions.CoreDocBusinessException
 *  com.yonyou.iuap.apdoc.coredoc.utils.UpcJacksonUtils
 *  com.yonyou.iuap.ucf.common.i18n.InternationalUtils
 *  com.yonyou.ucf.mdd.common.model.ResultList
 *  com.yonyou.ucf.mdd.ext.api.service.ApiImportCommandService
 *  com.yonyou.ucf.mdd.ext.bill.dto.BillDataDto
 *  com.yonyou.ucf.mdd.ext.bill.rule.common.ResultList
 *  com.yonyou.ucf.mdd.ext.dao.meta.MetaDaoHelper
 *  com.yonyou.ucf.mdd.ext.data.fill.DataTransferUtils
 *  com.yonyoucloud.iuap.upc.dto.derivatives.MessageDTO
 *  com.yonyoucloud.iuap.upc.dto.derivatives.UnitDTO
 *  com.yonyoucloud.iuap.upc.dto.derivatives.UnitGroupDTO
 *  com.yonyoucloud.iuap.upc.dto.derivatives.UnitQryDTO
 *  com.yonyoucloud.iuap.upc.dto.ext.UPCResultList
 *  com.yonyoucloud.iuap.upc.dto.openapi.OpenAPIDTO
 *  com.yonyoucloud.iuap.upc.vo.MultilingualVO
 *  com.yonyoucloud.upc.pc.unit.Unit
 *  com.yonyoucloud.upc.pc.unit.UnitGroup
 *  com.yonyoucloud.upc.utils.CoreDocJsonResult
 *  org.imeta.orm.base.EntityStatus
 *  org.imeta.orm.schema.ConditionExpression
 *  org.imeta.orm.schema.QueryCondition
 *  org.imeta.orm.schema.QueryConditionGroup
 *  org.imeta.orm.schema.QueryField
 *  org.imeta.orm.schema.QuerySchema
 *  org.slf4j.Logger
 *  org.slf4j.LoggerFactory
 *  org.springframework.beans.factory.annotation.Autowired
 *  org.springframework.stereotype.Service
 *  org.springframework.util.CollectionUtils
 */
package com.yonyoucloud.upc.service.api;

import com.alibaba.fastjson.JSON;
import com.yonyou.iuap.BusinessException;
import com.yonyou.iuap.apdoc.coredoc.dto.keymapping.ProductAPIUtils;
import com.yonyou.iuap.apdoc.coredoc.dto.keymapping.UpcAPiTool;
import com.yonyou.iuap.apdoc.coredoc.enums.CoreDocBusinessErrorEnum;
import com.yonyou.iuap.apdoc.coredoc.enums.CoreExtrateBusinessErrorEnum;
import com.yonyou.iuap.apdoc.coredoc.exceptions.CoreDocBusinessException;
import com.yonyou.iuap.apdoc.coredoc.utils.UpcJacksonUtils;
import com.yonyou.iuap.ucf.common.i18n.InternationalUtils;
import com.yonyou.ucf.mdd.common.model.ResultList;
import com.yonyou.ucf.mdd.ext.api.service.ApiImportCommandService;
import com.yonyou.ucf.mdd.ext.bill.dto.BillDataDto;
import com.yonyou.ucf.mdd.ext.dao.meta.MetaDaoHelper;
import com.yonyou.ucf.mdd.ext.data.fill.DataTransferUtils;
import com.yonyoucloud.iuap.upc.api.service.IUPCBillService;
import com.yonyoucloud.iuap.upc.dto.derivatives.MessageDTO;
import com.yonyoucloud.iuap.upc.dto.derivatives.UnitDTO;
import com.yonyoucloud.iuap.upc.dto.derivatives.UnitGroupDTO;
import com.yonyoucloud.iuap.upc.dto.derivatives.UnitQryDTO;
import com.yonyoucloud.iuap.upc.dto.ext.UPCResultList;
import com.yonyoucloud.iuap.upc.dto.openapi.OpenAPIDTO;
import com.yonyoucloud.iuap.upc.vo.MultilingualVO;
import com.yonyoucloud.upc.pc.unit.Unit;
import com.yonyoucloud.upc.pc.unit.UnitGroup;
import com.yonyoucloud.upc.utils.CoreDocJsonResult;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import org.imeta.orm.base.EntityStatus;
import org.imeta.orm.schema.ConditionExpression;
import org.imeta.orm.schema.QueryCondition;
import org.imeta.orm.schema.QueryConditionGroup;
import org.imeta.orm.schema.QueryField;
import org.imeta.orm.schema.QuerySchema;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;

@Service
public class UnitOpenApiServiceImpl {
    private static final Logger log = LoggerFactory.getLogger(UnitOpenApiServiceImpl.class);
    private static final String[] UNIT_BASE_FIELDS = new String[]{"id", "code", "name", "precision", "truncationType", "convertCoefficient", "stopStatus", "baseUnit", "unitGroup", "unitGroupCode", "unitGroupName", "unitCharacter"};
    private static final String[] UNIT_GROUP_BASE_FIELDS = new String[]{"id", "code", "name", "desc", "stopStatus"};
    @Autowired
    private ApiImportCommandService apiImportSingleService;
    @Autowired
    private IUPCBillService billService;
    private static final int MAX_BATCH_COUNT = 10;
    private static final int MAX_COUNT = 500;

    public CoreDocJsonResult<MessageDTO> batchUpdate(List<UnitDTO> unitDTOs) {
        try {
            if (unitDTOs == null) {
                throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_801155);
            }
            if (unitDTOs.size() > 10) {
                throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_801227);
            }
            int successCount = 0;
            int failCount = 0;
            int count = 0;
            MessageDTO resultMessage = new MessageDTO();
            ArrayList successInfos = new ArrayList();
            ArrayList failInfos = new ArrayList();
            ArrayList<String> erpCodeList = new ArrayList<String>();
            for (UnitDTO unitDTO : unitDTOs) {
                if (unitDTO == null || unitDTO.getErpCode() == null) continue;
                erpCodeList.add(unitDTO.getErpCode());
            }
            QuerySchema schema = QuerySchema.create().addSelect("id,erpCode").addCondition((ConditionExpression)QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"erpCode").in(erpCodeList)}));
            List queryList = MetaDaoHelper.query((String)"pc.unit.Unit", (QuerySchema)schema);
            HashMap<String, Long> idAndErpCode = new HashMap<String, Long>();
            if (!CollectionUtils.isEmpty((Collection)queryList)) {
                for (Map map : queryList) {
                    if (map.get("erpCode") == null || map.get("id") == null) continue;
                    idAndErpCode.put(map.get("erpCode").toString(), Long.valueOf(map.get("id").toString()));
                }
            }
            for (UnitDTO unitDTO : unitDTOs) {
                if (unitDTO == null) continue;
                if (unitDTO.getErpCode() != null) {
                    HashMap<String, String> failInfo;
                    ++count;
                    String message = null;
                    CoreDocJsonResult<UnitDTO> result = null;
                    if (idAndErpCode.get(unitDTO.getErpCode()) == null) {
                        message = InternationalUtils.getMessageWithDefault((String)"UID:P_COREDOC-BE_18487EDC05600031", (String)"erpCode,\u5916\u90e8\u7f16\u7801\u4e0d\u5b58\u5728\uff01");
                    } else {
                        unitDTO.setId((Long)idAndErpCode.get(unitDTO.getErpCode()));
                        result = this.update(unitDTO);
                    }
                    if (result != null && result.getCode() == 200L) {
                        HashMap<String, String> successInfo = new HashMap<String, String>();
                        successInfo.put("erpCode", unitDTO.getErpCode());
                        successInfo.put("message", InternationalUtils.getMessageWithDefault((String)"UID:P_COREDOC-BE_181E96BE05900037", (String)"\u4fdd\u5b58\u6210\u529f\uff01"));
                        successInfos.add(successInfo);
                        ++successCount;
                        continue;
                    }
                    if (result != null && result.getCode() != 200L) {
                        failInfo = new HashMap();
                        failInfo.put("erpCode", unitDTO.getErpCode());
                        failInfo.put("message", result.getMessage());
                        failInfos.add(failInfo);
                        ++failCount;
                        continue;
                    }
                    if (message == null) continue;
                    failInfo = new HashMap<String, String>();
                    failInfo.put("erpCode", unitDTO.getErpCode());
                    failInfo.put("message", message);
                    failInfos.add(failInfo);
                    ++failCount;
                    continue;
                }
                throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_801228);
            }
            resultMessage.setSuccessInfos(successInfos);
            resultMessage.setFailInfos(failInfos);
            resultMessage.setCount(Integer.valueOf(count));
            resultMessage.setFailCount(Integer.valueOf(failCount));
            resultMessage.setSuccessCount(Integer.valueOf(successCount));
            return CoreDocJsonResult.success((Object)resultMessage);
        }
        catch (BusinessException businessException) {
            return CoreDocJsonResult.error((BusinessException)businessException);
        }
        catch (Exception e) {
            log.error("\u8ba1\u91cf\u5355\u4f4d\u6839\u636eerpCode\u66f4\u65b0\u9519\u8bef:" + e.getMessage(), (Throwable)e);
            return CoreDocJsonResult.error((BusinessException)new CoreDocBusinessException(CoreDocBusinessErrorEnum.SYSTEM_ERROR));
        }
    }

    public CoreDocJsonResult<UnitDTO> update(UnitDTO unitDTO) {
        if (null != unitDTO) {
            try {
                QuerySchema schema;
                Map query;
                Unit unit = new Unit();
                unit.put("_fromApi", (Object)true);
                unit.put("_status", (Object)EntityStatus.Update);
                Map map = (Map)JSON.parseObject((String)JSON.toJSONString((Object)unitDTO), HashMap.class);
                unit.putAll(map);
                if (unitDTO.getName() != null) {
                    unit.set("name", (Object)UpcAPiTool.handleMultilingual((MultilingualVO)unitDTO.getName()));
                }
                DataTransferUtils.fill((String)"pc_unit", (String)"pc.unit.Unit", (Object)unit, (int)3);
                if (unitDTO.getBaseUnit() != null) {
                    unit.put("bBaseUnit", (Object)unitDTO.getBaseUnit());
                }
                if (unitDTO.getStopStatus() != null) {
                    unit.put("stopstatus", (Object)unitDTO.getStopStatus());
                }
                if (unit.get("name") == null && (query = MetaDaoHelper.queryOne((String)"pc.unit.Unit", (QuerySchema)(schema = QuerySchema.create().addSelect("name").addCondition((ConditionExpression)QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"id").eq((Object)unitDTO.getId())}))))) != null && query.get("name") != null) {
                    unit.put("name", query.get("name"));
                }
                BillDataDto billDataDto = new BillDataDto();
                billDataDto.setBillnum("pc_unit");
                billDataDto.setAction("save");
                billDataDto.setData((Object)unit);
                billDataDto.setFromApi(true);
                billDataDto.setConvertType(Integer.valueOf(3));
                Object result = this.apiImportSingleService.singleSave4Api(billDataDto);
                UnitDTO unitDTO1 = new UnitDTO();
                unitDTO1.setId((Long)((Map)result).get("id"));
                return CoreDocJsonResult.success((Object)unitDTO1);
            }
            catch (BusinessException businessException) {
                return CoreDocJsonResult.error((BusinessException)businessException);
            }
            catch (Exception e) {
                log.error("\u8ba1\u91cf\u5355\u4f4d\u66f4\u65b0\u9519\u8bef:" + e.getMessage(), (Throwable)e);
                return CoreDocJsonResult.error((BusinessException)new CoreDocBusinessException(CoreDocBusinessErrorEnum.SYSTEM_ERROR));
            }
        }
        return CoreDocJsonResult.error((BusinessException)new CoreDocBusinessException(CoreDocBusinessErrorEnum.PARAM_NOT_NULL));
    }

    public CoreDocJsonResult<UnitGroupDTO> listUnitAndGroupByPage(UnitQryDTO unitQryDTO) {
        if (null != unitQryDTO) {
            try {
                List<UnitDTO> unitDTOs = this.queryUnit(unitQryDTO);
                if (CollectionUtils.isEmpty(unitDTOs)) {
                    return CoreDocJsonResult.error((BusinessException)new CoreDocBusinessException(CoreDocBusinessErrorEnum.RESULT_IS_NULL));
                }
                List<UnitGroupDTO> unitGroupDTOs = this.queryUnitGroup(unitDTOs);
                HashSet<Long> unitGroupIds = new HashSet<Long>();
                if (!CollectionUtils.isEmpty(unitDTOs)) {
                    for (UnitDTO unitDTO : unitDTOs) {
                        if (unitDTO == null || unitDTO.getUnitGroup() == null) continue;
                        unitGroupIds.add(unitDTO.getUnitGroup());
                    }
                }
                HashMap groupAndUnitMap = new HashMap();
                if (!CollectionUtils.isEmpty(unitGroupIds)) {
                    for (Long unitGroupId : unitGroupIds) {
                        groupAndUnitMap.put(unitGroupId, new ArrayList());
                    }
                }
                if (!CollectionUtils.isEmpty(unitDTOs)) {
                    for (UnitDTO unitDTO : unitDTOs) {
                        if (unitDTO == null || unitDTO.getUnitGroup() == null) continue;
                        Long groupId = unitDTO.getUnitGroup();
                        ((List)groupAndUnitMap.get(groupId)).add(unitDTO);
                    }
                }
                if (!CollectionUtils.isEmpty(unitGroupDTOs)) {
                    for (UnitGroupDTO unitGroupDTO : unitGroupDTOs) {
                        if (unitGroupDTO == null || unitGroupDTO.getId() == null) continue;
                        unitGroupDTO.setUnitDTOList((List)groupAndUnitMap.get(unitGroupDTO.getId()));
                    }
                }
                if (!CollectionUtils.isEmpty(unitGroupDTOs)) {
                    return CoreDocJsonResult.success(unitGroupDTOs);
                }
                return CoreDocJsonResult.error((BusinessException)new CoreDocBusinessException(CoreDocBusinessErrorEnum.RESULT_IS_NULL));
            }
            catch (BusinessException businessException) {
                return CoreDocJsonResult.error((BusinessException)businessException);
            }
            catch (Exception e) {
                log.error("\u67e5\u8be2\u8ba1\u91cf\u5355\u4f4d\u4e0e\u5206\u7ec4\u4fe1\u606f\u9519\u8bef:" + e.getMessage(), (Throwable)e);
                return CoreDocJsonResult.error((BusinessException)new CoreDocBusinessException(CoreDocBusinessErrorEnum.SYSTEM_ERROR));
            }
        }
        return CoreDocJsonResult.error((BusinessException)new CoreDocBusinessException(CoreDocBusinessErrorEnum.PARAM_NOT_NULL));
    }

    private List<UnitDTO> queryUnit(UnitQryDTO unitQryDTO) throws Exception {
        List unitDTOs = null;
        QueryField[] qryFields = UpcAPiTool.qryFields((HashMap)ProductAPIUtils.unitFieldMap, (String[])UNIT_BASE_FIELDS);
        QueryConditionGroup conditionGroup = new QueryConditionGroup();
        if (unitQryDTO.getCode() != null) {
            conditionGroup.addCondition((ConditionExpression)QueryCondition.name((String)"code").eq((Object)unitQryDTO.getCode()));
        }
        if (unitQryDTO.getName() != null) {
            conditionGroup.addCondition((ConditionExpression)QueryCondition.name((String)"name").eq((Object)unitQryDTO.getName()));
        }
        if (unitQryDTO.getBeganTime() != null) {
            conditionGroup.addCondition((ConditionExpression)QueryCondition.name((String)"pubts").egt((Object)unitQryDTO.getBeganTime()));
        }
        if (unitQryDTO.getEndTime() != null) {
            conditionGroup.addCondition((ConditionExpression)QueryCondition.name((String)"pubts").lt((Object)unitQryDTO.getEndTime()));
        }
        Integer pageIndex = unitQryDTO.getPageIndex();
        Integer pageSize = unitQryDTO.getPageSize();
        if (pageIndex == null || pageIndex < 0) {
            pageIndex = 1;
        }
        if (pageSize == null) {
            pageSize = 500;
        }
        if (pageSize > 500) {
            throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_801269);
        }
        QuerySchema schema = QuerySchema.create().addSelect(qryFields).addCondition((ConditionExpression)conditionGroup).addPager(pageIndex.intValue(), pageSize.intValue());
        List result = MetaDaoHelper.query((String)"pc.unit.Unit", (boolean)true, (QuerySchema)schema, null);
        if (result != null && result.size() <= 500) {
            String[] names = new String[]{"name"};
            for (Map unit : result) {
                unit = UpcAPiTool.handleMultilingual((Map)unit, (String[])names);
            }
            unitDTOs = JSON.parseArray((String)JSON.toJSONString((Object)result), UnitDTO.class);
        }
        return unitDTOs;
    }

    private List<UnitGroupDTO> queryUnitGroup(List<UnitDTO> unitDTOs) throws Exception {
        List unitGroupDTOs = null;
        QueryField[] qryFields = UpcAPiTool.qryFields((HashMap)ProductAPIUtils.unitGroupFieldMap, (String[])UNIT_GROUP_BASE_FIELDS);
        HashSet<Long> unitGroupIds = new HashSet<Long>();
        if (!CollectionUtils.isEmpty(unitDTOs)) {
            for (UnitDTO unitDTO : unitDTOs) {
                if (unitDTO == null || unitDTO.getUnitGroup() == null) continue;
                unitGroupIds.add(unitDTO.getUnitGroup());
            }
        }
        QueryConditionGroup conditionGroup = new QueryConditionGroup();
        if (CollectionUtils.isEmpty(unitGroupIds)) {
            throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_801270);
        }
        conditionGroup.addCondition((ConditionExpression)QueryCondition.name((String)"id").in(unitGroupIds));
        QuerySchema schema = QuerySchema.create().addSelect(qryFields).addCondition((ConditionExpression)conditionGroup);
        List result = MetaDaoHelper.query((String)"pc.unit.UnitGroup", (boolean)true, (QuerySchema)schema, null);
        if (result != null && result.size() <= 500) {
            String[] names = new String[]{"name"};
            for (Map unitGroup : result) {
                unitGroup = UpcAPiTool.handleMultilingual((Map)unitGroup, (String[])names);
            }
            unitGroupDTOs = JSON.parseArray((String)JSON.toJSONString((Object)result), UnitGroupDTO.class);
        }
        return unitGroupDTOs;
    }

    public CoreDocJsonResult<UPCResultList> batchAddGroup(List<UnitGroupDTO> unitGroupDTOs) {
        if (null != unitGroupDTOs) {
            try {
                if (unitGroupDTOs.size() == 0 || unitGroupDTOs.size() > 50) {
                    throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_801271);
                }
                ArrayList<UnitGroup> unitGroupList = new ArrayList<UnitGroup>();
                for (UnitGroupDTO unitGroupDTO : unitGroupDTOs) {
                    UnitGroup unitGroup = new UnitGroup();
                    unitGroup.put("_fromApi", (Object)true);
                    unitGroup.put("_status", (Object)EntityStatus.Insert);
                    Map map = (Map)JSON.parseObject((String)JSON.toJSONString((Object)unitGroupDTO), HashMap.class);
                    unitGroup.putAll(map);
                    if (unitGroupDTO.getName() != null) {
                        unitGroup.set("name", (Object)UpcAPiTool.handleMultilingual((MultilingualVO)unitGroupDTO.getName()));
                    }
                    if (unitGroupDTO.getStopStatus() != null && !unitGroupDTO.getStopStatus().booleanValue()) {
                        unitGroup.put("stopstatus", (Object)0);
                    } else if (unitGroupDTO.getStopStatus() != null && unitGroupDTO.getStopStatus().booleanValue()) {
                        unitGroup.put("stopstatus", (Object)1);
                    } else if (unitGroupDTO.getStopStatus() == null) {
                        unitGroup.put("stopstatus", (Object)0);
                    }
                    unitGroupList.add(unitGroup);
                }
                BillDataDto billDataDto = new BillDataDto();
                billDataDto.setBillnum("pc_unitgroup");
                billDataDto.setAction("save");
                billDataDto.setData(unitGroupList);
                billDataDto.setFromApi(true);
                billDataDto.setConvertType(Integer.valueOf(3));
                com.yonyou.ucf.mdd.ext.bill.rule.common.ResultList resultList = this.billService.batchSave(billDataDto);
                UPCResultList result = UpcAPiTool.resultConvertOpenApi((ResultList)resultList);
                return CoreDocJsonResult.success((Object)result);
            }
            catch (BusinessException businessException) {
                return CoreDocJsonResult.error((BusinessException)businessException);
            }
            catch (Exception e) {
                log.error("\u8ba1\u91cf\u5355\u4f4d\u5206\u7ec4\u6279\u91cf\u4fdd\u5b58\u9519\u8bef:" + e.getMessage(), (Throwable)e);
                return CoreDocJsonResult.error((BusinessException)new CoreDocBusinessException(CoreDocBusinessErrorEnum.SYSTEM_ERROR));
            }
        }
        return CoreDocJsonResult.error((BusinessException)new CoreDocBusinessException(CoreDocBusinessErrorEnum.PARAM_NOT_NULL));
    }

    public CoreDocJsonResult<UnitDTO> addIdempotent(OpenAPIDTO<UnitDTO> dto) {
        if (dto == null || dto.getData() == null) {
            return CoreDocJsonResult.error((BusinessException)new CoreDocBusinessException(CoreDocBusinessErrorEnum.PARAM_NOT_NULL));
        }
        try {
            UnitDTO unitDTO = (UnitDTO)dto.getData();
            Map map = (Map)UpcJacksonUtils.OBJECT_MAPPER.readValue(UpcJacksonUtils.OBJECT_MAPPER.writeValueAsString((Object)unitDTO), HashMap.class);
            Unit unit = new Unit();
            unit.putAll(map);
            unit.put("_fromApi", (Object)true);
            unit.put("_status", (Object)EntityStatus.Insert);
            if (unitDTO.getName() != null) {
                unit.set("name", (Object)UpcAPiTool.handleMultilingual((MultilingualVO)unitDTO.getName()));
            }
            if (unitDTO.getStopStatus() != null && !unitDTO.getStopStatus().booleanValue()) {
                unit.put("stopstatus", (Object)0);
            } else if (unitDTO.getStopStatus() != null && unitDTO.getStopStatus().booleanValue()) {
                unit.put("stopstatus", (Object)1);
            } else if (unitDTO.getStopStatus() == null) {
                unit.put("stopstatus", (Object)0);
            }
            BillDataDto billDataDto = UpcAPiTool.builderBillData((String)"pc_unit", (Object)unit, (boolean)true, (int)3);
            Object result = this.apiImportSingleService.singleSave4Api(billDataDto);
            UnitDTO saveResult = new UnitDTO();
            saveResult.setId((Long)((Map)result).get("id"));
            return CoreDocJsonResult.success((Object)saveResult);
        }
        catch (BusinessException businessException) {
            return CoreDocJsonResult.error((BusinessException)businessException);
        }
        catch (Exception e) {
            log.error("\u8ba1\u91cf\u5355\u4f4d\u65b0\u589e-\u5e42\u7b49\u63a5\u53e3\u5f02\u5e38\uff1a" + e.getMessage(), (Throwable)e);
            return CoreDocJsonResult.error((BusinessException)new CoreDocBusinessException(CoreDocBusinessErrorEnum.SYSTEM_ERROR));
        }
    }

    public CoreDocJsonResult<UnitDTO> updateIdempotent(OpenAPIDTO<UnitDTO> dto) {
        if (dto == null || dto.getData() == null) {
            return CoreDocJsonResult.error((BusinessException)new CoreDocBusinessException(CoreDocBusinessErrorEnum.PARAM_NOT_NULL));
        }
        try {
            UnitDTO unitDTO = (UnitDTO)dto.getData();
            Map map = (Map)UpcJacksonUtils.OBJECT_MAPPER.readValue(UpcJacksonUtils.OBJECT_MAPPER.writeValueAsString((Object)unitDTO), HashMap.class);
            Unit unit = new Unit();
            QueryConditionGroup queryConditionGroup = null;
            if (unitDTO.getCode() != null && unitDTO.getId() == null) {
                queryConditionGroup = QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"code").eq((Object)unitDTO.getCode())});
            } else {
                if (unitDTO.getCode() == null && unitDTO.getId() == null) {
                    throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_800880);
                }
                if (unitDTO.getId() != null) {
                    queryConditionGroup = QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"id").eq((Object)unitDTO.getId())});
                }
            }
            QuerySchema querySchema = QuerySchema.create().addSelect("id,stopstatus,name,unitCharacter").addCondition(queryConditionGroup);
            List queryResults = MetaDaoHelper.query((String)"pc.unit.Unit", (boolean)true, (QuerySchema)querySchema, null);
            if (queryResults != null && queryResults.size() != 1) {
                throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_801272);
            }
            Map queryResult = (Map)queryResults.get(0);
            unit.putAll(map);
            unit.put("_fromApi", (Object)true);
            unit.put("_status", (Object)EntityStatus.Update);
            unit.setId(queryResult.get("id"));
            if (unitDTO.getName() != null) {
                unit.set("name", (Object)UpcAPiTool.handleMultilingual((MultilingualVO)unitDTO.getName()));
            } else {
                unit.set("name", queryResult.get("name"));
            }
            if (unitDTO.getBaseUnit() != null) {
                unit.put("bBaseUnit", (Object)unitDTO.getBaseUnit());
            }
            if (unitDTO.getStopStatus() != null) {
                unit.put("stopstatus", (Object)unitDTO.getStopStatus());
            }
            if (queryResult != null && queryResult.get("unitCharacter") != null && unit.get("unitCharacter") != null) {
                Object characterId = queryResult.get("unitCharacter");
                if (characterId instanceof Map) {
                    Map character = (Map)unit.get("unitCharacter");
                    character.put("id", ((Map)characterId).get("id").toString());
                    unit.put("unitCharacter", (Object)character);
                } else {
                    unit.remove("unitCharacter");
                }
            }
            BillDataDto billDataDto = UpcAPiTool.builderBillData((String)"pc_unit", (Object)unit, (boolean)true, (int)3);
            Object result = this.apiImportSingleService.singleSave4Api(billDataDto);
            UnitDTO saveResult = new UnitDTO();
            saveResult.setId((Long)((Map)result).get("id"));
            return CoreDocJsonResult.success((Object)saveResult);
        }
        catch (BusinessException businessException) {
            return CoreDocJsonResult.error((BusinessException)businessException);
        }
        catch (Exception e) {
            log.error("\u8ba1\u91cf\u5355\u4f4d\u66f4\u65b0-\u5e42\u7b49\u63a5\u53e3\u5f02\u5e38\uff1a" + e.getMessage(), (Throwable)e);
            return CoreDocJsonResult.error((BusinessException)new CoreDocBusinessException(CoreDocBusinessErrorEnum.SYSTEM_ERROR));
        }
    }

    public CoreDocJsonResult<UnitGroupDTO> addUnitGroupIdempotent(OpenAPIDTO<UnitGroupDTO> dto) {
        if (dto == null || dto.getData() == null) {
            return CoreDocJsonResult.error((BusinessException)new CoreDocBusinessException(CoreDocBusinessErrorEnum.PARAM_NOT_NULL));
        }
        try {
            UnitGroupDTO unitGroupDTO = (UnitGroupDTO)dto.getData();
            Map map = (Map)UpcJacksonUtils.OBJECT_MAPPER.readValue(UpcJacksonUtils.OBJECT_MAPPER.writeValueAsString((Object)unitGroupDTO), HashMap.class);
            UnitGroup unitGroup = new UnitGroup();
            unitGroup.put("_fromApi", (Object)true);
            unitGroup.put("_status", (Object)EntityStatus.Insert);
            unitGroup.putAll(map);
            if (unitGroupDTO.getName() != null) {
                unitGroup.set("name", (Object)UpcAPiTool.handleMultilingual((MultilingualVO)unitGroupDTO.getName()));
            }
            if (unitGroupDTO.getStopStatus() != null) {
                unitGroup.setStopstatus(unitGroupDTO.getStopStatus());
            } else {
                unitGroup.setStopstatus(Boolean.valueOf(false));
            }
            BillDataDto billDataDto = UpcAPiTool.builderBillData((String)"pc_unitgroup", (Object)unitGroup, (boolean)true, (int)3);
            Object result = this.apiImportSingleService.singleSave4Api(billDataDto);
            UnitGroupDTO saveResult = new UnitGroupDTO();
            saveResult.setId((Long)((Map)result).get("id"));
            return CoreDocJsonResult.success((Object)saveResult);
        }
        catch (BusinessException businessException) {
            return CoreDocJsonResult.error((BusinessException)businessException);
        }
        catch (Exception e) {
            log.error("\u8ba1\u91cf\u5355\u4f4d\u5206\u7ec4\u65b0\u589e-\u5e42\u7b49\u63a5\u53e3\u5f02\u5e38\uff1a" + e.getMessage(), (Throwable)e);
            return CoreDocJsonResult.error((BusinessException)new CoreDocBusinessException(CoreDocBusinessErrorEnum.SYSTEM_ERROR));
        }
    }

    public CoreDocJsonResult<UnitGroupDTO> updateUnitGroupIdempotent(OpenAPIDTO<UnitGroupDTO> dto) {
        if (dto == null || dto.getData() == null) {
            return CoreDocJsonResult.error((BusinessException)new CoreDocBusinessException(CoreDocBusinessErrorEnum.PARAM_NOT_NULL));
        }
        try {
            UnitGroupDTO unitGroupDTO = (UnitGroupDTO)dto.getData();
            Map map = (Map)UpcJacksonUtils.OBJECT_MAPPER.readValue(UpcJacksonUtils.OBJECT_MAPPER.writeValueAsString((Object)unitGroupDTO), HashMap.class);
            QueryConditionGroup queryConditionGroup = null;
            if (unitGroupDTO.getCode() != null && unitGroupDTO.getId() == null) {
                queryConditionGroup = QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"code").eq((Object)unitGroupDTO.getCode())});
            } else {
                if (unitGroupDTO.getCode() == null && unitGroupDTO.getId() == null) {
                    throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_800880);
                }
                if (unitGroupDTO.getId() != null) {
                    queryConditionGroup = QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"id").eq((Object)unitGroupDTO.getId())});
                }
            }
            QuerySchema querySchema = QuerySchema.create().addSelect(new String[]{"id", "name"}).addCondition((ConditionExpression)queryConditionGroup);
            List queryResults = MetaDaoHelper.query((String)"pc.unit.UnitGroup", (boolean)true, (QuerySchema)querySchema, null);
            if (queryResults == null || queryResults.size() != 1) {
                throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_801264);
            }
            Map queryResult = (Map)queryResults.get(0);
            UnitGroup unitGroup = new UnitGroup();
            unitGroup.putAll(map);
            unitGroup.put("_fromApi", (Object)true);
            unitGroup.put("_status", (Object)EntityStatus.Update);
            unitGroup.setId(queryResult.get("id"));
            if (unitGroupDTO.getName() != null) {
                unitGroup.set("name", (Object)UpcAPiTool.handleMultilingual((MultilingualVO)unitGroupDTO.getName()));
            } else {
                unitGroup.set("name", queryResult.get("name"));
            }
            if (unitGroupDTO.getStopStatus() != null) {
                unitGroup.setStopstatus(unitGroupDTO.getStopStatus());
            }
            BillDataDto billDataDto = UpcAPiTool.builderBillData((String)"pc_unitgroup", (Object)unitGroup, (boolean)true, (int)3);
            Object result = this.apiImportSingleService.singleSave4Api(billDataDto);
            UnitGroupDTO saveResult = new UnitGroupDTO();
            saveResult.setId((Long)((Map)result).get("id"));
            return CoreDocJsonResult.success((Object)saveResult);
        }
        catch (BusinessException businessException) {
            return CoreDocJsonResult.error((BusinessException)businessException);
        }
        catch (Exception e) {
            log.error("\u8ba1\u91cf\u5355\u4f4d\u5206\u7ec4\u66f4\u65b0-\u5e42\u7b49\u63a5\u53e3\u5f02\u5e38\uff1a" + e.getMessage(), (Throwable)e);
            return CoreDocJsonResult.error((BusinessException)new CoreDocBusinessException(CoreDocBusinessErrorEnum.SYSTEM_ERROR));
        }
    }

    public CoreDocJsonResult<UnitDTO> unitListByPage(UnitQryDTO unitQryDTO) {
        if (null != unitQryDTO) {
            try {
                List<UnitDTO> unitDTOs = this.queryUnit(unitQryDTO);
                if (!CollectionUtils.isEmpty(unitDTOs)) {
                    return CoreDocJsonResult.success(unitDTOs);
                }
                return CoreDocJsonResult.error((BusinessException)new CoreDocBusinessException(CoreDocBusinessErrorEnum.RESULT_IS_NULL));
            }
            catch (BusinessException businessException) {
                return CoreDocJsonResult.error((BusinessException)businessException);
            }
            catch (Exception e) {
                log.error("\u67e5\u8be2\u8ba1\u91cf\u5355\u4f4d\u4e0e\u5206\u7ec4\u4fe1\u606f\u9519\u8bef:" + e.getMessage(), (Throwable)e);
                return CoreDocJsonResult.error((BusinessException)new CoreDocBusinessException(CoreDocBusinessErrorEnum.SYSTEM_ERROR));
            }
        }
        return CoreDocJsonResult.error((BusinessException)new CoreDocBusinessException(CoreDocBusinessErrorEnum.PARAM_NOT_NULL));
    }
}


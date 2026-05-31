/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.alibaba.fastjson.JSON
 *  com.yonyou.cloud.middleware.rpc.RemoteCall
 *  com.yonyou.diwork.ott.exexutors.RobotExecutors
 *  com.yonyou.iuap.apdoc.coredoc.dto.keymapping.UpcAPiTool
 *  com.yonyou.iuap.apdoc.coredoc.enums.CoreExtrateBusinessErrorEnum
 *  com.yonyou.iuap.apdoc.coredoc.exceptions.CoreDocBusinessException
 *  com.yonyou.iuap.apdoc.coredoc.utils.MultiLangUtils
 *  com.yonyou.iuap.context.InvocationInfoProxy
 *  com.yonyou.ucf.mdd.ext.bill.dto.BillDataDto
 *  com.yonyou.ucf.mdd.ext.bill.rule.common.ResultList
 *  com.yonyou.ucf.mdd.ext.dao.meta.MetaDaoHelper
 *  com.yonyou.ucf.mdd.ext.option.util.OptionUtils
 *  com.yonyou.ypd.bd.api.IBDQueryRepository
 *  com.yonyoucloud.iuap.upc.api.IUnitService
 *  com.yonyoucloud.iuap.upc.dto.UnitDTO
 *  com.yonyoucloud.iuap.upc.dto.UnitGroupDTO
 *  com.yonyoucloud.upc.pc.unit.Unit
 *  org.imeta.orm.base.EntityStatus
 *  org.imeta.orm.schema.ConditionExpression
 *  org.imeta.orm.schema.QueryCondition
 *  org.imeta.orm.schema.QueryConditionGroup
 *  org.imeta.orm.schema.QueryField
 *  org.imeta.orm.schema.QuerySchema
 *  org.jetbrains.annotations.Nullable
 *  org.slf4j.Logger
 *  org.slf4j.LoggerFactory
 *  org.springframework.beans.factory.annotation.Autowired
 *  org.springframework.stereotype.Service
 *  org.springframework.util.CollectionUtils
 */
package com.yonyoucloud.upc.service.api;

import com.alibaba.fastjson.JSON;
import com.yonyou.cloud.middleware.rpc.RemoteCall;
import com.yonyou.diwork.ott.exexutors.RobotExecutors;
import com.yonyou.iuap.apdoc.coredoc.dto.keymapping.UpcAPiTool;
import com.yonyou.iuap.apdoc.coredoc.enums.CoreExtrateBusinessErrorEnum;
import com.yonyou.iuap.apdoc.coredoc.exceptions.CoreDocBusinessException;
import com.yonyou.iuap.apdoc.coredoc.utils.MultiLangUtils;
import com.yonyou.iuap.context.InvocationInfoProxy;
import com.yonyou.ucf.mdd.ext.bill.dto.BillDataDto;
import com.yonyou.ucf.mdd.ext.bill.rule.common.ResultList;
import com.yonyou.ucf.mdd.ext.dao.meta.MetaDaoHelper;
import com.yonyou.ucf.mdd.ext.option.util.OptionUtils;
import com.yonyou.ypd.bd.api.IBDQueryRepository;
import com.yonyoucloud.iuap.upc.api.IUnitService;
import com.yonyoucloud.iuap.upc.dto.UnitDTO;
import com.yonyoucloud.iuap.upc.dto.UnitGroupDTO;
import com.yonyoucloud.upc.pc.unit.Unit;
import com.yonyoucloud.upc.service.UnitService;
import java.math.BigDecimal;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.imeta.orm.base.EntityStatus;
import org.imeta.orm.schema.ConditionExpression;
import org.imeta.orm.schema.QueryCondition;
import org.imeta.orm.schema.QueryConditionGroup;
import org.imeta.orm.schema.QueryField;
import org.imeta.orm.schema.QuerySchema;
import org.jetbrains.annotations.Nullable;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;

@Service
@RemoteCall(value="productcenter@c87e2267-1001-4c70-bb2a-ab41f3b81aa3")
public class UnitServiceImpl
implements IUnitService {
    private static final Logger log = LoggerFactory.getLogger(UnitServiceImpl.class);
    public final String GROUP_CODE = "groupcode";
    public final String GROUP_NAME = "groupname";
    @Autowired
    private UnitService unitService;
    @Autowired
    private IBDQueryRepository billQueryRepository;

    public UnitDTO getUnitById(Long unitId, String[] fields) throws Exception {
        UpcAPiTool.checkPara((Long[])new Long[]{unitId});
        UpcAPiTool.checkPara((String[])fields);
        QueryField[] qryFields = UpcAPiTool.qryFields((String[])fields);
        QuerySchema schema = QuerySchema.create().addSelect(qryFields).addCondition((ConditionExpression)QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"id").eq((Object)unitId)}));
        return this.getUnitDTO(schema);
    }

    public List<UnitDTO> getUnitByIds(List<Long> unitIdList, String[] fields) throws Exception {
        UpcAPiTool.checkPara((List[])new List[]{unitIdList});
        UpcAPiTool.checkPara((String[])fields);
        QueryField[] qryFields = UpcAPiTool.qryFields((String[])fields);
        QuerySchema schema = QuerySchema.create().addSelect(qryFields).addCondition((ConditionExpression)QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"id").in(unitIdList)}));
        return this.listUnitDTOs(schema);
    }

    public List<UnitDTO> getUnitByCode(List<String> unitCodeList, String[] fields) throws Exception {
        UpcAPiTool.checkPara((List[])new List[]{unitCodeList});
        UpcAPiTool.checkPara((String[])fields);
        QueryField[] qryFields = UpcAPiTool.qryFields((String[])fields);
        QuerySchema schema = QuerySchema.create().addSelect(qryFields).addCondition((ConditionExpression)QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"code").in(unitCodeList)}));
        return this.listUnitDTOs(schema);
    }

    public List<UnitDTO> getUnitByErpCode(List<String> erpCodeList, String[] fields) throws Exception {
        UpcAPiTool.checkPara((List[])new List[]{erpCodeList});
        UpcAPiTool.checkPara((String[])fields);
        QueryField[] qryFields = UpcAPiTool.qryFields((String[])fields);
        QuerySchema schema = QuerySchema.create().addSelect(qryFields).addCondition((ConditionExpression)QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"erpCode").in(erpCodeList)}));
        return this.listUnitDTOs(schema);
    }

    public List<UnitDTO> getUnitByUnitGroupId(Long unitGroupId, Boolean bBaseUnit, String[] fields) throws Exception {
        UpcAPiTool.checkPara((Long[])new Long[]{unitGroupId});
        UpcAPiTool.checkPara((String[])fields);
        QueryField[] qryFields = UpcAPiTool.qryFields((String[])fields);
        boolean hasFilterItem = false;
        QueryConditionGroup queryConditionGroup = new QueryConditionGroup();
        if (unitGroupId != null) {
            queryConditionGroup.addCondition((ConditionExpression)QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"unitGroup").eq((Object)unitGroupId)}));
            hasFilterItem = true;
        }
        if (bBaseUnit != null) {
            queryConditionGroup.addCondition((ConditionExpression)QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"bBaseUnit").eq((Object)bBaseUnit)}));
            hasFilterItem = true;
        }
        if (!hasFilterItem) {
            throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_801090);
        }
        QuerySchema schema = QuerySchema.create().addSelect(qryFields).addCondition((ConditionExpression)queryConditionGroup);
        return this.listUnitDTOs(schema);
    }

    public List<UnitGroupDTO> getUnitGroupByCode(List<String> unitGroupCodeList) throws Exception {
        UpcAPiTool.checkPara((List[])new List[]{unitGroupCodeList});
        QuerySchema schema = QuerySchema.create().addSelect("id,code,name,desc").addCondition((ConditionExpression)QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"stopstatus").eq((Object)false), QueryCondition.name((String)"stopstatus").eq((Object)false), QueryCondition.name((String)"isDeleted").eq((Object)false), QueryCondition.name((String)"code").in(unitGroupCodeList)}));
        return this.listUnitGroupDTOs(schema);
    }

    public String unitConversion(Long origUnitId, Double origUnitNum, Long targetUnitId) throws Exception {
        if (origUnitId == null) {
            throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_801091);
        }
        if (origUnitNum == null) {
            throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_801092);
        }
        if (targetUnitId == null) {
            throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_801093);
        }
        String[] fields = new String[]{"id", "unitGroup", "convertCoefficient", "bBaseUnit"};
        UnitDTO OrigUnit = this.getUnitById(origUnitId, fields);
        UnitDTO targetUnit = this.getUnitById(targetUnitId, fields);
        if (!OrigUnit.getUnitGroup().toString().equals(targetUnit.getUnitGroup().toString())) {
            throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_801094);
        }
        if (OrigUnit.getConvertCoefficient() == null) {
            throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_801095, new Object[]{origUnitId});
        }
        if (targetUnit.getConvertCoefficient() == null) {
            throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_801096, new Object[]{targetUnitId});
        }
        List<UnitDTO> unitsByGroup = this.getUnitByUnitGroupId(OrigUnit.getUnitGroup(), true, fields);
        if (unitsByGroup != null && unitsByGroup.size() > 0) {
            BigDecimal result = OrigUnit.getConvertCoefficient().multiply(new BigDecimal(origUnitNum.toString())).divide(targetUnit.getConvertCoefficient()).setScale(2, 4);
            return result.toString();
        }
        throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_801097);
    }

    public Long saveUnit(UnitDTO unitDTO) throws Exception {
        Map unit;
        BillDataDto billDataDto = new BillDataDto();
        billDataDto.setAction("batchCloudImport");
        HashMap<String, Object> bill = new HashMap<String, Object>();
        bill.put("_status", EntityStatus.Insert);
        bill.put("code", unitDTO.getCode());
        bill.put("bBaseUnit", unitDTO.getBBaseUnit());
        bill.put("precision", unitDTO.getPrecision());
        bill.put("socialSrcid", unitDTO.getSocialSrcid());
        bill.put("socialMctype", unitDTO.getSocialMctype());
        bill.put("convertCoefficient", unitDTO.getConvertCoefficient());
        bill.put("isDeleted", false);
        if (null != unitDTO.getName()) {
            bill.put("name", unitDTO.getName());
        }
        bill.put("logicallyDeleteType", 0);
        bill.put("truncationType", unitDTO.getTruncationType());
        bill.put("stopstatus", false);
        if (unitDTO.getCode() != null) {
            Map<String, String> data = this.queryUnit0(unitDTO.getCode());
            bill.put("groupcode", data.get("groupcode"));
            bill.put("groupname", data.get("groupname"));
            bill.put("enName", data.get("enName"));
        }
        billDataDto.setData(bill);
        billDataDto.setBillnum("pc_unit");
        billDataDto.setFullname("pc.unit.Unit");
        billDataDto.setFromApi(true);
        ResultList resultList = this.unitService.saveUnits(billDataDto);
        if (resultList != null && !CollectionUtils.isEmpty((Collection)resultList.getInfos()) && (unit = (Map)resultList.getInfos().get(0)) != null && unit.get("id") != null) {
            return Long.valueOf(unit.get("id").toString());
        }
        return null;
    }

    private Map<String, String> queryUnit0(String code) {
        HashMap<String, String> unit = new HashMap<String, String>();
        RobotExecutors.runAs((String)"0", () -> {
            QuerySchema queryUnit = new QuerySchema();
            queryUnit.addSelect("id, code, name, enName, unitGroup").addCondition((ConditionExpression)QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"ytenant").eq((Object)"0"), QueryCondition.name((String)"code").eq((Object)code)}));
            List unitList0 = this.billQueryRepository.queryMapBySchema("pc.unit.Unit", queryUnit);
            if (!CollectionUtils.isEmpty((Collection)unitList0) && unitList0.get(0) != null && ((Map)unitList0.get(0)).get("enName") != null && ((Map)unitList0.get(0)).get("unitGroup") != null) {
                unit.put("enName", ((Map)unitList0.get(0)).get("enName").toString());
                QuerySchema queryGroup = new QuerySchema();
                queryGroup.addSelect("id, code, name").addCondition((ConditionExpression)QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"ytenant").eq((Object)"0"), QueryCondition.name((String)"id").eq(((Map)unitList0.get(0)).get("unitGroup"))}));
                List groupList0 = this.billQueryRepository.queryMapBySchema("pc.unit.UnitGroup", queryGroup);
                if (!CollectionUtils.isEmpty((Collection)groupList0) && groupList0.get(0) != null && ((Map)groupList0.get(0)).get("name") != null && ((Map)groupList0.get(0)).get("code") != null) {
                    Object name;
                    unit.put("groupcode", ((Map)groupList0.get(0)).get("code").toString());
                    if (((Map)groupList0.get(0)).get("name") instanceof String) {
                        unit.put("groupname", ((Map)groupList0.get(0)).get("name").toString());
                    } else if (((Map)groupList0.get(0)).get("name") instanceof Map && (name = ((Map)((Map)groupList0.get(0)).get("name")).get(InvocationInfoProxy.getLocale())) != null) {
                        unit.put("groupname", name.toString());
                    }
                }
            }
        });
        return unit;
    }

    public Long cloudImportByCode(String code) throws Exception {
        QuerySchema schema = QuerySchema.create().addSelect("code,bBaseUnit,precision,socialMctype,socialSrcid,convertCoefficient,enName,name,truncationType,unitGroup").addCondition((ConditionExpression)QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"code").eq((Object)code), QueryCondition.name((String)"ytenant").eq((Object)"0")}));
        schema.setPartitionable(false);
        List units = MetaDaoHelper.queryObject((String)"pc.unit.Unit", (QuerySchema)schema, null);
        UnitDTO unitDTO = new UnitDTO();
        if (CollectionUtils.isEmpty((Collection)units)) {
            throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_801098, new Object[]{code});
        }
        Unit unit = (Unit)units.get(0);
        unitDTO.setCode(unit.getCode());
        unitDTO.setBBaseUnit(unit.getBBaseUnit());
        unitDTO.setPrecision(unit.getPrecision());
        unitDTO.setSocialSrcid(unit.getSocialSrcid());
        unitDTO.setSocialMctype(unit.getSocialMctype());
        unitDTO.setConvertCoefficient(unit.getConvertCoefficient());
        unitDTO.setErpCode(unit.getEnName());
        unitDTO.setName(unit.getName());
        unitDTO.setTruncationType(unit.getTruncationType());
        unitDTO.setUnitGroup(unit.getUnitGroup());
        Long id = this.saveUnit(unitDTO);
        return id;
    }

    public BigDecimal getTargetUnitNum(Long sourceUnitId, Long targetUnitId, BigDecimal sourceUnitNum) throws Exception {
        BigDecimal targetUnitNum = new BigDecimal(0);
        if (null == sourceUnitId || null == targetUnitId || null == sourceUnitNum || sourceUnitNum.compareTo(BigDecimal.ZERO) <= 0) {
            return null;
        }
        int scale = (Integer)OptionUtils.getSysOptionByName((String)"conversionAccuracy");
        Map sourceUnitMap = MetaDaoHelper.queryOne((String)"pc.unit.Unit", (QuerySchema)QuerySchema.create().addSelect(new String[]{"convertCoefficient", "unitGroup"}).appendQueryCondition(new ConditionExpression[]{QueryCondition.name((String)"id").eq((Object)sourceUnitId)}));
        if (sourceUnitMap == null || null == sourceUnitMap.get("convertCoefficient") || ((BigDecimal)sourceUnitMap.get("convertCoefficient")).compareTo(BigDecimal.ZERO) <= 0) {
            return null;
        }
        Map targetUnitMap = MetaDaoHelper.queryOne((String)"pc.unit.Unit", (QuerySchema)QuerySchema.create().addSelect(new String[]{"convertCoefficient", "unitGroup"}).appendQueryCondition(new ConditionExpression[]{QueryCondition.name((String)"id").eq((Object)targetUnitId)}));
        if (targetUnitMap == null || null == targetUnitMap.get("convertCoefficient") || ((BigDecimal)targetUnitMap.get("convertCoefficient")).compareTo(BigDecimal.ZERO) <= 0) {
            return null;
        }
        if (!sourceUnitMap.get("unitGroup").toString().equals(targetUnitMap.get("unitGroup").toString())) {
            return null;
        }
        Map baseMap = MetaDaoHelper.queryOne((String)"pc.unit.Unit", (QuerySchema)QuerySchema.create().addSelect("id").appendQueryCondition(new ConditionExpression[]{QueryCondition.name((String)"unitGroup").eq(sourceUnitMap.get("unitGroup")), QueryCondition.name((String)"bBaseUnit").eq((Object)true), QueryCondition.name((String)"stopstatus").eq((Object)false)}));
        if (null == baseMap) {
            return null;
        }
        targetUnitNum = sourceUnitNum.multiply((BigDecimal)sourceUnitMap.get("convertCoefficient")).divide((BigDecimal)targetUnitMap.get("convertCoefficient"), scale, 4);
        return targetUnitNum;
    }

    public UnitDTO getUnitByNameAndGroupCode(String name, String unitGroupCode, String[] fields) throws Exception {
        UpcAPiTool.checkPara((String[])fields);
        if (name == null || unitGroupCode == null) {
            return null;
        }
        QueryField[] qryFields = UpcAPiTool.qryFields((String[])fields);
        QuerySchema schema = QuerySchema.create().addSelect(qryFields).addCondition((ConditionExpression)QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"name").eq((Object)name), QueryCondition.name((String)"unitGroup.code").eq((Object)unitGroupCode)}));
        return this.getUnitDTO(schema);
    }

    public Long getIdByNameOrCode(String name, String code) throws Exception {
        QuerySchema schema = QuerySchema.create().addSelect("id").addCondition((ConditionExpression)QueryConditionGroup.or((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"name").eq((Object)name), QueryCondition.name((String)"code").eq((Object)code)}));
        Map unitMap = MetaDaoHelper.queryOne((String)"pc.unit.Unit", (QuerySchema)schema);
        if (!CollectionUtils.isEmpty((Map)unitMap) && unitMap.get("id") != null) {
            return Long.valueOf(unitMap.get("id").toString());
        }
        return null;
    }

    @Nullable
    private UnitDTO getUnitDTO(QuerySchema schema) {
        try {
            List<UnitDTO> unitDTOS = this.listUnitDTOs(schema);
            if (!CollectionUtils.isEmpty(unitDTOS)) {
                return unitDTOS.get(0);
            }
        }
        catch (Exception e) {
            log.error(e.getMessage(), (Throwable)e);
            throw e;
        }
        return null;
    }

    @Nullable
    private List<UnitDTO> listUnitDTOs(QuerySchema schema) {
        try {
            List unitList = this.billQueryRepository.queryMapBySchema("pc.unit.Unit", schema);
            if (unitList != null) {
                MultiLangUtils.dealNameMultilangs((List)unitList);
                return JSON.parseArray((String)JSON.toJSONString((Object)unitList), UnitDTO.class);
            }
        }
        catch (Exception e) {
            log.error(e.getMessage(), (Throwable)e);
            throw e;
        }
        return null;
    }

    @Nullable
    private List<UnitGroupDTO> listUnitGroupDTOs(QuerySchema schema) throws Exception {
        try {
            List unitGroupMap = MetaDaoHelper.query((String)"pc.unit.UnitGroup", (QuerySchema)schema);
            if (unitGroupMap != null) {
                MultiLangUtils.dealNameMultilangs((List)unitGroupMap);
                return JSON.parseArray((String)JSON.toJSONString((Object)unitGroupMap), UnitGroupDTO.class);
            }
        }
        catch (Exception e) {
            log.error(e.getMessage(), (Throwable)e);
            throw e;
        }
        return null;
    }
}


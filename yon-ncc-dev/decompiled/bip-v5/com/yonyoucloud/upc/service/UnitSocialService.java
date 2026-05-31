/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.alibaba.fastjson.JSON
 *  com.yonyou.diwork.ott.exexutors.RobotExecutors
 *  com.yonyou.iuap.apdoc.coredoc.enums.CoreExtrateBusinessErrorEnum
 *  com.yonyou.iuap.apdoc.coredoc.exceptions.CoreDocBusinessException
 *  com.yonyou.iuap.basedoc.social.distribute.service.AbstractDistributeHandler
 *  com.yonyou.iuap.basedoc.social.param.DocDataMappingInfo
 *  com.yonyou.iuap.basedoc.social.param.ErrorMessage
 *  com.yonyou.iuap.basedoc.social.param.SocialDistributeParam
 *  com.yonyou.iuap.basedoc.social.param.SocialMcTypeParam
 *  com.yonyou.iuap.basedoc.social.util.SocialMcTypeParser
 *  com.yonyou.ucf.mdd.common.model.rule.RuleExecuteResult
 *  com.yonyou.ucf.mdd.ext.api.IBillService
 *  com.yonyou.ucf.mdd.ext.bill.dto.BillDataDto
 *  com.yonyou.ucf.mdd.ext.dao.meta.MetaDaoHelper
 *  com.yonyoucloud.upc.pc.unit.Unit
 *  com.yonyoucloud.upc.pc.unit.UnitGroup
 *  org.imeta.orm.base.BizObject
 *  org.imeta.orm.base.EntityStatus
 *  org.imeta.orm.schema.ConditionExpression
 *  org.imeta.orm.schema.QueryCondition
 *  org.imeta.orm.schema.QueryConditionGroup
 *  org.imeta.orm.schema.QuerySchema
 *  org.imeta.spring.support.id.IdManager
 *  org.slf4j.Logger
 *  org.slf4j.LoggerFactory
 *  org.springframework.beans.factory.annotation.Autowired
 *  org.springframework.beans.factory.annotation.Qualifier
 *  org.springframework.stereotype.Component
 *  org.springframework.util.CollectionUtils
 */
package com.yonyoucloud.upc.service;

import com.alibaba.fastjson.JSON;
import com.yonyou.diwork.ott.exexutors.RobotExecutors;
import com.yonyou.iuap.apdoc.coredoc.enums.CoreExtrateBusinessErrorEnum;
import com.yonyou.iuap.apdoc.coredoc.exceptions.CoreDocBusinessException;
import com.yonyou.iuap.basedoc.social.distribute.service.AbstractDistributeHandler;
import com.yonyou.iuap.basedoc.social.param.DocDataMappingInfo;
import com.yonyou.iuap.basedoc.social.param.ErrorMessage;
import com.yonyou.iuap.basedoc.social.param.SocialDistributeParam;
import com.yonyou.iuap.basedoc.social.param.SocialMcTypeParam;
import com.yonyou.iuap.basedoc.social.util.SocialMcTypeParser;
import com.yonyou.ucf.mdd.common.model.rule.RuleExecuteResult;
import com.yonyou.ucf.mdd.ext.api.IBillService;
import com.yonyou.ucf.mdd.ext.bill.dto.BillDataDto;
import com.yonyou.ucf.mdd.ext.dao.meta.MetaDaoHelper;
import com.yonyoucloud.upc.pc.unit.Unit;
import com.yonyoucloud.upc.pc.unit.UnitGroup;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;
import org.imeta.orm.base.BizObject;
import org.imeta.orm.base.EntityStatus;
import org.imeta.orm.schema.ConditionExpression;
import org.imeta.orm.schema.QueryCondition;
import org.imeta.orm.schema.QueryConditionGroup;
import org.imeta.orm.schema.QuerySchema;
import org.imeta.spring.support.id.IdManager;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
import org.springframework.util.CollectionUtils;

@Component(value="distributehandlerpc.unit.Unit")
public class UnitSocialService
extends AbstractDistributeHandler {
    private static final String UNIT_PROPERTIES_ALIAS = "code,bBaseUnit,precision,socialSrcid,socialMctype,isDeleted,name,enName,logicallyDeleteType,sourcetype,truncationType,id,unitGroup,stopstatus";
    private static final String UNITGROUP_PROPERTIES_ALIAS = "code,isDeleted,name,sourcetype,id,tenant,stopstatus,desc,erpCode,sociCoreArchive";
    private static final Logger logger = LoggerFactory.getLogger(UnitSocialService.class);
    private static final int MAX_COUNT = 1000;
    @Autowired
    @Qualifier(value="defaultBillService")
    private IBillService billService;

    public void handlerBefore(SocialDistributeParam socialDistributeParam) {
        this.setIsOverWrite(true);
    }

    private List<Unit> queryUnitData(QuerySchema querySchema) throws Exception {
        querySchema.addSelect(UNIT_PROPERTIES_ALIAS);
        List unitListMap = MetaDaoHelper.queryNoPartition((String)"pc.unit.Unit", (QuerySchema)querySchema, null);
        if (unitListMap != null && unitListMap.size() > 0) {
            return JSON.parseArray((String)JSON.toJSONString((Object)unitListMap), Unit.class);
        }
        return null;
    }

    private List<UnitGroup> queryUnitGroupData(QuerySchema querySchema) throws Exception {
        querySchema.addSelect(UNITGROUP_PROPERTIES_ALIAS);
        List unitGroupListMap = MetaDaoHelper.queryNoPartition((String)"pc.unit.UnitGroup", (QuerySchema)querySchema, null);
        if (unitGroupListMap != null && unitGroupListMap.size() > 0) {
            return JSON.parseArray((String)JSON.toJSONString((Object)unitGroupListMap), UnitGroup.class);
        }
        return null;
    }

    public Map handler(SocialDistributeParam distributeParam) throws Exception {
        this.setIsOverWrite(true);
        if (distributeParam.getIds().isEmpty()) {
            throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_801494);
        }
        if (distributeParam.getIds().size() > 1000) {
            throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_801495);
        }
        QuerySchema querySchema = new QuerySchema();
        querySchema.addCondition((ConditionExpression)QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"id").in((Collection)distributeParam.getIds()), QueryCondition.name((String)"tenant").eq((Object)this.ytenantidChangeTenantid(distributeParam.getSrcTenantid()))}));
        List unitList = (List)RobotExecutors.runAs((String)distributeParam.getSrcTenantid(), () -> this.queryUnitData(querySchema));
        QuerySchema desQuerySchema = new QuerySchema();
        desQuerySchema.addCondition((ConditionExpression)QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"socialSrcid").in((Collection)distributeParam.getIds()), QueryCondition.name((String)"tenant").eq((Object)this.ytenantidChangeTenantid(distributeParam.getDesTenantid())), QueryCondition.name((String)"socialTenantid").eq((Object)distributeParam.getSrcTenantid())}));
        List descUnitList = (List)RobotExecutors.runAs((String)distributeParam.getSrcTenantid(), () -> this.queryUnitData(desQuerySchema));
        int count = !CollectionUtils.isEmpty((Collection)unitList) ? unitList.size() : 0;
        AtomicInteger failCount = new AtomicInteger();
        ArrayList errorMessages = new ArrayList();
        ArrayList infos = new ArrayList();
        if (!CollectionUtils.isEmpty((Collection)unitList)) {
            HashMap hassDistributeMap = new HashMap();
            if (!CollectionUtils.isEmpty((Collection)descUnitList)) {
                descUnitList.forEach(descUnit -> {
                    if (descUnit.getSocialSrcid() != null) {
                        hassDistributeMap.put(descUnit.getSocialSrcid(), descUnit);
                    }
                });
            }
            ArrayList srcUnitGroupIds = new ArrayList();
            unitList.forEach(unit -> srcUnitGroupIds.add(unit.getUnitGroup()));
            QuerySchema querySchemaUnitGroup = new QuerySchema();
            querySchemaUnitGroup.addSelect(UNITGROUP_PROPERTIES_ALIAS).addCondition((ConditionExpression)QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"id").in(srcUnitGroupIds), QueryCondition.name((String)"tenant").eq((Object)this.ytenantidChangeTenantid(distributeParam.getSrcTenantid()))}));
            QuerySchema finalQuerySchemaUnitGroup = querySchemaUnitGroup;
            List srcUnitGroupList = (List)RobotExecutors.runAs((String)distributeParam.getSrcTenantid(), () -> this.queryUnitGroupData(finalQuerySchemaUnitGroup));
            HashMap srcUnitGroupMap = new HashMap();
            srcUnitGroupList.forEach(srcUnitGroup -> srcUnitGroupMap.put((Long)srcUnitGroup.getId(), srcUnitGroup));
            ArrayList srcGroupNameList = new ArrayList();
            ArrayList srcGroupCodeList = new ArrayList();
            srcUnitGroupList.forEach(srcUnitGroup -> {
                srcGroupNameList.add(this.getUnitGroupName((UnitGroup)srcUnitGroup));
                srcGroupCodeList.add(srcUnitGroup.getCode());
            });
            querySchemaUnitGroup = new QuerySchema();
            querySchemaUnitGroup.addSelect(UNITGROUP_PROPERTIES_ALIAS).addCondition((ConditionExpression)QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryConditionGroup.or((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"code").in(srcGroupCodeList), QueryCondition.name((String)"name").in(srcGroupNameList)}), QueryCondition.name((String)"tenant").eq((Object)this.ytenantidChangeTenantid(distributeParam.getDesTenantid()))}));
            QuerySchema finalQuerySchemaUnitGroup1 = querySchemaUnitGroup;
            List descUnitGroupList = (List)RobotExecutors.runAs((String)distributeParam.getDesTenantid(), () -> this.queryUnitGroupData(finalQuerySchemaUnitGroup1));
            HashMap descUnitGroupNameMap = new HashMap();
            HashMap descUnitGroupCodeMap = new HashMap();
            if (!CollectionUtils.isEmpty((Collection)descUnitGroupList)) {
                descUnitGroupList.forEach(descUnitGroup -> {
                    descUnitGroupNameMap.put(this.getUnitGroupName((UnitGroup)descUnitGroup), descUnitGroup);
                    descUnitGroupCodeMap.put(descUnitGroup.getCode(), descUnitGroup);
                });
            }
            unitList.forEach(unit -> {
                Long srcGroupId = unit.getUnitGroup();
                UnitGroup srcGroup = (UnitGroup)srcUnitGroupMap.get(srcGroupId);
                String srcGroupName = this.getUnitGroupName(srcGroup);
                String srcGroupCode = srcGroup.getCode();
                if (descUnitGroupNameMap.get(srcGroupName) != null || descUnitGroupCodeMap.get(srcGroupCode) != null) {
                    Long descUnitGroupId = descUnitGroupNameMap.get(srcGroupName) != null ? (Long)((UnitGroup)descUnitGroupNameMap.get(srcGroupName)).getId() : (Long)((UnitGroup)descUnitGroupCodeMap.get(srcGroupCode)).getId();
                    unit.setUnitGroup(descUnitGroupId);
                } else {
                    UnitGroup group = new UnitGroup();
                    try {
                        group = this.saveGroup(srcGroup, group);
                    }
                    catch (Exception e) {
                        logger.error("\u8ba1\u91cf\u5355\u4f4d\u5206\u7ec4\u4fdd\u5b58\u5f02\u5e38({}):" + e.getMessage(), (Throwable)e);
                    }
                    descUnitGroupNameMap.put(this.getUnitGroupName(group), group);
                    descUnitGroupCodeMap.put(group.getCode(), group);
                    unit.setUnitGroup((Long)group.getId());
                }
                String socialSrcId = unit.getId().toString();
                Unit existUnit = (Unit)hassDistributeMap.get(socialSrcId);
                if (existUnit != null) {
                    unit.setId(existUnit.getId());
                    unit.setModifyTime(new Date());
                    unit.setEntityStatus(EntityStatus.Update);
                } else {
                    unit.setId((Object)IdManager.getInstance().nextId());
                    unit.setCreateTime(new Date());
                    unit.setEntityStatus(EntityStatus.Insert);
                }
                unit.setSocialSrcid(socialSrcId);
                SocialMcTypeParam socialMcTypeParam = distributeParam.getSocialMcTypeParam();
                unit.setSocialMctype(Integer.valueOf(SocialMcTypeParser.parseSocialMcType((SocialMcTypeParam)socialMcTypeParam, (Map)unit)));
                unit.setSocialTenantid(distributeParam.getSrcTenantid());
                unit.set("data_from_type", (Object)"social");
                try {
                    BillDataDto billDataDto = new BillDataDto();
                    billDataDto.setBillnum(distributeParam.getBillno());
                    billDataDto.setData(unit);
                    billDataDto.setBillnum("pc_unit");
                    billDataDto.setFullname("pc.unit.Unit");
                    RuleExecuteResult result = (RuleExecuteResult)RobotExecutors.runAs((String)distributeParam.getDesTenantid(), () -> this.billService.executeUpdate("save", billDataDto));
                    infos.add(DocDataMappingInfo.buildDocDataMappingInfo((String)socialSrcId, (String)((Unit)result.getData()).get("id").toString()));
                }
                catch (Exception e) {
                    failCount.getAndIncrement();
                    errorMessages.add(new ErrorMessage(socialSrcId, e.getMessage()));
                    logger.error("data = [{}]", (Object)JSON.toJSONString((Object)unit), (Object)e);
                }
            });
        }
        HashMap<String, Serializable> result = new HashMap<String, Serializable>();
        result.put("count", Integer.valueOf(count));
        result.put("failCount", failCount);
        result.put("infos", infos);
        result.put("errorMessages", errorMessages);
        return result;
    }

    private UnitGroup saveGroup(UnitGroup srcgroup, UnitGroup group) throws Exception {
        BillDataDto billDataDto = new BillDataDto();
        billDataDto.setBillnum("pc_unitgroup");
        billDataDto.setFullname("pc.unit.UnitGroup");
        billDataDto.setAction("save");
        group.setDesc((String)srcgroup.get("desc"));
        group.setIsDeleted(Boolean.valueOf(false));
        group.setSourcetype(Boolean.valueOf(true));
        group.setEntityStatus(EntityStatus.Insert);
        group.setStopstatus(Boolean.valueOf(false));
        group.setCode((String)srcgroup.get("code"));
        group.setName((String)srcgroup.get("name"));
        String s = JSON.toJSONString((Object)group);
        billDataDto.setData((Object)s);
        RuleExecuteResult result = this.billService.save(billDataDto);
        return (UnitGroup)result.getData();
    }

    private Long ytenantidChangeTenantid(String yhtTenantId) {
        QuerySchema querySchema = QuerySchema.create();
        querySchema.setPartitionable(false);
        if (yhtTenantId == null || yhtTenantId.length() == 0) {
            throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_801050);
        }
        querySchema.addSelect("id").addCondition((ConditionExpression)QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"tenantCenter").eq((Object)yhtTenantId)}));
        Map stringObjectMap = new HashMap();
        try {
            stringObjectMap = MetaDaoHelper.queryOne((String)"base.tenant.Tenant", (QuerySchema)querySchema);
        }
        catch (Exception e) {
            logger.error("\u79df\u6237\u4fe1\u606f\u67e5\u8be2\u6570\u636e\u5f02\u5e38({}):" + e.getMessage(), (Throwable)e);
        }
        if (stringObjectMap == null || stringObjectMap.isEmpty()) {
            throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_801496);
        }
        Long tenanttId = Long.valueOf(stringObjectMap.get("id").toString());
        return tenanttId;
    }

    private String getUnitGroupName(UnitGroup group) {
        String groupName = group.get("name") instanceof String ? (String)group.get("name") : (String)((BizObject)group.get("name")).get("zh_CN");
        return groupName;
    }
}


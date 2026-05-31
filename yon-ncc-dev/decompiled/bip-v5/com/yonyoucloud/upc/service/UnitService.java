/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.alibaba.fastjson.JSON
 *  com.yonyou.diwork.ott.exexutors.RobotExecutors
 *  com.yonyou.iuap.apdoc.coredoc.dao.unit.UnitQryDao
 *  com.yonyou.iuap.apdoc.coredoc.enums.LanguagesEnum
 *  com.yonyou.iuap.apdoc.coredoc.po.unit.UnitPO
 *  com.yonyou.iuap.apdoc.coredoc.utils.MultiLangUtils
 *  com.yonyou.iuap.ml.vo.LanguageVO
 *  com.yonyou.iuap.ucf.common.ml.MultiLangContext
 *  com.yonyou.ucf.mdd.common.model.rule.RuleExecuteResult
 *  com.yonyou.ucf.mdd.ext.bill.dto.BillDataDto
 *  com.yonyou.ucf.mdd.ext.bill.rule.common.ResultList
 *  com.yonyou.ucf.mdd.ext.option.util.OptionUtils
 *  com.yonyou.ucf.mdd.ext.poi.dto.ExcelErrorMsgDto
 *  com.yonyou.ypd.bd.api.IBDQueryRepository
 *  com.yonyoucloud.upc.data.unit.UnitDao
 *  com.yonyoucloud.upc.pc.unit.Unit
 *  com.yonyoucloud.upc.pc.unit.UnitGroup
 *  org.imeta.orm.base.BizObject
 *  org.imeta.orm.base.EntityStatus
 *  org.imeta.orm.schema.ConditionExpression
 *  org.imeta.orm.schema.QueryCondition
 *  org.imeta.orm.schema.QueryConditionGroup
 *  org.imeta.orm.schema.QuerySchema
 *  org.jetbrains.annotations.NotNull
 *  org.jetbrains.annotations.Nullable
 *  org.slf4j.Logger
 *  org.slf4j.LoggerFactory
 *  org.springframework.beans.factory.annotation.Autowired
 *  org.springframework.beans.factory.annotation.Qualifier
 *  org.springframework.stereotype.Service
 *  org.springframework.util.CollectionUtils
 */
package com.yonyoucloud.upc.service;

import com.alibaba.fastjson.JSON;
import com.yonyou.diwork.ott.exexutors.RobotExecutors;
import com.yonyou.iuap.apdoc.coredoc.dao.unit.UnitQryDao;
import com.yonyou.iuap.apdoc.coredoc.enums.LanguagesEnum;
import com.yonyou.iuap.apdoc.coredoc.po.unit.UnitPO;
import com.yonyou.iuap.apdoc.coredoc.utils.MultiLangUtils;
import com.yonyou.iuap.ml.vo.LanguageVO;
import com.yonyou.iuap.ucf.common.ml.MultiLangContext;
import com.yonyou.ucf.mdd.common.model.rule.RuleExecuteResult;
import com.yonyou.ucf.mdd.ext.bill.dto.BillDataDto;
import com.yonyou.ucf.mdd.ext.bill.rule.common.ResultList;
import com.yonyou.ucf.mdd.ext.option.util.OptionUtils;
import com.yonyou.ucf.mdd.ext.poi.dto.ExcelErrorMsgDto;
import com.yonyou.ypd.bd.api.IBDQueryRepository;
import com.yonyoucloud.iuap.upc.api.service.IUPCBillService;
import com.yonyoucloud.upc.data.unit.UnitDao;
import com.yonyoucloud.upc.pc.unit.Unit;
import com.yonyoucloud.upc.pc.unit.UnitGroup;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import org.imeta.orm.base.BizObject;
import org.imeta.orm.base.EntityStatus;
import org.imeta.orm.schema.ConditionExpression;
import org.imeta.orm.schema.QueryCondition;
import org.imeta.orm.schema.QueryConditionGroup;
import org.imeta.orm.schema.QuerySchema;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;

@Service(value="unitService")
public class UnitService {
    private static final Logger log = LoggerFactory.getLogger(UnitService.class);
    @Autowired
    @Qualifier(value="pc.BillService")
    private IUPCBillService billService;
    @Autowired
    private UnitDao unitDao;
    @Autowired
    UnitQryDao unitQryDao;
    @Autowired
    private IBDQueryRepository billQueryRepository;

    public ResultList batchCloudImport(BillDataDto bill) throws Exception {
        String action = bill.getAction();
        if ("cloudImport".equals(action)) {
            List<Map<String, Object>> units = this.getAllCloudImportUnits();
            bill.setData(units);
        }
        if ("batchCloudImport".equals(action)) {
            Object data = bill.getData();
            List dataList = new ArrayList<Map>();
            if (data instanceof Map) {
                dataList.add((Map)data);
            } else if (data instanceof List) {
                dataList = (List)data;
            }
            this.dealUnitData(dataList);
        }
        return this.saveUnits(bill);
    }

    @NotNull
    public ResultList saveUnits(BillDataDto bill) throws Exception {
        bill.setBillnum("pc_unit");
        ResultList resultList = this.billService.batchSave(bill);
        ArrayList<String> msgs = new ArrayList<String>();
        List messages = resultList.getMessages();
        for (Object msg : messages) {
            if (msg instanceof ExcelErrorMsgDto) {
                msgs.add(((ExcelErrorMsgDto)msg).getMessage());
                continue;
            }
            msgs.add(msg.toString());
        }
        resultList.setMessages(msgs);
        return resultList;
    }

    private void dealUnitData(List<Map> dataList) throws Exception {
        List<Map<String, Object>> allGroup0 = this.getAllGroup0();
        List<Map<String, Object>> allUnit0 = this.getAllUnit0();
        Map<String, Map<String, Object>> groupTenantMap = this.getGroupTenantMap();
        for (Map unit : dataList) {
            if (unit == null) continue;
            this.getSaveUnitData(allGroup0, allUnit0, groupTenantMap, unit);
        }
    }

    private void getSaveUnitData(List<Map<String, Object>> allGroup0, List<Map<String, Object>> allUnit0, Map<String, Map<String, Object>> groupTenantMap, Map unit) throws Exception {
        Object groupId;
        List unitInDbList0 = allUnit0.stream().filter(m -> m.get("code").equals(unit.get("code"))).collect(Collectors.toList());
        if (CollectionUtils.isEmpty(unitInDbList0)) {
            return;
        }
        Map unitInDb0 = (Map)unitInDbList0.get(0);
        List unitGroupInDbs0 = allGroup0.stream().filter(m -> m.get("id").toString().equals(unit.get("unitGroup").toString())).collect(Collectors.toList());
        Map unitGroupInDb0 = (Map)unitGroupInDbs0.get(0);
        Map<String, Object> unitGroup = this.getOldgroup(groupTenantMap, unitGroupInDb0);
        if (unitGroup == null) {
            BizObject group = new BizObject();
            group = this.saveGroup(unitGroupInDb0, group);
            groupId = group.get("id");
            groupTenantMap.put(group.get("code").toString(), (Map<String, Object>)group);
            String groupName = this.getGroupName((Map<String, Object>)group);
            groupTenantMap.put(groupName, (Map<String, Object>)group);
        } else {
            groupId = unitGroup.get("id");
        }
        unit.put("name", unitInDb0.get("name"));
        this.setSaveUnitData(groupId, unit);
    }

    private List<Map<String, Object>> getAllCloudImportUnits() throws Exception {
        ArrayList<Map<String, Object>> allUnitSave = new ArrayList<Map<String, Object>>();
        List<Map<String, Object>> allGroup = this.getAllGroup0();
        List<Map<String, Object>> allUnit0 = this.getAllUnit0();
        Map<String, Map<String, Object>> groupTenantMap = this.getGroupTenantMap();
        for (Map<String, Object> group0 : allGroup) {
            Object groupId;
            Map<String, Object> oldgroup = this.getOldgroup(groupTenantMap, group0);
            List unitList = allUnit0.stream().filter(u -> u.get("unitGroup").equals(group0.get("id"))).collect(Collectors.toList());
            if (oldgroup == null) {
                BizObject group = new BizObject();
                group = this.saveGroup(group0, group);
                groupId = group.get("id");
            } else {
                groupId = oldgroup.get("id");
            }
            for (Map unit : unitList) {
                this.setSaveUnitData(groupId, unit);
            }
            allUnitSave.addAll(unitList);
        }
        return allUnitSave;
    }

    private void setSaveUnitData(Object groupId, Map u) {
        u.remove("name2");
        u.remove("name3");
        u.put("unitGroup", groupId);
        u.put("_status", EntityStatus.Insert);
        u.put("sourcetype", true);
        u.remove("tenant");
        u.remove("id");
        u.remove("createTime");
        u.remove("pubts");
        u.remove("createDate");
        u.put("truncationType", 4);
    }

    private Map<String, Object> getOldgroup(Map<String, Map<String, Object>> groupTenantMap, Map<String, Object> group0) {
        Map<String, Object> oldgroup = groupTenantMap.get(group0.get("code"));
        if (null == oldgroup) {
            String groupName = this.getGroupName(group0);
            oldgroup = groupTenantMap.get(groupName);
        }
        return oldgroup;
    }

    private Map<String, Map<String, Object>> getGroupTenantMap() {
        HashMap<String, Map<String, Object>> groupTenantMap = new HashMap<String, Map<String, Object>>();
        List<Map<String, Object>> allGroupTenant = this.getAllGroup();
        for (Map<String, Object> group : allGroupTenant) {
            groupTenantMap.put(group.get("code").toString(), group);
            String groupName = this.getGroupName(group);
            groupTenantMap.put(groupName, group);
        }
        return groupTenantMap;
    }

    @Nullable
    public String getGroupName(Map<String, Object> group) {
        String groupName = null;
        if (group.get("name") instanceof String) {
            groupName = group.get("name").toString();
        } else {
            Object zhName = ((Map)group.get("name")).get("zh_CN");
            if (zhName != null) {
                groupName = zhName.toString();
            }
        }
        return groupName;
    }

    private List<Map<String, Object>> getAllGroup0() {
        ArrayList<Map<String, Object>> groupList = new ArrayList<Map<String, Object>>();
        RobotExecutors.runAs((String)"0", () -> {
            QuerySchema querySchema = new QuerySchema();
            querySchema.addSelect("id, code, name, desc, sourcetype, stopstatus").addCondition((ConditionExpression)QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"ytenant").eq((Object)"0")}));
            List groupList0 = this.billQueryRepository.queryMapBySchema("pc.unit.UnitGroup", querySchema);
            groupList.addAll(groupList0);
        });
        List multilangTextMapList = this.unitQryDao.getUnitGroupTenant0();
        this.setCurrentByDefaultLang(groupList, multilangTextMapList);
        return groupList;
    }

    private void setCurrentByDefaultLang(List<Map<String, Object>> dataList, List<Map<String, Object>> multilangTextMapList) {
        String currentLangCode = MultiLangContext.getInstance().getCurrentLangVO().getLangCode();
        String defaultLangCode = MultiLangContext.getInstance().getDefaultLangVO().getLangCode();
        LinkedList enableLangVOs = MultiLangContext.getInstance().getEnableLangVOs();
        for (Map<String, Object> data : dataList) {
            Object nameObj = data.get("name");
            if (null == nameObj || !(nameObj instanceof Map)) continue;
            Map nameMap = (Map)nameObj;
            HashMap<String, String> newNameMap = new HashMap<String, String>();
            Long id = (Long)data.get("id");
            String fieldName = (String)UnitPO.metaArrColumnFieldMap.get("name");
            for (LanguageVO langVO : enableLangVOs) {
                String langCode = langVO.getLangCode();
                MultiLangUtils.replaceNameLangByLangCode(multilangTextMapList, (Map)nameMap, newNameMap, (Long)id, (String)langCode, (String)fieldName);
                if (!currentLangCode.equals(langCode) || null != newNameMap.get(langCode) || null != newNameMap.get(defaultLangCode)) continue;
                newNameMap.put(langCode, (String)newNameMap.get(defaultLangCode));
            }
            MultiLangUtils.replaceNameLangByLangCode(multilangTextMapList, (Map)nameMap, newNameMap, (Long)id, (String)LanguagesEnum.zh_CN.getName(), (String)fieldName);
            MultiLangUtils.replaceNameLangByLangCode(multilangTextMapList, (Map)nameMap, newNameMap, (Long)id, (String)LanguagesEnum.en_US.getName(), (String)fieldName);
            MultiLangUtils.replaceNameLangByLangCode(multilangTextMapList, (Map)nameMap, newNameMap, (Long)id, (String)LanguagesEnum.zh_TW.getName(), (String)fieldName);
            data.put("name", newNameMap);
        }
    }

    private List<Map<String, Object>> getAllGroup() {
        QuerySchema querySchema = new QuerySchema();
        querySchema.addSelect("id, code, name, desc, sourcetype, stopstatus");
        List groupList = this.billQueryRepository.queryMapBySchema("pc.unit.UnitGroup", querySchema);
        this.setCurrentByDefaultLang(groupList, null);
        return groupList;
    }

    private List<Map<String, Object>> getAllUnit0() {
        ArrayList<Map<String, Object>> unitList = new ArrayList<Map<String, Object>>();
        RobotExecutors.runAs((String)"0", () -> {
            QuerySchema querySchema = new QuerySchema();
            querySchema.addSelect("id, code, name, stopstatus, bBaseUnit, enName, sourcetype, truncationType, unitGroup").addCondition((ConditionExpression)QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"ytenant").eq((Object)"0")}));
            List unitList0 = this.billQueryRepository.queryMapBySchema("pc.unit.Unit", querySchema);
            unitList.addAll(unitList0);
        });
        List multilangTextMapList = this.unitQryDao.getUnitTenant0();
        this.setCurrentByDefaultLang(unitList, multilangTextMapList);
        return unitList;
    }

    private UnitGroup saveGroup(Map<String, Object> group0, BizObject group) throws Exception {
        BillDataDto bill0 = new BillDataDto();
        bill0.setBillnum("pc_unitgroup");
        bill0.setFullname("pc.unit.UnitGroup");
        bill0.setAction("save");
        if (group0.get("desc") != null) {
            group.put("desc", (Object)group0.get("desc").toString());
        }
        if (group0.get("code") != null) {
            group.put("code", (Object)group0.get("code").toString());
        }
        group.put("isDeleted", (Object)false);
        group.put("sourcetype", (Object)true);
        group.put("_status", (Object)EntityStatus.Insert);
        group.put("stopstatus", (Object)false);
        group.put("name", group0.get("name"));
        String s = JSON.toJSONString((Object)group);
        bill0.setData((Object)s);
        RuleExecuteResult result0 = this.billService.save(bill0);
        return (UnitGroup)result0.getData();
    }

    public Map getConversionRate(BillDataDto billDataDto) throws Exception {
        String object = (String)billDataDto.getData();
        HashMap data = (HashMap)JSON.parseObject((String)object, HashMap.class);
        Long unitId = new Long(data.get("unit").toString());
        Object exchanges = data.get("productAssistUnitExchanges");
        if (null == exchanges || null == unitId) {
            return data;
        }
        ArrayList productAssistUnitExchanges = new ArrayList();
        if (exchanges instanceof List) {
            productAssistUnitExchanges.addAll((List)exchanges);
        } else {
            productAssistUnitExchanges.add(exchanges);
        }
        HashMap<String, Long> map = new HashMap<String, Long>();
        map.put("id", unitId);
        Unit unit = this.unitDao.getUnitById(map);
        for (Object productAssistUnitExchange : productAssistUnitExchanges) {
            Map assistUnitExchange = (Map)productAssistUnitExchange;
            if (null == assistUnitExchange.get("assistUnit")) continue;
            map.put("id", (Long)assistUnitExchange.get("assistUnit"));
            Unit assistUnit = this.unitDao.getUnitById(map);
            if (null == unit.get("unit_group_id") || null == assistUnit.get("unit_group_id") || !unit.get("unit_group_id").equals(assistUnit.get("unit_group_id")) || null == unit.get("convert_coefficient") || null == assistUnit.get("convert_coefficient")) continue;
            int scale = (Integer)OptionUtils.getSysOptionByName((String)"conversionAccuracy");
            BigDecimal rate = ((BigDecimal)assistUnit.get("convert_coefficient")).divide((BigDecimal)unit.get("convert_coefficient"), scale, RoundingMode.HALF_UP);
            assistUnitExchange.put("mainUnitCount", rate);
        }
        return data;
    }
}


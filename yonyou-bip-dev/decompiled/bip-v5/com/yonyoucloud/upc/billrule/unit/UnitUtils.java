/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.yonyou.iuap.apdoc.coredoc.enums.CoreExtrateBusinessErrorEnum
 *  com.yonyou.iuap.apdoc.coredoc.exceptions.CoreDocBusinessException
 *  com.yonyou.iuap.apdoc.coredoc.utils.MultiLangUtils
 *  com.yonyou.iuap.context.InvocationInfoProxy
 *  com.yonyou.iuap.international.MultiLangText
 *  com.yonyou.iuap.ucf.common.i18n.InternationalUtils
 *  com.yonyou.ucf.mdd.ext.core.AppContext
 *  com.yonyou.ucf.mdd.ext.dao.meta.MetaDaoHelper
 *  com.yonyoucloud.upc.pc.unit.Unit
 *  com.yonyoucloud.upc.pc.unit.UnitGroup
 *  org.apache.commons.lang3.StringUtils
 *  org.imeta.orm.base.BizObject
 *  org.imeta.orm.base.EntityStatus
 *  org.imeta.orm.schema.ConditionExpression
 *  org.imeta.orm.schema.QueryCondition
 *  org.imeta.orm.schema.QueryConditionGroup
 *  org.imeta.orm.schema.QuerySchema
 *  org.imeta.spring.support.id.IdManager
 *  org.springframework.util.CollectionUtils
 */
package com.yonyoucloud.upc.billrule.unit;

import com.yonyou.iuap.apdoc.coredoc.enums.CoreExtrateBusinessErrorEnum;
import com.yonyou.iuap.apdoc.coredoc.exceptions.CoreDocBusinessException;
import com.yonyou.iuap.apdoc.coredoc.utils.MultiLangUtils;
import com.yonyou.iuap.context.InvocationInfoProxy;
import com.yonyou.iuap.international.MultiLangText;
import com.yonyou.iuap.ucf.common.i18n.InternationalUtils;
import com.yonyou.ucf.mdd.ext.core.AppContext;
import com.yonyou.ucf.mdd.ext.dao.meta.MetaDaoHelper;
import com.yonyoucloud.upc.cache.BizCache;
import com.yonyoucloud.upc.pc.unit.Unit;
import com.yonyoucloud.upc.pc.unit.UnitGroup;
import java.math.BigDecimal;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.apache.commons.lang3.StringUtils;
import org.imeta.orm.base.BizObject;
import org.imeta.orm.base.EntityStatus;
import org.imeta.orm.schema.ConditionExpression;
import org.imeta.orm.schema.QueryCondition;
import org.imeta.orm.schema.QueryConditionGroup;
import org.imeta.orm.schema.QuerySchema;
import org.imeta.spring.support.id.IdManager;
import org.springframework.util.CollectionUtils;

public class UnitUtils {
    private static UnitUtils unitUtils = new UnitUtils();

    private UnitUtils() {
    }

    public static UnitUtils getInstance() {
        return unitUtils;
    }

    public void dealgroupdata(Unit unit) throws Exception {
        if (unit.containsKey((Object)"_fromApi") && unit.get("_fromApi").equals(true)) {
            Object groupcode = unit.get("groupcode");
            Object groupname = unit.get("groupname");
            if (groupcode == null || groupname == null) {
                return;
            }
            if (StringUtils.isBlank((CharSequence)groupcode.toString()) || StringUtils.isBlank((CharSequence)groupname.toString())) {
                return;
            }
            QueryConditionGroup condition = QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"name").eq(groupname)});
            QuerySchema schema = QuerySchema.create().addSelect("id").addCondition((ConditionExpression)condition);
            List groups = MetaDaoHelper.query((String)"pc.unit.UnitGroup", (QuerySchema)schema);
            if (groups != null && groups.size() > 0) {
                Map g = (Map)groups.get(0);
                Object groupId = g.get("id");
                unit.setUnitGroup(Long.valueOf(Long.parseLong(groupId.toString())));
                return;
            }
            schema = QuerySchema.create().addSelect("*").addCondition((ConditionExpression)QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"name").eq(groupname), QueryCondition.name((String)"tenant").eq((Object)0)}));
            schema.setPartitionable(false);
            groups = MetaDaoHelper.query((String)"pc.unit.UnitGroup", (QuerySchema)schema);
            if (groups != null && groups.size() > 0) {
                Map g = (Map)groups.get(0);
                UnitGroup unitGroup = this.saveGroup(g.get("code").toString(), g.get("name").toString(), true);
                unit.setUnitGroup((Long)unitGroup.getId());
                return;
            }
            UnitGroup unitGroup = this.saveGroup(groupcode.toString(), groupname.toString(), false);
            unit.setUnitGroup((Long)unitGroup.getId());
        }
    }

    private UnitGroup saveGroup(String code, String name, boolean sourceType) throws Exception {
        UnitGroup group = new UnitGroup();
        group.setIsDeleted(Boolean.valueOf(false));
        group.setSourcetype(Boolean.valueOf(sourceType));
        group.setStopstatus(Boolean.valueOf(false));
        group.setCode(code);
        group.setName(name);
        QuerySchema schema = QuerySchema.create().addSelect("*").addCondition((ConditionExpression)QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"code").eq((Object)code)}));
        List groups = MetaDaoHelper.query((String)"pc.unit.UnitGroup", (QuerySchema)schema);
        if (!CollectionUtils.isEmpty((Collection)groups)) {
            Object id = ((Map)groups.get(0)).get("id");
            group.setId(id);
        } else {
            group.setEntityStatus(EntityStatus.Insert);
            group.setTenant(AppContext.getCurrentUser().getTenant());
            group.setId((Object)IdManager.getInstance().nextId());
            MetaDaoHelper.insert((String)"pc.unit.UnitGroup", (BizObject)group);
        }
        return group;
    }

    public void checkUnitData(Unit unit) throws Exception {
        Integer precision = unit.getPrecision();
        if (precision != null) {
            if (precision < 0) {
                throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_800005);
            }
            if (precision > 8) {
                throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_800006);
            }
        } else {
            unit.setPrecision(Integer.valueOf(0));
        }
        if (unit.get("_status") != null && "update".equalsIgnoreCase(unit.get("_status").toString())) {
            List oldUnitList = MetaDaoHelper.query((String)"pc.unit.Unit", (QuerySchema)QuerySchema.create().addSelect("precision").appendQueryCondition(new ConditionExpression[]{QueryCondition.name((String)"id").eq(unit.getId())}));
            if (CollectionUtils.isEmpty((Collection)oldUnitList)) {
                throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_800007);
            }
            Integer prePrecision = (Integer)((Map)oldUnitList.get(0)).get("precision");
            if (null != prePrecision && prePrecision > unit.getPrecision()) {
                List productids = MetaDaoHelper.query((String)"pc.product.Product", (QuerySchema)QuerySchema.create().addSelect("id").addCondition((ConditionExpression)QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"unit").eq(unit.getId())})));
                List productAssistids = MetaDaoHelper.query((String)"pc.product.ProductAssistUnitExchange", (QuerySchema)QuerySchema.create().addSelect("productId as id").addCondition((ConditionExpression)QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"assistUnit").eq(unit.getId())})));
                if (!productids.isEmpty() || !productAssistids.isEmpty()) {
                    throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_800008);
                }
            }
        }
        if (!(unit.getUnitGroup() != null || unit.containsKey((Object)"_fromApi") && unit.get("_fromApi").equals(true) && EntityStatus.Update.equals((Object)unit.getEntityStatus()))) {
            throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_800009);
        }
        if (unit.getId() != null) {
            Map u;
            boolean surcetype;
            QuerySchema schema = QuerySchema.create().addSelect("id,name,code,unitGroup,sourcetype");
            List us = MetaDaoHelper.query((String)"pc.unit.Unit", (boolean)true, (QuerySchema)(schema = schema.appendQueryCondition(new ConditionExpression[]{QueryCondition.name((String)"id").eq(unit.getId())})), null);
            if (us != null && us.size() > 0 && (surcetype = ((Boolean)(u = (Map)us.get(0)).get("sourcetype")).booleanValue())) {
                boolean bool;
                Map name = (Map)u.get("name");
                Object newName = unit.get("name");
                if (name != null && newName != null && !(bool = this.checkUnitName(newName, name))) {
                    throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_800010);
                }
                String code = u.get("code").toString();
                if (!code.equals(unit.getCode())) {
                    throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_800011);
                }
                Object unitGroup = u.get("unitGroup");
                if (unitGroup == null ? unit.getUnitGroup() != null : !unitGroup.toString().equals(unit.getUnitGroup().toString())) {
                    throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_800012);
                }
            }
        }
        if (unit.getBBaseUnit() != null && !"".equals(unit.getBBaseUnit()) && unit.getBBaseUnit().booleanValue()) {
            QuerySchema schema;
            List baseunitRows;
            BigDecimal one = new BigDecimal("1.00");
            BigDecimal convertCoefficient = unit.getConvertCoefficient();
            if (convertCoefficient != null && !"".equals(convertCoefficient)) {
                if (convertCoefficient.compareTo(one) != 0) {
                    throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_800013);
                }
            } else {
                unit.setConvertCoefficient(one);
            }
            if ((baseunitRows = MetaDaoHelper.query((String)"pc.unit.Unit", (QuerySchema)(schema = QuerySchema.create().addSelect("1").appendQueryCondition(new ConditionExpression[]{QueryCondition.name((String)"unitGroup").eq((Object)unit.getUnitGroup())}).appendQueryCondition(new ConditionExpression[]{QueryCondition.name((String)"bBaseUnit").eq((Object)1)}).appendQueryCondition(new ConditionExpression[]{QueryCondition.name((String)"code").not_eq((Object)unit.getCode())})))) != null && baseunitRows.size() > 0) {
                throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_800014);
            }
        }
    }

    public void cleanUnitCache(BizCache cache) {
        String cachekey = "pc_unitRoundMap_" + AppContext.getTenantId().toString();
        cache.delete(cachekey);
    }

    public void dealUnitGroupName(List<Map<String, Object>> unitGroups) {
        if (unitGroups != null && unitGroups.size() > 0) {
            for (Map<String, Object> unitGroup : unitGroups) {
                List units;
                Object groupName = unitGroup.get("name");
                Object unitMaps = unitGroup.get("units");
                if (unitMaps == null || (units = (List)unitMaps).size() <= 0) continue;
                for (Map unit : units) {
                    unit.put("unitGroup_name", groupName);
                }
            }
        }
    }

    public void checkUniqueData(List<Unit> unitList) {
        int cont = 0;
        HashMap<String, String> flag = new HashMap<String, String>();
        for (Unit unit : unitList) {
            String name;
            if (unit.getBBaseUnit() != null && !"".equals(unit.getBBaseUnit()) && unit.getBBaseUnit().booleanValue()) {
                ++cont;
            }
            if (cont > 1) {
                throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_800014);
            }
            if (unit.get("name") instanceof String) {
                name = (String)unit.get("name");
            } else {
                BizObject bizName = (BizObject)unit.get("name");
                name = (String)bizName.get(InvocationInfoProxy.getLocale());
            }
            if (null != flag.get(name)) {
                throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_800015);
            }
            flag.put(name, InternationalUtils.getMessageWithDefault((String)"UID:P_COREDOC-BE_179F62860408092E", (String)"\u8be5name\u51fa\u73b0\u8fc7\uff01"));
        }
    }

    public boolean checkUnitName(Object newName, Map name) {
        boolean bool = true;
        if (newName instanceof String) {
            if (name.get("zh_CN") != null) {
                bool = newName.toString().equals(name.get("zh_CN").toString());
            }
        } else if (newName instanceof BizObject) {
            MultiLangText nameMultiLangText = new MultiLangText(name);
            MultiLangText newNameMultiLangText = new MultiLangText((Map)newName);
            bool = MultiLangUtils.hasEqualName((MultiLangText)nameMultiLangText, (MultiLangText)newNameMultiLangText);
        }
        return bool;
    }
}


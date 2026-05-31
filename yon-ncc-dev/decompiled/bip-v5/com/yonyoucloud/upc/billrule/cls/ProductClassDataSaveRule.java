/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.yonyou.iuap.apdoc.coredoc.enums.CoreExtrateBusinessErrorEnum
 *  com.yonyou.iuap.apdoc.coredoc.exceptions.CoreDocBusinessException
 *  com.yonyou.ucf.mdd.common.model.rule.RuleExecuteResult
 *  com.yonyou.ucf.mdd.ext.bill.dto.BillDataDto
 *  com.yonyou.ucf.mdd.ext.bill.rule.base.AbstractCommonRule
 *  com.yonyou.ucf.mdd.ext.core.AppContext
 *  com.yonyou.ucf.mdd.ext.dao.meta.MetaDaoHelper
 *  com.yonyou.ucf.mdd.ext.dao.sql.SqlHelper
 *  com.yonyou.ucf.mdd.ext.model.BillContext
 *  com.yonyoucloud.upc.pc.cls.ManagementClass
 *  com.yonyoucloud.upc.pc.cls.PresentationClass
 *  com.yonyoucloud.upc.utils.MultilangUtil
 *  org.imeta.core.model.Entity
 *  org.imeta.orm.base.BizObject
 *  org.imeta.orm.base.EntityStatus
 *  org.imeta.orm.schema.ConditionExpression
 *  org.imeta.orm.schema.QueryCondition
 *  org.imeta.orm.schema.QueryConditionGroup
 *  org.imeta.orm.schema.QuerySchema
 *  org.springframework.stereotype.Component
 *  org.springframework.util.StringUtils
 */
package com.yonyoucloud.upc.billrule.cls;

import com.yonyou.iuap.apdoc.coredoc.enums.CoreExtrateBusinessErrorEnum;
import com.yonyou.iuap.apdoc.coredoc.exceptions.CoreDocBusinessException;
import com.yonyou.ucf.mdd.common.model.rule.RuleExecuteResult;
import com.yonyou.ucf.mdd.ext.bill.dto.BillDataDto;
import com.yonyou.ucf.mdd.ext.bill.rule.base.AbstractCommonRule;
import com.yonyou.ucf.mdd.ext.core.AppContext;
import com.yonyou.ucf.mdd.ext.dao.meta.MetaDaoHelper;
import com.yonyou.ucf.mdd.ext.dao.sql.SqlHelper;
import com.yonyou.ucf.mdd.ext.model.BillContext;
import com.yonyoucloud.upc.pc.cls.ManagementClass;
import com.yonyoucloud.upc.pc.cls.PresentationClass;
import com.yonyoucloud.upc.service.utils.TreeApplyRangeUtils;
import com.yonyoucloud.upc.utils.MultilangUtil;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.imeta.core.model.Entity;
import org.imeta.orm.base.BizObject;
import org.imeta.orm.base.EntityStatus;
import org.imeta.orm.schema.ConditionExpression;
import org.imeta.orm.schema.QueryCondition;
import org.imeta.orm.schema.QueryConditionGroup;
import org.imeta.orm.schema.QuerySchema;
import org.springframework.stereotype.Component;
import org.springframework.util.StringUtils;

@Component(value="productClassDataSaveRule")
public class ProductClassDataSaveRule
extends AbstractCommonRule {
    public RuleExecuteResult execute(BillContext billContext, Map<String, Object> map) throws Exception {
        BillDataDto billDataDto = (BillDataDto)this.getParam(map);
        if (null == billContext || billDataDto == null) {
            return new RuleExecuteResult();
        }
        List clss = this.getBills(billContext, map);
        HashMap<String, Object> params = new HashMap<String, Object>();
        params.put("tenantid", AppContext.getCurrentUser().getTenant());
        for (BizObject cls : clss) {
            HashMap<String, Object> paramMap;
            params.put("id", cls.get("id"));
            if ("pc_presentationclass".equals(billContext.getBillnum())) {
                PresentationClass presentcls = (PresentationClass)cls;
                if (presentcls.getEntityStatus() == EntityStatus.Insert) {
                    this.checksParentRefer(presentcls);
                    presentcls.setIsEnd(Boolean.valueOf(true));
                }
                this.updateSubState(presentcls);
                if (presentcls.get("parent") != null) {
                    this.checkProClsStatus(presentcls);
                }
                if (presentcls.getEntityStatus() != EntityStatus.Update || !presentcls.getStopstatus().booleanValue()) continue;
                paramMap = new HashMap<String, Object>();
                paramMap.put("id", presentcls.getId());
                paramMap.put("table", "product_presentation_class");
                paramMap.put("ytenantId", AppContext.getYTenantId());
                SqlHelper.update((String)"com.yonyoucloud.upc.bill.dao.productcls.updateChildStopStatus", paramMap);
                continue;
            }
            if (!"pc_managementclass".equals(billContext.getBillnum())) continue;
            ManagementClass managementClass = (ManagementClass)cls;
            this.checkParentStopstatus(managementClass);
            if (managementClass.getEntityStatus() == EntityStatus.Update) {
                TreeApplyRangeUtils.getInstance().updateChildFPathAndLevel("pc.cls.ManagementClass", cls.get("id"));
                if (managementClass.getStopstatus().booleanValue()) {
                    paramMap = new HashMap();
                    paramMap.put("id", managementClass.getId());
                    paramMap.put("table", "product_management_class");
                    paramMap.put("ytenantId", AppContext.getYTenantId());
                    SqlHelper.update((String)"com.yonyoucloud.upc.bill.dao.productcls.updateChildStopStatus", paramMap);
                }
            }
            if (managementClass.getEntityStatus() != EntityStatus.Insert) continue;
            this.checksParentRefer(managementClass);
            managementClass.setIsEnd(Boolean.valueOf(true));
        }
        this.fillLevelMessage(billContext.getBillnum(), clss);
        return new RuleExecuteResult();
    }

    private void checkParentStopstatus(ManagementClass managementClass) throws Exception {
        boolean pStopstatus;
        QuerySchema schema;
        List clss;
        if (!managementClass.getStopstatus().booleanValue() && managementClass.get("parent") != null && (clss = MetaDaoHelper.query((String)"pc.cls.ManagementClass", (QuerySchema)(schema = QuerySchema.create().addSelect("*").addCondition((ConditionExpression)QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"id").eq(managementClass.get("parent"))}))))) != null && clss.size() > 0 && (pStopstatus = ((Boolean)((Map)clss.get(0)).get("stopstatus")).booleanValue())) {
            Object[] objectArray = new Object[1];
            objectArray[0] = MultilangUtil.getAttr((String)"pc.cls.ManagementClass", (String)"name", (BizObject)managementClass, null);
            throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_800155, objectArray);
        }
    }

    private void updateSubState(PresentationClass cls) throws Exception {
        QuerySchema schema = QuerySchema.create().addSelect("id, path").addCondition((ConditionExpression)QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"path").like(cls.getId()), QueryCondition.name((String)"id").not_eq(cls.getId())}));
        List subclss = MetaDaoHelper.query((String)"pc.cls.PresentationClass", (QuerySchema)schema);
        boolean iUOrderStatus = true;
        if (!(cls.getIsEnd() != null && cls.getIsEnd().booleanValue() || cls.getIUOrderStatus() == null || cls.getIUOrderStatus().booleanValue())) {
            iUOrderStatus = false;
        }
        boolean showInFront = true;
        if (!(cls.getIsEnd() != null && cls.getIsEnd().booleanValue() || cls.getShowInFront() == null || cls.getShowInFront().booleanValue())) {
            showInFront = false;
        }
        if (subclss != null && subclss.size() > 0) {
            for (Map subcls : subclss) {
                Object path;
                PresentationClass c = new PresentationClass();
                c.setId(subcls.get("id"));
                if (!iUOrderStatus) {
                    c.setIUOrderStatus(Boolean.valueOf(false));
                }
                if (!showInFront) {
                    c.setShowInFront(Boolean.valueOf(false));
                }
                if ((path = subcls.get("path")) != null) {
                    String s = path.toString();
                    int level = s.length() - s.replace("|", "").length();
                    c.setLevel(Integer.valueOf(level));
                    c.setFullPath("|" + path);
                }
                c.setEntityStatus(EntityStatus.Update);
                MetaDaoHelper.update((String)"pc.cls.PresentationClass", (BizObject)c);
            }
        }
    }

    private void checksParentRefer(PresentationClass cls) throws Exception {
        QuerySchema schema;
        List products;
        if (cls.getParent() != null && (products = MetaDaoHelper.query((String)"pc.product.Product", (QuerySchema)(schema = QuerySchema.create().addSelect("id ").addCondition((ConditionExpression)QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"productClass").eq((Object)cls.getParent())}))))).size() > 0) {
            throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_800134, new Object[]{""});
        }
    }

    private void checksParentRefer(ManagementClass managementClass) throws Exception {
        QuerySchema schema;
        List products;
        if (managementClass.getParent() != null && (products = MetaDaoHelper.query((String)"pc.product.Product", (QuerySchema)(schema = QuerySchema.create().addSelect("id ").addCondition((ConditionExpression)QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"manageClass").eq((Object)managementClass.getParent())}))))).size() > 0) {
            throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_800134, new Object[]{""});
        }
    }

    private void checkProClsStatus(PresentationClass cls) throws Exception {
        boolean pStopstatus;
        boolean flag = false;
        if (cls.containsKey((Object)"showInFront") && cls.getShowInFront() != null && cls.getShowInFront().booleanValue()) {
            flag = true;
        }
        if (cls.containsKey((Object)"iUOrderStatus") && cls.getIUOrderStatus() != null && cls.getIUOrderStatus().booleanValue()) {
            flag = true;
        }
        QuerySchema schema = QuerySchema.create().addSelect("showInFront,iUOrderStatus, stopstatus").addCondition((ConditionExpression)QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"id").eq(cls.get("parent"))}));
        List producClasss = MetaDaoHelper.query((String)"pc.cls.PresentationClass", (QuerySchema)schema);
        if (flag) {
            if (producClasss == null || producClasss.size() < 1) {
                throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_800182, new Object[]{MultilangUtil.getAttr((String)"pc.cls.PresentationClass", (String)"name", (BizObject)cls, null)});
            }
            boolean showInFront = false;
            boolean iUOrderStatus = false;
            for (Map prodclass : producClasss) {
                showInFront = (Boolean)prodclass.get("showInFront");
                iUOrderStatus = (Boolean)prodclass.get("iUOrderStatus");
            }
            if (!showInFront && cls.getShowInFront() != null && cls.getShowInFront().booleanValue()) {
                throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_800183, new Object[]{MultilangUtil.getAttr((String)"pc.cls.PresentationClass", (String)"name", (BizObject)cls, null)});
            }
            if (!iUOrderStatus && cls.getIUOrderStatus() != null && cls.getIUOrderStatus().booleanValue()) {
                throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_800184, new Object[]{MultilangUtil.getAttr((String)"pc.cls.PresentationClass", (String)"name", (BizObject)cls, null)});
            }
        }
        if (!cls.getStopstatus().booleanValue() && producClasss != null && producClasss.size() > 0 && (pStopstatus = ((Boolean)((Map)producClasss.get(0)).get("stopstatus")).booleanValue())) {
            throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_800155, new Object[]{MultilangUtil.getAttr((String)"pc.cls.PresentationClass", (String)"name", (BizObject)cls, null)});
        }
    }

    private void fillLevelMessage(String billNum, List<BizObject> bizObjectList) throws Exception {
        block19: {
            String[] pathArray;
            List managementClassMapList;
            block18: {
                Entity entity;
                ArrayList idList = new ArrayList();
                bizObjectList.forEach(bizObject -> {
                    if (bizObject.getId() != null) {
                        idList.add(bizObject.getId().toString());
                    }
                });
                HashMap<String, Object> params = new HashMap<String, Object>();
                List presentationClassMapList = new ArrayList();
                managementClassMapList = new ArrayList();
                HashMap presentationClassMap = new HashMap();
                HashMap managementClassMap = new HashMap();
                if ("pc_presentationclass".equals(billNum)) {
                    entity = MetaDaoHelper.getEntity((String)"pc.cls.PresentationClass");
                    params.put("tableName", entity.getMainTableName());
                    params.put("ytenantid", AppContext.getCurrentUser().getYTenantId());
                    params.put("ids", idList);
                    presentationClassMapList = SqlHelper.selectList((String)"com.yonyoucloud.upc.bill.dao.productcls.selectMClsByPathLikeId", params);
                    presentationClassMapList.forEach(a -> presentationClassMap.put(a.get("id").toString(), a));
                } else if ("pc_managementclass".equals(billNum)) {
                    entity = MetaDaoHelper.getEntity((String)"pc.cls.ManagementClass");
                    params.put("tableName", entity.getMainTableName());
                    params.put("ytenantid", AppContext.getCurrentUser().getYTenantId());
                    params.put("ids", idList);
                    managementClassMapList = SqlHelper.selectList((String)"com.yonyoucloud.upc.bill.dao.productcls.selectMClsByPathLikeId", params);
                    managementClassMapList.forEach(a -> managementClassMap.put(a.get("id").toString(), a));
                }
                for (BizObject bizObject2 : bizObjectList) {
                    ManagementClass managementClass;
                    if ("pc_presentationclass".equals(billNum)) {
                        PresentationClass presentcls = (PresentationClass)bizObject2;
                        if (!presentationClassMap.containsKey(presentcls.getId().toString())) continue;
                        HashMap presentationClassPathMap = (HashMap)presentationClassMap.get(presentcls.getId().toString());
                        presentcls.setPath((String)presentationClassPathMap.get("path"));
                        continue;
                    }
                    if (!"pc_managementclass".equals(billNum) || !managementClassMap.containsKey((managementClass = (ManagementClass)bizObject2).getId().toString())) continue;
                    HashMap managementClassPathMap = (HashMap)managementClassMap.get(managementClass.getId().toString());
                    managementClass.setPath((String)managementClassPathMap.get("path"));
                }
                if (!"pc_presentationclass".equals(billNum)) break block18;
                for (Map map : presentationClassMapList) {
                    if (StringUtils.isEmpty(map.get("path"))) continue;
                    pathArray = map.get("path").toString().split("[|]");
                    PresentationClass presentationClassForUpdateLevel = new PresentationClass();
                    presentationClassForUpdateLevel.setFullPath("|" + map.get("path"));
                    presentationClassForUpdateLevel.setId(map.get("id"));
                    presentationClassForUpdateLevel.setFirstLevel(null);
                    presentationClassForUpdateLevel.setSecondLevel(null);
                    presentationClassForUpdateLevel.setThirdLevel(null);
                    for (int i = 0; i < pathArray.length; ++i) {
                        if (i == 0) {
                            presentationClassForUpdateLevel.setFirstLevel(Long.valueOf(Long.parseLong(pathArray[i])));
                            continue;
                        }
                        if (i == 1) {
                            presentationClassForUpdateLevel.setSecondLevel(Long.valueOf(Long.parseLong(pathArray[i])));
                            continue;
                        }
                        if (i != 2) continue;
                        presentationClassForUpdateLevel.setThirdLevel(Long.valueOf(Long.parseLong(pathArray[i])));
                    }
                    presentationClassForUpdateLevel.setEntityStatus(EntityStatus.Update);
                    MetaDaoHelper.update((String)"pc.cls.PresentationClass", (BizObject)presentationClassForUpdateLevel);
                }
                break block19;
            }
            if (!"pc_managementclass".equals(billNum)) break block19;
            for (Map map : managementClassMapList) {
                if (StringUtils.isEmpty(map.get("path"))) continue;
                pathArray = map.get("path").toString().split("[|]");
                ManagementClass managementClassForUpdateLevel = new ManagementClass();
                managementClassForUpdateLevel.setFullPath("|" + map.get("path"));
                managementClassForUpdateLevel.setId(map.get("id"));
                managementClassForUpdateLevel.setFirstLevel(null);
                managementClassForUpdateLevel.setSecondLevel(null);
                managementClassForUpdateLevel.setThirdLevel(null);
                managementClassForUpdateLevel.setFourthLevel(null);
                managementClassForUpdateLevel.setFifthLevel(null);
                managementClassForUpdateLevel.setSixthLevel(null);
                managementClassForUpdateLevel.setSeventhLevel(null);
                managementClassForUpdateLevel.setEighthLevel(null);
                for (int i = 0; i < pathArray.length; ++i) {
                    if (i == 0) {
                        managementClassForUpdateLevel.setFirstLevel(Long.valueOf(Long.parseLong(pathArray[i])));
                        continue;
                    }
                    if (i == 1) {
                        managementClassForUpdateLevel.setSecondLevel(Long.valueOf(Long.parseLong(pathArray[i])));
                        continue;
                    }
                    if (i == 2) {
                        managementClassForUpdateLevel.setThirdLevel(Long.valueOf(Long.parseLong(pathArray[i])));
                        continue;
                    }
                    if (i == 3) {
                        managementClassForUpdateLevel.setFourthLevel(Long.valueOf(Long.parseLong(pathArray[i])));
                        continue;
                    }
                    if (i == 4) {
                        managementClassForUpdateLevel.setFifthLevel(Long.valueOf(Long.parseLong(pathArray[i])));
                        continue;
                    }
                    if (i == 5) {
                        managementClassForUpdateLevel.setSixthLevel(Long.valueOf(Long.parseLong(pathArray[i])));
                        continue;
                    }
                    if (i == 6) {
                        managementClassForUpdateLevel.setSeventhLevel(Long.valueOf(Long.parseLong(pathArray[i])));
                        continue;
                    }
                    if (i != 7) continue;
                    managementClassForUpdateLevel.setEighthLevel(Long.valueOf(Long.parseLong(pathArray[i])));
                }
                managementClassForUpdateLevel.setEntityStatus(EntityStatus.Update);
                MetaDaoHelper.update((String)"pc.cls.ManagementClass", (BizObject)managementClassForUpdateLevel);
            }
        }
    }
}


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
 *  com.yonyou.ucf.mdd.ext.model.BillContext
 *  com.yonyoucloud.upc.pc.spec.SpecTplProduct
 *  com.yonyoucloud.upc.pc.spec.SpecTplProductItem
 *  com.yonyoucloud.upc.pc.tpl.ProductTplSpec
 *  com.yonyoucloud.upc.pc.userdef.UserDefClassEnum
 *  com.yonyoucloud.upc.utils.BizObjectUtils
 *  org.imeta.orm.base.BizObject
 *  org.imeta.orm.base.EntityStatus
 *  org.imeta.orm.schema.ConditionExpression
 *  org.imeta.orm.schema.QueryCondition
 *  org.imeta.orm.schema.QueryConditionGroup
 *  org.imeta.orm.schema.QuerySchema
 *  org.imeta.spring.support.id.IdManager
 *  org.springframework.stereotype.Component
 */
package com.yonyoucloud.upc.billrule.userdefine;

import com.yonyou.iuap.apdoc.coredoc.enums.CoreExtrateBusinessErrorEnum;
import com.yonyou.iuap.apdoc.coredoc.exceptions.CoreDocBusinessException;
import com.yonyou.ucf.mdd.common.model.rule.RuleExecuteResult;
import com.yonyou.ucf.mdd.ext.bill.dto.BillDataDto;
import com.yonyou.ucf.mdd.ext.bill.rule.base.AbstractCommonRule;
import com.yonyou.ucf.mdd.ext.core.AppContext;
import com.yonyou.ucf.mdd.ext.dao.meta.MetaDaoHelper;
import com.yonyou.ucf.mdd.ext.model.BillContext;
import com.yonyoucloud.upc.pc.spec.SpecTplProduct;
import com.yonyoucloud.upc.pc.spec.SpecTplProductItem;
import com.yonyoucloud.upc.pc.tpl.ProductTplSpec;
import com.yonyoucloud.upc.pc.userdef.UserDefClassEnum;
import com.yonyoucloud.upc.utils.BizObjectUtils;
import java.util.List;
import java.util.Map;
import org.imeta.orm.base.BizObject;
import org.imeta.orm.base.EntityStatus;
import org.imeta.orm.schema.ConditionExpression;
import org.imeta.orm.schema.QueryCondition;
import org.imeta.orm.schema.QueryConditionGroup;
import org.imeta.orm.schema.QuerySchema;
import org.imeta.spring.support.id.IdManager;
import org.springframework.stereotype.Component;

@Component(value="userDefineItemSave")
public class UserDefineItemSave
extends AbstractCommonRule {
    public RuleExecuteResult execute(BillContext billContext, Map<String, Object> map) throws Exception {
        BillDataDto billDataDto = (BillDataDto)this.getParam(map);
        String billnum = billDataDto.getBillnum();
        if (null == billContext || billDataDto == null) {
            return new RuleExecuteResult();
        }
        List bills = this.getBills(billContext, map);
        String classId = "";
        switch (billnum) {
            case "pc_speproitem": {
                classId = UserDefClassEnum.PRODUCTSPEC.getClassIdValue();
                break;
            }
            case "pc_productproitem": {
                classId = UserDefClassEnum.PRODUCTARCHIVE.getClassIdValue();
                break;
            }
            case "pc_productskuproitem": {
                classId = UserDefClassEnum.PRODUCTSKU.getClassIdValue();
                break;
            }
            case "pc_productorderproitem": {
                classId = UserDefClassEnum.PRODUCTORDER.getClassIdValue();
                break;
            }
        }
        for (SpecTplProduct spec : bills) {
            List userdefineclasss;
            QuerySchema querySchema;
            if (spec.containsKey((Object)"resource") && spec.get("resource") != null && "ublinker".equals(spec.get("resource").toString())) {
                Map userdefineclass = null;
                if (spec.get("erpCode") != null) {
                    querySchema = QuerySchema.create().addSelect("id, defineId, showItem").addCondition((ConditionExpression)QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"erpCode").eq(spec.get("erpCode")), QueryCondition.name((String)"classId").eq((Object)classId)}));
                    userdefineclasss = MetaDaoHelper.query((String)"pc.userdef.UserDefineClass", (QuerySchema)querySchema);
                    if (userdefineclasss == null || userdefineclasss.size() < 1) {
                        throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_800051, (Object[])spec.get("erpCode"));
                    }
                    userdefineclass = (Map)userdefineclasss.get(0);
                    this.dealApiItem(spec, userdefineclass, billnum);
                }
            } else {
                Object userdefid = spec.getId();
                if (userdefid == null) {
                    throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_800052);
                }
                querySchema = QuerySchema.create().addSelect("id, defineId, showItem").addCondition((ConditionExpression)QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"id").eq(userdefid)}));
                userdefineclasss = MetaDaoHelper.query((String)"pc.userdef.UserDefineClass", (QuerySchema)querySchema);
                if (userdefineclasss == null || userdefineclasss.size() < 1) {
                    throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_800053);
                }
                Map userdefineclass = (Map)userdefineclasss.get(0);
                if ("pc_speproitem".equals(billnum)) {
                    this.saveTplSpecItem(spec, userdefineclass);
                }
            }
            this.removeParam((Map)spec);
        }
        RuleExecuteResult ruleResult = new RuleExecuteResult();
        ruleResult.setCancel(true);
        SpecTplProduct firstBill = (SpecTplProduct)bills.get(0);
        BizObjectUtils.clearMapParent((Map)firstBill);
        ruleResult.setData((Object)firstBill);
        return ruleResult;
    }

    private void dealApiItem(SpecTplProduct spec, Map userdefineclass, String billnum) throws Exception {
        List userdefinespecs = spec.userdefinespecs();
        if (userdefinespecs == null && userdefinespecs.size() == 0) {
            return;
        }
        Object defineId = userdefineclass.get("defineId");
        Object userdefid = userdefineclass.get("id");
        for (SpecTplProductItem userdefine : userdefinespecs) {
            userdefine.setUserdefid(Long.valueOf(Long.parseLong(userdefid.toString())));
            String name = userdefine.getName();
            QuerySchema querySchema = QuerySchema.create().addSelect("id").addCondition((ConditionExpression)QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"userdefid").eq(userdefid), QueryCondition.name((String)"name").eq((Object)name)}));
            List userdefines = MetaDaoHelper.query((String)"pc.userdef.UserDefineSpec", (QuerySchema)querySchema);
            if (userdefines != null && userdefines.size() > 0) {
                userdefine.setId(((Map)userdefines.get(0)).get("id"));
                this.saveItem(userdefine, defineId.toString(), EntityStatus.Update);
                continue;
            }
            this.saveItem(userdefine, defineId.toString(), EntityStatus.Insert);
        }
    }

    private void saveTplSpecItem(SpecTplProduct spec, Map userdefineclass) throws Exception {
        QuerySchema querySchema;
        Long template = spec.getTemplate();
        Long product = spec.getProduct();
        List userdefinespecs = spec.userdefinespecs();
        if (userdefinespecs == null || userdefinespecs.size() == 0) {
            throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_800054);
        }
        if (template == null) {
            if (product == null) {
                throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_800055);
            }
            querySchema = QuerySchema.create().addSelect("*").addCondition((ConditionExpression)QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"id").eq((Object)product)}));
            List products = MetaDaoHelper.query((String)"pc.product.Product", (QuerySchema)querySchema);
            if (products == null || products.size() < 1) {
                throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_800056);
            }
            template = Long.parseLong(((Map)products.get(0)).get("productTemplate").toString());
            if (template == null) {
                throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_800057);
            }
        }
        for (SpecTplProductItem specItem : userdefinespecs) {
            String name = specItem.getName();
            Object defineId = userdefineclass.get("defineId");
            Object userdefid = userdefineclass.get("id");
            querySchema = QuerySchema.create().addSelect("*").addCondition((ConditionExpression)QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"userdefid").eq(userdefid), QueryCondition.name((String)"name").eq((Object)name)}));
            List userdefineclasss = MetaDaoHelper.query((String)"pc.userdef.UserDefineSpec", (QuerySchema)querySchema);
            if (userdefineclasss != null && userdefineclasss.size() > 0) {
                querySchema = QuerySchema.create().addSelect("*").addCondition((ConditionExpression)QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"specification").eq(userdefid), QueryCondition.name((String)"specitem").eq((Object)name), QueryCondition.name((String)"template").eq((Object)template)}));
                List productTplSpecItems = MetaDaoHelper.query((String)"pc.tpl.ProductTplSpec", (QuerySchema)querySchema);
                if (productTplSpecItems != null && productTplSpecItems.size() > 0) {
                    continue;
                }
            } else {
                specItem.setCode(name);
                specItem.setUserdefid((Long)spec.getId());
                this.saveItem(specItem, defineId.toString(), EntityStatus.Insert);
            }
            ProductTplSpec productTplSpec = new ProductTplSpec();
            querySchema = QuerySchema.create().addSelect("*").addCondition((ConditionExpression)QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"specification").eq(userdefid), QueryCondition.name((String)"template").eq((Object)template)}));
            List productTplSpecItems = MetaDaoHelper.query((String)"pc.tpl.ProductTplSpec", (QuerySchema)querySchema);
            productTplSpec.setTwoDimensionalInput(Boolean.valueOf(false));
            if (specItem.getOrderNum() == null) {
                productTplSpec.setOrder(Integer.valueOf(0));
            }
            if (productTplSpecItems != null && productTplSpecItems.size() > 0) {
                Map tempdata = (Map)productTplSpecItems.get(0);
                if (tempdata.containsKey("twoDimensionalInput") && tempdata.get("twoDimensionalInput") != null) {
                    productTplSpec.setTwoDimensionalInput((Boolean)tempdata.get("twoDimensionalInput"));
                }
                if (tempdata.containsKey("order") && tempdata.get("order") != null) {
                    productTplSpec.setOrder((Integer)tempdata.get("order"));
                }
            }
            productTplSpec.setSpecBusinessDynamic(Boolean.valueOf(true));
            productTplSpec.setTemplate(Long.valueOf(Long.parseLong(template.toString())));
            productTplSpec.setSpecification(Long.valueOf(Long.parseLong(userdefid.toString())));
            productTplSpec.setSpecitem(name);
            productTplSpec.put("tenant", AppContext.getTenantId());
            productTplSpec.setEntityStatus(EntityStatus.Insert);
            productTplSpec.setId((Object)IdManager.getInstance().nextId());
            MetaDaoHelper.insert((String)"pc.tpl.ProductTplSpec", (BizObject)productTplSpec);
        }
    }

    public void saveItem(SpecTplProductItem userdefine, String defineId, EntityStatus status) throws Exception {
        userdefine.put("defineId", (Object)defineId);
        userdefine.setEntityStatus(status);
        userdefine.put("tenant", AppContext.getTenantId());
        userdefine.setIsEnabled(Boolean.valueOf(true));
        if (EntityStatus.Insert == status) {
            userdefine.setId((Object)IdManager.getInstance().nextId());
            MetaDaoHelper.insert((String)"pc.spec.SpecTplProductItem", (BizObject)userdefine);
        }
        if (EntityStatus.Update == status) {
            MetaDaoHelper.update((String)"pc.spec.SpecTplProductItem", (BizObject)userdefine);
        }
        this.removeParam((Map)userdefine);
    }

    public void removeParam(Map map) {
        map.remove("_parent");
        map.remove("_realtype");
        map.remove("_entityName");
        map.remove("_keyName");
        map.remove("_convert_userdefinespecs");
        map.remove("__tableRowDataId");
        map.remove("_fromApi");
        map.remove("__tableRowDataId");
        map.remove("__parentTableRowDataId");
    }
}


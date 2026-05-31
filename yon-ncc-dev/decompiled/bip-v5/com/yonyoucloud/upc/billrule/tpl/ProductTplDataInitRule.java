/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.yonyou.iuap.ucf.common.i18n.InternationalUtils
 *  com.yonyou.ucf.mdd.common.model.rule.RuleExecuteResult
 *  com.yonyou.ucf.mdd.ext.bill.dto.BillDataDto
 *  com.yonyou.ucf.mdd.ext.bill.rule.base.AbstractCommonRule
 *  com.yonyou.ucf.mdd.ext.dao.meta.MetaDaoHelper
 *  com.yonyou.ucf.mdd.ext.model.BillContext
 *  com.yonyoucloud.upc.pc.tpl.ProductPropertySource
 *  com.yonyoucloud.upc.pc.tpl.ProductTpl
 *  com.yonyoucloud.upc.pc.tpl.ProductTplCycleProperty
 *  com.yonyoucloud.upc.pc.tpl.ProductTplUnit
 *  org.imeta.biz.base.Objectlizer
 *  org.imeta.orm.base.BizObject
 *  org.imeta.orm.base.EntityStatus
 *  org.imeta.orm.base.Json
 *  org.imeta.orm.schema.ConditionExpression
 *  org.imeta.orm.schema.QueryCondition
 *  org.imeta.orm.schema.QueryConditionGroup
 *  org.imeta.orm.schema.QuerySchema
 *  org.springframework.beans.factory.annotation.Autowired
 *  org.springframework.stereotype.Component
 */
package com.yonyoucloud.upc.billrule.tpl;

import com.yonyou.iuap.ucf.common.i18n.InternationalUtils;
import com.yonyou.ucf.mdd.common.model.rule.RuleExecuteResult;
import com.yonyou.ucf.mdd.ext.bill.dto.BillDataDto;
import com.yonyou.ucf.mdd.ext.bill.rule.base.AbstractCommonRule;
import com.yonyou.ucf.mdd.ext.dao.meta.MetaDaoHelper;
import com.yonyou.ucf.mdd.ext.model.BillContext;
import com.yonyoucloud.iuap.upc.api.service.IUPCBillService;
import com.yonyoucloud.upc.pc.tpl.ProductPropertySource;
import com.yonyoucloud.upc.pc.tpl.ProductTpl;
import com.yonyoucloud.upc.pc.tpl.ProductTplCycleProperty;
import com.yonyoucloud.upc.pc.tpl.ProductTplUnit;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import org.imeta.biz.base.Objectlizer;
import org.imeta.orm.base.BizObject;
import org.imeta.orm.base.EntityStatus;
import org.imeta.orm.base.Json;
import org.imeta.orm.schema.ConditionExpression;
import org.imeta.orm.schema.QueryCondition;
import org.imeta.orm.schema.QueryConditionGroup;
import org.imeta.orm.schema.QuerySchema;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component(value="productTplDataInitRule")
public class ProductTplDataInitRule
extends AbstractCommonRule {
    @Autowired
    private IUPCBillService billService;

    public RuleExecuteResult execute(BillContext billContext, Map<String, Object> map) throws Exception {
        Object data;
        BillDataDto billDataDto = (BillDataDto)this.getParam(map);
        if (null == billContext || billDataDto == null) {
            return new RuleExecuteResult();
        }
        ProductTpl tpl = null;
        boolean isAdd = false;
        if ("add".equals(billContext.getAction())) {
            isAdd = true;
            if (billDataDto.getId() != null) {
                data = (List)billDataDto.getData();
                data.clear();
                data.add(this.copyTemplate(billDataDto.getId()));
            }
            List bills = this.getBills(billContext, map);
            tpl = (ProductTpl)bills.get(0);
        } else {
            data = (Map)map.get("return");
            tpl = (ProductTpl)Objectlizer.convert((Map)data, (String)"pc.tpl.ProductTpl");
            if (tpl != null) {
                tpl.put("stopstatus", (Object)(tpl.getStopstatus() != false ? 1 : 0));
            }
        }
        if (tpl == null) {
            return new RuleExecuteResult();
        }
        if (tpl.CycleProperties() == null || tpl.CycleProperties().size() == 0) {
            ArrayList cycles = new ArrayList();
            ArrayList sources = new ArrayList();
            tpl.setCycleProperties(cycles);
            QueryConditionGroup condition = QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"group").eq((Object)"cycle")});
            QuerySchema schema = QuerySchema.create().addSelect(new String[]{"id", "name", "alias", "dataType", "showType", "values", "group"}).addCondition((ConditionExpression)condition).addOrderBy("id");
            MetaDaoHelper.query((String)"pc.tpl.ProductPropertySource", (boolean)true, (QuerySchema)schema, null).forEach(m -> sources.add((ProductPropertySource)Objectlizer.convert((Map)m, (String)"pc.tpl.ProductPropertySource")));
            sources.stream().forEach(s -> {
                ProductTplCycleProperty prop = new ProductTplCycleProperty();
                prop.setEntityStatus(EntityStatus.Insert);
                prop.set("alias", s.get("alias"));
                prop.setDataType(s.getDataType());
                prop.setShowType(s.getShowType());
                prop.setPropertyType((Long)s.getId());
                prop.put("propertyType_name", (Object)s.getName());
                prop.put("values", (Object)s.getValues());
                cycles.add(prop);
            });
        }
        if (tpl.Units() == null || tpl.Units().size() == 0) {
            tpl.setUnits(new ArrayList());
            ProductTplUnit unit = new ProductTplUnit();
            unit.setEntityStatus(EntityStatus.Insert);
            unit.setTemplate((Long)tpl.getId());
            tpl.Units().add(unit);
        }
        if (!isAdd) {
            data = (Map)map.get("return");
            if (!data.containsKey("CycleProperties")) {
                data.put("CycleProperties", tpl.CycleProperties());
            }
            if (!data.containsKey("Units")) {
                data.put("Units", tpl.Units());
            }
            return new RuleExecuteResult();
        }
        map.remove("return");
        return new RuleExecuteResult((Object)Json.encode2((BizObject)tpl).toString());
    }

    public ProductTpl copyTemplate(String id) throws Exception {
        boolean status;
        BillDataDto bill = new BillDataDto("pc_producttpl", id);
        Map map = this.billService.detail(bill);
        ProductTpl tpl = (ProductTpl)Objectlizer.convert((Map)map, (String)"pc.tpl.ProductTpl");
        tpl.setId(null);
        tpl.setCreator(null);
        tpl.setCreateDate(null);
        tpl.setCreateTime(null);
        tpl.setListItem(null);
        tpl.setModifier(null);
        tpl.setModifyDate(null);
        tpl.setModifyTime(null);
        this.dealI18n(tpl);
        tpl.setPubts(null);
        tpl.setEntityStatus(EntityStatus.Insert);
        Object stopstatus = tpl.get("stopstatus");
        tpl.put("stopstatus", (Object)1);
        if (stopstatus != null && !(status = ((Boolean)stopstatus).booleanValue())) {
            tpl.put("stopstatus", (Object)0);
        }
        if (tpl.SpecSums() != null) {
            tpl.SpecSums().stream().forEach(item -> {
                item.setId(null);
                item.setPubts(null);
                item.setTemplate(null);
                item.setEntityStatus(EntityStatus.Insert);
            });
        }
        if (tpl.PropertySums() != null) {
            tpl.PropertySums().stream().forEach(item -> {
                item.setId(null);
                item.setPubts(null);
                item.setTemplate(null);
                item.setEntityStatus(EntityStatus.Insert);
            });
        }
        if (tpl.Parameters() != null) {
            tpl.Parameters().stream().forEach(item -> {
                item.setId(null);
                item.setPubts(null);
                item.setTemplate(null);
                item.setEntityStatus(EntityStatus.Insert);
            });
        }
        if (tpl.SKUPropertySums() != null) {
            tpl.SKUPropertySums().stream().forEach(item -> {
                item.setId(null);
                item.setPubts(null);
                item.setTemplate(null);
                item.setEntityStatus(EntityStatus.Insert);
            });
        }
        if (tpl.OrderPropertySums() != null) {
            tpl.OrderPropertySums().stream().forEach(item -> {
                item.setId(null);
                item.setPubts(null);
                item.setTemplate(null);
                item.setEntityStatus(EntityStatus.Insert);
            });
        }
        if (tpl.CycleProperties() != null) {
            tpl.CycleProperties().stream().forEach(item -> {
                item.setId(null);
                item.setPubts(null);
                item.setTemplate(null);
                item.setEntityStatus(EntityStatus.Insert);
            });
        }
        if (tpl.Units() != null) {
            tpl.Units().stream().forEach(item -> {
                item.setId(null);
                item.setPubts(null);
                item.setTemplate(null);
                item.setEntityStatus(EntityStatus.Insert);
            });
        }
        if (tpl.Brands() != null) {
            tpl.Brands().stream().forEach(item -> {
                item.setId(null);
                item.setPubts(null);
                item.setTemplate(null);
                item.setEntityStatus(EntityStatus.Insert);
            });
        }
        if (tpl.productTplAssistUnitExchanges() != null) {
            tpl.productTplAssistUnitExchanges().stream().forEach(item -> {
                item.setId(null);
                item.setPubts(null);
                item.setTemplate(null);
                item.setEntityStatus(EntityStatus.Insert);
            });
        }
        if (tpl.freeCharacters() != null) {
            tpl.freeCharacters().stream().forEach(item -> {
                item.setId(null);
                item.setPubts(null);
                item.setTemplate(null);
                item.setEntityStatus(EntityStatus.Insert);
            });
        }
        if (tpl.productPropCharacters() != null) {
            tpl.productPropCharacters().stream().forEach(item -> {
                item.setId(null);
                item.setPubts(null);
                item.setTemplate(null);
                item.setEntityStatus(EntityStatus.Insert);
            });
        }
        if (tpl.skuCharacters() != null) {
            tpl.skuCharacters().stream().forEach(item -> {
                item.setId(null);
                item.setPubts(null);
                item.setTemplate(null);
                item.setEntityStatus(EntityStatus.Insert);
            });
        }
        if (tpl.optionCharacters() != null) {
            tpl.optionCharacters().stream().forEach(item -> {
                item.setId(null);
                item.setPubts(null);
                item.setTemplate(null);
                item.setEntityStatus(EntityStatus.Insert);
            });
        }
        return tpl;
    }

    public void dealI18n(ProductTpl data) {
        Object name = data.get("name");
        if (name != null) {
            Object zh_tw;
            Object en_us;
            BizObject bizName = (BizObject)name;
            Object zh_cn = bizName.get("zh_CN");
            if (zh_cn != null && !"".equals(zh_cn.toString())) {
                bizName.put("zh_CN", (Object)(zh_cn + InternationalUtils.getMessageWithDefault((String)"UID:P_COREDOC-BE_179F62860408079D", (String)"-\u526f\u672c")));
            }
            if ((en_us = bizName.get("en_US")) != null && !"".equals(en_us.toString())) {
                bizName.put("en_US", (Object)(en_us + "-copy"));
            }
            if ((zh_tw = bizName.get("zh_TW")) != null && !"".equals(zh_tw.toString())) {
                bizName.put("zh_TW", (Object)(zh_tw + InternationalUtils.getMessageWithDefault((String)"UID:P_COREDOC-BE_179F62860408079E", (String)"-\u526f\u672c")));
            }
        }
    }
}


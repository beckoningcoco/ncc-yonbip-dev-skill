/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.alibaba.fastjson.JSONObject
 *  com.yonyou.iuap.apdoc.coredoc.enums.CoreExtrateBusinessErrorEnum
 *  com.yonyou.iuap.apdoc.coredoc.exceptions.CoreDocBusinessException
 *  com.yonyou.ucf.mdd.common.model.rule.RuleExecuteResult
 *  com.yonyou.ucf.mdd.ext.bill.dto.BillDataDto
 *  com.yonyou.ucf.mdd.ext.bill.rule.base.AbstractCommonRule
 *  com.yonyou.ucf.mdd.ext.dao.meta.MetaDaoHelper
 *  com.yonyou.ucf.mdd.ext.model.BillContext
 *  com.yonyou.ucf.mdd.ext.util.BillContextUtils
 *  com.yonyoucloud.upc.pc.product.AssistUnitType
 *  com.yonyoucloud.upc.pc.tpl.ProductTpl
 *  com.yonyoucloud.upc.pc.tpl.ProductTplAssistUnitExchange
 *  org.imeta.orm.base.BizObject
 *  org.imeta.orm.schema.ConditionExpression
 *  org.imeta.orm.schema.QueryCondition
 *  org.imeta.orm.schema.QueryConditionGroup
 *  org.imeta.orm.schema.QuerySchema
 *  org.springframework.beans.factory.annotation.Autowired
 *  org.springframework.stereotype.Component
 */
package com.yonyoucloud.upc.billrule.tpl;

import com.alibaba.fastjson.JSONObject;
import com.yonyou.iuap.apdoc.coredoc.enums.CoreExtrateBusinessErrorEnum;
import com.yonyou.iuap.apdoc.coredoc.exceptions.CoreDocBusinessException;
import com.yonyou.ucf.mdd.common.model.rule.RuleExecuteResult;
import com.yonyou.ucf.mdd.ext.bill.dto.BillDataDto;
import com.yonyou.ucf.mdd.ext.bill.rule.base.AbstractCommonRule;
import com.yonyou.ucf.mdd.ext.dao.meta.MetaDaoHelper;
import com.yonyou.ucf.mdd.ext.model.BillContext;
import com.yonyou.ucf.mdd.ext.util.BillContextUtils;
import com.yonyoucloud.iuap.upc.api.service.IBizReferenceCheckService;
import com.yonyoucloud.upc.billrule.product.ProductFieldCheckRule;
import com.yonyoucloud.upc.billrule.tpl.ProducttplUtils;
import com.yonyoucloud.upc.pc.product.AssistUnitType;
import com.yonyoucloud.upc.pc.tpl.ProductTpl;
import com.yonyoucloud.upc.pc.tpl.ProductTplAssistUnitExchange;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.imeta.orm.base.BizObject;
import org.imeta.orm.schema.ConditionExpression;
import org.imeta.orm.schema.QueryCondition;
import org.imeta.orm.schema.QueryConditionGroup;
import org.imeta.orm.schema.QuerySchema;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component(value="productTplUnitReferCheck")
public class ProductTplUnitReferCheck
extends AbstractCommonRule {
    @Autowired
    ProductFieldCheckRule productFieldCheckRule;
    @Autowired
    private IBizReferenceCheckService checkService;

    public RuleExecuteResult execute(BillContext billContext, Map<String, Object> map) throws Exception {
        BillDataDto billDataDto = (BillDataDto)this.getParam(map);
        if (null == billContext || billDataDto == null) {
            return new RuleExecuteResult();
        }
        String item = billDataDto.getItem();
        Map itemMap = (Map)JSONObject.parseObject((String)item, Map.class);
        Object key = itemMap.get("key");
        if (key == null) {
            return null;
        }
        List bills = this.getBills(billContext, map);
        ProductTpl tpl = (ProductTpl)bills.get(0);
        String unitsSql = "";
        for (AssistUnitType assistUnitType : AssistUnitType.values()) {
            unitsSql = unitsSql + "detail." + assistUnitType + ", ";
        }
        QueryConditionGroup condition = QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"productTemplate").eq(tpl.getId()), QueryCondition.name((String)"unitUseType").eq((Object)1)});
        QuerySchema schema = QuerySchema.create().addSelect(unitsSql + "*").addCondition((ConditionExpression)condition);
        List products = MetaDaoHelper.query((String)"pc.product.Product", (QuerySchema)schema);
        if (products != null && products.size() > 0) {
            String checktype = key.toString();
            if ("unit_Name".equals(checktype)) {
                for (Object data : products) {
                    data.put("productApplyRangeId", 0);
                    data.put("isCreator", true);
                }
                this.checkProductUnit(products, item);
            }
            if ("enableAssistUnit".equals(checktype)) {
                List productTplAssistUnitExchanges = tpl.productTplAssistUnitExchanges();
                if (productTplAssistUnitExchanges != null && productTplAssistUnitExchanges.size() > 0) {
                    for (ProductTplAssistUnitExchange assistUnitExchange : productTplAssistUnitExchanges) {
                        if (!assistUnitExchange.containsKey((Object)"id") || assistUnitExchange.getId() == null || !assistUnitExchange.containsKey((Object)"assistUnit") || assistUnitExchange.getAssistUnit() == null) continue;
                        this.checkAssistUnit(products, (Map)assistUnitExchange, billDataDto);
                        break;
                    }
                } else {
                    this.checkProductUnit(products, item);
                }
            }
            if ("productTplAssistUnitExchanges".equals(checktype)) {
                Object value = itemMap.get("value");
                Map vMap = (Map)value;
                this.checkAssistUnit(products, vMap, billDataDto);
            }
        }
        return null;
    }

    private void checkAssistUnit(List<Map<String, Object>> products, Map vMap, BillDataDto billDataDto) throws Exception {
        Object assistUnit = vMap.get("assistUnit");
        if (assistUnit != null) {
            long assistUnitId = Long.parseLong(assistUnit.toString());
            for (Map<String, Object> data : products) {
                for (AssistUnitType assistUnitType : AssistUnitType.values()) {
                    String fieldName = "detail_" + assistUnitType;
                    Object uid = data.get(fieldName);
                    if (uid == null || assistUnitId != Long.parseLong(uid.toString())) continue;
                    throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_800110);
                }
            }
            String item = billDataDto.getItem();
            Map field = (Map)JSONObject.parseObject((String)billDataDto.getItem(), Map.class);
            field.put("key", "assistUnit");
            Object v = field.get("value");
            if (v instanceof Map) {
                Map value = (Map)field.get("value");
                Object unitId = value.get("assistUnit");
                BizObject unitMap = MetaDaoHelper.findById((String)"pc.unit.Unit", (Object)Long.parseLong(unitId.toString()));
                field.put("value", unitMap);
                item = JSONObject.toJSONString((Object)field);
            }
            this.checkProductUnit(products, item);
        }
    }

    public void checkProductUnit(List<Map<String, Object>> products, String item) throws Exception {
        String billnum = "pc_product";
        BillContext productBillContext = null;
        if (null != billnum) {
            productBillContext = BillContextUtils.getBillContext((String)billnum);
        }
        for (Map<String, Object> product : products) {
            product.put("productApplyRangeId", -1);
            product.put("isCreator", true);
        }
        BillDataDto bill = new BillDataDto();
        bill.setBillnum(billnum);
        bill.setData(products);
        bill.setItem(item);
        HashMap<String, Object> paramMap = new HashMap<String, Object>();
        paramMap.put("param", bill);
        ProducttplUtils.getInstance().checkUnitRef(productBillContext, products, paramMap, item, this.checkService);
    }
}


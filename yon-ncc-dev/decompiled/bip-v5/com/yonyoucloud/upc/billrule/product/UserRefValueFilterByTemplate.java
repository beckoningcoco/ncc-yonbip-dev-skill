/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.yonyou.iuap.apdoc.coredoc.constants.UPCConstants
 *  com.yonyou.ucf.mdd.common.model.ref.RefEntity
 *  com.yonyou.ucf.mdd.common.model.rule.RuleExecuteResult
 *  com.yonyou.ucf.mdd.common.model.uimeta.filter.vo.FilterVO
 *  com.yonyou.ucf.mdd.common.model.uimeta.filter.vo.SimpleFilterVO
 *  com.yonyou.ucf.mdd.ext.bill.dto.BillDataDto
 *  com.yonyou.ucf.mdd.ext.bill.rule.base.AbstractCommonRule
 *  com.yonyou.ucf.mdd.ext.dao.meta.MetaDaoHelper
 *  com.yonyou.ucf.mdd.ext.model.BillContext
 *  com.yonyoucloud.upc.pc.product.Product
 *  org.imeta.core.base.ConditionOperator
 *  org.imeta.orm.schema.ConditionExpression
 *  org.imeta.orm.schema.QueryCondition
 *  org.imeta.orm.schema.QueryConditionGroup
 *  org.imeta.orm.schema.QuerySchema
 *  org.springframework.beans.factory.annotation.Autowired
 *  org.springframework.stereotype.Component
 */
package com.yonyoucloud.upc.billrule.product;

import com.yonyou.iuap.apdoc.coredoc.constants.UPCConstants;
import com.yonyou.ucf.mdd.common.model.ref.RefEntity;
import com.yonyou.ucf.mdd.common.model.rule.RuleExecuteResult;
import com.yonyou.ucf.mdd.common.model.uimeta.filter.vo.FilterVO;
import com.yonyou.ucf.mdd.common.model.uimeta.filter.vo.SimpleFilterVO;
import com.yonyou.ucf.mdd.ext.bill.dto.BillDataDto;
import com.yonyou.ucf.mdd.ext.bill.rule.base.AbstractCommonRule;
import com.yonyou.ucf.mdd.ext.dao.meta.MetaDaoHelper;
import com.yonyou.ucf.mdd.ext.model.BillContext;
import com.yonyoucloud.upc.billrule.userdefine.UserdefValueRefFilter;
import com.yonyoucloud.upc.pc.product.Product;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import org.imeta.core.base.ConditionOperator;
import org.imeta.orm.schema.ConditionExpression;
import org.imeta.orm.schema.QueryCondition;
import org.imeta.orm.schema.QueryConditionGroup;
import org.imeta.orm.schema.QuerySchema;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component(value="userRefValueFilterByTemplate")
public class UserRefValueFilterByTemplate
extends AbstractCommonRule {
    @Autowired
    UserdefValueRefFilter udcref;

    public RuleExecuteResult execute(BillContext billContext, Map<String, Object> map) throws Exception {
        BillDataDto billDataDto = (BillDataDto)this.getParam(map);
        if (null == billContext || billDataDto == null) {
            return new RuleExecuteResult();
        }
        RefEntity refEntity = billDataDto.getRefEntity();
        List data = (List)billDataDto.getData();
        if (data == null || data.size() == 0) {
            return this.udcref.execute(billContext, map);
        }
        Product product = (Product)data.get(0);
        if ("pc_userdefref".equals(refEntity.refType) && product.getProductTemplate() != null) {
            FilterVO gridFilter = billDataDto.getCondition();
            if (gridFilter == null) {
                gridFilter = new FilterVO();
            }
            String sCurrentField = billDataDto.getKey();
            String sDefineId = billDataDto.getcSelfDefineType();
            String sSearchEntity = "";
            String sFilterFieldName = "";
            String sFilterValue = "";
            String sFilterName = "";
            String sTplFieldName = "";
            String sValueFieldName = "";
            switch (sCurrentField) {
                case "productspecitems": {
                    sSearchEntity = "pc.tpl.ProductTplSpec";
                    sFilterFieldName = "userdefid";
                    sFilterValue = this.getUserDefIdFromFilter(gridFilter);
                    sFilterName = "specification";
                    sTplFieldName = "template";
                    sValueFieldName = "specitem";
                    break;
                }
                default: {
                    sSearchEntity = this.getSelftDefineClass(sDefineId);
                    sFilterFieldName = "defineId";
                    sFilterValue = sDefineId;
                    sFilterName = "property.propertyType.defineId";
                    sTplFieldName = "property.template";
                    sValueFieldName = "value";
                }
            }
            if ("pc.tpl.ProductTplOrderPropertyValue".equals(sSearchEntity)) {
                QuerySchema schema = QuerySchema.create().addSelect(sValueFieldName).addCondition((ConditionExpression)QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)sTplFieldName).eq((Object)product.getProductTemplate()), QueryCondition.name((String)sFilterName).eq((Object)sFilterValue)})).addPager(1, UPCConstants.USERDEF_PAGE_SIZE.intValue());
                List tplValues = MetaDaoHelper.query((String)sSearchEntity, (QuerySchema)schema);
                ArrayList values = new ArrayList();
                tplValues.stream().forEach(e -> {
                    if ("productspecitems".equals(sCurrentField)) {
                        values.add(e.get("specitem"));
                    } else {
                        values.add(e.get("value"));
                    }
                });
                gridFilter.appendCondition(ConditionOperator.and, new SimpleFilterVO[]{new SimpleFilterVO("name", "in", values)});
                gridFilter.appendCondition(ConditionOperator.and, new SimpleFilterVO[]{new SimpleFilterVO(sFilterFieldName, "eq", (Object)sFilterValue)});
            } else {
                gridFilter.appendCondition(ConditionOperator.and, new SimpleFilterVO[]{new SimpleFilterVO("1", "eq", (Object)2)});
            }
            billDataDto.setCondition(gridFilter);
            this.putParam(map, billDataDto);
        }
        return new RuleExecuteResult();
    }

    private String getSelftDefineClass(String defineId) throws Exception {
        String entityName;
        QuerySchema schema = QuerySchema.create().addSelect("classId").addCondition((ConditionExpression)QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"defineId").eq((Object)defineId)}));
        List tplValues = MetaDaoHelper.query((String)"pc.userdef.UserDefineClass", (QuerySchema)schema);
        ArrayList values = new ArrayList();
        tplValues.stream().forEach(e -> values.add((String)e.get("classId")));
        switch (entityName = (String)values.get(0)) {
            case "productArchive": {
                entityName = "pc.tpl.ProductTplExtendPropertyValue";
                break;
            }
            case "productSpec": {
                entityName = "pc.tpl.ProductTplSpec";
                break;
            }
            case "productSku": {
                entityName = "pc.tpl.ProductTplSKUPropertyValue";
                break;
            }
            case "productOrder": {
                entityName = "pc.tpl.ProductTplOrderPropertyValue";
                break;
            }
        }
        return entityName;
    }

    private String getUserDefIdFromFilter(FilterVO gridFilter) {
        SimpleFilterVO[] simpleVOs = gridFilter.getSimpleVOs();
        for (int i = 0; i < simpleVOs.length; ++i) {
            if (!"userdefid".equals(simpleVOs[i].getField().toString())) continue;
            return simpleVOs[0].getValue1().toString();
        }
        return "";
    }
}


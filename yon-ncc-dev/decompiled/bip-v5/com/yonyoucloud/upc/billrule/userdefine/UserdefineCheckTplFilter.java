/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.yonyou.ucf.mdd.common.model.rule.RuleExecuteResult
 *  com.yonyou.ucf.mdd.ext.bill.dto.BillDataDto
 *  com.yonyou.ucf.mdd.ext.bill.rule.base.AbstractCommonRule
 *  com.yonyou.ucf.mdd.ext.core.AppContext
 *  com.yonyou.ucf.mdd.ext.dao.meta.MetaDaoHelper
 *  com.yonyou.ucf.mdd.ext.model.BillContext
 *  com.yonyou.ucf.mdd.ext.model.LoginUser
 *  com.yonyoucloud.upc.data.productPro.ProductProDao
 *  com.yonyoucloud.upc.pc.userdef.UserDefClassEnum
 *  com.yonyoucloud.upc.pc.userdef.UserDefineClass
 *  org.imeta.biz.base.Objectlizer
 *  org.imeta.orm.schema.ConditionExpression
 *  org.imeta.orm.schema.QueryCondition
 *  org.imeta.orm.schema.QueryConditionGroup
 *  org.imeta.orm.schema.QuerySchema
 *  org.springframework.beans.factory.annotation.Autowired
 *  org.springframework.stereotype.Component
 */
package com.yonyoucloud.upc.billrule.userdefine;

import com.yonyou.ucf.mdd.common.model.rule.RuleExecuteResult;
import com.yonyou.ucf.mdd.ext.bill.dto.BillDataDto;
import com.yonyou.ucf.mdd.ext.bill.rule.base.AbstractCommonRule;
import com.yonyou.ucf.mdd.ext.core.AppContext;
import com.yonyou.ucf.mdd.ext.dao.meta.MetaDaoHelper;
import com.yonyou.ucf.mdd.ext.model.BillContext;
import com.yonyou.ucf.mdd.ext.model.LoginUser;
import com.yonyoucloud.upc.data.productPro.ProductProDao;
import com.yonyoucloud.upc.pc.userdef.UserDefClassEnum;
import com.yonyoucloud.upc.pc.userdef.UserDefineClass;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import org.imeta.biz.base.Objectlizer;
import org.imeta.orm.schema.ConditionExpression;
import org.imeta.orm.schema.QueryCondition;
import org.imeta.orm.schema.QueryConditionGroup;
import org.imeta.orm.schema.QuerySchema;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component(value="detailCheckTplRule")
public class UserdefineCheckTplFilter
extends AbstractCommonRule {
    @Autowired
    private ProductProDao productProDao;

    public RuleExecuteResult execute(BillContext billContext, Map<String, Object> map) throws Exception {
        QuerySchema schema;
        LoginUser user = AppContext.getCurrentUser();
        if (user == null || user.getTenant() == null) {
            return new RuleExecuteResult();
        }
        Long tenantId = (Long)user.getTenant();
        Map data = (Map)map.get("return");
        BillDataDto billDataDto = (BillDataDto)this.getParam(map);
        String billNum = billDataDto.getBillnum();
        UserDefineClass udc = (UserDefineClass)Objectlizer.convert((Map)data, (String)"pc.userdef.UserDefineClass");
        List checkResult = new ArrayList();
        List checkResultSet = new ArrayList();
        HashSet<String> valueSet = new HashSet<String>();
        if (billNum.equals(UserDefClassEnum.PRODUCTORDER.getBillnum()) && (checkResult = MetaDaoHelper.query((String)"pc.tpl.ProductTplOrderProperty", (QuerySchema)(schema = QuerySchema.create().addSelect("id").addCondition((ConditionExpression)QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"propertyType").eq(udc.getId())}))))) != null && checkResult.size() > 0) {
            for (Map result : checkResult) {
                QuerySchema schemaValue = QuerySchema.create().addSelect("value").addCondition((ConditionExpression)QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"property").eq(result.get("id"))}));
                checkResultSet = MetaDaoHelper.query((String)"pc.tpl.ProductTplOrderPropertyValue", (QuerySchema)schemaValue);
                for (Map resultSet : checkResultSet) {
                    valueSet.add((String)resultSet.get("value"));
                }
            }
        }
        HashMap<String, Serializable> checkMap = new HashMap<String, Serializable>();
        HashSet<Long> userdefIdList = new HashSet<Long>();
        if (checkResult != null && checkResult.size() > 0) {
            checkMap.put("checkHead", Integer.valueOf(1));
            List userdefIdMap = new ArrayList();
            if (valueSet != null && valueSet.size() > 0) {
                QuerySchema schemaUserdefId = QuerySchema.create().addSelect("id").addCondition((ConditionExpression)QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"name").in(valueSet), QueryCondition.name((String)"userdefid").eq(udc.getId())}));
                userdefIdMap = MetaDaoHelper.query((String)"pc.userdef.Userdefine", (QuerySchema)schemaUserdefId);
                for (Map resmap : userdefIdMap) {
                    userdefIdList.add((Long)resmap.get("id"));
                }
            }
            checkMap.put("checkBody", userdefIdList);
            ((Map)map.get("return")).put("checkPro", checkMap);
        } else {
            checkMap.put("checkHead", Integer.valueOf(0));
            checkMap.put("checkBody", userdefIdList);
            ((Map)map.get("return")).put("checkPro", checkMap);
        }
        return new RuleExecuteResult();
    }
}


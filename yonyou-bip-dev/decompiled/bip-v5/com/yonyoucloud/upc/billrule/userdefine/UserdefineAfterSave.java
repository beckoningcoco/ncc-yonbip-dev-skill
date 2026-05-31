/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.yonyou.ucf.mdd.common.model.rule.RuleExecuteResult
 *  com.yonyou.ucf.mdd.ext.bill.rule.base.AbstractCommonRule
 *  com.yonyou.ucf.mdd.ext.core.AppContext
 *  com.yonyou.ucf.mdd.ext.dao.sql.SqlHelper
 *  com.yonyou.ucf.mdd.ext.model.BillContext
 *  com.yonyoucloud.upc.pc.userdef.UserDefClassEnum
 *  com.yonyoucloud.upc.pc.userdef.UserDefineClass
 *  com.yonyoucloud.upc.utils.MultilangUtil
 *  org.imeta.orm.base.BizObject
 *  org.springframework.stereotype.Component
 */
package com.yonyoucloud.upc.billrule.userdefine;

import com.yonyou.ucf.mdd.common.model.rule.RuleExecuteResult;
import com.yonyou.ucf.mdd.ext.bill.rule.base.AbstractCommonRule;
import com.yonyou.ucf.mdd.ext.core.AppContext;
import com.yonyou.ucf.mdd.ext.dao.sql.SqlHelper;
import com.yonyou.ucf.mdd.ext.model.BillContext;
import com.yonyoucloud.upc.pc.userdef.UserDefClassEnum;
import com.yonyoucloud.upc.pc.userdef.UserDefineClass;
import com.yonyoucloud.upc.utils.MultilangUtil;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.imeta.orm.base.BizObject;
import org.springframework.stereotype.Component;

@Component(value="UserdefineAfterSave")
public class UserdefineAfterSave
extends AbstractCommonRule {
    public RuleExecuteResult execute(BillContext billContext, Map<String, Object> map) throws Exception {
        String billNum = billContext.getBillnum();
        map.put("ytenant", AppContext.getYTenantId());
        if (billNum.equals(UserDefClassEnum.PRODUCTORDER.getBillnum())) {
            List bills = this.getBills(billContext, map);
            UserDefineClass udc = (UserDefineClass)bills.get(0);
            HashMap<String, Object> params = new HashMap<String, Object>();
            if (udc.containsKey((Object)"isWebShow")) {
                params.put("isShow", udc.get("isWebShow"));
            }
            if (udc.containsKey((Object)"isWebInput")) {
                params.put("isWebRequired", udc.get("isWebInput"));
            }
            if (udc.containsKey((Object)"userdefAlias")) {
                params.put("propertyAlias", MultilangUtil.getAttr((String)"pc.userdef.UserDefineClass", (String)"userdefAlias", (BizObject)udc, null));
            }
            if (udc.containsKey((Object)"orderNum")) {
                params.put("ordernumber", udc.get("orderNum"));
            }
            if (udc.containsKey((Object)"id")) {
                params.put("propertyType", udc.get("id"));
            }
            if (params.size() > 1) {
                SqlHelper.update((String)"com.yonyoucloud.upc.product.dao.ProductUpdate.updateProductTplOrderProperty", params);
            }
        }
        return new RuleExecuteResult();
    }
}


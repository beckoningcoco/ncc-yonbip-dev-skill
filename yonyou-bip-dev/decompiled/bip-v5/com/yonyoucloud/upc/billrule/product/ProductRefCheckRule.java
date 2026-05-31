/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.yonyou.iuap.apdoc.coredoc.enums.CoreDocBusinessErrorEnum
 *  com.yonyou.iuap.apdoc.coredoc.exceptions.CoreDocBusinessException
 *  com.yonyou.ucf.mdd.common.model.rule.RuleExecuteResult
 *  com.yonyou.ucf.mdd.ext.bill.dto.BillDataDto
 *  com.yonyou.ucf.mdd.ext.bill.rule.base.AbstractCommonRule
 *  com.yonyou.ucf.mdd.ext.core.AppContext
 *  com.yonyou.ucf.mdd.ext.dao.sql.SqlHelper
 *  com.yonyou.ucf.mdd.ext.model.BillContext
 *  org.imeta.orm.base.BizObject
 *  org.springframework.stereotype.Component
 */
package com.yonyoucloud.upc.billrule.product;

import com.yonyou.iuap.apdoc.coredoc.enums.CoreDocBusinessErrorEnum;
import com.yonyou.iuap.apdoc.coredoc.exceptions.CoreDocBusinessException;
import com.yonyou.ucf.mdd.common.model.rule.RuleExecuteResult;
import com.yonyou.ucf.mdd.ext.bill.dto.BillDataDto;
import com.yonyou.ucf.mdd.ext.bill.rule.base.AbstractCommonRule;
import com.yonyou.ucf.mdd.ext.core.AppContext;
import com.yonyou.ucf.mdd.ext.dao.sql.SqlHelper;
import com.yonyou.ucf.mdd.ext.model.BillContext;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.imeta.orm.base.BizObject;
import org.springframework.stereotype.Component;

@Component(value="productRefCheckRule")
public class ProductRefCheckRule
extends AbstractCommonRule {
    public RuleExecuteResult execute(BillContext billContext, Map<String, Object> paramMap) throws Exception {
        BizObject bizObject;
        BillDataDto billDataDto = (BillDataDto)this.getParam(paramMap);
        if (null == billContext || billDataDto == null) {
            return new RuleExecuteResult();
        }
        List bills = this.getBills(billContext, paramMap);
        HashMap<String, String> params = new HashMap<String, String>();
        String refProductCode = null;
        if ("bd_expenseitemlist".equals(billContext.getBillnum()) && (bizObject = (BizObject)bills.get(0)).get("id") != null) {
            String expenseCode = (String)bizObject.get("code");
            String sql = "select distinct a.code as code from product a inner join productdetail b on a.id = b.productid and a.ytenant_id =b.ytenant_id  where a.ytenant_id ='" + AppContext.getCurrentUser().getYTenantId() + "' and b.costItems='" + bizObject.get("id").toString() + "'";
            params.put("sql", sql);
            List productRefCheckList = SqlHelper.selectList((String)"com.yonyou.ucf.mdd.ext.meta.dao.selectList", params);
            if (null != productRefCheckList && productRefCheckList.size() > 0) {
                refProductCode = ((Map)productRefCheckList.get(0)).get("code").toString();
                if (productRefCheckList.size() == 1) {
                    throw new CoreDocBusinessException(CoreDocBusinessErrorEnum.PRODUCT_COST_PROJECT_IS_REFERENCE_BY_PRODUCT, new Object[]{expenseCode, refProductCode});
                }
                throw new CoreDocBusinessException(CoreDocBusinessErrorEnum.PRODUCT_COST_PROJECT_IS_REFERENCE_BY_PRODUCT_T1, new Object[]{expenseCode, refProductCode});
            }
        }
        return new RuleExecuteResult();
    }
}


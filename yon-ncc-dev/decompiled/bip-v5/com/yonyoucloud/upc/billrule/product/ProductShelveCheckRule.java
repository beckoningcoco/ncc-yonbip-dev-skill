/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.yonyou.iuap.apdoc.coredoc.enums.CoreDocBusinessErrorEnum
 *  com.yonyou.iuap.apdoc.coredoc.enums.CoreExtrateBusinessErrorEnum
 *  com.yonyou.iuap.apdoc.coredoc.exceptions.CoreDocBusinessException
 *  com.yonyou.ucf.mdd.common.model.rule.RuleExecuteResult
 *  com.yonyou.ucf.mdd.ext.bill.rule.base.AbstractCommonRule
 *  com.yonyou.ucf.mdd.ext.core.AppContext
 *  com.yonyou.ucf.mdd.ext.dao.meta.MetaDaoHelper
 *  com.yonyou.ucf.mdd.ext.model.BillContext
 *  com.yonyou.ucf.mdd.ext.model.LoginUser
 *  org.imeta.orm.base.BizObject
 *  org.imeta.orm.schema.ConditionExpression
 *  org.imeta.orm.schema.QueryCondition
 *  org.imeta.orm.schema.QueryConditionGroup
 *  org.imeta.orm.schema.QuerySchema
 *  org.springframework.stereotype.Component
 */
package com.yonyoucloud.upc.billrule.product;

import com.yonyou.iuap.apdoc.coredoc.enums.CoreDocBusinessErrorEnum;
import com.yonyou.iuap.apdoc.coredoc.enums.CoreExtrateBusinessErrorEnum;
import com.yonyou.iuap.apdoc.coredoc.exceptions.CoreDocBusinessException;
import com.yonyou.ucf.mdd.common.model.rule.RuleExecuteResult;
import com.yonyou.ucf.mdd.ext.bill.rule.base.AbstractCommonRule;
import com.yonyou.ucf.mdd.ext.core.AppContext;
import com.yonyou.ucf.mdd.ext.dao.meta.MetaDaoHelper;
import com.yonyou.ucf.mdd.ext.model.BillContext;
import com.yonyou.ucf.mdd.ext.model.LoginUser;
import java.util.List;
import java.util.Map;
import org.imeta.orm.base.BizObject;
import org.imeta.orm.schema.ConditionExpression;
import org.imeta.orm.schema.QueryCondition;
import org.imeta.orm.schema.QueryConditionGroup;
import org.imeta.orm.schema.QuerySchema;
import org.springframework.stereotype.Component;

@Component(value="productShelveCheckRule")
public class ProductShelveCheckRule
extends AbstractCommonRule {
    public RuleExecuteResult execute(BillContext billContext, Map<String, Object> paramMap) throws Exception {
        List bills = this.getBills(billContext, paramMap);
        LoginUser user = AppContext.getCurrentUser();
        if (null == user) {
            throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_800108);
        }
        switch (user.getUserType()) {
            case TenantAdmin: 
            case TenantEmployee: 
            case JoinUser: 
            case TenantShopuser: {
                break;
            }
            case ShopAdminUser: 
            case ShopUser: {
                this.checkPlatFormStaus(bills);
                break;
            }
        }
        return new RuleExecuteResult();
    }

    private void checkPlatFormStaus(List<BizObject> bills) throws Exception {
        for (BizObject bill : bills) {
            Map map = MetaDaoHelper.queryOne((String)"pc.product.Product", (QuerySchema)QuerySchema.create().addSelect(new String[]{"platFormStaus", "code", "name"}).addCondition((ConditionExpression)QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"id").eq(bill.get("id"))})));
            if (map.isEmpty()) {
                throw new CoreDocBusinessException(CoreDocBusinessErrorEnum.PRODUCT_SHOP_IS_DELETE, (Object[])bill.get("id"));
            }
            if (map.get("platFormStaus").toString().equals("1")) continue;
            switch (map.get("platFormStaus").toString()) {
                case "0": {
                    throw new CoreDocBusinessException(CoreDocBusinessErrorEnum.PRODUCT_IS_NOT_AUDIT, new Object[]{map.get("name"), map.get("code")});
                }
                case "2": {
                    throw new CoreDocBusinessException(CoreDocBusinessErrorEnum.PRODUCT_IS_NOT_AUDIT_T1, new Object[]{map.get("name"), map.get("code")});
                }
                case "3": {
                    throw new CoreDocBusinessException(CoreDocBusinessErrorEnum.PRODUCT_IS_NOT_ALLOW_SHELVE_OPERATION, new Object[]{map.get("name"), map.get("code")});
                }
            }
        }
    }
}


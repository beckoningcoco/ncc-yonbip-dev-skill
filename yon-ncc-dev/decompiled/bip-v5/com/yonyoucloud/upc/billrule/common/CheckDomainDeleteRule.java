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
 *  com.yonyoucloud.upc.pc.productline.ProductLine
 *  com.yonyoucloud.upc.service.utils.PubOptionDataQueryUtil
 *  org.imeta.orm.base.BizObject
 *  org.imeta.orm.schema.ConditionExpression
 *  org.imeta.orm.schema.QueryCondition
 *  org.imeta.orm.schema.QuerySchema
 *  org.springframework.beans.factory.annotation.Autowired
 *  org.springframework.stereotype.Component
 *  org.springframework.util.CollectionUtils
 */
package com.yonyoucloud.upc.billrule.common;

import com.yonyou.iuap.apdoc.coredoc.enums.CoreDocBusinessErrorEnum;
import com.yonyou.iuap.apdoc.coredoc.enums.CoreExtrateBusinessErrorEnum;
import com.yonyou.iuap.apdoc.coredoc.exceptions.CoreDocBusinessException;
import com.yonyou.ucf.mdd.common.model.rule.RuleExecuteResult;
import com.yonyou.ucf.mdd.ext.bill.rule.base.AbstractCommonRule;
import com.yonyou.ucf.mdd.ext.core.AppContext;
import com.yonyou.ucf.mdd.ext.dao.meta.MetaDaoHelper;
import com.yonyou.ucf.mdd.ext.model.BillContext;
import com.yonyou.ucf.mdd.ext.model.LoginUser;
import com.yonyoucloud.upc.coredoc.pub.CheckDomainDeleteService;
import com.yonyoucloud.upc.pc.productline.ProductLine;
import com.yonyoucloud.upc.service.bill.product.ProductDoubleWriteService;
import com.yonyoucloud.upc.service.utils.PubOptionDataQueryUtil;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.imeta.orm.base.BizObject;
import org.imeta.orm.schema.ConditionExpression;
import org.imeta.orm.schema.QueryCondition;
import org.imeta.orm.schema.QuerySchema;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.util.CollectionUtils;

@Component
public class CheckDomainDeleteRule
extends AbstractCommonRule {
    @Autowired
    private CheckDomainDeleteService checkDomainDeleteService;
    @Autowired
    ProductDoubleWriteService productDoubleWriteService;
    @Autowired
    PubOptionDataQueryUtil pubOptionDataQueryUtil;
    private static final Set<String> productBillNumSet = new HashSet<String>();

    public RuleExecuteResult execute(BillContext billContext, Map<String, Object> map) throws Exception {
        List bills = this.getBills(billContext, map);
        LoginUser user = AppContext.getCurrentUser();
        if (null == user) {
            throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_800108);
        }
        if (!CollectionUtils.isEmpty((Collection)bills)) {
            for (BizObject bill : bills) {
                if ("pc_productlinelist".equals(billContext.getBillnum())) {
                    for (BizObject billData : bills) {
                        ProductLine productLine = (ProductLine)billData;
                        this.checkRefbyProduct(productLine);
                    }
                }
                if (billContext.getFullname() == null || billContext.getBillnum() == null) continue;
                this.checkDomainDeleteService.checkDomainDeleteDTO(billContext.getFullname(), billContext.getBillnum(), bill);
            }
        }
        return new RuleExecuteResult();
    }

    private void checkRefbyProduct(ProductLine productLine) throws Exception {
        QuerySchema schema;
        List prduct;
        if (productLine.getId() != null && (prduct = MetaDaoHelper.query((String)"pc.product.Product", (QuerySchema)(schema = QuerySchema.create().addSelect("count(1)  as total").appendQueryCondition(new ConditionExpression[]{QueryCondition.name((String)"productLine").eq(productLine.getId())})))) != null && !prduct.isEmpty() && ((Map)prduct.get(0)).get("total") != null && !"0".equals(((Map)prduct.get(0)).get("total").toString())) {
            throw new CoreDocBusinessException(CoreDocBusinessErrorEnum.PRODUCT_LINE_CAN_NOT_DELETE);
        }
    }

    static {
        productBillNumSet.add("pc_product");
        productBillNumSet.add("pc_productdetail");
        productBillNumSet.add("pc_productlist");
        productBillNumSet.add("pc_productlist_query");
    }
}


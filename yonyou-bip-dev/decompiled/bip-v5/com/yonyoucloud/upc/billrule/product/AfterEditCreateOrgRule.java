/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.yonyou.ucf.mdd.common.model.rule.RuleExecuteResult
 *  com.yonyou.ucf.mdd.ext.bill.dto.BillDataDto
 *  com.yonyou.ucf.mdd.ext.bill.rule.base.AbstractCommonRule
 *  com.yonyou.ucf.mdd.ext.core.AppContext
 *  com.yonyou.ucf.mdd.ext.dao.meta.biz.ParallelTableWalker
 *  com.yonyou.ucf.mdd.ext.model.BillContext
 *  com.yonyoucloud.upc.pc.product.Product
 *  org.imeta.biz.walker.ChainWalker
 *  org.imeta.biz.walker.DataCleanWalker
 *  org.imeta.biz.walker.ObjectFullWalker
 *  org.imeta.orm.base.BizObject
 *  org.springframework.beans.factory.annotation.Autowired
 *  org.springframework.stereotype.Component
 */
package com.yonyoucloud.upc.billrule.product;

import com.yonyou.ucf.mdd.common.model.rule.RuleExecuteResult;
import com.yonyou.ucf.mdd.ext.bill.dto.BillDataDto;
import com.yonyou.ucf.mdd.ext.bill.rule.base.AbstractCommonRule;
import com.yonyou.ucf.mdd.ext.core.AppContext;
import com.yonyou.ucf.mdd.ext.dao.meta.biz.ParallelTableWalker;
import com.yonyou.ucf.mdd.ext.model.BillContext;
import com.yonyoucloud.iuap.upc.api.service.IUPCControlRuleService;
import com.yonyoucloud.iuap.upc.api.service.IUPCProductQueryService;
import com.yonyoucloud.upc.pc.product.Product;
import com.yonyoucloud.upc.service.utils.ProductUtil;
import java.util.List;
import java.util.Map;
import org.imeta.biz.walker.ChainWalker;
import org.imeta.biz.walker.DataCleanWalker;
import org.imeta.biz.walker.ObjectFullWalker;
import org.imeta.orm.base.BizObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component(value="afterEditCreateOrgRule")
public class AfterEditCreateOrgRule
extends AbstractCommonRule {
    @Autowired
    private IUPCControlRuleService upcControlRuleService;
    @Autowired
    private IUPCProductQueryService upcProductQueryService;

    public RuleExecuteResult execute(BillContext billContext, Map<String, Object> paramMap) throws Exception {
        BillDataDto billDataDto = (BillDataDto)this.getParam(paramMap);
        if (null == billContext || billDataDto == null) {
            return new RuleExecuteResult();
        }
        List bills = this.getBills(billContext, paramMap);
        Product product = (Product)bills.get(0);
        if (this.upcControlRuleService.checkProductLine().booleanValue() && null == product.getId() && ProductUtil.checkUserTyoe(AppContext.getCurrentUser()) == 3) {
            Boolean singleOrg = this.upcControlRuleService.checkSingleOrg();
            this.upcProductQueryService.setOrgs4U8c(product, singleOrg);
        }
        if (null != product) {
            DataCleanWalker dataCleanWalker = new DataCleanWalker();
            dataCleanWalker.setNext((ChainWalker)new ParallelTableWalker());
            ObjectFullWalker.walk((ChainWalker)dataCleanWalker, (BizObject)product, (String)billContext.getFullname());
            this.putParam(paramMap, "return", product);
        }
        return new RuleExecuteResult();
    }
}


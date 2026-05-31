/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.yonyou.diwork.service.auth.IServiceIsolateService
 *  com.yonyou.ucf.mdd.common.model.ref.RefEntity
 *  com.yonyou.ucf.mdd.common.model.rule.RuleExecuteResult
 *  com.yonyou.ucf.mdd.common.model.uimeta.filter.vo.FilterVO
 *  com.yonyou.ucf.mdd.common.model.uimeta.filter.vo.SimpleFilterVO
 *  com.yonyou.ucf.mdd.ext.bill.dto.BillDataDto
 *  com.yonyou.ucf.mdd.ext.bill.rule.base.AbstractCommonRule
 *  com.yonyou.ucf.mdd.ext.core.AppContext
 *  com.yonyou.ucf.mdd.ext.model.BillContext
 *  com.yonyoucloud.upc.data.product.ProductGroupDao
 *  com.yonyoucloud.upc.pc.product.Product
 *  com.yonyoucloud.upc.pc.product.ProductApplyRange
 *  com.yonyoucloud.upc.pc.productapply.ProductApply
 *  org.imeta.core.base.ConditionOperator
 *  org.slf4j.Logger
 *  org.slf4j.LoggerFactory
 *  org.springframework.beans.factory.annotation.Autowired
 *  org.springframework.stereotype.Component
 *  org.springframework.util.CollectionUtils
 */
package com.yonyoucloud.upc.billrule.productApply;

import com.yonyou.diwork.service.auth.IServiceIsolateService;
import com.yonyou.ucf.mdd.common.model.ref.RefEntity;
import com.yonyou.ucf.mdd.common.model.rule.RuleExecuteResult;
import com.yonyou.ucf.mdd.common.model.uimeta.filter.vo.FilterVO;
import com.yonyou.ucf.mdd.common.model.uimeta.filter.vo.SimpleFilterVO;
import com.yonyou.ucf.mdd.ext.bill.dto.BillDataDto;
import com.yonyou.ucf.mdd.ext.bill.rule.base.AbstractCommonRule;
import com.yonyou.ucf.mdd.ext.core.AppContext;
import com.yonyou.ucf.mdd.ext.model.BillContext;
import com.yonyoucloud.iuap.upc.api.service.IUPCControlRuleService;
import com.yonyoucloud.upc.data.product.ProductGroupDao;
import com.yonyoucloud.upc.pc.product.Product;
import com.yonyoucloud.upc.pc.product.ProductApplyRange;
import com.yonyoucloud.upc.pc.productapply.ProductApply;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import org.imeta.core.base.ConditionOperator;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.util.CollectionUtils;

@Component(value="productApplyRefFilter")
public class ProductApplyRefFilter
extends AbstractCommonRule {
    private static final Logger log = LoggerFactory.getLogger(ProductApplyRefFilter.class);
    @Autowired
    private IUPCControlRuleService upcControlRuleService;
    @Autowired
    private ProductGroupDao productGroupDao;
    @Autowired
    private IServiceIsolateService iServiceIsolateService;

    public RuleExecuteResult execute(BillContext billContext, Map<String, Object> map) throws Exception {
        Product originalProduct;
        BillDataDto billDataDto = (BillDataDto)this.getParam(map);
        if (null == billContext || billDataDto == null) {
            return new RuleExecuteResult();
        }
        List bills = this.getBills(billContext, map);
        ProductApply productApply = new ProductApply();
        if (!CollectionUtils.isEmpty((Collection)bills)) {
            productApply.init((Map)bills.get(0));
        }
        RefEntity refEntity = billDataDto.getRefEntity();
        FilterVO productApplyGridFilter = billDataDto.getCondition();
        FilterVO productApplyTreeFilter = billDataDto.getTreeCondition();
        if (productApplyTreeFilter == null) {
            productApplyTreeFilter = new FilterVO();
        }
        if (productApplyGridFilter == null) {
            productApplyGridFilter = new FilterVO();
        }
        if ("org_pure_table_ref".equals(refEntity.getCode()) && "pc_productapply".equals(billContext.getBillnum()) && "orgId_name".equals(billDataDto.getKey()) && productApply.getApplyProductId() != null && !CollectionUtils.isEmpty((Map)(originalProduct = this.productGroupDao.getProductById(productApply.getApplyProductId())))) {
            ArrayList<String> orgIdList = new ArrayList<String>();
            List authOrgIdList = this.iServiceIsolateService.findMainOrgPermission(AppContext.getCurrentUser().getYhtUserId(), "pc_productapply", AppContext.getCurrentUser().getYhtTenantId());
            if (!CollectionUtils.isEmpty((Collection)authOrgIdList)) {
                List originalProductApplyRangeList = this.productGroupDao.getProductApplyRangeByProductId(AppContext.getCurrentUser().getYTenantId(), productApply.getApplyProductId());
                if (!CollectionUtils.isEmpty((Collection)originalProductApplyRangeList)) {
                    for (ProductApplyRange productApplyRange : originalProductApplyRangeList) {
                        orgIdList.add(productApplyRange.getOrgId());
                    }
                }
                authOrgIdList.removeAll(orgIdList);
                if (!CollectionUtils.isEmpty((Collection)authOrgIdList)) {
                    productApplyGridFilter.appendCondition(ConditionOperator.and, new SimpleFilterVO[]{new SimpleFilterVO("id", "in", (Object)authOrgIdList)});
                } else {
                    productApplyGridFilter.appendCondition(ConditionOperator.and, new SimpleFilterVO[]{new SimpleFilterVO("1", "eq", (Object)"2")});
                }
            } else {
                productApplyGridFilter.appendCondition(ConditionOperator.and, new SimpleFilterVO[]{new SimpleFilterVO("1", "eq", (Object)"2")});
            }
        }
        billDataDto.setCondition(productApplyGridFilter);
        billDataDto.setTreeCondition(productApplyTreeFilter);
        this.putParam(map, billDataDto);
        return new RuleExecuteResult();
    }
}


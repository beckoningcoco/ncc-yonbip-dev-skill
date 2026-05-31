/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.yonyou.iuap.apdoc.coredoc.enums.CoreDocBusinessErrorEnum
 *  com.yonyou.iuap.apdoc.coredoc.exceptions.CoreDocBusinessException
 *  com.yonyou.iuap.ucf.common.i18n.InternationalUtils
 *  com.yonyou.uap.billcode.BillCodeContext
 *  com.yonyou.uap.billcode.BillCodeObj
 *  com.yonyou.uap.billcode.service.IBillCodeComponentService
 *  com.yonyou.ucf.mdd.common.model.rule.RuleExecuteResult
 *  com.yonyou.ucf.mdd.ext.bill.dto.BillDataDto
 *  com.yonyou.ucf.mdd.ext.bill.rule.base.AbstractCommonRule
 *  com.yonyou.ucf.mdd.ext.core.AppContext
 *  com.yonyou.ucf.mdd.ext.dao.meta.MetaDaoHelper
 *  com.yonyou.ucf.mdd.ext.model.BillContext
 *  com.yonyoucloud.upc.pc.product.Product
 *  com.yonyoucloud.upc.pc.product.ProductSKU
 *  com.yonyoucloud.upc.pc.product.SkuAutoCodeFieldEnum
 *  com.yonyoucloud.upc.utils.MainChildBillBuildUtils
 *  org.apache.commons.lang3.StringUtils
 *  org.imeta.orm.base.BizObject
 *  org.imeta.orm.base.EntityStatus
 *  org.imeta.orm.schema.ConditionExpression
 *  org.imeta.orm.schema.QueryCondition
 *  org.imeta.orm.schema.QueryConditionGroup
 *  org.imeta.orm.schema.QuerySchema
 *  org.slf4j.Logger
 *  org.slf4j.LoggerFactory
 *  org.springframework.beans.factory.annotation.Autowired
 *  org.springframework.stereotype.Component
 *  org.springframework.util.CollectionUtils
 */
package com.yonyoucloud.upc.billrule.product;

import com.yonyou.iuap.apdoc.coredoc.enums.CoreDocBusinessErrorEnum;
import com.yonyou.iuap.apdoc.coredoc.exceptions.CoreDocBusinessException;
import com.yonyou.iuap.ucf.common.i18n.InternationalUtils;
import com.yonyou.uap.billcode.BillCodeContext;
import com.yonyou.uap.billcode.BillCodeObj;
import com.yonyou.uap.billcode.service.IBillCodeComponentService;
import com.yonyou.ucf.mdd.common.model.rule.RuleExecuteResult;
import com.yonyou.ucf.mdd.ext.bill.dto.BillDataDto;
import com.yonyou.ucf.mdd.ext.bill.rule.base.AbstractCommonRule;
import com.yonyou.ucf.mdd.ext.core.AppContext;
import com.yonyou.ucf.mdd.ext.dao.meta.MetaDaoHelper;
import com.yonyou.ucf.mdd.ext.model.BillContext;
import com.yonyoucloud.upc.pc.product.Product;
import com.yonyoucloud.upc.pc.product.ProductSKU;
import com.yonyoucloud.upc.pc.product.SkuAutoCodeFieldEnum;
import com.yonyoucloud.upc.utils.MainChildBillBuildUtils;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.Collectors;
import org.apache.commons.lang3.StringUtils;
import org.imeta.orm.base.BizObject;
import org.imeta.orm.base.EntityStatus;
import org.imeta.orm.schema.ConditionExpression;
import org.imeta.orm.schema.QueryCondition;
import org.imeta.orm.schema.QueryConditionGroup;
import org.imeta.orm.schema.QuerySchema;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.util.CollectionUtils;

@Component(value="productSKUAutoCodeRule")
public class ProductSKUAutoCodeRule
extends AbstractCommonRule {
    private static final Logger log = LoggerFactory.getLogger(ProductSKUAutoCodeRule.class);
    @Autowired
    private IBillCodeComponentService iBillCodeComponentService;

    public RuleExecuteResult execute(BillContext billContext, Map<String, Object> paramMap) throws Exception {
        BillDataDto billDataDto = (BillDataDto)this.getParam(paramMap);
        if (null == billContext || billDataDto == null) {
            return new RuleExecuteResult();
        }
        List bills = this.getBills(billContext, paramMap);
        Object billnumMode = paramMap.get("billCodeContext_billnumMode");
        log.info("productSKUAutoCodeRule==>billnumMode: {}", billnumMode);
        if (billnumMode == null || billnumMode != null && Integer.parseInt(billnumMode.toString()) == 0) {
            return new RuleExecuteResult();
        }
        for (int i = 0; i < bills.size(); ++i) {
            Product product = (Product)bills.get(i);
            this.skuBatchAutoCode(product, billnumMode);
        }
        return new RuleExecuteResult();
    }

    public void skuBatchAutoCode(Product product, Object billnumMode) throws Exception {
        if (null == billnumMode) {
            BillCodeContext billCodeContext = this.iBillCodeComponentService.getBillCodeContext("pc_product|productskus#code", AppContext.getCurrentUser().getYhtTenantId(), "");
            billnumMode = billCodeContext.getBillnumMode();
        }
        Product productNew = (Product)product.clone();
        List skus = null;
        AtomicInteger times = new AtomicInteger(0);
        EntityStatus status = productNew.getEntityStatus();
        if (CollectionUtils.isEmpty((Collection)productNew.productskus())) {
            return;
        }
        if (status == EntityStatus.Insert) {
            if (Integer.parseInt(billnumMode.toString()) == 1 && status == EntityStatus.Insert) {
                skus = productNew.productskus();
            } else if (Integer.parseInt(billnumMode.toString()) == 2) {
                skus = productNew.productskus().stream().filter(sku -> StringUtils.isEmpty((CharSequence)sku.getCode())).collect(Collectors.toList());
            }
        } else if (status == EntityStatus.Update && productNew != null && productNew.productskus() != null) {
            skus = productNew.productskus().stream().filter(sku -> StringUtils.isEmpty((CharSequence)sku.getCode()) && sku.getEntityStatus() == EntityStatus.Insert).collect(Collectors.toList());
        }
        if (skus == null || skus.isEmpty()) {
            return;
        }
        this.setSkuAutoCodeField(productNew);
        productNew.setProductskus(skus);
        do {
            BillCodeObj[] BillCodeObjs = this.getBillCodeObjs(productNew);
            Object[] skuCodes = this.iBillCodeComponentService.getBatchBillCodes("pc_product|productskus#code", "pc.product.Product", AppContext.getTenantId().toString(), "", true, "-1", false, BillCodeObjs);
            skus.stream().forEach(arg_0 -> ProductSKUAutoCodeRule.lambda$skuBatchAutoCode$2((String[])skuCodes, productNew, arg_0));
            QuerySchema schema = QuerySchema.create().addSelect("id,code").addCondition((ConditionExpression)QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"code").in(skuCodes)}));
            List repeatSKUs = MetaDaoHelper.query((String)"pc.product.ProductSKU", (QuerySchema)schema);
            if (repeatSKUs != null && repeatSKUs.size() > 0) {
                log.info(InternationalUtils.getMessageWithDefault((String)"UID:P_COREDOC-BE_179F628604080041", (String)"productSKUAutoCodeRule#skuBatchAutoCode==\u300bskuCodes : %s repeatSKUs: %s | times: %s"), new Object[]{skuCodes, repeatSKUs, times});
            }
            skus = productNew.productskus().stream().filter(sku -> repeatSKUs.stream().anyMatch(repeatSKU -> sku.getCode().equals(repeatSKU.get("code").toString()))).collect(Collectors.toList());
            times.getAndIncrement();
        } while (!skus.isEmpty() && times.intValue() < 10);
        if (!skus.isEmpty()) {
            throw new CoreDocBusinessException(CoreDocBusinessErrorEnum.PRODUCT_SKU_CODE_MODE_REPEAT);
        }
    }

    private BillCodeObj[] getBillCodeObjs(Product product) throws Exception {
        List productskus = product.productskus();
        BillCodeObj[] billCodeObjs = new BillCodeObj[productskus.size()];
        for (int index = 0; index < productskus.size(); ++index) {
            ProductSKU productSKU = (ProductSKU)productskus.get(index);
            Product productParam = new Product();
            productParam.put(SkuAutoCodeFieldEnum.code.getFieldName(), product.get(SkuAutoCodeFieldEnum.code.getFieldName()));
            productParam.put(SkuAutoCodeFieldEnum.brand_RandKeywords.getFieldName(), product.get(SkuAutoCodeFieldEnum.brand_RandKeywords.getFieldName()));
            productParam.put(SkuAutoCodeFieldEnum.manageClass_Code.getFieldName(), product.get(SkuAutoCodeFieldEnum.manageClass_Code.getFieldName()));
            productParam.put(SkuAutoCodeFieldEnum.productClass_Code.getFieldName(), product.get(SkuAutoCodeFieldEnum.productClass_Code.getFieldName()));
            productParam.put(SkuAutoCodeFieldEnum.productLine_Code.getFieldName(), product.get(SkuAutoCodeFieldEnum.productLine_Code.getFieldName()));
            productParam.put(SkuAutoCodeFieldEnum.skuAutoCode.getFieldName(), productSKU.get(SkuAutoCodeFieldEnum.skuAutoCode.getFieldName()));
            productParam.put(SkuAutoCodeFieldEnum.specCode.getFieldName(), productSKU.get(SkuAutoCodeFieldEnum.specCode.getFieldName()));
            ArrayList<ProductSKU> skus = new ArrayList<ProductSKU>();
            skus.add(productSKU);
            productParam.setProductskus(skus);
            BillCodeObj[] codeObjs = MainChildBillBuildUtils.buildBillCodeObjs((BizObject)productParam, (String)"productskus", (String)"pc.product.ProductSKU");
            billCodeObjs[index] = codeObjs[0];
        }
        return billCodeObjs;
    }

    private void setSkuAutoCodeField(Product productNew) throws Exception {
        if (null == productNew.getId()) {
            return;
        }
        String frields = "brand.randKeywords as brand_RandKeywords, code as code, manageClass.code as manageClass_Code, productClass.code as productClass_Code, productLine.code as productLine_Code";
        QuerySchema schema = QuerySchema.create().addSelect(frields).addCondition((ConditionExpression)QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"id").eq(productNew.getId())}));
        List products = MetaDaoHelper.query((String)"pc.product.Product", (QuerySchema)schema);
        if (!CollectionUtils.isEmpty((Collection)products)) {
            productNew.putAll((Map)products.get(0));
        }
    }

    private static /* synthetic */ void lambda$skuBatchAutoCode$2(String[] skuCodes, Product productNew, ProductSKU sku) {
        sku.setCode(skuCodes[productNew.productskus().indexOf(sku)]);
    }
}


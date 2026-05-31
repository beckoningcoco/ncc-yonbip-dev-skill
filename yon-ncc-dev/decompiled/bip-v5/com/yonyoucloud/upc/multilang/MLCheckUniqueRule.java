/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.fasterxml.jackson.core.JsonProcessingException
 *  com.yonyou.iuap.apdoc.coredoc.enums.CoreDocBusinessErrorEnum
 *  com.yonyou.iuap.apdoc.coredoc.exceptions.CoreDocBusinessException
 *  com.yonyou.iuap.apdoc.coredoc.utils.MCServiceUntils
 *  com.yonyou.iuap.apdoc.coredoc.utils.UpcJacksonUtils
 *  com.yonyou.iuap.context.InvocationInfoProxy
 *  com.yonyou.iuap.international.MultiLangText
 *  com.yonyou.iuap.mc.docunique.dto.DupDataInfo
 *  com.yonyou.iuap.ucf.common.ml.MultiLangContext
 *  com.yonyou.ucf.mdd.common.model.rule.RuleExecuteResult
 *  com.yonyou.ucf.mdd.ext.bill.dto.BillDataDto
 *  com.yonyou.ucf.mdd.ext.bill.rule.check.CheckUniqueRule
 *  com.yonyou.ucf.mdd.ext.dao.meta.MetaDaoHelper
 *  com.yonyou.ucf.mdd.ext.model.BillContext
 *  com.yonyoucloud.upc.aa.customerapply.CustomerApply
 *  com.yonyoucloud.upc.aa.customerapply.CustomerApplyType
 *  com.yonyoucloud.upc.aa.merchant.EnterpriseNature
 *  com.yonyoucloud.upc.aa.merchant.Merchant
 *  com.yonyoucloud.upc.pc.product.Product
 *  com.yonyoucloud.upc.pc.productapply.ProductApply
 *  com.yonyoucloud.upc.pc.productapply.ProductApplyType
 *  com.yonyoucloud.upc.utils.EntityUtil
 *  org.apache.commons.lang3.ObjectUtils
 *  org.apache.commons.lang3.StringUtils
 *  org.imeta.biz.base.Objectlizer
 *  org.imeta.core.lang.BooleanUtils
 *  org.imeta.core.model.Entity
 *  org.imeta.core.model.Property
 *  org.imeta.core.model.PropertyMap
 *  org.imeta.orm.base.BizObject
 *  org.imeta.orm.base.EntityStatus
 *  org.imeta.orm.base.Json
 *  org.slf4j.Logger
 *  org.slf4j.LoggerFactory
 *  org.springframework.beans.factory.annotation.Autowired
 *  org.springframework.stereotype.Component
 *  org.springframework.util.CollectionUtils
 */
package com.yonyoucloud.upc.multilang;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.yonyou.iuap.apdoc.coredoc.enums.CoreDocBusinessErrorEnum;
import com.yonyou.iuap.apdoc.coredoc.exceptions.CoreDocBusinessException;
import com.yonyou.iuap.apdoc.coredoc.utils.MCServiceUntils;
import com.yonyou.iuap.apdoc.coredoc.utils.UpcJacksonUtils;
import com.yonyou.iuap.context.InvocationInfoProxy;
import com.yonyou.iuap.international.MultiLangText;
import com.yonyou.iuap.mc.docunique.dto.DupDataInfo;
import com.yonyou.iuap.ucf.common.ml.MultiLangContext;
import com.yonyou.ucf.mdd.common.model.rule.RuleExecuteResult;
import com.yonyou.ucf.mdd.ext.bill.dto.BillDataDto;
import com.yonyou.ucf.mdd.ext.bill.rule.check.CheckUniqueRule;
import com.yonyou.ucf.mdd.ext.dao.meta.MetaDaoHelper;
import com.yonyou.ucf.mdd.ext.model.BillContext;
import com.yonyoucloud.upc.aa.customerapply.CustomerApply;
import com.yonyoucloud.upc.aa.customerapply.CustomerApplyType;
import com.yonyoucloud.upc.aa.merchant.EnterpriseNature;
import com.yonyoucloud.upc.aa.merchant.Merchant;
import com.yonyoucloud.upc.pc.product.Product;
import com.yonyoucloud.upc.pc.productapply.ProductApply;
import com.yonyoucloud.upc.pc.productapply.ProductApplyType;
import com.yonyoucloud.upc.service.customerapply.CustomerApplyCheckService;
import com.yonyoucloud.upc.service.productapply.ProductApplyCheckService;
import com.yonyoucloud.upc.utils.EntityUtil;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;
import org.apache.commons.lang3.ObjectUtils;
import org.apache.commons.lang3.StringUtils;
import org.imeta.biz.base.Objectlizer;
import org.imeta.core.lang.BooleanUtils;
import org.imeta.core.model.Entity;
import org.imeta.core.model.Property;
import org.imeta.core.model.PropertyMap;
import org.imeta.orm.base.BizObject;
import org.imeta.orm.base.EntityStatus;
import org.imeta.orm.base.Json;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.util.CollectionUtils;

@Component(value="mLCheckUniqueRule")
public class MLCheckUniqueRule
extends CheckUniqueRule {
    private static final Logger log = LoggerFactory.getLogger(MLCheckUniqueRule.class);
    @Autowired
    ProductApplyCheckService productApplyCheckService;
    @Autowired
    CustomerApplyCheckService customerApplyCheckService;
    @Autowired
    MCServiceUntils mcServiceUntils;

    public RuleExecuteResult execute(BillContext billContext, Map<String, Object> paramMap) throws Exception {
        RuleExecuteResult ruleResult = new RuleExecuteResult();
        List bills = this.getBills(billContext, paramMap);
        if (null == bills || bills.size() == 0) {
            return new RuleExecuteResult();
        }
        if (billContext.getBillnum() != null && "pc_productsku_add".equals(billContext.getBillnum())) {
            return new RuleExecuteResult();
        }
        Entity entity = MetaDaoHelper.getEntity((String)billContext.getFullname());
        bills.forEach(bill -> {
            try {
                this.handleDMLMeta(entity, (BizObject)bill, true);
                this.handleProductData(billContext.getBillnum(), (BizObject)bill);
            }
            catch (JsonProcessingException e) {
                throw new RuntimeException(e);
            }
        });
        ruleResult = super.execute(billContext, paramMap);
        String action = billContext.getAction();
        if ("pc.productapply.ProductApply".equals(billContext.getFullname())) {
            this.productApplyUniqueCheck(bills, action);
        }
        if ("pc.product.Product".equals(billContext.getFullname())) {
            for (BizObject bizObject : bills) {
                this.checkDocUnique((Product)bizObject);
            }
        }
        if ("aa.customerapply.CustomerApply".equals(billContext.getFullname()) || "aa.merchant.Merchant".equals(billContext.getFullname())) {
            this.customerApplyUniqueCheck(bills, billContext.getBillnum(), action);
        }
        return ruleResult;
    }

    private void handleProductData(String billnum, BizObject bill) {
        Product product;
        if ("pc_productimport".equals(billnum) && ObjectUtils.isNotEmpty((Object)(product = (Product)bill)) && ObjectUtils.isNotEmpty((Object)product.detail()) && product.detail().getEntityStatus() == null) {
            product.detail().setEntityStatus(product.getEntityStatus());
        }
    }

    private void productApplyUniqueCheck(List<BizObject> bills, String action) throws Exception {
        for (BizObject bizObject : bills) {
            ProductApply productApply = (ProductApply)bizObject;
            this.uniqueCompareWithProduct(productApply, action);
        }
    }

    private void customerApplyUniqueCheck(List<BizObject> bills, String billNum, String action) throws Exception {
        List uniqueConstraints = EntityUtil.getUniqueConstraints((String)"aa.merchant.Merchant");
        if (!CollectionUtils.isEmpty((Collection)uniqueConstraints)) {
            for (BizObject bizObject : bills) {
                if ("aa_customerapply".equals(billNum)) {
                    CustomerApply customerApply = (CustomerApply)bizObject;
                    this.uniqueCheckWithMerchant(customerApply, action);
                    Merchant merchant = (Merchant)Objectlizer.decodeObj((Json)new Json(customerApply.getCustomerData()), (String)"aa.merchant.Merchant");
                    this.customerApplyCheckService.uniqueCheckWithCustomerApply((BizObject)merchant, customerApply);
                    continue;
                }
                this.customerApplyCheckService.uniqueCheckWithCustomerApply(bizObject, null);
            }
        }
    }

    private void uniqueCompareWithProduct(ProductApply productApply, String action) throws Exception {
        if (StringUtils.isBlank((CharSequence)productApply.getProductData()) || ProductApplyType.ADD_RANGE.equals((Object)productApply.getApplyType())) {
            return;
        }
        BillContext productBillContext = new BillContext("pc_product", "pc.product.Product");
        productBillContext.setAction(action);
        Product product = (Product)Objectlizer.decodeObj((Json)new Json(productApply.getProductData()), (String)"pc.product.Product");
        this.checkDocUnique(product);
        List uniqueConstraints = EntityUtil.getUniqueConstraints((String)"pc.product.Product");
        if (!CollectionUtils.isEmpty((Collection)uniqueConstraints)) {
            if (ProductApplyType.add.equals((Object)productApply.getApplyType())) {
                product.setEntityStatus(EntityStatus.Insert);
            } else {
                product.setEntityStatus(EntityStatus.Update);
            }
            BillDataDto dto = new BillDataDto();
            dto.setBillnum("pc_product");
            dto.setData((Object)product);
            dto.setAction(action);
            HashMap<String, BillDataDto> param = new HashMap<String, BillDataDto>();
            param.put("param", dto);
            super.execute(productBillContext, param);
        }
    }

    private void checkDocUnique(Product product) {
        Set results;
        Map<String, Object> billMap = product.entrySet().stream().filter(map -> null != map.getValue()).collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue));
        Map uniqueViolationResults = this.mcServiceUntils.checkUniqueViolationByListMap("pc.product.Product", Collections.singletonList(billMap));
        if (!(null == uniqueViolationResults || uniqueViolationResults.isEmpty() || ((Set)uniqueViolationResults.get(billMap)).isEmpty() || (results = (Set)uniqueViolationResults.get(billMap)) == null || results.isEmpty())) {
            StringBuilder messageBuilder = new StringBuilder();
            results.forEach(result -> messageBuilder.append(result.getDocUniqueRule().getName()).append("(").append(((Set)result.getDuplicateIdCodes()).stream().map(DupDataInfo::getCode).collect(Collectors.toList())).append(")"));
            String message = messageBuilder.toString();
            if (message.length() > 0) {
                throw new CoreDocBusinessException(CoreDocBusinessErrorEnum.PRODUCT_UNIQUE_CHECK_ERROR, new Object[]{product.getCode(), message});
            }
        }
    }

    private void uniqueCheckWithMerchant(CustomerApply customerApply, String action) throws Exception {
        if (StringUtils.isBlank((CharSequence)customerApply.getCustomerData())) {
            return;
        }
        BillContext billContext = new BillContext("aa_merchant", "aa.merchant.Merchant");
        billContext.setAction(action);
        Merchant merchant = (Merchant)Objectlizer.decodeObj((Json)new Json(customerApply.getCustomerData()), (String)"aa.merchant.Merchant");
        if (merchant.getEnterpriseNature() != EnterpriseNature.personal) {
            this.mcServiceUntils.validateDocUniquenessAndThrow((BizObject)merchant, "aa.merchant.Merchant");
        }
        if (CustomerApplyType.add.equals((Object)customerApply.getApplyType())) {
            merchant.setEntityStatus(EntityStatus.Insert);
        } else {
            merchant.setEntityStatus(EntityStatus.Update);
        }
        BillDataDto dto = new BillDataDto();
        dto.setBillnum("aa_merchant");
        dto.setData((Object)merchant);
        dto.setAction(action);
        HashMap<String, BillDataDto> param = new HashMap<String, BillDataDto>();
        param.put("param", dto);
        super.execute(billContext, param);
    }

    public boolean isMultLangAttr(Property attr) {
        if (attr == null) {
            return false;
        }
        return attr.isMultiLangAttr();
    }

    private MultiLangText trans2MultiLangText(Object obj, EntityStatus status) {
        BizObject multiLangMap;
        HashMap<String, String> textMap = new HashMap<String, String>();
        String locale = InvocationInfoProxy.getLocale();
        String defaultLocaleCode = MultiLangContext.getInstance().getDefaultLocaleCode();
        if (obj instanceof String) {
            textMap.put("zh_CN", (String)obj);
            if (EntityStatus.Insert.equals((Object)status)) {
                if (defaultLocaleCode != null && defaultLocaleCode.length() > 0) {
                    textMap.put(defaultLocaleCode, (String)obj);
                }
                if (locale != null && locale.length() > 0) {
                    textMap.put(locale, (String)obj);
                }
            }
        } else if (obj != null && obj instanceof BizObject && EntityStatus.Insert.equals((Object)status) && !(multiLangMap = (BizObject)obj).containsKey((Object)defaultLocaleCode) && multiLangMap.get(locale) != null) {
            multiLangMap.put(defaultLocaleCode, multiLangMap.get(locale));
        }
        MultiLangText multiLangText = new MultiLangText(textMap);
        return multiLangText;
    }

    private void handleDMLMeta(Entity entity, BizObject data, boolean isRoot) throws JsonProcessingException {
        PropertyMap attrMap = entity.attrMap();
        LinkedList<Property> multLangAttrs = new LinkedList<Property>();
        ArrayList<String> compositionRoles = null;
        for (String key : data.persistenceSet()) {
            Property attr = attrMap.get(key);
            if (attr == null) continue;
            if (BooleanUtils.b((Object)attr.isCompositionAttribute()) && BooleanUtils.b((Object)attr.isRoleA())) {
                if (compositionRoles == null) {
                    compositionRoles = new ArrayList<String>();
                }
                compositionRoles.add(key);
                continue;
            }
            boolean multlang = this.isMultLangAttr(attr);
            if (!multlang) continue;
            multLangAttrs.add(attr);
        }
        if (multLangAttrs.size() > 0) {
            for (Property attr : multLangAttrs) {
                Object value = data.get(attr.name());
                if (value == null) continue;
                MultiLangText multiLangText = this.trans2MultiLangText(value, data.getEntityStatus());
                String name = attr.name();
                Map textMap = multiLangText.toMap();
                if (textMap.isEmpty() && data.containsKey((Object)(attr.name() + "multiLangText"))) {
                    multiLangText = (MultiLangText)UpcJacksonUtils.OBJECT_MAPPER.readValue(UpcJacksonUtils.OBJECT_MAPPER.writeValueAsString(data.get(attr.name() + "multiLangText")), MultiLangText.class);
                }
                if (textMap.isEmpty()) continue;
                String columnName = attr.columnName();
                data.set(attr.name(), (Object)new BizObject(new HashMap(multiLangText.toMap())));
                data.put(attr.name() + "multiLangText", (Object)multiLangText);
            }
        }
    }
}


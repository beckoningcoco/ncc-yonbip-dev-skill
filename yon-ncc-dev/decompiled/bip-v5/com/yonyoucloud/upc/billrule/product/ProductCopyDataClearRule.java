/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.yonyou.ucf.mdd.common.model.rule.RuleExecuteResult
 *  com.yonyou.ucf.mdd.common.utils.json.GsonHelper
 *  com.yonyou.ucf.mdd.ext.bill.rule.base.AbstractCommonRule
 *  com.yonyou.ucf.mdd.ext.dao.meta.biz.ParallelTableWalker
 *  com.yonyou.ucf.mdd.ext.model.BillContext
 *  org.apache.commons.lang3.ObjectUtils
 *  org.imeta.biz.walker.ChainWalker
 *  org.imeta.biz.walker.DataCleanWalker
 *  org.imeta.biz.walker.ObjectFullWalker
 *  org.imeta.core.base.MetaRepository
 *  org.imeta.core.model.BaseElement
 *  org.imeta.core.model.Entity
 *  org.imeta.core.model.Property
 *  org.imeta.orm.base.BizObject
 *  org.springframework.beans.factory.annotation.Autowired
 *  org.springframework.stereotype.Component
 *  org.springframework.util.CollectionUtils
 */
package com.yonyoucloud.upc.billrule.product;

import com.yonyou.ucf.mdd.common.model.rule.RuleExecuteResult;
import com.yonyou.ucf.mdd.common.utils.json.GsonHelper;
import com.yonyou.ucf.mdd.ext.bill.rule.base.AbstractCommonRule;
import com.yonyou.ucf.mdd.ext.dao.meta.biz.ParallelTableWalker;
import com.yonyou.ucf.mdd.ext.model.BillContext;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import org.apache.commons.lang3.ObjectUtils;
import org.imeta.biz.walker.ChainWalker;
import org.imeta.biz.walker.DataCleanWalker;
import org.imeta.biz.walker.ObjectFullWalker;
import org.imeta.core.base.MetaRepository;
import org.imeta.core.model.BaseElement;
import org.imeta.core.model.Entity;
import org.imeta.core.model.Property;
import org.imeta.orm.base.BizObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.util.CollectionUtils;

@Component(value="productCopyDataClearRule")
public class ProductCopyDataClearRule
extends AbstractCommonRule {
    @Autowired
    MetaRepository metaRepository;

    public RuleExecuteResult execute(BillContext billContext, Map<String, Object> paramMap) throws Exception {
        String billnum = billContext.getBillnum();
        List bills = this.getBills(billContext, paramMap);
        BizObject bill = null;
        if (!CollectionUtils.isEmpty((Collection)bills)) {
            bill = (BizObject)bills.get(0);
            if ("pc_product".equals(billnum) || "pc_productdetail".equals(billnum)) {
                this.copyProductclearData(bill);
            } else if ("pc_productapply".equals(billnum)) {
                this.copyProductApplyclearData(bill);
            }
        }
        if (null != bill) {
            DataCleanWalker dataCleanWalker = new DataCleanWalker();
            dataCleanWalker.setNext((ChainWalker)new ParallelTableWalker());
            ObjectFullWalker.walk((ChainWalker)dataCleanWalker, (BizObject)bill, (String)billContext.getFullname());
            String json = GsonHelper.ToJSon4RestYYYYMMDDHHMMSS((Object)bill);
            this.putParam(paramMap, "return", json);
        }
        return new RuleExecuteResult();
    }

    private void copyProductApplyclearData(BizObject bill) {
    }

    private void copyProductclearData(BizObject bill) throws Exception {
        bill.put("isCreator", null);
        bill.put("isApplied", null);
        bill.put("productApplyRangeId", null);
        HashMap<String, Object> map = new HashMap<String, Object>();
        map.put("id", null);
        map.put("pubts", null);
        if (bill.containsKey((Object)"productOrgs") && bill.get("productOrgs") != null) {
            List productOrgs = (List)bill.get("productOrgs");
            for (Map org : productOrgs) {
                org.clear();
                org.putAll(map);
            }
        }
        if (bill.containsKey((Object)"productCustomers") && bill.get("productCustomers") != null) {
            List productCustomers = (List)bill.get("productCustomers");
            for (Map cust : productCustomers) {
                cust.clear();
                cust.putAll(map);
            }
        }
        if (bill.containsKey((Object)"productShops") && bill.get("productShops") != null) {
            List productShops = (List)bill.get("productShops");
            for (Map shop : productShops) {
                shop.clear();
                shop.putAll(map);
            }
        }
        if (bill.containsKey((Object)"productApplyRange")) {
            bill.remove("productApplyRange");
        }
        if (bill.containsKey((Object)"productskus") && null != bill.get("productskus")) {
            List skus = (List)bill.get("productskus");
            for (Map sku : skus) {
                sku.remove("id");
                sku.remove("pubts");
                sku.remove("code");
                sku.remove("productId");
            }
        }
        List<String> productPropCharacterCodes = this.getFileTypeCharacterCode(this.getCharacterAttribute("pc.product.ProductPropCharacterDefine"));
        HashMap productPropCharacter = new HashMap();
        productPropCharacterCodes.forEach(v -> productPropCharacter.put(String.valueOf(v), null));
        if (ObjectUtils.isNotEmpty(productPropCharacter)) {
            bill.put("productPropCharacterDefine", productPropCharacter);
        }
        List<String> productDetailCharacterCodes = this.getFileTypeCharacterCode(this.getCharacterAttribute("pc.product.ProductDetailCharacterDef"));
        HashMap productDetailCharacter = new HashMap();
        productDetailCharacterCodes.forEach(v -> productDetailCharacter.put(String.valueOf(v), null));
        if (ObjectUtils.isNotEmpty(productPropCharacter)) {
            bill.put("detail!productExtendCharacterDef", productDetailCharacter);
        }
    }

    private List<String> getFileTypeCharacterCode(List<Property> attributes) {
        List<String> characterCodes = new ArrayList<String>();
        if (ObjectUtils.isNotEmpty(attributes)) {
            characterCodes = attributes.stream().filter(v -> "attachment".equals(v.getBizType()) || "image".equals(v.getBizType())).map(BaseElement::name).collect(Collectors.toList());
        }
        return characterCodes;
    }

    public List<Property> getCharacterAttribute(String uri) throws Exception {
        Entity propEntity;
        List<Object> attributes = new ArrayList<Property>();
        if (ObjectUtils.isNotEmpty((Object)uri) && (propEntity = this.metaRepository.entity(uri)) != null && ObjectUtils.isNotEmpty((Object)propEntity.attributes())) {
            attributes = propEntity.attributes().stream().filter(Property::getIsCharacter).collect(Collectors.toList());
        }
        return attributes;
    }
}


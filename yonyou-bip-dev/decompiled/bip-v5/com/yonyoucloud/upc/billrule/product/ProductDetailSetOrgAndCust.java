/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.yonyou.ucf.mdd.common.model.rule.RuleExecuteResult
 *  com.yonyou.ucf.mdd.ext.base.user.UserType
 *  com.yonyou.ucf.mdd.ext.bill.dto.BillDataDto
 *  com.yonyou.ucf.mdd.ext.bill.rule.base.AbstractCommonRule
 *  com.yonyou.ucf.mdd.ext.core.AppContext
 *  com.yonyou.ucf.mdd.ext.model.BillContext
 *  org.imeta.orm.base.EntityStatus
 *  org.springframework.beans.factory.annotation.Autowired
 *  org.springframework.stereotype.Component
 *  org.springframework.util.CollectionUtils
 */
package com.yonyoucloud.upc.billrule.product;

import com.yonyou.ucf.mdd.common.model.rule.RuleExecuteResult;
import com.yonyou.ucf.mdd.ext.base.user.UserType;
import com.yonyou.ucf.mdd.ext.bill.dto.BillDataDto;
import com.yonyou.ucf.mdd.ext.bill.rule.base.AbstractCommonRule;
import com.yonyou.ucf.mdd.ext.core.AppContext;
import com.yonyou.ucf.mdd.ext.model.BillContext;
import com.yonyoucloud.iuap.upc.api.service.IUPCControlRuleService;
import com.yonyoucloud.iuap.upc.api.service.IUPCProductQueryService;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import org.imeta.orm.base.EntityStatus;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.util.CollectionUtils;

@Component(value="productDetailSetOrgAndCust")
public class ProductDetailSetOrgAndCust
extends AbstractCommonRule {
    @Autowired
    private IUPCProductQueryService upcProductQueryService;
    @Autowired
    private IUPCControlRuleService upcControlRuleService;

    public RuleExecuteResult execute(BillContext billContext, Map<String, Object> paramMap) throws Exception {
        BillDataDto billDataDto = (BillDataDto)this.getParam(paramMap);
        if (null == billContext || billDataDto == null) {
            return new RuleExecuteResult();
        }
        if ("detail".equals(billContext.getAction())) {
            UserType userType;
            Map product = (Map)paramMap.get("return");
            if (billContext.getContext().get("isCreator").equals(false)) {
                if (!product.containsKey("detail!id") || product.get("detail!id") == null) {
                    product.put("detail!_status", EntityStatus.Insert);
                    product.put("time!_status", EntityStatus.Insert);
                    product.put("_status", EntityStatus.Insert);
                }
                if (product.containsKey("productParams") && product.get("productParams") != null) {
                    List params = (List)product.get("productParams");
                    for (Map param : params) {
                        if (param.containsKey("id")) continue;
                        param.put("_status", EntityStatus.Insert);
                    }
                }
                if (product.containsKey("productskus") && product.get("productskus") != null) {
                    List skus = (List)product.get("productskus");
                    for (Map sku : skus) {
                        if (!sku.containsKey("productSKUDetail!id") || sku.get("productSKUDetail!id") == null) {
                            sku.put("productSKUDetail!_status", EntityStatus.Insert);
                            sku.put("_status", EntityStatus.Insert);
                        }
                        if (!sku.containsKey("skuOrderProperties") || sku.get("skuOrderProperties") == null) continue;
                        List props = (List)sku.get("skuOrderProperties");
                        for (Map prop : props) {
                            if (prop.containsKey("id")) continue;
                            prop.put("_status", EntityStatus.Insert);
                        }
                    }
                }
            }
            if (product.containsKey("productVideos") && product.get("productVideos") != null) {
                List videos = (List)product.get("productVideos");
                if (CollectionUtils.isEmpty(videos = videos.stream().filter(v -> v.get("type") != null && v.get("type").toString().contains("video/")).collect(Collectors.toList()))) {
                    product.remove("productVideos");
                } else {
                    product.put("productVideos", videos);
                }
            }
            if (product.containsKey("productAttachments") && product.get("productAttachments") != null) {
                List attachments = (List)product.get("productAttachments");
                if (CollectionUtils.isEmpty(attachments = attachments.stream().filter(v -> v.get("type") != null && !v.get("type").toString().contains("video/")).collect(Collectors.toList()))) {
                    product.remove("productAttachments");
                } else {
                    product.put("productAttachments", attachments);
                }
            }
            if (product.containsKey("productShops") && product.get("productShops") != null && (userType = AppContext.getCurrentUser().getUserType()) != UserType.ShopAdminUser && userType != UserType.ShopUser) {
                product.remove("productShops");
            }
        }
        return new RuleExecuteResult();
    }
}


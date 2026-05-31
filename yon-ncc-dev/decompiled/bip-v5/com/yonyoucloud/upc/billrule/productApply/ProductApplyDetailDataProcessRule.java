/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.alibaba.fastjson.JSON
 *  com.alibaba.fastjson.serializer.ObjectSerializer
 *  com.alibaba.fastjson.serializer.SerializeConfig
 *  com.alibaba.fastjson.serializer.SerializerFeature
 *  com.alibaba.fastjson.serializer.SimpleDateFormatSerializer
 *  com.alibaba.fastjson.serializer.ToStringSerializer
 *  com.yonyou.ucf.mdd.common.model.rule.RuleExecuteResult
 *  com.yonyou.ucf.mdd.ext.bill.dto.BillDataDto
 *  com.yonyou.ucf.mdd.ext.bill.rule.base.AbstractCommonRule
 *  com.yonyou.ucf.mdd.ext.model.BillContext
 *  com.yonyoucloud.upc.pc.product.Product
 *  com.yonyoucloud.upc.pc.productapply.ProductApplyType
 *  org.imeta.biz.base.Objectlizer
 *  org.imeta.orm.base.Json
 *  org.springframework.beans.factory.annotation.Autowired
 *  org.springframework.stereotype.Component
 */
package com.yonyoucloud.upc.billrule.productApply;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.serializer.ObjectSerializer;
import com.alibaba.fastjson.serializer.SerializeConfig;
import com.alibaba.fastjson.serializer.SerializerFeature;
import com.alibaba.fastjson.serializer.SimpleDateFormatSerializer;
import com.alibaba.fastjson.serializer.ToStringSerializer;
import com.yonyou.ucf.mdd.common.model.rule.RuleExecuteResult;
import com.yonyou.ucf.mdd.ext.bill.dto.BillDataDto;
import com.yonyou.ucf.mdd.ext.bill.rule.base.AbstractCommonRule;
import com.yonyou.ucf.mdd.ext.model.BillContext;
import com.yonyoucloud.upc.pc.product.Product;
import com.yonyoucloud.upc.pc.productapply.ProductApplyType;
import com.yonyoucloud.upc.service.api.ProductSaveServiceImpl;
import java.util.Date;
import java.util.Map;
import org.imeta.biz.base.Objectlizer;
import org.imeta.orm.base.Json;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component(value="productApplyDetailDataProcessRule")
public class ProductApplyDetailDataProcessRule
extends AbstractCommonRule {
    @Autowired
    ProductSaveServiceImpl productSaveService;
    String PROPS_ACTION = "propsAction";

    public RuleExecuteResult execute(BillContext billContext, Map<String, Object> paramMap) throws Exception {
        BillDataDto billDataDto = (BillDataDto)this.getParam(paramMap);
        if (null == billContext || billDataDto == null) {
            return new RuleExecuteResult();
        }
        if ("detail".equals(billContext.getAction())) {
            Map productApply = (Map)paramMap.get("return");
            if (String.valueOf(ProductApplyType.ADD_RANGE.getValue()).equals(productApply.get("applyType"))) {
                return new RuleExecuteResult();
            }
            Product productData = (Product)JSON.parseObject((String)productApply.get("productData").toString(), Product.class);
            Product product = (Product)Objectlizer.decodeObj((Json)new Json(productApply.get("productData").toString()), (String)"pc.product.Product");
            if (billDataDto.getMapCondition() != null && "copy".equals(billDataDto.getMapCondition().get(this.PROPS_ACTION))) {
                this.productSaveService.setMaterialClassNameAndCode(product);
                this.productSaveService.dealProductDataDisplay(product);
                if (String.valueOf(ProductApplyType.add.getValue()).equals(productApply.get("applyType"))) {
                    Map productExtendCharacterDef;
                    if (product.get("productCharacterDef") != null) {
                        Map productCharacterDef = (Map)product.get("productCharacterDef");
                        productCharacterDef.remove("id");
                    }
                    if (product.detail() != null && product.detail().get("productExtendCharacterDef") != null) {
                        productExtendCharacterDef = (Map)product.detail().get("productExtendCharacterDef");
                        productExtendCharacterDef.remove("id");
                    }
                    if (productData.get("detail!productExtendCharacterDef") != null) {
                        productExtendCharacterDef = (Map)productData.get("detail!productExtendCharacterDef");
                        productExtendCharacterDef.remove("id");
                    }
                }
            }
            productData.putAll((Map)product);
            productData.remove("_status");
            SerializeConfig serializeConfig = new SerializeConfig();
            serializeConfig.put(Long.class, (ObjectSerializer)ToStringSerializer.instance);
            serializeConfig.put(Long.TYPE, (ObjectSerializer)ToStringSerializer.instance);
            serializeConfig.put(Date.class, (ObjectSerializer)new SimpleDateFormatSerializer("yyyy-MM-dd HH:mm:ss"));
            productApply.put("productData", JSON.toJSONString((Object)productData, (SerializeConfig)serializeConfig, (SerializerFeature[])new SerializerFeature[]{SerializerFeature.WriteMapNullValue}));
        }
        return new RuleExecuteResult();
    }
}


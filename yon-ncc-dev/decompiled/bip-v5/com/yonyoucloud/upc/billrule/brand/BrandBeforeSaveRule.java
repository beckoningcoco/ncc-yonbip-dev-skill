/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.yonyou.iuap.apdoc.coredoc.enums.CoreDocBusinessErrorEnum
 *  com.yonyou.iuap.apdoc.coredoc.exceptions.CoreDocBusinessException
 *  com.yonyou.iuap.fileservice.sdk.module.CooperationFileService
 *  com.yonyou.ucf.mdd.common.model.rule.RuleExecuteResult
 *  com.yonyou.ucf.mdd.ext.bill.rule.base.AbstractCommonRule
 *  com.yonyou.ucf.mdd.ext.dao.meta.MetaDaoHelper
 *  com.yonyou.ucf.mdd.ext.model.BillContext
 *  com.yonyoucloud.upc.pc.brand.Brand
 *  com.yonyoucloud.upc.pc.brand.BrandDefine
 *  com.yonyoucloud.upc.pc.brand.ProductTplBrand
 *  org.apache.commons.lang3.StringUtils
 *  org.imeta.orm.base.EntityStatus
 *  org.imeta.orm.schema.ConditionExpression
 *  org.imeta.orm.schema.QueryCondition
 *  org.imeta.orm.schema.QueryConditionGroup
 *  org.imeta.orm.schema.QuerySchema
 *  org.imeta.spring.support.id.IdManager
 *  org.springframework.beans.factory.annotation.Autowired
 *  org.springframework.stereotype.Component
 *  org.springframework.util.CollectionUtils
 */
package com.yonyoucloud.upc.billrule.brand;

import com.yonyou.iuap.apdoc.coredoc.enums.CoreDocBusinessErrorEnum;
import com.yonyou.iuap.apdoc.coredoc.exceptions.CoreDocBusinessException;
import com.yonyou.iuap.fileservice.sdk.module.CooperationFileService;
import com.yonyou.ucf.mdd.common.model.rule.RuleExecuteResult;
import com.yonyou.ucf.mdd.ext.bill.rule.base.AbstractCommonRule;
import com.yonyou.ucf.mdd.ext.dao.meta.MetaDaoHelper;
import com.yonyou.ucf.mdd.ext.model.BillContext;
import com.yonyoucloud.upc.pc.brand.Brand;
import com.yonyoucloud.upc.pc.brand.BrandDefine;
import com.yonyoucloud.upc.pc.brand.ProductTplBrand;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import org.apache.commons.lang3.StringUtils;
import org.imeta.orm.base.EntityStatus;
import org.imeta.orm.schema.ConditionExpression;
import org.imeta.orm.schema.QueryCondition;
import org.imeta.orm.schema.QueryConditionGroup;
import org.imeta.orm.schema.QuerySchema;
import org.imeta.spring.support.id.IdManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.util.CollectionUtils;

@Component(value="brandBeforeSaveRule")
public class BrandBeforeSaveRule
extends AbstractCommonRule {
    @Autowired
    CooperationFileService cooperationFileService;

    public RuleExecuteResult execute(BillContext billContext, Map<String, Object> map) throws Exception {
        List brands = this.getBills(billContext, map);
        Brand brand = (Brand)brands.get(0);
        if (brand.containsKey((Object)"_fromApi") && ((Boolean)brand.get("_fromApi")).booleanValue()) {
            this.dealApiData(brand);
        }
        if (StringUtils.isNotBlank((CharSequence)brand.getCode())) {
            QuerySchema schema;
            List list;
            QueryConditionGroup conditionGroup = QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"code").eq((Object)brand.getCode())});
            if (brand.getId() != null) {
                conditionGroup.addCondition((ConditionExpression)QueryCondition.name((String)"id").not_eq(brand.getId()));
            }
            if (!CollectionUtils.isEmpty((Collection)(list = MetaDaoHelper.query((String)"pc.brand.Brand", (QuerySchema)(schema = QuerySchema.create().addSelect("*").addCondition((ConditionExpression)conditionGroup)))))) {
                throw new CoreDocBusinessException(CoreDocBusinessErrorEnum.COMMON_CODE_ALREADY_EXISTS, new Object[]{brand.getCode()});
            }
        }
        return null;
    }

    private void dealApiData(Brand brand) throws Exception {
        block11: {
            List productTplBrands;
            block10: {
                QuerySchema schema;
                List queryRes;
                long adImageNum;
                long logoNum;
                if (brand.getEntityStatus() == EntityStatus.Update && brand.containsKey((Object)"defines")) {
                    BrandDefine defines = brand.defines();
                    QuerySchema schema2 = QuerySchema.create().addSelect("id").appendQueryCondition(new ConditionExpression[]{QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"id").eq(brand.getId())})});
                    Map define = MetaDaoHelper.queryOne((String)"pc.brand.BrandDefine", (QuerySchema)schema2);
                    if (define != null && define.get("id") != null) {
                        defines.setId(define.get("id"));
                        defines.setEntityStatus(EntityStatus.Update);
                    } else {
                        defines.setId(brand.getId());
                        defines.setEntityStatus(EntityStatus.Insert);
                    }
                }
                if (brand.get("brandLogoBusinessId") != null && (logoNum = this.cooperationFileService.countFiles("iuap-apdoc-material", brand.get("brandLogoBusinessId").toString())) > 1L) {
                    throw new CoreDocBusinessException(CoreDocBusinessErrorEnum.BRAND_LOGO_COUNT_MORE_THAN_1);
                }
                if (brand.get("adImageBusinessId") != null && (adImageNum = this.cooperationFileService.countFiles("iuap-apdoc-material", brand.get("adImageBusinessId").toString())) > 1L) {
                    throw new CoreDocBusinessException(CoreDocBusinessErrorEnum.BRAND_ADVERTISEMEN_COUNT_MORE_THAN_1);
                }
                if (brand.getEntityStatus() != EntityStatus.Update || !brand.containsKey((Object)"productTplBrands")) break block10;
                productTplBrands = brand.productTplBrands();
                HashSet<Long> brandNameSet = new HashSet<Long>();
                if (productTplBrands != null && productTplBrands.size() > 0) {
                    for (ProductTplBrand ptb : productTplBrands) {
                        QuerySchema schema3;
                        Map productTplBrand;
                        brandNameSet.add(ptb.getProductTplTemp());
                        if (ptb.getEntityStatus() != EntityStatus.Insert || (productTplBrand = MetaDaoHelper.queryOne((String)"pc.brand.ProductTplBrand", (QuerySchema)(schema3 = QuerySchema.create().addSelect("*").appendQueryCondition(new ConditionExpression[]{QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"brand").eq((Object)ptb.getBrand()), QueryCondition.name((String)"productTplTemp").eq((Object)ptb.getProductTplTemp())})})))) == null) continue;
                        ptb.setEntityStatus(EntityStatus.Update);
                        ptb.setId(productTplBrand.get("id"));
                    }
                }
                if ((queryRes = MetaDaoHelper.query((String)"pc.brand.ProductTplBrand", (QuerySchema)(schema = QuerySchema.create().addSelect("id,brand,productTplTemp,productTplTemp.name as name").appendQueryCondition(new ConditionExpression[]{QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"brand").eq(brand.getId())})})))) == null || queryRes.size() <= 0) break block11;
                for (Map map : queryRes) {
                    if (brandNameSet.contains(map.get("productTplTemp"))) continue;
                    ProductTplBrand productTplBrand = new ProductTplBrand();
                    productTplBrand.setId(map.get("id"));
                    productTplBrand.setBrand(Long.valueOf(Long.parseLong(map.get("brand").toString())));
                    productTplBrand.setProductTplTemp(Long.valueOf(Long.parseLong(map.get("productTplTemp").toString())));
                    productTplBrand.setEntityStatus(EntityStatus.Delete);
                    brand.productTplBrands().add(productTplBrand);
                }
                break block11;
            }
            if (brand.getEntityStatus() == EntityStatus.Insert && !CollectionUtils.isEmpty((Collection)(productTplBrands = brand.productTplBrands()))) {
                for (ProductTplBrand ptb : productTplBrands) {
                    if (ptb.getEntityStatus() != null || ptb.getId() != null) continue;
                    ptb.setId((Object)IdManager.getInstance().nextId());
                    ptb.setEntityStatus(EntityStatus.Insert);
                }
            }
        }
    }
}


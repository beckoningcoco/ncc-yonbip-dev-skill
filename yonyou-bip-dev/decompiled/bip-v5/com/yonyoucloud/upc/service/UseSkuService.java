/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.yonyou.iuap.apdoc.coredoc.enums.CoreExtrateBusinessErrorEnum
 *  com.yonyou.iuap.apdoc.coredoc.exceptions.CoreDocBusinessException
 *  com.yonyou.ucf.mdd.ext.core.AppContext
 *  com.yonyou.ucf.mdd.ext.dao.sql.SqlHelper
 *  com.yonyoucloud.upc.pc.product.Product
 *  com.yonyoucloud.upc.pc.product.ProductDetail
 *  com.yonyoucloud.upc.service.utils.PubOptionDataQueryUtil
 *  org.apache.commons.lang3.StringUtils
 *  org.imeta.orm.base.EntityStatus
 *  org.imeta.orm.schema.ConditionExpression
 *  org.imeta.orm.schema.QueryCondition
 *  org.imeta.orm.schema.QueryConditionGroup
 *  org.imeta.orm.schema.QuerySchema
 *  org.springframework.beans.factory.annotation.Autowired
 *  org.springframework.stereotype.Service
 *  org.springframework.util.CollectionUtils
 */
package com.yonyoucloud.upc.service;

import com.yonyou.iuap.apdoc.coredoc.enums.CoreExtrateBusinessErrorEnum;
import com.yonyou.iuap.apdoc.coredoc.exceptions.CoreDocBusinessException;
import com.yonyou.ucf.mdd.ext.core.AppContext;
import com.yonyou.ucf.mdd.ext.dao.sql.SqlHelper;
import com.yonyoucloud.upc.datarule.ProductTplService;
import com.yonyoucloud.upc.pc.product.Product;
import com.yonyoucloud.upc.pc.product.ProductDetail;
import com.yonyoucloud.upc.service.ProductSkuService;
import com.yonyoucloud.upc.service.utils.PubOptionDataQueryUtil;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.apache.commons.lang3.StringUtils;
import org.imeta.orm.base.EntityStatus;
import org.imeta.orm.schema.ConditionExpression;
import org.imeta.orm.schema.QueryCondition;
import org.imeta.orm.schema.QueryConditionGroup;
import org.imeta.orm.schema.QuerySchema;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;

@Service
public class UseSkuService {
    @Autowired
    ProductSkuService productSkuService;
    @Autowired
    ProductTplService productTplService;
    @Autowired
    PubOptionDataQueryUtil pubOptionDataQueryUtil;

    public void setDefaultForApi(Product product) throws Exception {
        if (product.getEntityStatus() == EntityStatus.Insert) {
            if (null == product.getUseSku()) {
                this.setUseSku(product);
                product.setHasSpecs(Boolean.valueOf(false));
            }
        } else if (product.getEntityStatus() == EntityStatus.Update && null == product.getUseSku()) {
            QueryConditionGroup queryConditionGroup = QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"id").eq(product.getId())});
            QuerySchema schema = QuerySchema.create().addSelect("useSku").addCondition((ConditionExpression)queryConditionGroup);
            List products = this.productSkuService.query("pc.product.Product", schema);
            if (!CollectionUtils.isEmpty((Collection)products)) {
                Integer useSku = ((Product)products.get(0)).getUseSku();
                if (null == useSku) {
                    this.setUseSku(product);
                } else {
                    product.setUseSku(useSku);
                }
            }
        }
    }

    private void setUseSku(Product product) throws Exception {
        boolean isSkuSens;
        boolean isSaleChannel = product.detail() != null && StringUtils.isNotEmpty((CharSequence)product.detail().getSaleChannel());
        boolean bl = isSkuSens = null != product.getProductTemplate() && this.productTplService.isSkuSens(product.getProductTemplate());
        if (isSaleChannel || isSkuSens) {
            product.setUseSku(Integer.valueOf(1));
        } else {
            product.setUseSku(Integer.valueOf(0));
        }
    }

    public void checkProductUseSku(Product product) throws Exception {
        boolean isSkuSens;
        Integer useSku = product.getUseSku();
        if (!CollectionUtils.isEmpty((Collection)product.productDetail()) && null != product.productDetail().get(0) && null != useSku && 0 == useSku && StringUtils.isNotEmpty((CharSequence)((ProductDetail)product.productDetail().get(0)).getSaleChannel())) {
            throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_800824);
        }
        if (!CollectionUtils.isEmpty((Map)product.detail()) && null != product.detail() && null != useSku && 0 == useSku && StringUtils.isNotEmpty((CharSequence)product.detail().getSaleChannel())) {
            throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_800824);
        }
        boolean bl = isSkuSens = null != product.getProductTemplate() && this.productTplService.isSkuSens(product.getProductTemplate());
        if (null != useSku && 0 == useSku && isSkuSens) {
            throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_800825);
        }
    }

    public void checkSkuCanAddSku(Long productId) throws Exception {
        QueryConditionGroup queryConditionGroup = QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"id").eq((Object)productId)});
        QuerySchema schema = QuerySchema.create().addSelect("useSku").addCondition((ConditionExpression)queryConditionGroup);
        List products = this.productSkuService.query("pc.product.Product", schema);
        if (!CollectionUtils.isEmpty((Collection)products) && 0 == ((Product)products.get(0)).getUseSku()) {
            throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_800826);
        }
    }

    public void setDefaultForOldArch(Product product) {
        if (null == product.getUseSku()) {
            throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_800827);
        }
    }

    public void syncSaleChannelForApplied(Product product) throws Exception {
        boolean bUseSku;
        boolean isCreator = product.get("isCreator") != null && product.get("isCreator").equals(true);
        boolean bl = bUseSku = null != product.getUseSku() && 0 == product.getUseSku();
        if (product.getEntityStatus() == EntityStatus.Update && isCreator && bUseSku) {
            QueryConditionGroup queryConditionGroup = QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"id").eq(product.getId())});
            QuerySchema schema = QuerySchema.create().addSelect("useSku").addCondition((ConditionExpression)queryConditionGroup);
            List products = this.productSkuService.query("pc.product.Product", schema);
            if (!CollectionUtils.isEmpty((Collection)products) && 1 == ((Product)products.get(0)).getUseSku()) {
                HashMap<String, Object> params = new HashMap<String, Object>(2);
                params.put("productId", product.getId());
                params.put("ytenant", AppContext.getYTenantId());
                SqlHelper.update((String)"com.yonyoucloud.upc.product.dao.ProductUpdate.updateProductDetailSaleChannelNull", params);
            }
        }
    }
}


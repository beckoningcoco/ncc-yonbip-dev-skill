/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.yonyou.iuap.apdoc.coredoc.enums.CoreDocBusinessErrorEnum
 *  com.yonyou.iuap.apdoc.coredoc.exceptions.CoreDocBusinessException
 *  com.yonyou.iuap.ucf.common.i18n.InternationalUtils
 *  com.yonyou.ucf.mdd.ext.core.AppContext
 *  com.yonyou.ucf.mdd.ext.dao.meta.MetaDaoHelper
 *  org.imeta.orm.base.BizObject
 *  org.springframework.beans.factory.annotation.Autowired
 *  org.springframework.stereotype.Service
 *  org.springframework.util.CollectionUtils
 */
package com.yonyoucloud.upc.service.product;

import com.yonyou.iuap.apdoc.coredoc.enums.CoreDocBusinessErrorEnum;
import com.yonyou.iuap.apdoc.coredoc.exceptions.CoreDocBusinessException;
import com.yonyou.iuap.ucf.common.i18n.InternationalUtils;
import com.yonyou.ucf.mdd.ext.core.AppContext;
import com.yonyou.ucf.mdd.ext.dao.meta.MetaDaoHelper;
import com.yonyoucloud.upc.billrule.goodsAchive.ProductSKUShelveRule;
import com.yonyoucloud.upc.service.UPCProductBizService;
import com.yonyoucloud.upc.service.UPCProductQueryService;
import com.yonyoucloud.upc.service.UPCProductShelfService;
import java.text.MessageFormat;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import org.imeta.orm.base.BizObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;

@Service
public class ProductEnableAndDisableService {
    @Autowired
    ProductSKUShelveRule productSKUShelveRule;
    @Autowired
    UPCProductShelfService upcProductShelfService;
    @Autowired
    UPCProductQueryService upcProductQueryService;

    public void productDisable(BizObject bill) throws Exception {
        boolean isCreator;
        Long productId;
        this.upcProductShelfService.checkEnableDisableParam(bill.getId(), bill.get("productApplyRangeId"));
        Long productApplyRangeId = Long.parseLong(bill.get("productApplyRangeId").toString());
        List ranges = MetaDaoHelper.queryById((String)"pc.product.ProductApplyRange", (String)"id, productId, isCreator, isApplied", (Object)productApplyRangeId);
        if (!CollectionUtils.isEmpty((Collection)ranges)) {
            AppContext.delThreadContext((String)"isSupportAsync");
            Map range = (Map)ranges.get(0);
            productId = Long.parseLong(range.get("productId").toString());
            isCreator = Boolean.parseBoolean(((Map)ranges.get(0)).get("isCreator").toString());
            boolean isApplied = Boolean.parseBoolean(((Map)ranges.get(0)).get("isApplied").toString());
            if (!isApplied) {
                this.productSKUShelveRule.initRangeData(productId.toString(), productApplyRangeId);
            }
        } else {
            throw new CoreDocBusinessException(CoreDocBusinessErrorEnum.PRODUCT_CURRENT_DATA_IS_DELETE);
        }
        this.upcProductShelfService.disableProduct(productId, productApplyRangeId, isCreator);
    }

    public void productEnable(BizObject bill) throws Exception {
        this.upcProductShelfService.checkEnableDisableParam(bill.getId(), bill.get("productApplyRangeId"));
        Long productApplyRangeId = Long.parseLong(bill.get("productApplyRangeId").toString());
        List ranges = MetaDaoHelper.queryById((String)"pc.product.ProductApplyRange", (String)"id, productId, isCreator, isApplied", (Object)productApplyRangeId);
        if (!CollectionUtils.isEmpty((Collection)ranges)) {
            AppContext.delThreadContext((String)"isSupportAsync");
            Map range = (Map)ranges.get(0);
            Long productId = Long.parseLong(range.get("productId").toString());
            boolean isCreator = Boolean.parseBoolean(((Map)ranges.get(0)).get("isCreator").toString());
            boolean isApplied = Boolean.parseBoolean(((Map)ranges.get(0)).get("isApplied").toString());
            if (!isCreator && !this.upcProductQueryService.checkCanModifyProductStopStatusOfApplier(productId.toString(), false).booleanValue()) {
                String checkMsg = MessageFormat.format(InternationalUtils.getMessageWithDefault((String)"UID:P_COREDOC-BE_1C80F6F4057000BC", (String)"\u7269\u6599[{0}]\u5df2\u88ab\u521b\u5efa\u8005\u505c\u7528\uff0c\u65e0\u6cd5\u4fee\u6539\u542f\u7528\u72b6\u6001"), productId);
                throw new CoreDocBusinessException(checkMsg);
            }
            boolean enableSku = false;
            if (bill.containsKey((Object)UPCProductBizService.ENABLE_SKU) && bill.get(UPCProductBizService.ENABLE_SKU) != null) {
                enableSku = Boolean.parseBoolean(bill.get(UPCProductBizService.ENABLE_SKU).toString());
            }
            if (!isApplied) {
                this.productSKUShelveRule.initRangeData(productId.toString(), productApplyRangeId);
            }
            this.upcProductShelfService.enableProduct(productApplyRangeId, enableSku);
        }
    }
}


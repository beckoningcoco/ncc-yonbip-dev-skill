/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.yonyou.iuap.apdoc.coredoc.encrypt.dao.EncryptMaterialQryDao
 *  com.yonyou.iuap.apdoc.coredoc.enums.CoreDocBusinessErrorEnum
 *  com.yonyou.iuap.apdoc.coredoc.exceptions.CoreDocBusinessException
 *  com.yonyou.ucf.mdd.common.model.rule.RuleExecuteResult
 *  com.yonyou.ucf.mdd.ext.bill.dto.BillDataDto
 *  com.yonyou.ucf.mdd.ext.bill.rule.base.AbstractCommonRule
 *  com.yonyou.ucf.mdd.ext.model.BillContext
 *  com.yonyoucloud.upc.pc.product.Product
 *  com.yonyoucloud.upc.pc.product.ProductSKU
 *  org.imeta.orm.base.BizObject
 *  org.springframework.beans.factory.annotation.Autowired
 *  org.springframework.stereotype.Component
 *  org.springframework.util.CollectionUtils
 */
package com.yonyoucloud.upc.billrule.product;

import com.yonyou.iuap.apdoc.coredoc.encrypt.dao.EncryptMaterialQryDao;
import com.yonyou.iuap.apdoc.coredoc.enums.CoreDocBusinessErrorEnum;
import com.yonyou.iuap.apdoc.coredoc.exceptions.CoreDocBusinessException;
import com.yonyou.ucf.mdd.common.model.rule.RuleExecuteResult;
import com.yonyou.ucf.mdd.ext.bill.dto.BillDataDto;
import com.yonyou.ucf.mdd.ext.bill.rule.base.AbstractCommonRule;
import com.yonyou.ucf.mdd.ext.model.BillContext;
import com.yonyoucloud.iuap.upc.api.service.IBizReferenceCheckService;
import com.yonyoucloud.upc.pc.product.Product;
import com.yonyoucloud.upc.pc.product.ProductSKU;
import com.yonyoucloud.upc.service.ProductSkuService;
import com.yonyoucloud.upc.service.utils.ProductUtil;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import org.imeta.orm.base.BizObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.util.CollectionUtils;

@Component(value="extendRefCheckRule")
public class ExtendRefCheckRule
extends AbstractCommonRule {
    @Autowired
    IBizReferenceCheckService ibrcs;
    @Autowired
    ProductSkuService productSkuService;
    @Autowired
    EncryptMaterialQryDao encryptMaterialQryDao;

    public RuleExecuteResult execute(BillContext billContext, Map<String, Object> map) throws Exception {
        BillDataDto billDataDto = (BillDataDto)this.getParam(map);
        if (null == billContext || billDataDto == null) {
            return new RuleExecuteResult();
        }
        List data = (List)billDataDto.getData();
        if (data == null || data.size() == 0) {
            return new RuleExecuteResult();
        }
        map.put("transactionId", ProductUtil.getNewTransactionId());
        if (this.ibrcs != null) {
            String fullname = billContext.getFullname();
            List bills = this.getBills(billContext, map);
            Map<String, Object> result = null;
            if (null != bills && bills.size() > 0) {
                ArrayList<Long> ids = new ArrayList<Long>();
                for (BizObject bill : bills) {
                    ids.add((Long)bill.getId());
                    this.checkDefaultSkuRef((Long)bill.getId());
                    this.checkEncryptRef(bill);
                }
                result = this.ibrcs.checkReference(fullname, ids);
                if (result.containsKey("success")) {
                    return new RuleExecuteResult();
                }
                throw new CoreDocBusinessException((String)result.get("error"));
            }
        }
        return new RuleExecuteResult();
    }

    private void checkDefaultSkuRef(Long productId) throws Exception {
        ProductSKU productSKU = this.productSkuService.queryDefaultSku(productId);
        if (null != productSKU) {
            this.productSkuService.checkSkuDel(productSKU.getId(), productId);
        }
    }

    private void checkEncryptRef(BizObject bill) throws Exception {
        Product product = (Product)bill;
        Long productId = (Long)product.getId();
        List materialSettingPOS = this.encryptMaterialQryDao.queryByMaterialId(productId);
        if (!CollectionUtils.isEmpty((Collection)materialSettingPOS)) {
            throw new CoreDocBusinessException(CoreDocBusinessErrorEnum.PRODUCT_REFER_ENCRYPT_MATERIAL, new Object[]{product.getCode()});
        }
    }
}


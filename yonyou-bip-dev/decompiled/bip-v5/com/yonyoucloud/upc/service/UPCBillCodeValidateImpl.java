/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.alibaba.fastjson.JSON
 *  com.yonyou.iuap.apdoc.coredoc.enums.CoreExtrateBusinessErrorEnum
 *  com.yonyou.iuap.apdoc.coredoc.exceptions.CoreDocBusinessException
 *  com.yonyou.iuap.billcode.po.BillNumberPO
 *  com.yonyou.iuap.ucf.common.i18n.InternationalUtils
 *  com.yonyou.uap.billcode.BillCodeContext
 *  com.yonyou.uap.billcode.service.IBillCodeComponentService
 *  com.yonyou.ucf.mdd.ext.bill.enums.BillNumModeEnum
 *  com.yonyou.ucf.mdd.ext.core.AppContext
 *  com.yonyou.ucf.mdd.ext.dao.meta.MetaDaoHelper
 *  com.yonyoucloud.upc.pc.productapply.EffectStatus
 *  com.yonyoucloud.upc.pc.productapply.ProductApply
 *  org.imeta.orm.schema.ConditionExpression
 *  org.imeta.orm.schema.QueryCondition
 *  org.imeta.orm.schema.QueryConditionGroup
 *  org.imeta.orm.schema.QuerySchema
 *  org.slf4j.Logger
 *  org.slf4j.LoggerFactory
 *  org.springframework.beans.factory.annotation.Autowired
 *  org.springframework.stereotype.Service
 *  org.springframework.util.CollectionUtils
 */
package com.yonyoucloud.upc.service;

import com.alibaba.fastjson.JSON;
import com.yonyou.iuap.apdoc.coredoc.enums.CoreExtrateBusinessErrorEnum;
import com.yonyou.iuap.apdoc.coredoc.exceptions.CoreDocBusinessException;
import com.yonyou.iuap.billcode.po.BillNumberPO;
import com.yonyou.iuap.ucf.common.i18n.InternationalUtils;
import com.yonyou.uap.billcode.BillCodeContext;
import com.yonyou.uap.billcode.service.IBillCodeComponentService;
import com.yonyou.ucf.mdd.ext.bill.enums.BillNumModeEnum;
import com.yonyou.ucf.mdd.ext.core.AppContext;
import com.yonyou.ucf.mdd.ext.dao.meta.MetaDaoHelper;
import com.yonyoucloud.upc.pc.productapply.EffectStatus;
import com.yonyoucloud.upc.pc.productapply.ProductApply;
import com.yonyoucloud.upc.service.ProductApplyService;
import com.yonyoucloud.upc.service.billcode.BillCodeValidateImpl;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import org.imeta.orm.schema.ConditionExpression;
import org.imeta.orm.schema.QueryCondition;
import org.imeta.orm.schema.QueryConditionGroup;
import org.imeta.orm.schema.QuerySchema;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;

@Service(value="AUPCBillCodeValidateImpl")
public class UPCBillCodeValidateImpl
extends BillCodeValidateImpl {
    private static final Logger log = LoggerFactory.getLogger(UPCBillCodeValidateImpl.class);
    @Autowired
    ProductApplyService productApplyService;
    @Autowired
    private IBillCodeComponentService billCodeComponentService;

    @Override
    public boolean isDuplicate(String fullName, String columnName, String billCode, Map<String, Object> extendInfo) {
        if ("pc.product.Product".equals(fullName) && this.productIsDuplicate(billCode, extendInfo)) {
            return true;
        }
        return super.isDuplicate(fullName, columnName, billCode, extendInfo);
    }

    private boolean productIsDuplicate(String billCode, Map<String, Object> extendInfo) {
        BillNumberPO billNumberPO;
        Integer handleWorkDuplicatePolicy;
        Object billNumber;
        List productApplyList;
        QuerySchema productApplyQuerySchema = QuerySchema.create();
        QueryConditionGroup conditionGroup = QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"productCode").eq((Object)billCode), QueryCondition.name((String)"effectStatus").not_eq((Object)String.valueOf(EffectStatus.success.getValue()))});
        if (extendInfo.get("id") != null) {
            conditionGroup.addCondition((ConditionExpression)QueryConditionGroup.or((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"applyProductId").not_eq(extendInfo.get("id")), QueryCondition.name((String)"applyProductId").eq(null)}));
        }
        productApplyQuerySchema.addSelect(new String[]{"id", "applyCode"}).addCondition((ConditionExpression)conditionGroup).addPager(1, 1);
        try {
            productApplyList = MetaDaoHelper.queryObject((String)"pc.productapply.ProductApply", (QuerySchema)productApplyQuerySchema, null);
        }
        catch (Exception ex) {
            log.error("\u7269\u6599\u9a8c\u91cd\u6267\u884c\u67e5\u8be2\u5f02\u5e38 fullName=[{}],schema=[{}]", new Object[]{"pc.productapply.ProductApply", JSON.toJSONString((Object)productApplyQuerySchema), ex});
            throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_800524);
        }
        if (CollectionUtils.isEmpty((Collection)productApplyList)) {
            return false;
        }
        BillCodeContext context = this.billCodeComponentService.getBillCodeContext("pc_product", AppContext.getCurrentUser().getYxyTenantId(), "");
        Integer billNumMode = context.getBillnumMode();
        if (null != billNumMode && billNumMode.equals(BillNumModeEnum.MANUAL.getKey())) {
            throw new CoreDocBusinessException(null, String.format(InternationalUtils.getMessageWithDefault((String)"UID:P_COREDOC-BE_198F475E04F8000C", (String)"\u7269\u6599[%s]\u4e0e\"\u7269\u6599\u7533\u8bf7\u5355[%s]\u5bf9\u5e94\u7684\u7269\u6599\u7f16\u7801[%s]\" \u91cd\u590d"), billCode, ((ProductApply)productApplyList.get(0)).get("applyCode").toString(), billCode));
        }
        if (null != billNumMode && billNumMode.equals(BillNumModeEnum.AUTO_MANUAL.getKey()) && null != (billNumber = context.getBillNumber()) && billNumber instanceof BillNumberPO && null != (handleWorkDuplicatePolicy = (billNumberPO = (BillNumberPO)billNumber).getHandleWorkDuplicatePolicy()) && 1 == handleWorkDuplicatePolicy) {
            throw new CoreDocBusinessException(null, String.format(InternationalUtils.getMessageWithDefault((String)"UID:P_COREDOC-BE_198F475E04F8000C", (String)"\u7269\u6599[%s]\u4e0e\"\u7269\u6599\u7533\u8bf7\u5355[%s]\u5bf9\u5e94\u7684\u7269\u6599\u7f16\u7801[%s]\" \u91cd\u590d"), billCode, ((ProductApply)productApplyList.get(0)).get("applyCode").toString(), billCode));
        }
        return true;
    }
}


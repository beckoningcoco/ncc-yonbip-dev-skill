/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.yonyou.iuap.apdoc.coredoc.enums.CoreExtrateBusinessErrorEnum
 *  com.yonyou.iuap.apdoc.coredoc.exceptions.CoreDocBusinessException
 *  com.yonyou.iuap.apdoc.coredoc.service.pub.CoreDocUniqueService
 *  com.yonyou.ucf.mdd.common.model.rule.RuleExecuteResult
 *  com.yonyou.ucf.mdd.ext.bill.dto.BillDataDto
 *  com.yonyou.ucf.mdd.ext.bill.rule.base.AbstractCommonRule
 *  com.yonyou.ucf.mdd.ext.core.AppContext
 *  com.yonyou.ucf.mdd.ext.model.BillContext
 *  com.yonyou.ucf.mdd.ext.model.LoginUser
 *  com.yonyoucloud.upc.aa.merchant.Merchant
 *  com.yonyoucloud.upc.utils.MerchantUtils
 *  org.imeta.orm.base.BizObject
 *  org.imeta.orm.base.EntityStatus
 *  org.springframework.beans.factory.annotation.Autowired
 *  org.springframework.stereotype.Component
 */
package com.yonyoucloud.upc.billrule.merchant;

import com.yonyou.iuap.apdoc.coredoc.enums.CoreExtrateBusinessErrorEnum;
import com.yonyou.iuap.apdoc.coredoc.exceptions.CoreDocBusinessException;
import com.yonyou.iuap.apdoc.coredoc.service.pub.CoreDocUniqueService;
import com.yonyou.ucf.mdd.common.model.rule.RuleExecuteResult;
import com.yonyou.ucf.mdd.ext.bill.dto.BillDataDto;
import com.yonyou.ucf.mdd.ext.bill.rule.base.AbstractCommonRule;
import com.yonyou.ucf.mdd.ext.core.AppContext;
import com.yonyou.ucf.mdd.ext.model.BillContext;
import com.yonyou.ucf.mdd.ext.model.LoginUser;
import com.yonyoucloud.upc.aa.merchant.Merchant;
import com.yonyoucloud.upc.service.MerchantCheckService;
import com.yonyoucloud.upc.utils.MerchantUtils;
import java.util.List;
import java.util.Map;
import org.imeta.orm.base.BizObject;
import org.imeta.orm.base.EntityStatus;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component(value="checkMerchantUnique")
public class CheckMerchantUnique
extends AbstractCommonRule {
    @Autowired
    private MerchantCheckService merchantCheckService;
    @Autowired
    CoreDocUniqueService coreDocUniqueService;

    public RuleExecuteResult execute(BillContext billContext, Map<String, Object> map) throws Exception {
        LoginUser currentUser = AppContext.getCurrentUser();
        if (null == currentUser) {
            throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_800108);
        }
        BillDataDto billDataDto = (BillDataDto)this.getParam(map);
        if (null == billContext || billDataDto == null) {
            throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_800137);
        }
        List bills = this.getBills(billContext, map);
        for (BizObject bill : bills) {
            Merchant merchant = new Merchant();
            merchant.init((Map)bill);
            if (("aa_merchant".equals(billContext.getBillnum()) || "aa_merchantexport".equals(billContext.getBillnum())) && merchant.get("aa_merchant_export_range") == null && !"CRM".equals(bill.get("srcBill"))) {
                this.coreDocUniqueService.doLockOperate((BizObject)merchant, "aa.merchant.Merchant", merchant.getCode());
            }
            if (merchant.getEntityStatus() == EntityStatus.Insert || merchant.getEntityStatus() == EntityStatus.Update) {
                if (MerchantUtils.isExists((Map)merchant, (String)"name")) {
                    this.merchantCheckService.checkMerchantNameFromMerchant(merchant);
                }
                if (MerchantUtils.isExists((Map)merchant, (String)"code") && !"customerapply".equals(merchant.get("customerapply"))) {
                    merchant.setCode(MerchantUtils.replaceStr((String)merchant.getCode()));
                    this.merchantCheckService.dealCodeFromMerchant(merchant);
                }
            }
            billDataDto.setData((Object)merchant);
            this.putParam(map, billDataDto);
        }
        return new RuleExecuteResult();
    }
}


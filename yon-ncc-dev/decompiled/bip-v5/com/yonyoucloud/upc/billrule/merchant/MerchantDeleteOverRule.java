/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.yonyou.cloud.util.IrisDynamicInvokeUtil
 *  com.yonyou.iuap.apdoc.coredoc.enums.CoreDocBusinessErrorEnum
 *  com.yonyou.iuap.apdoc.coredoc.exceptions.CoreDocBusinessException
 *  com.yonyou.iuap.apdoc.coredoc.utils.AppOpenUtil
 *  com.yonyou.iuap.apdoc.coredoc.utils.BooleanUtil
 *  com.yonyou.iuap.apdoc.sdk.dto.common.DocOrgIdDTO
 *  com.yonyou.iuap.apdoc.sdk.service.merchant.IMerchantDealAfterDeleteService
 *  com.yonyou.ucf.mdd.common.model.rule.RuleExecuteResult
 *  com.yonyou.ucf.mdd.ext.bill.dto.BillDataDto
 *  com.yonyou.ucf.mdd.ext.bill.rule.crud.DeleteBillRule
 *  com.yonyou.ucf.mdd.ext.model.BillContext
 *  com.yonyoucloud.upc.aa.merchant.Merchant
 *  org.imeta.orm.base.BizObject
 *  org.springframework.stereotype.Component
 *  org.springframework.util.StringUtils
 */
package com.yonyoucloud.upc.billrule.merchant;

import com.yonyou.cloud.util.IrisDynamicInvokeUtil;
import com.yonyou.iuap.apdoc.coredoc.enums.CoreDocBusinessErrorEnum;
import com.yonyou.iuap.apdoc.coredoc.exceptions.CoreDocBusinessException;
import com.yonyou.iuap.apdoc.coredoc.utils.AppOpenUtil;
import com.yonyou.iuap.apdoc.coredoc.utils.BooleanUtil;
import com.yonyou.iuap.apdoc.sdk.dto.common.DocOrgIdDTO;
import com.yonyou.iuap.apdoc.sdk.service.merchant.IMerchantDealAfterDeleteService;
import com.yonyou.ucf.mdd.common.model.rule.RuleExecuteResult;
import com.yonyou.ucf.mdd.ext.bill.dto.BillDataDto;
import com.yonyou.ucf.mdd.ext.bill.rule.crud.DeleteBillRule;
import com.yonyou.ucf.mdd.ext.model.BillContext;
import com.yonyoucloud.upc.aa.merchant.Merchant;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import org.imeta.orm.base.BizObject;
import org.springframework.stereotype.Component;
import org.springframework.util.StringUtils;

@Component(value="merchantDeleteOverRule")
public class MerchantDeleteOverRule
extends DeleteBillRule {
    public RuleExecuteResult execute(BillContext billContext, Map<String, Object> paramMap) throws Exception {
        super.execute(billContext, paramMap);
        BillDataDto billDataDto = (BillDataDto)this.getParam(paramMap);
        if (null == billContext || billDataDto == null) {
            return new RuleExecuteResult();
        }
        List bills = this.getBills(billContext, paramMap);
        try {
            for (BizObject bill : bills) {
                Merchant merchant = (Merchant)bill;
                boolean flag = false;
                if (merchant.get("isCreator") != null && BooleanUtil.isTrue((Object)merchant.get("isCreator"))) {
                    flag = true;
                } else if (merchant.get("isCreator") != null || merchant.get("merchantApplyRangeId") != null) {
                    // empty if block
                }
                if (!flag) continue;
                this.deleteForCRM(merchant);
            }
        }
        catch (Exception e) {
            throw new CoreDocBusinessException(CoreDocBusinessErrorEnum.CRM_DELETE_MERCHANT_ERROR, new Object[]{e.getMessage()});
        }
        return new RuleExecuteResult();
    }

    public void deleteForCRM(Merchant merchant) throws Exception {
        IMerchantDealAfterDeleteService merchantDeleteService;
        ArrayList<DocOrgIdDTO> merchantIdAndOrgIdList = new ArrayList<DocOrgIdDTO>();
        DocOrgIdDTO docOrgIdDTO = new DocOrgIdDTO();
        docOrgIdDTO.setDocId(merchant.get("id").toString());
        if (StringUtils.isEmpty((Object)merchant.get("belongOrg").toString()) && BooleanUtil.isTrue((Object)merchant.get("isCreator")) && merchant.get("createOrg") != null) {
            merchant.set("belongOrg", merchant.get("createOrg"));
        }
        docOrgIdDTO.setOrgId(merchant.get("belongOrg").toString());
        merchantIdAndOrgIdList.add(docOrgIdDTO);
        if (AppOpenUtil.isOpenCRM() && (merchantDeleteService = (IMerchantDealAfterDeleteService)IrisDynamicInvokeUtil.getService((String)"yycrm", (String)"c87e2267-1001-4c70-bb2a-ab41f3b81aa3", null, IMerchantDealAfterDeleteService.class)) != null) {
            merchantDeleteService.merchantDealAfterDelete(merchantIdAndOrgIdList);
        }
    }
}


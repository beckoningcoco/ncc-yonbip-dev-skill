/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.yonyou.iuap.apdoc.coredoc.utils.BooleanUtil
 *  com.yonyou.ucf.mdd.common.model.rule.RuleExecuteResult
 *  com.yonyou.ucf.mdd.ext.bill.dto.BillDataDto
 *  com.yonyou.ucf.mdd.ext.bill.rule.base.AbstractCommonRule
 *  com.yonyou.ucf.mdd.ext.core.AppContext
 *  com.yonyou.ucf.mdd.ext.dao.sql.SqlHelper
 *  com.yonyou.ucf.mdd.ext.model.BillContext
 *  com.yonyoucloud.upc.aa.merchant.Merchant
 *  org.imeta.orm.base.BizObject
 *  org.imeta.orm.base.EntityStatus
 *  org.slf4j.Logger
 *  org.slf4j.LoggerFactory
 *  org.springframework.beans.factory.annotation.Autowired
 *  org.springframework.stereotype.Component
 */
package com.yonyoucloud.upc.billrule.merchant;

import com.yonyou.iuap.apdoc.coredoc.utils.BooleanUtil;
import com.yonyou.ucf.mdd.common.model.rule.RuleExecuteResult;
import com.yonyou.ucf.mdd.ext.bill.dto.BillDataDto;
import com.yonyou.ucf.mdd.ext.bill.rule.base.AbstractCommonRule;
import com.yonyou.ucf.mdd.ext.core.AppContext;
import com.yonyou.ucf.mdd.ext.dao.sql.SqlHelper;
import com.yonyou.ucf.mdd.ext.model.BillContext;
import com.yonyoucloud.upc.aa.merchant.Merchant;
import com.yonyoucloud.upc.service.MerchantService;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.imeta.orm.base.BizObject;
import org.imeta.orm.base.EntityStatus;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component(value="merchantIsExistPotentialRule")
public class MerchantIsExistPotentialRule
extends AbstractCommonRule {
    private static final Logger log = LoggerFactory.getLogger(MerchantIsExistPotentialRule.class);
    @Autowired
    private MerchantService merchantService;

    public RuleExecuteResult execute(BillContext billContext, Map<String, Object> map) throws Exception {
        BillDataDto billDataDto = (BillDataDto)this.getParam(map);
        if (null == billContext || billDataDto == null) {
            return new RuleExecuteResult();
        }
        List bills = this.getBills(billContext, map);
        for (BizObject bizObject : bills) {
            Merchant merchant = (Merchant)bizObject;
            if (merchant.getEntityStatus() != EntityStatus.Update || merchant.getId() == null) continue;
            this.merchantService.setMerchantIsExistPotential(Long.parseLong(merchant.getId().toString()));
            if (!BooleanUtil.isTrue((Object)merchant.get("isLinkageStopStatus")) || !BooleanUtil.isTrue((Object)merchant.get("isCreator")) || !merchant.containsKey((Object)"isStop")) continue;
            this.setIsAppliedStopStatus(merchant);
        }
        return new RuleExecuteResult();
    }

    private void setIsAppliedStopStatus(Merchant merchant) throws Exception {
        if (BooleanUtil.isTrue((Object)merchant.get("isStop"))) {
            this.setStop(Long.parseLong(merchant.getId().toString()));
        } else {
            this.setUnStop(Long.parseLong(merchant.getId().toString()));
        }
    }

    private void setStop(Long merchantId) throws Exception {
        HashMap<String, Object> params = new HashMap<String, Object>();
        params.put("merchantid", merchantId);
        params.put("layoff_id", AppContext.getCurrentUser().getId());
        params.put("yTenantId", AppContext.getCurrentUser().getYTenantId());
        SqlHelper.update((String)"com.yonyoucloud.upc.option.dao.merchant.disableMerchant", params);
        SqlHelper.update((String)"com.yonyoucloud.upc.merchant.dao.merchantGroup.disableMerchantDetail", params);
    }

    private void setUnStop(Long merchantId) throws Exception {
        HashMap<String, Object> params = new HashMap<String, Object>();
        params.put("merchantid", merchantId);
        params.put("yTenantId", AppContext.getCurrentUser().getYTenantId());
        SqlHelper.update((String)"com.yonyoucloud.upc.option.dao.merchant.enableMerchant", params);
        SqlHelper.update((String)"com.yonyoucloud.upc.merchant.dao.merchantGroup.enableMerchantDetail", params);
    }
}


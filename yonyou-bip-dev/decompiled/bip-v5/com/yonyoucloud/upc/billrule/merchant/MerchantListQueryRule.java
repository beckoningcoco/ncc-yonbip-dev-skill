/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.yonyou.ucf.mdd.common.model.Pager
 *  com.yonyou.ucf.mdd.common.model.rule.RuleExecuteResult
 *  com.yonyou.ucf.mdd.ext.bill.rule.base.AbstractCommonRule
 *  com.yonyou.ucf.mdd.ext.model.BillContext
 *  org.springframework.stereotype.Component
 *  org.springframework.util.CollectionUtils
 */
package com.yonyoucloud.upc.billrule.merchant;

import com.yonyou.ucf.mdd.common.model.Pager;
import com.yonyou.ucf.mdd.common.model.rule.RuleExecuteResult;
import com.yonyou.ucf.mdd.ext.bill.rule.base.AbstractCommonRule;
import com.yonyou.ucf.mdd.ext.model.BillContext;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import org.springframework.stereotype.Component;
import org.springframework.util.CollectionUtils;

@Component(value="merchantListQueryRule")
public class MerchantListQueryRule
extends AbstractCommonRule {
    public RuleExecuteResult execute(BillContext billContext, Map<String, Object> paramMap) throws Exception {
        Pager pager = (Pager)paramMap.get("return");
        if (pager != null && pager.getRecordList() != null) {
            List recordList = pager.getRecordList();
            if (CollectionUtils.isEmpty((Collection)recordList)) {
                return new RuleExecuteResult();
            }
            recordList.stream().forEach(record -> {
                Map merchant = (Map)record;
                if (merchant.get("belongOrg_Name") != null && merchant.get("belongOrg_Name2") != null && merchant.get("merchantAppliedDetail!belongMerchant_Name") != null && merchant.get("merchantAppliedDetail!belongMerchant_Name2") == null && merchant.get("belongOrg_Name") instanceof String && merchant.get("merchantAppliedDetail!belongMerchant_Name") instanceof String && merchant.get("belongOrg_Name2") instanceof String) {
                    merchant.put("belongOrg_Name", merchant.get("merchantAppliedDetail!belongMerchant_Name"));
                }
                if (merchant.get("belongOrg_Name") != null && merchant.get("belongOrg_Name2") == null && merchant.get("merchantAppliedDetail!belongMerchant_Name") != null && merchant.get("merchantAppliedDetail!belongMerchant_Name2") != null && merchant.get("belongOrg_Name") instanceof String && merchant.get("merchantAppliedDetail!belongMerchant_Name") instanceof String && merchant.get("merchantAppliedDetail!belongMerchant_Name2") instanceof String) {
                    merchant.put("merchantAppliedDetail!belongMerchant_Name", merchant.get("belongOrg_Name"));
                }
            });
        }
        return new RuleExecuteResult();
    }
}


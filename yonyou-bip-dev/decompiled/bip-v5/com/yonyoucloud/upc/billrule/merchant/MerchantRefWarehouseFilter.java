/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.alibaba.fastjson.JSON
 *  com.yonyou.ucf.mdd.common.model.rule.RuleExecuteResult
 *  com.yonyou.ucf.mdd.common.model.uimeta.filter.vo.FilterVO
 *  com.yonyou.ucf.mdd.ext.bill.dto.BillDataDto
 *  com.yonyou.ucf.mdd.ext.bill.rule.base.AbstractCommonRule
 *  com.yonyou.ucf.mdd.ext.model.BillContext
 *  com.yonyoucloud.upc.aa.merchant.Merchant
 *  org.imeta.orm.base.BizObject
 *  org.springframework.stereotype.Component
 */
package com.yonyoucloud.upc.billrule.merchant;

import com.alibaba.fastjson.JSON;
import com.yonyou.ucf.mdd.common.model.rule.RuleExecuteResult;
import com.yonyou.ucf.mdd.common.model.uimeta.filter.vo.FilterVO;
import com.yonyou.ucf.mdd.ext.bill.dto.BillDataDto;
import com.yonyou.ucf.mdd.ext.bill.rule.base.AbstractCommonRule;
import com.yonyou.ucf.mdd.ext.model.BillContext;
import com.yonyoucloud.upc.aa.merchant.Merchant;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.imeta.orm.base.BizObject;
import org.springframework.stereotype.Component;

@Component(value="merchantRefWarehouseFilter")
public class MerchantRefWarehouseFilter
extends AbstractCommonRule {
    public RuleExecuteResult execute(BillContext billContext, Map<String, Object> map) throws Exception {
        if (null == billContext) {
            return new RuleExecuteResult();
        }
        BillDataDto billDataDto = (BillDataDto)this.getParam(map);
        if (billDataDto.getKey().equals("receivingWarehouse_Name")) {
            List bills = this.getBills(billContext, map);
            for (BizObject bizObject : bills) {
                Merchant merchant = (Merchant)bizObject;
                FilterVO filterVOCurrent = billDataDto.getCondition();
                if (billDataDto.getCondition() == null) {
                    filterVOCurrent = new FilterVO();
                }
                billDataDto.setCondition(filterVOCurrent);
                HashMap<String, Object> extendConditionMap = new HashMap<String, Object>(2);
                extendConditionMap.put("shopPartition", true);
                extendConditionMap.put("warehouseType", "shop");
                extendConditionMap.put("custId", merchant.getId());
                String extendCondition = JSON.toJSONString(extendConditionMap);
                billDataDto.setExtendCondition(extendCondition);
                this.putParam(map, billDataDto);
            }
        }
        return new RuleExecuteResult();
    }
}


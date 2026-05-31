/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.yonyou.ucf.mdd.common.model.rule.RuleExecuteResult
 *  com.yonyou.ucf.mdd.common.model.uimeta.filter.vo.FilterVO
 *  com.yonyou.ucf.mdd.common.model.uimeta.filter.vo.SimpleFilterVO
 *  com.yonyou.ucf.mdd.ext.bill.dto.BillDataDto
 *  com.yonyou.ucf.mdd.ext.bill.rule.base.AbstractCommonRule
 *  com.yonyou.ucf.mdd.ext.core.AppContext
 *  com.yonyou.ucf.mdd.ext.model.BillContext
 *  org.imeta.core.base.ConditionOperator
 *  org.slf4j.Logger
 *  org.slf4j.LoggerFactory
 *  org.springframework.stereotype.Component
 */
package com.yonyoucloud.upc.billrule.common;

import com.yonyou.ucf.mdd.common.model.rule.RuleExecuteResult;
import com.yonyou.ucf.mdd.common.model.uimeta.filter.vo.FilterVO;
import com.yonyou.ucf.mdd.common.model.uimeta.filter.vo.SimpleFilterVO;
import com.yonyou.ucf.mdd.ext.bill.dto.BillDataDto;
import com.yonyou.ucf.mdd.ext.bill.rule.base.AbstractCommonRule;
import com.yonyou.ucf.mdd.ext.core.AppContext;
import com.yonyou.ucf.mdd.ext.model.BillContext;
import java.util.HashMap;
import java.util.Map;
import org.imeta.core.base.ConditionOperator;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Component(value="userdefineRefBeforRule")
public class UserdefineRefBeforRule
extends AbstractCommonRule {
    private static final Logger log = LoggerFactory.getLogger(UserdefineRefBeforRule.class);

    public RuleExecuteResult execute(BillContext billContext, Map<String, Object> map) throws Exception {
        BillDataDto billDataDto = (BillDataDto)this.getParam(map);
        String defineType = billDataDto.getcSelfDefineType();
        log.info(((Object)((Object)this)).getClass() + ": billnum:" + billDataDto.getBillnum() + ", cselfDefineType:" + billDataDto.getcSelfDefineType() + ", key:" + billDataDto.getKey() + ", refCode:" + billDataDto.getrefCode());
        if (defineType != null) {
            HashMap<String, Object> params = new HashMap<String, Object>();
            params.put("defineId", defineType);
            params.put("tenant", AppContext.getCurrentUser().getTenant());
            if (params.size() > 0) {
                FilterVO gridFilter = billDataDto.getCondition();
                if (gridFilter == null) {
                    gridFilter = new FilterVO();
                }
                for (String item : params.keySet()) {
                    gridFilter.appendCondition(ConditionOperator.and, new SimpleFilterVO[]{new SimpleFilterVO(item, "eq", params.get(item))});
                }
                billDataDto.setCondition(gridFilter);
                this.putParam(map, billDataDto);
            }
        }
        return null;
    }
}


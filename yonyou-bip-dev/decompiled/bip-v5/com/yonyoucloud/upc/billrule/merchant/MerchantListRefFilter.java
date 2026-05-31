/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.alibaba.fastjson.JSON
 *  com.yonyou.ucf.mdd.common.model.ref.RefEntity
 *  com.yonyou.ucf.mdd.common.model.rule.RuleExecuteResult
 *  com.yonyou.ucf.mdd.common.model.uimeta.filter.vo.FilterVO
 *  com.yonyou.ucf.mdd.common.model.uimeta.filter.vo.SimpleFilterVO
 *  com.yonyou.ucf.mdd.ext.bill.dto.BillDataDto
 *  com.yonyou.ucf.mdd.ext.bill.rule.base.AbstractCommonRule
 *  com.yonyou.ucf.mdd.ext.model.BillContext
 *  org.imeta.core.base.ConditionOperator
 *  org.springframework.stereotype.Component
 */
package com.yonyoucloud.upc.billrule.merchant;

import com.alibaba.fastjson.JSON;
import com.yonyou.ucf.mdd.common.model.ref.RefEntity;
import com.yonyou.ucf.mdd.common.model.rule.RuleExecuteResult;
import com.yonyou.ucf.mdd.common.model.uimeta.filter.vo.FilterVO;
import com.yonyou.ucf.mdd.common.model.uimeta.filter.vo.SimpleFilterVO;
import com.yonyou.ucf.mdd.ext.bill.dto.BillDataDto;
import com.yonyou.ucf.mdd.ext.bill.rule.base.AbstractCommonRule;
import com.yonyou.ucf.mdd.ext.model.BillContext;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import org.imeta.core.base.ConditionOperator;
import org.springframework.stereotype.Component;

@Component(value="merchantListRefFilter")
public class MerchantListRefFilter
extends AbstractCommonRule {
    public RuleExecuteResult execute(BillContext billContext, Map<String, Object> map) throws Exception {
        BillDataDto billDataDto = (BillDataDto)this.getParam(map);
        if (null == billContext || billDataDto == null) {
            return new RuleExecuteResult();
        }
        RefEntity refEntity = billDataDto.getRefEntity();
        FilterVO merchantGridFilter = billDataDto.getCondition();
        FilterVO merchantTreeFilter = billDataDto.getTreeCondition();
        if (merchantTreeFilter == null) {
            merchantTreeFilter = new FilterVO();
        }
        if (merchantGridFilter == null) {
            merchantGridFilter = new FilterVO();
        }
        if ("bd_staff_ref".equals(refEntity.getCode()) && "professSalesman_Name".equals(billDataDto.getKey())) {
            merchantGridFilter.appendCondition("biz_man_tag", "eq", (Object)true);
            merchantGridFilter.appendCondition("enable", "eq", (Object)1);
            merchantGridFilter.appendCondition("dr", "eq", (Object)0);
        } else if ("aa_merchantisolationref".equals(refEntity.getCode())) {
            merchantGridFilter.appendCondition(ConditionOperator.and, new SimpleFilterVO[]{new SimpleFilterVO("merchantRole.merchantOptions", "eq", (Object)"1")});
            HashMap<String, Integer> extendCondition = new HashMap<String, Integer>();
            extendCondition.put("isShopMerchantIsolationRef", 2);
            billDataDto.setExtendCondition(JSON.toJSONString(extendCondition));
        } else if ("RefTable_839443ba26".equals(refEntity.getCode()) && "merchantAppliedDetail!taxRate_NtaxRate".equals(billDataDto.getKey())) {
            merchantGridFilter.appendCondition(ConditionOperator.and, new SimpleFilterVO[]{new SimpleFilterVO("scope", "in", Arrays.asList(1, 3))});
        } else if ("pc_addressarchivesref".equals(refEntity.getCode()) && "province_Name".equals(billDataDto.getKey())) {
            merchantTreeFilter.appendCondition("level", "eq", (Object)1);
        }
        billDataDto.setCondition(merchantGridFilter);
        billDataDto.setTreeCondition(merchantTreeFilter);
        this.putParam(map, billDataDto);
        return new RuleExecuteResult();
    }
}


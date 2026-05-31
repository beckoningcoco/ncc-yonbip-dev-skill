/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.yonyou.ucf.mdd.common.model.rule.RuleExecuteResult
 *  com.yonyou.ucf.mdd.common.model.uimeta.filter.vo.FilterVO
 *  com.yonyou.ucf.mdd.common.model.uimeta.filter.vo.SimpleFilterVO
 *  com.yonyou.ucf.mdd.ext.bill.dto.BillDataDto
 *  com.yonyou.ucf.mdd.ext.bill.rule.base.AbstractCommonRule
 *  com.yonyou.ucf.mdd.ext.model.BillContext
 *  com.yonyoucloud.upc.pc.userdef.UserDefClassEnum
 *  org.imeta.core.base.ConditionOperator
 *  org.springframework.stereotype.Component
 */
package com.yonyoucloud.upc.billrule.userdefine;

import com.yonyou.ucf.mdd.common.model.rule.RuleExecuteResult;
import com.yonyou.ucf.mdd.common.model.uimeta.filter.vo.FilterVO;
import com.yonyou.ucf.mdd.common.model.uimeta.filter.vo.SimpleFilterVO;
import com.yonyou.ucf.mdd.ext.bill.dto.BillDataDto;
import com.yonyou.ucf.mdd.ext.bill.rule.base.AbstractCommonRule;
import com.yonyou.ucf.mdd.ext.model.BillContext;
import com.yonyoucloud.upc.pc.userdef.UserDefClassEnum;
import java.util.Map;
import org.imeta.core.base.ConditionOperator;
import org.springframework.stereotype.Component;

@Component(value="userdefineMoveRule")
public class UserdefineMoveRule
extends AbstractCommonRule {
    public RuleExecuteResult execute(BillContext billContext, Map<String, Object> map) throws Exception {
        BillDataDto dto = (BillDataDto)this.getParam(map);
        String billNum = dto.getBillnum();
        String classId = "";
        if (billNum.equals(UserDefClassEnum.PRODUCTSPEC.getBillnum())) {
            classId = UserDefClassEnum.PRODUCTSPEC.getClassIdValue();
        } else if (billNum.equals(UserDefClassEnum.PRODUCTARCHIVE.getBillnum())) {
            classId = UserDefClassEnum.PRODUCTARCHIVE.getClassIdValue();
        } else if (billNum.equals(UserDefClassEnum.PRODUCTSKU.getBillnum())) {
            classId = UserDefClassEnum.PRODUCTSKU.getClassIdValue();
        } else if (billNum.equals(UserDefClassEnum.PRODUCTORDER.getBillnum())) {
            classId = UserDefClassEnum.PRODUCTORDER.getClassIdValue();
        } else if (billNum.equals(UserDefClassEnum.PRODUCTBRAND.getBillnum())) {
            classId = UserDefClassEnum.PRODUCTBRAND.getClassIdValue();
        } else if (billNum.equals(UserDefClassEnum.PRODUCTVENDOR.getBillnum())) {
            classId = UserDefClassEnum.PRODUCTVENDOR.getClassIdValue();
        } else if (billNum.equals(UserDefClassEnum.PRODUCTBATCHNO.getBillnum())) {
            classId = UserDefClassEnum.PRODUCTBATCHNO.getClassIdValue();
        } else if (billNum.equals(UserDefClassEnum.AACUSTOMERPRO.getBillnum())) {
            classId = UserDefClassEnum.AACUSTOMERPRO.getClassIdValue();
        }
        FilterVO filterVo = dto.getCondition();
        if (filterVo == null) {
            filterVo = new FilterVO();
        }
        filterVo.appendCondition(ConditionOperator.and, new SimpleFilterVO[]{new SimpleFilterVO("classId", "eq", (Object)classId)});
        dto.setCondition(filterVo);
        return new RuleExecuteResult();
    }
}


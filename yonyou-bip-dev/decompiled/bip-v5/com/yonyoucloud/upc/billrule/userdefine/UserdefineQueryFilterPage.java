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
 *  com.yonyou.ucf.mdd.ext.model.LoginUser
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
import com.yonyou.ucf.mdd.ext.core.AppContext;
import com.yonyou.ucf.mdd.ext.model.BillContext;
import com.yonyou.ucf.mdd.ext.model.LoginUser;
import com.yonyoucloud.upc.pc.userdef.UserDefClassEnum;
import java.util.HashMap;
import java.util.Map;
import org.imeta.core.base.ConditionOperator;
import org.springframework.stereotype.Component;

@Component(value="userdefineQueryFilterPage")
public class UserdefineQueryFilterPage
extends AbstractCommonRule {
    public RuleExecuteResult execute(BillContext billContext, Map<String, Object> map) throws Exception {
        BillDataDto billDataDto = (BillDataDto)this.getParam(map);
        HashMap<String, Object> params = new HashMap<String, Object>();
        LoginUser user = AppContext.getCurrentUser();
        if (user == null || user.getTenant() == null) {
            return new RuleExecuteResult();
        }
        params.put("tenant", user.getTenant());
        String billNum = billContext.getBillnum();
        if (billNum.equals(UserDefClassEnum.PRODUCTSPEC.getBillnum())) {
            params.put("classId", UserDefClassEnum.PRODUCTSPEC.getClassIdValue());
        } else if (billNum.equals(UserDefClassEnum.PRODUCTARCHIVE.getBillnum())) {
            params.put("classId", UserDefClassEnum.PRODUCTARCHIVE.getClassIdValue());
        } else if (billNum.equals(UserDefClassEnum.PRODUCTSKU.getBillnum())) {
            params.put("classId", UserDefClassEnum.PRODUCTSKU.getClassIdValue());
        } else if (billNum.equals(UserDefClassEnum.PRODUCTORDER.getBillnum())) {
            params.put("classId", UserDefClassEnum.PRODUCTORDER.getClassIdValue());
        } else if (billNum.equals(UserDefClassEnum.PRODUCTBRAND.getBillnum())) {
            params.put("classId", UserDefClassEnum.PRODUCTBRAND.getClassIdValue());
        } else if (billNum.equals(UserDefClassEnum.PRODUCTVENDOR.getBillnum())) {
            params.put("classId", UserDefClassEnum.PRODUCTVENDOR.getClassIdValue());
        } else if (billNum.equals(UserDefClassEnum.PRODUCTBATCHNO.getBillnum())) {
            params.put("classId", UserDefClassEnum.PRODUCTBATCHNO.getClassIdValue());
        }
        params.put("isDeleted", 0);
        FilterVO gridFilter = billDataDto.getCondition();
        if (gridFilter == null) {
            gridFilter = new FilterVO();
        }
        for (String item : params.keySet()) {
            gridFilter.appendCondition(ConditionOperator.and, new SimpleFilterVO[]{new SimpleFilterVO(item, "eq", params.get(item))});
        }
        billDataDto.setCondition(gridFilter);
        this.putParam(map, billDataDto);
        return new RuleExecuteResult();
    }
}


/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.yonyou.ucf.mdd.common.model.ref.RefEntity
 *  com.yonyou.ucf.mdd.common.model.rule.RuleExecuteResult
 *  com.yonyou.ucf.mdd.common.model.uimeta.filter.vo.FilterVO
 *  com.yonyou.ucf.mdd.common.model.uimeta.filter.vo.QueryPagerVo
 *  com.yonyou.ucf.mdd.common.model.uimeta.filter.vo.SimpleFilterVO
 *  com.yonyou.ucf.mdd.ext.bill.dto.BillDataDto
 *  com.yonyou.ucf.mdd.ext.bill.rule.base.AbstractCommonRule
 *  com.yonyou.ucf.mdd.ext.core.AppContext
 *  com.yonyou.ucf.mdd.ext.model.BillContext
 *  com.yonyou.ucf.mdd.ext.model.LoginUser
 *  org.imeta.core.base.ConditionOperator
 *  org.springframework.stereotype.Component
 */
package com.yonyoucloud.upc.billrule.tpl;

import com.yonyou.ucf.mdd.common.model.ref.RefEntity;
import com.yonyou.ucf.mdd.common.model.rule.RuleExecuteResult;
import com.yonyou.ucf.mdd.common.model.uimeta.filter.vo.FilterVO;
import com.yonyou.ucf.mdd.common.model.uimeta.filter.vo.QueryPagerVo;
import com.yonyou.ucf.mdd.common.model.uimeta.filter.vo.SimpleFilterVO;
import com.yonyou.ucf.mdd.ext.bill.dto.BillDataDto;
import com.yonyou.ucf.mdd.ext.bill.rule.base.AbstractCommonRule;
import com.yonyou.ucf.mdd.ext.core.AppContext;
import com.yonyou.ucf.mdd.ext.model.BillContext;
import com.yonyou.ucf.mdd.ext.model.LoginUser;
import java.util.HashMap;
import java.util.Map;
import org.imeta.core.base.ConditionOperator;
import org.springframework.stereotype.Component;

@Component(value="productTplRefFilter")
public class ProductTplRefFilter
extends AbstractCommonRule {
    public RuleExecuteResult execute(BillContext billContext, Map<String, Object> map) throws Exception {
        BillDataDto billDataDto = (BillDataDto)this.getParam(map);
        if (null == billContext || billDataDto == null) {
            return new RuleExecuteResult();
        }
        RefEntity refEntity = billDataDto.getRefEntity();
        String billnum = billDataDto.getBillnum();
        HashMap mapCondition = billDataDto.getMapCondition();
        if (mapCondition == null) {
            mapCondition = new HashMap();
            billDataDto.setMapCondition(mapCondition);
        }
        LoginUser user = AppContext.getCurrentUser();
        HashMap<String, Object> params = new HashMap<String, Object>();
        if ("pc_userdefclassref".equals(refEntity.refType)) {
            if (mapCondition.containsKey("classId")) {
                String classId = String.valueOf(mapCondition.get("classId"));
                params.put("classId", classId);
            }
            params.put("isEnabled", true);
            params.put("tenant", user.getTenant());
            QueryPagerVo page = billDataDto.getPage();
            if (page != null) {
                page.setPageSize(100);
            }
        }
        if ("pc_userdefref".equals(refEntity.refType)) {
            if (mapCondition.containsKey("defineId")) {
                String defineId = String.valueOf(mapCondition.get("defineId"));
                params.put("defineId", defineId);
            }
            params.put("tenant", user.getTenant());
        } else if ("pc_propertysourceref".equals(refEntity.refType)) {
            String group = String.valueOf(mapCondition.get("group"));
            params.put("group", group);
        }
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
        return new RuleExecuteResult();
    }
}


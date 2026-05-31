/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.yonyou.iuap.ucf.common.i18n.InternationalUtils
 *  com.yonyou.iuap.ucf.common.i18n.MessageUtils
 *  com.yonyou.ucf.mdd.common.model.Pager
 *  com.yonyou.ucf.mdd.common.model.ref.RefEntity
 *  com.yonyou.ucf.mdd.common.model.rule.RuleExecuteResult
 *  com.yonyou.ucf.mdd.common.model.uimeta.filter.vo.FilterVO
 *  com.yonyou.ucf.mdd.common.model.uimeta.filter.vo.SimpleFilterVO
 *  com.yonyou.ucf.mdd.ext.bill.dto.BillDataDto
 *  com.yonyou.ucf.mdd.ext.bill.rule.base.AbstractCommonRule
 *  com.yonyou.ucf.mdd.ext.model.BillContext
 *  org.imeta.core.base.ConditionOperator
 *  org.springframework.beans.factory.annotation.Autowired
 *  org.springframework.stereotype.Component
 */
package com.yonyoucloud.upc.billrule.product;

import com.yonyou.iuap.ucf.common.i18n.InternationalUtils;
import com.yonyou.iuap.ucf.common.i18n.MessageUtils;
import com.yonyou.ucf.mdd.common.model.Pager;
import com.yonyou.ucf.mdd.common.model.ref.RefEntity;
import com.yonyou.ucf.mdd.common.model.rule.RuleExecuteResult;
import com.yonyou.ucf.mdd.common.model.uimeta.filter.vo.FilterVO;
import com.yonyou.ucf.mdd.common.model.uimeta.filter.vo.SimpleFilterVO;
import com.yonyou.ucf.mdd.ext.bill.dto.BillDataDto;
import com.yonyou.ucf.mdd.ext.bill.rule.base.AbstractCommonRule;
import com.yonyou.ucf.mdd.ext.model.BillContext;
import com.yonyoucloud.iuap.upc.api.service.IUPCProductQueryService;
import java.util.HashMap;
import java.util.Map;
import org.imeta.core.base.ConditionOperator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component(value="couponRefFilterRule")
public class CouponRefFilterRule
extends AbstractCommonRule {
    @Autowired
    private IUPCProductQueryService upcProductQueryService;
    private Map<Integer, String> typeNames;

    public RuleExecuteResult execute(BillContext billContext, Map<String, Object> map) throws Exception {
        BillDataDto billDataDto = (BillDataDto)this.getParam(map);
        if (null == billContext || billDataDto == null) {
            return new RuleExecuteResult();
        }
        RefEntity refEntity = billDataDto.getRefEntity();
        Object data = billDataDto.getData();
        if (data == null) {
            return new RuleExecuteResult();
        }
        if ("membercenter_coupon".equals(refEntity.refType)) {
            if (map.containsKey("return")) {
                Pager pager = (Pager)map.get("return");
                if (pager.getRecordList() != null) {
                    pager.getRecordList().stream().forEach(r -> {
                        Map item = (Map)r;
                        int type = (Integer)item.get("type");
                        if (this.getTypeNames().containsKey(type)) {
                            item.put("name", String.format("%s-%s", MessageUtils.getMessage((String)this.typeNames.get(type)), item.get("name")));
                        }
                    });
                }
            } else {
                Map appid;
                FilterVO gridFilter = billDataDto.getCondition();
                if (gridFilter == null) {
                    gridFilter = new FilterVO();
                }
                if ((appid = this.upcProductQueryService.getUMemberCenterAppId()) == null) {
                    gridFilter.appendCondition(ConditionOperator.and, new SimpleFilterVO[]{new SimpleFilterVO("id", "eq", (Object)"-1")});
                } else {
                    gridFilter.appendCondition(ConditionOperator.and, new SimpleFilterVO[]{new SimpleFilterVO("appId", "eq", appid.get("appId"))});
                    gridFilter.appendCondition(ConditionOperator.or, new SimpleFilterVO[]{new SimpleFilterVO("expMode", "eq", (Object)2), new SimpleFilterVO("expireDate", "egt", (Object)(System.currentTimeMillis() / 1000L))});
                }
                billDataDto.setCondition(gridFilter);
                this.putParam(map, billDataDto);
            }
        }
        return new RuleExecuteResult();
    }

    private Map<Integer, String> getTypeNames() {
        if (this.typeNames == null) {
            this.typeNames = new HashMap<Integer, String>();
            this.typeNames.put(1, InternationalUtils.getMessageWithDefault((String)"UID:P_COREDOC-BE_179F6286040802F4", (String)"\u4ee3\u91d1\u5238"));
            this.typeNames.put(2, InternationalUtils.getMessageWithDefault((String)"UID:P_COREDOC-BE_179F6286040802F5", (String)"\u6298\u6263\u5238"));
            this.typeNames.put(3, InternationalUtils.getMessageWithDefault((String)"UID:P_COREDOC-BE_179F6286040802F6", (String)"\u793c\u54c1\u5238"));
            this.typeNames.put(4, InternationalUtils.getMessageWithDefault((String)"UID:P_COREDOC-BE_179F6286040802F7", (String)"\u56e2\u8d2d\u5238"));
            this.typeNames.put(5, InternationalUtils.getMessageWithDefault((String)"UID:P_COREDOC-BE_179F6286040802F8", (String)"\u8ba1\u6b21\u5361"));
            this.typeNames.put(6, InternationalUtils.getMessageWithDefault((String)"UID:P_COREDOC-BE_179F6286040802F9", (String)"\u5151\u6362\u5238"));
        }
        return this.typeNames;
    }
}


/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.yonyou.iuap.apdoc.coredoc.enums.CoreExtrateBusinessErrorEnum
 *  com.yonyou.iuap.apdoc.coredoc.exceptions.CoreDocBusinessException
 *  com.yonyou.iuap.apdoc.coredoc.utils.BooleanUtil
 *  com.yonyou.ucf.mdd.common.model.rule.RuleExecuteResult
 *  com.yonyou.ucf.mdd.ext.bill.dto.BillDataDto
 *  com.yonyou.ucf.mdd.ext.bill.rule.base.AbstractCommonRule
 *  com.yonyou.ucf.mdd.ext.core.AppContext
 *  com.yonyou.ucf.mdd.ext.model.BillContext
 *  com.yonyou.ucf.transtype.model.BdTransType
 *  com.yonyou.ucf.transtype.service.itf.ITransTypeService
 *  org.imeta.orm.base.BizObject
 *  org.slf4j.Logger
 *  org.slf4j.LoggerFactory
 *  org.springframework.beans.factory.annotation.Autowired
 *  org.springframework.stereotype.Component
 *  org.springframework.util.CollectionUtils
 */
package com.yonyoucloud.upc.billrule.materialLifeCycle;

import com.yonyou.iuap.apdoc.coredoc.enums.CoreExtrateBusinessErrorEnum;
import com.yonyou.iuap.apdoc.coredoc.exceptions.CoreDocBusinessException;
import com.yonyou.iuap.apdoc.coredoc.utils.BooleanUtil;
import com.yonyou.ucf.mdd.common.model.rule.RuleExecuteResult;
import com.yonyou.ucf.mdd.ext.bill.dto.BillDataDto;
import com.yonyou.ucf.mdd.ext.bill.rule.base.AbstractCommonRule;
import com.yonyou.ucf.mdd.ext.core.AppContext;
import com.yonyou.ucf.mdd.ext.model.BillContext;
import com.yonyou.ucf.transtype.model.BdTransType;
import com.yonyou.ucf.transtype.service.itf.ITransTypeService;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import org.imeta.orm.base.BizObject;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.util.CollectionUtils;

@Component(value="lifeCycleTemplateCheckRule")
public class LifeCycleTemplateCheckRule
extends AbstractCommonRule {
    private static final Logger logger = LoggerFactory.getLogger(LifeCycleTemplateCheckRule.class);
    @Autowired
    private ITransTypeService transTypeService;

    public RuleExecuteResult execute(BillContext billContext, Map<String, Object> paramMap) throws Exception {
        BillDataDto billDataDto = (BillDataDto)this.getParam(paramMap);
        if (null == billContext || billDataDto == null) {
            return new RuleExecuteResult(paramMap);
        }
        List bills = this.getBills(billContext, paramMap);
        if (!CollectionUtils.isEmpty((Collection)bills)) {
            ArrayList<String> lifeCycleTemplateIds = new ArrayList<String>();
            for (int i = 0; i < bills.size(); ++i) {
                BizObject bill = (BizObject)bills.get(i);
                this.checkIsRight(bill);
                this.checkIsSystem(bill);
                this.checkIsStop(bill);
                lifeCycleTemplateIds.add((String)bill.getId());
            }
            this.checkRef(bills, lifeCycleTemplateIds);
        }
        return new RuleExecuteResult();
    }

    private void checkIsRight(BizObject bill) throws Exception {
        if (null != bill.get("code") && null == bill.getId()) {
            throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_800346, new Object[]{bill.get("code").toString()});
        }
    }

    private void checkIsSystem(BizObject bill) throws Exception {
        if (null != bill.get("code") && bill.get("code").toString().toLowerCase().startsWith("system_")) {
            throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_800347, new Object[]{bill.get("code").toString()});
        }
    }

    private void checkIsStop(BizObject bill) throws Exception {
        if (null != bill.get("stopstatus") && BooleanUtil.isFalse((Object)bill.get("stopstatus"))) {
            throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_800348, new Object[]{bill.get("code").toString()});
        }
    }

    private void checkRef(List<BizObject> bills, List<String> lifeCycleTemplateIds) throws Exception {
        if (!CollectionUtils.isEmpty(lifeCycleTemplateIds)) {
            List transTypeList = this.transTypeService.getTransTypesByFormId((String)AppContext.getYTenantId(), "PC.pc_product");
            if (null == transTypeList || transTypeList.isEmpty()) {
                return;
            }
            for (BdTransType transType : transTypeList) {
                for (String lifeCycleTemplateId : lifeCycleTemplateIds) {
                    if (!transType.getExtendAttrsJson().contains(lifeCycleTemplateId)) continue;
                    throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_800349, new Object[]{bills.get(0).get("code").toString()});
                }
            }
        }
    }
}


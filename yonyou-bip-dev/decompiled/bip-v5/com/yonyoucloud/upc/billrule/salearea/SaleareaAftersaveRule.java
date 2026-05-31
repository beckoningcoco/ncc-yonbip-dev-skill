/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.yonyou.iuap.apdoc.coredoc.enums.CoreExtrateBusinessErrorEnum
 *  com.yonyou.iuap.apdoc.coredoc.exceptions.CoreDocBusinessException
 *  com.yonyou.iuap.ucf.common.i18n.InternationalUtils
 *  com.yonyou.ucf.mdd.common.model.rule.RuleExecuteResult
 *  com.yonyou.ucf.mdd.ext.bill.dto.BillDataDto
 *  com.yonyou.ucf.mdd.ext.bill.rule.base.AbstractCommonRule
 *  com.yonyou.ucf.mdd.ext.core.AppContext
 *  com.yonyou.ucf.mdd.ext.dao.meta.MetaDaoHelper
 *  com.yonyou.ucf.mdd.ext.dao.sql.SqlHelper
 *  com.yonyou.ucf.mdd.ext.model.BillContext
 *  com.yonyou.ucf.mdd.ext.model.LoginUser
 *  com.yonyoucloud.upc.aa.salearea.SaleArea
 *  org.imeta.orm.base.EntityStatus
 *  org.imeta.orm.schema.ConditionExpression
 *  org.imeta.orm.schema.QueryCondition
 *  org.imeta.orm.schema.QueryConditionGroup
 *  org.imeta.orm.schema.QuerySchema
 *  org.springframework.stereotype.Component
 */
package com.yonyoucloud.upc.billrule.salearea;

import com.yonyou.iuap.apdoc.coredoc.enums.CoreExtrateBusinessErrorEnum;
import com.yonyou.iuap.apdoc.coredoc.exceptions.CoreDocBusinessException;
import com.yonyou.iuap.ucf.common.i18n.InternationalUtils;
import com.yonyou.ucf.mdd.common.model.rule.RuleExecuteResult;
import com.yonyou.ucf.mdd.ext.bill.dto.BillDataDto;
import com.yonyou.ucf.mdd.ext.bill.rule.base.AbstractCommonRule;
import com.yonyou.ucf.mdd.ext.core.AppContext;
import com.yonyou.ucf.mdd.ext.dao.meta.MetaDaoHelper;
import com.yonyou.ucf.mdd.ext.dao.sql.SqlHelper;
import com.yonyou.ucf.mdd.ext.model.BillContext;
import com.yonyou.ucf.mdd.ext.model.LoginUser;
import com.yonyoucloud.upc.aa.salearea.SaleArea;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.imeta.orm.base.EntityStatus;
import org.imeta.orm.schema.ConditionExpression;
import org.imeta.orm.schema.QueryCondition;
import org.imeta.orm.schema.QueryConditionGroup;
import org.imeta.orm.schema.QuerySchema;
import org.springframework.stereotype.Component;

@Component(value="saleareaAftersaveRule")
public class SaleareaAftersaveRule
extends AbstractCommonRule {
    public RuleExecuteResult execute(BillContext billContext, Map<String, Object> paramMap) throws Exception {
        BillDataDto billDataDto = (BillDataDto)this.getParam(paramMap);
        if (null == billContext || billDataDto == null) {
            return new RuleExecuteResult();
        }
        List bills = this.getBills(billContext, paramMap);
        SaleArea saleArea = (SaleArea)bills.get(0);
        LoginUser user = AppContext.getCurrentUser();
        if (null == user) {
            throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_800108);
        }
        if (saleArea.getEntityStatus() == EntityStatus.Update) {
            if (!saleArea.getStopstatus().booleanValue()) {
                this.checkParentStatus(saleArea);
            }
            if (saleArea.getStopstatus().booleanValue()) {
                this.changechildStatus((Long)saleArea.getId());
            }
        }
        return null;
    }

    private void checkParentStatus(SaleArea saleArea) throws Exception {
        boolean status;
        Map map;
        Object stopstatus;
        QuerySchema schema;
        List parentMap;
        if (saleArea.getParent() != null && (parentMap = MetaDaoHelper.query((String)"aa.salearea.SaleArea", (QuerySchema)(schema = QuerySchema.create().addSelect("*").addCondition((ConditionExpression)QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"id").eq((Object)saleArea.getParent())}))))) != null && parentMap.size() == 1 && (stopstatus = (map = (Map)parentMap.get(0)).get("stopstatus")) != null && (status = ((Boolean)stopstatus).booleanValue())) {
            throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_800316);
        }
    }

    private void changechildStatus(Long id) throws Exception {
        HashMap<String, Number> params = new HashMap<String, Number>();
        params.put("stopstatus", 1);
        params.put("id", id);
        SqlHelper.update((String)"com.yonyoucloud.upc.bill.dao.SaleAreaDao.updateChildStopStatus", params);
    }

    private RuleExecuteResult chechRefered(long cId) throws Exception {
        QuerySchema schema = QuerySchema.create().addSelect("id").addCondition((ConditionExpression)QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"channCustomerArea").eq((Object)cId)}));
        List checkResult = MetaDaoHelper.query((String)"aa.merchant.Merchant", (QuerySchema)schema);
        if (checkResult != null && checkResult.size() > 0) {
            return new RuleExecuteResult(0, InternationalUtils.getMessageWithDefault((String)"UID:P_COREDOC-BE_179F628604080C54", (String)"\u5ba2\u6237\u533a\u57df\u5df2\u88ab\u5f15\u7528"));
        }
        return null;
    }
}


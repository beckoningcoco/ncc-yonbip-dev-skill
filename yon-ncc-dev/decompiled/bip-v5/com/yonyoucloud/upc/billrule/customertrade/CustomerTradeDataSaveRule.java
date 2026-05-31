/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.yonyou.iuap.apdoc.coredoc.enums.CoreExtrateBusinessErrorEnum
 *  com.yonyou.iuap.apdoc.coredoc.exceptions.CoreDocBusinessException
 *  com.yonyou.ucf.mdd.common.model.rule.RuleExecuteResult
 *  com.yonyou.ucf.mdd.ext.bill.dto.BillDataDto
 *  com.yonyou.ucf.mdd.ext.bill.rule.base.AbstractCommonRule
 *  com.yonyou.ucf.mdd.ext.core.AppContext
 *  com.yonyou.ucf.mdd.ext.dao.meta.MetaDaoHelper
 *  com.yonyou.ucf.mdd.ext.dao.sql.SqlHelper
 *  com.yonyou.ucf.mdd.ext.model.BillContext
 *  com.yonyoucloud.upc.aa.customertrade.CustomerTrade
 *  com.yonyoucloud.upc.utils.MerchantUtils
 *  com.yonyoucloud.upc.utils.MultilangUtil
 *  org.imeta.orm.base.BizObject
 *  org.imeta.orm.base.EntityStatus
 *  org.imeta.orm.schema.ConditionExpression
 *  org.imeta.orm.schema.QueryCondition
 *  org.imeta.orm.schema.QueryConditionGroup
 *  org.imeta.orm.schema.QuerySchema
 *  org.springframework.stereotype.Component
 */
package com.yonyoucloud.upc.billrule.customertrade;

import com.yonyou.iuap.apdoc.coredoc.enums.CoreExtrateBusinessErrorEnum;
import com.yonyou.iuap.apdoc.coredoc.exceptions.CoreDocBusinessException;
import com.yonyou.ucf.mdd.common.model.rule.RuleExecuteResult;
import com.yonyou.ucf.mdd.ext.bill.dto.BillDataDto;
import com.yonyou.ucf.mdd.ext.bill.rule.base.AbstractCommonRule;
import com.yonyou.ucf.mdd.ext.core.AppContext;
import com.yonyou.ucf.mdd.ext.dao.meta.MetaDaoHelper;
import com.yonyou.ucf.mdd.ext.dao.sql.SqlHelper;
import com.yonyou.ucf.mdd.ext.model.BillContext;
import com.yonyoucloud.upc.aa.customertrade.CustomerTrade;
import com.yonyoucloud.upc.utils.MerchantUtils;
import com.yonyoucloud.upc.utils.MultilangUtil;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.imeta.orm.base.BizObject;
import org.imeta.orm.base.EntityStatus;
import org.imeta.orm.schema.ConditionExpression;
import org.imeta.orm.schema.QueryCondition;
import org.imeta.orm.schema.QueryConditionGroup;
import org.imeta.orm.schema.QuerySchema;
import org.springframework.stereotype.Component;

@Component(value="customerTradeDataSaveRule")
public class CustomerTradeDataSaveRule
extends AbstractCommonRule {
    public RuleExecuteResult execute(BillContext billContext, Map<String, Object> map) throws Exception {
        BillDataDto billDataDto = (BillDataDto)this.getParam(map);
        if (null == billContext || billDataDto == null) {
            return new RuleExecuteResult();
        }
        List clss = this.getBills(billContext, map);
        HashMap<String, Object> params = new HashMap<String, Object>();
        params.put("tenantid", AppContext.getCurrentUser().getTenant());
        for (BizObject cls : clss) {
            params.put("id", cls.get("id"));
            if (!"aa_customertrade".equals(billContext.getBillnum())) continue;
            CustomerTrade customerTrade = (CustomerTrade)cls;
            if (!MerchantUtils.getAllowSelectNonLeafNodes()) {
                this.checksParentRefer(customerTrade);
            }
            this.checkParentStopstatus(customerTrade);
            if (customerTrade.getEntityStatus() == EntityStatus.Update) {
                this.updateChildFPathAndLevel(customerTrade.getId());
            }
            if (!customerTrade.getStopstatus().booleanValue()) continue;
            HashMap<String, Object> paramMap = new HashMap<String, Object>();
            paramMap.put("id", customerTrade.getId());
            SqlHelper.update((String)"com.yonyoucloud.upc.bill.dao.CustomerTrade.updateChildStopStatus", paramMap);
        }
        return new RuleExecuteResult();
    }

    public void updateChildFPathAndLevel(Object id) throws Exception {
        QuerySchema schema = QuerySchema.create().addSelect("id, path").addCondition((ConditionExpression)QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"path").like(id)}));
        List clss = MetaDaoHelper.query((String)"aa.customertrade.CustomerTrade", (QuerySchema)schema);
        if (clss == null) {
            return;
        }
        ArrayList<CustomerTrade> customerTradeList = new ArrayList<CustomerTrade>();
        for (Map map : clss) {
            String path = map.get("path").toString();
            String replace = path.replace("|", "");
            CustomerTrade cls = new CustomerTrade();
            cls.setLevel(Integer.valueOf(path.length() - replace.length()));
            cls.setEntityStatus(EntityStatus.Update);
            cls.setId(map.get("id"));
            customerTradeList.add(cls);
        }
        MetaDaoHelper.update((String)"aa.customertrade.CustomerTrade", customerTradeList);
    }

    private void checkEndChildrenLevel(Map<String, Object> params) throws Exception {
        List CustomerTrades = SqlHelper.selectList((String)"com.yonyoucloud.upc.bill.dao.CustomerTrade.selectEndChildrenLevel", params);
        if (CustomerTrades != null && CustomerTrades.size() > 0 && ((CustomerTrade)CustomerTrades.get(0)).getLevel() > 8) {
            throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_800191);
        }
    }

    private void checkParentStopstatus(CustomerTrade customerTrade) throws Exception {
        if (customerTrade.get("parent") != null) {
            boolean pStopstatus;
            QuerySchema schema = QuerySchema.create().addSelect("*").addCondition((ConditionExpression)QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"id").eq(customerTrade.get("parent"))}));
            List clss = MetaDaoHelper.query((String)"aa.customertrade.CustomerTrade", (QuerySchema)schema);
            if (clss == null || clss.isEmpty()) {
                throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_800192, new Object[]{MultilangUtil.getAttr((String)"aa.customertrade.CustomerTrade", (String)"name", (BizObject)customerTrade, null)});
            }
            if (!customerTrade.getStopstatus().booleanValue() && (pStopstatus = ((Boolean)((Map)clss.get(0)).get("stopstatus")).booleanValue())) {
                throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_800193, new Object[]{MultilangUtil.getAttr((String)"aa.customertrade.CustomerTrade", (String)"name", (BizObject)customerTrade, null)});
            }
        }
    }

    private void checksParentRefer(CustomerTrade customerTrade) throws Exception {
        QuerySchema schema;
        List products;
        if (customerTrade.getParent() != null && (products = MetaDaoHelper.query((String)"aa.merchant.Merchant", (QuerySchema)(schema = QuerySchema.create().addSelect("id ").addCondition((ConditionExpression)QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"customerIndustry").eq((Object)customerTrade.getParent())}))))).size() > 0) {
            throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_800194, new Object[]{MultilangUtil.getAttr((String)"aa.customertrade.CustomerTrade", (String)"name", (BizObject)customerTrade, null)});
        }
    }
}


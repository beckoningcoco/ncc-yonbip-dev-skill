/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.yonyou.iuap.apdoc.coredoc.enums.CoreExtrateBusinessErrorEnum
 *  com.yonyou.iuap.apdoc.coredoc.exceptions.CoreDocBusinessException
 *  com.yonyou.ucf.mdd.common.model.rule.RuleExecuteResult
 *  com.yonyou.ucf.mdd.ext.base.user.UserType
 *  com.yonyou.ucf.mdd.ext.bill.rule.base.AbstractCommonRule
 *  com.yonyou.ucf.mdd.ext.core.AppContext
 *  com.yonyou.ucf.mdd.ext.model.BillContext
 *  com.yonyou.ucf.mdd.ext.model.LoginUser
 *  org.imeta.orm.base.BizObject
 *  org.imeta.orm.base.EntityStatus
 *  org.slf4j.Logger
 *  org.slf4j.LoggerFactory
 *  org.springframework.beans.factory.annotation.Autowired
 *  org.springframework.stereotype.Component
 */
package com.yonyoucloud.upc.billrule.merchant;

import com.yonyou.iuap.apdoc.coredoc.enums.CoreExtrateBusinessErrorEnum;
import com.yonyou.iuap.apdoc.coredoc.exceptions.CoreDocBusinessException;
import com.yonyou.ucf.mdd.common.model.rule.RuleExecuteResult;
import com.yonyou.ucf.mdd.ext.base.user.UserType;
import com.yonyou.ucf.mdd.ext.bill.rule.base.AbstractCommonRule;
import com.yonyou.ucf.mdd.ext.core.AppContext;
import com.yonyou.ucf.mdd.ext.model.BillContext;
import com.yonyou.ucf.mdd.ext.model.LoginUser;
import com.yonyoucloud.upc.event.EventService2;
import com.yonyoucloud.upc.event.EventType;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import org.imeta.orm.base.BizObject;
import org.imeta.orm.base.EntityStatus;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component(value="transactionRelationSaveNotifyRule")
public class TransactionRelationSaveNotifyRule
extends AbstractCommonRule {
    private static final Logger log = LoggerFactory.getLogger(TransactionRelationSaveNotifyRule.class);
    @Autowired
    private EventService2 eventService2;

    public RuleExecuteResult execute(BillContext billContext, Map<String, Object> map) throws Exception {
        List bills = this.getBills(billContext, map);
        LoginUser user = AppContext.getCurrentUser();
        if (null == user) {
            throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_800108);
        }
        if (null != bills && bills.size() > 0) {
            for (BizObject bill : bills) {
                boolean isShopUserType;
                boolean bl = isShopUserType = user.getUserType() == UserType.ShopUser || user.getUserType() == UserType.ShopAdminUser;
                if (bill.getEntityStatus() != EntityStatus.Insert || !isShopUserType) continue;
                try {
                    HashMap<String, Object> businessObject = new HashMap<String, Object>();
                    businessObject.put("id", bill.getId());
                    businessObject.put("createOrg", bill.getString("createOrg"));
                    businessObject.put("merchantApplyRanges", bill.get("merchantApplyRanges"));
                    String eventType = Objects.requireNonNull(EventType.find("shop_user_merchant", "save", null)).toString();
                    this.eventService2.sendEvent("YXYBASEDOC", eventType, businessObject);
                }
                catch (Exception e) {
                    log.error("CRM\u9700\u8981\u76d1\u542c\u6e20\u9053\u4ea4\u6613\u5173\u7cfb\u6765\u751f\u6210CRM\u5ba2\u6237\u5173\u7cfb\u53d1\u9001\u4e8b\u4ef6\u5931\u8d25\uff1a" + e.getMessage(), (Throwable)e);
                }
            }
        }
        return new RuleExecuteResult();
    }
}


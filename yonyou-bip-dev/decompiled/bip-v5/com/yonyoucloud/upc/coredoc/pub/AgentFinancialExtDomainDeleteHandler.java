/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.yonyou.iuap.context.InvocationInfoProxy
 *  com.yonyou.ucf.mdd.ext.dao.meta.MetaDaoHelper
 *  com.yonyoucloud.upc.aa.merchant.AgentFinancial
 *  com.yonyoucloud.upc.aa.merchant.Merchant
 *  com.yonyoucloud.upc.coredoc.IExtDomainDeleteHandler
 *  com.yonyoucloud.upc.coredoc.pub.DomainDeleteDTO
 *  org.imeta.orm.base.BizObject
 *  org.imeta.orm.base.EntityStatus
 *  org.imeta.orm.schema.ConditionExpression
 *  org.imeta.orm.schema.QueryCondition
 *  org.imeta.orm.schema.QueryConditionGroup
 *  org.imeta.orm.schema.QuerySchema
 *  org.slf4j.Logger
 *  org.slf4j.LoggerFactory
 *  org.springframework.stereotype.Component
 *  org.springframework.util.CollectionUtils
 */
package com.yonyoucloud.upc.coredoc.pub;

import com.yonyou.iuap.context.InvocationInfoProxy;
import com.yonyou.ucf.mdd.ext.dao.meta.MetaDaoHelper;
import com.yonyoucloud.upc.aa.merchant.AgentFinancial;
import com.yonyoucloud.upc.aa.merchant.Merchant;
import com.yonyoucloud.upc.coredoc.IExtDomainDeleteHandler;
import com.yonyoucloud.upc.coredoc.pub.CheckDomainDeleteService;
import com.yonyoucloud.upc.coredoc.pub.DomainDeleteDTO;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import org.imeta.orm.base.BizObject;
import org.imeta.orm.base.EntityStatus;
import org.imeta.orm.schema.ConditionExpression;
import org.imeta.orm.schema.QueryCondition;
import org.imeta.orm.schema.QueryConditionGroup;
import org.imeta.orm.schema.QuerySchema;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;
import org.springframework.util.CollectionUtils;

@Component
public class AgentFinancialExtDomainDeleteHandler
extends CheckDomainDeleteService
implements IExtDomainDeleteHandler {
    Logger logger = LoggerFactory.getLogger(AgentFinancialExtDomainDeleteHandler.class);

    @Override
    public DomainDeleteDTO getDomainDeleteDTO(BizObject bill, String billNum, String fullName) {
        Object carryParams;
        Boolean isCreator;
        if (bill.getEntityStatus() == EntityStatus.Update || bill.getEntityStatus() == EntityStatus.Unchanged) {
            Merchant merchant = new Merchant();
            merchant.init((Map)bill);
            List agentFinancialList = merchant.merchantAgentFinancialInfos();
            if (!CollectionUtils.isEmpty((Collection)agentFinancialList)) {
                ArrayList<String> agentFinancialIdList = new ArrayList<String>();
                for (AgentFinancial agentFinancial : agentFinancialList) {
                    if (agentFinancial.getEntityStatus() != EntityStatus.Delete || agentFinancial.getId() == null) continue;
                    agentFinancialIdList.add(agentFinancial.getId().toString());
                }
                DomainDeleteDTO domainDeleteDTO = new DomainDeleteDTO();
                domainDeleteDTO.setIds(agentFinancialIdList);
                if ("aa_merchantlist_query".equals(billNum)) {
                    domainDeleteDTO.setBillNum("aa_merchantlist");
                } else if ("aa_merchantdetail".equals(billNum)) {
                    domainDeleteDTO.setBillNum("aa_merchant");
                } else {
                    domainDeleteDTO.setBillNum(billNum);
                }
                domainDeleteDTO.setFullName(fullName);
                domainDeleteDTO.setToken(InvocationInfoProxy.getYhtAccessToken());
                domainDeleteDTO.setCode(bill.getString("code"));
                return domainDeleteDTO;
            }
        } else if (bill.getEntityStatus() == EntityStatus.Delete && (isCreator = (carryParams = bill.get("carryParams")) != null ? (Boolean)((Map)bill.get("carryParams")).get("isCreator") : (Boolean)bill.get("isCreator")).booleanValue()) {
            try {
                QuerySchema querySchema = QuerySchema.create();
                querySchema.addSelect("id");
                querySchema.addCondition((ConditionExpression)QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"merchantId").eq(bill.getId())}));
                List agentFinancialList = MetaDaoHelper.queryObject((String)"aa.merchant.AgentFinancial", (QuerySchema)querySchema, null);
                if (!CollectionUtils.isEmpty((Collection)agentFinancialList)) {
                    ArrayList<String> agentFinancialIdList = new ArrayList<String>();
                    for (AgentFinancial agentFinancial : agentFinancialList) {
                        agentFinancialIdList.add((String)agentFinancial.getId());
                    }
                    DomainDeleteDTO domainDeleteDTO = new DomainDeleteDTO();
                    domainDeleteDTO.setIds(agentFinancialIdList);
                    if ("aa_merchantlist_query".equals(billNum)) {
                        domainDeleteDTO.setBillNum("aa_merchantlist");
                    } else if ("aa_merchantdetail".equals(billNum)) {
                        domainDeleteDTO.setBillNum("aa_merchant");
                    } else {
                        domainDeleteDTO.setBillNum(billNum);
                    }
                    domainDeleteDTO.setFullName(fullName);
                    domainDeleteDTO.setCode(bill.getString("code"));
                    return domainDeleteDTO;
                }
            }
            catch (Exception e) {
                this.logger.error("AgentFinancialExtDomainDeleteHandler.getDomainDeleteDTO()" + e.getMessage(), (Throwable)e);
            }
        }
        return null;
    }
}


/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.yonyou.iuap.apdoc.coredoc.batchmodify.extinterface.IPubBatchModifyEntityExtService
 *  com.yonyou.iuap.apdoc.coredoc.enums.CoreDocBusinessErrorEnum
 *  com.yonyou.iuap.apdoc.coredoc.enums.CoreExtrateBusinessErrorEnum
 *  com.yonyou.iuap.apdoc.coredoc.exceptions.CoreDocBusinessException
 *  com.yonyou.iuap.data.service.itf.OrgExternalQryService
 *  com.yonyou.ucf.mdd.common.model.rule.RuleExecuteResult
 *  com.yonyou.ucf.mdd.ext.base.user.UserType
 *  com.yonyou.ucf.mdd.ext.bill.dto.BillDataDto
 *  com.yonyou.ucf.mdd.ext.core.AppContext
 *  com.yonyou.ucf.mdd.ext.dao.meta.MetaDaoHelper
 *  com.yonyoucloud.upc.aa.merchant.AgentFinancial
 *  com.yonyoucloud.upc.aa.merchant.Merchant
 *  com.yonyoucloud.upc.coredoc.batchentity.dto.PubBatchModifyEntitySaveDTO
 *  org.apache.commons.lang3.ObjectUtils
 *  org.imeta.orm.base.BizObject
 *  org.imeta.orm.base.EntityStatus
 *  org.imeta.orm.schema.ConditionExpression
 *  org.imeta.orm.schema.QueryCondition
 *  org.imeta.orm.schema.QueryConditionGroup
 *  org.imeta.orm.schema.QuerySchema
 *  org.slf4j.Logger
 *  org.slf4j.LoggerFactory
 *  org.springframework.beans.factory.annotation.Autowired
 *  org.springframework.beans.factory.annotation.Qualifier
 *  org.springframework.stereotype.Service
 *  org.springframework.util.CollectionUtils
 */
package com.yonyoucloud.upc.service.batchModify.modifyExt;

import com.yonyou.iuap.apdoc.coredoc.batchmodify.extinterface.IPubBatchModifyEntityExtService;
import com.yonyou.iuap.apdoc.coredoc.enums.CoreDocBusinessErrorEnum;
import com.yonyou.iuap.apdoc.coredoc.enums.CoreExtrateBusinessErrorEnum;
import com.yonyou.iuap.apdoc.coredoc.exceptions.CoreDocBusinessException;
import com.yonyou.iuap.data.service.itf.OrgExternalQryService;
import com.yonyou.ucf.mdd.common.model.rule.RuleExecuteResult;
import com.yonyou.ucf.mdd.ext.base.user.UserType;
import com.yonyou.ucf.mdd.ext.bill.dto.BillDataDto;
import com.yonyou.ucf.mdd.ext.core.AppContext;
import com.yonyou.ucf.mdd.ext.dao.meta.MetaDaoHelper;
import com.yonyoucloud.iuap.upc.api.service.IUPCBillService;
import com.yonyoucloud.upc.aa.merchant.AgentFinancial;
import com.yonyoucloud.upc.aa.merchant.Merchant;
import com.yonyoucloud.upc.coredoc.batchentity.dto.PubBatchModifyEntitySaveDTO;
import com.yonyoucloud.upc.service.batchModify.modifyExt.PrincipalPubBatchModifyExtHandler;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import org.apache.commons.lang3.ObjectUtils;
import org.imeta.orm.base.BizObject;
import org.imeta.orm.base.EntityStatus;
import org.imeta.orm.schema.ConditionExpression;
import org.imeta.orm.schema.QueryCondition;
import org.imeta.orm.schema.QueryConditionGroup;
import org.imeta.orm.schema.QuerySchema;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;

@Service
public class AgentFinancialPubBatchModifyExtHandler
implements IPubBatchModifyEntityExtService {
    private static final Logger log = LoggerFactory.getLogger(AgentFinancialPubBatchModifyExtHandler.class);
    @Autowired
    @Qualifier(value="pc.BillService")
    private IUPCBillService billService;
    @Autowired
    private OrgExternalQryService orgExternalQryService;
    @Autowired
    PrincipalPubBatchModifyExtHandler principalPubBatchModifyExtHandler;

    public void batchModifyIsCheckField(BizObject bizObject, Map<String, Object> pubBatchModifyEntityFieldSaveIsCheckMap, PubBatchModifyEntitySaveDTO pubBatchModifyEntitySaveDTO) throws Exception {
        Merchant merchant = new Merchant();
        AgentFinancial agentFinancial = new AgentFinancial();
        agentFinancial.init((Map)bizObject);
        agentFinancial.setEntityStatus(EntityStatus.Update);
        QuerySchema querySchema = QuerySchema.create();
        querySchema.addSelect("currency,bank,openBank,bankAccount,isDefault,merchantId");
        QueryConditionGroup queryConditionGroup = QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"id").eq(agentFinancial.getId())});
        querySchema.addCondition((ConditionExpression)queryConditionGroup);
        List agentFinancialInDbList = MetaDaoHelper.queryObject((String)"aa.merchant.AgentFinancial", (QuerySchema)querySchema, null);
        if (!CollectionUtils.isEmpty((Collection)agentFinancialInDbList)) {
            querySchema = QuerySchema.create();
            querySchema.addSelect("code,name,createOrg,creditCode,internalOrg,internalOrgId");
            querySchema.addCondition((ConditionExpression)QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"id").eq((Object)((AgentFinancial)agentFinancialInDbList.get(0)).getMerchantId())}));
            List merchantInDbList = MetaDaoHelper.queryObject((String)"aa.merchant.Merchant", (boolean)true, (QuerySchema)querySchema, null);
            if (!CollectionUtils.isEmpty((Collection)merchantInDbList)) {
                this.initAgentFinancial(agentFinancialInDbList, agentFinancial, pubBatchModifyEntityFieldSaveIsCheckMap);
                merchant.setId((Object)((AgentFinancial)agentFinancialInDbList.get(0)).getMerchantId());
                merchant.setCode(((Merchant)merchantInDbList.get(0)).getCode());
                merchant.set("name", ((Merchant)merchantInDbList.get(0)).get("name"));
                merchant.setCreateOrg(((Merchant)merchantInDbList.get(0)).getCreateOrg());
                merchant.setCreditCode(((Merchant)merchantInDbList.get(0)).getCreditCode());
                merchant.set("belongOrg", (Object)((Merchant)merchantInDbList.get(0)).getCreateOrg());
                merchant.set("_fromApi", (Object)true);
                merchant.set("importSpecialKey_merchant", (Object)"importSpecialKey_merchant");
                merchant.set("_fromBatchModify", (Object)true);
                merchant.setEntityStatus(EntityStatus.Update);
                ArrayList<AgentFinancial> agentFinancialList = new ArrayList<AgentFinancial>();
                agentFinancialList.add(agentFinancial);
                merchant.setMerchantAgentFinancialInfos(agentFinancialList);
                BillDataDto saveDto = new BillDataDto();
                saveDto.setData((Object)merchant);
                saveDto.setBillnum("aa_merchant");
                RuleExecuteResult result = this.billService.executeUpdate("save", saveDto);
                if (result.getMsgCode() != 1) {
                    throw new CoreDocBusinessException(result.getMessage());
                }
            }
        }
    }

    private void checkInternalOrg(boolean internalOrg, Map<String, Object> pubBatchModifyEntityFieldSaveIsCheckMap) {
        if (internalOrg) {
            if (pubBatchModifyEntityFieldSaveIsCheckMap.containsKey("currency")) {
                throw new CoreDocBusinessException(CoreDocBusinessErrorEnum.MERCHANT_MODIFY_AGENT_CURRENCY_ERROR);
            }
            if (pubBatchModifyEntityFieldSaveIsCheckMap.containsKey("bank")) {
                throw new CoreDocBusinessException(CoreDocBusinessErrorEnum.MERCHANT_MODIFY_AGENT_BANK_ERROR);
            }
            if (pubBatchModifyEntityFieldSaveIsCheckMap.containsKey("openBank")) {
                throw new CoreDocBusinessException(CoreDocBusinessErrorEnum.MERCHANT_MODIFY_AGENT_OPEN_BANK_ERROR);
            }
            if (pubBatchModifyEntityFieldSaveIsCheckMap.containsKey("bankAccount")) {
                throw new CoreDocBusinessException(CoreDocBusinessErrorEnum.MERCHANT_MODIFY_AGENT_BANK_ACCOUNT_ERROR);
            }
            if (pubBatchModifyEntityFieldSaveIsCheckMap.containsKey("accountType")) {
                throw new CoreDocBusinessException(CoreDocBusinessErrorEnum.MERCHANT_MODIFY_AGENT_BANK_ACCOUNT_ERROR);
            }
        }
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private void initAgentFinancial(List<AgentFinancial> agentFinancialInDbList, AgentFinancial agentFinancial, Map<String, Object> pubBatchModifyEntityFieldSaveIsCheckMap) {
        if (pubBatchModifyEntityFieldSaveIsCheckMap.containsKey("currency")) {
            if (!ObjectUtils.isEmpty((Object)pubBatchModifyEntityFieldSaveIsCheckMap.get("currency"))) {
                agentFinancial.setCurrency(String.valueOf(pubBatchModifyEntityFieldSaveIsCheckMap.get("currency")));
            } else {
                agentFinancial.setCurrency(null);
            }
        } else if (agentFinancialInDbList.get(0).getCurrency() != null) {
            agentFinancial.setCurrency(agentFinancialInDbList.get(0).getCurrency());
        }
        if (pubBatchModifyEntityFieldSaveIsCheckMap.containsKey("bank")) {
            if (!ObjectUtils.isEmpty((Object)pubBatchModifyEntityFieldSaveIsCheckMap.get("bank"))) {
                agentFinancial.setBank(String.valueOf(pubBatchModifyEntityFieldSaveIsCheckMap.get("bank")));
            } else {
                agentFinancial.setBank(null);
            }
        } else if (agentFinancialInDbList.get(0).getBank() != null) {
            agentFinancial.setBank(agentFinancialInDbList.get(0).getBank());
        }
        if (pubBatchModifyEntityFieldSaveIsCheckMap.containsKey("openBank")) {
            if (ObjectUtils.isEmpty((Object)pubBatchModifyEntityFieldSaveIsCheckMap.get("openBank"))) throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_801488);
            agentFinancial.setOpenBank(String.valueOf(pubBatchModifyEntityFieldSaveIsCheckMap.get("openBank")));
        } else if (agentFinancialInDbList.get(0).getOpenBank() != null) {
            agentFinancial.setOpenBank(agentFinancialInDbList.get(0).getOpenBank());
        }
        if (pubBatchModifyEntityFieldSaveIsCheckMap.containsKey("bankAccount")) {
            if (!ObjectUtils.isEmpty((Object)pubBatchModifyEntityFieldSaveIsCheckMap.get("bankAccount"))) {
                agentFinancial.setBankAccount(String.valueOf(pubBatchModifyEntityFieldSaveIsCheckMap.get("bankAccount")));
            } else {
                agentFinancial.setBankAccount(null);
            }
        } else if (agentFinancialInDbList.get(0).getBankAccount() != null) {
            agentFinancial.setBankAccount(agentFinancialInDbList.get(0).getBankAccount());
        }
        if (pubBatchModifyEntityFieldSaveIsCheckMap.containsKey("accountType")) {
            if (!ObjectUtils.isEmpty((Object)pubBatchModifyEntityFieldSaveIsCheckMap.get("accountType"))) {
                agentFinancial.setAccountType(Integer.valueOf(pubBatchModifyEntityFieldSaveIsCheckMap.get("accountType").toString()));
            } else {
                agentFinancial.setAccountType(Integer.valueOf(0));
            }
        }
        agentFinancial.setIsDefault(agentFinancialInDbList.get(0).getIsDefault());
    }

    public void supplementaryReminder(Map<String, Object> pubBatchModifyEntityFieldSaveIsCheckMap) throws Exception {
        if (pubBatchModifyEntityFieldSaveIsCheckMap.containsKey("accountType") && pubBatchModifyEntityFieldSaveIsCheckMap.get("accountType") == null) {
            throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_801448);
        }
    }

    public void checkBatchModifyEntity(BizObject bizObject) throws Exception {
        if (AppContext.getCurrentUser().getUserType() == UserType.TenantAdmin || AppContext.getCurrentUser().getUserType() == UserType.TenantEmployee) {
            QuerySchema querySchema = QuerySchema.create();
            querySchema.addSelect("currency,bank,openBank,bankAccount,isDefault,merchantId,merchantId.code as merchantCode,merchantId.name as merchantName,merchantId.createOrg as createOrg");
            QueryConditionGroup queryConditionGroup = QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"id").eq(bizObject.getId())});
            querySchema.addCondition((ConditionExpression)queryConditionGroup);
            List agentFinancialInDbList = MetaDaoHelper.queryObject((String)"aa.merchant.AgentFinancial", (QuerySchema)querySchema, null);
            if (!CollectionUtils.isEmpty((Collection)agentFinancialInDbList) && this.orgExternalQryService.judgeExternalOrg((String)AppContext.getYTenantId(), (String)((AgentFinancial)agentFinancialInDbList.get(0)).get("createOrg")).booleanValue()) {
                throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_801449);
            }
        }
    }

    public void checkBatchModifyEntityFieldSaveMap(Map<String, Object> pubBatchModifyEntityFieldSaveMap) {
        if (pubBatchModifyEntityFieldSaveMap.containsKey("accountType") && pubBatchModifyEntityFieldSaveMap.get("accountType") == null) {
            throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_801448);
        }
        if (pubBatchModifyEntityFieldSaveMap.containsKey("stopstatus") && pubBatchModifyEntityFieldSaveMap.get("stopstatus") == null) {
            throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_801435);
        }
    }

    public void extendQuerySchema(QuerySchema querySchema, PubBatchModifyEntitySaveDTO pubBatchModifyEntitySaveDTO) throws Exception {
        querySchema.addSelect("merchantId");
    }

    public void update(String fullName, BizObject newBizObjectUpdate, PubBatchModifyEntitySaveDTO pubBatchModifyEntitySaveDTO) throws Exception {
        this.principalPubBatchModifyExtHandler.addLogAndModifyAudit(fullName, newBizObjectUpdate, pubBatchModifyEntitySaveDTO);
    }
}


/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.yonyou.iuap.apdoc.coredoc.enums.CoreExtrateBusinessErrorEnum
 *  com.yonyou.iuap.apdoc.coredoc.exceptions.CoreDocBusinessException
 *  com.yonyou.iuap.ucf.common.i18n.InternationalUtils
 *  com.yonyou.ucf.mdd.common.model.ResultList
 *  com.yonyou.ucf.mdd.ext.dao.meta.MetaDaoHelper
 *  com.yonyoucloud.upc.aa.merchant.AgentFinancial
 *  com.yonyoucloud.upc.aa.merchant.erp.AgentFinancialErpDTO
 *  org.apache.commons.lang3.StringUtils
 *  org.imeta.orm.base.BizObject
 *  org.imeta.orm.base.EntityStatus
 *  org.imeta.orm.schema.ConditionExpression
 *  org.imeta.orm.schema.QueryCondition
 *  org.imeta.orm.schema.QueryConditionGroup
 *  org.imeta.orm.schema.QuerySchema
 *  org.imeta.spring.support.id.IdManager
 *  org.slf4j.Logger
 *  org.slf4j.LoggerFactory
 *  org.springframework.stereotype.Service
 *  org.springframework.util.CollectionUtils
 */
package com.yonyoucloud.upc.service.erp;

import com.yonyou.iuap.apdoc.coredoc.enums.CoreExtrateBusinessErrorEnum;
import com.yonyou.iuap.apdoc.coredoc.exceptions.CoreDocBusinessException;
import com.yonyou.iuap.ucf.common.i18n.InternationalUtils;
import com.yonyou.ucf.mdd.common.model.ResultList;
import com.yonyou.ucf.mdd.ext.dao.meta.MetaDaoHelper;
import com.yonyoucloud.upc.aa.merchant.AgentFinancial;
import com.yonyoucloud.upc.aa.merchant.erp.AgentFinancialErpDTO;
import java.text.SimpleDateFormat;
import java.util.Collection;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.apache.commons.lang3.StringUtils;
import org.imeta.orm.base.BizObject;
import org.imeta.orm.base.EntityStatus;
import org.imeta.orm.schema.ConditionExpression;
import org.imeta.orm.schema.QueryCondition;
import org.imeta.orm.schema.QueryConditionGroup;
import org.imeta.orm.schema.QuerySchema;
import org.imeta.spring.support.id.IdManager;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;

@Service
public class SyncMerchantToErpServiceImpl {
    Logger logger = LoggerFactory.getLogger(SyncMerchantToErpServiceImpl.class);

    public ResultList syncAgentFinancialForNcc(List<AgentFinancialErpDTO> agentFinancialErpDTOList) {
        ResultList result = new ResultList();
        result.setCount(agentFinancialErpDTOList.size());
        int sucessCount = 0;
        int failCount = 0;
        for (AgentFinancialErpDTO agentFinancialErpDTO : agentFinancialErpDTOList) {
            try {
                AgentFinancial agentFinancial = this.getAgentFinancial(agentFinancialErpDTO);
                this.checkSyncAgentFinancialForNcc(agentFinancial);
                if (agentFinancial.getEntityStatus() == EntityStatus.Insert) {
                    MetaDaoHelper.insert((String)"aa.merchant.AgentFinancial", (BizObject)agentFinancial);
                } else if (agentFinancial.getEntityStatus() == EntityStatus.Update) {
                    MetaDaoHelper.update((String)"aa.merchant.AgentFinancial", (BizObject)agentFinancial);
                }
                ++sucessCount;
                result.addInfo((Object)agentFinancial);
            }
            catch (Exception e) {
                this.logger.error("syncAgentFinancialForNcc\u5f02\u5e38\u4fe1\u606f:", (Throwable)e);
                ++failCount;
                String errorMessage = InternationalUtils.getMessageWithDefault((String)"UID:P_COREDOC-BE_179F62860408090E", (String)"\u62a5\u9519\u539f\u56e0\uff1a") + e.getLocalizedMessage();
                result.addMessage(this.buildMessage(agentFinancialErpDTO, errorMessage));
            }
        }
        result.setSucessCount(sucessCount);
        result.setFailCount(failCount);
        return result;
    }

    public void checkSyncAgentFinancialForNcc(AgentFinancial agentFinancial) throws Exception {
        List originAgentFinancialList;
        QuerySchema querySchema;
        if (agentFinancial.getId() == null) {
            querySchema = QuerySchema.create();
            querySchema.addSelect("id");
            querySchema.addCondition((ConditionExpression)QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"erpCode").eq((Object)agentFinancial.getErpCode()), QueryCondition.name((String)"merchantId").eq((Object)agentFinancial.getMerchantId())}));
            originAgentFinancialList = MetaDaoHelper.queryObject((String)"aa.merchant.AgentFinancial", (QuerySchema)querySchema, null);
            if (!CollectionUtils.isEmpty((Collection)originAgentFinancialList)) {
                agentFinancial.setId(((AgentFinancial)originAgentFinancialList.get(0)).getId());
                agentFinancial.setEntityStatus(EntityStatus.Update);
            } else {
                agentFinancial.setId((Object)IdManager.getInstance().nextId());
                agentFinancial.setEntityStatus(EntityStatus.Insert);
            }
        }
        if (agentFinancial.getIsDefault() != null) {
            querySchema = QuerySchema.create();
            querySchema.addSelect("id");
            querySchema.addCondition((ConditionExpression)QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"id").not_eq(agentFinancial.getId()), QueryCondition.name((String)"merchantId").eq((Object)agentFinancial.getMerchantId()), QueryCondition.name((String)"isDefault").eq((Object)true)}));
            originAgentFinancialList = MetaDaoHelper.queryObject((String)"aa.merchant.AgentFinancial", (QuerySchema)querySchema, null);
            if (!CollectionUtils.isEmpty((Collection)originAgentFinancialList)) {
                if (agentFinancial.getIsDefault().booleanValue()) {
                    for (AgentFinancial originAgentFinancial : originAgentFinancialList) {
                        originAgentFinancial.setIsDefault(Boolean.valueOf(false));
                        originAgentFinancial.setEntityStatus(EntityStatus.Update);
                    }
                    MetaDaoHelper.update((String)"aa.merchant.AgentFinancial", (List)originAgentFinancialList);
                }
            } else if (!agentFinancial.getIsDefault().booleanValue()) {
                agentFinancial.setIsDefault(Boolean.valueOf(true));
            }
        }
        if (agentFinancial.getCurrency() != null && agentFinancial.getBank() != null && agentFinancial.getBankAccount() != null && agentFinancial.getOpenBank() != null) {
            querySchema = QuerySchema.create();
            querySchema.addSelect("id");
            querySchema.addCondition((ConditionExpression)QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"id").not_eq(agentFinancial.getId()), QueryCondition.name((String)"merchantId").eq((Object)agentFinancial.getMerchantId()), QueryCondition.name((String)"currency").eq((Object)agentFinancial.getCurrency()), QueryCondition.name((String)"bank").eq((Object)agentFinancial.getBank()), QueryCondition.name((String)"bankAccount").eq((Object)agentFinancial.getBankAccount()), QueryCondition.name((String)"openBank").eq((Object)agentFinancial.getOpenBank())}));
            originAgentFinancialList = MetaDaoHelper.queryObject((String)"aa.merchant.AgentFinancial", (QuerySchema)querySchema, null);
            if (!CollectionUtils.isEmpty((Collection)originAgentFinancialList)) {
                throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_801482, new Object[]{agentFinancial.getErpCode()});
            }
        }
    }

    public AgentFinancial getAgentFinancial(AgentFinancialErpDTO agentFinancialErpDTO) throws Exception {
        AgentFinancial agentFinancial = new AgentFinancial();
        if (StringUtils.isEmpty((CharSequence)agentFinancialErpDTO.getErpCode())) {
            throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_801483);
        }
        agentFinancial.setErpCode(agentFinancialErpDTO.getErpCode());
        if (agentFinancialErpDTO.getMerchantId() == null) {
            throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_801484);
        }
        agentFinancial.setMerchantId(agentFinancialErpDTO.getMerchantId());
        if (!StringUtils.isEmpty((CharSequence)agentFinancialErpDTO.getCountryId())) {
            agentFinancial.setCountry(agentFinancialErpDTO.getCountryId());
        } else if (!StringUtils.isEmpty((CharSequence)agentFinancialErpDTO.getCountryName())) {
            agentFinancial.set("country_name", (Object)agentFinancialErpDTO.getCountryName());
        }
        if (agentFinancialErpDTO.getProvinceId() != null) {
            agentFinancial.setProvince(agentFinancialErpDTO.getProvinceId());
        } else if (!StringUtils.isEmpty((CharSequence)agentFinancialErpDTO.getProvinceCode())) {
            agentFinancial.set("province_code", (Object)agentFinancialErpDTO.getProvinceCode());
        }
        if (!StringUtils.isEmpty((CharSequence)agentFinancialErpDTO.getCurrencyId())) {
            agentFinancial.setCurrency(agentFinancialErpDTO.getCurrencyId());
        } else if (!StringUtils.isEmpty((CharSequence)agentFinancialErpDTO.getCurrencyName())) {
            agentFinancial.set("currency_name", (Object)agentFinancialErpDTO.getCurrencyName());
        } else {
            throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_801485);
        }
        if (StringUtils.isEmpty((CharSequence)agentFinancialErpDTO.getAccountType())) {
            throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_801486);
        }
        agentFinancial.setAccountType(Integer.valueOf(Integer.parseInt(agentFinancialErpDTO.getAccountType())));
        if (!StringUtils.isEmpty((CharSequence)agentFinancialErpDTO.getBankId())) {
            agentFinancial.setBank(agentFinancialErpDTO.getBankId());
        } else if (!StringUtils.isEmpty((CharSequence)agentFinancialErpDTO.getBankName())) {
            agentFinancial.set("bank_name", (Object)agentFinancialErpDTO.getBankName());
        } else {
            throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_801487);
        }
        if (!StringUtils.isEmpty((CharSequence)agentFinancialErpDTO.getOpenBankId())) {
            agentFinancial.setOpenBank(agentFinancialErpDTO.getOpenBankId());
        } else if (!StringUtils.isEmpty((CharSequence)agentFinancialErpDTO.getOpenBankName())) {
            agentFinancial.set("openBank_name", (Object)agentFinancialErpDTO.getOpenBankName());
        } else {
            throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_801488);
        }
        if (StringUtils.isEmpty((CharSequence)agentFinancialErpDTO.getBankAccount())) {
            throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_801489);
        }
        agentFinancial.setBankAccount(agentFinancialErpDTO.getBankAccount());
        if (StringUtils.isEmpty((CharSequence)agentFinancialErpDTO.getBankAccountName())) {
            throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_801490);
        }
        agentFinancial.set("bankAccountName", (Object)agentFinancialErpDTO.getBankAccountName());
        if (!StringUtils.isEmpty((CharSequence)agentFinancialErpDTO.getJointLineNo())) {
            agentFinancial.setJointLineNo(agentFinancialErpDTO.getJointLineNo());
        }
        if (!StringUtils.isEmpty((CharSequence)agentFinancialErpDTO.getRemarks())) {
            agentFinancial.setRemarks(agentFinancialErpDTO.getRemarks());
        }
        if (!StringUtils.isEmpty((CharSequence)agentFinancialErpDTO.getAccountOpeningAddress())) {
            agentFinancial.set("accountOpeningAddress", (Object)agentFinancialErpDTO.getAccountOpeningAddress());
        }
        if (!StringUtils.isEmpty((CharSequence)agentFinancialErpDTO.getAccountOpeningDate())) {
            try {
                SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
                Date accountOpeningDate = sdf.parse(agentFinancialErpDTO.getAccountOpeningDate());
                agentFinancial.set("accountOpeningDate", (Object)accountOpeningDate);
            }
            catch (Exception e) {
                throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_801491);
            }
        }
        if (agentFinancialErpDTO.getAgentFinancialDefault() != null) {
            agentFinancial.setIsDefault(agentFinancialErpDTO.getAgentFinancialDefault());
        } else {
            agentFinancial.setIsDefault(Boolean.valueOf(false));
        }
        if (!CollectionUtils.isEmpty((Map)agentFinancialErpDTO.getAgentFinancialCharacter())) {
            agentFinancial.put("agentFinancialCharacter", (Object)agentFinancialErpDTO.getAgentFinancialCharacter());
        }
        return agentFinancial;
    }

    private Map<String, Object> buildMessage(AgentFinancialErpDTO agentFinancialErpDTO, String msg) {
        HashMap<String, Object> message = new HashMap<String, Object>();
        message.put("message", msg);
        message.put("key", agentFinancialErpDTO.getErpCode());
        return message;
    }
}


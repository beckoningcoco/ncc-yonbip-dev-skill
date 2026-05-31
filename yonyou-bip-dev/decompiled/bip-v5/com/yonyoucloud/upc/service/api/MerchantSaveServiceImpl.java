/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.alibaba.fastjson.JSON
 *  com.yonyou.cloud.middleware.rpc.RemoteCall
 *  com.yonyou.iuap.apdoc.coredoc.enums.CoreDocBusinessErrorEnum
 *  com.yonyou.iuap.apdoc.coredoc.enums.CoreExtrateBusinessErrorEnum
 *  com.yonyou.iuap.apdoc.coredoc.exceptions.CoreDocBusinessException
 *  com.yonyou.iuap.data.service.itf.OrgExternalQryService
 *  com.yonyou.iuap.ucf.common.i18n.InternationalUtils
 *  com.yonyou.ucf.mdd.ext.bill.dto.BillDataDto
 *  com.yonyou.ucf.mdd.ext.bill.rule.common.ResultList
 *  com.yonyou.ucf.mdd.ext.core.AppContext
 *  com.yonyou.ucf.mdd.ext.dao.meta.MetaDaoHelper
 *  com.yonyou.ucf.mdd.ext.util.ResultMessage
 *  com.yonyoucloud.iuap.upc.api.IMerchantSaveService
 *  com.yonyoucloud.iuap.upc.api.IMerchantServiceV2
 *  com.yonyoucloud.iuap.upc.dto.AddressInfoDTO
 *  com.yonyoucloud.iuap.upc.dto.AgentFinancialDTO
 *  com.yonyoucloud.iuap.upc.dto.AgentFinancialQryDTO
 *  com.yonyoucloud.iuap.upc.dto.AgentInvoiceQryDTO
 *  com.yonyoucloud.iuap.upc.dto.MerchantAllocateOrgDTO
 *  com.yonyoucloud.iuap.upc.dto.MerchantDTO
 *  com.yonyoucloud.iuap.upc.dto.MerchantInvoiceDTO
 *  com.yonyoucloud.iuap.upc.dto.ResultMessageDTO
 *  com.yonyoucloud.iuap.upc.dto.ext.UPCEntityStatus
 *  com.yonyoucloud.upc.aa.merchant.AddressInfo
 *  com.yonyoucloud.upc.aa.merchant.AgentFinancial
 *  com.yonyoucloud.upc.aa.merchant.AgentInvoice
 *  com.yonyoucloud.upc.aa.merchant.Merchant
 *  com.yonyoucloud.upc.utils.MerchantUtils
 *  com.yonyoucloud.upc.utils.UPCResultConverter
 *  org.imeta.orm.base.BizObject
 *  org.imeta.orm.base.EntityStatus
 *  org.imeta.orm.schema.ConditionExpression
 *  org.imeta.orm.schema.QueryCondition
 *  org.imeta.orm.schema.QueryConditionGroup
 *  org.imeta.orm.schema.QuerySchema
 *  org.imeta.spring.support.id.IdManager
 *  org.slf4j.Logger
 *  org.slf4j.LoggerFactory
 *  org.springframework.beans.factory.annotation.Autowired
 *  org.springframework.stereotype.Service
 *  org.springframework.util.CollectionUtils
 */
package com.yonyoucloud.upc.service.api;

import com.alibaba.fastjson.JSON;
import com.yonyou.cloud.middleware.rpc.RemoteCall;
import com.yonyou.iuap.apdoc.coredoc.enums.CoreDocBusinessErrorEnum;
import com.yonyou.iuap.apdoc.coredoc.enums.CoreExtrateBusinessErrorEnum;
import com.yonyou.iuap.apdoc.coredoc.exceptions.CoreDocBusinessException;
import com.yonyou.iuap.data.service.itf.OrgExternalQryService;
import com.yonyou.iuap.ucf.common.i18n.InternationalUtils;
import com.yonyou.ucf.mdd.ext.bill.dto.BillDataDto;
import com.yonyou.ucf.mdd.ext.bill.rule.common.ResultList;
import com.yonyou.ucf.mdd.ext.core.AppContext;
import com.yonyou.ucf.mdd.ext.dao.meta.MetaDaoHelper;
import com.yonyou.ucf.mdd.ext.util.ResultMessage;
import com.yonyoucloud.iuap.upc.api.IMerchantSaveService;
import com.yonyoucloud.iuap.upc.api.IMerchantServiceV2;
import com.yonyoucloud.iuap.upc.api.service.IUPCBillService;
import com.yonyoucloud.iuap.upc.dto.AddressInfoDTO;
import com.yonyoucloud.iuap.upc.dto.AgentFinancialDTO;
import com.yonyoucloud.iuap.upc.dto.AgentFinancialQryDTO;
import com.yonyoucloud.iuap.upc.dto.AgentInvoiceQryDTO;
import com.yonyoucloud.iuap.upc.dto.MerchantAllocateOrgDTO;
import com.yonyoucloud.iuap.upc.dto.MerchantDTO;
import com.yonyoucloud.iuap.upc.dto.MerchantInvoiceDTO;
import com.yonyoucloud.iuap.upc.dto.ResultMessageDTO;
import com.yonyoucloud.iuap.upc.dto.ext.UPCEntityStatus;
import com.yonyoucloud.upc.aa.merchant.AddressInfo;
import com.yonyoucloud.upc.aa.merchant.AgentFinancial;
import com.yonyoucloud.upc.aa.merchant.AgentInvoice;
import com.yonyoucloud.upc.aa.merchant.Merchant;
import com.yonyoucloud.upc.service.api.AddMerchantSuitBizService;
import com.yonyoucloud.upc.utils.MerchantUtils;
import com.yonyoucloud.upc.utils.UPCResultConverter;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.imeta.orm.base.BizObject;
import org.imeta.orm.base.EntityStatus;
import org.imeta.orm.schema.ConditionExpression;
import org.imeta.orm.schema.QueryCondition;
import org.imeta.orm.schema.QueryConditionGroup;
import org.imeta.orm.schema.QuerySchema;
import org.imeta.spring.support.id.IdManager;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;

@Service
@RemoteCall(value="productcenter@c87e2267-1001-4c70-bb2a-ab41f3b81aa3")
public class MerchantSaveServiceImpl
implements IMerchantSaveService {
    private static final Logger log = LoggerFactory.getLogger(MerchantSaveServiceImpl.class);
    Logger logger = LoggerFactory.getLogger(MerchantSaveServiceImpl.class);
    @Autowired
    IMerchantServiceV2 merchantService;
    @Autowired
    IUPCBillService upcBillService;
    @Autowired
    AddMerchantSuitBizService addMerchantSuitBizService;
    @Autowired
    OrgExternalQryService orgExternalQryService;

    public Object saveAddress(AddressInfoDTO addressInfoDTO) throws Exception {
        QuerySchema schemaId;
        QueryConditionGroup queryConditionGroup;
        AddressInfo addressInfo = new AddressInfo();
        if (addressInfoDTO == null) {
            throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_801101);
        }
        addressInfo.init((Map)JSON.parseObject((String)JSON.toJSONString((Object)addressInfoDTO), Map.class));
        if (addressInfo.getMerchantId() == null) {
            throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_801102);
        }
        if (addressInfo.getAddressCode() == null) {
            throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_801103);
        }
        if (addressInfo.getEntityStatus() == null) {
            throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_801104);
        }
        if (addressInfo.getEntityStatus() == EntityStatus.Update && addressInfo.getId() == null) {
            throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_801105);
        }
        if (addressInfo.getEntityStatus() == EntityStatus.Delete) {
            if (addressInfo.getId() == null) {
                throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_801106);
            }
            queryConditionGroup = QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"merchantId").eq((Object)addressInfo.getMerchantId()), QueryCondition.name((String)"isDefault").eq((Object)true), QueryCondition.name((String)"id").eq(addressInfo.getId())});
            schemaId = QuerySchema.create().addSelect("id").addCondition((ConditionExpression)queryConditionGroup);
            List bizObjectList = MetaDaoHelper.queryObject((String)"aa.merchant.AddressInfo", (QuerySchema)schemaId, null);
            if (!CollectionUtils.isEmpty((Collection)bizObjectList)) {
                throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_801107);
            }
        }
        if (addressInfo.getEntityStatus() == EntityStatus.Insert && addressInfo.getId() == null) {
            addressInfo.setId((Object)IdManager.getInstance().nextId());
        }
        if (addressInfo.getIsDefault() == null) {
            addressInfo.setIsDefault(Boolean.valueOf(false));
        }
        if (addressInfo.getEntityStatus() == EntityStatus.Delete) {
            MetaDaoHelper.delete((String)"aa.merchant.AddressInfo", (BizObject)addressInfo);
            return addressInfo;
        }
        queryConditionGroup = QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"merchantId").eq((Object)addressInfo.getMerchantId()), QueryCondition.name((String)"addressCode").eq((Object)addressInfo.getAddressCode()), QueryCondition.name((String)"id").not_eq(addressInfo.getId())});
        schemaId = QuerySchema.create().addSelect("id").addCondition((ConditionExpression)queryConditionGroup);
        List addressCode = MetaDaoHelper.queryObject((String)"aa.merchant.AddressInfo", (QuerySchema)schemaId, null);
        if (!CollectionUtils.isEmpty((Collection)addressCode)) {
            throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_801108);
        }
        queryConditionGroup = QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"merchantId").eq((Object)addressInfo.getMerchantId()), QueryCondition.name((String)"isDefault").eq((Object)true), QueryCondition.name((String)"id").not_eq(addressInfo.getId())});
        schemaId = QuerySchema.create().addSelect("id").addCondition((ConditionExpression)queryConditionGroup);
        List bizObjectList = MetaDaoHelper.queryObject((String)"aa.merchant.AddressInfo", (QuerySchema)schemaId, null);
        if (!CollectionUtils.isEmpty((Collection)bizObjectList) && addressInfoDTO.getIsDefault().booleanValue()) {
            bizObjectList.forEach(address -> {
                address.put("isDefault", (Object)false);
                address.setEntityStatus(EntityStatus.Update);
            });
            MetaDaoHelper.update((String)"aa.merchant.AddressInfo", (List)bizObjectList);
        } else if (CollectionUtils.isEmpty((Collection)bizObjectList) && !addressInfo.getIsDefault().booleanValue()) {
            boolean merchantNeedDefaultAddress;
            queryConditionGroup = QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"id").eq((Object)addressInfo.getMerchantId())});
            schemaId = QuerySchema.create().addSelect("code").addCondition((ConditionExpression)queryConditionGroup);
            List merchantInDbList = MetaDaoHelper.queryObject((String)"aa.merchant.Merchant", (QuerySchema)schemaId, null);
            String code = addressInfo.getMerchantId().toString();
            if (!CollectionUtils.isEmpty((Collection)merchantInDbList)) {
                code = ((Merchant)merchantInDbList.get(0)).getCode();
            }
            if (merchantNeedDefaultAddress = MerchantUtils.getMerchantNeedDefault((String)"customerNeedDefaultAddress")) {
                throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_801109, new Object[]{code});
            }
        }
        if (addressInfo.getEntityStatus() == EntityStatus.Insert) {
            MetaDaoHelper.insert((String)"aa.merchant.AddressInfo", (BizObject)addressInfo);
        } else if (addressInfo.getEntityStatus() == EntityStatus.Update) {
            MetaDaoHelper.update((String)"aa.merchant.AddressInfo", (BizObject)addressInfo);
        }
        return addressInfo;
    }

    public AgentFinancialDTO saveOrUpdateAgentFinancial(AgentFinancialDTO agentFinancialDTO) throws Exception {
        if (agentFinancialDTO == null) {
            throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_801110);
        }
        if (agentFinancialDTO.getMerchantId() == null) {
            throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_801111);
        }
        if (agentFinancialDTO.getEntityStatus() == null) {
            throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_801112);
        }
        if (UPCResultConverter.entityStatusConvert((UPCEntityStatus)agentFinancialDTO.getEntityStatus()) == EntityStatus.Update && agentFinancialDTO.getId() == null) {
            throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_801113);
        }
        if (agentFinancialDTO.getIsDefault() != null && agentFinancialDTO.getIsDefault().booleanValue()) {
            AgentFinancialQryDTO agentFinancialQryDTO = new AgentFinancialQryDTO();
            agentFinancialQryDTO.setMerchantId(agentFinancialDTO.getMerchantId());
            agentFinancialQryDTO.setIfDefault(Boolean.valueOf(true));
            agentFinancialQryDTO.setFields(new String[]{"id"});
            List agentFinancialDTOS = this.merchantService.listMerchantAgentFinancial(agentFinancialQryDTO);
            if (agentFinancialDTOS != null && agentFinancialDTOS.size() > 0) {
                AgentFinancial OldAgentFinancial = new AgentFinancial();
                OldAgentFinancial.setIsDefault(Boolean.valueOf(false));
                OldAgentFinancial.setEntityStatus(EntityStatus.Update);
                for (AgentFinancialDTO dto : agentFinancialDTOS) {
                    OldAgentFinancial.setId((Object)dto.getId());
                    MetaDaoHelper.update((String)"aa.merchant.AgentFinancial", (BizObject)OldAgentFinancial);
                }
            }
        }
        AgentFinancial agentFinancial = new AgentFinancial();
        agentFinancial.init((Map)JSON.parseObject((String)JSON.toJSONString((Object)agentFinancialDTO), Map.class));
        if (agentFinancialDTO.getStopStatus() != null) {
            agentFinancial.setStopstatus(agentFinancialDTO.getStopStatus());
        } else {
            agentFinancial.setStopstatus(Boolean.valueOf(false));
        }
        if (UPCResultConverter.entityStatusConvert((UPCEntityStatus)agentFinancialDTO.getEntityStatus()) == EntityStatus.Insert) {
            agentFinancial.setId((Object)IdManager.getInstance().nextId());
            MetaDaoHelper.insert((String)"aa.merchant.AgentFinancial", (BizObject)agentFinancial);
            agentFinancialDTO.setId((Long)agentFinancial.getId());
        } else if (UPCResultConverter.entityStatusConvert((UPCEntityStatus)agentFinancialDTO.getEntityStatus()) == EntityStatus.Update) {
            agentFinancial.setEntityStatus(EntityStatus.Update);
            MetaDaoHelper.update((String)"aa.merchant.AgentFinancial", (BizObject)agentFinancial);
        } else {
            throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_801114);
        }
        return agentFinancialDTO;
    }

    public MerchantInvoiceDTO saveOrUpdateMerchantInvoice(MerchantInvoiceDTO merchantInvoiceDTO) throws Exception {
        if (merchantInvoiceDTO == null) {
            throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_801115);
        }
        if (merchantInvoiceDTO.getMerchantId() == null) {
            throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_801111);
        }
        if (merchantInvoiceDTO.getEntityStatus() == null) {
            throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_801112);
        }
        if (UPCResultConverter.entityStatusConvert((UPCEntityStatus)merchantInvoiceDTO.getEntityStatus()) == EntityStatus.Update && merchantInvoiceDTO.getId() == null) {
            throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_801113);
        }
        AgentInvoiceQryDTO agentInvoiceQryDTO = new AgentInvoiceQryDTO();
        agentInvoiceQryDTO.setFields(new String[]{"id"});
        agentInvoiceQryDTO.setMerchantId(merchantInvoiceDTO.getMerchantId());
        agentInvoiceQryDTO.setDefaultInvoice(Boolean.valueOf(true));
        List merchantInvoiceDTOS = this.merchantService.listMerchantAgentInvoice(agentInvoiceQryDTO);
        if (merchantInvoiceDTO.getDefaultInvoice() != null && merchantInvoiceDTO.getDefaultInvoice().booleanValue() && merchantInvoiceDTOS != null && merchantInvoiceDTOS.size() > 0) {
            AgentInvoice OldAgentInvoice = new AgentInvoice();
            OldAgentInvoice.setIsDefault(Boolean.valueOf(false));
            OldAgentInvoice.setEntityStatus(EntityStatus.Update);
            for (MerchantInvoiceDTO dto : merchantInvoiceDTOS) {
                OldAgentInvoice.setId((Object)dto.getId());
                MetaDaoHelper.update((String)"aa.merchant.AgentInvoice", (BizObject)OldAgentInvoice);
            }
        }
        AgentInvoice agentInvoice = new AgentInvoice();
        agentInvoice.init((Map)JSON.parseObject((String)JSON.toJSONString((Object)merchantInvoiceDTO), Map.class));
        if (merchantInvoiceDTO.getDefaultInvoice() != null) {
            agentInvoice.setIsDefault(merchantInvoiceDTO.getDefaultInvoice());
        } else {
            agentInvoice.setIsDefault(Boolean.valueOf(false));
        }
        boolean merchantNeedDefaultInvoice = MerchantUtils.getMerchantNeedDefault((String)"customerNeedDefaultInvoice");
        if (merchantNeedDefaultInvoice && !agentInvoice.getIsDefault().booleanValue()) {
            Long id;
            if (merchantInvoiceDTOS == null || merchantInvoiceDTOS.size() == 0) {
                throw new CoreDocBusinessException(CoreDocBusinessErrorEnum.MERCHANT_SAVE_INVOICE_KEY);
            }
            if (merchantInvoiceDTOS.get(0) != null && agentInvoice.getId() != null && (id = ((MerchantInvoiceDTO)merchantInvoiceDTOS.get(0)).getId()) != null && id.equals(agentInvoice.getId())) {
                throw new CoreDocBusinessException(CoreDocBusinessErrorEnum.MERCHANT_SAVE_INVOICE_KEY);
            }
        }
        if (merchantNeedDefaultInvoice && !agentInvoice.getIsDefault().booleanValue() && (merchantInvoiceDTOS == null || merchantInvoiceDTOS.size() == 0)) {
            throw new CoreDocBusinessException(CoreDocBusinessErrorEnum.MERCHANT_SAVE_INVOICE_KEY);
        }
        if (UPCResultConverter.entityStatusConvert((UPCEntityStatus)merchantInvoiceDTO.getEntityStatus()) == EntityStatus.Insert) {
            agentInvoice.setId((Object)IdManager.getInstance().nextId());
            MetaDaoHelper.insert((String)"aa.merchant.AgentInvoice", (BizObject)agentInvoice);
            merchantInvoiceDTO.setId((Long)agentInvoice.getId());
        } else if (UPCResultConverter.entityStatusConvert((UPCEntityStatus)merchantInvoiceDTO.getEntityStatus()) == EntityStatus.Update) {
            agentInvoice.setEntityStatus(EntityStatus.Update);
            MetaDaoHelper.update((String)"aa.merchant.AgentInvoice", (BizObject)agentInvoice);
        } else {
            throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_801114);
        }
        return merchantInvoiceDTO;
    }

    public ResultMessageDTO saveMerchantAllocateOrg(MerchantAllocateOrgDTO merchantAllocateOrgDTO) throws Exception {
        return this.saveMerchantAllocateCommon(merchantAllocateOrgDTO, false, 1);
    }

    public ResultMessageDTO saveMerchantAllocateShop(MerchantAllocateOrgDTO merchantAllocateOrgDTO) throws Exception {
        return this.saveMerchantAllocateCommon(merchantAllocateOrgDTO, true, 3);
    }

    private ResultMessageDTO saveMerchantAllocateCommon(MerchantAllocateOrgDTO merchantAllocateOrgDTO, Boolean shop, Integer rangeType) throws Exception {
        ResultMessageDTO resultMessageDTO;
        if (merchantAllocateOrgDTO == null) {
            throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_801116);
        }
        if (merchantAllocateOrgDTO.getMerchantId() == null) {
            throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_801117);
        }
        if (CollectionUtils.isEmpty((Collection)merchantAllocateOrgDTO.getOrgIds())) {
            throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_801118);
        }
        MerchantDTO merchantDTO = this.merchantService.getMerchantById(merchantAllocateOrgDTO.getMerchantId(), new String[]{"merchantApplyRangeId", "createOrg"});
        if (merchantDTO == null || merchantDTO.getMerchantApplyRangeId() == null) {
            throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_801119, new Object[]{merchantAllocateOrgDTO.getMerchantId()});
        }
        if (merchantDTO != null && !shop.booleanValue() && merchantDTO.getCreateOrg() != null) {
            shop = this.orgExternalQryService.judgeExternalOrg((String)AppContext.getYTenantId(), merchantDTO.getCreateOrg());
        }
        HashMap<String, Object> dataMap = new HashMap<String, Object>();
        dataMap.put("merchantId", merchantAllocateOrgDTO.getMerchantId());
        dataMap.put("orgIds", merchantAllocateOrgDTO.getOrgIds());
        dataMap.put("merchantApplyRangeId", merchantDTO.getMerchantApplyRangeId());
        dataMap.put("isTradeCustomers", merchantAllocateOrgDTO.getIsTradeCustomers());
        dataMap.put("stopStatus", merchantAllocateOrgDTO.getStopStatus());
        dataMap.put("data_from", "udh");
        if (shop.booleanValue()) {
            resultMessageDTO = this.addMerchantSuitBizService.saveMerchantAllocateCommon(dataMap, true, rangeType, merchantAllocateOrgDTO.getIsTradeCustomers(), merchantAllocateOrgDTO.getStopStatus());
        } else {
            ArrayList<HashMap<String, Object>> data = new ArrayList<HashMap<String, Object>>();
            data.add(dataMap);
            BillDataDto bill = new BillDataDto();
            bill.setBillnum("aa_merchantlist");
            bill.setAction("addmerchantsuitorg");
            bill.setData(data);
            ResultList resultList = this.upcBillService.batchDo(bill);
            resultMessageDTO = (ResultMessageDTO)JSON.parseObject((String)ResultMessage.data((Object)resultList), ResultMessageDTO.class);
        }
        return resultMessageDTO;
    }

    public ResultMessageDTO setMerchantChannelLevel(MerchantDTO merchantDTO) {
        ResultMessageDTO resultMessageDTO = new ResultMessageDTO();
        resultMessageDTO.setData((Object)merchantDTO);
        if (merchantDTO.getId() == null) {
            resultMessageDTO.setCode((Number)400);
            resultMessageDTO.setMessage(InternationalUtils.getMessageWithDefault((String)"UID:P_COREDOC-BE_179F6286040805D4", (String)"id\u4e0d\u80fd\u4e3a\u7a7a"));
            return resultMessageDTO;
        }
        try {
            Merchant merchant = new Merchant();
            merchant.setId((Object)merchantDTO.getId());
            merchant.setMaxChannelLevel(merchantDTO.getMaxChannelLevel());
            merchant.setMiniChannelLevel(merchantDTO.getMiniChannelLevel());
            merchant.setEntityStatus(EntityStatus.Update);
            this.logger.info("setMerchantChannelLevel_parameter:{}", (Object)merchant);
            MetaDaoHelper.update((String)"aa.merchant.Merchant", (BizObject)merchant);
            resultMessageDTO.setCode((Number)200);
            resultMessageDTO.setMessage(InternationalUtils.getMessageWithDefault((String)"UID:P_COREDOC-BE_179F6286040805C1", (String)"\u64cd\u4f5c\u6210\u529f!"));
            resultMessageDTO.setData((Object)merchant);
        }
        catch (Exception e) {
            resultMessageDTO.setCode((Number)999);
            resultMessageDTO.setMessage(e.getMessage());
            this.logger.error(e.getMessage());
        }
        return resultMessageDTO;
    }
}


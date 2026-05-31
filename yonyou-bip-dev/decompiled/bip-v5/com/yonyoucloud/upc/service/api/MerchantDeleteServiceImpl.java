/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.yonyou.cloud.middleware.rpc.RemoteCall
 *  com.yonyou.iuap.apdoc.coredoc.enums.CoreExtrateBusinessErrorEnum
 *  com.yonyou.iuap.apdoc.coredoc.exceptions.CoreDocBusinessException
 *  com.yonyou.ucf.mdd.ext.dao.meta.MetaDaoHelper
 *  com.yonyoucloud.iuap.upc.api.IMerchantDeleteService
 *  com.yonyoucloud.iuap.upc.dto.AgentFinancialDTO
 *  com.yonyoucloud.iuap.upc.dto.AgentFinancialQryDTO
 *  com.yonyoucloud.iuap.upc.dto.AgentInvoiceQryDTO
 *  com.yonyoucloud.iuap.upc.dto.MerchantInvoiceDTO
 *  org.slf4j.Logger
 *  org.slf4j.LoggerFactory
 *  org.springframework.beans.factory.annotation.Autowired
 *  org.springframework.stereotype.Service
 */
package com.yonyoucloud.upc.service.api;

import com.yonyou.cloud.middleware.rpc.RemoteCall;
import com.yonyou.iuap.apdoc.coredoc.enums.CoreExtrateBusinessErrorEnum;
import com.yonyou.iuap.apdoc.coredoc.exceptions.CoreDocBusinessException;
import com.yonyou.ucf.mdd.ext.dao.meta.MetaDaoHelper;
import com.yonyoucloud.iuap.upc.api.IMerchantDeleteService;
import com.yonyoucloud.iuap.upc.api.IMerchantService;
import com.yonyoucloud.iuap.upc.dto.AgentFinancialDTO;
import com.yonyoucloud.iuap.upc.dto.AgentFinancialQryDTO;
import com.yonyoucloud.iuap.upc.dto.AgentInvoiceQryDTO;
import com.yonyoucloud.iuap.upc.dto.MerchantInvoiceDTO;
import java.util.List;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@RemoteCall(value="productcenter@c87e2267-1001-4c70-bb2a-ab41f3b81aa3")
public class MerchantDeleteServiceImpl
implements IMerchantDeleteService {
    private static final Logger log = LoggerFactory.getLogger(MerchantDeleteServiceImpl.class);
    @Autowired
    IMerchantService merchantService;

    public void deleteAgentInvoice(Long id) throws Exception {
        if (id == null) {
            throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_800774);
        }
        AgentInvoiceQryDTO agentInvoiceQryDTO = new AgentInvoiceQryDTO();
        agentInvoiceQryDTO.setId(id);
        agentInvoiceQryDTO.setFields(new String[]{"id", "defaultInvoice"});
        List<MerchantInvoiceDTO> merchantInvoiceDTOS = this.merchantService.listMerchantAgentInvoice(agentInvoiceQryDTO);
        if (merchantInvoiceDTOS == null || merchantInvoiceDTOS != null && merchantInvoiceDTOS.size() == 0) {
            throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_801408);
        }
        if (merchantInvoiceDTOS.get(0).getDefaultInvoice() != null && merchantInvoiceDTOS.get(0).getDefaultInvoice().booleanValue()) {
            throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_801409);
        }
        MetaDaoHelper.delete((String)"aa.merchant.AgentInvoice", (Long)id);
    }

    public void deleteAgentFinancial(Long id) throws Exception {
        if (id == null) {
            throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_800774);
        }
        AgentFinancialQryDTO agentFinancialQryDTO = new AgentFinancialQryDTO();
        agentFinancialQryDTO.setId(id);
        agentFinancialQryDTO.setFields(new String[]{"id", "isDefault"});
        List<AgentFinancialDTO> agentFinancialDTOS = this.merchantService.listMerchantAgentFinancial(agentFinancialQryDTO);
        if (agentFinancialDTOS == null || agentFinancialDTOS != null && agentFinancialDTOS.size() == 0) {
            throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_801410);
        }
        if (agentFinancialDTOS.get(0).getIsDefault() != null && agentFinancialDTOS.get(0).getIsDefault().booleanValue()) {
            throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_801411);
        }
        MetaDaoHelper.delete((String)"aa.merchant.AgentFinancial", (Long)id);
    }
}


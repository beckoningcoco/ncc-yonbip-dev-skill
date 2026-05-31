/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.yonyou.diwork.model.ControlPointStatus
 *  com.yonyou.diwork.model.dto.ControlPointDTO
 *  com.yonyou.diwork.model.dto.LicenseDimensionDTO
 *  com.yonyou.diwork.plugin.Amount
 *  com.yonyou.diwork.plugin.AmountRequest
 *  com.yonyou.diwork.plugin.ILicensePlugin
 *  com.yonyou.diwork.plugin.LicensePluginRpcRegisterBean
 *  com.yonyou.diwork.service.ILicenseQueryService
 *  com.yonyou.iuap.apdoc.coredoc.enums.CoreExtrateBusinessErrorEnum
 *  com.yonyou.iuap.apdoc.coredoc.exceptions.CoreDocBusinessException
 *  com.yonyou.iuap.ucf.common.i18n.InternationalUtils
 *  com.yonyou.ucf.mdd.ext.core.AppContext
 *  com.yonyou.ucf.mdd.ext.dao.sql.SqlHelper
 *  com.yonyoucloud.upc.service.IUPCMerchantQueryService
 *  org.apache.commons.lang3.StringUtils
 *  org.slf4j.Logger
 *  org.slf4j.LoggerFactory
 *  org.springframework.beans.factory.annotation.Autowired
 *  org.springframework.context.annotation.Bean
 *  org.springframework.context.annotation.Configuration
 *  org.springframework.context.annotation.Lazy
 *  org.springframework.stereotype.Service
 *  org.springframework.util.CollectionUtils
 */
package com.yonyoucloud.upc.service.api;

import com.yonyou.diwork.model.ControlPointStatus;
import com.yonyou.diwork.model.dto.ControlPointDTO;
import com.yonyou.diwork.model.dto.LicenseDimensionDTO;
import com.yonyou.diwork.plugin.Amount;
import com.yonyou.diwork.plugin.AmountRequest;
import com.yonyou.diwork.plugin.ILicensePlugin;
import com.yonyou.diwork.plugin.LicensePluginRpcRegisterBean;
import com.yonyou.diwork.service.ILicenseQueryService;
import com.yonyou.iuap.apdoc.coredoc.enums.CoreExtrateBusinessErrorEnum;
import com.yonyou.iuap.apdoc.coredoc.exceptions.CoreDocBusinessException;
import com.yonyou.iuap.ucf.common.i18n.InternationalUtils;
import com.yonyou.ucf.mdd.ext.core.AppContext;
import com.yonyou.ucf.mdd.ext.dao.sql.SqlHelper;
import com.yonyoucloud.upc.service.IUPCMerchantQueryService;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;

@Service(value="myPlugin")
public class LicensePluginImpl
implements ILicensePlugin {
    private static final Logger LOGGER = LoggerFactory.getLogger(LicensePluginImpl.class);
    @Autowired
    @Lazy
    private ILicenseQueryService iLicenseQueryService;
    @Autowired
    private IUPCMerchantQueryService iupcMerchantQueryService;
    private static final String CONTROLLEPOINT_CODE = "ppm0000056160";
    private static final String LICENSEDIMENSON_CODE = "ppm0000056160";

    public Amount getUsedAmount(AmountRequest amountRequest) {
        long amount = this.calcAmount(amountRequest.getTenantId(), amountRequest.getDimensionCode());
        Amount result = new Amount();
        result.setAmount(amount);
        return result;
    }

    public long calcAmount(String tenantId, String licenseDimensionCode) {
        long amount = 0L;
        if (StringUtils.equals((CharSequence)licenseDimensionCode, (CharSequence)"ppm0000056160")) {
            ControlPointDTO controlPoint = this.iLicenseQueryService.getCurrentByCode(tenantId, "ppm0000056160");
            LOGGER.info(InternationalUtils.getMessageWithDefault((String)"UID:P_COREDOC-BE_179F62860408011F", (String)"\u8bb8\u53ef\u51ed\u8bc1\u540d\u79f0\uff1a"), (Object)controlPoint.getName());
            if (controlPoint.getStatus() == ControlPointStatus.VALID) {
                List dimensions = controlPoint.getDimensions();
                for (LicenseDimensionDTO dto : dimensions) {
                    if (!StringUtils.equals((CharSequence)dto.getCode(), (CharSequence)"ppm0000056160")) continue;
                    amount = dto.getAmount();
                    return amount;
                }
            }
            throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_801381);
        }
        HashMap<String, String> params = new HashMap<String, String>(1);
        params.put("yTenantId", AppContext.getCurrentUser().getYTenantId());
        Map result = (Map)SqlHelper.selectFirst((String)"com.yonyoucloud.upc.merchant.dao.merchantCheck.selectMerchantLicenseAmount", params);
        if (!CollectionUtils.isEmpty((Map)result)) {
            amount = Long.parseLong(result.get("useAmount").toString());
        }
        return amount;
    }

    @Configuration
    public static class pluginRpcConfiguration {
        @Bean
        public LicensePluginRpcRegisterBean myPluginRpcRegister(ILicensePlugin myPlugin) {
            return new LicensePluginRpcRegisterBean("myPlugin", myPlugin);
        }
    }
}


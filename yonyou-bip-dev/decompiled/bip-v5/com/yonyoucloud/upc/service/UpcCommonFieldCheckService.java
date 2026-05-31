/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.alibaba.fastjson.JSON
 *  com.alibaba.fastjson.JSONObject
 *  com.yonyou.iuap.apdoc.coredoc.config.YMSParamConfig
 *  com.yonyou.iuap.apdoc.coredoc.enums.CoreExtrateBusinessErrorEnum
 *  com.yonyou.iuap.apdoc.coredoc.exceptions.CoreDocBusinessException
 *  com.yonyou.iuap.context.InvocationInfoProxy
 *  com.yonyou.iuap.ucf.common.i18n.InternationalUtils
 *  com.yonyou.iuap.yms.http.YmsHttpClient
 *  com.yonyou.iuap.yms.http.YmsHttpHeader
 *  com.yonyou.iuap.yms.http.YmsHttpMethod
 *  com.yonyou.iuap.yms.http.YmsHttpRequest
 *  com.yonyou.iuap.yms.http.YmsHttpRequestBuilder
 *  com.yonyou.iuap.yms.http.YmsHttpResponse
 *  com.yonyou.ucf.mdd.common.utils.json.GsonHelper
 *  com.yonyou.ucf.mdd.ext.core.AppContext
 *  com.yonyou.ucf.mdd.ext.option.util.OptionUtils
 *  com.yonyoucloud.upc.constants.CheckDomainDeleteResultDto
 *  com.yonyoucloud.upc.coredoc.pub.CommonRestDTO
 *  org.apache.commons.lang3.StringUtils
 *  org.slf4j.Logger
 *  org.slf4j.LoggerFactory
 *  org.springframework.beans.factory.annotation.Autowired
 *  org.springframework.beans.factory.annotation.Qualifier
 *  org.springframework.stereotype.Service
 *  org.springframework.util.ObjectUtils
 */
package com.yonyoucloud.upc.service;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.yonyou.iuap.apdoc.coredoc.config.YMSParamConfig;
import com.yonyou.iuap.apdoc.coredoc.enums.CoreExtrateBusinessErrorEnum;
import com.yonyou.iuap.apdoc.coredoc.exceptions.CoreDocBusinessException;
import com.yonyou.iuap.context.InvocationInfoProxy;
import com.yonyou.iuap.ucf.common.i18n.InternationalUtils;
import com.yonyou.iuap.yms.http.YmsHttpClient;
import com.yonyou.iuap.yms.http.YmsHttpHeader;
import com.yonyou.iuap.yms.http.YmsHttpMethod;
import com.yonyou.iuap.yms.http.YmsHttpRequest;
import com.yonyou.iuap.yms.http.YmsHttpRequestBuilder;
import com.yonyou.iuap.yms.http.YmsHttpResponse;
import com.yonyou.ucf.mdd.common.utils.json.GsonHelper;
import com.yonyou.ucf.mdd.ext.core.AppContext;
import com.yonyou.ucf.mdd.ext.option.util.OptionUtils;
import com.yonyoucloud.upc.constants.CheckDomainDeleteResultDto;
import com.yonyoucloud.upc.coredoc.pub.CommonRestDTO;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import org.springframework.util.ObjectUtils;

@Service
public class UpcCommonFieldCheckService {
    Logger logger = LoggerFactory.getLogger(UpcCommonFieldCheckService.class);
    @Autowired
    @Qualifier(value="coredocYmsHttpClient")
    private YmsHttpClient ymsHttpClient;
    @Autowired
    private YMSParamConfig ymsParamConfig;

    public void fieldSePmProRefCheck(String fullname, List<String> ids) throws Exception {
        Object pbf = OptionUtils.getSysOptionByName((String)"app:PBF");
        String defaultOpenApp = "true";
        if (pbf != null && defaultOpenApp.equals(pbf.toString())) {
            String url = this.ymsParamConfig.getDomainYonbipFiSepmpro();
            if (StringUtils.isNotBlank((CharSequence)url)) {
                HashMap<String, Object> params = new HashMap<String, Object>(4);
                params.put("fullname", fullname);
                params.put("ids", ids);
                url = url + "/archive/refcheck3";
                HashMap<String, String> headerParams = new HashMap<String, String>();
                headerParams.put("yht_access_token", InvocationInfoProxy.getYhtAccessToken());
                this.logger.info("commonSePmProCheck\u4f01\u4e1a\u7ee9\u6548\u670d\u52a1\u63a5\u53e3\u5165\u53c2:[url:<{}>,params:<{}>],", (Object)url, params);
                YmsHttpHeader ymsHttpHeader = new YmsHttpHeader();
                ymsHttpHeader.add("Content-Type", "application/json;charset=utf-8");
                String response = "";
                YmsHttpRequest request = new YmsHttpRequestBuilder().url(url).method(YmsHttpMethod.POST).body((Object)JSON.toJSONString(params)).addHeader(ymsHttpHeader.addAllMap(headerParams)).build();
                try (YmsHttpResponse ymsHttpResponse = this.ymsHttpClient.execute(request);){
                    response = ymsHttpResponse.getBodyString();
                }
                catch (Exception e) {
                    this.logger.error("UpcCommonFieldCheckService fieldSePmProRefCheck Exception!", (Throwable)e);
                }
                if (GsonHelper.isGoodJson((String)response)) {
                    this.logger.info("commonSePmProCheck\u4f01\u4e1a\u7ee9\u6548\u670d\u52a1\u63a5\u53e3\u8fd4\u56de\u53c2\u6570:[response:<{}>],", (Object)response);
                    Map resMap = (Map)JSON.parseObject((String)response, Map.class);
                    Object code = resMap.get("code");
                    if (code != null && code.equals(200)) {
                        throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_801522);
                    }
                    if (code != null && code.equals(500)) {
                        throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_801523);
                    }
                } else {
                    this.logger.error("commonSePmProCheck\u6821\u9a8c\u5931\u8d25:{}", (Object)response);
                }
            }
            this.logger.error("commonSePmProCheck\u6821\u9a8c\u5931\u8d25url\u4e0d\u6b63\u786e\uff01");
        }
    }

    public void checkMerchantBank(Long merchantId, List<Long> agentFinancialIdList) throws Exception {
        String url;
        Object isOpenAR = OptionUtils.getOptionByName((String)"u8c-config", (String)"app:EAR", null);
        String defaultOpenApp = "true";
        String defaultOpen = "1";
        if ((defaultOpen.equals(String.valueOf(isOpenAR)) || defaultOpenApp.equals(String.valueOf(isOpenAR))) && StringUtils.isNotBlank((CharSequence)(url = this.ymsParamConfig.getDomainYonbipFiArap()))) {
            url = url + "/api/reveivebill/check/bank?yht_access_token=" + InvocationInfoProxy.getYhtAccessToken();
            HashMap<String, Object> param = new HashMap<String, Object>(2);
            param.put("merchantId", merchantId);
            param.put("agentFinancialIds", agentFinancialIdList);
            HashMap headerParams = new HashMap();
            this.logger.info("checkMerchantBank\u6536\u6b3e\u5355\u63a5\u53e3\u5165\u53c2:[url:<{}>,params:<{}>],", (Object)url, param);
            YmsHttpHeader ymsHttpHeader = new YmsHttpHeader();
            ymsHttpHeader.add("Content-Type", "application/json;charset=utf-8");
            String response = "";
            YmsHttpRequest request = new YmsHttpRequestBuilder().url(url).method(YmsHttpMethod.POST).body((Object)JSON.toJSONString(param)).addHeader(ymsHttpHeader.addAllMap(headerParams)).build();
            try (YmsHttpResponse ymsHttpResponse = this.ymsHttpClient.execute(request);){
                response = ymsHttpResponse.getBodyString();
            }
            catch (Exception e) {
                this.logger.error("UpcCommonFieldCheckService checkMerchantBank Exception!", (Throwable)e);
            }
            if (GsonHelper.isGoodJson((String)response)) {
                Map resMap = (Map)JSON.parseObject((String)response, Map.class);
                Object data = resMap.get("data");
                if (data != null && ((Boolean)data).booleanValue()) {
                    throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_801524);
                }
            } else {
                this.logger.error("checkMerchantBank\u6821\u9a8c\u5931\u8d25:{}", (Object)response);
            }
        }
    }

    public void checkMerchantForYonYouFiEarAp(Long merchantId, String orgId) throws Exception {
        Object isOpenEAR = OptionUtils.getOptionByName((String)"u8c-config", (String)"app:EAR", null);
        String defaultOpenApp = "true";
        String defaultOpen = "1";
        if (defaultOpen.equals(String.valueOf(isOpenEAR)) || defaultOpenApp.equals(String.valueOf(isOpenEAR))) {
            String url = this.ymsParamConfig.getDomainYonbipFiearap();
            if (StringUtils.isNotBlank((CharSequence)url)) {
                url = url + "/earap/eventrefcheck";
                HashMap<String, String> params = new HashMap<String, String>(4);
                params.put("id", String.valueOf(merchantId));
                params.put("fullname", "aa.merchant.Merchant");
                if (!StringUtils.isEmpty((CharSequence)orgId)) {
                    params.put("accentity", orgId);
                }
                HashMap<String, String> headerParams = new HashMap<String, String>();
                headerParams.put("yht_access_token", InvocationInfoProxy.getYhtAccessToken());
                this.logger.info("MerchantDeleteEArApCheckRule\u6536\u4ed8\u5f00\u53d1\u90e8\u670d\u52a1\u63a5\u53e3\u5165\u53c2:[url:<{}>,params:<{}>],", (Object)url, params);
                YmsHttpHeader ymsHttpHeader = new YmsHttpHeader();
                ymsHttpHeader.add("Content-Type", "application/json;charset=utf-8");
                String response = "";
                YmsHttpRequest request = new YmsHttpRequestBuilder().url(url).method(YmsHttpMethod.POST).body((Object)JSON.toJSONString(params)).addHeader(ymsHttpHeader.addAllMap(headerParams)).build();
                try (YmsHttpResponse ymsHttpResponse = this.ymsHttpClient.execute(request);){
                    response = ymsHttpResponse.getBodyString();
                }
                catch (Exception e) {
                    this.logger.error("checkMerchantForYonYouFiEarAp Exception!", (Throwable)e);
                }
                if (GsonHelper.isGoodJson((String)response)) {
                    Map resMap = (Map)JSON.parseObject((String)response, Map.class);
                    if (!ObjectUtils.isEmpty(resMap.get("data"))) {
                        JSONObject data = JSONObject.parseObject((String)resMap.get("data").toString());
                        if ("999".equals(data.get((Object)"code"))) {
                            String msg = String.format(InternationalUtils.getMessageWithDefault((String)"UID:P_COREDOC-BE_18F91EB604F8002D", (String)"\u9886\u57df[%s:%s]\u4e0b[%s]\u6863\u6848\u5df2\u5f15\u7528\u5ba2\u6237\u6863\u6848,\u4e0d\u53ef\u5220\u9664!"), data.get((Object)"app"), data.get((Object)"domain"), data.get((Object)"billType"));
                            throw new CoreDocBusinessException(msg);
                        }
                        if ("500".equals(data.get((Object)"code"))) {
                            String msg = String.format(InternationalUtils.getMessageWithDefault((String)"UID:P_COREDOC-BE_18F91EB604F8002E", (String)"\u9886\u57df[%s:%s]\u5220\u9664\u5f15\u7528\u6821\u9a8c\u62a5\u9519:[%s]"), data.get((Object)"app"), data.get((Object)"domain"), data.get((Object)"errormsg"));
                            throw new CoreDocBusinessException(msg);
                        }
                    }
                } else {
                    this.logger.error("MerchantDeleteEArApCheckRule\u6821\u9a8c\u5931\u8d25:{}", (Object)response);
                }
            }
            this.logger.error("MerchantDeleteEArApCheckRule\u6821\u9a8c\u5931\u8d25url\u4e0d\u6b63\u786e\uff01");
        }
    }

    public void checkMerchantForYonYouFiEarApBill(Long merchantId, String orgId) throws Exception {
        Object isOpenEAR = OptionUtils.getOptionByName((String)"u8c-config", (String)"app:EAR", null);
        String defaultOpenApp = "true";
        String defaultOpen = "1";
        if (defaultOpen.equals(String.valueOf(isOpenEAR)) || defaultOpenApp.equals(String.valueOf(isOpenEAR))) {
            String url = this.ymsParamConfig.getDomainYonbipFiearapbill();
            if (StringUtils.isNotBlank((CharSequence)url)) {
                url = url + "/arap/billrefcheck";
                HashMap<String, String> params = new HashMap<String, String>(4);
                params.put("id", String.valueOf(merchantId));
                params.put("fullname", "aa.merchant.Merchant");
                if (!StringUtils.isEmpty((CharSequence)orgId)) {
                    params.put("accentity", orgId);
                }
                HashMap<String, String> headerParams = new HashMap<String, String>();
                headerParams.put("yht_access_token", InvocationInfoProxy.getYhtAccessToken());
                this.logger.info("MerchantDeleteEArApCheckRule\u6536\u4ed8\u5f00\u53d1\u90e8\u670d\u52a1\u63a5\u53e3\u5165\u53c2:[url:<{}>,params:<{}>],", (Object)url, params);
                YmsHttpHeader ymsHttpHeader = new YmsHttpHeader();
                ymsHttpHeader.add("Content-Type", "application/json;charset=utf-8");
                String response = "";
                YmsHttpRequest request = new YmsHttpRequestBuilder().url(url).method(YmsHttpMethod.POST).body((Object)JSON.toJSONString(params)).addHeader(ymsHttpHeader.addAllMap(headerParams)).build();
                try (YmsHttpResponse ymsHttpResponse = this.ymsHttpClient.execute(request);){
                    response = ymsHttpResponse.getBodyString();
                }
                catch (Exception e) {
                    this.logger.error("checkMerchantForYonYouFiEarApBill Exception!", (Throwable)e);
                }
                if (GsonHelper.isGoodJson((String)response)) {
                    Map resMap = (Map)JSON.parseObject((String)response, Map.class);
                    if (!ObjectUtils.isEmpty(resMap.get("data"))) {
                        JSONObject data = JSONObject.parseObject((String)resMap.get("data").toString());
                        if ("999".equals(data.get((Object)"code"))) {
                            String msg = String.format(InternationalUtils.getMessageWithDefault((String)"UID:P_COREDOC-BE_18F91EB604F8002F", (String)"\u9886\u57df[%s:%s]\u4e0b(%s)\u6863\u6848\u5df2\u5f15\u7528\u5ba2\u6237\u6863\u6848,\u4e0d\u53ef\u5220\u9664!"), data.get((Object)"app"), data.get((Object)"domain"), data.get((Object)"billType"));
                            throw new CoreDocBusinessException(msg);
                        }
                        if ("500".equals(data.get((Object)"code"))) {
                            String msg = String.format(InternationalUtils.getMessageWithDefault((String)"UID:P_COREDOC-BE_18F91EB604F8002E", (String)"\u9886\u57df[%s:%s]\u5220\u9664\u5f15\u7528\u6821\u9a8c\u62a5\u9519:[%s]"), data.get((Object)"app"), data.get((Object)"domain"), data.get((Object)"errormsg"));
                            throw new CoreDocBusinessException(msg);
                        }
                    }
                } else {
                    this.logger.error("MerchantDeleteEArApCheckRule\u6821\u9a8c\u5931\u8d25:{}", (Object)response);
                }
            }
            this.logger.error("MerchantDeleteEArApCheckRule\u6821\u9a8c\u5931\u8d25url\u4e0d\u6b63\u786e\uff01");
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public CheckDomainDeleteResultDto checkCommonRest(CommonRestDTO commonRestDTO) throws Exception {
        String url = AppContext.getEnvConfig((String)("domain." + commonRestDTO.getMicroServiceCode()));
        if (StringUtils.isNotBlank((CharSequence)url)) {
            url = url + commonRestDTO.getUrl();
            HashMap<String, Object> params = new HashMap<String, Object>(4);
            params.put("ids", commonRestDTO.getIds());
            params.put("fullname", commonRestDTO.getFullName());
            if (!StringUtils.isEmpty((CharSequence)commonRestDTO.getOrgId())) {
                params.put("orgId", commonRestDTO.getOrgId());
            }
            HashMap<String, String> headerParams = new HashMap<String, String>();
            headerParams.put("yht_access_token", commonRestDTO.getToken());
            this.logger.info("checkCommonRest\u63a5\u53e3\u5165\u53c2:[url:<{}>,params:<{}>],", (Object)url, params);
            YmsHttpHeader ymsHttpHeader = new YmsHttpHeader();
            ymsHttpHeader.add("Content-Type", "application/json;charset=utf-8");
            String response = "";
            YmsHttpRequest request = new YmsHttpRequestBuilder().url(url).method(YmsHttpMethod.POST).body((Object)JSON.toJSONString(params)).addHeader(ymsHttpHeader.addAllMap(headerParams)).build();
            try (YmsHttpResponse ymsHttpResponse = this.ymsHttpClient.execute(request);){
                response = ymsHttpResponse.getBodyString();
            }
            catch (Exception e) {
                this.logger.error("checkCommonRest Exception!", (Throwable)e);
            }
            if (GsonHelper.isGoodJson((String)response)) {
                CheckDomainDeleteResultDto checkDomainDeleteResultDto = new CheckDomainDeleteResultDto();
                try {
                    checkDomainDeleteResultDto = (CheckDomainDeleteResultDto)JSON.parseObject((String)response, CheckDomainDeleteResultDto.class);
                }
                catch (Exception e) {
                    checkDomainDeleteResultDto.setCode("999");
                    checkDomainDeleteResultDto.setMessage(e.getMessage());
                }
                finally {
                    checkDomainDeleteResultDto.setMicroServiceCode(commonRestDTO.getMicroServiceCode());
                    if (commonRestDTO.getCode() == null) {
                        checkDomainDeleteResultDto.setBizObjectCode((String)commonRestDTO.getIds().get(0));
                    } else {
                        checkDomainDeleteResultDto.setBizObjectCode(commonRestDTO.getCode());
                    }
                }
                return checkDomainDeleteResultDto;
            }
            this.logger.error("checkCommonRest\u6821\u9a8c\u5931\u8d25:{}", (Object)response);
        }
        this.logger.error("checkCommonRest\u6821\u9a8c\u5931\u8d25url\u4e0d\u6b63\u786e\uff01");
        return null;
    }
}


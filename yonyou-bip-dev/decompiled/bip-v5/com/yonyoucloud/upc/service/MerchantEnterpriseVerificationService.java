/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.yonyou.iuap.apdoc.coredoc.config.YMSParamConfig
 *  com.yonyou.iuap.apdoc.coredoc.enums.CoreExtrateBusinessErrorEnum
 *  com.yonyou.iuap.apdoc.coredoc.exceptions.CoreDocBusinessException
 *  com.yonyou.iuap.ucf.common.i18n.InternationalUtils
 *  com.yonyou.iuap.yms.multitenant.UserExecutors
 *  com.yonyou.ucf.mdd.common.model.ResultList
 *  com.yonyou.ucf.mdd.common.model.rule.RuleExecuteResult
 *  com.yonyou.ucf.mdd.ext.bill.dto.BillDataDto
 *  com.yonyou.ucf.mdd.ext.dao.meta.MetaDaoHelper
 *  com.yonyou.ucf.mdd.ext.poi.model.ProcessData
 *  com.yonyoucloud.upc.aa.merchant.AsyncKeyEnterpriseVerification
 *  com.yonyoucloud.upc.aa.merchant.Merchant
 *  com.yonyoucloud.upc.aa.merchant.VerifyingState
 *  com.yonyoucloud.upc.utils.EmailUtils
 *  com.yonyoucloud.upc.utils.MerchantUtils
 *  com.yonyoucloud.upc.utils.MultilangUtil
 *  org.apache.commons.lang3.StringUtils
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
package com.yonyoucloud.upc.service;

import com.yonyou.iuap.apdoc.coredoc.config.YMSParamConfig;
import com.yonyou.iuap.apdoc.coredoc.enums.CoreExtrateBusinessErrorEnum;
import com.yonyou.iuap.apdoc.coredoc.exceptions.CoreDocBusinessException;
import com.yonyou.iuap.ucf.common.i18n.InternationalUtils;
import com.yonyou.iuap.yms.multitenant.UserExecutors;
import com.yonyou.ucf.mdd.common.model.ResultList;
import com.yonyou.ucf.mdd.common.model.rule.RuleExecuteResult;
import com.yonyou.ucf.mdd.ext.bill.dto.BillDataDto;
import com.yonyou.ucf.mdd.ext.dao.meta.MetaDaoHelper;
import com.yonyou.ucf.mdd.ext.poi.model.ProcessData;
import com.yonyoucloud.iuap.upc.api.service.IUPCBillService;
import com.yonyoucloud.upc.aa.merchant.AsyncKeyEnterpriseVerification;
import com.yonyoucloud.upc.aa.merchant.Merchant;
import com.yonyoucloud.upc.aa.merchant.VerifyingState;
import com.yonyoucloud.upc.utils.EmailUtils;
import com.yonyoucloud.upc.utils.MerchantUtils;
import com.yonyoucloud.upc.utils.MultilangUtil;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.sql.Date;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import org.apache.commons.lang3.StringUtils;
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
public class MerchantEnterpriseVerificationService {
    Logger logger = LoggerFactory.getLogger(MerchantEnterpriseVerificationService.class);
    @Autowired
    @Qualifier(value="pc.BillService")
    private IUPCBillService billService;
    @Autowired
    private YMSParamConfig ymsParamConfig;
    @Autowired
    @Qualifier(value="ymsLongTaskExecutorService")
    private ExecutorService ymsLongTaskExecutorService;

    public void batchEnterpriseVerificationRunnable(AsyncKeyEnterpriseVerification asyncKeyEnterpriseVerification) throws Exception {
        Runnable wrap = () -> {
            try {
                this.batchEnterpriseVerification(asyncKeyEnterpriseVerification);
            }
            catch (Exception e) {
                this.logger.error("batchEnterpriseVerificationRunnable", (Throwable)e);
                throw new CoreDocBusinessException(e.getMessage());
            }
        };
        UserExecutors.executeInDetachedThread((ExecutorService)this.ymsLongTaskExecutorService, (Runnable)wrap);
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public void batchEnterpriseVerification(AsyncKeyEnterpriseVerification asyncKeyEnterpriseVerification) {
        try {
            ResultList resultList;
            int failCount;
            int successCount;
            String asyncKey;
            int expireTime;
            if (null != asyncKeyEnterpriseVerification && StringUtils.isNotBlank((CharSequence)asyncKeyEnterpriseVerification.getAsyncKey())) {
                List<Merchant> merchantList;
                expireTime = 600;
                try {
                    String expireTimeConfig = this.ymsParamConfig.getMddExportProcessExpireTime();
                    if (null != expireTimeConfig) {
                        expireTime = Integer.parseInt(expireTimeConfig);
                    }
                }
                catch (Exception var8) {
                    this.logger.warn("\u6279\u91cf\u4f01\u4e1a\u6838\u5b9e-\u5f02\u6b65\u83b7\u53d6\u7f13\u5b58\u8d85\u65f6\u65f6\u95f4\u5f02\u5e38\uff0c\u8d70\u9ed8\u8ba4\u914d\u7f6e600\u79d2");
                }
                if (asyncKeyEnterpriseVerification.getData() != null && asyncKeyEnterpriseVerification.getData().size() > 1000) {
                    throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_800526);
                }
                try {
                    List dataList = asyncKeyEnterpriseVerification.getData();
                    merchantList = this.setEnterpriseVerificationDataList(dataList);
                }
                catch (Exception e) {
                    throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_800527);
                }
                if (CollectionUtils.isEmpty(merchantList)) {
                    throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_800528);
                }
                asyncKey = asyncKeyEnterpriseVerification.getAsyncKey();
                ProcessData.builder((int)1, (int)200, null, null).percentage("0").build(asyncKey, Integer.valueOf(expireTime));
                int totalCount = merchantList.size();
                successCount = 0;
                failCount = 0;
                resultList = new ResultList();
                for (Merchant merchant : merchantList) {
                    try {
                        if (!MerchantUtils.isExists((Map)merchant, (String)"enterpriseNature")) {
                            QuerySchema querySchema = QuerySchema.create();
                            querySchema.addSelect("enterpriseNature,createOrg");
                            querySchema.addCondition((ConditionExpression)QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"id").eq(merchant.getId())}));
                            List merchantSourceList = MetaDaoHelper.queryObject((String)"aa.merchant.Merchant", (QuerySchema)querySchema, null);
                            if (!CollectionUtils.isEmpty((Collection)merchantSourceList)) {
                                merchant.setEnterpriseNature(((Merchant)merchantSourceList.get(0)).getEnterpriseNature());
                                merchant.setCreateOrg(((Merchant)merchantSourceList.get(0)).getCreateOrg());
                                merchant.set("belongOrg", (Object)((Merchant)merchantSourceList.get(0)).getCreateOrg());
                            }
                        }
                        merchant.set("specialKeyFromBusinessPartner", (Object)true);
                        merchant.set("isBatchModifyMerchant", (Object)"isBatchModifyMerchant");
                        BillDataDto saveDto = new BillDataDto();
                        saveDto.setData((Object)merchant);
                        saveDto.setBillnum("aa_merchant");
                        RuleExecuteResult result = this.billService.executeUpdate("save", saveDto);
                        if (result.getMsgCode() != 1) {
                            ++failCount;
                            String str = String.format(InternationalUtils.getMessageWithDefault((String)"UID:P_COREDOC-BE_179F6286040805B3", (String)"\u5ba2\u6237:[%s]\u6838\u5b9e\u5931\u8d25,\u539f\u56e0\u4e3a[%s]"), merchant.get("enterprise_source_name"), result.getMessage());
                            resultList.addInfo((Object)str);
                            resultList.addErrorMessage(str);
                            resultList.addFailInfo((Object)str);
                            continue;
                        }
                        String merchantName = (String)MultilangUtil.getAttr((String)"aa.merchant.Merchant", (String)"name", (BizObject)merchant, null);
                        String str = String.format(InternationalUtils.getMessageWithDefault((String)"UID:P_COREDOC-BE_179F6286040805B7", (String)"\u5ba2\u6237[%s]\u6838\u5b9e\u4e3a[%s]\u5b8c\u6210\uff01"), merchant.get("enterprise_source_name"), merchantName);
                        ++successCount;
                        resultList.addInfo((Object)str);
                        resultList.addMessage((Object)str);
                        resultList.addInfo((Object)str);
                    }
                    catch (Exception e) {
                        this.logger.error(e.getMessage(), (Throwable)e);
                        ++failCount;
                        String str = String.format(InternationalUtils.getMessageWithDefault((String)"UID:P_COREDOC-BE_179F6286040805B3", (String)"\u5ba2\u6237:[%s]\u6838\u5b9e\u5931\u8d25,\u539f\u56e0\u4e3a[%s]"), merchant.get("enterprise_source_name"), e.getMessage());
                        resultList.addInfo((Object)str);
                        resultList.addErrorMessage(str);
                        resultList.addFailInfo((Object)str);
                    }
                    finally {
                        String percentage = String.valueOf((successCount + failCount) * 100 / totalCount);
                        ProcessData.builder((int)1, (int)200, null, null).percentage(percentage).build(asyncKey, Integer.valueOf(expireTime));
                    }
                }
            } else {
                throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_800529);
            }
            resultList.setCount(failCount + successCount);
            resultList.setSucessCount(successCount);
            resultList.setFailCount(failCount);
            ProcessData.builder((int)1, (int)200, (Object)resultList, (String)InternationalUtils.getMessageWithDefault((String)"UID:P_COREDOC-BE_179F6286040805B1", (String)"\u6838\u5b9e\u5b8c\u6210")).percentage("100").successCount(successCount).failCount(failCount).build(asyncKey, Integer.valueOf(expireTime));
        }
        catch (Exception e) {
            ResultList resultList = new ResultList();
            resultList.addFailInfo((Object)e.getMessage());
            resultList.setFailCount(asyncKeyEnterpriseVerification.getData().size());
            resultList.setCount(asyncKeyEnterpriseVerification.getData().size());
            ProcessData.builder((int)1, (int)200, (Object)resultList, (String)InternationalUtils.getMessageWithDefault((String)"UID:P_COREDOC-BE_179F6286040805B5", (String)"\u6838\u5b9e\u5931\u8d25")).percentage("100").successCount(0).failCount(1).build(asyncKeyEnterpriseVerification.getAsyncKey(), Integer.valueOf(600));
        }
    }

    public List<Merchant> setEnterpriseVerificationDataList(List<Map<String, Object>> dataList) {
        ArrayList<Merchant> merchantList = new ArrayList<Merchant>();
        if (!CollectionUtils.isEmpty(dataList)) {
            for (Map<String, Object> data : dataList) {
                Merchant merchant = new Merchant();
                merchant.setId((Object)Long.parseLong(data.get("sourceId").toString()));
                if (data.containsKey("companyName") && data.get("companyName") != null) {
                    BizObject nameObject = new BizObject();
                    nameObject.set("zh_CN", (Object)data.get("companyName").toString());
                    merchant.set("name", (Object)nameObject);
                }
                if (data.containsKey("sourceName") && data.get("sourceName") != null) {
                    merchant.set("enterprise_source_name", (Object)data.get("sourceName").toString());
                }
                if (data.containsKey("companyName") && data.get("companyName") != null) {
                    merchant.setEnterpriseName(data.get("companyName").toString());
                }
                if (data.containsKey("contactTel") && data.get("contactTel") != null) {
                    merchant.setContactTel(data.get("contactTel").toString());
                }
                if (data.containsKey("website") && data.get("website") != null) {
                    merchant.setWebsite(data.get("website").toString());
                }
                if (data.containsKey("regAddress") && data.get("regAddress") != null) {
                    merchant.setRegAddress(data.get("regAddress").toString());
                }
                if (data.containsKey("legalPersonName") && data.get("legalPersonName") != null) {
                    merchant.setLeaderName(data.get("legalPersonName").toString());
                }
                if (data.containsKey("registerCurrencyNum") && data.get("registerCurrencyNum") != null) {
                    try {
                        String registerCurrencyNum = data.get("registerCurrencyNum").toString();
                        BigDecimal number = new BigDecimal(registerCurrencyNum);
                        merchant.setMoney(number.divide(BigDecimal.valueOf(10000L), RoundingMode.HALF_UP).toString());
                    }
                    catch (Exception e) {
                        this.logger.error("\u5ba2\u6237\u6279\u91cf\u4f01\u4e1a\u6838\u5fc3\u89e3\u6790\u6ce8\u518c\u8d44\u91d1\u5f02\u5e38" + e.getMessage(), (Throwable)e);
                    }
                }
                if (data.get("registerCurrencyName") != null) {
                    merchant.setCurrencyCode(data.get("registerCurrencyName").toString());
                }
                if (data.containsKey("businessscope") && data.get("businessscope") != null) {
                    merchant.setScope(data.get("businessscope").toString());
                }
                if (data.containsKey("regDate") && data.get("regDate") != null && !"".equals(data.get("regDate").toString())) {
                    try {
                        merchant.setBuildTime((java.util.Date)Date.valueOf(data.get("regDate").toString()));
                    }
                    catch (Exception e) {
                        this.logger.error("\u6210\u7acb\u65f6\u95f4\u5f02\u5e38", (Throwable)e);
                    }
                }
                if (data.containsKey("socialCreditCode") && data.get("socialCreditCode") != null) {
                    merchant.setCreditCode(data.get("socialCreditCode").toString());
                }
                if (data.containsKey("regAddress") && data.get("regAddress") != null) {
                    merchant.setAddress(data.get("regAddress").toString());
                }
                if (data.containsKey("staffNumRange") && data.get("staffNumRange") != null) {
                    try {
                        merchant.setPeopleNum(Long.valueOf(data.get("staffNumRange").toString()));
                    }
                    catch (Exception e) {
                        this.logger.error("\u4eba\u5458\u6570\u91cf\u4e0d\u4e3a\u6574\u6570", (Throwable)e);
                    }
                }
                if (data.containsKey("contactEmail") && data.get("contactEmail") != null && !"".equals(data.get("contactEmail").toString()) && EmailUtils.validateEmail((String)data.get("contactEmail").toString())) {
                    merchant.setEmail(data.get("contactEmail").toString());
                }
                merchant.setVerfyMark(VerifyingState.Verified);
                merchant.setEntityStatus(EntityStatus.Update);
                merchantList.add(merchant);
            }
        }
        return merchantList;
    }
}


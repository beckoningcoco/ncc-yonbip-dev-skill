/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.alibaba.fastjson.JSONObject
 *  com.yonyou.diwork.ott.exexutors.RobotExecutors
 *  com.yonyou.iuap.context.InvocationInfoProxy
 *  com.yonyou.ucf.mdd.ext.core.AppContext
 *  org.slf4j.Logger
 *  org.slf4j.LoggerFactory
 *  org.springframework.beans.factory.annotation.Autowired
 *  org.springframework.beans.factory.annotation.Qualifier
 *  org.springframework.stereotype.Service
 */
package com.yonyoucloud.upc.service;

import com.alibaba.fastjson.JSONObject;
import com.yonyou.diwork.ott.exexutors.RobotExecutors;
import com.yonyou.iuap.context.InvocationInfoProxy;
import com.yonyou.ucf.mdd.ext.core.AppContext;
import com.yonyoucloud.upc.service.MerchantService;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
public class MerchantEventService {
    Logger logger = LoggerFactory.getLogger(MerchantEventService.class);
    @Autowired
    private MerchantService merchantService;
    @Autowired
    @Qualifier(value="ymsExecutorService")
    private ExecutorService ymsExecutorService;
    @Autowired
    @Qualifier(value="ymsLongTaskExecutorService")
    private ExecutorService ymsLongTaskExecutorService;

    public void setMerchantIsExistPotential(Map bill) throws Exception {
        Runnable runnable = () -> {
            this.logger.info("\u4e0a\u4e0b\u6587\u4e2d\u7684 \u79df\u6237id:{}, \u7528\u6237id:{}", (Object)InvocationInfoProxy.getTenantid(), (Object)InvocationInfoProxy.getUserid());
            try {
                if (bill == null || !bill.containsKey("userObject")) {
                    return;
                }
                JSONObject userObject = JSONObject.parseObject((String)((String)bill.get("userObject")));
                if (userObject != null && userObject.containsKey((Object)"customer")) {
                    Long merchantId = Long.parseLong(userObject.get((Object)"customer").toString());
                    this.merchantService.setMerchantIsExistPotential(merchantId);
                } else {
                    this.logger.error("\u5ba2\u6237\u6863\u6848\u76d1\u542cCRM\u6f5c\u5ba2\u8f6c\u6b63\u5f0f\u5ba2\u6237\u7684\u4e8b\u4ef6\u5f02\u5e38\u4fe1\u606f:customer\u4e3a\u7a7a");
                }
            }
            catch (Exception e) {
                this.logger.error("\u5ba2\u6237\u6863\u6848\u76d1\u542cCRM\u6f5c\u5ba2\u8f6c\u6b63\u5f0f\u5ba2\u6237\u7684\u4e8b\u4ef6\u5f02\u5e38\u4fe1\u606f:{}" + e.getMessage(), (Throwable)e);
            }
        };
        this.ymsExecutorService.execute(runnable);
    }

    public void updateOrgFinBankAcctSyncAgentFinancial(Map bill) {
        Runnable runnable = () -> {
            this.logger.info("\u4e0a\u4e0b\u6587\u4e2d\u7684 \u79df\u6237id:{}, \u7528\u6237id:{}", (Object)InvocationInfoProxy.getTenantid(), (Object)InvocationInfoProxy.getUserid());
            try {
                if (bill == null || !bill.containsKey("userObject")) {
                    return;
                }
                JSONObject userObject = JSONObject.parseObject((String)((String)bill.get("userObject")));
                if (userObject != null && userObject.containsKey((Object)"data")) {
                    this.merchantService.updateOrgFinBankAcctSyncAgentFinancial(userObject.getJSONObject("data"));
                } else {
                    this.logger.error("\u5ba2\u6237\u6863\u6848\u76d1\u542c\u4f01\u4e1a\u94f6\u884c\u8d26\u6237\u66f4\u65b0\u4e8b\u4ef6\u5f02\u5e38\u4fe1\u606f:data\u4e3a\u7a7a");
                }
            }
            catch (Exception e) {
                this.logger.error("\u5ba2\u6237\u6863\u6848\u76d1\u542c\u4f01\u4e1a\u94f6\u884c\u8d26\u6237\u66f4\u65b0\u4e8b\u4ef6\u5f02\u5e38\u4fe1\u606f:" + e.getMessage(), (Throwable)e);
            }
        };
        this.ymsExecutorService.execute(runnable);
    }

    public void updateOpenBankSyncAgentFinancial(Map bill) {
        Runnable runnable = () -> {
            this.logger.info("\u4e0a\u4e0b\u6587\u4e2d\u7684 \u79df\u6237id:{}, \u7528\u6237id:{}", (Object)InvocationInfoProxy.getTenantid(), (Object)InvocationInfoProxy.getUserid());
            try {
                if (bill == null || !bill.containsKey("userObject")) {
                    return;
                }
                JSONObject userObject = JSONObject.parseObject((String)((String)bill.get("userObject")));
                if (userObject != null && userObject.containsKey((Object)"data")) {
                    this.merchantService.updateOpenBankSyncAgentFinancial(userObject.getJSONObject("data"));
                } else {
                    this.logger.error("\u5ba2\u6237\u6863\u6848\u76d1\u542c\u94f6\u884c\u7f51\u70b9\u66f4\u65b0\u4e8b\u4ef6\u5f02\u5e38\u4fe1\u606f:data\u4e3a\u7a7a");
                }
            }
            catch (Exception e) {
                this.logger.error("\u5ba2\u6237\u6863\u6848\u76d1\u542c\u94f6\u884c\u7f51\u70b9\u66f4\u65b0\u4e8b\u4ef6\u5f02\u5e38\u4fe1\u606f:" + e.getMessage(), (Throwable)e);
            }
        };
        RobotExecutors.runAs((String)((String)AppContext.getYTenantId()), (Runnable)runnable, (ExecutorService)this.ymsLongTaskExecutorService);
    }
}


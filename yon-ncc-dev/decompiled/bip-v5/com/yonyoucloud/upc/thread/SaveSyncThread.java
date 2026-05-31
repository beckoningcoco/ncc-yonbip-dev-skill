/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.yonyou.iuap.context.InvocationInfoProxy
 *  com.yonyou.iuap.ucf.common.i18n.InternationalUtils
 *  com.yonyou.ucf.mdd.common.model.rule.RuleExecuteResult
 *  com.yonyou.ucf.mdd.ext.bill.biz.BillBiz
 *  com.yonyou.ucf.mdd.ext.bill.dto.BillDataDto
 *  com.yonyou.ucf.mdd.ext.data.fill.DataTransferUtils
 *  org.imeta.biz.base.Objectlizer
 *  org.imeta.orm.base.BizObject
 *  org.slf4j.Logger
 *  org.slf4j.LoggerFactory
 */
package com.yonyoucloud.upc.thread;

import com.yonyou.iuap.context.InvocationInfoProxy;
import com.yonyou.iuap.ucf.common.i18n.InternationalUtils;
import com.yonyou.ucf.mdd.common.model.rule.RuleExecuteResult;
import com.yonyou.ucf.mdd.ext.bill.biz.BillBiz;
import com.yonyou.ucf.mdd.ext.bill.dto.BillDataDto;
import com.yonyou.ucf.mdd.ext.data.fill.DataTransferUtils;
import java.util.Map;
import java.util.concurrent.CountDownLatch;
import org.imeta.biz.base.Objectlizer;
import org.imeta.orm.base.BizObject;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class SaveSyncThread
implements Runnable {
    private static final Logger log = LoggerFactory.getLogger(SaveSyncThread.class);
    private RuleExecuteResult ruleResult;
    private String billnum;
    private String fullname;
    private Map data;
    private String action;
    private Map mapCondition;
    private final CountDownLatch begin;

    public SaveSyncThread(CountDownLatch begin, Map data, String billnum, String fullname, String action, Map mapCondition) {
        this.begin = begin;
        this.data = data;
        this.billnum = billnum;
        this.fullname = fullname;
        this.action = action;
        this.mapCondition = mapCondition;
    }

    @Override
    public void run() {
        Object status = null;
        BizObject obj = Objectlizer.convert((Map)this.data, (String)this.fullname);
        try {
            DataTransferUtils.fill((String)this.billnum, (String)this.fullname, (Object)obj, (int)1);
            BillDataDto oneBill = new BillDataDto(this.billnum);
            oneBill.setData((Object)obj);
            oneBill.setMapCondition(this.mapCondition);
            this.ruleResult = BillBiz.executeUpdate((String)this.action, (BillDataDto)oneBill);
            this.begin.countDown();
        }
        catch (Exception e) {
            String message = e.getMessage();
            String token = InvocationInfoProxy.getYhtAccessToken();
            log.info(InternationalUtils.getMessageWithDefault((String)"UID:P_COREDOC-BE_179F628604080043", (String)"--SaveSyncThread -- \u7f16\u7801\u4e3a\uff1a") + obj.get("code") + InternationalUtils.getMessageWithDefault((String)"UID:P_COREDOC-BE_179F628604080042", (String)"\uff0c\u5f02\u5e38\uff1a") + message);
            this.ruleResult = new RuleExecuteResult(0, message + " , token : " + token);
            this.begin.countDown();
        }
    }

    public RuleExecuteResult getRuleResult() {
        return this.ruleResult;
    }

    public Map getData() {
        return this.data;
    }
}


/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.yonyou.iuap.ucf.common.i18n.InternationalUtils
 *  com.yonyou.ucf.mdd.common.model.rule.RuleExecuteResult
 *  com.yonyou.ucf.mdd.ext.dao.sql.SqlHelper
 *  com.yonyou.ucf.mdd.ext.model.BillContext
 *  com.yonyou.ucf.mdd.ext.option.rule.AddSysOptionsRule
 *  org.slf4j.Logger
 *  org.slf4j.LoggerFactory
 *  org.springframework.stereotype.Component
 */
package com.yonyoucloud.upc.billrule.regist;

import com.yonyou.iuap.ucf.common.i18n.InternationalUtils;
import com.yonyou.ucf.mdd.common.model.rule.RuleExecuteResult;
import com.yonyou.ucf.mdd.ext.dao.sql.SqlHelper;
import com.yonyou.ucf.mdd.ext.model.BillContext;
import com.yonyou.ucf.mdd.ext.option.rule.AddSysOptionsRule;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Component(value="RegistInitCorpOpe")
public class RegistInitCorpOpe
extends AddSysOptionsRule {
    private static final Logger log = LoggerFactory.getLogger(RegistInitCorpOpe.class);

    public RuleExecuteResult execute(BillContext billContext, Map<String, Object> map) throws Exception {
        super.execute(billContext, map);
        return new RuleExecuteResult(map);
    }

    public void initRegionCorp(HashMap<String, Object> params) throws Exception {
        Runnable runnable = () -> {
            try {
                Date begin = new Date();
                log.info(InternationalUtils.getMessageWithDefault((String)"UID:P_COREDOC-BE_179F6286040803D7", (String)"\u6267\u884cRegistInitCorpOpe\u89c4\u5219\uff1a\u5730\u5740\u6863\u6848\u521d\u59cb\u5316\u5f00\u59cb\uff0c\u65f6\u95f4{}"), (Object)begin);
                SqlHelper.update((String)"com.yonyoucloud.upc.aa.corpopeinit.initRegionCorp", (Object)params);
                this.updateLevel1Path(params);
                this.updatePath(params);
                Date end = new Date();
                long seconds = (end.getTime() - begin.getTime()) % 60000L / 1000L;
                log.info(InternationalUtils.getMessageWithDefault((String)"UID:P_COREDOC-BE_179F6286040803D4", (String)"\u6267\u884cRegistInitCorpOpe\u89c4\u5219\uff1a\u5730\u5740\u6863\u6848\u521d\u59cb\u5316\u7ed3\u675f\uff0c\u65f6\u95f4{}"), (Object)end);
                log.info(InternationalUtils.getMessageWithDefault((String)"UID:P_COREDOC-BE_179F6286040803D5", (String)"\u6267\u884cRegistInitCorpOpe\u89c4\u5219\uff1a\u5730\u5740\u6863\u6848\u521d\u59cb\u5316\u5386\u65f6{}\u79d2"), (Object)seconds);
            }
            catch (Exception e) {
                log.info(InternationalUtils.getMessageWithDefault((String)"UID:P_COREDOC-BE_179F6286040803D6", (String)"\u6267\u884cRegistInitCorpOpe\u89c4\u5219\uff1a\u6ce8\u518c\uff1a\u79df\u6237id\u4e3a{}\uff0c\u5730\u5740\u6863\u6848\u521d\u59cb\u5316\u5931\u8d25"), params.get("tenantId"));
                log.info("error,e" + e);
            }
        };
        new Thread(runnable).start();
    }

    private void updateLevel1Path(HashMap<String, Object> params) throws Exception {
        List<Map<String, Object>> level1list = this.getMaps(params, 1);
        for (Map<String, Object> stringObject : level1list) {
            stringObject.put("parentId", null);
            String path = stringObject.get("id").toString() + "|";
            stringObject.put("cPath", path);
        }
        this.updateRegionPath(level1list);
    }

    private void updatePath(HashMap<String, Object> params) throws Exception {
        HashMap<String, Object> codepath = new HashMap<String, Object>();
        HashMap<String, Object> codeid = new HashMap<String, Object>();
        List<Map<String, Object>> level1list = this.getMaps(params, 1);
        for (Map<String, Object> map : level1list) {
            codepath.put(map.get("cCode").toString(), map.get("cPath"));
            codeid.put(map.get("cCode").toString(), map.get("id"));
        }
        List<Map<String, Object>> level2list = this.getMaps(params, 2);
        for (Map<String, Object> map : level2list) {
            Object parentid = codeid.get(map.get("parentCode").toString());
            map.put("parentId", parentid);
            String path = codepath.get(map.get("parentCode").toString()).toString() + map.get("id").toString() + "|";
            map.put("cPath", path);
            codepath.put(map.get("cCode").toString(), map.get("cPath"));
            codeid.put(map.get("cCode").toString(), map.get("id"));
        }
        List<Map<String, Object>> list = this.getMaps(params, 3);
        for (Map<String, Object> stringObject : list) {
            Object parentid = codeid.get(stringObject.get("parentCode").toString());
            stringObject.put("parentId", parentid);
            String path = codepath.get(stringObject.get("parentCode").toString()).toString() + stringObject.get("id").toString() + "|";
            stringObject.put("cPath", path);
        }
        this.updateRegionPath(level2list);
        this.updateRegionPath(list);
    }

    private void updateRegionPath(List<Map<String, Object>> level2list) throws Exception {
        for (Map<String, Object> map : level2list) {
            SqlHelper.update((String)"com.yonyoucloud.upc.aa.corpopeinit.updateRegionPath", map);
        }
    }

    private List<Map<String, Object>> getMaps(HashMap<String, Object> params, Integer level) throws Exception {
        params.put("level", level);
        return SqlHelper.selectList((String)"com.yonyoucloud.upc.aa.corpopeinit.getRegioncorpByLevel", params);
    }
}


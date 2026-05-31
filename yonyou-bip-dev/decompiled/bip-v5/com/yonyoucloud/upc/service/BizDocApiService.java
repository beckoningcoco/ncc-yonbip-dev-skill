/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.yonyou.ucf.mdd.ext.bill.dto.BillDataDto
 *  com.yonyou.ucf.mdd.ext.bill.rule.common.ResultList
 *  org.apache.commons.lang3.StringUtils
 *  org.springframework.stereotype.Component
 */
package com.yonyoucloud.upc.service;

import com.yonyou.ucf.mdd.ext.bill.dto.BillDataDto;
import com.yonyou.ucf.mdd.ext.bill.rule.common.ResultList;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.apache.commons.lang3.StringUtils;
import org.springframework.stereotype.Component;

@Component
public class BizDocApiService {
    public void buildIntegrationDataForBatchSave(BillDataDto bill) {
        String billnum = bill.getBillnum();
        if ("aa_warehouse".equals(billnum) || "pc_addressarchives".equals(billnum)) {
            boolean integration;
            Object externalData = bill.getExternalData();
            boolean bl = externalData instanceof Map && "true".equals(((Map)externalData).get("integrationForBatchSave") == null ? null : ((Map)externalData).get("integrationForBatchSave").toString()) ? true : (integration = false);
            if (!integration) {
                return;
            }
            Map externalDataMap = (Map)externalData;
            ArrayList inputSourceUnique = new ArrayList();
            List data = (List)bill.getData();
            for (Map inputDatum : data) {
                Object id = inputDatum.get("id");
                if (id == null || StringUtils.isBlank((CharSequence)id.toString())) {
                    inputDatum.put("_status", "Insert");
                } else {
                    inputDatum.put("_status", "Update");
                }
                inputSourceUnique.add(inputDatum.get("sourceUnique"));
            }
            externalDataMap.put("sourceUniqueList", inputSourceUnique);
        }
    }

    public void setResultListIntegrationForBatchSave(BillDataDto bill, ResultList result) {
        String billnum = bill.getBillnum();
        if ("aa_warehouse".equals(billnum) || "pc_addressarchives".equals(billnum)) {
            boolean integration;
            Object externalData = bill.getExternalData();
            boolean bl = externalData instanceof Map && "true".equals(((Map)externalData).get("integrationForBatchSave") == null ? null : ((Map)externalData).get("integrationForBatchSave").toString()) ? true : (integration = false);
            if (!integration) {
                return;
            }
            Map externalDataMap = (Map)externalData;
            List inputSourceUnique = (List)externalDataMap.get("sourceUniqueList");
            List infos = result.getInfos();
            for (Object info : infos) {
                Map infoMap = (Map)info;
                Object sourceUnique = infoMap.get("sourceUnique");
                if (sourceUnique == null || StringUtils.isBlank((CharSequence)sourceUnique.toString())) continue;
                HashMap uniqueMap = new HashMap();
                uniqueMap.put("sourceUnique", sourceUnique);
                uniqueMap.put("targetUnique", infoMap.get("id"));
                infoMap.put("data", uniqueMap);
                inputSourceUnique.remove(sourceUnique);
            }
            List messages = result.getMessages();
            ArrayList messageMapList = new ArrayList();
            int min = Math.min(messages.size(), inputSourceUnique.size());
            for (int i = 0; i < min; ++i) {
                HashMap messageMap = new HashMap();
                Object message = messages.get(i);
                Object sourceUnique = inputSourceUnique.get(i);
                messageMap.put("sourceUnique", sourceUnique);
                messageMap.put("message", message);
                messageMapList.add(messageMap);
            }
            result.setMessages(messageMapList);
        }
    }
}


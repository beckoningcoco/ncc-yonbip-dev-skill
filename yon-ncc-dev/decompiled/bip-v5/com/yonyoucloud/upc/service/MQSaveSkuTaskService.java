/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.alibaba.fastjson.JSON
 *  com.yonyou.ucf.mdd.common.model.ResultList
 *  com.yonyou.ucf.mdd.ext.bill.dto.BillDataDto
 *  com.yonyou.ucf.mdd.ext.bill.rule.common.ResultList
 *  com.yonyou.ucf.mdd.ext.core.AppContext
 *  com.yonyou.ucf.mdd.ext.sys.service.ApiUserService
 *  com.yonyou.ucf.mdd.ext.util.ResultMessage
 *  com.yonyoucloud.upc.pc.product.ProductSource
 *  org.slf4j.Logger
 *  org.slf4j.LoggerFactory
 *  org.springframework.beans.factory.annotation.Autowired
 *  org.springframework.beans.factory.annotation.Qualifier
 *  org.springframework.stereotype.Service
 */
package com.yonyoucloud.upc.service;

import com.alibaba.fastjson.JSON;
import com.yonyou.ucf.mdd.common.model.ResultList;
import com.yonyou.ucf.mdd.ext.bill.dto.BillDataDto;
import com.yonyou.ucf.mdd.ext.core.AppContext;
import com.yonyou.ucf.mdd.ext.sys.service.ApiUserService;
import com.yonyou.ucf.mdd.ext.util.ResultMessage;
import com.yonyoucloud.iuap.upc.api.service.IUPCBillService;
import com.yonyoucloud.upc.async.AsyncTask;
import com.yonyoucloud.upc.pc.product.ProductSource;
import com.yonyoucloud.upc.service.MQSaveTaskService;
import com.yonyoucloud.upc.service.ProductTplApiDataService;
import com.yonyoucloud.upc.service.UPCProductExcelService;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
public class MQSaveSkuTaskService
extends MQSaveTaskService {
    private static final Logger log = LoggerFactory.getLogger(MQSaveSkuTaskService.class);
    @Autowired
    ApiUserService apiUserService;
    @Autowired
    @Qualifier(value="pc.productExcelService")
    UPCProductExcelService upcProductExcelService;
    @Autowired
    ProductTplApiDataService productTplApiDataService;
    @Autowired
    @Qualifier(value="pc.BillService")
    IUPCBillService billService;

    @Override
    public void dealWithAck(AsyncTask task) throws Exception {
        this.saveSkuAndCallback(task);
    }

    private void saveSkuAndCallback(AsyncTask task) throws Exception {
        Map paramData = (Map)task.getData();
        BillDataDto bill = (BillDataDto)JSON.parseObject((String)JSON.toJSONString((Object)paramData), BillDataDto.class);
        Map<String, Object> param = task.getParam();
        log.error(String.format("MQSaveSkuTaskService Begin: skuasyncparamoutkafka = %s", JSON.toJSONString(param)));
        Object resource = param.get("resource");
        String url = AppContext.getEnvConfig((String)resource.toString()) + "/gwmanage/erpdata/upc/log";
        Object callbackUrl = param.get("callbackUrl");
        com.yonyou.ucf.mdd.ext.bill.rule.common.ResultList result = this.extBillService.batchSave(bill);
        if (resource != null && "ublinker".equals(resource.toString())) {
            this.sendUblinker(ResultMessage.data((Object)result), url, task);
        } else if (callbackUrl != null) {
            this.sendUblinker(ResultMessage.data((Object)result), callbackUrl.toString(), task);
        }
    }

    public ResultList saveSkuAndTpl(BillDataDto bill, String returnKey) throws Exception {
        List datas = (List)bill.getData();
        List<Map<String, Object>> skuDatas = this.trasformNcDataToSkuApi(datas);
        this.saveTplData(datas);
        return this.saveSku(skuDatas, returnKey);
    }

    private ResultList saveSku(List<Map<String, Object>> skuDatas, String returnKey) throws Exception {
        BillDataDto bill = new BillDataDto();
        bill.setKey(returnKey);
        bill.setBillnum("pc_productsku_edit");
        bill.setData(skuDatas);
        return this.billService.batchSave(bill);
    }

    private List<Map<String, Object>> trasformNcDataToSkuApi(List<Map<String, Object>> datas) {
        ArrayList<Map<String, Object>> skuDatas = new ArrayList<Map<String, Object>>();
        for (Map<String, Object> data : datas) {
            HashMap<String, Object> skuData = new HashMap<String, Object>();
            skuDatas.add(skuData);
            skuData.put("source", ProductSource.NCCAPI.getValue());
            for (Map.Entry<String, Object> next : data.entrySet()) {
                Map specDatas;
                String key = next.getKey();
                Object value = next.getValue();
                if ("product_code".equalsIgnoreCase(key)) {
                    skuData.put("productId_code", value);
                    continue;
                }
                if ("batchUnit_Code".equalsIgnoreCase(key)) {
                    skuData.put("batchUnit_Name", value);
                    continue;
                }
                if (key.startsWith("productSKUDetail")) {
                    String newKey = key.replace("productSKUDetail", "productSkuDetailNew");
                    skuData.put(newKey, value);
                    continue;
                }
                if ("specdatas".equalsIgnoreCase(key)) {
                    specDatas = (Map)value;
                    String specs = this.mapToString(specDatas);
                    skuData.put("specs", specs);
                    continue;
                }
                if ("skuDefines".equalsIgnoreCase(key)) {
                    specDatas = (Map)value;
                    String skuDefines = this.mapToString(specDatas);
                    skuData.put("skuDefines", skuDefines);
                    continue;
                }
                skuData.put(key, value);
            }
        }
        return skuDatas;
    }

    private String mapToString(Map<String, Object> dataMap) {
        String resultStr = "";
        for (Map.Entry<String, Object> next : dataMap.entrySet()) {
            String key = next.getKey();
            Object value = next.getValue();
            resultStr = resultStr + key + ":" + value + ";";
        }
        return resultStr;
    }

    private void saveTplData(List<Map<String, Object>> data) throws Exception {
        ArrayList<Object> apiMsgs = new ArrayList<Object>(data.size());
        this.productTplApiDataService.dealProductData(data, apiMsgs);
    }
}


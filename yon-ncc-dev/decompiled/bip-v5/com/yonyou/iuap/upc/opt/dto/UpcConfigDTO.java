/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.alibaba.fastjson.JSONArray
 *  com.alibaba.fastjson.JSONObject
 *  com.yonyou.iuap.apdoc.coredoc.constant.UPCConstant4OptionName
 */
package com.yonyou.iuap.upc.opt.dto;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.yonyou.iuap.apdoc.coredoc.constant.UPCConstant4OptionName;
import java.util.ArrayList;
import java.util.List;

public class UpcConfigDTO {
    private String name;
    private String remark;
    private String parameter;
    private String requestUrl;
    private String valueJson;
    private String value;
    private static String REQUEST_URL = "config/update";

    public static List<UpcConfigDTO> configOptList() {
        ArrayList<UpcConfigDTO> configList = new ArrayList<UpcConfigDTO>();
        UpcConfigDTO configDTO = new UpcConfigDTO();
        configDTO.setName("\u7269\u6599\u540d\u79f0\u552f\u4e00\u6027\u7ea6\u675f\u914d\u7f6e\u89c4\u5219");
        configDTO.setRemark("\u79df\u6237\u552f\u4e00\uff08\u9ed8\u8ba4\u652f\u6301\u540d\u79f0+\u89c4\u683c+\u578b\u53f7\uff09\uff0c\u4e0d\u6821\u9a8c");
        configDTO.setParameter("productCheckNameRepeat");
        configDTO.setRequestUrl(REQUEST_URL);
        configDTO.setValueJson(UPCConstant4OptionName.getConfigValue((String)"productCheckNameRepeat"));
        configList.add(configDTO);
        configDTO = new UpcConfigDTO();
        configDTO.setName("\u5ba2\u6237\u540d\u79f0\u552f\u4e00\u6027\u7ea6\u675f\u914d\u7f6e");
        configDTO.setRemark("\u79df\u6237\u552f\u4e00\u3001\u7ec4\u7ec7\u552f\u4e00\uff0c\u4e0d\u6821\u9a8c");
        configDTO.setParameter("merchantNameCheckSwitch");
        configDTO.setRequestUrl(REQUEST_URL);
        configDTO.setValueJson(UPCConstant4OptionName.getConfigValue((String)"merchantNameCheckSwitch"));
        configList.add(configDTO);
        configDTO = new UpcConfigDTO();
        configDTO.setName("\u5ba2\u6237\u6863\u6848\u9500\u552e\u533a\u57df\u662f\u5426\u4e0b\u53d1");
        configDTO.setRemark("\u5f53\u662f\"\u662f\"\u65f6,\u652f\u6301\u7ba1\u7406\u6863\u6848\u7f16\u8f91\u9500\u552e\u533a\u57df\u4e0b\u53d1\u7ec4\u7ec7\u7ea7\uff0c\u5f53\u662f\"\u5426\"\u65f6,\u4e0d\u652f\u6301\u4e0b\u53d1");
        configDTO.setParameter("isCustomerAreaIssueOrg");
        configDTO.setRequestUrl(REQUEST_URL);
        configDTO.setValueJson(UPCConstant4OptionName.getConfigValue((String)"isCustomerAreaIssueOrg"));
        configList.add(configDTO);
        configDTO = new UpcConfigDTO();
        configDTO.setName("\u5ba2\u6237\u6863\u6848\u8d1f\u8d23\u4eba\u662f\u5426\u4e0b\u53d1");
        configDTO.setRemark("\u5f53\u662f\"\u662f\"\u65f6,\u652f\u6301\u7ba1\u7406\u6863\u6848\u7f16\u8f91\u8d1f\u8d23\u4eba\u4e0b\u53d1\u7ec4\u7ec7\u7ea7\uff0c\u5f53\u662f\"\u5426\"\u65f6,\u4e0d\u652f\u6301\u4e0b\u53d1");
        configDTO.setParameter("isPrincipalIssueOrg");
        configDTO.setRequestUrl(REQUEST_URL);
        configDTO.setValueJson(UPCConstant4OptionName.getConfigValue((String)"isPrincipalIssueOrg"));
        configList.add(configDTO);
        configDTO = new UpcConfigDTO();
        configDTO.setName("\u5ba2\u6237\u6863\u6848\u662f\u5426\u5141\u8bb8\u9009\u62e9\u975e\u672b\u7ea7\u8282\u70b9");
        configDTO.setRemark("\u5f53\u662f\"\u662f\"\u65f6,\u65f6\u652f\u6301\u9009\u62e9\u975e\u672b\u7ea7\u3001\u5f53\u662f\"\u5426\"\u65f6,\u4e0d\u652f\u6301\uff1b\u6d89\u53ca\u6863\u6848\u5305\u62ec\u5ba2\u6237\u5206\u7c7b\u3001\u9500\u552e\u533a\u57df\u3001\u5ba2\u6237\u884c\u4e1a\uff0c\u652f\u6301\u5206\u7c7b\u6863\u6848\u975e\u53f6\u5b50\u8282\u70b9\u4fee\u6539\u6570\u636e");
        configDTO.setParameter("allowSelectNonLeafNodes");
        configDTO.setRequestUrl(REQUEST_URL);
        configDTO.setValueJson(UPCConstant4OptionName.getConfigValue((String)"allowSelectNonLeafNodes"));
        configList.add(configDTO);
        configDTO = new UpcConfigDTO();
        configDTO.setName("\u662f\u5426\u5141\u8bb8\u5ba2\u6237\u6863\u6848\u4f7f\u7528\u7ec4\u7ec7\u7ef4\u62a4\u5168\u5c40\u5b57\u6bb5");
        configDTO.setRemark("\u5f53\u662f\"\u662f\"\u65f6,\u5141\u8bb8\u8fd0\u884c\u7ec4\u7ec7\u7ef4\u62a4\u65f6\u7ef4\u62a4\u5168\u5c40\u5b57\u6bb5\uff0c\u5f53\u662f\"\u5426\"\u65f6,\u4e0d\u5141\u8bb8");
        configDTO.setParameter("isUpdateMerchantGlobalFields");
        configDTO.setRequestUrl(REQUEST_URL);
        configDTO.setValueJson(UPCConstant4OptionName.getConfigValue((String)"isUpdateMerchantGlobalFields"));
        configList.add(configDTO);
        configDTO = new UpcConfigDTO();
        configDTO.setName("\u5546\u5bb6\u5546\u54c1\u662f\u5426\u9700\u8981\u5ba1\u6838\u540e\u624d\u80fd\u4e0a\u67b6");
        configDTO.setRemark("\u5f53\u662f\"\u662f\"\u65f6,\u5546\u5bb6\u5546\u54c1\u9700\u8981\u5ba1\u6838\u540e\u624d\u80fd\u4e0a\u67b6\uff0c\u5f53\u662f\"\u5426\"\u65f6,\u4e0d\u9700\u8981\u5ba1\u6838\u53ef\u4ee5\u4e0a\u67b6");
        configDTO.setParameter("shopProIfCheck");
        configDTO.setRequestUrl(REQUEST_URL);
        configDTO.setValueJson(UPCConstant4OptionName.getConfigValue((String)"shopProIfCheck"));
        configList.add(configDTO);
        configDTO = new UpcConfigDTO();
        configDTO.setName("\u662f\u5426\u5141\u8bb8\u7269\u6599\u6863\u6848\u4f7f\u7528\u7ec4\u7ec7\u7ef4\u62a4\u5168\u5c40\u5b57\u6bb5");
        configDTO.setRemark("\u5f53\u662f\"\u662f\"\u65f6,\u5141\u8bb8\u8fd0\u884c\u7ec4\u7ec7\u7ef4\u62a4\u65f6\u7ef4\u62a4\u5168\u5c40\u5b57\u6bb5\uff0c\u5f53\u662f\"\u5426\"\u65f6,\u4e0d\u5141\u8bb8");
        configDTO.setParameter("isUpdateProductGlobalFields");
        configDTO.setRequestUrl(REQUEST_URL);
        configDTO.setValueJson(UPCConstant4OptionName.getConfigValue((String)"isUpdateProductGlobalFields"));
        configList.add(configDTO);
        configDTO = new UpcConfigDTO();
        configDTO.setName("\u4e8c\u7ef4\u5f55\u5165\u65e0\u9700SKU\u654f\u611f");
        configDTO.setRemark("\u5f53\u662f\"\u662f\"\u65f6,\u5141\u8bb8SKU\u654f\u611f\u8bbe\u7f6e\u4e3a\u5426\uff0c\u5f53\u662f\"\u5426\"\u65f6,\u4e0d\u5141\u8bb8");
        configDTO.setParameter("isTwoDimensionalNoNeedSen");
        configDTO.setRequestUrl(REQUEST_URL);
        configDTO.setValueJson(UPCConstant4OptionName.getConfigValue((String)"isTwoDimensionalNoNeedSen"));
        configList.add(configDTO);
        configDTO = new UpcConfigDTO();
        configDTO.setName("API\u67e5\u8be2\u6269\u5c55\u5b57\u6bb5\uff0c\u662f\u5426\u5c06\u5e03\u5c14\u503c\u8f6c\u4e3a\u6574\u6570");
        configDTO.setRemark("\u5f53\u662f\"\u662f\"\u65f6,\u8f6c\u6362\uff0c\u5f53\u662f\"\u5426\"\u65f6,\u4e0d\u8f6c\u6362");
        configDTO.setParameter("isConvertBooleanToInt");
        configDTO.setRequestUrl(REQUEST_URL);
        configDTO.setValueJson(UPCConstant4OptionName.getConfigValue((String)"isConvertBooleanToInt"));
        configList.add(configDTO);
        return configList;
    }

    public static List<UpcConfigDTO> defaultConfigList() {
        ArrayList<UpcConfigDTO> configList = new ArrayList<UpcConfigDTO>();
        configList.addAll(UpcConfigDTO.configOptList());
        UpcConfigDTO configDTO = new UpcConfigDTO();
        configDTO.setName("\u662f\u5426\u5f00\u542fsku\u5f02\u6b65");
        configDTO.setRemark("\u662f\uff1asku\u754c\u9762\u4fdd\u5b58\u662f\u5f00\u542f\u5f02\u6b65\uff0c\u4e0d\u542f\u7528\uff1a\u4e0d\u5f00\u542f\u5f02\u6b65\uff0c\u9ed8\u8ba4\u4e0d\u5f00\u542f");
        configDTO.setParameter("productSkuSaveAsync");
        configDTO.setRequestUrl(REQUEST_URL);
        configDTO.setValueJson(UPCConstant4OptionName.getConfigValue((String)"productSkuSaveAsync"));
        configList.add(configDTO);
        configDTO = new UpcConfigDTO();
        configDTO.setName("\u662f\u5426\u652f\u6301\u5ba2\u6237\u6863\u6848\u5217\u8868distinct");
        configDTO.setRemark("\u5f53\u662f\"\u662f\"\u65f6,\u65f6\u652f\u6301SQL\u4e2ddistinct\u3001\u5f53\u662f\"\u5426\"\u65f6,\u4e0d\u652f\u6301SQL\u4e2ddistinct");
        configDTO.setParameter("isMerchantListDistinct");
        configDTO.setRequestUrl(REQUEST_URL);
        configDTO.setValueJson(UPCConstant4OptionName.getConfigValue((String)"isMerchantListDistinct"));
        configList.add(configDTO);
        configDTO = new UpcConfigDTO();
        configDTO.setName("\u5f53\u524d\u79df\u6237\u662f\u5426\u662f\u65b0\u5f00\u901a\u79df\u6237");
        configDTO.setRemark("\u5f53\u662f\"\u662f\"\u65f6,\u662f\u65b0\u79df\u6237\u5f00\u901a\uff0c\u5f53\u662f\"\u5426\"\u65f6,\u4e0d\u662f\u65b0\u79df\u6237");
        configDTO.setParameter("isNewTenantOpen");
        configDTO.setRequestUrl(REQUEST_URL);
        configDTO.setValueJson(UPCConstant4OptionName.getConfigValue((String)"isNewTenantOpen"));
        configList.add(configDTO);
        configDTO = new UpcConfigDTO();
        configDTO.setName("\u65b0\u5f00\u79df\u6237\u6807\u8bc6V2\u7248\u672c");
        configDTO.setRemark("\u5f53\u662f\"0\"\u65f6,\u9ed8\u8ba4\u4e0d\u5904\u7406\uff0c\u5f53\u662f\"1\"\u65f6,\u9690\u85cf\u751f\u4ea7\u6a21\u5f0f[20240518]");
        configDTO.setParameter("isNewTenantOpenV2");
        configDTO.setRequestUrl(REQUEST_URL);
        configDTO.setValueJson(UPCConstant4OptionName.getConfigValue((String)"isNewTenantOpenV2"));
        configList.add(configDTO);
        return configList;
    }

    public static boolean validConfigValue(String key, String value) {
        boolean flag = false;
        String values = UPCConstant4OptionName.getConfigValue((String)key);
        if (values != null && values.length() > 0) {
            JSONArray jsonArray = JSONArray.parseArray((String)values);
            for (int i = 0; i < jsonArray.size(); ++i) {
                JSONObject jsonObject = jsonArray.getJSONObject(i);
                if (!jsonObject.containsKey((Object)"value") || !jsonObject.getString("value").equals(value)) continue;
                flag = true;
                break;
            }
        }
        return flag;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public void setParameter(String parameter) {
        this.parameter = parameter;
    }

    public void setRequestUrl(String requestUrl) {
        this.requestUrl = requestUrl;
    }

    public void setValueJson(String valueJson) {
        this.valueJson = valueJson;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public String getName() {
        return this.name;
    }

    public String getRemark() {
        return this.remark;
    }

    public String getParameter() {
        return this.parameter;
    }

    public String getRequestUrl() {
        return this.requestUrl;
    }

    public String getValueJson() {
        return this.valueJson;
    }

    public String getValue() {
        return this.value;
    }
}


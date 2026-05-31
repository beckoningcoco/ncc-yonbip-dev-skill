/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.alibaba.fastjson.JSONArray
 *  com.alibaba.fastjson.JSONObject
 *  com.yonyou.iuap.apdoc.coredoc.enums.CoreDocBusinessErrorEnum
 *  com.yonyou.iuap.apdoc.coredoc.exceptions.CoreDocBusinessException
 *  org.imeta.biz.base.Objectlizer
 *  org.imeta.orm.base.BizObject
 *  org.springframework.util.CollectionUtils
 */
package com.yonyoucloud.upc.service.batchModify.common;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.yonyou.iuap.apdoc.coredoc.enums.CoreDocBusinessErrorEnum;
import com.yonyou.iuap.apdoc.coredoc.exceptions.CoreDocBusinessException;
import com.yonyoucloud.upc.service.batchModify.common.BatchModifyConfig;
import java.math.BigDecimal;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.imeta.biz.base.Objectlizer;
import org.imeta.orm.base.BizObject;
import org.springframework.util.CollectionUtils;

public class ModifyUtils {
    public static Map<String, String> findMaterialCharacterTypeMap(List<Map> characters) {
        HashMap<String, String> resultMap = new HashMap<String, String>();
        if (!CollectionUtils.isEmpty(characters)) {
            for (Map character : characters) {
                if (character.get("structs") == null) continue;
                JSONArray structs1 = (JSONArray)character.get("structs");
                for (Object object : structs1) {
                    JSONObject jsonObject = (JSONObject)object;
                    resultMap.put(jsonObject.get((Object)"cName").toString(), jsonObject.get((Object)"cControlType").toString());
                }
            }
        }
        return resultMap;
    }

    public static Map<String, Object> convertPropCharacterTypeMap(Map<String, Object> stringObjectMap, Map<String, String> characterTypeMap) {
        HashMap<String, Object> resultMap = new HashMap<String, Object>();
        for (Map.Entry<String, Object> entry : stringObjectMap.entrySet()) {
            String key = entry.getKey();
            Object value = entry.getValue();
            if (!characterTypeMap.containsKey(key)) continue;
            String type = characterTypeMap.get(key);
            if (value == null) {
                resultMap.put(key, null);
                continue;
            }
            if ("InputNumber".equals(type)) {
                resultMap.put(key, new BigDecimal(value.toString()));
                continue;
            }
            resultMap.put(key, value);
        }
        return resultMap;
    }

    public static BizObject convertBizObjectByFullName(BizObject bizObject, String fullName) throws Exception {
        HashMap data = new HashMap(bizObject);
        return Objectlizer.convert(data, (String)fullName);
    }

    public static String createDataIdentifier(String billNum, BizObject bizObject, String uniqueIdentifier) {
        if (BatchModifyConfig.uniqueIdentifierMap.containsKey(billNum)) {
            uniqueIdentifier = "";
            Set<String> identifierFields = BatchModifyConfig.uniqueIdentifierMap.get(billNum);
            if (!CollectionUtils.isEmpty(identifierFields)) {
                for (String identifierField : identifierFields) {
                    if (bizObject.get(identifierField) == null) {
                        throw new CoreDocBusinessException(CoreDocBusinessErrorEnum.Identifier_IS_NULL);
                    }
                    uniqueIdentifier = uniqueIdentifier + bizObject.get(identifierField).toString();
                }
            }
        }
        return uniqueIdentifier;
    }
}


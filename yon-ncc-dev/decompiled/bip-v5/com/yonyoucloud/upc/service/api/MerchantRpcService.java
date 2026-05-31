/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.alibaba.fastjson.JSON
 *  com.alibaba.fastjson.JSONObject
 *  com.yonyou.iuap.ucf.common.i18n.InternationalUtils
 *  com.yonyou.ucf.mdd.ext.filter.util.StringUtil
 *  com.yonyoucloud.iuap.upc.dto.MerchantDTO
 *  org.slf4j.Logger
 *  org.slf4j.LoggerFactory
 *  org.springframework.beans.factory.annotation.Autowired
 *  org.springframework.stereotype.Service
 *  org.springframework.util.CollectionUtils
 *  org.springframework.util.StringUtils
 */
package com.yonyoucloud.upc.service.api;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.yonyou.iuap.ucf.common.i18n.InternationalUtils;
import com.yonyou.ucf.mdd.ext.filter.util.StringUtil;
import com.yonyoucloud.iuap.upc.api.IMerchantService;
import com.yonyoucloud.iuap.upc.dto.MerchantDTO;
import com.yonyoucloud.upc.service.IMerchantRpcService;
import com.yonyoucloud.upc.service.api.FormulaPubFuntion;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;
import org.springframework.util.StringUtils;

@Service
public class MerchantRpcService
extends FormulaPubFuntion
implements IMerchantRpcService {
    private static final Logger log = LoggerFactory.getLogger(MerchantRpcService.class);
    @Autowired
    private IMerchantService merchantService;

    @Override
    public Object getMerchantValue(String field, Long merchantId, Long orgId) {
        Object retValue = null;
        if (StringUtil.isEmpty((String)field) || null == merchantId || orgId == null) {
            log.error(InternationalUtils.getMessageWithDefault((String)"UID:P_COREDOC-BE_179F62860408091B", (String)"\u67e5\u8be2\u53c2\u6570\u4e0d\u80fd\u4e3a\u7a7a"));
        } else {
            try {
                MerchantDTO merchantDTO = this.merchantService.getMerchantByIdAndOrg(merchantId, orgId, new String[]{field});
                retValue = JSONObject.parseObject((String)JSON.toJSONString((Object)merchantDTO)).get((Object)field);
            }
            catch (Exception e) {
                throw new RuntimeException(e);
            }
        }
        return retValue;
    }

    @Override
    public Object getMerchantValue(String field, String merchantStrId, Long orgId) {
        Long merchantId = StringUtils.hasLength((String)merchantStrId) ? Long.valueOf(merchantStrId) : 0L;
        return this.getMerchantValue(field, merchantId, orgId);
    }

    @Override
    public Object getMerchantValue(String field, Long merchantId, String orgStrId) {
        Long orgId = StringUtils.hasLength((String)orgStrId) ? Long.valueOf(orgStrId) : 0L;
        return this.getMerchantValue(field, merchantId, orgId);
    }

    @Override
    public Object getMerchantValue(String field, String merchantStrId, String orgStrId) {
        Long merchantId = StringUtils.hasLength((String)merchantStrId) ? Long.valueOf(merchantStrId) : 0L;
        Long orgId = StringUtils.hasLength((String)orgStrId) ? 0L : Long.valueOf(orgStrId);
        return this.getMerchantValue(field, merchantId, orgId);
    }

    @Override
    public Object getMerchantValues(String field, List<Object> merchantIdObjs, List<Object> orgIdObjs) {
        Object retValue = "";
        List<Long> merchantIds = this.toLongList(merchantIdObjs);
        List<String> orgIds = this.toStringList(orgIdObjs);
        if (StringUtil.isEmpty((String)field) || CollectionUtils.isEmpty(merchantIds) || CollectionUtils.isEmpty(orgIds)) {
            log.error(InternationalUtils.getMessageWithDefault((String)"UID:P_COREDOC-BE_179F628604080401", (String)"\u67e5\u8be2\u53c2\u6570\u4e0d\u80fd\u4e3a\u7a7a"));
        } else {
            HashMap<String, List<Long>> orgMap = this.groupDocByOrgIds(merchantIds, orgIds);
            try {
                Iterator<Map.Entry<String, List<Long>>> it = orgMap.entrySet().iterator();
                HashMap<Long, Object> orgValueMap = new HashMap<Long, Object>(merchantIds.size());
                while (it.hasNext()) {
                    Map.Entry<String, List<Long>> entry = it.next();
                    String orgId = entry.getKey();
                    List<Long> orgSkuIds = entry.getValue();
                    List<MerchantDTO> merchantDTOList = this.merchantService.getMerchantByIdsAndOrg(orgSkuIds, Long.valueOf(orgId), new String[]{field});
                    if (merchantDTOList == null || merchantDTOList.size() <= 0) continue;
                    merchantDTOList.forEach(merchantDTO -> orgValueMap.put(merchantDTO.getId(), JSONObject.parseObject((String)JSON.toJSONString((Object)merchantDTO)).get((Object)field)));
                }
                retValue = this.matchValue(merchantIds, orgValueMap);
            }
            catch (Exception e) {
                log.error(InternationalUtils.getMessageWithDefault((String)"UID:P_COREDOC-BE_179F628604080402", (String)"\u516c\u5f0f\u6267\u884c\u9519\u8bef"));
            }
        }
        return retValue;
    }
}


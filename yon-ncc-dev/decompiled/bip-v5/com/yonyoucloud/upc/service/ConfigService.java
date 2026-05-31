/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.yonyou.iuap.apdoc.coredoc.exceptions.CoreDocBusinessException
 *  com.yonyou.iuap.apdoc.coredoc.po.pub.UpcPubOptionData
 *  com.yonyou.ucf.mdd.ext.core.AppContext
 *  com.yonyou.ucf.mdd.ext.dao.sql.SqlHelper
 *  com.yonyou.ucf.mdd.ext.option.service.impl.OptionCacheUtil
 *  org.apache.commons.lang3.StringUtils
 *  org.imeta.spring.support.id.IdManager
 *  org.slf4j.Logger
 *  org.slf4j.LoggerFactory
 *  org.springframework.stereotype.Service
 *  org.springframework.util.CollectionUtils
 */
package com.yonyoucloud.upc.service;

import com.yonyou.iuap.apdoc.coredoc.exceptions.CoreDocBusinessException;
import com.yonyou.iuap.apdoc.coredoc.po.pub.UpcPubOptionData;
import com.yonyou.ucf.mdd.ext.core.AppContext;
import com.yonyou.ucf.mdd.ext.dao.sql.SqlHelper;
import com.yonyou.ucf.mdd.ext.option.service.impl.OptionCacheUtil;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.apache.commons.lang3.StringUtils;
import org.imeta.spring.support.id.IdManager;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;

@Service
public class ConfigService {
    private static final Logger log = LoggerFactory.getLogger(ConfigService.class);

    public Map<String, Object> updateOptionValue(UpcPubOptionData upcPubOptionData) throws Exception {
        HashMap<String, Object> params = new HashMap<String, Object>();
        if (StringUtils.isEmpty((CharSequence)upcPubOptionData.getName()) || StringUtils.isEmpty((CharSequence)upcPubOptionData.getValue())) {
            throw new CoreDocBusinessException(null, "name or value is null!");
        }
        params.put("name", upcPubOptionData.getName());
        params.put("value", upcPubOptionData.getValue());
        params.put("yTenantId", AppContext.getCurrentUser().getYTenantId());
        List optionDataList = SqlHelper.selectList((String)"com.yonyoucloud.upc.mapper.dao.pubOptionData.selectOptionDataValue", params);
        if (!CollectionUtils.isEmpty((Collection)optionDataList)) {
            SqlHelper.update((String)"com.yonyoucloud.upc.mapper.dao.pubOptionData.updateOptionDataValue", params);
        } else {
            params.put("id", IdManager.getInstance().nextId());
            params.put("caption", upcPubOptionData.getCaption());
            params.put("captionResid", upcPubOptionData.getCaptionResId());
            params.put("tenantId", AppContext.getTenantId());
            SqlHelper.insert((String)"com.yonyoucloud.upc.mapper.dao.pubOptionData.insertSysOptionDataValue", params);
        }
        OptionCacheUtil.clearOptionCache((Object)"null");
        return params;
    }
}


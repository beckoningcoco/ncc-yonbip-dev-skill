/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.yonyou.ucf.mdd.ext.core.AppContext
 *  com.yonyou.ypd.bd.api.IBDQueryRepository
 *  org.imeta.orm.base.BizObject
 *  org.imeta.orm.schema.ConditionExpression
 *  org.imeta.orm.schema.QueryCondition
 *  org.imeta.orm.schema.QueryConditionGroup
 *  org.imeta.orm.schema.QuerySchema
 *  org.slf4j.Logger
 *  org.slf4j.LoggerFactory
 *  org.springframework.beans.factory.annotation.Autowired
 *  org.springframework.stereotype.Service
 *  org.springframework.util.CollectionUtils
 */
package com.yonyoucloud.upc.service;

import com.yonyou.ucf.mdd.ext.core.AppContext;
import com.yonyou.ypd.bd.api.IBDQueryRepository;
import com.yonyoucloud.iuap.upc.api.service.IUPCMerchantCheckService;
import com.yonyoucloud.upc.cache.BizCache;
import java.text.MessageFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import org.imeta.orm.base.BizObject;
import org.imeta.orm.schema.ConditionExpression;
import org.imeta.orm.schema.QueryCondition;
import org.imeta.orm.schema.QueryConditionGroup;
import org.imeta.orm.schema.QuerySchema;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;

@Service
public class UPCMerchantCheckService
implements IUPCMerchantCheckService {
    private static final Logger log = LoggerFactory.getLogger(UPCMerchantCheckService.class);
    @Autowired
    BizCache bizCache;
    @Autowired
    private IBDQueryRepository billQueryRepository;

    @Override
    public boolean checkMerchantRegionCode(String code, BizObject bio) {
        log.info("UPCMerchantCheckServiceregioncode:{}", (Object)code);
        try {
            boolean result;
            Class dataType = null;
            String bizKey = "checkMerchantRegionCodes";
            ArrayList regionCodeList = (ArrayList)this.bizCache.get(bizKey, dataType);
            if (CollectionUtils.isEmpty((Collection)regionCodeList)) {
                QueryConditionGroup condition = QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"tenant").in(Arrays.asList((Long)AppContext.getCurrentUser().getTenant(), 0L))});
                QuerySchema schema = QuerySchema.create().addSelect("code").addCondition((ConditionExpression)condition);
                schema.setPartitionable(false);
                schema.distinct();
                List regionCodes = this.billQueryRepository.queryMapBySchema("aa.regioncorp.RegionCorp", schema);
                if (!CollectionUtils.isEmpty((Collection)regionCodes)) {
                    this.bizCache.set(bizKey, regionCodes);
                    regionCodeList = regionCodes;
                } else {
                    this.bizCache.set(bizKey, new ArrayList());
                    regionCodeList = new ArrayList();
                }
            }
            if (regionCodeList.size() == 0) {
                return false;
            }
            boolean bl = result = regionCodeList.stream().filter(regioncode -> code.equals(regioncode.get("code"))).distinct().count() == 1L;
            if (!result) {
                String newCode = MessageFormat.format("{0}000000", code);
                boolean bl2 = result = regionCodeList.stream().filter(regioncode -> newCode.equals(regioncode.get("code"))).distinct().count() == 1L;
                if (result) {
                    bio.put("regionCode", (Object)newCode);
                }
            }
            return result;
        }
        catch (Exception e) {
            log.info("UPCMerchantCheckServicecheckMerchantRegionCode:{}", (Throwable)e);
            return false;
        }
    }
}


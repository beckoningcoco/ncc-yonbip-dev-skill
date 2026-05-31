/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.alibaba.fastjson.JSON
 *  com.esotericsoftware.minlog.Log
 *  com.yonyou.diwork.ott.exexutors.RobotExecutors
 *  com.yonyou.iuap.apdoc.coredoc.enums.CoreDocBusinessErrorEnum
 *  com.yonyou.iuap.apdoc.coredoc.exceptions.CoreDocBusinessException
 *  com.yonyou.iuap.basedoc.social.distribute.service.AbstractDistributeHandler
 *  com.yonyou.iuap.basedoc.social.param.DocDataMappingInfo
 *  com.yonyou.iuap.basedoc.social.param.ErrorMessage
 *  com.yonyou.iuap.basedoc.social.param.SocialDistributeParam
 *  com.yonyou.iuap.basedoc.social.param.SocialMcTypeParam
 *  com.yonyou.iuap.basedoc.social.util.SocialMcTypeParser
 *  com.yonyou.iuap.ucf.common.i18n.InternationalUtils
 *  com.yonyou.ucf.mdd.common.model.rule.RuleExecuteResult
 *  com.yonyou.ucf.mdd.ext.bill.dto.BillDataDto
 *  com.yonyoucloud.upc.utils.SocialUntil
 *  org.imeta.orm.base.EntityStatus
 *  org.imeta.spring.support.id.IdManager
 *  org.slf4j.Logger
 *  org.slf4j.LoggerFactory
 *  org.springframework.beans.factory.annotation.Autowired
 *  org.springframework.beans.factory.annotation.Qualifier
 *  org.springframework.stereotype.Component
 *  org.springframework.util.CollectionUtils
 */
package com.yonyoucloud.upc.service.social;

import com.alibaba.fastjson.JSON;
import com.esotericsoftware.minlog.Log;
import com.yonyou.diwork.ott.exexutors.RobotExecutors;
import com.yonyou.iuap.apdoc.coredoc.enums.CoreDocBusinessErrorEnum;
import com.yonyou.iuap.apdoc.coredoc.exceptions.CoreDocBusinessException;
import com.yonyou.iuap.basedoc.social.distribute.service.AbstractDistributeHandler;
import com.yonyou.iuap.basedoc.social.param.DocDataMappingInfo;
import com.yonyou.iuap.basedoc.social.param.ErrorMessage;
import com.yonyou.iuap.basedoc.social.param.SocialDistributeParam;
import com.yonyou.iuap.basedoc.social.param.SocialMcTypeParam;
import com.yonyou.iuap.basedoc.social.util.SocialMcTypeParser;
import com.yonyou.iuap.ucf.common.i18n.InternationalUtils;
import com.yonyou.ucf.mdd.common.model.rule.RuleExecuteResult;
import com.yonyou.ucf.mdd.ext.bill.dto.BillDataDto;
import com.yonyoucloud.iuap.upc.api.service.IUPCBillService;
import com.yonyoucloud.upc.utils.SocialUntil;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.function.Function;
import java.util.stream.Collectors;
import org.imeta.orm.base.EntityStatus;
import org.imeta.spring.support.id.IdManager;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
import org.springframework.util.CollectionUtils;

@Component(value="distributehandlerpc.brand.BrandClass")
public class BrandClassSocialService
extends AbstractDistributeHandler {
    Logger logger = LoggerFactory.getLogger(BrandClassSocialService.class);
    @Autowired
    @Qualifier(value="pc.BillService")
    private IUPCBillService upcBillService;

    public void handlerBefore(SocialDistributeParam socialDistributeParam) {
        this.setIsOverWrite(true);
    }

    public Map handler(SocialDistributeParam socialDistributeParam) throws Exception {
        this.setIsOverWrite(true);
        String srcYTenantId = socialDistributeParam.getSrcTenantid();
        Long srcTenantId = SocialUntil.getTenantIdByTenantCenterId((String)socialDistributeParam.getSrcTenantid());
        String desYTenantId = socialDistributeParam.getDesTenantid();
        Long desTenantId = SocialUntil.getTenantIdByTenantCenterId((String)desYTenantId);
        HashMap result = new HashMap();
        Runnable runnable = () -> {
            Map queryData = null;
            try {
                queryData = SocialUntil.queryData((SocialDistributeParam)socialDistributeParam, (Long)srcTenantId, (Long)desTenantId, (String)srcYTenantId, (String)desYTenantId);
            }
            catch (Exception e) {
                Log.error((String)InternationalUtils.getMessageWithDefault((String)"UID:P_COREDOC-BE_179F6286040802B1", (String)"\u54c1\u724c\u5206\u7c7b\u4f01\u4e1a\u7fa4\u4e0b\u53d1\u5f02\u5e38"), (String)e.getMessage(), (Throwable)e);
                throw new CoreDocBusinessException(CoreDocBusinessErrorEnum.BRAND_CLASS_SOCIAL_ERROR);
            }
            List distributes = (List)queryData.get("distributes");
            List desHasDistributes = (List)queryData.get("desHasDistributes");
            Map finalHasDistributeMap = desHasDistributes.stream().collect(Collectors.toMap(data -> data.getSocialSrcid(), Function.identity(), (oldData, newData) -> oldData));
            SocialMcTypeParam socialMcTypeParam = socialDistributeParam.getSocialMcTypeParam();
            Integer count = distributes.size();
            AtomicInteger failCount = new AtomicInteger();
            ArrayList errorMessages = new ArrayList();
            ArrayList infos = new ArrayList();
            if (!CollectionUtils.isEmpty((Collection)distributes)) {
                distributes.forEach(data -> {
                    String socialSrcId = data.getId().toString();
                    Map existData = (Map)finalHasDistributeMap.get(socialSrcId);
                    Date time = new Date();
                    if (existData != null) {
                        data.setId(existData.get("id"));
                        data.setModifyTime(time);
                        data.setModifyDate(time);
                        data.setEntityStatus(EntityStatus.Update);
                    } else {
                        data.setId((Object)IdManager.getInstance().nextId());
                        data.setCreateTime(time);
                        data.setCreateDate(time);
                        data.setEntityStatus(EntityStatus.Insert);
                    }
                    data.setTenant(desTenantId);
                    data.setSocialSrcid(socialSrcId);
                    data.setSocialMctype(Short.valueOf((short)SocialMcTypeParser.parseSocialMcType((SocialMcTypeParam)socialMcTypeParam, (Map)data)));
                    data.setSocialTenantid(srcYTenantId);
                    data.set("ytenant", (Object)desYTenantId);
                    data.set("data_from_type", (Object)"social");
                    try {
                        BillDataDto billDataDto = new BillDataDto();
                        billDataDto.setBillnum(socialDistributeParam.getBillno());
                        billDataDto.setData(data);
                        RuleExecuteResult resultMap = this.upcBillService.executeUpdate("save", billDataDto);
                        String newId = data.getId().toString();
                        if (resultMap.getData() instanceof Map && !((Map)resultMap.getData()).isEmpty()) {
                            newId = String.valueOf(((Map)resultMap.getData()).get("id"));
                        } else if (resultMap.getData() instanceof List && !CollectionUtils.isEmpty((Collection)((List)resultMap.getData()))) {
                            newId = String.valueOf(((Map)((List)resultMap.getData()).get(0)).get("id"));
                        }
                        infos.add(DocDataMappingInfo.buildDocDataMappingInfo((String)socialSrcId, (String)newId));
                    }
                    catch (Exception e) {
                        failCount.getAndIncrement();
                        errorMessages.add(new ErrorMessage(socialSrcId, e.getMessage()));
                        this.logger.error("data = [{}]", (Object)JSON.toJSONString((Object)data), (Object)e);
                    }
                });
            }
            result.put("count", count);
            result.put("failCount", failCount);
            result.put("infos", infos);
            result.put("errorMessages", errorMessages);
        };
        RobotExecutors.runAs((String)desYTenantId, (Runnable)runnable);
        return result;
    }
}


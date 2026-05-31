/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.alibaba.fastjson.JSON
 *  com.yonyou.diwork.ott.exexutors.RobotExecutors
 *  com.yonyou.diwork.service.auth.IServiceIsolateService
 *  com.yonyou.iuap.apdoc.coredoc.enums.CoreExtrateBusinessErrorEnum
 *  com.yonyou.iuap.apdoc.coredoc.exceptions.CoreDocBusinessException
 *  com.yonyou.iuap.basedoc.social.distribute.service.AbstractDistributeHandler
 *  com.yonyou.iuap.basedoc.social.param.DocDataMappingInfo
 *  com.yonyou.iuap.basedoc.social.param.ErrorMessage
 *  com.yonyou.iuap.basedoc.social.param.SocialDistributeParam
 *  com.yonyou.iuap.basedoc.social.param.SocialMcTypeParam
 *  com.yonyou.iuap.basedoc.social.util.SocialMcTypeParser
 *  com.yonyou.ucf.mdd.common.model.rule.RuleExecuteResult
 *  com.yonyou.ucf.mdd.ext.bill.dto.BillDataDto
 *  com.yonyou.ucf.mdd.ext.core.AppContext
 *  com.yonyou.ucf.mdd.ext.option.util.OptionUtils
 *  com.yonyoucloud.upc.pc.product.Product
 *  com.yonyoucloud.upc.pc.product.ProductSource
 *  com.yonyoucloud.upc.utils.SocialUntil
 *  org.apache.commons.lang3.StringUtils
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
import com.yonyou.diwork.ott.exexutors.RobotExecutors;
import com.yonyou.diwork.service.auth.IServiceIsolateService;
import com.yonyou.iuap.apdoc.coredoc.enums.CoreExtrateBusinessErrorEnum;
import com.yonyou.iuap.apdoc.coredoc.exceptions.CoreDocBusinessException;
import com.yonyou.iuap.basedoc.social.distribute.service.AbstractDistributeHandler;
import com.yonyou.iuap.basedoc.social.param.DocDataMappingInfo;
import com.yonyou.iuap.basedoc.social.param.ErrorMessage;
import com.yonyou.iuap.basedoc.social.param.SocialDistributeParam;
import com.yonyou.iuap.basedoc.social.param.SocialMcTypeParam;
import com.yonyou.iuap.basedoc.social.util.SocialMcTypeParser;
import com.yonyou.ucf.mdd.common.model.rule.RuleExecuteResult;
import com.yonyou.ucf.mdd.ext.bill.dto.BillDataDto;
import com.yonyou.ucf.mdd.ext.core.AppContext;
import com.yonyou.ucf.mdd.ext.option.util.OptionUtils;
import com.yonyoucloud.iuap.upc.api.service.IUPCBillService;
import com.yonyoucloud.upc.pc.product.Product;
import com.yonyoucloud.upc.pc.product.ProductSource;
import com.yonyoucloud.upc.utils.SocialUntil;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.function.Function;
import java.util.stream.Collectors;
import org.apache.commons.lang3.StringUtils;
import org.imeta.orm.base.EntityStatus;
import org.imeta.spring.support.id.IdManager;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
import org.springframework.util.CollectionUtils;

@Component(value="distributehandlerpc.product.Product")
public class ProductSocialService
extends AbstractDistributeHandler {
    private static final Logger log = LoggerFactory.getLogger(ProductSocialService.class);
    @Autowired
    @Qualifier(value="pc.BillService")
    private IUPCBillService upcBillService;
    @Autowired
    private IServiceIsolateService iServiceIsolateService;

    public void handlerBefore(SocialDistributeParam socialDistributeParam) {
        this.setIsOverWrite(true);
    }

    public Map handler(SocialDistributeParam socialDistributeParam) throws Exception {
        this.setIsOverWrite(true);
        String srcYTenantId = socialDistributeParam.getSrcTenantid();
        Long srcTenantId = SocialUntil.getTenantIdByTenantCenterId((String)socialDistributeParam.getSrcTenantid());
        String desYTenantId = socialDistributeParam.getDesTenantid();
        Long desTenantId = SocialUntil.getTenantIdByTenantCenterId((String)desYTenantId);
        Map queryData = SocialUntil.queryData((SocialDistributeParam)socialDistributeParam, (Long)srcTenantId, (Long)desTenantId, (String)srcYTenantId, (String)desYTenantId);
        List distributes = (List)queryData.get("distributes");
        List desHasDistributes = (List)queryData.get("desHasDistributes");
        Map finalHasDistributeMap = desHasDistributes.stream().collect(Collectors.toMap(data -> data.getSocialSrcid(), Function.identity(), (oldData, newData) -> oldData));
        SocialMcTypeParam socialMcTypeParam = socialDistributeParam.getSocialMcTypeParam();
        Integer count = distributes.size();
        AtomicInteger failCount = new AtomicInteger();
        ArrayList errorMessages = new ArrayList();
        ArrayList infos = new ArrayList();
        if (!CollectionUtils.isEmpty((Collection)distributes)) {
            Map propsIdMapping = socialDistributeParam.getPropsIdMapping();
            String defaultOpenApp = "true";
            Object isSingleOrg = OptionUtils.getSysOptionByName((String)"singleOrg");
            distributes.forEach(data -> {
                String socialSrcId = data.getId().toString();
                Map existData = (Map)finalHasDistributeMap.get(socialSrcId);
                if (isSingleOrg != null && defaultOpenApp.equals(isSingleOrg.toString())) {
                    List permissionResult = this.iServiceIsolateService.findMainOrgPermission(AppContext.getCurrentUser().getYhtUserId(), "pc_product", AppContext.getCurrentUser().getYhtTenantId());
                    if (CollectionUtils.isEmpty((Collection)permissionResult)) {
                        throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_801018);
                    }
                    if (permissionResult.size() == 1 && "666666".equals(permissionResult.get(0))) {
                        throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_801018);
                    }
                    List stringList = permissionResult.stream().filter(r -> !r.equals("666666")).collect(Collectors.toList());
                    data.setOrgId((String)stringList.get(0));
                } else {
                    data.setOrgId("666666");
                }
                data.setTenant(desTenantId);
                data.setSocialSrcid(socialSrcId);
                data.setSocialMctype(SocialMcTypeParser.parseSocialMcType((SocialMcTypeParam)socialMcTypeParam, (Map)data));
                data.setSocialTenantid(srcYTenantId);
                data.setSource(ProductSource.Social);
                data.set("ytenant", (Object)desYTenantId);
                data.set("data_from_type", (Object)"social");
                Date nowDate = new Date();
                if (existData != null) {
                    data.setId(existData.get("id"));
                    data.setModifyTime(nowDate);
                    data.setModifyDate(nowDate);
                    data.setEntityStatus(EntityStatus.Update);
                    data.setOrgId("666666");
                    SocialUntil.setProductApplyRangeAndDetailForSocial((Product)data, (String)srcYTenantId, (Map)propsIdMapping);
                } else {
                    data.setId((Object)IdManager.getInstance().nextId());
                    data.setCreateTime(nowDate);
                    data.setCreateDate(nowDate);
                    data.setEntityStatus(EntityStatus.Insert);
                    SocialUntil.setProductApplyRangeAndDetailForSocial((Product)data, (String)srcYTenantId, (Map)propsIdMapping);
                }
                try {
                    if (propsIdMapping != null && !propsIdMapping.isEmpty()) {
                        propsIdMapping.forEach((propName, idMaping) -> {
                            String parent;
                            String propNameId;
                            if (data.get(propName) != null && StringUtils.isNotBlank((CharSequence)(propNameId = data.get(propName).toString())) && StringUtils.isNotEmpty((CharSequence)(parent = (String)idMaping.get(propNameId)))) {
                                data.put(propName, (Object)Long.valueOf(parent));
                            }
                        });
                    }
                    BillDataDto billDataDto = new BillDataDto();
                    billDataDto.setBillnum(socialDistributeParam.getBillno());
                    billDataDto.setData(data);
                    RuleExecuteResult result = (RuleExecuteResult)RobotExecutors.runAs((String)desYTenantId, () -> this.upcBillService.executeUpdate("save", billDataDto));
                    String newId = data.getId().toString();
                    if (result.getData() instanceof Map && result.getData() != null && !((Map)result.getData()).isEmpty()) {
                        newId = String.valueOf(((Map)result.getData()).get("id"));
                    } else if (result.getData() instanceof List && !CollectionUtils.isEmpty((Collection)((List)result.getData()))) {
                        newId = String.valueOf(((Map)((List)result.getData()).get(0)).get("id"));
                    }
                    infos.add(DocDataMappingInfo.buildDocDataMappingInfo((String)socialSrcId, (String)newId));
                }
                catch (Exception e) {
                    failCount.getAndIncrement();
                    errorMessages.add(new ErrorMessage(socialSrcId, e.getMessage()));
                    log.error("data = [{}]", (Object)JSON.toJSONString((Object)data), (Object)e);
                }
            });
        }
        HashMap<String, Serializable> result = new HashMap<String, Serializable>();
        result.put("count", count);
        result.put("failCount", failCount);
        result.put("infos", infos);
        result.put("errorMessages", errorMessages);
        return result;
    }
}


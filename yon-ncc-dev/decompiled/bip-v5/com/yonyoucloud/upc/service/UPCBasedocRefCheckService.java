/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.yonyou.iuap.ucf.common.i18n.InternationalUtils
 *  com.yonyou.ucf.basedoc.service.biz.UcfBasedocRefCheckServiceImpl
 *  com.yonyou.ucf.mdd.ext.dao.meta.MetaDaoHelper
 *  org.imeta.orm.schema.ConditionExpression
 *  org.imeta.orm.schema.QueryCondition
 *  org.imeta.orm.schema.QueryConditionGroup
 *  org.imeta.orm.schema.QuerySchema
 *  org.slf4j.Logger
 *  org.slf4j.LoggerFactory
 *  org.springframework.stereotype.Service
 */
package com.yonyoucloud.upc.service;

import com.yonyou.iuap.ucf.common.i18n.InternationalUtils;
import com.yonyou.ucf.basedoc.service.biz.UcfBasedocRefCheckServiceImpl;
import com.yonyou.ucf.mdd.ext.dao.meta.MetaDaoHelper;
import com.yonyoucloud.iuap.upc.api.service.IUPCBasedocRefCheckService;
import java.util.List;
import java.util.Map;
import org.imeta.orm.schema.ConditionExpression;
import org.imeta.orm.schema.QueryCondition;
import org.imeta.orm.schema.QueryConditionGroup;
import org.imeta.orm.schema.QuerySchema;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

@Service
public class UPCBasedocRefCheckService
extends UcfBasedocRefCheckServiceImpl
implements IUPCBasedocRefCheckService {
    private static final Logger log = LoggerFactory.getLogger(UPCBasedocRefCheckService.class);
    private static final String CUST_DOC_USERDEF = "bd.customerdoc_";

    @Override
    public <T> Map<String, Boolean> myRefCheck(String fullName, List<String> ids, T tenantId, List<String> exludeDomainList) {
        Map defaultRefCheckMap = super.refCheck(fullName, ids, tenantId, exludeDomainList);
        if ("bd.basedocdef.CustomerDocVO".equals(fullName) || fullName.startsWith(CUST_DOC_USERDEF)) {
            String id = "characterValueId";
            String entityName = "pc.product.ProductFreeCharacterItem";
            QuerySchema schema = QuerySchema.create().addSelect("id").addCondition((ConditionExpression)QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)id).in(ids)}));
            try {
                Map applyRange = MetaDaoHelper.queryOne((String)entityName, (QuerySchema)schema);
                if (applyRange.size() > 0) {
                    ids.stream().forEach(checkId -> defaultRefCheckMap.put(checkId, Boolean.TRUE));
                }
            }
            catch (Exception e) {
                log.error(InternationalUtils.getMessageWithDefault((String)"UID:P_COREDOC-BE_179F628604080202", (String)"\u68c0\u9a8c\u662f\u5426SKU\u5f15\u7528\u65f6\u53d1\u751f\u9519\u8bef\uff1a") + e.getMessage());
            }
        }
        return defaultRefCheckMap;
    }
}


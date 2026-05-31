/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.yonyou.diwork.service.pub.IPubTenantExtDimension
 *  com.yonyou.iuap.apdoc.coredoc.enums.CoreExtrateBusinessErrorEnum
 *  com.yonyou.iuap.apdoc.coredoc.exceptions.CoreDocBusinessException
 *  com.yonyou.iuap.ucf.common.i18n.InternationalUtils
 *  com.yonyou.ucf.mdd.ext.base.user.UserType
 *  com.yonyou.ucf.mdd.ext.dao.meta.MetaDaoHelper
 *  com.yonyou.workbench.dto.PubTenantExtDimensionDocDTO
 *  com.yonyou.workbench.dto.TenantExtDimensionDTO
 *  com.yonyou.workbench.model.LoginTenant$Identity
 *  org.apache.commons.lang3.StringUtils
 *  org.imeta.orm.base.BizObject
 *  org.imeta.orm.schema.ConditionExpression
 *  org.imeta.orm.schema.QueryCondition
 *  org.imeta.orm.schema.QueryConditionGroup
 *  org.imeta.orm.schema.QuerySchema
 *  org.slf4j.Logger
 *  org.slf4j.LoggerFactory
 *  org.springframework.stereotype.Service
 *  org.springframework.util.CollectionUtils
 */
package com.yonyoucloud.upc.service.api;

import com.yonyou.diwork.service.pub.IPubTenantExtDimension;
import com.yonyou.iuap.apdoc.coredoc.enums.CoreExtrateBusinessErrorEnum;
import com.yonyou.iuap.apdoc.coredoc.exceptions.CoreDocBusinessException;
import com.yonyou.iuap.ucf.common.i18n.InternationalUtils;
import com.yonyou.ucf.mdd.ext.base.user.UserType;
import com.yonyou.ucf.mdd.ext.dao.meta.MetaDaoHelper;
import com.yonyou.workbench.dto.PubTenantExtDimensionDocDTO;
import com.yonyou.workbench.dto.TenantExtDimensionDTO;
import com.yonyou.workbench.model.LoginTenant;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import org.apache.commons.lang3.StringUtils;
import org.imeta.orm.base.BizObject;
import org.imeta.orm.schema.ConditionExpression;
import org.imeta.orm.schema.QueryCondition;
import org.imeta.orm.schema.QueryConditionGroup;
import org.imeta.orm.schema.QuerySchema;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;

@Service(value="pubTenantExtDimensionImpl")
public class PubTenantExtDimensionImpl
implements IPubTenantExtDimension {
    private static final Logger log = LoggerFactory.getLogger(PubTenantExtDimensionImpl.class);
    private static final String DIMENSION = "businessDoc";

    public List<TenantExtDimensionDTO> query(String userId, List<String> tenantIds, Map<String, Object> ext) {
        ArrayList<TenantExtDimensionDTO> returnTED = new ArrayList<TenantExtDimensionDTO>();
        try {
            List pubTenantExtDimensionDocDTOList = (List)ext.get("extDocs");
            if (!CollectionUtils.isEmpty((Collection)pubTenantExtDimensionDocDTOList)) {
                for (PubTenantExtDimensionDocDTO tenantExtDimensionDocDTO : pubTenantExtDimensionDocDTOList) {
                    List identitys = tenantExtDimensionDocDTO.getIdentitys();
                    if (CollectionUtils.isEmpty((Collection)identitys)) continue;
                    ArrayList shopIdentitys = new ArrayList(identitys.size());
                    identitys.stream().forEach(tenantIdentity -> {
                        if (UserType.ShopAdminUser.getValue() == tenantIdentity.getUserType().intValue() || UserType.ShopUser.getValue() == tenantIdentity.getUserType().intValue() || UserType.TenantShopuser.getValue() == tenantIdentity.getUserType().intValue() || UserType.JoinUser.getValue() == tenantIdentity.getUserType().intValue()) {
                            shopIdentitys.add(tenantIdentity);
                        }
                    });
                    if (CollectionUtils.isEmpty(shopIdentitys)) continue;
                    ArrayList merchantIds = new ArrayList(shopIdentitys.size());
                    shopIdentitys.stream().forEach(shopIdentity -> shopIdentity.getDocIds().stream().forEach(docid -> merchantIds.add(Long.valueOf(docid))));
                    if (CollectionUtils.isEmpty(merchantIds)) {
                        throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_801369);
                    }
                    String yhtTenantId = tenantExtDimensionDocDTO.getTenantId();
                    if (StringUtils.isBlank((CharSequence)yhtTenantId)) {
                        throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_801050);
                    }
                    QuerySchema querySchemaMerchant = QuerySchema.create();
                    querySchemaMerchant.setPartitionable(false);
                    querySchemaMerchant.addSelect("id,name,merchantRole.businessRole as businessRole").addCondition((ConditionExpression)QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"ytenant").eq((Object)yhtTenantId), QueryCondition.name((String)"id").in(merchantIds), QueryCondition.name((String)"merchantAppliedDetail.merchantApplyRangeId.isCreator").eq((Object)1)}));
                    List bizObjectList = MetaDaoHelper.queryObject((String)"aa.merchant.Merchant", (QuerySchema)querySchemaMerchant, null);
                    if (CollectionUtils.isEmpty((Collection)bizObjectList)) continue;
                    for (BizObject bizObject : bizObjectList) {
                        for (LoginTenant.Identity identity : shopIdentitys) {
                            for (String docId : identity.getDocIds()) {
                                if (!docId.equals(bizObject.get("id").toString())) continue;
                                TenantExtDimensionDTO tenantExtDimensionDTO = new TenantExtDimensionDTO();
                                tenantExtDimensionDTO.setTenantId(tenantExtDimensionDocDTO.getTenantId());
                                tenantExtDimensionDTO.setDimension(DIMENSION);
                                tenantExtDimensionDTO.setDocId(bizObject.get("id").toString());
                                tenantExtDimensionDTO.setDocName((String)bizObject.get("name"));
                                tenantExtDimensionDTO.setDocType((String)bizObject.get("businessRole"));
                                tenantExtDimensionDTO.setUserType(identity.getUserType().toString());
                                returnTED.add(tenantExtDimensionDTO);
                            }
                        }
                    }
                }
            }
        }
        catch (Exception e) {
            log.error(InternationalUtils.getMessageWithDefault((String)"UID:P_COREDOC-BE_179F6286040805AC", (String)"\u67e5\u8be2\u5ba2\u6237\u6570\u636e\u5f02\u5e38") + e.getMessage(), (Throwable)e);
            throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_801370);
        }
        return returnTED;
    }
}


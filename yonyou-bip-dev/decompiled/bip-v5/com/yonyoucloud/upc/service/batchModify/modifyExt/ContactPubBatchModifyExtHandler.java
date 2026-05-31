/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.yonyou.iuap.apdoc.coredoc.batchmodify.extinterface.IPubBatchModifyEntityExtService
 *  com.yonyou.iuap.apdoc.coredoc.enums.CoreExtrateBusinessErrorEnum
 *  com.yonyou.iuap.apdoc.coredoc.exceptions.CoreDocBusinessException
 *  com.yonyou.iuap.data.service.itf.OrgExternalQryService
 *  com.yonyou.ucf.mdd.common.model.rule.RuleExecuteResult
 *  com.yonyou.ucf.mdd.ext.base.user.UserType
 *  com.yonyou.ucf.mdd.ext.bill.dto.BillDataDto
 *  com.yonyou.ucf.mdd.ext.core.AppContext
 *  com.yonyou.ucf.mdd.ext.dao.meta.MetaDaoHelper
 *  com.yonyoucloud.upc.aa.merchant.Contacter
 *  com.yonyoucloud.upc.aa.merchant.Merchant
 *  com.yonyoucloud.upc.aa.merchant.StopStatusChar
 *  com.yonyoucloud.upc.coredoc.batchentity.dto.PubBatchModifyEntitySaveDTO
 *  org.apache.commons.lang3.ObjectUtils
 *  org.imeta.orm.base.BizObject
 *  org.imeta.orm.base.EntityStatus
 *  org.imeta.orm.schema.ConditionExpression
 *  org.imeta.orm.schema.QueryCondition
 *  org.imeta.orm.schema.QueryConditionGroup
 *  org.imeta.orm.schema.QuerySchema
 *  org.slf4j.Logger
 *  org.slf4j.LoggerFactory
 *  org.springframework.beans.factory.annotation.Autowired
 *  org.springframework.beans.factory.annotation.Qualifier
 *  org.springframework.stereotype.Service
 *  org.springframework.util.CollectionUtils
 */
package com.yonyoucloud.upc.service.batchModify.modifyExt;

import com.yonyou.iuap.apdoc.coredoc.batchmodify.extinterface.IPubBatchModifyEntityExtService;
import com.yonyou.iuap.apdoc.coredoc.enums.CoreExtrateBusinessErrorEnum;
import com.yonyou.iuap.apdoc.coredoc.exceptions.CoreDocBusinessException;
import com.yonyou.iuap.data.service.itf.OrgExternalQryService;
import com.yonyou.ucf.mdd.common.model.rule.RuleExecuteResult;
import com.yonyou.ucf.mdd.ext.base.user.UserType;
import com.yonyou.ucf.mdd.ext.bill.dto.BillDataDto;
import com.yonyou.ucf.mdd.ext.core.AppContext;
import com.yonyou.ucf.mdd.ext.dao.meta.MetaDaoHelper;
import com.yonyoucloud.iuap.upc.api.service.IUPCBillService;
import com.yonyoucloud.upc.aa.merchant.Contacter;
import com.yonyoucloud.upc.aa.merchant.Merchant;
import com.yonyoucloud.upc.aa.merchant.StopStatusChar;
import com.yonyoucloud.upc.coredoc.batchentity.dto.PubBatchModifyEntitySaveDTO;
import com.yonyoucloud.upc.service.batchModify.modifyExt.PrincipalPubBatchModifyExtHandler;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import org.apache.commons.lang3.ObjectUtils;
import org.imeta.orm.base.BizObject;
import org.imeta.orm.base.EntityStatus;
import org.imeta.orm.schema.ConditionExpression;
import org.imeta.orm.schema.QueryCondition;
import org.imeta.orm.schema.QueryConditionGroup;
import org.imeta.orm.schema.QuerySchema;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;

@Service
public class ContactPubBatchModifyExtHandler
implements IPubBatchModifyEntityExtService {
    private static final Logger log = LoggerFactory.getLogger(ContactPubBatchModifyExtHandler.class);
    @Autowired
    @Qualifier(value="pc.BillService")
    private IUPCBillService billService;
    @Autowired
    private OrgExternalQryService orgExternalQryService;
    @Autowired
    PrincipalPubBatchModifyExtHandler principalPubBatchModifyExtHandler;

    public void batchModifyIsCheckField(BizObject bizObject, Map<String, Object> pubBatchModifyEntityFieldSaveIsCheckMap, PubBatchModifyEntitySaveDTO pubBatchModifyEntitySaveDTO) throws Exception {
        Merchant merchant = new Merchant();
        Contacter contacter = new Contacter();
        contacter.init((Map)bizObject);
        contacter.setEntityStatus(EntityStatus.Update);
        QuerySchema querySchema = QuerySchema.create();
        querySchema.addSelect("isDefault,merchantId");
        QueryConditionGroup queryConditionGroup = QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"id").eq(contacter.getId())});
        querySchema.addCondition((ConditionExpression)queryConditionGroup);
        List contactInDbList = MetaDaoHelper.queryObject((String)"aa.merchant.Contacter", (QuerySchema)querySchema, null);
        if (!CollectionUtils.isEmpty((Collection)contactInDbList)) {
            querySchema = QuerySchema.create();
            querySchema.addSelect("code,name,createOrg,creditCode");
            querySchema.addCondition((ConditionExpression)QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"id").eq((Object)((Contacter)contactInDbList.get(0)).getMerchantId())}));
            List merchantInDbList = MetaDaoHelper.queryObject((String)"aa.merchant.Merchant", (boolean)true, (QuerySchema)querySchema, null);
            if (!CollectionUtils.isEmpty((Collection)merchantInDbList)) {
                this.initContact(merchant, contacter, pubBatchModifyEntityFieldSaveIsCheckMap);
                contacter.setIsDefault(((Contacter)contactInDbList.get(0)).getIsDefault());
                merchant.setId((Object)((Contacter)contactInDbList.get(0)).getMerchantId());
                merchant.setCode(((Merchant)merchantInDbList.get(0)).getCode());
                merchant.set("name", ((Merchant)merchantInDbList.get(0)).get("name"));
                merchant.setCreateOrg(((Merchant)merchantInDbList.get(0)).getCreateOrg());
                merchant.setCreditCode(((Merchant)merchantInDbList.get(0)).getCreditCode());
                merchant.set("belongOrg", (Object)((Merchant)merchantInDbList.get(0)).getCreateOrg());
                merchant.set("_fromApi", (Object)true);
                merchant.set("importSpecialKey_merchant", (Object)"importSpecialKey_merchant");
                merchant.set("_fromBatchModify", (Object)true);
                merchant.setEntityStatus(EntityStatus.Update);
                ArrayList<Contacter> contacterList = new ArrayList<Contacter>();
                contacterList.add(contacter);
                merchant.setMerchantContacterInfos(contacterList);
                BillDataDto saveDto = new BillDataDto();
                saveDto.setData((Object)merchant);
                saveDto.setBillnum("aa_merchant");
                RuleExecuteResult result = this.billService.executeUpdate("save", saveDto);
                if (result.getMsgCode() != 1) {
                    throw new CoreDocBusinessException(result.getMessage());
                }
            }
        }
    }

    private void initContact(Merchant merchant, Contacter contacter, Map<String, Object> pubBatchModifyEntityFieldSaveIsCheckMap) {
        if (pubBatchModifyEntityFieldSaveIsCheckMap.containsKey("fullName")) {
            if (!ObjectUtils.isEmpty((Object)pubBatchModifyEntityFieldSaveIsCheckMap.get("fullName"))) {
                contacter.set("fullName", pubBatchModifyEntityFieldSaveIsCheckMap.get("fullName"));
            } else {
                throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_801437);
            }
        }
        if (pubBatchModifyEntityFieldSaveIsCheckMap.containsKey("mobile")) {
            if (!ObjectUtils.isEmpty((Object)pubBatchModifyEntityFieldSaveIsCheckMap.get("mobile"))) {
                contacter.setMobile(String.valueOf(pubBatchModifyEntityFieldSaveIsCheckMap.get("mobile")));
            } else {
                contacter.setMobile(null);
            }
        }
        if (pubBatchModifyEntityFieldSaveIsCheckMap.containsKey("telePhone")) {
            if (!ObjectUtils.isEmpty((Object)pubBatchModifyEntityFieldSaveIsCheckMap.get("telePhone"))) {
                contacter.setTelePhone(String.valueOf(pubBatchModifyEntityFieldSaveIsCheckMap.get("telePhone")));
            } else {
                contacter.setTelePhone(null);
            }
        }
        if (pubBatchModifyEntityFieldSaveIsCheckMap.containsKey("email")) {
            if (!ObjectUtils.isEmpty((Object)pubBatchModifyEntityFieldSaveIsCheckMap.get("email"))) {
                contacter.setEmail(String.valueOf(pubBatchModifyEntityFieldSaveIsCheckMap.get("email")));
            } else {
                contacter.setEmail(null);
            }
        }
        if (pubBatchModifyEntityFieldSaveIsCheckMap.containsKey("stopStatus") && !ObjectUtils.isEmpty((Object)pubBatchModifyEntityFieldSaveIsCheckMap.get("stopStatus"))) {
            if (StopStatusChar.stop.getValue().equals(String.valueOf(pubBatchModifyEntityFieldSaveIsCheckMap.get("stopStatus")))) {
                contacter.setStopStatus(StopStatusChar.stop);
            } else {
                contacter.setStopStatus(StopStatusChar.unStop);
            }
        }
    }

    public void supplementaryReminder(Map<String, Object> pubBatchModifyEntityFieldSaveIsCheckMap) throws Exception {
        if (pubBatchModifyEntityFieldSaveIsCheckMap.containsKey("stopStatus") && pubBatchModifyEntityFieldSaveIsCheckMap.get("stopStatus") == null) {
            throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_801435);
        }
    }

    public void checkBatchModifyEntity(BizObject bizObject) throws Exception {
        if (AppContext.getCurrentUser().getUserType() == UserType.TenantAdmin || AppContext.getCurrentUser().getUserType() == UserType.TenantEmployee) {
            QuerySchema querySchema = QuerySchema.create();
            querySchema.addSelect("merchantId.createOrg as createOrg");
            QueryConditionGroup queryConditionGroup = QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"id").eq(bizObject.getId())});
            querySchema.addCondition((ConditionExpression)queryConditionGroup);
            List contactInDbList = MetaDaoHelper.queryObject((String)"aa.merchant.Contacter", (QuerySchema)querySchema, null);
            if (!CollectionUtils.isEmpty((Collection)contactInDbList) && this.orgExternalQryService.judgeExternalOrg((String)AppContext.getYTenantId(), (String)((Contacter)contactInDbList.get(0)).get("createOrg")).booleanValue()) {
                throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_801438);
            }
        }
    }

    public void extendQuerySchema(QuerySchema querySchema, PubBatchModifyEntitySaveDTO pubBatchModifyEntitySaveDTO) throws Exception {
        querySchema.addSelect("merchantId");
    }

    public void checkBatchModifyEntityFieldSaveMap(Map<String, Object> pubBatchModifyEntityFieldSaveMap) {
        if (pubBatchModifyEntityFieldSaveMap.containsKey("stopStatus") && pubBatchModifyEntityFieldSaveMap.get("stopStatus") == null) {
            throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_801435);
        }
    }

    public void update(String fullName, BizObject newBizObjectUpdate, PubBatchModifyEntitySaveDTO pubBatchModifyEntitySaveDTO) throws Exception {
        this.principalPubBatchModifyExtHandler.addLogAndModifyAudit(fullName, newBizObjectUpdate, pubBatchModifyEntitySaveDTO);
    }
}


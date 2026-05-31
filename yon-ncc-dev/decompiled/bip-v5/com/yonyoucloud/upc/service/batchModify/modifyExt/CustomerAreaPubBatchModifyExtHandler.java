/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.yonyou.iuap.apdoc.coredoc.batchmodify.extinterface.IPubBatchModifyEntityExtService
 *  com.yonyou.iuap.apdoc.coredoc.enums.CoreExtrateBusinessErrorEnum
 *  com.yonyou.iuap.apdoc.coredoc.exceptions.CoreDocBusinessException
 *  com.yonyou.ucf.mdd.common.model.rule.RuleExecuteResult
 *  com.yonyou.ucf.mdd.ext.base.user.UserType
 *  com.yonyou.ucf.mdd.ext.bill.dto.BillDataDto
 *  com.yonyou.ucf.mdd.ext.core.AppContext
 *  com.yonyou.ucf.mdd.ext.dao.meta.MetaDaoHelper
 *  com.yonyoucloud.upc.aa.merchant.CustomerArea
 *  com.yonyoucloud.upc.aa.merchant.Merchant
 *  com.yonyoucloud.upc.aa.salearea.SaleArea
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
import com.yonyou.ucf.mdd.common.model.rule.RuleExecuteResult;
import com.yonyou.ucf.mdd.ext.base.user.UserType;
import com.yonyou.ucf.mdd.ext.bill.dto.BillDataDto;
import com.yonyou.ucf.mdd.ext.core.AppContext;
import com.yonyou.ucf.mdd.ext.dao.meta.MetaDaoHelper;
import com.yonyoucloud.iuap.upc.api.service.IUPCBillService;
import com.yonyoucloud.upc.aa.merchant.CustomerArea;
import com.yonyoucloud.upc.aa.merchant.Merchant;
import com.yonyoucloud.upc.aa.salearea.SaleArea;
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
public class CustomerAreaPubBatchModifyExtHandler
implements IPubBatchModifyEntityExtService {
    private static final Logger log = LoggerFactory.getLogger(CustomerAreaPubBatchModifyExtHandler.class);
    @Autowired
    @Qualifier(value="pc.BillService")
    private IUPCBillService billService;
    @Autowired
    PrincipalPubBatchModifyExtHandler principalPubBatchModifyExtHandler;

    public void batchModifyIsCheckField(BizObject bizObject, Map<String, Object> pubBatchModifyEntityFieldSaveIsCheckMap, PubBatchModifyEntitySaveDTO pubBatchModifyEntitySaveDTO) throws Exception {
        Merchant merchant = new Merchant();
        CustomerArea customerArea = new CustomerArea();
        customerArea.init((Map)bizObject);
        customerArea.set("importSpecialSaleAreaId", (Object)customerArea.getId().toString());
        customerArea.setEntityStatus(EntityStatus.Update);
        QuerySchema querySchema = QuerySchema.create();
        querySchema.addSelect("merchantApplyRangeId as merchantApplyRangeId,merchantApplyRangeId.orgId as belongOrg,merchantId as merchantId,saleAreaId,isDefault as isDefault");
        QueryConditionGroup queryConditionGroup = QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"id").eq(customerArea.getId())});
        querySchema.addCondition((ConditionExpression)queryConditionGroup);
        List customerAreaInDbList = MetaDaoHelper.queryObject((String)"aa.merchant.CustomerArea", (QuerySchema)querySchema, null);
        if (!CollectionUtils.isEmpty((Collection)customerAreaInDbList)) {
            querySchema = QuerySchema.create();
            querySchema.addSelect("code,name,createOrg,creditCode");
            querySchema.addCondition((ConditionExpression)QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"id").eq((Object)((CustomerArea)customerAreaInDbList.get(0)).getMerchantId())}));
            List merchantInDbList = MetaDaoHelper.queryObject((String)"aa.merchant.Merchant", (boolean)true, (QuerySchema)querySchema, null);
            if (!CollectionUtils.isEmpty((Collection)merchantInDbList)) {
                if (pubBatchModifyEntityFieldSaveIsCheckMap.containsKey("saleAreaId")) {
                    if (!ObjectUtils.isEmpty((Object)pubBatchModifyEntityFieldSaveIsCheckMap.get("saleAreaId"))) {
                        customerArea.setSaleAreaId(Long.valueOf(pubBatchModifyEntityFieldSaveIsCheckMap.get("saleAreaId").toString()));
                        customerArea.put("saleAreaId_code", pubBatchModifyEntityFieldSaveIsCheckMap.get("saleAreaId_code"));
                        customerArea.put("areaCode_isEnd", pubBatchModifyEntityFieldSaveIsCheckMap.get("areaCode_isEnd"));
                    } else {
                        customerArea.setSaleAreaId(null);
                    }
                }
                customerArea.setIsDefault(((CustomerArea)customerAreaInDbList.get(0)).getIsDefault());
                merchant.setId((Object)((CustomerArea)customerAreaInDbList.get(0)).getMerchantId());
                merchant.setCode(((Merchant)merchantInDbList.get(0)).getCode());
                merchant.set("name", ((Merchant)merchantInDbList.get(0)).get("name"));
                merchant.setCreateOrg(((Merchant)merchantInDbList.get(0)).getCreateOrg());
                merchant.setCreditCode(((Merchant)merchantInDbList.get(0)).getCreditCode());
                merchant.set("belongOrg", ((CustomerArea)customerAreaInDbList.get(0)).get("belongOrg"));
                if (((CustomerArea)customerAreaInDbList.get(0)).get("belongOrg").equals(((Merchant)merchantInDbList.get(0)).getCreateOrg())) {
                    merchant.set("isCreator", (Object)true);
                } else {
                    merchant.set("isCreator", (Object)false);
                }
                merchant.set("merchantApplyRangeId", (Object)((CustomerArea)customerAreaInDbList.get(0)).getmerchantApplyRangeId());
                merchant.set("_fromApi", (Object)true);
                merchant.set("importSpecialKey_merchant", (Object)"importSpecialKey_merchant");
                merchant.set("_fromBatchModify", (Object)true);
                merchant.setEntityStatus(EntityStatus.Update);
                ArrayList<CustomerArea> customerAreaList = new ArrayList<CustomerArea>();
                customerAreaList.add(customerArea);
                merchant.setCustomerAreas(customerAreaList);
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

    public void supplementaryReminder(Map<String, Object> pubBatchModifyEntityFieldSaveIsCheckMap) throws Exception {
        if (pubBatchModifyEntityFieldSaveIsCheckMap.containsKey("saleAreaId") && !ObjectUtils.isEmpty((Object)pubBatchModifyEntityFieldSaveIsCheckMap.get("saleAreaId"))) {
            QuerySchema schema = QuerySchema.create().addSelect("code, name,isEnd").appendQueryCondition(new ConditionExpression[]{QueryCondition.name((String)"id").eq((Object)Long.valueOf(pubBatchModifyEntityFieldSaveIsCheckMap.get("saleAreaId").toString()))});
            List saleAreaList = MetaDaoHelper.queryObject((String)"aa.salearea.SaleArea", (QuerySchema)schema, null);
            if (!CollectionUtils.isEmpty((Collection)saleAreaList)) {
                pubBatchModifyEntityFieldSaveIsCheckMap.put("saleAreaId_code", ((SaleArea)saleAreaList.get(0)).getCode());
                pubBatchModifyEntityFieldSaveIsCheckMap.put("areaCode_isEnd", ((SaleArea)saleAreaList.get(0)).getIsEnd());
            }
        } else if (pubBatchModifyEntityFieldSaveIsCheckMap.containsKey("saleAreaId") && ObjectUtils.isEmpty((Object)pubBatchModifyEntityFieldSaveIsCheckMap.get("saleAreaId"))) {
            throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_801464);
        }
    }

    public void extendQuerySchema(QuerySchema querySchema, PubBatchModifyEntitySaveDTO pubBatchModifyEntitySaveDTO) throws Exception {
        if (AppContext.getCurrentUser().getUserType() == UserType.ShopAdminUser || AppContext.getCurrentUser().getUserType() == UserType.ShopUser) {
            querySchema.appendQueryCondition(new ConditionExpression[]{QueryCondition.name((String)"merchantApplyRangeId.shopId").eq((Object)AppContext.getCurrentUser().getShop())});
        } else {
            querySchema.appendQueryCondition(new ConditionExpression[]{QueryCondition.name((String)"merchantApplyRangeId.shopId").eq((Object)-1)});
        }
        List extIdList = pubBatchModifyEntitySaveDTO.getExtIdList();
        if (CollectionUtils.isEmpty((Collection)extIdList)) {
            throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_801454);
        }
        querySchema.appendQueryCondition(new ConditionExpression[]{QueryCondition.name((String)"merchantApplyRangeId").in((Collection)extIdList)});
        querySchema.addSelect("merchantId");
        querySchema.addSelect("merchantApplyRangeId");
    }

    public void update(String fullName, BizObject newBizObjectUpdate, PubBatchModifyEntitySaveDTO pubBatchModifyEntitySaveDTO) throws Exception {
        this.principalPubBatchModifyExtHandler.addLogAndModifyAudit(fullName, newBizObjectUpdate, pubBatchModifyEntitySaveDTO);
    }
}


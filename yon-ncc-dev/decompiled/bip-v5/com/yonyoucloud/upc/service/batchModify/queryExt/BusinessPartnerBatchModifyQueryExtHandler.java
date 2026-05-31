/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.yonyou.iuap.apdoc.coredoc.batchmodify.extinterface.IPubBatchModifyEntityExtService
 *  com.yonyou.iuap.apdoc.coredoc.enums.CoreExtrateBusinessErrorEnum
 *  com.yonyou.iuap.apdoc.coredoc.exceptions.CoreDocBusinessException
 *  com.yonyou.ucf.mdd.common.model.rule.RuleExecuteResult
 *  com.yonyou.ucf.mdd.ext.bill.dto.BillDataDto
 *  com.yonyoucloud.upc.base.businesspartner.BusinessPartner
 *  com.yonyoucloud.upc.coredoc.batchentity.dto.PubBatchModifyEntitySaveDTO
 *  com.yonyoucloud.upc.utils.BusinessPartnerUtils
 *  org.imeta.orm.base.BizObject
 *  org.imeta.orm.base.EntityStatus
 *  org.imeta.spring.support.id.IdManager
 *  org.slf4j.Logger
 *  org.slf4j.LoggerFactory
 *  org.springframework.beans.factory.annotation.Autowired
 *  org.springframework.beans.factory.annotation.Qualifier
 *  org.springframework.stereotype.Service
 */
package com.yonyoucloud.upc.service.batchModify.queryExt;

import com.yonyou.iuap.apdoc.coredoc.batchmodify.extinterface.IPubBatchModifyEntityExtService;
import com.yonyou.iuap.apdoc.coredoc.enums.CoreExtrateBusinessErrorEnum;
import com.yonyou.iuap.apdoc.coredoc.exceptions.CoreDocBusinessException;
import com.yonyou.ucf.mdd.common.model.rule.RuleExecuteResult;
import com.yonyou.ucf.mdd.ext.bill.dto.BillDataDto;
import com.yonyoucloud.iuap.upc.api.service.IUPCBillService;
import com.yonyoucloud.upc.base.businesspartner.BusinessPartner;
import com.yonyoucloud.upc.coredoc.batchentity.dto.PubBatchModifyEntitySaveDTO;
import com.yonyoucloud.upc.service.batchModify.PubBatchModifyEntityServiceImpl;
import com.yonyoucloud.upc.utils.BusinessPartnerUtils;
import java.util.Map;
import org.imeta.orm.base.BizObject;
import org.imeta.orm.base.EntityStatus;
import org.imeta.spring.support.id.IdManager;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
public class BusinessPartnerBatchModifyQueryExtHandler
implements IPubBatchModifyEntityExtService {
    private static final Logger log = LoggerFactory.getLogger(BusinessPartnerBatchModifyQueryExtHandler.class);
    @Autowired
    @Qualifier(value="pc.BillService")
    private IUPCBillService billService;
    @Autowired
    private PubBatchModifyEntityServiceImpl pubBatchModifyEntityService;

    public void batchModifyIsCheckField(BizObject bizObject, Map<String, Object> pubBatchModifyEntityFieldSaveIsCheckMap, PubBatchModifyEntitySaveDTO pubBatchModifyEntitySaveDTO) throws Exception {
        if (bizObject == null || bizObject.get("id") == null) {
            throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_801137);
        }
        BusinessPartner businessPartner = BusinessPartnerUtils.queryBusinessPartnerById((String)bizObject.get("id").toString());
        if (businessPartner == null) {
            throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_801466);
        }
        for (Map.Entry<String, Object> entry : pubBatchModifyEntityFieldSaveIsCheckMap.entrySet()) {
            if (entry.getKey().startsWith("businessPartnerCharacterDef")) {
                this.dealCharacter(businessPartner, entry);
            }
            businessPartner.put(entry.getKey(), entry.getValue());
        }
        BizObject businessPartnerObj = this.pubBatchModifyEntityService.convertBizObject((BizObject)businessPartner, "base_businesspartner");
        businessPartnerObj.setEntityStatus(EntityStatus.Update);
        BusinessPartner businessPartnerSave = new BusinessPartner();
        businessPartnerSave.init((Map)businessPartnerObj);
        BillDataDto saveDto = new BillDataDto();
        saveDto.setData((Object)businessPartnerSave);
        saveDto.setBillnum("base_businesspartner");
        RuleExecuteResult result = this.billService.executeUpdate("save", saveDto);
        if (result.getMsgCode() != 1) {
            throw new CoreDocBusinessException(result.getMessage());
        }
    }

    private void dealCharacter(BusinessPartner businessPartner, Map.Entry<String, Object> entry) {
        BizObject businessPartnerCharacterDef;
        if (businessPartner.get("businessPartnerCharacterDef") == null) {
            businessPartnerCharacterDef = new BizObject();
            businessPartnerCharacterDef.put("id", (Object)String.valueOf(IdManager.getInstance().nextId()));
            businessPartnerCharacterDef.put("_status", (Object)EntityStatus.Insert);
            businessPartnerCharacterDef.put("_entityName", (Object)"base.businesspartner.BusinessPartnerCharacterDef");
            businessPartner.put("businessPartnerCharacterDef", (Object)businessPartnerCharacterDef);
        }
        businessPartnerCharacterDef = (BizObject)businessPartner.get("businessPartnerCharacterDef");
        businessPartnerCharacterDef.put(entry.getKey().replace("businessPartnerCharacterDef.", ""), entry.getValue());
        if (EntityStatus.Insert != businessPartnerCharacterDef.getEntityStatus()) {
            businessPartnerCharacterDef.setEntityStatus(EntityStatus.Update);
        }
    }
}


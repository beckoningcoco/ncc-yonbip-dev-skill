/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.alibaba.fastjson.JSONArray
 *  com.yonyou.iuap.apdoc.coredoc.utils.UpcJacksonUtils
 *  com.yonyou.iuap.fileservice.sdk.module.CooperationFileService
 *  com.yonyou.ucf.mdd.common.model.rule.RuleExecuteResult
 *  com.yonyou.ucf.mdd.ext.bill.dto.BillDataDto
 *  com.yonyou.ucf.mdd.ext.dao.meta.MetaDaoHelper
 *  com.yonyou.ucf.mdd.ext.voucher.enums.Status
 *  com.yonyoucloud.upc.aa.customerapply.CustomerApply
 *  com.yonyoucloud.upc.aa.customerapply.CustomerEffectStatus
 *  com.yonyoucloud.upc.aa.merchant.Merchant
 *  org.imeta.orm.base.BizObject
 *  org.imeta.orm.base.EntityStatus
 *  org.slf4j.Logger
 *  org.slf4j.LoggerFactory
 *  org.springframework.beans.factory.annotation.Autowired
 *  org.springframework.beans.factory.annotation.Qualifier
 *  org.springframework.stereotype.Service
 *  org.springframework.transaction.annotation.Propagation
 *  org.springframework.transaction.annotation.Transactional
 *  org.springframework.util.CollectionUtils
 */
package com.yonyoucloud.upc.service;

import com.alibaba.fastjson.JSONArray;
import com.yonyou.iuap.apdoc.coredoc.utils.UpcJacksonUtils;
import com.yonyou.iuap.fileservice.sdk.module.CooperationFileService;
import com.yonyou.ucf.mdd.common.model.rule.RuleExecuteResult;
import com.yonyou.ucf.mdd.ext.bill.dto.BillDataDto;
import com.yonyou.ucf.mdd.ext.dao.meta.MetaDaoHelper;
import com.yonyou.ucf.mdd.ext.voucher.enums.Status;
import com.yonyoucloud.iuap.upc.api.service.IUPCBillService;
import com.yonyoucloud.upc.aa.customerapply.CustomerApply;
import com.yonyoucloud.upc.aa.customerapply.CustomerEffectStatus;
import com.yonyoucloud.upc.aa.merchant.Merchant;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import org.imeta.orm.base.BizObject;
import org.imeta.orm.base.EntityStatus;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.util.CollectionUtils;

@Service
public class CustomerApplyAuditService {
    private static final Logger log = LoggerFactory.getLogger(CustomerApplyAuditService.class);
    @Autowired
    @Qualifier(value="pc.BillService")
    private IUPCBillService billService;
    @Autowired
    CooperationFileService cooperationFileService;

    @Transactional(propagation=Propagation.REQUIRES_NEW, rollbackFor={Exception.class})
    public void saveMerchant(BillDataDto saveDto, CustomerApply applyupdate, CustomerApply customerApply, Map detail, String readlCode, boolean updateCode) throws Exception {
        RuleExecuteResult result = this.billService.executeUpdate("save", saveDto);
        if (result.getMsgCode() != 1) {
            applyupdate.setFailInfo(result.getMessage());
            applyupdate.setEffectStatus(CustomerEffectStatus.fail);
            applyupdate.setStatus(Status.confirmed);
            log.error("saveApplyCustomerData execute warn : {}", (Object)result);
        } else {
            JSONArray jsonArray;
            List deleteList;
            applyupdate.setEffectStatus(CustomerEffectStatus.success);
            applyupdate.setStatus(Status.confirmed);
            applyupdate.setFailInfo(null);
            Map merchantMap = (Map)result.getData();
            Object code = merchantMap.get("code");
            Object idObj = merchantMap.get("id");
            applyupdate.setApplyCustomer((Long)merchantMap.get("id"));
            Map customerDataMap = (Map)UpcJacksonUtils.OBJECT_MAPPER.readValue(customerApply.getCustomerData(), Map.class);
            customerDataMap.put("id", String.valueOf(idObj));
            applyupdate.setCustomerData(UpcJacksonUtils.OBJECT_MAPPER.writeValueAsString((Object)customerDataMap));
            if (null != code && updateCode && Objects.nonNull(readlCode) && Objects.nonNull(idObj)) {
                Merchant merchant = new Merchant();
                merchant.setId(idObj);
                merchant.setCode(readlCode);
                merchant.setEntityStatus(EntityStatus.Update);
                MetaDaoHelper.update((String)"aa.merchant.Merchant", (BizObject)merchant);
            }
            if (detail.get("_ecsuite_temp") != null && Objects.nonNull(idObj)) {
                this.cooperationFileService.deleteFileByBusiness("iuap-apdoc-material", idObj.toString());
                this.cooperationFileService.changeBusinessId("iuap-apdoc-material", detail.get("_ecsuite_temp").toString(), idObj.toString());
            }
            if (detail.get("_deleteList") != null && !CollectionUtils.isEmpty((Collection)(deleteList = (jsonArray = (JSONArray)detail.get("_deleteList")).toJavaList(String.class)))) {
                this.cooperationFileService.deleteBatchFiles("iuap-apdoc-material", idObj.toString(), deleteList);
            }
        }
    }
}


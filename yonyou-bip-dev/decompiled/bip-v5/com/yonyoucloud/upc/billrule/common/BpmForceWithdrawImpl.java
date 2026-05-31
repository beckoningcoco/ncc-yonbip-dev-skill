/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.yonyou.iuap.apdoc.coredoc.exceptions.CoreDocBusinessException
 *  com.yonyou.ucf.mdd.common.exceptions.MessageMultilanResid
 *  com.yonyou.ucf.mdd.ext.bpm.model.BpmRequestBody
 *  com.yonyou.ucf.mdd.ext.bpm.model.VerifyState
 *  com.yonyou.ucf.mdd.ext.bpm.service.IBpmForceWithdraw
 *  com.yonyou.ucf.mdd.ext.dao.meta.MetaDaoHelper
 *  com.yonyoucloud.upc.aa.customerapply.CustomerApply
 *  javax.servlet.http.HttpServletRequest
 *  javax.servlet.http.HttpServletResponse
 *  org.imeta.orm.base.BizObject
 *  org.imeta.orm.base.EntityStatus
 *  org.springframework.stereotype.Service
 */
package com.yonyoucloud.upc.billrule.common;

import com.yonyou.iuap.apdoc.coredoc.exceptions.CoreDocBusinessException;
import com.yonyou.ucf.mdd.common.exceptions.MessageMultilanResid;
import com.yonyou.ucf.mdd.ext.bpm.model.BpmRequestBody;
import com.yonyou.ucf.mdd.ext.bpm.model.VerifyState;
import com.yonyou.ucf.mdd.ext.bpm.service.IBpmForceWithdraw;
import com.yonyou.ucf.mdd.ext.dao.meta.MetaDaoHelper;
import com.yonyoucloud.upc.aa.customerapply.CustomerApply;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.imeta.orm.base.BizObject;
import org.imeta.orm.base.EntityStatus;
import org.springframework.stereotype.Service;

@Service
public class BpmForceWithdrawImpl
implements IBpmForceWithdraw {
    public void forcewithdraw(BpmRequestBody params, HttpServletRequest request, HttpServletResponse response) throws Exception {
        String businessKey = params.getBusinessKey();
        int pos = businessKey.lastIndexOf("_");
        if (pos <= 0) {
            throw new CoreDocBusinessException(MessageMultilanResid.BUSINESS_KEY_ERROR.getDefaultMsg());
        }
        Long id = Long.valueOf(businessKey.substring(pos + 1));
        CustomerApply customerApply = new CustomerApply();
        customerApply.setId((Object)id);
        customerApply.setEntityStatus(EntityStatus.Update);
        customerApply.setAuditor("");
        customerApply.setVerifystate(Short.valueOf(VerifyState.INIT_NEW_OPEN.getValue()));
        MetaDaoHelper.update((String)"aa.customerapply.CustomerApply", (BizObject)customerApply);
    }
}


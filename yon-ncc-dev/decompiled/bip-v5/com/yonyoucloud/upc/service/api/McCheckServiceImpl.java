/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.yonyou.iuap.service.McCheckService
 *  org.springframework.beans.factory.annotation.Autowired
 *  org.springframework.stereotype.Service
 */
package com.yonyoucloud.upc.service.api;

import com.yonyou.iuap.service.McCheckService;
import com.yonyoucloud.iuap.upc.api.service.IUPCControlRuleService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service(value="pc.mcCheckService")
public class McCheckServiceImpl
implements McCheckService {
    @Autowired
    private IUPCControlRuleService upcControlRuleService;

    public Boolean canCancelManage(String s, List<String> list) throws Exception {
        List<String> result = this.upcControlRuleService.getSelfCreateVoucherByCreateOrg(s, list);
        if (result.isEmpty()) {
            return true;
        }
        return false;
    }

    public Boolean canCancelManageForShare(String s, List<String> list) throws Exception {
        return this.canCancelManage(s, list);
    }
}


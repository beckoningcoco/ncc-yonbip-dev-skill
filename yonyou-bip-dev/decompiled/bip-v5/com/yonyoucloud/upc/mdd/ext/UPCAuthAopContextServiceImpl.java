/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.yonyou.permission.util.AuthSdkFacadeUtils
 *  com.yonyou.ucf.mdd.auth.AuthUtilService
 *  com.yonyou.ucf.mdd.ext.api.IAuthAopContextService
 *  com.yonyou.ucf.mdd.ext.bill.dto.BaseDto
 *  com.yonyou.ucf.mdd.ext.core.AppContext
 *  javax.servlet.http.HttpServletRequest
 *  org.apache.commons.lang3.StringUtils
 *  org.springframework.beans.factory.annotation.Autowired
 *  org.springframework.stereotype.Service
 */
package com.yonyoucloud.upc.mdd.ext;

import com.yonyou.permission.util.AuthSdkFacadeUtils;
import com.yonyou.ucf.mdd.auth.AuthUtilService;
import com.yonyou.ucf.mdd.ext.api.IAuthAopContextService;
import com.yonyou.ucf.mdd.ext.bill.dto.BaseDto;
import com.yonyou.ucf.mdd.ext.core.AppContext;
import java.util.HashMap;
import javax.servlet.http.HttpServletRequest;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UPCAuthAopContextServiceImpl
implements IAuthAopContextService {
    public static final String PARENT_BILLNUM_KEY = "parentBillNum";
    @Autowired
    private AuthUtilService authUtilService;
    private static final HashMap<String, String> PARENT_BILLNUM_MAP = new HashMap();

    public boolean checkHaveAuthByExtend(HttpServletRequest request, String billNum, BaseDto dto) {
        String parentBillNum = request.getParameter(PARENT_BILLNUM_KEY);
        if (StringUtils.isNotBlank((CharSequence)parentBillNum)) {
            String yhttenantId = AppContext.getCurrentUser().getYhtTenantId();
            String userId = AppContext.getCurrentUser().getYhtUserId();
            String dynamicAuthToken = this.authUtilService.getDynamicAuthTokenFromRequest(request);
            return AuthSdkFacadeUtils.checkFunAuthorityByAuthId((String)yhttenantId, (String)userId, (String)parentBillNum, (String)parentBillNum, (String)dynamicAuthToken);
        }
        return false;
    }

    static {
        PARENT_BILLNUM_MAP.put("pc_productapplylist", "pc_productapply");
        PARENT_BILLNUM_MAP.put("pc_productapply", "pc_productapply");
        PARENT_BILLNUM_MAP.put("pc_product", "pc_productapply");
        PARENT_BILLNUM_MAP.put("aa_customerapply", "aa_customerapply");
        PARENT_BILLNUM_MAP.put("aa_customerapplylist", "aa_customerapply");
        PARENT_BILLNUM_MAP.put("aa_merchant", "aa_customerapply");
    }
}


/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.yonyou.iuap.context.InvocationInfoProxy
 *  com.yonyoucloud.upc.coredoc.IExtDomainDeleteHandler
 *  com.yonyoucloud.upc.coredoc.pub.DomainDeleteDTO
 *  org.imeta.orm.base.BizObject
 *  org.springframework.stereotype.Component
 */
package com.yonyoucloud.upc.coredoc.pub;

import com.yonyou.iuap.context.InvocationInfoProxy;
import com.yonyoucloud.upc.coredoc.IExtDomainDeleteHandler;
import com.yonyoucloud.upc.coredoc.pub.CheckDomainDeleteService;
import com.yonyoucloud.upc.coredoc.pub.DomainDeleteDTO;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import org.imeta.orm.base.BizObject;
import org.springframework.stereotype.Component;

@Component
public class ProductExtDomainDeleteHandler
extends CheckDomainDeleteService
implements IExtDomainDeleteHandler {
    @Override
    public DomainDeleteDTO getDomainDeleteDTO(BizObject bill, String billNum, String fullName) {
        Boolean isCreator = (Boolean)bill.get("isCreator");
        DomainDeleteDTO domainDeleteDTO = new DomainDeleteDTO();
        ArrayList<String> ids = new ArrayList<String>();
        ids.add(bill.getId().toString());
        domainDeleteDTO.setIds(ids);
        domainDeleteDTO.setBillNum(billNum);
        domainDeleteDTO.setFullName(fullName);
        domainDeleteDTO.setCode(bill.getString("code"));
        domainDeleteDTO.setToken(InvocationInfoProxy.getYhtAccessToken());
        if (isCreator != null && !isCreator.booleanValue()) {
            domainDeleteDTO.setOrgId(bill.getString("productApplyRange_orgId"));
        }
        return domainDeleteDTO;
    }

    @Override
    public Map<String, Object> getPredicateParamMap(BizObject bill, String billNum, String fullName) {
        Boolean isCreator = (Boolean)bill.get("isCreator");
        HashMap<String, Object> paramMap = new HashMap<String, Object>();
        if (isCreator != null && !isCreator.booleanValue()) {
            paramMap.put("isCheckCreator", false);
        } else {
            paramMap.put("isCheckCreator", true);
        }
        return paramMap;
    }
}


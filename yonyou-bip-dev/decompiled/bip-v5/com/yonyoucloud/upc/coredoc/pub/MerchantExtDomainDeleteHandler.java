/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.yonyou.iuap.context.InvocationInfoProxy
 *  com.yonyoucloud.upc.coredoc.IExtDomainDeleteHandler
 *  com.yonyoucloud.upc.coredoc.pub.DomainDeleteDTO
 *  org.imeta.orm.base.BizObject
 *  org.slf4j.Logger
 *  org.slf4j.LoggerFactory
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
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Component
public class MerchantExtDomainDeleteHandler
extends CheckDomainDeleteService
implements IExtDomainDeleteHandler {
    Logger logger = LoggerFactory.getLogger(MerchantExtDomainDeleteHandler.class);

    @Override
    public DomainDeleteDTO getDomainDeleteDTO(BizObject bill, String billNum, String fullName) {
        Object carryParams = bill.get("carryParams");
        Boolean isCreator = carryParams != null ? (Boolean)((Map)bill.get("carryParams")).get("isCreator") : (Boolean)bill.get("isCreator");
        DomainDeleteDTO domainDeleteDTO = new DomainDeleteDTO();
        ArrayList<String> ids = new ArrayList<String>();
        ids.add(bill.getId().toString());
        domainDeleteDTO.setIds(ids);
        if ("aa_merchantlist_query".equals(billNum)) {
            domainDeleteDTO.setBillNum("aa_merchantlist");
        } else if ("aa_merchantdetail".equals(billNum)) {
            domainDeleteDTO.setBillNum("aa_merchant");
        } else {
            domainDeleteDTO.setBillNum(billNum);
        }
        domainDeleteDTO.setFullName(fullName);
        domainDeleteDTO.setCode(bill.getString("code"));
        domainDeleteDTO.setToken(InvocationInfoProxy.getYhtAccessToken());
        if (isCreator != null && !isCreator.booleanValue()) {
            domainDeleteDTO.setOrgId(bill.getString("belongOrg"));
        }
        return domainDeleteDTO;
    }

    @Override
    public Map<String, Object> getPredicateParamMap(BizObject bill, String billNum, String fullName) {
        Object carryParams = bill.get("carryParams");
        Boolean isCreator = carryParams != null ? (Boolean)((Map)bill.get("carryParams")).get("isCreator") : (Boolean)bill.get("isCreator");
        HashMap<String, Object> paramMap = new HashMap<String, Object>();
        if (isCreator != null && !isCreator.booleanValue()) {
            paramMap.put("isCheckCreator", false);
        } else {
            paramMap.put("isCheckCreator", true);
        }
        return paramMap;
    }
}


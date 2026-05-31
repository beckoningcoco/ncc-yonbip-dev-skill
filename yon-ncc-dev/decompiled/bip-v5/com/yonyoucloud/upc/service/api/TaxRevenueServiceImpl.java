/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.yonyou.cloud.middleware.rpc.RemoteCall
 *  com.yonyou.einvoice.service.itf.ITaxRevenueService
 *  com.yonyoucloud.iuap.upc.api.ITaxRevenueService
 *  com.yonyoucloud.iuap.upc.dto.TaxRevenueDTO
 *  org.slf4j.Logger
 *  org.slf4j.LoggerFactory
 *  org.springframework.beans.factory.annotation.Autowired
 *  org.springframework.stereotype.Service
 *  org.springframework.util.CollectionUtils
 */
package com.yonyoucloud.upc.service.api;

import com.yonyou.cloud.middleware.rpc.RemoteCall;
import com.yonyou.einvoice.service.itf.ITaxRevenueService;
import com.yonyoucloud.iuap.upc.dto.TaxRevenueDTO;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;

@Service
@RemoteCall(value="productcenter@c87e2267-1001-4c70-bb2a-ab41f3b81aa3")
public class TaxRevenueServiceImpl
implements com.yonyoucloud.iuap.upc.api.ITaxRevenueService {
    private static final Logger log = LoggerFactory.getLogger(TaxRevenueServiceImpl.class);
    @Autowired
    private ITaxRevenueService taxRevenueService;

    public List<TaxRevenueDTO> getTaxRevenueList() throws Exception {
        List taxRevenueList = this.taxRevenueService.getTaxRevenueList();
        if (!CollectionUtils.isEmpty((Collection)taxRevenueList)) {
            return taxRevenueList.stream().map(taxRevenue -> {
                TaxRevenueDTO taxRevenueDTONew = new TaxRevenueDTO();
                taxRevenueDTONew.setId(taxRevenue.getId());
                taxRevenueDTONew.setCode(taxRevenue.getCode());
                taxRevenueDTONew.setParentCode(taxRevenue.getParentCode());
                taxRevenueDTONew.setName(taxRevenue.getName());
                taxRevenueDTONew.setSimpleName(taxRevenue.getSimpleName());
                taxRevenueDTONew.setTaxDesc(taxRevenue.getTaxDesc());
                return taxRevenueDTONew;
            }).collect(Collectors.toList());
        }
        return null;
    }
}


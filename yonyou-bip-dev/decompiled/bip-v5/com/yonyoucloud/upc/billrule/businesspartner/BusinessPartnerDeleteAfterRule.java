/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.yonyou.ucf.mdd.common.model.rule.RuleExecuteResult
 *  com.yonyou.ucf.mdd.ext.bill.dto.BillDataDto
 *  com.yonyou.ucf.mdd.ext.bill.rule.base.AbstractCommonRule
 *  com.yonyou.ucf.mdd.ext.core.AppContext
 *  com.yonyou.ucf.mdd.ext.dao.sql.SqlHelper
 *  com.yonyou.ucf.mdd.ext.model.BillContext
 *  com.yonyoucloud.fi.tmsp.openapi.ITmspBizPartnerService
 *  com.yonyoucloud.fi.tmsp.vo.FundBizObjArchInsertReq
 *  com.yonyoucloud.upc.base.businesspartner.BusinessPartner
 *  com.yonyoucloud.upc.base.businesspartner.PartnerCapitalComparison
 *  com.yonyoucloud.upc.base.businesspartner.PartnerMerchantComparison
 *  com.yonyoucloud.upc.base.businesspartner.PartnerVendorComparison
 *  com.yonyoucloud.upc.pub.api.vendor.service.vendor.IVendorPubService
 *  com.yonyoucloud.upc.utils.BusinessPartnerUtils
 *  org.springframework.beans.factory.annotation.Autowired
 *  org.springframework.context.annotation.Lazy
 *  org.springframework.stereotype.Component
 *  org.springframework.util.CollectionUtils
 */
package com.yonyoucloud.upc.billrule.businesspartner;

import com.yonyou.ucf.mdd.common.model.rule.RuleExecuteResult;
import com.yonyou.ucf.mdd.ext.bill.dto.BillDataDto;
import com.yonyou.ucf.mdd.ext.bill.rule.base.AbstractCommonRule;
import com.yonyou.ucf.mdd.ext.core.AppContext;
import com.yonyou.ucf.mdd.ext.dao.sql.SqlHelper;
import com.yonyou.ucf.mdd.ext.model.BillContext;
import com.yonyoucloud.fi.tmsp.openapi.ITmspBizPartnerService;
import com.yonyoucloud.fi.tmsp.vo.FundBizObjArchInsertReq;
import com.yonyoucloud.upc.base.businesspartner.BusinessPartner;
import com.yonyoucloud.upc.base.businesspartner.PartnerCapitalComparison;
import com.yonyoucloud.upc.base.businesspartner.PartnerMerchantComparison;
import com.yonyoucloud.upc.base.businesspartner.PartnerVendorComparison;
import com.yonyoucloud.upc.pub.api.vendor.service.vendor.IVendorPubService;
import com.yonyoucloud.upc.utils.BusinessPartnerUtils;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;
import org.springframework.util.CollectionUtils;

@Component(value="businessPartnerDeleteAfterRule")
public class BusinessPartnerDeleteAfterRule
extends AbstractCommonRule {
    @Lazy
    @Autowired
    private ITmspBizPartnerService capitalPartnerService;
    @Autowired
    private IVendorPubService vendorPublicService;

    public RuleExecuteResult execute(BillContext billContext, Map<String, Object> paramMap) throws Exception {
        BillDataDto billDataDto = (BillDataDto)this.getParam(paramMap);
        if (billDataDto == null || null == billDataDto.getBillnum()) {
            return new RuleExecuteResult();
        }
        ArrayList data = (ArrayList)billDataDto.getData();
        if (!CollectionUtils.isEmpty((Collection)data)) {
            List partnerVendorComparisons;
            List partnerMerchantComparisons;
            BusinessPartner businessPartner = (BusinessPartner)data.get(0);
            List partnerCapitalComparisons = BusinessPartnerUtils.queryCapitalComparisonByPartnerId((String)((String)businessPartner.getId()));
            if (!CollectionUtils.isEmpty((Collection)partnerCapitalComparisons)) {
                FundBizObjArchInsertReq fundBizObjArchInsertReq = new FundBizObjArchInsertReq();
                fundBizObjArchInsertReq.setBizPartner((String)businessPartner.getId());
                for (PartnerCapitalComparison partnerCapitalComparison : partnerCapitalComparisons) {
                    fundBizObjArchInsertReq.setFundBizObjId(partnerCapitalComparison.getCapitalId());
                    this.capitalPartnerService.deleteFundBizObjArch(fundBizObjArchInsertReq);
                }
            }
            if (!CollectionUtils.isEmpty((Collection)(partnerMerchantComparisons = BusinessPartnerUtils.queryMerchantComparisonByPartnerId((String)((String)businessPartner.getId()))))) {
                HashMap<String, Object> params = new HashMap<String, Object>(8);
                params.put("ytenant_id", AppContext.getYTenantId());
                params.put("businessPartner", null);
                for (PartnerMerchantComparison partnerMerchantComparison : partnerMerchantComparisons) {
                    params.put("merchantId", partnerMerchantComparison.getMerchantId());
                    SqlHelper.update((String)"com.yonyoucloud.upc.data.businesspartner.updateMerchantBusinessPartner", params);
                }
            }
            if (!CollectionUtils.isEmpty((Collection)(partnerVendorComparisons = BusinessPartnerUtils.queryVendorComparisonByPartnerId((String)((String)businessPartner.getId()))))) {
                for (PartnerVendorComparison partnerVendorComparison : partnerVendorComparisons) {
                    if (partnerVendorComparison.getVendorId() == null) continue;
                    this.vendorPublicService.updateVendorBusinessPartner(partnerVendorComparison.getVendorId(), null);
                }
            }
        }
        return new RuleExecuteResult();
    }
}


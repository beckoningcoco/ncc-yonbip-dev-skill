/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.yonyou.iuap.ucf.common.i18n.InternationalUtils
 *  com.yonyou.iuap.upc.merge.model.BillInfo
 *  com.yonyou.iuap.upc.merge.model.CheckStatusEnum
 *  com.yonyou.iuap.upc.merge.model.CheckTypeEnum
 *  com.yonyou.iuap.upc.merge.model.MergeDocTypeEnum
 *  com.yonyou.iuap.upc.merge.model.MergeResult
 *  com.yonyou.iuap.upc.merge.service.IDocMergeCheckService
 *  com.yonyoucloud.upc.base.businesspartner.PartnerMerchantComparison
 *  com.yonyoucloud.upc.base.businesspartner.PartnerVendorComparison
 *  com.yonyoucloud.upc.common.enums.UpcFullNameEnum
 *  com.yonyoucloud.upc.data.businesspartner.BusinesspartnerDao
 *  org.apache.commons.lang3.ObjectUtils
 *  org.slf4j.Logger
 *  org.slf4j.LoggerFactory
 *  org.springframework.beans.factory.annotation.Autowired
 *  org.springframework.stereotype.Service
 */
package com.yonyoucloud.upc.service.docmerge;

import com.yonyou.iuap.ucf.common.i18n.InternationalUtils;
import com.yonyou.iuap.upc.merge.model.BillInfo;
import com.yonyou.iuap.upc.merge.model.CheckStatusEnum;
import com.yonyou.iuap.upc.merge.model.CheckTypeEnum;
import com.yonyou.iuap.upc.merge.model.MergeDocTypeEnum;
import com.yonyou.iuap.upc.merge.model.MergeResult;
import com.yonyou.iuap.upc.merge.service.IDocMergeCheckService;
import com.yonyoucloud.upc.base.businesspartner.PartnerMerchantComparison;
import com.yonyoucloud.upc.base.businesspartner.PartnerVendorComparison;
import com.yonyoucloud.upc.common.enums.UpcFullNameEnum;
import com.yonyoucloud.upc.data.businesspartner.BusinesspartnerDao;
import java.text.MessageFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.apache.commons.lang3.ObjectUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BusinessPartnerBusinessCheckService
implements IDocMergeCheckService {
    private static final Logger log = LoggerFactory.getLogger(BusinessPartnerBusinessCheckService.class);
    @Autowired
    private BusinesspartnerDao businesspartnerDao;

    public List<MergeResult> checkBeforeMerge(MergeDocTypeEnum mergeDocType, String checkDocId) {
        MergeResult mergeResult = new MergeResult();
        mergeResult.setServiceCode("base_businesspartnerlist");
        mergeResult.setCheckTypeEnum(CheckTypeEnum.inTransit);
        mergeResult.setCheckItem(UpcFullNameEnum.getBillName((String)UpcFullNameEnum.businessPartner.getFullName()));
        mergeResult.setCheckStandard(InternationalUtils.getMessageWithDefault((String)"UID:P_COREDOC-BE_207B20B204A80002", (String)"1\u3001\u5982\u679c\u4e1a\u52a1\u4f19\u4f34\u53ea\u5f15\u7528\u5f53\u524d\u68c0\u67e5\u7684\u5ba2\u6237/\u4f9b\u5e94\u5546\uff0c\u6ca1\u6709\u540c\u65f6\u5f15\u7528\u5176\u4ed6\u5ba2\u6237/\u4f9b\u5e94\u5546\u548c\u5176\u4ed6\u89d2\u8272\u7684\u5bf9\u8c61\uff0c\u90a3\u4e48\u53ef\u4ee5\u505c\u7528\u4e1a\u52a1\u4f19\u4f34\uff1b 2\u3001\u5982\u679c\u4e1a\u52a1\u4f19\u4f34\u540c\u65f6\u5f15\u7528\u5176\u4ed6\u5ba2\u6237/\u4f9b\u5e94\u5546\u548c\u5176\u4ed6\u89d2\u8272\u7684\u5bf9\u8c61\uff0c\u9879\u76ee\u5e94\u6839\u636e\u5b9e\u9645\u9879\u76ee\u60c5\u51b5\u5206\u6790\u4e1a\u52a1\u4f19\u4f34\u662f\u5426\u7ee7\u7eed\u4f7f\u7528\uff1b"));
        try {
            int size = 0;
            if (MergeDocTypeEnum.Merchant.equals((Object)mergeDocType)) {
                List comparisonList = this.businesspartnerDao.queryPartnerMerchantComparisonByMerchantId(Long.valueOf(Long.parseLong(checkDocId)));
                size = ObjectUtils.isNotEmpty((Object)comparisonList) ? comparisonList.size() : 0;
            } else if (MergeDocTypeEnum.Vendor.equals((Object)mergeDocType)) {
                List comparisonList = this.businesspartnerDao.queryPartnerVendorComparisonByMerchantId(Long.valueOf(Long.parseLong(checkDocId)));
                int n = size = ObjectUtils.isNotEmpty((Object)comparisonList) ? comparisonList.size() : 0;
            }
            if (size > 0) {
                mergeResult.setStatus(CheckStatusEnum.warning);
                mergeResult.setSuggestion(InternationalUtils.getMessageWithDefault((String)"UID:P_COREDOC-BE_1DD5C88C05280001", (String)"\u89e3\u9664\u4e0e\u4e1a\u52a1\u4f19\u4f34\u7684\u5173\u8054\u5173\u7cfb"));
                mergeResult.setResult(MessageFormat.format(InternationalUtils.getMessageWithDefault((String)"UID:P_COREDOC-BE_201E5EAA04280006", (String)"\u5b58\u5728[{0}]\u4e2a\u5f15\u7528"), size));
            } else {
                mergeResult.setStatus(CheckStatusEnum.noAgent);
                mergeResult.setResult(InternationalUtils.getMessageWithDefault((String)"UID:P_COREDOC-BE_2022267804280001", (String)"\u68c0\u67e5\u6210\u529f"));
            }
        }
        catch (Exception e) {
            log.error("checkBeforeMerge:" + e.getMessage(), (Throwable)e);
            mergeResult.setStatus(CheckStatusEnum.hasAgent);
            mergeResult.setResult(MessageFormat.format(InternationalUtils.getMessageWithDefault((String)"UID:P_COREDOC-BE_1DD5C93005480008", (String)"\u670d\u52a1\u5f02\u5e38\uff0c\u62a5\u9519\uff1a[{0}]"), e.getMessage()));
            mergeResult.setSuggestion(InternationalUtils.getMessageWithDefault((String)"UID:P_COREDOC-BE_1DD5C96005280003", (String)"\u670d\u52a1\u5f02\u5e38\uff0c\u8bf7\u68c0\u67e5\u670d\u52a1\u3010\u7269\u6599\u4e2d\u5fc3\u3011"));
        }
        return Collections.singletonList(mergeResult);
    }

    public List<BillInfo> getExportToDoItem(MergeDocTypeEnum mergeDocType, String checkDocId, MergeResult mergeResult) {
        List partnerVendorComparisons;
        ArrayList<BillInfo> billInfoList = new ArrayList<BillInfo>();
        if (MergeDocTypeEnum.Merchant.equals((Object)mergeDocType)) {
            List partMerchantComparisons = this.businesspartnerDao.queryPartnerMerchantComparisonByMerchantId(Long.valueOf(Long.parseLong(checkDocId)));
            if (ObjectUtils.isNotEmpty((Object)partMerchantComparisons)) {
                for (PartnerMerchantComparison partMerchantComparison : partMerchantComparisons) {
                    BillInfo billInfo = new BillInfo();
                    billInfo.setCode((String)partMerchantComparison.get("partnerCode"));
                    billInfo.setName((String)partMerchantComparison.get("partnerName"));
                    billInfoList.add(billInfo);
                }
            }
        } else if (MergeDocTypeEnum.Vendor.equals((Object)mergeDocType) && ObjectUtils.isNotEmpty((Object)(partnerVendorComparisons = this.businesspartnerDao.queryPartnerVendorComparisonByMerchantId(Long.valueOf(Long.parseLong(checkDocId)))))) {
            for (PartnerVendorComparison partVendorComparison : partnerVendorComparisons) {
                BillInfo billInfo = new BillInfo();
                billInfo.setCode((String)partVendorComparison.get("partnerCode"));
                billInfo.setName((String)partVendorComparison.get("partnerName"));
                billInfoList.add(billInfo);
            }
        }
        return billInfoList;
    }
}


/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.yonyou.iuap.apdoc.coredoc.batchmodify.extinterface.IPubBatchModifyQueryEntityExtService
 *  com.yonyou.iuap.apdoc.coredoc.batchmodify.extinterface.IPubBatchModifyQueryFieldExtService
 *  com.yonyou.iuap.apdoc.coredoc.dao.batchModify.PubBatchModifyEntityDao
 *  com.yonyoucloud.upc.aa.merchant.QueryPerspective
 *  com.yonyoucloud.upc.coredoc.batchentity.dto.PubBatchModifyEntityQueryDTO
 *  com.yonyoucloud.upc.coredoc.batchentity.vo.PubBatchModifyEntityFieldVO
 *  com.yonyoucloud.upc.coredoc.pub.PubBatchModifyEntity
 *  org.slf4j.Logger
 *  org.slf4j.LoggerFactory
 *  org.springframework.beans.factory.annotation.Autowired
 *  org.springframework.stereotype.Service
 *  org.springframework.util.CollectionUtils
 */
package com.yonyoucloud.upc.service.batchModify.queryExt;

import com.yonyou.iuap.apdoc.coredoc.batchmodify.extinterface.IPubBatchModifyQueryEntityExtService;
import com.yonyou.iuap.apdoc.coredoc.batchmodify.extinterface.IPubBatchModifyQueryFieldExtService;
import com.yonyou.iuap.apdoc.coredoc.dao.batchModify.PubBatchModifyEntityDao;
import com.yonyoucloud.upc.aa.merchant.QueryPerspective;
import com.yonyoucloud.upc.coredoc.batchentity.dto.PubBatchModifyEntityQueryDTO;
import com.yonyoucloud.upc.coredoc.batchentity.vo.PubBatchModifyEntityFieldVO;
import com.yonyoucloud.upc.coredoc.pub.PubBatchModifyEntity;
import com.yonyoucloud.upc.service.batchModify.PubBatchModifyEntityServiceImpl;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;

@Service
public class MerchantBatchModifyQueryExtHandler
implements IPubBatchModifyQueryFieldExtService,
IPubBatchModifyQueryEntityExtService {
    private static final Logger log = LoggerFactory.getLogger(MerchantBatchModifyQueryExtHandler.class);
    @Autowired
    private PubBatchModifyEntityDao pubBatchModifyEntityDao;
    @Autowired
    private PubBatchModifyEntityServiceImpl pubBatchModifyEntityService;

    public List<PubBatchModifyEntity> getPubBatchModifyEntityVO(PubBatchModifyEntityQueryDTO pubBatchModifyEntityQueryDTO) throws Exception {
        if ("aa_merchantdetail".equals(pubBatchModifyEntityQueryDTO.getBillNum())) {
            ArrayList<String> fullNameList = new ArrayList<String>();
            fullNameList.add("aa.merchant.MerchantDetail");
            fullNameList.add("aa.merchant.MerchantApplyRangeDetail");
            fullNameList.add("aa.merchant.CustomerArea");
            fullNameList.add("aa.merchant.Principal");
            ArrayList<PubBatchModifyEntity> result = new ArrayList<PubBatchModifyEntity>();
            List pubBatchModifyEntityFromMerchant = this.pubBatchModifyEntityDao.getPubBatchModifyEntityFromMerchant(fullNameList);
            if (!CollectionUtils.isEmpty((Collection)pubBatchModifyEntityFromMerchant)) {
                for (PubBatchModifyEntity entity : pubBatchModifyEntityFromMerchant) {
                    entity.setBillNum("aa_merchantdetail");
                    result.add(entity);
                }
            }
            return result;
        }
        HashMap extMap = pubBatchModifyEntityQueryDTO.getExternalData();
        if (!CollectionUtils.isEmpty((Map)extMap)) {
            String queryPerspective = String.valueOf(extMap.get("queryPerspective"));
            if (QueryPerspective.ManagementPerspective.getValue().equals(queryPerspective)) {
                return this.pubBatchModifyEntityDao.getPubBatchModifyEntityByBillNum(pubBatchModifyEntityQueryDTO.getBillNum());
            }
            if (QueryPerspective.UsePerspective.getValue().equals(queryPerspective)) {
                ArrayList<String> fullNameList = new ArrayList<String>();
                fullNameList.add("aa.merchant.MerchantApplyRangeDetail");
                fullNameList.add("aa.merchant.CustomerArea");
                fullNameList.add("aa.merchant.Principal");
                return this.pubBatchModifyEntityDao.getPubBatchModifyEntityFromMerchant(fullNameList);
            }
            return this.pubBatchModifyEntityDao.getPubBatchModifyEntityByBillNum(pubBatchModifyEntityQueryDTO.getBillNum());
        }
        return this.pubBatchModifyEntityDao.getPubBatchModifyEntityByBillNum(pubBatchModifyEntityQueryDTO.getBillNum());
    }

    public void getBatchModifyExtendField(PubBatchModifyEntity pubBatchModifyEntity, List<PubBatchModifyEntityFieldVO> batchModifySaveFieldList, List<PubBatchModifyEntityFieldVO> batchModifyQueryFieldList) throws Exception {
        if (!"aa.merchant.Merchant".equals(pubBatchModifyEntity.getFullName())) {
            return;
        }
        try {
            this.pubBatchModifyEntityService.setExtentBatchModifyField(pubBatchModifyEntity, batchModifySaveFieldList, batchModifyQueryFieldList);
        }
        catch (Exception e) {
            log.error("\u5ba2\u6237\u6863\u6848\u5b50\u8868\u6279\u6539\u83b7\u53d6\u5ba2\u5f00\u5b57\u6bb5\u5f02\u5e38:{}", (Object)e.getMessage(), (Object)e);
        }
    }
}


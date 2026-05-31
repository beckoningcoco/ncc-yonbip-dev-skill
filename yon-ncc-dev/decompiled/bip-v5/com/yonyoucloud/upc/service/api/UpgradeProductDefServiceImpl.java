/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.yonyou.iuap.apdoc.coredoc.enums.CoreExtrateBusinessErrorEnum
 *  com.yonyou.iuap.apdoc.coredoc.exceptions.CoreDocBusinessException
 *  com.yonyou.ucf.mdd.ext.character.model.SensitiveDTO
 *  com.yonyou.ucf.mdd.ext.character.sensitive.IMddSensitiveService
 *  com.yonyou.ucf.mdd.ext.core.AppContext
 *  com.yonyou.ucf.mdd.ext.dao.sql.SqlHelper
 *  com.yonyoucloud.iuap.upc.dto.UpgradeCharacterDTO
 *  org.springframework.beans.factory.annotation.Autowired
 *  org.springframework.stereotype.Service
 */
package com.yonyoucloud.upc.service.api;

import com.yonyou.iuap.apdoc.coredoc.enums.CoreExtrateBusinessErrorEnum;
import com.yonyou.iuap.apdoc.coredoc.exceptions.CoreDocBusinessException;
import com.yonyou.ucf.mdd.ext.character.model.SensitiveDTO;
import com.yonyou.ucf.mdd.ext.character.sensitive.IMddSensitiveService;
import com.yonyou.ucf.mdd.ext.core.AppContext;
import com.yonyou.ucf.mdd.ext.dao.sql.SqlHelper;
import com.yonyoucloud.iuap.upc.dto.UpgradeCharacterDTO;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UpgradeProductDefServiceImpl {
    @Autowired
    private IMddSensitiveService mddSensitiveService;

    public void upgradeUi() throws Exception {
        this.upgradeProductTplUI();
        this.upgradeProductUI();
        this.upgradeProductDetailUI();
    }

    public void upgradeProductTplUI() throws Exception {
        String billNum = "pc_producttpl";
        List<Long> BillTemplateBaseBaseIds = this.getBillTemplateBaseIdList(billNum);
        for (Long billTplGroupBaseId : BillTemplateBaseBaseIds) {
            this.updateProductTplUI(billTplGroupBaseId);
        }
    }

    public void upgradeProductUI() throws Exception {
        String billNum = "pc_product";
        List<Long> BillTemplateBaseBaseIds = this.getBillTemplateBaseIdList(billNum);
        for (Long billTemplateBaseBaseId : BillTemplateBaseBaseIds) {
            this.updateProductUI(billTemplateBaseBaseId);
        }
    }

    public void upgradeProductDetailUI() throws Exception {
        String billNum = "pc_productdetail";
        List<Long> BillTemplateBaseBaseIds = this.getBillTemplateBaseIdList(billNum);
        for (Long billTplGroupBaseId : BillTemplateBaseBaseIds) {
            this.updateProductDetailUI(billTplGroupBaseId);
        }
    }

    private List<Long> getBillTemplateBaseIdList(String billNum) {
        HashMap<String, Object> params = new HashMap<String, Object>();
        params.put("ytenant", AppContext.getYTenantId());
        params.put("billNum", billNum);
        return SqlHelper.selectList((String)"com.yonyou.base.character.upgrade.service.impl.ProductDefineCharacterServiceImpl.getBillTemplateBaseIdList", params);
    }

    private void updateProductUI(Long billTemplateBaseBaseId) throws Exception {
        HashMap<String, Object> params = new HashMap<String, Object>();
        params.put("ytenant", AppContext.getYTenantId());
        params.put("billTemplateBaseBaseId", billTemplateBaseBaseId);
        params.put("oids", AppContext.getBatchOids((int)3));
        SqlHelper.update((String)"com.yonyou.base.character.upgrade.service.impl.ProductDefineCharacterServiceImpl.upgradeProductUI", params);
    }

    private void updateProductTplUI(Long billTemplateBaseBaseId) throws Exception {
        HashMap<String, Object> params = new HashMap<String, Object>();
        params.put("ytenant", AppContext.getYTenantId());
        params.put("billTemplateBaseBaseId", billTemplateBaseBaseId);
        params.put("oids", AppContext.getBatchOids((int)72));
        SqlHelper.update((String)"com.yonyou.base.character.upgrade.service.impl.ProductDefineCharacterServiceImpl.upgradeProductTplUI", params);
    }

    private void updateProductDetailUI(Long billTemplateBaseBaseId) throws Exception {
        HashMap<String, Object> params = new HashMap<String, Object>();
        params.put("ytenant", AppContext.getYTenantId());
        params.put("billTemplateBaseBaseId", billTemplateBaseBaseId);
        params.put("oids", AppContext.getBatchOids((int)3));
        SqlHelper.update((String)"com.yonyou.base.character.upgrade.service.impl.ProductDefineCharacterServiceImpl.upgradeProductDetailUI", params);
    }

    public void testListSkuCharacterByIdsAndSensitiveType(List<UpgradeCharacterDTO> upgradeCharacterDTOList, int sensitiveType) throws Exception {
        UpgradeCharacterDTO upgradeCharacterDTO = upgradeCharacterDTOList.get(0);
        SensitiveDTO sensitiveDTO = new SensitiveDTO();
        sensitiveDTO.setProductId(upgradeCharacterDTO.getProductId());
        sensitiveDTO.setCgType("FreeCT");
        sensitiveDTO.setSensitiveType(this.getSensitive(sensitiveType));
        sensitiveDTO.setCharacteristicsValue((Map)upgradeCharacterDTO.getCharacterMap());
        String sensitiveUID = this.mddSensitiveService.generateSensitiveUID(sensitiveDTO);
        if (!upgradeCharacterDTO.getSensitiveId().equals(sensitiveUID)) {
            throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_801238);
        }
    }

    private String getSensitive(int sensitiveType) {
        if (0 == sensitiveType) {
            return "skuSens";
        }
        if (1 == sensitiveType) {
            return "batchSens";
        }
        if (2 == sensitiveType) {
            return "SNSens";
        }
        if (3 == sensitiveType) {
            return "stockSens";
        }
        if (4 == sensitiveType) {
            return "costAffec";
        }
        if (5 == sensitiveType) {
            return "BOMAffec";
        }
        if (6 == sensitiveType) {
            return "manuAffec";
        }
        if (7 == sensitiveType) {
            return "PriceAffec";
        }
        throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_801239);
    }
}


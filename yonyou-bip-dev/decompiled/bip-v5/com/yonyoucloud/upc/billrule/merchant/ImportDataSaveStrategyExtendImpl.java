/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.yonyou.yonbip.iuap.xport.importing.data.ImportBatchData
 *  com.yonyou.yonbip.iuap.xport.importing.processor.importRuleCheck.ImportDataSaveStrategyExtend
 *  com.yonyou.yonbip.iuap.xport.importing.processor.pojo.ImportEventBO
 *  com.yonyou.yonbip.iuap.xport.importing.processor.pojo.ImportEventContext
 *  com.yonyou.ypd.mdf.config.ICompatibleBaseConfig
 *  org.springframework.beans.factory.annotation.Autowired
 *  org.springframework.stereotype.Service
 */
package com.yonyoucloud.upc.billrule.merchant;

import com.yonyou.yonbip.iuap.xport.importing.data.ImportBatchData;
import com.yonyou.yonbip.iuap.xport.importing.processor.importRuleCheck.ImportDataSaveStrategyExtend;
import com.yonyou.yonbip.iuap.xport.importing.processor.pojo.ImportEventBO;
import com.yonyou.yonbip.iuap.xport.importing.processor.pojo.ImportEventContext;
import com.yonyou.ypd.mdf.config.ICompatibleBaseConfig;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ImportDataSaveStrategyExtendImpl
implements ImportDataSaveStrategyExtend {
    @Autowired
    private ICompatibleBaseConfig compatibleBaseConfig;

    public void doImportDataSaveStrategyCheck(ImportBatchData batchData, ImportEventContext event) {
    }

    public boolean isSkipCheck(ImportBatchData batchData, ImportEventContext event) {
        if (event == null) {
            return false;
        }
        return "aa_merchantexport".equals(event.getBillno()) || "aa_goodsproductscomparison_position".equals(event.getBillno()) || "pc_managementclass".equals(event.getBillno()) || "pc_brand".equals(event.getBillno()) || this.compatibleBaseConfig.hybridCustomCompatibleBill(event.getBillno()) && !"aa_merchant".equals(event.getBillno()) && !"aa_merchantdetail".equals(event.getBillno());
    }

    public void doImportDataSaveStrategyCheck(ImportBatchData batchData, ImportEventBO event) {
        super.doImportDataSaveStrategyCheck(batchData, event);
    }

    public boolean isSkipCheck(ImportBatchData batchData, ImportEventBO event) {
        return super.isSkipCheck(batchData, event);
    }
}


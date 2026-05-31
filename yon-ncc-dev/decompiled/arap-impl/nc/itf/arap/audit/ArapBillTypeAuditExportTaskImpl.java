/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  nc.itf.bd.audit.IAuditContext
 *  nc.itf.bd.audit.IAuditExportTask
 *  nc.itf.bd.audit.IExportContext
 *  nc.md.persist.framework.MDPersistenceService
 *  nc.vo.ml.NCLangRes4VoTransl
 *  nc.vo.pub.SuperVO
 *  nc.vo.pub.billtype.BilltypeVO
 */
package nc.itf.arap.audit;

import java.util.Collection;
import nc.itf.bd.audit.IAuditContext;
import nc.itf.bd.audit.IAuditExportTask;
import nc.itf.bd.audit.IExportContext;
import nc.md.persist.framework.MDPersistenceService;
import nc.vo.ml.NCLangRes4VoTransl;
import nc.vo.pub.SuperVO;
import nc.vo.pub.billtype.BilltypeVO;

public class ArapBillTypeAuditExportTaskImpl
implements IAuditExportTask {
    public final String MDID_RESA_VOUCHERTYPE = "9d51c1f7-e9c9-4a25-801a-63eff11926fb";
    private String statusMsg;

    public SuperVO[] getExportData(IAuditContext context, IExportContext exportcontext, String pkOrg) throws Exception {
        BilltypeVO[] result = null;
        String whereSql = " pk_billtypecode in ('F0','F1','F2','F3','DK','DL') ";
        Collection rst = MDPersistenceService.lookupPersistenceQueryService().queryBillOfVOByCondWithOrder(BilltypeVO.class, whereSql, false, false, new String[]{"pk_billtypecode"});
        BilltypeVO[] billtypeVOs = rst.toArray(new BilltypeVO[0]);
        result = billtypeVOs;
        if (result != null) {
            this.statusMsg = NCLangRes4VoTransl.getNCLangRes().getStrByID("2006pub_0", "02006pub-0897", null, new String[]{String.valueOf(result.length)});
        }
        return result;
    }

    public String getStatusMsg() {
        return this.statusMsg;
    }

    public void clearStatuMsg() {
        this.statusMsg = null;
    }
}


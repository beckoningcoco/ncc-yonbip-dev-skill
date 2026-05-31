/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  nc.bs.framework.common.InvocationInfoProxy
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
import nc.bs.framework.common.InvocationInfoProxy;
import nc.itf.bd.audit.IAuditContext;
import nc.itf.bd.audit.IAuditExportTask;
import nc.itf.bd.audit.IExportContext;
import nc.md.persist.framework.MDPersistenceService;
import nc.vo.ml.NCLangRes4VoTransl;
import nc.vo.pub.SuperVO;
import nc.vo.pub.billtype.BilltypeVO;

public class ArapTraTypeAuditExportTaskImpl
implements IAuditExportTask {
    private String statusMsg;

    public SuperVO[] getExportData(IAuditContext context, IExportContext exportcontext, String pkOrg) throws Exception {
        BilltypeVO[] result = null;
        String pk_group = InvocationInfoProxy.getInstance().getGroupId();
        String whereSql = " parentbilltype in ('F0','F1','F2','F3','DK','DL') and pk_group = '" + pk_group + "' ";
        Collection rst = MDPersistenceService.lookupPersistenceQueryService().queryBillOfVOByCondWithOrder(BilltypeVO.class, whereSql, false, false, new String[]{"pk_billtypecode"});
        BilltypeVO[] billtypeVOs = rst.toArray(new BilltypeVO[0]);
        result = billtypeVOs;
        if (result != null) {
            this.statusMsg = NCLangRes4VoTransl.getNCLangRes().getStrByID("2006pub_0", "02006pub-0897", null, new String[]{String.valueOf(result.length)});
        }
        return result;
    }

    public void clearStatuMsg() {
        this.statusMsg = null;
    }

    public String getStatusMsg() {
        return this.statusMsg;
    }
}


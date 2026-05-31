/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  nc.bs.pub.pf.IPrintDataGetter
 *  nc.ui.pub.print.IDataSource
 *  nc.vo.pub.BusinessException
 */
package nc.vo.arap.pf;

import nc.bs.pub.pf.IPrintDataGetter;
import nc.ui.pub.print.IDataSource;
import nc.vo.arap.pf.PrintDataSourceForMailAudit;
import nc.vo.pub.BusinessException;

public class ArapPrintService
implements IPrintDataGetter {
    public IDataSource getPrintDs(String billId, String billtype, String checkman) throws BusinessException {
        return new PrintDataSourceForMailAudit(billtype, billId);
    }
}


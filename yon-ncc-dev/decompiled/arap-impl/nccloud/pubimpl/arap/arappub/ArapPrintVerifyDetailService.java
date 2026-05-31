/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  nc.ui.pub.print.IDataSource
 *  nccloud.dto.arap.arappub.PrintDataInfo
 *  nccloud.pubitf.platform.print.AbstractPrintService
 *  nccloud.pubitf.platform.print.IPrintInfo
 *  nccloud.pubitf.platform.print.vo.OutPutMode
 */
package nccloud.pubimpl.arap.arappub;

import java.io.InputStream;
import nc.ui.pub.print.IDataSource;
import nccloud.dto.arap.arappub.PrintDataInfo;
import nccloud.pubimpl.arap.arappub.ArapDocPrintVerifyDetailDatasource;
import nccloud.pubitf.platform.print.AbstractPrintService;
import nccloud.pubitf.platform.print.IPrintInfo;
import nccloud.pubitf.platform.print.vo.OutPutMode;

public class ArapPrintVerifyDetailService
extends AbstractPrintService {
    public IDataSource[] getDataSources(IPrintInfo info) {
        PrintDataInfo printinfo = (PrintDataInfo)info;
        String[] pkBills = new String[printinfo.getIds().length];
        IDataSource[] dss = new IDataSource[printinfo.getIds().length];
        for (int num = 0; num < printinfo.getIds().length; ++num) {
            pkBills[num] = printinfo.getIds()[num];
        }
        dss = new IDataSource[1];
        ArapDocPrintVerifyDetailDatasource ds = new ArapDocPrintVerifyDetailDatasource(pkBills, printinfo.getBillType());
        dss[0] = ds;
        return dss;
    }

    public InputStream outPut(IPrintInfo info, OutPutMode mode) {
        return super.outPut(info, mode);
    }
}


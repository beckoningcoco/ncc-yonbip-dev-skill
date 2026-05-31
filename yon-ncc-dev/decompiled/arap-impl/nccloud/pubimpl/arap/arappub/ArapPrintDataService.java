/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  nc.ui.pub.print.IDataSource
 *  nccloud.dto.arap.arappub.PrintDataInfo
 *  nccloud.pubitf.platform.print.AbstractPrintService
 *  nccloud.pubitf.platform.print.IPrintInfo
 */
package nccloud.pubimpl.arap.arappub;

import nc.ui.pub.print.IDataSource;
import nccloud.dto.arap.arappub.PrintDataInfo;
import nccloud.pubimpl.arap.arappub.ArapPrintDatasource;
import nccloud.pubitf.platform.print.AbstractPrintService;
import nccloud.pubitf.platform.print.IPrintInfo;

public class ArapPrintDataService
extends AbstractPrintService {
    public IDataSource[] getDataSources(IPrintInfo info) {
        IDataSource[] dss = new IDataSource[1];
        PrintDataInfo printinfo = (PrintDataInfo)info;
        ArapPrintDatasource apd = new ArapPrintDatasource(printinfo.getAggRecStatementVO());
        dss[0] = apd;
        return dss;
    }
}


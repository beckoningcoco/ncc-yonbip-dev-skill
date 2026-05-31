/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  nc.bs.bd.businessevent.ReportInfo
 *  nc.vo.pub.BusinessException
 */
package nc.itf.arap.termendtransact;

import java.util.Hashtable;
import java.util.List;
import java.util.Vector;
import nc.bs.bd.businessevent.ReportInfo;
import nc.vo.arap.termendtransact.AgiotageVO;
import nc.vo.arap.termendtransact.FilterCondVO;
import nc.vo.arap.termendtransact.RemoteTransferVO;
import nc.vo.arap.termendtransact.TermEndVO;
import nc.vo.pub.BusinessException;

public interface ITermEndPrivate {
    public Vector<Vector<String>> getNoVouchiDocs(Hashtable var1, int var2, Hashtable<String, String> var3, Vector<Vector<String>> var4, String var5) throws BusinessException;

    public RemoteTransferVO onReckoningCheck(FilterCondVO var1, AgiotageVO var2) throws BusinessException;

    public void termEndOperation(String var1, TermEndVO var2, boolean var3) throws BusinessException;

    public List<ReportInfo> onReckoningReportCheck(FilterCondVO var1, AgiotageVO var2) throws BusinessException;
}


/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  nc.bs.bd.businessevent.ReportInfo
 *  nc.itf.arap.termendtransact.ITermEndPrivate
 *  nc.vo.arap.termendtransact.AgiotageVO
 *  nc.vo.arap.termendtransact.FilterCondVO
 *  nc.vo.arap.termendtransact.RemoteTransferVO
 *  nc.vo.arap.termendtransact.TermEndVO
 *  nc.vo.pub.BusinessException
 */
package nc.impl.arap.termendtransact;

import java.util.Hashtable;
import java.util.List;
import java.util.Vector;
import nc.bs.arap.termendtransact.ReckoningBO;
import nc.bs.bd.businessevent.ReportInfo;
import nc.itf.arap.termendtransact.ITermEndPrivate;
import nc.vo.arap.termendtransact.AgiotageVO;
import nc.vo.arap.termendtransact.FilterCondVO;
import nc.vo.arap.termendtransact.RemoteTransferVO;
import nc.vo.arap.termendtransact.TermEndVO;
import nc.vo.pub.BusinessException;

public class TermEndPrivateImpl
implements ITermEndPrivate {
    public Vector<Vector<String>> getNoVouchiDocs(Hashtable hash_bill, int sysBz, Hashtable<String, String> hash_bill_type, Vector<Vector<String>> vetResult, String pk_corp) throws BusinessException {
        return null;
    }

    public RemoteTransferVO onReckoningCheck(FilterCondVO voCond, AgiotageVO voCurrency) throws BusinessException {
        return new ReckoningBO().onReckoningCheck(voCond, voCurrency);
    }

    public void termEndOperation(String prodId, TermEndVO endVO, boolean isCancel) throws BusinessException {
        new ReckoningBO().termEndOperation(prodId, endVO, isCancel);
    }

    public List<ReportInfo> onReckoningReportCheck(FilterCondVO voCond, AgiotageVO voCurrency) throws BusinessException {
        return new ReckoningBO().onReckoningReportCheck(voCond, voCurrency);
    }
}


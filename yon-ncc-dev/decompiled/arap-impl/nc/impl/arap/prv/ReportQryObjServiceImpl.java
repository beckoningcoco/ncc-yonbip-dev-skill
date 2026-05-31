/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  nc.itf.arap.prv.IReportQryObjService
 *  nc.vo.arap.comreport.ArapReportPubUtil
 *  nc.vo.fipub.report.QryObj
 *  nc.vo.pub.BusinessException
 */
package nc.impl.arap.prv;

import java.util.List;
import nc.itf.arap.prv.IReportQryObjService;
import nc.vo.arap.comreport.ArapReportPubUtil;
import nc.vo.fipub.report.QryObj;
import nc.vo.pub.BusinessException;

public class ReportQryObjServiceImpl
implements IReportQryObjService {
    public List<QryObj> getReportQryObj(String[] bdMdid, String reportType) throws BusinessException {
        return ArapReportPubUtil.getReportQryObj((String[])bdMdid, (String)reportType);
    }
}


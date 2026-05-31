/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  nc.vo.fipub.report.QryObj
 *  nc.vo.pub.BusinessException
 */
package nc.itf.arap.prv;

import java.util.List;
import nc.vo.fipub.report.QryObj;
import nc.vo.pub.BusinessException;

public interface IReportQryObjService {
    public List<QryObj> getReportQryObj(String[] var1, String var2) throws BusinessException;
}


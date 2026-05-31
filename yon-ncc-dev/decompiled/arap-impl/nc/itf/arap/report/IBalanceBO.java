/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  nc.pub.smart.context.SmartContext
 *  nc.pub.smart.data.DataSet
 *  nc.pub.smart.exception.SmartException
 *  nc.vo.fipub.report.ReportQueryCondVO
 */
package nc.itf.arap.report;

import nc.pub.smart.context.SmartContext;
import nc.pub.smart.data.DataSet;
import nc.pub.smart.exception.SmartException;
import nc.vo.fipub.report.ReportQueryCondVO;

public interface IBalanceBO {
    public DataSet query(ReportQueryCondVO var1, SmartContext var2) throws SmartException;
}


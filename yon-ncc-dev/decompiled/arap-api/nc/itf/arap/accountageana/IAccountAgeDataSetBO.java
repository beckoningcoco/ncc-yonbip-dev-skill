/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  nc.pub.smart.context.SmartContext
 *  nc.pub.smart.data.DataSet
 *  nc.pub.smart.exception.SmartException
 *  nc.vo.fipub.report.ReportQueryCondVO
 *  nc.vo.pub.BusinessException
 *  nc.vo.pub.lang.UFDate
 */
package nc.itf.arap.accountageana;

import java.util.List;
import nc.pub.smart.context.SmartContext;
import nc.pub.smart.data.DataSet;
import nc.pub.smart.exception.SmartException;
import nc.vo.fipub.report.ReportQueryCondVO;
import nc.vo.pub.BusinessException;
import nc.vo.pub.lang.UFDate;

public interface IAccountAgeDataSetBO {
    public List<List<Object>> getAccountAgeSegment(String var1, UFDate var2) throws BusinessException;

    public DataSet query(ReportQueryCondVO var1, SmartContext var2) throws SmartException;
}


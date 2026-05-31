/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  nc.pub.smart.context.SmartContext
 *  nc.vo.fipub.report.ReportQueryCondVO
 *  nc.vo.pub.BusinessException
 */
package nc.itf.arap.other;

import java.util.List;
import nc.pub.smart.context.SmartContext;
import nc.vo.arap.tally.AggRecStatementVO;
import nc.vo.fipub.report.ReportQueryCondVO;
import nc.vo.pub.BusinessException;

public interface IRecPayStatementBO {
    public List<AggRecStatementVO> query(ReportQueryCondVO var1, SmartContext var2) throws BusinessException;
}


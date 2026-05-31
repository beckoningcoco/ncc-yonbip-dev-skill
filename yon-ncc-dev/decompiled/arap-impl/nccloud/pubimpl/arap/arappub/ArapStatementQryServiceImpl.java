/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  nc.bs.framework.common.NCLocator
 *  nc.itf.arap.other.IRecPayStatementBO
 *  nc.pub.smart.context.SmartContext
 *  nc.vo.arap.tally.AggRecStatementVO
 *  nc.vo.fipub.report.ReportQueryCondVO
 *  nc.vo.pub.BusinessException
 *  nccloud.pubitf.arap.arappub.IArapStatementQryService
 */
package nccloud.pubimpl.arap.arappub;

import java.util.List;
import nc.bs.framework.common.NCLocator;
import nc.itf.arap.other.IRecPayStatementBO;
import nc.pub.smart.context.SmartContext;
import nc.vo.arap.tally.AggRecStatementVO;
import nc.vo.fipub.report.ReportQueryCondVO;
import nc.vo.pub.BusinessException;
import nccloud.pubitf.arap.arappub.IArapStatementQryService;

public class ArapStatementQryServiceImpl
implements IArapStatementQryService {
    public List<AggRecStatementVO> query(ReportQueryCondVO qryCondVO) throws BusinessException {
        return ((IRecPayStatementBO)NCLocator.getInstance().lookup(IRecPayStatementBO.class)).query(qryCondVO, new SmartContext());
    }
}


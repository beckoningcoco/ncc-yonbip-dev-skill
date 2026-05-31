/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  nc.bs.dao.DAOException
 *  nc.vo.fipub.report.AggReportInitializeVO
 *  nc.vo.fipub.report.QryObj
 *  nc.vo.gl.busirecon.query.BusiReconQryVO
 *  nc.vo.gl.busirecon.query.BusiRuleVO
 *  nc.vo.pub.AggregatedValueObject
 *  nc.vo.pub.BusinessException
 *  nc.vo.pub.billtype.BilltypeVO
 *  nc.vo.pub.lang.UFDate
 *  nc.vo.pub.rs.MemoryResultSet
 */
package nc.itf.arap.bill;

import java.sql.SQLException;
import java.util.List;
import nc.bs.dao.DAOException;
import nc.vo.arap.basebill.BaseBillVO;
import nc.vo.fipub.report.AggReportInitializeVO;
import nc.vo.fipub.report.QryObj;
import nc.vo.gl.busirecon.query.BusiReconQryVO;
import nc.vo.gl.busirecon.query.BusiRuleVO;
import nc.vo.pub.AggregatedValueObject;
import nc.vo.pub.BusinessException;
import nc.vo.pub.billtype.BilltypeVO;
import nc.vo.pub.lang.UFDate;
import nc.vo.pub.rs.MemoryResultSet;

public interface IArapBillService {
    public int updatePrintStatus(String var1, String var2, String var3, String var4, UFDate var5) throws BusinessException;

    public void updateIsredFlag(String var1, String var2, String var3) throws BusinessException;

    public int updateParentVO(BaseBillVO var1) throws BusinessException;

    public String updateCancelConfirmInfo(String var1, String var2, String var3) throws BusinessException;

    public void updateConfirmInfo(String var1, String var2, String var3) throws BusinessException;

    public List<QryObj> getReportQryObj(String var1);

    public AggReportInitializeVO getAggReportInitializeVO(String var1) throws DAOException;

    public String getNodeCodeByMdid(String var1);

    public AggReportInitializeVO getReportInitializeVOByMdid(String var1) throws BusinessException;

    public String getFuncIdByNodeCode(String var1) throws BusinessException;

    public BilltypeVO[] queryBillTypeByWhereStr(String var1) throws BusinessException;

    public String getParentBillTypeByTradeType(String var1, String var2);

    public boolean isInitBillCanEditOrDelete(String[] var1);

    public List<QryObj> getReportQryObjForIUFO(String var1);

    public MemoryResultSet[] queryBrBillForGL(BusiReconQryVO var1, BusiRuleVO var2) throws SQLException, BusinessException;

    public Object[] save(AggregatedValueObject[] var1, String var2) throws BusinessException;
}


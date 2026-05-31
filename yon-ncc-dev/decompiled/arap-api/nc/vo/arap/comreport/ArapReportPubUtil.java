/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  nc.bs.dao.BaseDAO
 *  nc.bs.dao.DAOException
 *  nc.bs.framework.common.NCLocator
 *  nc.bs.logging.Logger
 *  nc.itf.fi.pub.Currency
 *  nc.itf.fipub.timecontrol.ITimeControlQueryService
 *  nc.jdbc.framework.processor.ResultSetProcessor
 *  nc.pubitf.uapbd.CurrencyRateUtilHelper
 *  nc.vo.bd.currtype.CurrtypeVO
 *  nc.vo.fipub.report.QryObj
 *  nc.vo.fipub.report.ReportInitializeItemVO
 *  nc.vo.fipub.report.ReportInitializeVO
 *  nc.vo.fipub.timecontrol.TimeCtrlVO
 *  nc.vo.pub.BusinessException
 */
package nc.vo.arap.comreport;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import nc.bs.arap.util.SqlUtils;
import nc.bs.dao.BaseDAO;
import nc.bs.dao.DAOException;
import nc.bs.framework.common.NCLocator;
import nc.bs.logging.Logger;
import nc.itf.fi.pub.Currency;
import nc.itf.fipub.timecontrol.ITimeControlQueryService;
import nc.jdbc.framework.processor.ResultSetProcessor;
import nc.pubitf.uapbd.CurrencyRateUtilHelper;
import nc.vo.bd.currtype.CurrtypeVO;
import nc.vo.fipub.report.QryObj;
import nc.vo.fipub.report.ReportInitializeItemVO;
import nc.vo.fipub.report.ReportInitializeVO;
import nc.vo.fipub.timecontrol.TimeCtrlVO;
import nc.vo.pub.BusinessException;

public class ArapReportPubUtil {
    public static List<QryObj> getReportQryObj(String[] bd_mdid, String reportType) throws BusinessException {
        String inStr = SqlUtils.getInStr("bd_mdid", bd_mdid);
        String sql = " select * from " + ReportInitializeItemVO.getDefaultTableName() + "     where pk_reportinitialize in (select b.pk_reportinitialize from " + ReportInitializeVO.getDefaultTableName() + " a, " + ReportInitializeItemVO.getDefaultTableName() + " b  where a.pk_reportinitialize = b.pk_reportinitialize  and a.reporttype = '" + reportType + "' group by b.pk_reportinitialize having count(*) = 1 ) and " + inStr;
        ArrayList<QryObj> result = new ArrayList<QryObj>();
        try {
            BaseDAO dao = new BaseDAO();
            dao.executeQuery(sql, (ResultSetProcessor)new RptProccessor(result));
        }
        catch (DAOException e) {
            Logger.error((Object)e.getMessage(), (Throwable)e);
            throw new BusinessException(e.getMessage());
        }
        return result;
    }

    public static CurrtypeVO[] getLocalCurrencyByOrgID(String[] pk_orgs) throws BusinessException {
        if (pk_orgs == null || pk_orgs.length == 0) {
            return new CurrtypeVO[0];
        }
        CurrtypeVO[] currtypeVOs = new CurrtypeVO[pk_orgs.length];
        for (int i = 0; i < pk_orgs.length; ++i) {
            currtypeVOs[i] = Currency.getCurrInfo((String)CurrencyRateUtilHelper.getInstance().getLocalCurrtypeByOrgID(pk_orgs[i]));
        }
        return currtypeVOs;
    }

    public static TimeCtrlVO getTimeCtrlVO(String accAgePlan) throws BusinessException {
        return ((ITimeControlQueryService)NCLocator.getInstance().lookup(ITimeControlQueryService.class)).queryTimeCtrlByPk(accAgePlan);
    }

    public static String getModuleIdByDirect(String direct) {
        return "rec".equals(direct) ? "2006" : "2008";
    }

    private static final class RptProccessor
    implements ResultSetProcessor {
        private final List<QryObj> result;
        private static final long serialVersionUID = 1L;

        private RptProccessor(List<QryObj> result) {
            this.result = result;
        }

        public Object handleResultSet(ResultSet rs) throws SQLException {
            while (rs.next()) {
                QryObj obj = new QryObj();
                obj.setOwnModule("arap");
                obj.setOriginTbl(rs.getString("qry_objtablename"));
                obj.setOriginFld(rs.getString("qry_objfieldname"));
                obj.setFldType(Integer.valueOf(rs.getInt("qry_objdatatype")));
                obj.setPk_bdinfo(rs.getString("bd_mdid"));
                obj.setBd_table(rs.getString("bd_tablename"));
                obj.setBd_pkField(rs.getString("bd_pkfield"));
                obj.setBd_codeField(rs.getString("bd_codefield"));
                obj.setBd_nameField(rs.getString("bd_namefield"));
                obj.setBillFieldName(rs.getString("billfieldname"));
                obj.setTallyFieldName(rs.getString("tallyfieldname"));
                obj.setBalFieldName(rs.getString("balfieldname"));
                this.result.add(obj);
            }
            return rs;
        }
    }
}


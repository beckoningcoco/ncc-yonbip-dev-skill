/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  nc.bs.arap.util.SqlUtils
 *  nc.bs.dao.BaseDAO
 *  nc.jdbc.framework.processor.BeanListProcessor
 *  nc.jdbc.framework.processor.ResultSetProcessor
 *  nc.pubitf.arap.receivable.IArapReceivableBillPubServiceForPS
 *  nc.vo.arap.pay.UnSettPayBillVO
 *  nc.vo.arap.pub.BillEnumCollection$BillSatus
 *  nc.vo.arap.receivable.UnSettReceivalbeBillVO
 *  nc.vo.fipub.exception.ExceptionHandler
 *  nc.vo.jcom.lang.StringUtil
 *  nc.vo.ml.NCLangRes4VoTransl
 *  nc.vo.pub.BusinessException
 *  nc.vo.pub.BusinessRuntimeException
 *  nc.vo.pub.lang.UFDouble
 *  nccloud.commons.lang.ArrayUtils
 */
package nc.impl.arap.receivable;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import nc.bs.arap.util.SqlUtils;
import nc.bs.dao.BaseDAO;
import nc.jdbc.framework.processor.BeanListProcessor;
import nc.jdbc.framework.processor.ResultSetProcessor;
import nc.pubitf.arap.receivable.IArapReceivableBillPubServiceForPS;
import nc.vo.arap.pay.UnSettPayBillVO;
import nc.vo.arap.pub.BillEnumCollection;
import nc.vo.arap.receivable.UnSettReceivalbeBillVO;
import nc.vo.fipub.exception.ExceptionHandler;
import nc.vo.jcom.lang.StringUtil;
import nc.vo.ml.NCLangRes4VoTransl;
import nc.vo.pub.BusinessException;
import nc.vo.pub.BusinessRuntimeException;
import nc.vo.pub.lang.UFDouble;
import nccloud.commons.lang.ArrayUtils;

public class ArapReceivableBillPubServiceForPSImpl
implements IArapReceivableBillPubServiceForPS {
    public Map<String, UFDouble> queryBalanceBySupplier(String pkOrg, String[] pkSuppliers) throws BusinessException {
        this.checkParams(pkOrg, pkSuppliers);
        StringBuffer sqlBuffer = new StringBuffer();
        sqlBuffer.append("select customer ,sum (money_de) from ar_recitem");
        sqlBuffer.append(" where ");
        sqlBuffer.append("pk_org = '").append(pkOrg).append("' and ");
        try {
            sqlBuffer.append(SqlUtils.getInStr((String)"customer", (String[])pkSuppliers, (boolean[])new boolean[]{true}));
        }
        catch (SQLException e) {
            throw new BusinessRuntimeException(e.getMessage());
        }
        sqlBuffer.append(" group by customer");
        final HashMap<String, UFDouble> ret = new HashMap<String, UFDouble>();
        new BaseDAO().executeQuery(sqlBuffer.toString(), new ResultSetProcessor(){
            private static final long serialVersionUID = 1L;

            public Object handleResultSet(ResultSet rs) throws SQLException {
                while (rs.next()) {
                    ret.put(rs.getString(1), new UFDouble(rs.getDouble(2)));
                }
                return null;
            }
        });
        return ret;
    }

    private void checkParams(String pkOrg, String[] pkSuppliers) throws BusinessException {
        if (StringUtil.isEmptyWithTrim((String)pkOrg) || ArrayUtils.isEmpty((Object[])pkSuppliers)) {
            ExceptionHandler.createAndThrowException((String)NCLangRes4VoTransl.getNCLangRes().getStrByID("2006rec_0", "02006rec-0041"));
        }
    }

    private String getWhereCluse(String pkOrg, String[] pkSuppliers, String customerOrsuppilier) {
        StringBuffer wherepart = new StringBuffer();
        wherepart.append(" where ");
        wherepart.append("pk_org = '").append(pkOrg).append("' and ");
        try {
            wherepart.append(SqlUtils.getInStr((String)customerOrsuppilier, (String[])pkSuppliers, (boolean[])new boolean[]{true}));
            wherepart.append(" and ");
            wherepart.append("billstatus").append(" >= ").append(BillEnumCollection.BillSatus.SAVE.VALUE);
        }
        catch (SQLException e) {
            throw new BusinessRuntimeException(e.getMessage());
        }
        return wherepart.toString();
    }

    public Map<String, List<UnSettReceivalbeBillVO>> queryDetailsBySupplier(String pkOrg, String[] pkSuppliers) throws BusinessException {
        this.checkParams(pkOrg, pkSuppliers);
        UnSettPayBillVO vo = new UnSettPayBillVO();
        StringBuffer selectCluse = new StringBuffer();
        String[] attributeNames = vo.getAttributeNames();
        selectCluse.append(this.getSelectCluse(attributeNames));
        selectCluse.append(" from ar_recitem");
        StringBuffer groupbyCluse = new StringBuffer();
        String sql = selectCluse.toString() + this.getWhereCluse(pkOrg, pkSuppliers, "customer") + groupbyCluse.toString();
        HashMap<String, List<UnSettReceivalbeBillVO>> ret = new HashMap<String, List<UnSettReceivalbeBillVO>>();
        List unsettreclist = (List)new BaseDAO().executeQuery(sql, (ResultSetProcessor)new BeanListProcessor(UnSettReceivalbeBillVO.class));
        if (unsettreclist != null && unsettreclist.size() > 0) {
            for (UnSettReceivalbeBillVO unsettrecVO : unsettreclist) {
                ArrayList<UnSettReceivalbeBillVO> list = (ArrayList<UnSettReceivalbeBillVO>)ret.get(unsettrecVO.getCustomer());
                if (list == null) {
                    list = new ArrayList<UnSettReceivalbeBillVO>();
                    ret.put(unsettrecVO.getCustomer(), list);
                }
                list.add(unsettrecVO);
            }
        }
        return ret;
    }

    private String getSelectCluse(String[] projects) {
        StringBuffer cluse = new StringBuffer();
        cluse.append("select ");
        for (String project : projects) {
            cluse.append(project).append(", ");
        }
        cluse.delete(cluse.lastIndexOf(", "), cluse.length());
        return cluse.toString();
    }
}


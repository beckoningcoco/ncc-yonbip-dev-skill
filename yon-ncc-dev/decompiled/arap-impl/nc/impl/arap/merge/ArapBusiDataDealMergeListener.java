/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  nc.bs.framework.common.InvocationInfoProxy
 *  nc.bs.logging.Logger
 *  nc.itf.arap.merge.ArapMergeListener
 *  nc.jdbc.framework.JdbcSession
 *  nc.jdbc.framework.PersistenceManager
 *  nc.jdbc.framework.SQLParameter
 *  nc.vo.arap.pub.ArapConstant
 *  nc.vo.pub.BusinessException
 */
package nc.impl.arap.merge;

import java.util.ArrayList;
import nc.bs.framework.common.InvocationInfoProxy;
import nc.bs.logging.Logger;
import nc.itf.arap.merge.ArapMergeListener;
import nc.jdbc.framework.JdbcSession;
import nc.jdbc.framework.PersistenceManager;
import nc.jdbc.framework.SQLParameter;
import nc.vo.arap.pub.ArapConstant;
import nc.vo.pub.BusinessException;

public class ArapBusiDataDealMergeListener
implements ArapMergeListener {
    public void doMerge(String sourcePk, String targetPk, String type) throws BusinessException {
        String mergeObj = null;
        if (ArapConstant.ARAP_MERGE_CUSTOMER.equals(type)) {
            mergeObj = " customer ";
        } else if (ArapConstant.ARAP_MERGE_SUPPLIER.equals(type)) {
            mergeObj = " supplier ";
        } else {
            return;
        }
        ArrayList<String> list = new ArrayList<String>();
        String busiDataSql = "update arap_busidata set " + mergeObj + " =?  where " + mergeObj + " =? ";
        list.add(busiDataSql);
        String verifySql = "update arap_verifydetail set" + mergeObj + " =?  where " + mergeObj + " =? ";
        list.add(verifySql);
        String debtransInSql = "update arap_debtstransfer set inobj =?  where inobj =? ";
        list.add(debtransInSql);
        String debtransOutSql = "update arap_debtstransfer set outobj =?  where outobj =? ";
        list.add(debtransOutSql);
        String agiotageSql = "update arap_agiotage_d set" + mergeObj + " =?  where " + mergeObj + " =? ";
        list.add(agiotageSql);
        if (ArapConstant.ARAP_MERGE_CUSTOMER.equals(type)) {
            String dimratioSql = "update arap_dimratio set dim1 =?  where dim1 =? ";
            String dimratioExSql = "update arap_dimextend set docvalue =?  where docvalue =? ";
            String bdprovisionSql = "update arap_bdprovision_d set dim1 =?  where dim1 =? ";
            list.add(dimratioSql);
            list.add(dimratioExSql);
            list.add(bdprovisionSql);
        }
        PersistenceManager pm = null;
        JdbcSession session = null;
        try {
            pm = PersistenceManager.getInstance((String)this.getDataSource());
            session = pm.getJdbcSession();
            SQLParameter par = new SQLParameter();
            par.addParam(targetPk);
            par.addParam(sourcePk);
            for (String sql : list) {
                session.addBatch(sql, par);
            }
            session.executeBatch();
        }
        catch (Exception e) {
            Logger.error((Object)e.getMessage(), (Throwable)e);
            throw new BusinessException(e.getMessage(), (Throwable)e);
        }
        finally {
            if (session != null) {
                session.closeAll();
            }
            if (pm != null) {
                pm.release();
            }
        }
    }

    private String getDataSource() {
        return InvocationInfoProxy.getInstance().getUserDataSource();
    }
}


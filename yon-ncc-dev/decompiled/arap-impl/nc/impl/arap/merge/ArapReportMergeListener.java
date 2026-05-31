/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  nc.bs.framework.common.InvocationInfoProxy
 *  nc.bs.framework.common.NCLocator
 *  nc.bs.logging.Logger
 *  nc.itf.arap.merge.ArapMergeListener
 *  nc.itf.arap.tally.IBalanceRebuild
 *  nc.jdbc.framework.JdbcSession
 *  nc.jdbc.framework.PersistenceManager
 *  nc.vo.arap.pub.ArapConstant
 *  nc.vo.arap.tally.BalanceRebuildVO
 *  nc.vo.pub.BusinessException
 */
package nc.impl.arap.merge;

import nc.bs.framework.common.InvocationInfoProxy;
import nc.bs.framework.common.NCLocator;
import nc.bs.logging.Logger;
import nc.itf.arap.merge.ArapMergeListener;
import nc.itf.arap.tally.IBalanceRebuild;
import nc.jdbc.framework.JdbcSession;
import nc.jdbc.framework.PersistenceManager;
import nc.vo.arap.pub.ArapConstant;
import nc.vo.arap.tally.BalanceRebuildVO;
import nc.vo.pub.BusinessException;

public class ArapReportMergeListener
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
        StringBuffer sqlBufferTally = new StringBuffer();
        sqlBufferTally.append(" update arap_tally set ");
        sqlBufferTally.append(mergeObj).append(" = '").append(targetPk).append("' ");
        sqlBufferTally.append(" where ");
        sqlBufferTally.append(mergeObj).append(" = '").append(sourcePk).append("' ");
        StringBuffer sqlBufferBalance = new StringBuffer();
        sqlBufferBalance.append(" update arap_balance set ");
        sqlBufferBalance.append(mergeObj).append(" = '").append(targetPk).append("' ");
        sqlBufferBalance.append(" where ");
        sqlBufferBalance.append(mergeObj).append(" = '").append(sourcePk).append("' ");
        PersistenceManager pm = null;
        JdbcSession session = null;
        try {
            pm = PersistenceManager.getInstance((String)this.getDataSource());
            session = pm.getJdbcSession();
            session.addBatch(sqlBufferTally.toString());
            session.addBatch(sqlBufferBalance.toString());
            session.executeBatch();
            ((IBalanceRebuild)NCLocator.getInstance().lookup(IBalanceRebuild.class)).rebuild(this.getBalanceRebuildVO(sourcePk, targetPk, type));
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

    private BalanceRebuildVO getBalanceRebuildVO(String sourcePk, String targetPk, String type) {
        BalanceRebuildVO rebuildVO = new BalanceRebuildVO();
        if (ArapConstant.ARAP_MERGE_CUSTOMER.equals(type)) {
            rebuildVO.setSys_flag(3);
        } else if (ArapConstant.ARAP_MERGE_SUPPLIER.equals(type)) {
            rebuildVO.setSys_flag(4);
        }
        rebuildVO.setPk_group(InvocationInfoProxy.getInstance().getGroupId());
        rebuildVO.setCus_sups(new String[]{sourcePk, targetPk});
        return rebuildVO;
    }

    private String getDataSource() {
        return InvocationInfoProxy.getInstance().getUserDataSource();
    }
}


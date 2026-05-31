/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  nc.bs.arap.agiotage.AgiotageTaskUtils
 *  nc.bs.arap.util.ArapBillType2TableMapping
 *  nc.bs.sec.esapi.NCESAPI
 *  nc.bs.uap.lock.PKLock
 *  nc.bs.uif2.LockFailedException
 *  nc.itf.arap.prv.IArapUpdateBillService
 *  nc.jdbc.framework.PersistenceManager
 *  nc.vo.arap.agiotage.ArapBusiDataVO
 *  nc.vo.fipub.exception.ExceptionHandler
 *  nc.vo.pub.BusinessException
 *  nc.vo.pub.lang.UFDouble
 */
package nc.impl.arap.prv;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.HashSet;
import nc.bs.arap.agiotage.AgiotageTaskUtils;
import nc.bs.arap.util.ArapBillType2TableMapping;
import nc.bs.sec.esapi.NCESAPI;
import nc.bs.uap.lock.PKLock;
import nc.bs.uif2.LockFailedException;
import nc.itf.arap.prv.IArapUpdateBillService;
import nc.jdbc.framework.PersistenceManager;
import nc.vo.arap.agiotage.ArapBusiDataVO;
import nc.vo.fipub.exception.ExceptionHandler;
import nc.vo.pub.BusinessException;
import nc.vo.pub.lang.UFDouble;

public class ArapUpdateBillServiceImpl
implements IArapUpdateBillService {
    public void updateBillMoney(ArapBusiDataVO[] vos, Boolean isUpdateOccp, String pk_billtype) throws BusinessException {
        try (Connection conn = PersistenceManager.getInstance().getJdbcSession().getConnection();){
            this.dynamicBillLock(vos);
            this.updateBillsTs(vos, this.getTableNameAndPkField(vos[0])[0], this.getTableNameAndPkField(vos[0])[1], conn);
            if (isUpdateOccp != null && !isUpdateOccp.booleanValue()) {
                this.doBusi(vos, conn, this.getTableNameAndPkField(vos[0])[0], this.getTableNameAndPkField(vos[0])[1], moneyfield, this.getMoneyFields());
                this.doBusi(vos, conn, "arap_termitem", "pk_termitem", moneyfield, this.getMoneyFields());
            } else {
                this.doBusi(vos, conn, this.getTableNameAndPkField(vos[0])[0], this.getTableNameAndPkField(vos[0])[1], moneyfield_occu, this.getMoneyFields_Occu());
                this.doBusi(vos, conn, "arap_termitem", "pk_termitem", moneyfield_occu, this.getMoneyFields_Occu());
            }
        }
        catch (Exception e) {
            throw ExceptionHandler.handleException(this.getClass(), (Exception)e);
        }
    }

    private void doBusi(ArapBusiDataVO[] vos, Connection conn, String table, String pkfield, String[] moneyFields, String[] moneyFields2) throws BusinessException {
        StringBuffer sql = new StringBuffer(" update " + table + " set ");
        for (String field : moneyFields) {
            if (sql.charAt(sql.length() - 1) == '?') {
                sql.append(",");
            }
            sql.append(field);
            sql.append("=");
            sql.append(field);
            sql.append("-?");
        }
        sql.append(" where ");
        sql.append(pkfield);
        sql.append("=?");
        try (PreparedStatement updatestmt = conn.prepareStatement(sql.toString());){
            for (ArapBusiDataVO item : vos) {
                int i = 1;
                for (String field : moneyFields2) {
                    updatestmt.setDouble(i++, ((UFDouble)item.getAttributeValue(field)).doubleValue());
                }
                if (pkfield.equals("pk_termitem") || pkfield.equals("pk_busidata")) {
                    updatestmt.setString(i, NCESAPI.sqlEncode((String)item.getAttributeValue(pkfield).toString()));
                } else {
                    updatestmt.setString(i, NCESAPI.sqlEncode((String)item.getPk_item()));
                }
                updatestmt.addBatch();
            }
            updatestmt.executeBatch();
        }
        catch (SQLException e) {
            throw new BusinessException((Throwable)e);
        }
    }

    public String dynamicBillLock(ArapBusiDataVO[] vos) throws BusinessException {
        if (AgiotageTaskUtils.isDistubuteCal()) {
            return null;
        }
        HashSet<String> pkSet = new HashSet<String>();
        for (ArapBusiDataVO vo : vos) {
            pkSet.add(vo.getPk_bill());
        }
        String[] pks = pkSet.toArray(new String[0]);
        if (!PKLock.getInstance().addBatchDynamicLock(pks)) {
            throw new LockFailedException(pks);
        }
        return null;
    }

    private void updateBillsTs(ArapBusiDataVO[] vos, String table, String tablePK, Connection conn) throws BusinessException {
        String parentpk = null;
        String parentTable = table.replace("item", "bill");
        String parentPK = tablePK.replace("item", "bill");
        String updateSql = " update " + parentTable + " set dr=dr  where " + parentPK + " =? ";
        try (PreparedStatement pantupdatestmt = conn.prepareStatement(updateSql);){
            for (ArapBusiDataVO vo : vos) {
                parentpk = table.equals("arap_busidata") ? vo.getPk_busidata() : vo.getPk_bill();
                pantupdatestmt.setString(1, parentpk);
                pantupdatestmt.addBatch();
            }
        }
        catch (SQLException e) {
            throw new BusinessException((Throwable)e);
        }
    }

    public String[] getTableNameAndPkField(ArapBusiDataVO vo) {
        String[] tables = new String[]{"ar_recitem", "ap_payableitem", "ar_gatheritem", "ap_payitem", "ar_estirecitem", "ap_estipayableitem"};
        String[] pk_items = new String[]{ArapBillType2TableMapping.getChildrenTablePK((String)"F0"), ArapBillType2TableMapping.getChildrenTablePK((String)"F1"), ArapBillType2TableMapping.getChildrenTablePK((String)"F2"), ArapBillType2TableMapping.getChildrenTablePK((String)"F3"), ArapBillType2TableMapping.getChildrenTablePK((String)"23E0"), ArapBillType2TableMapping.getChildrenTablePK((String)"23E1")};
        String[] billClass = new String[]{"F0", "F1", "F2", "F3", "23E0", "23E1"};
        for (int i = 0; i < billClass.length; ++i) {
            if (!billClass[i].equals(vo.getPk_billtype())) continue;
            return new String[]{tables[i], pk_items[i]};
        }
        return null;
    }

    private String[] getMoneyFields() {
        return new String[]{"money_bal", "local_money_bal", "quantity_bal", "global_money_bal", "group_money_bal"};
    }

    private String[] getMoneyFields_Occu() {
        return new String[]{"money_bal", "local_money_bal", "quantity_bal", "global_money_bal", "group_money_bal", "occupationmny"};
    }
}


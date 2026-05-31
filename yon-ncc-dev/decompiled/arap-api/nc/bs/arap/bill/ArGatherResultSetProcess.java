/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  nc.jdbc.framework.processor.ResultSetProcessor
 *  nc.vo.pub.lang.UFDate
 *  nc.vo.pub.lang.UFDateTime
 *  nc.vo.pub.lang.UFDouble
 */
package nc.bs.arap.bill;

import java.io.Serializable;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import nc.jdbc.framework.processor.ResultSetProcessor;
import nc.vo.arap.basebill.PeriodpaymentParaVO;
import nc.vo.arap.basebill.PeriodpaymentReturnVO;
import nc.vo.pub.lang.UFDate;
import nc.vo.pub.lang.UFDateTime;
import nc.vo.pub.lang.UFDouble;

public class ArGatherResultSetProcess
implements ResultSetProcessor,
Serializable {
    private static final long serialVersionUID = 1182598966284725127L;
    private PeriodpaymentParaVO para;

    public PeriodpaymentParaVO getPara() {
        return this.para;
    }

    public void setPara(PeriodpaymentParaVO para) {
        this.para = para;
    }

    public ArGatherResultSetProcess() {
    }

    public ArGatherResultSetProcess(PeriodpaymentParaVO para2) {
        this.setPara(para2);
    }

    public Object handleResultSet(ResultSet rs) throws SQLException {
        ArrayList<PeriodpaymentReturnVO> al = new ArrayList<PeriodpaymentReturnVO>();
        int col = rs.getMetaData().getColumnCount();
        while (rs.next()) {
            List<String> combineKey;
            int pos = 1;
            UFDouble mny = new UFDouble(rs.getDouble(pos++));
            String pk_currtype = rs.getString(pos++);
            UFDate date = new UFDate(new UFDateTime(rs.getString(pos++)).getMillis());
            if (col + 1 == pos) {
                List<String> combineKey2;
                PeriodpaymentReturnVO value = new PeriodpaymentReturnVO(pk_currtype, mny, date);
                List<String> list = combineKey2 = this.para == null ? null : this.para.getCombineKey();
                if (combineKey2 != null) {
                    for (int j = 0; j < combineKey2.size(); ++j) {
                        value.setCombineValue(j, rs.getString(pos++));
                    }
                }
                al.add(value);
                continue;
            }
            String customer = rs.getString(pos++);
            String billtype = rs.getString(pos++);
            String billno = rs.getString(pos++);
            UFDate billdate = new UFDate(new UFDateTime(rs.getString(pos++)).getMillis());
            Integer rowno = Integer.parseInt(rs.getString(pos++));
            String ordertype = rs.getString(pos++);
            String transtype = rs.getString(pos++);
            String productline = rs.getString(pos++);
            String ordercubasdoc = rs.getString(pos++);
            String pkitem = rs.getString(pos++);
            String pk_bill = rs.getString(pos++);
            PeriodpaymentReturnVO value = new PeriodpaymentReturnVO(pk_currtype, mny, date);
            value.setCustomer(customer);
            value.setBilltype(billtype);
            value.setBillno(billno);
            value.setBilldate(billdate);
            value.setRowno(rowno);
            value.setVtrancode(ordertype);
            value.setChanneltype(transtype);
            value.setProtectline(productline);
            value.setPk_item(pkitem);
            value.setPk_bill(pk_bill);
            List<String> list = combineKey = this.para == null ? null : this.para.getCombineKey();
            if (combineKey != null) {
                for (int j = 0; j < combineKey.size(); ++j) {
                    value.setCombineValue(j, rs.getString(pos++));
                }
            }
            al.add(value);
        }
        return al;
    }
}


/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  nc.bs.arap.util.SqlUtils
 *  nc.bs.pf.pub.PfDataCache
 *  nc.bs.pub.pa.PreAlertContext
 *  nc.vo.arap.billconfer.BcMapVO
 *  nc.vo.arap.gathering.GatheringBillItemVO
 *  nc.vo.arap.gathering.GatheringBillVO
 *  nc.vo.arap.pay.PayBillItemVO
 *  nc.vo.arap.pay.PayBillVO
 *  nc.vo.arap.payable.PayableBillItemVO
 *  nc.vo.arap.payable.PayableBillVO
 *  nc.vo.arap.pub.BillEnumCollection$ApproveStatus
 *  nc.vo.arap.pub.BillEnumCollection$BillSatus
 *  nc.vo.arap.pub.BillEnumCollection$ObjType
 *  nc.vo.arap.receivable.ReceivableBillItemVO
 *  nc.vo.arap.receivable.ReceivableBillVO
 *  nc.vo.pub.BusinessException
 *  nc.vo.pub.billtype.BilltypeVO
 *  nc.vo.pub.lang.UFDate
 *  nccloud.commons.lang.ArrayUtils
 */
package nc.impl.arap.prealarm;

import java.sql.SQLException;
import java.util.GregorianCalendar;
import java.util.HashSet;
import java.util.LinkedHashMap;
import nc.bs.arap.util.SqlUtils;
import nc.bs.pf.pub.PfDataCache;
import nc.bs.pub.pa.PreAlertContext;
import nc.impl.arap.prealarm.ArapBasePreAlarm;
import nc.impl.arap.prealarm.ArapPreAlarmEnumCollection;
import nc.vo.arap.billconfer.BcMapVO;
import nc.vo.arap.gathering.GatheringBillItemVO;
import nc.vo.arap.gathering.GatheringBillVO;
import nc.vo.arap.pay.PayBillItemVO;
import nc.vo.arap.pay.PayBillVO;
import nc.vo.arap.payable.PayableBillItemVO;
import nc.vo.arap.payable.PayableBillVO;
import nc.vo.arap.pub.BillEnumCollection;
import nc.vo.arap.receivable.ReceivableBillItemVO;
import nc.vo.arap.receivable.ReceivableBillVO;
import nc.vo.pub.BusinessException;
import nc.vo.pub.billtype.BilltypeVO;
import nc.vo.pub.lang.UFDate;
import nccloud.commons.lang.ArrayUtils;

public class BConferPreAlarm
extends ArapBasePreAlarm {
    private ArapPreAlarmEnumCollection.AlarmSystem alarmsystem = null;

    @Override
    protected String getBillType() {
        return null;
    }

    @Override
    public String getAlarmResultSql() throws SQLException, BusinessException {
        StringBuffer sqlBuffer = new StringBuffer();
        int status = this.billstatus == null ? 0 : Integer.valueOf(this.billstatus);
        sqlBuffer.append(this.getSelectPart("ys", BillEnumCollection.ObjType.CUSTOMER)).append(this.getWherePart("ys", status));
        sqlBuffer.append(this.union);
        sqlBuffer.append(this.getSelectPart("sk", BillEnumCollection.ObjType.CUSTOMER)).append(this.getWherePart("sk", status));
        sqlBuffer.append(this.union);
        sqlBuffer.append(this.getSelectPart("yf", BillEnumCollection.ObjType.SUPPLIER)).append(this.getWherePart("yf", status));
        sqlBuffer.append(this.union);
        sqlBuffer.append(this.getSelectPart("fk", BillEnumCollection.ObjType.SUPPLIER)).append(this.getWherePart("fk", status));
        return sqlBuffer.toString();
    }

    @Override
    public void init(PreAlertContext context) throws BusinessException {
        super.init(context);
        LinkedHashMap keyMap = context.getKeyMap();
        Object obj = keyMap.get("syscode");
        this.alarmsystem = obj == null || obj.toString().length() == 0 ? ArapPreAlarmEnumCollection.AlarmSystem.ALL : ArapPreAlarmEnumCollection.AlarmSystem.valueOf(Integer.parseInt(obj.toString()));
    }

    private String getSelectPart(String billclass, BillEnumCollection.ObjType obj) {
        StringBuffer select = new StringBuffer();
        select.append(" select ");
        select.append(" '" + billclass + "' ").append("billclass");
        select.append(", ");
        if (obj == BillEnumCollection.ObjType.SUPPLIER) {
            select.append("fb.").append("supplier").append(", ");
        } else {
            select.append("fb.").append("customer").append(", ");
        }
        select.append("fb.").append("pk_deptid").append(", ");
        select.append("fb.").append("pk_psndoc").append(", ");
        select.append("fb.").append("billno").append(", ");
        select.append("fb.").append("billdate").append(", ");
        select.append("fb.").append("scomment").append(", ");
        select.append("fb.").append("pk_currtype").append(", ");
        select.append("fb.").append("invoiceno").append(", ");
        select.append("fb.").append(this.getMoneyField(billclass)).append(", ");
        select.append("fb.").append(this.getLclMnyField(billclass)).append(", ");
        select.append("fb.").append("money_bal").append(", ");
        select.append("zb.").append("pk_org").append(", ");
        select.append("zb.").append("pk_billtype").append(", ");
        select.append("fb.").append("local_money_bal");
        select.append(" from ");
        select.append(this.getBillHeadTable(billclass)).append(" zb ");
        select.append(" inner join ").append(this.getBillBodyTable(billclass)).append(" fb ");
        select.append(" on zb.").append(this.getBillPKFieldName(billclass)).append(" = fb.").append(this.getBillPKFieldName(billclass));
        select.append(" where exists");
        select.append("(select null from ").append(BcMapVO.getDefaultTableName());
        select.append(" where ").append("dest_billid").append(" = fb.").append(this.getBillPKFieldName(billclass));
        select.append(this.and).append("dest_billtype = fb.pk_billtype");
        select.append(this.and).append(" dr = 0)");
        return select.toString();
    }

    private String getWherePart(String billclass, int billstatus) throws SQLException, BusinessException {
        if (!"ys".equals(billclass) && !"sk".equals(billclass) && !"zs".equals(billclass) && ArapPreAlarmEnumCollection.AlarmSystem.REC.equals((Object)this.alarmsystem)) {
            return " and 1 = 2 ";
        }
        if (!"yf".equals(billclass) && !"fk".equals(billclass) && !"zf".equals(billclass) && ArapPreAlarmEnumCollection.AlarmSystem.PAY.equals((Object)this.alarmsystem)) {
            return " and 1 = 2 ";
        }
        StringBuffer wherepart = new StringBuffer();
        HashSet<String> billtypes = new HashSet<String>();
        if (!ArrayUtils.isEmpty((Object[])this.tradetype)) {
            for (String bt : this.tradetype) {
                String pk_billtype;
                BilltypeVO btvo = PfDataCache.getBillType((String)bt);
                String string = pk_billtype = btvo == null ? null : btvo.getParentbilltype();
                if ("ys".equals(billclass) && "F0".equals(pk_billtype)) {
                    billtypes.add(bt);
                    continue;
                }
                if ("yf".equals(billclass) && "F1".equals(pk_billtype)) {
                    billtypes.add(bt);
                    continue;
                }
                if ("sk".equals(billclass) && "F2".equals(pk_billtype)) {
                    billtypes.add(bt);
                    continue;
                }
                billtypes.add(bt);
            }
        }
        if (billtypes.size() > 0) {
            wherepart.append(this.and).append("fb.").append(SqlUtils.getInStr((String)"pk_tradetype", (String[])billtypes.toArray(new String[0])));
        }
        if (!ArrayUtils.isEmpty((Object[])this.currtype)) {
            wherepart.append(this.and).append(SqlUtils.getInStr((String)"fb.pk_currtype", (String[])this.currtype));
        }
        String billStatusCond = " 1 = 1 ";
        if (billstatus == ArapPreAlarmEnumCollection.BCBillStatus.UNCOMFORM.code) {
            billStatusCond = "zb.billstatus = " + BillEnumCollection.BillSatus.UNCOMFIRM.VALUE;
        } else if (billstatus == ArapPreAlarmEnumCollection.BCBillStatus.UNAUDIT.code) {
            billStatusCond = "zb.billstatus in (" + BillEnumCollection.BillSatus.SAVE.VALUE + ", " + BillEnumCollection.BillSatus.TEMPEORARY.VALUE + ") ";
        } else if (billstatus == ArapPreAlarmEnumCollection.BCBillStatus.AUDITINDG.code) {
            billStatusCond = "zb.approvestatus = " + BillEnumCollection.ApproveStatus.GOINGON.VALUE;
        } else if (billstatus == ArapPreAlarmEnumCollection.BCBillStatus.AUDIT.code) {
            billStatusCond = "zb.billstatus in(" + BillEnumCollection.BillSatus.AUDIT.VALUE + ", " + BillEnumCollection.BillSatus.SIGN.VALUE + ") ";
        } else if (billstatus == ArapPreAlarmEnumCollection.BCBillStatus.SIGN.code) {
            billStatusCond = "zb.billstatus = " + BillEnumCollection.BillSatus.SIGN.VALUE;
        }
        wherepart.append(this.and).append(billStatusCond);
        if (!ArrayUtils.isEmpty((Object[])this.pk_org)) {
            wherepart.append(this.and).append("zb.").append(SqlUtils.getInStr((String)"pk_org", (String[])this.pk_org, (boolean[])new boolean[]{false}));
            wherepart.append(this.and).append("fb.").append(SqlUtils.getInStr((String)"pk_org", (String[])this.pk_org, (boolean[])new boolean[]{false}));
        }
        wherepart.append(this.and).append("zb.").append("pk_group").append(" = '").append(this.pk_group).append("' ");
        wherepart.append(this.and).append("fb.").append("pk_group").append(" = '").append(this.pk_group).append("' ");
        wherepart.append(this.and).append(this.getAlarmSql());
        if (this.moneystart != null) {
            wherepart.append(this.and).append("fb.").append(this.getMoneyField(billclass)).append(" >= ").append(this.moneystart);
        }
        if (this.moneyend != null) {
            wherepart.append(this.and).append("fb.").append(this.getMoneyField(billclass)).append(" <= ").append(this.moneyend);
        }
        return wherepart.toString();
    }

    @Override
    protected String getAlarmSql() {
        if (this.alarmdays == null) {
            return "( 1 = 1) ";
        }
        GregorianCalendar calendar = new GregorianCalendar();
        UFDate currDate = new UFDate(new UFDate(calendar.getTimeInMillis()).toStdString(), false);
        UFDate alarmDate = currDate.getDateBefore(this.alarmdays.intValue());
        return "fb.billdate <= '" + alarmDate.toString() + "' ";
    }

    private String getBillHeadTable(String billclass) {
        String table = null;
        table = "ys".equals(billclass) ? ReceivableBillVO.getDefaultTable() : ("sk".equals(billclass) ? new GatheringBillVO().getTableName() : ("yf".equals(billclass) ? PayableBillVO.getDefaultTable() : PayBillVO.getDefaultTable()));
        return table;
    }

    private String getBillBodyTable(String billclass) {
        String table = null;
        table = "ys".equals(billclass) ? ReceivableBillItemVO.getDefaultTable() : ("sk".equals(billclass) ? new GatheringBillItemVO().getTableName() : ("yf".equals(billclass) ? PayableBillItemVO.getDefaultTable() : PayBillItemVO.getDefaultTable()));
        return table;
    }

    private String getMoneyField(String billclass) {
        String mnyfld = null;
        mnyfld = "ys".equals(billclass) || "fk".equals(billclass) ? "money_de" : "money_cr";
        return mnyfld;
    }

    private String getLclMnyField(String billclass) {
        String mnyfld = null;
        mnyfld = "ys".equals(billclass) || "fk".equals(billclass) ? "local_money_de" : "local_money_cr";
        return mnyfld;
    }

    private String getBillPKFieldName(String billclass) {
        String pk = null;
        pk = "ys".equals(billclass) ? "pk_recbill" : ("sk".equals(billclass) ? "pk_gatherbill" : ("yf".equals(billclass) ? "pk_payablebill" : "pk_paybill"));
        return pk;
    }
}


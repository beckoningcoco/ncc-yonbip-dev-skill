/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  nc.vo.pub.lang.UFDate
 *  nc.vo.pub.lang.UFDouble
 */
package nc.vo.arap.basebill;

import java.io.Serializable;
import java.util.Arrays;
import java.util.List;
import nc.vo.pub.lang.UFDate;
import nc.vo.pub.lang.UFDouble;

public class PeriodpaymentReturnVO
implements Serializable {
    public static final int COMBINE_COUNT = 4;
    public static final String NULL = "~";
    private static final long serialVersionUID = -697268313526018043L;
    private String pk_currtype = null;
    private UFDouble money = null;
    private UFDate date = null;
    private Integer day = 0;
    private Integer innerdays = 0;
    private List<String> combineValues = Arrays.asList(new String[4]);
    private String customer = null;
    private String billtype = null;
    private String billno = null;
    private UFDate billdate = null;
    private Integer rowno = 0;
    private String vtrancode = null;
    private String channeltype = null;
    private String protectline = null;
    private String pk_item;
    private String pk_bill;

    public String getCustomer() {
        return this.customer;
    }

    public void setCustomer(String customer) {
        this.customer = customer;
    }

    public String getBilltype() {
        return this.billtype;
    }

    public void setBilltype(String billtype) {
        this.billtype = billtype;
    }

    public String getBillno() {
        return this.billno;
    }

    public void setBillno(String billno) {
        this.billno = billno;
    }

    public UFDate getBilldate() {
        return this.billdate;
    }

    public void setBilldate(UFDate billdate) {
        this.billdate = billdate;
    }

    public String getVtrancode() {
        return this.vtrancode;
    }

    public void setVtrancode(String vtrancode) {
        this.vtrancode = vtrancode;
    }

    public String getChanneltype() {
        return this.channeltype;
    }

    public void setChanneltype(String channeltype) {
        this.channeltype = channeltype;
    }

    public void setCombineValue(int index, String value) {
        this.combineValues.set(index, value);
    }

    public String getCombineValue(int index) {
        return this.combineValues.get(index);
    }

    public PeriodpaymentReturnVO() {
    }

    public PeriodpaymentReturnVO(String currtype, UFDouble mny, UFDate days) {
        this.setCurrtype(currtype);
        this.setMoney(mny);
        this.setDate(days);
    }

    public void setCurrtype(String value) {
        this.pk_currtype = value;
    }

    public void setMoney(UFDouble value) {
        this.money = value;
    }

    public String getCurrtype() {
        return this.pk_currtype;
    }

    public UFDouble getMoney() {
        return this.money;
    }

    public int getDay() {
        return this.day;
    }

    public void setDay(Integer value) {
        this.day = value;
    }

    public UFDate getDate() {
        return this.date;
    }

    public void setDate(UFDate value) {
        this.date = value;
    }

    public int getInnerdays() {
        return this.innerdays;
    }

    public void setInnerdays(Integer innerdays) {
        this.innerdays = innerdays;
    }

    public Integer getRowno() {
        return this.rowno;
    }

    public void setRowno(Integer rowno) {
        this.rowno = rowno;
    }

    public String getProtectline() {
        return this.protectline;
    }

    public void setProtectline(String protectline) {
        this.protectline = protectline;
    }

    public String getPk_item() {
        return this.pk_item;
    }

    public void setPk_item(String pk_item) {
        this.pk_item = pk_item;
    }

    public String getPk_bill() {
        return this.pk_bill;
    }

    public void setPk_bill(String pk_bill) {
        this.pk_bill = pk_bill;
    }
}


/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  nc.vo.pub.SuperVO
 */
package nc.vo.arap.ntb;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import nc.vo.pub.SuperVO;

public class ArapQueryVO
extends SuperVO {
    public static String BILLSTATUS_SAVE = "-1";
    public static String BILLSTATUS_EFFECT = "1";
    public static String BILLSTATUS_ALL = "0";
    private String moneyattr_fld = null;
    private String pk_group = null;
    private String[] pk_org = null;
    private String pk_currency = null;
    private String billstatus = BILLSTATUS_EFFECT;
    private String begdate = null;
    private String enddate = null;
    private String bill_code = null;
    private String[] pk_tradetypes = null;
    private String[] busiAttrs = null;
    private String[] pkdim = null;
    private String datetype = null;
    private boolean iskjqj = false;
    private boolean isIncludeInit = false;
    private int curr_type = 0;
    private String orgatt_fld = null;
    private Map<String, List<String>> queryCondMap = new HashMap<String, List<String>>();
    private Map<String, List<String>> queryHeadCondMap = new HashMap<String, List<String>>();

    public Map<String, List<String>> getQueryHeadCondMap() {
        return this.queryHeadCondMap;
    }

    public void setQueryHeadCondMap(Map<String, List<String>> queryHeadCondMap) {
        this.queryHeadCondMap = queryHeadCondMap;
    }

    public Map<String, List<String>> getQueryCondMap() {
        return this.queryCondMap;
    }

    public String getPk_group() {
        return this.pk_group;
    }

    public void setPk_group(String pkGroup) {
        this.pk_group = pkGroup;
    }

    public boolean isIskjqj() {
        return this.iskjqj;
    }

    public void setIskjqj(boolean iskjqj) {
        this.iskjqj = iskjqj;
    }

    public String getBegdate() {
        return this.begdate;
    }

    public void setBegdate(String begdate) {
        this.begdate = begdate;
    }

    public String getEnddate() {
        return this.enddate;
    }

    public void setEnddate(String enddate) {
        this.enddate = enddate;
    }

    public String getBill_code() {
        return this.bill_code;
    }

    public void setBill_code(String billCode) {
        this.bill_code = billCode;
    }

    public String[] getPk_tradetypes() {
        return this.pk_tradetypes;
    }

    public void setPk_tradetypes(String[] pkTradetypes) {
        this.pk_tradetypes = pkTradetypes;
    }

    public String[] getBusiAttrs() {
        return this.busiAttrs;
    }

    public void setBusiAttrs(String[] busiAttrs) {
        this.busiAttrs = busiAttrs;
    }

    public String[] getPkdim() {
        return this.pkdim;
    }

    public void setPkdim(String[] pkdim) {
        this.pkdim = pkdim;
    }

    public int getCurr_type() {
        return this.curr_type;
    }

    public void setCurr_type(int currType) {
        this.curr_type = currType;
    }

    public String getDatetype() {
        return this.datetype;
    }

    public void setDatetype(String datetype) {
        this.datetype = datetype;
    }

    public String getBillstatus() {
        return this.billstatus;
    }

    public void setBillstatus(String billstatus) {
        this.billstatus = billstatus;
    }

    public boolean isIncludeInit() {
        return this.isIncludeInit;
    }

    public void setIncludeInit(boolean isIncludeInit) {
        this.isIncludeInit = isIncludeInit;
    }

    public String getPk_currency() {
        return this.pk_currency;
    }

    public void setPk_currency(String pkCurrency) {
        this.pk_currency = pkCurrency;
    }

    public String[] getPk_org() {
        return this.pk_org;
    }

    public void setPk_org(String[] pkOrg) {
        this.pk_org = pkOrg;
    }

    public void setOrgatt_fld(String att_fld) {
        this.orgatt_fld = att_fld;
    }

    public String getOrgatt_fld() {
        return this.orgatt_fld;
    }

    public String getMoneyattr_fld() {
        return this.moneyattr_fld;
    }

    public void setMoneyattr_fld(String moneyattr_fld) {
        this.moneyattr_fld = moneyattr_fld;
    }

    public Object clone() {
        Object o = null;
        try {
            o = super.clone();
        }
        catch (Exception e) {
            throw new RuntimeException("clone not supported!");
        }
        ArapQueryVO hZYE = (ArapQueryVO)((Object)o);
        return hZYE;
    }
}


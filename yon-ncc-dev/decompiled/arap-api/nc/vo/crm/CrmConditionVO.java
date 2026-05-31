/*
 * Decompiled with CFR 0.152.
 */
package nc.vo.crm;

import java.io.Serializable;

public class CrmConditionVO
implements Serializable {
    private static final long serialVersionUID = 1L;
    private String customer;
    private String[] pk_org;
    private int startNum;
    private int endNum;
    private String startDate;
    private String endDate;

    public String getCustomer() {
        return this.customer;
    }

    public void setCustomer(String customer) {
        this.customer = customer;
    }

    public String[] getPk_org() {
        return this.pk_org;
    }

    public void setPk_org(String[] pkOrg) {
        this.pk_org = pkOrg;
    }

    public int getStartNum() {
        return this.startNum;
    }

    public void setStartNum(int startNum) {
        this.startNum = startNum;
    }

    public int getEndNum() {
        return this.endNum;
    }

    public void setEndNum(int endNum) {
        this.endNum = endNum;
    }

    public String getStartDate() {
        return this.startDate;
    }

    public void setStartDate(String startDate) {
        this.startDate = startDate;
    }

    public String getEndDate() {
        return this.endDate;
    }

    public void setEndDate(String endDate) {
        this.endDate = endDate;
    }
}


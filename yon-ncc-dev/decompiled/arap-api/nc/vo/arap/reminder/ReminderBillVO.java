/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  nc.vo.pub.SuperVO
 *  nc.vo.pub.lang.UFDateTime
 *  nc.vo.pub.lang.UFDouble
 */
package nc.vo.arap.reminder;

import nc.vo.pub.SuperVO;
import nc.vo.pub.lang.UFDateTime;
import nc.vo.pub.lang.UFDouble;

public class ReminderBillVO
extends SuperVO {
    private static final long serialVersionUID = 1L;
    private String reminder_customer;
    private String reminder_dept;
    private String reminder_psndoc;
    private String pk_currtype;
    private UFDouble ybye;
    private String pk_reminder;
    private Integer dr = 0;
    private UFDateTime ts;
    private String notice;
    private UFDouble expiredmny;
    private UFDouble unexpiremny;
    public static final String REMINDER_CUSTOMER = "reminder_customer";
    public static final String REMINDER_DEPT = "reminder_dept";
    public static final String REMINDER_PSNDOC = "reminder_psndoc";
    public static final String PK_CURRTYPE = "pk_currtype";
    public static final String YBYE = "ybye";
    public static final String PK_REMINDER = "pk_reminder";
    public static final String CUSTOMER = "customer";
    public static final String PK_DEPTID = "pk_deptid";
    public static final String PK_PSNDOC = "pk_psndoc";
    public static final String NOTICE = "notice";
    public static final String EXPIREDMNY = "expiredmny";
    public static final String UNEXPIREMNY = "unexpiremny";

    public String getNotice() {
        return this.notice;
    }

    public void setNotice(String notice) {
        this.notice = notice;
    }

    public String getReminder_customer() {
        return this.reminder_customer;
    }

    public void setReminder_customer(String reminderCustomer) {
        this.reminder_customer = reminderCustomer;
    }

    public String getReminder_dept() {
        return this.reminder_dept;
    }

    public void setReminder_dept(String reminderDept) {
        this.reminder_dept = reminderDept;
    }

    public String getReminder_psndoc() {
        return this.reminder_psndoc;
    }

    public void setReminder_psndoc(String reminderPsndoc) {
        this.reminder_psndoc = reminderPsndoc;
    }

    public String getPk_currtype() {
        return this.pk_currtype;
    }

    public void setPk_currtype(String newPk_currtype) {
        this.pk_currtype = newPk_currtype;
    }

    public UFDouble getYbye() {
        return this.ybye;
    }

    public void setYbye(UFDouble newYbye) {
        this.ybye = newYbye;
    }

    public String getPk_reminder() {
        return this.pk_reminder;
    }

    public void setPk_reminder(String newPk_reminder) {
        this.pk_reminder = newPk_reminder;
    }

    public Integer getDr() {
        return this.dr;
    }

    public void setDr(Integer newDr) {
        this.dr = newDr;
    }

    public UFDateTime getTs() {
        return this.ts;
    }

    public void setTs(UFDateTime newTs) {
        this.ts = newTs;
    }

    public String getParentPKFieldName() {
        return null;
    }

    public String getPKFieldName() {
        return PK_REMINDER;
    }

    public String getTableName() {
        return "reminderbill";
    }

    public static String getDefaultTableName() {
        return "reminderbill";
    }

    public void setExpiredmny(UFDouble expiredmny) {
        this.expiredmny = expiredmny;
    }

    public UFDouble getExpiredmny() {
        return this.expiredmny;
    }

    public void setUnexpiremny(UFDouble unexpiremny) {
        this.unexpiremny = unexpiremny;
    }

    public UFDouble getUnexpiremny() {
        return this.unexpiremny;
    }
}


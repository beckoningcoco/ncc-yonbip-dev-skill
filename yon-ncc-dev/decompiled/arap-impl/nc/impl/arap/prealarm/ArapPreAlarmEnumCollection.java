/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  nc.vo.ml.NCLangRes4VoTransl
 */
package nc.impl.arap.prealarm;

import nc.vo.ml.NCLangRes4VoTransl;

public class ArapPreAlarmEnumCollection {

    public static enum AlarmSystem {
        ALL(0),
        REC(1),
        PAY(2);

        public final Integer code;

        private AlarmSystem(Integer code) {
            this.code = code;
        }

        public static AlarmSystem valueOf(Integer value) {
            if (value == null) {
                return null;
            }
            AlarmSystem ret = null;
            switch (value) {
                case 0: {
                    ret = ALL;
                    break;
                }
                case 1: {
                    ret = REC;
                    break;
                }
                case 2: {
                    ret = PAY;
                    break;
                }
                default: {
                    ret = null;
                }
            }
            return ret;
        }
    }

    public static enum AlarmScope {
        ALL(0, NCLangRes4VoTransl.getNCLangRes().getStrByID("2006pub_0", "02006pub-0344")),
        UNDUETO(1, NCLangRes4VoTransl.getNCLangRes().getStrByID("2006pub_0", "02006pub-0354")),
        DUETO(2, NCLangRes4VoTransl.getNCLangRes().getStrByID("2006pub_0", "02006pub-0355"));

        public final Integer code;
        public final String value;

        private AlarmScope(Integer code, String value) {
            this.code = code;
            this.value = value;
        }

        public static AlarmScope valueOf(Integer value) {
            if (value == null) {
                return null;
            }
            AlarmScope ret = null;
            switch (value) {
                case 0: {
                    ret = ALL;
                    break;
                }
                case 1: {
                    ret = UNDUETO;
                    break;
                }
                case 2: {
                    ret = DUETO;
                    break;
                }
                default: {
                    ret = null;
                }
            }
            return ret;
        }

        public static Integer valueOf(AlarmScope alarmScope) {
            if (alarmScope == null) {
                return null;
            }
            Integer ret = null;
            switch (alarmScope) {
                case ALL: {
                    ret = ALL.getCode();
                    break;
                }
                case UNDUETO: {
                    ret = UNDUETO.getCode();
                    break;
                }
                case DUETO: {
                    ret = DUETO.getCode();
                    break;
                }
            }
            return ret;
        }

        public Integer getCode() {
            return this.code;
        }

        public String getVaule() {
            return this.value;
        }
    }

    public static enum AlarmType {
        CREDIT(0, NCLangRes4VoTransl.getNCLangRes().getStrByID("2006pub_0", "02006pub-0352")),
        DISCOUNT(1, NCLangRes4VoTransl.getNCLangRes().getStrByID("2006pub_0", "02006pub-0353"));

        public final Integer code;
        public final String value;

        private AlarmType(Integer code, String value) {
            this.code = code;
            this.value = value;
        }

        public static AlarmType valueOf(Integer value) {
            if (value == null) {
                return null;
            }
            AlarmType ret = null;
            switch (value) {
                case 0: {
                    ret = CREDIT;
                    break;
                }
                case 1: {
                    ret = DISCOUNT;
                    break;
                }
                default: {
                    ret = null;
                }
            }
            return ret;
        }

        public static Integer valueOf(AlarmType alarmType) {
            if (alarmType == null) {
                return null;
            }
            Integer ret = null;
            switch (alarmType) {
                case CREDIT: {
                    ret = CREDIT.getCode();
                    break;
                }
                case DISCOUNT: {
                    ret = DISCOUNT.getCode();
                    break;
                }
            }
            return ret;
        }

        public Integer getCode() {
            return this.code;
        }

        public String getVaule() {
            return this.value;
        }
    }

    public static enum BCBillStatus {
        ALL(0, NCLangRes4VoTransl.getNCLangRes().getStrByID("2006pub_0", "02006pub-0344")),
        UNCOMFORM(1, NCLangRes4VoTransl.getNCLangRes().getStrByID("2006pub_0", "02006pub-0347")),
        UNAUDIT(2, NCLangRes4VoTransl.getNCLangRes().getStrByID("2006pub_0", "02006pub-0348")),
        AUDITINDG(3, NCLangRes4VoTransl.getNCLangRes().getStrByID("2006pub_0", "02006pub-0349")),
        AUDIT(4, NCLangRes4VoTransl.getNCLangRes().getStrByID("2006pub_0", "02006pub-0350")),
        SIGN(5, NCLangRes4VoTransl.getNCLangRes().getStrByID("2006pub_0", "02006pub-0351"));

        public final Integer code;
        public final String value;

        private BCBillStatus(Integer code, String value) {
            this.code = code;
            this.value = value;
        }

        public static BCBillStatus valueOf(Integer value) {
            if (value == null) {
                return null;
            }
            BCBillStatus ret = null;
            switch (value) {
                case 0: {
                    ret = ALL;
                    break;
                }
                case 1: {
                    ret = UNCOMFORM;
                    break;
                }
                case 2: {
                    ret = UNAUDIT;
                    break;
                }
                case 3: {
                    ret = AUDITINDG;
                    break;
                }
                case 4: {
                    ret = AUDIT;
                    break;
                }
                case 5: {
                    ret = SIGN;
                    break;
                }
                default: {
                    ret = null;
                }
            }
            return ret;
        }

        public Integer getCode() {
            return this.code;
        }

        public String getVaule() {
            return this.value;
        }
    }

    public static enum BillStatus {
        ALL(0, NCLangRes4VoTransl.getNCLangRes().getStrByID("2006pub_0", "02006pub-0344")),
        UNEFFECT(1, NCLangRes4VoTransl.getNCLangRes().getStrByID("2006pub_0", "02006pub-0345")),
        EFFECT(2, NCLangRes4VoTransl.getNCLangRes().getStrByID("2006pub_0", "02006pub-0346"));

        public final Integer code;
        public final String value;

        private BillStatus(Integer code, String value) {
            this.code = code;
            this.value = value;
        }

        public static BillStatus valueOf(Integer value) {
            if (value == null) {
                return null;
            }
            BillStatus ret = null;
            switch (value) {
                case 0: {
                    ret = ALL;
                    break;
                }
                case 1: {
                    ret = UNEFFECT;
                    break;
                }
                case 2: {
                    ret = EFFECT;
                    break;
                }
                default: {
                    ret = null;
                }
            }
            return ret;
        }

        public static Integer valueOf(BillStatus billStatus) {
            if (billStatus == null) {
                return null;
            }
            Integer ret = null;
            switch (billStatus) {
                case ALL: {
                    ret = ALL.getCode();
                    break;
                }
                case UNEFFECT: {
                    ret = UNEFFECT.getCode();
                    break;
                }
                case EFFECT: {
                    ret = EFFECT.getCode();
                    break;
                }
            }
            return ret;
        }

        public Integer getCode() {
            return this.code;
        }

        public String getVaule() {
            return this.value;
        }
    }

    public static enum AssoObject {
        CUSTOMER(0, NCLangRes4VoTransl.getNCLangRes().getStrByID("common", "UC000-0001589")),
        SUPPLIER(1, NCLangRes4VoTransl.getNCLangRes().getStrByID("common", "UC000-0000275")),
        DEPT(2, NCLangRes4VoTransl.getNCLangRes().getStrByID("common", "UC000-0004064")),
        BUSIMAN(3, NCLangRes4VoTransl.getNCLangRes().getStrByID("2006pub_0", "02006pub-0340"));

        public final Integer code;
        public final String value;

        private AssoObject(Integer code, String value) {
            this.code = code;
            this.value = value;
        }

        public static AssoObject valueOf(Integer value) {
            if (value == null) {
                return null;
            }
            AssoObject ret = null;
            switch (value) {
                case 0: {
                    ret = CUSTOMER;
                    break;
                }
                case 1: {
                    ret = SUPPLIER;
                    break;
                }
                case 2: {
                    ret = DEPT;
                    break;
                }
                case 3: {
                    ret = BUSIMAN;
                    break;
                }
                default: {
                    ret = null;
                }
            }
            return ret;
        }

        public static Integer valueOf(AssoObject assoObject) {
            if (assoObject == null) {
                return null;
            }
            Integer ret = null;
            switch (assoObject) {
                case CUSTOMER: {
                    ret = CUSTOMER.getCode();
                    break;
                }
                case SUPPLIER: {
                    ret = SUPPLIER.getCode();
                    break;
                }
                case DEPT: {
                    ret = DEPT.getCode();
                    break;
                }
                case BUSIMAN: {
                    ret = BUSIMAN.getCode();
                    break;
                }
            }
            return ret;
        }

        public Integer getCode() {
            return this.code;
        }

        public String getVaule() {
            return this.value;
        }
    }

    public static enum PreAlarmTaskType {
        ALARM_YS_BILL(0, NCLangRes4VoTransl.getNCLangRes().getStrByID("2006pub_0", "02006pub-0341")),
        ALARM_YF_BILL(1, NCLangRes4VoTransl.getNCLangRes().getStrByID("2006pub_0", "02006pub-0342")),
        ALARM_MINT(2, NCLangRes4VoTransl.getNCLangRes().getStrByID("2006pub_0", "02006pub-0343"));

        public final Integer code;
        public final String value;

        private PreAlarmTaskType(Integer code, String value) {
            this.code = code;
            this.value = value;
        }

        public static PreAlarmTaskType valueOf(Integer value) {
            if (value == null) {
                return null;
            }
            PreAlarmTaskType ret = null;
            switch (value) {
                case 0: {
                    ret = ALARM_YS_BILL;
                    break;
                }
                case 1: {
                    ret = ALARM_YF_BILL;
                    break;
                }
                case 2: {
                    ret = ALARM_MINT;
                    break;
                }
                default: {
                    ret = null;
                }
            }
            return ret;
        }

        public static Integer valueOf(PreAlarmTaskType patt) {
            if (patt == null) {
                return null;
            }
            Integer ret = null;
            switch (patt) {
                case ALARM_YS_BILL: {
                    ret = ALARM_YS_BILL.getCode();
                    break;
                }
                case ALARM_YF_BILL: {
                    ret = ALARM_YF_BILL.getCode();
                    break;
                }
                case ALARM_MINT: {
                    ret = ALARM_MINT.getCode();
                    break;
                }
            }
            return ret;
        }

        public Integer getCode() {
            return this.code;
        }

        public String getVaule() {
            return this.value;
        }
    }
}


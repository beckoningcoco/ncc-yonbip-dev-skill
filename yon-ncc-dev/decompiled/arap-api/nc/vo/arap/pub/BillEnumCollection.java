/*
 * Decompiled with CFR 0.152.
 */
package nc.vo.arap.pub;

public class BillEnumCollection {
    private BillEnumCollection() {
    }

    public static enum VerifyStatus {
        NOT_VERIFY("1"),
        VERIFIED("2"),
        PART_VERIFIED("3");

        public final String VALUE;

        private VerifyStatus(String status) {
            this.VALUE = status;
        }
    }

    public static enum VoucherStatus {
        VOUCHER_NOT_GENERATE("1"),
        VOUCHER_GENERATED("2"),
        ACCOUNTING_VOUCHER("3");

        public final String VALUE;

        private VoucherStatus(String status) {
            this.VALUE = status;
        }
    }

    public static enum BuySellType {
        IN_SELL(1),
        IN_BUY(2),
        OUT_SELL(3),
        OUT_BUY(4),
        DEFAULT_TYPE(5);

        public final Integer VALUE;

        private BuySellType(int status) {
            this.VALUE = status;
        }
    }

    public static enum CommissionPayType {
        COMMPAYALL(0),
        REFUSECOMMPAY(1),
        COMMPAYPARTLY(2),
        FORCECOMMPAYALL(3);

        public final Integer VALUE;

        private CommissionPayType(int status) {
            this.VALUE = status;
        }
    }

    public static enum CommissionPayStatus {
        UNCOMMISSIONPAY(0),
        COMMISSIONPAYING(1),
        COMMISSIONPAYSUSSCESS(2);

        public final Integer VALUE;

        private CommissionPayStatus(int status) {
            this.VALUE = status;
        }
    }

    public static enum EstiType {
        ESTQR(0),
        EST(1),
        NOTEST(2);

        public final Integer VALUE;

        private EstiType(int value) {
            this.VALUE = value;
        }

        public static EstiType valueof(Integer value) {
            EstiType ret = null;
            switch (value) {
                case 0: {
                    ret = ESTQR;
                    break;
                }
                case 1: {
                    ret = EST;
                    break;
                }
                case 2: {
                    ret = NOTEST;
                    break;
                }
            }
            return ret;
        }
    }

    public static enum NoticeType {
        ZL(1),
        YE(2);

        public final Integer VALUE;

        private NoticeType(int value) {
            this.VALUE = value;
        }

        public static NoticeType valueof(Integer value) {
            NoticeType ret = null;
            switch (value) {
                case 1: {
                    ret = ZL;
                    break;
                }
                case 2: {
                    ret = YE;
                    break;
                }
            }
            return ret;
        }
    }

    public static enum PreSigns {
        NOTPRE(0),
        ISPRE(1);

        public final Integer VALUE;

        private PreSigns(int value) {
            this.VALUE = value;
        }

        public PreSigns valueof(int value) {
            PreSigns ret = null;
            switch (value) {
                case 0: {
                    ret = NOTPRE;
                    break;
                }
                case 1: {
                    ret = ISPRE;
                    break;
                }
            }
            return ret;
        }
    }

    public static enum ApproveStatus {
        NOSTATE(-1),
        NOPASS(0),
        PASSING(1),
        GOINGON(2),
        COMMIT(3);

        public final Integer VALUE;

        private ApproveStatus(int value) {
            this.VALUE = value;
        }

        public static ApproveStatus valueof(int value) {
            ApproveStatus ret = null;
            switch (value) {
                case -1: {
                    ret = NOSTATE;
                    break;
                }
                case 0: {
                    ret = NOPASS;
                    break;
                }
                case 1: {
                    ret = PASSING;
                    break;
                }
                case 2: {
                    ret = GOINGON;
                    break;
                }
                case 3: {
                    ret = COMMIT;
                    break;
                }
                default: {
                    ret = NOSTATE;
                }
            }
            return ret;
        }
    }

    public static enum BillSatus {
        TEMPEORARY(-99),
        SAVE(-1),
        AUDIT(1),
        DELETED(4),
        HANGUP(6),
        SIGN(8),
        UNCOMFIRM(9),
        CLOSING(10);

        public final Integer VALUE;

        private BillSatus(int value) {
            this.VALUE = value;
        }

        public static BillSatus valueof(int value) {
            BillSatus ret = null;
            switch (value) {
                case -99: {
                    ret = TEMPEORARY;
                    break;
                }
                case -1: {
                    ret = SAVE;
                    break;
                }
                case 1: {
                    ret = AUDIT;
                    break;
                }
                case 4: {
                    ret = DELETED;
                    break;
                }
                case 6: {
                    ret = HANGUP;
                    break;
                }
                case 8: {
                    ret = SIGN;
                    break;
                }
                case 9: {
                    ret = UNCOMFIRM;
                    break;
                }
                case 10: {
                    ret = CLOSING;
                    break;
                }
                default: {
                    ret = SAVE;
                }
            }
            return ret;
        }
    }

    public static enum Account {
        IN(0),
        OUT(1);

        public final Integer VALUE;

        private Account(int value) {
            this.VALUE = value;
        }

        public static Account valueof(Integer value) {
            Account ret = null;
            switch (value) {
                case 0: {
                    ret = IN;
                    break;
                }
                case 1: {
                    ret = OUT;
                    break;
                }
            }
            return ret;
        }
    }

    public static enum BillCooperate {
        NOSUER(0),
        SURE(1);

        public final Integer VALUE;

        private BillCooperate(int value) {
            this.VALUE = value;
        }

        public static BillCooperate valueof(Integer value) {
            BillCooperate ret = null;
            switch (value) {
                case 0: {
                    ret = NOSUER;
                    break;
                }
                case 1: {
                    ret = SURE;
                    break;
                }
            }
            return ret;
        }
    }

    public static enum TaxType {
        TAXIN(0),
        TAXOUT(1),
        NOTAX(2);

        public final Integer VALUE;

        private TaxType(int value) {
            this.VALUE = value;
        }

        public static TaxType valueof(Integer value) {
            TaxType ret = null;
            switch (value) {
                case 0: {
                    ret = TAXIN;
                    break;
                }
                case 1: {
                    ret = TAXOUT;
                    break;
                }
                case 2: {
                    ret = NOTAX;
                    break;
                }
            }
            return ret;
        }
    }

    public static enum CheckState {
        CHECKING(0),
        CHECKOK(1),
        CHECKNO(2),
        FREE(-1),
        SUBMIT(3);

        public final Integer VALUE;

        private CheckState(int value) {
            this.VALUE = value;
        }

        public static CheckState valueof(Integer value) {
            CheckState ret = null;
            switch (value) {
                case -1: {
                    ret = FREE;
                    break;
                }
                case 0: {
                    ret = CHECKING;
                    break;
                }
                case 1: {
                    ret = CHECKOK;
                    break;
                }
                case 2: {
                    ret = CHECKNO;
                    break;
                }
                case 3: {
                    ret = SUBMIT;
                    break;
                }
            }
            return ret;
        }
    }

    public static enum ObjType {
        CUSTOMER(0),
        PERSON(3),
        DEP(2),
        SUPPLIER(1),
        CUSSUP(8);

        public final Integer VALUE;

        private ObjType(int value) {
            this.VALUE = value;
        }

        public static ObjType valueof(Integer value) {
            ObjType ret = null;
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
                    ret = DEP;
                    break;
                }
                case 3: {
                    ret = PERSON;
                    break;
                }
            }
            return ret;
        }
    }

    public static enum InureSign {
        NOINURE(0),
        NOVOUCHER(5),
        OKINURE(10);

        public final Integer VALUE;

        private InureSign(int value) {
            this.VALUE = value;
        }

        public static InureSign valueof(Integer value) {
            InureSign ret = null;
            if (null == value) {
                ret = NOINURE;
                return ret;
            }
            switch (value) {
                case 0: {
                    ret = NOINURE;
                    break;
                }
                case 5: {
                    ret = NOVOUCHER;
                    break;
                }
                case 10: {
                    ret = OKINURE;
                    break;
                }
                default: {
                    ret = NOINURE;
                }
            }
            return ret;
        }
    }

    public static enum BillType {
        PURCHASE_ORDER("21"),
        PS_APPLY("36D1"),
        PS_PLANDETAIL("36D7"),
        SALES_ORDER("30");

        public final String VALUE;

        private BillType(String value) {
            this.VALUE = value;
        }
    }

    public static enum FromSystem {
        AR(0),
        AP(1),
        CMP(2),
        SO(3),
        PO(4),
        FTS(5),
        NET(6),
        CFBM(8),
        XTDJ(9),
        CDMA(10),
        XBGL(12),
        TB(13),
        TO(16),
        WBJHPT(17),
        ZJJX(18),
        IC(19),
        CT(20),
        YS(24),
        PS(7),
        AM(104),
        WSBX(105),
        CR09(109),
        JCK(113),
        CRM(114),
        XYZ(115),
        RM(116);

        public final Integer VALUE;

        private FromSystem(int value) {
            this.VALUE = value;
        }

        public static FromSystem valueof(Integer value) {
            FromSystem ret = null;
            switch (value) {
                case 0: {
                    ret = AR;
                    break;
                }
                case 1: {
                    ret = AP;
                    break;
                }
                case 2: {
                    ret = CMP;
                    break;
                }
                case 3: {
                    ret = SO;
                    break;
                }
                case 4: {
                    ret = PO;
                    break;
                }
                case 5: {
                    ret = FTS;
                    break;
                }
                case 6: {
                    ret = NET;
                    break;
                }
                case 8: {
                    ret = CFBM;
                    break;
                }
                case 9: {
                    ret = XTDJ;
                    break;
                }
                case 10: {
                    ret = CDMA;
                    break;
                }
                case 12: {
                    ret = XBGL;
                    break;
                }
                case 13: {
                    ret = TB;
                    break;
                }
                case 16: {
                    ret = TO;
                    break;
                }
                case 17: {
                    ret = WBJHPT;
                    break;
                }
                case 18: {
                    ret = ZJJX;
                    break;
                }
                case 19: {
                    ret = IC;
                    break;
                }
                case 20: {
                    ret = CT;
                    break;
                }
                case 24: {
                    ret = YS;
                    break;
                }
                case 104: {
                    ret = AM;
                    break;
                }
                case 105: {
                    ret = WSBX;
                    break;
                }
                case 116: {
                    ret = RM;
                    break;
                }
            }
            return ret;
        }
    }

    public static enum SettlementType {
        NO(0),
        HAND(3),
        NETBANK(5),
        SETTLECENTER(10);

        public final Integer VALUE;

        private SettlementType(int value) {
            this.VALUE = value;
        }

        public static SettlementType valueof(Integer value) {
            SettlementType ret = null;
            switch (value) {
                case 0: {
                    ret = NO;
                    break;
                }
                case 3: {
                    ret = HAND;
                    break;
                }
                case 5: {
                    ret = NETBANK;
                    break;
                }
                case 10: {
                    ret = SETTLECENTER;
                    break;
                }
            }
            return ret;
        }
    }

    public static enum SettlementState {
        DEFAULT(0),
        TRANSSUCCED(1),
        TRANSFAIL(-1),
        TRANSING(2),
        SOMEPAYFINISH(11);

        public final Integer VALUE;

        private SettlementState(int value) {
            this.VALUE = value;
        }

        public static SettlementState valueof(Integer value) {
            SettlementState ret = null;
            switch (value) {
                case 0: {
                    ret = DEFAULT;
                    break;
                }
                case 1: {
                    ret = TRANSSUCCED;
                    break;
                }
                case -1: {
                    ret = TRANSFAIL;
                    break;
                }
                case 2: {
                    ret = TRANSING;
                    break;
                }
                case 11: {
                    ret = SOMEPAYFINISH;
                    break;
                }
            }
            return ret;
        }
    }

    public static enum RowType {
        FILL(0),
        NOTFILL(1),
        SWITCHTO(5),
        AGENCY(21),
        LOAN(22),
        CASH(23),
        AGENT_BUSINESS(24),
        SELF_BUSSINESS(25);

        public final Integer VALUE;

        private RowType(int value) {
            this.VALUE = value;
        }

        public static RowType valueof(Integer value) {
            RowType ret = null;
            switch (value) {
                case 0: {
                    ret = FILL;
                    break;
                }
                case 1: {
                    ret = NOTFILL;
                    break;
                }
                case 5: {
                    ret = SWITCHTO;
                    break;
                }
                case 21: {
                    ret = AGENCY;
                    break;
                }
                case 22: {
                    ret = LOAN;
                    break;
                }
                case 23: {
                    ret = CASH;
                    break;
                }
                case 24: {
                    ret = AGENT_BUSINESS;
                    break;
                }
                case 25: {
                    ret = SELF_BUSSINESS;
                    break;
                }
            }
            return ret;
        }
    }

    public static enum PayWay {
        NONE(0),
        SETTLE_HAND(3),
        NETPAY(5),
        CENTRPAY(10);

        public final Integer VALUE;

        private PayWay(int value) {
            this.VALUE = value;
        }

        public static PayWay valueof(Integer value) {
            PayWay ret = null;
            switch (value) {
                case 0: {
                    ret = NONE;
                    break;
                }
                case 3: {
                    ret = SETTLE_HAND;
                    break;
                }
                case 5: {
                    ret = NETPAY;
                    break;
                }
                case 10: {
                    ret = CENTRPAY;
                    break;
                }
            }
            return ret;
        }
    }

    public static enum PayStatus {
        DEFAULT(0),
        UNPAYED(1),
        PAYING(2),
        PAYFINISH(3),
        PAYFAIL(4),
        SOMEPAYFINISH(20),
        UNRECIVE(5),
        RECIVING(6),
        RECIVEFINISH(7),
        RECIVEFAIL(8);

        public final Integer VALUE;

        private PayStatus(int status) {
            this.VALUE = status;
        }

        public static PayStatus valueof(Integer value) {
            PayStatus ret = null;
            switch (value) {
                case 0: {
                    ret = DEFAULT;
                    break;
                }
                case 1: {
                    ret = UNPAYED;
                    break;
                }
                case 2: {
                    ret = PAYING;
                    break;
                }
                case 3: {
                    ret = PAYFINISH;
                    break;
                }
                case 4: {
                    ret = PAYFAIL;
                    break;
                }
                case 5: {
                    ret = UNRECIVE;
                    break;
                }
                case 6: {
                    ret = RECIVING;
                    break;
                }
                case 7: {
                    ret = RECIVEFINISH;
                    break;
                }
                case 8: {
                    ret = RECIVEFAIL;
                    break;
                }
                case 20: {
                    ret = SOMEPAYFINISH;
                    break;
                }
            }
            return ret;
        }
    }

    public static enum BillDIRECTION {
        DEFAULT("none"),
        AR("ar"),
        AP("ap");

        public final String VALUE;

        private BillDIRECTION(String status) {
            this.VALUE = status;
        }

        public String getValue() {
            return this.VALUE;
        }

        public static BillDIRECTION valueof(String value) {
            BillDIRECTION ret = null;
            if (value.equals(BillDIRECTION.DEFAULT.VALUE)) {
                ret = DEFAULT;
            } else if (value.equals(BillDIRECTION.AR.VALUE)) {
                ret = AR;
            }
            if (value.equals(BillDIRECTION.AP.VALUE)) {
                ret = AP;
            }
            return ret;
        }
    }

    public static enum Direction {
        DEBIT(1),
        CREDIT(-1);

        public final Integer VALUE;

        private Direction(int status) {
            this.VALUE = status;
        }

        public static Direction valueof(Integer value) {
            Direction ret = null;
            switch (value) {
                case -1: {
                    ret = CREDIT;
                    break;
                }
                case 1: {
                    ret = DEBIT;
                    break;
                }
            }
            return ret;
        }
    }
}


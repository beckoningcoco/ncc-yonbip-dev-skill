/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  nc.vo.ml.NCLangRes4VoTransl
 */
package nc.vo.arap.tally;

import nc.vo.ml.NCLangRes4VoTransl;

public enum BusiTypeEnum {
    BILL_ENTER(1, "2006pub_0", "02006pub-0405"),
    BILL_MODIFY(2, "2006pub_0", "02006pub-0406"),
    BILL_DELETE(3, "2006pub_0", "02006pub-0407"),
    BILL_CONFIRM(4, "2006pub_0", "02006pub-0408"),
    BILL_SIGN(5, "2006pub_0", "02006pub-0409"),
    BILL_EFFECT(6, "2006pub_0", "02006pub-0410"),
    BILL_UNCONFIRM(7, "2006pub_0", "02006pub-0411"),
    BILL_UNSIGN(8, "2006pub_0", "02006pub-0412"),
    BILL_UNEFFECT(9, "2006pub_0", "02006pub-0413"),
    INDIFF_VERIFY(11, "2006pub_0", "02006pub-0414"),
    DIFF_VERIFY(12, "2006pub_0", "02006pub-0415"),
    RED_BLUE_VERIFY(13, "2006pub_0", "02006pub-0416"),
    UN_VERIFY(14, "2006pub_0", "02006pub-0417"),
    DISCOUNT(15, "common", "UC000-0002087"),
    AGIO(21, "2006pub_0", "02006pub-0418"),
    AGIOS(211, "2006pub_0", "02006pub-0418"),
    AGIO_OCC(212, "2006pub_0", "02006pub-0419"),
    AGIO_UNOCC(213, "2006pub_0", "02006pub-0420"),
    AGIO_UNOCC_RE(214, "2006pub_0", "02006pub-0421"),
    CANCEL_AGIO(22, "2006pub_0", "02006pub-0422"),
    BAD_DEBT_OCCUR(31, "2006pub_0", "02006pub-0423"),
    BAD_DEBT_REVOKE(32, "2006pub_0", "02006pub-0424"),
    CANCEL_BAD_DEBT_OCCUR(33, "2006pub_0", "02006pub-0425"),
    CANCEL_BAD_DEBT_REVOKE(34, "2006pub_0", "02006pub-0426"),
    UNION_DEBT(41, "2006pub_0", "02006pub-0427"),
    UNION_DEBT_IN(411, "2006pub_0", "02006pub-0428"),
    UNION_DEBT_OUT(412, "2006pub_0", "02006pub-0429"),
    CANCEL_UNION_DEBT(42, "2006pub_0", "02006pub-0430"),
    ESTI_BACKWASH(53, "2006v61008_0", "02006v61008-0299"),
    ESTI_BALANCEUPDATE(54, "2006v61008_0", "02006v61008-0300"),
    APPROVE_BAD_DEBT_LOSS(31, "2006pub_0", "02006pub-1002"),
    APPROVE_BAD_DEBT_RECOVERY(32, "2006pub_0", "02006pub-1003"),
    UNAPPROVE_BAD_DEBT_LOSS(33, "2006pub_0", "02006pub-1004"),
    UNAPPROVE_BAD_DEBT_RECOVERY(34, "2006pub_0", "02006pub-1005");

    private final int code;
    private final String productCode;
    private final String nameResid;

    private BusiTypeEnum(int code, String productCode, String nameResid) {
        this.code = code;
        this.productCode = productCode;
        this.nameResid = nameResid;
    }

    public int getCode() {
        return this.code;
    }

    public String getName() {
        return NCLangRes4VoTransl.getNCLangRes().getStrByID(this.productCode, this.nameResid);
    }
}


/*
 * Decompiled with CFR 0.152.
 */
package nc.vo.pub.format.meta;

import nc.vo.pub.format.meta.NumberFormatMeta;

public class CurrencyFormatMeta
extends NumberFormatMeta {
    public static final String CUR_POS_FORMAT_HEAD = "$n";
    public static final String CUR_POS_FORMAT_TAIL = "n$";
    public static final String CUR_POS_FORMAT_HEAD_SPACE = "$ n";
    public static final String CUR_POS_FORMAT_TAIL_SPACE = "n $";
    public static final String CUR_NEG_FORMAT_HEAD = "$-n";
    public static final String CUR_NEG_FORMAT_MID = "-$n";
    public static final String CUR_NEG_FORMAT_TAIL = "-n$";
    public static final String CUR_NEG_FORMAT_HEAD_SPACE = "$ -n";
    public static final String CUR_NEG_FORMAT_TAIL_SPACE = "-n $";
    public static final String CUR_NEG_FORMAT_BRACKET = "($n)";
    private String curSymbol = "";

    public CurrencyFormatMeta() {
        this.positiveFormat = CUR_POS_FORMAT_HEAD;
        this.negativeFormat = CUR_NEG_FORMAT_HEAD;
    }

    public String getCurSymbol() {
        return this.curSymbol;
    }

    public void setCurSymbol(String curSymbol) {
        this.curSymbol = curSymbol;
    }
}


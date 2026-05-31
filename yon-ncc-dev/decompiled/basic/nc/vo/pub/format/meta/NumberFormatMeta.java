/*
 * Decompiled with CFR 0.152.
 */
package nc.vo.pub.format.meta;

import nc.vo.pub.format.meta.NCFormatMeta;

public class NumberFormatMeta
extends NCFormatMeta {
    public static final String POS_FORMAT_ORIGN = "n";
    public static final String NEG_FORMAT_HEAD = "-n";
    public static final String NEG_FORMAT_HEAD_SPACE = "- n";
    public static final String NEG_FORMAT_TAIL = "n-";
    public static final String NEG_FORMAT_TAIL_SPACE = "n -";
    public static final String NEG_FORMAT_BRACKET = "(n)";
    protected boolean isNegRed = false;
    protected boolean isMarkEnable = false;
    protected String markSymbol = ",";
    protected String pointSymbol = ".";
    protected String positiveFormat = "n";
    protected String negativeFormat = "-n";

    public boolean isMarkEnable() {
        return this.isMarkEnable;
    }

    public void setMarkEnable(boolean isMarkEnable) {
        this.isMarkEnable = isMarkEnable;
    }

    public String getMarkSymbol() {
        return this.markSymbol;
    }

    public void setMarkSymbol(String markSymbol) {
        this.markSymbol = markSymbol;
    }

    public String getPointSymbol() {
        return this.pointSymbol;
    }

    public void setPointSymbol(String pointSymbol) {
        this.pointSymbol = pointSymbol;
    }

    public String getPositiveFormat() {
        return this.positiveFormat;
    }

    public void setPositiveFormat(String positiveFormat) {
        this.positiveFormat = positiveFormat;
    }

    public String getNegativeFormat() {
        return this.negativeFormat;
    }

    public void setNegativeFormat(String negativeFormat) {
        this.negativeFormat = negativeFormat;
    }

    public boolean isNegRed() {
        return this.isNegRed;
    }

    public void setNegRed(boolean isNegRed) {
        this.isNegRed = isNegRed;
    }
}


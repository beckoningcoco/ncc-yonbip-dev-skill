/*
 * Decompiled with CFR 0.152.
 */
package nc.vo.pub.format;

import java.awt.Color;
import java.util.regex.Matcher;
import nc.vo.pub.format.AbstractFormat;
import nc.vo.pub.format.FormatResult;
import nc.vo.pub.format.NumberObject;
import nc.vo.pub.format.exception.FormatException;
import nc.vo.pub.format.meta.NumberFormatMeta;
import nc.vo.pub.lang.UFDouble;

public class NumberFormat
extends AbstractFormat {
    protected NumberFormatMeta formatMeta = null;

    NumberFormat() {
    }

    public NumberFormat(NumberFormatMeta formatMeta) {
        this.formatMeta = formatMeta;
    }

    @Override
    protected Object formatArgument(Object obj) throws FormatException {
        return new NumberObject(obj);
    }

    @Override
    protected FormatResult innerFormat(Object obj) throws FormatException {
        NumberObject fObj = (NumberObject)obj;
        UFDouble dValue = fObj.getDoubleValue();
        String strValue = null;
        String express = null;
        double tmpValue = dValue.doubleValue();
        if (tmpValue > 0.0) {
            express = this.formatMeta.getPositiveFormat();
            strValue = dValue.toString();
        } else if (tmpValue < 0.0) {
            express = this.formatMeta.getNegativeFormat();
            strValue = dValue.toString().substring(1);
        } else {
            express = this.formatMeta.getPositiveFormat();
            strValue = dValue.toString();
        }
        int seperatorIndex = strValue.indexOf(".");
        StringBuffer str = new StringBuffer(strValue);
        this.setTheSeperator(str, seperatorIndex);
        this.setTheMark(str, seperatorIndex);
        Color color = null;
        if (dValue.doubleValue() < 0.0 && this.formatMeta.isNegRed()) {
            color = Color.RED;
        }
        return new FormatResult(express.replaceAll("n", Matcher.quoteReplacement(str.toString())), color);
    }

    private void setTheMark(StringBuffer str, int seperatorIndex) {
        if (!this.formatMeta.isMarkEnable()) {
            return;
        }
        if (seperatorIndex <= 0) {
            seperatorIndex = str.length();
        }
        char first = str.charAt(0);
        int endIndex = 0;
        if (first == '-') {
            endIndex = 1;
        }
        char[] mark = this.formatMeta.getMarkSymbol().toCharArray();
        for (int index = seperatorIndex - 3; index > endIndex; index -= 3) {
            str.insert(index, mark);
        }
    }

    private void setTheSeperator(StringBuffer str, int seperatorIndex) {
        if (seperatorIndex > 0) {
            str.setCharAt(seperatorIndex, this.formatMeta.getPointSymbol().toCharArray()[0]);
        }
    }
}


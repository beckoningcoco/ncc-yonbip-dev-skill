/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  nc.bs.logging.Logger
 *  nc.vo.pub.format.NumberFormat
 *  nc.vo.pub.format.exception.FormatException
 *  nc.vo.pub.lang.UFDouble
 */
package nc.web.arap.util;

import nc.bs.logging.Logger;
import nc.vo.pub.format.NumberFormat;
import nc.vo.pub.format.exception.FormatException;
import nc.vo.pub.lang.UFDouble;
import nc.web.arap.util.ArapThreadCache;

public class ArapNumberFormat {
    public String format(double value, int digit) {
        if (value == 0.0) {
            return "";
        }
        return ArapNumberFormat.formatUFDouble(ArapNumberFormat.formatUFDouble(new UFDouble(value), digit));
    }

    public String format(Double value, int digit) {
        if (value == null) {
            return "";
        }
        return this.format(new UFDouble(value), digit);
    }

    public String format(UFDouble value, int digit) {
        if (value == null || value.equals((Object)UFDouble.ZERO_DBL)) {
            return "";
        }
        return ArapNumberFormat.formatUFDouble(value.setScale(digit, 4));
    }

    public String format(UFDouble value, int digit, int roundmod) {
        if (value == null || value.equals((Object)UFDouble.ZERO_DBL)) {
            return "";
        }
        return ArapNumberFormat.formatUFDouble(value.setScale(digit, roundmod));
    }

    public static String formatUFDouble(UFDouble value) {
        if (value == null || value.equals((Object)UFDouble.ZERO_DBL)) {
            return "";
        }
        String formatvalue = "";
        try {
            NumberFormat nf = ArapThreadCache.getInstance().getNumberFormat();
            formatvalue = nf.format((Object)value).getValue();
        }
        catch (FormatException e) {
            Logger.error((Object)e.getMessage(), (Throwable)e);
            StringBuffer r = new StringBuffer(64);
            if (value != null) {
                if (value.equals((Object)new UFDouble(0))) {
                    return "";
                }
                String str = value.toString().trim();
                if (str.length() != 0) {
                    int index = str.indexOf(46);
                    if (index >= 0) {
                        r.append(str.substring(index));
                        str = str.substring(0, index);
                    }
                    while (str.length() > 0) {
                        int step = str.length() - 3;
                        step = step < 0 ? 0 : step;
                        r.insert(0, str.substring(step));
                        str = str.substring(0, step);
                        if (step <= 0 || str.equals("-")) continue;
                        r.insert(0, ',');
                    }
                }
            }
            return r.toString();
        }
        return formatvalue;
    }

    public static synchronized UFDouble formatUFDouble(UFDouble value, int decimaldigits) {
        if (value == null) {
            return null;
        }
        return value.setScale(Math.abs(decimaldigits), 4);
    }

    public static synchronized UFDouble formatUFDouble(UFDouble value, int decimaldigits, int roundmod) {
        if (value == null) {
            return null;
        }
        return value.setScale(Math.abs(decimaldigits), roundmod);
    }
}


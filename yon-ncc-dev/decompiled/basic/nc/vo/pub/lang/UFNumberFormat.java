/*
 * Decompiled with CFR 0.152.
 */
package nc.vo.pub.lang;

import java.text.NumberFormat;
import java.util.Locale;
import nc.vo.pub.lang.UFDouble;

public class UFNumberFormat {
    public static final int NUMBERSTYLE = 0;
    public static final int CURRENCYSTYLE = 1;
    public static final int PERCENTSTYLE = 2;
    public static final int SCIENTIFICSTYLE = 3;

    public static String format(double value) {
        return UFNumberFormat.format(value, 0);
    }

    public static String format(double value, int style) {
        return UFNumberFormat.format(value, style, null);
    }

    public static String format(double value, int style, Locale locale) {
        NumberFormat form = null;
        if (locale == null) {
            switch (style) {
                case 0: {
                    form = NumberFormat.getNumberInstance();
                    break;
                }
                case 1: {
                    form = NumberFormat.getCurrencyInstance();
                    break;
                }
                case 2: {
                    form = NumberFormat.getPercentInstance();
                    break;
                }
                default: {
                    form = NumberFormat.getInstance();
                    break;
                }
            }
        } else {
            switch (style) {
                case 0: {
                    form = NumberFormat.getNumberInstance(locale);
                    break;
                }
                case 1: {
                    form = NumberFormat.getCurrencyInstance(locale);
                    break;
                }
                case 2: {
                    form = NumberFormat.getPercentInstance(locale);
                    break;
                }
                default: {
                    form = NumberFormat.getInstance(locale);
                }
            }
        }
        form.setMaximumFractionDigits(9);
        return form.format(value);
    }

    public static String format(int value) {
        return UFNumberFormat.format(value, 0);
    }

    public static String format(int value, int style) {
        return UFNumberFormat.format(value, style, null);
    }

    public static String format(int value, int style, Locale locale) {
        return UFNumberFormat.format((long)value, style, locale);
    }

    public static String format(long value) {
        return UFNumberFormat.format(value, 0);
    }

    public static String format(long value, int style) {
        return UFNumberFormat.format(value, style, null);
    }

    public static String format(long value, int style, Locale locale) {
        NumberFormat form = null;
        if (locale == null) {
            switch (style) {
                case 0: {
                    form = NumberFormat.getNumberInstance();
                    break;
                }
                case 1: {
                    form = NumberFormat.getCurrencyInstance();
                    break;
                }
                case 2: {
                    form = NumberFormat.getPercentInstance();
                    break;
                }
                default: {
                    form = NumberFormat.getInstance();
                    break;
                }
            }
        } else {
            switch (style) {
                case 0: {
                    form = NumberFormat.getNumberInstance(locale);
                    break;
                }
                case 1: {
                    form = NumberFormat.getCurrencyInstance(locale);
                    break;
                }
                case 2: {
                    form = NumberFormat.getPercentInstance(locale);
                    break;
                }
                default: {
                    form = NumberFormat.getInstance(locale);
                }
            }
        }
        return form.format(value);
    }

    public static String format(Double value) {
        return UFNumberFormat.format(value, 0);
    }

    public static String format(Double value, int style) {
        return UFNumberFormat.format(value, style, null);
    }

    public static String format(Double value, int style, Locale locale) {
        if (value != null) {
            return UFNumberFormat.format((double)value, style, locale);
        }
        return "";
    }

    public static String format(Integer value) {
        return UFNumberFormat.format(value, 0);
    }

    public static String format(Integer value, int style) {
        return UFNumberFormat.format(value, style, null);
    }

    public static String format(Integer value, int style, Locale locale) {
        if (value != null) {
            return UFNumberFormat.format((int)value, style, locale);
        }
        return "";
    }

    public static String format(Long value) {
        return UFNumberFormat.format(value, 0);
    }

    public static String format(Long value, int style) {
        return UFNumberFormat.format(value, style, null);
    }

    public static String format(Long value, int style, Locale locale) {
        if (value != null) {
            return UFNumberFormat.format((long)value, style, locale);
        }
        return "";
    }

    public static String format(UFDouble value) {
        return UFNumberFormat.format(value, 0);
    }

    public static String format(UFDouble value, int style) {
        return UFNumberFormat.format(value, style, null);
    }

    public static String format(UFDouble value, int style, Locale locale) {
        if (value != null) {
            return UFNumberFormat.format(value.doubleValue(), style, locale);
        }
        return "";
    }
}


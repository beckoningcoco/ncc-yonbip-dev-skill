/*
 * Decompiled with CFR 0.152.
 */
package nc.vo.pub.format;

import nc.vo.pub.format.AbstractSplitFormat;
import nc.vo.pub.format.DateFormat;
import nc.vo.pub.format.DateTimeObject;
import nc.vo.pub.format.IElement;
import nc.vo.pub.format.StringElement;
import nc.vo.pub.format.exception.FormatException;
import nc.vo.pub.format.meta.DateTimeFormatMeta;

public class DateTimeFormat
extends AbstractSplitFormat {
    protected DateTimeFormatMeta formatMeta = null;
    public static final String[] enShortMonth = new String[]{"Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec"};
    public static final String[] enLongMonth = new String[]{"January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"};

    DateTimeFormat() {
    }

    public DateTimeFormat(DateTimeFormatMeta formatMeta) {
        this.formatMeta = formatMeta;
    }

    private IElement doOne(String express) {
        if (express.length() == 0) {
            return new StringElement("");
        }
        if (express.equals("yyyy")) {
            return new IElement(){

                @Override
                public String getValue(Object obj) {
                    return DateTimeFormat.this.getyyyy((DateTimeObject)obj);
                }
            };
        }
        if (express.equals("yy")) {
            return new IElement(){

                @Override
                public String getValue(Object obj) {
                    return DateTimeFormat.this.getyy((DateTimeObject)obj);
                }
            };
        }
        if (express.equals("MMMM")) {
            return new IElement(){

                @Override
                public String getValue(Object obj) {
                    return DateTimeFormat.this.getMMMM((DateTimeObject)obj);
                }
            };
        }
        if (express.equals("MMM")) {
            return new IElement(){

                @Override
                public String getValue(Object obj) {
                    return DateTimeFormat.this.getMMM((DateTimeObject)obj);
                }
            };
        }
        if (express.equals("MM")) {
            return new IElement(){

                @Override
                public String getValue(Object obj) {
                    return DateTimeFormat.this.getMM((DateTimeObject)obj);
                }
            };
        }
        if (express.equals("M")) {
            return new IElement(){

                @Override
                public String getValue(Object obj) {
                    return DateTimeFormat.this.getM((DateTimeObject)obj);
                }
            };
        }
        if (express.equals("dd")) {
            return new IElement(){

                @Override
                public String getValue(Object obj) {
                    return DateTimeFormat.this.getdd((DateTimeObject)obj);
                }
            };
        }
        if (express.equals("d")) {
            return new IElement(){

                @Override
                public String getValue(Object obj) {
                    return DateTimeFormat.this.getd((DateTimeObject)obj);
                }
            };
        }
        if (express.equals("hh")) {
            return new IElement(){

                @Override
                public String getValue(Object obj) {
                    return DateTimeFormat.this.gethh((DateTimeObject)obj);
                }
            };
        }
        if (express.equals("h")) {
            return new IElement(){

                @Override
                public String getValue(Object obj) {
                    return DateTimeFormat.this.geth((DateTimeObject)obj);
                }
            };
        }
        if (express.equals("mm")) {
            return new IElement(){

                @Override
                public String getValue(Object obj) {
                    return DateTimeFormat.this.getmm((DateTimeObject)obj);
                }
            };
        }
        if (express.equals("m")) {
            return new IElement(){

                @Override
                public String getValue(Object obj) {
                    return DateTimeFormat.this.getm((DateTimeObject)obj);
                }
            };
        }
        if (express.equals("ss")) {
            return new IElement(){

                @Override
                public String getValue(Object obj) {
                    return DateTimeFormat.this.getss((DateTimeObject)obj);
                }
            };
        }
        if (express.equals("s")) {
            return new IElement(){

                @Override
                public String getValue(Object obj) {
                    return DateTimeFormat.this.gets((DateTimeObject)obj);
                }
            };
        }
        if (express.equals("HH")) {
            return new IElement(){

                @Override
                public String getValue(Object obj) {
                    return DateTimeFormat.this.getHH((DateTimeObject)obj);
                }
            };
        }
        if (express.equals("H")) {
            return new IElement(){

                @Override
                public String getValue(Object obj) {
                    return DateTimeFormat.this.getH((DateTimeObject)obj);
                }
            };
        }
        if (express.equals("t")) {
            return new IElement(){

                @Override
                public String getValue(Object obj) {
                    return DateTimeFormat.this.gett((DateTimeObject)obj);
                }
            };
        }
        return new StringElement(express);
    }

    protected String getyyyy(DateTimeObject date) {
        return String.valueOf(date.getYear());
    }

    protected String getyy(DateTimeObject date) {
        return String.valueOf(date.getYear()).substring(2);
    }

    protected String getM(DateTimeObject date) {
        return String.valueOf(date.getMonth());
    }

    protected String getMM(DateTimeObject date) {
        int month = date.getMonth();
        if (month < 10) {
            return "0" + month;
        }
        return String.valueOf(month);
    }

    protected String getMMM(DateTimeObject date) {
        return DateFormat.enShortMonth[date.getMonth() - 1];
    }

    protected String getMMMM(DateTimeObject date) {
        return DateFormat.enLongMonth[date.getMonth() - 1];
    }

    protected String getdd(DateTimeObject date) {
        int day = date.getDate();
        if (day < 10) {
            return "0" + day;
        }
        return String.valueOf(date.getDate());
    }

    protected String getd(DateTimeObject date) {
        return String.valueOf(date.getDate());
    }

    protected String gethh(DateTimeObject date) {
        int hh = date.getHours();
        if (hh < 10) {
            return "0" + hh;
        }
        return String.valueOf(date.getHours());
    }

    protected String geth(DateTimeObject date) {
        return String.valueOf(date.getHours());
    }

    protected String getHH(DateTimeObject date) {
        int HH;
        int hour = HH = date.getHours();
        if (HH == 0) {
            hour = 12;
        } else if (HH > 12) {
            hour = HH - 12;
        }
        if (hour < 10) {
            return "0" + hour;
        }
        return String.valueOf(hour);
    }

    protected String getH(DateTimeObject date) {
        int HH;
        int hour = HH = date.getHours();
        if (HH == 0) {
            hour = 12;
        } else if (HH > 12) {
            hour = HH - 12;
        }
        return String.valueOf(hour);
    }

    protected String getmm(DateTimeObject date) {
        int mm = date.getMinutes();
        if (mm < 10) {
            return "0" + mm;
        }
        return String.valueOf(date.getMinutes());
    }

    protected String getm(DateTimeObject date) {
        return String.valueOf(date.getMinutes());
    }

    protected String getss(DateTimeObject date) {
        int ss = date.getSeconds();
        if (ss < 10) {
            return "0" + ss;
        }
        return String.valueOf(ss);
    }

    protected String gets(DateTimeObject date) {
        return String.valueOf(date.getSeconds());
    }

    protected String gett(DateTimeObject date) {
        int hh = date.getHours();
        if (hh < 12) {
            return "AM";
        }
        return "PM";
    }

    @Override
    protected String getExpress() {
        return this.formatMeta.getFormat();
    }

    @Override
    protected String[] getReplaceds() {
        return new String[]{null, this.formatMeta.getSperatorSymbol(), ":"};
    }

    @Override
    protected String[] getSeperators() {
        return new String[]{"(\\s)+?", "-", ":"};
    }

    @Override
    protected IElement getVarElement(String express) {
        return this.doOne(express);
    }

    @Override
    protected Object formatArgument(Object obj) throws FormatException {
        return new DateTimeObject(obj);
    }
}


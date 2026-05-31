/*
 * Decompiled with CFR 0.152.
 */
package nc.vo.pub.format;

import java.util.Date;
import nc.vo.pub.format.DateFormat;
import nc.vo.pub.format.FormatResult;
import nc.vo.pub.format.NumberFormat;
import nc.vo.pub.format.exception.FormatException;
import nc.vo.pub.format.meta.DateFormatMeta;
import nc.vo.pub.format.meta.NumberFormatMeta;

public class NCFormater {
    public static FormatResult formatNumber(Number number, NumberFormatMeta nfm) throws FormatException {
        NumberFormat nf = new NumberFormat(nfm);
        return nf.format(number);
    }

    public static FormatResult formatDate(Date date, DateFormatMeta dfm) throws FormatException {
        DateFormat df = new DateFormat(dfm);
        return df.format(date);
    }
}


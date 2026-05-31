/*
 * Decompiled with CFR 0.152.
 */
package nc.vo.pub.format;

import nc.vo.pub.format.DateTimeFormat;
import nc.vo.pub.format.DateTimeObject;
import nc.vo.pub.format.exception.FormatException;
import nc.vo.pub.format.meta.TimeFormatMeta;

public class TimeFormat
extends DateTimeFormat {
    public TimeFormat(TimeFormatMeta formatMeta) {
        super(formatMeta);
    }

    @Override
    protected Object formatArgument(Object obj) throws FormatException {
        return new DateTimeObject(obj, false);
    }
}


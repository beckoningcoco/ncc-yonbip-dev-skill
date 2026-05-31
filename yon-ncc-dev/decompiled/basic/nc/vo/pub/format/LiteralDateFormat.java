/*
 * Decompiled with CFR 0.152.
 */
package nc.vo.pub.format;

import nc.vo.pub.format.DateFormat;
import nc.vo.pub.format.DateTimeObject;
import nc.vo.pub.format.exception.FormatException;
import nc.vo.pub.format.meta.DateFormatMeta;

public class LiteralDateFormat
extends DateFormat {
    public LiteralDateFormat(DateFormatMeta formatMeta) {
        super(formatMeta);
    }

    @Override
    protected Object formatArgument(Object obj) throws FormatException {
        return new DateTimeObject(obj, false);
    }
}


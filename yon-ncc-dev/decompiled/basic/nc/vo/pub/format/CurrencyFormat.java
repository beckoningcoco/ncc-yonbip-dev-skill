/*
 * Decompiled with CFR 0.152.
 */
package nc.vo.pub.format;

import nc.vo.pub.format.FormatResult;
import nc.vo.pub.format.NumberFormat;
import nc.vo.pub.format.exception.FormatException;
import nc.vo.pub.format.meta.CurrencyFormatMeta;

public class CurrencyFormat
extends NumberFormat {
    public CurrencyFormat(CurrencyFormatMeta formatMeta) {
        this.formatMeta = formatMeta;
    }

    @Override
    protected FormatResult innerFormat(Object obj) throws FormatException {
        FormatResult fo = super.innerFormat(obj);
        fo.setValue(fo.getValue().replace("$", ((CurrencyFormatMeta)this.formatMeta).getCurSymbol()));
        return fo;
    }
}


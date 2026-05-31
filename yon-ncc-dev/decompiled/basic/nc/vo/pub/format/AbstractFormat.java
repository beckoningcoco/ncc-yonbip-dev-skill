/*
 * Decompiled with CFR 0.152.
 */
package nc.vo.pub.format;

import nc.vo.pub.format.FormatResult;
import nc.vo.pub.format.IFormat;
import nc.vo.pub.format.exception.FormatException;

public abstract class AbstractFormat
implements IFormat {
    @Override
    public FormatResult format(Object obj) throws FormatException {
        if (obj == null) {
            return null;
        }
        Object fObj = this.formatArgument(obj);
        return this.innerFormat(fObj);
    }

    protected abstract Object formatArgument(Object var1) throws FormatException;

    protected abstract FormatResult innerFormat(Object var1) throws FormatException;
}


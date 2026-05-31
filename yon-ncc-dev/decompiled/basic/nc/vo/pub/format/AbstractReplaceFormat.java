/*
 * Decompiled with CFR 0.152.
 */
package nc.vo.pub.format;

import nc.vo.pub.format.AbstractFormat;
import nc.vo.pub.format.FormatResult;
import nc.vo.pub.format.exception.FormatException;

public abstract class AbstractReplaceFormat
extends AbstractFormat {
    @Override
    public FormatResult innerFormat(Object obj) throws FormatException {
        if (obj == null) {
            return null;
        }
        String express = this.getExpress();
        String[] vars = this.getVars();
        String result = express;
        for (String var : vars) {
            result = result.replaceAll(var, this.getVarValue(var, obj));
        }
        return new FormatResult(result);
    }

    protected abstract String getExpress();

    protected abstract String[] getVars();

    protected abstract String getVarValue(String var1, Object var2);
}


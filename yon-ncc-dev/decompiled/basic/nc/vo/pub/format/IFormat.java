/*
 * Decompiled with CFR 0.152.
 */
package nc.vo.pub.format;

import nc.vo.pub.format.FormatResult;
import nc.vo.pub.format.exception.FormatException;

public interface IFormat {
    public FormatResult format(Object var1) throws FormatException;
}


/*
 * Decompiled with CFR 0.152.
 */
package nc.vo.pub.format;

import nc.vo.pub.format.IElement;

public class StringElement
implements IElement {
    private String value = null;

    public StringElement(String value) {
        this.value = value;
    }

    @Override
    public String getValue(Object obj) {
        return this.value;
    }
}


/*
 * Decompiled with CFR 0.152.
 */
package nc.vo.trade.summarize;

import nc.vo.pub.CircularlyAccessibleValueObject;
import nc.vo.trade.summarize.IHashKey;
import nc.vo.trade.voutils.VOUtil;

public class VOHashKeyAdapter
implements IHashKey {
    String[] m_KeyFields;
    static final String m_FixKey = "FIXKEY#$@";

    public VOHashKeyAdapter(String[] keyFields) {
        this.m_KeyFields = keyFields;
    }

    @Override
    public String getKey(Object o) {
        if (!(o instanceof CircularlyAccessibleValueObject)) {
            throw new IllegalArgumentException("Object must be subclass of CircularlyAccessibleValueObject");
        }
        if (this.m_KeyFields == null || this.m_KeyFields.length == 0) {
            return m_FixKey;
        }
        return VOUtil.getCombinesKey((CircularlyAccessibleValueObject)o, this.m_KeyFields);
    }
}


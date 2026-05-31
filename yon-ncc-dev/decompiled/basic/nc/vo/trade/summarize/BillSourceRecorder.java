/*
 * Decompiled with CFR 0.152.
 */
package nc.vo.trade.summarize;

import java.io.Serializable;
import nc.vo.trade.summarize.IBillSource;

public class BillSourceRecorder
implements IBillSource,
Serializable {
    String m_Id;
    String[] m_BillSourcePKs = new String[0];

    public String getId() {
        return this.m_Id;
    }

    @Override
    public String[] getSourceBillPKs() {
        return this.m_BillSourcePKs;
    }

    public void setId(String newId) {
        this.m_Id = newId;
    }

    @Override
    public void setSourceBillPKs(String[] pks) {
        this.m_BillSourcePKs = pks;
    }
}


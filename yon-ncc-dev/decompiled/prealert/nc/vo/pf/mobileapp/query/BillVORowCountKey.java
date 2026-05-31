/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  nc.bs.pf.pub.cache.IRequestDataCacheKey
 */
package nc.vo.pf.mobileapp.query;

import nc.bs.pf.pub.cache.IRequestDataCacheKey;

public class BillVORowCountKey
implements IRequestDataCacheKey {
    public String getCategory() {
        return "taskquery_gettaskbill_rowcount";
    }

    public String getIdentifier() {
        return "";
    }
}


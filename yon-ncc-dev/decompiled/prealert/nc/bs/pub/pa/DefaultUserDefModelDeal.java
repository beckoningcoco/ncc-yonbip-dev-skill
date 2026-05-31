/*
 * Decompiled with CFR 0.152.
 */
package nc.bs.pub.pa;

import nc.bs.pub.pa.IUserDefModelDealEx;

public abstract class DefaultUserDefModelDeal
implements IUserDefModelDealEx {
    @Override
    public boolean allowNegativeInt() {
        return true;
    }

    @Override
    public String getRefOrgFieldSqlTemplate() {
        return null;
    }

    @Override
    public Object getRefArgs(String pk_org, String refModelName) {
        return null;
    }

    @Override
    public boolean isMultiCorpRef(String pk_org, String refModelName) {
        return true;
    }
}


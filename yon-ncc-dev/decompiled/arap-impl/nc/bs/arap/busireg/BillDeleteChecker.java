/*
 * Decompiled with CFR 0.152.
 */
package nc.bs.arap.busireg;

import nc.vo.arap.basebill.BaseAggVO;

public interface BillDeleteChecker {
    public boolean isMatch(BaseAggVO var1);

    public boolean canDelete(BaseAggVO var1);
}


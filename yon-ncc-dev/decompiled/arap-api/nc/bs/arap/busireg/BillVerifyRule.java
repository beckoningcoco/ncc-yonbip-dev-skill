/*
 * Decompiled with CFR 0.152.
 */
package nc.bs.arap.busireg;

import nc.vo.arap.basebill.BaseAggVO;

public interface BillVerifyRule {
    public String[] getMatchFields();

    public boolean isMatch(BaseAggVO var1);

    public String getQueryOpBillSql(BaseAggVO var1);

    public boolean isAllowManVerify(BaseAggVO var1);
}


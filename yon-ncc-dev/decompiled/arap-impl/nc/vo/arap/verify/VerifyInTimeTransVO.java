/*
 * Decompiled with CFR 0.152.
 */
package nc.vo.arap.verify;

import nc.vo.arap.basebill.BaseAggVO;

public class VerifyInTimeTransVO {
    private int m_row_bc = -1;
    private BaseAggVO aggbillvo = null;
    private boolean isItem;

    public int getM_row_bc() {
        return this.m_row_bc;
    }

    public void setM_row_bc(int mRowBc) {
        this.m_row_bc = mRowBc;
    }

    public BaseAggVO getAggbillvo() {
        return this.aggbillvo;
    }

    public void setAggbillvo(BaseAggVO aggbillvo) {
        this.aggbillvo = aggbillvo;
    }

    public boolean isItem() {
        return this.isItem;
    }

    public void setItem(boolean isItem) {
        this.isItem = isItem;
    }
}


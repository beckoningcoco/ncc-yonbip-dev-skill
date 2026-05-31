/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  nc.vo.pub.lang.UFDouble
 */
package nc.bs.arap.func;

import nc.vo.arap.basebill.BaseAggVO;
import nc.vo.pub.lang.UFDouble;

public class FuncLocalMoney {
    public UFDouble getLocal_money(BaseAggVO bill) {
        return bill.getHeadVO().getLocal_money();
    }
}


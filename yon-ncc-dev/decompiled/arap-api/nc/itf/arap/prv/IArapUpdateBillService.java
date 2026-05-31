/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  nc.vo.pub.BusinessException
 */
package nc.itf.arap.prv;

import nc.vo.arap.agiotage.ArapBusiDataVO;
import nc.vo.pub.BusinessException;

public interface IArapUpdateBillService {
    public static final String[] moneyfield_occu = new String[]{"money_bal", "local_money_bal", "quantity_bal", "globalbalance", "groupbalance", "occupationmny"};
    public static final String[] moneyfield = new String[]{"money_bal", "local_money_bal", "quantity_bal", "globalbalance", "groupbalance"};

    public void updateBillMoney(ArapBusiDataVO[] var1, Boolean var2, String var3) throws BusinessException;
}


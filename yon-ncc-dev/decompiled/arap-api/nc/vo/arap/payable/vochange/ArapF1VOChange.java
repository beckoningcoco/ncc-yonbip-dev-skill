/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  nc.vo.arap.vochange.ArapBillVOChange
 *  nc.vo.arappub.calculator.data.RelationItemForCal_Credit
 */
package nc.vo.arap.payable.vochange;

import nc.vo.arap.vochange.ArapBillVOChange;
import nc.vo.arappub.calculator.data.RelationItemForCal_Credit;

public class ArapF1VOChange
extends ArapBillVOChange {
    public ArapF1VOChange() {
        this.local_money = "local_money_cr";
        this.strChange = "money_cr";
        this.syscode = 1;
        this.relationforitem = RelationItemForCal_Credit.getInstance();
    }
}


/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  nc.vo.arap.vochange.ArapBillVOChange
 *  nc.vo.arappub.calculator.data.RelationItemForCal_Debit
 */
package nc.vo.arap.receivable.vochange;

import nc.vo.arap.vochange.ArapBillVOChange;
import nc.vo.arappub.calculator.data.RelationItemForCal_Debit;

public class ArapF0VOChange
extends ArapBillVOChange {
    public ArapF0VOChange() {
        this.local_money = "local_money_de";
        this.strChange = "money_de";
        this.syscode = 0;
        this.relationforitem = RelationItemForCal_Debit.getInstance();
    }
}


/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  nccloud.pubitf.arap.sagascheck.IArapInitGatheringBillSagasCheck
 */
package nccloud.pubimpl.arap.sagascheck;

import nccloud.pubitf.arap.sagascheck.IArapInitGatheringBillSagasCheck;

public class ArapInitGatheringBillSagasCheckImpl
implements IArapInitGatheringBillSagasCheck {
    public void addInsertValidate() {
        super.addInsertValidate();
        validatorCode.add(15);
        validatorCode.add(29);
        validatorCode.add(37);
        validatorCode.add(31);
        validatorCode.add(36);
        validatorCode.add(23);
        validatorCode.add(26);
        validatorCode.add(2);
        validatorCode.add(28);
        validatorCode.add(24);
        validatorCode.add(28);
        validatorCode.add(31);
        validatorCode.add(36);
        validatorCode.add(37);
        validatorCode.add(53);
        validatorCode.add(44);
        validatorCode.add(75);
    }

    public void addDeleteValidate() {
        super.addDeleteValidate();
        validatorCode.add(75);
    }

    public String getBillType() {
        return "F2";
    }
}


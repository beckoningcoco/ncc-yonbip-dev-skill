/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  nccloud.pubitf.arap.sagascheck.IArapGatheringBillSagasCheck
 */
package nccloud.pubimpl.arap.sagascheck;

import nccloud.pubitf.arap.sagascheck.IArapGatheringBillSagasCheck;

public class ArapGatheringBillSagasCheckImpl
implements IArapGatheringBillSagasCheck {
    public void addInsertValidate() {
        super.addInsertValidate();
        validatorCode.add(5);
        validatorCode.add(15);
        validatorCode.add(29);
        validatorCode.add(19);
        validatorCode.add(26);
        validatorCode.add(8);
        validatorCode.add(24);
        validatorCode.add(28);
        validatorCode.add(44);
        validatorCode.add(46);
        validatorCode.add(31);
        validatorCode.add(36);
        validatorCode.add(23);
        validatorCode.add(49);
        validatorCode.add(57);
        validatorCode.add(59);
        validatorCode.add(62);
        validatorCode.add(75);
        validatorCode.add(76);
    }

    public void addDeleteValidate() {
        super.addDeleteValidate();
        validatorCode.add(11);
        validatorCode.add(12);
        validatorCode.add(27);
        validatorCode.add(35);
        validatorCode.add(32);
        validatorCode.add(75);
    }

    public String getBillType() {
        return "F2";
    }
}


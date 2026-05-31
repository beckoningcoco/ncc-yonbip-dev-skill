/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  nc.vo.ml.NCLangRes4VoTransl
 */
package nc.bs.pub.pa;

import nc.vo.ml.NCLangRes4VoTransl;

public enum PreAlertReturnType {
    RETURNNOTHING(0),
    RETURNOBJECT(1),
    RETURNFORMATMSG(2),
    RETURNMESSAGE(3),
    RETURNDATASOURCE(4),
    RETURNMULTILANGTEXT(5),
    RETURN_MULTIPLE_RECEIVER_OBJECT(6);

    private int value = -1;

    private PreAlertReturnType(int value) {
        this.value = value;
    }

    public String toString() {
        switch (this) {
            case RETURNMESSAGE: {
                return NCLangRes4VoTransl.getNCLangRes().getStrByID("prealertres", "PreAlertReturnType-000000");
            }
            case RETURNFORMATMSG: {
                return NCLangRes4VoTransl.getNCLangRes().getStrByID("prealertres", "PreAlertReturnType-000001");
            }
            case RETURNOBJECT: {
                return NCLangRes4VoTransl.getNCLangRes().getStrByID("prealertres", "PreAlertReturnType-000002");
            }
            case RETURNDATASOURCE: {
                return NCLangRes4VoTransl.getNCLangRes().getStrByID("prealertres", "PreAlertReturnType-000003");
            }
            case RETURNNOTHING: {
                return NCLangRes4VoTransl.getNCLangRes().getStrByID("prealertres", "PreAlertReturnType-000004");
            }
            case RETURNMULTILANGTEXT: {
                return NCLangRes4VoTransl.getNCLangRes().getStrByID("prealertres", "PreAlertReturnType-000005");
            }
            case RETURN_MULTIPLE_RECEIVER_OBJECT: {
                return NCLangRes4VoTransl.getNCLangRes().getStrByID("prealertres", "PreAlertReturnType-0000");
            }
        }
        throw new RuntimeException();
    }

    public int toInt() {
        return this.value;
    }

    public static PreAlertReturnType getObject(int i) {
        switch (i) {
            case 0: {
                return RETURNNOTHING;
            }
            case 1: {
                return RETURNOBJECT;
            }
            case 2: {
                return RETURNFORMATMSG;
            }
            case 3: {
                return RETURNMESSAGE;
            }
            case 4: {
                return RETURNDATASOURCE;
            }
            case 5: {
                return RETURNMULTILANGTEXT;
            }
            case 6: {
                return RETURN_MULTIPLE_RECEIVER_OBJECT;
            }
        }
        throw new IllegalArgumentException("no type matches int: " + i);
    }
}


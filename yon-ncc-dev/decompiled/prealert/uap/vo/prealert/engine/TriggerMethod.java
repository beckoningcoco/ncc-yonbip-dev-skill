/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  nc.vo.ml.NCLangRes4VoTransl
 */
package uap.vo.prealert.engine;

import nc.vo.ml.NCLangRes4VoTransl;

public enum TriggerMethod {
    SCHEDULED(4),
    INSTANT_LOGIN(0),
    INSTANT_ENTERFUNC(2),
    INSTANT_BUTTON(5);

    private int intValue;

    private TriggerMethod(int value) {
        this.intValue = value;
    }

    public int getIntValue() {
        return this.intValue;
    }

    public static TriggerMethod fromIntValue(int value) {
        switch (value) {
            case 4: {
                return SCHEDULED;
            }
            case 0: {
                return INSTANT_LOGIN;
            }
            case 2: {
                return INSTANT_ENTERFUNC;
            }
            case 5: {
                return INSTANT_BUTTON;
            }
        }
        throw new IllegalArgumentException();
    }

    public String toString() {
        switch (this) {
            case SCHEDULED: {
                return NCLangRes4VoTransl.getNCLangRes().getStrByID("101502", "UPP101502-000392");
            }
            case INSTANT_LOGIN: {
                return NCLangRes4VoTransl.getNCLangRes().getStrByID("101502", "UPP101502-000393");
            }
            case INSTANT_ENTERFUNC: {
                return NCLangRes4VoTransl.getNCLangRes().getStrByID("101502", "UPP101502-000394");
            }
            case INSTANT_BUTTON: {
                return NCLangRes4VoTransl.getNCLangRes().getStrByID("101502", "UPP101502-000395");
            }
        }
        return "";
    }
}


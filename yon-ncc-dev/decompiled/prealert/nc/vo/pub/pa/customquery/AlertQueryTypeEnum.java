/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  nc.vo.ml.NCLangRes4VoTransl
 */
package nc.vo.pub.pa.customquery;

import nc.vo.ml.NCLangRes4VoTransl;

public enum AlertQueryTypeEnum {
    Simple("simple"),
    Complex("complex");

    private String type = null;

    private AlertQueryTypeEnum(String type) {
        this.type = type;
    }

    public String getStrValue() {
        return this.type;
    }

    public static AlertQueryTypeEnum fromStrValue(String str) {
        if (Simple.getStrValue().equalsIgnoreCase(str)) {
            return Simple;
        }
        if (Complex.getStrValue().equalsIgnoreCase(str)) {
            return Complex;
        }
        throw new IllegalArgumentException(str);
    }

    public String toReadableString() {
        if (this == Simple) {
            return NCLangRes4VoTransl.getNCLangRes().getStrByID("prealertres", "AlertQueryDefEditDialog-000004");
        }
        return NCLangRes4VoTransl.getNCLangRes().getStrByID("prealertres", "AlertQueryDefEditDialog-000005");
    }

    public String toString() {
        return this.getStrValue();
    }
}


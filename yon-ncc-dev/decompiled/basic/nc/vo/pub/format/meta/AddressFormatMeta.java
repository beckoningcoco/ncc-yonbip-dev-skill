/*
 * Decompiled with CFR 0.152.
 */
package nc.vo.pub.format.meta;

import nc.vo.pub.format.meta.NCFormatMeta;

public class AddressFormatMeta
extends NCFormatMeta {
    public static final String COUNTRY = "C";
    public static final String STATE = "S";
    public static final String CITY = "T";
    public static final String ROAD = "R";
    public static final String POSTCODE = "P";
    private String express = "C S T R P";
    private String separator = " ";

    public String getExpress() {
        return this.express;
    }

    public void setExpress(String express) {
        this.express = express;
    }

    public String getSeparator() {
        return this.separator;
    }

    public void setSeparator(String separator) {
        this.separator = separator;
    }
}


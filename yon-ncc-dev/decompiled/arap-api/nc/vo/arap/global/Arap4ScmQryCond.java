/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  nc.vo.pub.lang.UFBoolean
 */
package nc.vo.arap.global;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import nc.vo.pub.lang.UFBoolean;

public class Arap4ScmQryCond {
    public static final String SROWID = "ddhh";
    public static final String SROOTROWID = "cksqsh";
    private UFBoolean inEstimate = UFBoolean.TRUE;
    private Map<String, List<String>> mapping = new HashMap<String, List<String>>();
    private List<String> groupbys = new ArrayList<String>();
    private String otherWhere = null;

    public void setQryCond(String key, List<String> val) {
        this.mapping.put(key, val);
    }

    public List<String> getQryCond(String key) {
        return key == null ? null : this.mapping.get(key);
    }

    public String[] getKeys() {
        return this.mapping.keySet().toArray(new String[0]);
    }

    public void clearAll() {
        this.mapping.clear();
    }

    public UFBoolean isInEstimate() {
        return this.inEstimate;
    }

    public void setInEstimate(UFBoolean inEstimate) {
        this.inEstimate = inEstimate;
    }

    public List<String> getGroupbys() {
        return this.groupbys;
    }

    public void setGroupbys(List<String> groupbys) {
        this.groupbys = groupbys;
    }

    public String getOtherWhere() {
        return this.otherWhere;
    }

    public void setOtherWhere(String otherWhere) {
        this.otherWhere = otherWhere;
    }
}


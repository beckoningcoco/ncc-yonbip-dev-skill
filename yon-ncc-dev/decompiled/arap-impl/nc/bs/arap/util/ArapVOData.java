/*
 * Decompiled with CFR 0.152.
 */
package nc.bs.arap.util;

import java.util.HashMap;
import java.util.Map;

public class ArapVOData {
    private String srcid;
    private Map<String, Object> headData = new HashMap<String, Object>();

    public String getSrcid() {
        return this.srcid;
    }

    public void setSrcid(String srcid) {
        this.srcid = srcid;
    }

    public Map<String, Object> getHeadData() {
        return this.headData;
    }

    public void setHeadData(Map<String, Object> headData) {
        this.headData = headData;
    }
}


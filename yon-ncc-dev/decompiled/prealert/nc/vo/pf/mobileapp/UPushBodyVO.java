/*
 * Decompiled with CFR 0.152.
 */
package nc.vo.pf.mobileapp;

import java.util.Map;

public class UPushBodyVO {
    private String node;
    private String type;
    private Map<String, String> params;

    public String getNode() {
        return this.node;
    }

    public void setNode(String node) {
        this.node = node;
    }

    public String getType() {
        return this.type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Map<String, String> getParams() {
        return this.params;
    }

    public void setParams(Map<String, String> params) {
        this.params = params;
    }
}


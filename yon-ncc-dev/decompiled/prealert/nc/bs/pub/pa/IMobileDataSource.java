/*
 * Decompiled with CFR 0.152.
 */
package nc.bs.pub.pa;

import java.util.Map;

public interface IMobileDataSource {
    public String getHeaderSummary();

    public Map<String, String> getHeaderDescription();

    public String[] getBodySummaries();

    public Map<String, String> getBodyDescription();
}


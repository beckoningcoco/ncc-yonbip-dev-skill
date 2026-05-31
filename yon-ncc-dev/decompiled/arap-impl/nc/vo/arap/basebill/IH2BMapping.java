/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  nc.vo.pubapp.pattern.pub.MapList
 */
package nc.vo.arap.basebill;

import java.util.Map;
import nc.vo.pubapp.pattern.pub.MapList;

public interface IH2BMapping {
    public Map<String, String> getHTOBMap();

    public Map<String, String> getVERMap();

    public MapList<String, String> getOtherOrgMap();
}


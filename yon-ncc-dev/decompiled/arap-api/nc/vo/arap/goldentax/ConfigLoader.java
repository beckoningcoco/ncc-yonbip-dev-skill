/*
 * Decompiled with CFR 0.152.
 */
package nc.vo.arap.goldentax;

import java.util.HashMap;
import java.util.Map;
import nc.vo.arap.goldentax.AttributeUtils;
import nc.vo.arap.goldentax.Configuration;

public class ConfigLoader {
    public static Map<MergeMode, Boolean> mergeInfo(MergeMode[] mergeModes, String pk_org) {
        Configuration conf = Configuration.load(pk_org);
        HashMap<MergeMode, Boolean> map = new HashMap<MergeMode, Boolean>();
        for (MergeMode mode : mergeModes) {
            map.put(mode, (Boolean)AttributeUtils.getAttributeValue(conf, mode.propNameOfConfiguration));
        }
        return map;
    }

    public static enum MergeMode {
        NONE("mergeNone"),
        INVENTORY("mergeInventory"),
        INVCLASS("mergeInvClass"),
        MUTIBILL("MERGEMUTIBILL");

        String propNameOfConfiguration;

        private MergeMode(String propNameOfConfiguration) {
            this.propNameOfConfiguration = propNameOfConfiguration;
        }
    }
}


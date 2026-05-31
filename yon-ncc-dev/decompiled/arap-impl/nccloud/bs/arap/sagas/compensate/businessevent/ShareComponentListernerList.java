/*
 * Decompiled with CFR 0.152.
 */
package nccloud.bs.arap.sagas.compensate.businessevent;

import java.util.Arrays;
import java.util.List;

public class ShareComponentListernerList {
    static List<String> shareListenerList = null;

    public static List<String> getShareListenerList() {
        return shareListenerList;
    }

    static {
        shareListenerList = Arrays.asList(new String[0]);
    }
}


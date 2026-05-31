/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  nc.bs.framework.common.InvocationInfoProxy
 *  nc.vo.pubapp.scale.ScaleUtils
 */
package nc.vo.arap.scale;

import java.util.HashMap;
import java.util.Map;
import nc.bs.framework.common.InvocationInfoProxy;
import nc.vo.pubapp.scale.ScaleUtils;

public class UIScaleUtils {
    private static Map<String, ScaleUtils> map = new HashMap<String, ScaleUtils>();

    private UIScaleUtils() {
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public static ScaleUtils getScaleUtils() {
        String pk_group = InvocationInfoProxy.getInstance().getGroupId();
        ScaleUtils ret = null;
        Map<String, ScaleUtils> map = UIScaleUtils.map;
        synchronized (map) {
            ret = UIScaleUtils.map.get(pk_group);
            if (ret == null) {
                ret = new ScaleUtils(pk_group);
                UIScaleUtils.map.put(pk_group, ret);
            }
        }
        return ret;
    }
}


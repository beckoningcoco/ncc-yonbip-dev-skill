/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  nc.bs.framework.common.NCLocator
 *  nc.itf.arap.goldentax.IConfigQuery
 *  nc.vo.pub.lang.UFBoolean
 *  nc.vo.pub.lang.UFDouble
 */
package nc.impl.arap.goldentax;

import nc.bs.framework.common.NCLocator;
import nc.itf.arap.goldentax.IConfigQuery;
import nc.vo.pub.lang.UFBoolean;
import nc.vo.pub.lang.UFDouble;

public class ArapConfQuery {
    private ArapConfQuery() {
    }

    public static UFBoolean getParaBoolean(String paraName) {
        return ((IConfigQuery)NCLocator.getInstance().lookup(IConfigQuery.class)).getParaBoolean(paraName);
    }

    public static UFDouble getParaDouble(String paraName) {
        return ((IConfigQuery)NCLocator.getInstance().lookup(IConfigQuery.class)).getParaDouble(paraName);
    }

    public static String getParaString(String paraName) {
        return ((IConfigQuery)NCLocator.getInstance().lookup(IConfigQuery.class)).getParaString(paraName);
    }
}


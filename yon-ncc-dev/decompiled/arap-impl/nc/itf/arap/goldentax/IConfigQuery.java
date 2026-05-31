/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  nc.vo.pub.lang.UFBoolean
 *  nc.vo.pub.lang.UFDouble
 */
package nc.itf.arap.goldentax;

import nc.vo.pub.lang.UFBoolean;
import nc.vo.pub.lang.UFDouble;

public interface IConfigQuery {
    public UFBoolean getParaBoolean(String var1);

    public UFDouble getParaDouble(String var1);

    public String getParaString(String var1);
}


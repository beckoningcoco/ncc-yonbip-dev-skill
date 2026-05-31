/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  nc.vo.pub.BusinessException
 */
package nc.itf.arap.merge;

import nc.vo.pub.BusinessException;

public interface ArapMergeListener {
    public void doMerge(String var1, String var2, String var3) throws BusinessException;
}


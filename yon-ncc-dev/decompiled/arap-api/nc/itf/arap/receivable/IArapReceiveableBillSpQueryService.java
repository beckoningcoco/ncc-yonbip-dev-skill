/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  nc.vo.pub.BusinessException
 *  nc.vo.pub.lang.UFDouble
 */
package nc.itf.arap.receivable;

import java.util.Map;
import nc.vo.pub.BusinessException;
import nc.vo.pub.lang.UFDouble;

public interface IArapReceiveableBillSpQueryService {
    public Map<String, UFDouble> getNewCoustomBanlanceByBasDoc(String[] var1, String var2) throws BusinessException;
}


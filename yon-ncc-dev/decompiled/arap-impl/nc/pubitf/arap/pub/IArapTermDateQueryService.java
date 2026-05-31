/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  nc.vo.pub.BusinessException
 */
package nc.pubitf.arap.pub;

import java.util.Map;
import nc.vo.arap.termitem.ArapTermDateVO;
import nc.vo.pub.BusinessException;

public interface IArapTermDateQueryService {
    public Map<String, ArapTermDateVO[]> queryTermDataVOs(String var1, Map<String, String> var2) throws BusinessException;

    public boolean isSupportBilltype(String var1);
}


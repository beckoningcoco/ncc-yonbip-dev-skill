/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  nc.vo.pub.BusinessException
 */
package nc.bs.pub.pa;

import java.util.Map;
import nc.vo.pub.BusinessException;

public interface ISelfDefReceiver {
    public Map<String, String> getAllCodesAndNames() throws BusinessException;
}


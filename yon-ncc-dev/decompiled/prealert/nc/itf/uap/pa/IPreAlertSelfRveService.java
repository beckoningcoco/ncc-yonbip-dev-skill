/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  nc.vo.pub.BusinessException
 */
package nc.itf.uap.pa;

import nc.vo.pub.BusinessException;
import nc.vo.pub.pa.AlertsfrcvVO;

public interface IPreAlertSelfRveService {
    public AlertsfrcvVO[] getConfigInfoByTypePK(String var1) throws BusinessException;
}


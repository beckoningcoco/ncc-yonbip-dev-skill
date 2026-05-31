/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  nc.vo.pub.BusinessException
 */
package nc.bs.pub.pa;

import nc.bs.pub.pa.PreAlertContext;
import nc.bs.pub.pa.PreAlertObject;
import nc.vo.pub.BusinessException;

public interface IPreAlertPlugin {
    public PreAlertObject executeTask(PreAlertContext var1) throws BusinessException;
}

